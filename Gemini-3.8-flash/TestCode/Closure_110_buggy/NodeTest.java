package com.google.javascript.rhino;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class NodeTest {

  @Test
  public void constructor_givenTypeOnly_shouldInitializeDefaults() {
    Node node = new Node(Token.BLOCK);

    Assert.assertEquals(Token.BLOCK, node.getType());
    Assert.assertNull(node.getParent());
    Assert.assertNull(node.getFirstChild());
    Assert.assertNull(node.getLastChild());
    Assert.assertNull(node.getNext());
    Assert.assertEquals(-1, node.getSourcePosition());
    Assert.assertEquals(-1, node.getLineno());
    Assert.assertEquals(-1, node.getCharno());
    Assert.assertFalse(node.hasChildren());
    Assert.assertEquals(0, node.getChildCount());
  }

  @Test
  public void constructor_givenSingleChild_shouldSetParentAndChildReferences() {
    Node child = new Node(Token.NAME);
    Node parent = new Node(Token.EXPR_RESULT, child);

    Assert.assertEquals(Token.EXPR_RESULT, parent.getType());
    Assert.assertSame(child, parent.getFirstChild());
    Assert.assertSame(child, parent.getLastChild());
    Assert.assertSame(parent, child.getParent());
    Assert.assertNull(child.getNext());
    Assert.assertTrue(parent.hasChildren());
    Assert.assertTrue(parent.hasOneChild());
    Assert.assertFalse(parent.hasMoreThanOneChild());
    Assert.assertEquals(1, parent.getChildCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenSingleChildWithExistingParent_shouldThrowException() {
    Node child = new Node(Token.NAME);
    new Node(Token.EXPR_RESULT, child);

    new Node(Token.BLOCK, child);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenSingleChildWithExistingSibling_shouldThrowException() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    new Node(Token.BLOCK, c1, c2);

    new Node(Token.EXPR_RESULT, c1);
  }

  @Test
  public void constructor_givenTwoChildren_shouldChainCorrectly() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.ASSIGN, left, right);

    Assert.assertSame(left, parent.getFirstChild());
    Assert.assertSame(right, parent.getLastChild());
    Assert.assertSame(right, left.getNext());
    Assert.assertNull(right.getNext());
    Assert.assertSame(parent, left.getParent());
    Assert.assertSame(parent, right.getParent());
    Assert.assertTrue(parent.hasMoreThanOneChild());
    Assert.assertFalse(parent.hasOneChild());
    Assert.assertEquals(2, parent.getChildCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenTwoChildrenWithLeftParentNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    new Node(Token.BLOCK, left);

    new Node(Token.ASSIGN, left, right);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenTwoChildrenWithRightParentNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    new Node(Token.BLOCK, right);

    new Node(Token.ASSIGN, left, right);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenTwoChildrenWithLeftSiblingNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    new Node(Token.BLOCK, left, mid);

    new Node(Token.ASSIGN, left, right);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenTwoChildrenWithRightSiblingNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node extra = new Node(Token.NAME);
    new Node(Token.BLOCK, right, extra);

    new Node(Token.ASSIGN, left, right);
  }

  @Test
  public void constructor_givenThreeChildren_shouldChainCorrectly() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.HOOK, left, mid, right);

    Assert.assertSame(left, parent.getFirstChild());
    Assert.assertSame(right, parent.getLastChild());
    Assert.assertSame(mid, left.getNext());
    Assert.assertSame(right, mid.getNext());
    Assert.assertNull(right.getNext());
    Assert.assertSame(parent, left.getParent());
    Assert.assertSame(parent, mid.getParent());
    Assert.assertSame(parent, right.getParent());
    Assert.assertEquals(3, parent.getChildCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenThreeChildrenWithMidParentNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    new Node(Token.BLOCK, mid);

    new Node(Token.HOOK, left, mid, right);
  }

  @Test
  public void constructor_givenFourChildren_shouldChainCorrectly() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node mid2 = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.FOR, left, mid, mid2, right);

    Assert.assertSame(left, parent.getFirstChild());
    Assert.assertSame(right, parent.getLastChild());
    Assert.assertSame(mid, left.getNext());
    Assert.assertSame(mid2, mid.getNext());
    Assert.assertSame(right, mid2.getNext());
    Assert.assertNull(right.getNext());
    Assert.assertSame(parent, left.getParent());
    Assert.assertSame(parent, mid.getParent());
    Assert.assertSame(parent, mid2.getParent());
    Assert.assertSame(parent, right.getParent());
    Assert.assertEquals(4, parent.getChildCount());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenFourChildrenWithMid2ParentNonNull_shouldThrowException() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node mid2 = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    new Node(Token.BLOCK, mid2);

    new Node(Token.FOR, left, mid, mid2, right);
  }

  @Test
  public void constructor_givenLineAndCharNo_shouldEncodeSourcePosition() {
    Node node = new Node(Token.BLOCK, 10, 20);

    Assert.assertEquals(10, node.getLineno());
    Assert.assertEquals(20, node.getCharno());
  }

  @Test
  public void constructor_givenSingleChildAndLineCharNo_shouldSetAll() {
    Node child = new Node(Token.NAME);
    Node parent = new Node(Token.EXPR_RESULT, child, 5, 8);

    Assert.assertSame(child, parent.getFirstChild());
    Assert.assertEquals(5, parent.getLineno());
    Assert.assertEquals(8, parent.getCharno());
  }

  @Test
  public void constructor_givenTwoChildrenAndLineCharNo_shouldSetAll() {
    Node left = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.ASSIGN, left, right, 12, 34);

    Assert.assertSame(left, parent.getFirstChild());
    Assert.assertSame(right, parent.getLastChild());
    Assert.assertEquals(12, parent.getLineno());
    Assert.assertEquals(34, parent.getCharno());
  }

  @Test
  public void constructor_givenThreeChildrenAndLineCharNo_shouldSetAll() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.HOOK, left, mid, right, 1, 2);

    Assert.assertEquals(3, parent.getChildCount());
    Assert.assertEquals(1, parent.getLineno());
    Assert.assertEquals(2, parent.getCharno());
  }

  @Test
  public void constructor_givenFourChildrenAndLineCharNo_shouldSetAll() {
    Node left = new Node(Token.NAME);
    Node mid = new Node(Token.NAME);
    Node mid2 = new Node(Token.NAME);
    Node right = new Node(Token.NAME);
    Node parent = new Node(Token.FOR, left, mid, mid2, right, 7, 9);

    Assert.assertEquals(4, parent.getChildCount());
    Assert.assertEquals(7, parent.getLineno());
    Assert.assertEquals(9, parent.getCharno());
  }

  @Test
  public void constructor_givenArrayOfChildren_shouldChainAllChildren() {
    Node[] children = new Node[] {
      new Node(Token.NAME),
      new Node(Token.NAME),
      new Node(Token.NAME)
    };
    Node parent = new Node(Token.BLOCK, children);

    Assert.assertEquals(3, parent.getChildCount());
    Assert.assertSame(children[0], parent.getFirstChild());
    Assert.assertSame(children[2], parent.getLastChild());
    Assert.assertSame(children[1], children[0].getNext());
    Assert.assertSame(children[2], children[1].getNext());
    Assert.assertNull(children[2].getNext());
    Assert.assertSame(parent, children[0].getParent());
    Assert.assertSame(parent, children[1].getParent());
    Assert.assertSame(parent, children[2].getParent());
  }

  @Test
  public void constructor_givenEmptyArrayOfChildren_shouldHaveNoChildren() {
    Node[] children = new Node[0];
    Node parent = new Node(Token.BLOCK, children);

    Assert.assertEquals(0, parent.getChildCount());
    Assert.assertNull(parent.getFirstChild());
    Assert.assertNull(parent.getLastChild());
  }

  @Test
  public void constructor_givenArrayAndLineCharNo_shouldSetPositionAndChildren() {
    Node[] children = new Node[] { new Node(Token.NAME) };
    Node parent = new Node(Token.BLOCK, children, 15, 25);

    Assert.assertEquals(1, parent.getChildCount());
    Assert.assertEquals(15, parent.getLineno());
    Assert.assertEquals(25, parent.getCharno());
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenArrayWithExistingSiblingOnElement_shouldThrowException() {
    Node n1 = new Node(Token.NAME);
    Node n2 = new Node(Token.NAME);
    new Node(Token.BLOCK, n1, n2);

    Node[] arr = new Node[] { n1, new Node(Token.NAME) };
    new Node(Token.BLOCK, arr);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructor_givenArrayWithExistingParentOnElement_shouldThrowException() {
    Node n1 = new Node(Token.NAME);
    new Node(Token.BLOCK, n1);

    Node[] arr = new Node[] { n1 };
    new Node(Token.BLOCK, arr);
  }

  @Test
  public void numberNode_givenValueAndPosition_shouldStoreAndRetrieveCorrectly() {
    Node num = Node.newNumber(42.5);
    Assert.assertTrue(num.isNumber());
    Assert.assertEquals(42.5, num.getDouble(), 0.0);

    num.setDouble(99.0);
    Assert.assertEquals(99.0, num.getDouble(), 0.0);

    Node numWithPos = Node.newNumber(3.14, 2, 4);
    Assert.assertEquals(3.14, numWithPos.getDouble(), 0.0);
    Assert.assertEquals(2, numWithPos.getLineno());
    Assert.assertEquals(4, numWithPos.getCharno());
  }

  @Test(expected = IllegalStateException.class)
  public void getDouble_givenNonNumberNodeSubclassWithNumberToken_shouldThrowIllegalStateException() {
    Node regularNode = new Node(Token.NUMBER);
    regularNode.getDouble();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void getDouble_givenNonNumberToken_shouldThrowUnsupportedOperationException() {
    Node strNode = Node.newString("abc");
    strNode.getDouble();
  }

  @Test(expected = IllegalStateException.class)
  public void setDouble_givenNonNumberNodeSubclassWithNumberToken_shouldThrowIllegalStateException() {
    Node regularNode = new Node(Token.NUMBER);
    regularNode.setDouble(10.0);
  }

  @Test(expected = UnsupportedOperationException.class)
  public void setDouble_givenNonNumberToken_shouldThrowUnsupportedOperationException() {
    Node strNode = Node.newString("abc");
    strNode.setDouble(10.0);
  }

  @Test
  public void stringNode_givenValueAndPosition_shouldStoreAndRetrieveCorrectly() {
    Node strNode = Node.newString("test");
    Assert.assertTrue(strNode.isString());
    Assert.assertEquals("test", strNode.getString());

    strNode.setString("modified");
    Assert.assertEquals("modified", strNode.getString());

    Node strWithType = Node.newString(Token.NAME, "varName");
    Assert.assertTrue(strWithType.isName());
    Assert.assertEquals("varName", strWithType.getString());

    Node strWithPos = Node.newString("posStr", 10, 20);
    Assert.assertEquals("posStr", strWithPos.getString());
    Assert.assertEquals(10, strWithPos.getLineno());
    Assert.assertEquals(20, strWithPos.getCharno());

    Node strWithTypeAndPos = Node.newString(Token.LABEL_NAME, "label", 3, 5);
    Assert.assertTrue(strWithTypeAndPos.isLabelName());
    Assert.assertEquals("label", strWithTypeAndPos.getString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void stringNode_givenNullInConstructor_shouldThrowIllegalArgumentException() {
    Node.newString(null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void stringNode_givenNullInConstructorWithPosition_shouldThrowIllegalArgumentException() {
    Node.newString(Token.STRING, null, 1, 1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void stringNode_givenNullInSetString_shouldThrowIllegalArgumentException() {
    Node strNode = Node.newString("test");
    strNode.setString(null);
  }

  @Test(expected = IllegalStateException.class)
  public void getString_givenNonStringNodeSubclassWithStringToken_shouldThrowIllegalStateException() {
    Node regular = new Node(Token.STRING);
    regular.getString();
  }

  @Test(expected = UnsupportedOperationException.class)
  public void getString_givenNonStringToken_shouldThrowUnsupportedOperationException() {
    Node numNode = Node.newNumber(1.0);
    numNode.getString();
  }

  @Test(expected = IllegalStateException.class)
  public void setString_givenNonStringNodeSubclassWithNameToken_shouldThrowIllegalStateException() {
    Node regular = new Node(Token.NAME);
    regular.setString("abc");
  }

  @Test(expected = UnsupportedOperationException.class)
  public void setString_givenNonStringToken_shouldThrowUnsupportedOperationException() {
    Node numNode = Node.newNumber(1.0);
    numNode.setString("abc");
  }

  @Test
  public void quotedString_givenStringNode_shouldGetAndSetCorrectly() {
    Node strNode = Node.newString(Token.STRING_KEY, "k");
    Assert.assertFalse(strNode.isQuotedString());

    strNode.setQuotedString();
    Assert.assertTrue(strNode.isQuotedString());
  }

  @Test
  public void quotedString_givenBaseNode_shouldReturnFalseAndThrowOnSet() {
    Node baseNode = new Node(Token.BLOCK);
    Assert.assertFalse(baseNode.isQuotedString());

    try {
      baseNode.setQuotedString();
      Assert.fail("Expected IllegalStateException on setQuotedString on non-StringNode");
    } catch (IllegalStateException e) {
      // Expected
    }
  }

  @Test
  public void setType_givenNewType_shouldUpdateType() {
    Node node = new Node(Token.VAR);
    Assert.assertEquals(Token.VAR, node.getType());

    node.setType(Token.EXPR_RESULT);
    Assert.assertEquals(Token.EXPR_RESULT, node.getType());
  }

  @Test
  public void getChildBefore_givenTargetNode_shouldReturnPrecedingChildOrNull() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2, c3);

    Assert.assertNull(parent.getChildBefore(c1));
    Assert.assertSame(c1, parent.getChildBefore(c2));
    Assert.assertSame(c2, parent.getChildBefore(c3));
  }

  @Test(expected = RuntimeException.class)
  public void getChildBefore_givenNonChild_shouldThrowRuntimeException() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node foreign = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    parent.getChildBefore(foreign);
  }

  @Test
  public void getChildAtIndex_givenValidIndex_shouldReturnChild() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2, c3);

    Assert.assertSame(c1, parent.getChildAtIndex(0));
    Assert.assertSame(c2, parent.getChildAtIndex(1));
    Assert.assertSame(c3, parent.getChildAtIndex(2));
    Assert.assertNull(parent.getChildAtIndex(3));
  }

  @Test
  public void getIndexOfChild_givenChildOrNonChild_shouldReturnIndexOrMinusOne() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node foreign = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    Assert.assertEquals(0, parent.getIndexOfChild(c1));
    Assert.assertEquals(1, parent.getIndexOfChild(c2));
    Assert.assertEquals(-1, parent.getIndexOfChild(foreign));
    Assert.assertEquals(-1, parent.getIndexOfChild(null));
  }

  @Test
  public void getLastSibling_givenSingleOrChain_shouldReturnLastSibling() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    new Node(Token.BLOCK, c1, c2, c3);

    Assert.assertSame(c3, c1.getLastSibling());
    Assert.assertSame(c3, c2.getLastSibling());
    Assert.assertSame(c3, c3.getLastSibling());
  }

  @Test
  public void addChildToFront_givenEmptyOrNonEmptyParent_shouldInsertAtFront() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToFront(c1);

    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c1, parent.getLastChild());
    Assert.assertSame(parent, c1.getParent());

    Node c0 = new Node(Token.NAME);
    parent.addChildToFront(c0);
    Assert.assertSame(c0, parent.getFirstChild());
    Assert.assertSame(c1, parent.getLastChild());
    Assert.assertSame(c1, c0.getNext());
  }

  @Test(expected = IllegalArgumentException.class)
  public void addChildToFront_givenChildWithExistingParent_shouldThrowException() {
    Node parent1 = new Node(Token.BLOCK);
    Node child = new Node(Token.NAME);
    parent1.addChildToFront(child);

    Node parent2 = new Node(Token.BLOCK);
    parent2.addChildToFront(child);
  }

  @Test
  public void addChildToBack_givenEmptyOrNonEmptyParent_shouldAppendAtEnd() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c1, parent.getLastChild());

    Node c2 = new Node(Token.NAME);
    parent.addChildToBack(c2);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
    Assert.assertSame(c2, c1.getNext());
    Assert.assertNull(c2.getNext());
  }

  @Test
  public void addChildrenToFront_givenEmptyOrNonEmptyParent_shouldPrependAll() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    c1.next = c2;

    parent.addChildrenToFront(c1);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
    Assert.assertSame(parent, c1.getParent());
    Assert.assertSame(parent, c2.getParent());

    Node c0 = new Node(Token.NAME);
    parent.addChildrenToFront(c0);
    Assert.assertSame(c0, parent.getFirstChild());
    Assert.assertSame(c1, c0.getNext());
    Assert.assertSame(c2, parent.getLastChild());
  }

  @Test
  public void addChildrenToBack_givenExistingChildren_shouldAppendAll() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    c2.next = c3;

    parent.addChildrenToBack(c2);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c3, parent.getLastChild());
    Assert.assertSame(c2, c1.getNext());
    Assert.assertSame(c3, c2.getNext());
    Assert.assertSame(parent, c2.getParent());
    Assert.assertSame(parent, c3.getParent());
  }

  @Test
  public void addChildBefore_givenTargetIsFirstChild_shouldInsertAtFront() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node newChild = new Node(Token.NAME);
    parent.addChildBefore(newChild, c1);

    Assert.assertSame(newChild, parent.getFirstChild());
    Assert.assertSame(c1, parent.getLastChild());
    Assert.assertSame(c1, newChild.getNext());
  }

  @Test
  public void addChildBefore_givenTargetIsSubsequentChild_shouldInsertCorrectly() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    parent.addChildToBack(c1);
    parent.addChildToBack(c2);

    Node newChild = new Node(Token.NAME);
    parent.addChildBefore(newChild, c2);

    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(newChild, c1.getNext());
    Assert.assertSame(c2, newChild.getNext());
    Assert.assertSame(c2, parent.getLastChild());
  }

  @Test(expected = IllegalArgumentException.class)
  public void addChildBefore_givenNullTarget_shouldThrowException() {
    Node parent = new Node(Token.BLOCK);
    Node newChild = new Node(Token.NAME);
    parent.addChildBefore(newChild, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void addChildBefore_givenChildWithSiblings_shouldThrowException() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node n1 = new Node(Token.NAME);
    Node n2 = new Node(Token.NAME);
    n1.next = n2;

    parent.addChildBefore(n1, c1);
  }

  @Test
  public void addChildrenAfter_givenNullAnchorOnEmptyParent_shouldSetChildren() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    c1.next = c2;

    parent.addChildrenAfter(c1, null);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
  }

  @Test
  public void addChildrenAfter_givenNullAnchorOnNonEmptyParent_shouldInsertAtHead() {
    Node parent = new Node(Token.BLOCK);
    Node c3 = new Node(Token.NAME);
    parent.addChildToBack(c3);

    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    c1.next = c2;

    parent.addChildrenAfter(c1, null);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, c1.getNext());
    Assert.assertSame(c3, c2.getNext());
    Assert.assertSame(c3, parent.getLastChild());
  }

  @Test
  public void addChildrenAfter_givenAnchorIsLastChild_shouldUpdateLast() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    c2.next = c3;

    parent.addChildrenAfter(c2, c1);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c3, parent.getLastChild());
    Assert.assertSame(c2, c1.getNext());
    Assert.assertSame(c3, c2.getNext());
  }

  @Test
  public void addChildrenAfter_givenAnchorInMiddle_shouldSpliceCorrectly() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    Node c4 = new Node(Token.NAME);
    parent.addChildToBack(c1);
    parent.addChildToBack(c4);

    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    c2.next = c3;

    parent.addChildrenAfter(c2, c1);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, c1.getNext());
    Assert.assertSame(c3, c2.getNext());
    Assert.assertSame(c4, c3.getNext());
    Assert.assertSame(c4, parent.getLastChild());
  }

  @Test
  public void addChildAfter_givenChild_shouldDelegateCorrectly() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node c2 = new Node(Token.NAME);
    parent.addChildAfter(c2, c1);

    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
  }

  @Test(expected = IllegalArgumentException.class)
  public void addChildAfter_givenChildWithSiblings_shouldThrowException() {
    Node parent = new Node(Token.BLOCK);
    Node c1 = new Node(Token.NAME);
    parent.addChildToBack(c1);

    Node n1 = new Node(Token.NAME);
    Node n2 = new Node(Token.NAME);
    n1.next = n2;

    parent.addChildAfter(n1, c1);
  }

  @Test
  public void removeChild_givenFirstChild_shouldUpdateFirstChild() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    parent.removeChild(c1);
    Assert.assertSame(c2, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
    Assert.assertNull(c1.getParent());
    Assert.assertNull(c1.getNext());
  }

  @Test
  public void removeChild_givenLastChild_shouldUpdateLastChild() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    parent.removeChild(c2);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c1, parent.getLastChild());
    Assert.assertNull(c1.getNext());
    Assert.assertNull(c2.getParent());
    Assert.assertNull(c2.getNext());
  }

  @Test
  public void removeChild_givenMiddleChild_shouldRelinkSiblings() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node c3 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2, c3);

    parent.removeChild(c2);
    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(c3, parent.getLastChild());
    Assert.assertSame(c3, c1.getNext());
    Assert.assertNull(c2.getParent());
    Assert.assertNull(c2.getNext());
  }

  @Test
  public void replaceChild_givenFirstChild_shouldReplaceCorrectly() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    Node rep = new Node(Token.NAME);
    parent.replaceChild(c1, rep);

    Assert.assertSame(rep, parent.getFirstChild());
    Assert.assertSame(c2, parent.getLastChild());
    Assert.assertSame(c2, rep.getNext());
    Assert.assertNull(c1.getParent());
    Assert.assertNull(c1.getNext());
  }

  @Test
  public void replaceChild_givenLastChild_shouldReplaceAndSetLast() {
    Node c1 = new Node(Token.NAME);
    Node c2 = new Node(Token.NAME);
    Node parent = new Node(Token.BLOCK, c1, c2);

    Node rep = new Node(Token.NAME);
    parent.replaceChild(c2, rep);

    Assert.assertSame(c1, parent.getFirstChild());
    Assert.assertSame(rep, parent.getLastChild());
    Assert.assertSame(rep, c1.getNext());
    Assert.assertNull(rep.getNext());
    Assert.assertNull(c2.getParent());
    Assert.assertNull(c2.getNext());
  }

  @Test
  public void replaceChild_givenMiddleChild_shouldReplaceCorrectly() {
    Node c1 = new Node(Token.