package org.apache.commons.cli2.option;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class OptionImplTest extends TestCase {
    private static class ConcreteOption extends OptionImpl {
        private String preferredName;
        private String description;
        private Set prefixes;
        private Set triggers;
        private WriteableCommandLine commandLine;

        public ConcreteOption(int id, boolean required) {
            this(id, required, "test", "description", new HashSet<String>(), new HashSet<String>(Arrays.asList("test")), null);
        }

        public ConcreteOption(int id, boolean required, String preferredName, String description,
                              Set<String> prefixes, Set<String> triggers, WriteableCommandLine cmdLine) {
            super(id, required);
            this.preferredName = preferredName;
            this.description = description;
            this.prefixes = prefixes;
            this.triggers = triggers;
            this.commandLine = cmdLine;
        }

        public String getPreferredName() { return preferredName; }
        public String getDescription() { return description; }
        public Set getPrefixes() { return prefixes; }
        public Set getTriggers() { return triggers; }
        public void process(WriteableCommandLine cmdLine, ListIterator args) {}
        public void validate(WriteableCommandLine cmdLine) {}
        public void appendUsage(StringBuffer sb, Set settings, java.util.Comparator cmp) {
            sb.append("[test]");
        }
        public String toString() {
            return "[test]";
        }
        public boolean canProcess(WriteableCommandLine cmdLine, String arg) {
            return false;
        }
        public void defaults(WriteableCommandLine cmdLine) {
            // override default
        }
        public void processValues(WriteableCommandLine cmdLine, ListIterator args) {
            // override default
        }
        public WriteableCommandLine getCommandLine() { return commandLine; }
        
        @Override
        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            return super.canProcess(commandLine, arguments);
        }
    }

    private OptionImpl option;
    private ConcreteOption concrete;

    @Before
    public void setUp() {
        concrete = new ConcreteOption(1, true);
        option = concrete;
    }

    @Test
    public void testGetId() {
        assertEquals(1, option.getId());
    }

    @Test
    public void testIsRequired() {
        assertTrue(option.isRequired());
        ConcreteOption optNotRequired = new ConcreteOption(2, false);
        assertFalse(optNotRequired.isRequired());
    }

    @Test
    public void testCanProcessWithNoArguments() {
        assertFalse(option.canProcess(null, new ArrayList<Object>().listIterator()));
    }

    @Test
    public void testCanProcessWithArguments() {
        // should return false since canProcess(String) returns false for ConcreteOption
        List<String> argsList = Arrays.asList("arg1");
        assertFalse(option.canProcess(null, argsList.listIterator()));
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(option.equals(option));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(option.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(option.equals(new Object()));
    }

    @Test
    public void testEqualsSameIdDifferentNames() {
        ConcreteOption other = new ConcreteOption(1, true, "different", "desc", 
                                                   new HashSet<String>(), 
                                                   new HashSet<String>(Arrays.asList("other")), null);
        assertFalse(option.equals(other));
    }

    @Test
    public void testEqualsSameValues() {
        ConcreteOption same = new ConcreteOption(1, true, "test", "description",
                                                 new HashSet<String>(),
                                                 new HashSet<String>(Arrays.asList("test")), null);
        assertTrue(option.equals(same));
    }

    @Test
    public void testEqualsMismatchedNullDescription() {
        ConcreteOption withNullDesc = new ConcreteOption(1, true, "test", null,
                                                          new HashSet<String>(),
                                                          new HashSet<String>(Arrays.asList("test")), null);
        assertFalse(option.equals(withNullDesc));
    }

    @Test
    public void testHashCodeConsistency() {
        assertEquals(option.hashCode(), option.hashCode());
    }

    @Test
    public void testHashCodeWithNullPreferredNameAndDesc() {
        ConcreteOption noName = new ConcreteOption(1, true, null, null,
                                                    new HashSet<String>(),
                                                    new HashSet<String>(Arrays.asList("test")), null);
        assertNotNull(noName.hashCode());
    }

    @Test
    public void testFindOptionForTrigger() {
        assertEquals(option, option.findOption("test"));
    }

    @Test
    public void testFindOptionNonMatchingTrigger() {
        assertNull(option.findOption("nonexistent"));
    }

    @Test
    public void testDefaultMethodDoesNotThrow() {
        option.defaults(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCheckPrefixesEmptyTriggerThrows() {
        Set<String> prefixes = new HashSet<String>();
        prefixes.add("-");
        Set<String> triggers = new HashSet<String>();
        triggers.add("noPrefix");
        ConcreteOption badPrefix = new ConcreteOption(1, true, "badPrefix", "desc",
                                                       prefixes, triggers, null);
        badPrefix.checkPrefixes(prefixes);
    }

    @Test
    public void testCheckPrefixesEmptyPrefixListNoThrow() {
        Set<String> emptyPrefixes = new HashSet<String>();
        concrete.checkPrefixes(emptyPrefixes);
    }

    @Test
    public void testCheckPrefixesWithValidPrefix() {
        Set<String> prefixes = new HashSet<String>();
        prefixes.add("-");
        Set<String> triggersSet = new HashSet<String>();
        triggersSet.add("-trigger");
        ConcreteOption valid = new ConcreteOption(1, true, "-name", "desc",
                                                   prefixes, triggersSet, null);
        valid.checkPrefixes(prefixes);
    }

    @Test
    public void testCheckPrefixesWithPrefixOnPreferredNameAndTriggers() {
        Set<String> prefixes = new HashSet<String>();
        prefixes.add("--");
        Set<String> triggersSet = new HashSet<String>();
        triggersSet.add("--trigger");
        ConcreteOption valid = new ConcreteOption(1, true, "--name", "desc",
                                                    prefixes, triggersSet, null);
        valid.checkPrefixes(prefixes);
    }

    @Test
    public void testCanProcessWithNullArguments() {
        // should throw NPE because arguments is used unguarded
        try {
            option.canProcess(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }
}