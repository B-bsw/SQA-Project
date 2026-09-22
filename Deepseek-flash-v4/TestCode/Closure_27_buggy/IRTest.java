package com.google.javascript.rhino;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class IRTest {
    
    @Before
    public void setUp() {
        // Setup if needed
    }
    
    @After
    public void tearDown() {
        // Cleanup if needed
    }
    
    @Test
    public void testEmpty() {
        Node result = IR.empty();
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.EMPTY, result.getType());
    }
    
    @Test
    public void testFunction() {
        Node name = IR.name("testFunc");
        Node params = IR.paramList();
        Node body = IR.block();
        Node result = IR.function(name, params, body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.FUNCTION, result.getType());
        Assert.assertSame(name, result.getFirstChild());
        Assert.assertSame(params, result.getChildAtIndex(1));
        Assert.assertSame(body, result.getChildAtIndex(2));
    }
    
    @Test(expected = IllegalStateException.class)
    public void testFunctionWithInvalidName() {
        Node invalidName = IR.name("notName");
        invalidName.setType(Token.EMPTY); // Make it not a name
        IR.function(invalidName, IR.paramList(), IR.block());
    }
    
    @Test
    public void testParamList() {
        Node param1 = IR.name("a");
        Node param2 = IR.name("b");
        Node single = IR.paramList(param1);
        Assert.assertNotNull(single);
        Assert.assertEquals(Token.PARAM_LIST, single.getType());
        Assert.assertEquals(1, single.getChildCount());
        Assert.assertSame(param1, single.getFirstChild());
        
        Node multi = IR.paramList(param1, param2);
        Assert.assertEquals(2, multi.getChildCount());
        
        List<Node> paramsList = new ArrayList<>();
        paramsList.add(param1);
        paramsList.add(param2);
        Node fromList = IR.paramList(paramsList);
        Assert.assertEquals(2, fromList.getChildCount());
    }
    
    @Test
    public void testParamListVarargs() {
        Node param1 = IR.name("x");
        Node param2 = IR.name("y");
        Node param3 = IR.name("z");
        Node result = IR.paramList(param1, param2, param3);
        Assert.assertEquals(3, result.getChildCount());
        Assert.assertSame(param1, result.getFirstChild());
        Assert.assertSame(param3, result.getLastChild());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testParamListWithInvalidParam() {
        Node invalid = new Node(Token.EMPTY);
        IR.paramList(invalid);
    }
    
    @Test
    public void testParamListEmptyList() {
        List<Node> emptyList = new ArrayList<>();
        Node result = IR.paramList(emptyList);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getChildCount());
    }
    
    @Test
    public void testBlock() {
        Node emptyBlock = IR.block();
        Assert.assertNotNull(emptyBlock);
        Assert.assertEquals(Token.BLOCK, emptyBlock.getType());
        Assert.assertEquals(0, emptyBlock.getChildCount());
        
        Node stmt = IR.exprResult(IR.name("test"));
        Node singleBlock = IR.block(stmt);
        Assert.assertEquals(1, singleBlock.getChildCount());
        
        Node stmt2 = IR.exprResult(IR.name("test2"));
        Node multiBlock = IR.block(stmt, stmt2);
        Assert.assertEquals(2, multiBlock.getChildCount());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testBlockWithNonStatement() {
        Node nonStmt = IR.number(1.0);
        IR.block(nonStmt);
    }
    
    @Test
    public void testScript() {
        Node result = IR.script();
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.SCRIPT, result.getType());
    }
    
    @Test
    public void testVar() {
        Node name = IR.name("x");
        Node value = IR.number(10);
        Node result = IR.var(name, value);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.VAR, result.getType());
        Assert.assertSame(name, result.getFirstChild());
        Assert.assertSame(value, name.getFirstChild());
    }
    
    @Test
    public void testVarWithoutValue() {
        Node name = IR.name("x");
        Node result = IR.var(name);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.VAR, result.getType());
        Assert.assertEquals(0, name.getChildCount());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVarWithInvalidName() {
        Node invalidName = new Node(Token.EMPTY);
        IR.var(invalidName, IR.number(1));
    }
    
    @Test
    public void testReturn() {
        Node simpleReturn = IR.returnNode();
        Assert.assertNotNull(simpleReturn);
        Assert.assertEquals(Token.RETURN, simpleReturn.getType());
        Assert.assertEquals(0, simpleReturn.getChildCount());
        
        Node expr = IR.name("result");
        Node returnWithExpr = IR.returnNode(expr);
        Assert.assertEquals(1, returnWithExpr.getChildCount());
        Assert.assertSame(expr, returnWithExpr.getFirstChild());
    }
    
    @Test
    public void testThrow() {
        Node expr = IR.name("error");
        Node result = IR.throwNode(expr);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.THROW, result.getType());
        Assert.assertSame(expr, result.getFirstChild());
    }
    
    @Test
    public void testExprResult() {
        Node expr = IR.name("x");
        Node result = IR.exprResult(expr);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.EXPR_RESULT, result.getType());
        Assert.assertSame(expr, result.getFirstChild());
    }
    
    @Test
    public void testIfNode() {
        Node cond = IR.name("cond");
        Node thenBlock = IR.block();
        Node result = IR.ifNode(cond, thenBlock);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.IF, result.getType());
        Assert.assertSame(cond, result.getFirstChild());
        Assert.assertSame(thenBlock, result.getChildAtIndex(1));
        
        Node elseBlock = IR.block();
        Node withElse = IR.ifNode(cond, thenBlock, elseBlock);
        Assert.assertEquals(3, withElse.getChildCount());
        Assert.assertSame(elseBlock, withElse.getLastChild());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testIfNodeWithNonBlockThen() {
        Node cond = IR.name("cond");
        Node nonBlock = IR.exprResult(IR.name("x"));
        IR.ifNode(cond, nonBlock);
    }
    
    @Test
    public void testDoNode() {
        Node body = IR.block();
        Node cond = IR.name("cond");
        Node result = IR.doNode(body, cond);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.DO, result.getType());
        Assert.assertSame(body, result.getFirstChild());
        Assert.assertSame(cond, result.getChildAtIndex(1));
    }
    
    @Test
    public void testForIn() {
        Node target = IR.name("x");
        Node cond = IR.name("obj");
        Node body = IR.block();
        Node result = IR.forIn(target, cond, body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.FOR, result.getType());
        Assert.assertSame(target, result.getFirstChild());
        Assert.assertSame(cond, result.getChildAtIndex(1));
        Assert.assertSame(body, result.getChildAtIndex(2));
    }
    
    @Test
    public void testForNode() {
        Node init = IR.var(IR.name("i"));
        Node cond = IR.name("i");
        Node incr = IR.name("i");
        Node body = IR.block();
        Node result = IR.forNode(init, cond, incr, body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.FOR, result.getType());
        Assert.assertSame(init, result.getFirstChild());
        Assert.assertSame(cond, result.getChildAtIndex(1));
        Assert.assertSame(incr, result.getChildAtIndex(2));
        Assert.assertSame(body, result.getChildAtIndex(3));
    }
    
    @Test
    public void testSwitchNode() {
        Node cond = IR.name("x");
        Node case1 = IR.caseNode(IR.number(1), IR.block());
        Node result = IR.switchNode(cond, case1);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.SWITCH, result.getType());
        Assert.assertSame(cond, result.getFirstChild());
        Assert.assertSame(case1, result.getChildAtIndex(1));
    }
    
    @Test
    public void testCaseNode() {
        Node expr = IR.number(5);
        Node body = IR.block();
        Node result = IR.caseNode(expr, body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.CASE, result.getType());
        Assert.assertSame(expr, result.getFirstChild());
        Assert.assertSame(body, result.getChildAtIndex(1));
        Assert.assertTrue(body.getBooleanProp(Node.SYNTHETIC_BLOCK_PROP));
    }
    
    @Test
    public void testDefaultCase() {
        Node body = IR.block();
        Node result = IR.defaultCase(body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.DEFAULT_CASE, result.getType());
        Assert.assertSame(body, result.getFirstChild());
    }
    
    @Test
    public void testLabel() {
        Node name = IR.labelName("myLabel");
        Node stmt = IR.block();
        Node result = IR.label(name, stmt);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.LABEL, result.getType());
        Assert.assertSame(name, result.getFirstChild());
        Assert.assertSame(stmt, result.getChildAtIndex(1));
    }
    
    @Test
    public void testLabelName() {
        Node result = IR.labelName("testLabel");
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.LABEL_NAME, result.getType());
        Assert.assertEquals("testLabel", result.getString());
    }
    
    @Test(expected = IllegalStateException.class)
    public void testLabelNameWithEmptyString() {
        IR.labelName("");
    }
    
    @Test
    public void testTryFinally() {
        Node tryBody = IR.block();
        Node finallyBody = IR.block();
        Node result = IR.tryFinally(tryBody, finallyBody);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.TRY, result.getType());
        Assert.assertSame(tryBody, result.getFirstChild());
        Assert.assertNotNull(result.getChildAtIndex(1));
        Assert.assertSame(finallyBody, result.getChildAtIndex(2));
    }
    
    @Test
    public void testTryCatch() {
        Node tryBody = IR.block();
        Node catchNode = IR.catchNode(IR.name("e"), IR.block());
        Node result = IR.tryCatch(tryBody, catchNode);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.TRY, result.getType());
        Assert.assertSame(tryBody, result.getFirstChild());
        Assert.assertNotNull(result.getChildAtIndex(1));
    }
    
    @Test
    public void testTryCatchFinally() {
        Node tryBody = IR.block();
        Node catchNode = IR.catchNode(IR.name("e"), IR.block());
        Node finallyBody = IR.block();
        Node result = IR.tryCatchFinally(tryBody, catchNode, finallyBody);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.TRY, result.getType());
        Assert.assertSame(tryBody, result.getFirstChild());
        Assert.assertNotNull(result.getChildAtIndex(1));
        Assert.assertSame(finallyBody, result.getChildAtIndex(2));
    }
    
    @Test
    public void testCatchNode() {
        Node expr = IR.name("e");
        Node body = IR.block();
        Node result = IR.catchNode(expr, body);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.CATCH, result.getType());
        Assert.assertSame(expr, result.getFirstChild());
        Assert.assertSame(body, result.getChildAtIndex(1));
    }
    
    @Test
    public void testBreakContinue() {
        Node breakNode = IR.breakNode();
        Assert.assertNotNull(breakNode);
        Assert.assertEquals(Token.BREAK, breakNode.getType());
        
        Node breakWithLabel = IR.breakNode(IR.name("label"));
        Assert.assertSame(IR.name("label").getType(), breakWithLabel.getFirstChild().getType());
        
        Node continueNode = IR.continueNode();
        Assert.assertNotNull(continueNode);
        Assert.assertEquals(Token.CONTINUE, continueNode.getType());
        
        Node continueWithLabel = IR.continueNode(IR.name("label"));
        Assert.assertSame(IR.name("label").getType(), continueWithLabel.getFirstChild().getType());
    }
    
    @Test
    public void testName() {
        Node result = IR.name("testName");
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.NAME, result.getType());
        Assert.assertEquals("testName", result.getString());
        
        Node emptyName = IR.name("");
        Assert.assertNotNull(emptyName);
        Assert.assertEquals("", emptyName.getString());
    }
    
    @Test
    public void testGetProp() {
        Node target = IR.name("obj");
        Node prop = IR.name("prop");
        Node result = IR.getprop(target, prop);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.GETPROP, result.getType());
        Assert.assertSame(target, result.getFirstChild());
        Assert.assertSame(prop, result.getChildAtIndex(1));
    }
    
    @Test
    public void testGetElem() {
        Node target = IR.name("array");
        Node elem = IR.name("index");
        Node result = IR.getelem(target, elem);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.GETELEM, result.getType());
        Assert.assertSame(target, result.getFirstChild());
        Assert.assertSame(elem, result.getChildAtIndex(1));
    }
    
    @Test
    public void testAssign() {
        Node target = IR.name("x");
        Node expr = IR.number(42);
        Node result = IR.assign(target, expr);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.ASSIGN, result.getType());
        Assert.assertSame(target, result.getFirstChild());
        Assert.assertSame(expr, result.getChildAtIndex(1));
    }
    
    @Test
    public void testHook() {
        Node cond = IR.name("c");
        Node trueVal = IR.number(1);
        Node falseVal = IR.number(0);
        Node result = IR.hook(cond, trueVal, falseVal);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.HOOK, result.getType());
        Assert.assertSame(cond, result.getFirstChild());
        Assert.assertSame(trueVal, result.getChildAtIndex(1));
        Assert.assertSame(falseVal, result.getChildAtIndex(2));
    }
    
    @Test
    public void testBinaryOps() {
        Node expr1 = IR.number(1);
        Node expr2 = IR.number(2);
        
        Node comma = IR.comma(expr1, expr2);
        Assert.assertEquals(Token.COMMA, comma.getType());
        
        Node and = IR.and(expr1, expr2);
        Assert.assertEquals(Token.AND, and.getType());
        
        Node or = IR.or(expr1, expr2);
        Assert.assertEquals(Token.OR, or.getType());
        
        Node eq = IR.eq(expr1, expr2);
        Assert.assertEquals(Token.EQ, eq.getType());
        
        Node sheq = IR.sheq(expr1, expr2);
        Assert.assertEquals(Token.SHEQ, sheq.getType());
        
        Node add = IR.add(expr1, expr2);
        Assert.assertEquals(Token.ADD, add.getType());
        
        Node sub = IR.sub(expr1, expr2);
        Assert.assertEquals(Token.SUB, sub.getType());
    }
    
    @Test
    public void testUnaryOps() {
        Node expr = IR.number(5);
        
        Node not = IR.not(expr);
        Assert.assertEquals(Token.NOT, not.getType());
        
        Node voidNode = IR.voidNode(expr);
        Assert.assertEquals(Token.VOID, voidNode.getType());
        
        Node neg = IR.neg(expr);
        Assert.assertEquals(Token.NEG, neg.getType());
        
        Node pos = IR.pos(expr);
        Assert.assertEquals(Token.POS, pos.getType());
    }
    
    @Test
    public void testObjectLit() {
        Node key1 = IR.stringKey("key1");
        Node val1 = IR.number(1);
        Node prop1 = IR.propdef(key1, val1);
        Node result = IR.objectlit(prop1);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.OBJECTLIT, result.getType());
        Assert.assertSame(prop1, result.getFirstChild());
        
        Node emptyObj = IR.objectlit();
        Assert.assertNotNull(emptyObj);
        Assert.assertEquals(0, emptyObj.getChildCount());
    }
    
    @Test
    public void testPropDef() {
        Node key = IR.stringKey("key");
        Node value = IR.number(10);
        Node result = IR.propdef(key, value);
        Assert.assertNotNull(result);
        Assert.assertSame(key, result);
        Assert.assertSame(value, key.getFirstChild());
    }
    
    @Test
    public void testArrayLit() {
        Node elem1 = IR.number(1);
        Node elem2 = IR.number(2);
        Node result = IR.arraylit(elem1, elem2);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.ARRAYLIT, result.getType());
        Assert.assertEquals(2, result.getChildCount());
        
        Node emptyArr = IR.arraylit();
        Assert.assertNotNull(emptyArr);
        Assert.assertEquals(0, emptyArr.getChildCount());
    }
    
    @Test
    public void testRegexp() {
        Node expr = IR.string("abc");
        Node result = IR.regexp(expr);
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.REGEXP, result.getType());
        Assert.assertSame(expr, result.getFirstChild());
        
        Node flags = IR.string("g");
        Node withFlags = IR.regexp(expr, flags);
        Assert.assertEquals(2, withFlags.getChildCount());
        Assert.assertSame(flags, withFlags.getChildAtIndex(1));
    }
    
    @Test
    public void testStringNumber() {
        Node str = IR.string("hello");
        Assert.assertNotNull(str);
        Assert.assertEquals(Token.STRING, str.getType());
        Assert.assertEquals("hello", str.getString());
        
        Node num = IR.number(3.14);
        Assert.assertNotNull(num);
        Assert.assertEquals(Token.NUMBER, num.getType());
        Assert.assertEquals(3.14, num.getDouble());
    }
    
    @Test
    public void testStringKey() {
        Node result = IR.stringKey("key");
        Assert.assertNotNull(result);
        Assert.assertEquals(Token.STRING_KEY, result.getType());
        Assert.assertEquals("key", result.getString());
    }
    
    @Test
    public void testLiterals() {
        Node thisNode = IR.thisNode();
        Assert.assertEquals(Token.THIS, thisNode.getType());
        
        Node trueNode = IR.trueNode();
        Assert.assertEquals(Token.TRUE, trueNode.getType());
        
        Node falseNode = IR.falseNode();
        Assert.assertEquals(Token.FALSE, falseNode.getType());
        
        Node nullNode = IR.nullNode();
        Assert.assertEquals(Token.NULL, nullNode.getType());
    }
}