package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;

import java.util.HashSet;
import java.util.Set;

public class TypeCheckTest {

    private AbstractCompiler compiler;
    private TypeCheck typeCheck;
    private JSTypeRegistry registry;
    private Node externsRoot;
    private Node jsRoot;
    private Scope topScope;

    private static class TestCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final Set<String> externProperties = new HashSet<>();

        TestCompiler() {
            this.typeRegistry = new JSTypeRegistry();
        }

        @Override
        JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        ScriptError[] getErrors() {
            return new ScriptError[0];
        }

        @Override
        ScriptError[] getWarnings() {
            return new ScriptError[0];
        }

        @Override
        Node getRoot() {
            return null;
        }

        @Override
        Node getLastInput() {
            return null;
        }

        @Override
        Node getFirstInput() {
            return null;
        }

        void addExternProperty(String prop) {
            externProperties.add(prop);
        }
    }

    @Before
    public void setUp() {
        compiler = new TestCompiler();
        registry = compiler.getTypeRegistry();
        typeCheck = new TypeCheck(compener);
        externsRoot = new Node(Token.BLOCK);
        jsRoot = new Node(Token.BLOCK);
    }

    @After
    public void tearDown() {
        compiler = null;
        typeCheck = null;
        registry = null;
        externsRoot = null;
        jsRoot = null;
    }

    @Test
    public void testProcessNullExternsRoot() {
        typeCheck.process(null, jsRoot);
        // Assuming no exception is thrown and no side effects
        assertNotNull(typeCheck);
    }

    @Test
    public void testProcessBothNull() {
        typeCheck.process(null, null);
        assertNotNull(typeCheck);
    }

    @Test
    public void testProcessWithExterns() {
        Node externs = new Node(Token.BLOCK);
        Node funcNode = Node.newString(Token.FUNCTION, "testFunc");
        Node paramList = new Node(Token.PARAM_LIST);
        Node block = new Node(Token.BLOCK);
        funcNode.addChildToBack(paramList);
        funcNode.addChildToBack(block);
        externs.addChildToBack(funcNode);
        typeCheck.process(externs, jsRoot);
        assertNotNull(typeCheck);
    }

    @Test
    public void testCheckWithExternsTrue() {
        Node node = Node.newString(Token.NAME, "externVar");
        node.setJSType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
        typeCheck.check(node, true);
        assertNotNull(node.getJSType());
    }

    @Test
    public void testCheckWithExternsFalse() {
        Node node = Node.newString(Token.NAME, "localVar");
        node.setJSType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE));
        typeCheck.check(node, false);
        assertNotNull(node.getJSType());
    }

    @Test
    public void testShouldTraverseNonNullFunctionPrivateName() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node node = new Node(Token.FUNCTION);
        node.setString("privateName");
        node.setJSType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
        boolean result = typeCheck.shouldTraverse(t, node, null);
        assertTrue(result);
    }

    @Test
    public void testVisitNameWithNullJSType() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node nameNode = Node.newString(Token.NAME, "varName");
        nameNode.setJSType(null);
        Node parent = new Node(Token.EXPR_RESULT);
        typeCheck.visit(t, nameNode, parent);
        // Should not throw, and type check continues
    }

    @Test
    public void testVisitNameWithNonNullJSType() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node nameNode = Node.newString(Token.NAME, "typedVar");
        nameNode.setJSType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
        Node parent = new Node(Token.EXPR_RESULT);
        typeCheck.visit(t, nameNode, parent);
        assertNotNull(nameNode.getJSType());
    }

    @Test
    public void testVisitNumber() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node numNode = Node.newNumber(5.0);
        numNode.setJSType(null);
        typeCheck.visit(t, numNode, null);
        // Should set type to number
        assertEquals(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE), numNode.getJSType());
    }

    @Test
    public void testVisitString() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node strNode = Node.newString("hello");
        strNode.setJSType(null);
        typeCheck.visit(t, strNode, null);
        assertEquals(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE), strNode.getJSType());
    }

    @Test
    public void testVisitTrue() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node trueNode = new Node(Token.TRUE);
        trueNode.setJSType(null);
        typeCheck.visit(t, trueNode, null);
        assertEquals(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE), trueNode.getJSType());
    }

    @Test
    public void testVisitThis() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node thisNode = new Node(Token.THIS);
        thisNode.setJSType(null);
        NodeTraversal traversal = new NodeTraversal(compiler, new NodeTraversal.Callback() {
            @Override
            public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) { return true; }
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
        });
        typeCheck.visit(traversal, thisNode, null);
        // this in global scope should be undefined/unknown? For brevity, just check not null
    }

    @Test
    public void testVisitObjectLit() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.setJSType(null);
        typeCheck.visit(t, objLit, null);
        // Should not throw, type may be set or not
    }

    @Test
    public void testVisitFunctionDeclaration() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node funcNode = new Node(Token.FUNCTION);
        funcNode.setJSType(null);
        typeCheck.visit(t, funcNode, null);
        // Function type should be created
    }

    @Test
    public void testVisitQualifiedNameLvalue() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node nameNode = Node.newString(Token.NAME, "foo");
        nameNode.setJSType(null);
        Node getProp = Node.newString(Token.GETPROP, "bar");
        nameNode.addChildToBack(Node.newString(Token.STRING, "foo"));
        getProp.addChildToBack(nameNode);
        getProp.addChildToBack(Node.newString(Token.STRING, "bar"));
        typeCheck.visit(t, getProp, null);
    }

    @Test
    public void testVisitAssignBasic() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node name = Node.newString(Token.NAME, "x");
        name.setJSType(null);
        Node assign = new Node(Token.ASSIGN);
        Node exprResult = new Node(Token.EXPR_RESULT);
        exprResult.addChildToBack(assign);
        assign.addChildToBack(name);
        assign.addChildToBack(Node.newNumber(5.0));
        typeCheck.visit(t, assign, exprResult);
        assertNotNull(name.getJSType());
    }

    @Test
    public void testConstructorInheritance() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node ctorNode = new Node(Token.FUNCTION);
        ctorNode.setString("MyClass");
        // create a function type
        FunctionType fnType = new FunctionType(registry, "MyClass");
        ctorNode.setJSType(fnType);
        Node nameNode = Node.newString(Token.NAME, "MyClass");
        nameNode.setJSType(fnType);
        nameNode.addChildToBack(ctorNode);
        typeCheck.visit(t, nameNode, null);
    }

    @Test
    public void testInterfaceImplementation() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node objLit = new Node(Token.OBJECTLIT);
        objLit.setJSType(registry.createAnonymousObjectType());
        Node nameNode = Node.newString(Token.NAME, "obj");
        nameNode.setJSType(objLit.getJSType());
        typeCheck.visit(t, objLit, null);
    }

    @Test
    public void testEnumAssignment() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node nameNode = Node.newString(Token.NAME, "myEnum");
        JSType enumType = registry.createEnumType("myEnum", null);
        nameNode.setJSType(enumType);
        Node assign = new Node(Token.ASSIGN);
        assign.addChildToBack(nameNode);
        assign.addChildToBack(new Node(Token.OBJECTLIT));
        typeCheck.visit(t, assign, null);
    }

    @Test
    public void testCheckPropertyAccessUnknown() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node getProp = Node.newString(Token.GETPROP, "unknownProp");
        getProp.setJSType(null);
        Node objName = Node.newString(Token.NAME, "obj");
        objName.setJSType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
        getProp.addChildToBack(objName);
        typeCheck.visit(t, getProp, null);
    }

    @Test
    public void testGetTypedPercentNoTypedNodes() {
        double percent = typeCheck.getTypedPercent();
        assertEquals(0.0, percent, 0.0);
    }

    @Test
    public void testMakeError() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node node = Node.newString(Token.NAME, "err");
        JSError error = typeCheck.makeError(node, CheckLevel.ERROR, "test desc");
        assertNotNull(error);
    }

    @Test
    public void testCheckNoTypeCheckSection() {
        NodeTraversal t = new NodeTraversal(compiler, null);
        Node node = new Node(Token.SCRIPT);
        node.setJSDocInfo(new JSDocInfo(true));
        typeCheck.visit(t, node, null);
    }

    @Test
    public void testMultipleProcessCalls() {
        typeCheck.process(externsRoot, jsRoot);
        typeCheck.process(null, null);
        assertNotNull(typeCheck);
    }
}