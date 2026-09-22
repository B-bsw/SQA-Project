package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import java.util.Set;

public class PrototypeObjectTypeTest {

    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;
    private PrototypeObjectType nativeObjectType;
    private PrototypeObjectType anonymousType;

    @Before
    public void setUp() {
        // Use ErrorReporter that doesn't throw for missing types
        ErrorReporter reporter = new ErrorReporter() {
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(reporter);
        objectType = new PrototypeObjectType(registry, "TestClass", null);
        nativeObjectType = new PrototypeObjectType(registry, "Function", registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE), true);
        anonymousType = new PrototypeObjectType(registry, null, null);
    }

    @Test
    public void testConstructorWithNullImplicitPrototype() {
        assertEquals(0, objectType.getPropertiesCount());
        assertFalse(objectType.isNativeObjectType());
        assertNotNull(objectType.getImplicitPrototype());
        assertEquals(JSTypeNative.OBJECT_TYPE, objectType.getImplicitPrototype().getNativeType());
    }

    @Test
    public void testConstructorWithImplicitPrototype() {
        PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
        PrototypeObjectType type = new PrototypeObjectType(registry, "Type", proto);
        assertSame(proto, type.getImplicitPrototype());
        assertFalse(type.isNativeObjectType());
    }

    @Test
    public void testConstructorNativeType() {
        assertTrue(nativeObjectType.isNativeObjectType());
        assertEquals("Object", nativeObjectType.getImplicitPrototype().getReferenceName());
    }

    @Test
    public void testGetSlot() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, null);
        assertNotNull(objectType.getSlot("prop"));
        assertNull(objectType.getSlot("nonexistent"));
        assertEquals(type, objectType.getSlot("prop").getType());
    }

    @Test
    public void testGetSlotWithImplicitPrototype() {
        JSType type = registry.getNativeType(JSTypeNative.STRING_TYPE);
        PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
        proto.defineProperty("protoProp", type, false, null);
        objectType.setImplicitPrototype(proto);
        assertNotNull(objectType.getSlot("protoProp"));
        assertEquals(type, objectType.getSlot("protoProp").getType());
    }

    @Test
    public void testGetPropertiesCount() {
        assertEquals(0, objectType.getPropertiesCount());
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertEquals(2, objectType.getPropertiesCount());

        PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
        proto.defineProperty("c", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), false, null);
        objectType.setImplicitPrototype(proto);
        assertEquals(3, objectType.getPropertiesCount());

        proto.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertEquals(3, objectType.getPropertiesCount());
    }

    @Test
    public void testHasProperty() {
        assertFalse(objectType.hasProperty("prop"));
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, null);
        assertTrue(objectType.hasProperty("prop"));

        PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
        proto.defineProperty("protoProp", type, false, null);
        objectType.setImplicitPrototype(proto);
        assertTrue(objectType.hasProperty("protoProp"));
    }

    @Test
    public void testHasOwnProperty() {
        assertFalse(objectType.hasOwnProperty("prop"));
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, null);
        assertTrue(objectType.hasOwnProperty("prop"));
        assertFalse(objectType.hasOwnProperty("nonexistent"));
    }

    @Test
    public void testGetOwnPropertyNames() {
        assertEquals(0, objectType.getOwnPropertyNames().size());
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        Set<String> names = objectType.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testIsPropertyTypeDeclared() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("declared", type, false, null);
        objectType.defineProperty("inferred", type, true, null);
        assertTrue(objectType.isPropertyTypeDeclared("declared"));
        assertFalse(objectType.isPropertyTypeDeclared("inferred"));
        assertFalse(objectType.isPropertyTypeDeclared("nonexistent"));
    }

    @Test
    public void testIsPropertyTypeInferred() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("declared", type, false, null);
        objectType.defineProperty("inferred", type, true, null);
        assertTrue(objectType.isPropertyTypeInferred("inferred"));
        assertFalse(objectType.isPropertyTypeInferred("declared"));
        assertFalse(objectType.isPropertyTypeInferred("nonexistent"));
    }

    @Test
    public void testGetPropertyType() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("num", type, false, null);
        assertEquals(type, objectType.getPropertyType("num"));
        assertEquals(registry.getNativeType(JSTypeNative.UNKNOWN_TYPE), objectType.getPropertyType("nonexistent"));
    }

    @Test
    public void testIsPropertyInExterns() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("own", type, false, null);
        assertFalse(objectType.isPropertyInExterns("own"));

        PrototypeObjectType proto = new PrototypeObjectType(registry, "Proto", null);
        proto.defineProperty("inExterns", type, false, null);
        objectType.setImplicitPrototype(proto);
        assertFalse(objectType.isPropertyInExterns("inExterns"));
        assertFalse(objectType.isPropertyInExterns("nonexistent"));
    }

    @Test
    public void testDefineProperty() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertTrue(objectType.defineProperty("prop", type, false, null));
        assertEquals(type, objectType.getPropertyType("prop"));
        assertTrue(objectType.defineProperty("prop", type, false, null));
    }

    @Test
    public void testRemoveProperty() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, null);
        assertTrue(objectType.removeProperty("prop"));
        assertFalse(objectType.hasProperty("prop"));
        assertFalse(objectType.removeProperty("nonexistent"));
    }

    @Test
    public void testGetPropertyNode() {
        Node node = new Node(1);
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, node);
        assertSame(node, objectType.getPropertyNode("prop"));
        assertNull(objectType.getPropertyNode("nonexistent"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        objectType.defineProperty("prop", type, false, null);
        assertNull(objectType.getOwnPropertyJSDocInfo("prop"));
        assertNull(objectType.getOwnPropertyJSDocInfo("nonexistent"));
    }

    @Test
    public void testSetPropertyJSDocInfo() {
        JSType type = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSDocInfo info = new JSDocInfo();
        objectType.defineProperty("prop", type, false, null);
        objectType.setPropertyJSDocInfo("prop", info);
        assertSame(info, objectType.getOwnPropertyJSDocInfo("prop"));
        objectType.setPropertyJSDocInfo("nonexistent", info);
    }

    @Test
    public void testMatchesNumberContext() {
        assertFalse(objectType.matchesNumberContext());
        PrototypeObjectType numType = new PrototypeObjectType(registry, "Number", registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE), true);
        assertTrue(numType.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContext() {
        assertFalse(objectType.matchesStringContext());
        PrototypeObjectType strType = new PrototypeObjectType(registry, "String", registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE), true);
        assertTrue(strType.matchesStringContext());
    }

    @Test
    public void testUnboxesTo() {
        PrototypeObjectType strType = new PrototypeObjectType(registry, "String", registry.getNativeObjectType(JSTypeNative.STRING_OBJECT_TYPE), true);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), strType.unboxesTo());
        PrototypeObjectType boolType = new PrototypeObjectType(registry, "Boolean", registry.getNativeObjectType(JSTypeNative.BOOLEAN_OBJECT_TYPE), true);
        assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), boolType.unboxesTo());
        PrototypeObjectType numType = new PrototypeObjectType(registry, "Number", registry.getNativeObjectType(JSTypeNative.NUMBER_OBJECT_TYPE), true);
        assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), numType.unboxesTo());
        assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), objectType.unboxesTo());
    }

    @Test
    public void testMatchesObjectContext() {
        assertFalse(objectType.matchesObjectContext());
    }

    @Test
    public void testCanBeCalled() {
        assertFalse(objectType.canBeCalled());
        PrototypeObjectType regexpType = new PrototypeObjectType(registry, "RegExp", registry.getNativeObjectType(JSTypeNative.REGEXP_TYPE), true);
        assertTrue(regexpType.canBeCalled());
    }

    @Test
    public void testToStringHelper() {
        PrototypeObjectType named = new PrototypeObjectType(registry, "NamedClass", null);
        assertEquals("NamedClass", named.toStringHelper(true));

        objectType.setPrettyPrint(true);
        assertEquals("{}", objectType.toStringHelper(true));
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertEquals("{...}", objectType.toStringHelper(true));

        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        anon.setPrettyPrint(false);
        assertEquals("{...}", anon.toStringHelper(true));
    }

    @Test
    public void testGetReferenceName() {
        assertEquals("TestClass", objectType.getReferenceName());
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        assertNull(anon.getReferenceName());
    }

    @Test
    public void testHasReferenceName() {
        assertTrue(objectType.hasReferenceName());
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        assertFalse(anon.hasReferenceName());
    }

    @Test
    public void testIsSubtype() {
        assertTrue(objectType.isSubtype(registry.getNativeType(JSTypeNative.OBJECT_TYPE)));
        assertFalse(objectType.isSubtype(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testHasCachedValues() {
        assertTrue(objectType.hasCachedValues());
    }

    @Test
    public void testGetOwnerFunction() {
        assertNull(objectType.getOwnerFunction());
    }

    @Test
    public void testSetImplicitPrototype() {
        PrototypeObjectType proto = new PrototypeObjectType(registry, "NewProto", null);
        objectType.setImplicitPrototype(proto);
        assertSame(proto, objectType.getImplicitPrototype());
    }

    @Test
    public void testIsNativeObjectType() {
        assertFalse(objectType.isNativeObjectType());
        assertTrue(nativeObjectType.isNativeObjectType());
    }

    @Test
    public void testSetPrettyPrint() {
        assertFalse(objectType.isPrettyPrint());
        objectType.setPrettyPrint(true);
        assertTrue(objectType.isPrettyPrint());
    }

    @Test
    public void testGetPropertyTypeFromNative() {
        PrototypeObjectType nativeType = registry.getNativeObjectType(JSTypeNative.OBJECT_PROTOTYPE);
        assertNull(nativeType.getPropertyType("nonexistent"));
    }

    @Test
    public void testCollectPropertyNames() {
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        java.util.Set<String> props = new java.util.HashSet<String>();
        objectType.collectPropertyNames(props);
        assertTrue(props.contains("a"));
    }
}