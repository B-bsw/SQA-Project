package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HelpFormatterTest {
    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
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
        assertEquals(" ", formatter.getLongOptSeparator());
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
        assertNotNull(formatter.getNewLine());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(5);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setNewLine("\r\n");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("//");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("value");
        formatter.setOptionComparator(null);

        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(5, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("\r\n", formatter.getNewLine());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("//", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("value", formatter.getArgName());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullCmdLineSyntax() {
        formatter.printHelp(null, new Options(), false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptyCmdLineSyntax() {
        formatter.printHelp("", new Options(), false);
    }

    @Test
    public void testPrintUsage() {
        Options options = new Options();
        Option opt = new Option("a", "alpha", true, "alpha option");
        opt.setArgName("file");
        options.addOption(opt);

        formatter.printUsage(printWriter, 80, "app");
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: app"));
        assertTrue(result.contains("-a,--alpha <file>"));
    }

    @Test
    public void testPrintHelpWithHeaderFooter() {
        Options options = new Options();
        options.addOption("b", "beta", false, "beta option");

        formatter.printHelp(printWriter, 80, "cmd", "Header", options, 1, 3, "Footer", false);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("Header"));
        assertTrue(result.contains("Footer"));
        assertTrue(result.contains("-b,--beta"));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        options.addOption("x", "xyz", true, "xyz option");
        Option requiredOpt = new Option("r", "required", false, "required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("-x,--xyz <arg>"));
        assertTrue(result.contains("-r,--required"));
    }

    @Test
    public void testPrintWrappedText() {
        formatter.printWrapped(printWriter, 20, "This is a long text that should wrap");
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.length() > 0);
        assertTrue(result.contains("This"));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("   ", formatter.createPadding(3));
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        assertEquals("hello", formatter.rtrim("hello   "));
        assertEquals("hello", formatter.rtrim("hello"));
        assertEquals("", formatter.rtrim("   "));
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testFindWrapPos() {
        assertEquals(-1, formatter.findWrapPos("short", 20, 0));
        String longText = "This is a very long text for wrapping test";
        assertTrue(formatter.findWrapPos(longText, 10, 0) != -1);
        assertEquals(-1, formatter.findWrapPos("", 10, 0));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");
        options.addOption("b", "beta", false, "beta option");

        formatter.printHelp(printWriter, 80, "cmd", null, options, 1, 3, null, true);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: cmd"));
        assertTrue(result.contains("[-a <arg>] [-b]"));
    }

    @Test
    public void testPrintHelpWithoutAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", true, "alpha option");

        formatter.printHelp(printWriter, 80, "cmd", null, options, 1, 3, null, false);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("usage: cmd -a <arg>"));
    }

    @Test
    public void testRenderOptionsWithLongOnlyOption() {
        Options options = new Options();
        Option opt = new Option(null, "longonly", true, "long only option");
        opt.setArgName("value");
        options.addOption(opt);

        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("--longonly"));
        assertTrue(result.contains("<value>"));
    }

    @Test
    public void testRenderOptionsWithGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "alpha option");
        Option opt2 = new Option("b", "beta", false, "beta option");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String result = stringWriter.toString();
        assertTrue(result.contains("["));
        assertTrue(result.contains("|"));
        assertTrue(result.contains("]"));
    }

    @Test
    public void testRenderWrappedTextNullText() {
        assertEquals("", formatter.rtrim(null));
    }
}