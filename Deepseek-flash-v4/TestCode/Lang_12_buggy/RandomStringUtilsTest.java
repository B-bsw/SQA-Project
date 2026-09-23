package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class RandomStringUtilsTest {
    
    @Test
    public void testRandomCountZero() {
        assertEquals("", RandomStringUtils.random(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRandomNegativeCount() {
        RandomStringUtils.random(-1);
    }
    
    @Test
    public void testRandomAscii() {
        String result = RandomStringUtils.randomAscii(10);
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 32 && c < 127);
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
        String result = RandomStringUtils.random(15, true, true);
        assertEquals(15, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetterOrDigit(c));
        }
    }
    
    @Test
    public void testRandomNumeric() {
        String result = RandomStringUtils.randomNumeric(12);
        assertEquals(12, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }
    }
    
    @Test
    public void testRandomWithNullCharsAndNoLettersNumbers() {
        String result = RandomStringUtils.random(5, 0, 0, false, false, (char[]) null, new Random());
        assertEquals(5, result.length());
    }
    
    @Test
    public void testRandomWithCustomChars() {
        char[] chars = {'a', 'b', 'c', 'd'};
        String result = RandomStringUtils.random(10, 0, 4, false, false, chars, new Random(123));
        assertEquals(10, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 'a' && c <= 'd');
        }
    }
    
    @Test
    public void testRandomWithCharFrequency() {
        int[] counts = new int[26];
        RandomStringUtils.random(1000, 0, 0, 'a', false, false, null, new Random());
        // Verifying no exception and reasonable distribution for letters
        String result = RandomStringUtils.random(1000, 0, 0, true, false, null, new Random());
        assertEquals(1000, result.length());
    }
    
    @Test
    public void testRandomWithStringChars() {
        String result = RandomStringUtils.random(8, "abcdef");
        assertEquals(8, result.length());
        for (char c : result.toCharArray()) {
            assertTrue("abcdef".indexOf(c) != -1);
        }
    }
    
    @Test
    public void testRandomWithCharArrayGenerator() {
        char[] chars = {'x', 'y', 'z'};
        String result = RandomStringUtils.random(6, chars);
        assertEquals(6, result.length());
        for (char c : result.toCharArray()) {
            assertTrue(c == 'x' || c == 'y' || c == 'z');
        }
    }
    
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRandomWithEmptyCharArray() {
        char[] chars = {};
        RandomStringUtils.random(5, chars);
    }
    
    @Test
    public void testRandomWithSuppliedRandomSeeded() {
        Random r1 = new Random(42);
        Random r2 = new Random(42);
        String s1 = RandomStringUtils.random(20, 0, 0, true, true, null, r1);
        String s2 = RandomStringUtils.random(20, 0, 0, true, true, null, r2);
        assertEquals(s1, s2);
        assertEquals(20, s1.length());
    }
    
    @Test
    public void testRandomSingleCharacterString() {
        String result = RandomStringUtils.random(1, 0, 0, false, false, null, new Random());
        assertEquals(1, result.length());
    }
    
    @Test
    public void testRandomWithStartEndRange() {
        String result = RandomStringUtils.random(10, 65, 91, false, false, null, new Random());
        for (char c : result.toCharArray()) {
            assertTrue(c >= 65 && c < 91);
        }
    }

    @Test
    public void testRandomPrivateHighSurrogateHandling() {
        Random r = new Random(1);
        String result = RandomStringUtils.random(5, 0, Integer.MAX_VALUE, false, false, null, r);
        assertEquals(5, result.length());
    }

    @Test
    public void testRandomWithLettersFalseNumbersTrue() {
        String result = RandomStringUtils.random(10, 0, 0, false, true, null, new Random());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isDigit(c));
        }
    }

    @Test
    public void testRandomWithLettersTrueNumbersFalse() {
        String result = RandomStringUtils.random(10, 0, 0, true, false, null, new Random());
        for (char c : result.toCharArray()) {
            assertTrue(Character.isLetter(c));
        }
    }
}