package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;
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

    @Test
    public void testDefaultValues() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        assertNotNull(formatter.getNewLine());
    }

    @Test
    public void testSettersAndGetters() {
        formatter.setWidth(100);
        formatter.setLeftPadding(2);
        formatter.setDescPadding(4);
        formatter.setSyntaxPrefix("usage2: ");
        formatter.setOptPrefix("-");
        formatter.setLongOptPrefix("--");
        formatter.setArgName("testArg");
        formatter.setNewLine("\n");

        assertEquals(100, formatter.getWidth());
        assertEquals(2, formatter.getLeftPadding());
        assertEquals(4, formatter.getDescPadding());
        assertEquals("usage2: ", formatter.getSyntaxPrefix());
        assertEquals("-", formatter.getOptPrefix());
        assertEquals("--", formatter.getLongOptPrefix());
        assertEquals("testArg", formatter.getArgName());
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testPrintHelpNullCmdLineSyntax() {
        Options options = new Options();
        try {
            formatter.printHelp(printWriter, 74, null, null, options, 1, 3, null, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpEmptyCmdLineSyntax() {
        Options options = new Options();
        try {
            formatter.printHelp(printWriter, 74, "", null, options, 1, 3, null, false);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void testPrintHelpWithAllNullOptionals() {
        Options options = new Options();
        formatter.printHelp(printWriter, 74, "cmd", null, options, 1, 3, null, false);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-h,--help"));
    }

    @Test
    public void testPrintHelpWithAutoUsage() {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file to process");
        options.addOption(opt);
        formatter.printHelp(printWriter, 74, "cmd", null, options, 1, 3, null, true);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("usage: cmd"));
        assertTrue(output.contains("-f <arg>"));
    }

    @Test
    public void testPrintHelpWithHeaderAndFooter() {
        Options options = new Options();
        formatter.printHelp(printWriter, 74, "cmd", "header text", options, 1, 3, "footer text", false);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("header text"));
        assertTrue(output.contains("footer text"));
        assertTrue(output.contains("usage: cmd"));
    }

    @Test
    public void testPrintUsageWithOptions() {
        Options options = new Options();
        Option opt1 = new Option("a", "alpha", true, "alpha option");
        Option opt2 = new Option("b", "beta", false, "beta option");
        OptionGroup group = new OptionGroup();
        group.addOption(opt1);
        group.addOption(opt2);
        group.setRequired(true);
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 74, "app", options);
        pw.flush();
        String output = sw.toString().trim();
        assertTrue(output.contains("usage: app"));
        assertTrue(output.contains("-a <arg> | -b"));
    }

    @Test
    public void testPrintUsageSimple() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 74, "app");
        pw.flush();
        assertEquals("usage: app", sw.toString().trim());
    }

    @Test
    public void testPrintWrapped() {
        String longText = "This is a long text that should wrap at some point";
        formatter.printWrapped(printWriter, 20, longText);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.length() > 0);
        assertTrue(output.contains("This"));
    }

    @Test
    public void testPrintWrappedWithNextLineTab() {
        String longText = "This is a long text that should wrap";
        formatter.printWrapped(printWriter, 20, 4, longText);
        printWriter.flush();
        String output = stringWriter.toString();
        assertTrue(output.length() > 0);
    }

    @Test
    public void testRenderWrappedTextWithNewlines() {
        StringBuffer sb = new StringBuffer();
        String text = "line1\nline2";
        String result = formatter.renderWrappedText(sb, 10, 1, text).toString();
        assertTrue(result.contains("line1"));
        assertTrue(result.contains("line2"));
    }

    @Test
    public void testFindWrapPosNullText() {
        int pos = formatter.findWrapPos(null, 10, 0);
        assertTrue(pos == -1 || pos == 0);
    }

    @Test
    public void testFindWrapPosShortText() {
        String text = "short";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosWithNewline() {
        String text = "hello\nworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosWithTab() {
        String text = "hello\tworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosAtWordBoundary() {
        String text = "hello world test";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos == 5 || pos == 6);
    }

    @Test
    public void testFindWrapPosNoSpace() {
        String text = "helloworldtest";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertTrue(pos == 10 || pos == -1);
    }

    @Test
    public void testCreatePadding() {
        String padding = formatter.createPadding(5);
        assertEquals("     ", padding);
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testRtrim() {
        assertEquals("hello", formatter.rtrim("hello   "));
        assertEquals("hello", formatter.rtrim("hello"));
        assertEquals("", formatter.rtrim(""));
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void testPrintOptions() {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "file to process");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 74, options, 1, 3);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("-f"));
        assertTrue(output.contains("file to process"));
    }

    @Test
    public void testPrintHelpOptionWithNullDescription() {
        Options options = new Options();
        Option opt = new Option("f", "file", true, null);
        options.addOption(opt);
        formatter.printHelp(printWriter, 74, "cmd", null, options, 1, 3, null, false);
        printWriter.flush();
        assertTrue(stringWriter.toString().contains("-f"));
    }

    @Test
    public void testOptionWithNoOpt() {
        Options options = new Options();
        Option opt = new Option(null, "longOnly", true, "long only option");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 74, options, 1, 3);
        pw.flush();
        String output = sw.toString();
        assertTrue(output.contains("--longOnly"));
        assertTrue(output.contains("<arg>"));
    }
}