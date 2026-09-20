package com.fasterxml.jackson.databind.introspect;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

public class AnnotationMapTest {

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnn1 {
        String value() default "1";
    }

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnn2 {
        int value() default 2;
    }

    @Retention(RetentionPolicy.RUNTIME)
    private @interface TestAnn3 {
        boolean value() default true;
    }

    @TestAnn1("A")
    @TestAnn2(10)
    private static class SampleA {}

    @TestAnn1("B")
    private static class SampleB {}

    @TestAnn3(false)
    private static class SampleC {}

    private static final TestAnn1 ANN_1A = SampleA.class.getAnnotation(TestAnn1.class);
    private static final TestAnn1 ANN_1B = SampleB.class.getAnnotation(TestAnn1.class);
    private static final TestAnn2 ANN_2 = SampleA.class.getAnnotation(TestAnn2.class);
    private static final TestAnn3 ANN_3 = SampleC.class.getAnnotation(TestAnn3.class);

    @Test
    public void constructor_default_shouldInitializeWithZeroSize() {
        // Arrange & Act
        AnnotationMap map = new AnnotationMap();

        // Assert
        Assert.assertEquals(0, map.size());
        Assert.assertNull(map._annotations);
    }

    @Test
    public void get_whenAnnotationsNull_shouldReturnNull() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        TestAnn1 result = map.get(TestAnn1.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void get_whenAnnotationPresent_shouldReturnAnnotation() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        TestAnn1 result = map.get(TestAnn1.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("A", result.value());
    }

    @Test
    public void get_whenAnnotationNotPresent_shouldReturnNull() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        TestAnn2 result = map.get(TestAnn2.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void annotations_whenAnnotationsNull_shouldReturnEmptyIterable() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        Iterable<Annotation> iterable = map.annotations();

        // Assert
        Assert.assertNotNull(iterable);
        Assert.assertFalse(iterable.iterator().hasNext());
    }

    @Test
    public void annotations_whenAnnotationsEmpty_shouldReturnEmptyIterable() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map._annotations = new java.util.HashMap<Class<? extends Annotation>, Annotation>();

        // Act
        Iterable<Annotation> iterable = map.annotations();

        // Assert
        Assert.assertNotNull(iterable);
        Assert.assertFalse(iterable.iterator().hasNext());
    }

    @Test
    public void annotations_whenAnnotationsExist_shouldReturnValues() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);
        map.add(ANN_2);

        // Act
        Iterable<Annotation> iterable = map.annotations();

        // Assert
        Assert.assertNotNull(iterable);
        int count = 0;
        for (Annotation ann : iterable) {
            count++;
            Assert.assertNotNull(ann);
        }
        Assert.assertEquals(2, count);
    }

    @Test
    public void size_whenAnnotationsNull_shouldReturnZero() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        int size = map.size();

        // Assert
        Assert.assertEquals(0, size);
    }

    @Test
    public void size_whenAnnotationsExist_shouldReturnCount() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);
        map.add(ANN_2);

        // Act
        int size = map.size();

        // Assert
        Assert.assertEquals(2, size);
    }

    @Test
    public void addIfNotPresent_whenAnnotationsNull_shouldAddAndReturnTrue() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        boolean added = map.addIfNotPresent(ANN_1A);

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals(ANN_1A, map.get(TestAnn1.class));
    }

    @Test
    public void addIfNotPresent_whenAnnotationNotPresent_shouldAddAndReturnTrue() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        boolean added = map.addIfNotPresent(ANN_2);

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(2, map.size());
        Assert.assertEquals(ANN_2, map.get(TestAnn2.class));
    }

    @Test
    public void addIfNotPresent_whenAnnotationAlreadyPresent_shouldNotAddAndReturnFalse() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        boolean added = map.addIfNotPresent(ANN_1B);

        // Assert
        Assert.assertFalse(added);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("A", map.get(TestAnn1.class).value());
    }

    @Test
    public void add_whenFirstTime_shouldReturnFalse() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        boolean changed = map.add(ANN_1A);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void add_whenSameAnnotationReplaced_shouldReturnTrue() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        boolean changed = map.add(ANN_1A);

        // Assert
        Assert.assertTrue(changed);
        Assert.assertEquals(1, map.size());
    }

    @Test
    public void add_whenDifferentAnnotationSameTypeReplaced_shouldReturnFalse() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        boolean changed = map.add(ANN_1B);

        // Assert
        Assert.assertFalse(changed);
        Assert.assertEquals(1, map.size());
        Assert.assertEquals("B", map.get(TestAnn1.class).value());
    }

    @Test
    public void merge_whenPrimaryNull_shouldReturnSecondary() {
        // Arrange
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ANN_1A);

        // Act
        AnnotationMap result = AnnotationMap.merge(null, secondary);

        // Assert
        Assert.assertSame(secondary, result);
    }

    @Test
    public void merge_whenPrimaryAnnotationsNull_shouldReturnSecondary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ANN_1A);

        // Act
        AnnotationMap result = AnnotationMap.merge(primary, secondary);

        // Assert
        Assert.assertSame(secondary, result);
    }

    @Test
    public void merge_whenPrimaryAnnotationsEmpty_shouldReturnSecondary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        primary._annotations = new java.util.HashMap<Class<? extends Annotation>, Annotation>();
        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ANN_1A);

        // Act
        AnnotationMap result = AnnotationMap.merge(primary, secondary);

        // Assert
        Assert.assertSame(secondary, result);
    }

    @Test
    public void merge_whenSecondaryNull_shouldReturnPrimary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        primary.add(ANN_1A);

        // Act
        AnnotationMap result = AnnotationMap.merge(primary, null);

        // Assert
        Assert.assertSame(primary, result);
    }

    @Test
    public void merge_whenSecondaryAnnotationsNull_shouldReturnPrimary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        primary.add(ANN_1A);
        AnnotationMap secondary = new AnnotationMap();

        // Act
        AnnotationMap result = AnnotationMap.merge(primary, secondary);

        // Assert
        Assert.assertSame(primary, result);
    }

    @Test
    public void merge_whenSecondaryAnnotationsEmpty_shouldReturnPrimary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        primary.add(ANN_1A);
        AnnotationMap secondary = new AnnotationMap();
        secondary._annotations = new java.util.HashMap<Class<? extends Annotation>, Annotation>();

        // Act
        AnnotationMap result = AnnotationMap.merge(primary, secondary);

        // Assert
        Assert.assertSame(primary, result);
    }

    @Test
    public void merge_whenBothHaveAnnotations_shouldMergeWithPrimaryOverridingSecondary() {
        // Arrange
        AnnotationMap primary = new AnnotationMap();
        primary.add(ANN_1A);
        primary.add(ANN_2);

        AnnotationMap secondary = new AnnotationMap();
        secondary.add(ANN_1B);
        secondary.add(ANN_3);

        // Act
        AnnotationMap merged = AnnotationMap.merge(primary, secondary);

        // Assert
        Assert.assertNotNull(merged);
        Assert.assertNotSame(primary, merged);
        Assert.assertNotSame(secondary, merged);
        Assert.assertEquals(3, merged.size());
        Assert.assertEquals("A", merged.get(TestAnn1.class).value());
        Assert.assertEquals(10, merged.get(TestAnn2.class).value());
        Assert.assertFalse(merged.get(TestAnn3.class).value());
    }

    @Test
    public void toString_whenAnnotationsNull_shouldReturnLiteralNullInBrackets() {
        // Arrange
        AnnotationMap map = new AnnotationMap();

        // Act
        String result = map.toString();

        // Assert
        Assert.assertEquals("[null]", result);
    }

    @Test
    public void toString_whenAnnotationsExist_shouldReturnHashMapToString() {
        // Arrange
        AnnotationMap map = new AnnotationMap();
        map.add(ANN_1A);

        // Act
        String result = map.toString();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains(ANN_1A.toString()));
    }
}