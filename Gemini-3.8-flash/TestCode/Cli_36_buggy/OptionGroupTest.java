package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class OptionGroupTest
{
    private OptionGroup group;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
    }

    @Test
    public void isRequired_givenDefaultState_shouldReturnFalse()
    {
        // Arrange & Act
        boolean actual = group.isRequired();

        // Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void setRequired_givenTrue_shouldSetRequiredFlagToTrue()
    {
        // Arrange
        group.setRequired(true);

        // Act
        boolean actual = group.isRequired();

        // Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void setRequired_givenFalseAfterTrue_shouldSetRequiredFlagToFalse()
    {
        // Arrange
        group.setRequired(true);

        // Act
        group.setRequired(false);

        // Assert
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void getSelected_givenDefaultState_shouldReturnNull()
    {
        // Arrange & Act
        String actual = group.getSelected();

        // Assert
        Assert.assertNull(actual);
    }

    @Test
    public void addOption_givenSingleOption_shouldContainOptionAndKey()
    {
        // Arrange
        Option opt = new Option("a", "option a description");

        // Act
        OptionGroup returnedGroup = group.addOption(opt);

        // Assert
        Assert.assertSame(group, returnedGroup);
        Collection<String> names = group.getNames();
        Collection<Option> options = group.getOptions();

        Assert.assertEquals(1, names.size());
        Assert.assertTrue(names.contains("a"));
        Assert.assertEquals(1, options.size());
        Assert.assertTrue(options.contains(opt));
    }

    @Test
    public void addOption_givenChainedCalls_shouldAddAllOptions()
    {
        // Arrange
        Option optA = new Option("a", "option a description");
        Option optB = new Option("b", "option b description");

        // Act
        group.addOption(optA).addOption(optB);

        // Assert
        Collection<String> names = group.getNames();
        Collection<Option> options = group.getOptions();

        Assert.assertEquals(2, names.size());
        Assert.assertTrue(names.contains("a"));
        Assert.assertTrue(names.contains("b"));
        Assert.assertEquals(2, options.size());
        Assert.assertTrue(options.contains(optA));
        Assert.assertTrue(options.contains(optB));
    }

    @Test
    public void setSelected_givenNullWhenNoOptionSelected_shouldRemainNull() throws AlreadySelectedException
    {
        // Arrange & Act
        group.setSelected(null);

        // Assert
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void setSelected_givenOptionWhenNoneSelected_shouldUpdateSelected() throws AlreadySelectedException
    {
        // Arrange
        Option opt = new Option("a", "description");
        group.addOption(opt);

        // Act
        group.setSelected(opt);

        // Assert
        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void setSelected_givenSameOptionAgain_shouldSucceedWithoutException() throws AlreadySelectedException
    {
        // Arrange
        Option opt = new Option("a", "description");
        group.addOption(opt);
        group.setSelected(opt);

        // Act
        group.setSelected(opt);

        // Assert
        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void setSelected_givenNullAfterOptionSelected_shouldResetSelectedToNull() throws AlreadySelectedException
    {
        // Arrange
        Option opt = new Option("a", "description");
        group.addOption(opt);
        group.setSelected(opt);
        Assert.assertEquals("a", group.getSelected());

        // Act
        group.setSelected(null);

        // Assert
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void setSelected_givenDifferentOptionWhenOneAlreadySelected_shouldThrowAlreadySelectedException()
    {
        // Arrange
        Option optA = new Option("a", "description a");
        Option optB = new Option("b", "description b");
        group.addOption(optA);
        group.addOption(optB);

        try
        {
            group.setSelected(optA);
        }
        catch (AlreadySelectedException e)
        {
            Assert.fail("Unexpected exception thrown on initial selection: " + e.getMessage());
        }

        // Act & Assert
        try
        {
            group.setSelected(optB);
            Assert.fail("Expected AlreadySelectedException was not thrown");
        }
        catch (AlreadySelectedException e)
        {
            Assert.assertSame(group, e.getOptionGroup());
            Assert.assertSame(optB, e.getOption());
        }
    }

    @Test
    public void toString_givenEmptyGroup_shouldReturnEmptyBrackets()
    {
        // Arrange & Act
        String actual = group.toString();

        // Assert
        Assert.assertEquals("[]", actual);
    }

    @Test
    public void toString_givenOptionWithShortOptAndDescription_shouldFormatCorrectly()
    {
        // Arrange
        Option opt = new Option("f", "foo description");
        group.addOption(opt);

        // Act
        String actual = group.toString();

        // Assert
        Assert.assertEquals("[-f foo description]", actual);
    }

    @Test
    public void toString_givenOptionWithShortOptAndNullDescription_shouldFormatWithoutDescription()
    {
        // Arrange
        Option opt = new Option("f", null);
        group.addOption(opt);

        // Act
        String actual = group.toString();

        // Assert
        Assert.assertEquals("[-f]", actual);
    }

    @Test
    public void toString_givenOptionWithLongOptOnlyAndDescription_shouldFormatWithDoubleHyphen()
    {
        // Arrange
        Option opt = new Option(null, "foo", false, "long foo description");
        group.addOption(opt);

        // Act
        String actual = group.toString();

        // Assert
        Assert.assertEquals("[--foo long foo description]", actual);
    }

    @Test
    public void toString_givenOptionWithLongOptOnlyAndNullDescription_shouldFormatWithDoubleHyphenOnly()
    {
        // Arrange
        Option opt = new Option(null, "foo", false, null);
        group.addOption(opt);

        // Act
        String actual = group.toString();

        // Assert
        Assert.assertEquals("[--foo]", actual);
    }

    @Test
    public void toString_givenMultipleOptions_shouldSeparateWithCommaAndSpace()
    {
        // Arrange
        Option optA = new Option("a", "description a");
        Option optB = new Option(null, "bar", false, "description bar");
        group.addOption(optA);
        group.addOption(optB);

        // Act
        String actual = group.toString();

        // Assert
        Assert.assertTrue(actual.startsWith("["));
        Assert.assertTrue(actual.endsWith("]"));
        Assert.assertTrue(actual.contains("-a description a"));
        Assert.assertTrue(actual.contains("--bar description bar"));
        Assert.assertTrue(actual.contains(", "));
        Assert.assertEquals("[-a description a, --bar description bar]", actual);
    }
}