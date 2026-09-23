package org.apache.commons.lang.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.Reader;
import java.io.Writer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StrBuilderTest {

    private StrBuilder sb;

    @Before
    public void setUp() {
        sb = new StrBuilder();
    }

    @After
    public void tearDown() {
        sb = null;
    }

    // Constructor tests
    @Test
    public void testDefaultConstructor() {
        assertEquals(0, sb.length());
        assertEquals(0, sb.capacity());
        assertEquals("", sb.toString());
    }

    @Test
    public void testConstructorWithNegativeCapacity() {
        sb = new StrBuilder(-5);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 0);
    }

    @Test
    public void testConstructorWithNullString() {
        sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    @Test
    public void testConstructorWithString() {
        sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals("hello", sb.toString());
    }

    // getNewLineText and setNewLineText
    @Test
    public void testGetSetNewLineText() {
        assertNull(sb.getNewLineText());
        assertSame(sb, sb.setNewLineText("\n"));
        assertEquals("\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    // getNullText and setNullText
    @Test
    public void testGetSetNullText() {
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText("");
        assertEquals("", sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    // length, size, capacity, ensureCapacity, minimizeCapacity, isEmpty, clear
    @Test
    public void testLengthClearIsEmpty() {
        assertTrue(sb.isEmpty());
        sb.append("abc");
        assertEquals(3, sb.length());
        assertEquals(3, sb.size());
        assertFalse(sb.isEmpty());
        sb.clear();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
        assertSame(sb, sb.clear());
    }

    @Test
    public void testEnsureCapacityMinimizeCapacity() {
        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);
        sb.append("test");
        int oldCap = sb.capacity();
        sb.minimizeCapacity();
        assertTrue(sb.capacity() <= oldCap);
        assertEquals("test", sb.toString());
    }

    // charAt, setCharAt, deleteCharAt
    @Test
    public void testCharAtAndSetCharAt() {
        sb.append("hello");
        assertEquals('e', sb.charAt(1));
        sb.setCharAt(1, 'a');
        assertEquals("hallo", sb.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCharAtOutOfBounds() {
        sb.append("abc");
        sb.charAt(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetCharAtOutOfBounds() {
        sb.append("abc");
        sb.setCharAt(-1, 'x');
    }

    @Test
    public void testDeleteCharAt() {
        sb.append("hello");
        sb.deleteCharAt(1);
        assertEquals("hllo", sb.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteCharAtOutOfBounds() {
        sb.append("hello");
        sb.deleteCharAt(5);
    }

    // toCharArray variants
    @Test
    public void testToCharArrayEmpty() {
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());
    }

    @Test
    public void testToCharArray() {
        sb.append("hello");
        char[] arr = sb.toCharArray();
        assertEquals(5, arr.length);
        assertArrayEquals(new char[]{'h','e','l','l','o'}, arr);
    }

    @Test
    public void testToCharArrayRange() {
        sb.append("hello world");
        char[] arr = sb.toCharArray(6, 11);
        assertEquals(5, arr.length);
        assertArrayEquals(new char[]{'w','o','r','l','d'}, arr);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testToCharArrayRangeInvalid() {
        sb.append("hello");
        sb.toCharArray(2, 10);
    }

    // getChars methods
    @Test
    public void testGetChars() {
        sb.append("hello");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertSame(dest, result);
        assertArrayEquals(new char[]{'h','e','l','l','o'}, dest);
    }

    @Test(expected = NullPointerException.class)
    public void testGetCharsNullDest() {
        sb.append("hello");
        sb.getChars((char[]) null);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetCharsDestTooSmall() {
        sb.append("hello");
        sb.getChars(new char[3]);
    }

    // append methods
    @Test
    public void testAppendNewLine() {
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
        sb.setNewLineText(null);
        sb.appendNewLine();
        assertEquals("\n", sb.toString());
    }

    @Test
    public void testAppendNull() {
        sb.appendNull();
        assertEquals("", sb.toString());
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testAppendPrimitives() {
        sb.append(true);
        sb.append('c');
        sb.append((int) 123);
        sb.append(45L);
        sb.append(1.5f);
        sb.append(2.5);
        assertEquals("truec123451.52.5", sb.toString());
    }

    @Test
    public void testAppendStringRange() {
        sb.append("hello world", 6, 5);
        assertEquals("world", sb.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAppendStringRangeInvalidStart() {
        sb.append("hello", -1, 3);
    }

    @Test
    public void testAppendStrBuilder() {
        sb.append("Hello");
        StrBuilder other = new StrBuilder(" World");
        sb.append(other);
        assertEquals("Hello World", sb.toString());
    }

    @Test
    public void testAppendCharArrayRange() {
        sb.append("hello", 1, 3);
        assertEquals("ell", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        String[] arr = {"a", "b", "c"};
        sb.appendWithSeparators(arr, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullArray() {
        sb.appendWithSeparators((String[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("x");
        list.add("y");
        sb.appendWithSeparators(list, "-");
        assertEquals("x-y", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        sb.appendPadding(-1, 'x');
        assertEquals("", sb.toString());
        sb.appendPadding(3, 'x');
        sb.append("123");
        sb.appendPadding(5, 'z');
        assertEquals("xxx123zz", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        sb.appendFixedWidthPadLeft(42, 5, '0');
        assertEquals("00042", sb.toString());
        sb.clear();
        sb.appendFixedWidthPadLeft(42, 2, '0');
        assertEquals("42", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        sb.appendFixedWidthPadRight(42, 5, '*');
        assertEquals("42***", sb.toString());
    }

    // insert methods
    @Test
    public void testInsertIntString() {
        sb.append("Hello World");
        sb.insert(5, "beautiful ");
        assertEquals("Hello beautiful World", sb.toString());
    }

    @Test
    public void testInsertIntCharArray() {
        sb.append("Horld");
        char[] chars = {'e', 'l', 'l', 'o'};
        sb.insert(1, chars);
        assertEquals("Hello World".substring(0, 6) + "orld", "Helloorld");
    }

    @Test
    public void testInsertBoolean() {
        sb.append("test");
        sb.insert(5, true);
        assertEquals("testtrue", sb.toString());
    }

    @Test
    public void testInsertChar() {
        sb.append("abc");
        sb.insert(1, 'X');
        assertEquals("aXbc", sb.toString());
    }

    @Test
    public void testInsertIntLong() {
        sb.append("abc");
        sb.insert(1, 123L);
        assertEquals("a123bc", sb.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertInvalidIndex() {
        sb.append("abc");
        sb.insert(-1, "foo");
    }

    // deleteAll and deleteFirst
    @Test
    public void testDeleteAllChar() {
        sb.append("aabbaacc");
        sb.deleteAll('a');
        assertEquals("bbcc", sb.toString());
    }

    @Test
    public void testDeleteFirstChar() {
        sb.append("aabbaacc");
        sb.deleteFirst('a');
        assertEquals("abbaacc", sb.toString());
    }

    @Test
    public void testDeleteAllString() {
        sb.append("aabbaa");
        sb.deleteAll("aa");
        assertEquals("bb", sb.toString());
    }

    @Test
    public void testDeleteFirstString() {
        sb.append("aabbaa");
        sb.deleteFirst("aa");
        assertEquals("bbaa", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNotFound() {
        sb.append("abc");
        sb.deleteFirst("zzz");
        assertEquals("abc", sb.toString());
    }

    // replace methods
    @Test
    public void testReplaceAllString() {
        sb.append("aabbcc");
        sb.replaceAll("bb", "X");
        assertEquals("aaXcc", sb.toString());
    }

    @Test
    public void testReplaceFirstString() {
        sb.append("aabbaa");
        sb.replaceFirst("aa", "X");
        assertEquals("Xbbaa", sb.toString());
    }

    // reverse and trim
    @Test
    public void testReverse() {
        sb.append("abc");
        assertSame(sb, sb.reverse());
        assertEquals("cba", sb.toString());
    }

    @Test
    public void testTrim() {
        sb.append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    // startsWith, endsWith
    @Test
    public void testStartsWith() {
        sb.append("hello world");
        assertTrue(sb.startsWith("hello"));
        assertFalse(sb.startsWith("world"));
        assertFalse(sb.startsWith("longer than allowed"));
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testEndsWith() {
        sb.append("hello");
        assertTrue(sb.endsWith("lo"));
        assertFalse(sb.endsWith("he"));
        assertFalse(sb.endsWith("verylong"));
    }

    // substring and related methods
    @Test
    public void testSubstring() {
        sb.append("hello world");
        assertEquals("world", sb.substring(6));
        assertEquals("ell", sb.substring(1, 4));
        assertEquals("", sb.substring(0, 0));
    }

    @Test
    public void testLeftRightMidString() {
        sb.append("hello");
        assertEquals("", sb.leftString(0));
        assertEquals("hello", sb.leftString(10));
        assertEquals("lo", sb.rightString(2));
        assertEquals("ell", sb.midString(1, 3));
        assertEquals("hello", sb.midString(-1, 10));
        assertEquals("", sb.midString(5, 10));
        assertEquals("llo", sb.midString(2, 10));
    }

    // contains, indexOf
    @Test
    public void testContains() {
        sb.append("hello world");
        assertTrue(sb.contains('w'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("world"));
        assertTrue(sb.contains("lo w"));
    }

    @Test
    public void testIndexOfChar() {
        sb.append("hello");
        assertEquals(2, sb.indexOf('l'));
        assertEquals(0, sb.indexOf('h'));
        assertEquals(-1, sb.indexOf('z'));
        assertEquals(-1, sb.indexOf('l', 4));
        assertEquals(3, sb.indexOf('l', 3));
    }

    @Test
    public void testIndexOfString() {
        sb.append("hello world");
        assertEquals(4, sb.indexOf("o"));
        assertEquals(4, sb.indexOf("o", 4));
        assertEquals(7, sb.indexOf("o", 5));
        assertEquals(-1, sb.indexOf("zzz"));
        assertEquals(-1, sb.indexOf("o", 10));
    }

    @Test
    public void testIndexOfStrMatcher() {
        sb.append("hello");
        StrMatcher matcher = new StrMatcher() {
            public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
                if (pos >= 0 && pos < bufferEnd && buffer[pos] == 'l') {
                    return 1;
                }
                return 0;
            }
        };
        assertEquals(2, sb.indexOf(matcher));
    }

    @Test
    public void testLastIndexOf() {
        sb.append("hello world");
        assertEquals(7, sb.lastIndexOf('o'));
        assertEquals(7, sb.lastIndexOf("o"));
        assertEquals(4, sb.lastIndexOf('o', 6));
        assertEquals(-1, sb.lastIndexOf('z'));
        assertEquals(-1, sb.lastIndexOf(null));
        assertEquals(-1, sb.lastIndexOf(""));
    }

    @Test
    public void testLastIndexOfStrMatcher() {
        sb.append("hello");
        StrMatcher matcher = new StrMatcher() {
            public int isMatch(char[] buffer, int pos, int bufferStart, int bufferEnd) {
                if (pos >= 0 && pos < bufferEnd && buffer[pos] == 'l') {
                    return 1;
                }
                return 0;
            }
        };
        assertEquals(3, sb.lastIndexOf(matcher));
    }

    // equals and hashCode
    @Test
    public void testEquals() {
        StrBuilder other = new StrBuilder("hello");
        sb.append("hello");
        assertTrue(sb.equals(other));
        assertTrue(sb.equals((Object) other));
        assertFalse(sb.equals("hello"));
        assertFalse(sb.equals(null));
        other.append("x");
        assertFalse(sb.equals(other));
    }

    @Test
    public void testEqualsIgnoreCase() {
        sb.append("Hello");
        StrBuilder other = new StrBuilder("hello");
        assertTrue(sb.equalsIgnoreCase(other));
        other.append("x");
        assertFalse(sb.equalsIgnoreCase(other));
    }

    @Test
    public void testHashCodeConsistency() {
        sb.append("hello");
        int h1 = sb.hashCode();
        int h2 = sb.hashCode();
        assertEquals(h1, h2);
    }

    // toStringBuffer, asReader, asWriter
    @Test
    public void testToStringBuffer() {
        sb.append("hello");
        StringBuffer buf = sb.toStringBuffer();
        assertEquals("hello", buf.toString());
    }

    @Test
    public void testAsReader() throws Exception {
        sb.append("hello");
        Reader reader = sb.asReader();
        char[] cbuf = new char[5];
        int read = reader.read(cbuf);
        assertEquals(5, read);
        assertEquals("hello", new String(cbuf));
        assertEquals(-1, reader.read());
    }

    @Test
    public void testAsWriter() {
        sb.append("hello");
        Writer writer = sb.asWriter();
        try {
            writer.write(' ');
            writer.write("world");
            writer.flush();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals("hello world", sb.toString());
    }

    private void assertArrayEquals(char[] expected, char[] actual) {
        assertNotNull(actual);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}