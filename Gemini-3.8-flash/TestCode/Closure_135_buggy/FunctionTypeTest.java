package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FunctionTypeTest {
    private JSTypeRegistry registry;
    private FunctionType functionType;
    private Node emptyParams;
    private JSType voidType;
    private JSType numberType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        emptyParams = new Node(Token.PARAM_LIST);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        functionType = new FunctionType(registry, "testFn", new Node(Token.FUNCTION), emptyParams, voidType);
    }

    @Test
    public void testIsFunctionType() {
        assertTrue(functionType.isFunctionType());
    }

    @Test
    public void testConstructorKind() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), null, voidType, null, null, true, false);
        assertTrue(ctor.isConstructor());
        assertFalse(ctor.isInterface());
        assertFalse(ctor.isOrdinaryFunction());
    }

    @Test
    public void testInterfaceKind() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = new FunctionType(registry, "Iface", source);
        assertTrue(iface.isInterface());
        assertFalse(iface.isConstructor());
        assertFalse(iface.isOrdinaryFunction());
    }

    @Test
    public void testOrdinaryFunction() {
        assertFalse(functionType.isConstructor());
        assertFalse(functionType.isInterface());
        assertTrue(functionType.isOrdinaryFunction());
    }

    @Test
    public void testCanBeCalled() {
        assertTrue(functionType.canBeCalled());
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = new FunctionType(registry, "Iface", source);
        assertFalse(iface.canBeCalled());
    }

    @Test
    public void testGetParametersWithNullCall() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = new FunctionType(registry, "Iface", source);
        assertEquals(Collections.emptySet(), iface.getParameters());
        assertNull(iface.getParametersNode());
    }

    @Test
    public void testGetParametersWithChildren() {
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        emptyParams.addChildToBack(param1);
        emptyParams.addChildToBack(param2);
        List<Node> params = com.google.common.collect.Lists.newArrayList(functionType.getParameters());
        assertEquals(2, params.size());
    }

    @Test
    public void testGetMinArguments() {
        Node param1 = Node.newString(Token.NAME, "a");
        Node param2 = Node.newString(Token.NAME, "b");
        param2.setOptionalArg(true);
        emptyParams.addChildToBack(param1);
        emptyParams.addChildToBack(param2);
        assertEquals(1, functionType.getMinArguments());
    }

    @Test
    public void testGetMaxArgumentsWithVarArgs() {
        Node param1 = Node.newString(Token.NAME, "a");
        param1.setVarArgs(true);
        emptyParams.addChildToBack(param1);
        assertEquals(Integer.MAX_VALUE, functionType.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        assertEquals(voidType, functionType.getReturnType());
        FunctionType nullReturn = new FunctionType(registry, "nullRet", new Node(Token.FUNCTION), emptyParams, null);
        assertNull(nullReturn.getReturnType());
    }

    @Test
    public void testGetPrototypeCreatesIfNull() {
        assertNotNull(functionType.getPrototype());
        assertTrue(functionType.getPrototype() instanceof FunctionPrototypeType);
    }

    @Test
    public void testSetPrototypeBasedOnBaseType() {
        ObjectType base = registry.createAnonymousObjectType(null);
        functionType.setPrototypeBasedOn(base);
        assertEquals(base, functionType.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototypeSameInstanceWhenConstructor() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), null, voidType, null, null, true, false);
        FunctionPrototypeType proto = ctor.getPrototype();
        assertFalse(ctor.setPrototype(proto));
    }

    @Test
    public void testSetPrototypeDifferentWhenConstructor() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), null, voidType, null, null, true, false);
        FunctionPrototypeType newProto = new FunctionPrototypeType(registry, ctor, null);
        assertTrue(ctor.setPrototype(newProto));
        assertEquals(newProto, ctor.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfaces() {
        assertNotNull(functionType.getAllImplementedInterfaces());
        assertEquals(0, com.google.common.collect.Iterables.size(functionType.getAllImplementedInterfaces()));
    }

    @Test
    public void testSetImplementedInterfaces() {
        ObjectType iface = registry.createAnonymousObjectType(null);
        functionType.setImplementedInterfaces(Collections.singletonList(iface));
        assertEquals(1, com.google.common.collect.Iterables.size(functionType.getImplementedInterfaces()));
    }

    @Test
    public void testHasPropertyPrototype() {
        assertTrue(functionType.hasProperty("prototype"));
    }

    @Test
    public void testGetPropertyTypePrototype() {
        assertNotNull(functionType.getPropertyType("prototype"));
    }

    @Test
    public void testGetLeastSupertypeEquals() {
        FunctionType same = functionType;
        assertEquals(functionType, functionType.getLeastSupertype(same));
    }

    @Test
    public void testGetLeastSupertypeFunctionInstance() {
        JSType fnInstance = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertEquals(fnInstance, functionType.getLeastSupertype(fnInstance));
    }

    @Test
    public void testGetGreatestSubtypeDifferentType() {
        JSType other = registry.createAnonymousObjectType(null);
        assertEquals(registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE), functionType.getGreatestSubtype(other));
    }

    @Test
    public void testGetSuperClassConstructorNonCtor() {
        assertNull(functionType.getSuperClassConstructor());
    }

    @Test(expected = IllegalStateException.class)
    public void testGetSuperClassConstructorNonCtorInterface() {
        Node source = new Node(Token.FUNCTION);
        FunctionType iface = new FunctionType(registry, "Iface", source);
        iface.getSuperClassConstructor();
    }

    @Test
    public void testGetTopMostDefiningType() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), null, voidType, null, null, true, false);
        ctor.getPrototype().defineDeclaredProperty("prop", numberType, false);
        assertNotNull(ctor.getTopMostDefiningType("prop"));
    }

    @Test(expected = IllegalStateException.class)
    public void testGetTopMostDefiningTypeNonCtor() {
        functionType.getTopMostDefiningType("x");
    }

    @Test
    public void testEquals() {
        FunctionType other = new FunctionType(registry, "testFn", new Node(Token.FUNCTION), emptyParams, voidType);
        assertTrue(functionType.equals(other));
        assertFalse(functionType.equals(null));
        assertFalse(functionType.equals("notFunc"));
    }

    @Test
    public void testHashCode() {
        FunctionType other = new FunctionType(registry, "testFn", new Node(Token.FUNCTION), emptyParams, voidType);
        assertEquals(other.hashCode(), functionType.hashCode());
    }

    @Test
    public void testHasEqualCallType() {
        FunctionType other = new FunctionType(registry, "testFn", new Node(Token.FUNCTION), emptyParams, voidType);
        assertTrue(functionType.hasEqualCallType(other));
    }

    @Test
    public void testToString() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), emptyParams, voidType, null, null, true, false);
        assertTrue(ctor.toString().startsWith("function"));
    }

    @Test
    public void testGetSource() {
        Node src = new Node(Token.FUNCTION);
        functionType.setSource(src);
        assertEquals(src, functionType.getSource());
    }

    @Test
    public void testSetSourceNull() {
        functionType.setSource(null);
        assertNull(functionType.getSource());
    }

    @Test
    public void testHasCachedValues() {
        assertFalse(functionType.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        FunctionType withTemplate = new FunctionType(registry, "temp", new Node(Token.FUNCTION), null, voidType, null, "T", false, false);
        assertEquals("T", withTemplate.getTemplateTypeName());
    }

    @Test
    public void testGetTemplateTypeNameNull() {
        assertNull(functionType.getTemplateTypeName());
    }

    @Test
    public void testIsSubtypeSame() {
        assertTrue(functionType.isSubtype(functionType));
    }

    @Test
    public void testIsSubtypeNonFunction() {
        assertFalse(functionType.isSubtype(numberType));
    }

    @Test
    public void testIsSubtypeFunctionType() {
        FunctionType other = new FunctionType(registry, "other", new Node(Token.FUNCTION), emptyParams, voidType);
        other.setInstanceType(registry.createAnonymousObjectType(null));
        assertFalse(functionType.isSubtype(other));
    }

    @Test
    public void testVisit() {
        assertEquals(functionType, functionType.visit(new Visitor<JSType>() {
            @Override
            public JSType caseFunctionType(FunctionType type) {
                return type;
            }
        }));
    }

    @Test
    public void testGetInstanceType() {
        FunctionType ctor = new FunctionType(registry, "Ctor", new Node(Token.FUNCTION), null, voidType, null, null, true, false);
        assertNotNull(ctor.getInstanceType());
    }

    @Test
    public void testGetTypeOfThis() {
        assertNotNull(functionType.getTypeOfThis());
    }

    @Test
    public void testGetSubTypes() {
        assertNull(functionType.getSubTypes());
    }

    @Test
    public void testAddSubType() {
        FunctionType sub = new FunctionType(registry, "sub", new Node(Token.FUNCTION), emptyParams, voidType);
        functionType.addSubType(sub);
        assertNotNull(functionType.getSubTypes());
        assertEquals(1, functionType.getSubTypes().size());
    }
}