package org.apache.commons.cli2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit 4 test suite for the {@link Option} interface.
 *
 * Since Option is an interface, we provide a concrete stub implementation
 * (OptionStub) that allows us to exercise all methods, branches and
 * exception paths defined by the contract.
 */
public class OptionTest {

    /**
     * A minimal, configurable stub implementation of the Option interface
     * used to exercise the interface's contract through JUnit tests.
     */
    static class OptionStub implements Option {

        private final Set triggers;
        private final Set prefixes;
        private final String preferredName;
        private final String description;
        private final int id;
        private final boolean required;
        private boolean throwOnProcess = false;
        private boolean throwOnValidate = false;
        private int processedCount = 0;
        private boolean defaultsCalled = false;
        private boolean validateCalled = false;

        OptionStub(final Set triggers, final Set prefixes, final String preferredName,
                final String description, final int id, final boolean required) {
            this.triggers = triggers;
            this.prefixes = prefixes;
            this.preferredName = preferredName;
            this.description = description;
            this.id = id;
            this.required = required;
        }

        void setThrowOnProcess(final boolean throwOnProcess) {
            this.throwOnProcess = throwOnProcess;
        }

        void setThrowOnValidate(final boolean throwOnValidate) {
            this.throwOnValidate = throwOnValidate;
        }

        int getProcessedCount() {
            return processedCount;
        }

        boolean isDefaultsCalled() {
            return defaultsCalled;
        }

        boolean isValidateCalled() {
            return validateCalled;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator args)
                throws OptionException {
            if (throwOnProcess) {
                throw new OptionException(this, "stub.process.error");
            }
            if (args.hasNext()) {
                args.next();
                processedCount++;
            }
        }

        public void defaults(final WriteableCommandLine commandLine) {
            defaultsCalled = true;
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            if (argument == null) {
                return false;
            }
            return triggers.contains(argument);
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final ListIterator arguments) {
            if (!arguments.hasNext()) {
                return false;
            }
            final Object next = arguments.next();
            final boolean result = triggers.contains(next);
            arguments.previous();
            return result;
        }

        public Set getTriggers() {
            return triggers;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public void validate(final WriteableCommandLine commandLine) throws OptionException {
            validateCalled = true;
            if (throwOnValidate) {
                throw new OptionException(this, "stub.validate.error");
            }
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comp) {
            final List lines = new ArrayList();
            if (depth >= 0) {
                lines.add("helpline-depth-" + depth);
            }
            return lines;
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings, final Comparator comp) {
            buffer.append(preferredName);
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public int getId() {
            return id;
        }

        public Option findOption(final String trigger) {
            if (trigger != null && triggers.contains(trigger)) {
                return this;
            }
            return null;
        }

        public boolean isRequired() {
            return required;
        }
    }

    /**
     * Minimal fake OptionException that mimics the constructor signature
     * used within the Option contract (option, message).
     */
    static class OptionException extends Exception {
        private final Option option;

        OptionException(final Option option, final String message) {
            super(message);
            this.option = option;
        }

        Option getOption() {
            return option;
        }
    }

    /**
     * Minimal fake WriteableCommandLine used purely as a placeholder
     * argument for method calls under test - no behaviour required.
     */
    static class WriteableCommandLineStub implements WriteableCommandLine {
        // No methods required for this interface in the current test scope.
        // WriteableCommandLine likely extends CommandLine; if it declares
        // methods, they'd need to be implemented. For the purpose of these
        // tests we only need an instance reference, so we implement nothing
        // extra unless required by compilation.
    }

    private OptionStub option;
    private Set triggers;
    private Set prefixes;
    private WriteableCommandLine dummyCommandLine;

    @Before
    public void setUp() {
        triggers = new HashSet();
        triggers.add("-t");
        triggers.add("--test");

        prefixes = new HashSet();
        prefixes.add("-");
        prefixes.add("--");

        option = new OptionStub(triggers, prefixes, "--test", "A test option", 42, true);
        dummyCommandLine = new WriteableCommandLineStub();
    }

    // ---------- process(...) ----------

    @Test
    public void testProcess_NormalCase_AdvancesIterator() throws OptionException {
        final List args = new ArrayList();
        args.add("-t");
        args.add("value");
        final ListIterator it = args.listIterator();

        option.process(dummyCommandLine, it);

        assertEquals(1, option.getProcessedCount());
        assertTrue(it.hasNext());
        assertEquals("value", it.next());
    }

    @Test
    public void testProcess_EmptyArguments_NoAdvance() throws OptionException {
        final List args = new ArrayList();
        final ListIterator it = args.listIterator();

        option.process(dummyCommandLine, it);

        assertEquals(0, option.getProcessedCount());
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcess_MultipleCallsProcessMultipleTimes() throws OptionException {
        final List args = new ArrayList();
        args.add("a");
        args.add("b");
        args.add("c");
        final ListIterator it = args.listIterator();

        option.process(dummyCommandLine, it);
        option.process(dummyCommandLine, it);
        option.process(dummyCommandLine, it);

        assertEquals(3, option.getProcessedCount());
        assertFalse(it.hasNext());
    }

    @Test
    public void testProcess_ExceptionPath() {
        option.setThrowOnProcess(true);
        final List args = new ArrayList();
        args.add("x");
        final ListIterator it = args.listIterator();

        try {
            option.process(dummyCommandLine, it);
            fail("Expected OptionException to be thrown");
        } catch (final OptionException e) {
            assertEquals("stub.process.error", e.getMessage());
            assertEquals(option, e.getOption());
        }
    }

    // ---------- defaults(...) ----------

    @Test
    public void testDefaults_SetsFlag() {
        assertFalse(option.isDefaultsCalled());
        option.defaults(dummyCommandLine);
        assertTrue(option.isDefaultsCalled());
    }

    // ---------- canProcess(WriteableCommandLine, String) ----------

    @Test
    public void testCanProcess_String_NormalCase_True() {
        assertTrue(option.canProcess(dummyCommandLine, "-t"));
    }

    @Test
    public void testCanProcess_String_NormalCase_False() {
        assertFalse(option.canProcess(dummyCommandLine, "-z"));
    }

    @Test
    public void testCanProcess_String_NullInput() {
        assertFalse(option.canProcess(dummyCommandLine, null));
    }

    @Test
    public void testCanProcess_String_EmptyInput() {
        assertFalse(option.canProcess(dummyCommandLine, ""));
    }

    // ---------- canProcess(WriteableCommandLine, ListIterator) ----------

    @Test
    public void testCanProcess_Iterator_NormalCase_TrueAndRestoresState() {
        final List args = new ArrayList();
        args.add("-t");
        args.add("more");
        final ListIterator it = args.listIterator();

        final boolean result = option.canProcess(dummyCommandLine, it);

        assertTrue(result);
        // iterator should be restored to original position
        assertEquals("-t", it.next());
    }

    @Test
    public void testCanProcess_Iterator_False() {
        final List args = new ArrayList();
        args.add("-z");
        final ListIterator it = args.listIterator();

        final boolean result = option.canProcess(dummyCommandLine, it);

        assertFalse(result);
        assertEquals("-z", it.next());
    }

    @Test
    public void testCanProcess_Iterator_EmptyList_False() {
        final List args = new ArrayList();
        final ListIterator it = args.listIterator();

        final boolean result = option.canProcess(dummyCommandLine, it);

        assertFalse(result);
        assertFalse(it.hasNext());
    }

    // ---------- getTriggers() ----------

    @Test
    public void testGetTriggers_NotNullAndContainsExpected() {
        final Set result = option.getTriggers();
        assertNotNull(result);
        assertTrue(result.contains("-t"));
        assertTrue(result.contains("--test"));
        assertEquals(2, result.size());
    }

    @Test
    public void testGetTriggers_EmptySet() {
        final OptionStub emptyTriggerOption = new OptionStub(new HashSet(), prefixes, "--x", "desc", 1, false);
        final Set result = emptyTriggerOption.getTriggers();
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ---------- getPrefixes() ----------

    @Test
    public void testGetPrefixes_NotNullAndContainsExpected() {
        final Set result = option.getPrefixes();
        assertNotNull(result);
        assertTrue(result.contains("-"));
        assertTrue(result.contains("--"));
    }

    // ---------- validate(...) ----------

    @Test
    public void testValidate_NormalCase_NoException() throws OptionException {
        option.validate(dummyCommandLine);
        assertTrue(option.isValidateCalled());
    }

    @Test
    public void testValidate_ExceptionPath() {
        option.setThrowOnValidate(true);
        try {
            option.validate(dummyCommandLine);
            fail("Expected OptionException to be thrown");
        } catch (final OptionException e) {
            assertEquals("stub.validate.error", e.getMessage());
            assertTrue(option.isValidateCalled());
        }
    }

    // ---------- helpLines(...) ----------

    @Test
    public void testHelpLines_NormalCase_ReturnsOneLine() {
        final Set helpSettings = new HashSet();
        final List result = option.helpLines(1, helpSettings, null);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("helpline-depth-1", result.get(0));
    }

    @Test
    public void testHelpLines_BoundaryZeroDepth() {
        final Set helpSettings = new HashSet();
        final List result = option.helpLines(0, helpSettings, null);
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("helpline-depth-0", result.get(0));
    }

    @Test
    public void testHelpLines_NegativeDepth_EmptyList() {
        final Set helpSettings = new HashSet();
        final List result = option.helpLines(-1, helpSettings, null);
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    // ---------- appendUsage(...) ----------

    @Test
    public void testAppendUsage_AppendsPreferredName() {
        final StringBuffer buffer = new StringBuffer();
        final Set helpSettings = new HashSet();
        option.appendUsage(buffer, helpSettings, null);
        assertEquals("--test", buffer.toString());
    }

    @Test
    public void testAppendUsage_AppendsToExistingContent() {
        final StringBuffer buffer = new StringBuffer("prefix-");
        final Set helpSettings = new HashSet();
        option.appendUsage(buffer, helpSettings, null);
        assertEquals("prefix---test", buffer.toString());
    }

    // ---------- getPreferredName() ----------

    @Test
    public void testGetPreferredName_ReturnsExpectedValue() {
        assertEquals("--test", option.getPreferredName());
    }

    // ---------- getDescription() ----------

    @Test
    public void testGetDescription_ReturnsExpectedValue() {
        assertEquals("A test option", option.getDescription());
    }

    // ---------- getId() ----------

    @Test
    public void testGetId_ReturnsExpectedValue() {
        assertEquals(42, option.getId());
    }

    @Test
    public void testGetId_BoundaryZero() {
        final OptionStub zeroIdOption = new OptionStub(triggers, prefixes, "--zero", "zero desc", 0, false);
        assertEquals(0, zeroIdOption.getId());
    }

    // ---------- findOption(...) ----------

    @Test
    public void testFindOption_NormalCase_MatchFound() {
        final Option result = option.findOption("-t");
        assertNotNull(result);
        assertEquals(option, result);
    }

    @Test
    public void testFindOption_NoMatch_ReturnsNull() {
        final Option result = option.findOption("-nonexistent");
        assertNull(result);
    }

    @Test
    public void testFindOption_NullTrigger_ReturnsNull() {
        final Option result = option.findOption(null);
        assertNull(result);
    }

    // ---------- isRequired() ----------

    @Test
    public void testIsRequired_True() {
        assertTrue(option.isRequired());
    }

    @Test
    public void testIsRequired_False() {
        final OptionStub notRequiredOption = new OptionStub(triggers, prefixes, "--opt", "desc", 5, false);
        assertFalse(notRequiredOption.isRequired());
    }
}