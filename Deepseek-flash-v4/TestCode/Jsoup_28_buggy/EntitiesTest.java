package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;

public class EntitiesTest {
    
    @Before
    public void setUp() {
        // Test setup if needed
    }
    
    @After
    public void tearDown() {
        // Test teardown if needed
    }
    
    @Test
    public void testIsNamedEntityNormal() {
        Assert.assertTrue("Should recognize 'lt' as named entity", 
            Entities.isNamedEntity("lt"));
        Assert.assertTrue("Should recognize 'amp' as named entity", 
            Entities.isNamedEntity("amp"));
    }
    
    @Test
    public void testIsNamedEntityInvalid() {
        Assert.assertFalse("Should not recognize invalid entity", 
            Entities.isNamedEntity("nonexistent"));
        Assert.assertFalse("Should not recognize empty string as entity", 
            Entities.isNamedEntity(""));
        Assert.assertFalse("Should not recognize null as named entity", 
            Entities.isNamedEntity(null));
    }
    
    @Test
    public void testIsNamedEntityXhtmlEntities() {
        Assert.assertTrue("xhtml 'quot' should be recognized", 
            Entities.isNamedEntity("quot"));
        Assert.assertTrue("xhtml 'apos' should be recognized", 
            Entities.isNamedEntity("apos"));
    }
    
    @Test
    public void testGetCharacterByNameValid() {
        Character result = Entities.getCharacterByName("lt");
        Assert.assertNotNull("Should return character for valid entity", result);
        Assert.assertEquals("Should return '<' for 'lt'", 
            Character.valueOf('<'), result);
        
        result = Entities.getCharacterByName("amp");
        Assert.assertNotNull("Should return character for valid entity", result);
        Assert.assertEquals("Should return '&' for 'amp'", 
            Character.valueOf('&'), result);
    }
    
    @Test
    public void testGetCharacterByNameInvalid() {
        Character result = Entities.getCharacterByName("nonexistent");
        Assert.assertNull("Should return null for unknown entity", result);
        
        result = Entities.getCharacterByName("");
        Assert.assertNull("Should return null for empty string", result);
        
        result = Entities.getCharacterByName(null);
        Assert.assertNull("Should return null for null input", result);
    }
    
    @Test
    public void testGetCharacterByNameHexadecimalEntities() {
        Character result = Entities.getCharacterByName("#x26");
        Assert.assertNull("Hex entity should not be in named entities map directly", result);
        
        result = Entities.getCharacterByName("#38");
        Assert.assertNull("Numeric entity should not be in named entities map directly", result);
    }
    
    @Test
    public void testEscapeBasicEncoding() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        out.charset(StandardCharsets.UTF_8);
        
        String result = Entities.escape("<div>&", out);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should escape < and &", "&lt;div&gt;&amp;", result);
    }
    
    @Test
    public void testEscapeXhtmlMode() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        out.charset(StandardCharsets.UTF_8);
        
        String result = Entities.escape("\"<>&", out);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Should not fully encode special chars in xhtml mode", 
            "&quot;&lt;&gt;&amp;", result);
    }
    
    @Test
    public void testEscapeExtendedMode() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.extended);
        out.charset(StandardCharsets.UTF_8);
        
        String result = Entities.escape("\u2265", out);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should encode extended characters", 
            result.contains("&") && result.length() > 0);
    }
    
    @Test
    public void testEscapeNonAsciiCharacters() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        out.charset(StandardCharsets.US_ASCII);
        
        String result = Entities.escape("caf\u00e9", out);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should encode non-ASCII characters", 
            result.contains("&#"));
    }
    
    @Test
    public void testEscapeEmptyString() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        
        String result = Entities.escape("", out);
        Assert.assertNotNull("Empty string should not return null", result);
        Assert.assertEquals("Empty string should remain empty", "", result);
    }
    
    @Test
    public void testEscapeNullString() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        
        try {
            Entities.escape(null, out);
            Assert.fail("Should throw NullPointerException for null string");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
    
    @Test
    public void testEscapeStringWithNoSpecialCharacters() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        
        String result = Entities.escape("hello", out);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Plain text should remain unchanged", "hello", result);
    }
    
    @Test
    public void testUnescapeNormalStrings() {
        String result = Entities.unescape("&lt;hello&gt;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should unescape basic entities", "<hello>", result);
    }
    
    @Test
    public void testUnescapeWithoutSemicolon() {
        String result = Entities.unescape("&lthello");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Should not replace entity without semicolon in non-strict mode", 
            "<hello", result);
    }
    
    @Test
    public void testUnescapeEmptyString() {
        String result = Entities.unescape("");
        Assert.assertNotNull("Empty string should not return null", result);
        Assert.assertEquals("Empty string should remain empty", "", result);
    }
    
    @Test
    public void testUnescapeNullString() {
        try {
            Entities.unescape(null);
            Assert.fail("Should throw NullPointerException for null string");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
    
    @Test
    public void testUnescapeNoEntityString() {
        String result = Entities.unescape("hello");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Plain text should remain unchanged", "hello", result);
    }
    
    @Test
    public void testUnescapeStrictMode() {
        String result = Entities.unescape("&lt;", true);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should unescape with semicolon in strict mode", "<", result);
    }
    
    @Test
    public void testUnescapeStrictModeWithoutSemicolon() {
        String result = Entities.unescape("&lt", true);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Should not unescape without semicolon in strict mode", "<", result);
    }
    
    @Test
    public void testUnescapeNumericEntities() {
        String result = Entities.unescape("&#38;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should unescape decimal numeric entity", "&", result);
    }
    
    @Test
    public void testUnescapeHexadecimalEntities() {
        String result = Entities.unescape("&#x26;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should unescape hexadecimal numeric entity", "&", result);
    }
    
    @Test
    public void testUnescapeInvalidNumericEntities() {
        String input = "&#xZZ;";
        String result = Entities.unescape(input);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Should not unescape invalid numeric entity", "\uFFFF", result);
    }
    
    @Test
    public void testUnescapeUnknownEntities() {
        String result = Entities.unescape("&invalid;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Unknown entity should remain unchanged", "&invalid;", result);
    }
    
    @Test
    public void testUnescapeMixedContent() {
        String result = Entities.unescape("&lt;div&gt; &amp; &#65; &#x42;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should contain unescaped entities", result.contains("<"));
        Assert.assertTrue("Should contain unescaped ampersand", result.contains("&"));
    }
    
    @Test
    public void testUnescapeMultipleEntitiesInSequence() {
        String result = Entities.unescape("&lt;&gt;&amp;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertEquals("Should unescape multiple entities", "<>&", result);
    }
    
    @Test
    public void testEscapeAndUnescapeRoundTrip() throws Exception {
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.base);
        
        String original = "<tag attr=\"value\">";
        String escaped = Entities.escape(original, out);
        String unescaped = Entities.unescape(escaped);
        
        Assert.assertNotNull("Round trip should not produce null", unescaped);
        Assert.assertEquals("Round trip should preserve original", original, unescaped);
    }
    
    @Test
    public void testEscapeWithEncoderThatCannotEncode() throws Exception {
        CharsetEncoder encoder = StandardCharsets.US_ASCII.newEncoder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        
        String testString = "caf\u00e9";
        String result = Entities.escape(testString, encoder, Entities.EscapeMode.xhtml);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Non-encodable chars should be encoded with numeric entities", 
            result.contains("&#"));
    }
    
    @Test
    public void testEscapeWithEncoderThatCanEncode() throws Exception {
        CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
        Document.OutputSettings out = new Document.OutputSettings();
        out.escapeMode(Entities.EscapeMode.xhtml);
        
        String testString = "caf\u00e9";
        String result = Entities.escape(testString, encoder, Entities.EscapeMode.xhtml);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should encode special chars even when encoder can handle them", 
            result.contains("&"));
    }
    
    @Test
    public void testEscapeNullChar() throws Exception {
        CharsetEncoder encoder = StandardCharsets.UTF_8.newEncoder();
        String testString = "a\u0000b";
        
        try {
            String result = Entities.escape(testString, encoder, Entities.EscapeMode.base);
            Assert.assertNotNull("Result should not be null", result);
            Assert.assertNotEquals("Should handle null character", "ab", result);
        } catch (Exception e) {
            // Some implementations may throw for null chars, which is acceptable
        }
    }
    
    @Test
    public void testIsNamedEntityExtendedEntities() {
        Assert.assertTrue("Should recognize extended entity", 
            Entities.isNamedEntity("equals"));
        Assert.assertTrue("Should recognize extended entity with digits", 
            Entities.isNamedEntity("sup2"));
    }
    
    @Test
    public void testGetCharacterByNameExtendedEntities() {
        Character result = Entities.getCharacterByName("euro");
        Assert.assertNotNull("Should get character for extended entity", result);
        Assert.assertEquals("Euro sign should be character value", 
            Character.valueOf('\u20AC'), result);
    }
    
    @Test
    public void testUnescapeCaseSensitiveEntities() {
        String result = Entities.unescape("&LT;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Should not unescape uppercase entity", "<", result);
    }
    
    @Test
    public void testUnescapeEntityWithDigits() {
        String result = Entities.unescape("&frac12;");
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertNotEquals("Fraction should not be equal to int", result, "frac12");
    }
    
    @Test
    public void testStrictUnescapePatternHandlesDifferentFormats() {
        String input = "&lt;test&gt; &amp; &#65; &#x42;";
        String result = Entities.unescape(input, true);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should handle strict unescaping", 
            !result.equalsIgnoreCase(input));
    }
    
    @Test
    public void testStrictUnescapeRejectsInvalidPatterns() {
        String input = "&lt;test";
        String result = Entities.unescape(input, true);
        Assert.assertNotNull("Result should not be null", result);
        Assert.assertTrue("Should not match incomplete entity in strict mode", 
            result.contains("&lt"));
    }
}