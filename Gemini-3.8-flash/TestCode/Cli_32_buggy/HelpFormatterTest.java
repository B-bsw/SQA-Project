package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private String defaultLineSeparator;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        defaultLineSeparator = formatter.getNewLine();
    }

    // =========================================================================
    // Getters and Setters Tests
    // =========================================================================

    @Test
    public void getWidth_default_shouldReturnDefaultWidth()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void setWidth_customWidth_shouldUpdateWidth()
    {
        formatter.setWidth(100);
        assertEquals(100, formatter.getWidth());
    }

    @Test
    public void getLeftPadding_default_shouldReturnDefaultLeftPad()
    {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
    }

    @Test
    public void setLeftPadding_customPadding_shouldUpdateLeftPadding()
    {
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void getDescPadding_default_shouldReturnDefaultDescPad()
    {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
    }

    @Test
    public void setDescPadding_customPadding_shouldUpdateDescPadding()
    {
        formatter.setDescPadding(8);
        assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void getSyntaxPrefix_default_shouldReturnDefaultSyntaxPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
    }

    @Test
    public void setSyntaxPrefix_customPrefix_shouldUpdateSyntaxPrefix()
    {
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void getNewLine_default_shouldReturnSystemLineSeparator()
    {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
    }

    @Test
    public void setNewLine_customNewLine_shouldUpdateNewLine()
    {
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void getOptPrefix_default_shouldReturnDefaultOptPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
    }

    @Test
    public void setOptPrefix_customPrefix_shouldUpdateOptPrefix()
    {
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void getLongOptPrefix_default_shouldReturnDefaultLongOptPrefix()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
    }

    @Test
    public void setLongOptPrefix_customPrefix_shouldUpdateLongOptPrefix()
    {
        formatter.setLongOptPrefix("--opt-");
        assertEquals("--opt-", formatter.getLongOptPrefix());
    }

    @Test
    public void getLongOptSeparator_default_shouldReturnDefaultSeparator()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
    }

    @Test
    public void setLongOptSeparator_customSeparator_shouldUpdateSeparator()
    {
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void getArgName_default_shouldReturnDefaultArgName()
    {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
    }

    @Test
    public void setArgName_customName_shouldUpdateArgName()
    {
        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void getOptionComparator_default_shouldNotBeNull()
    {
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void setOptionComparator_nullComparator_shouldResetToDefaultComparator()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void setOptionComparator_customComparator_shouldSetCustomComparator()
    {
        Comparator customComparator = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        assertEquals(customComparator, formatter.getOptionComparator());
    }

    // =========================================================================
    // rtrim Tests
    // =========================================================================

    @Test
    public void rtrim_nullString_shouldReturnNull()
    {
        assertNull(formatter.rtrim(null));
    }

    @Test
    public void rtrim_emptyString_shouldReturnEmptyString()
    {
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void rtrim_stringWithoutTrailingWhitespace_shouldReturnSameString()
    {
        assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void rtrim_stringWithTrailingSpaces_shouldTrimTrailingSpaces()
    {
        assertEquals("abc", formatter.rtrim("abc   "));
    }

    @Test
    public void rtrim_stringWithLeadingAndTrailingWhitespace_shouldTrimTrailingOnly()
    {
        assertEquals("  abc", formatter.rtrim("  abc \t\r\n "));
    }

    @Test
    public void rtrim_whitespaceOnlyString_shouldReturnEmptyString()
    {
        assertEquals("", formatter.rtrim("   \t\n\r "));
    }

    // =========================================================================
    // createPadding Tests
    // =========================================================================

    @Test
    public void createPadding_zeroLength_shouldReturnEmptyString()
    {
        assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void createPadding_positiveLength_shouldReturnExactSpaces()
    {
        assertEquals("   ", formatter.createPadding(3));
        assertEquals("      ", formatter.createPadding(6));
    }

    // =========================================================================
    // findWrapPos Tests
    // =========================================================================

    @Test
    public void findWrapPos_textWithNewlineBeforeWidth_shouldReturnNewlinePosPlusOne()
    {
        String text = "hello\nworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(6, pos);
    }

    @Test
    public void findWrapPos_textWithTabBeforeWidth_shouldReturnTabPosPlusOne()
    {
        String text = "hello\tworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(6, pos);
    }

    @Test
    public void findWrapPos_textLengthLessThanWidth_shouldReturnMinusOne()
    {
        String text = "short";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_startPosPlusWidthEqualsLength_shouldReturnMinusOne()
    {
        String text = "exact_len!";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_spaceAtWrapBoundary_shouldReturnBoundaryPos()
    {
        String text = "hello world test";
        int pos = formatter.findWrapPos(text, 11, 0);
        assertEquals(11, pos);
    }

    @Test
    public void findWrapPos_spaceBeforeWrapBoundary_shouldReturnLastSpacePos()
    {
        String text = "hello world test";
        int pos = formatter.findWrapPos(text, 8, 0);
        assertEquals(5, pos);
    }

    @Test
    public void findWrapPos_noSpaceBeforeWidthButSpaceAfter_shouldReturnNextSpacePos()
    {
        String text = "verylongunbrokenword next";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(20, pos);
    }

    @Test
    public void findWrapPos_entireWordExceedsWidthWithNoSpaces_shouldReturnMinusOne()
    {
        String text = "unbrokenword";
        int pos = formatter.findWrapPos(text, 5, 0);
        assertEquals(-1, pos);
    }

    // =========================================================================
    // renderWrappedText Tests
    // =========================================================================

    @Test
    public void renderWrappedText_textFitsWidth_shouldNotWrap()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 2, "hello world");
        assertEquals("hello world", sb.toString());
    }

    @Test
    public void renderWrappedText_textExceedsWidth_shouldWrapWithPadding()
    {
        formatter.setNewLine("\n");
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 12, 3, "hello world again and again");
        String expected = "hello world\n   again and\n   again";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_tabStopGreaterOrEqualToWidth_shouldResetTabStopToOne()
    {
        formatter.setNewLine("\n");
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 15, "first line wrap text");
        String expected = "first line\n wrap text";
        assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_posEqualsNextLineTabStopMinusOne_shouldForceWrapAtWidth()
    {
        formatter.setNewLine("\n");
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 8, 4, "abcd efghij");
        String expected = "abcd\n    efgh\n    ij";
        assertEquals(expected, sb.toString());
    }

    // =========================================================================
    // printWrapped Tests
    // =========================================================================

    @Test
    public void printWrapped_withoutTabStop_shouldPrintWithTrailingNewline()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.setNewLine("\n");
        formatter.printWrapped(pw, 20, "simple wrapped text");
        pw.flush();
        assertEquals("simple wrapped text" + defaultLineSeparator, sw.toString());
    }

    @Test
    public void printWrapped_withTabStop_shouldIndentSubsequentLines()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.setNewLine("\n");
        formatter.printWrapped(pw, 12, 2, "line one line two");
        pw.flush();
        assertEquals("line one\n  line two" + defaultLineSeparator, sw.toString());
    }

    // =========================================================================
    // printUsage (Command line syntax only) Tests
    // =========================================================================

    @Test
    public void printUsage_withSyntaxAndNoSpaces_shouldPrintCorrectly()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 50, "myapp");
        pw.flush();
        assertEquals("usage: myapp" + defaultLineSeparator, sw.toString());
    }

    @Test
    public void printUsage_withSyntaxContainingSpace_shouldUseCorrectIndent()
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 20, "myapp arg1 arg2 arg3");
        pw.flush();
        assertTrue(sw.toString().startsWith("usage: myapp arg1"));
    }

    // =========================================================================
    // printUsage (WithOptions) and OptionGroup Tests
    // =========================================================================

    @Test
    public void printUsage_withOptions_shouldFormatCorrectly()
    {
        Options options = new Options();
        options.addOption("a", "all", false, "turn on all");
        Option optB = new Option("b", true, "option b");
        optB.setRequired(true);
        options.addOption(optB);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "testapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.indexOf("testapp") != -1);
        assertTrue(result.indexOf("[-a]") != -1);
        assertTrue(result.indexOf("-b <arg>") != -1);
    }

    @Test
    public void printUsage_withLongOptOnlyOption_shouldFormatDoubleDash()
    {
        Options options = new Options();
        Option longOnly = new Option(null, "config", true, "config file");
        longOnly.setRequired(true);
        options.addOption(longOnly);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "testapp", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.indexOf("--config <arg>") != -1);
    }

    @Test
    public void printUsage_withCustomArgName_shouldUseOptionArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", "file", true, "target file");
        opt.setArgName("FILE");
        options.addOption(opt);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().indexOf("[-f <FILE>]") != -1);
    }

    @Test
    public void printUsage_withEmptyArgName_shouldNotAppendArgName()
    {
        Options options = new Options();
        Option opt = new Option("f", true, "desc");
        opt.setArgName("");
        options.addOption(opt);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        assertTrue(sw.toString().indexOf("[-f]") != -1);
    }

    @Test
    public void printUsage_withOptionGroupOptional_shouldWrapInSquareBrackets()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(new Option("x", "option x"));
        group.addOption(new Option("y", "option y"));
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.indexOf("[-x | -y]") != -1 || result.indexOf("[-y | -x]") != -1);
    }

    @Test
    public void printUsage_withOptionGroupRequired_shouldNotWrapInSquareBrackets()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(new Option("x", "option x"));
        group.addOption(new Option("y", "option y"));
        options.addOptionGroup(group);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = sw.toString();
        assertTrue(result.indexOf("-x | -y") != -1 || result.indexOf("-y | -x") != -1);
        assertTrue(result.indexOf("[-x | -y]") == -1);
    }

    // =========================================================================
    // renderOptions Tests
    // =========================================================================

    @Test
    public void renderOptions_shortAndLongOptsWithArgs_shouldAlignCorrectly()
    {
        Options options = new Options();
        options.addOption(new Option("a", "alpha", false, "alpha description"));
        Option b = new Option("b", true, "beta description");
        b.setArgName("");
        options.addOption(b);
        Option c = new Option(null, "gamma", true, "gamma description");
        options.addOption(c);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        assertTrue(result.indexOf("-a,--alpha") != -1);
        assertTrue(result.indexOf("-b") != -1);
        assertTrue(result.indexOf("--gamma <arg>") != -1);
        assertTrue(result.indexOf("alpha description") != -1);
        assertTrue(result.indexOf("beta description") != -1);
        assertTrue(result.indexOf("gamma description") != -1);
    }

    @Test
    public void renderOptions_optionWithoutDescription_shouldRenderWithoutError()
    {
        Options options = new Options();
        options.addOption(new Option("n", null));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 2);
        assertTrue(sb.toString().indexOf("-n") != -1);
    }

    @Test
    public void renderOptions_multipleOptions_shouldSortAlphabeticallyByDefault()
    {
        Options options = new Options();
        options.addOption(new Option("z", "z opt"));
        options.addOption(new Option("a", "a opt"));
        options.addOption(new Option("m", "m opt"));

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String result = sb.toString();
        int posA = result.indexOf("-a");
        int posM = result.indexOf("-m");
        int posZ = result.indexOf("-z");
        assertTrue(posA < posM);
        assertTrue(posM < posZ);
    }

    @Test
    public void printOptions_shouldPrintRenderedOptionsWithTrailingNewline()
    {
        Options options = new Options();
        options.addOption("h", "help", false, "display help");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        assertTrue(sw.toString().endsWith(defaultLineSeparator));
        assertTrue(sw.toString().indexOf("-h,--help") != -1);
    }

    // =========================================================================
    // printHelp Exception and Validation Tests
    // =========================================================================

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_nullCmdLineSyntax_shouldThrowIllegalArgumentException()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        formatter.printHelp(pw, 80, null, "header", new Options(), 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_emptyCmdLineSyntax_shouldThrowIllegalArgumentException()
    {
        PrintWriter pw = new PrintWriter(new StringWriter());
        formatter.printHelp(pw, 80, "", "header", new Options(), 1, 3, "footer", false);
    }

    // =========================================================================
    // printHelp Overload Tests
    // =========================================================================

    @Test
    public void printHelp_fullParameters_shouldPrintHeaderUsageOptionsAndFooter()
    {
        Options options = new Options();
        options.addOption("v", "version", false, "display version");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "Header line", options, 2, 4, "Footer line", true);
        pw.flush();
        String result = sw.toString();

        assertTrue(result.indexOf("usage: app") != -1);
        assertTrue(result.indexOf("Header line") != -1);
        assertTrue(result.indexOf("-v,--version") != -1);
        assertTrue(result.indexOf("Footer line") != -1);
    }

    @Test
    public void printHelp_nullHeaderAndFooter_shouldNotPrintHeaderOrFooter()
    {
        Options options = new Options();
        options.addOption("v", "version", false, "display version");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        String result = sw.toString();

        assertTrue(result.indexOf("usage: app") != -1);
        assertTrue(result.indexOf("-v,--version") != -1);
    }

    @Test
    public void printHelp_emptyAndWhitespaceHeaderAndFooter_shouldBeIgnored()
    {
        Options options = new Options();
        options.addOption("v", false, "version");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "app", "   ", options, 1, 3, "\t\n", false);
        pw.flush();
        String result = sw.toString();

        assertTrue(result.indexOf("usage: app") != -1);
        assertTrue(result.indexOf("-v") != -1);
    }

    @Test
    public void printHelp_overloadWithoutAutoUsage_shouldDefaultToFalse()
    {
        Options options = new Options();
        options.addOption("o", false, "opt");

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        formatter.printHelp(pw, 80, "cmd", "head", options, 1, 2, "foot");
        pw.flush();
        String result = sw.toString();

        assertTrue(result.indexOf("usage: cmd" + defaultLineSeparator) != -1);
    }

    @Test
    public void printHelp_convenienceOverloads_shouldExecuteWithoutException()
    {
        Options options = new Options();
        options.addOption("t", false, "test");

        try
        {
            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(60, "app", "header", options, "footer");
            formatter.printHelp(60, "app", "header", options, "footer", false);
        }
        catch (Exception e)
        {
            fail("printHelp convenience overloads threw unexpected exception: " + e.getMessage());
        }
    }
}