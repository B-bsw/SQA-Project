package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

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

    @Test
    public void testConstructors() {
        assertEquals(0, new StrBuilder().length());
        assertEquals(0, new StrBuilder(0).length());
        assertEquals(0, new StrBuilder(-5).length());
        assertEquals(0, new StrBuilder((String) null).length());
        assertEquals(3, new StrBuilder("abc").length());
        assertEquals("abc", new StrBuilder("abc").toString());
    }

    @Test
    public void testAppendString() {
        sb.append("Hello");
        sb.append(null);
        sb.append("");
        sb.append("World");
        assertEquals("HelloWorld", sb.toString());
    }

    @Test
    public void testAppendObject() {
        sb.append((Object) null);
        sb.append((Object) "test");
        assertNull(sb.getNullText());
        assertEquals("test", sb.toString());
    }

    @Test
    public void testAppendPrimitives() {
        sb.append(true);
        sb.append('c');
        sb.append(42);
        sb.append(123L);
        sb.append(1.5f);
        sb.append(2.5d);
        assertEquals("truec421231.52.5", sb.toString());
    }

    @Test
    public void testAppendWithSeparators() {
        sb.appendWithSeparators(new Object[] {"a", "b", "c"}, ",");
        assertEquals("a,b,c", sb.toString());
        sb.setLength(0);
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendPadding() {
        sb.appendPadding(5, '*');
        assertEquals("*****", sb.toString());
        sb.setLength(0);
        sb.appendPadding(0, '-');
        assertEquals("", sb.toString());
        sb.appendPadding(-1, '-');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft() {
        sb.appendFixedWidthPadLeft(123, 5, '0');
        assertEquals("00123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight() {
        sb.appendFixedWidthPadRight("ab", 5, '-');
        assertEquals("ab---", sb.toString());
    }

    @Test
    public void testInsert() {
        sb.append("ab");
        sb.insert(1, 'X');
        assertEquals("aXb", sb.toString());
        sb.insert(2, "YZ");
        assertEquals("aXYZb", sb.toString());
        sb.insert(0, false);
        assertEquals("falseaXYZb", sb.toString());
        sb.insert(0, true);
        assertEquals("truefalseaXYZb", sb.toString());
        sb.insert(0, 12);
        assertEquals("12truefalseaXYZb", sb.toString());
        sb.insert(0, 34L);
        assertEquals("3412truefalseaXYZb", sb.toString());
        sb.insert(0, 1.5f);
        assertEquals("1.53412truefalseaXYZb", sb.toString());
        sb.insert(0, 2.5d);
        assertEquals("2.51.53412truefalseaXYZb", sb.toString());
        sb.insert(5, "ARRAY");
        assertEquals("2.51.5ARRAY3412truefalseaXYZb", sb.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertStringIndexNegative() {
        sb.append("abc");
        sb.insert(-1, "x");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testInsertCharIndexOutOfBounds() {
        sb.append("abc");
        sb.insert(10, 'x');
    }

    @Test
    public void testDeleteAllChars() {
        sb.append("abca");
        sb.deleteAll('a');
        assertEquals("bc", sb.toString());
        sb.setLength(0);
        sb.append("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstChar() {
        sb.append("abca");
        sb.deleteFirst('a');
        assertEquals("bca", sb.toString());
        sb.deleteFirst('z');
        assertEquals("bca", sb.toString());
    }

    @Test
    public void testDeleteAllString() {
        sb.append("abab");
        sb.deleteAll("ab");
        assertEquals("", sb.toString());
        sb.append("abab");
        sb.deleteAll("xyz");
        assertEquals("abab", sb.toString());
    }

    @Test
    public void testDeleteFirstString() {
        sb.append("abab");
        sb.deleteFirst("ab");
        assertEquals("ab", sb.toString());
        sb.deleteFirst("zz");
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testDeleteMatcher() {
        sb.append("a1b2");
        sb.deleteAll(StrMatcher.spaceMatcher());
        sb.deleteAll(StrMatcher.charSetMatcher("12"));
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testReplace() {
        sb.append("hello world");
        sb.replace(6, 11, "java");
        assertEquals("hello java", sb.toString());
        sb.setLength(0);
        sb.append("abc");
        sb.replace(1, 3, "XY");
        assertEquals("aXY", sb.toString());
    }

    @Test
    public void testReplaceAllString() {
        sb.append("aXbXc");
        sb.replaceAll("X", "-");
        assertEquals("a-b-c", sb.toString());
    }

    @Test
    public void testReplaceFirstString() {
        sb.append("aXbXc");
        sb.replaceFirst("X", "-");
        assertEquals("a-bXc", sb.toString());
    }

    @Test
    public void testReverse() {
        sb.append("abc");
        sb.reverse();
        assertEquals("cba", sb.toString());
        sb.reverse();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim() {
        sb.append("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
        sb.setLength(0);
        sb.append("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testStartsAndEndsWith() {
        sb.append("hello");
        assertTrue(sb.startsWith("he"));
        assertFalse(sb.startsWith("lo"));
        assertTrue(sb.endsWith("lo"));
        assertFalse(sb.endsWith("he"));
        assertFalse(sb.startsWith("hello world"));
        sb.setLength(0);
        assertFalse(sb.startsWith("a"));
        assertFalse(sb.endsWith("a"));
    }

    @Test
    public void testSubstring() {
        sb.append("hello");
        assertEquals("ell", sb.substring(1, 4));
        assertEquals("hello", sb.substring(0));
        sb.setLength(0);
        sb.append("abc");
        assertEquals("", sb.substring(3, 3));
        assertEquals("bc", sb.substring(1, 3));
    }

    @Test
    public void testLeftRightMid() {
        sb.append("hello");
        assertEquals("", sb.leftString(0));
        assertEquals("", sb.leftString(-1));
        assertEquals("hello", sb.leftString(10));
        assertEquals("lo", sb.rightString(2));
        assertEquals("ell", sb.midString(1, 3));
        assertEquals("ello", sb.midString(1, 10));
        sb.setLength(0);
        sb.append("abc");
        assertEquals("", sb.midString(0, 0));
        assertEquals("", sb.midString(-1, 1));
        assertEquals("b", sb.midString(1, 1));
    }

    @Test
    public void testContains() {
        sb.append("hello");
        assertTrue(sb.contains('e'));
        assertFalse(sb.contains('z'));
        assertTrue(sb.contains("ell"));
        assertFalse(sb.contains("xyz"));
        assertTrue(sb.contains(StrMatcher.charSetMatcher("ho")));
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOf() {
        sb.append("abcabc");
        assertEquals(1, sb.indexOf('b'));
        assertEquals(-1, sb.indexOf('z', 0));
        assertEquals(4, sb.indexOf('b', 2));
        assertEquals(3, sb.indexOf("abc", 1));
        assertEquals(1, sb.indexOf(StrMatcher.charSetMatcher("b"), 0));
        assertEquals(-1, sb.indexOf((String) null, 0));
        sb.setLength(0);
        sb.append("a");
        assertEquals(0, sb.indexOf("a", 0));
        assertEquals(0, sb.lastIndexOf("a", 0));
        sb.setLength(0);
        sb.append("aaaa");
        assertEquals(3, sb.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOf() {
        sb.append("abca");
        assertEquals(0, sb.lastIndexOf('a'));
        assertEquals(3, sb.lastIndexOf('a', 3));
        assertEquals(-1, sb.lastIndexOf((String) null, 0));
        assertEquals(-1, sb.lastIndexOf("zz", 0));
        sb.setLength(0);
        sb.append("abc");
        assertEquals(2, sb.lastIndexOf('c', 2));
    }

    @Test
    public void testEqualsAndHashCode() {
        StrBuilder other = new StrBuilder("abc");
        sb.append("abc");
        assertTrue(sb.equals(other));
        assertFalse(sb.equals("abc"));
        assertFalse(sb.equals(new StrBuilder("abd")));
        assertEquals(sb.hashCode(), other.hashCode());
        sb.append('d');
        assertNotEquals(sb.hashCode(), other.hashCode());
    }

    @Test
    public void testEqualsIgnoreCase() {
        sb.append("abc");
        assertTrue(sb.equalsIgnoreCase(new StrBuilder("ABC")));
        sb.append('d');
        assertFalse(sb.equalsIgnoreCase(new StrBuilder("ABC")));
    }

    @Test
    public void testToStringAndBuffer() {
        sb.append("abc");
        assertEquals("abc", sb.toString());
        assertEquals("abc", sb.toStringBuffer().toString());
        assertEquals(0, new StrBuilder().toStringBuffer().length());
    }

    @Test
    public void testAsReaderWriterTokenizer() throws Exception {
        sb.append("hello world");
        java.io.Reader reader = sb.asReader();
        char[] cbuf = new char[5];
        int len = reader.read(cbuf, 0, 5);
        assertEquals(5, len);
        assertEquals("hello", new String(cbuf));
        assertEquals(0, reader.read(cbuf, 0, 0));
        assertEquals(-1, reader.read(cbuf, 5, 0));
        assertTrue(reader.ready());
        reader.skip(100);
        assertEquals(-1, reader.read());

        java.io.Writer writer = sb.asWriter();
        writer.write("extra");
        writer.flush();
        writer.close();

        StrTokenizer tokenizer = sb.asTokenizer();
        assertEquals("hello", tokenizer.nextToken());
        assertEquals("worldextra", tokenizer.nextToken());
        assertEquals("hello", sb.asTokenizer().getContent());
    }

    @Test
    public void testLengthAndCapacity() {
        sb.append("abc");
        assertEquals(3, sb.length());
        assertEquals(0, sb.size());
        assertTrue(sb.capacity() >= 3);
        sb.ensureCapacity(100);
        assertTrue(sb.capacity() >= 100);
        sb.minimizeCapacity();
        assertTrue(sb.capacity() <= 100);
    }

    @Test
    public void testSetLengthAndCharAt() {
        sb.append("abc");
        sb.setLength(5);
        assertEquals(5, sb.length());
        sb.setLength(2);
        assertEquals("ab", sb.toString());
        sb.setLength(-1);
        assertEquals(2, sb.length());
        sb.setCharAt(0, 'X');
        assertEquals("Xb", sb.toString());
        sb.deleteCharAt(1);
        assertEquals("X", sb.toString());
        assertEquals(0, sb.indexOf('Q'));
    }

    @Test
    public void testToCharArray() {
        sb.append("abc");
        assertArrayEquals(new char[] {'a','b','c'}, sb.toCharArray());
        assertArrayEquals(new char[] {'b','c'}, sb.toCharArray(1, 3));
        assertEquals(0, sb.toCharArray(0, 0).length);
    }

    @Test
    public void testGetChars() {
        sb.append("abc");
        char[] dest = new char[3];
        assertArrayEquals(new char[] {'a','b','c'}, sb.getChars(dest));
        char[] dest2 = new char[2];
        assertArrayEquals(new char[] {'a','b'}, sb.getChars(dest2));
        try {
            sb.getChars(null);
            fail();
        } catch (NullPointerException e) {}
    }

    @Test
    public void testClearAndIsEmpty() {
        assertTrue(sb.isEmpty());
        sb.append("a");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
        sb.setLength(0);
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testNullText() {
        sb.setNullText("<null>");
        sb.append((Object) null);
        assertEquals("<null>", sb.toString());
        sb.setNullText("");
        sb.append((Object) null);
        assertEquals("<null>", sb.toString());
    }
}