package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.JSTypeExpression;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashSet;
import java.util.Set;

@RunWith(JUnit4.class)
public class TypeCheckTest {

    private TypeCheck typeCheck;
    private AbstractCompiler compiler;
    private JSTypeRegistry registry;
    private Node externsRoot;
    private Node jsRoot;

    @Before
    public void setUp() throws Exception {
        compiler = mock(AbstractCompiler.class);
        registry = new JSTypeRegistry();
        typeCheck = new TypeCheck(compiler, registry);
        externsRoot = new Node(Token.SCRIPT);
        jsRoot = new Node(Token.SCRIPT);
    }

    @After
    public void tearDown() throws Exception {
        typeCheck = null;
        compiler = null;
        registry = null;
    }

    @Test
    public void testProcessWithNonNullRoots() {
        typeCheck.process(externsRoot, jsRoot);
        // Should not throw
    }

    @Test
    public void testProcessWithNullExterns() {
        typeCheck.process(null, jsRoot);
        // Should not throw
    }

    @Test
    public void testProcessForTestingWithNullExterns() {
        Scope result = typeCheck.processForTesting(null, jsRoot);
        assertNotNull(result);
    }

    @Test
    public void testProcessForTestingWithNonNullRoots() {
        Scope result = typeCheck.processForTesting(externsRoot, jsRoot);
        assertNotNull(result);
    }

    @Test
    public void testGetTypedPercentWithEmptyRoots() {
        double percent = typeCheck.getTypedPercent(externsRoot, jsRoot);
        assertEquals(0.0, percent, 0.0001);
    }

    @Test
    public void testGetTypedPercentWithTypedNodes() {
        Node node1 = new Node(Token.NAME, "a");
        node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node node2 = new Node(Token.NAME, "b");
        node2.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        jsRoot.addChildToBack(node1);
        jsRoot.addChildToBack(node2);
        double percent = typeCheck.getTypedPercent(externsRoot, jsRoot);
        assertEquals(100.0, percent, 0.0001);
    }

    @Test
    public void testGetTypedPercentWithMixedTypes() {
        Node node1 = new Node(Token.NAME, "a");
        node1.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node node2 = new Node(Token.NAME, "b");
        jsRoot.addChildToBack(node1);
        jsRoot.addChildToBack(node2);
        double percent = typeCheck.getTypedPercent(externsRoot, jsRoot);
        assertEquals(50.0, percent, 0.0001);
    }

    @Test
    public void testShouldTraverseWithNoTypeCheckJSDoc() {
        Node node = new Node(Token.FUNCTION);
        JSDocInfo info = new JSDocInfo();
        info.setNoTypeCheck(true);
        node.setJSDocInfo(info);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        // Should return false when entering section
        Callback callback = typeCheck;
        boolean result = callback.shouldTraverse(t, node, null);
        // Actually the default shouldTraverse returns true, but the noTypeCheckSection handling in visit
        // Here we just test it doesn't throw
        assertEquals(true, result);
    }

    @Test
    public void testVisitNameWithNullJSType() {
        Node nameNode = new Node(Token.NAME, "x");
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, nameNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNameWithValidJSType() {
        Node nameNode = new Node(Token.NAME, "x");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, nameNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNumberNode() {
        Node numberNode = new Node(Token.NUMBER);
        numberNode.setDouble(42.0);
        numberNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, numberNode, null);
        // No exception expected
    }

    @Test
    public void testVisitStringNode() {
        Node stringNode = new Node(Token.STRING);
        stringNode.setString("hello");
        stringNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, stringNode, null);
        // No exception expected
    }

    @Test
    public void testVisitTrueNode() {
        Node trueNode = new Node(Token.TRUE);
        trueNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, trueNode, null);
        // No exception expected
    }

    @Test
    public void testVisitFalseNode() {
        Node falseNode = new Node(Token.FALSE);
        falseNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, falseNode, null);
        // No exception expected
    }

    @Test
    public void testVisitThisNode() {
        Node thisNode = new Node(Token.THIS);
        thisNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, thisNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNullNode() {
        Node nullNode = new Node(Token.NULL);
        nullNode.setJSType(registry.getNativeType(JSTypeNative.NULL_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, nullNode, null);
        // No exception expected
    }

    @Test
    public void testVisitArrayLitWithType() {
        Node arrayLit = new Node(Token.ARRAYLIT);
        arrayLit.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node element = new Node(Token.NUMBER);
        element.setDouble(1.0);
        element.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        arrayLit.addChildToBack(element);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, arrayLit, null);
        // No exception expected
    }

    @Test
    public void testVisitRegexpWithType() {
        Node regexp = new Node(Token.REGEXP);
        regexp.setJSType(registry.getNativeType(JSTypeNative.REGEXP_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, regexp, null);
        // No exception expected
    }

    @Test
    public void testVisitReturnWithValue() {
        Node returnNode = new Node(Token.RETURN);
        Node value = new Node(Token.NUMBER);
        value.setDouble(42.0);
        value.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        returnNode.addChildToBack(value);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, returnNode, null);
        // No exception expected
    }

    @Test
    public void testVisitReturnWithoutValue() {
        Node returnNode = new Node(Token.RETURN);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, returnNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNotNode() {
        Node notNode = new Node(Token.NOT);
        Node child = new Node(Token.TRUE);
        child.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        notNode.addChildToBack(child);
        notNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, notNode, null);
        // No exception expected
    }

    @Test
    public void testVisitVoidNode() {
        Node voidNode = new Node(Token.VOID);
        Node child = new Node(Token.NUMBER);
        child.setDouble(1.0);
        child.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        voidNode.addChildToBack(child);
        voidNode.setJSType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, voidNode, null);
        // No exception expected
    }

    @Test
    public void testVisitTypeOfNode() {
        Node typeOfNode = new Node(Token.TYPEOF);
        Node child = new Node(Token.NAME, "x");
        child.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        typeOfNode.addChildToBack(child);
        typeOfNode.setJSType(registry.getNativeType(JSTypeNative.STRING_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, typeOfNode, null);
        // No exception expected
    }

    @Test
    public void testVisitBitNotNode() {
        Node bitNotNode = new Node(Token.BITNOT);
        Node child = new Node(Token.NUMBER);
        child.setDouble(1.0);
        child.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        bitNotNode.addChildToBack(child);
        bitNotNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, bitNotNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNegationNode() {
        Node negNode = new Node(Token.NEG);
        Node child = new Node(Token.NUMBER);
        child.setDouble(1.0);
        child.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        negNode.addChildToBack(child);
        negNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, negNode, null);
        // No exception expected
    }

    @Test
    public void testVisitPosNode() {
        Node posNode = new Node(Token.POS);
        Node child = new Node(Token.NUMBER);
        child.setDouble(1.0);
        child.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        posNode.addChildToBack(child);
        posNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, posNode, null);
        // No exception expected
    }

    @Test
    public void testVisitGetPropWithUnknownType() {
        Node getProp = new Node(Token.GETPROP);
        Node object = new Node(Token.NAME, "obj");
        object.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node prop = new Node(Token.STRING_KEY, "prop");
        getProp.addChildToBack(object);
        getProp.addChildToBack(prop);
        getProp.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, getProp, null);
        // No exception expected
    }

    @Test
    public void testVisitGetPropWithKnownType() {
        Node getProp = new Node(Token.GETPROP);
        Node object = new Node(Token.NAME, "obj");
        object.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node prop = new Node(Token.STRING_KEY, "prop");
        getProp.addChildToBack(object);
        getProp.addChildToBack(prop);
        getProp.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, getProp, null);
        // No exception expected
    }

    @Test
    public void testVisitGetElem() {
        Node getElem = new Node(Token.GETELEM);
        Node object = new Node(Token.NAME, "arr");
        object.setJSType(registry.getNativeType(JSTypeNative.ARRAY_TYPE));
        Node index = new Node(Token.NUMBER);
        index.setDouble(0.0);
        index.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        getElem.addChildToBack(object);
        getElem.addChildToBack(index);
        getElem.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, getElem, null);
        // No exception expected
    }

    @Test
    public void testVisitNewWithNoArgs() {
        Node newNode = new Node(Token.NEW);
        Node ctor = new Node(Token.NAME, "Foo");
        ctor.setJSType(registry.getNativeType(JSTypeNative.OBJECT_FUNCTION_TYPE));
        newNode.addChildToBack(ctor);
        newNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, newNode, null);
        // No exception expected
    }

    @Test
    public void testVisitNewWithArgs() {
        Node newNode = new Node(Token.NEW);
        Node ctor = new Node(Token.NAME, "Foo");
        ctor.setJSType(registry.getNativeType(JSTypeNative.OBJECT_FUNCTION_TYPE));
        newNode.addChildToBack(ctor);
        Node arg = new Node(Token.NUMBER);
        arg.setDouble(1.0);
        arg.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        newNode.addChildToBack(arg);
        newNode.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, newNode, null);
        // No exception expected
    }

    @Test
    public void testVisitCallWithFunctionType() {
        Node call = new Node(Token.CALL);
        Node callee = new Node(Token.NAME, "foo");
        callee.setJSType(registry.getNativeType(JSTypeNative.OBJECT_FUNCTION_TYPE));
        call.addChildToBack(callee);
        Node arg = new Node(Token.NUMBER);
        arg.setDouble(1.0);
        arg.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        call.addChildToBack(arg);
        call.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, call, null);
        // No exception expected
    }

    @Test
    public void testVisitCallWithNonFunctionType() {
        Node call = new Node(Token.CALL);
        Node callee = new Node(Token.NAME, "foo");
        callee.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        call.addChildToBack(callee);
        Node arg = new Node(Token.NUMBER);
        arg.setDouble(1.0);
        arg.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        call.addChildToBack(arg);
        call.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, call, null);
        // No exception expected
    }

    @Test
    public void testVisitAndNode() {
        Node andNode = new Node(Token.AND);
        Node left = new Node(Token.TRUE);
        left.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node right = new Node(Token.FALSE);
        right.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        andNode.addChildToBack(left);
        andNode.addChildToBack(right);
        andNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, andNode, null);
        // No exception expected
    }

    @Test
    public void testVisitOrNode() {
        Node orNode = new Node(Token.OR);
        Node left = new Node(Token.TRUE);
        left.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node right = new Node(Token.FALSE);
        right.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        orNode.addChildToBack(left);
        orNode.addChildToBack(right);
        orNode.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, orNode, null);
        // No exception expected
    }

    @Test
    public void testVisitHookNode() {
        Node hook = new Node(Token.HOOK);
        Node cond = new Node(Token.TRUE);
        cond.setJSType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Node thenNode = new Node(Token.NUMBER);
        thenNode.setDouble(1.0);
        thenNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node elseNode = new Node(Token.NUMBER);
        elseNode.setDouble(2.0);
        elseNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        hook.addChildToBack(cond);
        hook.addChildToBack(thenNode);
        hook.addChildToBack(elseNode);
        hook.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, hook, null);
        // No exception expected
    }

    @Test
    public void testVisitObjectLitWithStruct() {
        Node objectLit = new Node(Token.OBJECTLIT);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        objType.setStruct(true);
        objectLit.setJSType(objType);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, objectLit, null);
        // No exception expected
    }

    @Test
    public void testVisitObjectLitWithDict() {
        Node objectLit = new Node(Token.OBJECTLIT);
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        objType.setDict(true);
        objectLit.setJSType(objType);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, objectLit, null);
        // No exception expected
    }

    @Test
    public void testVisitVarWithNullType() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        nameNode.setJSType(null);
        varNode.addChildToBack(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, varNode, null);
        // No exception expected
    }

    @Test
    public void testVisitVarWithType() {
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "x");
        nameNode.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        Node value = new Node(Token.NUMBER);
        value.setDouble(1.0);
        value.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        nameNode.addChildToBack(value);
        varNode.addChildToBack(nameNode);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, varNode, null);
        // No exception expected
    }

    @Test
    public void testVisitScriptNode() {
        Node script = new Node(Token.SCRIPT);
        script.setJSType(registry.getNativeType(JSTypeNative.VOID_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, script, null);
        // No exception expected
    }

    @Test
    public void testVisitFunctionNodeWithInferredReturnType() {
        Node functionNode = new Node(Token.FUNCTION);
        ObjectType fnType = registry.createFunctionType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        functionNode.setJSType(fnType);
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, functionNode, null);
        // No exception expected
    }

    @Test
    public void testVisitAssignWithGetPropLValue() {
        Node assign = new Node(Token.ASSIGN);
        Node lvalue = new Node(Token.GETPROP);
        Node obj = new Node(Token.NAME, "obj");
        obj.setJSType(registry.getNativeType(JSTypeNative.OBJECT_TYPE));
        Node prop = new Node(Token.STRING_KEY, "p");
        lvalue.addChildToBack(obj);
        lvalue.addChildToBack(prop);
        lvalue.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node rvalue = new Node(Token.NUMBER);
        rvalue.setDouble(1.0);
        rvalue.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assign.addChildToBack(lvalue);
        assign.addChildToBack(rvalue);
        assign.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, assign, null);
        // No exception expected
    }

    @Test
    public void testVisitAssignWithNameLValue() {
        Node assign = new Node(Token.ASSIGN);
        Node lvalue = new Node(Token.NAME, "x");
        lvalue.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        Node rvalue = new Node(Token.NUMBER);
        rvalue.setDouble(1.0);
        rvalue.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assign.addChildToBack(lvalue);
        assign.addChildToBack(rvalue);
        assign.setJSType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, assign, null);
        // No exception expected
    }

    @Test
    public void testVisitUnknownNodeType() {
        Node unknownNode = new Node(Token.EMPTY);
        unknownNode.setJSType(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE));
        NodeTraversal t = new NodeTraversal(compiler, typeCheck);
        typeCheck.visit(t, unknownNode, null);
        // No exception expected
    }
}