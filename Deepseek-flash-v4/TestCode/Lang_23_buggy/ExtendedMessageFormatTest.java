package org.apache.commons.lang3.text;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.Format;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ExtendedMessageFormatTest {

    private ExtendedMessageFormat format;
    private static final String DEFAULT_PATTERN = "Hello {0}";
    private static final String CUSTOM_PATTERN = "Hello {0,date,yyyy}";
    private static final String COMPLEX_PATTERN = "{0,choice,0#zero|1#one|2#two} {1,number} '{'quoted'}' {2}";
    private static final FormatFactory UPPER_CASE_FACTORY = new FormatFactory() {
        @Override
        public Format getFormat(String name, String arguments, Locale locale) {
            return null;
        }
    };

    @Before
    public void setUp() {
        format = new ExtendedMessageFormat(DEFAULT_PATTERN);
    }

    @After
    public void tearDown() {
        format = null;
    }

    @Test
    public void testDefaultConstructor() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        assertNotNull(emf);
        assertEquals("Test {0}", emf.toPattern());
    }

    @Test
    public void testConstructorWithLocale() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", Locale.US);
        assertNotNull(emf);
        assertEquals(Locale.US, emf.getLocale());
    }

    @Test
    public void testConstructorWithRegistry() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("upper", UPPER_CASE_FACTORY);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper}", registry);
        assertNotNull(emf);
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testConstructorWithRegistryAndLocale() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("upper", UPPER_CASE_FACTORY);
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,upper}", Locale.UK, registry);
        assertNotNull(emf);
        assertEquals(Locale.UK, emf.getLocale());
    }

    @Test
    public void testApplyPatternWithNullRegistry() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test");
        emf.applyPattern("New {0} pattern");
        assertEquals("New {0} pattern", emf.toPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPatternInvalidFormatIndex() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {invalid}");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testApplyPatternUnterminatedFormatElement() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0");
    }

    @Test
    public void testSetFormatThrowsException() {
        try {
            format.setFormat(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatByArgumentIndexThrowsException() {
        try {
            format.setFormatByArgumentIndex(0, null);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatsThrowsException() {
        try {
            format.setFormats(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testSetFormatsByArgumentIndexThrowsException() {
        try {
            format.setFormatsByArgumentIndex(new Format[0]);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testToPatternWithDefaultPattern() {
        assertEquals(DEFAULT_PATTERN, format.toPattern());
    }

    @Test
    public void testToPatternWithCustomPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat(CUSTOM_PATTERN);
        assertEquals(CUSTOM_PATTERN, emf.toPattern());
    }

    @Test
    public void testEqualsSameObject() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat(DEFAULT_PATTERN);
        assertEquals(format, emf);
    }

    @Test
    public void testEqualsNull() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testHashCodeConsistent() {
        ExtendedMessageFormat emf1 = new ExtendedMessageFormat(DEFAULT_PATTERN);
        ExtendedMessageFormat emf2 = new ExtendedMessageFormat(DEFAULT_PATTERN);
        assertEquals(emf1.hashCode(), emf2.hashCode());
    }

    @Test
    public void testFormatWithSimpleArgument() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0}");
        assertEquals("Value: 42", emf.format(new Object[]{42}));
    }

    @Test
    public void testFormatWithMultipleArguments() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0} - {1}");
        assertEquals("a - b", emf.format(new Object[]{"a", "b"}));
    }

    @Test
    public void testFormatWithComplexPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat(COMPLEX_PATTERN);
        Object[] args = {2, 3.14, "value"};
        assertNotNull(emf.format(args));
    }

    @Test
    public void testFormatWithQuotedString() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'{'quoted'}' {0}");
        assertEquals("{quoted} hello", emf.format(new Object[]{"hello"}));
    }

    @Test
    public void testFormatWithEscapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("'' {0}");
        assertNotNull(emf.format(new Object[]{"value"}));
    }

    @Test
    public void testApplyPatternWithEscapedQuote() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        emf.applyPattern("'' {0}");
        assertNotNull(emf.toPattern());
    }

    @Test
    public void testUnterminatedQuoteThrowsException() {
        try {
            new ExtendedMessageFormat("Unterminated '' quote");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testReadArgumentIndexWithWhitespace() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{ 0 }");
        assertNotNull(emf);
    }

    @Test
    public void testRegistryWithCustomFormat() {
        Map<String, FormatFactory> registry = new HashMap<>();
        registry.put("custom", new FormatFactory() {
            @Override
            public Format getFormat(String name, String arguments, Locale locale) {
                return null;
            }
        });
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0, custom, arg}", registry);
        assertNotNull(emf);
    }

    @Test
    public void testNullRegistryResultsInDefaultBehavior() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", null, null);
        assertEquals("Test {0}", emf.toPattern());
    }

    @Test
    public void testEmptyPattern() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("");
        assertEquals("", emf.toPattern());
    }

    @Test
    public void testPatternWithNoFormatElements() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Plain text");
        assertEquals("Plain text", emf.toPattern());
    }
}