package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.TernaryValue;

public class JSTypeTest {

    private JSTypeRegistry registry;
    private JSType unknownType;
    private JSType allType;
    private JSType noType;
    private JSType noResolvedType;
    private JSType numberType;
    private JSType stringType;
    private JSType unionType;
    private JSType nullType;
    private JSType voidType;
    private JSType objectType;
    private JSType functionType;

    @Before
    public void setUp() throws Exception {
        registry = new JSTypeRegistry();
        unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        noResolvedType = registry.getNativeType(JSTypeNative.NO_RESOLVED_TYPE);
        numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        voidType = registry.getNativeType(JSTypeNative.VOID_TYPE);
        objectType = registry.getNativeType(JSTypeNative.OBJECT_TYPE);
        functionType = registry.getNativeType(JSTypeNative.FUNCTION_FUNCTION_TYPE);
        unionType = registry.createUnionType(numberType, stringType);
    }

    @Test
    public void testIsNoType() {
        assertTrue(noType.isNoType());
        assertFalse(numberType.isNoType());
        assertFalse(nullType.isNoType());
        assertFalse(unknownType.isNoType());
    }

    @Test
    public void testIsNoResolvedType() {
        assertTrue(noResolvedType.isNoResolvedType());
        assertFalse(numberType.isNoResolvedType());
        assertFalse(unknownType.isNoResolvedType());
    }

    @Test
    public void testIsNoObjectType() {
        assertTrue(noType.isNoObjectType());
        assertFalse(objectType.isNoObjectType());
        assertFalse(numberType.isNoObjectType());
    }

    @Test
    public void testIsEmptyType() {
        assertTrue(noType.isEmptyType());
        assertTrue(noResolvedType.isEmptyType());
        assertFalse(numberType.isEmptyType());
        assertFalse(objectType.isEmptyType());
    }

    @Test
    public void testIsNumberValueType() {
        assertTrue(numberType.isNumberValueType());
        assertFalse(stringType.isNumberValueType());
        assertFalse(unknownType.isNumberValueType());
    }

    @Test
    public void testIsStringValueType() {
        assertTrue(stringType.isStringValueType());
        assertFalse(numberType.isStringValueType());
        assertFalse(unknownType.isStringValueType());
    }

    @Test
    public void testIsString() {
        assertTrue(stringType.isString());
        assertTrue(registry.getNativeType(JSTypeNative.STRING_VALUE_OR_OBJECT_TYPE).isString());
        assertFalse(numberType.isString());
        assertFalse(unknownType.isString());
    }

    @Test
    public void testIsNumber() {
        assertTrue(numberType.isNumber());
        assertTrue(registry.getNativeType(JSTypeNative.NUMBER_VALUE_OR_OBJECT_TYPE).isNumber());
        assertFalse(stringType.isNumber());
        assertFalse(unknownType.isNumber());
    }

    @Test
    public void testIsUnknownType() {
        assertTrue(unknownType.isUnknownType());
        assertFalse(numberType.isUnknownType());
        assertFalse(noType.isUnknownType());
    }

    @Test
    public void testIsAllType() {
        assertTrue(allType.isAllType());
        assertFalse(numberType.isAllType());
        assertFalse(unknownType.isAllType());
    }

    @Test
    public void testIsUnionType() {
        assertTrue(unionType.isUnionType());
        assertFalse(numberType.isUnionType());
        assertFalse(unknownType.isUnionType());
    }

    @Test
    public void testIsNullType() {
        assertTrue(nullType.isNullType());
        assertFalse(numberType.isNullType());
        assertFalse(voidType.isNullType());
    }

    @Test
    public void testIsVoidType() {
        assertTrue(voidType.isVoidType());
        assertFalse(nullType.isVoidType());
        assertFalse(numberType.isVoidType());
    }

    @Test
    public void testIsObject() {
        assertTrue(objectType.isObject());
        assertTrue(registry.getNativeType(JSTypeNative.ARRAY_TYPE).isObject());
        assertFalse(numberType.isObject());
        assertFalse(nullType.isObject());
    }

    @Test
    public void testIsConstructor() {
        assertTrue(functionType.isConstructor());
        assertFalse(numberType.isConstructor());
        assertFalse(unknownType.isConstructor());
    }

    @Test
    public void testIsNominalType() {
        JSType nominal = registry.getNativeType(JSTypeNative.OBJECT_PROTOTYPE);
        assertFalse(numberType.isNominalType());
        assertFalse(unknownType.isNominalType());
    }

    @Test
    public void testIsInterface() {
        assertFalse(numberType.isInterface());
        assertFalse(functionType.isInterface());
    }

    @Test
    public void testIsOrdinaryFunction() {
        assertFalse(numberType.isOrdinaryFunction());
        assertFalse(unknownType.isOrdinaryFunction());
    }

    @Test
    public void testIsEquivalentTo() {
        assertTrue(numberType.isEquivalentTo(numberType));
        assertTrue(numberType.isEquivalentTo(registry.getNativeType(JSTypeNative.NUMBER_TYPE)));
        assertFalse(numberType.isEquivalentTo(stringType));
        assertTrue(unknownType.isEquivalentTo(unknownType));
        assertTrue(unknownType.isEquivalentTo(numberType));
        assertFalse(unknownType.isEquivalentTo(noType));
    }

    @Test
    public void testIsInvariant() {
        assertTrue(numberType.isInvariant(numberType));
        assertFalse(numberType.isInvariant(stringType));
        assertTrue(unknownType.isInvariant(unknownType));
        assertTrue(unknownType.isInvariant(numberType));
    }

    @Test
    public void testDiffersFrom() {
        assertFalse(numberType.differsFrom(numberType));
        assertTrue(numberType.differsFrom(stringType));
        assertFalse(unknownType.differsFrom(numberType));
        assertTrue(numberType.differsFrom(unknownType));
    }

    @Test
    public void testEquals() {
        assertEquals(numberType, numberType);
        assertEquals(numberType, registry.getNativeType(JSTypeNative.NUMBER_TYPE));
        assertNotEquals(numberType, stringType);
        assertNotEquals(numberType, null);
        assertNotEquals(numberType, new Object());
    }

    @Test
    public void testHashCode() {
        JSType type1 = numberType;
        JSType type2 = numberType;
        assertEquals(type1.hashCode(), type2.hashCode());
        assertEquals(unknownType.hashCode(), unknownType.hashCode());
    }

    @Test
    public void testCanTestForEqualityWith() {
        assertTrue(numberType.canTestForEqualityWith(numberType));
        assertTrue(unknownType.canTestForEqualityWith(numberType));
        assertTrue(numberType.canTestForEqualityWith(unknownType));
        assertTrue(unknownType.canTestForEqualityWith(unknownType));
        assertFalse(numberType.canTestForEqualityWith(noType));
    }

    @Test
    public void testTestForEquality() {
        assertEquals(TernaryValue.TRUE, numberType.testForEquality(numberType));
        assertEquals(TernaryValue.FALSE, numberType.testForEquality(stringType));
        assertEquals(TernaryValue.UNKNOWN, numberType.testForEquality(unknownType));
        assertEquals(TernaryValue.TRUE, nullType.testForEquality(nullType));
        assertEquals(TernaryValue.FALSE, nullType.testForEquality(numberType));
    }

    @Test
    public void testTestForEqualityWithUnion() {
        assertEquals(TernaryValue.TRUE, unionType.testForEquality(numberType));
        assertEquals(TernaryValue.TRUE, unionType.testForEquality(stringType));
        assertEquals(TernaryValue.FALSE, unionType.testForEquality(nullType));
        assertEquals(TernaryValue.FALSE, unionType.testForEquality(voidType));
    }

    @Test
    public void testTestForEqualityWithEmptyTypes() {
        assertEquals(TernaryValue.TRUE, noType.testForEquality(noType));
        assertEquals(TernaryValue.FALSE, noType.testForEquality(numberType));
        assertEquals(TernaryValue.FALSE, numberType.testForEquality(noType));
    }

    @Test
    public void testTestForEqualityWithFunction() {
        assertEquals(TernaryValue.FALSE, numberType.testForEquality(functionType));
        assertEquals(TernaryValue.FALSE, functionType.testForEquality(numberType));
    }

    @Test
    public void testIsNullable() {
        assertTrue(nullType.isNullable());
        assertTrue(unionType.isNullable());
        assertFalse(numberType.isNullable());
    }

    @Test
    public void testCollapseUnion() {
        JSType collapsed = unionType.collapseUnion();
        assertEquals(unionType, collapsed);
        assertEquals(numberType, numberType.collapseUnion());
    }

    @Test
    public void testGetLeastSupertype() {
        JSType least = numberType.getLeastSupertype(stringType);
        assertNotNull(least);
        assertTrue(least.isUnionType());
        assertTrue(numberType.isSubtype(least));
        assertTrue(stringType.isSubtype(least));
    }

    @Test
    public void testGetLeastSupertypeWithUnion() {
        JSType least = numberType.getLeastSupertype(unionType);
        assertSame(unionType, least);
    }

    @Test
    public void testGetLeastSupertypeWithUnknown() {
        JSType least = numberType.getLeastSupertype(unknownType);
        assertNotNull(least);
        assertTrue(least.isUnknownType() || least.isUnionType());
    }

    @Test
    public void testGetLeastSupertypeWithSameType() {
        JSType least = numberType.getLeastSupertype(numberType);
        assertSame(numberType, least);
    }

    @Test
    public void testGetGreatestSubtype() {
        JSType greatest = numberType.getGreatestSubtype(numberType);
        assertSame(numberType, greatest);
        greatest = unionType.getGreatestSubtype(numberType);
        assertNotNull(greatest);
        assertTrue(greatest.isNumberValueType() || greatest.isNumberObjectType() || greatest.isNoType());
    }

    @Test
    public void testGetGreatestSubtypeWithDifferentTypes() {
        JSType greatest = numberType.getGreatestSubtype(stringType);
        assertNotNull(greatest);
        assertTrue(greatest.isNoType());
    }

    @Test
    public void testGetGreatestSubtypeWithUnknown() {
        JSType greatest = numberType.getGreatestSubtype(unknownType);
        assertNotNull(greatest);
        assertTrue(greatest.isNumberValueType() || greatest.isNumberObjectType() || greatest.isNoType());
    }

    @Test
    public void testGetGreatestSubtypeWithUnion() {
        JSType greatest = numberType.getGreatestSubtype(unionType);
        assertNotNull(greatest);
        assertTrue(greatest.isNumberValueType() || greatest.isNumberObjectType() || greatest.isNoType());
    }

    @Test
    public void testGetTypesUnderEquality() {
        TypePair pair = numberType.getTypesUnderEquality(stringType);
        assertNotNull(pair);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderEqualityWithSame() {
        TypePair pair = numberType.getTypesUnderEquality(numberType);
        assertNotNull(pair);
        assertSame(numberType, pair.typeA);
        assertSame(numberType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderEqualityWithUnknown() {
        TypePair pair = numberType.getTypesUnderEquality(unknownType);
        assertNotNull(pair);
        assertSame(numberType, pair.typeA);
        assertSame(unknownType, pair.typeB);
    }

    @Test
    public void testGetTypesUnderInequality() {
        TypePair pair = numberType.getTypesUnderInequality(stringType);
        assertNotNull(pair);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test
    public void testGetTypesUnderShallowEquality() {
        TypePair pair = numberType.getTypesUnderShallowEquality(stringType);
        assertNotNull(pair);
        assertTrue(pair.typeA.isNoType() || pair.typeA.isNoObjectType());
    }

    @Test
    public void testGetTypesUnderShallowInequality() {
        TypePair pair = numberType.getTypesUnderShallowInequality(numberType);
        assertNotNull(pair);
        assertNotNull(pair.typeA);
        assertNotNull(pair.typeB);
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        JSType restricted = numberType.restrictByNotNullOrUndefined();
        assertSame(numberType, restricted);
        restricted = nullType.restrictByNotNullOrUndefined();
        assertTrue(restricted.isNoType());
    }

    @Test
    public void testIsSubtype() {
        assertTrue(numberType.isSubtype(numberType));
        assertFalse(numberType.isSubtype(stringType));
        assertTrue(noType.isSubtype(numberType));
        assertTrue(numberType.isSubtype(unknownType));
        assertTrue(numberType.isSubtype(allType));
        assertFalse(allType.isSubtype(numberType));
    }

    @Test
    public void testIsSubtypeWithUnion() {
        assertTrue(numberType.isSubtype(unionType));
        assertTrue(stringType.isSubtype(unionType));
        assertFalse(numberType.isSubtype(stringType));
        assertFalse(nullType.isSubtype(unionType));
    }

    @Test
    public void testForceResolve() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        StaticScope<JSType> scope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) { return null; }
            @Override
            public StaticSlot<JSType> getOwnSlot(String name) { return null; }
            @Override
            public JSType getTypeOfThis() { return null; }
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
        };
        JSType resolved = numberType.forceResolve(reporter, scope);
        assertNotNull(resolved);
        resolved = unknownType.forceResolve(reporter, scope);
        assertNotNull(resolved);
    }

    @Test
    public void testResolve() {
        ErrorReporter reporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        StaticScope<JSType> scope = new StaticScope<JSType>() {
            @Override
            public StaticSlot<JSType> getSlot(String name) { return null; }
            @Override
            public StaticSlot<JSType> getOwnSlot(String name) { return null; }
            @Override
            public JSType getTypeOfThis() { return null; }
            @Override
            public StaticScope<JSType> getParentScope() { return null; }
        };
        JSType resolved = numberType.resolve(reporter, scope);
        assertSame(numberType, resolved);
        resolved = unknownType.resolve(reporter, scope);
        assertNotNull(resolved);
    }

    @Test
    public void testIsResolved() {
        assertFalse(numberType.isResolved());
        JSType resolved = numberType.forceResolve(null, null);
        assertTrue(resolved.isResolved());
    }

    @Test
    public void testClearResolved() {
        JSType resolved = numberType.forceResolve(null, null);
        assertTrue(resolved.isResolved());
        resolved.clearResolved();
        assertFalse(resolved.isResolved());
    }

    @Test
    public void testSetValidator() {
        assertTrue(numberType.setValidator(new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return type != null;
            }
        }));
        assertFalse(numberType.setValidator(new Predicate<JSType>() {
            @Override
            public boolean apply(JSType type) {
                return false;
            }
        }));
    }

    @Test
    public void testToString() {
        assertNotNull(numberType.toString());
        assertNotNull(unionType.toString());
        assertNotNull(noType.toString());
        assertNotNull(unknownType.toString());
    }

    @Test
    public void testToDebugHashCodeString() {
        assertNotNull(numberType.toDebugHashCodeString());
        assertEquals("{" + numberType.hashCode() + "}", numberType.toDebugHashCodeString());
    }

    @Test
    public void testToAnnotationString() {
        assertNotNull(numberType.toAnnotationString());
        assertNotNull(unionType.toAnnotationString());
    }

    @Test
    public void testMatchConstraint() {
        numberType.matchConstraint(numberType);
        numberType.matchConstraint(unknownType);
    }

    @Test
    public void testFindPropertyType() {
        assertNull(numberType.findPropertyType("foo"));
    }

    @Test
    public void testCanBeCalled() {
        assertFalse(numberType.canBeCalled());
        assertTrue(functionType.canBeCalled());
    }

    @Test
    public void testCanAssignTo() {
        assertTrue(numberType.canAssignTo(numberType));
        assertFalse(numberType.canAssignTo(stringType));
        assertTrue(numberType.canAssignTo(unknownType));
    }

    @Test
    public void testAutoboxesTo() {
        assertNotNull(numberType.autoboxesTo());
        assertNull(numberType.autoboxesTo());
        assertNotNull(unknownType.autoboxesTo());
    }

    @Test
    public void testUnboxesTo() {
        assertNotNull(numberType.unboxesTo());
        assertNull(unknownType.unboxesTo());
    }

    @Test
    public void testToObjectType() {
        assertNotNull(numberType.toObjectType());
        assertNull(numberType.toObjectType());
        assertNull(unknownType.toObjectType());
    }

    @Test
    public void testAutobox() {
        assertNotNull(numberType.autobox());
        assertNotNull(unknownType.autobox());
    }

    @Test
    public void testDereference() {
        assertNotNull(numberType.dereference());
        assertNotNull(unknownType.dereference());
    }

    @Test
    public void testIsInstanceType() {
        assertFalse(numberType.isInstanceType());
    }

    @Test
    public void testTypePairConstructor() {
        TypePair pair = new TypePair(numberType, stringType);
        assertSame(numberType, pair.typeA);
        assertSame(stringType, pair.typeB);
        TypePair nullPair = new TypePair(null, null);
        assertNull(nullPair.typeA);
        assertNull(nullPair.typeB);
    }
}