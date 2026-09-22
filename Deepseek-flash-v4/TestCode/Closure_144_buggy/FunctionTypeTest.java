package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class FunctionTypeTest {
    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;
    private FunctionType functionType;
    private FunctionType constructorType;
    private FunctionType interfaceType;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(errorReporter);
        functionType = createFunctionType("test");
        constructorType = createConstructorType("TestCtor");
        interfaceType = createInterfaceType("TestInterface");
    }

    private FunctionType createFunctionType(String name) {
        Node source = new Node(Token.FUNCTION);
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return new FunctionType(registry, name, source, arrowType, null, null, false, false);
    }

    private FunctionType createConstructorType(String name) {
        Node source = new Node(Token.FUNCTION);
        ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        return new FunctionType(registry, name, source, arrowType, null, null, true, false);
    }

    private FunctionType createInterfaceType(String name) {
        return FunctionType.forInterface(registry, name, new Node(Token.FUNCTION));
    }

    @Test
    public void testIsInstanceType() {
        assertFalse(functionType.isInstanceType());
        assertTrue(constructorType.isInstanceType());
        assertFalse(interfaceType.isInstanceType());
    }

    @Test
    public void testIsConstructor() {
        assertFalse(functionType.isConstructor());
        assertTrue(constructorType.isConstructor());
        assertFalse(interfaceType.isConstructor());
    }

    @Test
    public void testIsInterface() {
        assertFalse(functionType.isInterface());
        assertFalse(constructorType.isInterface());
        assertTrue(interfaceType.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        assertTrue(functionType.isOrdinaryFunction());
        assertFalse(constructorType.isOrdinaryFunction());
        assertFalse(interfaceType.isOrdinaryFunction());
    }

    @Test
    public void testCanBeCalled() {
        assertTrue(functionType.canBeCalled());
        assertTrue(constructorType.canBeCalled());
        assertTrue(interfaceType.canBeCalled());
    }

    @Test
    public void testGetParameters() {
        Node params = functionType.getParametersNode();
        assertNotNull(params);
        assertEquals(0, functionType.getMinArguments());
        assertEquals(0, functionType.getMaxArguments());
    }

    @Test
    public void testGetMinMaxArguments() {
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(Node.newString(Token.NAME, "a"));
        Node optionalParam = Node.newString(Token.NAME, "b");
        optionalParam.setOptionalArg(true);
        paramsNode.addChildToBack(optionalParam);
        Node varArgsParam = Node.newString(Token.NAME, "c");
        varArgsParam.setVarArgs(true);
        paramsNode.addChildToBack(varArgsParam);
        ArrowType arrowType = new ArrowType(registry, paramsNode, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        FunctionType ft = new FunctionType(registry, "test", new Node(Token.FUNCTION), arrowType, null, null, false, false);
        assertEquals(1, ft.getMinArguments());
        assertEquals(Integer.MAX_VALUE, ft.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), functionType.getReturnType());
        assertFalse(functionType.isReturnTypeInferred());
    }

    @Test
    public void testGetPrototype() {
        assertNotNull(functionType.getPrototype());
        assertNotNull(constructorType.getPrototype());
        assertNotNull(interfaceType.getPrototype());
    }

    @Test
    public void testSetPrototype() {
        FunctionPrototypeType proto = constructorType.getPrototype();
        assertFalse(constructorType.setPrototype(proto));
        assertFalse(functionType.setPrototype(proto));
    }

    @Test
    public void testGetImplementedInterfaces() {
        assertNotNull(functionType.getImplementedInterfaces());
        assertEquals(0, Iterables.size(functionType.getImplementedInterfaces()));
        List<ObjectType> interfaces = ImmutableList.of(interfaceType.getInstanceType());
        constructorType.setImplementedInterfaces(interfaces);
        assertEquals(1, Iterables.size(constructorType.getImplementedInterfaces()));
        assertEquals(interfaceType.getInstanceType(), Iterables.getFirst(constructorType.getImplementedInterfaces(), null));
    }

    @Test
    public void testHasProperty() {
        assertFalse(functionType.hasProperty("prototype"));
        assertTrue(constructorType.hasProperty("prototype"));
        assertTrue(interfaceType.hasProperty("prototype"));
        assertFalse(functionType.hasProperty("nonexistent"));
    }

    @Test
    public void testHasOwnProperty() {
        assertFalse(functionType.hasOwnProperty("prototype"));
        assertTrue(constructorType.hasOwnProperty("prototype"));
        assertTrue(interfaceType.hasOwnProperty("prototype"));
    }

    @Test
    public void testGetPropertyTypePrototype() {
        assertNotNull(constructorType.getPropertyType("prototype"));
        assertNotNull(interfaceType.getPropertyType("prototype"));
    }

    @Test
    public void testGetPropertyTypeCall() {
        JSType callType = functionType.getPropertyType("call");
        assertNotNull(callType);
        assertTrue(callType.isFunctionType());
    }

    @Test
    public void testGetPropertyTypeApply() {
        JSType applyType = functionType.getPropertyType("apply");
        assertNotNull(applyType);
        assertTrue(applyType.isFunctionType());
    }

    @Test
    public void testGetPropertyTypeNonExistent() {
        assertNull(functionType.getPropertyType("nonexistent"));
    }

    @Test
    public void testDefineProperty() {
        assertFalse(functionType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, false));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        assertTrue(functionType.isPropertyTypeInferred("prototype"));
        assertFalse(functionType.isPropertyTypeInferred("other"));
    }

    @Test
    public void testGetLeastSupertype() {
        JSType result = functionType.getLeastSupertype(functionType);
        assertNotNull(result);
        assertTrue(result.isFunctionType());
    }

    @Test
    public void testGetGreatestSubtype() {
        JSType result = functionType.getGreatestSubtype(functionType);
        assertNotNull(result);
    }

    @Test
    public void testGetSuperClassConstructor() {
        assertNull(functionType.getSuperClassConstructor());
        assertNotNull(constructorType.getSuperClassConstructor());
        assertNull(interfaceType.getSuperClassConstructor());
    }

    @Test
    public void testHasUnknownSupertype() {
        assertFalse(constructorType.hasUnknownSupertype());
    }

    @Test
    public void testIsEquivalentTo() {
        assertTrue(functionType.isEquivalentTo(functionType));
        assertFalse(functionType.isEquivalentTo(constructorType));
        assertFalse(functionType.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testHashCode() {
        assertNotNull(functionType.hashCode());
        assertNotNull(constructorType.hashCode());
        assertNotNull(interfaceType.hashCode());
    }

    @Test
    public void testHasEqualCallType() {
        assertTrue(functionType.hasEqualCallType(functionType));
        assertFalse(functionType.hasEqualCallType(constructorType));
    }

    @Test
    public void testToString() {
        assertNotNull(functionType.toString());
        assertNotNull(constructorType.toString());
        assertNotNull(interfaceType.toString());
    }

    @Test
    public void testIsSubtype() {
        assertTrue(functionType.isSubtype(functionType));
        assertTrue(functionType.isSubtype(registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE)));
        assertFalse(functionType.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testVisit() {
        final boolean[] visited = {false};
        functionType.visit(new Visitor<Object>() {
            @Override
            public Object caseFunctionType(FunctionType type) {
                visited[0] = true;
                return null;
            }
        });
        assertTrue(visited[0]);
    }

    @Test
    public void testGetInstanceType() {
        assertNotNull(functionType.getInstanceType());
        assertNotNull(constructorType.getInstanceType());
        assertNotNull(interfaceType.getInstanceType());
    }

    @Test
    public void testHasInstanceType() {
        assertFalse(functionType.hasInstanceType());
        assertTrue(constructorType.hasInstanceType());
        assertTrue(interfaceType.hasInstanceType());
    }

    @Test
    public void testGetTypeOfThis() {
        assertNotNull(functionType.getTypeOfThis());
        assertNotNull(constructorType.getTypeOfThis());
        assertNotNull(interfaceType.getTypeOfThis());
    }

    @Test
    public void testGetSource() {
        assertNotNull(functionType.getSource());
        assertNull(constructorType.getSource());
    }

    @Test
    public void testSetSource() {
        Node newSource = new Node(Token.FUNCTION);
        functionType.setSource(newSource);
        assertEquals(newSource, functionType.getSource());
    }

    @Test
    public void testGetSubTypes() {
        assertNull(functionType.getSubTypes());
    }

    @Test
    public void testHasCachedValues() {
        assertFalse(functionType.hasCachedValues());
        constructorType.getPrototype();
        assertTrue(constructorType.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        assertNull(functionType.getTemplateTypeName());
        assertNull(constructorType.getTemplateTypeName());
    }

    @Test
    public void testToDebugHashCodeString() {
        assertNotNull(functionType.toDebugHashCodeString());
    }

    @Test
    public void testGetImplementedInterfacesEmpty() {
        assertEquals(0, Iterables.size(functionType.getImplementedInterfaces()));
    }

    @Test
    public void testGetAllImplementedInterfaces() {
        assertEquals(0, Iterables.size(functionType.getAllImplementedInterfaces()));
    }

    @Test
    public void testCloneWithNewReturnType() {
        FunctionType clone = functionType.cloneWithNewReturnType(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), true);
        assertNotNull(clone);
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), clone.getReturnType());
        assertTrue(clone.isReturnTypeInferred());
    }

    @Test(expected = IllegalStateException.class)
    public void testHasUnknownSupertypePrecondition() {
        functionType.hasUnknownSupertype();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetSuperClassConstructorPrecondition() {
        functionType.getSuperClassConstructor();
    }
}