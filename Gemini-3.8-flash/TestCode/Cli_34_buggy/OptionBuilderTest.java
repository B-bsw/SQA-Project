package org.apache.commons.cli;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;
import org.junit.Test;

/**
 * Phase 1 - Code Analysis & Test Matrix:
 *
 * 1. Happy Path:
 *    - create(char opt): Verifies creation of Option with single char opt and default/configured fields.
 *    - create(String opt): Verifies creation of Option with String opt and configured fields.
 *    - create(): Verifies creation of Option with only longOpt (no short opt).
 *    - Fluent chained builder configuration setting all properties simultaneously.
 *
 * 2. Boundary & Edge Cases:
 *    - hasArg() vs hasArg(true) vs hasArg(false)
 *    - hasArgs() vs hasArgs(int num)
 *    - hasOptionalArg() vs hasOptionalArgs() vs hasOptionalArgs(int numArgs)
 *    - isRequired() vs isRequired(true) vs isRequired(false)
 *    - withValueSeparator() vs withValueSeparator(char sep)
 *    - Reset behavior: Verification that fields reset between create() calls.
 *    - Reflection invocation for private constructor coverage.
 *
 * 3. Error & Exception Branches:
 *    - create() without longOpt throws IllegalArgumentException("must specify longopt").
 *    - Verification that reset() is safely invoked in finally block even when exceptions occur.
 */
public class OptionBuilderTest
{
    @Test
    public void create_withCharOpt_shouldCreateOptionWithCorrectChar()
    {
        // Arrange & Act
        Option option = OptionBuilder.withDescription("Test description")
                                     .create('o');

        // Assert
        Assert.assertNotNull(option);
        Assert.assertEquals("o", option.getOpt());
        Assert.assertEquals("Test description", option.getDescription());
    }

    @Test
    public void create_withStringOpt_shouldCreateOptionWithCorrectString()
    {
        // Arrange & Act
        Option option = OptionBuilder.withDescription("String description")
                                     .create("optName");

        // Assert
        Assert.assertNotNull(option);
        Assert.assertEquals("optName", option.getOpt());
        Assert.assertEquals("String description", option.getDescription());
    }

    @Test
    public void create_withLongOptSpecified_shouldCreateOptionWithoutShortOpt()
    {
        // Arrange & Act
        Option option = OptionBuilder.withLongOpt("longOnly")
                                     .withDescription("Long option only")
                                     .create();

        // Assert
        Assert.assertNotNull(option);
        Assert.assertNull(option.getOpt());
        Assert.assertEquals("longOnly", option.getLongOpt());
        Assert.assertEquals("Long option only", option.getDescription());
    }

    @Test
    public void create_noLongOptSpecified_shouldThrowIllegalArgumentException()
    {
        // Arrange & Act
        try
        {
            OptionBuilder.create();
            Assert.fail("IllegalArgumentException should be thrown when longOpt is null");
        }
        catch (IllegalArgumentException e)
        {
            // Assert
            Assert.assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void create_afterException_shouldResetBuilderState()
    {
        // Arrange
        OptionBuilder.withDescription("Pending Description");

        try
        {
            OptionBuilder.create();
            Assert.fail("Expected IllegalArgumentException when create() is called without longopt");
        }
        catch (IllegalArgumentException e)
        {
            // Expected exception
        }

        // Act
        Option option = OptionBuilder.withLongOpt("newOption").create();

        // Assert: previous description must be cleared
        Assert.assertNull("Description should be reset after exception in create()", option.getDescription());
    }

    @Test
    public void create_fullOptionsConfigured_shouldSetAllPropertiesAndResetStateAfterwards()
    {
        // Arrange & Act
        Option option = OptionBuilder.withLongOpt("full")
                                     .withDescription("Full description")
                                     .withArgName("arg")
                                     .isRequired()
                                     .hasArgs(2)
                                     .withType(String.class)
                                     .withValueSeparator(';')
                                     .create("f");

        // Assert properties on created option
        Assert.assertEquals("f", option.getOpt());
        Assert.assertEquals("full", option.getLongOpt());
        Assert.assertEquals("Full description", option.getDescription());
        Assert.assertEquals("arg", option.getArgName());
        Assert.assertTrue(option.isRequired());
        Assert.assertEquals(2, option.getArgs());
        Assert.assertEquals(String.class, option.getType());
        Assert.assertEquals(';', option.getValueSeparator());

        // Assert that state was reset after create
        Option emptyOption = OptionBuilder.create("clean");
        Assert.assertNull(emptyOption.getLongOpt());
        Assert.assertNull(emptyOption.getDescription());
        Assert.assertNull(emptyOption.getArgName());
        Assert.assertFalse(emptyOption.isRequired());
        Assert.assertEquals(Option.UNINITIALIZED, emptyOption.getArgs());
        Assert.assertNull(emptyOption.getType());
        Assert.assertEquals((char) 0, emptyOption.getValueSeparator());
        Assert.assertFalse(emptyOption.hasOptionalArg());
    }

    @Test
    public void hasArg_noArgs_shouldSetNumberOfArgsToOne()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasArg().create("a");

        // Assert
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void hasArg_givenTrue_shouldSetNumberOfArgsToOne()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasArg(true).create("a");

        // Assert
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void hasArg_givenFalse_shouldSetNumberOfArgsToUninitialized()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasArg(false).create("a");

        // Assert
        Assert.assertFalse(option.hasArg());
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void hasArgs_noArgs_shouldSetNumberOfArgsToUnlimited()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasArgs().create("a");

        // Assert
        Assert.assertTrue(option.hasArgs());
        Assert.assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void hasArgs_givenNumber_shouldSetNumberOfArgs()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasArgs(4).create("a");

        // Assert
        Assert.assertTrue(option.hasArgs());
        Assert.assertEquals(4, option.getArgs());
    }

    @Test
    public void hasOptionalArg_noArgs_shouldSetNumberOfArgsToOneAndOptionalTrue()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasOptionalArg().create("a");

        // Assert
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_noArgs_shouldSetNumberOfArgsToUnlimitedAndOptionalTrue()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasOptionalArgs().create("a");

        // Assert
        Assert.assertTrue(option.hasArgs());
        Assert.assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_givenNumber_shouldSetNumberOfArgsAndOptionalTrue()
    {
        // Arrange & Act
        Option option = OptionBuilder.hasOptionalArgs(3).create("a");

        // Assert
        Assert.assertTrue(option.hasArgs());
        Assert.assertEquals(3, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void isRequired_noArgs_shouldSetRequiredTrue()
    {
        // Arrange & Act
        Option option = OptionBuilder.isRequired().create("r");

        // Assert
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void isRequired_givenTrue_shouldSetRequiredTrue()
    {
        // Arrange & Act
        Option option = OptionBuilder.isRequired(true).create("r");

        // Assert
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void isRequired_givenFalse_shouldSetRequiredFalse()
    {
        // Arrange & Act
        Option option = OptionBuilder.isRequired(false).create("r");

        // Assert
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void withValueSeparator_noArgs_shouldSetSeparatorToEquals()
    {
        // Arrange & Act
        Option option = OptionBuilder.withValueSeparator().create("s");

        // Assert
        Assert.assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void withValueSeparator_givenChar_shouldSetSeparator()
    {
        // Arrange & Act
        Option option = OptionBuilder.withValueSeparator(':').create("s");

        // Assert
        Assert.assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void withType_givenClass_shouldSetType()
    {
        // Arrange & Act
        Option option = OptionBuilder.withType(Integer.class).create("t");

        // Assert
        Assert.assertEquals(Integer.class, option.getType());
    }

    @Test
    public void withArgName_givenArgName_shouldSetArgName()
    {
        // Arrange & Act
        Option option = OptionBuilder.withArgName("customName").create("n");

        // Assert
        Assert.assertEquals("customName", option.getArgName());
    }

    @Test
    public void withLongOpt_givenLongOpt_shouldSetLongOpt()
    {
        // Arrange & Act
        Option option = OptionBuilder.withLongOpt("customLong").create("l");

        // Assert
        Assert.assertEquals("customLong", option.getLongOpt());
    }

    @Test
    public void withDescription_givenDescription_shouldSetDescription()
    {
        // Arrange & Act
        Option option = OptionBuilder.withDescription("descText").create("d");

        // Assert
        Assert.assertEquals("descText", option.getDescription());
    }

    @Test
    public void privateConstructor_invocationViaReflection_shouldInstantiateWithoutError()
        throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException
    {
        // Arrange
        Constructor constructor = OptionBuilder.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        // Act
        Object instance = constructor.newInstance(new Object[0]);

        // Assert
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof OptionBuilder);
    }
}