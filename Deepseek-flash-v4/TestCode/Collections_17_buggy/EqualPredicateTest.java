package org.apache.commons.collections.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class EqualPredicateTest {

    private static class TestEquator<T> implements Equator<T> {
        private final boolean result;
        
        TestEquator(boolean result) {
            this.result = result;
        }
        
        @Override
        public boolean equate(T o1, T o2) {
            return result;
        }
        
        @Override
        public int hash(T o) {
            return 0;
        }
    }

    private static class CustomType {
        private final String value;
        
        CustomType(String value) {
            this.value = value;
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            CustomType other = (CustomType) obj;
            return value == null ? other.value == null : value.equals(other.value);
        }
        
        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

    @Test
    public void testEqualPredicateFactoryWithNonNullObject() {
        String value = "test";
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate(value));
        assertEquals(value, ((EqualPredicate<String>) predicate).getValue());
    }

    @Test
    public void testEqualPredicateFactoryWithNullObject() {
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorAndNonNullObject() {
        String value = "test";
        Equator<String> equator = new TestEquator<String>(true);
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, equator);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate("anything"));
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorAndNullObject() {
        Equator<String> equator = new TestEquator<String>(true);
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, equator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
    }

    @Test
    public void testEvaluateEqualCase() {
        String value = "test";
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);
        assertTrue(predicate.evaluate("test"));
    }

    @Test
    public void testEvaluateNotEqualCase() {
        String value = "test";
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);
        assertFalse(predicate.evaluate("other"));
    }

    @Test
    public void testEvaluateNullInput() {
        String value = "test";
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEvaluateWithCustomEquatorTrue() {
        Equator<String> equator = new TestEquator<String>(true);
        EqualPredicate<String> predicate = new EqualPredicate<String>("value", equator);
        assertTrue(predicate.evaluate("anything"));
    }

    @Test
    public void testEvaluateWithCustomEquatorFalse() {
        Equator<String> equator = new TestEquator<String>(false);
        EqualPredicate<String> predicate = new EqualPredicate<String>("value", equator);
        assertFalse(predicate.evaluate("anything"));
    }

    @Test
    public void testEvaluateWithEqualObjectsAndDefaultEquator() {
        CustomType value = new CustomType("data");
        EqualPredicate<CustomType> predicate = new EqualPredicate<CustomType>(value);
        assertTrue(predicate.evaluate(new CustomType("data")));
    }

    @Test
    public void testEvaluateWithDifferentObjectsAndDefaultEquator() {
        CustomType value = new CustomType("data");
        EqualPredicate<CustomType> predicate = new EqualPredicate<CustomType>(value);
        assertFalse(predicate.evaluate(new CustomType("other")));
    }

    @Test
    public void testGetValue() {
        String value = "expected";
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);
        assertEquals(value, predicate.getValue());
    }

    @Test
    public void testConstructorWithEquator() {
        Equator<String> equator = new TestEquator<String>(true);
        EqualPredicate<String> predicate = new EqualPredicate<String>("value", equator);
        assertTrue(predicate.evaluate("anything"));
    }

    @Test
    public void testFactoryWithCustomEquatorInstanceOfEqualPredicate() {
        Equator<String> equator = new TestEquator<String>(true);
        Predicate<String> predicate = EqualPredicate.equalPredicate("value", equator);
        assertTrue(predicate instanceof EqualPredicate);
    }

    @Test
    public void testFactoryWithoutEquatorInstanceOfEqualPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate("value");
        assertTrue(predicate instanceof EqualPredicate);
    }

    @Test
    public void testEvaluateWithNullValueAndNonNullInput() {
        Equator<CustomType> equator = new TestEquator<CustomType>(true);
        EqualPredicate<CustomType> predicate = new EqualPredicate<CustomType>(null, equator);
        assertTrue(predicate.evaluate(new CustomType("value")));
    }

    @Test
    public void testEvaluateWithNonNullValueAndNullInput() {
        Equator<CustomType> equator = new TestEquator<CustomType>(true);
        EqualPredicate<CustomType> predicate = new EqualPredicate<CustomType>(new CustomType("value"), equator);
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testCustomEquatorReturnsFalse() {
        Equator<String> equator = new TestEquator<String>(false);
        EqualPredicate<String> predicate = new EqualPredicate<String>("value", equator);
        assertFalse(predicate.evaluate("value"));
    }
}