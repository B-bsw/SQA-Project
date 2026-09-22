package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;

public class MakeDeclaredNamesUniqueTest {
    private MakeDeclaredNamesUnique renamer;
    private AbstractCompiler compiler;
    private Node rootNode;

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        renamer = new MakeDeclaredNamesUnique();
        rootNode = new Node(Token.ROOT);
    }

    @Test
    public void testConstructorWithDefaultRenamer() {
        assertNotNull(renamer);
    }

    @Test
    public void testConstructorWithCustomRenamer() {
        Renamer customRenamer = new TestRenamer();
        MakeDeclaredNamesUnique custom = new MakeDeclaredNamesUnique(customRenamer);
        assertNotNull(custom);
    }

    @Test
    public void testGetContextualRenameInverter() {
        CompilerPass pass = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
        assertNotNull(pass);
        assertTrue(pass instanceof MakeDeclaredNamesUnique.ContextualRenameInverter);
    }

    @Test
    public void testEnterAndExitGlobalScope() {
        NodeTraversal t = new NodeTraversal(compiler, rootNode);
        renamer.enterScope(t);
        assertFalse(renamer.nameStack.isEmpty());
        renamer.exitScope(t);
        assertTrue(renamer.nameStack.isEmpty());
    }

    @Test
    public void testShouldTraverseFunctionWithName() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "testFunc");
        functionNode.addChildToFront(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, rootNode);
        assertTrue(renamer.shouldTraverse(t, functionNode, null));
    }

    @Test
    public void testShouldTraverseFunctionWithEmptyName() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "");
        functionNode.addChildToFront(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, rootNode);
        assertTrue(renamer.shouldTraverse(t, functionNode, null));
    }

    @Test
    public void testShouldTraverseCatch() {
        Node catchNode = new Node(Token.CATCH);
        NodeTraversal t = new NodeTraversal(compiler, rootNode);
        assertTrue(renamer.shouldTraverse(t, catchNode, null));
    }

    @Test
    public void testVisitWithReferenceName() {
        Node nameNode = new Node(Token.NAME, "testRef");
        NodeTraversal t = new NodeTraversal(compiler, rootNode);
        renamer.visit(t, nameNode, null);
        assertTrue(renamer.referencedNames.contains("testRef"));
    }

    @Test
    public void testEnterNestedScopeWithFunction() {
        renamer.enterScope(new NodeTraversal(compiler, rootNode));
        
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "funcName");
        functionNode.addChildToFront(nameNode);
        Node parentNode = new Node(Token.SCRIPT);
        parentNode.addChildToFront(functionNode);
        
        Node paramNode = new Node(Token.NAME, "param1");
        functionNode.addChildToFront(paramNode);
        
        Node bodyNode = new Node(Token.BLOCK);
        functionNode.addChildToFront(bodyNode);
        
        NodeTraversal t = new NodeTraversal(compiler, functionNode);
        assertTrue(renamer.shouldTraverse(t, functionNode, parentNode));
    }

    @Test
    public void testGetReplacementNameNoMatch() {
        assertNull(renamer.getReplacementName("nonExistent"));
    }

    @Test
    public void testFindDeclaredNamesWithFunctions() {
        Node functionNode = new Node(Token.FUNCTION);
        Node nameNode = new Node(Token.NAME, "testFunc");
        functionNode.addChildToFront(nameNode);
        
        Node argNode = new Node(Token.NAME, "arg1");
        functionNode.addChildToFront(argNode);
        
        Node bodyNode = new Node(Token.BLOCK);
        functionNode.addChildToFront(bodyNode);
        
        renamer.findDeclaredNames(functionNode, null, renamer.rootRenamer);
    }

    @Test(expected = IllegalStateException.class)
    public void testContextualRenameInverterProcess() {
        MakeDeclaredNamesUnique.ContextualRenameInverter inverter = 
            (MakeDeclaredNamesUnique.ContextualRenameInverter) 
            MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
        inverter.process(null, rootNode);
    }

    @Test
    public void testGetOrginalNameWithSeparator() {
        String name = "original$$1";
        assertEquals("original", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name));
    }

    @Test
    public void testGetOrginalNameWithoutSeparator() {
        String name = "original";
        assertEquals("original", MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName(name));
    }

    @Test
    public void testHandleScopeVarWithExistingName() {
        // Setup test scope with variable
        Var var = new Var(null, new Node(Token.NAME, "test$$0"), null);
        Set<String> referenced = Sets.newHashSet();
        MakeDeclaredNamesUnique.ContextualRenameInverter inverter = 
            new MakeDeclaredNamesUnique.ContextualRenameInverter(compiler);
        inverter.referencedNames = referenced;
    }

    private class TestCompiler extends AbstractCompiler {
        @Override
        public void reportCodeChange() {}
        
        @Override
        public void reportChange() {}
        
        @Override
        public void report(LightweightMessageDiagnostic diagnostic) {}
        
        @Override
        public void report(SourceFile file, CheckLevel level, String message, String description, 
                          int lineno, int charno) {}
    }

    private class TestRenamer implements Renamer {
        @Override
        public void addDeclaredName(String name) {}
        
        @Override
        public String getReplacementName(String oldName) { return null; }
        
        @Override
        public boolean stripConstIfReplaced() { return false; }
        
        @Override
        public Renamer forChildScope() { return this; }
    }
}