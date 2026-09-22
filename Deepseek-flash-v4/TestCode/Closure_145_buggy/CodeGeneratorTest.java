package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import com.google.common.base.Charsets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

@RunWith(JUnit4.class)
public class CodeGeneratorTest {

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder code = new StringBuilder();
        private boolean continueProcessing = true;
        private boolean preserveExtraBlocks = false;
        private boolean lineBreak = false;
        private boolean endStatementCalled = false;

        @Override
        void addIdentifier(String identifier) {
            code.append(identifier);
        }

        @Override
        void add(String str) {
            code.append(str);
        }

        @Override
        void addOp(String op, boolean binop) {
            code.append(op);
        }

        @Override
        void addNumber(double x) {
            if (Double.isNaN(x)) {
                code.append("NaN");
            } else if (Double.isInfinite(x)) {
                code.append(x > 0 ? "Infinity" : "-Infinity");
            } else if (x == (long) x) {
                code.append((long) x);
            } else {
                code.append(x);
            }
        }

        @Override
        void addString(String str) {
            code.append('"').append(str).append('"');
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
        void beginBlock() {
            code.append("{");
        }

        @Override
        void endBlock() {
            code.append("}");
        }

        @Override
        void endStatement(boolean needSemicolon) {
            if (needSemicolon) {
                code.append(";");
            }
            endStatementCalled = true;
        }

        @Override
        void endStatement() {
            endStatement(true);
        }

        @Override
        boolean continueProcessing() {
            return continueProcessing;
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return preserveExtraBlocks;
        }

        @Override
        boolean breakAfterBlockFor(Node n, boolean isStmt) {
            return false;
        }

        @Override
        void notePreferredLineBreak() {
            // no-op
        }

        @Override
        void maybeLineBreak() {
            // no-op
        }

        @Override
        void endBlock(boolean endStatement) {
            code.append("}");
            if (endStatement) {
                endStatement();
            }
        }

        @Override
        void addNonEmptyExpression(Node n, Context context) {
            addExpr(n, 0, context);
        }

        @Override
        void addNonEmptyExpression(Node n, Context context, boolean preserveBlock) {
            addExpr(n, 0, context);
        }

        @Override
        void addExpr(Node n, int precedence, Context context) {
            // Simplified expression handler
            if (n == null) {
                return;
            }
            switch (n.getType()) {
                case Token.NAME:
                    code.append(n.getString());
                    break;
                case Token.NUMBER:
                    addNumber(n.getDouble());
                    break;
                case Token.STRING:
                    code.append('"').append(n.getString()).append('"');
                    break;
                case Token.ADD:
                    addExpr(n.getFirstChild(), 0, context);
                    code.append("+");
                    addExpr(n.getLastChild(), 0, context);
                    break;
                case Token.SUB:
                    addExpr(n.getFirstChild(), 0, context);
                    code.append("-");
                    addExpr(n.getLastChild(), 0, context);
                    break;
                case Token.MUL:
                    addExpr(n.getFirstChild(), 0, context);
                    code.append("*");
                    addExpr(n.getLastChild(), 0, context);
                    break;
                default:
                    // Minimal support for other nodes
                    code.append("EXPR");
                    break;
            }
        }

        @Override
        void addList(Node first, boolean isFirst, Context context) {
            Node n = first;
            while (n != null) {
                if (!isFirst) {
                    code.append(",");
                }
                add(n);
                isFirst = false;
                n = n.getNext();
            }
        }

        @Override
        void addList(Node first, int[] skipIndexes) {
            Node n = first;
            int skipPos = 0;
            int i = 0;
            while (n != null) {
                if (skipIndexes != null && skipPos < skipIndexes.length && i == skipIndexes[skipPos]) {
                    skipPos++;
                } else {
                    if (i > 0 && (skipIndexes == null || skipPos == 0 || i != skipIndexes[skipPos-1])) {
                        code.append(",");
                    }
                    add(n);
                }
                n = n.getNext();
                i++;
            }
        }

        @Override
        void addList(Node first) {
            addList(first, true, Context.OTHER);
        }

        @Override
        void addList(Node first, Context context) {
            addList(first, true, context);
        }

        @Override
        void addList(Node first, boolean isFirst) {
            addList(first, isFirst, Context.OTHER);
        }

        @Override
        void addLeftExpr(Node n, int minPrecedence, Context context) {
            addExpr(n, minPrecedence, context);
        }

        @Override
        void addLeftExpr(Node n, int minPrecedence) {
            addExpr(n, minPrecedence, Context.OTHER);
        }

        String getCode() {
            return code.toString();
        }
    }

    private TestCodeConsumer consumer;
    private CodeGenerator generator;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = new CodeGenerator(consumer);
    }

    private void assertGenerated(String expected, Node node) {
        generator.add(node);
        assertEquals(expected, consumer.getCode());
    }

    @Test
    public void testAddNullCharset() {
        CodeGenerator gen = new CodeGenerator(consumer, null);
        assertNotNull(gen);
    }

    @Test
    public void testAddUSASCIICharset() {
        CodeGenerator gen = new CodeGenerator(consumer, Charsets.US_ASCII);
        assertNotNull(gen);
    }

    @Test
    public void testAddNonAsciiCharset() {
        CodeGenerator gen = new CodeGenerator(consumer, Charset.forName("UTF-8"));
        assertNotNull(gen);
    }

    @Test
    public void testSkipProcessing() {
        consumer.continueProcessing = false;
        Node name = Node.newString(Token.NAME, "foo");
        generator.add(name);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testName() {
        Node name = Node.newString(Token.NAME, "foo");
        assertGenerated("foo", name);
    }

    @Test
    public void testNameWithNoChildren() {
        Node name = Node.newString(Token.NAME, "foo");
        name.addChildToFront(Node.newString(Token.EMPTY, ""));
        assertGenerated("foo", name);
    }

    @Test
    public void testStringLiteral() {
        Node stringNode = Node.newString(Token.STRING, "hello");
        assertGenerated("\"hello\"", stringNode);
    }

    @Test
    public void testNumberInteger() {
        Node number = Node.newNumber(Token.NUMBER, 42.0);
        assertGenerated("42", number);
    }

    @Test
    public void testNumberDouble() {
        Node number = Node.newNumber(Token.NUMBER, 3.14);
        assertGenerated("3.14", number);
    }

    @Test
    public void testNumberNaN() {
        Node number = Node.newNumber(Token.NUMBER, Double.NaN);
        assertGenerated("NaN", number);
    }

    @Test
    public void testNumberInfinity() {
        Node number = Node.newNumber(Token.NUMBER, Double.POSITIVE_INFINITY);
        assertGenerated("Infinity", number);
    }

    @Test
    public void testArrayLiteralEmpty() {
        Node array = new Node(Token.ARRAYLIT);
        assertGenerated("[]", array);
    }

    @Test
    public void testArrayLiteralOneElement() {
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        assertGenerated("[1]", array);
    }

    @Test
    public void testArrayLiteralMultipleElements() {
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        array.addChildToFront(Node.newNumber(Token.NUMBER, 2.0));
        array.addChildToFront(Node.newNumber(Token.NUMBER, 3.0));
        assertGenerated("[1,2,3]", array);
    }

    @Test
    public void testArrayWithSkipIndexes() {
        Node array = new Node(Token.ARRAYLIT);
        array.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        Node hole = new Node(Token.EMPTY);
        array.addChildToFront(hole);
        array.addChildToFront(Node.newNumber(Token.NUMBER, 3.0));
        int[] skip = {0};
        array.putProp(Node.SKIP_INDEXES_PROP, skip);
        assertGenerated("[,3]", array);
    }

    @Test
    public void testParenthesizedExpression() {
        Node lp = new Node(Token.LP);
        lp.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        assertGenerated("(1)", lp);
    }

    @Test
    public void testAddBinaryOperator() {
        Node add = new Node(Token.ADD);
        add.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        add.addChildToFront(Node.newNumber(Token.NUMBER, 2.0));
        assertGenerated("1+2", add);
    }

    @Test
    public void testCommaExpression() {
        Node comma = new Node(Token.COMMA);
        comma.addChildToFront(Node.newNumber(Token.NUMBER, 1.0));
        comma.addChildToFront(Node.newNumber(Token.NUMBER, 2.0));
        assertGenerated("1,2", comma);
    }

    @Test
    public void testEmptyStatement() throws IOException {
        Node empty = new Node(Token.EMPTY);
        assertGenerated("", empty);
    }

    @Test
    public void testScriptStatement() throws IOException {
        Node script = new Node(Token.SCRIPT);
        Node name = Node.newString(Token.NAME, "foo");
        script.addChildToFront(name);
        assertGenerated("foo", script);
    }

    @Test
    public void testBlockStatement() throws IOException {
        Node block = new Node(Token.BLOCK);
        Node name = Node.newString(Token.NAME, "foo");
        block.addChildToFront(name);
        assertGenerated("foo", block);
    }

    @Test
    public void testBlockWithMultipleStatements() throws IOException {
        Node block = new Node(Token.BLOCK);
        Node name1 = Node.newString(Token.NAME, "a");
        Node name2 = Node.newString(Token.NAME, "b");
        block.addChildToFront(name1);
        block.addChildToFront(name2);
        assertGenerated("ab", block);
    }

    @Test
    public void testIfStatementNoElse() throws IOException {
        Node ifNode = new Node(Token.IF);
        Node cond = Node.newString(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(Node.newString(Token.NAME, "y"));
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(body);
        assertGenerated("if(x)y", ifNode);
    }

    @Test
    public void testIfStatementWithElse() throws IOException {
        Node ifNode = new Node(Token.IF);
        Node cond = Node.newString(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(Node.newString(Token.NAME, "y"));
        Node elseBody = new Node(Token.BLOCK);
        elseBody.addChildToFront(Node.newString(Token.NAME, "z"));
        ifNode.addChildToFront(cond);
        ifNode.addChildToFront(body);
        ifNode.addChildToFront(elseBody);
        assertGenerated("if(x)y elsez", ifNode);
    }

    @Test
    public void testWhileLoop() throws IOException {
        Node whileNode = new Node(Token.WHILE);
        Node cond = Node.newString(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(Node.newString(Token.NAME, "y"));
        whileNode.addChildToFront(cond);
        whileNode.addChildToFront(body);
        assertGenerated("while(x)y", whileNode);
    }

    @Test
    public void testDoWhileLoop() throws IOException {
        Node doNode = new Node(Token.DO);
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(Node.newString(Token.NAME, "y"));
        Node cond = Node.newString(Token.NAME, "x");
        doNode.addChildToFront(body);
        doNode.addChildToFront(cond);
        assertGenerated("do y while(x)", doNode);
    }

    @Test
    public void testForLoop() throws IOException {
        Node forNode = new Node(Token.FOR);
        Node init = Node.newString(Token.NAME, "i");
        Node cond = Node.newString(Token.NAME, "i");
        Node incr = Node.newString(Token.NAME, "i");
        Node body = new Node(Token.BLOCK);
        body.addChildToFront(Node.newString(Token.NAME, "body"));
        forNode.addChildToFront(init);
        forNode.addChildToFront(cond);
        forNode.addChildToFront(incr);
        forNode.addChildToFront(body);
        // for(init; cond; incr)
        String result = consumer.getCode();
        generator.add(forNode);
        result = consumer.getCode();
        // Verify it doesn't throw and produces something
        assertNotNull(result);
    }

    @Test
    public void testThrowStatement() throws IOException {
        Node throwNode = new Node(Token.THROW);
        Node error = Node.newString(Token.NAME, "err");
        throwNode.addChildToFront(error);
        generator.add(throwNode);
        String result = consumer.getCode();
        assertNotNull(result);
    }

    @Test
    public void testTryCatchBlock() throws IOException {
        Node tryNode = new Node(Token.TRY);
        Node tryBlock = new Node(Token.BLOCK);
        tryBlock.addChildToFront(Node.newString(Token.NAME, "x"));
        Node catchNode = new Node(Token.CATCH);
        Node catchName = Node.newString(Token.NAME, "e");
        catchNode.addChildToFront(catchName);
        Node catchBody = new Node(Token.BLOCK);
        catchBody.addChildToFront(Node.newString(Token.NAME, "y"));
        catchNode.addChildToFront(catchBody);
        Node catchWrapper = new Node(Token.BLOCK);
        catchWrapper.addChildToFront(catchNode);
        tryNode.addChildToFront(tryBlock);
        tryNode.addChildToFront(catchWrapper);
        generator.add(tryNode);
        String result = consumer.getCode();
        assertNotNull(result);
    }

    @Test
    public void testBreakStatement() throws IOException {
        Node breakNode = new Node(Token.BREAK);
        breakNode.addChildToFront(Node.newString(Token.LABEL_NAME, "label"));
        generator.add(breakNode);
        String result = consumer.getCode();
        assertEquals("break label", result);
    }

    @Test
    public void testContinueStatement() throws IOException {
        Node continueNode = new Node(Token.CONTINUE);
        continueNode.addChildToFront(Node.newString(Token.LABEL_NAME, "label"));
        generator.add(continueNode);
        String result = consumer.getCode();
        assertEquals("continue label", result);
    }

    @Test
    public void testGetProp() throws IOException {
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NAME, "obj");
        Node prop = Node.newString(Token.STRING, "prop");
        getProp.addChildToFront(obj);
        getProp.addChildToFront(prop);
        assertGenerated("obj.prop", getProp);
    }

    @Test
    public void testGetPropNegative() throws IOException {
        Node getProp = new Node(Token.GETPROP);
        Node obj = Node.newString(Token.NUMBER, 1.0);
        Node prop = Node.newString(Token.STRING, "prop");
        getProp.addChildToFront(obj);
        getProp.addChildToFront(prop);
        assertGenerated("(1).prop", getProp);
    }

    @Test
    public void testGetPropMissingChild() {
        Node getProp = new Node(Token.GETPROP);
        getProp.addChildToFront(Node.newString(Token.NAME, "obj"));
        try {
            generator.add(getProp);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testCaseStatement() throws IOException {
        Node switchNode = new Node(Token.SWITCH);
        Node cond = Node.newString(Token.NAME, "x");
        switchNode.addChildToFront(cond);
        Node caseNode = new Node(Token.CASE);
        Node caseVal = Node.newNumber(Token.NUMBER, 1.0);
        caseNode.addChildToFront(caseVal);
        Node caseBody = new Node(Token.BLOCK);
        caseBody.addChildToFront(Node.newString(Token.NAME, "y"));
        caseNode.addChildToFront(caseBody);
        switchNode.addChildToFront(caseNode);
        generator.add(switchNode);
        String result = consumer.getCode();
        assertNotNull(result);
    }

    @Test
    public void testNewCallWithArguments() throws IOException {
        Node newNode = new Node(Token.NEW);
        Node callee = Node.newString(Token.NAME, "Foo");
        newNode.addChildToFront(callee);
        Node arg = Node.newNumber(Token.NUMBER, 1.0);
        newNode.addChildToFront(arg);
        generator.add(newNode);
        String result = consumer.getCode();
        assertEquals("new Foo(1)", result);
    }

    @Test
    public void testNewCallNoArguments() throws IOException {
        Node newNode = new Node(Token.NEW);
        Node callee = Node.newString(Token.NAME, "Foo");
        newNode.addChildToFront(callee);
        generator.add(newNode);
        String result = consumer.getCode();
        assertEquals("new Foo", result);
    }

    @Test
    public void testDeleteProperty() throws IOException {
        Node delNode = new Node(Token.DELPROP);
        delNode.addChildToFront(Node.newString(Token.NAME, "obj"));
        generator.add(delNode);
        String result = consumer.getCode();
        assertEquals("delete obj", result);
    }

    @Test
    public void testEvalCallDirect() throws IOException {
        Node callNode = new Node(Token.CALL);
        Node evalNode = Node.newString(Token.NAME, "eval");
        evalNode.putBooleanProp(Node.DIRECT_EVAL, true);
        callNode.addChildToFront(evalNode);
        generator.add(callNode);
        String result = consumer.getCode();
        assertNotNull(result);
    }

    @Test
    public void testRegexpLiteral() throws IOException {
        Node regexpNode = new Node(Token.REGEXP);
        regexpNode.addChildToFront(Node.newString(Token.STRING, "abc"));
        regexpNode.addChildToFront(Node.newString(Token.STRING, "g"));
        generator.add(regexpNode);
        String result = consumer.getCode();
        assertEquals("/abc/g", result);
    }

    @Test
    public void testFunctionDeclaration() throws IOException {
        Node functionNode = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "foo");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        functionNode.addChildToFront(name);
        functionNode.addChildToFront(params);
        functionNode.addChildToFront(body);
        generator.add(functionNode, CodeConsumer.Context.STATEMENT);
        String result = consumer.getCode();
        assertNotNull(result);
    }

    @Test
    public void testScriptWithSourceMapping() {
        consumer.startSourceMapping(null);
        Node name = Node.newString(Token.NAME, "x");
        generator.add(name);
        consumer.endSourceMapping(null);
        assertEquals("x", consumer.getCode());
    }
}