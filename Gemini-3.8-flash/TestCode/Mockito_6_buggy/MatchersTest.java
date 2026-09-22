package org.mockito;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.progress.ThreadSafeMockingProgress;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MatchersTest {

    private static class DummyMatcher<T> extends BaseMatcher<T> {
        public boolean matches(Object item) {
            return true;
        }

        public void describeTo(Description description) {
            description.appendText("dummy matcher");
        }
    }

    @Before
    public void setUp() {
        new ThreadSafeMockingProgress().getArgumentMatcherStorage().pullLocalizedMatchers();
    }

    @After
    public void tearDown() {
        new ThreadSafeMockingProgress().getArgumentMatcherStorage().pullLocalizedMatchers();
    }

    @Test
    public void constructor_whenInstantiated_shouldCreateInstance() {
        // Arrange & Act
        Matchers matchers = new Matchers();

        // Assert
        Assert.assertNotNull(matchers);
    }

    @Test
    public void anyBoolean_shouldReturnFalse() {
        // Arrange & Act
        boolean result = Matchers.anyBoolean();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void anyByte_shouldReturnZero() {
        // Arrange & Act
        byte result = Matchers.anyByte();

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void anyChar_shouldReturnZeroChar() {
        // Arrange & Act
        char result = Matchers.anyChar();

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void anyInt_shouldReturnZero() {
        // Arrange & Act
        int result = Matchers.anyInt();

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void anyLong_shouldReturnZero() {
        // Arrange & Act
        long result = Matchers.anyLong();

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void anyFloat_shouldReturnZero() {
        // Arrange & Act
        float result = Matchers.anyFloat();

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void anyDouble_shouldReturnZero() {
        // Arrange & Act
        double result = Matchers.anyDouble();

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }

    @Test
    public void anyShort_shouldReturnZero() {
        // Arrange & Act
        short result = Matchers.anyShort();

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void anyObject_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.anyObject();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void anyVararg_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.anyVararg();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_givenObjectClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.any(Object.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_givenStringClass_shouldReturnEmptyStringOrNull() {
        // Arrange & Act
        String result = Matchers.any(String.class);

        // Assert
        Assert.assertTrue(result == null || "".equals(result));
    }

    @Test
    public void any_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.any(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void any_noArg_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.any();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void anyString_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.anyString();

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void anyList_shouldReturnEmptyList() {
        // Arrange & Act
        List result = Matchers.anyList();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyListOf_givenClass_shouldReturnEmptyList() {
        // Arrange & Act
        List<String> result = Matchers.anyListOf(String.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyListOf_givenNullClass_shouldReturnEmptyList() {
        // Arrange & Act
        List<Object> result = Matchers.anyListOf(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySet_shouldReturnEmptySet() {
        // Arrange & Act
        Set result = Matchers.anySet();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySetOf_givenClass_shouldReturnEmptySet() {
        // Arrange & Act
        Set<String> result = Matchers.anySetOf(String.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anySetOf_givenNullClass_shouldReturnEmptySet() {
        // Arrange & Act
        Set<Object> result = Matchers.anySetOf(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyMap_shouldReturnEmptyMap() {
        // Arrange & Act
        Map result = Matchers.anyMap();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyMapOf_givenClasses_shouldReturnEmptyMap() {
        // Arrange & Act
        Map<String, Integer> result = Matchers.anyMapOf(String.class, Integer.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyMapOf_givenNullClasses_shouldReturnEmptyMap() {
        // Arrange & Act
        Map<Object, Object> result = Matchers.anyMapOf(null, null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollection_shouldReturnEmptyCollection() {
        // Arrange & Act
        Collection result = Matchers.anyCollection();

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollectionOf_givenClass_shouldReturnEmptyCollection() {
        // Arrange & Act
        Collection<String> result = Matchers.anyCollectionOf(String.class);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void anyCollectionOf_givenNullClass_shouldReturnEmptyCollection() {
        // Arrange & Act
        Collection<Object> result = Matchers.anyCollectionOf(null);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void isA_givenClass_shouldReturnNullOrInstance() {
        // Arrange & Act
        String result = Matchers.isA(String.class);

        // Assert
        Assert.assertTrue(result == null || "".equals(result));
    }

    @Test
    public void isA_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.isA(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void eq_givenBooleanTrue_shouldReturnFalse() {
        // Arrange & Act
        boolean result = Matchers.eq(true);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void eq_givenBooleanFalse_shouldReturnFalse() {
        // Arrange & Act
        boolean result = Matchers.eq(false);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void eq_givenByte_shouldReturnZero() {
        // Arrange & Act
        byte result = Matchers.eq((byte) 42);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void eq_givenByteBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        byte result = Matchers.eq(Byte.MIN_VALUE);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void eq_givenByteBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        byte result = Matchers.eq(Byte.MAX_VALUE);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void eq_givenChar_shouldReturnZeroChar() {
        // Arrange & Act
        char result = Matchers.eq('Z');

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void eq_givenCharBoundaryMin_shouldReturnZeroChar() {
        // Arrange & Act
        char result = Matchers.eq(Character.MIN_VALUE);

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void eq_givenCharBoundaryMax_shouldReturnZeroChar() {
        // Arrange & Act
        char result = Matchers.eq(Character.MAX_VALUE);

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void eq_givenDouble_shouldReturnZero() {
        // Arrange & Act
        double result = Matchers.eq(3.14159d);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }

    @Test
    public void eq_givenDoubleBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        double result = Matchers.eq(Double.MIN_VALUE);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }

    @Test
    public void eq_givenDoubleBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        double result = Matchers.eq(Double.MAX_VALUE);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }

    @Test
    public void eq_givenFloat_shouldReturnZero() {
        // Arrange & Act
        float result = Matchers.eq(2.718f);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void eq_givenFloatBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        float result = Matchers.eq(Float.MIN_VALUE);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void eq_givenFloatBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        float result = Matchers.eq(Float.MAX_VALUE);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void eq_givenInt_shouldReturnZero() {
        // Arrange & Act
        int result = Matchers.eq(100);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void eq_givenIntBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        int result = Matchers.eq(Integer.MIN_VALUE);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void eq_givenIntBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        int result = Matchers.eq(Integer.MAX_VALUE);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void eq_givenLong_shouldReturnZero() {
        // Arrange & Act
        long result = Matchers.eq(999999999L);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void eq_givenLongBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        long result = Matchers.eq(Long.MIN_VALUE);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void eq_givenLongBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        long result = Matchers.eq(Long.MAX_VALUE);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void eq_givenShort_shouldReturnZero() {
        // Arrange & Act
        short result = Matchers.eq((short) 12);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void eq_givenShortBoundaryMin_shouldReturnZero() {
        // Arrange & Act
        short result = Matchers.eq(Short.MIN_VALUE);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void eq_givenShortBoundaryMax_shouldReturnZero() {
        // Arrange & Act
        short result = Matchers.eq(Short.MAX_VALUE);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void eq_givenObject_shouldReturnDefaultOrNull() {
        // Arrange
        String value = "mockito";

        // Act
        String result = Matchers.eq(value);

        // Assert
        Assert.assertTrue(result == null || "".equals(result));
    }

    @Test
    public void eq_givenNullObject_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.eq((Object) null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenObjectWithoutExcludeFields_shouldReturnNull() {
        // Arrange
        String value = "reflectionTest";

        // Act
        String result = Matchers.refEq(value);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenObjectWithExcludeFields_shouldReturnNull() {
        // Arrange
        String value = "reflectionTest";

        // Act
        String result = Matchers.refEq(value, "fieldA", "fieldB");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void refEq_givenNullObject_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.refEq(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void same_givenObject_shouldReturnDefaultOrNull() {
        // Arrange
        String value = "sameInstance";

        // Act
        String result = Matchers.same(value);

        // Assert
        Assert.assertTrue(result == null || "".equals(result));
    }

    @Test
    public void same_givenNullObject_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.same((Object) null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNull_noArg_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.isNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNull_givenClass_shouldReturnNull() {
        // Arrange & Act
        String result = Matchers.isNull(String.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNull_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.isNull(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void notNull_noArg_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.notNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void notNull_givenClass_shouldReturnNull() {
        // Arrange & Act
        Integer result = Matchers.notNull(Integer.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void notNull_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.notNull(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNotNull_noArg_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.isNotNull();

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNotNull_givenClass_shouldReturnNull() {
        // Arrange & Act
        Double result = Matchers.isNotNull(Double.class);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void isNotNull_givenNullClass_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.isNotNull(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void contains_givenNonEmptyString_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.contains("sub");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void contains_givenEmptyString_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.contains("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void contains_givenNullString_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.contains(null);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void matches_givenRegexPattern_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.matches("^[a-z]+$");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void matches_givenEmptyRegex_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.matches("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void matches_givenNullRegex_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.matches(null);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void endsWith_givenSuffix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.endsWith("end");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void endsWith_givenEmptySuffix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.endsWith("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void endsWith_givenNullSuffix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.endsWith(null);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void startsWith_givenPrefix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.startsWith("start");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void startsWith_givenEmptyPrefix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.startsWith("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void startsWith_givenNullPrefix_shouldReturnEmptyString() {
        // Arrange & Act
        String result = Matchers.startsWith(null);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void argThat_givenMatcher_shouldReturnNull() {
        // Arrange
        Matcher<String> matcher = new DummyMatcher<String>();

        // Act
        String result = Matchers.argThat(matcher);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void argThat_givenNullMatcher_shouldReturnNull() {
        // Arrange & Act
        Object result = Matchers.argThat(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void charThat_givenMatcher_shouldReturnZeroChar() {
        // Arrange
        Matcher<Character> matcher = new DummyMatcher<Character>();

        // Act
        char result = Matchers.charThat(matcher);

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void charThat_givenNullMatcher_shouldReturnZeroChar() {
        // Arrange & Act
        char result = Matchers.charThat(null);

        // Assert
        Assert.assertEquals('\0', result);
    }

    @Test
    public void booleanThat_givenMatcher_shouldReturnFalse() {
        // Arrange
        Matcher<Boolean> matcher = new DummyMatcher<Boolean>();

        // Act
        boolean result = Matchers.booleanThat(matcher);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void booleanThat_givenNullMatcher_shouldReturnFalse() {
        // Arrange & Act
        boolean result = Matchers.booleanThat(null);

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void byteThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Byte> matcher = new DummyMatcher<Byte>();

        // Act
        byte result = Matchers.byteThat(matcher);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void byteThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        byte result = Matchers.byteThat(null);

        // Assert
        Assert.assertEquals((byte) 0, result);
    }

    @Test
    public void shortThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Short> matcher = new DummyMatcher<Short>();

        // Act
        short result = Matchers.shortThat(matcher);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void shortThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        short result = Matchers.shortThat(null);

        // Assert
        Assert.assertEquals((short) 0, result);
    }

    @Test
    public void intThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Integer> matcher = new DummyMatcher<Integer>();

        // Act
        int result = Matchers.intThat(matcher);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void intThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        int result = Matchers.intThat(null);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void longThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Long> matcher = new DummyMatcher<Long>();

        // Act
        long result = Matchers.longThat(matcher);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void longThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        long result = Matchers.longThat(null);

        // Assert
        Assert.assertEquals(0L, result);
    }

    @Test
    public void floatThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Float> matcher = new DummyMatcher<Float>();

        // Act
        float result = Matchers.floatThat(matcher);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void floatThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        float result = Matchers.floatThat(null);

        // Assert
        Assert.assertEquals(0.0f, result, 0.0001f);
    }

    @Test
    public void doubleThat_givenMatcher_shouldReturnZero() {
        // Arrange
        Matcher<Double> matcher = new DummyMatcher<Double>();

        // Act
        double result = Matchers.doubleThat(matcher);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }

    @Test
    public void doubleThat_givenNullMatcher_shouldReturnZero() {
        // Arrange & Act
        double result = Matchers.doubleThat(null);

        // Assert
        Assert.assertEquals(0.0d, result, 0.0001d);
    }
}