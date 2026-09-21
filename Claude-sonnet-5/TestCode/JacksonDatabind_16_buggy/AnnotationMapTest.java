package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.*;
import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnnotationMapTest
{
    // -------------------------------------------------------------
    // Helper annotation types (RUNTIME retention required for reflection)
    // -------------------------------------------------------------

    @Retention(RetentionPolicy.RUNTIME)
    static @interface AnnoA { }

    @Retention(RetentionPolicy.RUNTIME)
    static @interface AnnoB { }

    @Retention(RetentionPolicy.RUNTIME)
    static @interface AnnoWithValue {
        String value();
    }

    @AnnoA
    @AnnoB
    static class DummyAB { }

    @AnnoWithValue("x")
    static class DummyValueX { }

    @AnnoWithValue("y")
    static class DummyValueY { }

    @AnnoWithValue("x")
    static class DummyValueX2 { }

    // -------------------------------------------------------------
    // get()
    // -------------------------------------------------------------

    @Test
    public void testGetWhenMapIsNull()
    {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(AnnoA.class));
    }

    @Test
    public void testGetWhenAnnotationNotPresent()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        map.add(a);
        // AnnoB not added
        assertNull(map.get(AnnoB.class));
    }

    @Test
    public void testGetWhenAnnotationPresent()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        map.add(a);
        AnnoA result = map.get(AnnoA.class);
        assertNotNull(result);
        assertSame(a, result);
    }

    // -------------------------------------------------------------
    // size()
    // -------------------------------------------------------------

    @Test
    public void testSizeWhenNull()
    {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testSizeAfterAdditions()
    {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
        map.add(DummyAB.class.getAnnotation(AnnoA.class));
        assertEquals(1, map.size());
        map.add(DummyAB.class.getAnnotation(AnnoB.class));
        assertEquals(2, map.size());
    }

    // -------------------------------------------------------------
    // annotations()
    // -------------------------------------------------------------

    @Test
    public void testAnnotationsWhenNull()
    {
        AnnotationMap map = new AnnotationMap();
        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        Iterator<Annotation> it = iterable.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testAnnotationsWhenEmptyButNonNullMap()
    {
        AnnotationMap map = new AnnotationMap();
        // directly manipulate protected field (same package access)
        map._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        Iterable<Annotation> iterable = map.annotations();
        assertNotNull(iterable);
        assertFalse(iterable.iterator().hasNext());
    }

    @Test
    public void testAnnotationsWithSingleEntry()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        map.add(a);
        Iterable<Annotation> iterable = map.annotations();
        List<Annotation> list = new ArrayList<Annotation>();
        for (Annotation ann : iterable) {
            list.add(ann);
        }
        assertEquals(1, list.size());
        assertTrue(list.contains(a));
    }

    @Test
    public void testAnnotationsWithMultipleEntries()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        Annotation b = DummyAB.class.getAnnotation(AnnoB.class);
        map.add(a);
        map.add(b);
        Iterable<Annotation> iterable = map.annotations();
        List<Annotation> list = new ArrayList<Annotation>();
        for (Annotation ann : iterable) {
            list.add(ann);
        }
        assertEquals(2, list.size());
        assertTrue(list.contains(a));
        assertTrue(list.contains(b));
    }

    // -------------------------------------------------------------
    // add()
    // -------------------------------------------------------------

    @Test
    public void testAddFirstTimeReturnsFalse()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        boolean result = map.add(a);
        assertFalse(result);
        assertEquals(1, map.size());
        assertSame(a, map.get(AnnoA.class));
    }

    @Test
    public void testAddSameAnnotationTwiceReturnsTrue()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyValueX.class.getAnnotation(AnnoWithValue.class);
        map.add(a);
        // add exact same annotation instance again -> previous.equals(ann) true
        boolean result = map.add(a);
        assertTrue(result);
        assertEquals(1, map.size());
    }

    @Test
    public void testAddDifferentValueSameTypeReturnsFalse()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation x = DummyValueX.class.getAnnotation(AnnoWithValue.class);
        Annotation y = DummyValueY.class.getAnnotation(AnnoWithValue.class);
        map.add(x);
        boolean result = map.add(y);
        // previous (x) not equal to new (y) -> returns false
        assertFalse(result);
        assertEquals(1, map.size());
        assertSame(y, map.get(AnnoWithValue.class));
    }

    @Test
    public void testAddEquivalentAnnotationDifferentInstanceReturnsTrue()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation x1 = DummyValueX.class.getAnnotation(AnnoWithValue.class);
        Annotation x2 = DummyValueX2.class.getAnnotation(AnnoWithValue.class);
        map.add(x1);
        // x1 and x2 have same value "x" so they are equal annotations, though different instances
        boolean result = map.add(x2);
        assertTrue(result);
        assertEquals(1, map.size());
    }

    // -------------------------------------------------------------
    // addIfNotPresent()
    // -------------------------------------------------------------

    @Test
    public void testAddIfNotPresentWhenMapIsNull()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        boolean result = map.addIfNotPresent(a);
        assertTrue(result);
        assertEquals(1, map.size());
        assertSame(a, map.get(AnnoA.class));
    }

    @Test
    public void testAddIfNotPresentWhenNotContainingKey()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        Annotation b = DummyAB.class.getAnnotation(AnnoB.class);
        map.add(a);
        boolean result = map.addIfNotPresent(b);
        assertTrue(result);
        assertEquals(2, map.size());
        assertSame(b, map.get(AnnoB.class));
    }

    @Test
    public void testAddIfNotPresentWhenAlreadyContainingKey()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation x = DummyValueX.class.getAnnotation(AnnoWithValue.class);
        Annotation y = DummyValueY.class.getAnnotation(AnnoWithValue.class);
        map.add(x);
        boolean result = map.addIfNotPresent(y);
        assertFalse(result);
        assertEquals(1, map.size());
        // original value should remain untouched
        assertSame(x, map.get(AnnoWithValue.class));
    }

    // -------------------------------------------------------------
    // toString()
    // -------------------------------------------------------------

    @Test
    public void testToStringWhenNull()
    {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToStringWhenNonNull()
    {
        AnnotationMap map = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        map.add(a);
        String str = map.toString();
        assertNotNull(str);
        assertTrue(str.contains("AnnoA"));
    }

    // -------------------------------------------------------------
    // merge()
    // -------------------------------------------------------------

    @Test
    public void testMergeBothNull()
    {
        AnnotationMap result = AnnotationMap.merge(null, null);
        assertNull(result);
    }

    @Test
    public void testMergePrimaryNullReturnsSecondary()
    {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap result = AnnotationMap.merge(null, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMergePrimaryEmptyAnnotationsReturnsSecondary()
    {
        AnnotationMap primary = new AnnotationMap();
        // _annotations stays null (never added) -> counts as empty
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMergePrimaryWithEmptyMapObjectReturnsSecondary()
    {
        AnnotationMap primary = new AnnotationMap();
        primary._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(secondary, result);
    }

    @Test
    public void testMergeSecondaryNullReturnsPrimary()
    {
        AnnotationMap primary = new AnnotationMap();
        primary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap result = AnnotationMap.merge(primary, null);
        assertSame(primary, result);
    }

    @Test
    public void testMergeSecondaryEmptyAnnotationsReturnsPrimary()
    {
        AnnotationMap primary = new AnnotationMap();
        primary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap secondary = new AnnotationMap();
        // secondary._annotations stays null
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(primary, result);
    }

    @Test
    public void testMergeSecondaryWithEmptyMapObjectReturnsPrimary()
    {
        AnnotationMap primary = new AnnotationMap();
        primary.add(DummyAB.class.getAnnotation(AnnoA.class));
        AnnotationMap secondary = new AnnotationMap();
        secondary._annotations = new HashMap<Class<? extends Annotation>, Annotation>();
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertSame(primary, result);
    }

    @Test
    public void testMergeBothNonEmptyNoOverlap()
    {
        AnnotationMap primary = new AnnotationMap();
        Annotation a = DummyAB.class.getAnnotation(AnnoA.class);
        primary.add(a);

        AnnotationMap secondary = new AnnotationMap();
        Annotation b = DummyAB.class.getAnnotation(AnnoB.class);
        secondary.add(b);

        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertSame(a, result.get(AnnoA.class));
        assertSame(b, result.get(AnnoB.class));
    }

    @Test
    public void testMergeBothNonEmptyWithOverlapPrimaryWins()
    {
        AnnotationMap primary = new AnnotationMap();
        Annotation primaryX = DummyValueX.class.getAnnotation(AnnoWithValue.class);
        primary.add(primaryX);

        AnnotationMap secondary = new AnnotationMap();
        Annotation secondaryY = DummyValueY.class.getAnnotation(AnnoWithValue.class);
        secondary.add(secondaryY);

        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertNotNull(result);
        assertEquals(1, result.size());
        // primary should override secondary for same annotation type
        AnnoWithValue merged = result.get(AnnoWithValue.class);
        assertNotNull(merged);
        assertEquals("x", merged.value());
    }

    @Test
    public void testMergeCreatesNewInstanceNotOriginalObjects()
    {
        AnnotationMap primary = new AnnotationMap();
        primary.add(DummyAB.class.getAnnotation(AnnoA.class));

        AnnotationMap secondary = new AnnotationMap();
        secondary.add(DummyAB.class.getAnnotation(AnnoB.class));

        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertNotSame(primary, result);
        assertNotSame(secondary, result);
    }
}