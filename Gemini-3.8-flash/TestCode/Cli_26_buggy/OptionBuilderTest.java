package org.apache.commons.cli;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OptionBuilderTest
{
    @Before
    public void setUp()
    {
        try
        {
            OptionBuilder.create();
        }
        catch (IllegalArgumentException e)
        {
            // Expected: clears/resets any leftover state before test
        }
    }

    @After
    public void tearDown()
    {
        try
        {
            OptionBuilder.create();
        }
        catch (IllegalArgumentException e)
        {
            // Expected: cleans up state after test execution
        }
    }

    @Test
    public void testPrivateConstructor() throws Exception
    {
        Constructor[] constructors = OptionBuilder.class.getDeclaredConstructors();
        Assert.assertEquals(1, constructors.length);
        Constructor constructor = constructors[0];
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        Object instance = constructor.newInstance(new Object[0]);
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof OptionBuilder);
    }

    @Test
    public void create_givenCharOpt_shouldCreateOption()
    {
        Option option = OptionBuilder.withLongOpt("opt-char")
                                     .withDescription("Description for char")
                                     .create('c');

        Assert.assertEquals("c", option.getOpt());
        Assert.assertEquals("opt-char", option.getLongOpt());
        Assert.assertEquals("Description for char", option.getDescription());
    }

    @Test
    public void create_givenStringOpt_shouldCreateOption()
    {
        Option option = OptionBuilder.withLongOpt("simple")
                                     .withDescription("Simple description")
                                     .create("s");

        Assert.assertEquals("s", option.getOpt());
        Assert.assertEquals("simple", option.getLongOpt());
        Assert.assertEquals("Simple description", option.getDescription());
    }

    @Test
    public void create_givenLongOptOnly_shouldCreateOption()
    {
        Option option = OptionBuilder.withLongOpt("only-long")
                                     .withDescription("Long option only")
                                     .create();

        Assert.assertNull(option.getOpt());
        Assert.assertEquals("only-long", option.getLongOpt());
        Assert.assertEquals("Long option only", option.getDescription());
    }

    @Test(expected = IllegalArgumentException.class)
    public void create_givenNoLongOpt_shouldThrowIllegalArgumentException()
    {
        OptionBuilder.withDescription("Should fail").create();
    }

    @Test
    public void create_givenNoLongOpt_shouldResetStateOnException()
    {
        try
        {
            OptionBuilder.hasArg().isRequired().withDescription("Failed attempt").create();
            Assert.fail("Expected IllegalArgumentException when create() called without longOpt");
        }
        catch (IllegalArgumentException e)
        {
            Assert.assertEquals("must specify longopt", e.getMessage());
        }

        Option nextOption = OptionBuilder.withLongOpt("valid").create();
        Assert.assertEquals("valid", nextOption.getLongOpt());
        Assert.assertFalse("Required should be reset to false", nextOption.isRequired());
        Assert.assertFalse("Args should be reset to UNINITIALIZED", nextOption.hasArg());
        Assert.assertNull("Description should be reset to null", nextOption.getDescription());
    }

    @Test
    public void create_shouldResetPropertiesAfterSuccessfulCreation()
    {
        Option first = OptionBuilder.withLongOpt("first")
                                    .withDescription("First description")
                                    .withArgName("firstArg")
                                    .isRequired(true)
                                    .hasArg()
                                    .withType(Integer.class)
                                    .withValueSeparator(';')
                                    .create("f");

        Assert.assertEquals("first", first.getLongOpt());
        Assert.assertEquals("First description", first.getDescription());
        Assert.assertEquals("firstArg", first.getArgName());
        Assert.assertTrue(first.isRequired());
        Assert.assertTrue(first.hasArg());
        Assert.assertEquals(Integer.class, first.getType());
        Assert.assertEquals(';', first.getValueSeparator());

        Option second = OptionBuilder.create("s");

        Assert.assertNull(second.getLongOpt());
        Assert.assertNull(second.getDescription());
        Assert.assertEquals("arg", second.getArgName());
        Assert.assertFalse(second.isRequired());
        Assert.assertFalse(second.hasArg());
        Assert.assertNull(second.getType());
        Assert.assertEquals((char) 0, second.getValueSeparator());
    }

    @Test
    public void hasArg_noArg_shouldSetNumberOfArgsToOne()
    {
        OptionBuilder builder = OptionBuilder.hasArg();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void hasArg_givenTrue_shouldSetNumberOfArgsToOne()
    {
        OptionBuilder builder = OptionBuilder.hasArg(true);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(1, option.getArgs());
    }

    @Test
    public void hasArg_givenFalse_shouldSetNumberOfArgsToUninitialized()
    {
        OptionBuilder builder = OptionBuilder.hasArg(false);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(Option.UNINITIALIZED, option.getArgs());
    }

    @Test
    public void hasArgs_noArg_shouldSetNumberOfArgsToUnlimited()
    {
        OptionBuilder builder = OptionBuilder.hasArgs();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
    }

    @Test
    public void hasArgs_givenNumber_shouldSetNumberOfArgs()
    {
        OptionBuilder builder = OptionBuilder.hasArgs(3);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(3, option.getArgs());
    }

    @Test
    public void hasOptionalArg_shouldSetSingleOptionalArg()
    {
        OptionBuilder builder = OptionBuilder.hasOptionalArg();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(1, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_noArg_shouldSetUnlimitedOptionalArgs()
    {
        OptionBuilder builder = OptionBuilder.hasOptionalArgs();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(Option.UNLIMITED_VALUES, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_givenNumber_shouldSetSpecifiedOptionalArgs()
    {
        OptionBuilder builder = OptionBuilder.hasOptionalArgs(5);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(5, option.getArgs());
        Assert.assertTrue(option.hasOptionalArg());
    }

    @Test
    public void isRequired_noArg_shouldSetRequiredTrue()
    {
        OptionBuilder builder = OptionBuilder.isRequired();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void isRequired_givenTrue_shouldSetRequiredTrue()
    {
        OptionBuilder builder = OptionBuilder.isRequired(true);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void isRequired_givenFalse_shouldSetRequiredFalse()
    {
        OptionBuilder builder = OptionBuilder.isRequired(false);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void withValueSeparator_noArg_shouldSetSeparatorToEquals()
    {
        OptionBuilder builder = OptionBuilder.withValueSeparator();
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals('=', option.getValueSeparator());
    }

    @Test
    public void withValueSeparator_givenChar_shouldSetSeparator()
    {
        OptionBuilder builder = OptionBuilder.withValueSeparator(':');
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(':', option.getValueSeparator());
    }

    @Test
    public void withType_givenObject_shouldSetType()
    {
        Object type = String.class;
        OptionBuilder builder = OptionBuilder.withType(type);
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals(String.class, option.getType());
    }

    @Test
    public void withDescription_givenString_shouldSetDescription()
    {
        OptionBuilder builder = OptionBuilder.withDescription("Test description");
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals("Test description", option.getDescription());
    }

    @Test
    public void withDescription_givenNull_shouldSetNullDescription()
    {
        OptionBuilder.withDescription(null);
        Option option = OptionBuilder.create("opt");
        Assert.assertNull(option.getDescription());
    }

    @Test
    public void withArgName_givenString_shouldSetArgName()
    {
        OptionBuilder builder = OptionBuilder.withArgName("myArg");
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals("myArg", option.getArgName());
    }

    @Test
    public void withArgName_givenNull_shouldSetNullArgName()
    {
        OptionBuilder.withArgName(null);
        Option option = OptionBuilder.create("opt");
        Assert.assertNull(option.getArgName());
    }

    @Test
    public void withLongOpt_givenString_shouldSetLongOpt()
    {
        OptionBuilder builder = OptionBuilder.withLongOpt("custom-long");
        Assert.assertNotNull(builder);

        Option option = OptionBuilder.create("opt");
        Assert.assertEquals("custom-long", option.getLongOpt());
    }

    @Test
    public void withLongOpt_givenNull_shouldSetNullLongOpt()
    {
        OptionBuilder.withLongOpt(null);
        Option option = OptionBuilder.create("opt");
        Assert.assertNull(option.getLongOpt());
    }

    @Test
    public void create_fluentChaining_shouldSetAllPropertiesCorrectly()
    {
        Option option = OptionBuilder.withLongOpt("chain-opt")
                                     .withDescription("Chained configuration")
                                     .hasArgs(2)
                                     .isRequired(true)
                                     .withValueSeparator(',')
                                     .withArgName("keyVal")
                                     .withType(Object.class)
                                     .create('k');

        Assert.assertEquals("k", option.getOpt());
        Assert.assertEquals("chain-opt", option.getLongOpt());
        Assert.assertEquals("Chained configuration", option.getDescription());
        Assert.assertEquals(2, option.getArgs());
        Assert.assertTrue(option.isRequired());
        Assert.assertEquals(',', option.getValueSeparator());
        Assert.assertEquals("keyVal", option.getArgName());
        Assert.assertEquals(Object.class, option.getType());
        Assert.assertFalse(option.hasOptionalArg());
    }
}