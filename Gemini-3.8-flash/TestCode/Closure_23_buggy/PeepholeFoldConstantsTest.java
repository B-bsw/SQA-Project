package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants optimizer;

    @Before
    public void setUp() {
        optimizer = new PeepholeFoldConstants(false);
    }

    @Test
    public void testOptimizeSubtreeNew() {
        Node node = IR.newNode(Token.NEW, IR.name("Foo"));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testOptimizeSubtreeTypeof() {
        Node node = IR.typeof(IR.string("test"));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testOptimizeSubtreeNot() {
        Node node = new Node(Token.NOT, IR.number(0));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeNeg() {
        Node node = new Node(Token.NEG, IR.number(5));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeVoid() {
        Node child = IR.number(1);
        Node node = new Node(Token.VOID, child);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryGetProp() {
        Node left = IR.name("obj");
        Node right = IR.string("prop");
        Node node = new Node(Token.GETPROP, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryGetElem() {
        Node left = IR.name("arr");
        Node right = IR.number(0);
        Node node = new Node(Token.GETELEM, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryInstanceof() {
        Node left = IR.name("obj");
        Node right = IR.name("Type");
        Node node = new Node(Token.INSTANCEOF, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.INSTANCEOF, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryAndOr() {
        Node left = IR.trueNode();
        Node right = IR.falseNode();
        Node andNode = new Node(Token.AND, left, right);
        Node result = optimizer.optimizeSubtree(andNode);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());

        Node orNode = new Node(Token.OR, left, right);
        result = optimizer.optimizeSubtree(orNode);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryShift() {
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node node = new Node(Token.LSH, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryAdd() {
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryAddString() {
        Node left = IR.string("foo");
        Node right = IR.string("bar");
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("foobar", result.getString());
    }

    @Test
    public void testOptimizeSubtreeBinarySub() {
        Node left = IR.number(5);
        Node right = IR.number(3);
        Node node = new Node(Token.SUB, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryDiv() {
        Node left = IR.number(6);
        Node right = IR.number(3);
        Node node = new Node(Token.DIV, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryMod() {
        Node left = IR.number(7);
        Node right = IR.number(3);
        Node node = new Node(Token.MOD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryMul() {
        Node left = IR.number(3);
        Node right = IR.number(4);
        Node node = new Node(Token.MUL, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(12.0, result.getDouble(), 0.0);
    }

    @Test
    public void testOptimizeSubtreeBinaryComparison() {
        Node left = IR.number(5);
        Node right = IR.number(3);
        Node node = new Node(Token.GT, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryComparisonEq() {
        Node left = IR.number(5);
        Node right = IR.number(5);
        Node node = new Node(Token.EQ, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryComparisonNe() {
        Node left = IR.number(5);
        Node right = IR.number(3);
        Node node = new Node(Token.NE, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testOptimizeSubtreeBinaryComparisonUnknown() {
        Node left = IR.name("x");
        Node right = IR.name("y");
        Node node = new Node(Token.LT, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.LT, result.getType());
    }

    @Test
    public void testTryFoldGetPropName() {
        Node left = IR.name("obj");
        Node right = IR.string("prop");
        Node node = new Node(Token.GETPROP, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testTryFoldGetElemArrayIndex() {
        Node array = IR.arraylit(IR.number(1), IR.number(2), IR.number(3));
        Node index = IR.number(1);
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldGetElemOutOfBounds() {
        Node array = IR.arraylit(IR.number(1));
        Node index = IR.number(5);
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }

    @Test
    public void testTryFoldGetElemNegativeIndex() {
        Node array = IR.arraylit(IR.number(1));
        Node index = IR.number(-1);
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }

    @Test
    public void testTryFoldGetElemNonIntegerIndex() {
        Node array = IR.arraylit(IR.number(1));
        Node index = IR.number(1.5);
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.EMPTY, result.getType());
    }

    @Test
    public void testTryFoldTypeofString() {
        Node node = IR.typeof(IR.string("test"));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testTryFoldTypeofNumber() {
        Node node = IR.typeof(IR.number(123));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testTryFoldTypeofFunction() {
        Node function = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node node = IR.typeof(function);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("function", result.getString());
    }

    @Test
    public void testTryFoldTypeofUndefined() {
        Node node = IR.typeof(IR.name("undefined"));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testTryFoldTypeofUnknown() {
        Node node = IR.typeof(IR.name("x"));
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TYPEOF, result.getType());
    }

    @Test
    public void testTryFoldAddStringWithNumber() {
        Node left = IR.string("a");
        Node right = IR.number(1);
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a1", result.getString());
    }

    @Test
    public void testTryFoldAddNumberWithString() {
        Node left = IR.number(1);
        Node right = IR.string("a");
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("1a", result.getString());
    }

    @Test
    public void testTryFoldAddUnknown() {
        Node left = IR.name("x");
        Node right = IR.name("y");
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
    }

    @Test
    public void testTryFoldArithmeticOpDivByZero() {
        Node left = IR.number(1);
        Node right = IR.number(0);
        Node node = new Node(Token.DIV, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.POSITIVE_INFINITY, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldArithmeticOpModByZero() {
        Node left = IR.number(1);
        Node right = IR.number(0);
        Node node = new Node(Token.MOD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(Double.NaN, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldBitOpOutOfRange() {
        Node left = IR.number(4294967296.0);
        Node right = IR.number(1);
        Node node = new Node(Token.BITAND, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
    }

    @Test
    public void testTryFoldBitOpFractional() {
        Node left = IR.number(1.5);
        Node right = IR.number(1);
        Node node = new Node(Token.BITAND, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldShiftLeft() {
        Node left = IR.number(1);
        Node right = IR.number(2);
        Node node = new Node(Token.LSH, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(4.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldShiftRight() {
        Node left = IR.number(8);
        Node right = IR.number(2);
        Node node = new Node(Token.RSH, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldShiftRightUnsigned() {
        Node left = IR.number(-8);
        Node right = IR.number(2);
        Node node = new Node(Token.URSH, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1073741822.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldComparisonEQNull() {
        Node left = IR.name("x");
        Node right = IR.nullNode();
        Node node = new Node(Token.EQ, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.EQ, result.getType());
    }

    @Test
    public void testTryFoldComparisonUndefined() {
        Node left = IR.name("undefined");
        Node right = IR.name("x");
        Node node = new Node(Token.EQ, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.EQ, result.getType());
    }

    @Test
    public void testTryFoldComparisonSame() {
        Node left = IR.name("x");
        Node right = IR.name("x");
        Node node = new Node(Token.SHEQ, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparisonNotSame() {
        Node left = IR.name("x");
        Node right = IR.name("y");
        Node node = new Node(Token.SHNE, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testTryFoldComparisonUndefinedInvalid() {
        Node left = IR.name("x");
        Node right = IR.name("undefined");
        Node node = new Node(Token.LT, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.LT, result.getType());
    }

    @Test
    public void testTryFoldCtorCall() {
        Node callee = IR.name("Array");
        Node node = new Node(Token.NEW, callee);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NEW, result.getType());
    }

    @Test
    public void testTryFoldObjectPropAccess() {
        Node objLit = IR.objectlit();
        Node key = IR.string("a");
        Node value = IR.number(1);
        objLit.addChildToBack(IR.stringKey("a", value));
        Node node = new Node(Token.GETPROP, objLit, key);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldObjectPropAccessGetter() {
        Node objLit = IR.objectlit();
        Node key = IR.string("a");
        Node value = IR.function(IR.name(""), IR.paramList(), IR.block());
        objLit.addChildToBack(IR.getterDef("a", value));
        Node node = new Node(Token.GETPROP, objLit, key);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testTryFoldObjectPropAccessSetter() {
        Node objLit = IR.objectlit();
        Node key = IR.string("a");
        Node value = IR.function(IR.name(""), IR.paramList(), IR.block());
        objLit.addChildToBack(IR.setterDef("a", value));
        Node node = new Node(Token.GETPROP, objLit, key);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testTryFoldObjectPropAccessNotFound() {
        Node objLit = IR.objectlit();
        Node key = IR.string("b");
        objLit.addChildToBack(IR.stringKey("a", IR.number(1)));
        Node node = new Node(Token.GETPROP, objLit, key);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETPROP, result.getType());
    }

    @Test
    public void testTryFoldGetElemObjectLit() {
        Node objLit = IR.objectlit();
        objLit.addChildToBack(IR.stringKey("a", IR.number(1)));
        Node index = IR.string("a");
        Node node = new Node(Token.GETELEM, objLit, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 0.0);
    }

    @Test
    public void testTryFoldObjectLitGetter() {
        Node objLit = IR.objectlit();
        Node getter = IR.getterDef("a", IR.function(IR.name(""), IR.paramList(), IR.block()));
        objLit.addChildToBack(getter);
        Node result = optimizer.optimizeSubtree(objLit);
        assertNotNull(result);
        assertEquals(Token.OBJECTLIT, result.getType());
    }

    @Test
    public void testTryFoldArrayAccessNonInteger() {
        Node array = IR.arraylit(IR.number(1));
        Node index = IR.string("0");
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }

    @Test
    public void testTryFoldArrayAccessNonConst() {
        Node array = IR.arraylit(IR.name("x"));
        Node index = IR.number(0);
        Node node = new Node(Token.GETELEM, array, index);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.GETELEM, result.getType());
    }

    @Test
    public void testTryFoldAndOrLeftFalse() {
        Node left = IR.falseNode();
        Node right = IR.name("x");
        Node node = new Node(Token.AND, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testTryFoldAndOrLeftTrue() {
        Node left = IR.trueNode();
        Node right = IR.name("x");
        Node node = new Node(Token.AND, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
    }

    @Test
    public void testTryFoldAndOrRightFalse() {
        Node left = IR.name("x");
        Node right = IR.falseNode();
        Node node = new Node(Token.OR, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.NAME, result.getType());
    }

    @Test
    public void testTryFoldInstanceofUnknown() {
        Node left = IR.name("x");
        Node right = IR.name("y");
        Node node = new Node(Token.INSTANCEOF, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.INSTANCEOF, result.getType());
    }

    @Test
    public void testTryFoldStringConcatEmpty() {
        Node left = IR.string("");
        Node right = IR.string("abc");
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("abc", result.getString());
    }

    @Test
    public void testTryFoldStringConcatWithUndefined() {
        Node left = IR.string("a");
        Node right = IR.name("undefined");
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.STRING, result.getType());
        assertEquals("aundefined", result.getString());
    }

    @Test
    public void testTryFoldBitOpWithLiteralRight() {
        Node left = IR.name("x");
        Node right = IR.number(1);
        Node node = new Node(Token.BITAND, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.BITAND, result.getType());
    }

    @Test
    public void testTryFoldWithSideEffects() {
        Node left = new Node(Token.ASSIGN, IR.name("x"), IR.number(1));
        Node right = IR.number(2);
        Node node = new Node(Token.ADD, left, right);
        Node result = optimizer.optimizeSubtree(node);
        assertNotNull(result);
        assertEquals(Token.ADD, result.getType());
    }
}