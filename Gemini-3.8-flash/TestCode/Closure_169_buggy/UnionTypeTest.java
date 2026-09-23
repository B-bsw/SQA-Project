package com.google.javascript.rhino.jstype;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class UnionTypeTest {
    private JSTypeRegistry registry;
    private UnionType unionType;
    
    @Before
    public void setUp() {
        registry = new JSTypeRegistry();
    }
    
    @Test
    public void testMatchesNumberContext_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesNumberContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesNumberContext() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.matchesNumberContext());
    }
    
    @Test
    public void testMatchesNumberContext_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesNumberContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesNumberContext() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.matchesNumberContext());
    }
    
    @Test
    public void testMatchesStringContext_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesStringContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesStringContext() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.matchesStringContext());
    }
    
    @Test
    public void testMatchesStringContext_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesStringContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesStringContext() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.matchesStringContext());
    }
    
    @Test
    public void testMatchesObjectContext_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesObjectContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesObjectContext() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.matchesObjectContext());
    }
    
    @Test
    public void testMatchesObjectContext_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean matchesObjectContext() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean matchesObjectContext() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.matchesObjectContext());
    }
    
    @Test
    public void testFindPropertyType_nullAlternate() {
        List<JSType> alternates = new ArrayList<>();
        JSType nullType = new JSType(registry) {
            @Override
            public boolean isNullType() { return true; }
            @Override
            public boolean isVoidType() { return false; }
            @Override
            public JSType findPropertyType(String propertyName) { return null; }
        };
        alternates.add(nullType);
        unionType = new UnionType(registry, alternates);
        assertNull(unionType.findPropertyType("foo"));
    }
    
    @Test
    public void testFindPropertyType_skipNullAndVoid() {
        List<JSType> alternates = new ArrayList<>();
        JSType nullType = new JSType(registry) {
            @Override
            public boolean isNullType() { return true; }
            @Override
            public boolean isVoidType() { return false; }
            @Override
            public JSType findPropertyType(String propertyName) { return null; }
        };
        JSType realType = new JSType(registry) {
            @Override
            public boolean isNullType() { return false; }
            @Override
            public boolean isVoidType() { return false; }
            @Override
            public JSType findPropertyType(String propertyName) {
                return new JSType(registry) {};
            }
        };
        alternates.add(nullType);
        alternates.add(realType);
        unionType = new UnionType(registry, alternates);
        assertNotNull(unionType.findPropertyType("bar"));
    }
    
    @Test
    public void testCanAssignTo_allTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean canAssignTo(JSType that) { return true; }
            @Override
            public boolean isUnknownType() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean canAssignTo(JSType that) { return true; }
            @Override
            public boolean isUnknownType() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.canAssignTo(new JSType(registry) {}));
    }
    
    @Test
    public void testCanAssignTo_oneFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean canAssignTo(JSType that) { return true; }
            @Override
            public boolean isUnknownType() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean canAssignTo(JSType that) { return false; }
            @Override
            public boolean isUnknownType() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.canAssignTo(new JSType(registry) {}));
    }
    
    @Test
    public void testCanAssignTo_unknownReturnsTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType unknownType = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return true; }
        };
        alternates.add(unknownType);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.canAssignTo(new JSType(registry) {}));
    }
    
    @Test
    public void testCanBeCalled_allTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean canBeCalled() { return true; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean canBeCalled() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.canBeCalled());
    }
    
    @Test
    public void testCanBeCalled_oneFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean canBeCalled() { return true; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean canBeCalled() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.canBeCalled());
    }
    
    @Test
    public void testIsNullable_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isNullable() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isNullable() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.isNullable());
    }
    
    @Test
    public void testIsNullable_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isNullable() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isNullable() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.isNullable());
    }
    
    @Test
    public void testIsUnknownType_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.isUnknownType());
    }
    
    @Test
    public void testIsUnknownType_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.isUnknownType());
    }
    
    @Test
    public void testIsStruct_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isStruct() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isStruct() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.isStruct());
    }
    
    @Test
    public void testIsStruct_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isStruct() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isStruct() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.isStruct());
    }
    
    @Test
    public void testIsDict_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isDict() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isDict() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.isDict());
    }
    
    @Test
    public void testIsDict_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isDict() { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isDict() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.isDict());
    }
    
    @Test
    public void testContains_found() {
        List<JSType> alternates = new ArrayList<>();
        JSType target = new JSType(registry) {
            @Override
            public boolean isEquivalentTo(JSType type) { return true; }
        };
        JSType other = new JSType(registry) {
            @Override
            public boolean isEquivalentTo(JSType type) { return false; }
        };
        alternates.add(other);
        alternates.add(target);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.contains(target));
    }
    
    @Test
    public void testContains_notFound() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isEquivalentTo(JSType type) { return false; }
        };
        alternates.add(type1);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.contains(new JSType(registry) {}));
    }
    
    @Test
    public void testHasProperty_allFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean hasProperty(String pname) { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean hasProperty(String pname) { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.hasProperty("x"));
    }
    
    @Test
    public void testHasProperty_oneTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean hasProperty(String pname) { return false; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean hasProperty(String pname) { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.hasProperty("y"));
    }
    
    @Test
    public void testIsObject_allTrue() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isObject() { return true; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isObject() { return true; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.isObject());
    }
    
    @Test
    public void testIsObject_oneFalse() {
        List<JSType> alternates = new ArrayList<>();
        JSType type1 = new JSType(registry) {
            @Override
            public boolean isObject() { return true; }
        };
        JSType type2 = new JSType(registry) {
            @Override
            public boolean isObject() { return false; }
        };
        alternates.add(type1);
        alternates.add(type2);
        unionType = new UnionType(registry, alternates);
        assertFalse(unionType.isObject());
    }
    
    @Test
    public void testGetAlternates_immutable() {
        List<JSType> alternates = new ArrayList<>();
        JSType type = new JSType(registry) {};
        alternates.add(type);
        unionType = new UnionType(registry, alternates);
        assertNotNull(unionType.getAlternates());
    }
    
    @Test
    public void testToMaybeUnionType() {
        List<JSType> alternates = new ArrayList<>();
        JSType type = new JSType(registry) {};
        alternates.add(type);
        unionType = new UnionType(registry, alternates);
        assertSame(unionType, unionType.toMaybeUnionType());
    }
    
    @Test
    public void testHashCode() {
        List<JSType> alternates = new ArrayList<>();
        JSType type = new JSType(registry) {};
        alternates.add(type);
        unionType = new UnionType(registry, alternates);
        assertEquals(alternates.hashCode(), unionType.hashCode());
    }
    
    @Test
    public void testCheckUnionEquivalenceHelper_sameSize() {
        List<JSType> alternates1 = new ArrayList<>();
        List<JSType> alternates2 = new ArrayList<>();
        JSType type = new JSType(registry) {
            @Override
            public boolean checkEquivalenceHelper(JSType that, boolean tolerateUnknowns) {
                return true;
            }
        };
        alternates1.add(type);
        alternates2.add(type);
        UnionType u1 = new UnionType(registry, alternates1);
        UnionType u2 = new UnionType(registry, alternates2);
        assertTrue(u1.checkUnionEquivalenceHelper(u2, false));
    }
    
    @Test
    public void testCheckUnionEquivalenceHelper_differentSize() {
        List<JSType> alternates1 = new ArrayList<>();
        List<JSType> alternates2 = new ArrayList<>();
        JSType type = new JSType(registry) {};
        alternates1.add(type);
        alternates2.add(type);
        alternates2.add(new JSType(registry) {});
        UnionType u1 = new UnionType(registry, alternates1);
        UnionType u2 = new UnionType(registry, alternates2);
        assertFalse(u1.checkUnionEquivalenceHelper(u2, false));
    }
    
    @Test
    public void testGetRestrictedUnion_removesSubtype() {
        List<JSType> alternates = new ArrayList<>();
        JSType subtype = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isSubtype(JSType type) { return true; }
        };
        JSType notSubtype = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return false; }
            @Override
            public boolean isSubtype(JSType type) { return false; }
        };
        alternates.add(subtype);
        alternates.add(notSubtype);
        unionType = new UnionType(registry, alternates);
        JSType result = unionType.getRestrictedUnion(new JSType(registry) {});
        assertNotNull(result);
    }
    
    @Test
    public void testGetRestrictedUnion_unknownPreserved() {
        List<JSType> alternates = new ArrayList<>();
        JSType unknown = new JSType(registry) {
            @Override
            public boolean isUnknownType() { return true; }
            @Override
            public boolean isSubtype(JSType type) { return false; }
        };
        alternates.add(unknown);
        unionType = new UnionType(registry, alternates);
        JSType result = unionType.getRestrictedUnion(new JSType(registry) {});
        assertNotNull(result);
    }
    
    @Test
    public void testGetAlternatesReturnsCollection() {
        List<JSType> alternates = new ArrayList<>();
        JSType type = new JSType(registry) {};
        alternates.add(type);
        unionType = new UnionType(registry, alternates);
        assertTrue(unionType.getAlternates().iterator().hasNext());
    }
}