package org.apache.commons.cli;

import java.util.Collection;
import java.util.Iterator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test suite for {@link OptionGroup} targeting high branch, line, and edge-case coverage.
 * Compatible with Java 1.4 / Java 7 environments and JUnit 4.
 */
public class OptionGroupTest
{
    private OptionGroup group;
    private Option optionA;
    private Option optionB;
    private Option optionLongOnly;

    @Before
    public void setUp()
    {
        group = new OptionGroup();
        optionA = new Option("a", "first option description");
        optionB = new Option("b", "second option description");
        optionLongOnly = new Option(null, "long-only", false, "long option only description");
    }

    @Test
    public void addOption_givenValidOption_shouldReturnSameGroupInstance()
    {
        // Arrange & Act
        OptionGroup returnedGroup = group.addOption(optionA);

        // Assert
        Assert.assertSame("addOption should return the same OptionGroup instance for chaining", group, returnedGroup);
        Assert.assertEquals(1, group.getNames().size());
        Assert.assertTrue(group.getNames().contains("a"));
    }

    @Test
    public void addOption_givenMultipleOptions_shouldContainAllAddedOptions()
    {
        // Arrange & Act
        group.addOption(optionA).addOption(optionB);

        // Assert
        Collection names = group.getNames();
        Collection options = group.getOptions();

        Assert.assertEquals(2, names.size());
        Assert.assertEquals(2, options.size());
        Assert.assertTrue(names.contains("a"));
        Assert.assertTrue(names.contains("b"));
        Assert.assertTrue(options.contains(optionA));
        Assert.assertTrue(options.contains(optionB));
    }

    @Test
    public void getNames_givenEmptyGroup_shouldReturnEmptyCollection()
    {
        // Arrange & Act
        Collection names = group.getNames();

        // Assert
        Assert.assertNotNull(names);
        Assert.assertTrue(names.isEmpty());
    }

    @Test
    public void getOptions_givenEmptyGroup_shouldReturnEmptyCollection()
    {
        // Arrange & Act
        Collection options = group.getOptions();

        // Assert
        Assert.assertNotNull(options);
        Assert.assertTrue(options.isEmpty());
    }

    @Test
    public void getSelected_givenInitialState_shouldReturnNull()
    {
        // Arrange & Act & Assert
        Assert.assertNull("Initial selected option should be null", group.getSelected());
    }

    @Test
    public void setSelected_givenNullOptionWhenNoneSelected_shouldKeepSelectedNull() throws Exception
    {
        // Arrange & Act
        group.setSelected(null);

        // Assert
        Assert.assertNull(group.getSelected());
    }

    @Test
    public void setSelected_givenNullOptionWhenOptionAlreadySelected_shouldResetSelectedToNull() throws Exception
    {
        // Arrange
        group.setSelected(optionA);
        Assert.assertEquals("a", group.getSelected());

        // Act
        group.setSelected(null);

        // Assert
        Assert.assertNull("Selected option should be reset to null", group.getSelected());
    }

    @Test
    public void setSelected_givenOptionWhenNoneSelected_shouldUpdateSelected() throws Exception
    {
        // Arrange & Act
        group.setSelected(optionA);

        // Assert
        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void setSelected_givenSameOptionReselected_shouldRemainSelectedWithoutException() throws Exception
    {
        // Arrange
        group.setSelected(optionA);

        // Act
        group.setSelected(optionA);

        // Assert
        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void setSelected_givenDifferentOptionInstanceWithSameOpt_shouldRemainSelected() throws Exception
    {
        // Arrange
        Option duplicateOptA = new Option("a", "duplicate a description");
        group.setSelected(optionA);

        // Act
        group.setSelected(duplicateOptA);

        // Assert
        Assert.assertEquals("a", group.getSelected());
    }

    @Test
    public void setSelected_givenDifferentOptionWhenOptionAlreadySelected_shouldThrowAlreadySelectedException()
    {
        // Arrange
        try
        {
            group.setSelected(optionA);
        }
        catch (AlreadySelectedException e)
        {
            Assert.fail("First setSelected should not fail");
        }

        // Act & Assert
        try
        {
            group.setSelected(optionB);
            Assert.fail("Expected AlreadySelectedException when selecting a different option in group");
        }
        catch (AlreadySelectedException ex)
        {
            Assert.assertSame(group, ex.getOptionGroup());
            Assert.assertSame(optionB, ex.getOption());
        }
    }

    @Test
    public void isRequired_givenDefaultInstance_shouldReturnFalse()
    {
        // Arrange & Act & Assert
        Assert.assertFalse("OptionGroup should not be required by default", group.isRequired());
    }

    @Test
    public void setRequired_givenTrue_shouldUpdateRequiredProperty()
    {
        // Arrange & Act
        group.setRequired(true);

        // Assert
        Assert.assertTrue(group.isRequired());
    }

    @Test
    public void setRequired_givenFalseAfterTrue_shouldUpdateRequiredProperty()
    {
        // Arrange
        group.setRequired(true);
        Assert.assertTrue(group.isRequired());

        // Act
        group.setRequired(false);

        // Assert
        Assert.assertFalse(group.isRequired());
    }

    @Test
    public void toString_givenEmptyGroup_shouldReturnSquareBracketsOnly()
    {
        // Arrange & Act
        String result = group.toString();

        // Assert
        Assert.assertEquals("[]", result);
    }

    @Test
    public void toString_givenSingleShortOption_shouldFormatWithDashAndDescription()
    {
        // Arrange
        group.addOption(optionA);

        // Act
        String result = group.toString();

        // Assert
        Assert.assertEquals("[-a first option description]", result);
    }

    @Test
    public void toString_givenSingleLongOptionWithoutShortOpt_shouldFormatWithDoubleDashAndDescription()
    {
        // Arrange
        group.addOption(optionLongOnly);

        // Act
        String result = group.toString();

        // Assert
        Assert.assertEquals("[--long-only long option only description]", result);
    }

    @Test
    public void toString_givenMultipleOptions_shouldFormatWithCommaSeparators()
    {
        // Arrange
        group.addOption(optionA);
        group.addOption(optionLongOnly);

        // Act
        String result = group.toString();

        // Assert
        Assert.assertTrue("Output should start with '['", result.startsWith("["));
        Assert.assertTrue("Output should end with ']'", result.endsWith("]"));
        Assert.assertTrue("Output should contain short option format", result.indexOf("-a first option description") != -1);
        Assert.assertTrue("Output should contain long option format", result.indexOf("--long-only long option only description") != -1);
        Assert.assertTrue("Output should contain comma separator between options", result.indexOf(", ") != -1);
    }

    @Test
    public void toString_givenOptionWithNullDescription_shouldAppendNullText()
    {
        // Arrange
        Option nullDescOption = new Option("n", null);
        group.addOption(nullDescOption);

        // Act
        String result = group.toString();

        // Assert
        Assert.assertEquals("[-n null]", result);
    }
}