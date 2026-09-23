package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeInfo;
import com.google.javascript.rhino.TokenType;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import java.util.*;

public class TypeCheckTest {
    private TypeCheck typeCheck;
    private Compiler compiler;
    private JSTypeRegistry registry;
    private Node externsRoot;
    private Node jsRoot;
    private Scope topScope;

    @Before
    public void setUp() {
        compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        registry = compiler.getTypeRegistry();
        typeCheck = new TypeCheck(compiler);
        externsRoot = new Node(Token.SCRIPT);
        jsRoot = new Node(Token.SCRIPT);
    }

    @After
    public void tearDown() {
        typeCheck = null;
        compiler = null;
        registry = null;
    }

    @Test
    public void testProcessWithNullExterns() {
        typeCheck.process(null, new Node(Token.SCRIPT));
        assertNotNull(typeCheck);
    }

    @Test
    public void testProcessWithNullJsRoot() {
        typeCheck.process(new Node(Token.SCRIPT), null);
        assertNotNull(typeCheck);
    }

    @Test
    public void testProcessValidInputs() {
        Node jsRoot = new Node(Token.BLOCK);
        jsRoot.addChildToFront(new Node(Token.EMPTY));
        typeCheck.process(externsRoot, jsRoot);
        assertNotNull(typeCheck);
    }

    @Test
    public void testProcessForTesting() {
        Node jsRoot = new Node(Token.BLOCK);
        jsRoot.addChildToFront(new Node(Token.EMPTY));
        Scope scope = typeCheck.processForTesting(externsRoot, jsRoot);
        assertNotNull(scope);
    }

    @Test
    public void testCheckWithNoTypeCheckInfo() {
        Node node = new Node(Token.EMPTY);
        typeCheck.check(node, false);
        assertNotNull(typeCheck);
    }

    @Test
    public void testShouldTraverseWithNullNode() {
        assertTrue(typeCheck.shouldTraverse(null, null, null));
    }

    @Test
    public void testShouldTraverseWithEmptyFunctionPrivateName() {
        Node n = new Node(Token.FUNCTION);
        n.putProp(Node.SOURCENAME_PROP, "");
        assertTrue(typeCheck.shouldTraverse(null, n, null));
    }

    @Test
    public void testShouldTraverseWithFunctionPrivateName() {
        Node n = new Node(Token.FUNCTION);
        n.putProp(Node.SOURCENAME_PROP, "name");
        assertTrue(typeCheck.shouldTraverse(null, n, null));
    }

    @Test
    public void testVisitNameNode() {
        Node nameNode = new Node(Token.NAME, "test");
        typeCheck.visit(null, nameNode, new Node(Token.EXPR_RESULT));
    }

    @Test
    public void testVisitEmptyNode() {
        Node emptyNode = new Node(Token.EMPTY);
        typeCheck.visit(null, emptyNode, null);
    }

    @Test
    public void testVisitNumberNode() {
        Node numberNode = new Node(Token.NUMBER);
        numberNode.setDouble(1.5);
        typeCheck.visit(null, numberNode, null);
    }

    @Test
    public void testVisitStringNode() {
        Node stringNode = new Node(Token.STRING);
        stringNode.setString("hello");
        typeCheck.visit(null, stringNode, new Node(Token.NAME));
    }

    @Test
    public void testVisitNamedTypeNode() {
        Node namedType = new Node(Token.NAME);
        namedType.setString("myName");
        namedType.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        typeCheck.visit(null, namedType, null);
    }

    @Test
    public void testVisitTypeofNode() {
        Node typeofNode = new Node(Token.TYPEOF);
        Node child = new Node(Token.NAME);
        child.setString("x");
        typeofNode.addChildToFront(child);
        typeCheck.visit(null, typeofNode, null);
    }

    @Test
    public void testVisitIncDecNode() {
        Node incNode = new Node(Token.INC);
        incNode.addChildToFront(new Node(Token.NAME));
        typeCheck.visit(null, incNode, null);
    }

    @Test
    public void testVisitNotNode() {
        Node notNode = new Node(Token.NOT);
        typeCheck.visit(null, notNode, null);
    }

    @Test
    public void testVisitHoistDeclarationNode() {
        Node varNode = new Node(Token.VAR);
        typeCheck.visit(null, varNode, null);
    }

    @Test
    public void testVisitTrueFalseNode() {
        Node trueNode = new Node(Token.TRUE);
        typeCheck.visit(null, trueNode, null);
        Node falseNode = new Node(Token.FALSE);
        typeCheck.visit(null, falseNode, null);
    }

    @Test
    public void testVisitThisNode() {
        Node thisNode = new Node(Token.THIS);
        typeCheck.visit(null, thisNode, null);
    }

    @Test
    public void testVisitRequireNode() {
        Node requireNode = new Node(Token.NAME);
        requireNode.setString("require");
        typeCheck.visit(null, requireNode, null);
    }

    @Test
    public void testVisitGetPropNode() {
        Node getProp = new Node(Token.GETPROP);
        Node object = new Node(Token.NAME);
        object.setString("obj");
        Node prop = new Node(Token.STRING);
        prop.setString("prop");
        getProp.addChildrenToFront(object);
        getProp.addChildrenToFront(prop);
        typeCheck.visit(null, getProp, null);
    }

    @Test
    public void testVisitGetElemNode() {
        Node getElem = new Node(Token.GETELEM);
        Node object = new Node(Token.NAME);
        object.setString("arr");
        Node index = new Node(Token.NUMBER);
        index.setDouble(0);
        getElem.addChildrenToFront(object);
        getElem.addChildrenToFront(index);
        typeCheck.visit(null, getElem, null);
    }

    @Test
    public void testGetJSTypeWithNull() {
        assertNotNull(typeCheck.getJSType(null));
    }

    @Test
    public void testGetJSTypeWithNullType() throws Exception {
        Node n = new Node(Token.NAME);
        assertNotNull(typeCheck.getJSType(n));
    }

    @Test
    public void testGetJSTypeWithNonNullType() {
        Node n = new Node(Token.NUMBER);
        n.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        JSType result = typeCheck.getJSType(n);
        assertNotNull(result);
    }

    @Test
    public void testGetNativeTypeWithValidTypeId() {
        JSType result = typeCheck.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNotNull(result);
    }

    @Test
    public void testGetNativeTypeWithNull() {
        JSType result = typeCheck.getNativeType(null);
        assertNull(result);
    }

    @Test
    public void testGetNativeTypeWithUnknownType() {
        JSType result = typeCheck.getNativeType(JSTypeNative.UKNOWN_TYPE);
        assertNull(result);
    }
}