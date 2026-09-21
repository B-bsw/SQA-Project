package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

public class RecordTypeBuilderTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;

  @Before
  public void setUp() {
    ErrorReporter reporter = new ErrorReporter() {
      @Override
      public void warning(String message, String sourceName, int line,
          int lineOffset) {
        // no-op for tests
      }

      @Override
      public void error(String message, String sourceName, int line,
          int lineOffset) {
        // no-op for tests
      }
    };
    registry = new JSTypeRegistry(reporter);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
  }

  @Test
  public void testEmptyBuilderReturnsObjectType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType result = builder.build();
    JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertSame(objectType, result);
  }

  @Test
  public void testAddSinglePropertyThenBuild() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder result = builder.addProperty("foo", numberType, null);
    assertNotNull(result);
    assertSame(builder, result);

    JSType built = builder.build();
    assertNotNull(built);
    assertTrue(built.isRecordType());

    ObjectType objType = built.toObjectType();
    assertNotNull(objType);
    assertTrue(objType.hasProperty("foo"));
    assertEquals(numberType, objType.getPropertyType("foo"));
  }

  @Test
  public void testAddMultiplePropertiesThenBuild() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("foo", numberType, null);
    builder.addProperty("bar", stringType, null);

    JSType built = builder.build();
    ObjectType objType = built.toObjectType();
    assertNotNull(objType);
    assertTrue(objType.hasProperty("foo"));
    assertTrue(objType.hasProperty("bar"));
    assertEquals(numberType, objType.getPropertyType("foo"));
    assertEquals(stringType, objType.getPropertyType("bar"));
  }

  @Test
  public void testAddDuplicatePropertyReturnsNull() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder first = builder.addProperty("foo", numberType, null);
    assertNotNull(first);

    RecordTypeBuilder duplicate = builder.addProperty("foo", stringType, null);
    assertNull(duplicate);

    // Verify the original property type was not overwritten.
    JSType built = builder.build();
    ObjectType objType = built.toObjectType();
    assertEquals(numberType, objType.getPropertyType("foo"));
  }

  @Test
  public void testAddPropertyWithNullType() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder result = builder.addProperty("foo", null, null);
    assertNotNull(result);

    JSType built = builder.build();
    assertTrue(built.isRecordType());
    ObjectType objType = built.toObjectType();
    assertTrue(objType.hasProperty("foo"));
  }

  @Test
  public void testAddPropertyWithNode() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    Node node = Node.newString("foo");
    RecordTypeBuilder result = builder.addProperty("foo", numberType, node);
    assertNotNull(result);

    JSType built = builder.build();
    assertTrue(built.isRecordType());
    ObjectType objType = built.toObjectType();
    assertTrue(objType.hasProperty("foo"));
  }

  @Test
  public void testChainingMultipleAddProperty() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder chained = builder
        .addProperty("foo", numberType, null)
        .addProperty("bar", stringType, null);
    assertNotNull(chained);
    assertSame(builder, chained);

    JSType built = builder.build();
    ObjectType objType = built.toObjectType();
    assertTrue(objType.hasProperty("foo"));
    assertTrue(objType.hasProperty("bar"));
  }

  @Test
  public void testAddPropertyWithNullNameWorksAsHashMapKey() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    RecordTypeBuilder result = builder.addProperty(null, numberType, null);
    assertNotNull(result);

    // Adding again with the same null key should be treated as duplicate.
    RecordTypeBuilder duplicate = builder.addProperty(null, stringType, null);
    assertNull(duplicate);
  }

  @Test
  public void testAddPropertyMarksBuilderNonEmptyEvenOnDuplicate() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    // Even a failed (duplicate) addProperty call should mark isEmpty false,
    // but first we need at least one successful add to create a duplicate
    // scenario. This test verifies build() no longer returns the native
    // OBJECT_TYPE once addProperty has been called at all.
    builder.addProperty("foo", numberType, null);
    JSType built = builder.build();
    JSType objectType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertNotSame(objectType, built);
  }

  @Test
  public void testBuildReturnsRecordTypeInstanceWhenNotEmpty() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("x", numberType, null);
    JSType built = builder.build();
    assertTrue(built instanceof RecordType);
  }

  @Test
  public void testBuildDoesNotReturnRecordTypeWhenEmpty() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType built = builder.build();
    assertFalse(built instanceof RecordType);
  }

  @Test
  public void testConstructorStoresRegistryImplicitlyViaBuildBehavior() {
    // Verify that build() on an empty builder uses the same registry
    // instance passed to the constructor.
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    JSType built = builder.build();
    JSType expected = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    assertSame(expected, built);
  }

  @Test
  public void testMultiplePropertiesWithSameTypeDifferentNames() {
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    builder.addProperty("a", numberType, null);
    builder.addProperty("b", numberType, null);
    builder.addProperty("c", numberType, null);

    JSType built = builder.build();
    ObjectType objType = built.toObjectType();
    assertTrue(objType.hasProperty("a"));
    assertTrue(objType.hasProperty("b"));
    assertTrue(objType.hasProperty("c"));
    assertEquals(numberType, objType.getPropertyType("a"));
    assertEquals(numberType, objType.getPropertyType("b"));
    assertEquals(numberType, objType.getPropertyType("c"));
  }
}