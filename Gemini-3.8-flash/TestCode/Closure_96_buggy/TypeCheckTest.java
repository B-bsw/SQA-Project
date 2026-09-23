package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;

public class TypeCheckTest {
    private TypeCheck typeCheck;
    private AbstractCompiler compiler;
    private JSTypeRegistry registry;
    private Node externsRoot;
    private Node jsRoot;
    private NodeTraversal traversal;
    private Scope topScope;

    private static class DummyTypeCheck extends TypeCheck {
        public DummyTypeCheck(AbstractCompiler compiler) {
            super(compiler);
        }
        
        @Override
        public void report(NodeTraversal t, Node n, DiagnosticType diagnosticType, String... arguments) {
            // Override to capture errors without failing
            lastReportedNode = n;
            lastDiagnosticType = diagnosticType;
            lastArguments = arguments;
        }
        
        @Override
        public void report(NodeTraversal t, Node n, CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
            lastReportedNode = n;
            lastDiagnosticType = diagnosticType;
            lastArguments = arguments;
        }
        
        public Node lastReportedNode;
        public DiagnosticType lastDiagnosticType;
        public String[] lastArguments;
    }
    
    private DummyTypeCheck dummyTypeCheck;
    
    @Before
    public void setUp() {
        compiler = new AbstractCompiler() {
            @Override
            public void process(Node externsRoot, Node jsRoot) {
                // no-op
            }
        };
        
        registry = new JSTypeRegistry();
        typeCheck = new TypeCheck(compiler);
        dummyTypeCheck = new DummyTypeCheck(compiler);
        externsRoot = new Node(Token.EMPTY);
        jsRoot = new Node(Token.EMPTY);
        traversal = new NodeTraversal(null, dummyTypeCheck);
    }
    
    @After
    public void tearDown() {
        typeCheck = null;
        dummyTypeCheck = null;
        compiler = null;
        registry = null;
    }
    
    @Test
    public void testConstructor() {
        assertNotNull(typeCheck);
        assertNotNull(dummyTypeCheck);
    }
    
    @Test
    public void testProcessWithNullExternsRoot() {
        try {
            typeCheck.process(null, jsRoot);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testProcessWithNullJsRoot() {
        try {
            typeCheck.process(externsRoot, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testProcessWithValidRoots() {
        jsRoot.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        typeCheck.process(externsRoot, jsRoot);
    }
    
    @Test
    public void testProcessForTesting() {
        Scope scope = typeCheck.processForTesting(externsRoot, jsRoot);
        assertNotNull(scope);
    }
    
    @Test
    public void testCheckWithNullNode() {
        try {
            typeCheck.check(null, false);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testCheckWithEmptyNode() {
        Node node = new Node(Token.EMPTY);
        typeCheck.check(node, false);
    }
    
    @Test
    public void testShouldTraverseWithNullNode() {
        assertTrue(typeCheck.shouldTraverse(null, null, null));
    }
    
    @Test
    public void testShouldTraverseWithNameNode() {
        Node nameNode = Node.newString(Token.NAME, "test");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertTrue(typeCheck.shouldTraverse(null, nameNode, null));
    }
    
    @Test
    public void testVisitWithNameNodeNoParent() {
        Node nameNode = Node.newString(Token.NAME, "test");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        typeCheck.visit(traversal, nameNode, null);
        // Should not throw
    }
    
    @Test
    public void testVisitWithNumberNode() {
        Node numberNode = Node.newNumber(5.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(numberNode);
        typeCheck.visit(traversal, numberNode, parent);
    }
    
    @Test
    public void testVisitWithStringNode() {
        Node stringNode = Node.newString(Token.STRING, "abc");
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node parent = new Node(Token.EXPR_RESULT);
        parent.addChildToFront(stringNode);
        typeCheck.visit(traversal, stringNode, parent);
    }
    
    @Test
    public void testVisitWithTrueNode() {
        Node trueNode = new Node(Token.TRUE);
        trueNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(traversal, trueNode, null);
    }
    
    @Test
    public void testVisitWithFalseNode() {
        Node falseNode = new Node(Token.FALSE);
        falseNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(traversal, falseNode, null);
    }
    
    @Test
    public void testVisitWithNullNodeValue() {
        Node nullNode = new Node(Token.NULL);
        nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));
        typeCheck.visit(traversal, nullNode, null);
    }
    
    @Test
    public void testVisitWithEqualsNode() {
        Node left = Node.newString(Token.NAME, "a");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node right = Node.newString(Token.NAME, "b");
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node eqNode = new Node(Token.EQ, left, right);
        eqNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(traversal, eqNode, null);
    }
    
    @Test
    public void testVisitWithNeNode() {
        Node left = Node.newString(Token.NAME, "a");
        left.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node right = Node.newString(Token.NAME, "b");
        right.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node neNode = new Node(Token.NE, left, right);
        neNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(traversal, neNode, null);
    }
    
    @Test
    public void testVisitWithSheqNode() {
        Node left = Node.newString(Token.NAME, "a");
        left.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node right = Node.newString(Token.NAME, "b");
        right.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        Node sheqNode = new Node(Token.SHEQ, left, right);
        sheqNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        typeCheck.visit(traversal, sheqNode, null);
    }
    
    @Test
    public void testVisitWithObjectLit() {
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        typeCheck.visit(traversal, objLit, null);
    }
    
    @Test
    public void testVisitWithPropNameInExterns() {
        Node nameNode = Node.newString(Token.NAME, "prop");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        dummyTypeCheck.visit(traversal, nameNode, null);
        // Should not throw - verifies no NPE with null parent
    }
}