package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CodeGeneratorTest {
    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    @Test
    public void testAddNumber_NaN() {
        Node numberNode = Node.newNumber(Double.NaN);
        generator.add(numberNode);
        assertEquals("NaN", consumer.getCode());
    }

    @Test
    public void testAddNumber_Infinity() {
        Node numberNode = Node.newNumber(Double.POSITIVE_INFINITY);
        generator.add(numberNode);
        assertEquals("Infinity", consumer.getCode());
    }

    @Test
    public void testAddName_SimpleIdentifier() {
        Node nameNode = Node.newString(Token.NAME, "testVar");
        generator.add(nameNode);
        assertEquals("testVar", consumer.getCode());
    }

    @Test
    public void testAddName_WithSpacesAndSpecialChars() {
        Node nameNode = Node.newString(Token.NAME, "test Var$");
        generator.add(nameNode);
        assertEquals("test$Var$$", consumer.getCode());
    }

    @Test
    public void testAddString_WithQuotes() {
        Node stringNode = Node.newString(Token.STRING, "hello\"world'");
        generator.add(stringNode);
        assertEquals("\"hello\\\"world\\'\"", consumer.getCode());
    }

    @Test
    public void testAddString_NullCharsetEncoder() {
        Node stringNode = Node.newString(Token.STRING, "unicode\u00e9");
        CodeGenerator gen = new CodeGenerator(consumer, StandardCharsets.US_ASCII);
        gen.add(stringNode);
        assertEquals("\"unicode\\u00e9\"", consumer.getCode());
    }

    @Test
    public void testAddExpression_WithVar() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, "x");
        nameNode.addChildToBack(Node.newNumber(5));
        varNode.addChildToBack(nameNode);
        generator.add(varNode);
        assertEquals("var x=5", consumer.getCode());
    }

    @Test
    public void testAddExpression_NullFirstChild() {
        Node varNode = new Node(Token.VAR);
        generator.add(varNode);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddExpression_ComplexAssignment() {
        Node assignNode = new Node(Token.ASSIGN);
        Node nameNode = Node.newString(Token.NAME, "a");
        Node valueNode = Node.newNumber(10);
        assignNode.addChildToBack(nameNode);
        assignNode.addChildToBack(valueNode);
        generator.add(assignNode, CodeGenerator.Context.OTHER);
        assertEquals("a=10", consumer.getCode());
    }

    @Test
    public void testAddBinaryOperator_Add() {
        Node addNode = new Node(Token.ADD);
        addNode.addChildToBack(Node.newNumber(1));
        addNode.addChildToBack(Node.newNumber(2));
        generator.add(addNode, CodeGenerator.Context.OTHER);
        assertEquals("1+2", consumer.getCode());
    }

    @Test
    public void testAddBinaryOperator_Subtract() {
        Node subNode = new Node(Token.SUB);
        subNode.addChildToBack(Node.newNumber(5));
        subNode.addChildToBack(Node.newNumber(3));
        generator.add(subNode, CodeGenerator.Context.OTHER);
        assertEquals("5-3", consumer.getCode());
    }

    @Test
    public void testAddCall_WithFunctionName() {
        Node callNode = new Node(Token.CALL);
        Node nameNode = Node.newString(Token.NAME, "foo");
        callNode.addChildToBack(nameNode);
        callNode.addChildToBack(Node.newNumber(42));
        generator.add(callNode, CodeGenerator.Context.OTHER);
        assertEquals("foo(42)", consumer.getCode());
    }

    @Test
    public void testAddCall_IndirectEval() {
        Node callNode = new Node(Token.CALL);
        Node nameNode = Node.newString(Token.NAME, "eval");
        callNode.addChildToBack(nameNode);
        callNode.addChildToBack(Node.newNumber(1));
        generator.add(callNode, CodeGenerator.Context.OTHER);
        assertEquals("eval(1)", consumer.getCode());
    }

    @Test
    public void testAddStringEscape_Newline() {
        Node stringNode = Node.newString(Token.STRING, "line1\nline2");
        generator.add(stringNode);
        assertEquals("\"line1\\nline2\"", consumer.getCode());
    }

    @Test
    public void testAddStringEscape_Tab() {
        Node stringNode = Node.newString(Token.STRING, "tab\there");
        generator.add(stringNode);
        assertEquals("\"tab\\there\"", consumer.getCode());
    }

    @Test
    public void testAddStringEscape_SingleQuote() {
        Node stringNode = Node.newString(Token.STRING, "it's");
        generator.add(stringNode);
        assertEquals("\"it's\"", consumer.getCode());
    }

    @Test
    public void testAddStringEscape_NullCharset() {
        CodeGenerator gen = new CodeGenerator(consumer);
        Node stringNode = Node.newString(Token.STRING, "test\u0000");
        gen.add(stringNode);
        assertEquals("\"test\\u0000\"", consumer.getCode());
    }

    @Test
    public void testAddRegexp_Pattern() {
        Node regexpNode = new Node(Token.REGEXP);
        regexpNode.addChildToBack(Node.newString(Token.STRING, "ab+c"));
        regexpNode.addChildToBack(Node.newString(Token.STRING, "gi"));
        generator.add(regexpNode, CodeGenerator.Context.OTHER);
        assertTrue(consumer.getCode().contains("ab+c"));
    }

    @Test
    public void testAddFunction_NeedsParens() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, "f");
        nameNode.addChildToBack(new Node(Token.PARAM_LIST));
        Node bodyNode = new Node(Token.BLOCK);
        bodyNode.addChildToBack(new Node(Token.EMPTY));
        functionNode.addChildToBack(nameNode);
        functionNode.addChildToBack(bodyNode);
        generator.add(functionNode, CodeGenerator.Context.START_OF_EXPR);
        assertTrue(consumer.getCode().contains("function f()"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_NullConsumer() {
        new CodeGenerator(null);
    }

    @Test
    public void testAddObjectLiteral_Simple() {
        Node objectNode = new Node(Token.OBJECTLIT);
        Node keyNode = Node.newString(Token.STRING, "key");
        Node valueNode = Node.newNumber(1);
        objectNode.addChildToBack(keyNode);
        objectNode.addChildToBack(valueNode);
        generator.add(objectNode, CodeGenerator.Context.OTHER);
        assertEquals("\"key\":1", consumer.getCode());
    }

    @Test
    public void testAddBinaryOperator_WithDivision() {
        Node divNode = new Node(Token.DIV);
        divNode.addChildToBack(Node.newNumber(10));
        divNode.addChildToBack(Node.newNumber(2));
        generator.add(divNode, CodeGenerator.Context.OTHER);
        assertEquals("10/2", consumer.getCode());
    }

    @Test
    public void testAddGetProp_Simple() {
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(Node.newString(Token.NAME, "a"));
        getPropNode.addChildToBack(Node.newString(Token.STRING, "b"));
        generator.add(getPropNode, CodeGenerator.Context.OTHER);
        assertEquals("a.b", consumer.getCode());
    }

    @Test
    public void testAddGetElem_Simple() {
        Node getElemNode = new Node(Token.GETELEM);
        getElemNode.addChildToBack(Node.newString(Token.NAME, "a"));
        getElemNode.addChildToBack(Node.newNumber(0));
        generator.add(getElemNode, CodeGenerator.Context.OTHER);
        assertEquals("a[0]", consumer.getCode());
    }

    @Test
    public void testAddIf_WithoutElse() {
        Node ifNode = new Node(Token.IF);
        Node condNode = Node.newString(Token.NAME, "x");
        Node thenNode = new Node(Token.BLOCK);
        ifNode.addChildToBack(condNode);
        thenNode.addChildToBack(Node.newString(Token.NAME, "y"));
        ifNode.addChildToBack(thenNode);
        generator.add(ifNode, CodeGenerator.Context.OTHER);
        assertEquals("if(x)", consumer.getCode());
    }

    @Test
    public void testAddIf_WithElse() {
        Node ifNode = new Node(Token.IF);
        Node condNode = Node.newString(Token.NAME, "x");
        Node thenNode = new Node(Token.BLOCK);
        Node elseNode = new Node(Token.BLOCK);
        ifNode.addChildToBack(condNode);
        thenNode.addChildToBack(Node.newString(Token.NUMBER, "1"));
        ifNode.addChildToBack(thenNode);
        elseNode.addChildToBack(Node.newString(Token.NUMBER, "2"));
        ifNode.addChildToBack(elseNode);
        generator.add(ifNode, CodeGenerator.Context.OTHER);
        assertEquals("if(x)", consumer.getCode());
    }

    @Test
    public void testAddNew_Constructor() {
        Node newNode = new Node(Token.NEW);
        Node nameNode = Node.newString(Token.NAME, "Foo");
        newNode.addChildToBack(nameNode);
        newNode.addChildToBack(Node.newNumber(1));
        generator.add(newNode, CodeGenerator.Context.OTHER);
        assertEquals("new Foo(1)", consumer.getCode());
    }

    @Test
    public void testAddUnary_Not() {
        Node notNode = new Node(Token.NOT);
        notNode.addChildToBack(Node.newString(Token.NAME, "x"));
        generator.add(notNode, CodeGenerator.Context.OTHER);
        assertEquals("!x", consumer.getCode());
    }

    @Test
    public void testAddNegate_Number() {
        Node negNode = new Node(Token.NEG);
        negNode.addChildToBack(Node.newNumber(5));
        generator.add(negNode, CodeGenerator.Context.OTHER);
        assertEquals("-5", consumer.getCode());
    }

    @Test
    public void testAddNull() {
        Node nullNode = new Node(Token.NULL);
        generator.add(nullNode);
        assertEquals("null", consumer.getCode());
    }

    @Test
    public void testAddThis() {
        Node thisNode = new Node(Token.THIS);
        generator.add(thisNode);
        assertEquals("this", consumer.getCode());
    }

    @Test
    public void testAddBoolean() {
        Node trueNode = new Node(Token.TRUE);
        generator.add(trueNode);
        assertEquals("true", consumer.getCode());
    }

    @Test
    public void testAddSimpleStringEscape_WithNonLatin() {
        Node stringNode = Node.newString(Token.STRING, "héllo");
        CodeGenerator gen = new CodeGenerator(consumer, StandardCharsets.UTF_8);
        gen.add(stringNode);
        assertEquals("\"héllo\"", consumer.getCode());
    }

    @Test
    public void testAddVar_WithMultipleNames() {
        Node varNode = new Node(Token.VAR);
        Node name1 = Node.newString(Token.NAME, "a");
        name1.addChildToBack(Node.newNumber(1));
        Node name2 = Node.newString(Token.NAME, "b");
        name2.addChildToBack(Node.newNumber(2));
        varNode.addChildToBack(name1);
        varNode.addChildToBack(name2);
        generator.add(varNode);
        assertEquals("var a=1,b=2", consumer.getCode());
    }

    @Test
    public void testAddHook_Ternary() {
        Node hookNode = new Node(Token.HOOK);
        hookNode.addChildToBack(Node.newString(Token.NAME, "cond"));
        hookNode.addChildToBack(Node.newString(Token.NAME, "true"));
        hookNode.addChildToBack(Node.newString(Token.NAME, "false"));
        generator.add(hookNode, CodeGenerator.Context.OTHER);
        assertTrue(consumer.getCode().contains("?"));
    }

    @Test
    public void testAddBlock_Empty() {
        Node blockNode = new Node(Token.BLOCK);
        generator.add(blockNode, CodeGenerator.Context.OTHER);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testAddScript_Statements() {
        Node scriptNode = new Node(Token.SCRIPT);
        Node exprNode = new Node(Token.EXPR_RESULT);
        exprNode.addChildToBack(Node.newString(Token.NAME, "x"));
        scriptNode.addChildToBack(exprNode);
        generator.add(scriptNode, CodeGenerator.Context.OTHER);
        assertEquals("x", consumer.getCode());
    }

    @Test
    public void testAddGet_Getter() {
        Node getNode = new Node(Token.GET);
        Node nameNode = Node.newString(Token.NAME, "prop");
        Node fnNode = new Node(Token.FUNCTION);
        getNode.addChildToBack(fnNode);
        getNode.addChildToBack(nameNode);
        generator.add(getNode, CodeGenerator.Context.OTHER);
        assertTrue(consumer.getCode().contains("get"));
    }

    @Test
    public void testAddSet_Setter() {
        Node setNode = new Node(Token.SET);
        Node nameNode = Node.newString(Token.NAME, "prop");
        Node fnNode = new Node(Token.FUNCTION);
        setNode.addChildToBack(fnNode);
        setNode.addChildToBack(nameNode);
        generator.add(setNode, CodeGenerator.Context.OTHER);
        assertTrue(consumer.getCode().contains("set"));
    }

    @Test
    public void testAddDelProp() {
        Node delNode = new Node(Token.DELPROP);
        Node nameNode = Node.newString(Token.NAME, "x");
        delNode.addChildToBack(nameNode);
        generator.add(delNode, CodeGenerator.Context.OTHER);
        assertEquals("delete x", consumer.getCode());
    }

    @Test
    public void testAddThrow() {
        Node throwNode = new Node(Token.THROW);
        throwNode.addChildToBack(Node.newString(Token.NAME, "err"));
        generator.add(throwNode);
        assertEquals("throw err", consumer.getCode());
    }

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder code = new StringBuilder();

        @Override
        void add(String str) {
            code.append(str);
        }

        @Override
        void addIdentifier(String identifier) {
            code.append(identifier);
        }

        @Override
        void addOp(String op, boolean binOp) {
            code.append(op);
        }

        @Override
        void addNumber(double x) {
            code.append(x);
        }

        @Override
        void beginBlock() {}
        @Override
        void endBlock() {}
        @Override
        void endStatement(boolean a) {}
        @Override
        void endFunction(boolean a) {}
        @Override
        void startSourceMapping(Node n) {}
        @Override
        void endSourceMapping(Node n) {}
        @Override
        void addRegexp(String regexp) {
            code.append(regexp);
        }
        @Override
        boolean continueProcessing() {
            return true;
        }

        String getCode() {
            return code.toString();
        }
    }
}