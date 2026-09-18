package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

public class OptionTest
{
    @Test
    public void constructor_givenTwoArgs_shouldInitializeProperly()
    {
        Option option = new Option("a", "description for a");

        assertEquals("a", option.getOpt());
        assertNull(option.getLongOpt());
        assertEquals("description for a", option.getDescription());
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void constructor_givenThreeArgsWithHasArgTrue_shouldSetNumberOfArgsToOne()
    {
        Option option = new Option("b", true, "description for b");

        assertEquals("b", option.getOpt());
        assertNull(option.getLongOpt());
        assertEquals("description for b", option.getDescription());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
    }

    @Test
    public void constructor_givenThreeArgsWithHasArgFalse_shouldKeepUninitializedArgs()
    {
        Option option = new Option("c", false, "description for c");

        assertEquals("c", option.getOpt());
        assertNull(option.getLongOpt());
        assertFalse(option.hasArg());
        assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void constructor_givenFourArgsWithLongOptAndHasArg_shouldInitializeAllFields()
    {
        Option option = new Option("d", "long-d", true, "description for d");

        assertEquals("d", option.getOpt());
        assertEquals("long-d", option.getLongOpt());
        assertTrue(option.hasLongOpt());
        assertTrue(option.hasArg());
        assertEquals(1, option.getArgs());
        assertEquals("description for d", option.getDescription());
    }

    @Test
    public void constructor_givenNullOptAndValidLongOpt_shouldInitializeSuccessfully()
    {
        Option option = new Option(null, "verbose", false, "verbose mode");

        assertNull(option.getOpt());
        assertEquals("verbose", option.getLongOpt());
        assertTrue(option.hasLongOpt());
        assertEquals("verbose", option.getKey());
    }

    @Test
    public void getId_givenShortOpt_shouldReturnFirstCharacterCode()
    {
        Option option = new Option("x", "option x");

        assertEquals('x', option.getId());
    }

    @Test
    public void getId_givenNullOptAndLongOpt_shouldReturnFirstCharacterOfLongOpt()
    {
        Option option = new Option(null, "extra", false, "extra option");

        assertEquals('e', option.getId());
    }

    @Test
    public void getKey_givenShortOptAndLongOpt_shouldReturnShortOpt()
    {
        Option option = new Option("o", "output", true, "output file");

        assertEquals("o", option.getKey());
    }

    @Test
    public void getKey_givenNullShortOptAndLongOpt_shouldReturnLongOpt()
    {
        Option option = new Option(null, "config", true, "config file");

        assertEquals("config", option.getKey());
    }

    @Test
    public void setLongOpt_givenNewValue_shouldUpdateLongOptAndHasLongOptFlag()
    {
        Option option = new Option("f", "file option");

        assertNull(option.getLongOpt());
        assertFalse(option.hasLongOpt());

        option.setLongOpt("file");

        assertEquals("file", option.getLongOpt());
        assertTrue(option.hasLongOpt());
    }

    @Test
    public void setDescription_givenNewValue_shouldUpdateDescription()
    {
        Option option = new Option("d", "old description");
        option.setDescription("new description");

        assertEquals("new description", option.getDescription());
    }

    @Test
    public void setType_givenClassType_shouldUpdateType()
    {
        Option option = new Option("t", "type option");
        assertNull(option.getType());

        option.setType(Integer.class);

        assertEquals(Integer.class, option.getType());
    }

    @Test
    public void setRequired_givenBooleanFlags_shouldUpdateRequiredStatus()
    {
        Option option = new Option("r", "required option");
        assertFalse(option.isRequired());

        option.setRequired(true);
        assertTrue(option.isRequired());

        option.setRequired(false);
        assertFalse(option.isRequired());
    }

    @Test
    public void setOptionalArg_givenBooleanFlags_shouldUpdateOptionalArgStatus()
    {
        Option option = new Option("o", "optional arg option");
        assertFalse(option.hasOptionalArg());

        option.setOptionalArg(true);
        assertTrue(option.hasOptionalArg());

        option.setOptionalArg(false);
        assertFalse(option.hasOptionalArg());
    }

    @Test
    public void setArgName_givenNullEmptyOrValidValue_shouldReflectInHasArgName()
    {
        Option option = new Option("a", "arg option");

        assertNull(option.getArgName());
        assertFalse(option.hasArgName());

        option.setArgName("");
        assertEquals("", option.getArgName());
        assertFalse(option.hasArgName());

        option.setArgName("FILE");
        assertEquals("FILE", option.getArgName());
        assertTrue(option.hasArgName());

        option.setArgName(null);
        assertNull(option.getArgName());
        assertFalse(option.hasArgName());
    }

    @Test
    public void setArgs_givenZeroOneMultipleAndUnlimited_shouldUpdateHasArgAndHasArgs()
    {
        Option option = new Option("n", "number option");

        option.setArgs(0);
        assertEquals(0, option.getArgs());
        assertFalse(option.hasArg());
        assertFalse(option.hasArgs());

        option.setArgs(1);
        assertEquals(1, option.getArgs());
        assertTrue(option.hasArg());
        assertFalse(option.hasArgs());

        option.setArgs(2);
        assertEquals(2, option.getArgs());
        assertTrue(option.hasArg());
        assertTrue(option.hasArgs());

        option.setArgs(Option.UNLIMITED_VALUES);
        assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        assertTrue(option.hasArg());
        assertTrue(option.hasArgs());
    }

    @Test
    public void setValueSeparator_givenChar_shouldUpdateValueSeparatorAndFlag()
    {
        Option option = new Option("p", "property option");
        assertEquals((char) 0, option.getValueSeparator());
        assertFalse(option.hasValueSeparator());

        option.setValueSeparator('=');
        assertEquals('=', option.getValueSeparator());
        assertTrue(option.hasValueSeparator());
    }

    @Test(expected = RuntimeException.class)
    public void addValueForProcessing_givenUninitializedOption_shouldThrowException()
    {
        Option option = new Option("u", "uninitialized option");
        option.addValueForProcessing("val");
    }

    @Test(expected = RuntimeException.class)
    public void addValueForProcessing_givenFullCapacity_shouldThrowException()
    {
        Option option = new Option("s", true, "single value option");
        option.addValueForProcessing("first");
        option.addValueForProcessing("second");
    }

    @Test
    public void addValueForProcessing_givenSingleArg_shouldStoreValue()
    {
        Option option = new Option("s", true, "single value");
        option.addValueForProcessing("hello");

        assertEquals("hello", option.getValue());
        assertEquals("hello", option.getValue(0));
        assertEquals("hello", option.getValue("fallback"));

        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals("hello", values[0]);

        List valuesList = option.getValuesList();
        assertEquals(1, valuesList.size());
        assertEquals("hello", valuesList.get(0));
    }

    @Test
    public void addValueForProcessing_givenSeparatorWithUnlimitedArgs_shouldSplitAllTokens()
    {
        Option option = new Option("m", "multi option");
        option.setArgs(Option.UNLIMITED_VALUES);
        option.setValueSeparator(',');
        option.addValueForProcessing("a,b,c");

        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("a", values[0]);
        assertEquals("b", values[1]);
        assertEquals("c", values[2]);
    }

    @Test
    public void addValueForProcessing_givenSeparatorWithLimitedArgs_shouldCeaseParsingAtLimit()
    {
        Option option = new Option("d", "define option");
        option.setArgs(2);
        option.setValueSeparator('=');
        option.addValueForProcessing("key=val1=val2");

        String[] values = option.getValues();
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("key", values[0]);
        assertEquals("val1=val2", values[1]);
    }

    @Test
    public void addValueForProcessing_givenSeparatorNotInString_shouldAddEntireString()
    {
        Option option = new Option("p", "path option");
        option.setArgs(2);
        option.setValueSeparator(':');
        option.addValueForProcessing("/usr/local/bin");

        assertEquals("/usr/local/bin", option.getValue());
        assertEquals(1, option.getValuesList().size());
    }

    @Test
    public void getValue_givenNoValues_shouldReturnNullOrDefault()
    {
        Option option = new Option("e", true, "empty option");

        assertNull(option.getValue());
        assertNull(option.getValue(0));
        assertNull(option.getValues());
        assertEquals("fallback", option.getValue("fallback"));
        assertNotNull(option.getValuesList());
        assertEquals(0, option.getValuesList().size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValue_givenIndexOutOfBounds_shouldThrowIndexOutOfBoundsException()
    {
        Option option = new Option("b", true, "bounds option");
        option.addValueForProcessing("val1");

        option.getValue(1);
    }

    @Test
    public void clearValues_givenPopulatedOption_shouldEmptyValues()
    {
        Option option = new Option("c", true, "clear option");
        option.addValueForProcessing("temp");
        assertEquals("temp", option.getValue());

        option.clearValues();

        assertNull(option.getValue());
        assertNull(option.getValues());
        assertEquals(0, option.getValuesList().size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addValue_givenDirectCall_shouldThrowUnsupportedOperationException()
    {
        Option option = new Option("a", "deprecated method");
        option.addValue("value");
    }

    @Test
    public void acceptsArg_givenDifferentConfigurations_shouldEvaluateCorrectly()
    {
        Option optionUninit = new Option("u", "uninit");
        assertFalse(optionUninit.acceptsArg());

        Option optionOptionalZeroArgs = new Option("o", "optional zero");
        optionOptionalZeroArgs.setArgs(0);
        optionOptionalZeroArgs.setOptionalArg(true);
        assertTrue(optionOptionalZeroArgs.acceptsArg());

        Option optionSingle = new Option("s", true, "single");
        assertTrue(optionSingle.acceptsArg());
        optionSingle.addValueForProcessing("v1");
        assertFalse(optionSingle.acceptsArg());

        Option optionUnlimited = new Option("m", "multi");
        optionUnlimited.setArgs(Option.UNLIMITED_VALUES);
        assertTrue(optionUnlimited.acceptsArg());
        optionUnlimited.addValueForProcessing("v1");
        assertTrue(optionUnlimited.acceptsArg());
    }

    @Test
    public void requiresArg_givenOptionalArgs_shouldReturnFalse()
    {
        Option option = new Option("o", true, "optional");
        option.setOptionalArg(true);

        assertFalse(option.requiresArg());
    }

    @Test
    public void requiresArg_givenUnlimitedArgs_shouldDependOnValuesPresence()
    {
        Option option = new Option("u", "unlimited");
        option.setArgs(Option.UNLIMITED_VALUES);

        assertTrue(option.requiresArg());

        option.addValueForProcessing("item1");

        assertFalse(option.requiresArg());
    }

    @Test
    public void requiresArg_givenLimitedArgs_shouldDependOnAcceptsArg()
    {
        Option option = new Option("l", true, "limited");

        assertTrue(option.requiresArg());

        option.addValueForProcessing("arg");

        assertFalse(option.requiresArg());
    }

    @Test
    public void toString_givenVariousOptionStates_shouldFormatStringCorrectly()
    {
        Option simple = new Option("s", "simple option");
        assertEquals("[ option: s  :: simple option ]", simple.toString());

        Option withLong = new Option("s", "simple", false, "simple description");
        assertEquals("[ option: s simple  :: simple description ]", withLong.toString());

        Option withSingleArg = new Option("f", "file", true, "specify file");
        assertEquals("[ option: f file  [ARG] :: specify file ]", withSingleArg.toString());

        Option withMultipleArgs = new Option("m", "multi", false, "multiple files");
        withMultipleArgs.setArgs(3);
        assertEquals("[ option: m multi [ARG...] :: multiple files ]", withMultipleArgs.toString());

        Option withType = new Option("c", "class-opt", true, "typed option");
        withType.setType(String.class);
        assertEquals("[ option: c class-opt  [ARG] :: typed option :: class java.lang.String ]", withType.toString());
    }

    @Test
    public void equalsAndHashCode_givenVariousScenarios_shouldAdhereToContract()
    {
        Option opt1 = new Option("a", "long-a", true, "desc");
        Option opt2 = new Option("a", "long-a", true, "desc");
        Option opt3 = new Option("b", "long-a", true, "desc");
        Option opt4 = new Option("a", "long-b", true, "desc");
        Option optNullShort1 = new Option(null, "only-long", true, "desc");
        Option optNullShort2 = new Option(null, "only-long", true, "desc");
        Option optNullLong = new Option("a", null, true, "desc");

        assertTrue(opt1.equals(opt1));
        assertFalse(opt1.equals(null));
        assertFalse(opt1.equals("different-type"));

        assertTrue(opt1.equals(opt2));
        assertTrue(opt2.equals(opt1));
        assertEquals(opt1.hashCode(), opt2.hashCode());

        assertFalse(opt1.equals(opt3));
        assertFalse(opt1.equals(opt4));

        assertTrue(optNullShort1.equals(optNullShort2));
        assertEquals(optNullShort1.hashCode(), optNullShort2.hashCode());
        assertFalse(optNullShort1.equals(opt1));
        assertFalse(opt1.equals(optNullShort1));

        assertFalse(opt1.equals(optNullLong));
        assertFalse(optNullLong.equals(opt1));
    }

    @Test
    public void clone_givenOptionWithValues_shouldProduceDeepCopyOfValuesList()
    {
        Option original = new Option("c", "cloneable", true, "clone test");
        original.addValueForProcessing("val1");

        Option cloned = (Option) original.clone();

        assertNotSame(original, cloned);
        assertEquals(original, cloned);
        assertNotSame(original.getValuesList(), cloned.getValuesList());
        assertEquals(original.getValuesList(), cloned.getValuesList());

        cloned.clearValues();
        assertEquals(1, original.getValuesList().size());
        assertEquals(0, cloned.getValuesList().size());
    }
}