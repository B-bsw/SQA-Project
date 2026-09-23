package org.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Any;
import org.mockito.internal.matchers.AnyVararg;
import org.mockito.internal.matchers.Contains;
import org.mockito.internal.matchers.EndsWith;
import org.mockito.internal.matchers.Equals;
import org.mockito.internal.matchers.InstanceOf;
import org.mockito.internal.matchers.Matches;
import org.mockito.internal.matchers.NotNull;
import org.mockito.internal.matchers.Null;
import org.mockito.internal.matchers.Same;
import org.mockito.internal.matchers.StartsWith;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.mockito.internal.progress.HandyReturnValues;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SuppressWarnings("unchecked")
public class MatchersTest {

    // Test anyBoolean()
    @Test
    public void testAnyBooleanReturnsFalse() {
        assertFalse(Matchers.anyBoolean());
    }

    // Test anyByte()
    @Test
    public void testAnyByteReturnsZero() {
        assertEquals((byte) 0, Matchers.anyByte());
    }

    // Test anyChar()
    @Test
    public void testAnyCharReturnsZeroChar() {
        assertEquals('\u0000', Matchers.anyChar());
    }

    // Test anyInt()
    @Test
    public void testAnyIntReturnsZero() {
        assertEquals(0, Matchers.anyInt());
    }

    // Test anyLong()
    @Test
    public void testAnyLongReturnsZero() {
        assertEquals(0L, Matchers.anyLong());
    }

    // Test anyFloat()
    @Test
    public void testAnyFloatReturnsZero() {
        assertEquals(0.0f, Matchers.anyFloat(), 0.0f);
    }

    // Test anyDouble()
    @Test
    public void testAnyDoubleReturnsZero() {
        assertEquals(0.0, Matchers.anyDouble(), 0.0);
    }

    // Test anyShort()
    @Test
    public void testAnyShortReturnsZero() {
        assertEquals((short) 0, Matchers.anyShort());
    }

    // Test anyObject()
    @Test
    public void testAnyObjectReturnsNull() {
        assertNull(Matchers.anyObject());
    }

    // Test anyVararg()
    @Test
    public void testAnyVarargReturnsNull() {
        assertNull(Matchers.anyVararg());
    }

    // Test any(Class)
    @Test
    public void testAnyClassReturnsNull() {
        assertNull(Matchers.any(String.class));
    }

    // Test any()
    @Test
    public void testAnyReturnsNull() {
        assertNull(Matchers.any());
    }

    // Test anyString()
    @Test
    public void testAnyStringReturnsNull() {
        assertNull(Matchers.anyString());
    }

    // Test anyList()
    @Test
    public void testAnyListReturnsNull() {
        assertNull(Matchers.anyList());
    }

    // Test anyListOf()
    @Test
    public void testAnyListOfReturnsNull() {
        assertNull(Matchers.anyListOf(String.class));
    }

    // Test anySet()
    @Test
    public void testAnySetReturnsNull() {
        assertNull(Matchers.anySet());
    }

    // Test anySetOf()
    @Test
    public void testAnySetOfReturnsNull() {
        assertNull(Matchers.anySetOf(String.class));
    }

    // Test anyMap()
    @Test
    public void testAnyMapReturnsNull() {
        assertNull(Matchers.anyMap());
    }

    // Test anyMapOf()
    @Test
    public void testAnyMapOfReturnsNull() {
        assertNull(Matchers.anyMapOf(String.class, Integer.class));
    }

    // Test anyCollection()
    @Test
    public void testAnyCollectionReturnsNull() {
        assertNull(Matchers.anyCollection());
    }

    // Test anyCollectionOf()
    @Test
    public void testAnyCollectionOfReturnsNull() {
        assertNull(Matchers.anyCollectionOf(String.class));
    }

    // Test isA()
    @Test
    public void testIsANullForNonMatchingClass() {
        assertNull(Matchers.isA(String.class));
    }

    // Test eq() for boolean
    @Test
    public void testEqBooleanReturnsFalse() {
        assertFalse(Matchers.eq(true));
    }

    // Test eq() for byte
    @Test
    public void testEqByteReturnsZero() {
        assertEquals((byte) 0, Matchers.eq((byte) 1));
    }

    // Test eq() for char
    @Test
    public void testEqCharReturnsZeroChar() {
        assertEquals('\u0000', Matchers.eq('a'));
    }

    // Test eq() for double
    @Test
    public void testEqDoubleReturnsZero() {
        assertEquals(0.0, Matchers.eq(1.0), 0.0);
    }

    // Test eq() for float
    @Test
    public void testEqFloatReturnsZero() {
        assertEquals(0.0f, Matchers.eq(1.0f), 0.0f);
    }

    // Test eq() for int
    @Test
    public void testEqIntReturnsZero() {
        assertEquals(0, Matchers.eq(1));
    }

    // Test eq() for long
    @Test
    public void testEqLongReturnsZero() {
        assertEquals(0L, Matchers.eq(1L));
    }

    // Test eq() for short
    @Test
    public void testEqShortReturnsZero() {
        assertEquals((short) 0, Matchers.eq((short) 1));
    }

    // Test eq() for generic T
    @Test
    public void testEqGenericReturnsNull() {
        assertNull(Matchers.eq("value"));
    }

    // Test refEq()
    @Test
    public void testRefEqReturnsNull() {
        String value = "test";
        assertNull(Matchers.refEq(value));
    }

    // Test refEq with excludeFields
    @Test
    public void testRefEqWithExcludeFieldsReturnsNull() {
        String value = "test";
        assertNull(Matchers.refEq(value, "field1", "field2"));
    }

    // Test same()
    @Test
    public void testSameReturnsValue() {
        String value = "test";
        assertSame(value, Matchers.same(value));
    }

    // Test isNull()
    @Test
    public void testIsNullReturnsNull() {
        assertNull(Matchers.isNull());
    }

    // Test isNull(Class)
    @Test
    public void testIsNullClassReturnsNull() {
        assertNull(Matchers.isNull(String.class));
    }

    // Test notNull()
    @Test
    public void testNotNullReturnsNull() {
        assertNull(Matchers.notNull());
    }

    // Test notNull(Class)
    @Test
    public void testNotNullClassReturnsNull() {
        assertNull(Matchers.notNull(String.class));
    }

    // Test isNotNull()
    @Test
    public void testIsNotNullReturnsNull() {
        assertNull(Matchers.isNotNull());
    }

    // Test isNotNull(Class)
    @Test
    public void testIsNotNullClassReturnsNull() {
        assertNull(Matchers.isNotNull(String.class));
    }

    // Test contains()
    @Test
    public void testContainsReturnsNull() {
        assertNull(Matchers.contains("substring"));
    }

    // Test matches()
    @Test
    public void testMatchesReturnsNull() {
        assertNull(Matchers.matches("regex"));
    }

    // Test endsWith()
    @Test
    public void testEndsWithReturnsNull() {
        assertNull(Matchers.endsWith("suffix"));
    }

    // Test startsWith()
    @Test
    public void testStartsWithReturnsNull() {
        assertNull(Matchers.startsWith("prefix"));
    }

    // Test argThat()
    @Test
    public void testArgThatReturnsNull() {
        assertNull(Matchers.argThat(new org.hamcrest.BaseMatcher<Object>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test charThat()
    @Test
    public void testCharThatReturnsZeroChar() {
        assertEquals('\u0000', Matchers.charThat(new org.hamcrest.BaseMatcher<Character>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test booleanThat()
    @Test
    public void testBooleanThatReturnsFalse() {
        assertFalse(Matchers.booleanThat(new org.hamcrest.BaseMatcher<Boolean>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test byteThat()
    @Test
    public void testByteThatReturnsZero() {
        assertEquals((byte) 0, Matchers.byteThat(new org.hamcrest.BaseMatcher<Byte>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test shortThat()
    @Test
    public void testShortThatReturnsZero() {
        assertEquals((short) 0, Matchers.shortThat(new org.hamcrest.BaseMatcher<Short>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test intThat()
    @Test
    public void testIntThatReturnsZero() {
        assertEquals(0, Matchers.intThat(new org.hamcrest.BaseMatcher<Integer>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test longThat()
    @Test
    public void testLongThatReturnsZero() {
        assertEquals(0L, Matchers.longThat(new org.hamcrest.BaseMatcher<Long>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }));
    }

    // Test floatThat()
    @Test
    public void testFloatThatReturnsZero() {
        assertEquals(0.0f, Matchers.floatThat(new org.hamcrest.BaseMatcher<Float>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }), 0.0f);
    }

    // Test doubleThat()
    @Test
    public void testDoubleThatReturnsZero() {
        assertEquals(0.0, Matchers.doubleThat(new org.hamcrest.BaseMatcher<Double>() {
            @Override
            public boolean matches(Object item) {
                return true;
            }

            @Override
            public void describeTo(org.hamcrest.Description description) {
            }
        }), 0.0);
    }
}