package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.jscomp.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CheckGlobalThisTest {
    private CheckGlobalThis check;
    private Compiler compiler;
    private TestCallback callback;

    private static class TestCallback implements NodeTraversal.Callback {
        private final CheckGlobalThis check;
        private final boolean[] visited = new boolean[1000];
        private int visitCount = 0;

        TestCallback(CheckGlobalThis check) {
            this.check = check;
        }

        public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
            return check.shouldTraverse(t, n, parent);
        }

        public void visit(NodeTraversal t, Node n, Node parent) {
            check.visit(t, n, parent);
        }

        public int getVisitCount() {
            return visitCount;
        }
    }

    @Before
    public void setUp() {
        compiler = new Compiler();
        check = new CheckGlobalThis(compiler, CheckLevel.ERROR);
        callback = new TestCallback(check);
    }

    @Test
    public void testNormalFunctionWithoutThis() {
        Node root = compiler.parse("function foo() { var x = 1; }");
        Node function = root.getFirstChild();
        assertTrue("normal function should traverse", 
            check.shouldTraverse(newTestTraversal(), function, root));
    }

    @Test
    public void testConstructorFunctionSkipsTraversal() {
        Node root = compiler.parse("/** @constructor */ function Foo() { this.x = 1; }");
        Node function = root.getFirstChild();
        assertFalse("constructor with @constructor should not traverse", 
            check.shouldTraverse(newTestTraversal(), function, root));
    }

    @Test
    public void testThisAnnotationSkipsTraversal() {
        Node root = compiler.parse("/** @this {Object} */ function foo() { this.x = 1; }");
        Node function = root.getFirstChild();
        assertFalse("function with @this should not traverse", 
            check.shouldTraverse(newTestTraversal(), function, root));
    }

    @Test
    public void testAssignLeftSideNeverTraversed() {
        Node root = compiler.parse("this.x = 1;");
        Node assign = root.getFirstChild();
        Node thisNode = assign.getFirstChild();
        check.shouldTraverse(newTestTraversal(), thisNode, assign);
        assertTrue("THIS on left side of assign should be reported", 
            check.shouldReportThisInternal(thisNode, assign));
    }

    @Test
    public void testGlobalVarFunctionGetsJSDocFromVar() {
        Node root = compiler.parse("var x = function() { this.y = 1; };");
        Node var = root.getFirstChild();
        Node name = var.getFirstChild();
        Node function = name.getFirstChild();
        JSDocInfo jsDoc = check.getFunctionJsDocInfo(function);
        // No @constructor, but should still traverse (no JSDoc)
        assertTrue("function without JSDoc should traverse", 
            check.shouldTraverse(newTestTraversal(), function, root));
    }

    @Test
    public void testAssignPrototypeLeftSideDoesNotTraverseRight() {
        Node root = compiler.parse("Foo.prototype = { x: this };");
        Node assign = root.getFirstChild();
        Node lhs = assign.getFirstChild();
        Node rhs = lhs.getNext();
        assertFalse("should not traverse RHS when LHS is prototype assign", 
            check.shouldTraverse(newTestTraversal(), rhs, assign));
    }

    @Test
    public void testNormalAssignmentRightSideTraverses() {
        Node root = compiler.parse("a = this;");
        Node assign = root.getFirstChild();
        Node lhs = assign.getFirstChild();
        Node rhs = lhs.getNext();
        assertTrue("RHS of normal assignment should traverse", 
            check.shouldTraverse(newTestTraversal(), rhs, assign));
    }

    @Test
    public void testNestedAssignLhsChildNotOverridden() {
        Node root = compiler.parse("(a = this).b = c;");
        Node outerAssign = root.getFirstChild();
        Node lhs = outerAssign.getFirstChild();
        Node innerAssign = lhs.getFirstChild();
        assertEquals("inner assign is LHS child", innerAssign, lhs);
        check.shouldTraverse(newTestTraversal(), innerAssign, outerAssign);
        check.shouldTraverse(newTestTraversal(), innerAssign.getFirstChild(), innerAssign);
        assertEquals("assignLhsChild should point to inner assign", 
            innerAssign, check.getAssignLhsChildForTest());
    }

    @Test
    public void testVisitResetsAssignLhsChild() {
        Node root = compiler.parse("(a = this).b;");
        Node outerAssign = root.getFirstChild();
        Node lhs = outerAssign.getFirstChild();
        Node thisNode = lhs.getNext();
        check.shouldTraverse(newTestTraversal(), lhs, outerAssign);
        callback.visit(newTestTraversal(), thisNode, outerAssign);
        assertNull("assignLhsChild should be null after visit", 
            check.getAssignLhsChildForTest());
    }

    @Test
    public void testNullParentFunction() {
        Node root = compiler.parse("function() {};");
        Node function = root.getFirstChild();
        // For anonymous function, parent is EXPR_NODE not showing; use same as before
        assertTrue("function with no parent should not NPE", 
            check.shouldTraverse(newTestTraversal(), function, null));
    }

    @Test
    public void testFunctionWithJsDocFromParentNode() {
        Node root = compiler.parse("/** @constructor */ var x = function() {};");
        Node var = root.getFirstChild();
        Node name = var.getFirstChild();
        Node function = name.getFirstChild();
        assertFalse("function with @constructor JSDoc from parent var should not traverse", 
            check.shouldTraverse(newTestTraversal(), function, name));
    }

    @Test
    public void testNoPrototypeInQualifiedName() {
        Node root = compiler.parse("Foo.Bar = this;");
        Node assign = root.getFirstChild();
        Node lhs = assign.getFirstChild();
        Node rhs = lhs.getNext();
        assertTrue("assign to normal qualified name should traverse RHS", 
            check.shouldTraverse(newTestTraversal(), rhs, assign));
    }

    @Test
    public void testShouldReportThisWhenAssignLhsChildSet() {
        Node root = compiler.parse("(a = this).b;");
        Node outerAssign = root.getFirstChild();
        Node lhs = outerAssign.getFirstChild();
        Node thisNode = lhs.getNext();
        check.shouldTraverse(newTestTraversal(), lhs, outerAssign);
        // Simulate visit of THIS node
        assertTrue("THIS on LHS of nested assign should be reported", 
            check.shouldReportThisInternal(thisNode, outerAssign));
    }

    @Test
    public void testShouldNotReportThisNormalPropertyAccess() {
        Node root = compiler.parse("this.x;");
        Node thisNode = root.getFirstChild();
        assertFalse("normal THIS property access should not report", 
            check.shouldReportThisInternal(thisNode, root));
    }

    private NodeTraversal newTestTraversal() {
        return new NodeTraversal(compiler, callback);
    }
}

final class CheckGlobalThisTestHelper {
    public static final CheckGlobalThis INSTANCE = new CheckGlobalThis(null, CheckLevel.ERROR);
}