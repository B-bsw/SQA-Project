package org.apache.commons.collections.functors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.apache.commons.collections.Predicate;
import org.junit.Assert;
import org.junit.Test;

/**
 * Complete Unit Test Suite for {@link EqualPredicate}.
 */
public class EqualPredicateTest {

    private static class CaseInsensitiveEquator implements Equator<String>, Serializable {
        private static final long serialVersionUID = 1L;

        public boolean equate(String o1, String o2) {
            if (o1 == null) {
                return o2 == null;
            }
            return o1.equalsIgnoreCase(o2);
        }

        public int hash(String o) {
            return (o == null) ? 0 : o.toLowerCase().hashCode();
        }
    }

    private static class AlwaysFalseEquator<T> implements Equator<T>, Serializable {
        private static final long serialVersionUID = 1L;

        public boolean equate(T o1, T o2) {
            return false;
        }

        public int hash(T o) {
            return 0;
        }
    }

    @Test
    public void equalPredicate1_givenNullObject_shouldReturnNullPredicate() {
        // Arrange
        String value = null;

        // Act
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);

        // Assert
        Assert.assertNotNull(predicate);
        Assert.assertSame(NullPredicate.nullPredicate(), predicate);
        Assert.assertTrue(predicate.evaluate(null));
        Assert.assertFalse(predicate.evaluate("nonNull"));
    }

    @Test
    public void equalPredicate1_givenNonNullObject_shouldReturnEqualPredicateInstance() {
        // Arrange
        String value = "testString";

        // Act
        Predicate<String> predicate = EqualPredicate.equalPredicate(value);

        // Assert
        Assert.assertNotNull(predicate);
        Assert.assertTrue(predicate instanceof EqualPredicate);
        EqualPredicate<String> equalPredicate = (EqualPredicate<String>) predicate;
        Assert.assertEquals(value, equalPredicate.getValue());
    }

    @Test
    public void equalPredicate2_givenNullObjectAndValidEquator_shouldReturnNullPredicate() {
        // Arrange
        String value = null;
        Equator<String> equator = new CaseInsensitiveEquator();

        // Act
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, equator);

        // Assert
        Assert.assertNotNull(predicate);
        Assert.assertSame(NullPredicate.nullPredicate(), predicate);
        Assert.assertTrue(predicate.evaluate(null));
        Assert.assertFalse(predicate.evaluate("nonNull"));
    }

    @Test
    public void equalPredicate2_givenNullObjectAndNullEquator_shouldReturnNullPredicate() {
        // Arrange
        String value = null;
        Equator<String> equator = null;

        // Act
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, equator);

        // Assert
        Assert.assertNotNull(predicate);
        Assert.assertSame(NullPredicate.nullPredicate(), predicate);
    }

    @Test
    public void equalPredicate2_givenNonNullObjectAndEquator_shouldReturnEqualPredicateInstance() {
        // Arrange
        String value = "HELLO";
        Equator<String> equator = new CaseInsensitiveEquator();

        // Act
        Predicate<String> predicate = EqualPredicate.equalPredicate(value, equator);

        // Assert
        Assert.assertNotNull(predicate);
        Assert.assertTrue(predicate instanceof EqualPredicate);
        EqualPredicate<String> equalPredicate = (EqualPredicate<String>) predicate;
        Assert.assertEquals(value, equalPredicate.getValue());
        Assert.assertTrue(equalPredicate.evaluate("hello"));
    }

    @Test
    public void constructor1_givenNonNullObject_shouldUseDefaultEquator() {
        // Arrange
        Integer target = new Integer(100);

        // Act
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(target);

        // Assert
        Assert.assertEquals(target, predicate.getValue());
        Assert.assertTrue(predicate.evaluate(new Integer(100)));
        Assert.assertFalse(predicate.evaluate(new Integer(200)));
    }

    @Test
    public void constructor1_givenNullObject_shouldRetainNullValueAndEvaluateNullTrue() {
        // Arrange
        String target = null;

        // Act
        EqualPredicate<String> predicate = new EqualPredicate<String>(target);

        // Assert
        Assert.assertNull(predicate.getValue());
        Assert.assertTrue(predicate.evaluate(null));
        Assert.assertFalse(predicate.evaluate("notNull"));
    }

    @Test
    public void constructor2_givenCustomEquator_shouldUseCustomEquatorLogic() {
        // Arrange
        String target = "WORLD";
        Equator<String> equator = new CaseInsensitiveEquator();

        // Act
        EqualPredicate<String> predicate = new EqualPredicate<String>(target, equator);

        // Assert
        Assert.assertEquals(target, predicate.getValue());
        Assert.assertTrue(predicate.evaluate("world"));
        Assert.assertFalse(predicate.evaluate("universe"));
    }

    @Test
    public void evaluate_givenIdenticalReference_shouldReturnTrue() {
        // Arrange
        String value = new String("sample");
        EqualPredicate<String> predicate = new EqualPredicate<String>(value);

        // Act
        boolean result = predicate.evaluate(value);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_givenEqualContentDifferentReference_shouldReturnTrue() {
        // Arrange
        String value1 = new String("sample");
        String value2 = new String("sample");
        EqualPredicate<String> predicate = new EqualPredicate<String>(value1);

        // Act
        boolean result = predicate.evaluate(value2);

        // Assert
        Assert.assertNotSame(value1, value2);
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_givenDifferentContent_shouldReturnFalse() {
        // Arrange
        String value1 = "apple";
        String value2 = "banana";
        EqualPredicate<String> predicate = new EqualPredicate<String>(value1);

        // Act
        boolean result = predicate.evaluate(value2);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void evaluate_givenNullInputWhenValueIsNonNull_shouldReturnFalse() {
        // Arrange
        EqualPredicate<String> predicate = new EqualPredicate<String>("constant");

        // Act
        boolean result = predicate.evaluate(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void evaluate_givenNonNullInputWhenValueIsNull_shouldReturnFalse() {
        // Arrange
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);

        // Act
        boolean result = predicate.evaluate("input");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void evaluate_givenNullInputWhenValueIsNull_shouldReturnTrue() {
        // Arrange
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);

        // Act
        boolean result = predicate.evaluate(null);

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void evaluate_givenEmptyString_shouldEvaluateCorrectly() {
        // Arrange
        EqualPredicate<String> predicate = new EqualPredicate<String>("");

        // Act & Assert
        Assert.assertTrue(predicate.evaluate(""));
        Assert.assertFalse(predicate.evaluate("a"));
        Assert.assertFalse(predicate.evaluate(null));
    }

    @Test
    public void evaluate_givenAlwaysFalseEquator_shouldReturnFalseEvenForIdenticalObject() {
        // Arrange
        String value = "unchanging";
        Equator<String> equator = new AlwaysFalseEquator<String>();
        EqualPredicate<String> predicate = new EqualPredicate<String>(value, equator);

        // Act
        boolean result = predicate.evaluate(value);

        // Assert
        Assert.assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void evaluate_givenNullEquator_shouldThrowNullPointerException() {
        // Arrange
        Equator<String> nullEquator = null;
        EqualPredicate<String> predicate = new EqualPredicate<String>("item", nullEquator);

        // Act
        predicate.evaluate("item");
    }

    @Test
    public void getValue_givenNonNullValue_shouldReturnSameObject() {
        // Arrange
        Object obj = new Object();
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(obj);

        // Act
        Object retrieved = predicate.getValue();

        // Assert
        Assert.assertSame(obj, retrieved);
    }

    @Test
    public void getValue_givenNullValue_shouldReturnNull() {
        // Arrange
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(null);

        // Act
        Object retrieved = predicate.getValue();

        // Assert
        Assert.assertNull(retrieved);
    }

    @Test
    public void serialization_givenEqualPredicateWithDefaultEquator_shouldRoundTrip() throws Exception {
        // Arrange
        String data = "serializablePayload";
        EqualPredicate<String> original = new EqualPredicate<String>(data);

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof EqualPredicate);
        @SuppressWarnings("unchecked")
        EqualPredicate<String> result = (EqualPredicate<String>) deserialized;
        Assert.assertEquals(original.getValue(), result.getValue());
        Assert.assertTrue(result.evaluate(data));
        Assert.assertFalse(result.evaluate("different"));
    }

    @Test
    public void serialization_givenEqualPredicateWithCustomSerializableEquator_shouldRoundTrip() throws Exception {
        // Arrange
        String data = "CaseInsensitive";
        EqualPredicate<String> original = new EqualPredicate<String>(data, new CaseInsensitiveEquator());

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotNull(deserialized);
        Assert.assertTrue(deserialized instanceof EqualPredicate);
        @SuppressWarnings("unchecked")
        EqualPredicate<String> result = (EqualPredicate<String>) deserialized;
        Assert.assertEquals(original.getValue(), result.getValue());
        Assert.assertTrue(result.evaluate("caseinsensitive"));
        Assert.assertFalse(result.evaluate("other"));
    }
}