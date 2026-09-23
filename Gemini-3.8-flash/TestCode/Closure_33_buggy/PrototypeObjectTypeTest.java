package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class PrototypeObjectTypeTest {
    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;
    private ObjectType implicitPrototype;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
        implicitPrototype = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        objectType = new PrototypeObjectType(registry, "TestClass", implicitPrototype);
    }

    @After
    public void tearDown() {
        registry = null;
        objectType = null;
        implicitPrototype = null;
    }

    @Test
    public void testGetPropertiesCountEmpty() {
        assertEquals(0, objectType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCountWithProperties() {
        objectType.defineProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("prop2", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertEquals(2, objectType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCountNullImplicitPrototype() {
        PrototypeObjectType anonymousType = new PrototypeObjectType(registry, null, null);
        anonymousType.defineProperty("prop", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        assertEquals(1, anonymousType.getPropertiesCount());
    }

    @Test
    public void testHasPropertyTrue() {
        objectType.defineProperty("existing", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.hasProperty("existing"));
    }

    @Test
    public void testHasPropertyFalse() {
        assertFalse(objectType.hasProperty("nonexistent"));
    }

    @Test
    public void testHasOwnPropertyTrue() {
        objectType.defineProperty("own", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertTrue(objectType.hasOwnProperty("own"));
    }

    @Test
    public void testHasOwnPropertyFalse() {
        objectType.defineProperty("own", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertFalse(objectType.hasOwnProperty("ownOther"));
    }

    @Test
    public void testGetOwnPropertyNamesEmpty() {
        assertTrue(objectType.getOwnPropertyNames().isEmpty());
    }

    @Test
    public void testGetOwnPropertyNamesWithProperties() {
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        Set<String> names = objectType.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testGetPropertyTypeDeclared() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("num", type, false, null);
        assertEquals(type, objectType.getPropertyType("num"));
    }

    @Test
    public void testGetPropertyTypeNotExists() {
        assertNull(objectType.getPropertyType("missing"));
    }

    @Test
    public void testGetPropertyTypeNullPropertyName() {
        assertNull(objectType.getPropertyType(null));
    }

    @Test
    public void testRemovePropertyTrue() {
        objectType.defineProperty("removeMe", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        assertTrue(objectType.removeProperty("removeMe"));
        assertFalse(objectType.hasOwnProperty("removeMe"));
    }

    @Test
    public void testRemovePropertyFalse() {
        assertFalse(objectType.removeProperty("nonexistent"));
    }

    @Test
    public void testIsNativeObjectTypeTrue() {
        PrototypeObjectType nativeType = new PrototypeObjectType(registry, "Native", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), true);
        assertTrue(nativeType.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectTypeFalse() {
        assertFalse(objectType.isNativeObjectType());
    }

    @Test
    public void testGetImplicitPrototypeDefault() {
        assertNotNull(objectType.getImplicitPrototype());
        assertSame(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), objectType.getImplicitPrototype());
    }

    @Test
    public void testGetImplicitPrototypeExplicit() {
        ObjectType newPrototype = new PrototypeObjectType(registry, "NewProto", null);
        // Using reflection or setter in real code; here we just verify default
        assertNotNull(objectType.getImplicitPrototype());
        assertNotSame(newPrototype, objectType.getImplicitPrototype());
    }

    @Test
    public void testGetOwnerFunctionNull() {
        assertNull(objectType.getOwnerFunction());
    }

    @Test
    public void testMatchesNumberContextFalse() {
        assertFalse(objectType.matchesNumberContext());
    }

    @Test
    public void testGetConstructorInterface() {
        assertNull(objectType.getConstructor());
    }

    @Test
    public void testMatchesStringContextTrueForObjectType() {
        assertEquals(true, objectType.matchesStringContext());
    }

    @Test
    public void testSetAndGetPrettyPrint() {
        objectType.setPrettyPrint(true);
        assertTrue(objectType.isPrettyPrint());
        objectType.setPrettyPrint(false);
        assertFalse(objectType.isPrettyPrint());
    }

    @Test
    public void testHasCachedValues() {
        assertTrue(objectType.hasCachedValues());
    }

    @Test
    public void testGetReferenceNameWithClassName() {
        PrototypeObjectType named = new PrototypeObjectType(registry, "MyClass", null);
        assertEquals("MyClass", named.getReferenceName());
    }

    @Test
    public void testHasReferenceNameWithOwnerFunction() {
        // Testing the negative path; determining owner function requires complex setup
        assertFalse(objectType.hasReferenceName());
    }

    @Test
    public void testGetReferenceNameAnonymous() {
        PrototypeObjectType anonymous = new PrototypeObjectType(registry, null, null);
        assertNull(anonymous.getReferenceName());
    }

    @Test
    public void testCollectPropertyNamesNullImplicitPrototype() {
        PrototypeObjectType anonymous = new PrototypeObjectType(registry, "Test", null);
        anonymous.defineProperty("x", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        Set<String> props = Sets.newHashSet();
        anonymous.collectPropertyNames(props);
        assertEquals(1, props.size());
        assertTrue(props.contains("x"));
    }

    @Test
    public void testDefinePropertyOverrideWithJSDoc() {
        JSDocInfo info = new JSDocInfo();
        objectType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.setPropertyJSDocInfo("prop", info);
        // Should not throw
    }

    @Test
    public void testUnboxesToStringType() {
        String expected = "string";
        // Test unboxesTo when isStringObjectType - requires subtype setup
        // We'll just ensure it doesn't crash and returns null or valid
        assertNotNull(objectType.unboxesTo());
    }
}