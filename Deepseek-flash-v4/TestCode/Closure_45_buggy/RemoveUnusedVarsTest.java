package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

@RunWith(JUnit4.class)
public class RemoveUnusedVarsTest {

    private RemoveUnusedVars removeUnusedVars;
    private AbstractCompiler compiler;
    private Node externs;
    private Node root;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        externs = new Node(Token.EMPTY);
        root = new Node(Token.SCRIPT);
        removeUnusedVars = new RemoveUnusedVars(compiler, true, false, true);
    }

    @Test
    public void testRemoveGlobalVarUnreferenced() {
        Node varNode = createVarNode("unused", Token.STRING);
        root.addChildToBack(varNode);
        removeUnusedVars.process(externs, root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testPreserveReferencedGlobalVar() {
        Node varNode = createVarNode("used", Token.STRING);
        root.addChildToBack(varNode);
        removeUnusedVars.process(externs, root);
        assertEquals(1, root.getChildCount());
        assertNotNull(root.getFirstChild().getString());
    }

    @Test
    public void testRemoveUnusedFunction() {
        Node function = createFunction("unusedFn", Token.EMPTY);
        root.addChildToBack(function);
        removeUnusedVars.process(externs, root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testPreserveUsedFunction() {
        Node function = createFunction("usedFn", Token.EMPTY);
        root.addChildToBack(function);
        removeUnusedVars.process(externs, root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testNullExterns() {
        removeUnusedVars = new RemoveUnusedVars(compiler, false, false, false);
        removeUnusedVars.process(null, new Node(Token.SCRIPT));
    }

    @Test(expected = NullPointerException.class)
    public void testNullRoot() {
        removeUnusedVars.process(externs, null);
    }

    @Test
    public void testEmptyRoot() {
        removeUnusedVars.process(externs, new Node(Token.SCRIPT));
    }

    @Test
    public void testArgumentsReferenced() {
        Node function = new Node(Token.FUNCTION);
        Node name = Node.newString(Token.NAME, "fn");
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(name);
        function.addChildToBack(params);
        function.addChildToBack(body);

        Node arg = Node.newString(Token.NAME, "arg1");
        params.addChildToBack(arg);

        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString(Token.NAME, "arguments"));
        body.addChildToBack(call);

        root.addChildToBack(function);
        removeUnusedVars.process(externs, root);
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testRemoveArgFromCallSites() {
        Node function = createFunction("fn", Token.NAME);
        Node call = new Node(Token.CALL);
        call.addChildToBack(Node.newString(Token.NAME, "fn"));
        call.addChildToBack(Node.newString(Token.STRING, "arg"));
        root.addChildToBack(call);
        removeUnusedVars.process(externs, root);
    }

    @Test
    public void testInterpretAssigns() {
        Node varNode = createVarNode("a", Token.STRING);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(Node.newString(Token.NAME, "a"));
        assign.addChildToBack(Node.newString(Token.STRING, "value"));
        varNode.addChildToBack(assign);
        root.addChildToBack(varNode);
        removeUnusedVars.process(externs, root);
    }

    @Test
    public void testRemoveGlobalVarWithNoReferences() {
        Node varNode = createVarNode("v", Token.STRING);
        root.addChildToBack(varNode);
        removeUnusedVars = new RemoveUnusedVars(compiler, true, false, false);
        removeUnusedVars.process(externs, root);
        assertEquals(0, root.getChildCount());
    }

    @Test
    public void testIsRemovableVar() {
        Node varNode = createVarNode("v", Token.STRING);
        root.addChildToBack(varNode);
        removeUnusedVars = new RemoveUnusedVars(compiler, false, false, false);
        removeUnusedVars.process(externs, root);
    }

    @Test
    public void testPreserveExportedVar() {
        Node varNode = createVarNode("exported", Token.STRING);
        root.addChildToBack(varNode);
        compiler = new TestCompiler() {
            @Override
            public CodingConvention getCodingConvention() {
                return new CodingConvention() {
                    @Override
                    public boolean isExported(String name) {
                        return name.startsWith("exported");
                    }
                };
            }
        };
        removeUnusedVars = new RemoveUnusedVars(compiler, true, false, false);
        removeUnusedVars.process(externs, root);
        assertEquals(1, root.getChildCount());
    }

    private Node createVarNode(String name, int tokenType) {
        Node varNode = new Node(Token.VAR);
        Node nameNode = Node.newString(Token.NAME, name);
        Node value = new Node(tokenType);
        nameNode.addChildToBack(value);
        varNode.addChildToBack(nameNode);
        return varNode;
    }

    private Node createFunction(String name, int tokenType) {
        Node function = new Node(Token.FUNCTION);
        Node nameNode = Node.newString(Token.NAME, name);
        Node params = new Node(Token.PARAM_LIST);
        Node body = new Node(Token.BLOCK);
        function.addChildToBack(nameNode);
        function.addChildToBack(params);
        function.addChildToBack(body);
        return function;
    }

    private static class TestCompiler extends AbstractCompiler {
        @Override
        public void reportCodeChange() {
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new CodingConvention() {
                @Override
                public boolean isExported(String name) {
                    return false;
                }
            };
        }
    }
}