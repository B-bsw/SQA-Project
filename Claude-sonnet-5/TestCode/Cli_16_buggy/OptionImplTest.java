package org.apache.commons.cli2.option;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.OptionException;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.jupiter.api.Test;

public class OptionImplTest {

    /**
     * Minimal concrete subclass of OptionImpl used to exercise the
     * behaviour implemented in OptionImpl itself.
     */
    private static class ConcreteOption extends OptionImpl {
        private String preferredName;
        private String description;
        private Set prefixes = new HashSet();
        private Set triggers = new HashSet();
        private boolean canProcessResult = true;

        ConcreteOption(final int id, final boolean required) {
            super(id, required);
        }

        void setPreferredName(final String preferredName) {
            this.preferredName = preferredName;
        }

        void setDescription(final String description) {
            this.description = description;
        }

        void setPrefixes(final Set prefixes) {
            this.prefixes = prefixes;
        }

        void setTriggers(final Set triggers) {
            this.triggers = triggers;
        }

        void setCanProcessResult(final boolean canProcessResult) {
            this.canProcessResult = canProcessResult;
        }

        public String getPreferredName() {
            return preferredName;
        }

        public String getDescription() {
            return description;
        }

        public Set getPrefixes() {
            return prefixes;
        }

        public Set getTriggers() {
            return triggers;
        }

        public boolean canProcess(final WriteableCommandLine commandLine, final String argument) {
            return canProcessResult;
        }

        public void process(final WriteableCommandLine commandLine, final ListIterator arguments)
            throws OptionException {
            // no-op for testing
        }

        public void validate(final WriteableCommandLine commandLine) throws OptionException {
            // no-op for testing
        }

        public void appendUsage(final StringBuffer buffer, final Set helpSettings,
                                final Comparator comparator) {
            buffer.append("USAGE");
        }

        public List helpLines(final int depth, final Set helpSettings, final Comparator comparator) {
            return new ArrayList();
        }

        // expose protected method for testing purposes
        public void callCheckPrefixes(final Set prefixesToCheck) {
            checkPrefixes(prefixesToCheck);
        }
    }

    private Set setOf(final String... items) {
        return new HashSet(Arrays.asList(items));
    }

    // ---------------------------------------------------------------
    // Constructor / getId / isRequired
    // ---------------------------------------------------------------

    @Test
    void testGetId() {
        final ConcreteOption option = new ConcreteOption(42, true);
        assertEquals(42, option.getId());
    }

    @Test
    void testIsRequiredTrue() {
        final ConcreteOption option = new ConcreteOption(1, true);
        assertTrue(option.isRequired());
    }

    @Test
    void testIsRequiredFalse() {
        final ConcreteOption option = new ConcreteOption(1, false);
        assertFalse(option.isRequired());
    }

    // ---------------------------------------------------------------
    // defaults()
    // ---------------------------------------------------------------

    @Test
    void testDefaultsDoesNothing() {
        final WriteableCommandLine commandLine = mock(WriteableCommandLine.class);
        final ConcreteOption option = new ConcreteOption(1, false);
        assertDoesNotThrow(() -> option.defaults(commandLine));
    }

    // ---------------------------------------------------------------
    // canProcess(WriteableCommandLine, ListIterator)
    // ---------------------------------------------------------------

    @Test
    void testCanProcessWithArgumentsTrue() {
        final WriteableCommandLine commandLine = mock(WriteableCommandLine.class);
        final ConcreteOption option = new ConcreteOption(1, false);
        option.setCanProcessResult(true);

        final ListIterator iterator = Arrays.asList("foo").listIterator();
        assertTrue(option.canProcess(commandLine, iterator));
    }

    @Test
    void testCanProcessWithArgumentsFalse() {
        final WriteableCommandLine commandLine = mock(WriteableCommandLine.class);
        final ConcreteOption option = new ConcreteOption(1, false);
        option.setCanProcessResult(false);

        final ListIterator iterator = Arrays.asList("foo").listIterator();
        assertFalse(option.canProcess(commandLine, iterator));
    }

    @Test
    void testCanProcessWithNoArguments() {
        final WriteableCommandLine commandLine = mock(WriteableCommandLine.class);
        final ConcreteOption option = new ConcreteOption(1, false);
        option.setCanProcessResult(true);

        final ListIterator iterator = Collections.EMPTY_LIST.listIterator();
        assertFalse(option.canProcess(commandLine, iterator));
    }

    @Test
    void testCanProcessRestoresIteratorPosition() {
        final WriteableCommandLine commandLine = mock(WriteableCommandLine.class);
        final ConcreteOption option = new ConcreteOption(1, false);
        option.setCanProcessResult(true);

        final ListIterator iterator = Arrays.asList("foo", "bar").listIterator();
        option.canProcess(commandLine, iterator);
        // position should be restored so next() still returns "foo"
        assertEquals("foo", iterator.next());
    }

    // ---------------------------------------------------------------
    // toString()
    // ---------------------------------------------------------------

    @Test
    void testToString() {
        final ConcreteOption option = new ConcreteOption(1, true);
        final String result = option.toString();
        assertEquals("USAGE", result);
    }

    // ---------------------------------------------------------------
    // findOption()
    // ---------------------------------------------------------------

    @Test
    void testFindOptionFound() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setTriggers(setOf("foo", "bar"));
        assertSame(option, option.findOption("foo"));
    }

    @Test
    void testFindOptionNotFound() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setTriggers(setOf("foo", "bar"));
        assertNull(option.findOption("baz"));
    }

    // ---------------------------------------------------------------
    // equals()
    // ---------------------------------------------------------------

    @Test
    void testEqualsDifferentClass() {
        final ConcreteOption option = new ConcreteOption(1, true);
        assertFalse(option.equals("not an option"));
    }

    @Test
    void testEqualsNull() {
        final ConcreteOption option = new ConcreteOption(1, true);
        assertFalse(option.equals(null));
    }

    @Test
    void testEqualsSameEverything() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertTrue(a.equals(b));
    }

    @Test
    void testEqualsDifferentId() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(2, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertFalse(a.equals(b));
    }

    @Test
    void testEqualsBothPreferredNameNull() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName(null);
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName(null);
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertTrue(a.equals(b));
    }

    @Test
    void testEqualsOnePreferredNameNull() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName(null);
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertFalse(a.equals(b));
        assertFalse(b.equals(a));
    }

    @Test
    void testEqualsDifferentDescription() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc1");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc2");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertFalse(a.equals(b));
    }

    @Test
    void testEqualsDifferentPrefixes() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("-"));
        b.setTriggers(setOf("--foo"));

        assertFalse(a.equals(b));
    }

    @Test
    void testEqualsDifferentTriggers() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--bar"));

        assertFalse(a.equals(b));
    }

    // ---------------------------------------------------------------
    // hashCode()
    // ---------------------------------------------------------------

    @Test
    void testHashCodeWithNullPreferredNameAndDescription() {
        final ConcreteOption option = new ConcreteOption(5, true);
        option.setPreferredName(null);
        option.setDescription(null);
        option.setPrefixes(setOf("--"));
        option.setTriggers(setOf("--foo"));

        int expected = 5;
        expected = (expected * 37) + setOf("--").hashCode();
        expected = (expected * 37) + setOf("--foo").hashCode();

        assertEquals(expected, option.hashCode());
    }

    @Test
    void testHashCodeWithNonNullPreferredNameAndDescription() {
        final ConcreteOption option = new ConcreteOption(5, true);
        option.setPreferredName("--foo");
        option.setDescription("desc");
        option.setPrefixes(setOf("--"));
        option.setTriggers(setOf("--foo"));

        int expected = 5;
        expected = (expected * 37) + "--foo".hashCode();
        expected = (expected * 37) + "desc".hashCode();
        expected = (expected * 37) + setOf("--").hashCode();
        expected = (expected * 37) + setOf("--foo").hashCode();

        assertEquals(expected, option.hashCode());
    }

    @Test
    void testHashCodeConsistentForEqualObjects() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(1, true);
        b.setPreferredName("--foo");
        b.setDescription("desc");
        b.setPrefixes(setOf("--"));
        b.setTriggers(setOf("--foo"));

        assertEquals(a.hashCode(), b.hashCode());
    }

    // ---------------------------------------------------------------
    // checkPrefixes()  (protected method exercised through subclass)
    // ---------------------------------------------------------------

    @Test
    void testCheckPrefixesEmptyPrefixesSetDoesNothing() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setPreferredName("foo");
        option.setTriggers(setOf("foo", "bar"));

        assertDoesNotThrow(() -> option.callCheckPrefixes(new HashSet()));
    }

    @Test
    void testCheckPrefixesAllMatchMultipleTriggers() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setPreferredName("--foo");
        option.setTriggers(setOf("--foo", "-f"));

        final Set prefixes = setOf("--", "-");
        assertDoesNotThrow(() -> option.callCheckPrefixes(prefixes));
    }

    @Test
    void testCheckPrefixesZeroTriggers() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setPreferredName("--foo");
        option.setTriggers(new HashSet());

        final Set prefixes = setOf("--", "-");
        assertDoesNotThrow(() -> option.callCheckPrefixes(prefixes));
    }

    @Test
    void testCheckPrefixesPreferredNameMismatchThrows() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setPreferredName("foo");
        option.setTriggers(setOf("--foo"));

        final Set prefixes = setOf("--", "-");
        final IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
            () -> option.callCheckPrefixes(prefixes));
        assertNotNull(ex.getMessage());
    }

    @Test
    void testCheckPrefixesTriggerMismatchThrows() {
        final ConcreteOption option = new ConcreteOption(1, true);
        option.setPreferredName("--foo");
        option.setTriggers(setOf("--foo", "bar"));

        final Set prefixes = setOf("--", "-");
        final IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
            () -> option.callCheckPrefixes(prefixes));
        assertNotNull(ex.getMessage());
    }

    @Test
    void testNotEqualsSanityCheck() {
        final ConcreteOption a = new ConcreteOption(1, true);
        a.setPreferredName("--foo");
        a.setDescription("desc");
        a.setPrefixes(setOf("--"));
        a.setTriggers(setOf("--foo"));

        final ConcreteOption b = new ConcreteOption(2, true);
        b.setPreferredName("--bar");
        b.setDescription("other");
        b.setPrefixes(setOf("-"));
        b.setTriggers(setOf("-b"));

        assertNotEquals(a, b);
    }
}