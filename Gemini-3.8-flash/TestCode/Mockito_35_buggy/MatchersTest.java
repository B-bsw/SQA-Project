package org.mockito;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

/**
 * Complete JUnit 4 Test Suite for {@link Matchers}.
 * Compatible with Java 1.4 / Java 7 environments.
 */
public class MatchersTest {

    private static class DummyMatcher<T> extends BaseMatcher<T> {
        private final boolean matchResult;

        public DummyMatcher(boolean matchResult) {
            this.matchResult = matchResult;
        }

        public boolean matches(Object item) {
            return this.matchResult;
        }

        public void describeTo(Description description) {
            description.appendText("dummy matcher");
        }
    }

    @Before
    public void setUp() {
        new ThreadSafeMockingProgress().resetOngoingStubbing();
    }

    @After
    public void tearDown() {
        new ThreadSafeMockingProgress().resetOngoingStubbing();
    }

    @Test
    public void constructor_shouldInstantiateSuccessfully() {
        // Arrange & Act
        Matchers matchers = new Matchers();

        // Assert
        Assert.assertNotNull(matchers);
    }

    @Test
    public void anyBoolean_shouldReturnFalse() {
        // Act
        boolean result = Matchers.anyBoolean();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void anyByte_shouldReturnZero() {
        // Act
        byte result = Matchers.anyByte();

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void anyChar_shouldReturnNullChar() {
        // Act
        char result = Matchers.anyChar();

        // Assert
        Assert.assertEquals('\u0000', result);
    }

    @Test
    public void anyInt_shouldReturnZero() {
        // Act
        int result = Matchers.anyInt();

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void anyLong_shouldReturnZero() {
        // Act
        long result = Matchers.anyLong();

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void anyFloat_shouldReturnZero() {
        // Act
        float result = Matchers.anyFloat();

        // Assert
        Assert.assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void anyDouble_shouldReturnZero() {
        // Act
        double result = Matchers.anyDouble();

        // Assert
        Assert.assertEquals(0.0d, result, 0.0d);
    }

    @Test
    public void anyShort_shouldReturnZero() {
        // Act
        short result = Matchers.anyShort();

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void anyObject_shouldReturnNull() {
        // Act
        Object result = Matchers.anyObject();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void anyVararg_shouldReturnNull() {
        // Act
        Object result = Matchers.anyVararg();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_givenClazz_shouldReturnNull() {
        // Act
        String result = Matchers.any(String.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_givenNullClazz_shouldReturnNull() {
        // Act
        Object result = Matchers.any((Class<Object>) null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_withoutArguments_shouldReturnNull() {
        // Act
        Object result = Matchers.any();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void anyString_shouldReturnEmptyString() {
        // Act
        String result = Matchers.anyString();

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void anyList_shouldReturnEmptyList() {
        // Act
        List result = Matchers.anyList();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyListOf_givenClass_shouldReturnEmptyList() {
        // Act
        List<String> result = Matchers.anyListOf(String.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyListOf_givenNullClass_shouldReturnEmptyList() {
        // Act
        List<Object> result = Matchers.anyListOf((Class<Object>) null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySet_shouldReturnEmptySet() {
        // Act
        Set result = Matchers.anySet();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySetOf_givenClass_shouldReturnEmptySet() {
        // Act
        Set<Integer> result = Matchers.anySetOf(Integer.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySetOf_givenNullClass_shouldReturnEmptySet() {
        // Act
        Set<Object> result = Matchers.anySetOf((Class<Object>) null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyMap_shouldReturnEmptyMap() {
        // Act
        Map result = Matchers.anyMap();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollection_shouldReturnEmptyCollection() {
        // Act
        Collection result = Matchers.anyCollection();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollectionOf_givenClass_shouldReturnEmptyCollection() {
        // Act
        Collection<Double> result = Matchers.anyCollectionOf(Double.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollectionOf_givenNullClass_shouldReturnEmptyCollection() {
        // Act
        Collection<Object> result = Matchers.anyCollectionOf((Class<Object>) null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void isA_givenClass_shouldReturnNull() {
        // Act
        String result = Matchers.isA(String.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void eq_givenBooleanTrue_shouldReturnFalse() {
        // Act
        boolean result = Matchers.eq(true);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void eq_givenBooleanFalse_shouldReturnFalse() {
        // Act
        boolean result = Matchers.eq(false);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void eq_givenByte_shouldReturnZero() {
        // Act
        byte result = Matchers.eq((byte) 42);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void eq_givenByteBoundaryMinAndMax_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals((byte) 0, Matchers.eq(Byte.MIN_VALUE));
        Assert.assertEquals((byte) 0, Matchers.eq(Byte.MAX_VALUE));
    }

    @Test
    public void eq_givenChar_shouldReturnNullChar() {
        // Act
        char result = Matchers.eq('A');

        // Assert
        Assert.assertEquals('\u0000', result);
    }

    @Test
    public void eq_givenCharBoundaryMinAndMax_shouldReturnNullChar() {
        // Act & Assert
        Assert.assertEquals('\u0000', Matchers.eq(Character.MIN_VALUE));
        Assert.assertEquals('\u0000', Matchers.eq(Character.MAX_VALUE));
    }

    @Test
    public void eq_givenDouble_shouldReturnZero() {
        // Act
        double result = Matchers.eq(3.14159d);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0d);
    }

    @Test
    public void eq_givenDoubleBoundaryMinMaxAndSpecial_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals(0.0d, Matchers.eq(Double.MIN_VALUE), 0.0d);
        Assert.assertEquals(0.0d, Matchers.eq(Double.MAX_VALUE), 0.0d);
        Assert.assertEquals(0.0d, Matchers.eq(Double.NaN), 0.0d);
        Assert.assertEquals(0.0d, Matchers.eq(Double.POSITIVE_INFINITY), 0.0d);
        Assert.assertEquals(0.0d, Matchers.eq(Double.NEGATIVE_INFINITY), 0.0d);
    }

    @Test
    public void eq_givenFloat_shouldReturnZero() {
        // Act
        float result = Matchers.eq(2.718f);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void eq_givenFloatBoundaryMinMaxAndSpecial_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals(0.0f, Matchers.eq(Float.MIN_VALUE), 0.0f);
        Assert.assertEquals(0.0f, Matchers.eq(Float.MAX_VALUE), 0.0f);
        Assert.assertEquals(0.0f, Matchers.eq(Float.NaN), 0.0f);
        Assert.assertEquals(0.0f, Matchers.eq(Float.POSITIVE_INFINITY), 0.0f);
        Assert.assertEquals(0.0f, Matchers.eq(Float.NEGATIVE_INFINITY), 0.0f);
    }

    @Test
    public void eq_givenInt_shouldReturnZero() {
        // Act
        int result = Matchers.eq(100);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void eq_givenIntBoundaryMinAndMax_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals(0, Matchers.eq(Integer.MIN_VALUE));
        Assert.assertEquals(0, Matchers.eq(Integer.MAX_VALUE));
    }

    @Test
    public void eq_givenLong_shouldReturnZero() {
        // Act
        long result = Matchers.eq(999999999L);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void eq_givenLongBoundaryMinAndMax_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals(0L, Matchers.eq(Long.MIN_VALUE));
        Assert.assertEquals(0L, Matchers.eq(Long.MAX_VALUE));
    }

    @Test
    public void eq_givenShort_shouldReturnZero() {
        // Act
        short result = Matchers.eq((short) 123);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void eq_givenShortBoundaryMinAndMax_shouldReturnZero() {
        // Act & Assert
        Assert.assertEquals((short) 0, Matchers.eq(Short.MIN_VALUE));
        Assert.assertEquals((short) 0, Matchers.eq(Short.MAX_VALUE));
    }

    @Test
    public void eq_givenObject_shouldReturnNull() {
        // Act
        String result = Matchers.eq("expectedString");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void eq_givenNullObject_shouldReturnNull() {
        // Act
        Object result = Matchers.eq((Object) null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenObjectAndNoExcludeFields_shouldReturnNull() {
        // Act
        String result = Matchers.refEq("referenceObject");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenObjectAndExcludeFields_shouldReturnNull() {
        // Act
        String result = Matchers.refEq("referenceObject", "field1", "field2");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenNullObject_shouldReturnNull() {
        // Act
        Object result = Matchers.refEq((Object) null, "anyField");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void same_givenObject_shouldReturnNull() {
        // Arrange
        String value = "sampleValue";

        // Act
        String result = Matchers.same(value);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void same_givenNull_shouldReturnNull() {
        // Act
        Object result = Matchers.same(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNull_shouldReturnNull() {
        // Act
        Object result = Matchers.isNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void notNull_shouldReturnNull() {
        // Act
        Object result = Matchers.notNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNotNull_shouldReturnNull() {
        // Act
        Object result = Matchers.isNotNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void contains_givenNonEmptySubstring_shouldReturnEmptyString() {
        // Act
        String result = Matchers.contains("sub");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void contains_givenEmptySubstring_shouldReturnEmptyString() {
        // Act
        String result = Matchers.contains("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void matches_givenRegex_shouldReturnEmptyString() {
        // Act
        String result = Matchers.matches("^[a-zA-Z0-9]+$");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void matches_givenEmptyRegex_shouldReturnEmptyString() {
        // Act
        String result = Matchers.matches("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void endsWith_givenSuffix_shouldReturnEmptyString() {
        // Act
        String result = Matchers.endsWith("suffix");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void endsWith_givenEmptySuffix_shouldReturnEmptyString() {
        // Act
        String result = Matchers.endsWith("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void startsWith_givenPrefix_shouldReturnEmptyString() {
        // Act
        String result = Matchers.startsWith("prefix");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void startsWith_givenEmptyPrefix_shouldReturnEmptyString() {
        // Act
        String result = Matchers.startsWith("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void argThat_givenCustomMatcher_shouldReturnNull() {
        // Arrange
        Matcher<String> matcher = new DummyMatcher<String>(true);

        // Act
        String result = Matchers.argThat(matcher);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void charThat_givenCustomMatcher_shouldReturnNullChar() {
        // Arrange
        Matcher<Character> matcher = new DummyMatcher<Character>(true);

        // Act
        char result = Matchers.charThat(matcher);

        // Assert
        Assert.assertEquals('\u0000', result);
    }

    @Test
    public void booleanThat_givenCustomMatcher_shouldReturnFalse() {
        // Arrange
        Matcher<Boolean> matcher = new DummyMatcher<Boolean>(true);

        // Act
        boolean result = Matchers.booleanThat(matcher);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void byteThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Byte> matcher = new DummyMatcher<Byte>(true);

        // Act
        byte result = Matchers.byteThat(matcher);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void shortThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Short> matcher = new DummyMatcher<Short>(true);

        // Act
        short result = Matchers.shortThat(matcher);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void intThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Integer> matcher = new DummyMatcher<Integer>(true);

        // Act
        int result = Matchers.intThat(matcher);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void longThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Long> matcher = new DummyMatcher<Long>(true);

        // Act
        long result = Matchers.longThat(matcher);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void floatThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Float> matcher = new DummyMatcher<Float>(true);

        // Act
        float result = Matchers.floatThat(matcher);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void doubleThat_givenCustomMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Double> matcher = new DummyMatcher<Double>(true);

        // Act
        double result = Matchers.doubleThat(matcher);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0d);
    }
}