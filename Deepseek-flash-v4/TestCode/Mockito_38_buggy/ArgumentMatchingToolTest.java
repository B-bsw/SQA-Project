package org.mockito.internal.verification.argumentmatching;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

import static org.junit.Assert.*;

public class ArgumentMatchingToolTest {
    private ArgumentMatchingTool tool;
    private int testCount;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
        testCount = 0;
    }

    @After
    public void tearDown() {
        // No resources to clean up
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenMatchersSizeDiffersFromArgumentsLength() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[] {new Object()};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenSameSize_NoSuspicious() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new SimpleMatcher("expected", "actual"));
        Object[] arguments = new Object[] {"actual"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenContainsExtraTypeInformation_AndSuspicious() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TypeAwareMatcher("value", Integer.class, String.class));
        Object[] arguments = new Object[] {"value"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(1, result.length);
        assertEquals(0, result[0].intValue());
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenContainsExtraTypeInformation_NotSuspiciousBecauseMatches() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TypeAwareMatcher("value", Object.class, Object.class));
        Object[] arguments = new Object[] {new Object()};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenContainsExtraTypeInformation_NotSuspiciousBecauseToStringDiffers() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TypeAwareMatcher("matcherDesc", Integer.class, String.class));
        Object[] arguments = new Object[] {"argValue"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenContainsExtraTypeInformation_NotSuspiciousBecauseTypeMatches() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TypeAwareMatcher("value", String.class, String.class));
        Object[] arguments = new Object[] {"value"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenMultipleMatches_MultipleIndices() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new TypeAwareMatcher("v1", Integer.class, String.class));
        matchers.add(new SimpleMatcher("v2", "v2"));
        matchers.add(new TypeAwareMatcher("v3", Double.class, String.class));
        Object[] arguments = new Object[] {"v1", "v2", "v3"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(2, result.length);
        assertTrue(Arrays.asList(result).contains(0));
        assertTrue(Arrays.asList(result).contains(2));
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_withNullArguments_NullMatcherThrowsAndSafe() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new ThrowingMatcher());
        Object[] arguments = new Object[]{null};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenMatchersListEmptyAndArgsEmpty() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        Object[] arguments = new Object[]{};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_whenArgIsNullAndMatcherThrowsOnToString() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new ThrowingToStringMatcher("desc"));
        Object[] arguments = new Object[]{null};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    // Test without ContainsExtraTypeInformation
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_regularMatcherNotIncluded() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new SimpleMatcher("desc", "arg"));
        Object[] arguments = new Object[]{"arg"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    // Test matchers size > arguments
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_matchersGreaterThanArguments() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new SimpleMatcher("a", "a"));
        matchers.add(new SimpleMatcher("b", "b"));
        Object[] arguments = new Object[]{"a"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    // Test matchers size < arguments
    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_matchersLessThanArguments() {
        List<Matcher> matchers = new LinkedList<Matcher>();
        matchers.add(new SimpleMatcher("a", "a"));
        Object[] arguments = new Object[]{"a", "b"};
        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);
        assertEquals(0, result.length);
    }

    @Test
    public void testGetSuspiciouslyNotMatchingArgsIndexes_nullMatcherListThrowsNullPointer() {
        assertThrows(NullPointerException.class, () -> tool.getSuspiciouslyNotMatchingArgsIndexes(null, new Object[]{}));
    }

    // Helper inner classes

    private static class SimpleMatcher extends BaseMatcher<Object> {
        private final String description;
        private final Object expected;

        SimpleMatcher(String desc, Object expected) {
            this.description = desc;
            this.expected = expected;
        }

        @Override
        public boolean matches(Object item) {
            return expected == null ? item == null : expected.equals(item);
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(this.description);
        }

        @Override
        public String toString() {
            return description;
        }
    }

    private static class TypeAwareMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final String description;
        private final Class<?> merkedType;
        private final Class<?> actualType;

        TypeAwareMatcher(String desc, Class<?> mt, Class<?> at) {
            this.description = desc;
            this.merkedType = mt;
            this.actualType = at;
        }

        @Override
        public boolean matches(Object item) {
            return false;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(this.description);
        }

        @Override
        public String toString() {
            return description;
        }

        @Override
        public boolean typeMatches(Object obj) {
            return obj != null && obj.getClass() == actualType;
        }
    }

    private static class ThrowingMatcher extends BaseMatcher<Object> {
        @Override
        public boolean matches(Object item) {
            throw new RuntimeException("throwing");
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("throwing");
        }

        @Override
        public String toString() {
            return "throwing";
        }
    }

    private static class ThrowingToStringMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {
        private final String desc;

        ThrowingToStringMatcher(String d) { this.desc = d; }

        @Override
        public boolean matches(Object item) {
            return false;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText(desc);
        }

        @Override
        public String toString() {
            throw new RuntimeException("to string boom");
        }

        @Override
        public boolean typeMatches(Object obj) {
            return false;
        }
    }
}