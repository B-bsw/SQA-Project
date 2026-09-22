package org.apache.commons.cli2.option;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ArgumentImplTest {

    private WriteableCommandLine createMockCommandLine() {
        return new WriteableCommandLine() {
            private final List values = new ArrayList();
            private int addValueCalls = 0;
            private String lastAddedValue;

            @Override
            public List getValues(Option option) {
                return values;
            }

            @Override
            public void addValue(Option option, Object value) {
                values.add(value);
                lastAddedValue = String.valueOf(value);
                addValueCalls++;
            }

            @Override
            public void setDefaultValues(Option option, List defaults) {
                values.clear();
                if (defaults != null) {
                    values.addAll(defaults);
                }
            }

            @Override
            public boolean looksLikeOption(String arg) {
                return arg.startsWith("-") && !arg.startsWith("--");
            }

            @Override
            public boolean isOption(Option option) {
                return false;
            }

            @Override
            public String[] getOptionValues(Option option) {
                return new String[0];
            }
        };
    }

    private ArgumentImpl createValidArgument() {
        return new ArgumentImpl("test", "description", 1, 3, '\0', '\0', null, null, null, 0);
    }

    private ArgumentImpl createOptionalArgument() {
        return new ArgumentImpl("opt", null, 0, 2, '\0', '\0', null, null, null, 0);
    }

    private ArgumentImpl createBracketedArgument() {
        return new ArgumentImpl("br", "desc", 1, 2, '\0', '\0', null, null, null, 0);
    }

    private ListIterator createStringListIterator(String... values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        return list.listIterator();
    }

    @Test
    public void testConstructorWithValidParameters() {
        ArgumentImpl arg = new ArgumentImpl("name", "desc", 1, 2, '=', ',', null, null, null, 0);
        assertEquals("name", arg.getPreferredName());
        assertEquals("desc", arg.getDescription());
        assertEquals(1, arg.getMinimum());
        assertEquals(2, arg.getMaximum());
        assertEquals('=', arg.getInitialSeparator());
        assertEquals(',', arg.getSubsequentSeparator());
        assertNull(arg.getValidator());
        assertNull(arg.getConsumeRemaining());
        assertNull(arg.getDefaultValues());
    }

    @Test
    public void testConstructorWithNullName() {
        ArgumentImpl arg = new ArgumentImpl(null, "desc", 1, 1, '\0', '\0', null, null, null, 0);
        assertEquals("arg", arg.getPreferredName());
    }

    @Test
    public void testConstructorThrowsWhenMinGreaterThanMax() {
        try {
            new ArgumentImpl("arg", null, 5, 3, '\0', '\0', null, null, null, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorThrowsWhenDefaultsLessThanMin() {
        try {
            List defaults = Arrays.asList("a", "b");
            new ArgumentImpl("arg", null, 3, 5, '\0', '\0', null, null, defaults, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorThrowsWhenDefaultsMoreThanMax() {
        try {
            List defaults = Arrays.asList("a", "b");
            new ArgumentImpl("arg", null, 1, 2, '\0', '\0', null, null, defaults, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testConstructorWithDefaultsExactlyAtMinAndMax() {
        List defaults = Arrays.asList("a", "b");
        ArgumentImpl arg = new ArgumentImpl("arg", null, 1, 2, '\0', '\0', null, null, defaults, 0);
        assertEquals(2, arg.getMaximum());
    }

    @Test
    public void testGetConsumeRemaining() {
        ArgumentImpl arg = new ArgumentImpl("arg", null, 1, 1, '\0', '\0', null, "--", null, 0);
        assertEquals("--", arg.getConsumeRemaining());
    }

    @Test
    public void testGetDefaultValues() {
        List defaults = Arrays.asList("a", "b");
        ArgumentImpl arg = new ArgumentImpl("arg", null, 1, 2, '\0', '\0', null, null, defaults, 0);
        assertEquals(defaults, arg.getDefaultValues());
    }

    @Test
    public void testIsRequiredWhenMinGreaterThanZero() {
        ArgumentImpl arg = new ArgumentImpl("arg", null, 1, 2, '\0', '\0', null, null, null, 0);
        assertTrue(arg.isRequired());
    }

    @Test
    public void testIsRequiredWhenMinIsZero() {
        ArgumentImpl arg = new ArgumentImpl("arg", null, 0, 2, '\0', '\0', null, null, null, 0);
        assertFalse(arg.isRequired());
    }

    @Test
    public void testGetPrefixes() {
        ArgumentImpl arg = createValidArgument();
        Set prefixes = arg.getPrefixes();
        assertNotNull(prefixes);
        assertTrue(prefixes.isEmpty());
    }

    @Test
    public void testGetTriggers() {
        ArgumentImpl arg = createValidArgument();
        Set triggers = arg.getTriggers();
        assertNotNull(triggers);
        assertTrue(triggers.isEmpty());
    }

    @Test
    public void testStripBoundaryQuotesWithQuotedString() {
        ArgumentImpl arg = createValidArgument();
        String result = arg.stripBoundaryQuotes("\"quoted\"");
        assertEquals("quoted", result);
    }

    @Test
    public void testStripBoundaryQuotesWithNull() {
        ArgumentImpl arg = createValidArgument();
        try {
            arg.stripBoundaryQuotes(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testStripBoundaryQuotesWithEmptyString() {
        ArgumentImpl arg = createValidArgument();
        String result = arg.stripBoundaryQuotes("");
        assertEquals("", result);
    }

    @Test
    public void testStripBoundaryQuotesWithSingleQuote() {
        ArgumentImpl arg = createValidArgument();
        String result = arg.stripBoundaryQuotes("\"quote");
        assertEquals("\"quote", result);
    }

    @Test
    public void testProcessValuesWithSimpleValues() throws OptionException {
        ArgumentImpl arg = createValidArgument();
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("value1", "value2");
        arg.processValues(cmd, iter, arg);
        assertEquals(2, cmd.getValues(arg).size());
        assertEquals("value2", cmd.getValues(arg).get(1));
    }

    @Test
    public void testProcessValuesWithMaxLimit() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("v1", "v2", "v3");
        arg.processValues(cmd, iter, arg);
        assertEquals(2, cmd.getValues(arg).size());
        assertEquals("v2", cmd.getValues(arg).get(1));
    }

    @Test
    public void testProcessValuesWithConsumeRemainingToken() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 3, '\0', '\0', null, "--", null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("--", "a", "b");
        arg.processValues(cmd, iter, arg);
        assertEquals(2, cmd.getValues(arg).size());
        assertEquals("a", cmd.getValues(arg).get(0));
        assertEquals("b", cmd.getValues(arg).get(1));
    }

    @Test
    public void testProcessValuesWithLooksLikeOption() throws OptionException {
        ArgumentImpl arg = createValidArgument();
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("-option");
        arg.processValues(cmd, iter, arg);
        assertTrue(cmd.getValues(arg).isEmpty());
        assertTrue(iter.hasPrevious());
    }

    @Test
    public void testProcessValuesWithSubsequentSeparator() throws OptionException {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 3, '\0', ',', null, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("a,b,c");
        arg.processValues(cmd, iter, arg);
        assertEquals(3, cmd.getValues(arg).size());
        assertEquals("a", cmd.getValues(arg).get(0));
        assertEquals("b", cmd.getValues(arg).get(1));
        assertEquals("c", cmd.getValues(arg).get(2));
    }

    @Test
    public void testProcessValuesWithSubsequentSeparatorExceedingMax() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', ',', null, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("a,b,c");
        try {
            arg.processValues(cmd, iter, arg);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testProcessValuesWithValidatorValid() throws OptionException {
        Validator validator = new Validator() {
            @Override
            public void validate(List values) throws InvalidArgumentException {
                // valid, no-op
            }
        };
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', validator, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("valid");
        arg.processValues(cmd, iter, arg);
        assertEquals(1, cmd.getValues(arg).size());
    }

    @Test
    public void testProcessValuesWithValidatorThrowing() {
        Validator validator = new Validator() {
            @Override
            public void validate(List values) throws InvalidArgumentException {
                throw new InvalidArgumentException("invalid");
            }
        };
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', validator, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        ListIterator iter = createStringListIterator("bad");
        try {
            arg.processValues(cmd, iter, arg);
            fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateWhenTooFewValues() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 3, '\0', '\0', null, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        cmd.addValue(arg, "one");
        try {
            arg.validate(cmd, arg);
            fail("Expected OptionException for missing values");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateWhenTooManyValues() {
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, null, 0);
        WriteableCommandLine cmd = createMockCommandLine();
        cmd.addValue(arg, "one");
        cmd.addValue(arg, "two");
        cmd.addValue(arg, "three");
        try {
            arg.validate(cmd, arg);
            fail("Expected OptionException for unexpected value");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateWithExactValues() throws OptionException {
        ArgumentImpl arg = createValidArgument();
        WriteableCommandLine cmd = createMockCommandLine();
        cmd.addValue(arg, "one");
        cmd.addValue(arg, "two");
        arg.validate(cmd, arg);
        // no exception thrown
    }

    @Test
    public void testDefaultValuesSetsCommandLine() {
        List defaults = Arrays.asList("d1", "d2");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, defaults, 0);
        WriteableCommandLine cmd = new WriteableCommandLine() {
            private List storedValues = new ArrayList();
            @Override
            public List getValues(Option option) { return storedValues; }
            @Override
            public void addValue(Option option, Object value) { storedValues.add(value); }
            @Override
            public void setDefaultValues(Option option, List defaults) { storedValues = new ArrayList(defaults); }
            @Override
            public boolean looksLikeOption(String arg) { return false; }
        };
        arg.defaults(cmd);
        assertEquals(defaults, cmd.getValues(arg));
    }

    @Test
    public void testAppendUsageSimple() {
        ArgumentImpl arg = createValidArgument();
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        arg.appendUsage(buffer, settings, null);
        // just ensure no exception
    }

    @Test
    public void testAppendUsageWithOptionalAndNumbered() {
        ArgumentImpl arg = createOptionalArgument();
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        arg.appendUsage(buffer, settings, null);
        assertTrue(buffer.toString().contains("["));
        assertTrue(buffer.toString().contains("]"));
        assertTrue(buffer.toString().contains("<"));
        assertTrue(buffer.toString().contains(">"));
    }

    @Test
    public void testHelpLines() {
        ArgumentImpl arg = createValidArgument();
        Set settings = new HashSet();
        List lines = arg.helpLines(0, settings, null);
        assertNotNull(lines);
        assertEquals(1, lines.size());
    }
}