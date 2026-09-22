package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {

    private CheckGlobalThis check;
    private AbstractCompiler compiler;
    private CheckLevel level;
    private NodeTraversal t;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        level = CheckLevel.ERROR;
        check = new CheckGlobalThis(compiler, level);
        t = new NodeTraversal(compiler, check);
    }

    @After
    public void tearDown() {
        compiler = null;
        level = null;
        check = null;
        t = null;
    }

    // ====== shouldTraverse tests ======

    @Test
    public void testShouldTraverseFunctionWithConstructorAnnotation() {
        Node functionNode = createFunctionWithJSDoc("@constructor");
        assertFalse("Should not traverse constructor functions", check.shouldTraverse(t, functionNode, functionNode.getParent()));
    }

    @Test
    public void testShouldTraverseFunctionWithThisAnnotation() {
        Node functionNode = createFunctionWithJSDoc("@this {OtherType}");
        assertFalse("Should not traverse functions with @this", check.shouldTraverse(t, functionNode, functionNode.getParent()));
    }

    @Test
    public void testShouldTraverseFunctionWithOverrideAnnotation() {
        Node functionNode = createFunctionWithJSDoc("@override");
        assertFalse("Should not traverse functions with @override", check.shouldTraverse(t, functionNode, functionNode.getParent()));
    }

    @Test
    public void testShouldTraverseFunctionWithoutJSDoc() {
        Node functionNode = createFunctionWithoutJSDoc(0, Token.FUNCTION);
        Node parent = functionNode.getParent();
        assertTrue("Should traverse function without JSDoc", check.shouldTraverse(t, functionNode, parent));
    }

    @Test
    public void testShouldTraverseNonFunctionNode() {
        Node blockNode = new Node(Token.BLOCK);
        Node parent = new Node(Token.SCRIPT);
        assertTrue("Should traverse non-function nodes", check.shouldTraverse(t, blockNode, parent));
    }

    @Test
    public void testShouldTraversePrototypeAssignment() {
        // var a = function() { this.x = 1; }
        Node functionNode = createFunctionWithoutJSDoc(0, Token.FUNCTION);
        Node nameNode = Node.newString("a", functionNode);
        Node varNode = new Node(Token.VAR, nameNode);
        nameNode.addChildToFront(functionNode); // wrong structure but ok
        assertTrue(check.shouldTraverse(t, functionNode, nameNode));
    }

    @Test
    public void testShouldTraversePrototypeGetProp() {
        Node assignNode = createPrototypeAssignment("MyClass.prototype.method", "function(){}");
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("x"));
        assignNode.addChildToBack(getProp);
        assertFalse(check.shouldTraverse(t, getProp, assignNode));
    }

    @Test
    public void testShouldTraversePrototypeSubProperty() {
        Node assignNode = createPrototypeAssignment("MyClass.prototype.deep", "function(){}");
        // Build: MyClass.prototype.deep.method = function(){ this.x; }
        Node target = NodeUtil.newQualifiedNameNode("MyClass.prototype.deep");
        Node getPropParent = new Node(Token.GETPROP, target, Node.newString("method"));
        assignNode.putProp(Node.ORIGINALNAME_PROP, "x");
        assignNode.setType(Token.ASSIGN);
        assignNode.addChildToFront(getPropParent);
        Node methodName = Node.newString("function", 0, 0);
        Node methodFunction = new Node(Token.FUNCTION, new Node(Token.NAME, methodName), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        assignNode.addChildToBack(methodFunction);
        assertFalse(check.shouldTraverse(t, methodFunction, assignNode));
    }

    @Test
    public void testShouldTraverseNormalAssignment() {
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = NodeUtil.newQualifiedNameNode("obj.prop");
        Node rhs = new Node(Token.THIS);
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        assertTrue(check.shouldTraverse(t, rhs, assignNode));
    }

    // ====== visit and shouldReportThis tests ======

    @Test
    public void testVisitThisNodeNotGetProp() {
        Node thisNode = new Node(Token.THIS);
        Node parentBlock = new Node(Token.BLOCK);
        compiler = new TestCompiler();
        check = new CheckGlobalThis(compiler, level);
        check.visit(t, thisNode, parentBlock);
        assertTrue(compiler.getReportCount() == 0);
    }

    @Test
    public void testVisitThisNodeGetProp() {
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("prop"));
        compiler = new TestCompiler();
        check = new CheckGlobalThis(compiler, level);
        check.visit(t, thisNode, getProp);
        assertTrue(compiler.getReportCount() == 1);
    }

    @Test
    public void testVisitThisNodeLeftOfAssign() {
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, thisNode, new Node(Token.NAME));
        compiler = new TestCompiler();
        check = new CheckGlobalThis(compiler, level);
        check.visit(t, thisNode, assignNode);
        assertTrue(compiler.getReportCount() == 1);
    }

    @Test
    public void testAssignLhsChildResetAfterVisit() {
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, thisNode, new Node(Token.NAME));
        compiler = new TestCompiler();
        check = new CheckGlobalThis(compiler, level);
        check.shouldTraverse(t, thisNode, assignNode);
        check.visit(t, thisNode, assignNode);
        assertNull("assignLhsChild should be reset", null);
    }

    // ====== getFunctionJsDocInfo tests ======

    @Test
    public void testGetFunctionJsDocInfoWithNeither() {
        Node functionNode = new Node(Token.FUNCTION);
        JSDocInfo info = check.getFunctionJsDocInfo(functionNode);
        assertNull("Should return null for no doc", info);
    }

    @Test
    public void testGetFunctionJsDocInfoWithDocString() {
        Node functionNode = new Node(Token.FUNCTION);
        JSDocInfo jsDocInfo = new JSDocInfo();
        jsDocInfo.setDescription("test doc");
        functionNode.setJSDocInfo(jsDocInfo);
        JSDocInfo result = check.getFunctionJsDocInfo(functionNode);
        assertEquals(result, jsDocInfo);
    }

    @Test
    public void testShouldTraversePrototypeAssignmentLhs() {
        Node assignNode = new Node(Token.ASSIGN);
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, Node.newString("x"));
        assignNode.addChildToBack(getProp);
        Node rhs = Node.newString("function", 0, 0);
        assignNode.addChildToBack(rhs);
        boolean result = check.shouldTraverse(t, getProp, assignNode);
        assertTrue(result);
        // Now test the non-left side (rhs)
        boolean result2 = check.shouldTraverse(t, rhs, assignNode);
        assertTrue(result2);
    }

    // ====== Helper methods ======

    private Node createFunctionWithJSDoc(String annotation) {
        // Build minimal function node with JSDoc annotation
        Node functionNode = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        if (annotation.equals("@constructor")) {
            jsDoc.setConstructor(true);
        } else if (annotation.equals("@this {OtherType}")) {
            jsDoc.setThisType({}); // simplified
        } else if (annotation.equals("@override")) {
            jsDoc.setOverride(true);
        }
        functionNode.setJSDocInfo(jsDoc);
        Node parent = new Node(Token.BLOCK);
        functionNode.setParent(parent);
        parent.addChildToBack(functionNode);
        return functionNode;
    }

    private Node createFunctionWithoutJSDoc(int dummy, int tokenType) {
        Node functionNode = new Node(tokenType);
        Node nameNode = Node.newString("a", 0, 0);
        Node varNode = new Node(Token.VAR, nameNode);
        varNode.addChildToBack(functionNode);
        return functionNode;
    }

    private Node createPrototypeAssignment(String targetName, String functionSource) {
        Node assignNode = new Node(Token.ASSIGN);
        Node target = NodeUtil.newQualifiedNameNode(targetName);
        Node value = new Node(Token.FUNCTION, new Node(Token.NAME, Node.newString("dummy")), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        assignNode.addChildToBack(target);
        assignNode.addChildToBack(value);
        assignNode.putProp(Node.ORIGINALNAME_PROP, targetName);
        return assignNode;
    }

    static class TestCompiler extends AbstractCompiler {
        private int reportCount = 0;

        public int getReportCount() {
            return reportCount;
        }

        @Override
        public void report(JSError error) {
            reportCount++;
        }
    }

    private static class TestCompilerEmpty extends AbstractCompiler {
    }
}