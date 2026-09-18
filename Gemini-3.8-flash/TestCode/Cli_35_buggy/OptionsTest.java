package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class OptionsTest
{
    private Options options;

    @Before
    public void setUp()
    {
        options = new Options();
    }

    @Test
    public void addOption_givenOptAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("a", "Option A description");

        // Assert
        Assert.assertSame(options, result);
        Assert.assertTrue(options.hasOption("a"));
        Assert.assertTrue(options.hasShortOption("a"));
        Assert.assertFalse(options.hasLongOption("a"));

        Option opt = options.getOption("a");
        Assert.assertNotNull(opt);
        Assert.assertEquals("a", opt.getOpt());
        Assert.assertEquals("Option A description", opt.getDescription());
        Assert.assertFalse(opt.hasArg());
    }

    @Test
    public void addOption_givenOptHasArgAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("b", true, "Option B description");

        // Assert
        Assert.assertSame(options, result);
        Assert.assertTrue(options.hasOption("b"));
        Option opt = options.getOption("b");
        Assert.assertNotNull(opt);
        Assert.assertEquals("b", opt.getOpt());
        Assert.assertTrue(opt.hasArg());
    }

    @Test
    public void addOption_givenOptLongOptHasArgAndDescription_shouldAddSuccessfully()
    {
        // Arrange & Act
        Options result = options.addOption("c", "config", true, "Option C description");

        // Assert
        Assert.assertSame(options, result);
        Assert.assertTrue(options.hasOption("c"));
        Assert.assertTrue(options.hasOption("config"));
        Assert.assertTrue(options.hasShortOption("c"));
        Assert.assertTrue(options.hasLongOption("config"));

        Option optShort = options.getOption("c");
        Option optLong = options.getOption("config");
        Assert.assertSame(optShort, optLong);
        Assert.assertEquals("config", optShort.getLongOpt());
    }

    @Test
    public void addOption_givenRequiredOption_shouldRecordInRequiredOptions()
    {
        // Arrange
        Option opt = new Option("r", "required", false, "Required option");
        opt.setRequired(true);

        // Act
        options.addOption(opt);

        // Assert
        List requiredList = options.getRequiredOptions();
        Assert.assertEquals(1, requiredList.size());
        Assert.assertEquals("r", requiredList.get(0));
    }

    @Test
    public void addOption_givenDuplicateRequiredOption_shouldNotDuplicateInRequiredList()
    {
        // Arrange
        Option opt1 = new Option("r", "required", false, "Required option instance 1");
        opt1.setRequired(true);
        Option opt2 = new Option("r", "required", false, "Required option instance 2");
        opt2.setRequired(true);

        // Act
        options.addOption(opt1);
        options.addOption(opt2);

        // Assert
        List requiredList = options.getRequiredOptions();
        Assert.assertEquals(1, requiredList.size());
        Assert.assertEquals("r", requiredList.get(0));
    }

    @Test
    public void addOptionGroup_givenRequiredGroup_shouldContainGroupInRequiredOptions()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("f", "file", false, "File");
        Option opt2 = new Option("d", "dir", false, "Directory");
        group.addOption(opt1);
        group.addOption(opt2);

        // Act
        Options result = options.addOptionGroup(group);

        // Assert
        Assert.assertSame(options, result);
        List required = options.getRequiredOptions();
        Assert.assertEquals(1, required.size());
        Assert.assertSame(group, required.get(0));
        Assert.assertTrue(options.hasOption("f"));
        Assert.assertTrue(options.hasOption("d"));
        Assert.assertSame(group, options.getOptionGroup(opt1));
        Assert.assertSame(group, options.getOptionGroup(opt2));
    }

    @Test
    public void addOptionGroup_givenOptionWithRequiredTrue_shouldResetOptionRequiredToFalse()
    {
        // Arrange
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option opt = new Option("x", false, "Option X");
        opt.setRequired(true);
        group.addOption(opt);

        // Act
        options.addOptionGroup(group);

        // Assert
        Assert.assertFalse(opt.isRequired());
        Assert.assertTrue(options.getRequiredOptions().isEmpty());
    }

    @Test
    public void getOptionGroups_givenOptionGroups_shouldReturnUniqueSetOfGroups()
    {
        // Arrange
        OptionGroup group1 = new OptionGroup();
        group1.addOption(new Option("a", "Option A"));
        group1.addOption(new Option("b", "Option B"));

        OptionGroup group2 = new OptionGroup();
        group2.addOption(new Option("c", "Option C"));

        options.addOptionGroup(group1);
        options.addOptionGroup(group2);

        // Act
        Collection<OptionGroup> groups = options.getOptionGroups();

        // Assert
        Assert.assertEquals(2, groups.size());
        Assert.assertTrue(groups.contains(group1));
        Assert.assertTrue(groups.contains(group2));
    }

    @Test
    public void getOptionGroup_givenOptionNotInGroup_shouldReturnNull()
    {
        // Arrange
        Option opt = new Option("z", "Option Z");
        options.addOption(opt);

        // Act
        OptionGroup group = options.getOptionGroup(opt);

        // Assert
        Assert.assertNull(group);
    }

    @Test
    public void getOption_givenPrefixedHyphens_shouldReturnMatchingOption()
    {
        // Arrange
        options.addOption("s", "short-opt", false, "Short and Long");

        // Act & Assert
        Assert.assertNotNull(options.getOption("s"));
        Assert.assertNotNull(options.getOption("-s"));
        Assert.assertNotNull(options.getOption("short-opt"));
        Assert.assertNotNull(options.getOption("--short-opt"));
    }

    @Test
    public void getOption_givenUnknownOption_shouldReturnNull()
    {
        // Arrange
        options.addOption("a", "Option A");

        // Act
        Option opt = options.getOption("nonexistent");

        // Assert
        Assert.assertNull(opt);
    }

    @Test
    public void getMatchingOptions_givenPrefix_shouldReturnAllMatchingOptions()
    {
        // Arrange
        options.addOption("v", "version", false, "display version");
        options.addOption("verbose", false, "verbose output");
        options.addOption("verbatim", false, "verbatim output");
        options.addOption("help", false, "display help");

        // Act
        List<String> matches = options.getMatchingOptions("ver");

        // Assert
        Assert.assertEquals(3, matches.size());
        Assert.assertTrue(matches.contains("version"));
        Assert.assertTrue(matches.contains("verbose"));
        Assert.assertTrue(matches.contains("verbatim"));
    }

    @Test
    public void getMatchingOptions_givenHyphensAndNoMatch_shouldReturnEmptyList()
    {
        // Arrange
        options.addOption("v", "version", false, "display version");

        // Act
        List<String> matches = options.getMatchingOptions("--xyz");

        // Assert
        Assert.assertNotNull(matches);
        Assert.assertTrue(matches.isEmpty());
    }

    @Test
    public void hasOption_givenOptionsWithAndWithoutLeadingHyphens_shouldReturnTrue()
    {
        // Arrange
        options.addOption("f", "file", true, "input file");

        // Act & Assert
        Assert.assertTrue(options.hasOption("f"));
        Assert.assertTrue(options.hasOption("-f"));
        Assert.assertTrue(options.hasOption("file"));
        Assert.assertTrue(options.hasOption("--file"));
        Assert.assertFalse(options.hasOption("unknown"));
        Assert.assertFalse(options.hasOption("--unknown"));
    }

    @Test
    public void hasLongOption_givenLongOptionWithHyphens_shouldReturnTrue()
    {
        // Arrange
        options.addOption("f", "file", true, "input file");

        // Act & Assert
        Assert.assertTrue(options.hasLongOption("file"));
        Assert.assertTrue(options.hasLongOption("--file"));
        Assert.assertFalse(options.hasLongOption("f"));
        Assert.assertFalse(options.hasLongOption("-f"));
    }

    @Test
    public void hasShortOption_givenShortOptionWithHyphens_shouldReturnTrue()
    {
        // Arrange
        options.addOption("f", "file", true, "input file");

        // Act & Assert
        Assert.assertTrue(options.hasShortOption("f"));
        Assert.assertTrue(options.hasShortOption("-f"));
        Assert.assertFalse(options.hasShortOption("file"));
        Assert.assertFalse(options.hasShortOption("--file"));
    }

    @Test
    public void getOptions_whenInvoked_shouldReturnReadOnlyCollection()
    {
        // Arrange
        options.addOption("a", "Option A");
        Collection<Option> optList = options.getOptions();

        // Act & Assert
        Assert.assertEquals(1, optList.size());
        try
        {
            optList.clear();
            Assert.fail("Expected UnsupportedOperationException when mutating getOptions()");
        }
        catch (UnsupportedOperationException expected)
        {
            // Expected exception
        }
    }

    @Test
    public void helpOptions_whenInvoked_shouldReturnMutableCopyOfOptions()
    {
        // Arrange
        options.addOption("a", "Option A");
        options.addOption("b", "Option B");

        // Act
        List<Option> list = options.helpOptions();

        // Assert
        Assert.assertEquals(2, list.size());
        list.clear();
        Assert.assertEquals(2, options.getOptions().size());
    }

    @Test
    public void getRequiredOptions_whenInvoked_shouldReturnReadOnlyList()
    {
        // Arrange
        Option opt = new Option("r", "req", false, "Required");
        opt.setRequired(true);
        options.addOption(opt);
        List reqList = options.getRequiredOptions();

        // Act & Assert
        Assert.assertEquals(1, reqList.size());
        try
        {
            reqList.clear();
            Assert.fail("Expected UnsupportedOperationException when mutating getRequiredOptions()");
        }
        catch (UnsupportedOperationException expected)
        {
            // Expected exception
        }
    }

    @Test
    public void toString_whenInvoked_shouldIncludeShortAndLongOptions()
    {
        // Arrange
        options.addOption("a", "alpha", false, "Option Alpha");

        // Act
        String str = options.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertTrue(str.indexOf("[ Options: [ short ") != -1);
        Assert.assertTrue(str.indexOf(" ] [ long ") != -1);
        Assert.assertTrue(str.indexOf("alpha") != -1);
    }
}