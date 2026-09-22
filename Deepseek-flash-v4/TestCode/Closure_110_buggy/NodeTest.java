package com.google.javascript.rhino;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.Set;

public class NodeTest {
    private Node node;

    @Before
    public void setUp() {
        node = new Node(0);
    }

    @After
    public void tearDown() {
        node = null;
    }

    @Test
    public void testNodeCreation() {
        assertEquals(0, node.getType());
        assertNull(node.getFirstChild());
        assertNull(node.getLastChild());
        assertNull(node.getNext());
        assertNull(node.getParent());
    }

    @Test
    public void testAddChildToEmptyList() {
        Node child = new Node(1);
        node.addChildToBack(child);
        assertEquals(child, node.getFirstChild());
        assertEquals(child, node.getLastChild());
        assertEquals(1, node.getChildCount());
    }

    @Test
    public void testAddMultipleChildrenToBack() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        Node child3 = new Node(3);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        node.addChildToBack(child3);
        assertEquals(child1, node.getFirstChild());
        assertEquals(child3, node.getLastChild());
        assertEquals(3, node.getChildCount());
    }

    @Test
    public void testAddChildToFront() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToFront(child1);
        node.addChildToFront(child2);
        assertEquals(child2, node.getFirstChild());
        assertEquals(child1, node.getLastChild());
        assertEquals(2, node.getChildCount());
    }

    @Test
    public void testAddChildBefore() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        Node child3 = new Node(3);
        node.addChildToBack(child1);
        node.addChildToBack(child3);
        node.addChildBefore(child2, child3);
        assertEquals(child1, node.getFirstChild());
        assertEquals(child2, node.getChildAtIndex(1));
        assertEquals(child3, node.getLastChild());
    }

    @Test
    public void testRemoveChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        node.removeChild(child1);
        assertEquals(child1, node.removeChild(child1));
        assertEquals(child2, node.getFirstChild());
    }

    @Test
    public void testRemoveFirstChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        Node removed = node.removeFirstChild();
        assertEquals(child1, removed);
        assertEquals(child2, node.getFirstChild());
    }

    @Test
    public void testRemoveLastChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        Node removed = node.removeLastChild();
        assertEquals(child2, removed);
        assertEquals(child1, node.getLastChild());
    }

    @Test
    public void testRemoveNoSuchChild() {
        Node child1 = new Node(1);
        node.addChildToBack(child1);
        Node notChild = new Node(2);
        assertNull(node.removeChild(notChild));
    }

    @Test
    public void testAddChildBeforeWithNoParent() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        assertNull(node.getChildBefore(child1));
    }

    @Test
    public void testGetChildBefore() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertEquals(child1, node.getChildBefore(child2));
    }

    @Test
    public void testGetChildAtIndex() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertEquals(child1, node.getChildAtIndex(0));
        assertEquals(child2, node.getChildAtIndex(1));
    }

    @Test
    public void testGetChildCount() {
        assertEquals(0, node.getChildCount());
        node.addChildToBack(new Node(1));
        node.addChildToBack(new Node(2));
        assertEquals(2, node.getChildCount());
    }

    @Test
    public void testGetSiblingOfChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertEquals(child2, node.getChildAtIndex(0).getNext());
        assertNull(node.getChildAtIndex(1).getNext());
    }

    @Test
    public void testSetIntAndGetProp() {
        node.putIntProp(10, 5);
        assertEquals(5, node.getIntProp(10));
        node.putIntProp(10, 0);
        assertEquals(0, node.getIntProp(10));
    }

    @Test
    public void testPutBooleanProp() {
        node.putBooleanProp(10, true);
        assertTrue(node.getBooleanProp(10));
        node.putBooleanProp(10, false);
        assertFalse(node.getBooleanProp(10));
    }

    @Test
    public void testSetDouble() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(3.14);
        assertEquals(3.14, n.getDouble(), 0.0001);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetDoubleOnNonNumber() {
        node.setDouble(3.14);
    }

    @Test
    public void testSetString() {
        Node n = new Node(Token.STRING);
        n.setString("hello");
        assertEquals("hello", n.getString());
    }

    @Test
    public void testSetStringOnName() {
        Node n = new Node(Token.NAME);
        n.setString("foo");
        assertEquals("foo", n.getString());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetStringOnOtherType() {
        node.setString("test");
    }

    @Test
    public void testGetStringNull() {
        Node n = new StringNode(Token.STRING, null);
        assertNull(n.getString());
    }

    @Test
    public void testGetPropWithNoMatch() {
        node.putIntProp(10, 5);
        assertNull(node.getProp(20));
        assertEquals(0, node.getIntProp(20));
    }

    @Test
    public void testGetPropWithObject() {
        Object obj = new Object();
        node.putProp(10, obj);
        assertSame(obj, node.getProp(10));
    }

    @Test
    public void testGetBooleanPropDefault() {
        node.putIntProp(10, 0);
        assertTrue(node.getBooleanProp(10));
        assertFalse(node.getBooleanProp(20));
    }

    @Test
    public void testHasChildren() {
        assertFalse(node.hasChildren());
        node.addChildToBack(new Node(1));
        assertTrue(node.hasChildren());
    }

    @Test
    public void testIsEquivalentToSameNode() {
        assertTrue(node.isEquivalentTo(node));
    }

    @Test
    public void testIsEquivalentToDifferentTypes() {
        Node other = new Node(1);
        assertFalse(node.isEquivalentTo(other));
    }

    @Test
    public void testIsEquivalentToSameTypeNoChildren() {
        Node other = new Node(0);
        assertTrue(node.isEquivalentTo(other));
    }

    @Test
    public void testIsEquivalentToStringMismatch() {
        Node n1 = new StringNode(Token.STRING, "a");
        Node n2 = new StringNode(Token.STRING, "b");
        assertFalse(n1.isEquivalentTo(n2));
    }

    @Test
    public void testIsEquivalentToNumberMismatch() {
        Node n1 = new NumberNode(Token.NUMBER, 1.0);
        Node n2 = new NumberNode(Token.NUMBER, 2.0);
        assertFalse(n1.isEquivalentTo(n2));
    }

    @Test
    public void testIsEquivalentToNumberEqual() {
        Node n1 = new NumberNode(Token.NUMBER, 1.0);
        Node n2 = new NumberNode(Token.NUMBER, 1.0);
        assertTrue(n1.isEquivalentTo(n2));
    }

    @Test
    public void testIsEquivalentToNumberNaN() {
        Node n1 = new NumberNode(Token.NUMBER, Double.NaN);
        Node n2 = new NumberNode(Token.NUMBER, Double.NaN);
        assertTrue(n1.isEquivalentTo(n2));
    }

    @Test
    public void testIsEquivalentToNumberZeroAndNegativeZero() {
        Node n1 = new NumberNode(Token.NUMBER, 0.0);
        Node n2 = new NumberNode(Token.NUMBER, -0.0);
        assertFalse(n1.isEquivalentTo(n2));
    }

    @Test
    public void testIsEquivalentToWithChildren() {
        Node child1 = new Node(1);
        Node child2 = new Node(1);
        node.addChildToBack(child1);
        Node other = new Node(0);
        other.addChildToBack(child2);
        assertTrue(node.isEquivalentTo(other));
    }

    @Test
    public void testIsEquivalentToWithMismatchedChildren() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        Node other = new Node(0);
        other.addChildToBack(child2);
        assertFalse(node.isEquivalentTo(other));
    }

    @Test
    public void testIsEquivalentToNullNode() {
        assertFalse(node.isEquivalentTo(null));
    }

    @Test
    public void testIsEquivalentToJSTypeMismatch() {
        Node n1 = new Node(Token.NUMBER);
        n1.setJSType(JSType.NUMBER_TYPE);
        Node n2 = new Node(Token.NUMBER);
        n2.setJSType(JSType.STRING_TYPE);
        assertFalse(n1.isEquivalentTo(n2, true, false, false));
    }

    @Test
    public void testGetQualifiedNameForName() {
        Node n = new Node(Token.NAME);
        n.setString("foo");
        assertEquals("foo", n.getQualifiedName());
    }

    @Test
    public void testGetQualifiedNameForEmptyName() {
        Node n = new Node(Token.NAME);
        n.setString("");
        assertEquals("", n.getQualifiedName());
    }

    @Test
    public void testGetQualifiedNameForGetProp() {
        Node n = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME);
        left.setString("a");
        Node right = new Node(Token.STRING);
        right.setString("b");
        n.addChildToBack(left);
        n.addChildToBack(right);
        assertEquals("a.b", n.getQualifiedName());
    }

    @Test
    public void testGetQualifiedNameForGetPropWithNullLeft() {
        Node n = new Node(Token.GETPROP);
        Node right = new Node(Token.STRING);
        right.setString("b");
        n.addChildToBack(null);
        n.addChildToBack(right);
        assertNull(n.getQualifiedName());
    }

    @Test
    public void testGetQualifiedNameForThis() {
        Node n = new Node(Token.THIS);
        assertEquals("this", n.getQualifiedName());
    }

    @Test
    public void testGetQualifiedNameForOther() {
        node.setType(Token.CALL);
        assertNull(node.getQualifiedName());
    }

    @Test
    public void testIsQualifiedName() {
        Node n = new Node(Token.NAME);
        n.setString("foo");
        assertTrue(n.isQualifiedName());
    }

    @Test
    public void testIsQualifiedNameForGetProp() {
        Node n = new Node(Token.GETPROP);
        assertTrue(n.isQualifiedName());
    }

    @Test
    public void testIsQualifiedNameForThis() {
        Node n = new Node(Token.THIS);
        assertTrue(n.isQualifiedName());
    }

    @Test
    public void testIsQualifiedNameForOther() {
        assertFalse(node.isQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedNameForName() {
        Node n = new Node(Token.NAME);
        n.setString("foo");
        assertTrue(n.isUnscopedQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedNameForGetProp() {
        Node n = new Node(Token.GETPROP);
        Node left = new Node(Token.NAME);
        left.setString("a");
        Node right = new Node(Token.STRING);
        right.setString("b");
        n.addChildToBack(left);
        n.addChildToBack(right);
        assertTrue(n.isUnscopedQualifiedName());
    }

    @Test
    public void testIsUnscopedQualifiedNameForOther() {
        assertFalse(node.isUnscopedQualifiedName());
    }

    @Test
    public void testClone() {
        node.putProp(10, "value");
        node.putIntProp(20, 5);
        Node child = new Node(1);
        node.addChildToBack(child);
        Node clone = node.clone();
        assertNotSame(node, clone);
        assertEquals(node, clone);
        assertEquals(child, clone.getFirstChild());
        assertEquals("value", clone.getProp(10));
        assertEquals(5, clone.getIntProp(20));
    }

    @Test
    public void testCloneWithNullChildren() {
        node.putProp(10, null);
        Node clone = node.clone();
        assertNotSame(node, clone);
        assertEquals(node, clone);
        assertNull(clone.getProp(10));
    }

    @Test
    public void testUseSourceInfo() {
        Node other = new Node(1);
        other.setLineno(5);
        other.setCharno(10);
        node.useSourceInfoFrom(other);
        assertEquals(5, node.getLineno());
        assertEquals(10, node.getCharno());
    }

    @Test
    public void testUseSourceInfoWithNullCharno() {
        Node other = new Node(1);
        other.setLineno(5);
        other.setCharno(-1);
        node.useSourceInfoFrom(other);
        assertEquals(5, node.getLineno());
        assertEquals(-1, node.getCharno());
    }

    @Test
    public void testUseSourceInfoForTree() {
        Node other = new Node(1);
        other.setLineno(5);
        other.setCharno(10);
        Node child = new Node(2);
        other.addChildToBack(child);
        node.useSourceInfoFromForTree(other);
        assertEquals(5, node.getLineno());
        assertEquals(10, node.getCharno());
        assertEquals(5, node.getFirstChild().getLineno());
    }

    @Test
    public void testSetSourceFile() {
        StaticSourceFile file = new SimpleSourceFile("test.js", false);
        node.setStaticSourceFile(file);
        assertSame(file, node.getStaticSourceFile());
    }

    @Test
    public void testGetSourceFileName() {
        StaticSourceFile file = new SimpleSourceFile("test.js", false);
        node.setStaticSourceFile(file);
        assertEquals("test.js", node.getSourceFileName());
    }

    @Test
    public void testGetSourceFileNameNull() {
        assertNull(node.getSourceFileName());
    }

    @Test
    public void testSetInputId() {
        InputId id = new InputId("input");
        node.setInputId(id);
        assertSame(id, node.getInputId());
    }

    @Test
    public void testGetLineno() {
        node.setLineno(10);
        node.setCharno(5);
        assertEquals(10, node.getLineno());
        assertEquals(5, node.getCharno());
    }

    @Test
    public void testGetLinenoWithInvalid() {
        node.setLineno(-1);
        node.setCharno(-1);
        assertEquals(-1, node.getLineno());
        assertEquals(-1, node.getCharno());
    }

    @Test
    public void testGetLinenoWithOnlyLineno() {
        node.setLineno(10);
        node.setCharno(-1);
        assertEquals(10, node.getLineno());
        assertEquals(-1, node.getCharno());
    }

    @Test
    public void testParentChildRelationship() {
        Node child = new Node(1);
        node.addChildToBack(child);
        assertEquals(node, child.getParent());
    }

    @Test
    public void testIsSibling() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        Node other = new Node(3);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertFalse(child1.hasChildren());
        assertFalse(child2.hasChildren());
        assertFalse(other.hasChildren());
    }

    @Test
    public void testIteration() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        int count = 0;
        for (Node child : node) {
            count++;
            assertNotNull(child);
        }
        assertEquals(2, count);
    }

    @Test
    public void testIterationEmpty() {
        int count = 0;
        for (Node ignored : node) {
            count++;
        }
        assertEquals(0, count);
    }

    @Test
    public void testSiblingIteration() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        int count = 0;
        for (Node sibling : node.siblings()) {
            count++;
            assertNotNull(sibling);
        }
        assertEquals(2, count);
    }

    @Test
    public void testSiblingIterationEmpty() {
        int count = 0;
        for (Node ignored : node.siblings()) {
            count++;
        }
        assertEquals(0, count);
    }

    @Test
    public void testHasOneChild() {
        node.addChildToBack(new Node(1));
        assertTrue(node.hasOneChild());
    }

    @Test
    public void testHasMoreThanOneChild() {
        node.addChildToBack(new Node(1));
        node.addChildToBack(new Node(2));
        assertTrue(node.hasMoreThanOneChild());
    }

    @Test
    public void testHasMoreThanOneChildFalse() {
        node.addChildToBack(new Node(1));
        assertFalse(node.hasMoreThanOneChild());
    }

    @Test
    public void testGetChildCountAfterRemoval() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        node.removeChild(child1);
        assertEquals(1, node.getChildCount());
    }

    @Test
    public void testGetChildAtIndexFromEnd() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertEquals(child2, node.getChildAtIndex(node.getChildCount() - 1));
    }

    @Test
    public void testGetChildAtIndexOutOfBounds() {
        assertNull(node.getChildAtIndex(0));
    }

    @Test
    public void testGetChildAtIndexOutOfBoundsNegative() {
        assertNull(node.getChildAtIndex(-1));
    }

    @Test
    public void testGetChildIndex() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        assertEquals(0, node.getChildIndex(child1));
        assertEquals(1, node.getChildIndex(child2));
    }

    @Test
    public void testGetChildIndexForNull() {
        assertEquals(-1, node.getChildIndex(null));
    }

    @Test
    public void testGetChildIndexForNonExistentChild() {
        Node child = new Node(1);
        assertEquals(-1, node.getChildIndex(child));
    }

    @Test
    public void testHasInitialChildren() {
        Node child = new Node(0);
        assertFalse(child.hasInitialChildren());
    }

    @Test
    public void testSetJSDocInfo() {
        JSDocInfo info = new JSDocInfo();
        node.setJSDocInfo(info);
        assertEquals(info, node.getJSDocInfo());
    }

    @Test
    public void testSetJSDocInfoNull() {
        node.setJSDocInfo(null);
        assertNull(node.getJSDocInfo());
    }

    @Test
    public void testAddChildBeforeIncludingNull() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        Node newChild = new Node(3);
        node.addChildBefore(newChild, child1);
        assertEquals(newChild, node.getFirstChild());
    }

    @Test
    public void testAddChildBeforeFirstChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        node.addChildToBack(child2);
        Node newChild = new Node(3);
        node.addChildBefore(newChild, child1);
        assertEquals(newChild, node.getFirstChild());
    }

    @Test
    public void testAddChildBeforeWithNonExistentSibling() {
        Node child1 = new Node(1);
        node.addChildToBack(child1);
        assertNull(node.getChildBefore(new Node(2)));
    }

    @Test
    public void testToStringNoSourceInfo() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(1.0);
        String result = n.toString();
        assertNotNull(result);
    }

    @Test
    public void testToStringWithSourceInfo() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(1.0);
        n.setLineno(1);
        n.setCharno(2);
        String result = n.toString();
        assertNotNull(result);
    }

    @Test
    public void testToStringTree() {
        Node n = new Node(Token.ADD);
        Node left = new NumberNode(Token.NUMBER, 1.0);
        Node right = new NumberNode(Token.NUMBER, 2.0);
        n.addChildToBack(left);
        n.addChildToBack(right);
        String tree = n.toStringTree();
        assertNotNull(tree);
    }

    @Test
    public void testToStringTreeWithType() {
        Node n = new Node(Token.NAME);
        n.setString("foo");
        String tree = n.toStringTree();
        assertNotNull(tree);
    }

    @Test
    public void testToStringTreeWithJSType() {
        Node n = new Node(Token.NUMBER);
        n.setJSType(JSType.NUMBER_TYPE);
        String tree = n.toStringTree();
        assertNotNull(tree);
    }

    @Test
    public void testToStringTreeWithSource() {
        Node n = new Node(Token.NUMBER);
        n.setLineno(1);
        n.setCharno(2);
        String tree = n.toStringTree();
        assertNotNull(tree);
    }

    @Test
    public void testToStringTreeWithSourceAndType() {
        Node n = new Node(Token.NUMBER);
        n.setLineno(1);
        n.setCharno(2);
        n.setJSType(JSType.NUMBER_TYPE);
        String tree = n.toStringTree();
        assertNotNull(tree);
    }

    @Test
    public void testGetJSType() {
        JSType type = JSType.NUMBER_TYPE;
        node.setJSType(type);
        assertEquals(type, node.getJSType());
    }

    @Test
    public void testSetJSTypeNull() {
        node.setJSType(null);
        assertNotNull(node.getJSType());
    }

    @Test
    public void testGetLastChildOnEmpty() {
        assertNull(node.getLastChild());
    }

    @Test
    public void testGetFirstChildOnEmpty() {
        assertNull(node.getFirstChild());
    }

    @Test
    public void testGetNextOnChild() {
        Node child1 = new Node(1);
        Node child2 = new Node(2);
        node.addChildToBack(child1);
        assertEquals(child1, node.getFirstChild());
        assertEquals(child1, node.getLastChild());
    }

    @Test
    public void testSideEffectFlags() {
        SideEffectFlags sef = new SideEffectFlags();
        assertEquals(Node.SIDE_EFFECTS_ALL, sef.getBits());
        sef.setAllFlags();
        assertEquals(Node.SIDE_EFFECTS_ALL, sef.getBits());
        sef.clearAllFlags();
        assertEquals(Node.NO_SIDE_EFFECTS, sef.getBits());
        sef.clearAllFlags();
        sef.setFlag(Node.FLAG_LOCAL_RESULTS);
        assertTrue(sef.areAllFlagsSet(Node.FLAG_LOCAL_RESULTS));
        sef.clearFlags(Node.FLAG_LOCAL_RESULTS);
        assertFalse(sef.areAllFlagsSet(Node.FLAG_LOCAL_RESULTS));
    }

    @Test
    public void testGetBooleanPropWithIntProp() {
        node.putIntProp(10, 1);
        assertTrue(node.getBooleanProp(10));
    }

    @Test
    public void testGetBooleanPropWithFalse() {
        node.putBooleanProp(10, false);
        assertFalse(node.getBooleanProp(10));
    }
}