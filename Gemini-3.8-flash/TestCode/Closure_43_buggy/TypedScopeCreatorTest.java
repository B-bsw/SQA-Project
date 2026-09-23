package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator creator;
    private JSTypeRegistry registry;
    private Node root;
    private Node externsRoot;
    private Scope globalScope;

    @Before
    public void setUp() {
        compiler = new Compiler();
        registry = compiler.getTypeRegistry();
        creator = new TypedScopeCreator(compiler);
        externsRoot = new Node(Token.EMPTY);
        root = new Node(Token.EMPTY);
    }

    @After
    public void tearDown() {
        compiler = null;
        creator = null;
        registry = null;
        root = null;
        externsRoot = null;
        globalScope = null;
    }

    @Test
    public void testCreateScopeWithNullParent() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertEquals(scope.getRootNode(), root);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testCreateScopeWithNonNullParent() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Scope globalScope = creator.createScope(root, null);
        Scope childScope = creator.createScope(script, globalScope);
        assertNotNull(childScope);
        assertEquals(globalScope, childScope.getParent());
    }

    @Test
    public void testCreateScopeWithFunctionType() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node fn = NodeUtil.getFunctionDeclaration("function f() {}", compiler);
        script.addChildToBack(fn);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasOwnSlot("f"));
    }

    @Test
    public void testCreateScopeWithMultiplePaths() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node fn1 = NodeUtil.getFunctionDeclaration("function f1() {}", compiler);
        Node fn2 = NodeUtil.getFunctionDeclaration("function f2() {}", compiler);
        script.addChildToBack(fn1);
        script.addChildToBack(fn2);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("f1"));
        assertTrue(scope.hasSlot("f2"));
    }

    @Test
    public void testCreateScopeWithVarDeclaration() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node varNode = NodeUtil.newVarNode("x", NodeUtil.newNumber(5));
        script.addChildToBack(varNode);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("x"));
        assertNotNull(scope.getSlot("x").getType());
    }

    @Test
    public void testCreateScopeWithFunctionDeclarationInsideFunction() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node fn = NodeUtil.getFunctionDeclaration("function outer() { function inner() {} }", compiler);
        script.addChildToBack(fn);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("outer"));
        Scope fnScope = scope.getSlot("outer").getScope();
        assertNotNull(fnScope);
        assertTrue(fnScope.hasSlot("inner"));
    }

    @Test
    public void testCreateScopeWithGlobalThisAssignment() {
        Node script = new Node(Token.SCRIPT);
        scope = new Scope(compiler, root, null);
        Node expr = new Node(Token.EXPR_RESULT);
        Node getProp = new Node(Token.GETPROP);
        Node name = Node.newString("Window");
        name.putProp(Node.ORIGINALNAME_PROP, "Window");
        name.setType(Token.NAME);
        getProp.addChildToBack(name);
        getProp.addChildToBack(Node.newString("foo"));
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(getProp);
        assign.addChildToBack(NodeUtil.newNumber(5));
        expr.addChildToBack(assign);
        script.addChildToBack(expr);
        root.addChildToBack(script);
        Scope resultScope = creator.createScope(root, null);
        assertNotNull(resultScope);
        assertTrue(resultScope.isGlobal());
    }

    @Test
    public void testCreateScopeWithLendsAnnotation() {
        Node script = new Node(Token.SCRIPT);
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("x"));
        getProp.addChildToBack(Node.newString("y"));
        assign.addChildToBack(getProp);
        assign.addChildToBack(NodeUtil.newNumber(3));
        expr.addChildToBack(assign);
        script.addChildToBack(expr);
        JSDocInfo info = new JSDocInfo();
        info.getLendsName();
        script.addChildToBack(expr);
        root.addChildToBack(script);
        creator.createScope(root, null);
        // Just ensure no NPE thrown
    }

    @Test
    public void testCreateScopeWithNullRoot() {
        try {
            creator.createScope(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testCreateScopeWithEmptyRoot() {
        Node empty = new Node(Token.EMPTY);
        Scope scope = creator.createScope(empty, null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
    }

    @Test
    public void testCreateScopeWithCatchBlock() {
        Node script = new Node(Token.SCRIPT);
        Node tryNode = new Node(Token.TRY);
        Node block = new Node(Token.BLOCK);
        Node catchNode = new Node(Token.CATCH);
        Node name = Node.newString("e");
        name.setType(Token.NAME);
        catchNode.addChildToBack(name);
        block.addChildToBack(catchNode);
        tryNode.addChildToBack(block);
        script.addChildToBack(tryNode);
        root.addChildToBack(script);
        creator.createScope(root, null);
        // Just ensure no NPE thrown
    }

    @Test
    public void testFindGlobalScope() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
    }

    @Test
    public void testCreateScopeWithEnumType() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node expr = new Node(Token.EXPR_RESULT);
        Node assign = new Node(Token.ASSIGN);
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToBack(Node.newString("ns"));
        getProp.addChildToBack(Node.newString("Enum"));
        assign.addChildToBack(getProp);
        assign.addChildToBack(new Node(Token.OBJECTLIT));
        expr.addChildToBack(assign);
        script.addChildToBack(expr);
        creator.createScope(root, null);
        // Ensure no NPE
    }

    @Test
    public void testCreateScopeWithImportedFunctionInGlobal() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node var = NodeUtil.newVarNode("foo", NodeUtil.getFunctionDeclaration("function foo() {}", compiler));
        script.addChildToBack(var);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("foo"));
    }

    @Test
    public void testCreateScopeWithMultipleVarDeclarations() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node var1 = NodeUtil.newVarNode("a", NodeUtil.newNumber(1));
        Node var2 = NodeUtil.newVarNode("b", NodeUtil.newNumber(2));
        script.addChildToBack(var1);
        script.addChildToBack(var2);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("a"));
        assertTrue(scope.hasSlot("b"));
    }

    @Test
    public void testCreateScopeWithFunctionAndItsPrototype() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        Node fn = NodeUtil.getFunctionDeclaration("function f() {}", compiler);
        script.addChildToBack(fn);
        Scope scope = creator.createScope(root, null);
        assertNotNull(scope);
        assertTrue(scope.hasSlot("f"));
        Scope fnScope = scope.getSlot("f").getScope();
        assertNotNull(fnScope);
        assertTrue(fnScope.hasSlot("prototype"));
    }
}