package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class StrBuilderTest {
    private StrBuilder builder;

    @Before
    public void setUp() {
        builder = new StrBuilder();
    }

    @After
    public void tearDown() {
        builder = null;
    }

    @Test
    public void testDefaultConstructor() {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testInitialCapacityConstructor() {
        StrBuilder sb = new StrBuilder(10);
        assertTrue(sb.capacity() >= 10);
        StrBuilder sbNeg = new StrBuilder(-5);
        assertEquals(0, sbNeg.capacity());
    }

    @Test
    public void testStringConstructor() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toString());
        StrBuilder sbNull = new StrBuilder((String) null);
        assertEquals("", sbNull.toString());
    }

    @Test
    public void testAppendString() {
        builder.append("hello");
        assertEquals("hello", builder.toString());
        builder.append(null);
        assertEquals("hello", builder.toString());
        builder.setNullText("null");
        builder.append((String) null);
        assertEquals("hellonull", builder.toString());
    }

    @Test
    public void testAppendChar() {
        builder.append('a');
        builder.append('b');
        assertEquals("ab", builder.toString());
    }

    @Test
    public void testAppendBoolean() {
        builder.append(true);
        builder.append(false);
        assertEquals("truefalse", builder.toString());
    }

    @Test
    public void testAppendInt() {
        builder.append(123);
        builder.append(-456);
        assertEquals("123-456", builder.toString());
    }

    @Test
    public void testAppendLong() {
        builder.append(123456789L);
        assertEquals("123456789", builder.toString());
    }

    @Test
    public void testAppendFloat() {
        builder.append(1.5f);
        assertTrue(builder.toString().contains("1.5"));
    }

    @Test
    public void testAppendDouble() {
        builder.append(2.25d);
        assertTrue(builder.toString().contains("2.25"));
    }

    @Test
    public void testAppendNewLine() {
        builder.appendNewLine();
        assertEquals("", builder.toString());
        builder.setNewLineText("\n");
        builder.appendNewLine();
        assertEquals("\n", builder.toString());
    }

    @Test
    public void testAppendNull() {
        builder.appendNull();
        assertEquals("", builder.toString());
        builder.setNullText("<null>");
        builder.appendNull();
        assertEquals("<null>", builder.toString());
    }

    @Test
    public void testAppendObject() {
        builder.append((Object) "hello");
        assertEquals("hello", builder.toString());
        builder.append((Object) null);
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testClear() {
        builder.append("hello");
        builder.clear();
        assertEquals(0, builder.length());
        assertTrue(builder.isEmpty());
    }

    @Test
    public void testLengthAndSize() {
        assertEquals(0, builder.length());
        builder.append("hello");
        assertEquals(5, builder.length());
        assertEquals(5, builder.size());
    }

    @Test
    public void testSetLength() {
        builder.append("hello");
        builder.setLength(3);
        assertEquals("hel", builder.toString());
        builder.setLength(5);
        assertEquals("hel", builder.toString().substring(0, 3));
        assertEquals(5, builder.length());
    }

    @Test
    public void testSetLengthNegative() {
        try {
            builder.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCharAt() {
        builder.append("hello");
        assertEquals('h', builder.charAt(0));
        assertEquals('o', builder.charAt(4));
    }

    @Test
    public void testCharAtOutOfBounds() {
        builder.append("hello");
        try {
            builder.charAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
        try {
            builder.charAt(5);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteCharAt() {
        builder.append("hello");
        builder.deleteCharAt(0);
        assertEquals("ello", builder.toString());
        builder.deleteCharAt(3);
        assertEquals("ell", builder.toString());
    }

    @Test
    public void testDeleteCharAtOutOfBounds() {
        try {
            builder.deleteCharAt(0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testToCharArray() {
        builder.append("hello");
        char[] chars = builder.toCharArray();
        assertEquals(5, chars.length);
        assertEquals('h', chars[0]);
        assertEquals('o', chars[4]);
    }

    @Test
    public void testToCharArrayEmpty() {
        char[] chars = builder.toCharArray();
        assertEquals(0, chars.length);
    }

    @Test
    public void testGetChars() {
        builder.append("hello");
        char[] dest = new char[10];
        builder.getChars(dest);
        assertEquals('h', dest[0]);
        assertEquals('o', dest[4]);
    }

    @Test
    public void testGetCharsNullDestination() {
        builder.append("hello");
        try {
            builder.getChars(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testAppendSubstring() {
        builder.append("hello", 1, 3);
        assertEquals("ell", builder.toString());
    }

    @Test
    public void testAppendStartIndexOutOfBounds() {
        try {
            builder.append("hello", -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendLengthNegative() {
        try {
            builder.append("hello", 1, -2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendCharAt() {
        builder.append('a', 2);
        builder.append('b', 3);
        assertEquals("aabb", builder.toString());
    }

    @Test
    public void testAppendCharArray() {
        char[] chars = {'a', 'b', 'c'};
        builder.append(chars);
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testAppendNullCharArray() {
        builder.append((char[]) null);
        assertEquals("", builder.toString());
    }

    @Test
    public void testAppendSubCharArray() {
        char[] chars = {'a', 'b', 'c', 'd'};
        builder.append(chars, 1, 2);
        assertEquals("bc", builder.toString());
    }

    @Test
    public void testAppendStringBuffer() {
        builder.append(new StringBuffer("hello"));
        assertEquals("hello", builder.toString());
        builder.append((StringBuffer) null);
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testAppendStrBuilder() {
        StrBuilder other = new StrBuilder("world");
        builder.append(other);
        assertEquals("world", builder.toString());
    }

    @Test
    public void testAppendln() {
        builder.setNewLineText("\n");
        builder.appendln("hello");
        assertEquals("hello\n", builder.toString());
    }

    @Test
    public void testAppendAllArray() {
        Object[] array = {"a", "b", "c"};
        builder.appendAll(array);
        assertEquals("abc", builder.toString());
        builder.appendAll((Object[]) null);
        assertEquals("abc", builder.toString());
        builder.appendAll(new Object[0]);
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testAppendAllCollection() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("x");
        list.add("y");
        builder.appendAll(list);
        assertEquals("xy", builder.toString());
        builder.appendAll((java.util.Collection) null);
        assertEquals("xy", builder.toString());
    }

    @Test
    public void testAppendAllIterator() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("m");
        list.add("n");
        builder.appendAll(list.iterator());
        assertEquals("mn", builder.toString());
        builder.appendAll((java.util.Iterator) null);
        assertEquals("mn", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        Object[] array = {"a", "b", "c"};
        builder.appendWithSeparators(array, ",");
        assertEquals("a,b,c", builder.toString());
        builder.clear();
        builder.appendWithSeparators(new Object[0], ",");
        assertEquals("", builder.toString());
        builder.appendWithSeparators(new Object[] {null}, ",");
        assertEquals("null", builder.toString());
    }

    @Test
    public void testAppendSeparator() {
        builder.append("a");
        builder.appendSeparator(",");
        assertEquals("a,", builder.toString());
        builder.appendSeparator(";");
        assertEquals("a,;", builder.toString());
    }

    @Test
    public void testAppendSeparatorChar() {
        builder.append("a");
        builder.appendSeparator(',');
        assertEquals("a,", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        builder.appendFixedWidthPadLeft(123, 5, '0');
        assertEquals("00123", builder.toString());
        builder.appendFixedWidthPadLeft(123, 3, '0');
        assertEquals("00123123", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        builder.appendFixedWidthPadRight(123, 5, '0');
        assertEquals("12300", builder.toString());
        builder.appendFixedWidthPadRight(123, 3, '0');
        assertEquals("12300123", builder.toString());
    }

    @Test
    public void testInsertInt() {
        builder.append("hello");
        builder.insert(2, 99);
        assertEquals("he99llo", builder.toString());
    }

    @Test
    public void testInsertString() {
        builder.append("hello");
        builder.insert(2, "XY");
        assertEquals("heXYllo", builder.toString());
        builder.insert(0, "Z");
        assertEquals("ZheXYllo", builder.toString());
    }

    @Test
    public void testInsertAtEnd() {
        builder.append("hello");
        builder.insert(builder.length(), "!");
        assertEquals("hello!", builder.toString());
    }

    @Test
    public void testDeleteAllChar() {
        builder.append("hello hello");
        builder.deleteAll('l');
        assertEquals("heo heo", builder.toString());
        builder.deleteAll('x');
        assertEquals("heo heo", builder.toString());
    }

    @Test
    public void testDeleteFirstChar() {
        builder.append("hello hello");
        builder.deleteFirst('l');
        assertEquals("helo hello", builder.toString());
        builder.deleteFirst('x');
        assertEquals("helo hello", builder.toString());
    }

    @Test
    public void testDeleteAllString() {
        builder.append("hello world hello");
        builder.deleteAll("hello");
        assertEquals(" world ", builder.toString());
        builder.deleteAll("xx");
        assertEquals(" world ", builder.toString());
    }

    @Test
    public void testDeleteFirstString() {
        builder.append("hello world hello");
        builder.deleteFirst("hello");
        assertEquals(" world hello", builder.toString());
        builder.deleteFirst("xx");
        assertEquals(" world hello", builder.toString());
    }

    @Test
    public void testReplaceAll() {
        builder.append("hello world");
        builder.replaceAll("o", "0");
        assertEquals("hell0 w0rld", builder.toString());
        builder.replaceAll("xx", "yy");
        assertEquals("hell0 w0rld", builder.toString());
    }

    @Test
    public void testReplaceFirst() {
        builder.append("hello world");
        builder.replaceFirst("o", "0");
        assertEquals("hell0 world", builder.toString());
        builder.replaceFirst("xx", "yy");
        assertEquals("hell0 world", builder.toString());
    }

    @Test
    public void testReverse() {
        builder.append("hello");
        builder.reverse();
        assertEquals("olleh", builder.toString());
        builder.reverse();
        assertEquals("hello", builder.toString());
        builder.clear();
        builder.reverse();
        assertEquals("", builder.toString());
    }

    @Test
    public void testTrim() {
        builder.append("  hello  ");
        builder.trim();
        assertEquals("hello", builder.toString());
        builder.clear();
        builder.append("  ");
        builder.trim();
        assertEquals("", builder.toString());
    }

    @Test
    public void testStartsWith() {
        builder.append("hello");
        assertTrue(builder.startsWith("he"));
        assertFalse(builder.startsWith("lo"));
        assertFalse(builder.startsWith("hello world"));
        assertFalse(builder.startsWith(null));
    }

    @Test
    public void testEndsWith() {
        builder.append("hello");
        assertTrue(builder.endsWith("lo"));
        assertFalse(builder.endsWith("he"));
        assertFalse(builder.endsWith("hello world"));
        assertFalse(builder.endsWith(null));
    }

    @Test
    public void testSubstringStart() {
        builder.append("hello");
        assertEquals("lo", builder.substring(3));
        assertEquals("", builder.substring(5));
        assertEquals("hello", builder.substring(0));
    }

    @Test
    public void testSubstringStartEnd() {
        builder.append("hello");
        assertEquals("ell", builder.substring(1, 4));
        assertEquals("", builder.substring(2, 2));
        assertEquals("hello", builder.substring(0, 5));
    }

    @Test
    public void testLeftString() {
        builder.append("hello");
        assertEquals("he", builder.leftString(2));
        assertEquals("", builder.leftString(0));
        assertEquals("hello", builder.leftString(10));
        assertEquals("", builder.leftString(-1));
    }

    @Test
    public void testRightString() {
        builder.append("hello");
        assertEquals("lo", builder.rightString(2));
        assertEquals("", builder.rightString(0));
        assertEquals("hello", builder.rightString(10));
        assertEquals("", builder.rightString(-1));
    }

    @Test
    public void testMidString() {
        builder.append("hello");
        assertEquals("ell", builder.midString(1, 3));
        assertEquals("", builder.midString(5, 2));
        assertEquals("hello", builder.midString(0, 10));
        assertEquals("", builder.midString(-1, 2));
    }

    @Test
    public void testContainsChar() {
        builder.append("hello");
        assertTrue(builder.contains('e'));
        assertFalse(builder.contains('z'));
    }

    @Test
    public void testContainsString() {
        builder.append("hello");
        assertTrue(builder.contains("ell"));
        assertFalse(builder.contains("xyz"));
        assertFalse(builder.contains((String) null));
    }

    @Test
    public void testIndexOfChar() {
        builder.append("hello");
        assertEquals(1, builder.indexOf('e'));
        assertEquals(-1, builder.indexOf('z'));
        assertEquals(3, builder.indexOf('l', 1));
    }

    @Test
    public void testIndexOfString() {
        builder.append("hello world");
        assertEquals(2, builder.indexOf("llo"));
        assertEquals(-1, builder.indexOf("xyz"));
        assertEquals(-1, builder.indexOf("hello world and more"));
        assertEquals(0, builder.indexOf("hello"));
        String emptyStr = "";
        assertEquals(0, builder.indexOf(emptyStr));
    }

    @Test
    public void testIndexOfNullString() {
        builder.append("hello");
        assertEquals(-1, builder.indexOf((String) null));
    }

    @Test
    public void testLastIndexOfChar() {
        builder.append("hello");
        assertEquals(3, builder.lastIndexOf('l'));
        assertEquals(-1, builder.lastIndexOf('z'));
        assertEquals(-1, builder.lastIndexOf('l', 2));
    }

    @Test
    public void testLastIndexOfString() {
        builder.append("hello world");
        assertEquals(-1, builder.lastIndexOf("hello world more"));
        assertEquals(8, builder.lastIndexOf("or"));
        assertEquals(-1, builder.lastIndexOf("xyz"));
    }

    @Test
    public void testEquals() {
        StrBuilder other = new StrBuilder("hello");
        builder.append("hello");
        assertTrue(builder.equals(other));
        assertFalse(builder.equals(new StrBuilder("world")));
        assertFalse(builder.equals("hello"));
        assertTrue(builder.equals(builder));
    }

    @Test
    public void testHashCode() {
        builder.append("hello");
        assertEquals("hello".hashCode(), builder.hashCode());
        builder.append("");
        assertEquals("hello".hashCode(), builder.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("", builder.toString());
        builder.append("hello");
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testToStringBuffer() {
        builder.append("hello");
        assertEquals(new StringBuffer("hello").toString(), builder.toStringBuffer().toString());
    }

    @Test
    public void testAsReader() throws Exception {
        builder.append("hello");
        java.io.Reader reader = builder.asReader();
        assertNotNull(reader);
        char[] buf = new char[5];
        int count = reader.read(buf);
        assertEquals(5, count);
        assertEquals("hello", new String(buf));
    }

    @Test
    public void testAsWriter() {
        java.io.Writer writer = builder.asWriter();
        assertNotNull(writer);
        try {
            writer.write("hello");
            assertEquals("hello", builder.toString());
            writer.flush();
            writer.close();
        } catch (Exception e) {
            fail("Unexpected exception " + e.getMessage());
        }
    }

    @Test
    public void testAsTokenizer() {
        builder.append("hello");
        StrTokenizer tokenizer = builder.asTokenizer();
        assertNotNull(tokenizer);
    }

    @Test
    public void testAppendlnInt() {
        builder.setNewLineText("\n");
        builder.appendln(123);
        assertEquals("123\n", builder.toString());
    }

    @Test
    public void testAppendlnLong() {
        builder.setNewLineText("\n");
        builder.appendln(123456789L);
        assertEquals("123456789\n", builder.toString());
    }

    @Test
    public void testAppendlnFloat() {
        builder.setNewLineText("\n");
        builder.appendln(1.5f);
        assertTrue(builder.toString().contains("1.5"));
    }

    @Test
    public void testAppendlnDouble() {
        builder.setNewLineText("\n");
        builder.appendln(2.25d);
        assertTrue(builder.toString().contains("2.25"));
    }

    @Test
    public void testAppendlnBoolean() {
        builder.setNewLineText("\n");
        builder.appendln(true);
        assertEquals("true\n", builder.toString());
    }

    @Test
    public void testAppendlnChar() {
        builder.setNewLineText("\n");
        builder.appendln('a');
        assertEquals("a\n", builder.toString());
    }

    @Test
    public void testMinimizeCapacity() {
        builder = new StrBuilder(100);
        builder.append("hello");
        builder.minimizeCapacity();
        assertEquals(5, builder.capacity());
    }

    @Test
    public void testEnsureCapacity() {
        builder = new StrBuilder(5);
        builder.ensureCapacity(10);
        assertTrue(builder.capacity() >= 10);
    }

    @Test
    public void testInsertBoolean() {
        builder.append("hello");
        builder.insert(2, true);
        assertEquals("hetruello", builder.toString());
    }

    @Test
    public void testInsertChar() {
        builder.append("hello");
        builder.insert(2, 'X');
        assertEquals("heXllo", builder.toString());
    }

    @Test
    public void testInsertArray() {
        builder.append("hello");
        char[] chars = {'X', 'Y'};
        builder.insert(2, chars);
        assertEquals("heXYllo", builder.toString());
    }

    @Test
    public void testDeleteAllMatcher() {
        builder.append("hello world");
        StrMatcher matcher = StrMatcher.stringMatcher("o");
        builder.deleteAll(matcher);
        assertEquals("hell wrld", builder.toString());
    }

    @Test
    public void testDeleteFirstMatcher() {
        builder.append("hello hello");
        StrMatcher matcher = StrMatcher.stringMatcher("llo");
        builder.deleteFirst(matcher);
        assertEquals("he hello", builder.toString());
    }

    @Test
    public void testReplaceWithMatcher() {
        builder.append("hello world");
        StrMatcher matcher = StrMatcher.stringMatcher("o");
        builder.replaceAll(matcher, "0");
        assertEquals("hell0 w0rld", builder.toString());
    }

    @Test
    public void testIndexOfMatcher() {
        builder.append("hello world");
        StrMatcher matcher = StrMatcher.stringMatcher("o");
        assertEquals(4, builder.indexOf(matcher));
        assertEquals(-1, builder.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOfMatcher() {
        builder.append("hello world");
        StrMatcher matcher = StrMatcher.stringMatcher("o");
        assertEquals(7, builder.lastIndexOf(matcher));
    }

    @Test
    public void testIndexOfMatcherStart() {
        builder.append("hello hi hello");
        StrMatcher matcher = StrMatcher.stringMatcher("h");
        assertEquals(0, builder.indexOf(matcher, 0));
        assertEquals(6, builder.indexOf(matcher, 1));
        assertEquals(-1, builder.indexOf(matcher, 10));
    }

    @Test
    public void testLastIndexOfMatcherEnd() {
        builder.append("hello hi hello");
        StrMatcher matcher = StrMatcher.stringMatcher("h");
        assertEquals(11, builder.lastIndexOf(matcher, 20));
        assertEquals(11, builder.lastIndexOf(matcher, 10));
        assertEquals(6, builder.lastIndexOf(matcher, 7));
    }

    @Test
    public void testIndexOfStringWithStart() {
        builder.append("hello hello");
        assertEquals(0, builder.indexOf("llo", 0));
        assertEquals(6, builder.indexOf("llo", 1));
        assertEquals(-1, builder.indexOf("llo", 10));
        assertEquals(-1, builder.indexOf("xyz", 0));
    }

    @Test
    public void testLastIndexOfStringWithStart() {
        builder.append("hello hello");
        assertEquals(6, builder.lastIndexOf("llo", 9));
        assertEquals(6, builder.lastIndexOf("llo", 6));
        assertEquals(0, builder.lastIndexOf("ll", 6));
        assertEquals(-1, builder.lastIndexOf("xyz", 9));
    }

    @Test
    public void testLastIndexOfCharWithStart() {
        builder.append("hello hello");
        assertEquals(7, builder.lastIndexOf('l'));
        assertEquals(7, builder.lastIndexOf('l', 8));
        assertEquals(3, builder.lastIndexOf('l', 4));
        assertEquals(-1, builder.lastIndexOf('l', 2));
        assertEquals(-1, builder.lastIndexOf('z'));
        assertEquals(-1, builder.lastIndexOf('l', -1));
    }

    @Test
    public void testLastIndexOfCharInString() {
        builder.append("a");
        assertEquals(0, builder.lastIndexOf('a'));
        assertEquals(-1, builder.lastIndexOf('b'));
    }

    @Test
    public void testAppendAllIteratorNull() {
        builder.appendAll((Iterator) null);
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("p");
        list.add("q");
        builder.appendWithSeparators(list.iterator(), "-");
        assertEquals("p-q", builder.toString());
        builder.appendWithSeparators((Iterator) null, "-");
        assertEquals("p-q", builder.toString());
    }

    @Test
    public void testInsertIntoEmpty() {
        builder.insert(0, "abc");
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testInsertNegative() {
        try {
            builder.insert(-1, "abc");
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // expected
        }
    }
}