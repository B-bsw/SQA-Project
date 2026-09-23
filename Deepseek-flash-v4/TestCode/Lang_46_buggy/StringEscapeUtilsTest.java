package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.lang.exception.NestableRuntimeException;
import java.io.IOException;
import java.io.StringWriter;

public class StringEscapeUtilsTest {

    private StringEscapeUtils instance;
    private StringWriter writer;

    @Before
    public void setUp() {
        instance = new StringEscapeUtils();
        writer = new StringWriter();
    }

    @After
    public void tearDown() {
        instance = null;
        writer = null;
    }

    // Constructor test
    @Test
    public void testConstructor() {
        assertNotNull(new StringEscapeUtils());
    }

    // escapeJava - normal case
    @Test
    public void testEscapeJava_Normal() {
        assertEquals("\\b\\t\\n\\f\\r", StringEscapeUtils.escapeJava("\b\t\n\f\r"));
    }

    // escapeJava - quotes and slashes
    @Test
    public void testEscapeJava_QuotesAndSlashes() {
        assertEquals("\\'\\\"\\\\", StringEscapeUtils.escapeJava("\'\"\\"));
    }

    // escapeJava - unicode
    @Test
    public void testEscapeJava_Unicode() {
        assertEquals("\\u00A0", StringEscapeUtils.escapeJava("\u00A0"));
    }

    // escapeJava - null input
    @Test
    public void testEscapeJava_Null() {
        assertNull(StringEscapeUtils.escapeJava(null));
    }

    // escapeJava(Writer, String) - IOException for null writer
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeJavaWriter_NullWriter() throws IOException {
        StringEscapeUtils.escapeJava((java.io.Writer) null, "test");
    }

    // escapeJava(Writer, String) - null string
    @Test
    public void testEscapeJavaWriter_NullString() throws IOException {
        StringEscapeUtils.escapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    // escapeJava(Writer, String) - normal
    @Test
    public void testEscapeJavaWriter_Normal() throws IOException {
        StringEscapeUtils.escapeJava(writer, "a\nb");
        assertEquals("a\\nb", writer.toString());
    }

    // escapeJavaScript - basic
    @Test
    public void testEscapeJavaScript_Basic() {
        assertEquals("\\n", StringEscapeUtils.escapeJavaScript("\n"));
    }

    // escapeJavaScript - single quotes with true
    @Test
    public void testEscapeJavaScript_SingleQuotes() {
        assertEquals("\\'", StringEscapeUtils.escapeJavaScript("\'"));
    }

    // escapeJavaScript - null
    @Test
    public void testEscapeJavaScript_Null() {
        assertNull(StringEscapeUtils.escapeJavaScript(null));
    }

    // unescapeJava - normal
    @Test
    public void testUnescapeJava_Basic() {
        assertEquals("\n", StringEscapeUtils.unescapeJava("\\n"));
    }

    // unescapeJava - unicode
    @Test
    public void testUnescapeJava_Unicode() {
        assertEquals("A", StringEscapeUtils.unescapeJava("\\u0041"));
    }

    // unescapeJava - null
    @Test
    public void testUnescapeJava_Null() {
        assertNull(StringEscapeUtils.unescapeJava(null));
    }

    // unescapeJava - invalid unicode throws NestableRuntimeException
    @Test(expected = NestableRuntimeException.class)
    public void testUnescapeJava_InvalidUnicode() {
        StringEscapeUtils.unescapeJava("\\u12X4");
    }

    // unescapeJava(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeJavaWriter_NullWriter() throws IOException {
        StringEscapeUtils.unescapeJava((java.io.Writer) null, "test");
    }

    // unescapeJava(Writer, String) - null string
    @Test
    public void testUnescapeJavaWriter_NullString() throws IOException {
        StringEscapeUtils.unescapeJava(writer, null);
        assertEquals("", writer.toString());
    }

    // unescapeJava(Writer, String) - normal
    @Test
    public void testUnescapeJavaWriter_Basic() throws IOException {
        StringEscapeUtils.unescapeJava(writer, "\\n");
        assertEquals("\n", writer.toString());
    }

    // unescapeJavaScript
    @Test
    public void testUnescapeJavaScript_Basic() {
        assertEquals("\t", StringEscapeUtils.unescapeJavaScript("\\t"));
    }

    // escapeHtml - null
    @Test
    public void testEscapeHtml_Null() {
        assertNull(StringEscapeUtils.escapeHtml((String) null));
    }

    // escapeHtml - basic escaping
    @Test
    public void testEscapeHtml_Basic() {
        assertTrue(StringEscapeUtils.escapeHtml("<b>").contains("&lt;"));
    }

    // escapeHtml(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlWriter_NullWriter() throws IOException {
        StringEscapeUtils.escapeHtml((java.io.Writer) null, "test");
    }

    // escapeHtml(Writer, String) - null string
    @Test
    public void testEscapeHtmlWriter_NullString() throws IOException {
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // unescapeHtml - null
    @Test
    public void testUnescapeHtml_Null() {
        assertNull(StringEscapeUtils.unescapeHtml((String) null));
    }

    // unescapeHtml - basic
    @Test
    public void testUnescapeHtml_Basic() {
        assertEquals("<", StringEscapeUtils.unescapeHtml("&lt;"));
    }

    // unescapeHtml(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlWriter_NullWriter() throws IOException {
        StringEscapeUtils.unescapeHtml((java.io.Writer) null, "test");
    }

    // unescapeHtml(Writer, String) - null string
    @Test
    public void testUnescapeHtmlWriter_NullString() throws IOException {
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // escapeXml - null
    @Test
    public void testEscapeXml_Null() {
        assertNull(StringEscapeUtils.escapeXml((String) null));
    }

    // escapeXml - basic
    @Test
    public void testEscapeXml_Basic() {
        assertTrue(StringEscapeUtils.escapeXml("<").contains("&lt;"));
    }

    // escapeXml(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlWriter_NullWriter() throws IOException {
        StringEscapeUtils.escapeXml((java.io.Writer) null, "test");
    }

    // escapeXml(Writer, String) - null string
    @Test
    public void testEscapeXmlWriter_NullString() throws IOException {
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // unescapeXml - null
    @Test
    public void testUnescapeXml_Null() {
        assertNull(StringEscapeUtils.unescapeXml(null));
    }

    // unescapeXml - basic
    @Test
    public void testUnescapeXml_Basic() {
        assertEquals("<", StringEscapeUtils.unescapeXml("&lt;"));
    }

    // unescapeXml(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlWriter_NullWriter() throws IOException {
        StringEscapeUtils.unescapeXml((java.io.Writer) null, "test");
    }

    // unescapeXml(Writer, String) - null string
    @Test
    public void testUnescapeXmlWriter_NullString() throws IOException {
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // escapeSql - null
    @Test
    public void testEscapeSql_Null() {
        assertNull(StringEscapeUtils.escapeSql(null));
    }

    // escapeSql - basic
    @Test
    public void testEscapeSql_Basic() {
        assertEquals("it''s", StringEscapeUtils.escapeSql("it's"));
    }

    // escapeCsv - null
    @Test
    public void testEscapeCsv_Null() {
        assertNull(StringEscapeUtils.escapeCsv(null));
    }

    // escapeCsv - normal string without delimiter
    @Test
    public void testEscapeCsv_NoDelimiter() {
        assertEquals("abc", StringEscapeUtils.escapeCsv("abc"));
    }

    // escapeCsv - string with comma
    @Test
    public void testEscapeCsv_Comma() {
        assertEquals("\"a,b\"", StringEscapeUtils.escapeCsv("a,b"));
    }

    // escapeCsv - string with quote
    @Test
    public void testEscapeCsv_Quote() {
        assertEquals("\"a\"\"b\"", StringEscapeUtils.escapeCsv("a\"b"));
    }

    // escapeCsv(Writer, String) - null writer
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCsvWriter_NullWriter() throws IOException {
        StringEscapeUtils.escapeCsv((java.io.Writer) null, "test");
    }

    // escapeCsv(Writer, String) - null string
    @Test
    public void testEscapeCsvWriter_NullString() throws IOException {
        StringEscapeUtils.escapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    // escapeCsv(Writer, String) - with delimiter
    @Test
    public void testEscapeCsvWriter_Comma() throws IOException {
        StringEscapeUtils.escapeCsv(writer, "a,b");
        assertEquals("\"a,b\"", writer.toString());
    }

    // unescapeCsv - null
    @Test
    public void testUnescapeCsv_Null() {
        assertNull(StringEscapeUtils.unescapeCsv(null));
    }

    // unescapeCsv - normal string without quotes
    @Test
    public void testUnescapeCsv_NoQuotes() {
        assertEquals("abc", StringEscapeUtils.unescapeCsv("abc"));
    }

    // unescapeCsv - quoted string without special chars
    @Test
    public void testUnescapeCsv_Quoted() {
        assertEquals("abc", StringEscapeUtils.unescapeCsv("\"abc\""));
    }

    // unescapeCsv - quoted with special chars
    @Test
    public void testUnescapeCsv_QuotedSpecial() {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("\"a,b\""));
    }

    // unescapeCsv - empty string
    @Test
    public void testUnescapeCsv_Empty() {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    // unescapeCsv - just quotes
    @Test
    public void testUnescapeCsv_OnlyQuotes() {
        assertEquals("\"\"", StringEscapeUtils.unescapeCsv("\"\""));
    }

    // unescapeCsv(Writer, String) - null writer
    @Test
    public void testUnescapeCsvWriter_NullWriter() throws IOException {
        // Should not throw; method handles null by ignoring
        try {
            StringEscapeUtils.unescapeCsv((java.io.Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // unescapeCsv(Writer, String) - null string
    @Test
    public void testUnescapeCsvWriter_NullString() throws IOException {
        StringEscapeUtils.unescapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    // unescapeCsv(Writer, String) - normal
    @Test
    public void testUnescapeCsvWriter_Normal() throws IOException {
        StringEscapeUtils.unescapeCsv(writer, "\"a,b\"");
        assertEquals("a,b", writer.toString());
    }

    // Private hex method test via escapeJava
    @Test
    public void testEscapeJava_HexConversion() {
        assertEquals("\\u0001", StringEscapeUtils.escapeJava("\u0001"));
    }

    // Edge: control characters below 32
    @Test
    public void testEscapeJava_ControlChars() {
        assertEquals("\\b\\n\\t\\f\\r", StringEscapeUtils.escapeJava("\b\n\t\f\r"));
    }

    // Edge: char > 0xfff
    @Test
    public void testEscapeJava_CharAbove0xfff() {
        assertEquals("\\uFFFF", StringEscapeUtils.escapeJava("\uFFFF"));
    }

    // Edge: char between 0xff and 0xfff
    @Test
    public void testEscapeJava_CharBetween0xffAnd0xfff() {
        assertEquals("\\u0100", StringEscapeUtils.escapeJava("\u0100"));
    }

    // Edge: char between 0x7f and 0xff
    @Test
    public void testEscapeJava_CharBetween0x7fAnd0xff() {
        assertEquals("\\u00FF", StringEscapeUtils.escapeJava("\u00FF"));
    }

    // unescapeJava with multiple escapes
    @Test
    public void testUnescapeJava_MultipleEscapes() {
        assertEquals("a\nb\tc", StringEscapeUtils.unescapeJava("a\\nb\\tc"));
    }

    // unescapeJava with backslash at end
    @Test
    public void testUnescapeJava_TrailingBackslash() {
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\"));
    }

    // unescapeJava with unicode and continuation
    @Test
    public void testUnescapeJava_UnicodeContinuation() {
        assertEquals("AB", StringEscapeUtils.unescapeJava("\\u0041B"));
    }

    // Branch: unescapeJava with inUnicode true and invalid length
    @Test
    public void testUnescapeJava_UnicodeIncomplete() {
        String result = StringEscapeUtils.unescapeJava("\\u12");
        assertEquals("\\u12", result);
    }

    // Branch: unescapeJava with hadSlash true and escape sequence unknown
    @Test
    public void testUnescapeJava_UnknownEscape() {
        assertEquals("x", StringEscapeUtils.unescapeJava("\\x"));
    }

    // Branch: escapeHtml with special entities
    @Test
    public void testEscapeHtml_EscapeAmpersand() {
        assertTrue(StringEscapeUtils.escapeHtml("&").contains("&amp;"));
    }

    // Branch: unescapeHtml with entity
    @Test
    public void testUnescapeHtml_EscapeAmpersand() {
        assertEquals("&", StringEscapeUtils.unescapeHtml("&amp;"));
    }

    // Branch: escapeXml with special char
    @Test
    public void testEscapeXml_EscapeAmpersand() {
        assertTrue(StringEscapeUtils.escapeXml("&").contains("&amp;"));
    }

    // Branch: unescapeXml with entity
    @Test
    public void testUnescapeXml_EscapeAmpersand() {
        assertEquals("&", StringEscapeUtils.unescapeXml("&amp;"));
    }

    // Branch: escapeCsv with newline
    @Test
    public void testEscapeCsv_Newline() {
        assertEquals("\"a\nb\"", StringEscapeUtils.escapeCsv("a\nb"));
    }

    // Branch: escapeCsv with carriage return
    @Test
    public void testEscapeCsv_CR() {
        assertEquals("\"a\rb\"", StringEscapeUtils.escapeCsv("a\rb"));
    }

    // Branch: unescapeCsv with escaped quote
    @Test
    public void testUnescapeCsv_EscapedQuote() {
        assertEquals("a\"b", StringEscapeUtils.unescapeCsv("\"a\"\"b\""));
    }

    // Branch: unescapeCsv with unquoted but contains delimiter
    @Test
    public void testUnescapeCsv_UnquotedWithDelimiter() {
        assertEquals("a,b", StringEscapeUtils.unescapeCsv("a,b"));
    }

    // Branch: unescapeCsv with unquoted no delimiter
    @Test
    public void testUnescapeCsv_UnquotedNoDelimiter() {
        assertEquals("abc", StringEscapeUtils.unescapeCsv("abc"));
    }

    // Branch: unescapeCsv with quoted but no special chars
    @Test
    public void testUnescapeCsv_QuotedNoSpecial() {
        assertEquals("abc", StringEscapeUtils.unescapeCsv("\"abc\""));
    }

    // Branch: escapeJava with slash
    @Test
    public void testEscapeJava_Slash() {
        assertEquals("/", StringEscapeUtils.escapeJava("/"));
    }

    // Branch: escapeJavaScript with single quote false (should not escape)
    @Test
    public void testEscapeJavaScript_SingleQuoteFalse() {
        assertEquals("'", StringEscapeUtils.escapeJavaScript("'"));
    }

    // Branch: unescapeJava with unicode and subsequent non-unicode
    @Test
    public void testUnescapeJava_UnicodeThenChar() {
        assertEquals("A1", StringEscapeUtils.unescapeJava("\\u00411"));
    }

    // Branch: unescapeJava with backslash followed by 'u' but incomplete
    @Test
    public void testUnescapeJava_UnicodeImcomplete() {
        assertEquals("\\u12", StringEscapeUtils.unescapeJava("\\u12"));
    }

    // Branch: unescapeJava with multiple backslashes
    @Test
    public void testUnescapeJava_DoubleBackslash() {
        assertEquals("\\", StringEscapeUtils.unescapeJava("\\\\"));
    }

    // Additional coverage for csv methods with IOExceptions
    @Test
    public void testEscapeCsvWriter_Complete() throws IOException {
        StringEscapeUtils.escapeCsv(writer, "a\"b");
        assertEquals("\"a\"\"b\"", writer.toString());
    }

    @Test
    public void testUnescapeCsvWriter_EscapedQuote() throws IOException {
        StringEscapeUtils.unescapeCsv(writer, "\"a\"\"b\"");
        assertEquals("a\"b", writer.toString());
    }

    // Test for private hex method indirectly
    @Test
    public void testHexMethodIndirect() {
        assertEquals("\\u0041", StringEscapeUtils.escapeJava("\u0041"));
    }

    // Test for normal flow with empty string
    @Test
    public void testEscapeJava_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeJava(""));
    }

    @Test
    public void testUnescapeJava_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeJava(""));
    }

    @Test
    public void testEscapeHtml_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeHtml(""));
    }

    @Test
    public void testUnescapeHtml_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeHtml(""));
    }

    @Test
    public void testEscapeXml_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeXml(""));
    }

    @Test
    public void testUnescapeXml_EmptyString() {
        assertEquals("", StringEscapeUtils.unescapeXml(""));
    }

    @Test
    public void testEscapeCsv_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeCsv(""));
    }

    @Test
    public void testUnescapeCsv_EmptyString2() {
        assertEquals("", StringEscapeUtils.unescapeCsv(""));
    }

    @Test
    public void testEscapeSql_EmptyString() {
        assertEquals("", StringEscapeUtils.escapeSql(""));
    }

    // Test for null writer in escapeHtml
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeHtmlWriter_NullWriter2() throws IOException {
        StringEscapeUtils.escapeHtml((Writer) null, "test");
    }

    // Test for null writer in unescapeHtml
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeHtmlWriter_NullWriter2() throws IOException {
        StringEscapeUtils.unescapeHtml((Writer) null, "test");
    }

    // Test for null writer in escapeXml
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeXmlWriter_NullWriter2() throws IOException {
        StringEscapeUtils.escapeXml((Writer) null, "test");
    }

    // Test for null writer in unescapeXml
    @Test(expected = IllegalArgumentException.class)
    public void testUnescapeXmlWriter_NullWriter2() throws IOException {
        StringEscapeUtils.unescapeXml((Writer) null, "test");
    }

    // Test for null writer in escapeCsv
    @Test(expected = IllegalArgumentException.class)
    public void testEscapeCsvWriter_NullWriter2() throws IOException {
        StringEscapeUtils.escapeCsv((Writer) null, "test");
    }

    // Test for null writer in unescapeCsv
    @Test
    public void testUnescapeCsvWriter_NullWriter2() throws IOException {
        try {
            StringEscapeUtils.unescapeCsv((Writer) null, "test");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    // Test for null string in escapeHtml(Writer, String)
    @Test
    public void testEscapeHtmlWriter_NullString2() throws IOException {
        StringEscapeUtils.escapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // Test for null string in unescapeHtml(Writer, String)
    @Test
    public void testUnescapeHtmlWriter_NullString2() throws IOException {
        StringEscapeUtils.unescapeHtml(writer, null);
        assertEquals("", writer.toString());
    }

    // Test for null string in escapeXml(Writer, String)
    @Test
    public void testEscapeXmlWriter_NullString2() throws IOException {
        StringEscapeUtils.escapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // Test for null string in unescapeXml(Writer, String)
    @Test
    public void testUnescapeXmlWriter_NullString2() throws IOException {
        StringEscapeUtils.unescapeXml(writer, null);
        assertEquals("", writer.toString());
    }

    // Test for null string in escapeCsv(Writer, String)
    @Test
    public void testEscapeCsvWriter_NullString2() throws IOException {
        StringEscapeUtils.escapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    // Test for null string in unescapeCsv(Writer, String)
    @Test
    public void testUnescapeCsvWriter_NullString2() throws IOException {
        StringEscapeUtils.unescapeCsv(writer, null);
        assertEquals("", writer.toString());
    }

    // Additional branch: unescapeJava with inUnicode true but length not 4
    @Test
    public void testUnescapeJava_UnicodePartial() {
        String result = StringEscapeUtils.unescapeJava("\\u12");
        assertEquals("\\u12", result);
    }

    // Additional branch: unescapeJava with hadSlash false and normal char
    @Test
    public void testUnescapeJava_NormalChar() {
        assertEquals("a", StringEscapeUtils.unescapeJava("a"));
    }

    // Additional branch: unescapeJava with hadSlash and normal char
    @Test
    public void testUnescapeJava_BackslashNormal() {
        assertEquals("a", StringEscapeUtils.unescapeJava("\\a"));
    }

    // Additional branch: unescapeJava with backslash at end (hadSlash true)
    @Test
    public void testUnescapeJava_EndsWithBackslash() {
        String result = StringEscapeUtils.unescapeJava("abc\\");
        assertEquals("abc\\", result);
    }

    // Additional branch: unescapeJava with multiple unicode sequences
    @Test
    public void testUnescapeJava_MultipleUnicode() {
        assertEquals("AB", StringEscapeUtils.unescapeJava("\\u0041\\u0042"));
    }

    // Additional branch: escapeJava with multiple special chars
    @Test
    public void testEscapeJava_MultipleSpecial() {
        assertEquals("\\\\\\\"\\n", StringEscapeUtils.escapeJava("\\\"\n"));
    }

    // Additional branch: unescapeJava with multiple escapes
    @Test
    public void testUnescapeJava_MultipleEscapes2() {
        assertEquals("\\\\", StringEscapeUtils.unescapeJava("\\\\"));
    }

    // Additional branch: escapeHtml with apostrophe
    @Test
    public void testEscapeHtml_Apostrophe() {
        assertTrue(StringEscapeUtils.escapeHtml("'").contains("&#039;"));
    }

    // Additional branch: unescapeHtml with numeric entity
    @Test
    public void testUnescapeHtml_NumericEntity() {
        assertEquals("A", StringEscapeUtils.unescapeHtml("&#65;"));
    }
}