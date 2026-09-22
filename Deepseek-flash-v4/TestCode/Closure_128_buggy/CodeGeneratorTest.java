package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class CodeGeneratorTest {

    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder code = new StringBuilder();
        private boolean continueProcessing = true;
        private int endStatementCount = 0;

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
        void endStatement(boolean hasSemicolon) {
            endStatementCount++;
            if (hasSemicolon) {
                code.append(';');
            }
        }

        @Override
        void endStatement() {
            endStatementCount++;
        }

        @Override
        void startSourceMapping(Node n) {
            // no-op
        }

        @Override
        void endSourceMapping(Node n) {
            // no-op
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        @Override
        void addBreak() {
            code.append("BREAK");
        }

        @Override
        void addVar() {
            code.append("VAR ");
        }

        @Override
        void addIf() {
            code.append("if");
        }

        @Override
        void addElse() {
            code.append("else");
        }

        @Override
        void beginBlock() {
            code.append('{');
        }

        @Override
        void endBlock() {
            code.append('}');
        }

        @Override
        void beginCaseBody() {
            code.append("CASE_BODY");
        }

        @Override
        void endCaseBody() {
            code.append("END_CASE_BODY");
        }

        @Override
        void beginCaseExpression() {
            code.append("case ");
        }

        @Override
        void endCaseExpression() {
            code.append(": ");
        }

        @Override
        void beginSwitch() {
            code.append("switch(");
        }

        @Override
        void endSwitch() {
            code.append(")");
        }

        @Override
        void addReturn(boolean hasReturnValue) {
            code.append("return");
        }

        @Override
        void addThrow() {
            code.append("throw");
        }

        @Override
        void addCatch() {
            code.append("catch(");
        }

        @Override
        void endCatch() {
            code.append(")");
        }

        @Override
        void addFinally() {
            code.append("finally");
        }

        @Override
        void addTry() {
            code.append("try");
        }

        @Override
        void addDo() {
            code.append("do");
        }

        @Override
        void addWhile() {
            code.append("while");
        }

        @Override
        void addFor() {
            code.append("for");
        }

        @Override
        void addCaseBody() {
            code.append("CASE_BODY");
        }

        @Override
        void addDefaultCase() {
            code.append("default:");
        }

        @Override
        void addCase() {
            code.append("case ");
        }

        @Override
        void addLabel() {
            code.append("label:");
        }

        @Override
        void addFunctionName() {
            code.append("function ");
        }

        @Override
        void addParam() {
            code.append("param");
        }

        @Override
        void addThis() {
            code.append("this");
        }

        @Override
        void addRegExp(String regexp) {
            code.append(regexp);
        }

        @Override
        void addString(String s) {
            code.append('"').append(s).append('"');
        }

        @Override
        void addVarDecl(String name) {
            code.append("var ").append(name);
        }

        @Override
        void addNew() {
            code.append("new ");
        }

        @Override
        void addName(String name) {
            code.append(name);
        }

        @Override
        void addProperty(String prop) {
            code.append('.').append(prop);
        }

        @Override
        void addGetProp() {
            code.append("GETPROP");
        }

        @Override
        void addGetElem() {
            code.append("GETELEM");
        }

        @Override
        void addFunction() {
            code.append("function");
        }

        @Override
        void addObjectLit() {
            code.append("{");
        }

        @Override
        void endObjectLit() {
            code.append("}");
        }

        @Override
        void addComma() {
            code.append(",");
        }

        @Override
        void addSemi() {
            code.append(";");
        }

        @Override
        void addConditional(boolean isQuestion) {
            code.append(isQuestion ? "?" : ":");
        }

        @Override
        void addAssign() {
            code.append("=");
        }

        @Override
        void addOperator(String op) {
            code.append(op);
        }
    }

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = CodeGenerator.forCostEstimation(consumer);
    }

    @Test
    public void testConstructorForCostEstimation() {
        assertTrue(consumer != null);
    }

    @Test
    public void testTagAsStrict() {
        generator.tagAsStrict();
        assertEquals("", consumer.code.toString());
    }

    @Test
    public void testAddIdentifierEscapes() {
        generator.add("'" );
        generator.addIdentifier("test");
        assertEquals("'test", consumer.code.toString());
    }

    @Test
    public void testAddNumber() {
        Node numberNode = Node.newNumber(42.0);
        generator.add(numberNode);
        assertEquals("42.0", consumer.code.toString());
    }

    @Test
    public void testAddNumberNegative() {
        Node numberNode = Node.newNumber(-1.0);
        generator.add(numberNode);
        assertEquals("-1.0", consumer.code.toString());
    }

    @Test
    public void testAddName() {
        Node nameNode = Node.newString(Token.NAME, "x");
        generator.add(nameNode);
        assertEquals("x", consumer.code.toString());
    }

    @Test
    public void testAddStringEmpty() {
        Node stringNode = Node.newString(Token.STRING, "");
        generator.add(stringNode);
        assertEquals("\"\"", consumer.code.toString());
    }

    @Test
    public void testAddStringNormal() {
        Node stringNode = Node.newString(Token.STRING, "hello");
        generator.add(stringNode);
        assertEquals("\"hello\"", consumer.code.toString());
    }

    @Test
    public void testAddThis() {
        Node thisNode = new Node(Token.THIS);
        generator.add(thisNode);
        assertEquals("this", consumer.code.toString());
    }

    @Test
    public void testAddNull() {
        Node nullNode = new Node(Token.NULL);
        generator.add(nullNode);
        assertEquals("", consumer.code.toString());
    }

    @Test
    public void testAddTrue() {
        Node trueNode = new Node(Token.TRUE);
        generator.add(trueNode);
        assertEquals("true", consumer.code.toString());
    }

    @Test
    public void testAddFalse() {
        Node falseNode = new Node(Token.FALSE);
        generator.add(falseNode);
        assertEquals("false", consumer.code.toString());
    }

    @Test
    public void testAddVarEmptyName() {
        Node varNode = new Node(Token.VAR);
        generator.add(varNode);
        assertEquals("", consumer.code.toString());
    }

    @Test
    public void testAddVarWithName() {
        Node nameNode = Node.newString(Token.NAME, "a");
        Node varNode = new Node(Token.VAR, nameNode);
        generator.add(varNode);
        assertEquals("var a", consumer.code.toString());
    }

    @Test
    public void testAddReturnNoValue() {
        Node returnNode = new Node(Token.RETURN);
        generator.add(returnNode);
        assertEquals("return", consumer.code.toString());
    }

    @Test
    public void testAddReturnWithValue() {
        Node numberNode = Node.newNumber(1.0);
        Node returnNode = new Node(Token.RETURN, numberNode);
        generator.add(returnNode);
        assertEquals("return1.0", consumer.code.toString());
    }

    @Test
    public void testAddThrow() {
        Node nameNode = Node.newString(Token.NAME, "e");
        Node throwNode = new Node(Token.THROW, nameNode);
        generator.add(throwNode);
        assertEquals("throwe", consumer.code.toString());
    }

    @Test
    public void testAddBlockEmpty() {
        Node blockNode = new Node(Token.BLOCK);
        generator.add(blockNode);
        assertEquals("", consumer.code.toString());
    }

    @Test
    public void testAddBlockWithChildren() {
        Node nameNode1 = Node.newString(Token.NAME, "a");
        Node nameNode2 = Node.newString(Token.NAME, "b");
        Node blockNode = new Node(Token.BLOCK, nameNode1, nameNode2);
        generator.add(blockNode);
        assertEquals("ab", consumer.code.toString());
    }

    @Test
    public void testAddBinaryOperator() {
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(2.0);
        Node addNode = new Node(Token.ADD, left, right);
        generator.add(addNode);
        assertEquals("1.0+2.0", consumer.code.toString());
    }

    @Test
    public void testAddCommaOperator() {
        Node left = Node.newNumber(1.0);
        Node right = Node.newNumber(2.0);
        Node commaNode = new Node(Token.COMMA, left, right);
        generator.add(commaNode);
        assertEquals("1.0,2.0", consumer.code.toString());
    }

    @Test
    public void testUnrollBinaryOperator() {
        Node inner = new Node(Token.ADD, Node.newNumber(1.0), Node.newNumber(2.0));
        Node outer = new Node(Token.ADD, inner, Node.newNumber(3.0));
        generator.add(outer);
        assertEquals("1.0+2.0+3.0", consumer.code.toString());
    }

    @Test
    public void testStringEscape() {
        Node stringNode = Node.newString(Token.STRING, "line\nbreak");
        generator.add(stringNode);
        assertEquals("\"line\\nbreak\"", consumer.code.toString());
    }

    @Test
    public void testStringEscapeSingleQuote() {
        Node stringNode = Node.newString(Token.STRING, "it's");
        generator.add(stringNode);
        assertEquals("\"it's\"", consumer.code.toString());
    }

    @Test
    public void testStringEscapeDoubleQuote() {
        Node stringNode = Node.newString(Token.STRING, "a\"b");
        generator.add(stringNode);
        assertEquals("\"a\\\"b\"", consumer.code.toString());
    }

    @Test
    public void testStringEscapeBackslash() {
        Node stringNode = Node.newString(Token.STRING, "a\\b");
        generator.add(stringNode);
        assertEquals("\"a\\\\b\"", consumer.code.toString());
    }

    @Test
    public void testStringEscapeUnicode() {
        Node stringNode = Node.newString(Token.STRING, "\u2028");
        generator.add(stringNode);
        assertEquals("\"\\u2028\"", consumer.code.toString());
    }

    @Test
    public void testRegexpEscapeSimple() {
        Node regexpNode = Node.newString(Token.REGEXP, "/abc/");
        Node flagsNode = Node.newString("");
        Node regexp = new Node(Token.REGEXP, regexpNode, flagsNode);
        generator.add(regexp);
        assertEquals("/abc/", consumer.code.toString());
    }

    @Test
    public void testGetProp() {
        Node target = Node.newString(Token.NAME, "obj");
        Node propName = Node.newString("prop");
        Node getProp = new Node(Token.GETPROP, target, propName);
        generator.add(getProp);
        assertEquals("obj.prop", consumer.code.toString());
    }

    @Test
    public void testGetElem() {
        Node target = Node.newString(Token.NAME, "arr");
        Node index = Node.newNumber(0.0);
        Node getElem = new Node(Token.GETELEM, target, index);
        generator.add(getElem);
        assertEquals("arr[0.0]", consumer.code.toString());
    }

    @Test
    public void testCall() {
        Node callee = Node.newString(Token.NAME, "fn");
        Node arg1 = Node.newNumber(1.0);
        Node call = new Node(Token.CALL, callee, arg1);
        generator.add(call);
        assertEquals("fn(1.0)", consumer.code.toString());
    }

    @Test
    public void testNew() {
        Node callee = Node.newString(Token.NAME, "Foo");
        Node newExpr = new Node(Token.NEW, callee);
        generator.add(newExpr);
        assertEquals("new Foo", consumer.code.toString());
    }

    @Test
    public void testIfNoElse() {
        Node cond = Node.newString(Token.NAME, "x");
        Node thenBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, thenBlock);
        generator.add(ifNode);
        assertEquals("if(x)", consumer.code.toString());
    }

    @Test
    public void testIfWithElse() {
        Node cond = Node.newString(Token.NAME, "x");
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
        generator.add(ifNode);
        assertEquals("if(x)else", consumer.code.toString());
    }

    @Test
    public void testWhile() {
        Node cond = Node.newString(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, cond, body);
        generator.add(whileNode);
        assertEquals("while(x)", consumer.code.toString());
    }

    @Test
    public void testDoWhile() {
        Node body = new Node(Token.BLOCK);
        Node cond = Node.newString(Token.NAME, "x");
        Node doNode = new Node(Token.DO, body, cond);
        generator.add(doNode);
        assertEquals("dowhile(x)", consumer.code.toString());
    }

    @Test
    public void testFor() {
        Node init = new Node(Token.VAR);
        Node cond = Node.newString(Token.NAME, "i");
        Node inc = Node.newNumber(1.0);
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, init, cond, inc, body);
        generator.add(forNode);
        assertEquals("for(;i<1.0;)", consumer.code.toString());
    }

    @Test
    public void testSwitch() {
        Node cond = Node.newString(Token.NAME, "x");
        Node switchNode = new Node(Token.SWITCH, cond);
        generator.add(switchNode);
        assertEquals("switch(x)", consumer.code.toString());
    }

    @Test
    public void testBreak() {
        Node breakNode = new Node(Token.BREAK);
        generator.add(breakNode);
        assertEquals("break", consumer.code.toString());
    }

    @Test
    public void testContinue() {
        Node continueNode = new Node(Token.CONTINUE);
        generator.add(continueNode);
        assertEquals("continue", consumer.code.toString());
    }

    @Test
    public void testTypeOf() {
        Node arg = Node.newNumber(1.0);
        Node typeofNode = new Node(Token.TYPEOF, arg);
        generator.add(typeofNode);
        assertEquals("typeof 1.0", consumer.code.toString());
    }

    @Test
    public void testVoid() {
        Node arg = Node.newNumber(1.0);
        Node voidNode = new Node(Token.VOID, arg);
        generator.add(voidNode);
        assertEquals("void 1.0", consumer.code.toString());
    }

    @Test
    public void testNot() {
        Node arg = Node.newNumber(1.0);
        Node notNode = new Node(Token.NOT, arg);
        generator.add(notNode);
        assertEquals("!1.0", consumer.code.toString());
    }

    @Test
    public void testBitNot() {
        Node arg = Node.newNumber(1.0);
        Node bitNotNode = new Node(Token.BITNOT, arg);
        generator.add(bitNotNode);
        assertEquals("~1.0", consumer.code.toString());
    }

    @Test
    public void testPos() {
        Node arg = Node.newNumber(1.0);
        Node posNode = new Node(Token.POS, arg);
        generator.add(posNode);
        assertEquals("+1.0", consumer.code.toString());
    }

    @Test
    public void testNeg() {
        Node arg = Node.newNumber(1.0);
        Node negNode = new Node(Token.NEG, arg);
        generator.add(negNode);
        assertEquals("-1.0", consumer.code.toString());
    }

    @Test
    public void testNegNestedNumber() {
        Node arg = Node.newNumber(5.0);
        Node negNode = new Node(Token.NEG, arg);
        generator.add(negNode);
        assertEquals("-5.0", consumer.code.toString());
    }

    @Test
    public void testHook() {
        Node cond = Node.newString(Token.NAME, "a");
        Node ifTrue = Node.newString(Token.STRING, "yes");
        Node ifFalse = Node.newString(Token.STRING, "no");
        Node hookNode = new Node(Token.HOOK, cond, ifTrue, ifFalse);
        generator.add(hookNode);
        assertEquals("a?\"yes\":\"no\"", consumer.code.toString());
    }

    @Test
    public void testArrayLit() {
        Node elem1 = Node.newNumber(1.0);
        Node elem2 = Node.newNumber(2.0);
        Node arrayLit = new Node(Token.ARRAYLIT, elem1, elem2);
        generator.add(arrayLit);
        assertEquals("[1.0,2.0]", consumer.code.toString());
    }

    @Test
    public void testParamList() {
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        Node paramList = new Node(Token.PARAM_LIST, param1, param2);
        generator.add(paramList);
        assertEquals("(a,b)", consumer.code.toString());
    }

    @Test
    public void testFunction() {
        Node nameNode = Node.newString(Token.NAME, "f");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node function = new Node(Token.FUNCTION, nameNode, params, body);
        generator.add(function);
        assertEquals("function f()", consumer.code.toString());
    }

    @Test
    public void testStartStatement() {
        Node nameNode = Node.newString(Token.NAME, "x");
        Node exprResult = new Node(Token.EXPR_RESULT, nameNode);
        generator.add(exprResult);
        assertEquals("x", consumer.code.toString());
    }

    @Test
    public void testContinueProcessingFalse() {
        consumer.continueProcessing = false;
        Node nameNode = Node.newString(Token.NAME, "x");
        generator.add(nameNode);
        assertEquals("", consumer.code.toString());
    }
}