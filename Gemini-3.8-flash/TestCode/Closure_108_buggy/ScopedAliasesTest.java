package com.google.javascript.jscomp;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

public class ScopedAliasesTest {

  private Compiler compiler;
  private TestAliasTransformationHandler transformationHandler;

  private static class TestAliasTransformation implements AliasTransformation {
    final List<String> aliases = new ArrayList<String>();
    final List<String> definitions = new ArrayList<String>();

    public void addAlias(String alias, String definition) {
      aliases.add(alias);
      definitions.add(definition);
    }
  }

  private static class TestAliasTransformationHandler implements AliasTransformationHandler {
    final List<TestAliasTransformation> transformations = new ArrayList<TestAliasTransformation>();

    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      TestAliasTransformation transformation = new TestAliasTransformation();
      transformations.add(transformation);
      return transformation;
    }
  }

  @Before
  public void setUp() {
    compiler = new Compiler();
    transformationHandler = new TestAliasTransformationHandler();
  }

  private Node runScopedAliases(String js, PreprocessorSymbolTable symbolTable) {
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, symbolTable, transformationHandler);
    pass.process(null, root);
    return root;
  }

  private Node runScopedAliasesHotSwap(String js, PreprocessorSymbolTable symbolTable) {
    Node root = compiler.parseTestCode(js);
    ScopedAliases pass = new ScopedAliases(compiler, symbolTable, transformationHandler);
    pass.hotSwapScript(root, null);
    return root;
  }

  private boolean hasDiagnostic(DiagnosticType diagnosticType) {
    JSError[] errors = compiler.getErrors();
    for (int i = 0; i < errors.length; i++) {
      if (errors[i].getType() == diagnosticType) {
        return true;
      }
    }
    return false;
  }

  @Test
  public void process_givenValidScopeCall_shouldUnwrapScopeAndApplyAlias() {
    String js = "var a = {b: {c: 1}};\n"
        + "goog.scope(function() {\n"
        + "  var b = a.b;\n"
        + "  var x = b.c;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
    Assert.assertTrue(transformationHandler.transformations.size() > 0);
  }

  @Test
  public void hotSwapScript_givenValidScope_shouldExecuteHotSwap() {
    String js = "goog.scope(function() {\n"
        + "  var x = a.b;\n"
        + "  var y = x;\n"
        + "});";
    runScopedAliasesHotSwap(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void validateScopeCall_givenScopeUsedInExpression_shouldReportGoogScopeUsedImproperly() {
    String js = "var result = goog.scope(function() {});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY));
  }

  @Test
  public void validateScopeCall_givenScopeWithNoParameters_shouldReportGoogScopeHasBadParameters() {
    String js = "goog.scope();";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS));
  }

  @Test
  public void validateScopeCall_givenScopeWithTooManyParameters_shouldReportGoogScopeHasBadParameters() {
    String js = "goog.scope(function() {}, 123);";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS));
  }

  @Test
  public void validateScopeCall_givenScopeWithNonFunctionParameter_shouldReportGoogScopeHasBadParameters() {
    String js = "goog.scope(123);";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS));
  }

  @Test
  public void validateScopeCall_givenScopeWithNamedFunction_shouldReportGoogScopeHasBadParameters() {
    String js = "goog.scope(function named() {});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS));
  }

  @Test
  public void validateScopeCall_givenScopeWithFunctionHavingParameters_shouldReportGoogScopeHasBadParameters() {
    String js = "goog.scope(function(param) {});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS));
  }

  @Test
  public void visit_givenThisKeywordInScope_shouldReportGoogScopeReferencesThis() {
    String js = "goog.scope(function() {\n"
        + "  var x = this;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS));
  }

  @Test
  public void visit_givenReturnKeywordInScope_shouldReportGoogScopeUsesReturn() {
    String js = "goog.scope(function() {\n"
        + "  return;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_USES_RETURN));
  }

  @Test
  public void visit_givenThrowKeywordInScope_shouldReportGoogScopeUsesThrow() {
    String js = "goog.scope(function() {\n"
        + "  throw 'error';\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_USES_THROW));
  }

  @Test
  public void visit_givenRedefinedAlias_shouldReportGoogScopeAliasRedefined() {
    String js = "goog.scope(function() {\n"
        + "  var x = a.b;\n"
        + "  x = a.c;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED));
  }

  @Test
  public void hotSwapScript_givenAliasCycle_shouldReportGoogScopeAliasCycle() {
    String js = "goog.scope(function() {\n"
        + "  var x = y;\n"
        + "  var y = x;\n"
        + "  var z = x;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE));
  }

  @Test
  public void findAliases_givenCatchClauseInScope_shouldReportGoogScopeNonAliasLocal() {
    String js = "goog.scope(function() {\n"
        + "  try {\n"
        + "  } catch (e) {\n"
        + "  }\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertTrue(hasDiagnostic(ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL));
  }

  @Test
  public void findAliases_givenLocalFunctionDeclaration_shouldScopeFunction() {
    String js = "goog.scope(function() {\n"
        + "  function foo() {}\n"
        + "  foo();\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void findAliases_givenHoistedFunctionDeclaration_shouldHoistAndTransform() {
    String js = "goog.scope(function() {\n"
        + "  foo();\n"
        + "  function foo() {}\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void findAliases_givenNonAliasLocalVar_shouldTransformToScopedGlobal() {
    String js = "goog.scope(function() {\n"
        + "  var x = 1;\n"
        + "  var y = 2;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void findAliases_givenBleedingFunctionExpression_shouldIgnoreBleedingName() {
    String js = "goog.scope(function() {\n"
        + "  var f = function bleeding() {};\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void findAliases_givenMultiDeclarationVarNode_shouldDetachCorrectChild() {
    String js = "goog.scope(function() {\n"
        + "  var a = x.y, b = x.z;\n"
        + "  var c = a;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void fixTypeNode_givenJSDocTypeAnnotation_shouldReplaceAliasedType() {
    String js = "goog.scope(function() {\n"
        + "  var MyType = ns.MyType;\n"
        + "  /** @type {MyType.Sub} */\n"
        + "  var instance;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void renameNamespaceShadows_givenInnerShadowingVariable_shouldMakeDeclaredNamesUnique() {
    String js = "goog.scope(function() {\n"
        + "  var MyClass = ns.MyClass;\n"
        + "  function inner() {\n"
        + "    var ns = 10;\n"
        + "  }\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void validateScopeCall_givenNonNullPreprocessorSymbolTable_shouldAddReference() {
    String js = "goog.scope(function() {\n"
        + "  var x = a.b;\n"
        + "});";
    Node root = compiler.parseTestCode(js);
    PreprocessorSymbolTable table = new PreprocessorSymbolTable(root);
    ScopedAliases pass = new ScopedAliases(compiler, table, transformationHandler);
    pass.process(null, root);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void shouldTraverse_givenGlobalFunctionWithoutScope_shouldNotEnterScope() {
    String js = "function globalFunc() {\n"
        + "  var thisIsNormal = 1;\n"
        + "}\n"
        + "goog.scope(function() {\n"
        + "  var x = a.b;\n"
        + "});";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void shouldTraverse_givenEmptyScript_shouldExecuteWithoutErrors() {
    String js = "";
    runScopedAliases(js, null);
    Assert.assertEquals(0, compiler.getErrorCount());
  }
}