package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class PeepholeFoldConstantsTest {
    
    private PeepholeFoldConstants peepholeFoldConstants;
    private NodeFactory nodeFactory;
    
    private static class NodeFactory {
        Node createNumber(double value) {
            return Node.newNumber(value);
        }
        
        Node createString(String value) {
            return Node.newString(value);
        }
        
        Node createName(String name) {
            return Node.newString(Token.NAME, name);
        }
        
        Node createAdd(Node left, Node right) {
            Node node = new Node(Token.ADD);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createSub(Node left, Node right) {
            Node node = new Node(Token.SUB);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createMul(Node left, Node right) {
            Node node = new Node(Token.MUL);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createDiv(Node left, Node right) {
            Node node = new Node(Token.DIV);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createMod(Node left, Node right) {
            Node node = new Node(Token.MOD);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createBitAnd(Node left, Node right) {
            Node node = new Node(Token.BITAND);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createBitOr(Node left, Node right) {
            Node node = new Node(Token.BITOR);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createBitXor(Node left, Node right) {
            Node node = new Node(Token.BITXOR);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createLt(Node left, Node right) {
            Node node = new Node(Token.LT);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createGt(Node left, Node right) {
            Node node = new Node(Token.GT);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createLe(Node left, Node right) {
            Node node = new Node(Token.LE);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createGe(Node left, Node right) {
            Node node = new Node(Token.GE);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createEq(Node left, Node right) {
            Node node = new Node(Token.EQ);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createNe(Node left, Node right) {
            Node node = new Node(Token.NE);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createSheq(Node left, Node right) {
            Node node = new Node(Token.SHEQ);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createShne(Node left, Node right) {
            Node node = new Node(Token.SHNE);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createAnd(Node left, Node right) {
            Node node = new Node(Token.AND);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createOr(Node left, Node right) {
            Node node = new Node(Token.OR);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createNot(Node child) {
            Node node = new Node(Token.NOT);
            node.addChildToBack(child);
            return node;
        }
        
        Node createPos(Node child) {
            Node node = new Node(Token.POS);
            node.addChildToBack(child);
            return node;
        }
        
        Node createNeg(Node child) {
            Node node = new Node(Token.NEG);
            node.addChildToBack(child);
            return node;
        }
        
        Node createBitNot(Node child) {
            Node node = new Node(Token.BITNOT);
            node.addChildToBack(child);
            return node;
        }
        
        Node createVoid(Node child) {
            Node node = new Node(Token.VOID);
            node.addChildToBack(child);
            return node;
        }
        
        Node createTypeof(Node child) {
            Node node = new Node(Token.TYPEOF);
            node.addChildToBack(child);
            return node;
        }
        
        Node createNew(Node target) {
            Node node = new Node(Token.NEW);
            node.addChildToBack(target);
            return node;
        }
        
        Node createGetProp(Node target, String propName) {
            Node node = new Node(Token.GETPROP);
            node.addChildToBack(target);
            node.addChildToBack(createString(propName));
            return node;
        }
        
        Node createGetElem(Node target, Node index) {
            Node node = new Node(Token.GETELEM);
            node.addChildToBack(target);
            node.addChildToBack(index);
            return node;
        }
        
        Node createInstanceOf(Node left, Node right) {
            Node node = new Node(Token.INSTANCEOF);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createAssign(Node target, Node value) {
            Node node = new Node(Token.ASSIGN);
            node.addChildToBack(target);
            node.addChildToBack(value);
            return node;
        }
        
        Node createLsh(Node left, Node right) {
            Node node = new Node(Token.LSH);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createRsh(Node left, Node right) {
            Node node = new Node(Token.RSH);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
        
        Node createUrsh(Node left, Node right) {
            Node node = new Node(Token.URSH);
            node.addChildToBack(left);
            node.addChildToBack(right);
            return node;
        }
    }
    
    @Before
    public void setUp() {
        peepholeFoldConstants = new PeepholeFoldConstants();
        nodeFactory = new NodeFactory();
    }
    
    @Test
    public void testOptimizeSubtreeWithNullSubtree() {
        try {
            peepholeFoldConstants.optimizeSubtree(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testOptimizeSubtreeWithNumber() {
        Node numberNode = nodeFactory.createNumber(5.0);
        Node result = peepholeFoldConstants.optimizeSubtree(numberNode);
        assertSame(numberNode, result);
    }
    
    @Test
    public void testOptimizeSubtreeWithName() {
        Node nameNode = nodeFactory.createName("foo");
        Node result = peepholeFoldConstants.optimizeSubtree(nameNode);
        assertSame(nameNode, result);
    }
    
    @Test
    public void testFoldAddWithTwoNumbers() {
        Node left = nodeFactory.createNumber(2.0);
        Node right = nodeFactory.createNumber(3.0);
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldAddWithFractionalNumbers() {
        Node left = nodeFactory.createNumber(0.1);
        Node right = nodeFactory.createNumber(0.2);
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.30000000000000004, result.getDouble(), 0.0000000000000001);
    }
    
    @Test
    public void testFoldAddWithStringConcatenation() {
        Node left = nodeFactory.createString("Hello");
        Node right = nodeFactory.createString(" World");
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("Hello World", result.getString());
    }
    
    @Test
    public void testFoldAddWithNumberAndString() {
        Node left = nodeFactory.createNumber(5.0);
        Node right = nodeFactory.createString(" apples");
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("5 apples", result.getString());
    }
    
    @Test
    public void testFoldSubWithTwoNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(4.0);
        Node subNode = nodeFactory.createSub(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(subNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldMulWithTwoNumbers() {
        Node left = nodeFactory.createNumber(6.0);
        Node right = nodeFactory.createNumber(7.0);
        Node mulNode = nodeFactory.createMul(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(mulNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(42.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldDivWithTwoNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(2.0);
        Node divNode = nodeFactory.createDiv(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(divNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldDivByZero() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(0.0);
        Node divNode = nodeFactory.createDiv(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(divNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertTrue(Double.isInfinite(result.getDouble()));
    }
    
    @Test
    public void testFoldModWithZeroDivisor() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(0.0);
        Node modNode = nodeFactory.createMod(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(modNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertTrue(Double.isNaN(result.getDouble()));
    }
    
    @Test
    public void testFoldBitAndWithNumbers() {
        Node left = nodeFactory.createNumber(6.0);
        Node right = nodeFactory.createNumber(3.0);
        Node bitAndNode = nodeFactory.createBitAnd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(bitAndNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldBitOrWithNumbers() {
        Node left = nodeFactory.createNumber(6.0);
        Node right = nodeFactory.createNumber(3.0);
        Node bitOrNode = nodeFactory.createBitOr(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(bitOrNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldBitXorWithNumbers() {
        Node left = nodeFactory.createNumber(6.0);
        Node right = nodeFactory.createNumber(3.0);
        Node bitXorNode = nodeFactory.createBitXor(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(bitXorNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldLtWithNumbers() {
        Node left = nodeFactory.createNumber(5.0);
        Node right = nodeFactory.createNumber(10.0);
        Node ltNode = nodeFactory.createLt(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(ltNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldLtWithEqualNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(10.0);
        Node ltNode = nodeFactory.createLt(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(ltNode);
        
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldGtWithNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(5.0);
        Node gtNode = nodeFactory.createGt(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(gtNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldLeWithNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(10.0);
        Node leNode = nodeFactory.createLe(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(leNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldGeWithNumbers() {
        Node left = nodeFactory.createNumber(10.0);
        Node right = nodeFactory.createNumber(10.0);
        Node geNode = nodeFactory.createGe(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(geNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldEqWithSameNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(42.0);
        Node eqNode = nodeFactory.createEq(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(eqNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldEqWithDifferentNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(43.0);
        Node eqNode = nodeFactory.createEq(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(eqNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldNeWithSameNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(42.0);
        Node neNode = nodeFactory.createNe(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(neNode);
        
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldNeWithDifferentNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(43.0);
        Node neNode = nodeFactory.createNe(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(neNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldSheqWithSameNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(42.0);
        Node sheqNode = nodeFactory.createSheq(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(sheqNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldShneWithDifferentNumbers() {
        Node left = nodeFactory.createNumber(42.0);
        Node right = nodeFactory.createNumber(43.0);
        Node shneNode = nodeFactory.createShne(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(shneNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldAndWithFalseLeft() {
        Node left = nodeFactory.createName("false");
        Node right = nodeFactory.createNumber(5.0);
        Node andNode = nodeFactory.createAnd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(andNode);
        
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }
    
    @Test
    public void testFoldOrWithTrueLeft() {
        Node left = nodeFactory.createName("true");
        Node right = nodeFactory.createNumber(5.0);
        Node orNode = nodeFactory.createOr(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(orNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldNotWithFalseChild() {
        Node child = nodeFactory.createName("false");
        Node notNode = nodeFactory.createNot(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(notNode);
        
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }
    
    @Test
    public void testFoldPosWithNumber() {
        Node child = nodeFactory.createNumber(5.0);
        Node posNode = nodeFactory.createPos(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(posNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldNegWithNumber() {
        Node child = nodeFactory.createNumber(5.0);
        Node negNode = nodeFactory.createNeg(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(negNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldBitNotWithNumber() {
        Node child = nodeFactory.createNumber(5.0);
        Node bitNotNode = nodeFactory.createBitNot(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(bitNotNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-6.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldVoidWithNumber() {
        Node child = nodeFactory.createNumber(5.0);
        Node voidNode = nodeFactory.createVoid(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(voidNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.NaN, result.getDouble(), 0.001);
    }
    
    @Test
    public void testFoldTypeofWithNumber() {
        Node child = nodeFactory.createNumber(5.0);
        Node typeofNode = nodeFactory.createTypeof(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }
    
    @Test
    public void testFoldNewWithNonConstructor() {
        Node target = nodeFactory.createName("foo");
        Node newNode = nodeFactory.createNew(target);
        
        Node result = peepholeFoldConstants.optimizeSubtree(newNode);
        
        assertSame(newNode, result);
    }
    
    @Test
    public void testFoldGetPropWithNonLiteralTarget() {
        Node target = nodeFactory.createName("foo");
        Node getPropNode = nodeFactory.createGetProp(target, "bar");
        
        Node result = peepholeFoldConstants.optimizeSubtree(getPropNode);
        
        assertSame(getPropNode, result);
    }
    
    @Test
    public void testShiftWithZeroAmount() {
        Node left = nodeFactory.createNumber(5.0);
        Node right = nodeFactory.createNumber(0.0);
        Node lshNode = nodeFactory.createLsh(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(lshNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testShiftWithLargeAmount() {
        Node left = nodeFactory.createNumber(5.0);
        Node right = nodeFactory.createNumber(32.0);
        Node lshNode = nodeFactory.createLsh(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(lshNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
    }
    
    @Test
    public void testUnaryOperationsWithNonNumber() {
        Node child = nodeFactory.createName("foo");
        Node negNode = nodeFactory.createNeg(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(negNode);
        
        assertSame(negNode, result);
    }
    
    @Test
    public void testBinaryOperationWithNonNumberOperands() {
        Node left = nodeFactory.createName("foo");
        Node right = nodeFactory.createNumber(5.0);
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertSame(addNode, result);
    }
    
    @Test
    public void testAddStringWithEmptyString() {
        Node left = nodeFactory.createString("");
        Node right = nodeFactory.createString("foo");
        Node addNode = nodeFactory.createAdd(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(addNode);
        
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("foo", result.getString());
    }
    
    @Test
    public void testGetElemWithNumberIndex() {
        Node array = nodeFactory.createName("arr");
        Node index = nodeFactory.createNumber(0.0);
        Node getElemNode = nodeFactory.createGetElem(array, index);
        
        Node result = peepholeFoldConstants.optimizeSubtree(getElemNode);
        
        assertSame(getElemNode, result);
    }
    
    @Test
    public void testInstanceOfWithNonConstructor() {
        Node left = nodeFactory.createNumber(5.0);
        Node right = nodeFactory.createName("Foo");
        Node instanceofNode = nodeFactory.createInstanceOf(left, right);
        
        Node result = peepholeFoldConstants.optimizeSubtree(instanceofNode);
        
        assertSame(instanceofNode, result);
    }
    
    @Test
    public void testAssignWithNoSideEffects() {
        Node target = nodeFactory.createName("foo");
        Node value = nodeFactory.createNumber(5.0);
        Node assignNode = nodeFactory.createAssign(target, value);
        
        Node result = peepholeFoldConstants.optimizeSubtree(assignNode);
        
        assertSame(assignNode, result);
    }
    
    @Test
    public void testVoidWithZero() {
        Node child = nodeFactory.createNumber(0.0);
        Node voidNode = nodeFactory.createVoid(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(voidNode);
        
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0.001);
    }
    
    @Test
    public void testTypeofWithNameUndefined() {
        Node child = nodeFactory.createName("undefined");
        Node typeofNode = nodeFactory.createTypeof(child);
        
        Node result = peepholeFoldConstants.optimizeSubtree(typeofNode);
        
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }
}