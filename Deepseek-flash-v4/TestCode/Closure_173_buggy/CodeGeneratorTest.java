package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class CodeGeneratorTest {

    private CodeGenerator generator;
    private TestCodeConsumer consumer;

    @Before
    public void setUp() {
        consumer = new TestCodeConsumer();
        generator = CodeGenerator.forCostEstimation(consumer);
    }

    private static class TestCodeConsumer extends CodeConsumer {
        private final StringBuilder code = new StringBuilder();
        private boolean preserveBlocks;

        @Override
        void add(String str) {
            code.append(str);
        }

        @Override
        void addIdentifier(String identifier) {
            code.append(identifier);
        }

        @Override
        void addOp(String op, boolean binr) {
            code.append(op);
        }

        @Override
        void addNumber(double x) {
            code.append(x);
        }

        @Override
        void endStatement() {
            code.append(";");
        }

        @Override
        void endStatement(boolean b) {
            code.append(";");
        }

        @Override
        void startSourceMapping(Node n) {
        }

        @Override
        void endSourceMapping(Node n) {
        }

        @Override
        void addList(Node list, boolean isFirst, Context context) {
            Node c = list.getFirstChild();
            while (c != null) {
                if (!isFirst) {
                    code.append(",");
                }
                add(c, context);
                isFirst = false;
                c = c.getNext();
            }
        }

        @Override
        void addList(Node list) {
            addList(list, true, Context.OTHER);
        }

        @Override
        void addOp(String op, boolean binr, int precedence) {
            code.append(op);
        }

        @Override
        boolean continueProcessing() {
            return true;
        }

        @Override
        boolean shouldPreserveExtraBlocks() {
            return preserveBlocks;
        }

        String getCode() {
            return code.toString();
        }
    }

    @Test
    public void testSimpleNumber() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(42.0);
        addWithParens(n);
        assertEquals("42.0", consumer.getCode());
    }

    @Test
    public void testSimpleName() {
        Node n = new Node(Token.NAME, "x");
        addWithParens(n);
        assertEquals("x", consumer.getCode());
    }

    @Test
    public void testNameWithAssignment() {
        Node n = new Node(Token.NAME, "x");
        Node expr = new Node(Token.ASSIGN, n, new Node(Token.NUMBER));
        consumer.add("(");
        addExpr(expr, 0, Context.OTHER);
        consumer.add(")");
        assertEquals("(x=0.0)", consumer.getCode());
    }

    @Test
    public void testArrayLit() {
        Node n = new Node(Token.ARRAYLIT);
        n.addChildToBack(new Node(Token.NUMBER));
        addWithParens(n);
        assertEquals("[0.0]", consumer.getCode());
    }

    @Test
    public void testVar() {
        Node n = new Node(Token.VAR);
        n.addChildToBack(new Node(Token.NAME, "a"));
        addWithParens(n);
        assertEquals("var a", consumer.getCode());
    }

    @Test
    public void testVarWithValue() {
        Node n = new Node(Token.VAR);
        Node name = new Node(Token.NAME, "a");
        name.addChildToBack(new Node(Token.NUMBER));
        n.addChildToBack(name);
        addWithParens(n);
        assertEquals("var a=0.0", consumer.getCode());
    }

    @Test
    public void testReturnNoValue() {
        Node n = new Node(Token.RETURN);
        addWithParens(n);
        assertEquals("return", consumer.getCode());
    }

    @Test
    public void testReturnWithValue() {
        Node n = new Node(Token.RETURN, new Node(Token.NUMBER));
        addWithParens(n);
        assertEquals("return0.0", consumer.getCode());
    }

    @Test
    public void testThrow() {
        Node n = new Node(Token.THROW, new Node(Token.NAME, "e"));
        addWithParens(n);
        assertEquals("throw e", consumer.getCode());
    }

    @Test
    public void testAddBinaryOperator() {
        Node left = new Node(Token.NUMBER);
        Node right = new Node(Token.NUMBER);
        Node n = new Node(Token.ADD, left, right);
        addWithParens(n);
        assertEquals("0.0+0.0", consumer.getCode());
    }

    @Test
    public void testOddAssignment() {
        Node lhs = new Node(Token.NAME, "a");
        Node rhs = new Node(Token.NAME, "b");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        Node outerAssign = new Node(Token.ASSIGN, new Node(Token.NAME, "c"), assign);
        addWithParens(outerAssign);
        assertEquals("c=a=b", consumer.getCode());
    }

    @Test
    public void testOddAssignmentWithExpr() {
        Node lhs = new Node(Token.NAME, "a");
        Node rhs = new Node(Token.NAME, "b");
        Node assign = new Node(Token.ASSIGN, lhs, rhs);
        Node outerAssign = new Node(Token.ASSIGN, new Node(Token.NAME, "c"), assign);
        addExpr(outerAssign, 0, Context.OTHER);
        assertEquals("c=a=b", consumer.getCode());
    }

    @Test
    public void testIf() {
        Node cond = new Node(Token.NAME, "x");
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.IF, cond, thenBlock);
        addWithParens(n);
        assertEquals("if(x){}", consumer.getCode());
    }

    @Test
    public void testIfWithElse() {
        Node cond = new Node(Token.NAME, "x");
        Node thenBlock = new Node(Token.BLOCK);
        Node elseBlock = new Node(Token.BLOCK);
        Node n = new Node(Token.IF, cond, thenBlock, elseBlock);
        n.setHasElse(true);
        addWithParens(n);
        assertEquals("if(x){}else{}", consumer.getCode());
    }

    @Test
    public void testWhile() {
        Node cond = new Node(Token.NAME, "x");
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.WHILE, cond, body);
        addWithParens(n);
        assertEquals("while(x){}", consumer.getCode());
    }

    @Test
    public void testDo() {
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.EMPTY));
        Node cond = new Node(Token.NAME, "x");
        Node n = new Node(Token.DO, body, cond);
        addWithParens(n);
        assertEquals("do{}while(x)", consumer.getCode());
    }

    @Test
    public void testCase() {
        Node expr = new Node(Token.NUMBER);
        Node caseBody = new Node(Token.BLOCK);
        caseBody.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.CASE, expr, caseBody);
        addWithParens(n);
        assertEquals("case0.0:{}", consumer.getCode());
    }

    @Test
    public void testDefaultCase() {
        Node caseBody = new Node(Token.BLOCK);
        caseBody.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.DEFAULT_CASE, caseBody);
        addWithParens(n);
        assertEquals("default:{}", consumer.getCode());
    }

    @Test
    public void testSwitch() {
        Node cond = new Node(Token.NAME, "x");
        Node caseBlock = new Node(Token.BLOCK);
        Node caseNode = new Node(Token.CASE, new Node(Token.NUMBER));
        caseNode.addChildToBack(new Node(Token.BLOCK));
        caseBlock.addChildToBack(caseNode);
        Node n = new Node(Token.SWITCH, cond, caseBlock);
        addWithParens(n);
        assertEquals("switch(x){case0.0:block{}}", consumer.getCode());
    }

    @Test
    public void testLabel() {
        Node label = new Node(Token.LABEL_NAME, "lbl");
        Node stmtNode = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "x"));
        Node n = new Node(Token.LABEL, label, stmtNode);
        addWithParens(n);
        assertEquals("lbl:x", consumer.getCode());
    }

    @Test
    public void testForThreePart() {
        Node init = new Node(Token.ASSIGN, new Node(Token.NAME, "i"), new Node(Token.NUMBER));
        Node cond = new Node(Token.NAME, "i");
        Node inc = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.FOR, init, cond, inc, body);
        n.setType(Token.FOR);
        addWithParens(n);
        assertEquals("for(i=0.0;i;i++){}", consumer.getCode());
    }

    @Test
    public void testForIn() {
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
        Node iterNode = new Node(Token.NAME, "obj");
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.EMPTY));
        Node n = new Node(Token.FOR, varNode, iterNode, body);
        n.setType(Token.FOR);
        addWithParens(n);
        assertEquals("for(var x in obj){}", consumer.getCode());
    }

    @Test
    public void testGetProp() {
        Node target = new Node(Token.NAME, "a");
        Node prop = new Node(Token.STRING, "b");
        Node n = new Node(Token.GETPROP, target, prop);
        addWithParens(n);
        assertEquals("a.b", consumer.getCode());
    }

    @Test
    public void testGetPropQuoted() {
        Node target = new Node(Token.NAME, "a");
        Node prop = new Node(Token.STRING, "b");
        prop.putBooleanProp(Node.QUOTED_PROP, true);
        Node n = new Node(Token.GETPROP, target, prop);
        addWithParens(n);
        assertEquals("a[\"b\"]", consumer.getCode());
    }

    @Test
    public void testGetElem() {
        Node target = new Node(Token.NAME, "a");
        Node index = new Node(Token.NAME, "i");
        Node n = new Node(Token.GETELEM, target, index);
        addWithParens(n);
        assertEquals("a[i]", consumer.getCode());
    }

    @Test
    public void testCall() {
        Node target = new Node(Token.NAME, "a");
        Node n = new Node(Token.CALL, target);
        addWithParens(n);
        assertEquals("a()", consumer.getCode());
    }

    @Test
    public void testCallWithArgs() {
        Node target = new Node(Token.NAME, "a");
        Node arg = new Node(Token.NAME, "b");
        Node n = new Node(Token.CALL, target, arg);
        addWithParens(n);
        assertEquals("a(b)", consumer.getCode());
    }

    @Test
    public void testIndirectEval() {
        Node target = new Node(Token.NAME, "eval");
        Node n = new Node(Token.CALL, target);
        Node parent = new Node(Token.EXPR_RESULT, n);
        addWithParens(parent);
        assertEquals("(eval())", consumer.getCode());
    }

    @Test
    public void testHook() {
        Node cond = new Node(Token.NAME, "c");
        Node trueExpr = new Node(Token.NUMBER);
        Node falseExpr = new Node(Token.NUMBER);
        Node n = new Node(Token.HOOK, cond, trueExpr, falseExpr);
        addWithParens(n);
        assertEquals("c?0.0:0.0", consumer.getCode());
    }

    @Test
    public void testComma() {
        Node left = new Node(Token.NAME, "a");
        Node right = new Node(Token.NAME, "b");
        Node n = new Node(Token.COMMA, left, right);
        addWithParens(n);
        assertEquals("a,b", consumer.getCode());
    }

    @Test
    public void testNegativeNumber() {
        Node n = new Node(Token.NEG, new Node(Token.NUMBER));
        addWithParens(n);
        assertEquals("-0.0", consumer.getCode());
    }

    @Test
    public void testNot() {
        Node n = new Node(Token.NOT, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("!x", consumer.getCode());
    }

    @Test
    public void testBitNot() {
        Node n = new Node(Token.BITNOT, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("~x", consumer.getCode());
    }

    @Test
    public void testTypeOf() {
        Node n = new Node(Token.TYPEOF, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("typeof x", consumer.getCode());
    }

    @Test
    public void testVoid() {
        Node n = new Node(Token.VOID, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("void 0.0", consumer.getCode());
    }

    @Test
    public void testPos() {
        Node n = new Node(Token.POS, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("+x", consumer.getCode());
    }

    @Test
    public void testIncPre() {
        Node n = new Node(Token.INC, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("++x", consumer.getCode());
    }

    @Test
    public void testDecPre() {
        Node n = new Node(Token.DEC, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("--x", consumer.getCode());
    }

    @Test
    public void testIncPost() {
        Node n = new Node(Token.INC, new Node(Token.NAME, "x"));
        n.putIntProp(Node.VAR_POS, 0);
        addWithParens(n);
        assertEquals("x++", consumer.getCode());
    }

    @Test
    public void testDecPost() {
        Node n = new Node(Token.DEC, new Node(Token.NAME, "x"));
        n.putIntProp(Node.VAR_POS, 0);
        addWithParens(n);
        assertEquals("x--", consumer.getCode());
    }

    @Test
    public void testFunction() {
        Node name = new Node(Token.NAME, "f");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node n = new Node(Token.FUNCTION, name, params, body);
        addWithParens(n);
        assertEquals("function f(){}", consumer.getCode());
    }

    @Test
    public void testFunctionAnonymous() {
        Node name = new Node(Token.NAME, "");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        Node n = new Node(Token.FUNCTION, name, params, body);
        addWithParens(n);
        assertEquals("function(){}", consumer.getCode());
    }

    @Test
    public void testFunctionWithParams() {
        Node name = new Node(Token.NAME, "f");
        Node params = new Node(Token.PARAM_LIST, new Node(Token.NAME, "a"));
        Node body = new Node(Token.BLOCK);
        Node n = new Node(Token.FUNCTION, name, params, body);
        addWithParens(n);
        assertEquals("function f(a){}", consumer.getCode());
    }

    @Test
    public void testObjectLit() {
        Node key = new Node(Token.STRING_KEY, "a");
        Node value = new Node(Token.NUMBER);
        key.addChildToBack(value);
        Node n = new Node(Token.OBJECTLIT, key);
        addWithParens(n);
        assertEquals("({a:0.0})", consumer.getCode());
    }

    @Test
    public void testObjectLitQuoted() {
        Node key = new Node(Token.STRING_KEY, "a");
        key.putBooleanProp(Node.QUOTED_PROP, true);
        key.addChildToBack(new Node(Token.NUMBER));
        Node n = new Node(Token.OBJECTLIT, key);
        addWithParens(n);
        assertEquals("({\"a\":0.0})", consumer.getCode());
    }

    @Test
    public void testRegexp() {
        Node regex = new Node(Token.REGEXP);
        regex.addChildToBack(new Node(Token.STRING, "abc"));
        regex.addChildToBack(new Node(Token.STRING, "g"));
        addWithParens(regex);
        assertEquals("/abc/g", consumer.getCode());
    }

    @Test
    public void testDebugger() {
        Node n = new Node(Token.DEBUGGER);
        addWithParens(n);
        assertEquals("debugger", consumer.getCode());
    }

    @Test
    public void testBreak() {
        Node n = new Node(Token.BREAK);
        addWithParens(n);
        assertEquals("break", consumer.getCode());
    }

    @Test
    public void testContinue() {
        Node n = new Node(Token.CONTINUE);
        addWithParens(n);
        assertEquals("continue", consumer.getCode());
    }

    @Test
    public void testThis() {
        Node n = new Node(Token.THIS);
        addWithParens(n);
        assertEquals("this", consumer.getCode());
    }

    @Test
    public void testNull() {
        Node n = new Node(Token.NULL);
        addWithParens(n);
        assertEquals("null", consumer.getCode());
    }

    @Test
    public void testTrue() {
        Node n = new Node(Token.TRUE);
        addWithParens(n);
        assertEquals("true", consumer.getCode());
    }

    @Test
    public void testFalse() {
        Node n = new Node(Token.FALSE);
        addWithParens(n);
        assertEquals("false", consumer.getCode());
    }

    @Test
    public void testString() {
        Node n = new Node(Token.STRING, "hello");
        addWithParens(n);
        assertEquals("\"hello\"", consumer.getCode());
    }

    @Test
    public void testStringWithEscape() {
        Node n = new Node(Token.STRING, "h\ne");
        addWithParens(n);
        assertEquals("\"h\\ne\"", consumer.getCode());
    }

    @Test
    public void testStringWithBackslash() {
        Node n = new Node(Token.STRING, "a\\b");
        addWithParens(n);
        assertEquals("\"a\\\\b\"", consumer.getCode());
    }

    @Test
    public void testStringWithQuote() {
        Node n = new Node(Token.STRING, "a\"b");
        addWithParens(n);
        assertEquals("\"a\\\"b\"", consumer.getCode());
    }

    @Test
    public void testStringWithSingleQuote() {
        Node n = new Node(Token.STRING, "a'b");
        addWithParens(n);
        assertEquals("\"a'b\"", consumer.getCode());
    }

    @Test
    public void testUnicodeLineSeparator() {
        Node n = new Node(Token.STRING, "a\u2028b");
        addWithParens(n);
        assertEquals("\"a\\u2028b\"", consumer.getCode());
    }

    @Test
    public void testUnicodeParagraphSeparator() {
        Node n = new Node(Token.STRING, "a\u2029b");
        addWithParens(n);
        assertEquals("\"a\\u2029b\"", consumer.getCode());
    }

    @Test
    public void testNonAscii() {
        Node n = new Node(Token.STRING, "é");
        addWithParens(n);
        assertEquals("\"é\"", consumer.getCode());
    }

    @Test
    public void testSimpleNumberBoundaryLow() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(-1.0);
        addWithParens(n);
        assertEquals("-1.0", consumer.getCode());
    }

    @Test
    public void testSimpleNumberBoundaryHigh() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(1.7976931348623157E308);
        addWithParens(n);
        assertEquals("1.7976931348623157E308", consumer.getCode());
    }

    @Test
    public void testSimpleNumberZero() {
        Node n = new Node(Token.NUMBER);
        n.setDouble(0.0);
        addWithParens(n);
        assertEquals("0.0", consumer.getCode());
    }

    @Test
    public void testDelProp() {
        Node n = new Node(Token.DELPROP, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("delete x", consumer.getCode());
    }

    @Test
    public void testCast() {
        Node n = new Node(Token.CAST, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("x", consumer.getCode());
    }

    @Test
    public void testScriptBlock() {
        Node n = new Node(Token.SCRIPT);
        n.addChildToBack(new Node(Token.EMPTY));
        addWithParens(n);
        assertEquals(";", consumer.getCode());
    }

    @Test
    public void testWith() {
        Node obj = new Node(Token.NAME, "o");
        Node body = new Node(Token.BLOCK);
        Node n = new Node(Token.WITH, obj, body);
        addWithParens(n);
        assertEquals("with(o){}", consumer.getCode());
    }

    @Test
    public void testExprResult() {
        Node n = new Node(Token.EXPR_RESULT, new Node(Token.NAME, "x"));
        addWithParens(n);
        assertEquals("x", consumer.getCode());
    }

    @Test
    public void testJSDoc() {
        Node n = new Node(Token.EMPTY);
        addWithParens(n);
        assertEquals("", consumer.getCode());
    }

    @Test
    public void testUnknownTypeThrows() {
        Node n = new Node(Token.SCRIPT);
        n.setType(200);
        try {
            addWithParens(n);
            fail("Expected Error");
        } catch (Error e) {
            assertEquals("Unexpected node type: 200", e.getMessage());
        }
    }

    @Test
    public void testRegexpNotValid() {
        Node regex = new Node(Token.REGEXP);
        addWithParens(regex);
        assertEquals("/(?:)/", consumer.getCode());
    }

    @Test
    public void testGetterDef() {
        Node value = new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        value.putBooleanProp(Node.GETTER_DEF, true);
        value.setType(Token.GETPROP);
        Node n = new Node(Token.GETPROP, new Node(Token.STRING, "getter"), value);
        addWithParens(n);
        assertEquals("getter=function(){}", consumer.getCode());
    }

    private void addWithParens(Node n) {
        consumer.add("(");
        generator.add(n);
        consumer.add(")");
    }

    private void addExpr(Node n, int precedence, Context context) {
        generator.add(n, context);
    }
}