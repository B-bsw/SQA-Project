package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class ReferenceCollectingCallbackTest {
    private ReferenceCollectingCallback callback;
    private Compiler compiler;
    private ReferenceCollectingCallback.ReferenceCollection collection;
    private ReferenceCollectingCallback.Reference reference;
    private Node nameNode;
    private Node parentNode;
    private Node grandparentNode;
    private ReferenceCollectingCallback.BasicBlock basicBlock;

    @Before
    public void setUp() {
        compiler = new Compiler();
        callback = new ReferenceCollectingCallback(compiler, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        nameNode = new Node(Token.NAME, "x");
        parentNode = new Node(Token.VAR);
        grandparentNode = new Node(Token.SCRIPT);
        parentNode.addChildToBack(nameNode);
        grandparentNode.addChildToBack(parentNode);
        basicBlock = new ReferenceCollectingCallback.BasicBlock(null, grandparentNode);
    }

    @Test
    public void testReferenceConstructor() {
        reference = new ReferenceCollectingCallback.Reference(nameNode, basicBlock, new Scope(null, null), new InputId("input"));
        assertNotNull(reference);
        assertEquals(nameNode, reference.getNode());
        assertNull(reference.getInputId());
        assertNull(reference.getSourceFile());
    }

    @Test
    public void testIsVarDeclaration() {
        reference = new ReferenceCollectingCallback.Reference(nameNode, basicBlock, null, null);
        assertTrue(reference.isVarDeclaration());
        assertTrue(reference.isInitializingDeclaration());
    }

    @Test
    public void testIsDeclarationWithVarParent() {
        reference = new ReferenceCollectingCallback.Reference(nameNode, basicBlock, null, null);
        assertTrue(reference.isDeclaration());
    }

    @Test
    public void testReferenceCollectionAddAndIterate() {
        collection = new ReferenceCollectingCallback.ReferenceCollection();
        assertEquals(0, collection.references.size());
        collection.add(reference);
        assertEquals(1, collection.references.size());
    }

    @Test
    public void testReferenceCollectionIsWellDefined() {
        collection = new ReferenceCollectingCallback.ReferenceCollection();
        assertFalse(collection.isWellDefined());
    }

    @Test
    public void testBasicBlockIsGlobalScope() {
        BasicBlock block = new ReferenceCollectingCallback.BasicBlock(null, grandparentNode);
        assertTrue(block.isGlobalScopeBlock());
        assertNull(block.getParent());
    }

    @Test
    public void testBasicBlockIsLoop() {
        Node forNode = new Node(Token.FOR);
        BasicBlock block = new ReferenceCollectingCallback.BasicBlock(null, forNode);
        assertTrue(block.isLoop);
    }

    @Test
    public void testBasicBlockIsNotLoop() {
        BasicBlock block = new ReferenceCollectingCallback.BasicBlock(null, grandparentNode);
        assertFalse(block.isLoop);
    }

    @Test
    public void testProvablyExecutesBefore() {
        BasicBlock block1 = new ReferenceCollectingCallback.BasicBlock(null, grandparentNode);
        BasicBlock block2 = new ReferenceCollectingCallback.BasicBlock(block1, grandparentNode);
        assertTrue(block1.provablyExecutesBefore(block2));
    }

    @Test
    public void testIsHoisted() {
        BasicBlock block = new ReferenceCollectingCallback.BasicBlock(null, grandparentNode);
        assertFalse(block.isHoisted);
    }

    @Test
    public void testHotSwapScript() {
        Compiler c = new Compiler();
        ReferenceCollectingCallback cb = new ReferenceCollectingCallback(c, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node scriptRoot = new Node(Token.SCRIPT);
        cb.hotSwapScript(scriptRoot, null);
    }

    @Test
    public void testProcess() {
        Compiler c = new Compiler();
        ReferenceCollectingCallback cb = new ReferenceCollectingCallback(c, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        Node externs = new Node(Token.EMPTY);
        Node root = new Node(Token.SCRIPT);
        cb.process(externs, root);
    }

    @Test
    public void testGetAllSymbols() {
        Compiler c = new Compiler();
        ReferenceCollectingCallback cb = new ReferenceCollectingCallback(c, ReferenceCollectingCallback.DO_NOTHING_BEHAVIOR);
        assertNotNull(cb.getAllSymbols());
        assertFalse(cb.getAllSymbols().iterator().hasNext());
    }

    @Test
    public void testVisitNameNode() {
        Node nameNode = new Node(Token.NAME, "x");
        Node parent = new Node(Token.VAR);
        NodeTraversal t = new NodeTraversal(compiler, callback);
        callback.visit(t, nameNode, parent);
    }

    @Test
    public void testEnterExitScope() {
        Node scriptRoot = new Node(Token.SCRIPT);
        Scope scope = new Scope(scriptRoot);
        NodeTraversal t = new NodeTraversal(compiler, callback);
        callback.enterScope(t);
        callback.exitScope(t);
    }

    @Test
    public void testShouldTraverse() {
        Node n = new Node(Token.NAME);
        Node parent = new Node(Token.SCRIPT);
        NodeTraversal t = new NodeTraversal(compiler, callback);
        assertTrue(callback.shouldTraverse(t, n, parent));
        assertFalse(blockStack.isEmpty());
    }

    private static class BasicBlock extends ReferenceCollectingCallback.BasicBlock {
        public BasicBlock(BasicBlock parent, Node root) {
            super(parent, root);
        }
    }
}