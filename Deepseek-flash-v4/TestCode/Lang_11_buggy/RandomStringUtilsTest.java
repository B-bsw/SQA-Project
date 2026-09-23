package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.Random;

import org.junit.Test;

public class RandomStringUtilsTest {

    private static final int DEFAULT_LENGTH = 5;
    private static final int RANDOM_SEED = 42;

    @Test
    public void testRandomCountZero() {
        assertEquals("", RandomStringUtils.random(0));
        assertEquals("", RandomStringUtils.random(0, true, true));
        assertEquals("", RandomStringUtils.random(0, 0, 0, true, true));
    }

    @Test
    public void testRandomNegativeCount() {
        try {
            RandomStringUtils.random(-1);
            fail("Expected IllegalArgumentException for negative count");
        } catch (IllegalArgumentException e) {
            // expected
        }
        try {
            RandomStringUtils.random(-5, true, true);
            fail("Expected IllegalArgumentException for negative count");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRandomSimpleString() {
        String result = RandomStringUtils.random(DEFAULT_LENGTH);
        assertEquals(DEFAULT_LENGTH, result.length());
        assertNotNull(result);
    }

    @Test
    public void testRandomAscii() {
        String result = RandomStringUtils.randomAscii(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 32 && c <= 126);
        }
    }

    @Test
    public void testRandomAlphabetic() {
        String result = RandomStringUtils.randomAlphabetic(20);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }

    @Test
    public void testRandomAlphanumeric() {
        String result = RandomStringUtils.randomAlphanumeric(20);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomNumeric() {
        String result = RandomStringUtils.randomNumeric(20);
        assertEquals(20, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomWithCustomCharsArray() {
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String result = RandomStringUtils.random(10, 0, chars.length, false, false, chars);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e');
        }
    }

    @Test
    public void testRandomWithCustomCharsNull() {
        String result = RandomStringUtils.random(10, 0, 0, false, false, (char[]) null);
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithEmptyCharsArray() {
        try {
            RandomStringUtils.random(10, 0, 0, false, false, new char[0]);
            fail("Expected IllegalArgumentException for empty chars array");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testRandomWithDefaultRangeAndNoLettersNumbers() {
        String result = RandomStringUtils.random(5, 0, 0, false, false);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandomWithExplicitStartEnd() {
        String result = RandomStringUtils.random(5, 97, 102, true, false);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 97 && c <= 101);
        }
    }

    @Test
    public void testRandomWithSeededRandom() {
        Random random = new Random(RANDOM_SEED);
        String result1 = RandomStringUtils.random(10, 0, 0, true, true, null, random);
        random = new Random(RANDOM_SEED);
        String result2 = RandomStringUtils.random(10, 0, 0, true, true, null, random);
        assertEquals(result1, result2);
    }

    @Test
    public void testRandomWithCharString() {
        String chars = "abc";
        String result = RandomStringUtils.random(5, chars);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'a' || c == 'b' || c == 'c');
        }
    }

    @Test
    public void testRandomWithNullCharString() {
        String result = RandomStringUtils.random(5, (String) null);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandomWithHighSurrogate() {
        // Test the high surrogate path (55296-56191)
        // This is a rare trigger condition, but we test it separately
        String result = RandomStringUtils.random(10, 55296, 56192, true, false, null, new Random(1));
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithLowSurrogate() {
        // Test the low surrogate path (56320-57343)
        String result = RandomStringUtils.random(10, 56320, 57344, true, false, null, new Random(2));
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomWithPrivateHighSurrogate() {
        // Test the private high surrogate path (56192-56319)
        String result = RandomStringUtils.random(10, 56192, 56320, true, false, null, new Random(3));
        assertEquals(10, result.length());
    }

    @Test
    public void testRandomLettersNumbersBothTrue() {
        String result = RandomStringUtils.random(15, true, true);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c) || Character.isDigit(c));
        }
    }

    @Test
    public void testRandomWithSpecificBoundaryChars() {
        char[] chars = {'a'};
        String result = RandomStringUtils.random(5, 0, 1, false, false, chars);
        assertEquals(5, result.length());
        for (char c : result.toCharArray()) {
            assertEquals('a', c);
        }
    }
}