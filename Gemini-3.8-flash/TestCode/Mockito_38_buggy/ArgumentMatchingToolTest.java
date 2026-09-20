package org.mockito.internal.verification.argumentmatching;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

public class ArgumentMatchingToolTest {

    private ArgumentMatchingTool tool;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenDifferentSizes_shouldReturnEmptyArray() {
        // Arrange
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TestMatcher(true, true, "10"));
        Object[] arguments = new Object[] { "10", "20" };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenEmptyMatchersAndArguments_shouldReturnEmptyArray() {
        // Arrange
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[0];

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenMatcherNotImplementingExtraTypeInfo_shouldReturnEmptyArray() {
        // Arrange
        Matcher standardMatcher = new NonExtraInfoMatcher(false, "100");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(standardMatcher);
        Object[] arguments = new Object[] { new Integer(100) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenSafelyMatchesIsTrue_shouldReturnEmptyArray() {
        // Arrange
        TestMatcher matcher = new TestMatcher(true, false, "100");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { new Integer(100) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenToStringDiffers_shouldReturnEmptyArray() {
        // Arrange
        TestMatcher matcher = new TestMatcher(false, false, "100");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { new Integer(200) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenTypeMatchesIsTrue_shouldReturnEmptyArray() {
        // Arrange
        TestMatcher matcher = new TestMatcher(false, true, "100");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { new Integer(100) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenAllSuspiciousConditionsMet_shouldReturnIndex() {
        // Arrange
        TestMatcher matcher = new TestMatcher(false, false, "100");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { new Long(100L) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(new Integer(0), result[0]);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenMatcherThrowsExceptionInMatches_shouldHandleExceptionAndDetectSuspicious() {
        // Arrange
        ThrowingMatcher matcher = new ThrowingMatcher(false, "50");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { new Integer(50) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(new Integer(0), result[0]);
    }

    @Test
    public void getSuspiciouslyNotMatchingArgsIndexes_givenMultipleArgsWithMixedMatching_shouldReturnOnlySuspiciousIndexes() {
        // Arrange
        TestMatcher suspicious1 = new TestMatcher(false, false, "10");
        TestMatcher matching2 = new TestMatcher(true, true, "20");
        TestMatcher suspicious3 = new TestMatcher(false, false, "30");
        NonExtraInfoMatcher nonExtra4 = new NonExtraInfoMatcher(false, "40");

        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(suspicious1);
        matchers.add(matching2);
        matchers.add(suspicious3);
        matchers.add(nonExtra4);

        Object[] arguments = new Object[] { new Integer(10), new Integer(20), new Long(30L), new Integer(40) };

        // Act
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(new Integer(0), result[0]);
        Assert.assertEquals(new Integer(2), result[1]);
    }

    @Test(expected = NullPointerException.class)
    public void getSuspiciouslyNotMatchingArgsIndexes_givenNullArgumentWhenToStringEqualsIsEvaluated_shouldThrowNullPointerException() {
        // Arrange
        TestMatcher matcher = new TestMatcher(false, false, "null");
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(matcher);
        Object[] arguments = new Object[] { null };

        // Act
        tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
    }

    private static class TestMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final boolean matchesResult;
        private final boolean typeMatchesResult;
        private final String description;

        public TestMatcher(boolean matchesResult, boolean typeMatchesResult, String description) {
            this.matchesResult = matchesResult;
            this.typeMatchesResult = typeMatchesResult;
            this.description = description;
        }

        public boolean matches(Object item) {
            return matchesResult;
        }

        public void describeTo(Description desc) {
            desc.appendText(description);
        }

        public boolean typeMatches(Object target) {
            return typeMatchesResult;
        }
    }

    private static class ThrowingMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final boolean typeMatchesResult;
        private final String description;

        public ThrowingMatcher(boolean typeMatchesResult, String description) {
            this.typeMatchesResult = typeMatchesResult;
            this.description = description;
        }

        public boolean matches(Object item) {
            throw new RuntimeException("Simulated exception during matching");
        }

        public void describeTo(Description desc) {
            desc.appendText(description);
        }

        public boolean typeMatches(Object target) {
            return typeMatchesResult;
        }
    }

    private static class NonExtraInfoMatcher extends BaseMatcher<Object> {
        private final boolean matchesResult;
        private final String description;

        public NonExtraInfoMatcher(boolean matchesResult, String description) {
            this.matchesResult = matchesResult;
            this.description = description;
        }

        public boolean matches(Object item) {
            return matchesResult;
        }

        public void describeTo(Description desc) {
            desc.appendText(description);
        }
    }
}