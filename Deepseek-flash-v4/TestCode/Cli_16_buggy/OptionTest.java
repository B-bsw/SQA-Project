package org.apache.commons.cli2;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class OptionTest {

    private static class TestOption implements Option {
        private String preferredName;
        private String description;
        private int id;
        private boolean required;
        private Option parent;
        private Set<String> triggers = new HashSet<String>();
        private Set<String> prefixes = new HashSet<String>();

        public TestOption(String preferredName, String description, int id, boolean required) {
            this.preferredName = preferredName;
            this.description = description;
            this.id = id;
            this.required = required;
        }

        @Override
        public void process(WriteableCommandLine commandLine, ListIterator args) throws OptionException {
            if (args == null || !args.hasNext()) {
                throw new OptionException("No arguments to process");
            }
        }

        @Override
        public void defaults(WriteableCommandLine commandLine) {
            // default implementation
        }

        @Override
        public boolean canProcess(WriteableCommandLine commandLine, String argument) {
            return argument != null && triggers.contains(argument);
        }

        @Override
        public boolean canProcess(WriteableCommandLine commandLine, ListIterator arguments) {
            // restore iterator state before returning
            if (!arguments.hasNext()) {
                return false;
            }
            String arg = (String) arguments.next();
            boolean result = canProcess(commandLine, arg);
            arguments.previous();
            return result;
        }

        @Override
        public Set getTriggers() {
            return triggers;
        }

        @Override
        public Set getPrefixes() {
            return prefixes;
        }

        @Override
        public void validate(WriteableCommandLine commandLine) throws OptionException {
            if (required && !commandLine.hasOption(this)) {
                throw new OptionException("Required option not present");
            }
        }

        @Override
        public List helpLines(int depth, Set helpSettings, Comparator comp) {
            return Arrays.asList("help line");
        }

        @Override
        public void appendUsage(StringBuffer buffer, Set helpSettings, Comparator comp) {
            buffer.append(preferredName);
        }

        @Override
        public String getPreferredName() {
            return preferredName;
        }

        @Override
        public String getDescription() {
            return description;
        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public Option findOption(String trigger) {
            if (trigger != null && trigger.equals(preferredName)) {
                return this;
            }
            return null;
        }

        @Override
        public boolean isRequired() {
            return required;
        }

        @Override
        public Option getParent() {
            return parent;
        }

        @Override
        public void setParent(Option parent) {
            this.parent = parent;
        }
    }

    private TestOption option;

    @Before
    public void setUp() {
        option = new TestOption("--test", "Test option", 1, false);
        option.getTriggers().add("--test");
        option.getTriggers().add("-t");
        option.getPrefixes().add("--");
        option.getPrefixes().add("-");
    }

    @After
    public void tearDown() {
        option = null;
    }

    @Test
    public void testGetPreferredName() {
        Assert.assertEquals("--test", option.getPreferredName());
    }

    @Test
    public void testGetDescription() {
        Assert.assertEquals("Test option", option.getDescription());
    }

    @Test
    public void testGetId() {
        Assert.assertEquals(1, option.getId());
    }

    @Test
    public void testIsRequiredWhenFalse() {
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void testIsRequiredWhenTrue() {
        TestOption requiredOption = new TestOption("--req", "Required", 2, true);
        Assert.assertTrue(requiredOption.isRequired());
    }

    @Test
    public void testCanProcessWithValidTrigger() {
        Assert.assertTrue(option.canProcess(null, "--test"));
        Assert.assertTrue(option.canProcess(null, "-t"));
    }

    @Test
    public void testCanProcessWithInvalidArgument() {
        Assert.assertFalse(option.canProcess(null, "--invalid"));
        Assert.assertFalse(option.canProcess(null, ""));
    }

    @Test
    public void testCanProcessWithNullArgument() {
        Assert.assertFalse(option.canProcess(null, (String) null));
    }

    @Test
    public void testCanProcessWithIteratorNormalCase() {
        List<String> args = new ArrayList<String>(Arrays.asList("--test", "value"));
        ListIterator<String> iterator = args.listIterator();
        Assert.assertTrue(option.canProcess(null, iterator));
        // verify iterator position restored
        Assert.assertEquals(0, iterator.nextIndex());
    }

    @Test
    public void testCanProcessWithIteratorInvalidArgument() {
        List<String> args = new ArrayList<String>(Arrays.asList("--invalid", "value"));
        ListIterator<String> iterator = args.listIterator();
        Assert.assertFalse(option.canProcess(null, iterator));
        Assert.assertEquals(0, iterator.nextIndex());
    }

    @Test(expected = NoSuchElementException.class)
    public void testCanProcessWithIteratorEmptyList() {
        List<String> args = new ArrayList<String>();
        ListIterator<String> iterator = args.listIterator();
        option.canProcess(null, iterator);
    }

    @Test
    public void testGetTriggers() {
        Set<String> triggers = option.getTriggers();
        Assert.assertNotNull(triggers);
        Assert.assertEquals(2, triggers.size());
        Assert.assertTrue(triggers.contains("--test"));
        Assert.assertTrue(triggers.contains("-t"));
    }

    @Test
    public void testGetPrefixes() {
        Set<String> prefixes = option.getPrefixes();
        Assert.assertNotNull(prefixes);
        Assert.assertEquals(2, prefixes.size());
        Assert.assertTrue(prefixes.contains("--"));
        Assert.assertTrue(prefixes.contains("-"));
    }

    @Test
    public void testFindOptionExistingTrigger() {
        Option found = option.findOption("--test");
        Assert.assertSame(option, found);
    }

    @Test
    public void testFindOptionNonExistingTrigger() {
        Option found = option.findOption("--nonexistent");
        Assert.assertNull(found);
    }

    @Test
    public void testFindOptionNullTrigger() {
        Option found = option.findOption(null);
        Assert.assertNull(found);
    }

    @Test
    public void testGetParentDefault() {
        Assert.assertNull(option.getParent());
    }

    @Test
    public void testSetAndGetParent() {
        TestOption parent = new TestOption("--parent", "Parent", 99, false);
        option.setParent(parent);
        Assert.assertSame(parent, option.getParent());
    }

    @Test
    public void testProcessWithArguments() throws OptionException {
        List<String> args = new ArrayList<String>(Arrays.asList("--test", "value"));
        ListIterator<String> iterator = args.listIterator();
        option.process(null, iterator);
        // No exception expected
    }

    @Test(expected = OptionException.class)
    public void testProcessWithEmptyList() throws OptionException {
        List<String> args = new ArrayList<String>();
        ListIterator<String> iterator = args.listIterator();
        option.process(null, iterator);
    }

    @Test
    public void testValidateRequiredNotPresent() {
        TestOption requiredOption = new TestOption("--req", "Required", 2, true);
        try {
            requiredOption.validate(new WriteableCommandLine() {
                @Override
                public boolean hasOption(Option option) {
                    return false;
                }
            });
            Assert.fail("Expected OptionException");
        } catch (OptionException e) {
            // expected
        }
    }

    @Test
    public void testValidateRequiredPresent() throws OptionException {
        TestOption requiredOption = new TestOption("--req", "Required", 2, true);
        WriteableCommandLine commandLine = new WriteableCommandLine() {
            @Override
            public boolean hasOption(Option option) {
                return option == requiredOption;
            }
        };
        requiredOption.validate(commandLine);
        // No exception expected
    }

    @Test
    public void testValidateNotRequired() throws OptionException {
        option.validate(new WriteableCommandLine() {
            @Override
            public boolean hasOption(Option option) {
                return false;
            }
        });
        // No exception expected
    }

    @Test
    public void testHelpLines() {
        List help = option.helpLines(0, Collections.emptySet(), new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        Assert.assertEquals(1, help.size());
        Assert.assertEquals("help line", help.get(0));
    }

    @Test
    public void testAppendUsage() {
        StringBuffer buffer = new StringBuffer();
        option.appendUsage(buffer, Collections.emptySet(), new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        Assert.assertEquals("--test", buffer.toString());
    }

    @Test
    public void testTriggersNotEmptyForInterfaceContract() {
        // getTriggers must not return null
        Assert.assertNotNull(option.getTriggers());
    }

    @Test
    public void testPrefixesNotNullForInterfaceContract() {
        Assert.assertNotNull(option.getPrefixes());
    }

    @Test
    public void testCanProcessWithNullCommandLine() {
        // Interface allows null commandLine; concrete implementations should handle it
        // Test default behavior returns false for empty arguments
        Assert.assertFalse(option.canProcess(null, "value"));
    }
}