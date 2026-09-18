package com.google.javascript.rhino;

import com.google.javascript.rhino.JSDocInfo.Visibility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JSDocInfoBuilderTest {

  private JSDocInfoBuilder builderWithDocs;
  private JSDocInfoBuilder builderNoDocs;
  private JSTypeExpression dummyType;
  private Node dummyNode;

  @Before
  public void setUp() {
    builderWithDocs = new JSDocInfoBuilder(true);
    builderNoDocs = new JSDocInfoBuilder(false);
    dummyNode = new Node(0);
    dummyType = new JSTypeExpression(dummyNode, "source.js");
  }

  @Test
  public void build_givenNotPopulated_shouldReturnNull() {
    // Arrange & Act
    JSDocInfo result = builderWithDocs.build("test.js");

    // Assert
    Assert.assertNull(result);
    Assert.assertFalse(builderWithDocs.isPopulated());
  }

  @Test
  public void build_givenPopulatedWithoutVisibility_shouldDefaultToInherited() {
    // Arrange
    builderWithDocs.recordDeprecated();
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act
    JSDocInfo info = builderWithDocs.build("test.js");

    // Assert
    Assert.assertNotNull(info);
    Assert.assertEquals("test.js", info.getSourceName());
    Assert.assertEquals(Visibility.INHERITED, info.getVisibility());
    Assert.assertFalse(builderWithDocs.isPopulated());
  }

  @Test
  public void build_givenPopulatedWithVisibility_shouldPreserveVisibility() {
    // Arrange
    builderWithDocs.recordVisibility(Visibility.PRIVATE);

    // Act
    JSDocInfo info = builderWithDocs.build("source.js");

    // Assert
    Assert.assertNotNull(info);
    Assert.assertEquals(Visibility.PRIVATE, info.getVisibility());
  }

  @Test
  public void isPopulatedWithFileOverview_givenFileOverviewRecorded_shouldReturnTrue() {
    // Arrange
    Assert.assertFalse(builderWithDocs.isPopulatedWithFileOverview());

    // Act
    boolean recorded = builderWithDocs.recordFileOverview("A file overview description");

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
    Assert.assertTrue(builderWithDocs.isPopulatedWithFileOverview());
  }

  @Test
  public void isPopulatedWithFileOverview_givenDuplicateFileOverview_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordFileOverview("First overview");

    // Act
    boolean recordedAgain = builderWithDocs.recordFileOverview("Second overview");

    // Assert
    Assert.assertFalse(recordedAgain);
  }

  @Test
  public void isDescriptionRecorded_givenDescriptionRecorded_shouldReturnTrue() {
    // Arrange
    Assert.assertFalse(builderWithDocs.isDescriptionRecorded());

    // Act
    boolean recorded = builderWithDocs.recordDescription("Some description");

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isDescriptionRecorded());
  }

  @Test
  public void recordDescription_givenNullOrDuplicate_shouldReturnFalse() {
    // Act & Assert: null description
    boolean recordedNull = builderWithDocs.recordDescription(null);
    Assert.assertFalse(recordedNull);

    // Act & Assert: first valid description
    boolean recordedFirst = builderWithDocs.recordDescription("First");
    Assert.assertTrue(recordedFirst);

    // Act & Assert: duplicate description
    boolean recordedSecond = builderWithDocs.recordDescription("Second");
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordBlockDescription_givenParseDocumentationTrue_shouldSetPopulated() {
    // Act
    boolean recorded = builderWithDocs.recordBlockDescription("Block text");

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordBlockDescription_givenParseDocumentationFalse_shouldNotSetPopulated() {
    // Act
    boolean recorded = builderNoDocs.recordBlockDescription("Block text");

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertFalse(builderNoDocs.isPopulated());
  }

  @Test
  public void recordVisibility_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first time
    boolean recordedFirst = builderWithDocs.recordVisibility(Visibility.PROTECTED);
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordVisibility(Visibility.PUBLIC);
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordParameter_givenValidParam_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordParameter("param1", dummyType);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
    Assert.assertTrue(builderWithDocs.hasParameter("param1"));
    Assert.assertFalse(builderWithDocs.hasParameter("unknown"));
  }

  @Test
  public void recordParameter_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange: add type tag
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordParameter("param1", dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordParameterDescription_givenValidParam_shouldReturnTrue() {
    // Arrange
    builderWithDocs.recordParameter("param1", dummyType);

    // Act
    boolean recorded = builderWithDocs.recordParameterDescription("param1", "A parameter description");

    // Assert
    Assert.assertTrue(recorded);
  }

  @Test
  public void recordParameterDescription_givenUnknownParam_shouldReturnFalse() {
    // Act
    boolean recorded = builderWithDocs.recordParameterDescription("nonExistent", "Desc");

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordTemplateTypeName_givenTypeName_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: first time
    boolean recordedFirst = builderWithDocs.recordTemplateTypeName("T");
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate template name
    boolean recordedDuplicate = builderWithDocs.recordTemplateTypeName("T");
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordThrowType_givenNoSingletonType_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordThrowType(dummyType);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordThrowType_givenSingletonTypePresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordThrowType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordThrowDescription_givenValidAndInvalidType_shouldReturnExpected() {
    // Arrange
    builderWithDocs.recordThrowType(dummyType);

    // Act & Assert: documented with recorded type
    boolean recordedValid = builderWithDocs.recordThrowDescription(dummyType, "Throws error");
    Assert.assertTrue(recordedValid);

    // Act & Assert: documented with unrecorded type
    JSTypeExpression unrecorded = new JSTypeExpression(dummyNode, "other.js");
    boolean recordedInvalid = builderWithDocs.recordThrowDescription(unrecorded, "Throws error");
    Assert.assertFalse(recordedInvalid);
  }

  @Test
  public void addAuthor_givenValidAuthor_shouldReturnTrue() {
    // Act
    boolean added = builderWithDocs.addAuthor("Jane Doe");

    // Assert
    Assert.assertTrue(added);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void addReference_givenValidReference_shouldReturnTrue() {
    // Act
    boolean added = builderWithDocs.addReference("RFC 2616");

    // Assert
    Assert.assertTrue(added);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordVersion_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordVersion("1.0.0");
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordVersion("2.0.0");
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordDeprecationReason_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordDeprecationReason("Use newMethod instead.");
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordDeprecationReason("Use anotherMethod.");
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordSuppressions_givenSuppressionsSet_shouldReturnTrue() {
    // Arrange
    Set<String> suppressions = new HashSet<String>();
    suppressions.add("checkTypes");

    // Act
    boolean recorded = builderWithDocs.recordSuppressions(suppressions);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordType_givenNullOrTypeRelatedTagsPresent_shouldReturnFalse() {
    // Act & Assert: null type
    boolean recordedNull = builderWithDocs.recordType(null);
    Assert.assertFalse(recordedNull);

    // Arrange: set a type-related tag (constructor)
    builderWithDocs.recordConstructor();

    // Act & Assert: type when constructor is already set
    boolean recordedWithConstructor = builderWithDocs.recordType(dummyType);
    Assert.assertFalse(recordedWithConstructor);
  }

  @Test
  public void recordType_givenValidTypeAndNoConflict_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Second call should fail because singleton type tag is now present
    boolean recordedSecond = builderWithDocs.recordType(dummyType);
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordTypedef_givenValidType_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: null type
    Assert.assertFalse(builderWithDocs.recordTypedef(null));

    // Act & Assert: valid type
    boolean recorded = builderWithDocs.recordTypedef(dummyType);
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate typedef call
    boolean recordedDuplicate = builderWithDocs.recordTypedef(dummyType);
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordReturnType_givenValidType_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: null type
    Assert.assertFalse(builderWithDocs.recordReturnType(null));

    // Act & Assert: valid return type
    boolean recorded = builderWithDocs.recordReturnType(dummyType);
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate return type
    boolean recordedDuplicate = builderWithDocs.recordReturnType(dummyType);
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordReturnType_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordReturnType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordReturnDescription_givenValidDescription_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordReturnDescription("The calculation result");

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordDefineType_givenValidType_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordDefineType(dummyType);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordDefineType_givenNullType_shouldReturnFalse() {
    // Act
    boolean recorded = builderWithDocs.recordDefineType(null);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordDefineType_givenAlreadyConstant_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordConstancy();

    // Act
    boolean recorded = builderWithDocs.recordDefineType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordDefineType_givenAlreadyDefine_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordDefineType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordDefineType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordEnumParameterType_givenValidType_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: null type
    Assert.assertFalse(builderWithDocs.recordEnumParameterType(null));

    // Act & Assert: valid type
    boolean recorded = builderWithDocs.recordEnumParameterType(dummyType);
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedDuplicate = builderWithDocs.recordEnumParameterType(dummyType);
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordThisType_givenValidType_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: null type
    Assert.assertFalse(builderWithDocs.recordThisType(null));

    // Act & Assert: valid type
    boolean recorded = builderWithDocs.recordThisType(dummyType);
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedDuplicate = builderWithDocs.recordThisType(dummyType);
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordThisType_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordThisType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordBaseType_givenValidType_shouldReturnTrueAndDuplicateFalse() {
    // Act & Assert: null type
    Assert.assertFalse(builderWithDocs.recordBaseType(null));

    // Act & Assert: valid base type
    boolean recorded = builderWithDocs.recordBaseType(dummyType);
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedDuplicate = builderWithDocs.recordBaseType(dummyType);
    Assert.assertFalse(recordedDuplicate);
  }

  @Test
  public void recordBaseType_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordBaseType(dummyType);

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordConstancy_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordConstancy();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordConstancy();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordHiddenness_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordHiddenness();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordHiddenness();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordNoTypeCheck_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordNoTypeCheck();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordNoTypeCheck();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordConstructor_givenFirstAndDuplicate_shouldReturnExpected() {
    // Arrange
    Assert.assertFalse(builderWithDocs.isConstructorRecorded());

    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordConstructor();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isConstructorRecorded());
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordConstructor();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordConstructor_givenInterfaceAlreadyRecorded_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordInterface();

    // Act
    boolean recorded = builderWithDocs.recordConstructor();

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordConstructor_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordConstructor();

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordInterface_givenFirstAndDuplicate_shouldReturnExpected() {
    // Arrange
    Assert.assertFalse(builderWithDocs.isInterfaceRecorded());

    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordInterface();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isInterfaceRecorded());
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordInterface();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordInterface_givenConstructorAlreadyRecorded_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordConstructor();

    // Act
    boolean recorded = builderWithDocs.recordInterface();

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordInterface_givenSingletonTypeTagPresent_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordType(dummyType);

    // Act
    boolean recorded = builderWithDocs.recordInterface();

    // Assert
    Assert.assertFalse(recorded);
  }

  @Test
  public void recordPreserveTry_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordPreserveTry();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordPreserveTry();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordOverride_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordOverride();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordOverride();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordNoAlias_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordNoAlias();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordNoAlias();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordDeprecated_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordDeprecated();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordDeprecated();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordExport_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordExport();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordExport();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordNoShadow_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordNoShadow();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordNoShadow();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordImplicitCast_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordImplicitCast();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordImplicitCast();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordNoSideEffects_givenFirstAndDuplicate_shouldReturnExpected() {
    // Act & Assert: first call
    boolean recordedFirst = builderWithDocs.recordNoSideEffects();
    Assert.assertTrue(recordedFirst);
    Assert.assertTrue(builderWithDocs.isPopulated());

    // Act & Assert: duplicate call
    boolean recordedSecond = builderWithDocs.recordNoSideEffects();
    Assert.assertFalse(recordedSecond);
  }

  @Test
  public void recordImplementedInterface_givenValidInterface_shouldReturnTrue() {
    // Act
    boolean recorded = builderWithDocs.recordImplementedInterface(dummyType);

    // Assert
    Assert.assertTrue(recorded);
    Assert.assertTrue(builderWithDocs.isPopulated());
  }

  @Test
  public void recordImplementedInterface_givenDuplicateInterface_shouldReturnFalse() {
    // Arrange
    builderWithDocs.recordImplementedInterface(dummyType);

    // Act
    boolean recordedAgain = builderWithDocs.recordImplementedInterface(dummyType);

    // Assert
    Assert.assertFalse(recordedAgain);
  }

  @Test
  public void markAnnotationAndRelatedMarkers_givenValidCalls_shouldPopulateMarkers() {
    // Arrange & Act
    builderWithDocs.markAnnotation("param", 10, 5);
    builderWithDocs.markText("descriptive text", 10, 12, 10, 28);
    builderWithDocs.markTypeNode(dummyNode, 10, 29, 35, true);
    builderWithDocs.markName("argName", 10, 36);

    // Assert: Populating a tag to allow build
    builderWithDocs.recordDeprecated();
    JSDocInfo info = builderWithDocs.build("test.js");
    Assert.assertNotNull(info);
    Assert.assertNotNull(info.getMarkers());
    Assert.assertEquals(1, info.getMarkers().size());

    JSDocInfo.Marker marker = info.getMarkers().iterator().next();
    Assert.assertNotNull(marker.annotation);
    Assert.assertEquals("param", marker.annotation.getItem());
    Assert.assertEquals(10, marker.annotation.getStartLine());
    Assert.assertEquals(5, marker.annotation.getPositionOnStartLine());
    Assert.assertEquals(10, marker.annotation.getEndLine());
    Assert.assertEquals(10, marker.annotation.getPositionOnEndLine());

    Assert.assertNotNull(marker.description);
    Assert.assertEquals("descriptive text", marker.description.getItem());
    Assert.assertEquals(10, marker.description.getStartLine());
    Assert.assertEquals(12, marker.description.getPositionOnStartLine());
    Assert.assertEquals(10, marker.description.getEndLine());
    Assert.assertEquals(28, marker.description.getPositionOnEndLine());

    Assert.assertNotNull(marker.type);
    Assert.assertEquals(dummyNode, marker.type.getItem());
    Assert.assertTrue(marker.type.hasBrackets);
    Assert.assertEquals(10, marker.type.getStartLine());
    Assert.assertEquals(29, marker.type.getPositionOnStartLine());
    Assert.assertEquals(10, marker.type.getEndLine());
    Assert.assertEquals(35, marker.type.getPositionOnEndLine());

    Assert.assertNotNull(marker.name);
    Assert.assertEquals("argName", marker.name.getItem());
    Assert.assertEquals(10, marker.name.getStartLine());
    Assert.assertEquals(36, marker.name.getPositionOnStartLine());
    Assert.assertEquals(10, marker.name.getEndLine());
    Assert.assertEquals(43, marker.name.getPositionOnEndLine());
  }

  @Test
  public void markText_givenNoActiveMarker_shouldNotThrowException() {
    // Act & Assert (currentMarker is null)
    builderWithDocs.markText("text without marker", 1, 0, 1, 10);
    builderWithDocs.markTypeNode(dummyNode, 1, 0, 10, false);
    builderWithDocs.markName("nameWithoutMarker", 1, 0);

    // Should complete cleanly without NullPointerException
    Assert.assertFalse(builderWithDocs.isPopulated());
  }

  @Test
  public void hasAnyTypeRelatedTags_givenBaseType_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordBaseType(dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnyTypeRelatedTags_givenThisType_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordThisType(dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnyTypeRelatedTags_givenReturnType_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordReturnType(dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnyTypeRelatedTags_givenParameter_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordParameter("paramA", dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnyTypeRelatedTags_givenInterface_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordInterface();

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnySingletonTypeTags_givenTypedefType_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordTypedef(dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }

  @Test
  public void hasAnySingletonTypeTags_givenEnumParameterType_shouldPreventRecordType() {
    // Arrange
    builderWithDocs.recordEnumParameterType(dummyType);

    // Act
    boolean typeRecorded = builderWithDocs.recordType(dummyType);

    // Assert
    Assert.assertFalse(typeRecorded);
  }
}