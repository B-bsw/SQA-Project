package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OptionTest
{
    @Test
    public void constructor_givenOptAndDescription_shouldInitializeCorrectly()
    {
        // Arrange & Act
        Option option = new Option("a", "description A");

        // Assert
        Assert.assertEquals("a", option.getOpt());
        Assert.assertEquals("description A", option.getDescription());
        Assert.assertNull(option.getLongOpt());
        Assert.assertFalse(option.hasArg());
        Assert.assertFalse(option.hasArgs());
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void constructor_givenOptHasArgAndDescription_shouldSetNumberOfArgsToOneWhenHasArgIsTrue()
    {
        // Arrange & Act
        Option option = new Option("b", true, "description B");

        // Assert
        Assert.assertEquals("b", option.getOpt());
        Assert.assertTrue(option.hasArg());
        Assert.assertFalse(option.hasArgs());
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void constructor_givenOptHasArgFalse_shouldSetNumberOfArgsToUninitialized()
    {
        // Arrange & Act
        Option option = new Option("c", false, "description C");

        // Assert
        Assert.assertFalse(option.hasArg());
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void constructor_givenAllParameters_shouldInitializeAllFields()
    {
        // Arrange & Act
        Option option = new Option("d", "dimension", true, "description D");

        // Assert
        Assert.assertEquals("d", option.getOpt());
        Assert.assertEquals("dimension", option.getLongOpt());
        Assert.assertTrue(option.hasLongOpt());
        Assert.assertTrue(option.hasArg());
        Assert.assertEquals(1, option.getArgs());
        Assert.assertEquals("description D", option.getDescription());
    }

    @Test
    public void getId_givenSingleCharShortOpt_shouldReturnAsciiValue()
    {
        // Arrange
        Option option = new Option("f", "desc");

        // Act & Assert
        Assert.assertEquals('f', option.getId());
    }

    @Test
    public void getId_givenNullOptAndValidLongOpt_shouldReturnFirstCharOfLongOpt()
    {
        // Arrange
        Option option = new Option(null, "file", false, "desc");

        // Act & Assert
        Assert.assertEquals('f', option.getId());
    }

    @Test
    public void getKey_givenOptIsNull_shouldReturnLongOpt()
    {
        // Arrange
        Option option = new Option(null, "verbose", false, "desc");

        // Act & Assert
        Assert.assertEquals("verbose", option.getKey());
    }

    @Test
    public void getKey_givenOptIsNonNull_shouldReturnOpt()
    {
        // Arrange
        Option option = new Option("v", "verbose", false, "desc");

        // Act & Assert
        Assert.assertEquals("v", option.getKey());
    }

    @Test
    public void setType_givenCustomType_shouldReturnSameType()
    {
        // Arrange
        Option option = new Option("t", "desc");
        Object expectedType = Integer.class;

        // Act
        option.setType(expectedType);

        // Assert
        Assert.assertEquals(expectedType, option.getType());
    }

    @Test
    public void setLongOpt_givenValue_shouldUpdateLongOpt()
    {
        // Arrange
        Option option = new Option("o", "desc");

        // Act
        option.setLongOpt("output");

        // Assert
        Assert.assertEquals("output", option.getLongOpt());
        Assert.assertTrue(option.hasLongOpt());
    }

    @Test
    public void setOptionalArg_givenTrue_shouldReturnTrue()
    {
        // Arrange
        Option option = new Option("o", "desc");

        // Act
        option.setOptionalArg(true);

        // Assert
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void setDescription_givenNewDescription_shouldUpdateDescription()
    {
        // Arrange
        Option option = new Option("d", "initial");

        // Act
        option.setDescription("updated");

        // Assert
        Assert.assertEquals("updated", option.getDescription());
    }

    @Test
    public void setRequired_givenTrue_shouldUpdateRequiredFlag()
    {
        // Arrange
        Option option = new Option("r", "desc");

        // Act
        option.setRequired(true);

        // Assert
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void setArgName_givenNonNullNonEmpty_shouldReturnTrueForHasArgName()
    {
        // Arrange
        Option option = new Option("a", "desc");

        // Act
        option.setArgName("customArg");

        // Assert
        Assert.assertEquals("customArg", option.getArgName());
        Assert.assertTrue(option.hasArgName());
    }

    @Test
    public void hasArgName_givenNullOrEmpty_shouldReturnFalse()
    {
        // Arrange
        Option option = new Option("a", "desc");

        // Act & Assert - default is "arg"
        Assert.assertTrue(option.hasArgName());

        option.setArgName(null);
        Assert.assertFalse(option.hasArgName());

        option.setArgName("");
        Assert.assertFalse(option.hasArgName());
    }

    @Test
    public void hasArgs_givenNumberOfArgsGreaterThanOneOrUnlimited_shouldReturnTrue()
    {
        // Arrange
        Option option = new Option("m", "desc");

        // Act & Assert
        option.setArgs(2);
        Assert.assertTrue(option.hasArgs());
        Assert.assertTrue(option.hasArg());

        option.setArgs(Option.UNLIMITED_VALUES);
        Assert.assertTrue(option.hasArgs());
        Assert.assertTrue(option.hasArg());

        option.setArgs(1);
        Assert.assertFalse(option.hasArgs());
        Assert.assertTrue(option.hasArg());

        option.setArgs(0);
        Assert.assertFalse(option.hasArgs());
        Assert.assertFalse(option.hasArg());

        option.setArgs(Option.UNINITIALIZED);
        Assert.assertFalse(option.hasArgs());
        Assert.assertFalse(option.hasArg());
    }

    @Test
    public void setValueSeparator_givenChar_shouldStoreSeparatorAndIndicateExistence()
    {
        // Arrange
        Option option = new Option("p", "desc");

        // Act & Assert
        Assert.assertFalse(option.hasValueSeparator());
        option.setValueSeparator('=');
        Assert.assertTrue(option.hasValueSeparator());
        Assert.assertEquals('=', option.getValueSeparator());
    }

    @Test(expected = RuntimeException.class)
    public void addValueForProcessing_givenUninitializedArgs_shouldThrowException()
    {
        // Arrange
        Option option = new Option("x", "desc");

        // Act
        option.addValueForProcessing("val");
    }

    @Test(expected = RuntimeException.class)
    public void addValueForProcessing_givenCapacityExceeded_shouldThrowException()
    {
        // Arrange
        Option option = new Option("x", true, "desc");
        option.addValueForProcessing("val1");

        // Act
        option.addValueForProcessing("val2");
    }

    @Test
    public void addValueForProcessing_givenValueSeparatorAndSingleArg_shouldNotSplitBeyondLimit()
    {
        // Arrange
        Option option = new Option("d", true, "desc");
        option.setValueSeparator('=');

        // Act
        option.addValueForProcessing("key=val");

        // Assert
        Assert.assertEquals("key=val", option.getValue());
    }

    @Test
    public void addValueForProcessing_givenValueSeparatorAndMultipleArgs_shouldSplitUpToNMinusOneTokens()
    {
        // Arrange
        Option option = new Option("p", "desc");
        option.setArgs(3);
        option.setValueSeparator(':');

        // Act
        option.addValueForProcessing("a:b:c:d:e");

        // Assert
        String[] values = option.getValues();
        Assert.assertNotNull(values);
        Assert.assertEquals(3, values.length);
        Assert.assertEquals("a", values[0]);
        Assert.assertEquals("b", values[1]);
        Assert.assertEquals("c:d:e", values[2]);
    }

    @Test
    public void addValueForProcessing_givenUnlimitedArgsAndValueSeparator_shouldSplitAllTokens()
    {
        // Arrange
        Option option = new Option("u", "desc");
        option.setArgs(Option.UNLIMITED_VALUES);
        option.setValueSeparator(',');

        // Act
        option.addValueForProcessing("first,second,third");

        // Assert
        String[] values = option.getValues();
        Assert.assertNotNull(values);
        Assert.assertEquals(3, values.length);
        Assert.assertEquals("first", values[0]);
        Assert.assertEquals("second", values[1]);
        Assert.assertEquals("third", values[2]);
    }

    @Test
    public void getValue_givenNoValues_shouldReturnNull()
    {
        // Arrange
        Option option = new Option("a", true, "desc");

        // Act & Assert
        Assert.assertNull(option.getValue());
        Assert.assertNull(option.getValue(0));
        Assert.assertEquals("default", option.getValue("default"));
        Assert.assertNull(option.getValues());
    }

    @Test
    public void getValue_givenValuesPresent_shouldReturnCorrectValues()
    {
        // Arrange
        Option option = new Option("a", "desc");
        option.setArgs(2);
        option.addValueForProcessing("val1");
        option.addValueForProcessing("val2");

        // Act & Assert
        Assert.assertEquals("val1", option.getValue());
        Assert.assertEquals("val1", option.getValue(0));
        Assert.assertEquals("val2", option.getValue(1));
        Assert.assertEquals("val1", option.getValue("defaultVal"));

        String[] values = option.getValues();
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("val1", values[0]);
        Assert.assertEquals("val2", values[1]);

        List valuesList = option.getValuesList();
        Assert.assertEquals(2, valuesList.size());
        Assert.assertEquals("val1", valuesList.get(0));
        Assert.assertEquals("val2", valuesList.get(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValueByIndex_givenOutOfBoundsIndex_shouldThrowException()
    {
        // Arrange
        Option option = new Option("a", true, "desc");
        option.addValueForProcessing("val1");

        // Act
        option.getValue(5);
    }

    @Test
    public void clearValues_givenPopulatedOption_shouldRemoveAllValues()
    {
        // Arrange
        Option option = new Option("a", true, "desc");
        option.addValueForProcessing("val");
        Assert.assertNotNull(option.getValue());

        // Act
        option.clearValues();

        // Assert
        Assert.assertNull(option.getValue());
        Assert.assertNull(option.getValues());
        Assert.assertEquals(0, option.getValuesList().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addValue_always_shouldThrowUnsupportedOperationException()
    {
        // Arrange
        Option option = new Option("a", "desc");

        // Act
        option.addValue("test");
    }

    @Test
    public void acceptsArg_givenVariousStates_shouldReturnExpectedBoolean()
    {
        // Arrange
        Option optionNoArg = new Option("a", "desc");
        Assert.assertFalse(optionNoArg.acceptsArg());

        Option optionOptional = new Option("b", "desc");
        optionOptional.setOptionalArg(true);
        Assert.assertTrue(optionOptional.acceptsArg());

        Option optionSingle = new Option("c", true, "desc");
        Assert.assertTrue(optionSingle.acceptsArg());
        optionSingle.addValueForProcessing("v1");
        Assert.assertFalse(optionSingle.acceptsArg());

        Option optionUnlimited = new Option("d", "desc");
        optionUnlimited.setArgs(Option.UNLIMITED_VALUES);
        Assert.assertTrue(optionUnlimited.acceptsArg());
        optionUnlimited.addValueForProcessing("v1");
        Assert.assertTrue(optionUnlimited.acceptsArg());
    }

    @Test
    public void requiresArg_givenOptionalArg_shouldReturnFalse()
    {
        // Arrange
        Option option = new Option("o", true, "desc");
        option.setOptionalArg(true);

        // Act & Assert
        Assert.assertFalse(option.requiresArg());
    }

    @Test
    public void requiresArg_givenUnlimitedValues_shouldReturnTrueWhenEmptyAndFalseWhenNotEmpty()
    {
        // Arrange
        Option option = new Option("u", "desc");
        option.setArgs(Option.UNLIMITED_VALUES);

        // Act & Assert
        Assert.assertTrue(option.requiresArg());

        option.addValueForProcessing("val1");
        Assert.assertFalse(option.requiresArg());
    }

    @Test
    public void requiresArg_givenFiniteArgs_shouldDelegateToAcceptsArg()
    {
        // Arrange
        Option option = new Option("f", true, "desc");

        // Act & Assert
        Assert.assertTrue(option.requiresArg());

        option.addValueForProcessing("val1");
        Assert.assertFalse(option.requiresArg());
    }

    @Test
    public void clone_givenOptionWithValues_shouldProduceDeepCopyOfValues()
    {
        // Arrange
        Option original = new Option("c", "cloneOpt", true, "desc");
        original.addValueForProcessing("val1");

        // Act
        Option cloned = (Option) original.clone();

        // Assert
        Assert.assertNotSame(original, cloned);
        Assert.assertEquals(original, cloned);
        Assert.assertEquals("val1", cloned.getValue());

        // Verify values isolation
        original.clearValues();
        Assert.assertNull(original.getValue());
        Assert.assertEquals("val1", cloned.getValue());
    }

    @Test
    public void equalsAndHashCode_givenVariousOptions_shouldAdhereToContract()
    {
        // Arrange
        Option optA1 = new Option("a", "longA", false, "desc");
        Option optA2 = new Option("a", "longA", false, "different desc");
        Option optB = new Option("b", "longA", false, "desc");
        Option optLongB = new Option("a", "longB", false, "desc");
        Option optNullShort1 = new Option(null, "sameLong", false, "desc");
        Option optNullShort2 = new Option(null, "sameLong", false, "desc2");

        // Assert: reflexive
        Assert.assertEquals(optA1, optA1);

        // Assert: symmetric & equals ignoring description
        Assert.assertEquals(optA1, optA2);
        Assert.assertEquals(optA2, optA1);
        Assert.assertEquals(optA1.hashCode(), optA2.hashCode());

        // Assert: null short options equality
        Assert.assertEquals(optNullShort1, optNullShort2);
        Assert.assertEquals(optNullShort1.hashCode(), optNullShort2.hashCode());

        // Assert: not equal to null or other types
        Assert.assertFalse(optA1.equals(null));
        Assert.assertFalse(optA1.equals("a"));

        // Assert: different opt or different longOpt
        Assert.assertFalse(optA1.equals(optB));
        Assert.assertFalse(optA1.equals(optLongB));
        Assert.assertFalse(optNullShort1.equals(optA1));
        Assert.assertFalse(optA1.equals(optNullShort1));

        Option optNullLong1 = new Option("a", null, false, "desc");
        Option optNullLong2 = new Option("a", null, false, "desc2");
        Assert.assertEquals(optNullLong1, optNullLong2);
        Assert.assertFalse(optNullLong1.equals(optA1));
        Assert.assertFalse(optA1.equals(optNullLong1));
    }

    @Test
    public void toString_givenDifferentConfigurations_shouldProduceExpectedFormat()
    {
        // Arrange
        Option optShortOnly = new Option("s", "short description");
        Option optFull = new Option("f", "full", true, "full description");
        optFull.setType(String.class);
        Option optMulti = new Option("m", "multi", false, "multi description");
        optMulti.setArgs(2);

        // Act & Assert
        String strShort = optShortOnly.toString();
        Assert.assertTrue(strShort.indexOf("[ option: s") != -1);
        Assert.assertTrue(strShort.indexOf(":: short description") != -1);

        String strFull = optFull.toString();
        Assert.assertTrue(strFull.indexOf("[ option: f full  [ARG] :: full description :: class java.lang.String ]") != -1);

        String strMulti = optMulti.toString();
        Assert.assertTrue(strMulti.indexOf("[ option: m multi [ARG...] :: multi description ]") != -1);
    }
}