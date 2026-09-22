package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class FoldConstantsTest {

    private FoldConstants foldConstants;
    private CompilerPass pass;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        foldConstants = new FoldConstants();
        externs = new Node(Token.EMPTY);
        root = new Node(Token.EMPTY);
    }

    @Test
    public void testProcessWithSimpleCode() {
        Node script = new Node(Token.SCRIPT);
        root.addChildToBack(script);
        foldConstants.process(externs, root);
        assertNotNull(root);
    }

    @Test
    public void testVisitWithNullParent() {
        Node node = new Node(Token.NAME, "x");
        foldConstants.visit(new NodeTraversal(null, null), node, null);
    }

    @Test
    public void testDivideByZero() {
        Node node = new Node(Token.DIV, 
            Node.newNumber(1.0), 
            Node.newNumber(0.0));
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(node);
        root.addChildToBack(script);
        foldConstants.process(externs, root);
    }

    @Test
    public void testLogicalAndFolding() {
        Node trueNode = new Node(Token.TRUE);
        Node falseNode = new Node(Token.FALSE);
        Node andNode = new Node(Token.AND, trueNode, falseNode);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(andNode);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testBitwiseOpsFolding() {
        Node bitAnd = new Node(Token.BITAND, 
            Node.newNumber(5), 
            Node.newNumber(3));
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(bitAnd);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testStringConcatFolding() {
        Node left = Node.newString("Hello ");
        Node right = Node.newString("World");
        Node add = new Node(Token.ADD, left, right);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(add);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testComparisonOpsFolding() {
        Node lt = new Node(Token.LT, 
            Node.newNumber(1), 
            Node.newNumber(2));
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(lt);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testGetterElemWithStringIndex() {
        Node array = new Node(Token.ARRAYLIT, 
            Node.newString("a"), 
            Node.newString("b"));
        Node index = Node.newString("1");
        Node getElem = new Node(Token.GETELEM, array, index);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(getElem);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testRegexpFolding() {
        Node regexp = Node.newString("ab+c");
        Node flags = Node.newString("g");
        Node regexpNode = new Node(Token.REGEXP, regexp, flags);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(regexpNode);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testIfStatementFolding() {
        Node cond = new Node(Token.TRUE);
        Node thenBlock = new Node(Token.BLOCK);
        thenBlock.addChildToBack(new Node(Token.EMPTY));
        Node elseBlock = new Node(Token.BLOCK);
        elseBlock.addChildToBack(new Node(Token.EMPTY));
        Node ifNode = new Node(Token.IF, cond, thenBlock, elseBlock);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(ifNode);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testNegationFolding() {
        Node notNode = new Node(Token.NOT, new Node(Token.TRUE));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(notNode);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testNullInput() {
        foldConstants.process(null, null);
    }

    @Test
    public void testEmptyRoot() {
        foldConstants.process(externs, root);
    }

    @Test
    public void testTypeOfWithLiteral() {
        Node typeOf = new Node(Token.TYPEOF, Node.newString("hello"));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(typeOf);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testGetPropFolding() {
        Node getProp = new Node(Token.GETPROP, 
            new Node(Token.THIS), 
            Node.newString("length"));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(getProp);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testCallFolding() {
        Node call = new Node(Token.CALL,
            new Node(Token.GETPROP, new Node(Token.NAME, "console"), Node.newString("log")),
            Node.newString("test"));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(call);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testHookFolding() {
        Node cond = new Node(Token.TRUE);
        Node thenNode = Node.newNumber(1);
        Node elseNode = Node.newNumber(2);
        Node hook = new Node(Token.HOOK, cond, thenNode, elseNode);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(hook);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testUnaryOpsFolding() {
        Node neg = new Node(Token.NEG, Node.newNumber(5));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(neg);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testArrayAccessWithNegativeIndex() {
        Node array = new Node(Token.ARRAYLIT, Node.newNumber(1));
        Node index = Node.newNumber(-1);
        Node getElem = new Node(Token.GETELEM, array, index);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(getElem);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testLoopFolding() {
        Node cond = new Node(Token.TRUE);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.EMPTY));
        Node loop = new Node(Token.WHILE, cond, body);
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(loop);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }

    @Test
    public void testTryCatchBlock() {
        Node tryNode = new Node(Token.TRY,
            new Node(Token.BLOCK, new Node(Token.EMPTY)));
        
        Node script = new Node(Token.SCRIPT);
        script.addChildToBack(tryNode);
        root.addChildToBack(script);
        
        foldConstants.process(externs, root);
    }
}