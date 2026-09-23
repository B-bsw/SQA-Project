package org.jsoup.parser;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.StringReader;
import java.io.Reader;
import org.jsoup.UncheckedIOException;

public class CharacterReaderTest {
    private CharacterReader reader;
    private static final String TEST_STRING = "Hello, World! 123 <div>Test</div>";
    private static final String SIMPLE_STRING = "abc123";
    private static final String EMPTY_STRING = "";
    private static final String SPECIAL_CHARS = "&<>\0\t\n\r\f /";
    private static final String LETTER_SEQUENCE = "HelloWorld123!";
    private static final String DIGIT_SEQUENCE = "12345abc";
    private static final String MIXED_SEQUENCE = "abc123def456";
    private static final String LONG_STRING = repeatString("x", 50000);
    
    private static String repeatString(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) sb.append(s);
        return sb.toString();
    }
    
    @Before
    public void setUp() {
        reader = new CharacterReader(TEST_STRING);
    }
    
    @After
    public void tearDown() {
        reader = null;
    }
    
    @Test
    public void testConstructorWithReader() {
        CharacterReader r = new CharacterReader(new StringReader(SIMPLE_STRING));
        assertNotNull(r);
        assertEquals(6, r.pos());
        assertEquals(6, r.toString().length());
    }
    
    @Test
    public void testConstructorWithString() {
        CharacterReader r = new CharacterReader(SIMPLE_STRING);
        assertNotNull(r);
        assertEquals("abc123", r.toString());
    }
    
    @Test
    public void testConstructorWithEmptyReader() {
        CharacterReader r = new CharacterReader(new StringReader(""));
        assertTrue(r.isEmpty());
        assertEquals(CharacterReader.EOF, r.current());
    }
    
    @Test
    public void testConstructorWithNullInput() {
        try {
            new CharacterReader((Reader) null, 100);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
    
    @Test
    public void testConstructorWithUnsupportedMark() {
        try {
            new CharacterReader(new java.io.StringReader(SIMPLE_STRING), 100);
            fail("Expected IllegalArgumentException for unsupported mark");
        } catch (IllegalArgumentException e) {
            // expected - StringReader supports mark, but let's test with a custom reader
        }
    }
    
    @Test
    public void testPosInitial() {
        assertEquals(0, reader.pos());
    }
    
    @Test
    public void testIsEmpty() {
        assertFalse(reader.isEmpty());
        CharacterReader empty = new CharacterReader("");
        assertTrue(empty.isEmpty());
    }
    
    @Test
    public void testCurrent() {
        assertEquals('H', reader.current());
        reader.advance();
        assertEquals('e', reader.current());
    }
    
    @Test
    public void testCurrentAtEnd() {
        CharacterReader empty = new CharacterReader("");
        assertEquals(CharacterReader.EOF, empty.current());
    }
    
    @Test
    public void testConsume() {
        assertEquals('H', reader.consume());
        assertEquals('e', reader.consume());
        assertEquals(2, reader.pos());
    }
    
    @Test
    public void testConsumeAtEnd() {
        CharacterReader empty = new CharacterReader("");
        assertEquals(CharacterReader.EOF, empty.consume());
    }
    
    @Test
    public void testUnconsumeAndAdvance() {
        reader.advance();
        reader.unconsume();
        assertEquals(0, reader.pos());
        assertEquals('H', reader.current());
    }
    
    @Test
    public void testMarkAndRewind() {
        reader.advance();
        reader.advance();
        reader.mark();
        reader.advance();
        reader.rewindToMark();
        assertEquals(2, reader.pos());
        assertEquals('l', reader.current());
    }
    
    @Test
    public void testNextIndexOfChar() {
        assertEquals(1, reader.nextIndexOf('e'));
        assertEquals(7, reader.nextIndexOf('W'));
        assertEquals(-1, reader.nextIndexOf('z'));
    }
    
    @Test
    public void testNextIndexOfCharNotFound() {
        assertEquals(-1, reader.nextIndexOf('z'));
    }
    
    @Test
    public void testNextIndexOfString() {
        assertEquals(1, reader.nextIndexOf("ell"));
        assertEquals(-1, reader.nextIndexOf("zzz"));
    }
    
    @Test
    public void testNextIndexOfStringAtStart() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals(0, r.nextIndexOf("he"));
    }
    
    @Test
    public void testNextIndexOfStringAtEnd() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals(3, r.nextIndexOf("lo"));
    }
    
    @Test
    public void testConsumeToChar() {
        String consumed = reader.consumeTo(',');
        assertEquals("Hello", consumed);
        assertEquals(5, reader.pos());
        assertEquals(',', reader.current());
    }
    
    @Test
    public void testConsumeToCharNotFound() {
        String consumed = reader.consumeTo('z');
        assertEquals(TEST_STRING, consumed);
        assertTrue(reader.isEmpty());
    }
    
    @Test
    public void testConsumeToString() {
        String consumed = reader.consumeTo("World");
        assertEquals("Hello, ", consumed);
        assertEquals(7, reader.pos());
    }
    
    @Test
    public void testConsumeToStringNotFound() {
        String consumed = reader.consumeTo("zzz");
        assertEquals(TEST_STRING, consumed);
        assertTrue(reader.isEmpty());
    }
    
    @Test
    public void testConsumeToAny() {
        String consumed = reader.consumeToAny(' ', '!', '<');
        assertEquals("Hello,", consumed);
    }
    
    @Test
    public void testConsumeToAnyAtStart() {
        CharacterReader r = new CharacterReader("!test");
        assertEquals("", r.consumeToAny('!'));
    }
    
    @Test
    public void testConsumeToAnySorted() {
        // Note: consumeToAnySorted requires sorted input
        char[] chars = {'!', ',', '<'};
        String consumed = reader.consumeToAnySorted(chars);
        assertEquals("Hello", consumed);
    }
    
    @Test
    public void testConsumeData() {
        CharacterReader r = new CharacterReader("text&more<data>");
        String consumed = r.consumeData();
        assertEquals("text", consumed);
        assertEquals('&', r.current());
    }
    
    @Test
    public void testConsumeDataAtStart() {
        CharacterReader r = new CharacterReader("&amp;");
        assertEquals("", r.consumeData());
        assertEquals('&', r.current());
    }
    
    @Test
    public void testConsumeDataWithNullChar() {
        CharacterReader r = new CharacterReader("text\0more");
        String consumed = r.consumeData();
        assertEquals("text", consumed);
        assertEquals('\0', r.current());
    }
    
    @Test
    public void testConsumeTagName() {
        CharacterReader r = new CharacterReader("div class=\"test\"");
        String name = r.consumeTagName();
        assertEquals("div", name);
        assertEquals(' ', r.current());
    }
    
    @Test
    public void testConsumeTagNameWithSpecialChars() {
        CharacterReader r = new CharacterReader("div/>");
        String name = r.consumeTagName();
        assertEquals("div", name);
        assertEquals('/', r.current());
    }
    
    @Test
    public void testConsumeToEnd() {
        String consumed = reader.consumeToEnd();
        assertEquals(TEST_STRING, consumed);
        assertTrue(reader.isEmpty());
    }
    
    @Test
    public void testConsumeLetterSequence() {
        CharacterReader r = new CharacterReader("HelloWorld123");
        assertEquals("HelloWorld", r.consumeLetterSequence());
        assertEquals('1', r.current());
    }
    
    @Test
    public void testConsumeLetterSequenceWithLowercase() {
        CharacterReader r = new CharacterReader("hello123");
        assertEquals("hello", r.consumeLetterSequence());
        assertEquals('1', r.current());
    }
    
    @Test
    public void testConsumeLetterThenDigitSequence() {
        CharacterReader r = new CharacterReader("abc123def");
        assertEquals("abc123", r.consumeLetterThenDigitSequence());
        assertEquals('d', r.current());
    }
    
    @Test
    public void testConsumeLetterThenDigitSequenceNoDigits() {
        CharacterReader r = new CharacterReader("abcdef");
        assertEquals("abcdef", r.consumeLetterThenDigitSequence());
        assertTrue(r.isEmpty());
    }
    
    @Test
    public void testConsumeHexSequence() {
        CharacterReader r = new CharacterReader("1A2B3Fz");
        assertEquals("1A2B3F", r.consumeHexSequence());
        assertEquals('z', r.current());
    }
    
    @Test
    public void testConsumeHexSequenceNoHex() {
        CharacterReader r = new CharacterReader("xyz123");
        assertEquals("", r.consumeHexSequence());
    }
    
    @Test
    public void testConsumeDigitSequence() {
        CharacterReader r = new CharacterReader("12345abc");
        assertEquals("12345", r.consumeDigitSequence());
        assertEquals('a', r.current());
    }
    
    @Test
    public void testConsumeDigitSequenceNoDigits() {
        CharacterReader r = new CharacterReader("abc123");
        assertEquals("", r.consumeDigitSequence());
    }
    
    @Test
    public void testMatches() {
        CharacterReader r = new CharacterReader("test string");
        assertTrue(r.matches('t'));
        assertTrue(r.matches("te"));
        assertFalse(r.matches('x'));
        assertFalse(r.matches("xx"));
    }
    
    @Test
    public void testMatchesLongerThanRemaining() {
        CharacterReader r = new CharacterReader("short");
        assertFalse(r.matches("longer"));
    }
    
    @Test
    public void testMatchesIgnoreCase() {
        CharacterReader r = new CharacterReader("HeLLo");
        assertTrue(r.matchesIgnoreCase("hello"));
        assertTrue(r.matchesIgnoreCase("HELLO"));
        assertFalse(r.matchesIgnoreCase("world"));
    }
    
    @Test
    public void testMatchesAny() {
        CharacterReader r = new CharacterReader("hello");
        assertTrue(r.matchesAny('h', 'x', 'y'));
        assertTrue(r.matchesAny('x', 'h'));
        assertFalse(r.matchesAny('x', 'y', 'z'));
    }
    
    @Test
    public void testMatchesAnySorted() {
        CharacterReader r = new CharacterReader("hello");
        char[] sorted = {'a', 'e', 'h', 'i', 'o', 'u'};
        assertTrue(r.matchesAnySorted(sorted));
    }
    
    @Test
    public void testMatchesAnySortedNotFound() {
        CharacterReader r = new CharacterReader("hello");
        char[] sorted = {'a', 'b', 'c', 'd'};
        assertFalse(r.matchesAnySorted(sorted));
    }
    
    @Test
    public void testMatchesLetter() {
        CharacterReader r = new CharacterReader("abc123");
        assertTrue(r.matchesLetter());
        r.advance();
        r.advance();
        r.advance();
        assertFalse(r.matchesLetter());
        assertTrue(r.matchesDigit());
    }
    
    @Test
    public void testMatchesDigitAtStart() {
        CharacterReader r = new CharacterReader("123");
        assertTrue(r.matchesDigit());
    }
    
    @Test
    public void testMatchConsume() {
        CharacterReader r = new CharacterReader("test123");
        assertTrue(r.matchConsume("test"));
        assertEquals(4, r.pos());
        assertFalse(r.matchConsume("xyz"));
    }
    
    @Test
    public void testMatchConsumeIgnoreCase() {
        CharacterReader r = new CharacterReader("TEST123");
        assertTrue(r.matchConsumeIgnoreCase("test"));
        assertEquals(4, r.pos());
        assertFalse(r.matchConsumeIgnoreCase("xyz"));
    }
    
    @Test
    public void testContainsIgnoreCase() {
        CharacterReader r = new CharacterReader("Some <TITLE>Content</TITLE>");
        assertTrue(r.containsIgnoreCase("</TITLE>"));
        assertTrue(r.containsIgnoreCase("</title>"));
        assertFalse(r.containsIgnoreCase("</body>"));
    }
    
    @Test
    public void testContainsIgnoreCaseFullMatch() {
        CharacterReader r = new CharacterReader("Hello");
        assertTrue(r.containsIgnoreCase("hello"));
    }
    
    @Test
    public void testToString() {
        CharacterReader r = new CharacterReader("hello");
        assertEquals("hello", r.toString());
        r.advance();
        assertEquals("ello", r.toString());
    }
    
    @Test
    public void testMatchesLetterWithUnicode() {
        CharacterReader r = new CharacterReader("é123");
        assertTrue(r.matchesLetter());
    }
    
    @Test
    public void testMatchesDigitWithBoundary() {
        CharacterReader r = new CharacterReader("9");
        assertTrue(r.matchesDigit());
        r.advance();
        assertFalse(r.matchesDigit());
        assertEquals(CharacterReader.EOF, r.current());
    }
    
    @Test
    public void testConsumeToEndWithLongString() {
        CharacterReader r = new CharacterReader(LONG_STRING);
        String result = r.consumeToEnd();
        assertEquals(LONG_STRING, result);
        assertTrue(r.isEmpty());
    }
    
    @Test
    public void testConsumeToWithLongString() {
        CharacterReader r = new CharacterReader(LONG_STRING + "END");
        String result = r.consumeTo("END");
        assertEquals(LONG_STRING, result);
    }
    
    @Test
    public void testNextIndexOfWithLargeBuffer() {
        CharacterReader r = new CharacterReader(LONG_STRING + "XYZ");
        int index = r.nextIndexOf("XYZ");
        assertEquals(50000, index);
    }
    
    @Test
    public void testBufferRollover() {
        CharacterReader r = new CharacterReader(TEST_STRING);
        // consume most of the buffer
        for (int i = 0; i < 20; i++) {
            r.advance();
        }
        r.advance();
        assertEquals('d', r.current());
    }
    
    @Test
    public void testMultipleAdvanceAndConsume() {
        CharacterReader r = new CharacterReader(SIMPLE_STRING);
        assertEquals('a', r.consume());
        r.advance();
        assertEquals('c', r.consume());
        r.advance();
        assertEquals('1', r.consume());
    }
    
    @Test
    public void testCacheStringShortString() {
        CharacterReader r = new CharacterReader("abc");
        r.consume();
        r.consume();
        r.consume();
        assertTrue(r.isEmpty());
    }
    
    @Test
    public void testRangeEqualsMethod() {
        String test = "hello";
        CharacterReader r = new CharacterReader(test);
        assertTrue(CharacterReader.rangeEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, 0, 5, test));
        assertFalse(CharacterReader.rangeEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, 0, 4, test));
    }
    
    @Test
    public void testMatchesAnySortedWithBinarySearch() {
        CharacterReader r = new CharacterReader("abc");
        assertTrue(r.matchesAnySorted(new char[]{'a', 'b', 'c'}));
    }
    
    @Test
    public void testConsumeDataWithLessThan() {
        CharacterReader r = new CharacterReader("a<b");
        assertEquals("a", r.consumeData());
        assertEquals('<', r.current());
    }
    
    @Test
    public void testConsumeDataWithAmpersand() {
        CharacterReader r = new CharacterReader("a&b");
        assertEquals("a", r.consumeData());
        assertEquals('&', r.current());
    }
    
    @Test
    public void testConsumeDataWithNullCharProperty() {
        CharacterReader r = new CharacterReader("a\0b");
        assertEquals("a", r.consumeData());
        assertEquals('\0', r.current());
    }
    
    @Test
    public void testConsumeLetterSequenceEmpty() {
        CharacterReader r = new CharacterReader("123");
        assertEquals("", r.consumeLetterSequence());
    }
    
    @Test
    public void testConsumeHexSequenceWithUppercase() {
        CharacterReader r = new CharacterReader("ABCDEF123");
        assertEquals("ABCDEF123", r.consumeHexSequence());
    }
    
    @Test
    public void testConsumeLetterThenDigitSequenceWithOnlyDigits() {
        CharacterReader r = new CharacterReader("123abc");
        String result = r.consumeLetterThenDigitSequence();
        assertEquals("", result);
        assertFalse(r.isEmpty());
    }
}