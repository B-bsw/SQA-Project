package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class ParserTest {

    private TestParser parser;
    private Options options;
    private CommandLine cmd;

    @Before
    public void setUp() {
        parser = new TestParser();
        options = new Options();
        cmd = new CommandLine();
    }

    @After
    public void tearDown() {
        parser = null;
        options = null;
        cmd = null;
    }

    // Test parse method with null arguments
    @Test
    public void testParseWithNullArguments() throws ParseException {
        parser.setOptions(options);
        CommandLine result = parser.parse(options, null);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getArgs().length);
    }

    // Test parse with empty arguments
    @Test
    public void testParseWithEmptyArguments() throws ParseException {
        parser.setOptions(options);
        CommandLine result = parser.parse(options, new String[0]);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.getArgs().length);
    }

    // Test parse with normal arguments
    @Test
    public void testParseNormalArguments() throws ParseException {
        Option opt = new Option("a", "apple", false, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        
        CommandLine result = parser.parse(options, new String[]{"-a", "value"});
        Assert.assertNotNull(result);
        Assert.assertTrue(result.hasOption("a"));
    }

    // Test parse with stopAtNonOption = true and non-option argument
    @Test
    public void testParseWithStopAtNonOption() throws ParseException {
        Option opt = new Option("a", "apple", false, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        
        CommandLine result = parser.parse(options, new String[]{"arg1", "-a"}, true);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.getArgs().length);
        Assert.assertEquals("arg1", result.getArgs()[0]);
    }

    // Test parse with double dash token
    @Test
    public void testParseWithDoubleDash() throws ParseException {
        parser.setOptions(options);
        
        CommandLine result = parser.parse(options, new String[]{"--", "arg1", "-a"});
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.getArgs().length);
    }

    // Test parse with single dash token
    @Test
    public void testParseWithSingleDash() throws ParseException {
        parser.setOptions(options);
        
        CommandLine result = parser.parse(options, new String[]{"-"});
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.getArgs().length);
    }

    // Test checkRequiredOptions with required options missing
    @Test
    public void testCheckRequiredOptionsMissing()
    {
        Option opt = new Option("r", "required", true, "Required option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        try {
            parser.callCheckRequiredOptions();
            Assert.fail("Expected MissingOptionException");
        } catch (MissingOptionException e) {
            Assert.assertTrue(e.getMessage().contains("Missing required option"));
        }
    }

    // Test checkRequiredOptions with all required options present
    @Test
    public void testCheckRequiredOptionsPresent() throws MissingOptionException {
        Option opt = new Option("r", "required", true, "Required option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        cmd.addOption(opt);
        
        // Should not throw exception
        parser.callCheckRequiredOptions();
    }

    // Test processArgs with an option that has an argument
    @Test
    public void testProcessArgsWithArgument() throws ParseException {
        Option opt = new Option("a", "apple", true, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        java.util.List list = new java.util.ArrayList();
        list.add("value1");
        java.util.ListIterator iter = list.listIterator();
        
        parser.callProcessArgs(opt, iter);
        Assert.assertArrayEquals(new String[]{"value1"}, opt.getValues());
    }

    // Test processArgs with missing argument for required option
    @Test
    public void testProcessArgsMissingArgument() {
        Option opt = new Option("a", "apple", true, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        java.util.List list = new java.util.ArrayList();
        java.util.ListIterator iter = list.listIterator();
        
        try {
            parser.callProcessArgs(opt, iter);
            Assert.fail("Expected MissingArgumentException");
        } catch (ParseException e) {
            Assert.assertTrue(e instanceof MissingArgumentException);
        }
    }

    // Test processOption with unrecognized option
    @Test
    public void testProcessOptionUnrecognized() {
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        java.util.List list = new java.util.ArrayList();
        java.util.ListIterator iter = list.listIterator();
        
        try {
            parser.callProcessOption("-x", iter);
            Assert.fail("Expected UnrecognizedOptionException");
        } catch (UnrecognizedOptionException e) {
            Assert.assertEquals("Unrecognized option: -x", e.getMessage());
        }
    }

    // Test processOption with recognized required option
    @Test
    public void testProcessOptionRecognized() throws ParseException {
        Option opt = new Option("r", "required", false, "Required option");
        opt.setRequired(true);
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        parser.getRequiredOptions().add(opt.getKey());
        
        java.util.List list = new java.util.ArrayList();
        list.add("value");
        java.util.ListIterator iter = list.listIterator();
        
        parser.callProcessOption("-r", iter);
        Assert.assertTrue(cmd.hasOption("r"));
    }

    // Test processOption with option group
    @Test
    public void testProcessOptionInGroup() throws ParseException {
        Option opt1 = new Option("a", "apple", false, "Apple option");
        Option opt2 = new Option("b", "banana", false, "Banana option");
        
        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        
        options.addOptionGroup(group);
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        java.util.List list = new java.util.ArrayList();
        java.util.ListIterator iter = list.listIterator();
        
        parser.callProcessOption("-a", iter);
        Assert.assertTrue(cmd.hasOption("a"));
    }

    // Test processProperties with null properties
    @Test
    public void testProcessPropertiesNull() {
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        parser.callProcessProperties(null);
        Assert.assertEquals(0, cmd.getOptions().length);
    }

    // Test processProperties with valid properties
    @Test
    public void testProcessPropertiesValid() {
        Option opt = new Option("a", "apple", true, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        parser.setCmd(cmd);
        
        Properties props = new Properties();
        props.setProperty("a", "appleValue");
        
        parser.callProcessProperties(props);
        Assert.assertTrue(cmd.hasOption("a"));
        Assert.assertArrayEquals(new String[]{"appleValue"}, cmd.getOptionValues("a"));
    }

    // Test flatten method
    @Test
    public void testFlatten() {
        parser.setOptions(options);
        
        String[] args = new String[]{"-a", "value", "--", "arg1"};
        String[] result = parser.flatten(options, args, false);
        Assert.assertNotNull(result);
        Assert.assertArrayEquals(args, result);
    }

    // Test parse with properties and stopAtNonOption
    @Test
    public void testParseWithPropertiesAndStopAtNonOption() throws ParseException {
        Option opt = new Option("a", "apple", true, "Apple option");
        options.addOption(opt);
        parser.setOptions(options);
        
        Properties props = new Properties();
        props.setProperty("a", "appleValue");
        
        CommandLine result = parser.parse(options, null, props, true);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.hasOption("a"));
    }

    // Helper test class extending abstract Parser
    private static class TestParser extends Parser {
        
        @Override
        protected String[] flatten(Options opts, String[] arguments, boolean stopAtNonOption) {
            return arguments;
        }
        
        private void setCmd(CommandLine cmd) {
            this.cmd = cmd;
        }
        
        private void callProcessArgs(Option opt, java.util.ListIterator iter) throws ParseException {
            processArgs(opt, iter);
        }
        
        private void callProcessOption(String arg, java.util.ListIterator iter) throws ParseException {
            processOption(arg, iter);
        }
        
        private void callCheckRequiredOptions() throws MissingOptionException {
            checkRequiredOptions();
        }
        
        private void callProcessProperties(Properties properties) {
            processProperties(properties);
        }
    }
}