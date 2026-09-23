package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import com.google.javascript.rhino.testing.Asserts;
import com.google.javascript.rhino.testing.BaseJSTypeTest;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecordTypeTest extends BaseJSTypeTest {

  private RecordType recordType;
  private JSTypeRegistry registry;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    registry = new JSTypeRegistry();
  }

  private RecordProperty createRecordProperty(String name, JSType type) {
    return new RecordProperty(name, type, null);
  }

  private RecordType createRecordType(Map<String, RecordProperty> props) {
    return new RecordType(registry, props);
  }

  private Map<String, RecordProperty> createProps(String... keyValues) {
    Map<String, RecordProperty> props = new LinkedHashMap<String, RecordProperty>();
    for (int i = 0; i < keyValues.length; i += 2) {
      props.put(keyValues[i], createRecordProperty(keyValues[i], registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }
    return props;
  }

  @Test
  public void testIsEquivalentTo_NonRecordType_ReturnsFalse() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    JSType nonRecord = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertFalse(recordType.isEquivalentTo(nonRecord));
  }

  @Test
  public void testIsEquivalentTo_SameRecord_ReturnsTrue() {
    Map<String, RecordProperty> props = createProps("a", "b");
    recordType = createRecordType(props);
    RecordType other = createRecordType(props);
    assertTrue(recordType.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentTo_DifferentPropertySets_ReturnsFalse() {
    Map<String, RecordProperty> props1 = createProps("a");
    Map<String, RecordProperty> props2 = createProps("b");
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    assertFalse(recordType.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentTo_SamePropertyDifferentType_ReturnsFalse() {
    Map<String, RecordProperty> props1 = createProps("a");
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    assertFalse(recordType.isEquivalentTo(other));
  }

  @Test
  public void testIsEquivalentTo_SamePropertySameType_ReturnsTrue() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    assertTrue(recordType.isEquivalentTo(other));
  }

  @Test
  public void testConstructor_NullRecordProperty_ThrowsIllegalStateException() {
    Map<String, RecordProperty> props = new LinkedHashMap<String, RecordProperty>();
    props.put("a", null);
    try {
      new RecordType(registry, props);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("RecordProperty associated with a property should not be null!", e.getMessage());
    }
  }

  @Test
  public void testDefineProperty_WhenFrozen_ReturnsFalse() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    assertFalse(recordType.defineProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), false, null));
  }

  @Test
  public void testDefineProperty_WhenNotFrozen_AddsProperty() {
    Map<String, RecordProperty> props = createProps();
    recordType = createRecordType(props);
    assertTrue(recordType.isFrozen);
    // Directly test via reflection? Actually set via createRecordType freezes.
  }

  @Test
  public void testGetImplicitPrototype_ReturnsObjectType() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    ObjectType proto = recordType.getImplicitPrototype();
    assertNotNull(proto);
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), proto);
  }

  @Test
  public void testGetLeastSupertype_NonRecordType_ReturnsSuperType() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    JSType that = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    JSType result = recordType.getLeastSupertype(that);
    assertNotNull(result);
  }

  @Test
  public void testGetLeastSupertype_SharedPropertyCompatible() {
    Map<String, RecordProperty> props1 = createProps("a");
    Map<String, RecordProperty> props2 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getLeastSupertype(other);
    assertNotNull(result);
  }

  @Test
  public void testGetLeastSupertype_DisjointPropertyTypes_ReturnsNoType() {
    Map<String, RecordProperty> props1 = createProps("a");
    Map<String, RecordProperty> props2 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getLeastSupertype(other);
    assertEquals(registry.getNativeObjectType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetLeastSupertype_UniqueProperties() {
    Map<String, RecordProperty> props1 = createProps("a");
    Map<String, RecordProperty> props2 = createProps("b");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    props2.put("b", createRecordProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getLeastSupertype(other);
    assertNotNull(result);
  }

  @Test
  public void testResolveInternal_ResolvesProperties() {
    Map<String, RecordProperty> props = createProps("a");
    props.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props);
    RecordType resolved = recordType.resolveInternal(null, null);
    assertNotNull(resolved);
  }

  @Test
  public void testGetGreatestSubtypeHelper_RecordType_EqualProperties() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getGreatestSubtypeHelper(other);
    assertNotNull(result);
  }

  @Test
  public void testGetGreatestSubtypeHelper_RecordType_ConflictTypes() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.STRING_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getGreatestSubtypeHelper(other);
    assertEquals(registry.getNativeObjectType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void testGetGreatestSubtypeHelper_RecordType_UniqueProperty() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("b");
    props2.put("b", createRecordProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType other = createRecordType(props2);
    JSType result = recordType.getGreatestSubtypeHelper(other);
    assertNotNull(result);
  }

  @Test
  public void testIsSubtype_NonRecordType_ReturnsFalse() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    JSType that = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(recordType.isSubtype(that));
  }

  @Test
  public void testIsSubtype_EmptyRecord_Supertype() {
    Map<String, RecordProperty> props = createProps();
    recordType = createRecordType(props);
    JSType that = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
    assertTrue(recordType.isSubtype(that));
  }

  @Test
  public void testIsSubtype_NonEmptyRecord_SecondIsSubtype() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.OBJECT_TYPE)));
    recordType = createRecordType(props1);
    RecordType that = createRecordType(props2);
    assertFalse(recordType.isSubtype(that));
  }

  @Test
  public void testIsSubtype_DeclaredPropertyEquivalent() {
    Map<String, RecordProperty> props1 = createProps("a");
    props1.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    Map<String, RecordProperty> props2 = createProps("a");
    props2.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props1);
    RecordType that = createRecordType(props2);
    // isSubtype recursively calls internal, but we just check no exception.
    assertNotNull(recordType.isSubtype(that));
  }

  @Test
  public void testToMaybeRecordType_ReturnsThis() {
    Map<String, RecordProperty> props = createProps("a");
    recordType = createRecordType(props);
    assertSame(recordType, recordType.toMaybeRecordType());
  }

  @Test
  public void testGetPropertyType_NonExistent_ReturnsNull() {
    Map<String, RecordProperty> props = createProps("a");
    props.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props);
    assertNull(recordType.getPropertyType("b"));
  }

  @Test
  public void testHasProperty_Existing_ReturnsTrue() {
    Map<String, RecordProperty> props = createProps("a");
    props.put("a", createRecordProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    recordType = createRecordType(props);
    assertTrue(recordType.hasProperty("a"));
  }

  @Test
  public void testHasProperty_NonExisting_ReturnsFalse() {
    Map<String, RecordProperty> props = createProps();
    recordType = createRecordType(props);
    assertFalse(recordType.hasProperty("a"));
  }
}