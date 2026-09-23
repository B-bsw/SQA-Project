package org.apache.commons.lang.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import static org.junit.Assert.*;

public class ExtendedMessageFormatTest {
    private ExtendedMessageFormat format;
    private Map<String, FormatFactory> registry;

    @Before
    public void setUp() {
        registry = new HashMap<String, FormatFactory>();
        registry.put("upper", new UpperCaseFormatFactory());
        format = new ExtendedMessageFormat("pattern", Locale.US, registry);
    }

    @After
    public void tearDown() {
        format = null;
        registry = null;
    }

    @Test
    public void testDefaultConstructorWithNullPattern() {
        try {
            new ExtendedMessageFormat(null);
            fail("Expected IllegalArgumentException for null pattern");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testDefaultConstructorValidPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testApplyPatternWithNullRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("test", Locale.US, null);
        emf.applyPattern("Hello {0}");
        assertEquals("Hello {0}", emf.toPattern());
    }

    @Test
    public void testApplyPatternEscapedQuotes() {
        format.applyPattern("Don''t {0}");
        assertNotNull(format.toPattern());
    }

    @Test
    public void testApplyPatternWithCustomFormat() {
        format.applyPattern("{0, upper}");
        assertNotNull(format.toPattern());
        assertTrue(format.toPattern().contains("upper"));
    }

    @Test
    public void testApplyPatternInvalidArgumentIndex() {
        try {
            format.applyPattern("{abc}");
            fail("Expected IllegalArgumentException for invalid argument index");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid format argument index at position 0: {abc}", e.getMessage());
        }
    }

    @Test
    public void testApplyPatternUnterminatedFormatElement() {
        try {
            format.applyPattern("{0");
            fail("Expected IllegalArgumentException for unterminated format element");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unterminated format element"));
        }
    }

    @Test
    public void testGetFormatWithCustomFactory() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0, upper}", Locale.US, registry);
        Format[] formats = emf.getFormats();
        assertNotNull(formats);
        assertEquals(1, formats.length);
        assertTrue(formats[0] instanceof java.text.Format);
    }

    @Test
    public void testSetFormatThrowsUnsupportedOperation() {
        try {
            format.setFormat(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormatByArgumentIndexThrowsUnsupportedOperation() {
        try {
            format.setFormatByArgumentIndex(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormatsThrowsUnsupportedOperation() {
        try {
            format.setFormats(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testSetFormatsByArgumentIndexThrowsUnsupportedOperation() {
        try {
            format.setFormatsByArgumentIndex(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    @Test
    public void testFormatWithCustomPattern() {
        format.applyPattern("{0, upper}");
        String result = format.format(new Object[]{"test"});
        assertNotNull(result);
    }

    @Test
    public void testFormatWithEscapedQuotes() {
        format.applyPattern("''{0}''");
        String result = format.format(new Object[]{"value"});
        assertNotNull(result);
    }

    @Test
    public void testToPatternAfterApplyPattern() {
        format.applyPattern("Hello {0}, {1}");
        assertEquals("Hello {0}, {1}", format.toPattern());
    }

    @Test
    public void testApplyPatternWithEmptyString() {
        format.applyPattern("");
        assertNotNull(format.toPattern());
    }

    @Test
    public void testApplyPatternWithOnlyCustomFormatNoArgs() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("plain", Locale.US, registry);
        assertEquals("plain", emf.toPattern());
    }

    @Test
    public void testReadArgumentIndexWithWhitespace() {
        format.applyPattern("{ 0, upper}");
        assertNotNull(format.toPattern());
    }

    @Test
    public void testGetFormatReturnsNullForUnknownFormat() {
        registry.clear();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0, unknown}", Locale.US, registry);
        assertNotNull(emf.toPattern());
    }

    private class UpperCaseFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(String name, String arguments, Locale locale) {
            return new java.text.Format() {
                private static final long serialVersionUID = 1L;
                @Override
                public StringBuffer format(Object obj, StringBuffer toAppendTo, ParsePosition pos) {
                    return toAppendTo.append(String.valueOf(obj).toUpperCase());
                }
                @Override
                public Object parseObject(String source, ParsePosition pos) {
                    return source;
                }
            };
        }
    }
}