package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JavaType;

public class TypeBindingsTest {

    private JavaType type(Class<?> raw) {
        return TypeFactory.defaultInstance().constructType(raw);
    }

    @Test
    public void emptyBindings() {
        TypeBindings bindings = TypeBindings.emptyBindings();
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
        assertEquals("<>", bindings.toString());
        assertEquals(Collections.emptyList(), bindings.getTypeParameters());
        assertNull(bindings.getBoundName(0));
        assertNull(bindings.getBoundType(0));
        assertFalse(bindings.hasUnbound("T"));
        assertSame(bindings, TypeBindings.emptyBindings());
    }

    @Test
    public void createFromListHandlesNullEmptyAndPopulated() {
        JavaType stringType = type(String.class);

        assertTrue(TypeBindings.create(String.class, (List<JavaType>) null).isEmpty());
        assertTrue(TypeBindings.create(String.class, Collections.<JavaType>emptyList()).isEmpty());

        TypeBindings populated = TypeBindings.create(List.class,
                Collections.<JavaType>singletonList(stringType));
        assertEquals(1, populated.size());
        assertSame(stringType, populated.findBoundType("E"));
    }

    @Test
    public void createFromArraySupportsZeroOneTwoAndThree() {
        JavaType stringType = type(String.class);
        JavaType intType = type(Integer.class);

        assertTrue(TypeBindings.create(String.class, (JavaType[]) null).isEmpty());
        assertTrue(TypeBindings.create(String.class, new JavaType[0]).isEmpty());

        TypeBindings one = TypeBindings.create(List.class, new JavaType[] { stringType });
        assertEquals(1, one.size());
        assertSame(stringType, one.findBoundType("E"));

        TypeBindings two = TypeBindings.create(Map.class,
                new JavaType[] { stringType, intType });
        assertEquals(2, two.size());
        assertSame(stringType, two.findBoundType("K"));
        assertSame(intType, two.findBoundType("V"));

        TypeBindings three = TypeBindings.create(ThreeGenerics.class,
                new JavaType[] { stringType, intType, stringType });
        assertEquals(3, three.size());
        assertSame(intType, three.getBoundType(1));
    }

    @Test
    public void createRejectsMismatchedParameterCounts() {
        try {
            TypeBindings.create(List.class, new JavaType[0]);
            fail("Should have thrown");
        } catch (IllegalArgumentException expected) { }
        try {
            TypeBindings.create(Map.class, new JavaType[] { type(String.class) });
            fail("Should have thrown");
        } catch (IllegalArgumentException expected) { }
        try {
            TypeBindings.create(List.class, type(String.class), type(Integer.class));
            fail("Should have thrown");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void createOneAndTwoArgFactoryMethodsWork() {
        JavaType stringType = type(String.class);
        JavaType intType = type(Integer.class);

        TypeBindings listBindings = TypeBindings.create(List.class, stringType);
        assertSame(stringType, listBindings.findBoundType("E"));
        assertEquals("E", listBindings.getBoundName(0));

        TypeBindings mapBindings = TypeBindings.create(Map.class, stringType, intType);
        assertSame(stringType, mapBindings.findBoundType("K"));
        assertSame(intType, mapBindings.findBoundType("V"));
    }

    @Test
    public void createIfNeededHandlesNonGenericAndGeneric() {
        JavaType stringType = type(String.class);
        JavaType intType = type(Integer.class);

        assertTrue(TypeBindings.createIfNeeded(String.class, stringType).isEmpty());
        assertSame(stringType, TypeBindings.createIfNeeded(List.class, stringType).findBoundType("E"));

        TypeBindings mapIfNeeded = TypeBindings.createIfNeeded(Map.class,
                new JavaType[] { stringType, intType });
        assertSame(stringType, mapIfNeeded.findBoundType("K"));
        assertSame(intType, mapIfNeeded.findBoundType("V"));

        assertTrue(TypeBindings.createIfNeeded(String.class, (JavaType[]) null).isEmpty());
        assertTrue(TypeBindings.createIfNeeded(String.class,
                new JavaType[] { stringType }).isEmpty());
        assertSame(stringType, TypeBindings.createIfNeeded(List.class,
                new JavaType[] { stringType }).findBoundType("E"));

        try {
            TypeBindings.createIfNeeded(Map.class, stringType);
            fail("Should have thrown");
        } catch (IllegalArgumentException expected) { }
        try {
            TypeBindings.createIfNeeded(List.class, new JavaType[0]);
            fail("Should have thrown");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void withUnboundVariableAndHasUnbound() {
        TypeBindings base = TypeBindings.emptyBindings();
        TypeBindings one = base.withUnboundVariable("T");
        assertTrue(one.hasUnbound("T"));
        assertFalse(base.hasUnbound("T"));

        TypeBindings two = one.withUnboundVariable("U");
        assertTrue(two.hasUnbound("T"));
        assertTrue(two.hasUnbound("U"));
        assertFalse(two.hasUnbound("Z"));
        assertTrue(two.isEmpty());
    }

    @Test
    public void accessorsHandleBoundaries() {
        JavaType stringType = type(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);

        assertEquals("E", bindings.getBoundName(0));
        assertNull(bindings.getBoundName(-1));
        assertNull(bindings.getBoundName(1));
        assertSame(stringType, bindings.getBoundType(0));
        assertNull(bindings.getBoundType(-1));
        assertNull(bindings.getBoundType(1));
        assertNull(bindings.findBoundType("missing"));
    }

    @Test
    public void findBoundTypeResolvesRecursiveTypeReferences() {
        JavaType stringType = type(String.class);

        ResolvedRecursiveType recursive = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        recursive.setReference(stringType);
        TypeBindings resolved = TypeBindings.create(List.class, recursive);
        assertSame(stringType, resolved.findBoundType("E"));

        ResolvedRecursiveType unresolved = new ResolvedRecursiveType(String.class, TypeBindings.emptyBindings());
        TypeBindings unresolvedBindings = TypeBindings.create(List.class, unresolved);
        assertSame(unresolved, unresolvedBindings.findBoundType("E"));
    }

    @Test
    public void getTypeParametersReturnsBindings() {
        JavaType stringType = type(String.class);
        JavaType intType = type(Integer.class);

        assertTrue(TypeBindings.emptyBindings().getTypeParameters().isEmpty());

        TypeBindings mapBindings = TypeBindings.create(Map.class, stringType, intType);
        List<JavaType> params = mapBindings.getTypeParameters();
        assertEquals(2, params.size());
        assertSame(stringType, params.get(0));
        assertSame(intType, params.get(1));
    }

    @Test
    public void toStringFormatsBindings() {
        JavaType stringType = type(String.class);
        JavaType intType = type(Integer.class);

        assertEquals("<>", TypeBindings.emptyBindings().toString());

        TypeBindings one = TypeBindings.create(List.class, stringType);
        assertEquals("<" + stringType.getGenericSignature() + ">", one.toString());

        TypeBindings two = TypeBindings.create(Map.class, stringType, intType);
        assertEquals("<" + stringType.getGenericSignature() + "," + intType.getGenericSignature() + ">", two.toString());
    }

    @Test
    public void equalsAndHashCodeUseTypes() {
        JavaType stringType = type(String.class);
        TypeBindings listA = TypeBindings.create(List.class, stringType);
        TypeBindings listB = TypeBindings.create(List.class, type(String.class));

        assertEquals(listA, listA);
        assertEquals(listA, listB);
        assertEquals(listA.hashCode(), listB.hashCode());

        assertFalse(listA.equals(null));
        assertFalse(listA.equals("x"));
        assertFalse(listA.equals(TypeBindings.emptyBindings()));
        assertFalse(listA.equals(TypeBindings.create(List.class, type(Integer.class))));
        assertFalse(listA.equals(TypeBindings.create(Map.class, stringType, type(Integer.class))));
    }

    static class ThreeGenerics<T, U, V> {
    }
}