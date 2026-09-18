package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    @Test
    public void addOption_givenShortOptAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("f", "foo description");

        // Assert
        assertSame(options, result);
        assertTrue(options.hasOption("f"));
        assertTrue(options.hasShortOption("f"));
        assertFalse(options.hasLongOption("f"));

        Option opt = options.getOption("f");
        assertNotNull(opt);
        assertEquals("f", opt.getOpt());
        assertEquals("foo description", opt.getDescription());
        assertFalse(opt.hasArg());
    }

    @Test
    public void addOption_givenShortOptWithArgFlagAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("b", true, "bar description");

        // Assert
        assertSame(options, result);
        assertTrue(options.hasOption("b"));
        Option opt = options.getOption("b");
        assertNotNull(opt);
        assertEquals("b", opt.getOpt());
        assertTrue(opt.hasArg());
        assertEquals("bar description", opt.getDescription());
    }

    @Test
    public void addOption_givenShortAndLongOptWithArgFlagAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("c", "config", true, "config description");

        // Assert
        assertSame(options, result);
        assertTrue(options.hasOption("c"));
        assertTrue(options.hasOption("config"));
        assertTrue(options.hasShortOption("c"));
        assertTrue(options.hasLongOption("config"));

        Option opt = options.getOption("config");
        assertNotNull(opt);
        assertEquals("c", opt.getOpt());
        assertEquals("config", opt.getLongOpt());
        assertTrue(opt.hasArg());
        assertEquals("config description", opt.getDescription());
    }

    @Test
    public void addOption_givenOptionInstanceWithoutLongOpt_shouldAddSuccessfully()
    {
        // Arrange
        Option opt = new Option("v", "verbose");

        // Act
        Options result = options.addOption(opt);

        // Assert
        assertSame(options, result);
        assertTrue(options.hasOption("v"));
        assertTrue(options.hasShortOption("v"));
        assertFalse(options.hasLongOption("verbose"));
        assertSame(opt, options.getOption("v"));
    }

    @Test
    public void addOption_givenOptionInstanceWithLongOpt_shouldRegisterBothKeys()
    {
        // Arrange
        Option opt = new Option("h", "help", false, "display help");

        // Act
        options.addOption(opt);

        // Assert
        assertTrue(options.hasOption("h"));
        assertTrue(options.hasOption("help"));
        assertTrue(options.hasShortOption("h"));
        assertTrue(options.hasLongOption("help"));
        assertSame(opt, options.getOption("h"));
        assertSame(opt, options.getOption("help"));
    }

    @Test
    public void addOption_givenRequiredOption_shouldAddToRequiredOptionsList()
    {
        // Arrange
        Option opt = new Option("r", "req", false, "required option");
        opt.setRequired(true);

        // Act
        options.addOption(opt);

        // Assert
        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
    }

    @Test
    public void addOption_givenDuplicateRequiredOption_shouldUpdateWithoutDuplicatingInRequiredList()
    {
        // Arrange
        Option opt1 = new Option("r", "req1", false, "required option 1");
        opt1.setRequired(true);
        Option opt2 = new Option("r", "req2", false, "required option 2");
        opt2.setRequired(true);

        // Act
        options.addOption(opt1);
        options.addOption(opt2);

        // Assert
        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertEquals("r", required.get(0));
        assertSame(opt2, options.getOption("r"));
    }

    @Test
    public void addOptionGroup_givenNonRequiredGroup_shouldRegisterOptionsAndGroup()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha");
        opt1.setRequired(true);
        Option opt2 = new Option("b", "beta");
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(false);

        // Act
        Options result = options.addOptionGroup(group);

        // Assert
        assertSame(options, result);
        assertFalse(opt1.isRequired());
        assertFalse(opt2.isRequired());
        assertEquals(0, options.getRequiredOptions().size());

        assertSame(group, options.getOptionGroup(opt1));
        assertSame(group, options.getOptionGroup(opt2));

        Collection<OptionGroup> groups = options.getOptionGroups();
        assertEquals(1, groups.size());
        assertTrue(groups.contains(group));
    }

    @Test
    public void addOptionGroup_givenRequiredGroup_shouldAddGroupToRequiredOptions()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        Option opt = new Option("k", "key");
        group.addOption(opt);
        group.setRequired(true);

        // Act
        options.addOptionGroup(group);

        // Assert
        List required = options.getRequiredOptions();
        assertEquals(1, required.size());
        assertSame(group, required.get(0));
    }

    @Test
    public void getOptionGroup_givenOptionNotInAnyGroup_shouldReturnNull()
    {
        // Arrange
        Option opt = new Option("x", "standalone");
        options.addOption(opt);

        // Act
        OptionGroup group = options.getOptionGroup(opt);

        // Assert
        assertNull(group);
    }

    @Test
    public void getOption_givenHyphenatedNames_shouldResolveOptionIgnoringHyphens()
    {
        // Arrange
        Option opt = new Option("o", "output", true, "output file");
        options.addOption(opt);

        // Act & Assert
        assertSame(opt, options.getOption("o"));
        assertSame(opt, options.getOption("-o"));
        assertSame(opt, options.getOption("--o"));
        assertSame(opt, options.getOption("output"));
        assertSame(opt, options.getOption("-output"));
        assertSame(opt, options.getOption("--output"));
    }

    @Test
    public void getOption_givenUnknownOption_shouldReturnNull()
    {
        // Arrange
        options.addOption("k", "known");

        // Act & Assert
        assertNull(options.getOption("unknown"));
        assertNull(options.getOption("-u"));
        assertNull(options.getOption("--unknown"));
    }

    @Test
    public void hasOption_givenExistingAndNonExistingOptions_shouldReturnCorrectFlags()
    {
        // Arrange
        options.addOption("s", "silent", false, "suppress output");

        // Act & Assert
        assertTrue(options.hasOption("s"));
        assertTrue(options.hasOption("-s"));
        assertTrue(options.hasOption("--s"));
        assertTrue(options.hasOption("silent"));
        assertTrue(options.hasOption("-silent"));
        assertTrue(options.hasOption("--silent"));

        assertFalse(options.hasOption("d"));
        assertFalse(options.hasOption("-d"));
        assertFalse(options.hasOption("--verbose"));
    }

    @Test
    public void hasShortOption_givenVariousInputs_shouldMatchOnlyShortOptions()
    {
        // Arrange
        options.addOption("s", "silent", false, "suppress output");

        // Act & Assert
        assertTrue(options.hasShortOption("s"));
        assertTrue(options.hasShortOption("-s"));
        assertTrue(options.hasShortOption("--s"));
        assertFalse(options.hasShortOption("silent"));
        assertFalse(options.hasShortOption("unknown"));
    }

    @Test
    public void hasLongOption_givenVariousInputs_shouldMatchOnlyLongOptions()
    {
        // Arrange
        options.addOption("s", "silent", false, "suppress output");

        // Act & Assert
        assertTrue(options.hasLongOption("silent"));
        assertTrue(options.hasLongOption("-silent"));
        assertTrue(options.hasLongOption("--silent"));
        assertFalse(options.hasLongOption("s"));
        assertFalse(options.hasLongOption("unknown"));
    }

    @Test
    public void getMatchingOptions_givenExactMatch_shouldReturnSingletonList()
    {
        // Arrange
        options.addOption("a", "test", false, "test option");
        options.addOption("b", "testing", false, "testing option");

        // Act
        List<String> matches = options.getMatchingOptions("test");

        // Assert
        assertEquals(1, matches.size());
        assertEquals("test", matches.get(0));
    }

    @Test
    public void getMatchingOptions_givenExactMatchWithLeadingHyphens_shouldReturnSingletonList()
    {
        // Arrange
        options.addOption("a", "test", false, "test option");
        options.addOption("b", "testing", false, "testing option");

        // Act
        List<String> matches = options.getMatchingOptions("--test");

        // Assert
        assertEquals(1, matches.size());
        assertEquals("test", matches.get(0));
    }

    @Test
    public void getMatchingOptions_givenPartialPrefix_shouldReturnAllMatchingOptions()
    {
        // Arrange
        options.addOption("a", "test", false, "test option");
        options.addOption("b", "testing", false, "testing option");
        options.addOption("c", "other", false, "other option");

        // Act
        List<String> matches = options.getMatchingOptions("te");

        // Assert
        assertEquals(2, matches.size());
        assertTrue(matches.contains("test"));
        assertTrue(matches.contains("testing"));
        assertFalse(matches.contains("other"));
    }

    @Test
    public void getMatchingOptions_givenNoMatch_shouldReturnEmptyList()
    {
        // Arrange
        options.addOption("a", "foo", false, "foo option");

        // Act
        List<String> matches = options.getMatchingOptions("bar");

        // Assert
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
    }

    @Test
    public void getMatchingOptions_givenEmptyOptionsCollection_shouldReturnEmptyList()
    {
        // Act
        List<String> matches = options.getMatchingOptions("foo");

        // Assert
        assertNotNull(matches);
        assertTrue(matches.isEmpty());
    }

    @Test
    public void getOptions_givenPopulatedOptions_shouldReturnAllOptions()
    {
        // Arrange
        Option opt1 = new Option("a", "alpha");
        Option opt2 = new Option("b", "beta");
        options.addOption(opt1);
        options.addOption(opt2);

        // Act
        Collection<Option> allOptions = options.getOptions();

        // Assert
        assertEquals(2, allOptions.size());
        assertTrue(allOptions.contains(opt1));
        assertTrue(allOptions.contains(opt2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getOptions_whenModified_shouldThrowUnsupportedOperationException()
    {
        // Arrange
        options.addOption("a", "alpha");
        Collection<Option> allOptions = options.getOptions();

        // Act
        allOptions.add(new Option("b", "beta"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void getRequiredOptions_whenModified_shouldThrowUnsupportedOperationException()
    {
        // Arrange
        Option opt = new Option("r", "req");
        opt.setRequired(true);
        options.addOption(opt);
        List required = options.getRequiredOptions();

        // Act
        required.add("another");
    }

    @Test
    public void helpOptions_givenConfiguredOptions_shouldReturnListInInsertionOrder()
    {
        // Arrange
        Option opt1 = new Option("z", "last");
        Option opt2 = new Option("a", "first");
        options.addOption(opt1);
        options.addOption(opt2);

        // Act
        List<Option> helpList = options.helpOptions();

        // Assert
        assertEquals(2, helpList.size());
        Iterator<Option> iterator = helpList.iterator();
        assertSame(opt1, iterator.next());
        assertSame(opt2, iterator.next());
    }

    @Test
    public void toString_givenEmptyOptions_shouldReturnDefaultFormat()
    {
        // Act
        String result = options.toString();

        // Assert
        assertEquals("[ Options: [ short {} ] [ long {} ]", result);
    }

    @Test
    public void toString_givenConfiguredOptions_shouldIncludeOptionMappings()
    {
        // Arrange
        options.addOption("f", "file", true, "input file");

        // Act
        String result = options.toString();

        // Assert
        assertTrue(result.startsWith("[ Options: [ short {f="));
        assertTrue(result.contains("long {file="));
        assertTrue(result.endsWith(" ]"));
    }

    @Test
    public void serialization_givenPopulatedOptions_shouldSerializeAndDeserializeProperly()
    {
        // Arrange
        Option opt = new Option("f", "file", true, "input file");
        opt.setRequired(true);
        options.addOption(opt);

        OptionGroup group = new OptionGroup();
        Option groupOpt = new Option("g", "group-opt");
        group.addOption(groupOpt);
        options.addOptionGroup(group);

        try
        {
            // Act
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(options);
            oos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Options deserialized = (Options) ois.readObject();
            ois.close();

            // Assert
            assertNotNull(deserialized);
            assertTrue(deserialized.hasOption("f"));
            assertTrue(deserialized.hasOption("file"));
            assertTrue(deserialized.hasOption("g"));
            assertEquals(1, deserialized.getRequiredOptions().size());
            assertEquals("f", deserialized.getRequiredOptions().get(0));
            assertNotNull(deserialized.getOptionGroup(deserialized.getOption("g")));
        }
        catch (Exception e)
        {
            fail("Serialization test failed with exception: " + e.getMessage());
        }
    }
}