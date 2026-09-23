package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;

public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator creator;
    private JSTypeRegistry registry;
    private Node root;

    @Before
    public void setUp() {
        compiler = new Compiler();
        registry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler);
    }

    @After
    public void tearDown() {
        compiler = null;
        creator = null;
        registry = null;
    }

    @Test
    public void testCreateScopeWithNullParent() {
        String code = "var a = 1;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        assertTrue(scope.isDeclared("a", false));
    }

    @Test
    public void testCreateScopeWithNonNullParent() {
        String code = "function f(x) { var y = x + 1; return y; }";
        root = parse(code);
        Scope globalScope = creator.createScope(root, null);
        Node fnNode = findFunctionNode(root);
        Scope fnScope = creator.createScope(fnNode, globalScope);
        assertNotNull(fnScope);
        assertFalse(fnScope.isGlobal());
    }

    @Test
    public void testCreateScopeParentNullButRootNull() {
        try {
            creator.createScope(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCreateScopeWithFunctionInGlobal() {
        String code = "function f() { var x = 1; }";
        root = parse(code);
        Scope globalScope = creator.createScope(root, null);
        Node fnNode = findFunctionNode(root);
        creator.createScope(fnNode, globalScope);
    }

    @Test
    public void testCreateScopeWithExternFunction() {
        String code = "function f() { }";
        root = parse(code);
        Scope globalScope = creator.createScope(root, null);
        assertNotNull(globalScope);
    }

    @Test
    public void testCreateScopeWithSimpleVar() {
        String code = "var a;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertTrue(scope.isDeclared("a", false));
        assertNull(scope.getVar("a").getType());
    }

    @Test
    public void testCreateScopeWithVarTypeAnnotation() {
        String code = "/** @type {number} */ var a;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var var = scope.getVar("a");
        assertNotNull(var);
        assertTrue(var.getType().isNumberType());
    }

    @Test
    public void testCreateScopeWithInferredFunctionType() {
        String code = "function f() {}";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var var = scope.getVar("f");
        assertNotNull(var);
        assertTrue(var.getType().isFunctionType());
    }

    @Test
    public void testCreateScopeWithUntypedVarInNormalScope() {
        String code = "function f() { var x; }";
        root = parse(code);
        Scope global = creator.createScope(root, null);
        Node fn = findFunctionNode(root);
        Scope fnScope = creator.createScope(fn, global);
        assertTrue(fnScope.isDeclared("x", false));
        assertTrue(fnScope.isDeclared("arguments", false));
    }

    @Test
    public void testCreateScopeWithNamespaceShorthand() {
        String code = "var ns = {}; ns.foo = 1;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertTrue(scope.isDeclared("ns", false));
    }

    @Test
    public void testCreateScopeWithCatchBlock() {
        String code = "try { } catch (e) { var x = e; }";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("e"));
        assertNotNull(scope.getVar("x"));
    }

    @Test
    public void testCreateScopeWithMultipleVarDeclaration() {
        String code = "var a, b, c;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertTrue(scope.isDeclared("a", false));
        assertTrue(scope.isDeclared("b", false));
        assertTrue(scope.isDeclared("c", false));
    }

    @Test
    public void testCreateScopeWithAssignToGlobalThis() {
        String code = "this.foo = 1;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertTrue(scope.isDeclared("foo", false));
    }

    @Test
    public void testCreateScopeWithFunctionAndThis() {
        String code = "function f() { this.x = 1; }";
        root = parse(code);
        Scope global = creator.createScope(root, null);
        Node fn = findFunctionNode(root);
        Scope fnScope = creator.createScope(fn, global);
        assertTrue(fnScope.isDeclared("x", false));
    }

    @Test
    public void testCreateScopeWithEnumDeclaration() {
        String code = "/** @enum {number} */ var E = {A: 1, B: 2};";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var enumVar = scope.getVar("E");
        assertNotNull(enumVar);
        assertTrue(enumVar.getType().isEnumType());
    }

    @Test
    public void testCreateScopeWithInterface() {
        String code = "/** @interface */ function I() {}";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope.getVar("I"));
    }

    @Test
    public void testCreateScopeWithConstructor() {
        String code = "/** @constructor */ function MyClass() {}";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var ctor = scope.getVar("MyClass");
        assertNotNull(ctor);
        FunctionType fnType = ctor.getType().toMaybeFunctionType();
        assertNotNull(fnType);
        assertTrue(fnType.isConstructor());
    }

    @Test
    public void testCreateScopeWithInheritance() {
        String code = "/** @constructor */ function A() {}\n/** @constructor @extends {A} */ function B() {}";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var bVar = scope.getVar("B");
        assertNotNull(bVar);
        FunctionType bType = bVar.getType().toMaybeFunctionType();
        assertNotNull(bType);
        ObjectType instanceType = bType.getInstanceType();
        assertNotNull(instanceType);
        assertTrue(instanceType.isSubtype(scope.getVar("A").getType().toMaybeFunctionType().getInstanceType()));
    }

    @Test
    public void testCreateScopeWithPrototypeAssignment() {
        String code = "/** @constructor */ function A() {}\nA.prototype.foo = function() {};";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var aVar = scope.getVar("A");
        assertNotNull(aVar);
        FunctionType aType = aVar.getType().toMaybeFunctionType();
        assertNotNull(aType);
        assertNotNull(aType.getPrototype());
        assertTrue(aType.getPrototype().hasOwnProperty("foo"));
    }

    @Test
    public void testCreateScopeWithLendsAnnotation() {
        String code = "/** @lends {Foo.prototype} */ var bar = {baz: 1};";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var barVar = scope.getVar("bar");
        assertNotNull(barVar);
    }

    @Test
    public void testCreateScopeWithEmptyInput() {
        String code = "";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testCreateScopeWithNullExterns() {
        String code = "var x;";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeLoopZeroRounds() {
        String code = "for (var i = 0; i < 0; i++) { var x = 1; }";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNull(scope.getVar("x"));
    }

    @Test
    public void testCreateScopeLoopOneRound() {
        String code = "for (var i = 0; i < 1; i++) { var x = 1; }";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        assertNull(scope.getVar("x"));
    }

    @Test
    public void testCreateScopeWithGlobalVarAssignInFunction() {
        String code = "var y; function f() { y = 1; }";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var yVar = scope.getVar("y");
        assertNotNull(yVar);
        assertNull(yVar.getType());
    }

    @Test
    public void testCreateScopeWithQualifiedNameAlias() {
        String code = "var a = {}; a.b = function() {};";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var aVar = scope.getVar("a");
        assertNotNull(aVar);
        ObjectType objType = aVar.getType().toObjectType();
        assertNotNull(objType);
        assertTrue(objType.hasOwnProperty("b"));
    }

    @Test
    public void testCreateScopeWithInterfaceImplementation() {
        String code = "/** @interface */ function I() {}\n/** @implements {I} */\n/** @constructor */ function C() {}";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var cVar = scope.getVar("C");
        assertNotNull(cVar);
    }

    @Test
    public void testCreateScopeWithDelegateRelationship() {
        String code = "/** @constructor */ function A() {}\nvar obj = {delegate: A};";
        root = parse(code);
        Scope scope = creator.createScope(root, null);
        Var objVar = scope.getVar("obj");
        assertNotNull(objVar);
    }

    private Node parse(String code) {
        CompilerInput input = new CompilerInput(SourceFile.fromCode("test", code));
        compiler.init(Lists.<SourceFile>newArrayList(), Lists.newArrayList(input), compiler.getOptions());
        root = compiler.parseInputs();
        assertNotNull(root);
        return root;
    }

    private Node findFunctionNode(Node n) {
        if (n.isFunction()) {
            return n;
        }
        for (Node child : n.children()) {
            Node found = findFunctionNode(child);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}