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
import java.util.List;
import java.util.Set;

public class ProcessClosurePrimitivesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private Node runProcess(String js, CheckLevel requiresLevel, PreprocessorSymbolTable symbolTable) {
    Node root = compiler.parseTestCode(js);
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, symbolTable, requiresLevel);
    pass.process(null, root);
    return root;
  }

  private Node runProcess(String js) {
    return runProcess(js, CheckLevel.ERROR, null);
  }

  @Test
  public void processProvideCall_givenValidNamespace_shouldDeclareNamespace() {
    Node root = runProcess("goog.provide('foo.bar');");

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void processProvideCall_givenSinglePartNamespace_shouldDeclareVar() {
    Node root = runProcess("goog.provide('foo');");

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    Assert.assertTrue(root.hasChildren());
    Node first = root.getFirstChild();
    Assert.assertTrue(first.isVar());
    Assert.assertEquals("foo", first.getFirstChild().getString());
  }

  @Test
  public void processProvideCall_givenDuplicateNamespace_shouldReportError() {
    runProcess("goog.provide('foo.bar'); goog.provide('foo.bar');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processProvideCall_givenInvalidIdentifier_shouldReportError() {
    runProcess("goog.provide('foo.123');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_PROVIDE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processProvideCall_givenNullArgument_shouldReportNullArgumentError() {
    runProcess("goog.provide();");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processProvideCall_givenNonStringArgument_shouldReportInvalidArgumentError() {
    runProcess("goog.provide(123);");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processProvideCall_givenTooManyArguments_shouldReportTooManyArgumentsError() {
    runProcess("goog.provide('foo.bar', 'extra');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processRequireCall_givenProvidedNamespace_shouldRemoveRequire() {
    Node root = runProcess("goog.provide('foo.bar'); goog.require('foo.bar');");

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void processRequireCall_givenMissingProvide_shouldReportMissingProvideError() {
    runProcess("goog.require('foo.missing');", CheckLevel.ERROR, null);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.MISSING_PROVIDE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processRequireCall_givenLateProvide_shouldReportLateProvideError() {
    runProcess("goog.require('foo.late'); goog.provide('foo.late');", CheckLevel.ERROR, null);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.LATE_PROVIDE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processRequireCall_whenCheckLevelOff_shouldNotReportMissingProvide() {
    runProcess("goog.require('foo.missing');", CheckLevel.OFF, null);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void processRequireCall_givenNullArgument_shouldReportNullArgumentError() {
    runProcess("goog.require();");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processRequireCall_givenNonStringArgument_shouldReportInvalidArgumentError() {
    runProcess("goog.require(true);");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processRequireCall_givenTooManyArguments_shouldReportTooManyArgumentsError() {
    runProcess("goog.require('foo', 'bar');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenValidDefine_shouldReplaceWithDeclaration() {
    String js = "/** @define {boolean} */ goog.define('FLAG_ABC', true);";
    Node root = runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void processDefineCall_givenMissingJSDoc_shouldReportMissingDefineAnnotation() {
    String js = "goog.define('FLAG_DEF', true);";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.MISSING_DEFINE_ANNOTATION, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenInvalidName_shouldReportInvalidDefineNameError() {
    String js = "/** @define {boolean} */ goog.define('invalid-name', true);";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_DEFINE_NAME_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenNullFirstArg_shouldReportNullArgumentError() {
    String js = "/** @define {boolean} */ goog.define();";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenNonStringFirstArg_shouldReportInvalidArgumentError() {
    String js = "/** @define {boolean} */ goog.define(123, true);";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenNullSecondArg_shouldReportNullArgumentError() {
    String js = "/** @define {boolean} */ goog.define('FLAG_VAL');";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void processDefineCall_givenTooManyArguments_shouldReportTooManyArgumentsError() {
    String js = "/** @define {boolean} */ goog.define('FLAG_VAL', true, 'extra');";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void exportSymbol_givenDottedNamespace_shouldAddPrefixToExportedVariables() {
    Node root = compiler.parseTestCode("goog.exportSymbol('my.app.Service', Service);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.process(null, root);

    Set<String> exported = pass.getExportedVariableNames();
    Assert.assertTrue(exported.contains("my"));
    Assert.assertEquals(1, exported.size());
  }

  @Test
  public void exportSymbol_givenSingleIdentifier_shouldAddFullStringToExportedVariables() {
    Node root = compiler.parseTestCode("goog.exportSymbol('GlobalService', Service);");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.process(null, root);

    Set<String> exported = pass.getExportedVariableNames();
    Assert.assertTrue(exported.contains("GlobalService"));
    Assert.assertEquals(1, exported.size());
  }

  @Test
  public void addDependency_givenCall_shouldReplaceWithNumberZero() {
    Node root = runProcess("goog.addDependency('foo.js', ['foo'], []);");

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void functionDeclaration_givenSameNameAsProvidedNamespace_shouldReportFunctionNamespaceError() {
    runProcess("goog.provide('Foo'); function Foo() {}");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenMissingThis_shouldReportBaseClassError() {
    runProcess("goog.base();");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenNonThisFirstArg_shouldReportBaseClassError() {
    runProcess("goog.base(otherObj);");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenNoEnclosingMethod_shouldReportBaseClassError() {
    runProcess("goog.base(this);");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenConstructorWithoutInherits_shouldReportBaseClassError() {
    String js = "function SubClass() { goog.base(this); }";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenConstructorWithInherits_shouldReplaceWithCall() {
    String js = "function SubClass() { goog.base(this); }\n" +
                "goog.inherits(SubClass, BaseClass);";
    runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void baseCall_givenPrototypeMethodMissingMethodNameArg_shouldReportBaseClassError() {
    String js = "SubClass.prototype.foo = function() { goog.base(this); };";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenPrototypeMethodMismatchedMethodNameArg_shouldReportBaseClassError() {
    String js = "SubClass.prototype.foo = function() { goog.base(this, 'bar'); };";
    runProcess(js);

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void baseCall_givenPrototypeMethodMatchingMethodNameArg_shouldReplaceWithSuperCall() {
    String js = "SubClass.prototype.foo = function() { goog.base(this, 'foo'); };";
    runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void baseCall_asGetPropDirectUse_shouldReportBaseClassError() {
    runProcess("var x = goog.base;");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.BASE_CLASS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenNullArg_shouldReportNullArgumentError() {
    runProcess("goog.setCssNameMapping();");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.NULL_ARGUMENT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenNonObjectLitArg_shouldReportExpectedObjectLitError() {
    runProcess("goog.setCssNameMapping('not-obj-lit');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenNonStringSecondArg_shouldReportExpectedStringError() {
    runProcess("goog.setCssNameMapping({}, 123);");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.EXPECTED_STRING_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenTooManyArgs_shouldReportTooManyArgumentsError() {
    runProcess("goog.setCssNameMapping({}, 'BY_PART', 'extra');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenNonStringValueInObjectLit_shouldReportError() {
    runProcess("goog.setCssNameMapping({'key': 123});");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(
        ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR,
        compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenInvalidStyle_shouldReportInvalidStyleError() {
    runProcess("goog.setCssNameMapping({'key': 'val'}, 'UNKNOWN_STYLE');");

    Assert.assertEquals(1, compiler.getErrorCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_STYLE_ERROR, compiler.getErrors()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenByPartWithDashKey_shouldReportInvalidCssRenamingMap() {
    runProcess("goog.setCssNameMapping({'foo-bar': 'fb'}, 'BY_PART');");

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, compiler.getWarnings()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenByWholeInconsistentMapping_shouldReportInvalidCssRenamingMap() {
    String js = "goog.setCssNameMapping({'a': 'x', 'b': 'y', 'a-b': 'z'}, 'BY_WHOLE');";
    runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(1, compiler.getWarningCount());
    Assert.assertEquals(ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, compiler.getWarnings()[0].getType());
  }

  @Test
  public void setCssNameMapping_givenValidMapping_shouldSetCompilerCssRenamingMap() {
    String js = "goog.setCssNameMapping({'simple': 's'}, 'BY_PART');";
    runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertEquals(0, compiler.getWarningCount());
    CssRenamingMap map = compiler.getCssRenamingMap();
    Assert.assertNotNull(map);
    Assert.assertEquals("s", map.get("simple"));
    Assert.assertEquals("unmapped", map.get("unmapped"));
    Assert.assertEquals(CssRenamingMap.Style.BY_PART, map.getStyle());
  }

  @Test
  public void handleTypedefDefinition_givenTypedefInGlobalScope_shouldAssociateDefinition() {
    String js = "goog.provide('ns.MyType'); /** @typedef {string} */ ns.MyType;";
    Node root = runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void candidateProvideDefinition_givenVarAndAssignCandidate_shouldHandleDefinition() {
    String js = "goog.provide('my'); var my = my || {};";
    Node root = runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void candidateProvideDefinition_givenExplicitProvideAndCandidateAssign_shouldPromoteToVar() {
    String js = "goog.provide('my.pkg'); my.pkg = {};";
    Node root = runProcess(js);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(root);
  }

  @Test
  public void preprocessorSymbolTable_givenProvideAndRequire_shouldRecordReferences() {
    PreprocessorSymbolTable symbolTable = new PreprocessorSymbolTable(new Node(Token.SCRIPT));
    String js = "goog.provide('a.b.c'); goog.require('a.b.c');";
    runProcess(js, CheckLevel.ERROR, symbolTable);

    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertNotNull(symbolTable);
  }

  @Test
  public void hotSwapScript_givenScriptRoots_shouldInvokeCompilerProcess() {
    Node root = compiler.parseTestCode("goog.provide('foo.bar');");
    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR);
    pass.hotSwapScript(root, root);

    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void xmoduleRequire_givenModuleGraphAndMissingDependency_shouldReportWarning() {
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    JSModule[] modules = new JSModule[] { m1, m2 };
    final JSModuleGraph graph = new JSModuleGraph(modules);

    Compiler moduleCompiler = new Compiler() {
      @Override
      public JSModuleGraph getModuleGraph() {
        return graph;
      }
    };
    moduleCompiler.initOptions(new CompilerOptions());

    Node root1 = moduleCompiler.parseTestCode("goog.provide('mod1.name');");
    Node root2 = moduleCompiler.parseTestCode("goog.require('mod1.name');");

    Node totalRoot = IR.root(root1, root2);

    ProcessClosurePrimitives pass = new ProcessClosurePrimitives(moduleCompiler, null, CheckLevel.ERROR);

    NodeTraversal t1 = new NodeTraversal(moduleCompiler, pass);
    t1.traverseAtScope(moduleCompiler.getSyntacticScopeCreator().createScope(root1, null));

    pass.process(null, totalRoot);
    Assert.assertNotNull(totalRoot);
  }
}