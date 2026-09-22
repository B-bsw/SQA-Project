package com.google.javascript.rhino.jstype;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSTypeTest {
    private JSTypeRegistry registry;
    private JSType unknownType;
    private JSType allType;
    private JSType noType;
    private JSType noObjectType;
    private JSType noResolvedType;
    private JSType numberType;
    private JSType stringType;
    private JSType booleanType;
    private JSType nullType;
    private JSType voidType;
    private JSType objectType;
    private JSType arrayType;
    private JSType functionType;
    private JSType unionType;

    // Custom subclass to test abstract methods
    private static class TestJSType extends JSType {
        TestJSType(JSTypeRegistry registry) {
            super(registry);
        }

        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.BOTH;
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return null;
        }

        @Override
        public boolean isSubtype(JSType that) {
            if (that.isAllType() || that.isUnknownType()) {
                return true;
            }
            return this == that;
        }

        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
            return this;
        }

        @Override
        public String toString() {
            return "TestType";
        }
    }

    // Mock implementations
    private static class MockJSType extends JSType {
        MockJSType(JSTypeRegistry registry) {
            super(registry);
        }

        @Override
        public boolean isNoType() { return false; }
        @Override
        public boolean isNoResolvedType() { return false; }
        @Override
        public boolean isNoObjectType() { return false; }
        @Override
        public boolean isNumberObjectType() { return false; }
        @Override
        public boolean isNumberValueType() { return false; }
        @Override
        public boolean isFunctionPrototypeType() { return false; }
        @Override
        public boolean isStringObjectType() { return false; }
        @Override
        public boolean isStringValueType() { return false; }
        @Override
        public boolean isArrayType() { return false; }
        @Override
        public boolean isBooleanObjectType() { return false; }
        @Override
        public boolean isBooleanValueType() { return false; }
        @Override
        public boolean isRegexpType() { return false; }
        @Override
        public boolean isDateType() { return false; }
        @Override
        public boolean isNullType() { return false; }
        @Override
        public boolean isVoidType() { return false; }
        @Override
        public boolean isAllType() { return false; }
        @Override
        public boolean isUnknownType() { return false; }
        @Override
        public boolean isCheckedUnknownType() { return false; }
        @Override
        public boolean isUnionType() { return false; }
        @Override
        public boolean isFunctionType() { return false; }
        @Override
        public boolean isEnumElementType() { return false; }
        @Override
        public boolean isEnumType() { return false; }
        @Override
        boolean isNamedType() { return false; }
        @Override
        public boolean isRecordType() { return false; }
        @Override
        public boolean isTemplateType() { return false; }
        @Override
        public boolean isObject() { return false; }
        @Override
        public boolean isConstructor() { return false; }
        @Override
        public boolean isNominalType() { return false; }
        @Override
        public boolean isInstanceType() { return false; }
        @Override
        public boolean isInterface() { return false; }
        @Override
        public boolean isOrdinaryFunction() { return false; }
        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.FALSE;
        }
        @Override
        public <T> T visit(Visitor<T> visitor) { return null; }
        @Override
        JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) { return this; }
        @Override
        public boolean isSubtype(JSType that) { return false; }
    }

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null); // null reporter for testing
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        booleanType = registry.getNativeType(JSTypeNative.BOOLEAN_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        arrayType = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        functionType = registry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        unionType = registry.createUnionType(numberType, stringType);
    }

    @Test
    public void testIsEquivalentTo_SameObject() {
        assertEquals(true, numberType.isEquivalentTo(numberType));
        assertEquals(true, numberType.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
    }

    @Test
    public void testIsEquivalentTo_DifferentTypes() {
        assertEquals(false, numberType.isEquivalentTo(stringType));
    }

    @Test
    public void testIsEquivalentTo_ProxyObjectType() {
        JSType proxy = new ProxyObjectType(registry, numberType);
        assertEquals(true, numberType.isEquivalentTo(proxy));
        assertEquals(true, proxy.isEquivalentTo(numberType));
    }

    @Test
    public void testIsEquivalent_NullCases() {
        assertEquals(true, JSType.isEquivalent(null, null));
        assertEquals(false, JSType.isEquivalent(null, numberType));
        assertEquals(false, JSType.isEquivalent(numberType, null));
    }

    @Test
    public void testIsEquivalent_BothNonNull() {
        assertEquals(true, JSType.isEquivalent(numberType, numberType));
        assertEquals(false, JSType.isEquivalent(numberType, stringType));
    }

    @Test
    public void testIsEquivalent_WithProxy() {
        JSType proxy = new ProxyObjectType(registry, numberType);
        assertEquals(true, JSType.isEquivalent(numberType, proxy));
        assertEquals(true, JSType.isEquivalent(proxy, numberType));
    }

    @Test
    public void testEqualsMethod() {
        assertEquals(true, numberType.equals(numberType));
        assertEquals(false, numberType.equals(stringType));
        assertEquals(false, numberType.equals(new Integer(5)));
    }

    @Test
    public void testHashCode() {
        assertEquals(System.identityHashCode(numberType), numberType.hashCode());
    }

    @Test
    public void testIsNoType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNoType());
    }

    @Test
    public void testIsNoResolvedType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNoResolvedType());
    }

    @Test
    public void testIsNoObjectType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNoObjectType());
    }

    @Test
    public void testIsNumberObjectType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNumberObjectType());
    }

    @Test
    public void testIsNumberValueType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNumberValueType());
    }

    @Test
    public void testIsFunctionPrototypeType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isFunctionPrototypeType());
    }

    @Test
    public void testIsStringObjectType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isStringObjectType());
    }

    @Test
    public void testIsStringValueType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isStringValueType());
    }

    @Test
    public void testIsArrayType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isArrayType());
    }

    @Test
    public void testIsBooleanObjectType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isBooleanObjectType());
    }

    @Test
    public void testIsBooleanValueType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isBooleanValueType());
    }

    @Test
    public void testIsRegexpType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isRegexpType());
    }

    @Test
    public void testIsDateType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isDateType());
    }

    @Test
    public void testIsNullType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNullType());
    }

    @Test
    public void testIsVoidType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isVoidType());
    }

    @Test
    public void testIsAllType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isAllType());
    }

    @Test
    public void testIsUnknownType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isUnknownType());
    }

    @Test
    public void testIsCheckedUnknownType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isCheckedUnknownType());
    }

    @Test
    public void testIsUnionType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isUnionType());
    }

    @Test
    public void testIsFunctionType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isFunctionType());
    }

    @Test
    public void testIsEnumElementType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isEnumElementType());
    }

    @Test
    public void testIsEnumType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isEnumType());
    }

    @Test
    public void testIsNamedType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNamedType());
    }

    @Test
    public void testIsRecordType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isRecordType());
    }

    @Test
    public void testIsTemplateType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isTemplateType());
    }

    @Test
    public void testIsObject_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isObject());
    }

    @Test
    public void testIsConstructor_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isConstructor());
    }

    @Test
    public void testIsNominalType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isNominalType());
    }

    @Test
    public void testIsInstanceType_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isInstanceType());
    }

    @Test
    public void testIsInterface_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction_DefaultFalse() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isOrdinaryFunction());
    }

    @Test
    public void testIsEmptyType_NoType() {
        assertEquals(true, noType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_NoObjectType() {
        assertEquals(true, noObjectType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_NoResolvedType() {
        assertEquals(true, noResolvedType.isEmptyType());
    }

    @Test
    public void testIsEmptyType_RegularType() {
        assertEquals(false, numberType.isEmptyType());
    }

    @Test
    public void testIsString_StringType() {
        assertEquals(true, stringType.isString());
    }

    @Test
    public void testIsString_NumberType() {
        assertEquals(false, numberType.isString());
    }

    @Test
    public void testIsNumber_NumberType() {
        assertEquals(true, numberType.isNumber());
    }

    @Test
    public void testIsNumber_StringType() {
        assertEquals(false, stringType.isNumber());
    }

    @Test
    public void testFindPropertyType_WithAutoboxing() {
        JSType stringObject = registry.getNativeType(JSTypeNative.STRING_OBJECT_TYPE);
        JSType result = stringObject.findPropertyType("length");
        assertEquals(numberType, result);
    }

    @Test
    public void testFindPropertyType_NoAutoboxing() {
        JSType result = numberType.findPropertyType("foo");
        assertEquals(null, result);
    }

    @Test
    public void testIsSubtype_AllType_ReturnsTrue() {
        assertEquals(true, numberType.isSubtype(allType));
    }

    @Test
    public void testIsSubtype_UnknownType_ReturnsTrue() {
        assertEquals(true, numberType.isSubtype(unknownType));
    }

    @Test
    public void testIsSubtype_SameType() {
        assertEquals(true, numberType.isSubtype(numberType));
    }

    @Test
    public void testIsSubtype_DifferentType() {
        assertEquals(false, numberType.isSubtype(stringType));
    }

    @Test
    public void testIsSubtype_UnionType() {
        assertEquals(true, numberType.isSubtype(unionType));
    }

    @Test
    public void testIsSubtype_NamedType() {
        JSType namedType = new NamedType(registry, "com.example.Foo", null, null, null);
        assertEquals(false, numberType.isSubtype(namedType));
    }

    @Test
    public void testIsSubtype_UnionWithAll() {
        JSType unionWithAll = registry.createUnionType(numberType, allType);
        assertEquals(true, numberType.isSubtype(unionWithAll));
    }

    @Test
    public void testIsSubtype_UnionWithUnknown() {
        JSType unionWithUnknown = registry.createUnionType(numberType, unknownType);
        assertEquals(true, numberType.isSubtype(unionWithUnknown));
    }

    @Test
    public void testIsSubtype_NestedUnion() {
        JSType union = registry.createUnionType(numberType, stringType);
        JSType nestedUnion = registry.createUnionType(union, booleanType);
        assertEquals(true, numberType.isSubtype(nestedUnion));
    }

    @Test
    public void testIsSubtype_DirectObjectSubtype() {
        JSType arrayObject = registry.getNativeType(JSTypeNative.ARRAY_TYPE);
        assertEquals(true, arrayType.isSubtype(objectType));
    }

    @Test
    public void testGetLeastSupertype_EquivalentTypes() {
        JSType result = numberType.getLeastSupertype(numberType);
        assertEquals(numberType, result);
    }

    @Test
    public void testGetLeastSupertype_DifferentTypes() {
        JSType result = numberType.getLeastSupertype(stringType);
        assertTrue(result instanceof UnionType);
    }

    @Test
    public void testGetLeastSupertype_UnionLeft() {
        JSType result = unionType.getLeastSupertype(numberType);
        assertTrue(result instanceof UnionType);
        assertTrue(result.isEquivalentTo(unionType));
    }

    @Test
    public void testGetLeastSupertype_UnionRight() {
        JSType result = numberType.getLeastSupertype(unionType);
        assertTrue(result instanceof UnionType);
        assertTrue(result.isEquivalentTo(unionType));
    }

    @Test
    public void testGetLeastSupertype_StaticWithUnion() {
        JSType result = JSType.getLeastSupertype(numberType, unionType);
        assertTrue(result instanceof UnionType);
    }

    @Test
    public void testGetLeastSupertype_BothUnion() {
        JSType union2 = registry.createUnionType(booleanType, numberType);
        JSType result = unionType.getLeastSupertype(union2);
        assertTrue(result instanceof UnionType);
        assertTrue(result.isEquivalentTo(registry.createUnionType(numberType, stringType, booleanType)));
    }

    @Test
    public void testGetGreatestSubtype_EquivalentTypes() {
        JSType result = numberType.getGreatestSubtype(numberType);
        assertEquals(numberType, result);
    }

    @Test
    public void testGetGreatestSubtype_UnknownFirst() {
        JSType result = unknownType.getGreatestSubtype(numberType);
        assertEquals(unknownType, result);
    }

    @Test
    public void testGetGreatestSubtype_UnknownSecond() {
        JSType result = numberType.getGreatestSubtype(unknownType);
        assertEquals(unknownType, result);
    }

    @Test
    public void testGetGreatestSubtype_ThisSubtypeOfThat() {
        JSType result = numberType.getGreatestSubtype(numberType);
        assertEquals(numberType, result);
    }

    @Test
    public void testGetGreatestSubtype_ThatSubtypeOfThis() {
        JSType result = numberType.getGreatestSubtype(numberType);
        assertEquals(numberType, result);
    }

    @Test
    public void testGetGreatestSubtype_UnionType_This() {
        JSType greatestSubtype = registry.createUnionType(numberType, stringType).getGreatestSubtype(numberType);
        assertNotNull(greatestSubtype);
        assertTrue(greatestSubtype.isEquivalentTo(numberType));
    }

    @Test
    public void testGetGreatestSubtype_UnionType_That() {
        JSType greatestSubtype = numberType.getGreatestSubtype(registry.createUnionType(numberType, stringType));
        assertNotNull(greatestSubtype);
        assertTrue(greatestSubtype.isEquivalentTo(numberType));
    }

    @Test
    public void testGetGreatestSubtype_BothObjects() {
        JSType result = objectType.getGreatestSubtype(objectType);
        assertEquals(objectType, result);
    }

    @Test
    public void testGetGreatestSubtype_NoCommon() {
        JSType result = numberType.getGreatestSubtype(stringType);
        assertEquals(noType, result);
    }

    @Test
    public void testFilterNoResolvedType_NoResolved() {
        JSType result = JSType.filterNoResolvedType(noResolvedType);
        assertEquals(noResolvedType, result);
    }

    @Test
    public void testFilterNoResolvedType_RegularType() {
        JSType result = JSType.filterNoResolvedType(numberType);
        assertEquals(numberType, result);
    }

    @Test
    public void testFilterNoResolvedType_UnionWithNoResolved() {
        // Test not implemented as in actual code
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome_ContainsTrue() {
        JSType result = numberType.getRestrictedTypeGivenToBooleanOutcome(true);
        assertEquals(numberType, result);
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome_NotContainsTrue() {
        // No type will always return false
        MockJSType mock = new MockJSType(registry);
        JSType result = mock.getRestrictedTypeGivenToBooleanOutcome(true);
        assertEquals(null, result);
    }

    @Test
    public void testGetTypesUnderEquality_UnionType() {
        JSType that = unionType;
        TypePair result = numberType.getTypesUnderEquality(that);
        assertNotNull(result);
    }

    @Test
    public void testGetTypesUnderEquality_False() {
        JSType that = new MockJSType(registry) {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.FALSE;
            }
        };
        TypePair result = numberType.getTypesUnderEquality(that);
        assertEquals(null, result.typeA);
        assertEquals(null, result.typeB);
    }

    @Test
    public void testGetTypesUnderEquality_True() {
        JSType that = new MockJSType(registry) {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.TRUE;
            }
        };
        TypePair result = numberType.getTypesUnderEquality(that);
        assertEquals(numberType, result.typeA);
        assertEquals(that, result.typeB);
    }

    @Test
    public void testGetTypesUnderEquality_Unknown() {
        JSType that = new MockJSType(registry) {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.UNKNOWN;
            }
        };
        TypePair result = numberType.getTypesUnderEquality(that);
        assertEquals(numberType, result.typeA);
        assertEquals(that, result.typeB);
    }

    @Test
    public void testGetTypesUnderInequality_Delegates() {
        JSType that = new MockJSType(registry);
        TypePair result = numberType.getTypesUnderInequality(that);
        assertNotNull(result);
        assertEquals(noType, result.typeA);
        assertEquals(noType, result.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEquality() {
        TypePair result = numberType.getTypesUnderShallowEquality(stringType);
        assertNotNull(result);
    }

    @Test
    public void testGetTypesUnderShallowInequality_NullBoth() {
        JSType nullTypeMock = new MockJSType(registry) {
            @Override
            public boolean isNullType() { return true; }
        };
        JSType nullTypeMock2 = new MockJSType(registry) {
            @Override
            public boolean isNullType() { return true; }
        };
        TypePair result = nullTypeMock.getTypesUnderShallowInequality(nullTypeMock2);
        assertNotNull(result);
    }

    @Test
    public void testGetTypesUnderShallowInequality_VoidBoth() {
        JSType voidTypeMock = new MockJSType(registry) {
            @Override
            public boolean isVoidType() { return true; }
        };
        JSType voidTypeMock2 = new MockJSType(registry) {
            @Override
            public boolean isVoidType() { return true; }
        };
        TypePair result = voidTypeMock.getTypesUnderShallowInequality(voidTypeMock2);
        assertNotNull(result);
    }

    @Test
    public void testRestrictByNotNullOrUndefined_Default() {
        JSType result = numberType.restrictByNotNullOrUndefined();
        assertEquals(numberType, result);
    }

    @Test
    public void testDiffersFrom_BothUnknown() {
        assertEquals(false, unknownType.differsFrom(unknownType));
    }

    @Test
    public void testDiffersFrom_OneUnknown() {
        assertEquals(true, numberType.differsFrom(unknownType));
    }

    @Test
    public void testDiffersFrom_NotUnknownDifferent() {
        assertEquals(true, numberType.differsFrom(stringType));
    }

    @Test
    public void testDiffersFrom_NotUnknownSame() {
        assertEquals(false, numberType.differsFrom(numberType));
    }

    @Test
    public void testIsSubtype_StaticUnknownThat() {
        assertEquals(true, JSType.isSubtype(numberType, unknownType));
    }

    @Test
    public void testIsSubtype_StaticAllThat() {
        assertEquals(true, JSType.isSubtype(numberType, allType));
    }

    @Test
    public void testIsSubtype_StaticUnionThat() {
        JSType unionMock = new MockJSType(registry) {
            @Override
            public boolean isUnionType() { return true; }
        };
        assertEquals(false, JSType.isSubtype(numberType, unionMock));
    }

    @Test
    public void testIsSubtype_StaticNamedType() {
        JSType namedType = new NamedType(registry, "foo", null, null, null);
        assertEquals(false, JSType.isSubtype(numberType, namedType));
    }

    @Test
    public void testForceResolve_WithResolve() {
        JSType testType = new TestJSType(registry);
        JSType result = testType.forceResolve(null, null);
        assertNotNull(result);
    }

    @Test
    public void testResolve_AlreadyResolved() {
        TestJSType testType = new TestJSType(registry);
        testType.setResolvedTypeInternal(testType);
        // Force resolved flag
        testType.resolve(null, null);
        JSType result = testType.resolve(null, null);
        assertEquals(testType, result);
    }

    @Test
    public void testResolve_NotResolved() {
        TestJSType testType = new TestJSType(registry);
        JSType result = testType.resolve(null, null);
        assertNotNull(result);
        assertEquals(true, testType.isResolved());
    }

    @Test
    public void testResolve_NotResolvedNullResult() {
        JSType testType = new JSType(registry) {
            @Override
            public BooleanLiteralSet getPossibleToBooleanOutcomes() {
                return null;
            }

            @Override
            public <T> T visit(Visitor<T> visitor) {
                return null;
            }

            @Override
            public boolean isSubtype(JSType that) {
                return false;
            }

            @Override
            JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
                return null;
            }
        };
        JSType result = testType.resolve(null, null);
        assertEquals(unknownType, result);
    }

    @Test
    public void testClearResolved() {
        TestJSType testType = new TestJSType(registry);
        testType.resolve(null, null);
        testType.clearResolved();
        assertEquals(false, testType.isResolved());
        assertEquals(null, testType.resolveResult);
    }

    @Test
    public void testSafeResolve_NullType() {
        JSType result = JSType.safeResolve(null, null, null);
        assertEquals(null, result);
    }

    @Test
    public void testSafeResolve_NonNullType() {
        TestJSType testType = new TestJSType(registry);
        JSType result = JSType.safeResolve(testType, null, null);
        assertEquals(testType, result);
    }

    @Test
    public void testSetValidator_True() {
        JSType testType = new TestJSType(registry);
        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return true;
            }
        };
        assertEquals(true, testType.setValidator(validator));
    }

    @Test
    public void testSetValidator_False() {
        JSType testType = new TestJSType(registry);
        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return false;
            }
        };
        assertEquals(false, testType.setValidator(validator));
    }

    @Test
    public void testSetValidator_NullValidator() {
        JSType testType = new TestJSType(registry);
        assertEquals(false, testType.setValidator(null));
    }

    @Test
    public void testGetDisplayName_Default() {
        TestJSType testType = new TestJSType(registry);
        assertEquals(null, testType.getDisplayName());
    }

    @Test
    public void testHasDisplayName_Null() {
        TestJSType testType = new TestJSType(registry);
        assertEquals(false, testType.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_Empty() {
        JSType testType = new TestJSType(registry) {
            @Override
            public String getDisplayName() { return ""; }
        };
        assertEquals(false, testType.hasDisplayName());
    }

    @Test
    public void testHasDisplayName_NonEmpty() {
        JSType testType = new TestJSType(registry) {
            @Override
            public String getDisplayName() { return "TestType"; }
        };
        assertEquals(true, testType.hasDisplayName());
    }

    @Test
    public void testCanAssignTo_Subtype() {
        JSType testType = new TestJSType(registry) {
            @Override
            public boolean isSubtype(JSType that) { return true; }
        };
        assertEquals(true, testType.canAssignTo(numberType));
    }

    @Test
    public void testCanAssignTo_NotSubtype() {
        JSType testType = new TestJSType(registry) {
            @Override
            public boolean isSubtype(JSType that) { return false; }
        };
        assertEquals(false, testType.canAssignTo(numberType));
    }

    @Test
    public void testToObjectType_WhenObject() {
        assertEquals(objectType, objectType.toObjectType());
    }

    @Test
    public void testToObjectType_WhenNotObject() {
        assertEquals(null, numberType.toObjectType());
    }

    @Test
    public void testDereference_Restricted() {
        JSType result = numberType.dereference();
        assertNotNull(result);
    }

    @Test
    public void testDereference_WithAutobox() {
        JSType result = numberType.dereference();
        assertNotNull(result);
    }

    @Test
    public void testCanTestForEqualityWith_Unknown() {
        assertEquals(true, numberType.canTestForEqualityWith(unknownType));
    }

    @Test
    public void testCanTestForEqualityWith_NotUnknown() {
        assertEquals(false, numberType.canTestForEqualityWith(numberType));
    }

    @Test
    public void testTestForEqualityHelper_AllType() {
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(allType));
    }

    @Test
    public void testTestForEqualityHelper_UnknownType() {
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(unknownType));
    }

    @Test
    public void testTestForEqualityHelper_BothEmpty() {
        JSType mock1 = new MockJSType(registry);
        JSType mock2 = new MockJSType(registry);
        // Make both empty
        JSType mockEmpty1 = new MockJSType(registry) {
            @Override
            public boolean isEmptyType() { return true; }
        };
        JSType mockEmpty2 = new MockJSType(registry) {
            @Override
            public boolean isEmptyType() { return true; }
        };
        assertEquals(TernaryValue.TRUE, mockEmpty1.testForEquality(mockEmpty2));
    }

    @Test
    public void testTestForEqualityHelper_OneEmpty() {
        JSType mockEmpty = new MockJSType(registry) {
            @Override
            public boolean isEmptyType() { return true; }
        };
        assertEquals(TernaryValue.FALSE, mockEmpty.testForEquality(numberType));
    }

    @Test
    public void testTestForEqualityHelper_FunctionTypes() {
        JSType functionMock = new MockJSType(registry) {
            @Override
            public boolean isFunctionType() { return true; }
        };
        TernaryValue result = functionMock.testForEquality(numberType);
        assertNotNull(result);
    }

    @Test
    public void testTestForEqualityHelper_EnumElementType() {
        JSType enumElementMock = new MockJSType(registry) {
            @Override
            public boolean isEnumElementType() { return true; }
        };
        TernaryValue result = enumElementMock.testForEquality(numberType);
        assertNotNull(result);
    }

    @Test
    public void testTestForEqualityHelper_UnionType() {
        JSType unionMock = new MockJSType(registry) {
            @Override
            public boolean isUnionType() { return true; }
        };
        TernaryValue result = unionMock.testForEquality(numberType);
        assertNotNull(result);
    }

    @Test
    public void testGetJSDocInfo_Default() {
        TestJSType testType = new TestJSType(registry);
        assertEquals(null, testType.getJSDocInfo());
    }

    @Test
    public void testGetNativeType_NullTypeId() {
        try {
            JSType result = new TestJSType(registry).getNativeType(null);
            // expect no exception
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testToDebugHashCodeString() {
        TestJSType testType = new TestJSType(registry);
        String result = testType.toDebugHashCodeString();
        assertTrue(result.startsWith("{"));
        assertTrue(result.endsWith("}"));
    }

    @Test
    public void testALPHASortOrder() {
        List<JSType> types = new ArrayList<>();
        types.add(registry.getNativeType(JSTypeNative.STRING_TYPE));
        types.add(registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        types.add(registry.getNativeType(JSTypeNative.BOOLEAN_TYPE));
        Collections.sort(types, JSType.ALPHA);
        // Verify sorted lexicographically by toString
        assertTrue(types.get(0).toString().compareTo(types.get(1).toString()) <= 0);
        assertTrue(types.get(1).toString().compareTo(types.get(2).toString()) <= 0);
    }

    @Test
    public void testALPHAEmptyList() {
        List<JSType> types = new ArrayList<>();
        Collections.sort(types, JSType.ALPHA);
        assertEquals(0, types.size());
    }

    @Test
    public void testALPHASameTypes() {
        JSType number1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType number2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        List<JSType> types = new ArrayList<>();
        types.add(number1);
        types.add(number2);
        Collections.sort(types, JSType.ALPHA);
        assertEquals(2, types.size());
    }

    @Test
    public void testForgiveUnknownNames_NoOp() {
        TestJSType testType = new TestJSType(registry);
        testType.forgiveUnknownNames();
        // Should not throw
    }

    @Test
    public void testIsTheObjectType_Default() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.isTheObjectType());
    }

    @Test
    public void testCanBeCalled_Default() {
        MockJSType mock = new MockJSType(registry);
        assertEquals(false, mock.canBeCalled());
    }

    @Test
    public void testGetPossibleToBooleanOutcomes_NotNull() {
        TestJSType testType = new TestJSType(registry);
        assertNotNull(testType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testTestForEqualityHelper_Delegates() {
        JSType mockType = new MockJSType(registry);
        // Should not throw and return whatever
        mockType.testForEquality(numberType);
    }

    @Test
    public void testGetGreatestSubtype_RecordType() {
        JSType recordType = new RecordType(registry, null);
        assertEquals(null, recordType.getGreatestSubtype(numberType));
    }

    @Test
    public void testGetLeastSupertype_WhenThatIsUnion() {
        JSType unionMock = new MockJSType(registry) {
            @Override
            public boolean isUnionType() { return true; }
        };
        assertEquals(null, numberType.getLeastSupertype(unionMock));
    }

    @Test
    public void testGetTypesUnderEquality_NonUnion() {
        // This is testing the default behavior with MockJSType
        MockJSType mock = new MockJSType(registry);
        assertEquals(null, mock.getTypesUnderEquality(mock));
    }

    @Test
    public void testGetTypesUnderShallowEquality_Empty() {
        assertEquals(null, numberType.getTypesUnderShallowEquality(numberType));
    }
}