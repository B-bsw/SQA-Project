package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry.ResolveMode;
import com.google.javascript.rhino.jstype.JSType.TypePair;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.UnionType;
import com.google.javascript.rhino.jstype.ProxyObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.StaticScope;
import com.google.javascript.rhino.jstype.Visitor;
import java.util.List;
import java.util.ArrayList;

public class JSTypeTest {
    private JSTypeRegistry registry;
    private ErrorReporter errorReporter;

    @Before
    public void setUp() {
        errorReporter = new ErrorReporter() {
            @Override
            public void warning(String message, String sourceName, int line, int lineOffset) {}
            @Override
            public void error(String message, String sourceName, int line, int lineOffset) {}
        };
        registry = new JSTypeRegistry(errorReporter);
    }

    @Test
    public void testIsNoTypeAndEmptyType() {
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        assertTrue(noType.isNoType());
        assertTrue(noType.isEmptyType());
        assertFalse(noType.isNoObjectType());
        
        JSType noObjectType = registry.getNativeType(JSTypeNative.NO_OBJECT_TYPE);
        assertTrue(noObjectType.isNoObjectType());
        assertTrue(noObjectType.isEmptyType());
        assertFalse(noObjectType.isNoType());
    }

    @Test
    public void testIsNumberAndStringTypes() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        
        assertTrue(numberType.isNumber());
        assertFalse(numberType.isString());
        assertTrue(stringType.isString());
        assertFalse(stringType.isNumber());
        assertFalse(unknownType.isNumber());
        assertFalse(unknownType.isString());
    }

    @Test
    public void testIsEquivalentTo() {
        JSType numberType1 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType numberType2 = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        assertTrue(numberType1.isEquivalentTo(numberType2));
        assertFalse(numberType1.isEquivalentTo(stringType));
        assertTrue(JSType.isEquivalent(numberType1, numberType2));
        assertFalse(JSType.isEquivalent(numberType1, null));
        assertTrue(JSType.isEquivalent(null, null));
        assertFalse(JSType.isEquivalent(null, numberType1));
    }

    @Test
    public void testEqualsAndHashCode() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType sameNumberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        assertEquals(numberType, numberType);
        assertEquals(numberType, sameNumberType);
        assertNotEquals(numberType, stringType);
        assertNotEquals(numberType, null);
        assertNotEquals(numberType, "not a type");
        
        assertEquals(numberType.hashCode(), numberType.hashCode());
    }

    @Test
    public void testGetLeastSupertype() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        
        JSType union = numberType.getLeastSupertype(stringType);
        assertTrue(union.isUnionType());
        
        assertEquals(allType, numberType.getLeastSupertype(allType));
        assertEquals(numberType, noType.getLeastSupertype(numberType));
        assertEquals(numberType, numberType.getLeastSupertype(noType));
    }

    @Test
    public void testGetGreatestSubtype() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        
        assertEquals(numberType, numberType.getGreatestSubtype(numberType));
        assertEquals(numberType, allType.getGreatestSubtype(numberType));
        assertEquals(numberType, numberType.getGreatestSubtype(allType));
        assertEquals(noType, numberType.getGreatestSubtype(stringType));
        assertTrue(numberType.getGreatestSubtype(unknownType).isUnknownType());
        assertTrue(unknownType.getGreatestSubtype(numberType).isUnknownType());
    }

    @Test
    public void testGetTypesUnderEquality() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        TypePair pair = numberType.getTypesUnderEquality(stringType);
        assertNotNull(pair);
        assertNull(pair.typeA);
        assertNull(pair.typeB);
        
        TypePair pair2 = numberType.getTypesUnderEquality(numberType);
        assertNotNull(pair2);
        assertEquals(numberType, pair2.typeA);
        assertEquals(numberType, pair2.typeB);
    }

    @Test
    public void testIsSubtype() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType allType = registry.getNativeType(JSTypeNative.ALL_TYPE);
        
        assertTrue(numberType.isSubtype(numberType));
        assertTrue(numberType.isSubtype(unknownType));
        assertTrue(numberType.isSubtype(allType));
        assertFalse(unknownType.isSubtype(numberType));
    }

    @Test
    public void testResolve() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unresolved = new JSType(registry) {
            @Override
            public BooleanLiteralSet getPossibleToBooleanOutcomes() {
                return BooleanLiteralSet.BOTH;
            }
            @Override
            public <T> T visit(Visitor<T> visitor) {
                return null;
            }
            @Override
            protected JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
                return registry.getNativeType(JSTypeNative.STRING_TYPE);
            }
            @Override
            public boolean isSubtype(JSType that) {
                return false;
            }
            @Override
            public String toString() {
                return "test";
            }
        };
        
        JSType result = unresolved.resolve(errorReporter, null);
        assertNotNull(result);
        assertTrue(result.isResolved());
        assertFalse(result.isUnknownType());
    }

    @Test
    public void testForceResolve() {
        JSType unresolved = new JSType(registry) {
            @Override
            public BooleanLiteralSet getPossibleToBooleanOutcomes() {
                return BooleanLiteralSet.BOTH;
            }
            @Override
            public <T> T visit(Visitor<T> visitor) {
                return null;
            }
            @Override
            protected JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
                return registry.getNativeType(JSTypeNative.STRING_TYPE);
            }
            @Override
            public boolean isSubtype(JSType that) {
                return false;
            }
            @Override
            public String toString() {
                return "test";
            }
        };
        
        JSType result = unresolved.forceResolve(errorReporter, null);
        assertNotNull(result);
        assertEquals(registry.getNativeType(JSTypeNative.STRING_TYPE), result);
    }

    @Test
    public void testResolveWithNullResult() {
        JSType unresolved = new JSType(registry) {
            @Override
            public BooleanLiteralSet getPossibleToBooleanOutcomes() {
                return BooleanLiteralSet.BOTH;
            }
            @Override
            public <T> T visit(Visitor<T> visitor) {
                return null;
            }
            @Override
            protected JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
                return null;
            }
            @Override
            public boolean isSubtype(JSType that) {
                return false;
            }
            @Override
            public String toString() {
                return "test";
            }
        };
        
        JSType result = unresolved.resolve(errorReporter, null);
        assertNotNull(result);
        assertTrue(result.isUnknownType());
    }

    @Test
    public void testClearResolved() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        numberType.clearResolved();
        assertFalse(numberType.isResolved());
        
        JSType result = numberType.resolve(errorReporter, null);
        assertTrue(result.isResolved());
        
        numberType.clearResolved();
        assertFalse(numberType.isResolved());
    }

    @Test
    public void testSafeResolve() {
        assertNull(JSType.safeResolve(null, errorReporter, null));
        
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType result = JSType.safeResolve(numberType, errorReporter, null);
        assertNotNull(result);
        assertEquals(numberType, result);
    }

    @Test
    public void testToDebugHashCodeString() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        String debug = numberType.toDebugHashCodeString();
        assertTrue(debug.startsWith("{"));
        assertTrue(debug.endsWith("}"));
    }

    @Test
    public void testTypePair() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        TypePair pair = new TypePair(numberType, stringType);
        assertEquals(numberType, pair.typeA);
        assertEquals(stringType, pair.typeB);
        
        TypePair nullPair = new TypePair(null, null);
        assertNull(nullPair.typeA);
        assertNull(nullPair.typeB);
    }

    @Test
    public void testCanAssignTo() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        assertTrue(numberType.canAssignTo(numberType));
        assertTrue(numberType.canAssignTo(unknownType));
        assertFalse(numberType.canAssignTo(stringType));
    }

    @Test
    public void testFindPropertyType() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertNull(unknownType.findPropertyType("property"));
    }

    @Test
    public void testDereference() {
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        assertNull(unknownType.dereference());
    }

    @Test
    public void testCanTestForEqualityWith() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        assertTrue(numberType.canTestForEqualityWith(stringType));
        assertTrue(numberType.canTestForEqualityWith(numberType));
    }

    @Test
    public void testCanTestForShallowEqualityWith() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        
        assertTrue(numberType.canTestForShallowEqualityWith(numberType));
        assertFalse(numberType.canTestForShallowEqualityWith(stringType));
    }

    @Test
    public void testIsNullable() {
        JSType nullType = registry.getNativeType(JSTypeNative.NULL_TYPE);
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        
        assertTrue(nullType.isNullable());
        assertFalse(numberType.isNullable());
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType noType = registry.getNativeType(JSTypeNative.NO_TYPE);
        
        assertEquals(numberType, numberType.getRestrictedTypeGivenToBooleanOutcome(true));
        assertEquals(numberType, numberType.getRestrictedTypeGivenToBooleanOutcome(false));
    }

    @Test
    public void testDiffersFrom() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        JSType stringType = registry.getNativeType(JSTypeNative.STRING_TYPE);
        JSType unknownType = registry.getNativeType(JSTypeNative.UNKNOWN_TYPE);
        
        assertTrue(numberType.differsFrom(stringType));
        assertFalse(numberType.differsFrom(numberType));
        assertTrue(numberType.differsFrom(unknownType));
        assertTrue(unknownType.differsFrom(numberType));
        assertFalse(unknownType.differsFrom(unknownType));
    }

    @Test
    public void testGetNativeType() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertEquals(JSTypeNative.NUMBER_TYPE, numberType.getNativeType(JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testGetJSDocInfo() {
        JSType numberType = registry.getNativeType(JSTypeNative.NUMBER_TYPE);
        assertNull(numberType.getJSDocInfo());
    }
}