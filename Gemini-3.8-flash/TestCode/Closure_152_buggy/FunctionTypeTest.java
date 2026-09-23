package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.List;
import java.util.Arrays;

public class FunctionTypeTest {
    private JSTypeRegistry registry;
    private FunctionType functionType;
    private FunctionType constructorType;
    private FunctionType interfaceType;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(errorReporter);
        functionType = new FunctionType(registry, "testFn", null, new ArrowType(registry, new Node(Token.LP), null), registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE), null, false, false);
        constructorType = new FunctionType(registry, "MyConstructor", null, new ArrowType(registry, new Node(Token.LP), null), null, null, true, false);
        interfaceType = new FunctionType(registry, "MyInterface", null);
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
    public void testCanBeCalled() {
        assertTrue(functionType.canBeCalled());
        assertTrue(constructorType.canBeCalled());
        assertTrue(interfaceType.canBeCalled());
    }

    @Test
    public void testGetParametersEmpty() {
        Iterable<Node> params = functionType.getParameters();
        assertNotNull(params);
        assertFalse(params.iterator().hasNext());
    }

    @Test
    public void testGetParametersNode() {
        assertNotNull(functionType.getParametersNode());
    }

    @Test
    public void testGetMinArgumentsZero() {
        assertEquals(0, functionType.getMinArguments());
    }

    @Test
    public void testGetMaxArgumentsZero() {
        assertEquals(0, functionType.getMaxArguments());
    }

    @Test
    public void testGetReturnType() {
        assertNotNull(functionType.getReturnType());
    }

    @Test
    public void testIsReturnTypeInferred() {
        assertFalse(functionType.isReturnTypeInferred());
    }

    @Test
    public void testGetPrototype() {
        FunctionPrototypeType proto = functionType.getPrototype();
        assertNotNull(proto);
        assertNotNull(constructorType.getPrototype());
        assertNotNull(interfaceType.getPrototype());
    }

    @Test
    public void testSetPrototypeBasedOn() {
        ObjectType base = registry.createAnonymousObjectType(null);
        functionType.setPrototypeBasedOn(base);
        assertNotNull(functionType.getPrototype().getImplicitPrototype());
    }

    @Test
    public void testSetPrototypeForOrdinary() {
        FunctionPrototypeType proto = new FunctionPrototypeType(registry, functionType, null);
        assertFalse(functionType.setPrototype(proto));
    }

    @Test
    public void testGetImplementedInterfacesNone() {
        Iterable<ObjectType> interfaces = functionType.getImplementedInterfaces();
        assertNotNull(interfaces);
        assertFalse(interfaces.iterator().hasNext());
    }

    @Test
    public void testSetImplementedInterfaces() {
        ObjectType iface = registry.createAnonymousObjectType(null);
        constructorType.setImplementedInterfaces(Arrays.asList(iface));
        Iterable<ObjectType> interfaces = constructorType.getImplementedInterfaces();
        assertNotNull(interfaces);
        assertTrue(interfaces.iterator().hasNext());
    }

    @Test
    public void testHasPropertyPrototype() {
        assertTrue(functionType.hasProperty("prototype"));
        assertTrue(functionType.hasOwnProperty("prototype"));
    }

    @Test
    public void testHasPropertyNormal() {
        assertFalse(functionType.hasProperty("nonexistent"));
        assertFalse(functionType.hasOwnProperty("nonexistent"));
    }

    @Test
    public void testGetPropertyTypePrototype() {
        assertNotNull(functionType.getPropertyType("prototype"));
    }

    @Test
    public void testGetPropertyTypeCall() {
        assertNotNull(functionType.getPropertyType("call"));
    }

    @Test
    public void testGetPropertyTypeApply() {
        assertNotNull(functionType.getPropertyType("apply"));
    }

    @Test
    public void testGetLeastSupertypeSameInstance() {
        assertEquals(functionType, functionType.getLeastSupertype(functionType));
    }

    @Test
    public void testGetGreatestSubtypeSameInstance() {
        assertEquals(functionType, functionType.getGreatestSubtype(functionType));
    }

    @Test
    public void testIsInstanceType() {
        assertFalse(functionType.isInstanceType());
        assertFalse(constructorType.isInstanceType());
        assertFalse(interfaceType.isInstanceType());
    }

    @Test
    public void testIsOrdinaryFunction() {
        assertTrue(functionType.isOrdinaryFunction());
        assertFalse(constructorType.isOrdinaryFunction());
        assertFalse(interfaceType.isOrdinaryFunction());
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
        assertNull(functionType.getSource());
        Node sourceNode = new Node(Token.FUNCTION);
        FunctionType withSource = new FunctionType(registry, "src", sourceNode, new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertEquals(sourceNode, withSource.getSource());
    }

    @Test
    public void testSetSourceNull() {
        functionType.setSource(null);
        assertNull(functionType.getSource());
    }

    @Test
    public void testGetSubTypes() {
        assertNull(functionType.getSubTypes());
    }

    @Test
    public void testHasCachedValues() {
        assertFalse(functionType.hasCachedValues());
        functionType.getPrototype();
        assertTrue(functionType.hasCachedValues());
    }

    @Test
    public void testGetTemplateTypeName() {
        assertNull(functionType.getTemplateTypeName());
        FunctionType templateFn = new FunctionType(registry, "templateFn", null, new ArrowType(registry, new Node(Token.LP), null), null, "T", false, false);
        assertEquals("T", templateFn.getTemplateTypeName());
    }

    @Test
    public void testToDebugHashCodeString() {
        assertNotNull(functionType.toDebugHashCodeString());
    }

    @Test
    public void testVisit() {
        Visitor<Boolean> visitor = new Visitor<Boolean>() {
            @Override
            public Boolean caseFunctionType(FunctionType type) {
                return true;
            }
        };
        assertTrue(functionType.visit(visitor));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        assertTrue(functionType.isPropertyTypeInferred("prototype"));
        assertFalse(functionType.isPropertyTypeInferred("other"));
    }

    @Test
    public void testGetGreatestSubtypeDifferentFunctions() {
        FunctionType fn1 = new FunctionType(registry, "fn1", null, new ArrowType(registry, new Node(Token.LP), null), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, false, false);
        FunctionType fn2 = new FunctionType(registry, "fn2", null, new ArrowType(registry, new Node(Token.LP), null), registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), null, false, false);
        JSType result = fn1.getGreatestSubtype(fn2);
        assertNotNull(result);
    }

    @Test
    public void testHasEqualCallType() {
        FunctionType other = new FunctionType(registry, "other", null, new ArrowType(registry, new Node(Token.LP), null), null, null, false, false);
        assertTrue(functionType.hasEqualCallType(other));
    }

    @Test
    public void testIsSubtypeOfItself() {
        assertTrue(functionType.isSubtype(functionType));
    }

    @Test
    public void testHashCode() {
        assertNotNull(functionType.hashCode());
        assertNotNull(constructorType.hashCode());
        assertNotNull(interfaceType.hashCode());
    }

    @Test
    public void testToString() {
        assertNotNull(functionType.toString());
        assertNotNull(constructorType.toString());
        assertNotNull(interfaceType.toString());
    }
}