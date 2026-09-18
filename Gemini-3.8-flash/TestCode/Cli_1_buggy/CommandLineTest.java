package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class CommandLineTest {

    private CommandLine commandLine;

    private static int optionIdCounter = 1;

    private static class MockOption extends Option {
        private String key;
        private String longOpt;
        private String[] values;
        private Object type;
        private int fixedHashCode;

        public MockOption(String opt, String longOpt) {
            super(opt != null ? opt : (longOpt != null ? longOpt : "defaultOpt"), "Mock Option Description");
            this.key = opt;
            this.longOpt = longOpt;
            this.fixedHashCode = optionIdCounter++;
        }

        public String getKey() {
            return this.key;
        }

        public String getLongOpt() {
            return this.longOpt;
        }

        public String[] getValues() {
            return this.values;
        }

        public void setValues(String[] values) {
            this.values = values;
        }

        public Object getType() {
            return this.type;
        }

        public void setType(Object type) {
            this.type = type;
        }

        public int hashCode() {
            return this.fixedHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Option)) {
                return false;
            }
            Option other = (Option) obj;
            String thisKey = getKey();
            String otherKey = other.getKey();
            return (thisKey == null ? otherKey == null : thisKey.equals(otherKey));
        }
    }

    @Before
    public void setUp() {
        commandLine = new CommandLine();
    }

    @Test
    public void hasOption_givenExistingShortOption_shouldReturnTrue() {
        // Arrange
        MockOption opt = new MockOption("a", "alpha");
        commandLine.addOption(opt);

        // Act
        boolean result = commandLine.hasOption("a");

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void hasOption_givenNonExistingOption_shouldReturnFalse() {
        // Arrange
        MockOption opt = new MockOption("a", "alpha");
        commandLine.addOption(opt);

        // Act
        boolean result = commandLine.hasOption("b");

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void hasOption_givenExistingCharOption_shouldReturnTrue() {
        // Arrange
        MockOption opt = new MockOption("c", null);
        commandLine.addOption(opt);

        // Act
        boolean result = commandLine.hasOption('c');

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void hasOption_givenNonExistingCharOption_shouldReturnFalse() {
        // Arrange
        MockOption opt = new MockOption("c", null);
        commandLine.addOption(opt);

        // Act
        boolean result = commandLine.hasOption('z');

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void addOption_givenOptionWithNullKey_shouldUseLongOptAsKey() {
        // Arrange
        MockOption opt = new MockOption(null, "verbose");
        commandLine.addOption(opt);

        // Act & Assert
        Assert.assertTrue(commandLine.hasOption("verbose"));
    }

    @Test
    public void addOption_givenOptionWithNonNullKey_shouldStoreInNamesMap() {
        // Arrange
        MockOption opt = new MockOption("v", "verbose");
        opt.setValues(new String[]{"true"});
        commandLine.addOption(opt);

        // Act
        String[] valuesFromLongOpt = commandLine.getOptionValues("verbose");
        String[] valuesFromPrefixedLongOpt = commandLine.getOptionValues("--verbose");

        // Assert
        Assert.assertNotNull(valuesFromLongOpt);
        Assert.assertEquals("true", valuesFromLongOpt[0]);
        Assert.assertNotNull(valuesFromPrefixedLongOpt);
        Assert.assertEquals("true", valuesFromPrefixedLongOpt[0]);
    }

    @Test
    public void getOptionValues_givenNonExistingOption_shouldReturnNull() {
        // Act
        String[] values = commandLine.getOptionValues("unknown");

        // Assert
        Assert.assertNull(values);
    }

    @Test
    public void getOptionValues_givenOptionKeyWithSingleHyphenPrefix_shouldStripAndReturnValues() {
        // Arrange
        MockOption opt = new MockOption("f", "file");
        opt.setValues(new String[]{"test.txt"});
        commandLine.addOption(opt);

        // Act
        String[] values = commandLine.getOptionValues("-f");

        // Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(1, values.length);
        Assert.assertEquals("test.txt", values[0]);
    }

    @Test
    public void getOptionValues_givenOptionWithNoValues_shouldReturnNull() {
        // Arrange
        MockOption opt = new MockOption("n", "none");
        opt.setValues(null);
        commandLine.addOption(opt);

        // Act
        String[] values = commandLine.getOptionValues("n");

        // Assert
        Assert.assertNull(values);
    }

    @Test
    public void getOptionValues_givenCharOption_shouldReturnValues() {
        // Arrange
        MockOption opt = new MockOption("m", null);
        opt.setValues(new String[]{"val1", "val2"});
        commandLine.addOption(opt);

        // Act
        String[] values = commandLine.getOptionValues('m');

        // Assert
        Assert.assertNotNull(values);
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("val1", values[0]);
        Assert.assertEquals("val2", values[1]);
    }

    @Test
    public void getOptionValue_givenOptionWithMultipleValues_shouldReturnFirstValue() {
        // Arrange
        MockOption opt = new MockOption("p", "port");
        opt.setValues(new String[]{"8080", "8443"});
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue("p");

        // Assert
        Assert.assertEquals("8080", val);
    }

    @Test
    public void getOptionValue_givenOptionWithNullValues_shouldReturnNull() {
        // Arrange
        MockOption opt = new MockOption("p", "port");
        opt.setValues(null);
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue("p");

        // Assert
        Assert.assertNull(val);
    }

    @Test
    public void getOptionValue_givenNonExistingOption_shouldReturnNull() {
        // Act
        String val = commandLine.getOptionValue("not-found");

        // Assert
        Assert.assertNull(val);
    }

    @Test
    public void getOptionValue_givenCharOption_shouldReturnFirstValue() {
        // Arrange
        MockOption opt = new MockOption("s", null);
        opt.setValues(new String[]{"singleValue"});
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue('s');

        // Assert
        Assert.assertEquals("singleValue", val);
    }

    @Test
    public void getOptionValue_withDefault_givenExistingOptionWithValue_shouldReturnActualValue() {
        // Arrange
        MockOption opt = new MockOption("e", "env");
        opt.setValues(new String[]{"production"});
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue("e", "development");

        // Assert
        Assert.assertEquals("production", val);
    }

    @Test
    public void getOptionValue_withDefault_givenNonExistingOption_shouldReturnDefaultValue() {
        // Act
        String val = commandLine.getOptionValue("non-existing", "defaultValue");

        // Assert
        Assert.assertEquals("defaultValue", val);
    }

    @Test
    public void getOptionValue_withDefault_givenOptionWithNullValue_shouldReturnDefaultValue() {
        // Arrange
        MockOption opt = new MockOption("e", "env");
        opt.setValues(null);
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue("e", "fallback");

        // Assert
        Assert.assertEquals("fallback", val);
    }

    @Test
    public void getOptionValue_withDefaultChar_givenExistingOption_shouldReturnValue() {
        // Arrange
        MockOption opt = new MockOption("u", null);
        opt.setValues(new String[]{"admin"});
        commandLine.addOption(opt);

        // Act
        String val = commandLine.getOptionValue('u', "guest");

        // Assert
        Assert.assertEquals("admin", val);
    }

    @Test
    public void getOptionValue_withDefaultChar_givenNonExistingOption_shouldReturnDefaultValue() {
        // Act
        String val = commandLine.getOptionValue('x', "defaultChar");

        // Assert
        Assert.assertEquals("defaultChar", val);
    }

    @Test
    public void getOptionObject_givenOptionNotInOptionsMap_shouldReturnNull() {
        // Arrange
        MockOption opt = new MockOption("k", "key");
        opt.setValues(new String[]{"value"});
        commandLine.addOption(opt);

        // Act
        Object result = commandLine.getOptionObject("differentKey");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void getOptionObject_givenOptionInOptionsMapButNullValue_shouldReturnNull() {
        // Arrange
        MockOption opt = new MockOption("k", "key");
        opt.setValues(null);
        opt.setType(String.class);
        commandLine.addOption(opt);

        // Act
        Object result = commandLine.getOptionObject("k");

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void getOptionObject_givenOptionInOptionsMapWithStringValue_shouldReturnParsedObject() {
        // Arrange
        MockOption opt = new MockOption("t", "text");
        opt.setValues(new String[]{"sampleString"});
        opt.setType(PatternOptionBuilder.STRING_VALUE);
        commandLine.addOption(opt);

        // Act
        Object result = commandLine.getOptionObject("t");

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("sampleString", result);
    }

    @Test
    public void getOptionObject_givenCharOption_shouldReturnParsedObject() {
        // Arrange
        MockOption opt = new MockOption("c", null);
        opt.setValues(new String[]{"charObjectTest"});
        opt.setType(PatternOptionBuilder.STRING_VALUE);
        commandLine.addOption(opt);

        // Act
        Object result = commandLine.getOptionObject('c');

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals("charObjectTest", result);
    }

    @Test
    public void getArgs_givenNoArgsAdded_shouldReturnEmptyArray() {
        // Act
        String[] args = commandLine.getArgs();

        // Assert
        Assert.assertNotNull(args);
        Assert.assertEquals(0, args.length);
    }

    @Test
    public void getArgs_givenArgsAdded_shouldReturnAllArgsInOrder() {
        // Arrange
        commandLine.addArg("arg1");
        commandLine.addArg("arg2");
        commandLine.addArg("arg3");

        // Act
        String[] args = commandLine.getArgs();

        // Assert
        Assert.assertNotNull(args);
        Assert.assertEquals(3, args.length);
        Assert.assertEquals("arg1", args[0]);
        Assert.assertEquals("arg2", args[1]);
        Assert.assertEquals("arg3", args[2]);
    }

    @Test
    public void getArgList_givenArgsAdded_shouldReturnUnderlyingList() {
        // Arrange
        commandLine.addArg("first");
        commandLine.addArg("second");

        // Act
        List argList = commandLine.getArgList();

        // Assert
        Assert.assertNotNull(argList);
        Assert.assertEquals(2, argList.size());
        Assert.assertEquals("first", argList.get(0));
        Assert.assertEquals("second", argList.get(1));
    }

    @Test
    public void iterator_givenNoOptionsAdded_shouldReturnEmptyIterator() {
        // Act
        Iterator it = commandLine.iterator();

        // Assert
        Assert.assertNotNull(it);
        Assert.assertFalse(it.hasNext());
    }

    @Test
    public void iterator_givenOptionsAdded_shouldIterateOverAllOptions() {
        // Arrange
        MockOption opt1 = new MockOption("o1", "optOne");
        MockOption opt2 = new MockOption("o2", "optTwo");
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        // Act
        Iterator it = commandLine.iterator();
        int count = 0;
        while (it.hasNext()) {
            Object obj = it.next();
            Assert.assertTrue(obj instanceof Option);
            count++;
        }

        // Assert
        Assert.assertEquals(2, count);
    }

    @Test
    public void getOptions_givenNoOptionsAdded_shouldReturnEmptyArray() {
        // Act
        Option[] options = commandLine.getOptions();

        // Assert
        Assert.assertNotNull(options);
        Assert.assertEquals(0, options.length);
    }

    @Test
    public void getOptions_givenMultipleOptionsAdded_shouldReturnAllOptions() {
        // Arrange
        MockOption opt1 = new MockOption("x", "xray");
        MockOption opt2 = new MockOption("y", "yankee");
        commandLine.addOption(opt1);
        commandLine.addOption(opt2);

        // Act
        Option[] options = commandLine.getOptions();

        // Assert
        Assert.assertNotNull(options);
        Assert.assertEquals(2, options.length);
        boolean containsX = false;
        boolean containsY = false;
        for (int i = 0; i < options.length; i++) {
            if ("x".equals(options[i].getKey())) {
                containsX = true;
            } else if ("y".equals(options[i].getKey())) {
                containsY = true;
            }
        }
        Assert.assertTrue(containsX);
        Assert.assertTrue(containsY);
    }
}