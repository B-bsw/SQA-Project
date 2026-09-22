package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.*;

public class HelpFormatterTest {
    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;
    private Options options;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
        options = new Options();
    }

    @After
    public void tearDown() {
        printWriter.close();
    }

    @Test
    public void testDefaultValues() {
        assertEquals(74, formatter.getWidth());
        assertEquals(1, formatter.getLeftPadding());
        assertEquals(3, formatter.getDescPadding());
        assertEquals("usage: ", formatter.getSyntaxPrefix());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("arg", formatter.getArgName());
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptPrefix("-opt-");
        formatter.setLongOptPrefix("--long-");
        formatter.setArgName("param");
        formatter.setNewLine("\n");
        formatter.setOptionComparator(null);
        formatter.setOptionComparator(new org.apache.commons.cli.HelpFormatter.OptionComparator());
        
        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("-opt-", formatter.getOptPrefix());
        assertEquals("--long-", formatter.getLongOptPrefix());
        assertEquals("param", formatter.getArgName());
        assertEquals("\n", formatter.getNewLine());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullReplaces() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelpWithNullCmdLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, null, "", options, 1, 3, "", false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpWithEmptyCmdLineSyntax() {
        try {
            formatter.printHelp(printWriter, 80, "", "", options, 1, 3, "", false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpNormalCase() {
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        
        formatter.printHelp(printWriter, 80, "app", "Header", options, 2, 4, "Footer", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("Header"));
        assertTrue(output.contains("Footer"));
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("-b,--beta"));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Option req1 = Option.builder("r").required().hasArg().build();
        Option req2 = Option.builder("s").required().build();
        options.addOption(req1);
        options.addOption(req2);
        
        formatter.printHelp(printWriter, 80, "app", "", options, 1, 3, "", true);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("usage: app -r"));
        assertTrue(output.contains("-s"));
    }

    @Test
    public void testPrintHelpWithLongOptionsOnly() {
        Option longOnly = Option.builder().longOpt("long-only").hasArg().argName("file").build();
        options.addOption(longOnly);
        
        formatter.printHelp(printWriter, 80, "app", null, options, 1, 3, null, false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("--long-only"));
        assertTrue(output.contains("<file>"));
    }

    @Test
    public void testPrintHelpWithOptionGroup() {
        OptionGroup group = new OptionGroup();
        group.addOption(Option.builder("a").build());
        group.addOption(Option.builder("b").build());
        group.setRequired(true);
        options.addOptionGroup(group);
        options.addOption("c", "charlie", false, "Charlie");
        
        formatter.printHelp(printWriter, 80, "app", null, options, 1, 3, null, false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-a | -b"));
    }

    @Test
    public void testPrintUsageWithGroups() {
        OptionGroup reqGroup = new OptionGroup();
        reqGroup.setRequired(true);
        reqGroup.addOption(Option.builder("a").build());
        reqGroup.addOption(Option.builder("b").build());
        options.addOptionGroup(reqGroup);
        options.addOption("c", "charlie", true, "Charlie");
        
        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-a | -b"));
        assertTrue(output.contains("-c"));
    }

    @Test
    public void testPrintUsageSimple() {
        formatter.printUsage(printWriter, 80, "app");
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("usage: app"));
    }

    @Test
    public void testPrintUsageWithOnlyArgs() {
        options.addOption("a", "alpha", true, "Alpha");
        options.addOption("b", "beta", true, "Beta");
        
        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("usage: app -a <arg> -b <arg>"));
    }

    @Test
    public void testPrintOptions() {
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");
        
        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("-b,--beta"));
        assertTrue(output.contains("Alpha option"));
        assertTrue(output.contains("Beta option"));
    }

    @Test
    public void testPrintOptionsWithNullDescription() {
        options.addOption("a", "alpha", false, null);
        options.addOption("b", null, true, null);
        
        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-a,--alpha"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintWrappedSimple() {
        formatter.printWrapped(printWriter, 20, "This is a test string that exceeds the width");
        printWriter.flush();
        String output = stringWriter.toString();
        
        String[] lines = output.split(System.getProperty("line.separator"));
        for (String line : lines) {
            assertTrue(line.length() <= 20);
        }
    }

    @Test
    public void testPrintWrappedWithTabStop() {
        formatter.printWrapped(printWriter, 20, 5, "This is a test string");
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertNotNull(output);
        assertFalse(output.isEmpty());
    }

    @Test
    public void testRenderWrappedTextWithPadding() {
        StringBuffer sb = new StringBuffer();
        String result = formatter.renderWrappedText(sb, 10, 2, "text").toString();
        
        assertTrue(result.contains("text"));
    }

    @Test
    public void testFindWrapPosWithNewline() {
        formatter.setNewLine("\n");
        int pos = formatter.findWrapPos("hello\nworld", 10, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPosWithTab() {
        int pos = formatter.findWrapPos("hello\tworld", 10, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPosAtEnd() {
        int pos = formatter.findWrapPos("hello world", 20, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testCreatePadding() {
        String padding = formatter.createPadding(5);
        assertEquals("     ", padding);
    }

    @Test
    public void testRtrimWithNull() {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testRtrimWithEmptyString() {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRtrimWithTrailingSpaces() {
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    @Test
    public void testOptionComparator() {
        Option opt1 = Option.builder("b").build();
        Option opt2 = Option.builder("a").build();
        HelpFormatter.OptionComparator comparator = new HelpFormatter.OptionComparator();
        
        assertTrue(comparator.compare(opt1, opt2) > 0);
        assertEquals(0, comparator.compare(opt1, opt1));
        assertTrue(comparator.compare(opt2, opt1) < 0);
    }

    @Test
    public void testPrintHelpNoOptions() {
        formatter.printHelp(printWriter, 80, "app", "header", options, 1, 3, "footer", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("header"));
        assertTrue(output.contains("footer"));
    }

    @Test
    public void testPrintHelpWithHeaderOnly() {
        options.addOption("a", "alpha", false, "Alpha");
        formatter.printHelp(printWriter, 80, "app", "Header only", options, 1, 3, null, false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("Header only"));
        assertFalse(output.contains("Footer"));
    }

    @Test
    public void testPrintHelpWithFooterOnly() {
        options.addOption("a", "alpha", false, "Alpha");
        formatter.printHelp(printWriter, 80, "app", null, options, 1, 3, "Footer only", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertFalse(output.contains("Header"));
        assertTrue(output.contains("Footer only"));
    }

    @Test
    public void testPrintHelpWithArgNames() {
        Option opt = Option.builder("o").hasArg().argName("output").desc("Output file").build();
        options.addOption(opt);
        
        formatter.printHelp(printWriter, 80, "app", "", options, 1, 3, "", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("<output>"));
    }

    @Test
    public void testPrintHelpWithRequiredOptions() {
        Option req = Option.builder("r").required().hasArg().argName("file").desc("Required").build();
        options.addOption(req);
        
        formatter.printHelp(printWriter, 80, "app", "", options, 1, 3, "", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-r <file>"));
    }

    @Test
    public void testPrintHelpWithNonRequiredOptions() {
        Option opt = Option.builder("o").hasArg().argName("file").desc("Optional").build();
        options.addOption(opt);
        
        formatter.printHelp(printWriter, 80, "app", "", options, 1, 3, "", false);
        printWriter.flush();
        String output = stringWriter.toString();
        
        assertTrue(output.contains("-o <file>"));
    }
}