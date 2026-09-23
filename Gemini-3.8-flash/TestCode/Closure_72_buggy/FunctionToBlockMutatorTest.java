package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.common.base.Supplier;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FunctionToBlockMutatorTest {

    private FunctionToBlockMutator mutator;
    private AbstractCompiler compiler;

    private static class TestCompiler extends AbstractCompiler {
        private int uniqueId = 0;
        private String codingConvention = "";

        @Override
        public String getSourceName() { return null; }

        @Override
        public String getSourceFilePath() { return null; }

        @Override
        public String getSourceMapSource() { return null; }

        @Override
        public String getCodingConvention() { return codingConvention; }

        @Override
        public void setCodingConvention(String codingConvention) {
            this.codingConvention = codingConvention;
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return new Supplier<String>() {
                @Override
                public String get() {
                    return "id_" + (uniqueId++);
                }
            };
        }

        @Override
        public Node getRoot() { return null; }

        @Override
        public void setRoot(Node root) { }

        @Override
        public void reportCodeChange() { }
    }

    private static class TestSupplier implements Supplier<String> {
        private int counter = 0;
        @Override
        public String get() {
            return "supplier_" + (counter++);
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        mutator = new FunctionToBlockMutator(compiler, new TestSupplier());
    }

    @Test
    public void testMutateWithNoArgsAndNoReturn() {
        Node fnNode = createFunctionWithBody();
        Node callNode = new Node(Token.CALL);
        Node result = mutator.mutate("testFn", fnNode, callNode, null, false, false);
        assertNotNull(result);
        assertEquals(Token.BLOCK, result.getType());
    }

    @Test
    public void testMutateWithArgsAndReturn() {
        Node fnNode = createFunctionWithBody();
        Node callNode = createCallNode();
        Node result = mutator.mutate("testFn", fnNode, callNode, "result", true, false);
        assertNotNull(result);
        assertEquals(Token.BLOCK, result.getType());
    }

    @Test
    public void testMutateWithLoopAndReturn() {
        Node fnNode = createFunctionWithLoop();
        Node callNode = createCallNode();
        Node result = mutator.mutate("testFn", fnNode, callNode, "result", true, true);
        assertNotNull(result);
        assertEquals(Token.BLOCK, result.getType());
    }

    @Test
    public void testMutateWithNullFnName() {
        Node fnNode = createFunctionWithBody();
        Node callNode = createCallNode();
        Node result = mutator.mutate(null, fnNode, callNode, "result", true, false);
        assertNotNull(result);
    }

    @Test
    public void testReplaceReturnWithBreakWithNullResult() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        block.addChildToBack(ret);
        Node result = FunctionToBlockMutator.replaceReturnWithBreak(block, null, null, null);
        assertNotNull(result);
    }

    @Test
    public void testReplaceReturnWithOnlyReturn() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(Node.newNumber(5));
        block.addChildToBack(ret);
        Node result = FunctionToBlockMutator.replaceReturnWithBreak(block, null, "result", "label");
        assertNotNull(result);
    }

    @Test
    public void testReplaceReturnWithNoReturn() {
        Node block = new Node(Token.BLOCK);
        Node result = FunctionToBlockMutator.replaceReturnWithBreak(block, null, null, "label");
        assertNull(result);
    }

    @Test
    public void testHasReturnAtExitWithReturn() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        block.addChildToBack(ret);
        assertTrue(FunctionToBlockMutator.hasReturnAtExit(block));
    }

    @Test
    public void testHasReturnAtExitWithoutReturn() {
        Node block = new Node(Token.BLOCK);
        assertFalse(FunctionToBlockMutator.hasReturnAtExit(block));
    }

    @Test
    public void testGetReplacementReturnStatementWithReturnAndResult() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(Node.newString("value"));
        block.addChildToBack(ret);
        Node result = FunctionToBlockMutator.getReplacementReturnStatement(block, "resultName");
        assertNotNull(result);
    }

    @Test
    public void testCreateAssignStatementNode() {
        Node result = FunctionToBlockMutator.createAssignStatementNode("name", Node.newNumber(1));
        assertNotNull(result);
        assertEquals(Token.EXPR_RESULT, result.getType());
    }

    @Test
    public void testAddDummyAssignment() {
        Node block = new Node(Token.BLOCK);
        FunctionToBlockMutator.addDummyAssignment(block, "result");
        assertEquals(1, block.getChildCount());
    }

    @Test
    public void testConvertLastReturnToStatement() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(Node.newNumber(5));
        block.addChildToBack(ret);
        FunctionToBlockMutator.convertLastReturnToStatement(block, "result");
        assertNotEquals(Token.RETURN, block.getLastChild().getType());
    }

    @Test
    public void testMutateWithModifiedParameters() {
        Node fnNode = createFunctionWithModifiedParams();
        Node callNode = createCallNodeWithMatchingArgs();
        Node result = mutator.mutate("testFn", fnNode, callNode, "result", false, false);
        assertNotNull(result);
    }

    @Test
    public void testMutateWithNullArgsInCall() {
        Node fnNode = new Node(Token.FUNCTION);
        Node callNode = new Node(Token.CALL);
        Node result = mutator.mutate("testFn", fnNode, callNode, "result", false, false);
        assertNull(result);
    }

    @Test
    public void testReplaceReturnWithVoidResult() {
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        block.addChildToBack(ret);
        Node result = FunctionToBlockMutator.replaceReturnWithBreak(block, null, "result", "label");
        assertNotNull(result);
    }

    private Node createFunctionWithBody() {
        Node fn = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(Node.newNumber(42));
        block.addChildToBack(ret);
        fn.addChildToBack(block);
        return fn;
    }

    private Node createFunctionWithLoop() {
        Node fn = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        Node loop = new Node(Token.FOR);
        loop.addChildToBack(Node.newNumber(0));
        Node ret = new Node(Token.RETURN);
        ret.addChildToBack(Node.newNumber(10));
        loop.addChildToBack(ret);
        block.addChildToBack(loop);
        fn.addChildToBack(block);
        return fn;
    }

    private Node createCallNode() {
        Node call = new Node(Token.CALL);
        call.addChildToFront(Node.newString("test"));
        return call;
    }

    private Node createFunctionWithModifiedParams() {
        Node fn = new Node(Token.FUNCTION);
        Node block = new Node(Token.BLOCK);
        Node ret = new Node(Token.RETURN);
        Node arg = new Node(Token.NAME, "arg1");
        ret.addChildToBack(arg);
        block.addChildToBack(ret);
        fn.addChildToBack(block);
        return fn;
    }

    private Node createCallNodeWithMatchingArgs() {
        Node call = new Node(Token.CALL);
        call.addChildToFront(new Node(Token.NAME, "arg1"));
        return call;
    }
}