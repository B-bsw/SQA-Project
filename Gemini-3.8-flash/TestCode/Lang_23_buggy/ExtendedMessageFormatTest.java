package org.apache.commons.lang3.text;

import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedMessageFormatTest {

    private static final class MockLowerCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        @Override
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            if (obj != null) {
                toAppendTo.append(obj.toString().toLowerCase(Locale.ENGLISH));
            }
            return toAppendTo;
        }

        @Override
        public Object parseObject(String source, ParsePosition pos) {
            return null;
        }
    }

    private static final class MockUpperCaseFormat extends Format {
        private static final long serialVersionUID = 1L;

        @Override
        public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
            if (obj != null) {
                toAppendTo.append(obj.toString().toUpperCase(Locale.ENGLISH));
            }
            return toAppendTo;
        }

        @Override
        public Object parseObject(String source, ParsePosition pos) {
            return null;
        }
    }

    private static final class MockFormatFactory implements FormatFactory {
        private final Format lowerFormat = new MockLowerCaseFormat();
        private final Format upperFormat = new MockUpperCaseFormat();
        private String lastCapturedArgs;

        public Format getFormat(String name, String arguments, Locale locale) {
            this.lastCapturedArgs = arguments;
            if ("lower".equals(name)) {
                return lowerFormat;
            }
            if ("upper".equals(name)) {
                return upperFormat;
            }
            return null;
        }

        public String getLastCapturedArgs() {
            return lastCapturedArgs;
        }
    }

    @Test
    public void constructor_givenPatternOnly_shouldInitializeProperly() {
        String pattern = "Hello {0}!";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern);
        Assert.assertEquals(pattern, emf.toPattern());
        Assert.assertEquals("Hello World!", emf.format(new Object[] { "World" }));
    }

    @Test
    public void constructor_givenPatternAndLocale_shouldInitializeProperly() {
        String pattern = "Number: {0,number}";
        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, Locale.GERMAN);
        Assert.assertEquals(Locale.GERMAN, emf.getLocale());
        Assert.assertEquals("Number: 123", emf.format(new Object[] { Integer.valueOf(123) }));
    }

    @Test
    public void constructor_givenPatternAndRegistry_shouldFormatWithCustomRegistry() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0,lower}", registry);
        String result = emf.format(new Object[] { "TEST" });
        Assert.assertEquals("Value: test", result);
    }

    @Test
    public void constructor_givenPatternLocaleAndRegistry_shouldHandleCustomFormatWithArgs() {
        MockFormatFactory factory = new MockFormatFactory();
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("upper", factory);

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Value: {0, upper, dummy_args }", Locale.US, registry);
        String result = emf.format(new Object[] { "test" });
        Assert.assertEquals("Value: TEST", result);
        Assert.assertEquals("dummy_args", factory.getLastCapturedArgs());
        Assert.assertEquals("Value: {0,upper, dummy_args }", emf.toPattern());
    }

    @Test
    public void applyPattern_givenNullRegistry_shouldFallbackToDefaultMessageFormat() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}", (Map<String, ? extends FormatFactory>) null);
        Assert.assertEquals("Test {0}", emf.toPattern());
        Assert.assertEquals("Test 123", emf.format(new Object[] { "123" }));
    }

    @Test
    public void applyPattern_givenEscapedQuotesAndText_shouldParseCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("It''s '{0}' '{' {0,lower} ''end''", registry);
        String formatted = emf.format(new Object[] { "HELLO" });
        Assert.assertEquals("It's {0} { hello 'end'", formatted);
    }

    @Test
    public void applyPattern_givenWhitespaceAroundArgumentIndex_shouldParseCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("{   0   , lower }", registry);
        Assert.assertEquals("abc", emf.format(new Object[] { "ABC" }));
    }

    @Test
    public void applyPattern_givenNestedBracesInFormatDescription_shouldParseCorrectly() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,choice,0#zero|1#one: {1}}", registry);
        Assert.assertNotNull(emf);
    }

    @Test
    public void applyPattern_givenQuotesInsideFormatDescription_shouldConsumeQuotedString() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,choice,0#'zero '{1}''|1#one}", registry);
        Assert.assertNotNull(emf);
    }

    @Test
    public void applyPattern_givenUnknownFormatNameInRegistry_shouldPreserveAsBuiltIn() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0,number,integer}", registry);
        Assert.assertEquals("12", emf.format(new Object[] { Double.valueOf(12.34) }));
    }

    @Test
    public void applyPattern_givenNoFormatsInPattern_shouldProduceIdenticalPattern() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Pure text without formats.", registry);
        Assert.assertEquals("Pure text without formats.", emf.toPattern());
        Assert.assertEquals("Pure text without formats.", emf.format(new Object[0]));
    }

    @Test
    public void applyPattern_givenEmptyRegistry_shouldHandleSimpleArgument() {
        Map<String, FormatFactory> registry = Collections.emptyMap();
        ExtendedMessageFormat emf = new ExtendedMessageFormat("{0}", registry);
        Assert.assertEquals("{0}", emf.toPattern());
        Assert.assertEquals("value", emf.format(new Object[] { "value" }));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void setFormat_whenCalled_shouldThrowUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        emf.setFormat(0, new MockLowerCaseFormat());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void setFormatByArgumentIndex_whenCalled_shouldThrowUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        emf.setFormatByArgumentIndex(0, new MockLowerCaseFormat());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void setFormats_whenCalled_shouldThrowUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        emf.setFormats(new Format[] { new MockLowerCaseFormat() });
    }

    @Test(expected = UnsupportedOperationException.class)
    public void setFormatsByArgumentIndex_whenCalled_shouldThrowUnsupportedOperationException() {
        ExtendedMessageFormat emf = new ExtendedMessageFormat("Test {0}");
        emf.setFormatsByArgumentIndex(new Format[] { new MockLowerCaseFormat() });
    }

    @Test
    public void applyPattern_givenUnterminatedQuotedString_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("Unterminated quote: 'abc", registry);
            Assert.fail("Expected IllegalArgumentException for unterminated quote");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unterminated quoted string") >= 0);
        }
    }

    @Test
    public void applyPattern_givenUnterminatedFormatElementAtArgIndex_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("Invalid {0", registry);
            Assert.fail("Expected IllegalArgumentException for unterminated format element");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unterminated format element") >= 0);
        }
    }

    @Test
    public void applyPattern_givenNonDigitArgumentIndex_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("Invalid {abc}", registry);
            Assert.fail("Expected IllegalArgumentException for non-digit argument index");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Invalid format argument index") >= 0);
        }
    }

    @Test
    public void applyPattern_givenWhitespaceInsideArgumentIndex_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("Invalid {0 1}", registry);
            Assert.fail("Expected IllegalArgumentException for invalid space inside argument index");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Invalid format argument index") >= 0);
        }
    }

    @Test
    public void applyPattern_givenUnterminatedFormatDescription_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("Invalid {0,lower", registry);
            Assert.fail("Expected IllegalArgumentException for unterminated format description");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unterminated format element") >= 0);
        }
    }

    @Test
    public void applyPattern_givenMissingEndBraceAfterDescription_shouldThrowIllegalArgumentException() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        try {
            new ExtendedMessageFormat("{0,lower extra", registry);
            Assert.fail("Expected IllegalArgumentException when end brace is missing");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unterminated format element") >= 0);
        }
    }

    @Test
    public void applyPattern_givenMultipleCustomFormats_shouldFormatAllInOrder() {
        Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();
        registry.put("lower", new MockFormatFactory());
        registry.put("upper", new MockFormatFactory());

        ExtendedMessageFormat emf = new ExtendedMessageFormat("Lower: {0,lower}, Upper: {1,upper}", registry);
        String result = emf.format(new Object[] { "HELLO", "world" });
        Assert.assertEquals("Lower: hello, Upper: WORLD", result);
    }
}