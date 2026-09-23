package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import static org.junit.Assert.*;

public class EntitiesTest {
    private Entities entities;
    
    @Before
    public void setUp() {
        entities = new Entities();
        entities.addEntities(Entities.BASIC_ARRAY);
    }
    
    @Test
    public void testAddEntitiesWithBasicArray() {
        assertEquals("&lt;", entities.escape("<"));
        assertEquals("&amp;", entities.escape("&"));
        assertEquals("&quot;", entities.escape("\""));
        assertEquals("&gt;", entities.escape(">"));
    }
    
    @Test
    public void testAddEntityAndEscape() {
        entities.addEntity("test", 0x1234);
        assertEquals("&#4660;", entities.escape("\u1234"));
        assertEquals(0x1234, entities.entityValue("test"));
        assertEquals("test", entities.entityName(0x1234));
    }
    
    @Test
    public void testEntityNameForUnknownValue() {
        assertEquals(-1, entities.entityValue("unknown"));
        assertEquals(null, entities.entityName(99999));
    }
    
    @Test
    public void testEscapeWithSpecialCharacters() {
        assertEquals("hello &lt;world&gt; &amp; test", entities.escape("hello <world> & test"));
    }
    
    @Test
    public void testEscapeWithNullInput() {
        assertNull(entities.escape(null));
    }
    
    @Test
    public void testUnescape() {
        assertEquals("<", entities.unescape("&lt;"));
        assertEquals("&", entities.unescape("&amp;"));
        assertEquals("\"", entities.unescape("&quot;"));
        assertEquals(">", entities.unescape("&gt;"));
        assertEquals("'", entities.unescape("&#39;"));
    }
    
    @Test
    public void testUnescapeWithHexEntity() {
        assertEquals("\u1234", entities.unescape("&#x1234;"));
        assertEquals("\uABCD", entities.unescape("&#Xabcd;"));
    }
    
    @Test
    public void testUnescapeWithNumericEntity() {
        assertEquals("\u20AC", entities.unescape("&#8364;"));
        assertEquals("\u20AC", entities.unescape("&#x20AC;"));
    }
    
    @Test
    public void testUnescapeWithNoEntity() {
        String input = "plain text";
        assertEquals(input, entities.unescape(input));
    }
    
    @Test
    public void testUnescapeWithNullInput() {
        assertNull(entities.unescape(null));
    }
    
    @Test
    public void testEscapeWithWriterMethod() throws IOException {
        StringWriter writer = new StringWriter();
        entities.escape(writer, "<test>");
        assertEquals("&lt;test&gt;", writer.toString());
    }
    
    @Test
    public void testEscapeWithWriterAndNullString() throws IOException {
        StringWriter writer = new StringWriter();
        try {
            entities.escape(writer, null);
        } catch (NullPointerException e) {
            fail("Should not throw NPE for null string");
        }
    }
    
    @Test
    public void testUnescapeWithWriter() throws IOException {
        StringWriter writer = new StringWriter();
        entities.unescape(writer, "&lt;test&gt;");
        assertEquals("<test>", writer.toString());
    }
    
    @Test
    public void testEscapeWithSurrogatePair() {
        entities.addEntity("pair", 0x12345);
        assertEquals("&#74565;", entities.escape("\ud808\udf45"));
    }
    
    @Test
    public void testUnescapeWithUpperHex() {
        assertEquals("\u1234", entities.unescape("&#x1234;"));
    }
    
    @Test
    public void testBinaryEntityMap() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap();
        map.add("test", 123);
        assertEquals("test", map.name(123));
        assertEquals(123, map.value("test"));
        assertNull(map.name(999));
        assertEquals(-1, map.value("unknown"));
    }
    
    @Test
    public void testBinaryEntityMapExpansion() {
        Entities.BinaryEntityMap map = new Entities.BinaryEntityMap(50);
        for (int i = 0; i < 100; i++) {
            map.add("key" + i, i);
        }
        for (int i = 0; i < 100; i++) {
            assertEquals(i, map.value("key" + i));
        }
    }
    
    @Test
    public void testHashEntityMap() {
        Entities.HashEntityMap map = new Entities.HashEntityMap();
        map.add("name", 42);
        assertEquals("name", map.name(42));
        map.add("name2", 42);
        assertEquals("name2", map.name(42));
        assertEquals(42, map.value("name2"));
    }
    
    @Test
    public void testPrimitiveEntityMap() {
        Entities.PrimitiveEntityMap map = new Entities.PrimitiveEntityMap();
        map.add("test", 123);
        assertEquals("test", map.name(123));
        assertEquals(123, map.value("test"));
        assertNull(map.name(999));
        assertEquals(-1, map.value("unknown"));
    }
    
    @Test
    public void testLookupEntityMap() {
        Entities.LookupEntityMap map = new Entities.LookupEntityMap();
        map.add("test", 123);
        assertEquals("test", map.name(123));
        assertEquals(123, map.value("test"));
    }
    
    @Test
    public void testArrayEntityMap() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap();
        map.add("test", 1);
        assertEquals("test", map.name(1));
        assertEquals(1, map.value("test"));
    }
    
    @Test
    public void testArrayEntityMapWithInitialSize() {
        Entities.ArrayEntityMap map = new Entities.ArrayEntityMap(10);
        map.add("test", 1);
        assertEquals("test", map.name(1));
    }
    
    @Test
    public void testEscapeWithHighValue() {
        entities.addEntity("high", 0x1F600);
        String result = entities.escape("\ud83d\ude00");
        assertEquals("&#128512;", result);
    }
    
    @Test
    public void testUnescapeWithHighValue() {
        assertEquals("\ud83d\ude00", entities.unescape("&#128512;"));
    }
    
    @Test
    public void testEscapeWriterWithException() throws IOException {
        Writer badWriter = new Writer() {
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new IOException("bad");
            }
            @Override
            public void flush() {}
            @Override
            public void close() {}
        };
        try {
            entities.escape(badWriter, "test");
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("bad", e.getMessage());
        }
    }
    
    @Test
    public void testStaticEntitiesInstances() {
        assertEquals("&lt;", Entities.XML.escape("<"));
        assertEquals("<", Entities.XML.unescape("&lt;"));
        assertEquals("'", Entities.XML.unescape("&apos;"));
    }
    
    @Test
    public void testFillWithHtml40Entities() {
        assertEquals("&copy;", Entities.HTML40.escape("\u00a9"));
        assertEquals("\u00a9", Entities.HTML40.unescape("&copy;"));
    }
    
    @Test
    public void testEntityValueWithNull() {
        assertEquals(-1, entities.entityValue(null));
    }
    
    @Test
    public void testNameWithInvalidValue() {
        assertNull(entities.entityName(Integer.MIN_VALUE));
    }
    
    @Test
    public void testEscapeWithAlreadyEscapedText() {
        assertEquals("&lt;", entities.escape("&lt;"));
    }
    
    @Test
    public void testUnescapeWithAmpersandAndSemiColon() {
        assertEquals("&&&", entities.unescape("&&&"));
        assertEquals(";", entities.unescape(";"));
    }
    
    @Test
    public void testUnescapeWithIncompleteEntity() {
        assertEquals("&", entities.unescape("&"));
        assertEquals("&lt", entities.unescape("&lt"));
    }
}