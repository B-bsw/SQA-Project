package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Phase 1 - Code Analysis & Test Matrix:
 *
 * 1. Happy Path:
 *    - build_whenEmpty_shouldReturnNativeObjectType:
 *        Empty builder returns native ObjectType from registry.
 *    - addProperty_givenSingleProperty_shouldReturnBuilderAndBuildRecordType:
 *        Adding a valid unique property returns this (chaining), and build() creates a RecordType.
 *    - addProperty_givenMultipleProperties_shouldReturnBuilderAndBuildRecordType:
 *        Adding multiple distinct properties maintains chaining and returns a RecordType with all properties.
 *    - recordProperty_givenValidTypeAndNode_shouldReturnStoredValues:
 *        Validates RecordProperty constructor, getType(), and getPropertyNode() getters.
 *
 * 2. Boundary & Edge Cases:
 *    - addProperty_givenDuplicatePropertyName_shouldReturnNull:
 *        Adding a property with an already existing name returns null.
 *    - addProperty_givenDuplicatePropertyNameCaseSensitive_shouldAllowBoth:
 *        Property names "prop" and "PROP" are treated as distinct keys in HashMap.
 *    - addProperty_givenEmptyPropertyName_shouldAddSuccessfully:
 *        Empty string "" is a valid property name and builds successfully.
 *    - addProperty_givenNullPropertyName_shouldAddSuccessfullyAndRejectDuplicateNull:
 *        HashMap permits null key; first add returns this, second add with null returns null.
 *    - addProperty_givenNullTypeAndNullPropertyNode_shouldStoreNulls:
 *        Tolerates null JSType and null Node, marking builder as non-empty.
 *    - build_afterFailedDuplicatePropertyAddition_shouldStillBuildRecordType:
 *        Failed duplicate addProperty still preserves isEmpty=false and creates RecordType.
 *
 * 3. Error & Exception Branches:
 *    - build_givenNullRegistryWhenEmpty_shouldThrowNullPointerException:
 *        When builder is empty and registry is null, calling build() throws NullPointerException.
 */
public class RecordTypeBuilderTest {

  private JSTypeRegistry registry;
  private JSType stringType;
  private JSType numberType;
  private Node dummyNode1;
  private Node dummyNode2;

  @Before
  public void setUp() {
    this.registry = new JSTypeRegistry(new SimpleErrorReporter());
    this.stringType = this.registry.getNativeType(JSTypeNative.STRING_TYPE);
    this.numberType = this.registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    this.dummyNode1 = new Node(0);
    this.dummyNode2 = new Node(0);
  }

  // ==========================================
  // Happy Path Tests
  // ==========================================

  @Test
  public void build_whenEmpty_shouldReturnNativeObjectType() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    // Act
    JSType result = builder.build();

    // Assert
    Assert.assertNotNull(result);
    JSType expectedNativeType = registry.getNativeObjectType(JSTypeNative.OBJECT_TYPE);
    Assert.assertSame(expectedNativeType, result);
    Assert.assertFalse(result.isRecordType());
  }

  @Test
  public void addProperty_givenSingleProperty_shouldReturnBuilderAndBuildRecordType() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String propName = "name";

    // Act
    RecordTypeBuilder returnedBuilder = builder.addProperty(propName, stringType, dummyNode1);
    JSType result = builder.build();

    // Assert
    Assert.assertSame(builder, returnedBuilder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty(propName));
    Assert.assertSame(stringType, recordType.getPropertyType(propName));
    Assert.assertSame(dummyNode1, recordType.getPropertyNode(propName));
  }

  @Test
  public void addProperty_givenMultipleProperties_shouldReturnBuilderAndBuildRecordType() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String prop1 = "field1";
    String prop2 = "field2";

    // Act
    RecordTypeBuilder step1 = builder.addProperty(prop1, stringType, dummyNode1);
    RecordTypeBuilder step2 = builder.addProperty(prop2, numberType, dummyNode2);
    JSType result = builder.build();

    // Assert
    Assert.assertSame(builder, step1);
    Assert.assertSame(builder, step2);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty(prop1));
    Assert.assertTrue(recordType.hasProperty(prop2));
    Assert.assertSame(stringType, recordType.getPropertyType(prop1));
    Assert.assertSame(numberType, recordType.getPropertyType(prop2));
  }

  @Test
  public void recordProperty_givenValidTypeAndNode_shouldReturnStoredValues() {
    // Arrange
    JSType type = stringType;
    Node node = dummyNode1;

    // Act
    RecordTypeBuilder.RecordProperty recordProperty =
        new RecordTypeBuilder.RecordProperty(type, node);

    // Assert
    Assert.assertSame(type, recordProperty.getType());
    Assert.assertSame(node, recordProperty.getPropertyNode());
  }

  // ==========================================
  // Boundary & Edge Cases
  // ==========================================

  @Test
  public void addProperty_givenDuplicatePropertyName_shouldReturnNull() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String propName = "duplicateProp";
    builder.addProperty(propName, stringType, dummyNode1);

    // Act
    RecordTypeBuilder duplicateResult = builder.addProperty(propName, numberType, dummyNode2);

    // Assert
    Assert.assertNull(duplicateResult);
  }

  @Test
  public void addProperty_givenDuplicatePropertyNameCaseSensitive_shouldAllowBoth() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String propLower = "property";
    String propUpper = "PROPERTY";

    // Act
    RecordTypeBuilder result1 = builder.addProperty(propLower, stringType, dummyNode1);
    RecordTypeBuilder result2 = builder.addProperty(propUpper, numberType, dummyNode2);
    JSType builtType = builder.build();

    // Assert
    Assert.assertSame(builder, result1);
    Assert.assertSame(builder, result2);
    Assert.assertTrue(builtType.isRecordType());
    RecordType recordType = (RecordType) builtType;
    Assert.assertTrue(recordType.hasProperty(propLower));
    Assert.assertTrue(recordType.hasProperty(propUpper));
  }

  @Test
  public void addProperty_givenEmptyPropertyName_shouldAddSuccessfully() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String emptyName = "";

    // Act
    RecordTypeBuilder returnedBuilder = builder.addProperty(emptyName, stringType, dummyNode1);
    JSType result = builder.build();

    // Assert
    Assert.assertSame(builder, returnedBuilder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertTrue(recordType.hasProperty(emptyName));
  }

  @Test
  public void addProperty_givenNullPropertyName_shouldAddSuccessfullyAndRejectDuplicateNull() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);

    // Act
    RecordTypeBuilder firstAdd = builder.addProperty(null, stringType, dummyNode1);
    RecordTypeBuilder secondAdd = builder.addProperty(null, numberType, dummyNode2);

    // Assert
    Assert.assertSame(builder, firstAdd);
    Assert.assertNull(secondAdd);
  }

  @Test
  public void addProperty_givenNullTypeAndNullPropertyNode_shouldStoreNulls() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String propName = "nullValuesProp";

    // Act
    RecordTypeBuilder returnedBuilder = builder.addProperty(propName, null, null);
    JSType result = builder.build();

    // Assert
    Assert.assertSame(builder, returnedBuilder);
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
  }

  @Test
  public void build_afterFailedDuplicatePropertyAddition_shouldStillBuildRecordType() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(registry);
    String propName = "stableProp";
    builder.addProperty(propName, stringType, dummyNode1);
    builder.addProperty(propName, numberType, dummyNode2); // rejected duplicate

    // Act
    JSType result = builder.build();

    // Assert
    Assert.assertNotNull(result);
    Assert.assertTrue(result.isRecordType());
    RecordType recordType = (RecordType) result;
    Assert.assertSame(stringType, recordType.getPropertyType(propName));
    Assert.assertSame(dummyNode1, recordType.getPropertyNode(propName));
  }

  // ==========================================
  // Error & Exception Branches
  // ==========================================

  @Test
  public void build_givenNullRegistryWhenEmpty_shouldThrowNullPointerException() {
    // Arrange
    RecordTypeBuilder builder = new RecordTypeBuilder(null);

    // Act & Assert
    try {
      builder.build();
      Assert.fail("Expected NullPointerException when registry is null and builder is empty.");
    } catch (NullPointerException e) {
      // Expected exception branch
      Assert.assertNotNull(e);
    }
  }
}