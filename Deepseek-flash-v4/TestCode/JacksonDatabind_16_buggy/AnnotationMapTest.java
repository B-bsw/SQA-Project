package com.fasterxml.jackson.databind.introspect;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.annotation.*;
import java.util.*;

public class AnnotationMapTest {

    @Test
    public void testGetNullAnnotations() {
        AnnotationMap map = new AnnotationMap();
        assertNull(map.get(Deprecated.class));
    }

    @Test
    public void testGetExistingAnnotation() {
        AnnotationMap map = new AnnotationMap();
        Deprecated dep = createDeprecated();
        map.add(dep);
        assertSame(dep, map.get(Deprecated.class));
    }

    @Test
    public void testGetNonExistentAnnotation() {
        AnnotationMap map = new AnnotationMap();
        map.add(createDeprecated());
        assertNull(map.get(SuppressWarnings.class));
    }

    @Test
    public void testAnnotationsEmpty() {
        AnnotationMap map = new AnnotationMap();
        assertFalse(map.annotations().iterator().hasNext());
    }

    @Test
    public void testAnnotationsSingle() {
        AnnotationMap map = new AnnotationMap();
        Deprecated dep = createDeprecated();
        map.add(dep);
        Iterator<Annotation> it = map.annotations().iterator();
        assertTrue(it.hasNext());
        assertSame(dep, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAnnotationsMultiple() {
        AnnotationMap map = new AnnotationMap();
        Deprecated dep = createDeprecated();
        SuppressWarnings sw = createSuppressWarnings();
        map.add(dep);
        map.add(sw);
        int count = 0;
        for (Annotation ann : map.annotations()) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testMergeBothNull() {
        assertNull(AnnotationMap.merge(null, null));
    }

    @Test
    public void testMergePrimaryNullSecondaryNotNull() {
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(createDeprecated());
        AnnotationMap result = AnnotationMap.merge(null, secondary);
        assertEquals(secondary.size(), result.size());
    }

    @Test
    public void testMergePrimaryNotNullSecondaryNull() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(createDeprecated());
        AnnotationMap result = AnnotationMap.merge(primary, null);
        assertEquals(primary.size(), result.size());
    }

    @Test
    public void testMergeBothNotNullNoOverlap() {
        AnnotationMap primary = new AnnotationMap();
        primary.add(createDeprecated());
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(createSuppressWarnings());
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertEquals(2, result.size());
    }

    @Test
    public void testMergeBothNotNullOverlapPrefersPrimary() {
        AnnotationMap primary = new AnnotationMap();
        Deprecated primaryDep = createDeprecated();
        primary.add(primaryDep);
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(createDeprecated());
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertEquals(1, result.size());
        assertSame(primaryDep, result.get(Deprecated.class));
    }

    @Test
    public void testSizeNull() {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testSizeAfterAdd() {
        AnnotationMap map = new AnnotationMap();
        map.add(createDeprecated());
        assertEquals(1, map.size());
    }

    @Test
    public void testAddIfNotPresentFirstTime() {
        AnnotationMap map = new AnnotationMap();
        assertTrue(map.addIfNotPresent(createDeprecated()));
        assertEquals(1, map.size());
    }

    @Test
    public void testAddIfNotPresentAlreadyThere() {
        AnnotationMap map = new AnnotationMap();
        map.add(createDeprecated());
        assertFalse(map.addIfNotPresent(createDeprecated()));
        assertEquals(1, map.size());
    }

    @Test
    public void testAddNew() {
        AnnotationMap map = new AnnotationMap();
        assertTrue(map.add(createDeprecated()));
        assertEquals(1, map.size());
    }

    @Test
    public void testAddOverwrite() {
        AnnotationMap map = new AnnotationMap();
        map.add(createDeprecated());
        Deprecated newDep = createDeprecated();
        assertFalse(map.add(newDep));
        assertEquals(1, map.size());
        assertSame(newDep, map.get(Deprecated.class));
    }

    @Test
    public void testToStringNull() {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }

    @Test
    public void testToStringNotNull() {
        AnnotationMap map = new AnnotationMap();
        map.add(createDeprecated());
        assertTrue(map.toString().contains("java.lang.Deprecated"));
    }

    @Test
    public void testAddIfNotPresentMultipleDifferentTypes() {
        AnnotationMap map = new AnnotationMap();
        map.addIfNotPresent(createDeprecated());
        assertTrue(map.addIfNotPresent(createSuppressWarnings()));
        assertEquals(2, map.size());
    }

    @Test
    public void testMergePrimaryEmptySecondaryNonEmpty() {
        AnnotationMap primary = new AnnotationMap();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(createDeprecated());
        AnnotationMap result = AnnotationMap.merge(primary, secondary);
        assertEquals(1, result.size());
        assertNotNull(result.get(Deprecated.class));
    }

    @Test
    public void testAnnotationsPreservesOrder() {
        AnnotationMap map = new AnnotationMap();
        Deprecated dep = createDeprecated();
        SuppressWarnings sw = createSuppressWarnings();
        map.add(dep);
        map.add(sw);
        List<Annotation> list = new ArrayList<Annotation>();
        for (Annotation ann : map.annotations()) {
            list.add(ann);
        }
        assertEquals(2, list.size());
        assertTrue(list.get(0) instanceof Deprecated);
        assertTrue(list.get(1) instanceof SuppressWarnings);
    }

    private Deprecated createDeprecated() {
        return new Deprecated() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return Deprecated.class;
            }
        };
    }

    private SuppressWarnings createSuppressWarnings() {
        return new SuppressWarnings() {
            @Override
            public String[] value() { return new String[]{}; }
            @Override
            public Class<? extends Annotation> annotationType() {
                return SuppressWarnings.class;
            }
        };
    }
}