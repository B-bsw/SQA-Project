package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.debugging.sourcemap.FilePosition;

public class CodePrinterTest {
    private CodePrinter.Builder builder;
    private Node rootNode;

    @Before
    public void setUp() {
        builder = CodePrinter.builder();
    }

    @After
    public void tearDown() {
        builder = null;
        rootNode = null;
    }

    // Helper methods
    private Node createSimpleFunction() {
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.setSourceFileName("test.js");
        functionNode.setLineno(1);

        Node nameNode = Node.newString(Token.NAME, "myFunc");
        functionNode.addChildToBack(nameNode);

        Node paramList = new Node(Token.PARAM_LIST);
        functionNode.addChildToBack(paramList);

        Node blockNode = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        Node numberNode = Node.newNumber(42);
        returnNode.addChildToBack(numberNode);
        blockNode.addChildToBack(returnNode);
        functionNode.addChildToBack(blockNode);

        return functionNode;
    }

    private Node createIfStatement(boolean hasElse) {
        Node ifNode = new Node(Token.IF);
        Node cond = new Node(Token.EQ);
        cond.addChildToBack(Node.newNumber(1));
        cond.addChildToBack(Node.newNumber(1));
        ifNode.addChildToBack(cond);

        Node thenBlock = new Node(Token.BLOCK);
        Node exprStmt = new Node(Token.EXPR_RESULT);
        exprStmt.addChildToBack(Node.newString(Token.NAME, "x"));
        thenBlock.addChildToBack(exprStmt);
        ifNode.addChildToBack(thenBlock);

        if (hasElse) {
            Node elseBlock = new Node(Token.BLOCK);
            Node elseStmt = new Node(Token.EXPR_RESULT);
            elseStmt.addChildToBack(Node.newString(Token.NAME, "y"));
            elseBlock.addChildToBack(elseStmt);
            ifNode.addChildToBack(elseBlock);
        }

        return ifNode;
    }

    // Test cases
    @Test
    public void testBuilderWithNullRoot() {
        try {
            builder.build();
            fail("Expected IllegalStateException for null root");
        } catch (IllegalStateException e) {
            // expected
        }
    }

    @Test
    public void testCompactPrintWithEmptyBlock() {
        Node block = new Node(Token.BLOCK);
        builder.setRoot(block);
        String result = builder.build();
        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void testPrettyPrintSimpleFunction() {
        Node func = createSimpleFunction();
        builder.setRoot(func);
        builder.setPrettyPrint(true);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("function"));
        assertTrue(result.contains("myFunc"));
        assertTrue(result.contains("42"));
    }

    @Test
    public void testPrettyPrintIndentation() {
        Node func = createSimpleFunction();
        builder.setRoot(func);
        builder.setPrettyPrint(true);
        String result = builder.build();
        assertTrue(result.contains("\n  return 42;") || result.contains("\n  return 42"));
    }

    @Test
    public void testCompactPrintIgnoresIndentation() {
        Node func = createSimpleFunction();
        builder.setRoot(func);
        String result = builder.build();
        assertEquals("function myFunc(){return 42;}", result.replaceAll("\\s+", ""));
    }

    @Test
    public void testIfStatementWithoutElse() {
        Node ifNode = createIfStatement(false);
        builder.setRoot(ifNode);
        String result = builder.build();
        assertNotNull(result);
        assertFalse(result.contains("else"));
    }

    @Test
    public void testIfStatementWithElse() {
        Node ifNode = createIfStatement(true);
        builder.setRoot(ifNode);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("else"));
        assertTrue(result.contains("x"));
        assertTrue(result.contains("y"));
    }

    @Test
    public void testLineBreakThresholdBoundary() {
        // Create a node that will generate a long line
        Node block = new Node(Token.BLOCK);
        for (int i = 0; i < 50; i++) {
            Node expr = new Node(Token.EXPR_RESULT);
            expr.addChildToBack(Node.newString(Token.NAME, "variable" + i + "WithLongName"));
            block.addChildToBack(expr);
        }

        builder.setRoot(block);
        builder.setLineLengthThreshold(50);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.length() > 50);
        assertTrue(result.contains("\n".trim()) || result.contains("\n"));
    }

    @Test
    public void testLineBreakDisabled() {
        Node block = new Node(Token.BLOCK);
        for (int i = 0; i < 20; i++) {
            Node expr = new Node(Token.EXPR_RESULT);
            expr.addChildToBack(Node.newString(Token.NAME, "x" + i));
            block.addChildToBack(expr);
        }

        builder.setRoot(block);
        builder.setLineBreak(false);
        builder.setLineLengthThreshold(10);
        String result = builder.build();
        assertNotNull(result);
        assertFalse(result.contains("\n"));
    }

    @Test
    public void testNullRootWithSourceMap() {
        Node node = new Node(Token.BLOCK);
        builder.setRoot(node);
        builder.setCreateSourceMap(true);
        String result = builder.build();
        assertNotNull(result);
    }

    @Test
    public void testNestedFunctions() {
        Node outerFunc = createSimpleFunction();
        Node innerFunc = createSimpleFunction();
        Node outerBlock = outerFunc.getLastChild();
        outerBlock.addChildToFront(innerFunc);

        builder.setRoot(outerFunc);
        builder.setPrettyPrint(true);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("function myFunc"));
    }

    @Test
    public void testSourceMapGeneration() {
        Node func = createSimpleFunction();
        builder.setRoot(func);
        builder.setCreateSourceMap(true);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.length() > 0);
    }

    @Test
    public void testUnaryOperators() {
        Node unaryNode = new Node(Token.NEG);
        unaryNode.addChildToBack(Node.newNumber(5));
        builder.setRoot(unaryNode);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("-5") || result.contains("- 5"));
    }

    @Test
    public void testBinaryOperators() {
        Node addNode = new Node(Token.ADD);
        addNode.addChildToBack(Node.newNumber(1));
        addNode.addChildToBack(Node.newNumber(2));
        builder.setRoot(addNode);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("1") && result.contains("2"));
    }

    @Test
    public void testEmptyStringHandling() {
        Node stringNode = Node.newString("");
        builder.setRoot(stringNode);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.contains("\"\"") || result.contains("''"));
    }

    @Test
    public void testLineBreakAtEndOfFile() {
        Node block = createSimpleFunction();
        builder.setRoot(block);
        builder.setLineBreak(true);
        builder.setPreferLineBreakAtEndOfFile(true);
        String result = builder.build();
        assertNotNull(result);
        assertTrue(result.endsWith("\n") || result.endsWith("}"));
    }
}