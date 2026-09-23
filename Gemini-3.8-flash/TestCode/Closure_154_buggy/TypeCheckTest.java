package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.TypeCheck;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

public class TypeCheckTest {

    private Compiler compiler;
    private TypeCheck typeCheck;

    @Before
    public void setUp() {
        compiler = new Compiler();
        typeCheck = new TypeCheck(compiler);
    }

    @Test
    public void testProcessWithNullExterns() {
        Node jsRoot = new Node(Token.SCRIPT);
        typeCheck.process(null, jsRoot);
        assertNotNull(typeCheck.getTopScope());
    }

    @Test
    public void testProcessForTestingReturnsScope() {
        Node externsRoot = new Node(Token.EMPTY);
        Node jsRoot = new Node(Token.SCRIPT);
        Scope scope = typeCheck.processForTesting(externsRoot, jsRoot);
        assertNotNull(scope);
    }

    @Test
    public void testCheckWithNoTypeCheckInfo() {
        Node node = new Node(Token.NAME, "test");
        typeCheck.check(node, false);
    }

    @Test
    public void testCheckWithExterns() {
        Node node = new Node(Token.NAME, "extern");
        typeCheck.check(node, true);
    }

    @Test
    public void testShouldTraverseReturnsTrueForNormal() {
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        Node node = new Node(Token.NAME);
        boolean result = typeCheck.shouldTraverse(t, node, null);
        assertEquals(true, result);
    }

    @Test
    public void testVisitNameNode() {
        Node nameNode = new Node(Token.NAME, "x");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, nameNode, parent);
    }

    @Test
    public void testVisitLpNodeWithFunctionParent() {
        Node lpNode = new Node(Token.LP);
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.addChildToFront(lpNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, lpNode, funcNode);
    }

    @Test
    public void testVisitNumberNode() {
        Node numNode = new Node(Token.NUMBER, 5.0);
        Node parent = new Node(Token.EXPR_RESULT, numNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, numNode, parent);
    }

    @Test
    public void testVisitEqNodeWithTernaryValue() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        Node eqNode = new Node(Token.EQ, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, eqNode, null);
    }

    @Test
    public void testVisitSheqNode() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        Node sheqNode = new Node(Token.SHEQ, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, sheqNode, null);
    }

    @Test
    public void testVisitLtNodeWithNumberRight() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NUMBER, 3.0);
        Node ltNode = new Node(Token.LT, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, ltNode, null);
    }

    @Test
    public void testVisitInNode() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        Node inNode = new Node(Token.IN, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, inNode, null);
    }

    @Test
    public void testVisitObjectLitWithNullType() {
        Node objLit = new Node(Token.OBJECTLIT);
        Node parent = new Node(Token.EXPR_RESULT, objLit);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, objLit, parent);
    }

    @Test
    public void testVisitVarNameWithInferredType() {
        Node nameNode = new Node(Token.NAME, "x");
        Node valueNode = new Node(Token.NUMBER, 5.0);
        Node assignNode = new Node(Token.ASSIGN, nameNode, valueNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, nameNode, assignNode);
    }

    @Test
    public void testVisitGetPropWithUnknownObjectType() {
        Node objNode = new Node(Token.THIS);
        Node propNode = new Node(Token.STRING, "prop");
        Node getPropNode = new Node(Token.GETPROP, objNode, propNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, getPropNode, null);
    }

    @Test
    public void testVisitCallWithUnknownFunction() {
        Node funcNode = new Node(Token.NAME, "fn");
        Node callNode = new Node(Token.CALL, funcNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, callNode, null);
    }

    @Test
    public void testGetJSTypeWithNull() {
        Node node = new Node(Token.NAME, "test");
        assertNull(typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithExistingType() {
        Node node = new Node(Token.NUMBER, 5.0);
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
        assertNotNull(typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithUnknown() {
        Node node = new Node(Token.NAME, "x");
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
        assertNotNull(typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithOrdinaryFunction() {
        Node node = new Node(Token.FUNCTION);
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_TYPE));
        assertNotNull(typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithUnknownNative() {
        Node node = new Node(Token.NAME, "u");
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
        assertEquals(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE), typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithFunctionType() {
        Node node = new Node(Token.FUNCTION);
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE));
        assertNotNull(typeCheck.getJSType(node));
    }

    @Test
    public void testGetJSTypeWithUnknownAndNonFunction() {
        Node node = new Node(Token.NAME, "x");
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE));
        assertEquals(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), typeCheck.getJSType(node));
    }

    @Test
    public void testVisitWithEnumType() {
        Node enumNode = new Node(Token.OBJECTLIT);
        enumNode.setJSType(new EnumType(compiler.getTypeRegistry(), "TestEnum", null, enumNode));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, enumNode, null);
    }

    @Test
    public void testReportUnknownTypesIsOn() {
        Node node = new Node(Token.NAME, "x");
        node.setJSType(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, node, null);
    }

    @Test
    public void testBinaryOpWithInt32Context() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NUMBER, 5.0);
        Node bitOp = new Node(Token.BITAND, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, bitOp, null);
    }

    @Test
    public void testBinaryOpWithUint32Context() {
        Node left = new Node(Token.NUMBER, 5.0);
        Node right = new Node(Token.NAME, "b");
        Node shiftOp = new Node(Token.URSH, left, right);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, shiftOp, null);
    }

    @Test
    public void testUnaryOpWithNumberContext() {
        Node operand = new Node(Token.NAME, "x");
        Node notOp = new Node(Token.NOT, operand);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, notOp, null);
    }
}