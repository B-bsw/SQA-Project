package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;

public class PrototypeObjectTypeTest {

    private JSTypeRegistry registry;
    private PrototypeObjectType objectType;
    private PrototypeObjectType nativeObjectType;
    private ObjectType implicitPrototype;
    private FunctionType ownerFunction;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        implicitPrototype = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
        ownerFunction = new FunctionType(registry, "TestOwner", null, null, null, null, null, null);
        objectType = new PrototypeObjectType(registry, "TestClass", implicitPrototype);
        nativeObjectType = new PrototypeObjectType(registry, null, implicitPrototype, true);
    }

    @Test
    public void testGetSlot_ExistingProperty() {
        objectType.defineProperty("prop1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertNotNull(objectType.getSlot("prop1"));
    }

    @Test
    public void testGetSlot_NonExistingPropertyInImplicitPrototype() {
        implicitPrototype.defineProperty("inheritedProp", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        staticSlot<JSType> slot = objectType.getSlot("inheritedProp");
        assertNotNull(slot);
        assertEquals(JSTypeNative.STRING_TYPE, ((JSType) slot.getType()).getType());
    }

    @Test
    public void testGetSlot_NullPropertyName() {
        assertNull(objectType.getSlot(null));
    }

    @Test
    public void testGetSlot_PropertyNotFound() {
        assertNull(objectType.getSlot("nonExistent"));
    }

    @Test
    public void testGetPropertiesCount_NoProperties() {
        assertEquals(0, objectType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_WithLocalProperties() {
        objectType.defineProperty("local1", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("local2", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertEquals(2, objectType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_WithImplicitPrototypeProperties() {
        implicitPrototype.defineProperty("inherited", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), true, null);
        assertEquals(1, objectType.getPropertiesCount());
    }

    @Test
    public void testGetPropertiesCount_MixedProperties() {
        implicitPrototype.defineProperty("inherited", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), true, null);
        objectType.defineProperty("local", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertEquals(2, objectType.getPropertiesCount());
    }

    @Test
    public void testHasProperty_OwnProperty() {
        objectType.defineProperty("ownProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.hasProperty("ownProp"));
    }

    @Test
    public void testHasProperty_InheritedProperty() {
        implicitPrototype.defineProperty("inherited", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertTrue(objectType.hasProperty("inherited"));
    }

    @Test
    public void testHasProperty_NonExistentProperty() {
        assertFalse(objectType.hasProperty("nonExistent"));
    }

    @Test
    public void testHasProperty_NullPropertyName() {
        assertFalse(objectType.hasProperty(null));
    }

    @Test
    public void testHasOwnProperty_Present() {
        objectType.defineProperty("ownProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.hasOwnProperty("ownProp"));
    }

    @Test
    public void testHasOwnProperty_AbsentLocalButInherited() {
        implicitPrototype.defineProperty("inherited", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
        assertFalse(objectType.hasOwnProperty("inherited"));
    }

    @Test
    public void testHasOwnProperty_NullPropertyName() {
        assertFalse(objectType.hasOwnProperty(null));
    }

    @Test
    public void testGetOwnPropertyNames_Empty() {
        Set<String> names = objectType.getOwnPropertyNames();
        assertEquals(0, names.size());
    }

    @Test
    public void testGetOwnPropertyNames_WithProperties() {
        objectType.defineProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        Set<String> names = objectType.getOwnPropertyNames();
        assertEquals(2, names.size());
        assertTrue(names.contains("a"));
        assertTrue(names.contains("b"));
    }

    @Test
    public void testFindPropertyType_Present() {
        objectType.defineProperty("prop", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        JSType type = objectType.getPropertyType("prop");
        assertNotNull(type);
        assertEquals(JSTypeNative.NUMBER_TYPE, type.getType());
    }

    @Test
    public void testFindPropertyType_Absent() {
        assertEquals(JSTypeNative.UNKNOWN_TYPE, objectType.getPropertyType("missing").getType());
    }

    @Test
    public void testDefineProperty_NewProperty() {
        assertTrue(objectType.defineProperty("newProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null));
        assertTrue(objectType.hasProperty("newProp"));
    }

    @Test
    public void testDefineProperty_DuplicateProperty() {
        objectType.defineProperty("dup", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.defineProperty("dup", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null));
        assertEquals(JSTypeNative.STRING_TYPE, objectType.getPropertyType("dup").getType());
    }

    @Test
    public void testDefineProperty_WithJSDocInfo() {
        JSDocInfo info = new JSDocInfo();
        objectType.defineProperty("docProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.setPropertyJSDocInfo("docProp", info);
        assertEquals(info, objectType.getOwnPropertyJSDocInfo("docProp"));
    }

    @Test
    public void testRemoveProperty_Present() {
        objectType.defineProperty("rem", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.removeProperty("rem"));
        assertFalse(objectType.hasProperty("rem"));
    }

    @Test
    public void testRemoveProperty_Absent() {
        assertFalse(objectType.removeProperty("nonExistent"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_NoProperty() {
        assertNull(objectType.getOwnPropertyJSDocInfo("nothing"));
    }

    @Test
    public void testToStringHelper_HasReferenceName() {
        PrototypeObjectType namedType = new PrototypeObjectType(registry, "Named", implicitPrototype);
        assertEquals("Named", namedType.toStringHelper(false));
    }

    @Test
    public void testToStringHelper_NoReferenceNamePrettyPrint() {
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        assertEquals("{...}", anon.toStringHelper(false));
    }

    @Test
    public void testToStringHelper_ForAnnotationsNoReference() {
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, null);
        assertEquals("?", anon.toStringHelper(true));
    }

    @Test
    public void testIsNativeObjectType_Native() {
        assertTrue(nativeObjectType.isNativeObjectType());
    }

    @Test
    public void testIsNativeObjectType_NonNative() {
        assertFalse(objectType.isNativeObjectType());
    }

    @Test
    public void testGetOwnerFunction_WhenSet() {
        objectType = new PrototypeObjectType(registry, null, implicitPrototype);
        assertEquals(ownerFunction, objectType.getOwnerFunction());
    }

    @Test
    public void testGetOwnerFunction_NotSet() {
        PrototypeObjectType pt = new PrototypeObjectType(registry, null, implicitPrototype);
        assertNull(pt.getOwnerFunction());
    }

    @Test
    public void testHasReferenceName_WithClassName() {
        assertTrue(objectType.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_WithOwnerFunction() {
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, implicitPrototype);
        anon.ownerFunction = ownerFunction;
        assertTrue(anon.hasReferenceName());
    }

    @Test
    public void testHasReferenceName_Neither() {
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, implicitPrototype);
        assertFalse(anon.hasReferenceName());
    }

    @Test
    public void testGetReferenceName_WithClassName() {
        assertEquals("TestClass", objectType.getReferenceName());
    }

    @Test
    public void testGetReferenceName_WithOwnerFunction() {
        PrototypeObjectType anon = new PrototypeObjectType(registry, null, implicitPrototype);
        anon.ownerFunction = ownerFunction;
        assertEquals(ownerFunction.getReferenceName() + ".prototype", anon.getReferenceName());
    }

    @Test
    public void testMatchesNumberContext_StringObject() {
        PrototypeObjectType strObj = new PrototypeObjectType(registry, "String", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertTrue(strObj.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContext_PlainObject() {
        PrototypeObjectType plain = new PrototypeObjectType(registry, "Plain", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertFalse(plain.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContext_ArrayType() {
        PrototypeObjectType arr = new PrototypeObjectType(registry, "Array", registry.getNativeObjectType(JSTypeNative.ARRAY_TYPE));
        assertTrue(arr.matchesStringContext());
    }

    @Test
    public void testMatchesStringContext_PlainObject() {
        PrototypeObjectType plain = new PrototypeObjectType(registry, "Plain", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertFalse(plain.matchesStringContext());
    }

    @Test
    public void testHasOverridenNativeProperty_WhenPresent() {
        PrototypeObjectType withOverride = new PrototypeObjectType(registry, "Custom", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        withOverride.defineProperty("toString", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
        assertTrue(withOverride.hasOverridenNativeProperty("toString"));
    }

    @Test
    public void testHasOverridenNativeProperty_NotPresent() {
        PrototypeObjectType withOverride = new PrototypeObjectType(registry, "Custom", registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE));
        assertFalse(withOverride.hasOverridenNativeProperty("valueOf"));
    }

    @Test
    public void testHasCachedValues() {
        assertTrue(objectType.hasCachedValues());
    }

    @Test
    public void testMatchConstraint_NonRecordType() {
        objectType.matchConstraint(objectType);
        assertTrue(true); // Should not throw
    }

    @Test
    public void testIsPropertyTypeDeclared_WhenDeclared() {
        objectType.defineProperty("decl", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        assertTrue(objectType.isPropertyTypeDeclared("decl"));
    }

    @Test
 public void testIsPropertyTypeDeclared_WhenInferred() {
        objectType.defineProperty("inf", registry.getNativeType(JSTypeNative.NUMBER_TYPE), true, null);
        assertFalse(objectType.isPropertyTypeDeclared("inf"));
    }

    @Test
 public void testIsPropertyTypeDeclared_WhenMissing() {
        assertFalse(objectType.isPropertyTypeDeclared("missing"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_WithProperty() {
        JSDocInfo info = new JSDocInfo();
        objectType.defineProperty("docProp", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null);
        objectType.setPropertyJSDocInfo("docProp", info);
        assertEquals(info, objectType.getOwnPropertyJSDocInfo("docProp"));
    }

    @Test
    public void testGetOwnPropertyJSDocInfo_WithoutProperty() {
        assertNull(objectType.getOwnPropertyJSDocInfo("nothing"));
    }
}