package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.StaticScope;
import com.google.javascript.rhino.jstype.TernaryValue;

public class JSTypeTest {
    private JSTypeRegistry registry;
    private JSType allType;
    private JSType noType;
    private JSType unknownType;
    private JSType noResolvedType;
    private JSType stringValueType;
    private JSType numberValueType;
    private JSType booleanValueType;
    private JSType nullType;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
        stringValueType = registry.getNativeType(JSTypeNative.STRING_VALUE_TYPE);
        numberValueType = registry.getNativeType(JSTypeNative.NUMBER_VALUE_TYPE);
        booleanValueType = registry.getNativeType(JSTypeNative.BOOLEAN_VALUE_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
    }

    @Test
    public void testIsNoType() {
        assertTrue(noType.isNoType());
        assertFalse(allType.isNoType());
        assertFalse(unknownType.isNoType());
        assertFalse(stringValueType.isNoType());
    }

    @Test
    public void testIsNoResolvedType() {
        assertTrue(noResolvedType.isNoResolvedType());
        assertFalse(noType.isNoResolvedType());
    }

    @Test
    public void testIsNoObjectType() {
        JSType noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        assertTrue(noObjectType.isNoObjectType());
        assertFalse(noType.isNoObjectType());
    }

    @Test
    public void testIsEmptyType() {
        assertTrue(noType.isEmptyType());
        assertFalse(allType.isEmptyType());
        assertFalse(unknownType.isEmptyType());
    }

    @Test
    public void testIsString() {
        JSType stringObjectType = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        assertTrue(stringValueType.isString());
        assertTrue(stringObjectType.isString());
        assertFalse(numberValueType.isString());
    }

    @Test
    public void testIsNumber() {
        JSType numberObjectType = registry.getNativeType(JSTypeNative.NUMBER_OBJECT_TYPE);
        assertTrue(numberValueType.isNumber());
        assertTrue(numberObjectType.isNumber());
        assertFalse(stringValueType.isNumber());
    }

    @Test
    public void testIsBooleanValueType() {
        assertTrue(booleanValueType.isBooleanValueType());
        assertFalse(stringValueType.isBooleanValueType());
    }

    @Test
    public void testIsNullType() {
        assertTrue(nullType.isNullType());
        assertFalse(stringValueType.isNullType());
    }

    @Test
    public void testIsAllType() {
        assertTrue(allType.isAllType());
        assertFalse(noType.isAllType());
    }

    @Test
    public void testIsUnknownType() {
        assertTrue(unknownType.isUnknownType());
        assertFalse(allType.isUnknownType());
    }

    @Test
    public void testIsUnionType() {
        UnionTypeBuilder builder = new UnionTypeBuilder(registry);
        builder.addAlternate(stringValueType);
        builder.addAlternate(numberValueType);
        JSType unionType = builder.build();
        assertTrue(unionType.isUnionType());
        assertFalse(stringValueType.isUnionType());
    }

    @Test
    public void testToMaybeUnionType() {
        UnionTypeBuilder builder = new UnionTypeBuilder(registry);
        builder.addAlternate(stringValueType);
        builder.addAlternate(numberValueType);
        JSType unionType = builder.build();
        assertNotNull(unionType.toMaybeUnionType());
        assertNull(stringValueType.toMaybeUnionType());
    }

    @Test
    public void testIsEquivalentTo() {
        assertTrue(stringValueType.isEquivalentTo(stringValueType));
        assertFalse(stringValueType.isEquivalentTo(numberValueType));
        assertTrue(unknownType.isEquivalentTo(unknownType));
    }

    @Test
    public void testIsEquivalentStatic() {
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(null, stringValueType));
        assertFalse(JSType.isEquivalent(stringValueType, null));
        assertTrue(JSType.isEquivalent(stringValueType, stringValueType));
    }

    @Test
    public void testEquals() {
        assertEquals(stringValueType, stringValueType);
        assertNotEquals(stringValueType, numberValueType);
        assertNotEquals(stringValueType, null);
        assertNotEquals(stringValueType, "string");
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        JSType booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        assertEquals(booleanType, booleanValueType.getRestrictedTypeGivenToBooleanOutcome(true));
        assertEquals(booleanType, booleanValueType.getRestrictedTypeGivenToBooleanOutcome(false));
        assertEquals(noType, noType.getRestrictedTypeGivenToBooleanOutcome(true));
    }

    @Test
    public void testGetTypesUnderEquality() {
        TypePair pair = stringValueType.getTypesUnderEquality(numberValueType);
        assertNotNull(pair);
        assertNull(pair.typeA);
        assertNull(pair.typeB);

        pair = stringValueType.getTypesUnderEquality(stringValueType);
        assertNotNull(pair);
        assertEquals(stringValueType, pair.typeA);
        assertEquals(stringValueType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderInequality() {
        TypePair pair = stringValueType.getTypesUnderInequality(numberValueType);
        assertNotNull(pair);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEquality() {
        TypePair pair = stringValueType.getTypesUnderShallowEquality(numberValueType);
        assertNotNull(pair);
        assertNull(pair.typeA);
        assertNull(pair.typeB);

        pair = stringValueType.getTypesUnderShallowEquality(stringValueType);
        assertNotNull(pair);
        assertEquals(stringValueType, pair.typeA);
        assertEquals(stringValueType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowInequality() {
        TypePair pair = stringValueType.getTypesUnderShallowInequality(stringValueType);
        assertNotNull(pair);

        pair = nullType.getTypesUnderShallowInequality(nullType);
        assertNotNull(pair);
    }

    @Test
    public void testGetLeastSupertype() {
        JSType result = stringValueType.getLeastSupertype(numberValueType);
        assertNotNull(result);
        assertTrue(result.isUnionType());
    }

    @Test
    public void testGetGreatestSubtype() {
        JSType result = stringValueType.getGreatestSubtype(numberValueType);
        assertNotNull(result);
        assertTrue(result.isEmptyType());
    }

    @Test
    public void testIsSubtype() {
        assertTrue(noType.isSubtype(allType));
        assertTrue(unknownType.isSubtype(allType));
        assertFalse(allType.isSubtype(noType));
    }

    @Test
    public void testDiffersFrom() {
        assertTrue(stringValueType.differsFrom(numberValueType));
        assertFalse(stringValueType.differsFrom(stringValueType));
    }

    @Test
    public void testCanTestForEqualityWith() {
        assertTrue(stringValueType.canTestForEqualityWith(numberValueType));
        assertTrue(unknownType.canTestForEqualityWith(stringValueType));
    }

    @Test
    public void testTestForEquality() {
        TernaryValue value = stringValueType.testForEquality(numberValueType);
        assertEquals(TernaryValue.FALSE, value);

        value = stringValueType.testForEquality(stringValueType);
        assertEquals(TernaryValue.TRUE, value);
    }

    @Test
    public void testIsNullable() {
        assertTrue(nullType.isNullable());
        assertFalse(stringValueType.isNullable());
    }

    @Test
    public void testIsFunctionType() {
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertTrue(functionType.isFunctionType());
        assertFalse(stringValueType.isFunctionType());
    }

    @Test
    public void testIsObject() {
        JSType objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        assertTrue(objectType.isObject());
        assertFalse(stringValueType.isObject());
    }

    @Test
    public void testIsConstructor() {
        JSType constructorType = registry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        assertTrue(constructorType.isConstructor());
    }

    @Test
    public void testIsInterface() {
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertFalse(functionType.isInterface());
    }

    @Test
    public void testIsRecordType() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("prop", stringValueType, null);
        JSType recordType = builder.build();
        assertTrue(recordType.isRecordType());
        assertFalse(stringValueType.isRecordType());
    }

    @Test
    public void testToMaybeRecordType() {
        RecordTypeBuilder builder = new RecordTypeBuilder(registry);
        builder.addProperty("prop", stringValueType, null);
        JSType recordType = builder.build();
        assertNotNull(recordType.toMaybeRecordType());
        assertNull(stringValueType.toMaybeRecordType());
    }

    @Test
    public void testIsParameterizedType() {
        ObjectType objectType = new ObjectType(registry, null, null, null, null, null, null);
        assertFalse(objectType.isParameterizedType());
    }

    @Test
    public void testIsTemplateType() {
        assertFalse(stringValueType.isTemplateType());
    }

    @Test
    public void testAutoboxesTo() {
        JSType autobox = stringValueType.autoboxesTo();
        assertNotNull(autobox);
        assertTrue(autobox.isObject());

        JSType numberType = numberValueType.autoboxesTo();
        assertNotNull(numberType);
        assertTrue(numberType.isObject());

        JSType boolType = booleanValueType.autoboxesTo();
        assertNotNull(boolType);
        assertTrue(boolType.isObject());
    }

    @Test
    public void testUnboxesTo() {
        JSType stringObjectType = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        JSType unboxed = stringObjectType.unboxesTo();
        assertNotNull(unboxed);
        assertTrue(unboxed.isStringValueType());
    }

    @Test
    public void testAutobox() {
        JSType result = stringValueType.autobox();
        assertNotNull(result);
        assertTrue(result.isObject());
    }

    @Test
    public void testDereference() {
        JSType result = stringValueType.dereference();
        assertNotNull(result);

        result = nullType.dereference();
        assertNotNull(result);
    }

    @Test
    public void testFindPropertyType() {
        ObjectType objectType = new ObjectType(registry, null, null, null, null, null, null);
        assertNull(objectType.findPropertyType("property"));
    }

    @Test
    public void testCanBeCalled() {
        JSType functionType = registry.getNativeType(JSTypeNative.FUNCTION_INSTANCE_TYPE);
        assertTrue(functionType.canBeCalled());
        assertFalse(stringValueType.canBeCalled());
    }

    @Test
    public void testHasDisplayName() {
        assertFalse(stringValueType.hasDisplayName());
        JSType objectType = new ObjectType(registry, null, null, null, null, null, null);
        assertFalse(objectType.hasDisplayName());
    }

    @Test
    public void testGetDisplayName() {
        JSType objectType = new ObjectType(registry, null, null, null, null, null, null);
        assertNull(objectType.getDisplayName());
    }

    @Test
    public void testGetJSDocInfo() {
        assertNull(stringValueType.getJSDocInfo());
    }

    @Test
    public void testIsEqualTo() {
        assertTrue(stringValueType.isEquivalentTo(stringValueType));
    }

    @Test
    public void testIterateReferences() {
        JSType objectType = new ObjectType(registry, null, null, null, null, null, null);
        JSType[] result = objectType.iterateReferences();
        assertNotNull(result);
    }

    @Test
    public void testResolve() {
        JSType resolved = stringValueType.resolve(null, null);
        assertNotNull(resolved);
        assertEquals(stringValueType, resolved);
    }

    @Test
    public void testForceResolve() {
        JSType resolved = stringValueType.forceResolve(null, null);
        assertNotNull(resolved);
    }

    @Test
    public void testIsResolved() {
        assertTrue(stringValueType.isResolved());
    }

    @Test
    public void testClearResolved() {
        stringValueType.clearResolved();
        assertTrue(stringValueType.isResolved());
    }

    @Test
    public void testSetValidator() {
        assertTrue(stringValueType.setValidator(new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return true;
            }
        }));
    }

    @Test
    public void testToString() {
        assertNotNull(stringValueType.toString());
    }

    @Test
    public void testToDebugHashCodeString() {
        assertNotNull(stringValueType.toDebugHashCodeString());
    }

    @Test
    public void testToAnnotationString() {
        assertNotNull(stringValueType.toAnnotationString());
    }

    @Test
    public void testMatchConstraint() {
        stringValueType.matchConstraint(numberValueType);
    }

    @Test
    public void testCollapseUnion() {
        JSType collapsed = stringValueType.collapseUnion();
        assertEquals(stringValueType, collapsed);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        JSType restricted = stringValueType.restrictByNotNullOrUndefined();
        assertNotNull(restricted);
    }

    @Test
    public void testToObjectType() {
        ObjectType objectType = stringValueType.toObjectType();
        assertNull(objectType);
    }

    @Test
    public void testVisit() {
        JSType objectType = new ObjectType(registry, null, null, null, null, null, null);
        Object result = objectType.visit(new Visitor<Object>() {
            @Override
            public Object caseNoType(NoType type) {
                return null;
            }

            @Override
            public Object caseEnumElementType(EnumElementType type) {
                return null;
            }

            @Override
            public Object caseAllType(AllType type) {
                return null;
            }

            @Override
            public Object caseBooleanType(BooleanType type) {
                return null;
            }

            @Override
            public Object caseNoObjectType(NoObjectType type) {
                return null;
            }

            @Override
            public Object caseFunctionType(FunctionType type) {
                return null;
            }

            @Override
            public Object caseObjectType(ObjectType type) {
                return null;
            }

            @Override
            public Object caseUnknownType(UnknownType type) {
                return null;
            }

            @Override
            public Object caseNullType(NullType type) {
                return null;
            }

            @Override
            public Object caseNumberType(NumberType type) {
                return null;
            }

            @Override
            public Object caseStringType(StringType type) {
                return null;
            }

            @Override
            public Object caseVoidType(VoidType type) {
                return null;
            }
        });
        assertNull(result);
    }
}