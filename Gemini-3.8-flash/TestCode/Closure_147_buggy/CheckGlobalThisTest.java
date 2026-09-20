package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {

    private MockCompiler compiler;
    private CheckGlobalThis callback;

    private static class MockCompiler extends AbstractCompiler {
        private final List reportedErrors = new ArrayList();

        public void report(JSError error) {
            reportedErrors.add(error);
        }

        public List getReportedErrors() {
            return reportedErrors;
        }

        // Required minimal stubs for AbstractCompiler
        public CompilerInput getInput(String name) { return null; }
        public SourceFile getSourceFileByName(String name) { return null; }
        public JSModuleGraph getModuleGraph() { return null; }
        public Node getRoot() { return null; }
        public Node parseTestCode(String js) { return null; }
        public ErrorReporter getErrorReporter() { return null; }
        public CheckLevel getDefaultLevel() { return CheckLevel.WARNING; }
        public boolean hasHaltingErrors() { return false; }
    }

    @Before
    public void setUp() {
        compiler = new MockCompiler();
        callback = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    }

    // -------------------------------------------------------------------------
    // Phase 1 & 2: Test Cases for shouldTraverse
    // -------------------------------------------------------------------------

    @Test
    public void shouldTraverse_givenNonFunctionAndNonAssignNode_shouldReturnTrue() {
        // Arrange
        Node n = new Node(Token.VAR);
        Node parent = new Node(Token.SCRIPT);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, n, parent);

        // Assert
        Assert.assertTrue("Non-function, non-assign node should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionWithConstructorDoc_shouldReturnFalse() {
        // Arrange
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.markAsConstructor();
        fnNode.setJSDocInfo(info);
        Node parent = new Node(Token.SCRIPT);
        fnNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, parent);

        // Assert
        Assert.assertFalse("Constructor function should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionWithInterfaceDoc_shouldReturnFalse() {
        // Arrange
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.markAsInterface();
        fnNode.setJSDocInfo(info);
        Node parent = new Node(Token.SCRIPT);
        fnNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, parent);

        // Assert
        Assert.assertFalse("Interface function should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionWithThisTypeDoc_shouldReturnFalse() {
        // Arrange
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.setThisType(new com.google.javascript.rhino.JSTypeExpression(new Node(Token.STRING, "Object"), "test"));
        fnNode.setJSDocInfo(info);
        Node parent = new Node(Token.SCRIPT);
        fnNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, parent);

        // Assert
        Assert.assertFalse("Function with @this should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionWithOverrideDoc_shouldReturnFalse() {
        // Arrange
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.markAsOverride();
        fnNode.setJSDocInfo(info);
        Node parent = new Node(Token.SCRIPT);
        fnNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, parent);

        // Assert
        Assert.assertFalse("Function with @override should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInAssignWithDoc_shouldReturnFalse() {
        // Arrange
        Node assignNode = new Node(Token.ASSIGN);
        Node fnNode = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.markAsConstructor();
        assignNode.setJSDocInfo(info);
        assignNode.addChildToBack(fnNode);
        fnNode.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, assignNode);

        // Assert
        Assert.assertFalse("Function inside assign with constructor doc should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInVarNameWithDocOnVar_shouldReturnFalse() {
        // Arrange
        Node varNode = new Node(Token.VAR);
        JSDocInfo info = new JSDocInfo();
        info.markAsConstructor();
        varNode.setJSDocInfo(info);

        Node nameNode = Node.newString(Token.NAME, "foo");
        Node fnNode = new Node(Token.FUNCTION);

        varNode.addChildToBack(nameNode);
        nameNode.setParent(varNode);

        nameNode.addChildToBack(fnNode);
        fnNode.setParent(nameNode);

        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, nameNode);

        // Assert
        Assert.assertFalse("Function in var name with var doc should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInUnsupportedParentType_shouldReturnFalse() {
        // Arrange
        Node callNode = new Node(Token.CALL);
        Node fnNode = new Node(Token.FUNCTION);
        callNode.addChildToBack(fnNode);
        fnNode.setParent(callNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, callNode);

        // Assert
        Assert.assertFalse("Function inside CALL should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInBlockParent_shouldReturnTrue() {
        // Arrange
        Node blockNode = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION);
        blockNode.addChildToBack(fnNode);
        fnNode.setParent(blockNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, blockNode);

        // Assert
        Assert.assertTrue("Function inside BLOCK without special JSDoc should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInScriptParent_shouldReturnTrue() {
        // Arrange
        Node scriptNode = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        scriptNode.addChildToBack(fnNode);
        fnNode.setParent(scriptNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, scriptNode);

        // Assert
        Assert.assertTrue("Function inside SCRIPT should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInNameParent_shouldReturnTrue() {
        // Arrange
        Node nameNode = Node.newString(Token.NAME, "foo");
        Node fnNode = new Node(Token.FUNCTION);
        nameNode.addChildToBack(fnNode);
        fnNode.setParent(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, nameNode);

        // Assert
        Assert.assertTrue("Function inside NAME should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenFunctionInAssignParent_shouldReturnTrue() {
        // Arrange
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = Node.newString(Token.NAME, "bar");
        Node fnNode = new Node(Token.FUNCTION);
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(fnNode);
        lhs.setParent(assignNode);
        fnNode.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, fnNode, assignNode);

        // Assert
        Assert.assertTrue("Function inside ASSIGN rhs should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenAssignLhsTraversal_shouldSetAssignLhsChildAndReturnTrue() {
        // Arrange
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newString(Token.NAME, "y");
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, lhs, assignNode);

        // Assert
        Assert.assertTrue("Assign LHS should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenAssignRhsWithPrototypeLhs_shouldReturnFalse() {
        // Arrange: A.prototype = rhs
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"), Node.newString(Token.STRING, "prototype"));
        Node rhs = new Node(Token.OBJECTLIT);
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, rhs, assignNode);

        // Assert
        Assert.assertFalse("RHS of assignment to A.prototype should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenAssignRhsWithSubpropertyPrototypeLhs_shouldReturnFalse() {
        // Arrange: A.prototype.foo = rhs -> lhs is (GETPROP (GETPROP A prototype) foo)
        Node assignNode = new Node(Token.ASSIGN);
        Node protoProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"), Node.newString(Token.STRING, "prototype"));
        Node lhs = new Node(Token.GETPROP, protoProp, Node.newString(Token.STRING, "foo"));
        Node rhs = new Node(Token.OBJECTLIT);
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);
        protoProp.setParent(lhs);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, rhs, assignNode);

        // Assert
        Assert.assertFalse("RHS of assignment to A.prototype.foo should not be traversed", result);
    }

    @Test
    public void shouldTraverse_givenAssignRhsWithNonPrototypeGetPropLhs_shouldReturnTrue() {
        // Arrange: A.bar = rhs
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.GETPROP, Node.newString(Token.NAME, "A"), Node.newString(Token.STRING, "bar"));
        Node rhs = new Node(Token.OBJECTLIT);
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, rhs, assignNode);

        // Assert
        Assert.assertTrue("RHS of assignment to regular property should be traversed", result);
    }

    @Test
    public void shouldTraverse_givenAssignRhsWithNonGetLhs_shouldReturnTrue() {
        // Arrange: a = rhs (NAME is not a GET token)
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = Node.newString(Token.NAME, "a");
        Node rhs = Node.newString(Token.NAME, "b");
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        boolean result = callback.shouldTraverse(t, rhs, assignNode);

        // Assert
        Assert.assertTrue("RHS of simple variable assignment should be traversed", result);
    }

    // -------------------------------------------------------------------------
    // Phase 1 & 2: Test Cases for visit & shouldReportThis
    // -------------------------------------------------------------------------

    @Test
    public void visit_givenThisInAssignLhs_shouldReportWarning() {
        // Arrange: (this.a = b)
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = new Node(Token.GETPROP, new Node(Token.THIS), Node.newString(Token.STRING, "a"));
        Node rhs = Node.newString(Token.NAME, "b");
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);

        Node thisNode = lhs.getFirstChild();
        thisNode.setParent(lhs);

        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act: Traverse LHS first to establish assignLhsChild
        callback.shouldTraverse(t, lhs, assignNode);
        callback.visit(t, thisNode, lhs);
        callback.visit(t, lhs, assignNode);

        // Assert
        Assert.assertEquals("Warning should be reported for THIS in assign LHS", 1, compiler.getReportedErrors().size());
        JSError err = (JSError) compiler.getReportedErrors().get(0);
        Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, err.getType());
    }

    @Test
    public void visit_givenThisWithGetPropParentOutsideAssign_shouldReportWarning() {
        // Arrange: this.a outside of an assignment LHS
        Node thisNode = new Node(Token.THIS);
        Node parent = new Node(Token.GETPROP, thisNode, Node.newString(Token.STRING, "a"));
        thisNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        callback.visit(t, thisNode, parent);

        // Assert
        Assert.assertEquals("Warning should be reported for property access on global this", 1, compiler.getReportedErrors().size());
        JSError err = (JSError) compiler.getReportedErrors().get(0);
        Assert.assertEquals(CheckGlobalThis.GLOBAL_THIS, err.getType());
    }

    @Test
    public void visit_givenBareThisWithNonGetParent_shouldNotReportWarning() {
        // Arrange: return this; (parent is RETURN)
        Node thisNode = new Node(Token.THIS);
        Node parent = new Node(Token.RETURN, thisNode);
        thisNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        callback.visit(t, thisNode, parent);

        // Assert
        Assert.assertEquals("No warning for bare 'return this'", 0, compiler.getReportedErrors().size());
    }

    @Test
    public void visit_givenThisWithNullParent_shouldNotReportWarning() {
        // Arrange: isolated this node
        Node thisNode = new Node(Token.THIS);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        callback.visit(t, thisNode, null);

        // Assert
        Assert.assertEquals("No warning for isolated this node with null parent", 0, compiler.getReportedErrors().size());
    }

    @Test
    public void visit_givenNonThisNode_shouldNotReportWarning() {
        // Arrange: variable access node
        Node nameNode = Node.newString(Token.NAME, "x");
        Node parent = new Node(Token.EXPR_RESULT, nameNode);
        nameNode.setParent(parent);
        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        callback.visit(t, nameNode, parent);

        // Assert
        Assert.assertEquals("No warning for non-THIS node", 0, compiler.getReportedErrors().size());
    }

    @Test
    public void visit_whenVisitingAssignLhsChild_shouldResetAssignLhsChildState() {
        // Arrange: (lhs = rhs)
        Node assignNode = new Node(Token.ASSIGN);
        Node lhs = Node.newString(Token.NAME, "x");
        Node rhs = Node.newString(Token.NAME, "y");
        assignNode.addChildToBack(lhs);
        assignNode.addChildToBack(rhs);
        lhs.setParent(assignNode);
        rhs.setParent(assignNode);

        NodeTraversal t = new NodeTraversal(compiler, callback);

        // Act
        callback.shouldTraverse(t, lhs, assignNode); // Sets assignLhsChild = lhs
        callback.visit(t, lhs, assignNode);           // Should reset assignLhsChild to null

        // Now test that subsequent bare 'this' does NOT trigger warning
        Node returnNode = new Node(Token.RETURN);
        Node thisNode = new Node(Token.THIS);
        returnNode.addChildToBack(thisNode);
        thisNode.setParent(returnNode);

        callback.visit(t, thisNode, returnNode);

        // Assert
        Assert.assertEquals("assignLhsChild must be reset so subsequent THIS is not reported", 0, compiler.getReportedErrors().size());
    }
}