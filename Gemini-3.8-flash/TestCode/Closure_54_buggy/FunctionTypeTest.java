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
    private Node sourceNode;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        sourceNode = new Node(Token.FUNCTION);
    }

    @Test
    public void testIsConstructorForConstructorKind() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        assertTrue(functionType.isConstructor());
        assertFalse(functionType.isInterface());
        assertFalse(functionType.isOrdinaryFunction());
    }

    @Test
    public void testIsInterfaceForInterfaceKind() {
        functionType = FunctionType.forInterface(registry, "TestInterface", sourceNode);
        assertTrue(functionType.isInterface());
        assertFalse(functionType.isConstructor());
        assertFalse(functionType.isOrdinaryFunction());
    }

    @Test
    public void testIsOrdinaryFunctionForOrdinaryKind() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertTrue(functionType.isOrdinaryFunction());
        assertFalse(functionType.isConstructor());
        assertFalse(functionType.isInterface());
    }

    @Test
    public void testHasImplementedInterfacesWhenEmpty() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertFalse(functionType.hasImplementedInterfaces());
    }

    @Test
    public void testHasImplementedInterfacesWithSuperConstructor() {
        FunctionType superCtor = new FunctionType(registry, "SuperCtor", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        functionType = new FunctionType(registry, "TestCtor", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        functionType.setPrototypeBasedOn(superCtor.getInstanceType());
        assertFalse(functionType.hasImplementedInterfaces());
    }

    @Test
    public void testGetMinArgumentsForEmptyParams() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertEquals(0, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArgumentsWithOneOptionalArg() {
        Node paramsNode = new Node(Token.LP);
        Node optionalArg = new Node(Token.NAME);
        optionalArg.putBooleanProp(Node.OPTIONAL_ARG, true);
        paramsNode.addChildToBack(optionalArg);
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, paramsNode, null), null, null, false, false);
        assertEquals(0, functionType.getMinArguments());
    }

    @Test
    public void testGetMinArgumentsWithRequiredArg() {
        Node paramsNode = new Node(Token.LP);
        Node requiredArg = new Node(Token.NAME, "arg1");
        paramsNode.addChildToBack(requiredArg);
        Node optionalArg = new Node(Token.NAME, "arg2");
        optionalArg.putBooleanProp(Node.OPTIONAL_ARG, true);
        paramsNode.addChildToBack(optionalArg);
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, paramsNode, null), null, null, false, false);
        assertEquals(1, functionType.getMinArguments());
    }

    @Test
    public void testGetMaxArgumentsForEmptyParams() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertEquals(0, functionType.getMaxArguments());
    }

    @Test
    public void testGetMaxArgumentsWithVarArgs() {
        Node paramsNode = new Node(Token.LP);
        Node varArg = new Node(Token.NAME, "args");
        varArg.putBooleanProp(Node.VAR_ARGS, true);
        paramsNode.addChildToBack(varArg);
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, paramsNode, null), null, null, false, false);
        assertEquals(Integer.MAX_VALUE, functionType.getMaxArguments());
    }

    @Test
    public void testGetMaxArgumentsWithMultipleParams() {
        Node paramsNode = new Node(Token.LP);
        paramsNode.addChildToBack(new Node(Token.NAME, "arg1"));
        paramsNode.addChildToBack(new Node(Token.NAME, "arg2"));
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, paramsNode, null), null, null, false, false);
        assertEquals(2, functionType.getMaxArguments());
    }

    @Test
    public void testGetPrototypeWhenNull() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        ObjectType prototype = functionType.getPrototype();
        assertNotNull(prototype);
        assertEquals("TestFunc.prototype", prototype.getReferenceName());
    }

    @Test
    public void testSetPrototypeWithNull() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertFalse(functionType.setPrototype(null));
    }

    @Test
    public void testSetPrototypeWithNonNull() {
        functionType = new FunctionType(registry, "TestCtor", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        PrototypeObjectType prototype = new PrototypeObjectType(registry, "TestCtor.prototype", 
                registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), false);
        assertTrue(functionType.setPrototype(prototype));
        assertSame(prototype, functionType.getPrototype());
    }

    @Test
    public void testGetAllImplementedInterfacesForEmpty() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertFalse(functionType.getAllImplementedInterfaces().iterator().hasNext());
    }

    @Test
    public void testGetAllImplementedInterfacesWithSingleInterface() {
        FunctionType interfaceCtor = FunctionType.forInterface(registry, "MyInterface", sourceNode);
        ObjectType interfaceInstance = interfaceCtor.getInstanceType();
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        functionType.setImplementedInterfaces(Collections.singletonList(interfaceInstance));
        List<ObjectType> interfaces = Lists.newArrayList(functionType.getAllImplementedInterfaces());
        assertEquals(1, interfaces.size());
        assertEquals("MyInterface", interfaces.get(0).getReferenceName());
    }

    @Test
    public void testSetExtendedInterfacesWithValidList() {
        FunctionType interfaceCtor = FunctionType.forInterface(registry, "ExtInterface", sourceNode);
        functionType = FunctionType.forInterface(registry, "MyInterface", sourceNode);
        ObjectType interfaceInstance = interfaceCtor.getInstanceType();
        functionType.setExtendedInterfaces(Collections.singletonList(interfaceInstance));
        assertEquals(1, functionType.getExtendedInterfacesCount());
        assertEquals(1, Iterables.size(functionType.getExtendedInterfaces()));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetExtendedInterfacesForNonInterface() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        functionType.setExtendedInterfaces(Collections.emptyList());
    }

    @Test
    public void testIsEquivalentToSameInstance() {
        functionType = new FunctionType(registry, "TestFunc", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertTrue(functionType.isEquivalentTo(functionType));
    }

    @Test
    public void testIsEquivalentToSubtypeOfThisType() {
        FunctionType ctor = new FunctionType(registry, "A", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        FunctionType subCtor = new FunctionType(registry, "B", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        subCtor.setPrototypeBasedOn(ctor.getInstanceType());
        assertFalse(ctor.isEquivalentTo(subCtor));
    }

    @Test
    public void testHashCodeForInterface() {
        functionType = FunctionType.forInterface(registry, "I", sourceNode);
        assertEquals(functionType.getReferenceName().hashCode(), functionType.hashCode());
    }

    @Test
    public void testHashCodeForNonInterface() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertEquals(System.identityHashCode(functionType), functionType.hashCode());
    }

    @Test
    public void testGetTypeOfThisForConstructor() {
        functionType = new FunctionType(registry, "C", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        assertNotNull(functionType.getTypeOfThis());
        assertEquals("C", functionType.getTypeOfThis().getReferenceName());
    }

    @Test
    public void testGetTypeOfThisForNonConstructor() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertTrue(functionType.getTypeOfThis().isUnknownType());
    }

    @Test
    public void testGetSourceNode() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertSame(sourceNode, functionType.getSource());
    }

    @Test
    public void testSetSourceNull() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        functionType.setSource(null);
        assertNull(functionType.getSource());
    }

    @Test
    public void testGetSubTypesWhenNull() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertNull(functionType.getSubTypes());
    }

    @Test
    public void testGetSubTypesAfterPrototypeSet() {
        FunctionType ctor = new FunctionType(registry, "C", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        FunctionType subCtor = new FunctionType(registry, "S", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        subCtor.setPrototypeBasedOn(ctor.getInstanceType());
        assertNotNull(subCtor.getSubTypes());
        assertEquals(1, subCtor.getSubTypes().size());
    }

    @Test
    public void testGetTemplateTypeNameWhenNull() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertNull(functionType.getTemplateTypeName());
    }

    @Test
    public void testGetTemplateTypeNameWhenSet() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), "T", null, false, false);
        assertEquals("T", functionType.getTemplateTypeName());
    }

    @Test
    public void testIsInstanceTypeForFunctionConstructor() {
        functionType = new FunctionType(registry, "F", sourceNode, 
                new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        assertFalse(functionType.isInstanceType());
    }
}