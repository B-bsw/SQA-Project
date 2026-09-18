package com.google.javascript.rhino.jstype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionTypeTest {

  private JSTypeRegistry registry;
  private JSType numberType;
  private JSType stringType;
  private JSType booleanType;
  private JSType nullType;
  private JSType voidType;
  private JSType unknownType;
  private ObjectType objectType;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(null);
    numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
    stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
    booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
    nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
    unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
    objectType = (ObjectType) registry.getNativeType(JSTypeNative.OBJECT_TYPE);
  }

  private UnionType createUnion(JSType t1, JSType t2) {
    Set<JSType> set = new LinkedHashSet<JSType>();
    set.add(t1);
    set.add(t2);
    return new UnionType(registry, set);
  }

  private UnionType createUnion(JSType t1, JSType t2, JSType t3) {
    Set<JSType> set = new LinkedHashSet<JSType>();
    set.add(t1);
    set.add(t2);
    set.add(t3);
    return new UnionType(registry, set);
  }

  @Test
  public void getAlternates_givenAlternates_shouldReturnSameSet() {
    // Arrange
    Set<JSType> set = new HashSet<JSType>();
    set.add(numberType);
    set.add(stringType);
    UnionType union = new UnionType(registry, set);

    // Act
    Iterable<JSType> result = union.getAlternates();

    // Assert
    Assert.assertEquals(set, result);
  }

  @Test
  public void forgiveUnknownNames_givenUnionType_shouldInvokeWithoutException() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    union.forgiveUnknownNames();
  }

  @Test
  public void matchesNumberContext_givenNumberAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.matchesNumberContext();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void matchesNumberContext_givenNoNumberAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(voidType, nullType);

    // Act
    boolean result = union.matchesNumberContext();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void matchesStringContext_givenStringAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(stringType, numberType);

    // Act
    boolean result = union.matchesStringContext();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void matchesStringContext_givenVoidOnlyAlternate_shouldReturnFalse() {
    // Arrange
    Set<JSType> set = new HashSet<JSType>();
    set.add(voidType);
    UnionType union = new UnionType(registry, set);

    // Act
    boolean result = union.matchesStringContext();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void matchesObjectContext_givenObjectAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(objectType, nullType);

    // Act
    boolean result = union.matchesObjectContext();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void matchesObjectContext_givenNullAndVoid_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(nullType, voidType);

    // Act
    boolean result = union.matchesObjectContext();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void findPropertyType_givenNullOrVoidAlternate_shouldSkipThem() {
    // Arrange
    ObjectType record1 = registry.createRecordTypeBuilder()
        .addProperty("foo", numberType, null)
        .build();
    UnionType union = createUnion(nullType, record1);

    // Act
    JSType result = union.findPropertyType("foo");

    // Assert
    Assert.assertEquals(numberType, result);
  }

  @Test
  public void findPropertyType_givenAlternatesWithCommonProperty_shouldReturnLeastSupertype() {
    // Arrange
    ObjectType record1 = registry.createRecordTypeBuilder()
        .addProperty("foo", numberType, null)
        .build();
    ObjectType record2 = registry.createRecordTypeBuilder()
        .addProperty("foo", stringType, null)
        .build();
    UnionType union = createUnion(record1, record2);

    // Act
    JSType result = union.findPropertyType("foo");

    // Assert
    Assert.assertTrue(result.isUnionType());
    Assert.assertTrue(result.toMaybeUnionType().contains(numberType));
    Assert.assertTrue(result.toMaybeUnionType().contains(stringType));
  }

  @Test
  public void findPropertyType_givenMissingProperty_shouldReturnNull() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.findPropertyType("nonExistentProp");

    // Assert
    Assert.assertNull(result);
  }

  @Test
  public void canAssignTo_givenUnknownAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, unknownType);

    // Act
    boolean result = union.canAssignTo(stringType);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void canAssignTo_givenSubtypes_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, numberType);

    // Act
    boolean result = union.canAssignTo(numberType);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void canAssignTo_givenIncompatibleAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.canAssignTo(numberType);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void canBeCalled_givenNonCallableAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.canBeCalled();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void canBeCalled_givenAllCallableAlternates_shouldReturnTrue() {
    // Arrange
    FunctionType fn1 = registry.createFunctionType(numberType);
    FunctionType fn2 = registry.createFunctionType(stringType);
    UnionType union = createUnion(fn1, fn2);

    // Act
    boolean result = union.canBeCalled();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void restrictByNotNullOrUndefined_givenUnionContainingNullAndVoid_shouldRemoveThem() {
    // Arrange
    UnionType union = createUnion(numberType, nullType, voidType);

    // Act
    JSType result = union.restrictByNotNullOrUndefined();

    // Assert
    Assert.assertEquals(numberType, result);
  }

  @Test
  public void testForEquality_givenAlternatesDisagree_shouldReturnUnknown() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    TernaryValue result = union.testForEquality(numberType);

    // Assert
    Assert.assertEquals(TernaryValue.UNKNOWN, result);
  }

  @Test
  public void testForEquality_givenAllAlternatesAgree_shouldReturnAgreedValue() {
    // Arrange
    UnionType union = createUnion(numberType, numberType);

    // Act
    TernaryValue result = union.testForEquality(stringType);

    // Assert
    Assert.assertEquals(TernaryValue.FALSE, result);
  }

  @Test
  public void isNullable_givenNullAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, nullType);

    // Act
    boolean result = union.isNullable();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isNullable_givenNoNullAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.isNullable();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void isUnknownType_givenUnknownAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, unknownType);

    // Act
    boolean result = union.isUnknownType();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isUnknownType_givenNoUnknownAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.isUnknownType();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void getLeastSupertype_givenThatIsSubtypeOfAnAlternate_shouldReturnThis() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.getLeastSupertype(numberType);

    // Assert
    Assert.assertSame(union, result);
  }

  @Test
  public void getLeastSupertype_givenThatIsUnknownType_shouldDelegateToSuper() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.getLeastSupertype(unknownType);

    // Assert
    Assert.assertEquals(unknownType, result);
  }

  @Test
  public void getLeastSupertype_givenThatIsNotSubtypeOfAnyAlternate_shouldCombine() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.getLeastSupertype(booleanType);

    // Assert
    Assert.assertTrue(result.isUnionType());
    Assert.assertTrue(result.toMaybeUnionType().contains(numberType));
    Assert.assertTrue(result.toMaybeUnionType().contains(stringType));
    Assert.assertTrue(result.toMaybeUnionType().contains(booleanType));
  }

  @Test
  public void meet_givenIntersectingAlternates_shouldReturnSubtypeIntersection() {
    // Arrange
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, booleanType);

    // Act
    JSType result = union1.meet(union2);

    // Assert
    Assert.assertEquals(stringType, result);
  }

  @Test
  public void meet_givenDisjointPrimitives_shouldReturnNoType() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.meet(booleanType);

    // Assert
    Assert.assertEquals(registry.getNativeType(JSTypeNative.NO_TYPE), result);
  }

  @Test
  public void meet_givenDisjointObjects_shouldReturnNoObjectType() {
    // Arrange
    ObjectType record1 = registry.createRecordTypeBuilder().build();
    ObjectType record2 = registry.createRecordTypeBuilder().build();
    Set<JSType> set1 = new HashSet<JSType>();
    set1.add(record1);
    UnionType union = new UnionType(registry, set1);

    // Act
    JSType result = union.meet(record2);

    // Assert
    Assert.assertNotNull(result);
  }

  @Test
  public void meet_givenNonUnionSubtype_shouldAddThat() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.meet(numberType);

    // Assert
    Assert.assertEquals(numberType, result);
  }

  @Test
  public void equals_givenSameInstance_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    Assert.assertTrue(union.equals(union));
  }

  @Test
  public void equals_givenEquivalentUnion_shouldReturnTrue() {
    // Arrange
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, numberType);

    // Act & Assert
    Assert.assertTrue(union1.equals(union2));
  }

  @Test
  public void equals_givenDifferentType_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    Assert.assertFalse(union.equals(numberType));
    Assert.assertFalse(union.equals(null));
  }

  @Test
  public void hashCode_givenEqualUnions_shouldHaveEqualHashCodes() {
    // Arrange
    UnionType union1 = createUnion(numberType, stringType);
    UnionType union2 = createUnion(stringType, numberType);

    // Act & Assert
    Assert.assertEquals(union1.hashCode(), union2.hashCode());
  }

  @Test
  public void isUnionType_givenUnionInstance_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    Assert.assertTrue(union.isUnionType());
  }

  @Test
  public void isObject_givenAllObjectAlternates_shouldReturnTrue() {
    // Arrange
    ObjectType record1 = registry.createRecordTypeBuilder().build();
    UnionType union = createUnion(objectType, record1);

    // Act
    boolean result = union.isObject();

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isObject_givenPrimitiveAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(objectType, numberType);

    // Act
    boolean result = union.isObject();

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void contains_givenExistingAlternate_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    Assert.assertTrue(union.contains(numberType));
  }

  @Test
  public void contains_givenMissingAlternate_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act & Assert
    Assert.assertFalse(union.contains(booleanType));
  }

  @Test
  public void getRestrictedUnion_givenTypeToRemove_shouldFilterOutSubtypes() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType result = union.getRestrictedUnion(numberType);

    // Assert
    Assert.assertEquals(stringType, result);
  }

  @Test
  public void getRestrictedUnion_givenUnknownAlternate_shouldKeepUnknown() {
    // Arrange
    UnionType union = createUnion(unknownType, numberType);

    // Act
    JSType result = union.getRestrictedUnion(numberType);

    // Assert
    Assert.assertEquals(unknownType, result);
  }

  @Test
  public void toString_givenAlternates_shouldFormatAlphabetically() {
    // Arrange
    UnionType union = createUnion(stringType, numberType);

    // Act
    String result = union.toString();

    // Assert
    Assert.assertEquals("(number|string)", result);
  }

  @Test
  public void isSubtype_givenAllAlternatesAreSubtypes_shouldReturnTrue() {
    // Arrange
    UnionType union = createUnion(numberType, numberType);

    // Act
    boolean result = union.isSubtype(numberType);

    // Assert
    Assert.assertTrue(result);
  }

  @Test
  public void isSubtype_givenOneAlternateNotSubtype_shouldReturnFalse() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    boolean result = union.isSubtype(numberType);

    // Assert
    Assert.assertFalse(result);
  }

  @Test
  public void getRestrictedTypeGivenToBooleanOutcome_givenTrueOutcome_shouldFilterOutFalsy() {
    // Arrange
    UnionType union = createUnion(booleanType, nullType);

    // Act
    JSType result = union.getRestrictedTypeGivenToBooleanOutcome(true);

    // Assert
    Assert.assertNotNull(result);
    Assert.assertFalse(result.isNullable());
  }

  @Test
  public void getRestrictedTypeGivenToBooleanOutcome_givenFalseOutcome_shouldFilterOutTruthy() {
    // Arrange
    UnionType union = createUnion(booleanType, nullType);

    // Act
    JSType result = union.getRestrictedTypeGivenToBooleanOutcome(false);

    // Assert
    Assert.assertNotNull(result);
  }

  @Test
  public void getPossibleToBooleanOutcomes_givenBothOutcomes_shouldReturnBothAndBreakEarly() {
    // Arrange
    UnionType union = createUnion(booleanType, stringType);

    // Act
    BooleanLiteralSet result = union.getPossibleToBooleanOutcomes();

    // Assert
    Assert.assertEquals(BooleanLiteralSet.BOTH, result);
  }

  @Test
  public void getPossibleToBooleanOutcomes_givenEmptyUnion_shouldReturnEmpty() {
    // Arrange
    Set<JSType> emptySet = Collections.emptySet();
    UnionType union = new UnionType(registry, emptySet);

    // Act
    BooleanLiteralSet result = union.getPossibleToBooleanOutcomes();

    // Assert
    Assert.assertEquals(BooleanLiteralSet.EMPTY, result);
  }

  @Test
  public void getTypesUnderEquality_givenTargetType_shouldRestructureBothTypes() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    TypePair pair = union.getTypesUnderEquality(numberType);

    // Assert
    Assert.assertNotNull(pair);
    Assert.assertEquals(numberType, pair.typeA);
    Assert.assertEquals(numberType, pair.typeB);
  }

  @Test
  public void getTypesUnderInequality_givenTargetType_shouldFilterAccordingly() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    TypePair pair = union.getTypesUnderInequality(numberType);

    // Assert
    Assert.assertNotNull(pair);
    Assert.assertNotNull(pair.typeA);
    Assert.assertNotNull(pair.typeB);
  }

  @Test
  public void getTypesUnderShallowInequality_givenTargetType_shouldFilterAccordingly() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    TypePair pair = union.getTypesUnderShallowInequality(numberType);

    // Assert
    Assert.assertNotNull(pair);
    Assert.assertNotNull(pair.typeA);
    Assert.assertNotNull(pair.typeB);
  }

  @Test
  public void visit_givenVisitor_shouldCallCaseUnionType() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);
    Visitor<String> visitor = new Visitor<String>() {
      public String caseNoType() { return null; }
      public String caseUnknownType() { return null; }
      public String caseNullType() { return null; }
      public String caseNamedType(NamedType type) { return null; }
      public String caseBooleanType() { return null; }
      public String caseNumberType() { return null; }
      public String caseStringType() { return null; }
      public String caseVoidType() { return null; }
      public String caseUnionType(UnionType type) { return "visited union"; }
      public String caseObjectType(ObjectType type) { return null; }
      public String caseFunctionType(FunctionType type) { return null; }
      public String caseEnumElementType(EnumElementType type) { return null; }
      public String caseParameterizedType(ParameterizedType type) { return null; }
      public String caseTemplateType(TemplateType type) { return null; }
    };

    // Act
    String result = union.visit(visitor);

    // Assert
    Assert.assertEquals("visited union", result);
  }

  @Test
  public void resolveInternal_givenUnresolvedAlternates_shouldResolveAndReturnThis() {
    // Arrange
    UnionType union = createUnion(numberType, stringType);

    // Act
    JSType resolved = union.resolveInternal(null, null);

    // Assert
    Assert.assertSame(union, resolved);
    Assert.assertTrue(union.isResolved());
  }

  @Test
  public void resolveInternal_givenNamedTypeAlternate_shouldUpdateAlternatesWhenChanged() {
    // Arrange
    NamedType namedType = new NamedType(registry, "Number", null, 0, 0);
    Set<JSType> alternates = new HashSet<JSType>();
    alternates.add(namedType);
    UnionType union = new UnionType(registry, alternates);

    // Act
    JSType resolved = union.resolveInternal(null, null);

    // Assert
    Assert.assertSame(union, resolved);
    Assert.assertTrue(union.isResolved());
  }
}