package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;

public class ScopeTest {

    private Scope globalScope;
    private Scope localScope;
    private CompilerInput input;
    private Node rootNode;

    @Before
    public void setUp() {
        rootNode = new Node(Token.SCRIPT);
        input = new CompilerInput(new Node(Token.SCRIPT), "test.js");
        globalScope = new Scope(rootNode, new TestCompiler());
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(new TestJSType());
        localScope = new Scope(globalScope, functionNode);
    }

    @Test
    public void testCreateScope() {
        assertNotNull(globalScope);
        assertEquals(0, globalScope.getDepth());
        assertNull(globalScope.getParent());
        assertTrue(globalScope.isGlobal());
        assertFalse(globalScope.isLocal());

        assertNotNull(localScope);
        assertEquals(1, localScope.getDepth());
        assertEquals(globalScope, localScope.getParent());
        assertFalse(localScope.isGlobal());
        assertTrue(localScope.isLocal());
    }

    @Test
    public void testGetRootNode() {
        assertEquals(globalScope.getRootNode(), rootNode);
        assertNotNull(localScope.getRootNode());
    }

    @Test
    public void testGetTypeOfThis() {
        assertNull(globalScope.getTypeOfThis());
        assertNotNull(localScope.getTypeOfThis());
    }

    @Test
    public void testDeclareAndGetVar() {
        Node nameNode = new Node(Token.NAME, "x");
        JSType type = new TestJSType();
        Scope.Var var = globalScope.declare("x", nameNode, type, input);
        assertNotNull(var);
        assertEquals("x", var.getName());
        assertEquals(nameNode, var.getNode());
        assertEquals(type, var.getType());
        assertTrue(globalScope.isDeclared("x", false));
        assertSame(var, globalScope.getVar("x"));
        assertEquals(1, globalScope.getVarCount());
    }

    @Test
    public void testDeclareDuplicateVarUpdates() {
        Node nameNode1 = new Node(Token.NAME, "y");
        Node nameNode2 = new Node(Token.NAME, "y");
        globalScope.declare("y", nameNode1, new TestJSType(), input);
        Scope.Var var2 = globalScope.declare("y", nameNode2, new TestJSType(), input);
        assertEquals(2, globalScope.getVarCount()); // Keeps both in map (LinkedHashMap doesn't remove)
    }

    @Test
    public void testGetVarParentScope() {
        Node nameNode = new Node(Token.NAME, "z");
        globalScope.declare("z", nameNode, new TestJSType(), input);
        assertNotNull(localScope.getVar("z")); // Looks up parent scope
        assertEquals(nameNode, localScope.getVar("z").getNode());
    }

    @Test
    public void testGetVarNotFound() {
        assertNull(globalScope.getVar("nonExistent"));
        assertNull(localScope.getVar("nonExistent"));
    }

    @Test
    public void testIsDeclared() {
        globalScope.declare("a", new Node(Token.NAME, "a"), new TestJSType(), input);
        assertTrue(globalScope.isDeclared("a", false));
        assertTrue(localScope.isDeclared("a", true)); // Recurse up
        assertFalse(localScope.isDeclared("a", false)); // Don't recurse
        assertFalse(globalScope.isDeclared("unknown", true));
    }

    @Test
    public void testGetVars() {
        globalScope.declare("var1", new Node(Token.NAME, "var1"), new TestJSType(), input);
        globalScope.declare("var2", new Node(Token.NAME, "var2"), new TestJSType(), input);
        int count = 0;
        for (Scope.Var var : globalScope.getVars()) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testGetAllSymbols() {
        globalScope.declare("sym1", new Node(Token.NAME, "sym1"), new TestJSType(), input);
        int count = 0;
        for (StaticSlot<JSType> slot : globalScope.getAllSymbols()) {
            count++;
        }
        assertEquals(1, count);
    }

    @Test
    public void testGetDeclarativelyUnboundVarsWithoutTypes() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "untyped");
        varNode.addChildToBack(nameNode);
        globalScope.declare("untyped", nameNode, null, input); // null type
        int count = 0;
        for (Scope.Var var : globalScope.getDeclarativelyUnboundVarsWithoutTypes()) {
            count++;
        }
        assertEquals(1, count);
    }

    @Test
    public void testGetVarWithExternInput() {
        CompilerInput externInput = new CompilerInput(new Node(Token.SCRIPT), "externs.js");
        externInput.getNode().setIsExtern();
        @SuppressWarnings("unchecked")
        JSType type = new TestJSType();
        Scope.Var externVar = globalScope.declare("externVar", new Node(Token.NAME, "externVar"), type, externInput);
        assertTrue(externVar.isExtern());
        assertFalse(externVar.isGlobal());
    }

    @Test
    public void testArgumentsVar() {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(new TestJSType());
        Scope fnScope = new Scope(globalScope, functionNode);
        Scope.Var args = fnScope.getArgumentsVar();
        assertNotNull(args);
        assertEquals("arguments", args.getName());
        assertTrue(args instanceof Scope.Arguments);
        assertNull(args.getType());
        assertFalse(args.isTypeInferred());
        assertFalse(args.isDefine());
        assertTrue(args.getInitialValue() == null);
    }

    @Test
    public void testVarEqualityAndHashCode() {
        Node nameNode = new Node(Token.NAME, "eq");
        globalScope.declare("eq", nameNode, new TestJSType(), input);
        Scope.Var var1 = globalScope.getVar("eq");
        Scope.Var var2 = globalScope.getVar("eq");
        assertEquals(var1, var2);
        assertEquals(var1.hashCode(), var2.hashCode());
    }

    @Test
    public void testVarInequality() {
        Node nameNode1 = new Node(Token.NAME, "x");
        Node nameNode2 = new Node(Token.NAME, "y");
        Scope.Var var1 = globalScope.declare("x", nameNode1, new TestJSType(), input);
        Scope.Var var2 = globalScope.declare("y", nameNode2, new TestJSType(), input);
        assertNotEquals(var1, var2);
    }

    @Test
    public void testVarWithNonNullDeclaration() {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(new TestJSType());
        Scope fnScope = new Scope(globalScope, functionNode);
        Node nameNode = new Node(Token.NAME, "fnVar");
        fnScope.declare("fnVar", nameNode, new TestJSType(), input);
        Scope.Var var = fnScope.getVar("fnVar");
        assertNotNull(var.getDeclaration());
        assertEquals(nameNode, var.getDeclaration().getNode());
    }

    @Test
    public void testVarBleedingFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setJSType(new TestJSType());
        Node nameNode = new Node(Token.NAME, "bleed");
        functionNode.addChildToBack(nameNode);
        // Simulate function expression
        functionNode.setType(Token.FUNCTION);
        Scope innerScope = new Scope(globalScope, functionNode);
        Scope.Var var = innerScope.declare("bleed", nameNode, null, input);
        assertTrue(var.isBleedingFunction());
    }

    @Test
    public void testGetInputName() {
        Node nameNode = new Node(Token.NAME, "namedVar");
        Scope.Var var = globalScope.declare("namedVar", nameNode, new TestJSType(), input);
        assertEquals("test.js", var.getInputName());
    }

    @Test
    public void testGetScopeOfVar() {
        Node nameNode = new Node(Token.NAME, "scopedVar");
        Scope.Var var = globalScope.declare("scopedVar", nameNode, new TestJSType(), input);
        assertEquals(globalScope, var.getScope());
    }

    private static class TestJSType extends JSType {
        public TestJSType() {
            super(null, null, null);
        }
        @Override
        public boolean hasDisplayName() {
            return false;
        }
        @Override
        public boolean isSubtype(JSType other) {
            return false;
        }
        @Override
        public boolean isSubtype(JSType other, boolean b) {
            return false;
        }
        @Override
        public String toString() {
            return "testType";
        }
    }

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public CompilerOptions getOptions() {
            return new CompilerOptions();
        }
        @Override
        public TypeRegistry getTypeRegistry() {
            return new TypeRegistry(new TestErrorReporter(), null);
        }
        @Override
        public void report(CheckLevel level, JSError error) {
        }
        @Override
        public void saveLicenseInfo(Node node) {
        }
    }

    private static class TestErrorReporter implements ErrorReporter {
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {
        }
        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {
        }
    }
}