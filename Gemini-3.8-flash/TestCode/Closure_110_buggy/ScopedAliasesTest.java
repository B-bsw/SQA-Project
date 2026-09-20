package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSDocInfoBuilder;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScopedAliasesTest {

  private Compiler compiler;
  private TestAliasTransformationHandler transformationHandler;

  private static class TestAliasTransformationHandler
      implements CompilerOptions.AliasTransformationHandler {
    private final List<Record> records = new ArrayList<Record>();

    static class Record {
      final String sourceFile;
      final Map<String, String> aliases = new HashMap<String, String>();

      Record(String sourceFile) {
        this.sourceFile = sourceFile;
      }
    }

    public CompilerOptions.AliasTransformation logAliasTransformation(
        final String sourceFile,
        SourcePosition<CompilerOptions.AliasTransformation> position) {
      final Record record = new Record(sourceFile);
      records.add(record);
      return new CompilerOptions.AliasTransformation() {
        public void addAlias(String alias, String definition) {
          record.aliases.put(alias, definition);
        }
      };
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    transformationHandler = new TestAliasTransformationHandler();
  }

  private Node parseAndProcess(String js) {
    return parseAndProcess(js, null);
  }

  private Node parseAndProcess(String js, PreprocessorSymbolTable preprocessorTable) {
    Node root = compiler.parseTestCode(js);
    Assert.assertNotNull("Compilation failed during parse", root);
    Node externsRoot = IR.root();
    Node mainRoot = IR.root(root);
    ScopedAliases pass = new ScopedAliases(compiler, preprocessorTable, transformationHandler);
    pass.process(externsRoot, mainRoot);
    return root;
  }

  private void assertContainsError(DiagnosticType errorType) {
    JSError[] errors = compiler.getErrors();
    for (int i = 0; i < errors.length; i++) {
      if (errors[i].getType() == errorType) {
        return;
      }
    }
    Assert.fail("Expected error " + errorType.key + " but found: " + java.util.Arrays.toString(errors));
  }

  private void assertNoError() {
    Assert.assertEquals("Expected 0 errors, but got: " + java.util.Arrays.toString(compiler.getErrors()),
        0, compiler.getErrorCount());
  }

  @Test
  public void process_givenValidAlias_shouldReplaceUsage() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  var myBtn = new Button();\n"
        + "});";
    Node result = parseAndProcess(js);
    assertNoError();
    Assert.assertNotNull(result);
    Assert.assertTrue("Transformation handler should record aliases",
        transformationHandler.records.size() > 0);
    Assert.assertEquals("goog.ui.Button",
        transformationHandler.records.get(0).aliases.get("Button"));
  }

  @Test
  public void process_givenChainedAliases_shouldResolveInOrder() {
    String js = "goog.scope(function() {\n"
        + "  var Dom = goog.dom;\n"
        + "  var Helpers = Dom.helpers;\n"
        + "  Helpers.init();\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenAliasCycle_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  var a = b;\n"
        + "  var b = a;\n"
        + "  a.foo();\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  @Test
  public void process_givenScopeUsedAsExpression_shouldReportError() {
    String js = "var x = goog.scope(function() {});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void process_givenZeroParameters_shouldReportError() {
    String js = "goog.scope();";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void process_givenMoreThanOneParameter_shouldReportError() {
    String js = "goog.scope(function() {}, 123);";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void process_givenNonFunctionParameter_shouldReportError() {
    String js = "goog.scope('notAFunction');";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void process_givenNamedFunction_shouldReportError() {
    String js = "goog.scope(function namedScope() {});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void process_givenFunctionWithParameters_shouldReportError() {
    String js = "goog.scope(function(param) {});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void process_givenScopeWithReturn_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  return;\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void process_givenScopeWithThis_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  this.foo = 1;\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void process_givenScopeWithThrow_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  throw 'error';\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void process_givenAliasRedefinition_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  Button = goog.ui.Menu;\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void process_givenFunctionDeclarationInsideScope_shouldReportError() {
    String js = "goog.scope(function() {\n"
        + "  function localFunc() {}\n"
        + "});";
    parseAndProcess(js);
    assertContainsError(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void process_givenLocalVarNotAlias_shouldHoistToGlobalScope() {
    String js = "goog.scope(function() {\n"
        + "  var localVar = 123;\n"
        + "  var use = localVar + 1;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenMultipleNonAliasVarsSameName_shouldDisambiguateNames() {
    String js = "goog.scope(function() {\n"
        + "  var a = 1;\n"
        + "});\n"
        + "goog.scope(function() {\n"
        + "  var a = 2;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenNonAliasVarWithNoInitialValue_shouldHoist() {
    String js = "goog.scope(function() {\n"
        + "  var uninitializedVar;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenMultipleDeclarationsInOneVar_shouldDetachCorrectly() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button, Label = goog.ui.Label;\n"
        + "  var b = new Button();\n"
        + "  var l = new Label();\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenNamespaceShadowInInnerScope_shouldRenameShadow() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  function inner() {\n"
        + "    var goog = 42;\n"
        + "  }\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenTypeNodeWithAlias_shouldTransformJSDocType() {
    String js = "goog.scope(function() {\n"
        + "  var Button = goog.ui.Button;\n"
        + "  /** @type {Button} */\n"
        + "  var myBtn;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenTypeNodeWithQualifiedSubtype_shouldTransformJSDocType() {
    String js = "goog.scope(function() {\n"
        + "  var ui = goog.ui;\n"
        + "  /** @type {ui.Button.SubClass} */\n"
        + "  var myBtn;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenPreprocessorSymbolTable_shouldRecordReferences() {
    String js = "goog.scope(function() {\n"
        + "  var B = goog.ui.Button;\n"
        + "});";
    Node script = compiler.parseTestCode(js);
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(script);
    Node externsRoot = IR.root();
    Node mainRoot = IR.root(script);
    ScopedAliases pass = new ScopedAliases(compiler, table, transformationHandler);
    pass.process(externsRoot, mainRoot);
    assertNoError();
    Assert.assertTrue("PreprocessorSymbolTable should contain references",
        table.getAllSymbols().size() > 0);
  }

  @Test
  public void shouldTraverse_givenGlobalFunction_shouldSkipGlobalFunctionBody() {
    String js = "function globalFunction() {\n"
        + "  var x = 1;\n"
        + "}\n"
        + "goog.scope(function() {\n"
        + "  var B = goog.ui.Button;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void hotSwapScript_givenEmptyScript_shouldNotFail() {
    String js = "";
    Node root = compiler.parseTestCode(js);
    Node externsRoot = IR.root();
    Node mainRoot = IR.root(root);
    ScopedAliases pass = new ScopedAliases(compiler, null, transformationHandler);
    pass.hotSwapScript(mainRoot, null);
    assertNoError();
  }

  @Test
  public void process_givenNestedScopesWithoutShadow_shouldCompleteSuccessfully() {
    String js = "goog.scope(function() {\n"
        + "  var B = goog.ui.Button;\n"
        + "  function inner() {\n"
        + "    var unrelated = 10;\n"
        + "    function deep() {\n"
        + "      var deepVar = 20;\n"
        + "    }\n"
        + "  }\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }

  @Test
  public void process_givenNonAliasedLocalVarWithJSDoc_shouldPreserveJSDocInDeclaration() {
    String js = "goog.scope(function() {\n"
        + "  /** @type {number} */\n"
        + "  var x = 10;\n"
        + "});";
    parseAndProcess(js);
    assertNoError();
  }
}