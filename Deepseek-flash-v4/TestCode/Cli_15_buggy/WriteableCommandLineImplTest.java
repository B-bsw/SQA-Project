package org.apache.commons.cli2.commandline;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.option.PropertyOption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import static org.junit.Assert.*;

public class WriteableCommandLineImplTest {

    private WriteableCommandLineImpl commandLine;
    private Option rootOption;
    private Option argOption;
    private Option switchOption;
    private Option propOption;
    private List<String> args;

    @Before
    public void setUp() {
        rootOption = new Option() {
            @Override
            public Set getPrefixes() {
                return Collections.singleton("-");
            }

            @Override
            public String getPreferredName() {
                return "root";
            }

            @Override
            public java.util.Set getTriggers() {
                return Collections.singleton("root");
            }
        };
        argOption = new Argument() {
            @Override
            public String getPreferredName() {
                return "arg";
            }

            @Override
            public java.util.Set getTriggers() {
                return Collections.singleton("arg");
            }
        };
        switchOption = new Option() {
            @Override
            public String getPreferredName() {
                return "sw";
            }

            @Override
            public java.util.Set getTriggers() {
                return Collections.singleton("sw");
            }
        };
        propOption = new Option() {
            @Override
            public String getPreferredName() {
                return "prop";
            }

            @Override
            public java.util.Set getTriggers() {
                return Collections.singleton("prop");
            }
        };
        args = new ArrayList<>(Arrays.asList("-a", "10", "-b", "20"));
        commandLine = new WriteableCommandLineImpl(rootOption, args);
    }

    @After
    public void tearDown() {
        commandLine = null;
    }

    @Test
    public void testAddOptionAndHasOption() {
        assertFalse(commandLine.hasOption(argOption));
        commandLine.addOption(argOption);
        assertTrue(commandLine.hasOption(argOption));
        assertTrue(commandLine.getOptions().contains(argOption));
    }

    @Test
    public void testAddValueWithArgument() {
        commandLine.addValue(argOption, "value1");
        commandLine.addValue(argOption, "value2");
        List values = commandLine.getValues(argOption, null);
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertTrue(commandLine.hasOption(argOption));
    }

    @Test
    public void testGetValuesWithNoValues() {
        List defaults = Arrays.asList("d1", "d2");
        List result = commandLine.getValues(argOption, defaults);
        assertEquals(defaults, result);
    }

    @Test
    public void testGetValuesWithEmptyDefaults() {
        List result = commandLine.getValues(argOption, null);
        assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void testGetUndefaultedValuesEmpty() {
        assertEquals(Collections.EMPTY_LIST, commandLine.getUndefaultedValues(argOption));
    }

    @Test
    public void testGetUndefaultedValuesWithValues() {
        commandLine.addValue(argOption, "v1");
        commandLine.addValue(argOption, "v2");
        List result = commandLine.getUndefaultedValues(argOption);
        assertEquals(2, result.size());
        assertEquals("v1", result.get(0));
        assertEquals("v2", result.get(1));
    }

    @Test
    public void testAddSwitch() {
        commandLine.addSwitch(switchOption, true);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOption, Boolean.FALSE));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitchDuplicateThrows() {
        commandLine.addSwitch(switchOption, true);
        commandLine.addSwitch(switchOption, false);
    }

    @Test
    public void testGetSwitchWithDefault() {
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOption, Boolean.TRUE));
        assertEquals(Boolean.FALSE, commandLine.getSwitch(switchOption, Boolean.FALSE));
    }

    @Test
    public void testGetSwitchFromDefaultSwitches() {
        commandLine.setDefaultSwitch(switchOption, Boolean.TRUE);
        assertEquals(Boolean.TRUE, commandLine.getSwitch(switchOption, null));
    }

    @Test
    public void testGetSwitchNull() {
        assertNull(commandLine.getSwitch(switchOption, null));
    }

    @Test
    public void testGetPropertyDefault() {
        assertEquals("def", commandLine.getProperty("myprop", "def"));
    }

    @Test
    public void testAddAndGetProperty() {
        commandLine.addProperty("key1", "value1");
        assertEquals("value1", commandLine.getProperty("key1"));
    }

    @Test
    public void testAddPropertyWithOption() {
        commandLine.addProperty(propOption, "key", "val");
        assertEquals("val", commandLine.getProperty(propOption, "key", "default"));
    }

    @Test
    public void testGetPropertyWithOptionDefault() {
        assertEquals("defVal", commandLine.getProperty(propOption, "missing", "defVal"));
    }

    @Test
    public void testGetPropertiesEmpty() {
        Set props = commandLine.getProperties(propOption);
        assertNotNull(props);
        assertEquals(0, props.size());
    }

    @Test
    public void testGetPropertiesWithValues() {
        commandLine.addProperty(propOption, "k1", "v1");
        commandLine.addProperty(propOption, "k2", "v2");
        Set keys = commandLine.getProperties(propOption);
        assertEquals(2, keys.size());
        assertTrue(keys.contains("k1"));
        assertTrue(keys.contains("k2"));
    }

    @Test
    public void testGetPropertiesDefaultOption() {
        commandLine.addProperty("k", "v");
        Set keys = commandLine.getProperties();
        assertNotNull(keys);
        assertTrue(keys.size() > 0);
    }

    @Test
    public void testLooksLikeOptionTrue() {
        assertTrue(commandLine.looksLikeOption("-x"));
    }

    @Test
    public void testLooksLikeOptionFalse() {
        assertFalse(commandLine.looksLikeOption("x"));
    }

    @Test
    public void testToString() {
        assertEquals("-a 10 -b 20", commandLine.toString());
    }

    @Test
    public void testToStringWithQuote() {
        List<String> newArgs = new ArrayList<>(Arrays.asList("-a", "hello world", "-b", "20"));
        WriteableCommandLineImpl cmd = new WriteableCommandLineImpl(rootOption, newArgs);
        assertEquals("\"-a\" \"hello world\" \"-b\" \"20\"", cmd.toString());
    }

    @Test
    public void testGetOptionsUnmodifiable() {
        commandLine.addOption(argOption);
        List opts = commandLine.getOptions();
        try {
            opts.add(argOption);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testGetOptionTriggers() {
        commandLine.addOption(argOption);
        Set triggers = commandLine.getOptionTriggers();
        assertNotNull(triggers);
        assertTrue(triggers.contains("arg"));
    }

    @Test
    public void testGetOption() {
        commandLine.addOption(argOption);
        assertNotNull(commandLine.getOption("arg"));
        assertNull(commandLine.getOption("nonexistent"));
    }

    @Test
    public void testSetDefaultValuesNull() {
        commandLine.setDefaultValues(argOption, null);
        List result = commandLine.getValues(argOption, null);
        assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void testSetDefaultValuesNonNull() {
        List defaults = Arrays.asList("d1", "d2");
        commandLine.setDefaultValues(argOption, defaults);
        assertEquals(defaults, commandLine.getValues(argOption, null));
    }

    @Test
    public void testSetDefaultSwitchNull() {
        commandLine.setDefaultSwitch(switchOption, null);
        assertNull(commandLine.getSwitch(switchOption, null));
    }

    @Test
    public void testGetNormalised() {
        assertEquals(args, commandLine.getNormalised());
    }

    @Test
    public void testGetValuesUsesDefaultValuesFromMap() {
        List defaults = Arrays.asList("mapDefault1", "mapDefault2");
        commandLine.setDefaultValues(argOption, defaults);
        List result = commandLine.getValues(argOption, null);
        assertEquals(defaults, result);
    }
}