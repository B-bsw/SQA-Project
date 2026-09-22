package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionUtilsTest {

    @Test
    public void union_givenTwoCollections_shouldReturnUnionWithMaxCardinality() {
        // Arrange
        List a = Arrays.asList(new String[] { "A", "A", "B", "C" });
        List b = Arrays.asList(new String[] { "A", "B", "B", "D" });

        // Act
        Collection result = CollectionUtils.union(a, b);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(6, result.size()); // A, A, B, B, C, D
        Assert.assertEquals(2, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(2, CollectionUtils.cardinality("B", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("C", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("D", result));
    }

    @Test
    public void intersection_givenTwoCollections_shouldReturnIntersection() {
        // Arrange
        List a = Arrays.asList(new String[] { "A", "A", "B", "C" });
        List b = Arrays.asList(new String[] { "A", "B", "B", "D" });

        // Act
        Collection result = CollectionUtils.intersection(a, b);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size()); // A, B
        Assert.assertEquals(1, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("B", result));
    }

    @Test
    public void disjunction_givenTwoCollections_shouldReturnSymmetricDifference() {
        // Arrange
        List a = Arrays.asList(new String[] { "A", "B" });
        List b = Arrays.asList(new String[] { "B", "C" });

        // Act
        Collection result = CollectionUtils.disjunction(a, b);

        // Assert
        Assert.assertEquals(2, result.size()); // A, C
        Assert.assertTrue(result.contains("A"));
        Assert.assertTrue(result.contains("C"));
        Assert.assertFalse(result.contains("B"));
    }

    @Test
    public void subtract_givenTwoCollections_shouldReturnDifference() {
        // Arrange
        List a = Arrays.asList(new String[] { "A", "B", "C" });
        List b = Arrays.asList(new String[] { "B" });

        // Act
        Collection result = CollectionUtils.subtract(a, b);

        // Assert
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("A"));
        Assert.assertTrue(result.contains("C"));
        Assert.assertFalse(result.contains("B"));
    }

    @Test
    public void containsAny_givenCommonElement_shouldReturnTrue() {
        // Arrange
        List a = Arrays.asList(new String[] { "X", "Y" });
        List b = Arrays.asList(new String[] { "Y", "Z" });

        // Act & Assert
        Assert.assertTrue(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void containsAny_givenDisjointCollections_shouldReturnFalse() {
        // Arrange
        List a = Arrays.asList(new String[] { "X", "Y" });
        List b = Arrays.asList(new String[] { "1", "2" });

        // Act & Assert
        Assert.assertFalse(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void isSubCollection_givenSubset_shouldReturnTrue() {
        // Arrange
        List sub = Arrays.asList(new String[] { "A", "B" });
        List full = Arrays.asList(new String[] { "A", "B", "C" });

        // Act & Assert
        Assert.assertTrue(CollectionUtils.isSubCollection(sub, full));
        Assert.assertFalse(CollectionUtils.isSubCollection(full, sub));
    }

    @Test
    public void isEqualCollection_givenPermutations_shouldReturnTrue() {
        // Arrange
        List a = Arrays.asList(new String[] { "1", "2", "3" });
        List b = Arrays.asList(new String[] { "3", "1", "2" });

        // Act & Assert
        Assert.assertTrue(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void isEmpty_and_isNotEmpty_givenCollections_shouldIdentifyCorrectly() {
        // Arrange & Act & Assert
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertTrue(CollectionUtils.isEmpty(Collections.EMPTY_LIST));
        Assert.assertFalse(CollectionUtils.isEmpty(Arrays.asList(new String[] { "item" })));

        Assert.assertFalse(CollectionUtils.isNotEmpty(null));
        Assert.assertFalse(CollectionUtils.isNotEmpty(Collections.EMPTY_LIST));
        Assert.assertTrue(CollectionUtils.isNotEmpty(Arrays.asList(new String[] { "item" })));
    }

    @Test
    public void addIgnoreNull_givenNull_shouldNotAdd() {
        // Arrange
        List list = new ArrayList();

        // Act
        boolean added = CollectionUtils.addIgnoreNull(list, null);

        // Assert
        Assert.assertFalse(added);
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void addIgnoreNull_givenNonNull_shouldAdd() {
        // Arrange
        List list = new ArrayList();

        // Act
        boolean added = CollectionUtils.addIgnoreNull(list, "hello");

        // Assert
        Assert.assertTrue(added);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("hello", list.get(0));
    }
}
