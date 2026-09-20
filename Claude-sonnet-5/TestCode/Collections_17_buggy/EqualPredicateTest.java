package org.apache.commons.collections.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.commons.collections.Predicate;
import org.junit.Test;

public class EqualPredicateTest {

    @Test
    public void testEqualPredicateFactoryNormal() {
        Predicate<String> predicate = EqualPredicate.equalPredicate("test");
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
    }

    @Test
    public void testEqualPredicateFactoryNull() {
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertNotNull(predicate);
        // should be a NullPredicate, evaluates true only for null input
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("something"));
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorNormal() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate("test", equator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertTrue(predicate.evaluate("test"));
    }

    @Test
    public void testEqualPredicateFactoryWithEquatorNullObject() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, equator);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("something"));
    }

    @Test
    public void testConstructorSingleArgEvaluateTrue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("hello");
        assertTrue(predicate.evaluate("hello"));
    }

    @Test
    public void testConstructorSingleArgEvaluateFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("hello");
        assertFalse(predicate.evaluate("world"));
    }

    @Test
    public void testConstructorSingleArgWithNullValueAndNullInput() {
        // DefaultEquator does not handle null-null by returning true necessarily,
        // but per class javadoc, DefaultEquator returns true if references equal,
        // so null == null should be true.
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testConstructorSingleArgWithNullValueAndNonNullInput() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertFalse(predicate.evaluate("notNull"));
    }

    @Test
    public void testConstructorWithEquatorEvaluateTrue() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc", equator);
        assertTrue(predicate.evaluate("abc"));
    }

    @Test
    public void testConstructorWithEquatorEvaluateFalse() {
        Equator<String> equator = new DefaultEquator<String>();
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc", equator);
        assertFalse(predicate.evaluate("xyz"));
    }

    @Test
    public void testConstructorWithCustomEquatorAlwaysTrue() {
        Equator<String> alwaysTrueEquator = new Equator<String>() {
            public boolean equate(String o1, String o2) {
                return true;
            }
            public int hash(String o) {
                return 0;
            }
        };
        EqualPredicate<String> predicate = new EqualPredicate<String>("anything", alwaysTrueEquator);
        assertTrue(predicate.evaluate("differentValue"));
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testConstructorWithCustomEquatorAlwaysFalse() {
        Equator<String> alwaysFalseEquator = new Equator<String>() {
            public boolean equate(String o1, String o2) {
                return false;
            }
            public int hash(String o) {
                return 0;
            }
        };
        EqualPredicate<String> predicate = new EqualPredicate<String>("anything", alwaysFalseEquator);
        assertFalse(predicate.evaluate("anything"));
    }

    @Test
    public void testGetValueReturnsStoredValue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("storedValue");
        assertEquals("storedValue", predicate.getValue());
    }

    @Test
    public void testGetValueReturnsNull() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertEquals(null, predicate.getValue());
    }

    @Test
    public void testEvaluateWithEmptyStringValue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("");
        assertTrue(predicate.evaluate(""));
        assertFalse(predicate.evaluate("nonEmpty"));
    }

    @Test
    public void testEvaluateWithSameReferenceObject() {
        Object obj = new Object();
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(obj);
        assertTrue(predicate.evaluate(obj));
    }

    @Test
    public void testEvaluateWithDifferentButEqualObjects() {
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(100);
        assertTrue(predicate.evaluate(100));
    }

    @Test
    public void testEvaluateWithDifferentUnequalObjects() {
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(100);
        assertFalse(predicate.evaluate(200));
    }
}