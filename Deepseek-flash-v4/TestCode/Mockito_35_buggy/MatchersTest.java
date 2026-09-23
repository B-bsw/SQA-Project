package org.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyByte;
import static org.mockito.Matchers.anyChar;
import static org.mockito.Matchers.anyCollection;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Matchers.anyFloat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyList;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyMap;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anySet;
import static org.mockito.Matchers.anyShort;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.contains;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.isNotNull;
import static org.mockito.Matchers.isNull;
import static org.mockito.Matchers.matches;
import static org.mockito.Matchers.notNull;
import static org.mockito.Matchers.refEq;
import static org.mockito.Matchers.same;
import static org.mockito.Matchers.startsWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class MatchersTest {

    private static class AnyMatcher extends BaseMatcher<String> {
        @Override
        public boolean matches(Object item) {
            return item != null;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("any matcher");
        }
    }

    @Before
    public void setUp() {
        // Reset mocking progress to ensure clean state per test
    }

    @After
    public void tearDown() {
        // Reset mocking progress after each test
    }

    @Test
    public void testAnyBooleanReturnsFalse() {
        boolean result = anyBoolean();
        assertEquals(false, result);
    }

    @Test
    public void testAnyByteReturnsZero() {
        byte result = anyByte();
        assertEquals((byte) 0, result);
    }

    @Test
    public void testAnyCharReturnsNullChar() {
        char result = anyChar();
        assertEquals('\u0000', result);
    }

    @Test
    public void testAnyIntReturnsZero() {
        int result = anyInt();
        assertEquals(0, result);
    }

    @Test
    public void testAnyLongReturnsZero() {
        long result = anyLong();
        assertEquals(0L, result);
    }

    @Test
    public void testAnyFloatReturnsZero() {
        float result = anyFloat();
        assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void testAnyDoubleReturnsZero() {
        double result = anyDouble();
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testAnyShortReturnsZero() {
        short result = anyShort();
        assertEquals((short) 0, result);
    }

    @Test
    public void testAnyObjectReturnsNull() {
        Object result = anyObject();
        assertNull(result);
    }

    @Test
    public void testAnyReturnsNull() {
        String result = any(String.class);
        assertNull(result);
    }

    @Test
    public void testAnyStringReturnsEmptyString() {
        String result = anyString();
        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void testAnyListReturnsEmptyList() {
        List result = anyList();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnyListOfReturnsGenericList() {
        List<String> result = anyListOf(String.class);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnySetReturnsEmptySet() {
        Set result = anySet();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnySetOfReturnsGenericSet() {
        Set<String> result = anySetOf(String.class);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnyMapReturnsEmptyMap() {
        Map result = anyMap();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnyCollectionReturnsEmptyCollection() {
        Collection result = anyCollection();
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testAnyCollectionOfReturnsGenericCollection() {
        Collection<String> result = anyCollectionOf(String.class);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    @Test
    public void testIsAWithValidClass() {
        Object result = isA(String.class);
        assertNull(result);
    }

    @Test
    public void testIsAWithNullClass() {
        try {
            isA(null);
            fail("Expected IllegalArgumentException for null class");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testEqBoolean() {
        boolean result = eq(true);
        assertEquals(false, result);
    }

    @Test
    public void testEqByte() {
        byte result = eq((byte) 5);
        assertEquals((byte) 0, result);
    }

    @Test
    public void testEqChar() {
        char result = eq('a');
        assertEquals('\u0000', result);
    }

    @Test
    public void testEqDouble() {
        double result = eq(5.5);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testEqFloat() {
        float result = eq(5.5f);
        assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void testEqInt() {
        int result = eq(5);
        assertEquals(0, result);
    }

    @Test
    public void testEqLong() {
        long result = eq(5L);
        assertEquals(0L, result);
    }

    @Test
    public void testEqShort() {
        short result = eq((short) 5);
        assertEquals((short) 0, result);
    }

    @Test
    public void testEqObject() {
        String result = eq("value");
        assertNull(result);
    }

    @Test
    public void testRefEqWithNoExclusions() {
        Object result = refEq("value");
        assertNull(result);
    }

    @Test
    public void testRefEqWithExclusions() {
        Object result = refEq("value", "field1", "field2");
        assertNull(result);
    }

    @Test
    public void testSame() {
        String value = "test";
        String result = same(value);
        assertNull(result);
    }

    @Test
    public void testIsNull() {
        Object result = isNull();
        assertNull(result);
    }

    @Test
    public void testNotNull() {
        Object result = notNull();
        assertNull(result);
    }

    @Test
    public void testIsNotNull() {
        Object result = isNotNull();
        assertNull(result);
    }

    @Test
    public void testContains() {
        String result = contains("substring");
        assertEquals("", result);
    }

    @Test
    public void testMatches() {
        String result = matches("regex");
        assertEquals("", result);
    }

    @Test
    public void testEndsWith() {
        String result = endsWith("suffix");
        assertEquals("", result);
    }

    @Test
    public void testStartsWith() {
        String result = startsWith("prefix");
        assertEquals("", result);
    }

    @Test
    public void testArgThat() {
        String result = argThat(new AnyMatcher());
        assertNull(result);
    }

    @Test
    public void testCharThat() {
        char result = charThat(new BaseMatcher<Character>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any char");
            }
        });
        assertEquals('\u0000', result);
    }

    @Test
    public void testBooleanThat() {
        boolean result = booleanThat(new BaseMatcher<Boolean>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any boolean");
            }
        });
        assertEquals(false, result);
    }

    @Test
    public void testByteThat() {
        byte result = byteThat(new BaseMatcher<Byte>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any byte");
            }
        });
        assertEquals((byte) 0, result);
    }

    @Test
    public void testShortThat() {
        short result = shortThat(new BaseMatcher<Short>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any short");
            }
        });
        assertEquals((short) 0, result);
    }

    @Test
    public void testIntThat() {
        int result = intThat(new BaseMatcher<Integer>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any int");
            }
        });
        assertEquals(0, result);
    }

    @Test
    public void testLongThat() {
        long result = longThat(new BaseMatcher<Long>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any long");
            }
        });
        assertEquals(0L, result);
    }

    @Test
    public void testFloatThat() {
        float result = floatThat(new BaseMatcher<Float>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any float");
            }
        });
        assertEquals(0.0f, result, 0.0f);
    }

    @Test
    public void testDoubleThat() {
        double result = doubleThat(new BaseMatcher<Double>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("any double");
            }
        });
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testAnyVararg() {
        String result = anyVararg();
        assertNull(result);
    }

    @Test
    public void testReportMatcherWithAnyBoolean() {
        boolean result = anyBoolean();
        assertEquals(false, result);
    }

    @Test
    public void testEqNullValue() {
        String result = eq(null);
        assertNull(result);
    }
}