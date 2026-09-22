package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.Map;
import java.util.TreeMap;

public class RecordTypeTest {
  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;
  private StaticScope<JSType> scope;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    errorReporter = null;
    scope = null;
  }

  @Test
  public void testIsEquivalentToSameRecord() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);
    assertTrue(record.isEquivalentTo(record));
  }

  @Test
  public void testIsEquivalentToDifferentKeySets() {
    Map<String, RecordProperty> props1 = new TreeMap<>();
    RecordProperty prop1 = new RecordProperty();
    prop1.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props1.put("x", prop1);
    RecordType record1 = new RecordType(registry, props1);

    Map<String, RecordProperty> props2 = new TreeMap<>();
    RecordProperty prop2 = new RecordProperty();
    prop2.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props2.put("y", prop2);
    RecordType record2 = new RecordType(registry, props2);

    assertFalse(record1.isEquivalentTo(record2));
  }

  @Test
  public void testIsEquivalentToSameProperties() {
    Map<String, RecordProperty> props1 = new TreeMap<>();
    RecordProperty prop1 = new RecordProperty();
    prop1.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props1.put("x", prop1);
    RecordType record1 = new RecordType(registry, props1);

    Map<String, RecordProperty> props2 = new TreeMap<>();
    RecordProperty prop2 = new RecordProperty();
    prop2.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props2.put("x", prop2);
    RecordType record2 = new RecordType(registry, props2);

    assertTrue(record1.isEquivalentTo(record2));
    assertTrue(record2.isEquivalentTo(record1));
  }

  @Test
  public void testIsEquivalentToPropertyTypeMismatch() {
    Map<String, RecordProperty> props1 = new TreeMap<>();
    RecordProperty prop1 = new RecordProperty();
    prop1.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props1.put("x", prop1);
    RecordType record1 = new RecordType(registry, props1);

    Map<String, RecordProperty> props2 = new TreeMap<>();
    RecordProperty prop2 = new RecordProperty();
    prop2.setType(registry.getNativeType(JSTypeNative.STRING_TYPE));
    props2.put("x", prop2);
    RecordType record2 = new RecordType(registry, props2);

    assertFalse(record1.isEquivalentTo(record2));
  }

  @Test
  public void testIsEquivalentToNonRecordType() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);
    assertFalse(record.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
  }

  @Test
  public void testConstructorNullRecordPropertyThrows() {
    Map<String, RecordProperty> props = new TreeMap<>();
    props.put("x", null);
    try {
      new RecordType(registry, props);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      assertEquals("RecordProperty associated with a property should not be null!", e.getMessage());
    }
  }

  @Test
  public void testDefinePropertyAfterFreeze() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);

    assertFalse(record.defineProperty("y", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null));
    assertFalse(record.hasProperty("y"));
  }

  @Test
  public void testGetImplicitPrototype() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);
    assertNotNull(record.getImplicitPrototype());
    assertEquals(JSTypeNative.OBJECT_TYPE, record.getImplicitPrototype().getJSType());
  }

  @Test
  public void testToMaybeRecordType() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);
    assertSame(record, record.toMaybeRecordType());
  }

  @Test
  public void testResolveInternal() {
    Map<String, RecordProperty> props = new TreeMap<>();
    RecordProperty prop = new RecordProperty();
    prop.setType(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
    props.put("x", prop);
    RecordType record = new RecordType(registry, props);
    JSType resolved = record.resolveInternal(errorReporter, scope);
    assertNotNull(resolved);
  }
}