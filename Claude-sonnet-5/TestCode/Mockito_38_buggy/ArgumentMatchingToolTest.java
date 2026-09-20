package org.mockito.internal.verification.argumentmatching;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.ContainsExtraTypeInformation;

public class ArgumentMatchingToolTest {

    private ArgumentMatchingTool tool;

    @Before
    public void setUp() {
        tool = new ArgumentMatchingTool();
    }

    /**
     * Test matcher implementation that can be configured to behave in different ways.
     * Implements both Matcher (via BaseMatcher) and ContainsExtraTypeInformation.
     */
    private static class ConfigurableMatcher extends BaseMatcher<Object> implements ContainsExtraTypeInformation {

        private final boolean matchResult;
        private final boolean throwOnMatch;
        private final String description;
        private final boolean typeMatchResult;

        ConfigurableMatcher(boolean matchResult, boolean throwOnMatch, String description, boolean typeMatchResult) {
            this.matchResult = matchResult;
            this.throwOnMatch = throwOnMatch;
            this.description = description;
            this.typeMatchResult = typeMatchResult;
        }

        @Override
        public boolean matches(Object item) {
            if (throwOnMatch) {
                throw new RuntimeException("boom");
            }
            return matchResult;
        }

        @Override
        public void describeTo(Description desc) {
            desc.appendText(description);
        }

        @Override
        public String getExtraTypeInfo(Object obj) {
            return "extra";
        }

        @Override
        public boolean typeMatches(Object obj) {
            return typeMatchResult;
        }
    }

    /**
     * A plain matcher that does NOT implement ContainsExtraTypeInformation.
     */
    private static class PlainMatcher extends BaseMatcher<Object> {

        private final boolean matchResult;
        private final String description;

        PlainMatcher(boolean matchResult, String description) {
            this.matchResult = matchResult;
            this.description = description;
        }

        @Override
        public boolean matches(Object item) {
            return matchResult;
        }

        @Override
        public void describeTo(Description desc) {
            desc.appendText(description);
        }
    }

    @Test
    public void shouldReturnEmptyArray_whenSizesDoNotMatch() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        matchers.add(new ConfigurableMatcher(false, false, "foo", false));
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(matchers, arguments);

        assertEquals(0, result.length);
    }

    @Test
    public void shouldReturnEmptyArray_whenBothMatchersAndArgumentsAreEmpty() {
        List<Matcher> matchers = new ArrayList<Matcher>();
        Object[] arguments = new Object[0];

        Integer[] result = tool.getSuspiciouslyNotMatchingArgsIndexes(match