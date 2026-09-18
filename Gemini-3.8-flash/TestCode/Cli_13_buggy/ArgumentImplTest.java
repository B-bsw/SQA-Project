/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.cli2.option;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.HelpLine;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.validation.InvalidArgumentException;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for ArgumentImpl covering line, branch, and edge case coverage.
 * Compatible with Java 1.4/Java 7 syntax (no diamond operators, no lambdas/streams).
 */
public class ArgumentImplTest {

    private MockCommandLineHandler cmdHandler;
    private WriteableCommandLine commandLine;

    @Before
    public void setUp() {
        cmdHandler = new MockCommandLineHandler();
        commandLine = (WriteableCommandLine) Proxy.newProxyInstance(
            WriteableCommandLine.class.getClassLoader(),
            new Class[] { WriteableCommandLine.class },
            cmdHandler
        );
    }

    // =========================================================================
    // Constructor & Invariant Tests
    // =========================================================================

    @Test
    public void constructor_givenValidParameters_shouldInitializeProperly() {
        // Arrange
        List defaults = Collections.singletonList("defaultVal");
        DummyValidator validator = new DummyValidator(false, null);

        // Act
        ArgumentImpl arg = new ArgumentImpl(
            "customArg", "A custom argument", 1, 3, '=', ',', validator, "--", defaults, 42
        );

        // Assert
        Assert.assertEquals("customArg", arg.getPreferredName());
        Assert.assertEquals("A custom argument", arg.getDescription());
        Assert.assertEquals(1, arg.getMinimum());
        Assert.assertEquals(3, arg.getMaximum());
        Assert.assertEquals('=', arg.getInitialSeparator());
        Assert.assertEquals(',', arg.getSubsequentSeparator());
        Assert.assertSame(validator, arg.getValidator());
        Assert.assertEquals("--", arg.getConsumeRemaining());
        Assert.assertEquals(defaults, arg.getDefaultValues());
        Assert.assertEquals(42, arg.getId());
        Assert.assertTrue(arg.isRequired());
    }

    @Test
    public void constructor_givenNullName_shouldDefaultToArg() {
        // Arrange & Act
        ArgumentImpl arg = new ArgumentImpl(
            null, "description", 0, 1, '\0', '\0', null, null, null, 0
        );

        // Assert
        Assert.assertEquals("arg", arg.getPreferredName());
        Assert.assertFalse(arg.isRequired());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenMinimumGreaterThanMaximum_shouldThrowException() {
        // Act: minimum (3) > maximum (2)
        new ArgumentImpl("arg", "desc", 3, 2, '\0', '\0', null, null, null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenDefaultsLessThanMinimum_shouldThrowException() {
        // Arrange: minimum is 2, but only 1 default provided
        List defaults = Collections.singletonList("v1");

        // Act
        new ArgumentImpl("arg", "desc", 2, 3, '\0', '\0', null, null, defaults, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenDefaultsGreaterThanMaximum_shouldThrowException() {
        // Arrange: maximum is 2, but 3 defaults provided
        List defaults = Arrays.asList(new Object[] {"v1", "v2", "v3"});

        // Act
        new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, null, defaults, 0);
    }

    @Test
    public void constructor_givenEmptyDefaults_shouldSucceedRegardlessOfMinimum() {
        // Arrange
        List emptyDefaults = new ArrayList();

        // Act
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 5, '\0', '\0', null, null, emptyDefaults, 0);

        // Assert
        Assert.assertEquals(emptyDefaults, arg.getDefaultValues());
    }

    // =========================================================================
    // Basic Property & Metadata Tests
    // =========================================================================

    @Test
    public void canProcess_givenAnyString_shouldAlwaysReturnTrue() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, null, null, 0);

        // Act & Assert
        Assert.assertTrue(arg.canProcess(commandLine, "anything"));
        Assert.assertTrue(arg.canProcess(commandLine, "-opt"));
        Assert.assertTrue(arg.canProcess(commandLine, null));
    }

    @Test
    public void getPrefixesAndTriggers_shouldReturnEmptySets() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, null, null, 0);

        // Act & Assert
        Assert.assertEquals(Collections.EMPTY_SET, arg.getPrefixes());
        Assert.assertEquals(Collections.EMPTY_SET, arg.getTriggers());
    }

    @Test
    public void helpLines_shouldReturnSingleHelpLine() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "help test", 0, 1, '\0', '\0', null, null, null, 0);

        // Act
        List lines = arg.helpLines(1, Collections.EMPTY_SET, null);

        // Assert
        Assert.assertNotNull(lines);
        Assert.assertEquals(1, lines.size());
        Assert.assertTrue(lines.get(0) instanceof HelpLine);
    }

    // =========================================================================
    // stripBoundaryQuotes Tests
    // =========================================================================

    @Test
    public void stripBoundaryQuotes_givenEnclosedQuotes_shouldStripThem() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, null, null, 0);

        // Act & Assert
        Assert.assertEquals("hello", arg.stripBoundaryQuotes("\"hello\""));
        Assert.assertEquals("", arg.stripBoundaryQuotes("\"\""));
    }

    @Test
    public void stripBoundaryQuotes_givenUnquotedOrMismatched_shouldReturnOriginal() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 1, '\0', '\0', null, null, null, 0);

        // Act & Assert
        Assert.assertEquals("hello", arg.stripBoundaryQuotes("hello"));
        Assert.assertEquals("\"hello", arg.stripBoundaryQuotes("\"hello"));
        Assert.assertEquals("hello\"", arg.stripBoundaryQuotes("hello\""));
        Assert.assertEquals("", arg.stripBoundaryQuotes(""));
    }

    // =========================================================================
    // Default Values & defaults() Tests
    // =========================================================================

    @Test
    public void defaults_givenCommandLine_shouldSetDefaultValues() {
        // Arrange
        List defaults = Arrays.asList(new Object[] {"def1", "def2"});
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, defaults, 0);

        // Act
        arg.defaults(commandLine);

        // Assert
        List registered = (List) cmdHandler.defaultValues.get(arg);
        Assert.assertNotNull(registered);
        Assert.assertEquals(defaults, registered);
    }

    // =========================================================================
    // Processing Logic (processValues / process) Tests
    // =========================================================================

    @Test
    public void process_givenRegularTokens_shouldAddValuesUpToMaximum() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, null, 0);
        List tokenList = new ArrayList(Arrays.asList(new Object[] {"first", "\"second\"", "third"}));
        ListIterator it = tokenList.listIterator();

        // Act
        arg.process(commandLine, it);

        // Assert: maximum is 2, so only 2 should be consumed
        List values = (List) cmdHandler.values.get(arg);
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("first", values.get(0));
        Assert.assertEquals("second", values.get(1)); // quotes stripped

        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("third", it.next());
    }

    @Test
    public void process_givenConsumeRemainingToken_shouldConsumeRemainingArguments() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', '\0', null, "--", null, 0);
        List tokenList = new ArrayList(Arrays.asList(new Object[] {"--", "-x", "-y", "file"}));
        ListIterator it = tokenList.listIterator();

        // Act
        arg.process(commandLine, it);

        // Assert
        List values = (List) cmdHandler.values.get(arg);
        Assert.assertNotNull(values);
        Assert.assertEquals(3, values.size());
        Assert.assertEquals("-x", values.get(0));
        Assert.assertEquals("-y", values.get(1));
        Assert.assertEquals("file", values.get(2));
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenConsumeRemainingTokenReachingMaximum_shouldStopAtMaximum() throws Exception {
        // Arrange: maximum is 2
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', '\0', null, "--", null, 0);
        List tokenList = new ArrayList(Arrays.asList(new Object[] {"--", "one", "two", "three"}));
        ListIterator it = tokenList.listIterator();

        // Act
        arg.process(commandLine, it);

        // Assert
        List values = (List) cmdHandler.values.get(arg);
        Assert.assertEquals(2, values.size());
        Assert.assertEquals("one", values.get(0));
        Assert.assertEquals("two", values.get(1));
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("three", it.next());
    }

    @Test
    public void process_givenOptionLookingToken_shouldRewindAndBreak() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 3, '\0', '\0', null, null, null, 0);
        cmdHandler.optionTriggers.add("-opt");
        List tokenList = new ArrayList(Arrays.asList(new Object[] {"value1", "-opt", "value2"}));
        ListIterator it = tokenList.listIterator();

        // Act
        arg.process(commandLine, it);

        // Assert
        List values = (List) cmdHandler.values.get(arg);
        Assert.assertEquals(1, values.size());
        Assert.assertEquals("value1", values.get(0));

        // It should have called arguments.previous(), so "-opt" is the next element
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("-opt", it.next());
    }

    @Test
    public void process_givenSubsequentSeparator_shouldSplitTokensAndAddToIterator() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 5, '\0', ',', null, null, null, 0);
        List tokenList = new ArrayList();
        tokenList.add("\"item1,item2,item3\"");
        ListIterator it = tokenList.listIterator();

        // Act
        arg.process(commandLine, it);

        // Assert
        List values = (List) cmdHandler.values.get(arg);
        Assert.assertEquals(3, values.size());
        Assert.assertEquals("item1", values.get(0));
        Assert.assertEquals("item2", values.get(1));
        Assert.assertEquals("item3", values.get(2));
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void process_givenSubsequentSeparatorExceedingMaximum_shouldThrowOptionException() {
        // Arrange: maximum is 2, but 3 tokens exist
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 0, 2, '\0', ',', null, null, null, 0);
        List tokenList = new ArrayList(Collections.singletonList("item1,item2,item3"));
        ListIterator it = tokenList.listIterator();

        // Act & Assert
        try {
            arg.process(commandLine, it);
            Assert.fail("Expected OptionException when split values exceed maximum");
        } catch (OptionException e) {
            Assert.assertSame(arg, e.getOption());
        }
    }

    // =========================================================================
    // Validation Tests
    // =========================================================================

    @Test(expected = OptionException.class)
    public void validate_givenFewerValuesThanMinimum_shouldThrowOptionException() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 2, 4, '\0', '\0', null, null, null, 0);
        cmdHandler.values.put(arg, Collections.singletonList("onlyOne"));

        // Act
        arg.validate(commandLine);
    }

    @Test(expected = OptionException.class)
    public void validate_givenMoreValuesThanMaximum_shouldThrowOptionException() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', null, null, null, 0);
        cmdHandler.values.put(arg, Arrays.asList(new Object[] {"v1", "v2", "v3"}));

        // Act
        arg.validate(commandLine);
    }

    @Test
    public void validate_givenValidValuesAndNoValidator_shouldSucceed() throws Exception {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 3, '\0', '\0', null, null, null, 0);
        cmdHandler.values.put(arg, Arrays.asList(new Object[] {"v1", "v2"}));

        // Act
        arg.validate(commandLine);
    }

    @Test
    public void validate_givenValidatorPassing_shouldSucceed() throws Exception {
        // Arrange
        DummyValidator validator = new DummyValidator(false, null);
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', validator, null, null, 0);
        cmdHandler.values.put(arg, Collections.singletonList("validVal"));

        // Act
        arg.validate(commandLine);
    }

    @Test
    public void validate_givenValidatorFailing_shouldThrowOptionException() {
        // Arrange
        DummyValidator validator = new DummyValidator(true, "invalid value format");
        ArgumentImpl arg = new ArgumentImpl("arg", "desc", 1, 2, '\0', '\0', validator, null, null, 0);
        cmdHandler.values.put(arg, Collections.singletonList("badVal"));

        // Act & Assert
        try {
            arg.validate(commandLine);
            Assert.fail("Expected OptionException from validator failure");
        } catch (OptionException e) {
            Assert.assertSame(arg, e.getOption());
            Assert.assertTrue(e.getMessage().indexOf("invalid value format") >= 0);
        }
    }

    // =========================================================================
    // appendUsage Tests
    // =========================================================================

    @Test
    public void appendUsage_givenBasicRequiredSingleArgument_shouldAppendName() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("target", "desc", 1, 1, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();

        // Act
        arg.appendUsage(buffer, Collections.EMPTY_SET, null);

        // Assert
        Assert.assertEquals("target", buffer.toString());
    }

    @Test
    public void appendUsage_givenBracketedSetting_shouldWrapInAngleBrackets() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("target", "desc", 1, 1, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();
        Set settings = Collections.singleton(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);

        // Act
        arg.appendUsage(buffer, settings, null);

        // Assert
        Assert.assertEquals("<target>", buffer.toString());
    }

    @Test
    public void appendUsage_givenNumberedAndMultipleMax_shouldAppendNumbers() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("item", "desc", 2, 2, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();
        Set settings = Collections.singleton(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);

        // Act
        arg.appendUsage(buffer, settings, null);

        // Assert
        Assert.assertEquals("item1 item2", buffer.toString());
    }

    @Test
    public void appendUsage_givenOptionalAndZeroMinimum_shouldWrapInSquareBrackets() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("optArg", "desc", 0, 1, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();
        Set settings = Collections.singleton(DisplaySetting.DISPLAY_OPTIONAL);

        // Act
        arg.appendUsage(buffer, settings, null);

        // Assert
        Assert.assertEquals("[optArg]", buffer.toString());
    }

    @Test
    public void appendUsage_givenInfiniteMax_shouldAppendEllipsis() {
        // Arrange
        ArgumentImpl arg = new ArgumentImpl("file", "desc", 1, Integer.MAX_VALUE, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);

        // Act
        arg.appendUsage(buffer, settings, null);

        // Assert: crops to 2, second is optional (i >= minimum where minimum=1)
        Assert.assertEquals("<file> [<file>] ...", buffer.toString());
    }

    @Test
    public void appendUsage_givenCombinedSettingsNumberedBracketedOptional() {
        // Arrange: min 1, max 2
        ArgumentImpl arg = new ArgumentImpl("val", "desc", 1, 2, '\0', '\0', null, null, null, 0);
        StringBuffer buffer = new StringBuffer();
        Set settings = new HashSet();
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_BRACKETED);
        settings.add(DisplaySetting.DISPLAY_ARGUMENT_NUMBERED);
        settings.add(DisplaySetting.DISPLAY_OPTIONAL);

        // Act
        arg.appendUsage(buffer, settings, null);

        // Assert: first is required <val1>, second is optional [<val2>]
        Assert.assertEquals("<val1> [<val2>]", buffer.toString());
    }

    // =========================================================================
    // Test Doubles & Helpers
    // =========================================================================

    private static class DummyValidator implements Validator {
        private final boolean fail;
        private final String errorMessage;

        public DummyValidator(boolean fail, String errorMessage) {
            this.fail = fail;
            this.errorMessage = errorMessage;
        }

        public void validate(List values) throws InvalidArgumentException {
            if (fail) {
                throw new InvalidArgumentException(errorMessage);
            }
        }
    }

    private static class MockCommandLineHandler implements InvocationHandler {
        public final Map values = new HashMap();
        public final Map defaultValues = new HashMap();
        public final Set optionTriggers = new HashSet();

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String name = method.getName();
            if ("addValue".equals(name)) {
                Option opt = (Option) args[0];
                Object val = args[1];
                List list = (List) values.get(opt);
                if (list == null) {
                    list = new ArrayList();
                    values.put(opt, list);
                }
                list.add(val);
                return null;
            } else if ("getValues".equals(name)) {
                Option opt = (Option) args[0];
                List list = (List) values.get(opt);
                return (list != null) ? list : Collections.EMPTY_LIST;
            } else if ("looksLikeOption".equals(name)) {
                String str = (String) args[0];
                return Boolean.valueOf(optionTriggers.contains(str));
            } else if ("setDefaultValues".equals(name)) {
                Option opt = (Option) args[0];
                List list = (List) args[1];
                defaultValues.put(opt, list);
                return null;
            } else if ("getDefaultValues".equals(name)) {
                Option opt = (Option) args[0];
                return defaultValues.get(opt);
            } else if ("toString".equals(name)) {
                return "MockCommandLine";
            }
            Class returnType = method.getReturnType();
            if (returnType.equals(boolean.class)) {
                return Boolean.FALSE;
            }
            if (returnType.equals(int.class)) {
                return Integer.valueOf(0);
            }
            return null;
        }
    }
}