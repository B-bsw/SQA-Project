package com.google.javascript.rhino.jstype;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;
public class FunctionTypeTest {
    private JSTypeRegistry registry;
    @Before
    public void setUp() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override public void warning(String message) {}
            @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override public void error(String message) {}
            @Override public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(reporter);
    }
    private Node createParamNode(String name, boolean optional, boolean varArgs, JSType type) {
        Node param = Node.newString(Token.NAME, name);
        param.setJSType(type);
        if (optional) param.setOptionalArg(true);
        if (varArgs) param.setVarArgs(true);
        return param;
    }
    private Node makeParams(Node... children) {
        Node lp = new Node(Token.LP);
        for (Node child : children) lp.addChildToBack(child);
        return lp;
    }
    private FunctionType createOrdinary(Node params, JSType returnType) {
        ArrowType arrow = new ArrowType(registry, params, returnType);
        return new FunctionType(registry, "testFunc", null, arrow,
                registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), null, false, false);
    }
    private FunctionType createConstructor(Node params, JSType returnType) {
        ArrowType arrow = new ArrowType(registry, params, returnType);
        return new FunctionType(registry, "TestCtor", null, arrow, null, null, true, false);
    }
    @Test
    public void testOrdinaryFunctionKind() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(func.isOrdinaryFunction());
        assertFalse(func.isConstructor());
        assertFalse(func.isInterface());
        assertTrue(func.isFunctionType());
        assertTrue(func.canBeCalled());
    }
    @Test
    public void testConstructorKind() {
        FunctionType ctor = createConstructor(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isOrdinaryFunction());
        assertFalse(ctor.isInterface());
        assertTrue(ctor.hasInstanceType());
        assertNotNull(ctor.getInstanceType());
    }
    @Test
    public void testInterfaceKind() {
        FunctionType iface = FunctionType.forInterface(registry, "MyInterface", null);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
        assertEquals("MyInterface", iface.getReferenceName());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorInvalidSource() {
        Node invalidSource = new Node(Token.SCRIPT);
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        new FunctionType(registry, "bad", invalidSource, arrow,
                registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), null, false, false);
    }
    @Test
    public void testGetMinArguments() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node p1 = createParamNode("a", false, false, numType);
        Node p2 = createParamNode("b", true, false, numType);
        Node params1 = makeParams(p1, p2);
        FunctionType func1 = createOrdinary(params1, numType);
        assertEquals(1, func1.getMinArguments());
        Node pAllOpt = createParamNode("x", true, false, numType);
        Node params2 = makeParams(pAllOpt);
        FunctionType func2 = createOrdinary(params2, numType);
        assertEquals(0, func2.getMinArguments());
    }
    @Test
    public void testGetMaxArguments() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        Node p1 = createParamNode("a", false, false, numType);
        Node p2 = createParamNode("b", false, true, numType);
        Node paramsVar = makeParams(p1, p2);
        FunctionType funcVar = createOrdinary(paramsVar, numType);
        assertEquals(Integer.MAX_VALUE, funcVar.getMaxArguments());
        Node paramsNoVar = makeParams(p1);
        FunctionType funcNoVar = createOrdinary(paramsNoVar, numType);
        assertEquals(1, funcNoVar.getMaxArguments());
    }
    @Test
    public void testSetPrototype() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertFalse(func.setPrototype(null));
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, func, null, false);
        assertTrue(func.setPrototype(proto));
        assertSame(proto, func.getPrototype());
    }
    @Test
    public void testPropertyRelated() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(func.hasProperty("prototype"));
        assertTrue(func.hasOwnProperty("prototype"));
        assertNotNull(func.getPropertyType("prototype"));
        assertNotNull(func.getPropertyType("call"));
        assertNotNull(func.getPropertyType("apply"));
    }
    @Test
    public void testDefineProperty() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ObjectType objType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        assertTrue(func.defineProperty("prototype", objType, false, false));
        assertTrue(func.defineProperty("prototype", objType, false, false));
        assertFalse(func.defineProperty("prototype", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false));
    }
    @Test
    public void testIsEquivalentTo() {
        FunctionType func1 = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(func1.isEquivalentTo(func1));
        FunctionType func2 = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.STRING_TYPE));
        assertFalse(func1.isEquivalentTo(func2));
        FunctionType ctor1 = createConstructor(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType ctor2 = createConstructor(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertFalse(ctor1.isEquivalentTo(ctor2));
    }
    @Test
    public void testIsSubtype() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertTrue(func.isSubtype(registry.getNativeType(JSTypeNative.U2U_CONSTRUCTOR_TYPE)));
    }
    @Test
    public void testToString() {
        JSType numType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType boolType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        Node param = createParamNode("x", false, false, numType);
        Node params = makeParams(param);
        FunctionType func = createOrdinary(params, boolType);
        assertEquals("function (number): boolean", func.toString());
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), boolType);
        ObjectType thisType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        FunctionType func2 = new FunctionType(registry, "test", null, arrow, thisType, null, false, false);
        assertEquals("function (this:Object): boolean", func2.toString());
    }
    @Test
    public void testSetImplementedInterfaces() {
        FunctionType ctor = createConstructor(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        ObjectType ifaceType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        java.util.List<ObjectType> ifaces = java.util.Collections.singletonList(ifaceType);
        ctor.setImplementedInterfaces(ifaces);
        assertEquals(ifaceType, ctor.getImplementedInterfaces().iterator().next());
    }
    @Test
    public void testGetSuperClassConstructorNull() {
        FunctionType ctor = createConstructor(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNull(ctor.getSuperClassConstructor());
    }
    @Test
    public void testGetTemplateTypeName() {
        ArrowType arrow = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType func = new FunctionType(registry, "generic", null, arrow,
                registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), "T", false, false);
        assertEquals("T", func.getTemplateTypeName());
    }
    @Test
    public void testGetTypeOfThis() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNotNull(func.getTypeOfThis());
    }
    @Test
    public void testSource() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNull(func.getSource());
        Node source = new Node(Token.FUNCTION);
        func.setSource(source);
        assertEquals(source, func.getSource());
    }
    @Test
    public void testHasCachedValues() {
        FunctionType func = createOrdinary(new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertFalse(func.hasCachedValues());
        func.getPrototype();
        assertTrue(func.hasCachedValues());
    }
}