package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {
    private static final String[] SUPPORTED_EXTERNS = new String[]{
        "var window;", "var document;", "var console;"
    };
    private AbstractCompiler compiler;
    private JSTypeRegistry typeRegistry;
    private TypedScopeCreator creator;
    private Scope globalScope;
    
    @Before
    public void setUp() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.setCodingConvention(new GoogleCodingConvention());
        compiler = new Compiler();
        compiler.initOptions(options);
        typeRegistry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler);
        globalScope = createGlobalScope();
    }
    
    @After
    public void tearDown() {
        compiler = null;
        typeRegistry = null;
        creator = null;
        globalScope = null;
    }
    
    private Scope createGlobalScope() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test"));
        Node externsRoot = parseExterns();
        return creator.createScope(externsRoot, null);
    }
    
    private Node parseExterns() {
        return compiler.parseExterns(SUPPORTED_EXTERNS);
    }
    
    @Test
    public void testCreateScopeWithNullParent() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("test"));
        Scope scope = creator.createScope(root, null);
        assertNotNull("Scope should not be null for global", scope);
        assertTrue("Should be global scope", scope.isGlobal());
        assertNull("Parent should be null", scope.getParent());
    }
    
    @Test
    public void testCreateScopeWithParent() {
        Scope global = creator.createScope(parseExterns(), null);
        Node script = new Node(Token.SCRIPT);
        script.setInputId(new InputId("test"));
        script.putIntProp(Node.SOURCE_PROP, 1);
        Scope local = creator.createScope(script, global);
        assertNotNull(local);
        assertSame("Parent should be global", global, local.getParent());
        assertFalse("Should not be global", local.isGlobal());
    }
    
    @Test
    public void testCreateScopeWithGlobalThis() {
        Node externsRoot = parseExterns();
        Scope global = creator.createScope(externsRoot, null);
        ObjectType globalThis = global.getTypeOfThis();
        assertNotNull("Global this should exist", globalThis);
        assertEquals("Global this should be object type", 
            typeRegistry.getNativeType(OBJECT_TYPE).toString(), globalThis.toString());
    }
    
    @Test
    public void testDiscoverEnumsAndTypedefs() {
        String code = "/** @enum {string} */ var Color = {RED: 'red', BLUE: 'blue'};";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        assertTrue("Color should be declared", global.isDeclared("Color", false));
        JSType type = global.getVar("Color").getType();
        assertNotNull("Color type should be declared", type);
        assertTrue("Color should be enum", type.isEnumType());
        EnumType enumType = (EnumType) type;
        assertEquals("Enum should have 2 members", 2, enumType.getElements().size());
    }
    
    @Test
    public void testDiscoverTypedef() {
        String code = "/** @typedef {number|string} */ var MyType;";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        assertTrue("MyType should be declared", global.isDeclared("MyType", false));
        JSType type = global.getVar("MyType").getType();
        assertNotNull("Type should exist", type);
        assertTrue("Type should be union type", type.isUnionType());
    }
    
    @Test
    public void testDeclareVarWithExplicitType() {
        String code = "/** @type {number} */ var x = 10;";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("x");
        assertNotNull("Variable x should exist", var);
        assertNotNull("Variable x type should exist", var.getType());
        assertEquals("Type should be number", "number", var.getType().toString());
    }
    
    @Test
    public void testDeclareVarWithInferredType() {
        String code = "var y = 'hello';";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("y");
        assertNotNull("Variable y should exist", var);
        assertNotNull("Variable y type should exist", var.getType());
        assertEquals("Type should be string", "string", var.getType().toString());
    }
    
    @Test
    public void testDeclareFunctionName() {
        String code = "function foo(x) { return x + 1; }";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("foo");
        assertNotNull("Function foo should exist", var);
        assertTrue("Function should have type", var.getType() != null && var.getType().isFunctionType());
        FunctionType fnType = (FunctionType) var.getType();
        assertEquals("Function should return number", "number", fnType.getReturnType().toString());
    }
    
    @Test
    public void testDeclareVarWithNullInitialValue() {
        String code = "var z;";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("z");
        assertNotNull("Variable z should exist", var);
        assertNull("Type should be null", var.getType());
    }
    
    @Test
    public void testDeclareVarInInnerScope() {
        String code = "function outer() { var innerVar = 42; }";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        FunctionType outerFn = (FunctionType) global.getVar("outer").getType();
        Scope outerFnScope = creator.createScope(global.getRootNode(), global);
        assertNotNull("Inner variable should not be global", 
            outerFnScope.getVar("innerVar"));
    }
    
    @Test
    public void testObjectLiteralProperties() {
        String code = "/** @type {{x: number, y: string}} */ var obj = {x: 1, y: 'a'};";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("obj");
        ObjectType objType = (ObjectType) var.getType();
        assertNotNull("obj type should exist", objType);
        assertTrue("Should have property x", objType.hasOwnProperty("x"));
        assertTrue("Should have property y", objType.hasOwnProperty("y"));
        assertEquals("x type should be number", "number", 
            objType.getPropertyType("x").toString());
        assertEquals("y type should be string", "string", 
            objType.getPropertyType("y").toString());
    }
    
    @Test
    public void testEnumValidationValidKeys() {
        String code = "/** @enum {number} */ var ValidEnum = {A: 1, B: 2, C: 3};";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("ValidEnum");
        assertNotNull("ValidEnum should be declared", var);
        assertTrue("Type should be enum", var.getType().isEnumType());
    }
    
    @Test
    public void testEnumValidationInvalidKey() {
        String code = "/** @enum {number} */ var InvalidEnum = {A: 1, 'bad-key': 2, C: 3};";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("InvalidEnum");
        assertNotNull("InvalidEnum should be declared", var);
        assertTrue("Type should be enum", var.getType().isEnumType());
    }
    
    @Test
    public void testConstructorTypeDefinition() {
        String code = "/** @constructor */ function Foo() { this.bar = 5; }"; 
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("Foo");
        assertNotNull("Foo should exist", var);
        FunctionType fnType = (FunctionType) var.getType();
        assertTrue("Should be constructor", fnType.isConstructor());
        ObjectType instanceType = fnType.getInstanceType();
        assertNotNull("Should have instance type", instanceType);
        assertTrue("Instance should have bar property", instanceType.hasOwnProperty("bar"));
    }
    
    @Test
    public void testInterfaceTypeDefinition() {
        String code = "/** @interface */ function Bar() { /** @type {number} */ this.x; }";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("Bar");
        assertNotNull("Bar should exist", var);
        FunctionType fnType = (FunctionType) var.getType();
        assertTrue("Should be interface", fnType.isInterface());
        ObjectType instanceType = fnType.getInstanceType();
        assertNotNull("Should have instance type", instanceType);
        assertTrue("Interface should have x property", instanceType.hasOwnProperty("x"));
    }
    
    @Test
    public void testInheritance() {
        String code = 
            "/** @constructor */ function Base() {}" +
            "/** @constructor @extends {Base} */ function Derived() {}" +
            "goog.inherits(Derived, Base);";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var baseVar = global.getVar("Base");
        Var derivedVar = global.getVar("Derived");
        assertNotNull("Base should exist", baseVar);
        assertNotNull("Derived should exist", derivedVar);
        FunctionType derivedFn = (FunctionType) derivedVar.getType();
        FunctionType baseFn = (FunctionType) baseVar.getType();
        assertTrue("Derived should be a subtype of Base", 
            derivedFn.getInstanceType().isSubtype(baseFn.getInstanceType()));
    }
    
    @Test
    public void testDelegateRelationship() {
        String code = 
            "/** @const */ var goog = {};" +
            "goog.addSingletonGetter = function(cls) {};" +
            "/** @constructor */ function Singleton() {}" +
            "goog.addSingletonGetter(Singleton);";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var singletonVar = global.getVar("Singleton");
        assertNotNull("Singleton should exist", singletonVar);
        FunctionType singletonType = (FunctionType) singletonVar.getType();
        FunctionType getInstanceType = singletonType.getPrototype().getPropertyType("getInstance");
        assertNotNull("getInstance should exist", getInstanceType);
        assertTrue("getInstance should be function", getInstanceType.isFunctionType());
    }
    
    @Test
    public void testCatchBlockScope() {
        String code = "try { throw new Error('test'); } catch (e) { var caught = e; }";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var caughtVar = global.getVar("caught");
        assertNotNull("caught should exist", caughtVar);
        assertNotNull("caught should have type", caughtVar.getType());
    }
    
    @Test
    public void testEmptyScript() {
        Node root = new Node(Token.SCRIPT);
        root.setInputId(new InputId("empty"));
        Scope scope = creator.createScope(root, null);
        assertNotNull("Scope should not be null", scope);
        assertTrue("Should be global", scope.isGlobal());
    }
    
    @Test
    public void testGetDeclaredTypeWithUnknown() {
        Node root = parseCode("var unknownVar;");
        Scope global = creator.createScope(root, null);
        Var var = global.getVar("unknownVar");
        assertNull("Unknown type should be null", var.getType());
    }
    
    @Test
    public void testGetDeclaredTypeWithNestedFunction() {
        String code = "function outer() { function inner() { return 'x'; } }";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var outerVar = global.getVar("outer");
        assertNotNull("outer function should exist", outerVar);
        assertTrue("outer type should be function", outerVar.getType().isFunctionType());
    }
    
    @Test
    public void testObjectLiteralCast() {
        String code = "/** @constructor */ function Foo() {} /** @type {Foo} */ var f = {a: 1, b: 2};";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var fVar = global.getVar("f");
        assertNotNull("f should exist", fVar);
        assertEquals("f type should be Foo", "Foo", fVar.getType().toString());
    }
    
    @Test
    public void testIfNullRhsAndExplicitType() {
        String code = "/** @type {string} */ var s = null;";
        Node root = parseCode(code);
        Scope global = creator.createScope(root, null);
        Var sVar = global.getVar("s");
        assertNotNull("s should exist", sVar);
        assertNotNull("s type should exist", sVar.getType());
        assertEquals("Type should be string", "string", sVar.getType().toString());
    }
    
    private Node parseCode(String code) {
        CompilerInput input = new CompilerInput(
            com.google.javascript.rhino.SourceFile.fromCode("test.js", code));
        return compiler.parseInputsAndWalkNode(input.getAstRoot(compiler), input);
    }
}