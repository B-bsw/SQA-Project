package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HelpFormatterTest {
    private HelpFormatter formatter;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
    }

    @After
    public void tearDown() {
        formatter = null;
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
        assertNotNull(formatter.getNewLine());
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(5);
        formatter.setDescPadding(10);
        formatter.setSyntaxPrefix("Usage: ");
        formatter.setNewLine("\n");
        formatter.setOptPrefix("-");
        formatter.setLongOptPrefix("--");
        formatter.setLongOptSeparator("=");
        formatter.setArgName("value");

        assertEquals(100, formatter.getWidth());
        assertEquals(5, formatter.getLeftPadding());
        assertEquals(10, formatter.getDescPadding());
        assertEquals("Usage: ", formatter.getSyntaxPrefix());
        assertEquals("\n", formatter.getNewLine());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("=", formatter.getLongOptSeparator());
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testSetOptionComparatorWithNull() {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testPrintHelpIllegalArgumentException() {
        PrintWriter pw = new PrintWriter(new StringWriter());
        try {
            formatter.printHelp(pw, 80, null, null, new Options(), 1, 3, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpEmptyCmdLineSyntax() {
        PrintWriter pw = new PrintWriter(new StringWriter());
        try {
            formatter.printHelp(pw, 80, "", null, new Options(), 1, 3, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintUsage() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("a", "alpha", false, "Alpha option");
        options.addOption(opt);

        formatter.printUsage(pw, 80, "testApp", options);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("usage: testApp"));
        assertTrue(output.contains("-a"));
    }

    @Test
    public void testPrintOptionsWithRequiredAndArg() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option req = OptionBuilder.isRequired().withLongOpt("required").hasArg().create('r');
        options.addOption(req);

        formatter.printOptions(pw, 80, options, 2, 3);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("-r"));
        assertTrue(output.contains("--required"));
        assertTrue(output.contains("<arg>"));
    }

    @Test
    public void testPrintOptionsWithOptionalGroup() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option opt1 = new Option("a", "alpha", false, "Alpha");
        Option opt2 = new Option("b", "beta", false, "Beta");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("-a"));
        assertTrue(output.contains("-b"));
    }

    @Test
    public void testPrintWrappedNullText() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 80, 0, null);
        pw.flush();
        assertEquals("null", sw.toString());
    }

    @Test
    public void testPrintWrappedEmptyText() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 80, 0, "");
        pw.flush();
        assertEquals("", sw.toString());
    }

    @Test
    public void testPrintWrappedShortText() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 80, 0, "short text");
        pw.flush();
        assertEquals("short text", sw.toString());
    }

    @Test
    public void testRenderWrappedTextNoWrapNeeded() {
        StringBuffer sb = new StringBuffer();
        String result = formatter.renderWrappedText(sb, 80, 2, "short text").toString();
        assertEquals("short text", result);
    }

    @Test
    public void testRenderWrappedTextWithWrap() {
        StringBuffer sb = new StringBuffer();
        String text = "This is a long piece of text that should wrap at a word boundary";
        String result = formatter.renderWrappedText(sb, 20, 2, text).toString();
        assertTrue(result.contains("\n"));
    }

    @Test
    public void testRenderWrappedTextExactWidth() {
        StringBuffer sb = new StringBuffer();
        String text = "1234567890123456789012345";
        String result = formatter.renderWrappedText(sb, 10, 2, text).toString();
        assertTrue(result.contains("\n"));
    }

    @Test
    public void testCreatePadding() {
        assertEquals("", formatter.createPadding(0));
        assertEquals(" ", formatter.createPadding(1));
        assertEquals("  ", formatter.createPadding(2));
        assertEquals("     ", formatter.createPadding(5));
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
    public void testRtrimWhitespaceOnly() {
        assertEquals("", formatter.rtrim("   "));
    }

    @Test
    public void testRtrimNoWhitespace() {
        assertEquals("hello", formatter.rtrim("hello"));
    }

    @Test
    public void testRtrimTrailingWhitespace() {
        assertEquals("hello", formatter.rtrim("hello   "));
    }

    @Test
    public void testFindWrapPosNewlineAtStart() {
        String text = "hello\nworld";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPosTabAtStart() {
        String text = "hello\tworld";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(6, pos);
    }

    @Test
    public void testFindWrapPosTextShorterThanWidth() {
        String text = "short";
        int pos = formatter.findWrapPos(text, 80, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosExactWidth() {
        String text = "1234567890";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosLongWordNoSpaces() {
        String text = "abcdefghijklmnopqrstuvwxyz";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos > 0);
    }

    @Test
    public void testPrintHelpWithHeaderFooter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("h", "help", false, "Show help");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "testApp", "Header text", options, 1, 3, "Footer text");
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("Header text"));
        assertTrue(output.contains("Footer text"));
        assertTrue(output.contains("-h"));
        assertTrue(output.contains("--help"));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("a", "all", false, "All items");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "testApp", null, options, 1, 3, null, true);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("testApp"));
    }

    @Test
    public void testPrintHelpWithOptionGroupAndAutoUsage() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option opt1 = new Option("a", "alpha", false, "Alpha");
        Option opt2 = new Option("b", "beta", true, "Beta");
        group.addOption(opt1);
        group.addOption(opt2);
        options.addOptionGroup(group);

        formatter.printHelp(pw, 80, "testApp", null, options, 1, 3, null, true);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("testApp"));
    }

    @Test
    public void testPrintHelpWithLongOptionOnly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option(null, "long-only", true, "Long only option");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "testApp", null, options, 1, 3, null);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("--long-only"));
    }

    @Test
    public void testPrintHelpWithArgWithoutName() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        Option opt = new Option("f", "file", true, "File option");
        opt.setArgName("");
        options.addOption(opt);

        formatter.printHelp(pw, 80, "testApp", null, options, 1, 3, null);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("-f"));
        assertTrue(output.contains("--file"));
    }

    @Test
    public void testSetWidth() {
        formatter.setWidth(100);
        assertEquals(100, formatter.defaultWidth);
    }

    @Test
    public void testSetLeftPadding() {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.defaultLeftPad);
    }

    @Test
    public void testSetDescPadding() {
        formatter.setDescPadding(7);
        assertEquals(7, formatter.defaultDescPad);
    }

    @Test
    public void testOptionComparator() {
        OptionComparator comparator = new OptionComparator();
        Option opt1 = new Option("b", "bravo", false, "Bravo");
        Option opt2 = new Option("a", "alpha", false, "Alpha");
        assertTrue(comparator.compare(opt1, opt2) > 0);
        assertEquals(0, comparator.compare(opt1, opt1));
        assertTrue(comparator.compare(opt2, opt1) < 0);
    }
}