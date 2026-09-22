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
        assertEquals("arg", formatter.getArgName());
        assertNotNull(formatter.getNewLine());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(5);
        formatter.setDescPadding(7);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setOptPrefix("/");
        formatter.setLongOptPrefix("//");
        formatter.setArgName("file");
        formatter.setNewLine("\r\n");

        assertEquals(100, formatter.getWidth());
        assertEquals(5, formatter.getLeftPadding());
        assertEquals(7, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("/", formatter.getOptPrefix());
        assertEquals("//", formatter.getLongOptPrefix());
        assertEquals("file", formatter.getArgName());
        assertEquals("\r\n", formatter.getNewLine());
    }

    @Test
    public void testSetOptionComparatorNull() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testFindWrapPosNoWrap() {
        assertEquals(-1, formatter.findWrapPos("short text", 100, 0));
    }

    @Test
    public void testFindWrapPosExactWidth() {
        String text = "0123456789";
        assertEquals(-1, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosSpaceAtWidth() {
        String text = "hello world test";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0 && pos < text.length());
    }

    @Test
    public void testFindWrapPosNewline() {
        String text = "line1\nline2";
        assertEquals(6, formatter.findWrapPos(text, 10, 0));
    }

    @Test
    public void testFindWrapPosNoSpaceLongWord() {
        String text = "abcdefghij";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testCreatePadding() {
        assertEquals("   ", formatter.createPadding(3));
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testCreatePaddingNegative() {
        assertEquals("", formatter.createPadding(-5));
    }

    @Test
    public void testRtrimNull() {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testRtrimEmpty() {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void testRtrimTrailingSpaces() {
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    @Test
    public void testRtrimNoTrailingSpaces() {
        assertEquals("hello", formatter.rtrim("hello"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpNullCmdLineSyntax() {
        Options options = new Options();
        formatter.printHelp(printWriter, formatter.defaultWidth, null, null, options, 1, 3, null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpEmptyCmdLineSyntax() {
        Options options = new Options();
        formatter.printHelp(printWriter, formatter.defaultWidth, "", null, options, 1, 3, null, false);
    }

    @Test
    public void testPrintHelpBasic() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option");

        formatter.printHelp(printWriter, 80, "cmd", null, options, 1, 3, null, false);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("cmd"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("--alpha"));
        assertTrue(output.contains("--beta"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "desc");

        formatter.printHelp(printWriter, 80, "cmd", "HEADER", options, "FOOTER", false);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("HEADER"));
        assertTrue(output.contains("FOOTER"));
    }

    @Test
    public void testPrintHelpAutoUsage() {
        Options options = new Options();
        options.addOption("a", "alpha", false, "desc");

        formatter.printHelp(printWriter, 80, "cmd", null, options, 1, 3, null, true);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("cmd"));
        assertTrue(output.contains("-a"));
    }

    @Test
    public void testPrintUsageWithOptions() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.addOption(Option.builder("a").longOpt("alpha").build());
        group.addOption(Option.builder("b").longOpt("beta").build());
        options.addOptionGroup(group);
        options.addOption("c", "gamma", true, "Gamma desc");

        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("app"));
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
        assertTrue(output.contains("-c"));
    }

    @Test
    public void testPrintUsageWithRequiredGroup() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(Option.builder("a").build());
        group.addOption(Option.builder("b").build());
        options.addOptionGroup(group);

        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("app"));
        assertTrue(output.contains("[-a | -b]"));
    }

    @Test
    public void testPrintUsageSimple() {
        formatter.printUsage(printWriter, 80, "cmdName");
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("cmdName"));
    }

    @Test
    public void testPrintWrapped() {
        formatter.printWrapped(printWriter, 20, 0, "This is a long text that should wrap");
        printWriter.flush();
        assertTrue(stringWriter.toString().contains("This is a long"));
    }

    @Test
    public void testPrintWrappedWithIndent() {
        formatter.printWrapped(printWriter, 20, 5, "This is a long text that should wrap");
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("This is a long"));
    }

    @Test
    public void testPrintOptionsWithLongOptAndArg() {
        Options options = new Options();
        options.addOption(Option.builder("v").longOpt("verbose").hasArg().argName("level").desc("Verbosity level").build());

        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("--verbose"));
        assertTrue(output.contains("<level>"));
        assertTrue(output.contains("Verbosity level"));
    }

    @Test
    public void testPrintOptionsNoOptOnlyLong() {
        Options options = new Options();
        options.addOption(Option.builder().longOpt("version").desc("Version info").build());

        formatter.printOptions(printWriter, 80, options, 1, 3);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.contains("--version"));
        assertTrue(output.contains("Version info"));
    }

    @Test
    public void testOptionComparatorCustom() {
        HelpFormatter.OptionComparator comparator = new HelpFormatter.OptionComparator();
        Option opt1 = new Option("b", "beta", false, "desc");
        Option opt2 = new Option("a", "alpha", false, "desc");
        assertTrue(comparator.compare(opt1, opt2) > 0);
        assertTrue(comparator.compare(opt2, opt1) < 0);
        assertEquals(0, comparator.compare(opt1, opt1));
    }

    @Test
    public void testRenderWrappedTextWithOverflow() {
        Options options = new Options();
        Option opt = Option.builder("x").hasArg().desc("A very very long description that keeps going and going and going to test wrapping").build();
        options.addOption(opt);

        formatter.printOptions(printWriter, 40, options, 1, 3);
        printWriter.flush();
        String output = stringWriter.toString();

        assertTrue(output.length() > 0);
    }
}