package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Assert;
import org.junit.Test;

public class TypeCheckTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  private TypeCheck createTypeCheck(Compiler compiler) {
    return new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        compiler.getTypeRegistry(),
        CheckLevel.WARNING,
        CheckLevel.OFF);
  }

  private Scope runTypeCheck(Compiler compiler, TypeCheck tc, String externsCode, String jsCode) {
    Node externsRoot = compiler.parseTestCode(externsCode);
    Node jsRoot = compiler.parseTestCode(jsCode);
    Node parent = new Node(Token.BLOCK, externsRoot, jsRoot);
    return tc.processForTesting(externsRoot, jsRoot);
  }

  @Test
  public void constructor_givenThreeArguments_shouldInitializeDefaults() {
    // Arrange
    Compiler compiler = createCompiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();

    // Act
    TypeCheck tc = new TypeCheck(compiler, compiler.getReverseAbstractInterpreter(), registry);

    // Assert
    Assert.assertNotNull(tc);
    Assert.assertEquals(0.0, tc.getTypedPercent(), 0.0001);
  }

  @Test
  public void constructor_givenFiveArguments_shouldInitializeProperly() {
    // Arrange
    Compiler compiler = createCompiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();

    // Act
    TypeCheck tc = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        CheckLevel.ERROR,
        CheckLevel.WARNING);

    // Assert
    Assert.assertNotNull(tc);
    Assert.assertEquals(0.0, tc.getTypedPercent(), 0.0001);
  }

  @Test
  public void constructor_givenSevenArguments_shouldInitializeProperly() {
    // Arrange
    Compiler compiler = createCompiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();

    // Act
    TypeCheck tc = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        registry,
        null,
        null,
        CheckLevel.OFF,
        CheckLevel.OFF);

    // Assert
    Assert.assertNotNull(tc);
    Assert.assertEquals(0.0, tc.getTypedPercent(), 0.0001);
  }

  @Test
  public void reportMissingProperties_givenBooleanFlag_shouldReturnSelfForChaining() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);

    // Act
    TypeCheck result = tc.reportMissingProperties(false);

    // Assert
    Assert.assertSame(tc, result);
  }

  @Test
  public void getTypedPercent_givenInitialState_shouldReturnZero() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);

    // Act
    double percent = tc.getTypedPercent();

    // Assert
    Assert.assertEquals(0.0, percent, 0.0001);
  }

  @Test
  public void process_givenNullScopeCreator_shouldThrowNullPointerException() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    Node externs = new Node(Token.SCRIPT);
    Node main = new Node(Token.SCRIPT);
    new Node(Token.BLOCK, externs, main);

    // Act & Assert
    try {
      tc.process(externs, main);
      Assert.fail("Expected NullPointerException when scopeCreator is null");
    } catch (NullPointerException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void process_givenNullJsRootParent_shouldThrowIllegalStateException() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    Node externs = new Node(Token.SCRIPT);
    Node main = new Node(Token.SCRIPT);

    // Act & Assert
    try {
      tc.processForTesting(externs, main);
      Assert.fail("Expected IllegalStateException when jsRoot has no parent");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void process_givenExternsNotInParent_shouldThrowIllegalStateException() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    Node externs = new Node(Token.SCRIPT);
    Node main = new Node(Token.SCRIPT);
    new Node(Token.BLOCK, main);

    // Act & Assert
    try {
      tc.processForTesting(externs, main);
      Assert.fail("Expected IllegalStateException when externsRoot is not a child of parent");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void processForTesting_givenAlreadyProcessed_shouldThrowIllegalStateException() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    runTypeCheck(compiler, tc, "", "var x = 1;");

    // Act & Assert
    try {
      Node externs = compiler.parseTestCode("");
      Node main = compiler.parseTestCode("var y = 2;");
      new Node(Token.BLOCK, externs, main);
      tc.processForTesting(externs, main);
      Assert.fail("Expected IllegalStateException when re-invoking processForTesting");
    } catch (IllegalStateException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void check_givenNullNode_shouldThrowNullPointerException() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);

    // Act & Assert
    try {
      tc.check(null, false);
      Assert.fail("Expected NullPointerException when node is null");
    } catch (NullPointerException e) {
      Assert.assertNotNull(e);
    }
  }

  @Test
  public void processForTesting_givenSimpleVar_shouldComputeTypedPercent() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", "var a = 1;");

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertTrue("Typed percent should be positive", tc.getTypedPercent() >= 0.0);
  }

  @Test
  public void processForTesting_givenPrimitives_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var b = true; var nb = false; var s = 'test'; var n = 123; var nl = null;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenArithmeticOperators_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = 1 + 2; var b = 3 - 1; var c = 4 * 2; var d = 8 / 2; var e = 5 % 2;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenCompoundAssignment_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = 1; a += 2; a -= 1; a *= 3; a /= 2; a %= 2;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenBitwiseOperators_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = 1 & 2; var b = 1 | 2; var c = 1 ^ 2; var d = ~1; var e = 1 << 2; var f = 4 >> 1; var g = 4 >>> 1;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenUnaryOperators_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = 1; var b = +a; var c = -a; var d = !true; var e = void 0; var f = typeof a; a++; a--; ++a; --a;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenRelationalOperators_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = 1 < 2; var b = 2 <= 3; var c = 3 > 2; var d = 4 >= 4;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenArrayAndRegexp_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var arr = [1, 2, 3]; var re = /abc/g;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenObjectLiteralAndAccess_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var obj = {x: 1, y: 'hello'}; var val = obj.x; var elem = obj['y'];";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenLogicalAndCommaOperators_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var a = true && false; var b = true || false; var c = (1, 2); var d = true ? 1 : 2;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenControlFlowStatements_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = ""
        + "if (true) { var a = 1; } else { var a = 2; }\n"
        + "while (false) { break; continue; }\n"
        + "do { } while (false);\n"
        + "for (var i = 0; i < 5; i++) { }\n"
        + "switch (1) { case 1: break; default: break; }\n"
        + "try { throw new Error(); } catch (e) { }";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenFunctionDeclarationAndCall_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "function add(x, y) { return x + y; } add(1, 2);";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenConstructorAndNew_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "/** @constructor */ function Foo() { this.x = 1; } var f = new Foo();";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenCallingNonCallable_shouldReportWarning() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var x = 42; x();";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report NOT_CALLABLE warning",
        compiler.getWarningCount() > 0);
    Assert.assertEquals(TypeCheck.NOT_CALLABLE.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void processForTesting_givenNewOnNonConstructor_shouldReportWarning() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var x = 42; new x();";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report NOT_A_CONSTRUCTOR warning",
        compiler.getWarningCount() > 0);
    Assert.assertEquals(TypeCheck.NOT_A_CONSTRUCTOR.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void processForTesting_givenWrongArgumentCount_shouldReportWarning() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "/** @param {number} a\n@param {number} b */ function f(a, b) {} f(1);";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report WRONG_ARGUMENT_COUNT warning",
        compiler.getWarningCount() > 0);
    Assert.assertEquals(TypeCheck.WRONG_ARGUMENT_COUNT.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void processForTesting_givenDeterministicEquality_shouldReportWarning() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var x = (1 === 'str');";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report DETERMINISTIC_TEST warning",
        compiler.getWarningCount() > 0);
    Assert.assertEquals(TypeCheck.DETERMINISTIC_TEST.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void processForTesting_givenBitwiseOpOnNonInt32_shouldReportWarning() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var x = ~'invalid';";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report BIT_OPERATION warning",
        compiler.getWarningCount() > 0);
    Assert.assertEquals(TypeCheck.BIT_OPERATION.key,
        compiler.getWarnings()[0].getType().key);
  }

  @Test
  public void processForTesting_givenDeleteOperator_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var obj = {a: 1}; delete obj.a;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenInOperator_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "var obj = {a: 1}; var res = 'a' in obj;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenInstanceofOperator_shouldSuccessfullyTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "/** @constructor */ function Foo() {} var f = new Foo(); var res = f instanceof Foo;";

    // Act
    Scope scope = runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertNotNull(scope);
    Assert.assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void processForTesting_givenReportUnknownTypesOn_shouldReportUnknownTypes() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = new TypeCheck(
        compiler,
        compiler.getReverseAbstractInterpreter(),
        compiler.getTypeRegistry(),
        CheckLevel.WARNING,
        CheckLevel.WARNING);
    String js = "function f(unknownParam) { var y = unknownParam; }";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertTrue("Should report warnings for unknown types",
        compiler.getWarningCount() > 0);
  }

  @Test
  public void processForTesting_givenNoTypeCheckAnnotation_shouldSuppressTypeCheck() {
    // Arrange
    Compiler compiler = createCompiler();
    TypeCheck tc = createTypeCheck(compiler);
    String js = "/** @noTypeCheck */ function f() { var x = 42; x(); }";

    // Act
    runTypeCheck(compiler, tc, "", js);

    // Assert
    Assert.assertEquals("Warnings should be suppressed by @noTypeCheck",
        0, compiler.getWarningCount());
  }

  @Test
  public void diagnostics_givenStaticConstants_shouldBeNotNullAndHaveKeys() {
    // Assert all diagnostic constants exist and have correct diagnostic keys
    Assert.assertNotNull(TypeCheck.UNEXPECTED_TOKEN);
    Assert.assertNotNull(TypeCheck.BAD_DELETE);
    Assert.assertNotNull(TypeCheck.DETERMINISTIC_TEST);
    Assert.assertNotNull(TypeCheck.DETERMINISTIC_TEST_NO_RESULT);
    Assert.assertNotNull(TypeCheck.INEXISTENT_ENUM_ELEMENT);
    Assert.assertNotNull(TypeCheck.INEXISTENT_PROPERTY);
    Assert.assertNotNull(TypeCheck.NOT_A_CONSTRUCTOR);
    Assert.assertNotNull(TypeCheck.BIT_OPERATION);
    Assert.assertNotNull(TypeCheck.NOT_CALLABLE);
    Assert.assertNotNull(TypeCheck.CONSTRUCTOR_NOT_CALLABLE);
    Assert.assertNotNull(TypeCheck.FUNCTION_MASKS_VARIABLE);
    Assert.assertNotNull(TypeCheck.MULTIPLE_VAR_DEF);
    Assert.assertNotNull(TypeCheck.ENUM_DUP);
    Assert.assertNotNull(TypeCheck.ENUM_NOT_CONSTANT);
    Assert.assertNotNull(TypeCheck.INVALID_INTERFACE_MEMBER_DECLARATION);
    Assert.assertNotNull(TypeCheck.INTERFACE_FUNCTION_NOT_EMPTY);
    Assert.assertNotNull(TypeCheck.CONFLICTING_EXTENDED_TYPE);
    Assert.assertNotNull(TypeCheck.CONFLICTING_IMPLEMENTED_TYPE);
    Assert.assertNotNull(TypeCheck.BAD_IMPLEMENTED_TYPE);
    Assert.assertNotNull(TypeCheck.HIDDEN_SUPERCLASS_PROPERTY);
    Assert.assertNotNull(TypeCheck.HIDDEN_INTERFACE_PROPERTY);
    Assert.assertNotNull(TypeCheck.HIDDEN_SUPERCLASS_PROPERTY_MISMATCH);
    Assert.assertNotNull(TypeCheck.UNKNOWN_OVERRIDE);
    Assert.assertNotNull(TypeCheck.INTERFACE_METHOD_OVERRIDE);
    Assert.assertNotNull(TypeCheck.UNKNOWN_EXPR_TYPE);
    Assert.assertNotNull(TypeCheck.UNRESOLVED_TYPE);
    Assert.assertNotNull(TypeCheck.WRONG_ARGUMENT_COUNT);
    Assert.assertNotNull(TypeCheck.ILLEGAL_IMPLICIT_CAST);
    Assert.assertNotNull(TypeCheck.INCOMPATIBLE_EXTENDED_PROPERTY_TYPE);
    Assert.assertNotNull(TypeCheck.EXPECTED_THIS_TYPE);
    Assert.assertNotNull(TypeCheck.ALL_DIAGNOSTICS);
    Assert.assertEquals("overriding prototype with non-object",
        TypeCheck.OVERRIDING_PROTOTYPE_WITH_NON_OBJECT);
  }
}