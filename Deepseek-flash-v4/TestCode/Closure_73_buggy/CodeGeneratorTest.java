package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@RunWith(JUnit4.class)
public class CodeGeneratorTest {

    private StringWriter writer;
    private CodeGenerator generator;
    private CodeConsumer consumer;

    @Before
    public void setUp() {
        writer = new StringWriter();
        consumer = new CodeConsumer(writer);
        generator = new CodeGenerator(consumer);
    }

    // ========== Helper Methods ==========
    private String generate(Node node) {
        generator.add(node);
        return writer.toString();
    }

    private Node createNumber(double value) {
        return Node.newNumber(value);
    }

    private Node createName(String name) {
        return Node.newString(Token.NAME, name);
    }

    private Node createString(String str) {
        return Node.newString(str);
    }

    private Node createBinary(int type, Node left, Node right) {
        Node node = new Node(type);
        node.addChildToBack(left);
        node.addChildToBack(right);
        return node;
    }

    private Node createVar(Node nameNode, Node valueNode) {
        Node varNode = new Node(Token.VAR);
        Node assignNode = new Node(Token.NAME);
        assignNode.setString(nameNode.getString());
        assignNode.addChildToBack(valueNode);
        varNode.addChildToBack(assignNode);
        return varNode;
    }

    // ========== Test Cases ==========
    @Test
    public void testNumberAddition() {
        Node node = createBinary(Token.ADD, createNumber(1), createNumber(2));
        assertEquals("1+2", generate(node));
    }

    @Test
    public void testNumberWithDecimal() {
        assertEquals("1.5", generate(createNumber(1.5)));
    }

    @Test
    public void testNumberZero() {
        assertEquals("0", generate(createNumber(0)));
    }

    @Test
    public void testNegativeNumber() {
        Node negNode = new Node(Token.NEG);
        negNode.addChildToBack(createNumber(5));
        assertEquals("-5", generate(negNode));
    }

    @Test
    public void testNegativeNumberAsNumber() {
        Node negNode = new Node(Token.NEG);
        negNode.addChildToBack(createNumber(5));
        negNode.getFirstChild().setDouble(-5);
        assertEquals("-5", generate(negNode));
    }

    @Test
    public void testStringGeneration() {
        assertEquals("test", generate(createString("test")));
    }

    @Test
    public void testStringWithQuote() {
        Node strNode = createString("it's");
        assertEquals("\"it's\"", generate(strNode));
    }

    @Test
    public void testStringWithDoubleQuote() {
        Node strNode = createString("say \"hi\"");
        assertEquals("\"say \\\"hi\\\"\"", generate(strNode));
    }

    @Test
    public void testVarDeclaration() {
        Node nameNode = createName("x");
        Node valueNode = createNumber(10);
        Node varNode = createVar(nameNode, valueNode);
        assertEquals("var x=10", generate(varNode));
    }

    @Test
    public void testVarNoValue() {
        Node nameNode = createName("y");
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(nameNode);
        assertEquals("var y", generate(varNode));
    }

    @Test
    public void testName() {
        assertEquals("foo", generate(createName("foo")));
    }

    @Test
    public void testComparisonBinary() {
        Node left = createName("a");
        Node right = createName("b");
        Node node = createBinary(Token.EQ, left, right);
        assertEquals("a==b", generate(node));
    }

    @Test
    public void testAssociativeWithSameType() {
        Node a = createNumber(1);
        Node b = createNumber(2);
        Node c = createNumber(3);
        Node ab = createBinary(Token.ADD, a, b);
        Node abc = createBinary(Token.ADD, ab, c);
        assertEquals("1+2+3", generate(abc));
    }

    @Test(expected =  AssertionError.class)
    public void testInvalidBinaryOperator() {
        Node node = createBinary(Token.ADD, createNumber(1), createNumber(2));
        node.addChildToBack(createNumber(3));
        generator.add(node);
    }

    @Test
    public void testGetProp() {
        Node obj = createName("obj");
        Node prop = createName("prop");
        Node getProp = new Node(Token.GETPROP, obj, prop);
        assertEquals("obj.prop", generate(getProp));
    }

    @Test(expected = AssertionError.class)
    public void testGetPropInvalid() {
        Node obj = createName("obj");
        Node getProp = new Node(Token.GETPROP, obj);
        generator.add(getProp);
    }

    @Test
    public void testGetElem() {
        Node obj = createName("arr");
        Node index = createNumber(0);
        Node getElem = new Node(Token.GETELEM, obj, index);
        assertEquals("arr[0]", generate(getElem));
    }

    @Test
    public void testGetElemInvalidChildCount() {
        Node obj = createName("arr");
        Node getElem = new Node(Token.GETELEM, obj);
        try {
            generator.add(getElem);
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            // expected
        }
    }

    @Test
    public void testCall() {
        Node func = createName("func");
        Node call = new Node(Token.CALL, func);
        assertEquals("func()", generate(call));
    }

    @Test
    public void testCallWithArgs() {
        Node func = createName("func");
        Node arg1 = createNumber(1);
        Node call = new Node(Token.CALL, func, arg1);
        assertEquals("func(1)", generate(call));
    }

    @Test
    public void testNull() {
        Node nullNode = new Node(Token.NULL);
        assertEquals("null", generate(nullNode));
    }

    @Test
    public void testThis() {
        Node thisNode = new Node(Token.THIS);
        assertEquals("this", generate(thisNode));
    }

    @Test
    public void testTrue() {
        Node trueNode = new Node(Token.TRUE);
        assertEquals("true", generate(trueNode));
    }

    @Test
    public void testFalse() {
        Node falseNode = new Node(Token.FALSE);
        assertEquals("false", generate(falseNode));
    }

    @Test
    public void testArrayLitEmpty() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        assertEquals("[]", generate(arrayLit));
    }

    @Test
    public void testArrayLitWithItems() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.addChildToBack(createNumber(1));
        arrayLit.addChildToBack(createNumber(2));
        assertEquals("[1,2]", generate(arrayLit));
    }

    @Test
    public void testArrayLitWithEmptySlot() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node empty = new Node(Token.EMPTY);
        arrayLit.addChildToBack(empty);
        arrayLit.addChildToBack(createNumber(1));
        assertEquals("[,1]", generate(arrayLit));
    }

    @Test
    public void testObjectLitEmpty() {
        Node objectLit = new Node(Token.OBJECTLIT);
        assertEquals("{}", generate(objectLit));
    }

    @Test
    public void testObjectLitWithProperty() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node key = createString("key");
        Node value = createNumber(1);
        Node prop = new Node(Token.STRING_KEY, key, value);
        objectLit.addChildToBack(prop);
        assertEquals("{key:1}", generate(objectLit));
    }

    @Test
    public void testIfWithElse() {
        Node ifNode = new Node(Token.IF);
        Node cond = createName("c");
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(thenBlock);
        ifNode.addChildToBack(elseBlock);
        String result = generate(ifNode);
        assertTrue(result.contains("if(c)"));
    }

    @Test
    public void testIfWithoutElse() {
        Node ifNode = new Node(Token.IF);
        Node cond = createName("c");
        Node thenBlock = new Node(Token.BLOCK);
        ifNode.addChildToBack(cond);
        ifNode.addChildToBack(thenBlock);
        String result = generate(ifNode);
        assertTrue(result.contains("if(c)"));
    }

    @Test
    public void testWhile() {
        Node whileNode = new Node(Token.WHILE);
        Node cond = createName("c");
        Node body = new Node(Token.BLOCK);
        whileNode.addChildToBack(cond);
        whileNode.addChildToBack(body);
        String result = generate(whileNode);
        assertTrue(result.contains("while(c)"));
    }

    @Test
    public void testReturnWithoutValue() {
        Node returnNode = new Node(Token.RETURN);
        String result = generate(returnNode);
        assertEquals("return;", result.trim());
    }

    @Test
    public void testReturnWithValue() {
        Node returnNode = new Node(Token.RETURN);
        returnNode.addChildToBack(createNumber(42));
        String result = generate(returnNode);
        assertEquals("return 42", result.trim());
    }

    @Test
    public void testThrow() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(createString("error"));
        String result = generate(throwNode);
        assertTrue(result.contains("throw"));
    }

    @Test
    public void testThrowNoExpression() {
        Node throwNode = new Node(Token.THROW);
        String result = generate(throwNode);
        assertTrue(result.contains("throw"));
    }

    @Test
    public void testBreak() {
        Node breakNode = new Node(Token.BREAK);
        String result = generate(breakNode);
        assertEquals("break", result.trim());
    }

    @Test
    public void testContinue() {
        Node continueNode = new Node(Token.CONTINUE);
        String result = generate(continueNode);
        assertEquals("continue", result.trim());
    }

    @Test
    public void testDebugger() {
        Node debuggerNode = new Node(Token.DEBUGGER);
        String result = generate(debuggerNode);
        assertEquals("debugger", result.trim());
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("'use strict';", writer.toString());
    }

    @Test
    public void testAddString() {
        generator.add("hello");
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testAddIdentifierSimple() {
        generator.add(createName("simple"));
        assertEquals("simple", writer.toString());
    }

    @Test
    public void testAddIdentifierWithSpecialChars() {
        Node name = createName("simple-name");
        generator.add(name);
        assertEquals("simple-name", writer.toString());
    }

    @Test
    public void testUnsupportedNodeType() {
        Node node = new Node(Token.EMPTY);
        try {
            generator.add(node);
            fail("Expected AssertionError");
        } catch (AssertionError e) {
            // expected
        }
    }

    @Test
    public void testNewWithNoArgs() {
        Node newNode = new Node(Token.NEW);
        Node func = createName("Foo");
        newNode.addChildToBack(func);
        String result = generate(newNode);
        assertEquals("new Foo", result);
    }

    @Test
    public void testNewWithArgs() {
        Node newExpr = new Node(Token.NEW);
        Node func = createName("Foo");
        newExpr.addChildToBack(func);
        newExpr.addChildToBack(createNumber(1));
        String result = generate(newExpr);
        assertTrue(result.contains("new Foo"));
    }

    @Test
    public void testObjectLitWithGetAccessor() {
        Node objectLit = new Node(Token.OBJECTLIT);
        Node getter = new Node(Token.GET);
        Node fn = new Node(Token.FUNCTION);
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node name = createName("prop");
        getter.addChildToBack(name);
        fn.addChildToBack(params);
        fn.addChildToBack(body);
        getter.addChildToBack(fn);
        objectLit.addChildToBack(getter);
        String result = generate(objectLit);
        assertTrue(result.contains("get prop"));
    }

    @Test
    public void testAddNumberNegativeZero() {
        Node num = Node.newNumber(-0.0);
        assertEquals("-0", generate(num));
    }

    @Test
    public void testStringEscapeNewline() {
        Node str = createString("a\nb");
        assertEquals("\"a\\nb\"", generate(str));
    }

    @Test
    public void testStringEscapeUnicode() {
        Node str = createString("caf\u00e9");
        assertEquals("\"caf\u00e9\"", generate(str));
    }
}