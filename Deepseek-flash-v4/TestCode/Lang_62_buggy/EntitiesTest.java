package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class EntitiesTest {
    private Entities entities;
    private StringWriter writer;

    @Before
    public void setUp() {
        entities = new Entities();
        entities.addEntities(Entities.BASIC_ARRAY);
        entities.addEntities(Entities.APOS_ARRAY);
        writer = new StringWriter();
    }

    @After
    public void tearDown() {
        entities = null;
        writer = null;
    }

    @Test
    public void testAddEntityAndName() {
        entities.addEntity("test", 12345);
        assertEquals("test", entities.name(12345));
        assertEquals(-1, entities.name(99999));
    }

    @Test
    public void testAddEntityAndValue() {
        entities.addEntity("test", 12345);
        assertEquals(12345, entities.value("test"));
        assertEquals(-1, entities.value("nonexistent"));
    }

    @Test
    public void testPredefinedEntities() {
        assertEquals("quot", entities.name(34));
        assertEquals(34, entities.value("quot"));
        assertEquals("amp", entities.name(38));
        assertEquals(38, entities.value("amp"));
        assertEquals("lt", entities.name(60));
        assertEquals(60, entities.value("lt"));
        assertEquals("gt", entities.name(62));
        assertEquals(62, entities.value("gt"));
        assertEquals("apos", entities.name(39));
        assertEquals(39, entities.value("apos"));
    }

    @Test
    public void testEscapeNormalString() {
        assertEquals("&lt;test&gt;&amp;&quot;&apos;", entities.escape("<test>\"'"));
    }

    @Test
    public void testEscapeWithNonAscii() {
        assertEquals("&#169;", entities.escape("\u00A9"));
    }

    @Test
    public void testEscapeNullAndEmpty() {
        assertNull(entities.escape(null));
        assertEquals("", entities.escape(""));
        assertEquals("hello", entities.escape("hello"));
    }

    @Test
    public void testEscapeWriter() throws IOException {
        entities.escape(writer, "a<b&amp;c");
        assertEquals("a&lt;b&amp;amp;c", writer.toString());
    }

    @Test
    public void testEscapeWriterNull() throws IOException {
        try {
            entities.escape(writer, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
        try {
            entities.escape((Writer) null, "test");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testUnescapeNormalString() {
        assertEquals("<test>\"'", entities.unescape("&lt;test&gt;&quot;&apos;"));
    }

    @Test
    public void testUnescapeNoAmpersand() {
        String input = "simple string";
        assertSame(input, entities.unescape(input));
    }

    @Test
    public void testUnescapeIncompleteSequence() {
        assertEquals("&", entities.unescape("&"));
        assertEquals("&amp", entities.unescape("&amp"));
        assertEquals("&#", entities.unescape("&#"));
        assertEquals("&#x", entities.unescape("&#x"));
        assertEquals("&#xZZZ", entities.unescape("&#xZZZ"));
    }

    @Test
    public void testUnescapeNumericEntities() {
        assertEquals("\u00A9", entities.unescape("&#169;"));
        assertEquals("\u00A9", entities.unescape("&#xA9;"));
        assertEquals("\u00A9", entities.unescape("&#Xa9;"));
    }

    @Test
    public void testUnescapeNumericInvalid() {
        assertEquals("&#-1;", entities.unescape("&#-1;"));
        assertEquals("&#999999999999999999;", entities.unescape("&#999999999999999999;"));
        assertEquals("&#xZZ;", entities.unescape("&#xZZ;"));
    }

    @Test
    public void testUnescapeMixedContent() {
        String input = "a &lt; b &amp; c &#169; d";
        assertEquals("a < b & c \u00A9 d", entities.unescape(input));
    }

    @Test
    public void testUnescapeWithSemiColonBeforeAmpersand() {
        assertEquals("&lt;test", entities.unescape("&lt;test"));
        assertEquals("&;test", entities.unescape("&;test"));
    }

    @Test
    public void testUnescapeEntityNotTerminated() {
        assertEquals("a&ltb", entities.unescape("a&ltb"));
    }

    @Test
    public void testUnescapeWriterWithContent() throws IOException {
        entities.unescape(writer, "a &lt; b");
        assertEquals("a < b", writer.toString());
    }

    @Test
    public void testUnescapeWriterEmpty() throws IOException {
        entities.unescape(writer, "");
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeWriterNullString() {
        try {
            entities.unescape(writer, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
        try {
            entities.unescape((Writer) null, "test");
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        } catch (IOException e) {
            fail("Unexpected IOException");
        }
    }

    @Test(expected = IOException.class)
    public void testEscapeWriterThrowsIOException() throws IOException {
        Writer failingWriter = new Writer() {
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Test exception");
            }
            public void flush() throws IOException {}
            public void close() throws IOException {}
        };
        entities.escape(failingWriter, "test text");
    }

    @Test(expected = IOException.class)
    public void testUnescapeWriterThrowsIOException() throws IOException {
        Writer failingWriter = new Writer() {
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("Test exception");
            }
            public void flush() throws IOException {}
            public void close() throws IOException {}
        };
        entities.unescape(failingWriter, "test &amp; text");
    }

    @Test
    public void testBinaryEntityMap() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("test1", 1000);
        map.add("test2", 2000);
        assertEquals("test1", map.name(1000));
        assertEquals("test2", map.name(2000));
        assertEquals(1000, map.value("test1"));
        assertEquals(2000, map.value("test2"));
        assertNull(map.name(999));
        assertEquals(-1, map.value("nonexistent"));
    }

    @Test
    public void testBinaryEntityMapWithGrowBy() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(5);
        for (int i = 0; i < 10; i++) {
            map.add("entity" + i, i);
        }
        for (int i = 0; i < 10; i++) {
            assertEquals("entity" + i, map.name(i));
            assertEquals(i, map.value("entity" + i));
        }
    }

    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("hashTest", 42);
        assertEquals("hashTest", map.name(42));
        assertEquals(42, map.value("hashTest"));
        assertNull(map.name(43));
        assertEquals(-1, map.value("nonexistent"));
    }

    @Test
    public void testLookupEntityMap() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("lookupTest", 5);
        assertEquals("lookupTest", map.name(5));
        assertEquals(5, map.value("lookupTest"));
        assertNull(map.name(6));
        assertEquals(-1, map.value("nonexistent"));
        map.add("lookupTest2", 1000);
        assertEquals("lookupTest2", map.name(1000));
        assertEquals(1000, map.value("lookupTest2"));
    }

    @Test
    public void testArrayEntityMap() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap();
        map.add("arrayTest", 77);
        assertEquals("arrayTest", map.name(77));
        assertEquals(77, map.value("arrayTest"));
        assertNull(map.name(78));
        assertEquals(-1, map.value("nonexistent"));
    }

    @Test
    public void testPartialEntityMap() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("primTest", 101);
        assertEquals("primTest", map.name(101));
        assertEquals(101, map.value("primTest"));
    }

    @Test
    public void testAddEntitiesArray() {
        String[][] newArray = {{"custom1", "100"}, {"custom2", "101"}};
        entities.addEntities(newArray);
        assertEquals("custom1", entities.name(100));
        assertEquals("custom2", entities.name(101));
        assertEquals(100, entities.value("custom1"));
        assertEquals(101, entities.value("custom2"));
    }

    @Test
    public void testStaticMaps() {
        assertEquals("lt", Entities.XML.name(60));
        assertEquals(60, Entities.XML.value("lt"));
        assertEquals(160, Entities.HTML32.value("nbsp"));
        assertEquals("copy", Entities.HTML32.name(169));
        assertEquals(8364, Entities.HTML40.value("euro"));
        assertEquals("Alpha", Entities.HTML40.name(913));
    }

    @Test
    public void testLargeValueRange() {
        entities.addEntity("large", 65536);
        assertEquals("large", entities.name(65536));
        assertEquals(65536, entities.value("large"));
    }

    @Test
    public void testDuplicateAddEntityOverwrites() {
        entities.addEntity("test", 100);
        entities.addEntity("test2", 100);
        assertEquals("test2", entities.name(100));
        assertEquals(100, entities.value("test2"));
    }
}