package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

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
        assertEquals(0, builder.length());
        assertEquals("", builder.toString());
        assertTrue(builder.isEmpty());
    }

    @Test
    public void testConstructorWithInitialCapacity() {
        StrBuilder sb = new StrBuilder(10);
        assertEquals(10, sb.capacity());
        assertEquals("", sb.toString());
    }

    @Test
    public void testConstructorWithZeroInitialCapacity() {
        StrBuilder sb = new StrBuilder(0);
        assertEquals(0, sb.capacity());
    }

    @Test
    public void testConstructorWithNullString() {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals(0, sb.capacity());
    }

    @Test
    public void testConstructorWithString() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testSetNewLineTextNormal() {
        builder.setNewLineText("\n");
        assertEquals("\n", builder.getNewLineText());
    }

    @Test
    public void testSetNewLineTextNull() {
        builder.setNewLineText("\r\n");
        builder.setNewLineText(null);
        assertNull(builder.getNewLineText());
    }

    @Test
    public void testSetNullTextEmptyString() {
        builder.setNullText("");
        assertEquals("", builder.getNullText());
    }

    @Test
    public void testSetNullTextNull() {
        builder.setNullText(null);
        assertNull(builder.getNullText());
    }

    @Test
    public void testSetNullTextNormal() {
        builder.setNullText("<null>");
        assertEquals("<null>", builder.getNullText());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetLengthNegative() {
        builder.setLength(-1);
    }

    @Test
    public void testSetLengthShorter() {
        builder.append("hello");
        builder.setLength(3);
        assertEquals(3, builder.length());
        assertEquals("hel", builder.toString());
    }

    @Test
    public void testSetLengthLonger() {
        builder.append("hi");
        builder.setLength(5);
        assertEquals(5, builder.length());
        assertEquals(0, builder.charAt(2));
        assertEquals(0, builder.charAt(4));
    }

    @Test
    public void testEnsureCapacityNormal() {
        StrBuilder sb = new StrBuilder(5);
        sb.append("longstring");
        int oldCap = sb.capacity();
        sb.ensureCapacity(oldCap + 10);
        assertTrue(sb.capacity() >= oldCap + 10);
    }

    @Test
    public void testEnsureCapacitySmaller() {
        StrBuilder sb = new StrBuilder(20);
        int oldCap = sb.capacity();
        sb.ensureCapacity(5);
        assertEquals(oldCap, sb.capacity());
    }

    @Test
    public void testMinimizeCapacityLessThanLength() {
        StrBuilder sb = new StrBuilder(50);
        for (int i = 0; i < 10; i++) {
            sb.append('a');
        }
        sb.minimizeCapacity();
        assertTrue(sb.capacity() >= sb.length());
    }

    @Test
    public void testClear() {
        builder.append("hello");
        StrBuilder result = builder.clear();
        assertEquals(0, builder.length());
        assertSame(builder, result);
    }

    @Test
    public void testCharAtNormal() {
        builder.append("abc");
        assertEquals('a', builder.charAt(0));
        assertEquals('c', builder.charAt(2));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCharAtNegativeIndex() {
        builder.append("abc");
        builder.charAt(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCharAtGreaterThanLength() {
        builder.append("abc");
        builder.charAt(3);
    }

    @Test
    public void testSetCharAtNormal() {
        builder.append("abc");
        builder.setCharAt(1, 'X');
        assertEquals("aXc", builder.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetCharAtInvalidIndex() {
        builder.append("abc");
        builder.setCharAt(5, 'X');
    }

    @Test
    public void testDeleteCharAtNormal() {
        builder.append("abc");
        builder.deleteCharAt(1);
        assertEquals("ac", builder.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testDeleteCharAtInvalid() {
        builder.append("ab");
        builder.deleteCharAt(2);
    }

    @Test
    public void testToCharArrayEmpty() {
        assertArrayEquals(new char[0], builder.toCharArray());
    }

    @Test
    public void testToCharArrayNormal() {
        builder.append("abc");
        assertArrayEquals(new char[] {'a', 'b', 'c'}, builder.toCharArray());
    }

    @Test
    public void testToCharArrayWithRange() {
        builder.append("abcdef");
        assertArrayEquals(new char[] {'c', 'd'}, builder.toCharArray(2, 4));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testToCharArrayInvalidRange() {
        builder.append("abc");
        builder.toCharArray(2, 5);
    }

    @Test
    public void testGetCharsDestination() {
        builder.append("abc");
        char[] dest = new char[5];
        char[] result = builder.getChars(dest);
        assertSame(dest, result);
        assertEquals('a', dest[0]);
        assertEquals('b', dest[1]);
        assertEquals('c', dest[2]);
    }

    @Test
    public void testGetCharsNullDestination() {
        builder.append("abc");
        char[] result = builder.getChars((char[]) null);
        assertNotNull(result);
        assertArrayEquals(new char[] {'a', 'b', 'c'}, result);
    }

    @Test
    public void testAppendNewLineWithNullNewLine() {
        builder.appendNewLine();
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendNewLineWithNewLine() {
        builder.setNewLineText("\r\n");
        builder.append("a");
        builder.appendNewLine();
        assertEquals("a\r\n", builder.toString());
    }

    @Test
    public void testAppendNullWithNullText() {
        builder.appendNull();
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendNullWithNullTextSet() {
        builder.setNullText("<null>");
        builder.append("x").appendNull();
        assertEquals("x<null>", builder.toString());
    }

    @Test
    public void testAppendNullObject() {
        builder.append((Object) null);
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendObject() {
        Object obj = new Object() {
            public String toString() { return "test"; }
        };
        builder.append(obj);
        assertEquals("test", builder.toString());
    }

    @Test
    public void testAppendStringBasic() {
        builder.append("hello");
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testAppendStringWithOffset() {
        builder.append("hello world", 6, 5);
        assertEquals("world", builder.toString());
    }

    @Test
    public void testAppendStringInvalidOffset() {
        try {
            builder.append("hello", -1, 3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendStringBuffer() {
        builder.append(new StringBuffer("hello"));
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testAppendStrBuilder() {
        builder.append("hello");
        StrBuilder sb2 = new StrBuilder(" world");
        builder.append(sb2);
        assertEquals("hello world", builder.toString());
    }

    @Test
    public void testAppendCharArray() {
        builder.append(new char[] {'a', 'b', 'c'});
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testAppendNullCharArray() {
        builder.append((char[]) null);
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendCharArrayWithRange() {
        builder.append(new char[] {'a', 'b', 'c', 'd'}, 1, 2);
        assertEquals("bc", builder.toString());
    }

    @Test
    public void testAppendBooleanTrue() {
        builder.append(true);
        assertEquals("true", builder.toString());
    }

    @Test
    public void testAppendBooleanFalse() {
        builder.append(false);
        assertEquals("false", builder.toString());
    }

    @Test
    public void testAppendChar() {
        builder.append('a');
        assertEquals("a", builder.toString());
    }

    @Test
    public void testAppendInt() {
        builder.append(42);
        assertEquals("42", builder.toString());
    }

    @Test
    public void testAppendLong() {
        builder.append(10000000000L);
        assertEquals("10000000000", builder.toString());
    }

    @Test
    public void testAppendFloat() {
        builder.append(1.5f);
        assertEquals("1.5", builder.toString());
    }

    @Test
    public void testAppendDouble() {
        builder.append(2.25d);
        assertEquals("2.25", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsArray() {
        builder.appendWithSeparators(new Object[] {"a", "b", "c"}, ",");
        assertEquals("a,b,c", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullArray() {
        builder.appendWithSeparators((Object[]) null, ",");
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendWithSeparatorsCollection() {
        java.util.Collection<String> coll = new java.util.ArrayList<String>();
        coll.add("x");
        coll.add("y");
        builder.appendWithSeparators(coll, "-");
        assertEquals("x-y", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullCollection() {
        builder.appendWithSeparators((Collection) null, "-");
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendWithSeparatorsIterator() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        builder.appendWithSeparators(list.iterator(), ";");
        assertEquals("a;b", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullIterator() {
        builder.appendWithSeparators((Iterator) null, ";");
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendPaddingNormal() {
        builder.appendPadding(3, '*');
        assertEquals("***", builder.toString());
    }

    @Test
    public void testAppendPaddingZero() {
        builder.appendPadding(0, '*');
        assertEquals(0, builder.length());
    }

    @Test
    public void testAppendPaddingNegative() {
        builder.append("x");
        builder.appendPadding(-2, '*');
        assertEquals("x", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftWidthBigger() {
        builder.appendFixedWidthPadLeft(5, 4, '0');
        assertEquals("0005", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftWidthSmaller() {
        builder.appendFixedWidthPadLeft(12345, 3, '0');
        assertEquals("12345", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightWidthBigger() {
        builder.appendFixedWidthPadRight(7, 3, '0');
        assertEquals("700", builder.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightWidthSmaller() {
        builder.appendFixedWidthPadRight(12345, 2, '0');
        assertEquals("12345", builder.toString());
    }

    @Test
    public void testInsertObject() {
        builder.append("hello world");
        builder.insert(5, (Object) "X");
        assertEquals("helloX world", builder.toString());
    }

    @Test
    public void testInsertNullObject() {
        builder.append("abc");
        builder.insert(1, (Object) null);
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testInsertStringNormal() {
        builder.append("ac");
        builder.insert(1, "b");
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        builder.append("ac");
        builder.insert(1, "");
        assertEquals("ac", builder.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertStringInvalidIndex() {
        builder.append("ac");
        builder.insert(-1, "b");
    }

    @Test
    public void testInsertCharArray() {
        builder.append("ad");
        builder.insert(1, new char[] {'b', 'c'});
        assertEquals("abcd", builder.toString());
    }

    @Test
    public void testInsertCharArrayWithRange() {
        builder.append("ad");
        builder.insert(1, new char[] {'x', 'b', 'c', 'y'}, 1, 2);
        assertEquals("abcd", builder.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertCharArrayInvalid() {
        builder.append("ad");
        builder.insert(1, new char[] {'b'}, 0, 5);
    }

    @Test
    public void testInsertBooleanTrue() {
        builder.append("XZ");
        builder.insert(1, true);
        assertEquals("XtrueZ", builder.toString());
    }

    @Test
    public void testInsertBooleanFalse() {
        builder.append("XZ");
        builder.insert(1, false);
        assertEquals("XfalseZ", builder.toString());
    }

    @Test
    public void testInsertChar() {
        builder.append("ab");
        builder.insert(1, 'X');
        assertEquals("aXb", builder.toString());
    }

    @Test
    public void testInsertInt() {
        builder.append("a");
        builder.insert(1, 42);
        assertEquals("a42", builder.toString());
    }

    @Test
    public void testInsertLong() {
        builder.append("a");
        builder.insert(1, 100L);
        assertEquals("a100", builder.toString());
    }

    @Test
    public void testDeleteAllChar() {
        builder.append("abacad");
        builder.deleteAll('a');
        assertEquals("bcd", builder.toString());
    }

    @Test
    public void testDeleteAllCharNotFound() {
        builder.append("hello");
        builder.deleteAll('x');
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testDeleteFirstChar() {
        builder.append("abacad");
        builder.deleteFirst('a');
        assertEquals("bacad", builder.toString());
    }

    @Test
    public void testDeleteFirstCharNotFound() {
        builder.append("hello");
        builder.deleteFirst('x');
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testDeleteAllString() {
        builder.append("hello world hello");
        builder.deleteAll("hello");
        assertEquals(" world ", builder.toString());
    }

    @Test
    public void testDeleteAllStringNull() {
        builder.append("hello");
        builder.deleteAll((String) null);
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testDeleteAllStringEmpty() {
        builder.append("abc");
        builder.deleteAll("");
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testDeleteFirstString() {
        builder.append("hello world hello");
        builder.deleteFirst("hello");
        assertEquals(" world hello", builder.toString());
    }

    @Test
    public void testDeleteFirstStringNotFound() {
        builder.append("abc");
        builder.deleteFirst("zz");
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testReplaceAllString() {
        builder.append("hello world");
        builder.replaceAll("world", "java");
        assertEquals("hello java", builder.toString());
    }

    @Test
    public void testReplaceAllStringNullSearch() {
        builder.append("hello");
        builder.replaceAll(null, "x");
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testReplaceFirstString() {
        builder.append("one two one");
        builder.replaceFirst("one", "1");
        assertEquals("1 two one", builder.toString());
    }

    @Test
    public void testReplaceFirstMatcher() {
        builder.append("hello world");
        builder.replaceFirst(StrMatcher.stringMatcher("o"), "0");
        assertEquals("hell0 world", builder.toString());
    }

    @Test
    public void testReplaceAllMatcher() {
        builder.append("hello world");
        builder.replaceAll(StrMatcher.stringMatcher("o"), "0");
        assertEquals("hell0 w0rld", builder.toString());
    }

    @Test
    public void testReverse() {
        builder.append("abc");
        builder.reverse();
        assertEquals("cba", builder.toString());
    }

    @Test
    public void testReverseEmpty() {
        builder.reverse();
        assertEquals("", builder.toString());
    }

    @Test
    public void testTrim() {
        builder.append("  hello  ");
        builder.trim();
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testTrimOnlySpaces() {
        builder.append("   ");
        builder.trim();
        assertEquals("", builder.toString());
    }

    @Test
    public void testTrimEmpty() {
        builder.trim();
        assertEquals("", builder.toString());
    }

    @Test
    public void testStartsWithNormal() {
        builder.append("hello world");
        assertTrue(builder.startsWith("hello"));
        assertFalse(builder.startsWith("world"));
        assertFalse(builder.startsWith("helloo"));
    }

    @Test
    public void testStartsWithNull() {
        builder.append("abc");
        assertFalse(builder.startsWith(null));
    }

    @Test
    public void testStartsWithLengthBigger() {
        builder.append("abc");
        assertFalse(builder.startsWith("abcd"));
    }

    @Test
    public void testEndsWithNormal() {
        builder.append("hello world");
        assertTrue(builder.endsWith("world"));
        assertFalse(builder.endsWith("hello"));
        assertFalse(builder.endsWith("dworld"));
    }

    @Test
    public void testEndsWithNull() {
        builder.append("abc");
        assertFalse(builder.endsWith(null));
    }

    @Test
    public void testEndsWithLengthBigger() {
        builder.append("abc");
        assertFalse(builder.endsWith("abcd"));
    }

    @Test
    public void testSubstringNormal() {
        builder.append("hello world");
        assertEquals("hello", builder.substring(0, 5));
        assertEquals("world", builder.substring(6));
    }

    @Test
    public void testSubstringStartOnly() {
        builder.append("hello");
        assertEquals("lo", builder.substring(3));
    }

    @Test
    public void testLeftString() {
        builder.append("hello");
        assertEquals("he", builder.leftString(2));
        assertEquals("hello", builder.leftString(10));
        assertEquals("", builder.leftString(0));
        assertEquals("", builder.leftString(-1));
    }

    @Test
    public void testRightString() {
        builder.append("hello");
        assertEquals("lo", builder.rightString(2));
        assertEquals("", builder.rightString(0));
    }

    @Test
    public void testMidString() {
        builder.append("hello world");
        assertEquals("lo", builder.midString(3, 2));
        assertEquals("world", builder.midString(6, 10));
        assertEquals("", builder.midString(10, 3));
        assertEquals("", builder.midString(-1, 3));
        assertEquals("", builder.midString(2, -1));
    }

    @Test
    public void testContainsChar() {
        builder.append("hello");
        assertTrue(builder.contains('e'));
        assertFalse(builder.contains('x'));
    }

    @Test
    public void testContainsString() {
        builder.append("hello world");
        assertTrue(builder.contains("world"));
        assertFalse(builder.contains("xyz"));
    }

    @Test
    public void testContainsNullString() {
        builder.append("hello");
        assertFalse(builder.contains((String) null));
    }

    @Test
    public void testContainsMatcher() {
        builder.append("hello world");
        assertTrue(builder.contains(StrMatcher.stringMatcher("world")));
        assertFalse(builder.contains(StrMatcher.stringMatcher("xyz")));
    }

    @Test
    public void testIndexOfChar() {
        builder.append("hello");
        assertEquals(1, builder.indexOf('e'));
        assertEquals(-1, builder.indexOf('x'));
    }

    @Test
    public void testIndexOfCharFromIndex() {
        builder.append("hello");
        assertEquals(0, builder.indexOf('h', 0));
        assertEquals(-1, builder.indexOf('h', 1));
        assertEquals(-1, builder.indexOf('x', 1));
        assertEquals(-1, builder.indexOf('h', 5));
    }

    @Test
    public void testIndexOfString() {
        builder.append("hello world");
        assertEquals(6, builder.indexOf("world"));
        assertEquals(-1, builder.indexOf("xyz"));
    }

    @Test
    public void testIndexOfStringFromIndex() {
        builder.append("hello hello");
        assertEquals(6, builder.indexOf("hello", 1));
        assertEquals(-1, builder.indexOf("hello", 8));
        assertEquals(0, builder.indexOf("", 0));
        assertEquals(2, builder.indexOf("", 2));
        assertEquals(-1, builder.indexOf(null, 0));
        assertEquals(-1, builder.indexOf("", 10));
    }

    @Test
    public void testIndexOfMatcher() {
        builder.append("hello world");
        assertEquals(0, builder.indexOf(StrMatcher.stringMatcher("hello")));
        assertEquals(6, builder.indexOf(StrMatcher.stringMatcher("world")));
        assertEquals(-1, builder.indexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOfChar() {
        builder.append("hello hello");
        assertEquals(6, builder.lastIndexOf('h'));
        assertEquals(-1, builder.lastIndexOf('x'));
    }

    @Test
    public void testLastIndexOfString() {
        builder.append("hello world hello");
        assertEquals(12, builder.lastIndexOf("hello"));
        assertEquals(-1, builder.lastIndexOf("xyz"));
    }

    @Test
    public void testLastIndexOfStringFromIndex() {
        builder.append("hello hello");
        assertEquals(6, builder.lastIndexOf("hello", 10));
        assertEquals(0, builder.lastIndexOf("hello", 6));
        assertEquals(-1, builder.lastIndexOf("hello", 4));
        assertEquals(-1, builder.lastIndexOf((String) null, 0));
    }

    @Test
    public void testLastIndexOfMatcher() {
        builder.append("hello world");
        assertEquals(6, builder.lastIndexOf(StrMatcher.stringMatcher("o"), 10));
        assertEquals(-1, builder.lastIndexOf((StrMatcher) null, 0));
    }

    @Test
    public void testAsTokenizer() {
        builder.append("hello world");
        StrTokenizer tokenizer = builder.asTokenizer();
        assertNotNull(tokenizer);
        assertArrayEquals(new String[] {"hello", "world"}, tokenizer.getTokenArray());
    }

    @Test
    public void testAsReader() throws IOException {
        builder.append("hello");
        Reader reader = builder.asReader();
        assertEquals('h', reader.read());
        assertEquals('e', reader.read());
        reader.close();
    }

    @Test
    public void testReaderReadWithBuffer() throws IOException {
        builder.append("hello");
        Reader reader = builder.asReader();
        char[] buf = new char[3];
        int len = reader.read(buf, 0, 3);
        assertEquals(3, len);
        assertEquals('h', buf[0]);
        assertEquals('i', buf[1]);
        reader.close();
    }

    @Test
    public void testReaderSkip() throws IOException {
        builder.append("hello");
        Reader reader = builder.asReader();
        assertEquals(2L, reader.skip(2));
        assertEquals('l', reader.read());
        assertEquals(10L, reader.skip(10));
        assertEquals(-1, reader.read());
        reader.close();
    }

    @Test
    public void testReaderReady() throws IOException {
        builder.append("hi");
        Reader reader = builder.asReader();
        assertTrue(reader.ready());
        reader.skip(2);
        assertFalse(reader.ready());
        reader.close();
    }

    @Test
    public void testReaderMarkReset() throws IOException {
        builder.append("hello");
        Reader reader = builder.asReader();
        reader.read();
        reader.mark(10);
        reader.read();
        reader.read();
        reader.reset();
        assertEquals('e', reader.read());
        reader.close();
    }

    @Test
    public void testAsWriter() throws IOException {
        Writer writer = builder.asWriter();
        writer.write('a');
        writer.write(new char[] {'b', 'c'});
        writer.write("de");
        writer.flush();
        writer.close();
        assertEquals("abcde", builder.toString());
    }

    @Test
    public void testEqualsIgnoreCaseSameObject() {
        builder.append("hello");
        assertTrue(builder.equalsIgnoreCase(builder));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentCase() {
        StrBuilder other = new StrBuilder("HELLO");
        builder.append("hello");
        assertTrue(builder.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsIgnoreCaseDifferentContent() {
        StrBuilder other = new StrBuilder("world");
        builder.append("hello");
        assertFalse(builder.equalsIgnoreCase(other));
    }

    @Test
    public void testEqualsSameObject() {
        builder.append("hello");
        assertTrue(builder.equals(builder));
    }

    @Test
    public void testEqualsDifferentObject() {
        builder.append("hello");
        StrBuilder other = new StrBuilder("hello");
        assertTrue(builder.equals(other));
    }

    @Test
    public void testEqualsNotInstanceOf() {
        builder.append("hello");
        assertFalse(builder.equals("hello"));
    }

    @Test
    public void testEqualsNull() {
        builder.append("hello");
        assertFalse(builder.equals((Object) null));
    }

    @Test
    public void testEqualsDifferentContent() {
        builder.append("hello");
        assertFalse(builder.equals(new StrBuilder("world")));
    }

    @Test
    public void testHashCode() {
        builder.append("hello");
        StrBuilder other = new StrBuilder("hello");
        assertEquals(other.hashCode(), builder.hashCode());
    }

    @Test
    public void testToStringEmpty() {
        assertEquals("", builder.toString());
    }

    @Test
    public void testToStringNormal() {
        builder.append("hello");
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testToStringBuffer() {
        builder.append("hello");
        StringBuffer sb = builder.toStringBuffer();
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testInsertStringWithBufferGrow() {
        builder.append("a");
        builder.insert(1, "longstring");
        assertEquals("alongstring", builder.toString());
    }

    @Test
    public void testInsertCharWithBufferGrow() {
        builder.append("a");
        builder.insert(1, 'x');
        assertEquals("ax", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionEmpty() {
        java.util.Collection<String> coll = new java.util.ArrayList<String>();
        builder.appendWithSeparators(coll, ",");
        assertEquals(0, builder.length());
    }

    @Test
    public void testTrimMiddleNoChange() {
        builder.append("hello");
        builder.trim();
        assertEquals("hello", builder.toString());
    }

    @Test
    public void testStartsWithNullSameLength() {
        builder.append("");
        assertFalse(builder.startsWith(null));
    }

    @Test
    public void testEndsWithNullSameLength() {
        builder.append("");
        assertFalse(builder.endsWith(null));
    }

    @Test
    public void testInsertWithInvalidIndex() {
        builder.append("abc");
        try {
            builder.insert(10, "x");
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void testAppendWithSeparatorsNullSeparatorArray() {
        builder.appendWithSeparators(new Object[] {"a", "b"}, null);
        assertEquals("ab", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullSeparatorCollection() {
        java.util.Collection<String> coll = new java.util.ArrayList<String>();
        coll.add("a");
        coll.add("b");
        builder.appendWithSeparators(coll, null);
        assertEquals("ab", builder.toString());
    }

    @Test
    public void testAppendWithSeparatorsNullSeparatorIterator() {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        builder.appendWithSeparators(list.iterator(), null);
        assertEquals("ab", builder.toString());
    }

    @Test
    public void testReverseWithSingleChar() {
        builder.append("a");
        builder.reverse();
        assertEquals("a", builder.toString());
    }

    @Test
    public void testSubstringAll() {
        builder.append("hello");
        assertEquals("hello", builder.substring(0));
    }

    @Test
    public void testLeftStringExactSize() {
        builder.append("hello");
        assertEquals("hello", builder.leftString(5));
    }
}