package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
            // Expected during cleanup to ensure reset state
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
            // Expected during cleanup to ensure reset state
        }
    }

    @Test
    public void constructor_givenPrivateConstructor_shouldBeInvokableViaReflection() throws Exception
    {
        // Arrange
        Constructor constructor = OptionBuilder.class.getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        // Act
        Object instance = constructor.newInstance(new Object[0]);

        // Assert
        assertNotNull(instance);
        assertTrue(instance instanceof OptionBuilder);
    }

    @Test
    public void create_givenCharOption_shouldCreateOptionWithDefaultProperties()
    {
        // Act
        Option opt = OptionBuilder.create('a');

        // Assert
        assertEquals("a", opt.getOpt());
        assertNull(opt.getDescription());
        assertNull(opt.getLongOpt());
        assertFalse(opt.isRequired());
        assertFalse(opt.hasOptionalArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertNull(opt.getType());
        assertEquals((char) 0, opt.getValueSeparator());
        assertEquals("arg", opt.getArgName());
    }

    @Test
    public void create_givenStringOption_shouldCreateOptionWithDefaultProperties()
    {
        // Act
        Option opt = OptionBuilder.create("testOpt");

        // Assert
        assertEquals("testOpt", opt.getOpt());
        assertNull(opt.getDescription());
        assertNull(opt.getLongOpt());
        assertFalse(opt.isRequired());
        assertFalse(opt.hasOptionalArg());
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertNull(opt.getType());
        assertEquals((char) 0, opt.getValueSeparator());
        assertEquals("arg", opt.getArgName());
    }

    @Test
    public void create_givenNullLongOpt_shouldThrowIllegalArgumentException()
    {
        // Act & Assert
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException when longOpt is null");
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("must specify longopt", e.getMessage());
        }
    }

    @Test
    public void create_givenValidLongOpt_shouldCreateOptionWithNullShortOpt()
    {
        // Arrange
        OptionBuilder.withLongOpt("onlyLong");

        // Act
        Option opt = OptionBuilder.create();

        // Assert
        assertNull(opt.getOpt());
        assertEquals("onlyLong", opt.getLongOpt());
    }

    @Test
    public void withLongOpt_givenValue_shouldSetLongOptCorrectly()
    {
        // Act
        Option opt = OptionBuilder.withLongOpt("myLongOpt").create('m');

        // Assert
        assertEquals("m", opt.getOpt());
        assertEquals("myLongOpt", opt.getLongOpt());
    }

    @Test
    public void withDescription_givenValue_shouldSetDescriptionCorrectly()
    {
        // Act
        Option opt = OptionBuilder.withDescription("myDescription").create('d');

        // Assert
        assertEquals("d", opt.getOpt());
        assertEquals("myDescription", opt.getDescription());
    }

    @Test
    public void withArgName_givenValue_shouldSetArgNameCorrectly()
    {
        // Act
        Option opt = OptionBuilder.withArgName("customArg").create('n');

        // Assert
        assertEquals("customArg", opt.getArgName());
    }

    @Test
    public void withType_givenValue_shouldSetTypeCorrectly()
    {
        // Arrange
        Object customType = Integer.class;

        // Act
        Option opt = OptionBuilder.withType(customType).create('t');

        // Assert
        assertEquals(customType, opt.getType());
    }

    @Test
    public void isRequired_givenNoArgument_shouldSetRequiredTrue()
    {
        // Act
        Option opt = OptionBuilder.isRequired().create('r');

        // Assert
        assertTrue(opt.isRequired());
    }

    @Test
    public void isRequired_givenTrue_shouldSetRequiredTrue()
    {
        // Act
        Option opt = OptionBuilder.isRequired(true).create('r');

        // Assert
        assertTrue(opt.isRequired());
    }

    @Test
    public void isRequired_givenFalse_shouldSetRequiredFalse()
    {
        // Act
        Option opt = OptionBuilder.isRequired(false).create('r');

        // Assert
        assertFalse(opt.isRequired());
    }

    @Test
    public void hasArg_givenNoArgument_shouldSetNumberOfArgsToOne()
    {
        // Act
        Option opt = OptionBuilder.hasArg().create('a');

        // Assert
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasArg());
    }

    @Test
    public void hasArg_givenTrue_shouldSetNumberOfArgsToOne()
    {
        // Act
        Option opt = OptionBuilder.hasArg(true).create('a');

        // Assert
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasArg());
    }

    @Test
    public void hasArg_givenFalse_shouldSetNumberOfArgsToUninitialized()
    {
        // Act
        Option opt = OptionBuilder.hasArg(false).create('a');

        // Assert
        assertEquals(Option.UNINITIALIZED, opt.getArgs());
        assertFalse(opt.hasArg());
    }

    @Test
    public void hasArgs_givenNoArgument_shouldSetUnlimitedArgs()
    {
        // Act
        Option opt = OptionBuilder.hasArgs().create('a');

        // Assert
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasArgs());
    }

    @Test
    public void hasArgs_givenSpecificNumber_shouldSetNumberOfArgs()
    {
        // Act
        Option opt = OptionBuilder.hasArgs(3).create('a');

        // Assert
        assertEquals(3, opt.getArgs());
        assertTrue(opt.hasArgs());
    }

    @Test
    public void hasOptionalArg_givenNoArgument_shouldSetOptionalArgAndOneArg()
    {
        // Act
        Option opt = OptionBuilder.hasOptionalArg().create('o');

        // Assert
        assertEquals(1, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_givenNoArgument_shouldSetOptionalArgAndUnlimitedArgs()
    {
        // Act
        Option opt = OptionBuilder.hasOptionalArgs().create('o');

        // Assert
        assertEquals(Option.UNLIMITED_VALUES, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void hasOptionalArgs_givenSpecificNumber_shouldSetOptionalArgAndArgCount()
    {
        // Act
        Option opt = OptionBuilder.hasOptionalArgs(5).create('o');

        // Assert
        assertEquals(5, opt.getArgs());
        assertTrue(opt.hasOptionalArg());
    }

    @Test
    public void withValueSeparator_givenNoArgument_shouldSetDefaultSeparator()
    {
        // Act
        Option opt = OptionBuilder.withValueSeparator().create('s');

        // Assert
        assertEquals('=', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    @Test
    public void withValueSeparator_givenCustomChar_shouldSetCustomSeparator()
    {
        // Act
        Option opt = OptionBuilder.withValueSeparator(':').create('s');

        // Assert
        assertEquals(':', opt.getValueSeparator());
        assertTrue(opt.hasValueSeparator());
    }

    @Test
    public void create_givenAllBuilderMethodsChained_shouldPopulateAllFields()
    {
        // Act
        Option opt = OptionBuilder.withLongOpt("complex")
                                  .withDescription("complex description")
                                  .withArgName("file")
                                  .isRequired(true)
                                  .hasArgs(2)
                                  .withType(String.class)
                                  .withValueSeparator(';')
                                  .create('C');

        // Assert
        assertEquals("C", opt.getOpt());
        assertEquals("complex", opt.getLongOpt());
        assertEquals("complex description", opt.getDescription());
        assertEquals("file", opt.getArgName());
        assertTrue(opt.isRequired());
        assertEquals(2, opt.getArgs());
        assertEquals(String.class, opt.getType());
        assertEquals(';', opt.getValueSeparator());
        assertFalse(opt.hasOptionalArg());
    }

    @Test
    public void create_givenPreviousCreation_shouldResetStateForNextOption()
    {
        // Arrange
        OptionBuilder.withLongOpt("firstOpt")
                     .withDescription("firstDesc")
                     .isRequired()
                     .hasArgs(4)
                     .withType(Float.class)
                     .withValueSeparator(',')
                     .withArgName("firstArg")
                     .create('f');

        // Act
        Option nextOpt = OptionBuilder.create('s');

        // Assert
        assertEquals("s", nextOpt.getOpt());
        assertNull(nextOpt.getLongOpt());
        assertNull(nextOpt.getDescription());
        assertEquals("arg", nextOpt.getArgName());
        assertFalse(nextOpt.isRequired());
        assertEquals(Option.UNINITIALIZED, nextOpt.getArgs());
        assertNull(nextOpt.getType());
        assertEquals((char) 0, nextOpt.getValueSeparator());
        assertFalse(nextOpt.hasOptionalArg());
    }

    @Test
    public void create_givenFailedCreateWithoutLongOpt_shouldResetState()
    {
        // Arrange
        OptionBuilder.withDescription("tempDesc");

        // Act
        try
        {
            OptionBuilder.create();
            fail("Expected IllegalArgumentException");
        }
        catch (IllegalArgumentException e)
        {
            // Expected
        }

        Option nextOpt = OptionBuilder.create("normalOpt");

        // Assert
        assertNull(nextOpt.getDescription());
    }

    @Test
    public void create_givenNullOptStringWithLongOpt_shouldCreateOption()
    {
        // Arrange
        OptionBuilder.withLongOpt("validLong");

        // Act
        Option opt = OptionBuilder.create((String) null);

        // Assert
        assertNull(opt.getOpt());
        assertEquals("validLong", opt.getLongOpt());
    }
}