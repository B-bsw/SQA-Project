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
package org.apache.commons.cli2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Phase 1 - Code Analysis & Test Matrix:
 * 
 * 1. Happy Path:
 *   - canProcess(CommandLine, String): returns true for matching trigger/prefix.
 *   - canProcess(CommandLine, ListIterator): restores iterator position after inspection.
 *   - process(CommandLine, ListIterator): consumes argument and advances iterator state.
 *   - defaults(CommandLine): populates default values.
 *   - validate(CommandLine): passes when required options/rules are satisfied.
 *   - getTriggers() / getPrefixes(): returns non-null trigger and prefix sets.
 *   - helpLines(int, Set, Comparator): builds hierarchical list of help records.
 *   - appendUsage(StringBuffer, Set, Comparator): appends formatted usage string.
 *   - getPreferredName() / getDescription() / getId(): returns configured metadata.
 *   - findOption(String): locates option by matching trigger.
 *   - isRequired(): reports required vs optional state accurately.
 *
 * 2. Boundary & Edge Cases:
 *   - Null command line arguments handling.
 *   - Empty string argument inspection.
 *   - Empty iterator or iterator at end of list.
 *   - Iterator contract verification (restoring cursor index).
 *   - Empty triggers / prefixes sets.
 *   - findOption with null or empty trigger returning null.
 *
 * 3. Error & Exception Branches:
 *   - process(): throws OptionException when argument parsing fails.
 *   - validate(): throws OptionException when required state is missing.
 */
public class OptionTest {

    private ConcreteTestOption testOption;
    private Set expectedTriggers;
    private Set expectedPrefixes;

    @Before
    public void setUp() {
        this.expectedTriggers = new HashSet();
        this.expectedTriggers.add("--output");
        this.expectedTriggers.add("-o");

        this.expectedPrefixes = new HashSet();
        this.expectedPrefixes.add("--");
        this.expectedPrefixes.add("-");

        this.testOption = new ConcreteTestOption(
            101,
            "--output",
            "Specify output file destination",
            this.expectedTriggers,
            this.expectedPrefixes,
            true
        );
    }

    @Test
    public void getId_givenInitializedOption_shouldReturnConfiguredId() {
        // Arrange & Act
        int id = this.testOption.getId();

        // Assert
        Assert.assertEquals(101, id);
    }

    @Test
    public void getPreferredName_givenInitializedOption_shouldReturnPreferredName() {
        // Arrange & Act
        String preferredName = this.testOption.getPreferredName();

        // Assert
        Assert.assertEquals("--output", preferredName);
    }

    @Test
    public void getDescription_givenInitializedOption_shouldReturnDescription() {
        // Arrange & Act
        String description = this.testOption.getDescription();

        // Assert
        Assert.assertEquals("Specify output file destination", description);
    }

    @Test
    public void isRequired_givenRequiredFlagTrue_shouldReturnTrue() {
        // Arrange & Act
        boolean required = this.testOption.isRequired();

        // Assert
        Assert.assertTrue(required);
    }

    @Test
    public void isRequired_givenRequiredFlagFalse_shouldReturnFalse() {
        // Arrange
        ConcreteTestOption optionalOption = new ConcreteTestOption(
            102, "-v", "Verbose mode", Collections.EMPTY_SET, Collections.EMPTY_SET, false
        );

        // Act
        boolean required = optionalOption.isRequired();

        // Assert
        Assert.assertFalse(required);
    }

    @Test
    public void getTriggers_whenInvoked_shouldReturnNonNullTriggersSet() {
        // Arrange & Act
        Set triggers = this.testOption.getTriggers();

        // Assert
        Assert.assertNotNull(triggers);
        Assert.assertEquals(2, triggers.size());
        Assert.assertTrue(triggers.contains("--output"));
        Assert.assertTrue(triggers.contains("-o"));
    }

    @Test
    public void getPrefixes_whenInvoked_shouldReturnNonNullPrefixesSet() {
        // Arrange & Act
        Set prefixes = this.testOption.getPrefixes();

        // Assert
        Assert.assertNotNull(prefixes);
        Assert.assertEquals(2, prefixes.size());
        Assert.assertTrue(prefixes.contains("--"));
        Assert.assertTrue(prefixes.contains("-"));
    }

    @Test
    public void canProcess_givenMatchingArgumentString_shouldReturnTrue() {
        // Arrange & Act
        boolean canProcessLong = this.testOption.canProcess(null, "--output");
        boolean canProcessShort = this.testOption.canProcess(null, "-o");

        // Assert
        Assert.assertTrue(canProcessLong);
        Assert.assertTrue(canProcessShort);
    }

    @Test
    public void canProcess_givenNonMatchingArgumentString_shouldReturnFalse() {
        // Arrange & Act
        boolean canProcess = this.testOption.canProcess(null, "--input");

        // Assert
        Assert.assertFalse(canProcess);
    }

    @Test
    public void canProcess_givenNullArgumentString_shouldReturnFalse() {
        // Arrange & Act
        boolean canProcess = this.testOption.canProcess(null, (String) null);

        // Assert
        Assert.assertFalse(canProcess);
    }

    @Test
    public void canProcess_givenEmptyArgumentString_shouldReturnFalse() {
        // Arrange & Act
        boolean canProcess = this.testOption.canProcess(null, "");

        // Assert
        Assert.assertFalse(canProcess);
    }

    @Test
    public void canProcess_givenListIteratorWithMatch_shouldReturnTrueAndRestoreCursor() {
        // Arrange
        List argsList = new ArrayList();
        argsList.add("--output");
        argsList.add("out.txt");
        ListIterator iterator = argsList.listIterator();

        int initialIndex = iterator.nextIndex();

        // Act
        boolean result = this.testOption.canProcess(null, iterator);

        // Assert
        Assert.assertTrue(result);
        Assert.assertEquals("Iterator position must be restored", initialIndex, iterator.nextIndex());
    }

    @Test
    public void canProcess_givenListIteratorWithoutMatch_shouldReturnFalseAndRestoreCursor() {
        // Arrange
        List argsList = new ArrayList();
        argsList.add("--invalid");
        argsList.add("value");
        ListIterator iterator = argsList.listIterator();

        int initialIndex = iterator.nextIndex();

        // Act
        boolean result = this.testOption.canProcess(null, iterator);

        // Assert
        Assert.assertFalse(result);
        Assert.assertEquals("Iterator position must be restored", initialIndex, iterator.nextIndex());
    }

    @Test
    public void canProcess_givenEmptyListIterator_shouldReturnFalse() {
        // Arrange
        List emptyList = new ArrayList();
        ListIterator iterator = emptyList.listIterator();

        // Act
        boolean result = this.testOption.canProcess(null, iterator);

        // Assert
        Assert.assertFalse(result);
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void process_givenValidArguments_shouldProcessAndAdvanceIterator() throws OptionException {
        // Arrange
        List argsList = new ArrayList();
        argsList.add("--output");
        argsList.add("final.txt");
        ListIterator iterator = argsList.listIterator();

        // Act
        this.testOption.process(null, iterator);

        // Assert
        Assert.assertEquals(1, iterator.nextIndex());
        Assert.assertTrue(this.testOption.isProcessed());
    }

    @Test
    public void process_givenInvalidArguments_shouldThrowOptionException() {
        // Arrange
        List argsList = new ArrayList();
        argsList.add("--unknown");
        ListIterator iterator = argsList.listIterator();

        // Act & Assert
        try {
            this.testOption.process(null, iterator);
            Assert.fail("Expected OptionException when processing unknown argument");
        } catch (OptionException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void process_givenEmptyIterator_shouldThrowOptionException() {
        // Arrange
        List emptyList = new ArrayList();
        ListIterator iterator = emptyList.listIterator();

        // Act & Assert
        try {
            this.testOption.process(null, iterator);
            Assert.fail("Expected OptionException when iterator is empty");
        } catch (OptionException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void defaults_givenCommandLine_shouldApplyDefaults() {
        // Arrange & Act
        this.testOption.defaults(null);

        // Assert
        Assert.assertTrue(this.testOption.isDefaultsApplied());
    }

    @Test
    public void validate_givenValidState_shouldCompleteWithoutException() throws OptionException {
        // Arrange
        this.testOption.setValid(true);

        // Act
        this.testOption.validate(null);

        // Assert
        Assert.assertTrue(this.testOption.isValid());
    }

    @Test
    public void validate_givenInvalidState_shouldThrowOptionException() {
        // Arrange
        this.testOption.setValid(false);

        // Act & Assert
        try {
            this.testOption.validate(null);
            Assert.fail("Expected OptionException when validation fails");
        } catch (OptionException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void findOption_givenDirectTriggerMatch_shouldReturnSelf() {
        // Arrange & Act
        Option found = this.testOption.findOption("--output");

        // Assert
        Assert.assertNotNull(found);
        Assert.assertSame(this.testOption, found);
    }

    @Test
    public void findOption_givenAliasTriggerMatch_shouldReturnSelf() {
        // Arrange & Act
        Option found = this.testOption.findOption("-o");

        // Assert
        Assert.assertNotNull(found);
        Assert.assertSame(this.testOption, found);
    }

    @Test
    public void findOption_givenChildTriggerMatch_shouldReturnChildOption() {
        // Arrange
        ConcreteTestOption childOption = new ConcreteTestOption(
            103,
            "--child",
            "Child option",
            Collections.singleton("--child"),
            Collections.singleton("--"),
            false
        );
        this.testOption.addChild(childOption);

        // Act
        Option found = this.testOption.findOption("--child");

        // Assert
        Assert.assertNotNull(found);
        Assert.assertSame(childOption, found);
    }

    @Test
    public void findOption_givenUnknownTrigger_shouldReturnNull() {
        // Arrange & Act
        Option found = this.testOption.findOption("--non-existent");

        // Assert
        Assert.assertNull(found);
    }

    @Test
    public void findOption_givenNullTrigger_shouldReturnNull() {
        // Arrange & Act
        Option found = this.testOption.findOption(null);

        // Assert
        Assert.assertNull(found);
    }

    @Test
    public void appendUsage_givenBufferAndSettings_shouldAppendFormattedUsage() {
        // Arrange
        StringBuffer buffer = new StringBuffer();

        // Act
        this.testOption.appendUsage(buffer, Collections.EMPTY_SET, null);

        // Assert
        Assert.assertEquals("[--output]", buffer.toString());
    }

    @Test
    public void helpLines_givenDepthAndSettings_shouldReturnFormattedHelpLines() {
        // Arrange & Act
        List lines = this.testOption.helpLines(0, Collections.EMPTY_SET, null);

        // Assert
        Assert.assertNotNull(lines);
        Assert.assertEquals(1, lines.size());
        Assert.assertEquals("--output: Specify output file destination", lines.get(0));
    }

    /**
     * Concrete implementation of Option to test contract requirements without mocking frameworks.
     */
    private static class ConcreteTestOption implements Option {

        private final int id;
        private final String preferredName;
        private final String description;
        private final Set triggers;
        private final Set prefixes;
        private final boolean required;
        private final List children;

        private boolean processed;
        private boolean defaultsApplied;
        private boolean valid;

        public ConcreteTestOption(
            final int id,
            final String preferredName,
            final String description,
            final Set triggers,
            final Set prefixes,
            final boolean required) {
            this.id = id;
            this.preferredName = preferredName;
            this.description = description;
            this.triggers = (triggers != null) ? triggers : Collections.EMPTY_SET;
            this.prefixes = (prefixes != null) ? prefixes : Collections.EMPTY_SET;
            this.required = required;
            this.children = new ArrayList();
            this.processed = false;
            this.defaultsApplied = false;
            this.valid = true;
        }

        public void addChild(final Option child) {
            if (child != null) {
                this.children.add(child);
            }
        }

        public boolean isProcessed() {
            return this.processed;
        }

        public boolean isDefaultsApplied() {
            return this.defaultsApplied;
        }

        public boolean isValid() {
            return this.valid;
        }

        public void setValid(final boolean valid) {
            this.valid = valid;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator args)
            throws OptionException {
            if (args == null || !args.hasNext()) {
                throw new OptionException(this, "No arguments to process");
            }
            String nextArg = (String) args.next();
            if (canProcess(commandLine, nextArg)) {
                this.processed = true;
            } else {
                throw new OptionException(this, "Unexpected argument: " + nextArg);
            }
        }

        public void defaults(final WriteableCommandLine commandLine) {
            this.defaultsApplied = true;
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            if (argument == null || argument.length() == 0) {
                return false;
            }
            return this.triggers.contains(argument);
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final ListIterator arguments) {
            if (arguments == null || !arguments.hasNext()) {
                return false;
            }
            boolean result = false;
            String next = (String) arguments.next();
            try {
                result = canProcess(commandLine, next);
            } finally {
                arguments.previous();
            }
            return result;
        }

        public Set getTriggers() {
            return this.triggers;
        }

        public Set getPrefixes() {
            return this.prefixes;
        }

        public void validate(final WriteableCommandLine commandLine) throws OptionException {
            if (!this.valid) {
                throw new OptionException(this, "Validation failed for option: " + this.preferredName);
            }
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comp) {
            List result = new ArrayList();
            result.add(this.preferredName + ": " + this.description);
            for (int i = 0; i < this.children.size(); i++) {
                Option child = (Option) this.children.get(i);
                result.addAll(child.helpLines(depth + 1, helpSettings, comp));
            }
            return result;
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings, final Comparator comp) {
            buffer.append("[").append(this.preferredName).append("]");
        }

        public String getPreferredName() {
            return this.preferredName;
        }

        public String getDescription() {
            return this.description;
        }

        public int getId() {
            return this.id;
        }

        public Option findOption(final String trigger) {
            if (trigger == null) {
                return null;
            }
            if (this.triggers.contains(trigger)) {
                return this;
            }
            for (int i = 0; i < this.children.size(); i++) {
                Option child = (Option) this.children.get(i);
                Option found = child.findOption(trigger);
                if (found != null) {
                    return found;
                }
            }
            return null;
        }

        public boolean isRequired() {
            return this.required;
        }
    }
}