package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticScope;
import com.google.javascript.rhino.jstype.ErrorReporter;
import com.google.javascript.rhino.jstype.TernaryValue;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import java.util.HashSet;
import java.util.Set;

public class UnionTypeTest {
    private JSTypeRegistry registry;
    private UnionType unionType;
    private JSType mockType1;
    private JSType mockType2;

    @Before
    public void setUp() {
        registry = new JSTypeRegistry(null);
        Set<JSType> alternates = new HashSet<>();
        mockType1 = new MockJSType(registry, "type1");
        mockType2 = new MockJSType(registry, "type2");
        alternates.add(mockType1);
        alternates.add(mockType2);
        unionType = new UnionType(registry, alternates);
    }

    private static class MockJSType extends JSType {
        private String name;
        private boolean unknown;
        
        public MockJSType(JSTypeRegistry registry, String name) {
            super(registry);
            this.name = name;
        }

        @Override
        public boolean isUnknownType() {
            return unknown;
        }

        @Override
        public boolean isObject() {
            return true;
        }

        @Override
        public boolean isSubtype(JSType that) {
            return false;
        }

        @Override
        public boolean canAssignTo(JSType that) {
            return true;
        }

        @Override
        public boolean isNullable() {
            return true;
        }

        @Override
        public JSType findPropertyType(String propertyName) {
            return null;
        }

        @Override
        public boolean matchesNumberContext() {
            return true;
        }

        @Override
        public boolean matchesStringContext() {
            return true;
        }

        @Override
        public boolean matchesObjectContext() {
            return true;
        }

        @Override
        public JSType.getRestrictedTypeGivenToBooleanOutcome(boolean outcome) {
            return new MockJSType(registry, "false");
        }

        @Override
        public BooleanLiteralSet getPossibleToBooleanOutcomes() {
            return BooleanLiteralSet.TRUE;
        }

        @Override
        public TypePair getTypesUnderEquality(JSType that) {
            return new TypePair(this, that);
        }

        @Override
        public TypePair getTypesUnderInequality(JSType that) {
            return new TypePair(this, that);
        }

        @Override
        public TypePair getTypesUnderShallowInequality(JSType that) {
            return new TypePair(this, that);
        }

        @Override
        public <T> T visit(Visitor<T> visitor) {
            return visitor.caseUnionType(new UnionType(registry, Set.of(this)));
        }

        @Override
        public void forgiveUnknownNames() {
        }

        @Override
        public JSType getLeastSupertype(JSType that) {
            return this;
        }

        @Override
        public JSType meet(JSType that) {
            return this;
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MockJSType) {
                return name.equals(((MockJSType) obj).name);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    @Test
    public void testGetAlternates() {
        assertNotNull(unionType.getAlternates());
        int count = 0;
        for (JSType type : unionType.getAlternates()) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testMatchesNumberContextAllTrue() {
        assertTrue(unionType.matchesNumberContext());
    }

    @Test
    public void testMatchesNumberContextFalse() {
        MockJSType falseType = new MockJSType(registry, "false") {
            @Override
            public boolean matchesNumberContext() {
                return false;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(falseType);
        alternates.add(new MockJSType(registry, "false2") {
            @Override
            public boolean matchesNumberContext() {
                return false;
            }
        });
        UnionType union = new UnionType(registry, alternates);
        assertFalse(union.matchesNumberContext());
    }

    @Test
    public void testMatchesStringContext() {
        assertTrue(unionType.matchesStringContext());
    }

    @Test
    public void testMatchesStringContextFalse() {
        MockJSType falseType = new MockJSType(registry, "false") {
            @Override
            public boolean matchesStringContext() {
                return false;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(falseType);
        alternates.add(new MockJSType(registry, "false2") {
            @Override
            public boolean matchesStringContext() {
                return false;
            }
        });
        UnionType union = new UnionType(registry, alternates);
        assertFalse(union.matchesStringContext());
    }

    @Test
    public void testMatchesObjectContext() {
        assertTrue(unionType.matchesObjectContext());
    }

    @Test
    public void testFindPropertyTypeMixed() {
        MockJSType typeA = new MockJSType(registry, "A") {
            @Override
            public JSType findPropertyType(String propertyName) {
                return new MockJSType(registry, "propA");
            }
        };
        MockJSType typeB = new MockJSType(registry, "B") {
            @Override
            public JSType findPropertyType(String propertyName) {
                return new MockJSType(registry, "propB");
            }
        };
        MockJSType nullType = new MockJSType(registry, "null") {
            @Override
            public boolean isNullType() {
                return true;
            }
            @Override
            public JSType findPropertyType(String propertyName) {
                fail("should not be called");
                return null;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(typeA);
        alternates.add(typeB);
        alternates.add(nullType);
        UnionType union = new UnionType(registry, alternates);
        assertNotNull(union.findPropertyType("prop"));
    }

    @Test
    public void testFindPropertyTypeNull() {
        assertEquals(null, unionType.findPropertyType("nonexistent"));
    }

    @Test
    public void testCanAssignTo() {
        assertTrue(unionType.canAssignTo(new MockJSType(registry, "target")));
    }

    @Test
    public void testCanBeCalled() {
        assertTrue(unionType.canBeCalled());
    }

    @Test
    public void testCanBeCalledFalse() {
        MockJSType falseType = new MockJSType(registry, "false") {
            @Override
            public boolean canBeCalled() {
                return false;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(falseType);
        alternates.add(new MockJSType(registry, "false2"));
        UnionType union = new UnionType(registry, alternates);
        assertFalse(union.canBeCalled());
    }

    @Test
    public void testRestrictByNotNullOrUndefined() {
        assertNotNull(unionType.restrictByNotNullOrUndefined());
    }

    @Test
    public void testTestForEquality() {
        assertEquals(TernaryValue.UNKNOWN, unionType.testForEquality(unionType));
    }

    @Test
    public void testTestForEqualityMixed() {
        MockJSType type1 = new MockJSType(registry, "type1") {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.TRUE;
            }
        };
        MockJSType type2 = new MockJSType(registry, "type2") {
            @Override
            public TernaryValue testForEquality(JSType that) {
                return TernaryValue.FALSE;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(type1);
        alternates.add(type2);
        UnionType union = new UnionType(registry, alternates);
        assertEquals(TernaryValue.UNKNOWN, union.testForEquality(new MockJSType(registry, "that")));
    }

    @Test
    public void testIsNullable() {
        assertTrue(unionType.isNullable());
    }

    @Test
    public void testIsUnknownType() {
        assertFalse(unionType.isUnknownType());
    }

    @Test
    public void testGetLeastSupertype() {
        assertNotNull(unionType.getLeastSupertype(new MockJSType(registry, "that")));
    }

    @Test
    public void testMeet() {
        assertNotNull(unionType.meet(new MockJSType(registry, "that")));
    }

    @Test
    public void testEquals() {
        Set<JSType> alternates1 = new HashSet<>();
        alternates1.add(new MockJSType(registry, "a"));
        alternates1.add(new MockJSType(registry, "b"));
        Set<JSType> alternates2 = new HashSet<>();
        alternates2.add(new MockJSType(registry, "a"));
        alternates2.add(new MockJSType(registry, "b"));
        UnionType union1 = new UnionType(registry, alternates1);
        UnionType union2 = new UnionType(registry, alternates2);
        assertEquals(union1, union2);
    }

    @Test
    public void testNotEquals() {
        Set<JSType> alternates1 = new HashSet<>();
        alternates1.add(new MockJSType(registry, "a"));
        Set<JSType> alternates2 = new HashSet<>();
        alternates2.add(new MockJSType(registry, "b"));
        UnionType union1 = new UnionType(registry, alternates1);
        UnionType union2 = new UnionType(registry, alternates2);
        assertFalse(union1.equals(union2));
    }

    @Test
    public void testHashCode() {
        assertNotNull(unionType.hashCode());
    }

    @Test
    public void testIsUnionType() {
        assertTrue(unionType.isUnionType());
    }

    @Test
    public void testContains() {
        assertTrue(unionType.contains(mockType1));
        assertFalse(unionType.contains(new MockJSType(registry, "notin")));
    }

    @Test
    public void testGetRestrictedUnionSubtype() {
        MockJSType subtype = new MockJSType(registry, "subtype") {
            @Override
            public boolean isSubtype(JSType that) {
                return true;
            }
        };
        UnionType restricted = unionType.getRestrictedUnion(subtype);
        assertNotNull(restricted);
    }

    @Test
    public void testGetRestrictedUnionNoSubtype() {
        JSType result = unionType.getRestrictedUnion(new MockJSType(registry, "notsubtype"));
        assertNotNull(result);
    }

    @Test
    public void testToString() {
        String result = unionType.toString();
        assertTrue(result.contains("(") && result.contains(")"));
        assertTrue(result.contains("|"));
    }

    @Test
    public void testIsSubtypeAllSubtypes() {
        MockJSType type = new MockJSType(registry, "sub") {
            @Override
            public boolean isSubtype(JSType that) {
                return true;
            }
        };
        MockJSType type2 = new MockJSType(registry, "sub2") {
            @Override
            public boolean isSubtype(JSType that) {
                return true;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(type);
        alternates.add(type2);
        UnionType union = new UnionType(registry, alternates);
        assertTrue(union.isSubtype(new MockJSType(registry, "that")));
    }

    @Test
    public void testIsSubtypeNotAllSubtypes() {
        MockJSType type = new MockJSType(registry, "sub") {
            @Override
            public boolean isSubtype(JSType that) {
                return false;
            }
        };
        MockJSType type2 = new MockJSType(registry, "sub2") {
            @Override
            public boolean isSubtype(JSType that) {
                return true;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(type);
        alternates.add(type2);
        UnionType union = new UnionType(registry, alternates);
        assertFalse(union.isSubtype(new MockJSType(registry, "that")));
    }

    @Test
    public void testGetRestrictedTypeGivenToBooleanOutcome() {
        assertNotNull(unionType.getRestrictedTypeGivenToBooleanOutcome(true));
        assertNotNull(unionType.getRestrictedTypeGivenToBooleanOutcome(false));
    }

    @Test
    public void testGetPossibleToBooleanOutcomes() {
        assertNotNull(unionType.getPossibleToBooleanOutcomes());
    }

    @Test
    public void testGetTypesUnderEquality() {
        assertNotNull(unionType.getTypesUnderEquality(new MockJSType(registry, "that")));
    }

    @Test
    public void testGetTypesUnderInequality() {
        assertNotNull(unionType.getTypesUnderInequality(new MockJSType(registry, "that")));
    }

    @Test
    public void testGetTypesUnderShallowInequality() {
        assertNotNull(unionType.getTypesUnderShallowInequality(new MockJSType(registry, "that")));
    }

    @Test
    public void testVisit() {
        assertNotNull(unionType.visit(new JSType.Visitor<Object>() {
            @Override
            public Object caseNoType(NoType type) { return null; }
            @Override
            public Object caseEnumElementType(EnumElementType type) { return null; }
            @Override
            public Object caseAllType(AllType type) { return null; }
            @Override
            public Object caseBooleanType(BooleanType type) { return null; }
            @Override
            public Object caseFunctionType(FunctionType type) { return null; }
            @Override
            public Object caseObjectType(ObjectType type) { return null; }
            @Override
            public Object caseUnknownType(UnknownType type) { return null; }
            @Override
            public Object caseNullType(NullType type) { return null; }
            @Override
            public Object caseNumberType(NumberType type) { return null; }
            @Override
            public Object caseStringType(StringType type) { return null; }
            @Override
            public Object caseVoidType(VoidType type) { return null; }
            @Override
            public Object caseUnionType(UnionType type) { return type; }
            @Override
            public Object caseValueType(ValueType type) { return null; } 
            @Override
            public Object caseArrayType(ArrayType type) { return null; }
            @Override
            public Object caseRecordType(RecordType type) { return null; }
            @Override
            public Object caseParameterizedType(ParameterizedType type) { return null; }
            @Override
            public Object caseTemplateType(TemplateType type) { return null; }
        }));
    }

    @Test
    public void testResolveInternal() {
        MockJSType resolveType = new MockJSType(registry, "resolved") {
            @Override
            public boolean isUnknownType() {
                return false;
            }
            @Override
            public JSType.resolve(ErrorReporter t, StaticScope<JSType> scope) {
                return this;
            }
            @Override
            public JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope) {
                return this;
            }
        };
        Set<JSType> alternates = new HashSet<>();
        alternates.add(resolveType);
        UnionType union = new UnionType(registry, alternates);
        JSType result = union.resolveInternal(null, null);
        assertNotNull(result);
    }
}