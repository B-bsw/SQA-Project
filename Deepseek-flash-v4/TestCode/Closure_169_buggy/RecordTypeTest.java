package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.RecordTypeBuilder;
import com.google.javascript.rhino.jstype.RecordTypeBuilder.RecordProperty;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class RecordTypeTest {

  private JSTypeRegistry registry;
  private ErrorReporter errorReporter;

  @Before
  public void setUp() throws Exception {
    // Create a minimal registry and error reporter for tests
    registry = new JSTypeRegistry();
    errorReporter = new ErrorReporter() {
      @Override
      public void error(String message, String sourceName, int line, int lineOffset) {
        throw new AssertionError("Unexpected error: " + message);
      }
      @Override
      public void warning(String message, String sourceName, int line, int lineOffset) {
        throw new AssertionError("Unexpected warning: " + message);
      }
    };
  }

  @Test
  public void testConstructor_NullProperty() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    props.put("prop", null);
    try {
      new RecordType(registry, props, true);
      fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // expected
    }
  }

  @Test
  public void testConstructor_DeclaredProperties() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    builder.addProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    assertNotNull(record);
    assertFalse(record.isSynthetic());
    assertEquals(2, record.getPropertiesCount());
    assertEquals(registry.getNativeType(JSTypeNative.NUMBER_TYPE), record.getPropertyType("a"));
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), record.getPropertyType("b"));
  }

  @Test
  public void testConstructor_SynthesizedProperties() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("x", registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), false);
    assertNotNull(record);
    assertTrue(record.isSynthetic());
    assertEquals(1, record.getPropertiesCount());
    assertEquals(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE), record.getPropertyType("x"));
  }

  @Test
  public void testGetImplicitPrototype() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    ObjectType implicitProto = record.getImplicitPrototype();
    assertNotNull(implicitProto);
    assertEquals(registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE), implicitProto);
  }

  @Test
  public void testDefineProperty_NotInferred() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    Node propertyNode = new Node(1);
    boolean result = record.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, propertyNode);
    assertTrue(result);
    assertEquals(2, record.getPropertiesCount());
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), record.getPropertyType("b"));
  }

  @Test
  public void testDefineProperty_Inferred() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    boolean result = record.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), true, null);
    assertTrue(result);
    assertEquals(1, record.getPropertiesCount());
  }

  @Test
  public void testDefineProperty_WhenFrozen_ReturnsFalse() throws Exception {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    // Try to set through reflection to freeze (since isFrozen is private)
    java.lang.reflect.Field field = RecordType.class.getDeclaredField("isFrozen");
    field.setAccessible(true);
    field.setBoolean(record, true);
    boolean result = record.defineProperty("b", registry.getNativeType(JSTypeNative.STRING_TYPE), false, null);
    assertFalse(result);
  }

  @Test
  public void testIsSubtype_WhenThisIsSubtypeOfThat_ReturnsTrue() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    Map<String, RecordProperty> thatProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thatBuilder = new RecordTypeBuilder(registry);
    thatBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thatRecord = new RecordType(registry, thatBuilder.getProperties(), true);

    assertTrue(thisRecord.isSubtype(thatRecord));
  }

  @Test
  public void testIsSubtype_WhenThisHasExtraProperty_ReturnsTrue() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    thisBuilder.addProperty("q", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    Map<String, RecordProperty> thatProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thatBuilder = new RecordTypeBuilder(registry);
    thatBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thatRecord = new RecordType(registry, thatBuilder.getProperties(), true);

    assertTrue(thisRecord.isSubtype(thatRecord));
  }

  @Test
  public void testIsSubtype_WhenThisMissingProperty_ReturnsFalse() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    Map<String, RecordProperty> thatProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thatBuilder = new RecordTypeBuilder(registry);
    thatBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    thatBuilder.addProperty("q", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    RecordType thatRecord = new RecordType(registry, thatBuilder.getProperties(), true);

    assertFalse(thisRecord.isSubtype(thatRecord));
  }

  @Test
  public void testIsSubtype_WhenPropertyTypeMismatch_ReturnsFalse() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    Map<String, RecordProperty> thatProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thatBuilder = new RecordTypeBuilder(registry);
    thatBuilder.addProperty("p", registry.getNativeType(JSTypeNative.STRING_TYPE), null);
    RecordType thatRecord = new RecordType(registry, thatBuilder.getProperties(), true);

    assertFalse(thisRecord.isSubtype(thatRecord));
  }

  @Test
  public void testIsSubtype_WhenThatIsObjectType_ReturnsTrue() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    ObjectType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertTrue(thisRecord.isSubtype(objectType));
  }

  @Test
  public void testIsSubtype_WhenThatIsNotRecordType_ReturnsFalse() {
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    assertFalse(thisRecord.isSubtype(numberType));
  }

  @Test
  public void testIsSubtype_WhenPropertyTypeUnknown_ReturnsTrue() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    Map<String, RecordProperty> thisProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thisBuilder = new RecordTypeBuilder(registry);
    thisBuilder.addProperty("p", unknownType, null);
    RecordType thisRecord = new RecordType(registry, thisBuilder.getProperties(), true);

    Map<String, RecordProperty> thatProps = new HashMap<String, RecordProperty>();
    RecordTypeBuilder thatBuilder = new RecordTypeBuilder(registry);
    thatBuilder.addProperty("p", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType thatRecord = new RecordType(registry, thatBuilder.getProperties(), true);

    assertTrue(thisRecord.isSubtype(thatRecord));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_EquivalentRecords_ReturnsTrue() {
    Map<String, RecordProperty> props1 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder1 = new RecordTypeBuilder(registry);
    builder1.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record1 = new RecordType(registry, builder1.getProperties(), true);

    Map<String, RecordProperty> props2 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder2 = new RecordTypeBuilder(registry);
    builder2.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record2 = new RecordType(registry, builder2.getProperties(), true);

    assertTrue(record1.checkRecordEquivalenceHelper(record2, false));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_DifferentProperties_ReturnsFalse() {
    Map<String, RecordProperty> props1 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder1 = new RecordTypeBuilder(registry);
    builder1.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record1 = new RecordType(registry, builder1.getProperties(), true);

    Map<String, RecordProperty> props2 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder2 = new RecordTypeBuilder(registry);
    builder2.addProperty("b", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record2 = new RecordType(registry, builder2.getProperties(), true);

    assertFalse(record1.checkRecordEquivalenceHelper(record2, false));
  }

  @Test
  public void testCheckRecordEquivalenceHelper_UnknownTypes_WithTolerateUnknownsTrue_ReturnsTrue() {
    JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    Map<String, RecordProperty> props1 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder1 = new RecordTypeBuilder(registry);
    builder1.addProperty("a", unknownType, null);
    RecordType record1 = new RecordType(registry, builder1.getProperties(), true);

    Map<String, RecordProperty> props2 = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder2 = new RecordTypeBuilder(registry);
    builder2.addProperty("a", unknownType, null);
    RecordType record2 = new RecordType(registry, builder2.getProperties(), true);

    assertTrue(record1.checkRecordEquivalenceHelper(record2, true));
  }

  @Test
  public void testResolveInternal_ResolvesPropertyTypes() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);

    // Create a scope that returns a different type for the property
    StaticScope<JSType> scope = new StaticScope<JSType>() {
      @Override
      public JSType getSlot(String name) {
        return null;
      }
      @Override
      public JSType getPropertyType(String name) {
        return registry.getNativeType(JSTypeNative.STRING_TYPE);
      }
    };

    RecordType resolved = (RecordType) record.resolveInternal(errorReporter, scope);
    assertNotNull(resolved);
    assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), resolved.getPropertyType("a"));
  }

  @Test
  public void testToMaybeRecordType_ReturnsThis() {
    Map<String, RecordProperty> props = new HashMap<String, RecordProperty>();
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", registry.getNativeType(JSTypeNative.NUMBER_TYPE), null);
    RecordType record = new RecordType(registry, builder.getProperties(), true);
    assertSame(record, record.toMaybeRecordType());
  }
}