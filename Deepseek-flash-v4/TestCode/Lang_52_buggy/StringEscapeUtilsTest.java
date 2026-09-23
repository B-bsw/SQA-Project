package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class StringEscapeUtilsTest {
    private StringWriter writer;
    
    @Before
    public void setUp() {
        writer = new StringWriter();
    }
    
    @After
    public void tearDown() {
        writer = null;
    }

    @Test
    public void testEscapeJava_NullInput() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    @Test
    public void testEscapeJava_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testEscapeJava_SpecialChars() {
        assertEquals("\\t\\n\\r\\f\\b", StringEscapeUtils.escapeJava("\t\n\r\f\b"));
    }

    @Test
    public void testEscapeJava_QuotesAndBackslash() {
        assertEquals("\\\"\\\\", StringEscapeUtils.escapeJava("\"\\"));
    }

    @Test
    public void testEscapeJava_SingleQuoteNotEscaped() {
        assertEquals("'", StringEscapeUtils.escapeJava("'"));
    }

    @Test
    public void testEscapeJava_UnicodeChars() {
        assertEquals("\\u00FF", StringEscapeUtils.escapeJava("\u00FF"));
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
        assertEquals("\\uFFFF", StringEscapeUtils.escapeJava("\uFFFF"));
    }

    @Test
    public void testEscapeJava_ControlChars() {
        assertEquals("\\u0000", StringEscapeUtils.escapeJava("\u0000"));
        assertEquals("\\u000F", StringEscapeUtils.escapeJava("\u000F"));
    }

    @Test
    public void testEscapeJavaScript_NullInput() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    @Test
    public void testEscapeJavaScript_SingleQuote() {
        assertEquals("\\'", StringEscapeUtils.escapeJavaScript("'"));
    }

    @Test
    public void testEscapeJavaScript_DoubleQuote() {
        assertEquals("\\\"", StringEscapeUtils.escapeJavaScript("\""));
    }

    @Test
    public void testEscapeJava_WriterNull() {
        try {
            StringEscapeUtils.escapeJava((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IOException e) {
            fail("Unexpected IOException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeJava_WriterNullInput() throws IOException {
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testEscapeJava_WriterBasic() throws IOException {
        StringEscapeUtils.escapeJava(writer, "hello");
        assertEquals("hello", writer.toString());
    }

    @Test
    public void testEscapeJavaScript_WriterSingleQuote() throws IOException {
        StringEscapeUtils.escapeJavaScript(writer, "'");
        assertEquals("\\'", writer.toString());
    }

    @Test
    public void testUnescapeJava_NullInput() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    @Test
    public void testUnescapeJava_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testUnescapeJava_SpecialChars() {
        assertEquals("\t\n\r\f\b", StringEscapeUtils.unescapeJava("\\t\\n\\r\\f\\b"));
    }

    @Test
    public void testUnescapeJava_QuotesAndBackslash() {
        assertEquals("\"\\", StringEscapeUtils.unescapeJava("\\\"\\\\"));
    }

    @Test
    public void testUnescapeJava_UnicodeSeq() {
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
    }

    @Test
    public void testUnescapeJava_UnicodeInvalid() {
        try {
            StringEscapeUtils.unescapeJava("\\uGGGG");
            fail("Expected NestableRuntimeException");
        } catch (NestableRuntimeException e) {
            assertTrue(e.getMessage().contains("Unable to parse unicode value"));
        }
    }

    @Test
    public void testUnescapeJava_TrailingBackslash() {
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));
    }

    @Test
    public void testUnescapeJava_UnterminatedUnicode() {
        assertEquals("\\u", StringEscapeUtils.unescapeJava("\\u"));
    }

    @Test
    public void testUnescapeJava_SingleBackslashWithNormalChars() {
        assertEquals("abc", StringEscapeUtils.unescapeJava("\\abc"));
    }

    @Test
    public void testUnescapeJavaScript_NullInput() {
        assertNull(StringEscapeUtils.unescapeJavaScript(null));
    }

    @Test
    public void testUnescapeJavaScript_Basic() {
        assertEquals("'", StringEscapeUtils.unescapeJavaScript("\\'"));
    }

    @Test
    public void testEscapeHtml_NullInput() {
        assertNull(StringEscapeUtils.escapeHtml(null));
    }

    @Test
    public void testEscapeHtml_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testEscapeHtml_SpecialChars() {
        String input = "&<>\"'";
        String expected = "&amp;&lt;&gt;&quot;&apos;";
        assertEquals(expected, StringEscapeUtils.escapeHtml(input));
    }

    @Test
    public void testEscapeHtml_WriterNull() {
        try {
            StringEscapeUtils.escapeHtml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IOException e) {
            fail("Unexpected IOException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeHtml_WriterBasic() throws IOException {
        StringEscapeUtils.escapeHtml(writer, "test");
        assertEquals("test", writer.toString());
    }

    @Test
    public void testUnescapeHtml_NullInput() {
        assertNull(StringEscapeUtils.unescapeHtml(null));
    }

    @Test
    public void testUnescapeHtml_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testUnescapeHtml_Entities() {
        assertEquals("&<>\"'", StringEscapeUtils.unescapeHtml("&amp;&lt;&gt;&quot;&apos;"));
    }

    @Test
    public void testUnescapeHtml_WriterNull() {
        try {
            StringEscapeUtils.unescapeHtml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IOException e) {
            fail("Unexpected IOException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUnescapeHtml_WriterBasic() throws IOException {
        StringEscapeUtils.unescapeHtml(writer, "test");
        assertEquals("test", writer.toString());
    }

    @Test
    public void testEscapeXml_NullInput() {
        assertNull(StringEscapeUtils.escapeXml(null));
    }

    @Test
    public void testEscapeXml_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testEscapeXml_SpecialChars() {
        assertEquals("&lt;&gt;&amp;", StringEscapeUtils.escapeXml("<>&"));
    }

    @Test
    public void testEscapeXml_WriterNull() {
        try {
            StringEscapeUtils.escapeXml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IOException e) {
            fail("Unexpected IOException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testEscapeXml_WriterBasic() throws IOException {
        StringEscapeUtils.escapeXml(writer, "test");
        assertEquals("test", writer.toString());
    }

    @Test
    public void testEscapeXml_WriterNullInput() throws IOException {
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    @Test
    public void testUnescapeXml_NullInput() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    @Test
    public void testUnescapeXml_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testUnescapeXml_Entities() {
        assertEquals("<>&", StringEscapeUtils.unescapeXml("&lt;&gt;&amp;"));
    }

    @Test
    public void testUnescapeXml_WriterNull() {
        try {
            StringEscapeUtils.unescapeXml((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IOException e) {
            fail("Unexpected IOException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testUnescapeXml_WriterBasic() throws IOException {
        StringEscapeUtils.unescapeXml(writer, "test");
        assertEquals("test", writer.toString());
    }

    @Test
    public void testUnescapeXml_WriterEntities() throws IOException {
        StringEscapeUtils.unescapeXml(writer, "&lt;&gt;");
        assertEquals("<>", writer.toString());
    }

    @Test
    public void testEscapeSql_NullInput() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    @Test
    public void testEscapeSql_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    @Test
    public void testEscapeSql_SingleQuote() {
        assertEquals("''", StringEscapeUtils.escapeSql("'"));
    }

    @Test
    public void testEscapeSql_MultipleQuotes() {
        assertEquals("O''Reilly", StringEscapeUtils.escapeSql("O'Reilly"));
    }

    @Test
    public void testEscapeJava_NonAsciiChars() {
        String input = "\u0080\u0081\u00FF";
        String expected = "\\u0080\\u0081\\u00FF";
        assertEquals(expected, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_AsciiPrintable() {
        String input = "Hello World";
        assertEquals(input, StringEscapeUtils.escapeJava(input));
    }

    @Test
    public void testEscapeJava_MixedStrings() {
        assertEquals("Line\\nBreak", StringEscapeUtils.escapeJava("Line\nBreak"));
    }

    @Test
    public void testUnescapeJava_LineBreak() {
        assertEquals("Line\nBreak", StringEscapeUtils.unescapeJava("Line\\nBreak"));
    }

    @Test
    public void testEscapeJavaScript_BackslashEscape() {
        assertEquals("\\\\\\\\", StringEscapeUtils.escapeJavaScript("\\\\"));
    }

    @Test
    public void testUnescapeJavaScript_MixedEscapes() {
        String input = "\\'quoted\\\" \"string\"";
        String expected = "'quoted\" \"string\"";
        assertEquals(expected, StringEscapeUtils.unescapeJavaScript(input));
    }

    @Test
    public void testEscapeHtml_NumericEntity() {
        String input = "\u00A9";
        String result = StringEscapeUtils.escapeHtml(input);
        assertTrue(result.contains("\\u00A9") || result.contains("&#169;"));
    }
}