package org.apache.commons.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import static org.junit.Assert.*;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private PrintStream originalOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        originalOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    // ---------- Getter / Setter tests ----------

    @Test
    public void testWidthGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void testLeftPaddingGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void testDescPaddingGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(7);
        assertEquals(7, formatter.getDescPadding());
    }

    @Test
    public void testSyntaxPrefixGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("run: ");
        assertEquals("run: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void testNewLineGetterSetter() {
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void testOptPrefixGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("+");
        assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void testLongOptPrefixGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("++");
        assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void testArgNameGetterSetter() {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("value");
        assertEquals("value", formatter.getArgName());
    }

    @Test
    public void testOptionComparatorDefaultNotNull() {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorNullResetsToDefault() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        assertNotSame(custom, formatter.getOptionComparator());
    }

    @Test
    public void testSetOptionComparatorCustom() {
        Comparator custom = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }
        };
        formatter.setOptionComparator(custom);
        assertSame(custom, formatter.getOptionComparator());
    }

    // ---------- createPadding ----------

    @Test
    public void testCreatePaddingZero() {
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void testCreatePaddingPositive() {
        assertEquals("     ", formatter.createPadding(5));
    }

    // ---------- rtrim ----------

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
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    @Test
    public void testRtrimNoTrailingSpace() {
        assertEquals("abc", formatter.rtrim("abc"));
    }

    // ---------- findWrapPos ----------

    @Test
    public void testFindWrapPosNewlineWithinWidth() {
        String text = "ab\ncdefgh";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(3, pos);
    }

    @Test
    public void testFindWrapPosTabWithinWidth() {
        String text = "ab\tcdefgh";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(3, pos);
    }

    @Test
    public void testFindWrapPosTextShorterThanWidth() {
        String text = "hello";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void testFindWrapPosBackwardSearchFindsSpace() {
        String text = "hello world this is fine";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(5, pos);
    }

    @Test
    public void testFindWrapPosForwardSearchFindsSpace() {
        String text = "abcde fghijklmnop";
        int pos = formatter.findWrapPos(text, 3, 0);
        assertEquals(5, pos);
    }

    // ---------- renderWrappedText ----------

    @Test
    public void testRenderWrappedTextNoWrapNeeded() {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 80, 0, "short text");
        assertEquals("short text", sb.toString());
    }

    @Test
    public void testRenderWrappedTextMultipleWraps() {
        StringBuffer sb = new StringBuffer();
        String text = "one two three four five six seven eight nine ten eleven twelve";
        formatter.renderWrappedText(sb, 10, 0, text);
        String result = sb.toString();
        assertTrue(result.contains(formatter.getNewLine()));
        // should have wrapped into multiple lines
        int lines = result.split(formatter.getNewLine()).length;
        assertTrue(lines > 1);
    }

    // ---------- printWrapped ----------

    @Test
    public void testPrintWrappedSimple() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printWrapped(pw, 80, "hello world");
        pw.flush();
        assertTrue(sw.toString().startsWith("hello world"));
    }

    @Test
    public void testPrintWrappedWithTabStop() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        String text = "one two three four five six seven eight nine ten eleven twelve";
        formatter.printWrapped(pw, 10, 4, text);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains(formatter.getNewLine()));
    }

    // ---------- renderOptions ----------

    @Test
    public void testRenderOptionsEmpty() {
        Options options = new Options();
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        assertEquals(0, sb.length());
    }

    @Test
    public void testRenderOptionsSingleOption() {
        Options options = new Options();
        Option opt = new Option("a", "aaa", false, "option a description");
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("aaa"));
        assertTrue(result.contains("option a description"));
    }

    @Test
    public void testRenderOptionsMultipleOptionsSorted() {
        Options options = new Options();
        Option optB = new Option("b", "bbb desc");
        Option optA = new Option("a", "aaa desc");
        Option optWithArg = new Option("c", true, "ccc desc");
        options.addOption(optB);
        options.addOption(optA);
        options.addOption(optWithArg);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        int idxA = result.indexOf("-a");
        int idxB = result.indexOf("-b");
        int idxC = result.indexOf("-c");
        assertTrue(idxA >= 0 && idxB >= 0 && idxC >= 0);
        assertTrue(idxA < idxB);
        assertTrue(idxB < idxC);
        assertTrue(result.contains("<arg>"));
    }

    @Test
    public void testRenderOptionsWithArgNameNull() {
        Options options = new Options();
        Option opt = new Option("d", true, "desc d");
        opt.setArgName(null);
        options.addOption(opt);
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.contains("-d"));
        assertFalse(result.contains("<arg>"));
    }

    // ---------- printOptions ----------

    @Test
    public void testPrintOptionsEmpty() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertEquals("", sw.toString().trim());
    }

    @Test
    public void testPrintOptionsWithOption() {
        Options options = new Options();
        options.addOption(new Option("x", "xxx desc"));
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("-x"));
        assertTrue(result.contains("xxx desc"));
    }

    // ---------- printUsage ----------

    @Test
    public void testPrintUsageSimpleNoOptions() {
        Options options = new Options();
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.startsWith(formatter.getSyntaxPrefix() + "myapp"));
    }

    @Test
    public void testPrintUsageWithRequiredOption() {
        Options options = new Options();
        Option opt = new Option("r", false, "required option");
        opt.setRequired(true);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("-r"));
        assertFalse(result.contains("[-r]"));
    }

    @Test
    public void testPrintUsageWithOptionalOption() {
        Options options = new Options();
        Option opt = new Option("o", false, "optional option");
        opt.setRequired(false);
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("[-o]"));
    }

    @Test
    public void testPrintUsageWithOptionGroupRequired() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "opt a");
        Option optB = new Option("b", false, "opt b");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(true);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("-a"));
        assertTrue(result.contains("-b"));
        assertTrue(result.contains("|"));
        assertFalse(result.contains("[-a"));
    }

    @Test
    public void testPrintUsageWithOptionGroupOptional() {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        Option optA = new Option("a", false, "opt a");
        Option optB = new Option("b", false, "opt b");
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(false);
        options.addOptionGroup(group);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.startsWith(formatter.getSyntaxPrefix() + "myapp ["));
    }

    @Test
    public void testPrintUsageWithArgOption() {
        Options options = new Options();
        Option opt = new Option("f", true, "file option");
        options.addOption(opt);
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("<arg>"));
    }

    // ---------- printUsage(cmdLineSyntax) ----------

    @Test
    public void testPrintUsageCmdLineSyntaxOnly() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "myapp -a -b");
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
    }

    // ---------- printHelp overloads ----------

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpThrowsForNullCmdLineSyntax() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintHelpThrowsForEmptyCmdLineSyntax() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", false);
    }

    @Test
    public void testPrintHelpFullOverloadAutoUsageTrue() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", "This is header", options, 1, 3,
                "This is footer", true);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("This is header"));
        assertTrue(result.contains("-v"));
        assertTrue(result.contains("This is footer"));
    }

    @Test
    public void testPrintHelpFullOverloadAutoUsageFalse() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", "This is header", options, 1, 3,
                "This is footer", false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("This is header"));
        assertTrue(result.contains("This is footer"));
    }

    @Test
    public void testPrintHelpWithNullHeaderFooter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", null, options, 1, 3, null, false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
    }

    @Test
    public void testPrintHelpWithBlankHeaderFooter() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", "   ", options, 1, 3, "   ", false);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
    }

    @Test
    public void testPrintHelp5ArgOverload() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", "header", options, 1, 3, "footer");
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("header"));
        assertTrue(result.contains("footer"));
    }

    @Test
    public void testPrintHelp_IntWidthCmdHeaderOptionsFooter() {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(80, "myapp", "header text", options, "footer text");
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("header text"));
        assertTrue(result.contains("footer text"));
    }

    @Test
    public void testPrintHelp_IntWidthCmdHeaderOptionsFooterAutoUsage() {
        Options options = new Options();
        Option opt = new Option("v", false, "verbose mode");
        opt.setRequired(true);
        options.addOption(opt);
        formatter.printHelp(80, "myapp", "header text", options, "footer text", true);
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
        assertTrue(result.contains("header text"));
        assertTrue(result.contains("footer text"));
    }

    @Test
    public void testPrintHelp_CmdOptions() {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp("myapp", options);
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
    }

    @Test
    public void testPrintHelp_CmdOptionsAutoUsageTrue() {
        Options options = new Options();
        Option opt = new Option("v", false, "verbose mode");
        opt.setRequired(true);
        options.addOption(opt);
        formatter.printHelp("myapp", options, true);
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
    }

    @Test
    public void testPrintHelp_CmdOptionsAutoUsageFalse() {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp("myapp", options, false);
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
    }

    @Test
    public void testPrintHelp_CmdHeaderOptionsFooter() {
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp("myapp", "some header", options, "some footer");
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("some header"));
        assertTrue(result.contains("some footer"));
    }

    @Test
    public void testPrintHelp_CmdHeaderOptionsFooterAutoUsage() {
        Options options = new Options();
        Option opt = new Option("v", false, "verbose mode");
        opt.setRequired(true);
        options.addOption(opt);
        formatter.printHelp("myapp", "some header", options, "some footer", true);
        String result = outContent.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("-v"));
        assertTrue(result.contains("some header"));
        assertTrue(result.contains("some footer"));
    }

    @Test
    public void testPrintHelp_PrintWriterOverloadWithoutAutoUsage() {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        Options options = new Options();
        options.addOption(new Option("v", "verbose", false, "verbose mode"));
        formatter.printHelp(pw, 80, "myapp", "header", options, 1, 3, "footer");
        pw.flush();
        String result = sw.toString();
        assertTrue(result.contains("usage: myapp"));
        assertTrue(result.contains("header"));
        assertTrue(result.contains("footer"));
    }

    // ---------- default value sanity checks ----------

    @Test
    public void testDefaultConstants() {
        assertEquals(74, HelpFormatter.DEFAULT_WIDTH);
        assertEquals(1, HelpFormatter.DEFAULT_LEFT_PAD);
        assertEquals(3, HelpFormatter.DEFAULT_DESC_PAD);
        assertEquals("usage: ", HelpFormatter.DEFAULT_SYNTAX_PREFIX);
        assertEquals("-", HelpFormatter.DEFAULT_OPT_PREFIX);
        assertEquals("--", HelpFormatter.DEFAULT_LONG_OPT_PREFIX);
        assertEquals("arg", HelpFormatter.DEFAULT_ARG_NAME);
    }
}