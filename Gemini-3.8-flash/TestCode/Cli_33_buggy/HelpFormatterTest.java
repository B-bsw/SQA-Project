package org.apache.commons.cli;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private StringWriter sw;
    private PrintWriter pw;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);
    }

    @Test
    public void getSetWidth_givenNewWidth_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(120);
        assertEquals(120, formatter.getWidth());
    }

    @Test
    public void getSetLeftPadding_givenNewPadding_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void getSetDescPadding_givenNewPadding_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(8);
        assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void getSetSyntaxPrefix_givenNewPrefix_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void getSetNewLine_givenNewSeparator_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void getSetOptPrefix_givenNewPrefix_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("/");
        assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void getSetLongOptPrefix_givenNewPrefix_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("//");
        assertEquals("//", formatter.getLongOptPrefix());
    }

    @Test
    public void getSetLongOptSeparator_givenNewSeparator_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        formatter.setLongOptSeparator("=");
        assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void getSetArgName_givenNewArgName_shouldUpdateAndReturnCorrectValue()
    {
        assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("parameter");
        assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void setOptionComparator_givenCustomComparator_shouldUseCustomComparator()
    {
        Comparator customComparator = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        assertSame(customComparator, formatter.getOptionComparator());
    }

    @Test
    public void setOptionComparator_givenNull_shouldResetToDefaultOptionComparator()
    {
        formatter.setOptionComparator(null);
        assertNotNull(formatter.getOptionComparator());
        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");
        assertTrue(formatter.getOptionComparator().compare(optA, optB) < 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenNullSyntax_shouldThrowIllegalArgumentException()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, null, "header", options, 1, 3, "footer", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenEmptySyntax_shouldThrowIllegalArgumentException()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "", "header", options, 1, 3, "footer", true);
    }

    @Test
    public void printHelp_givenConvenienceOverloads_shouldExecuteWithoutException()
    {
        PrintStream originalOut = System.out;
        try
        {
            System.setOut(new PrintStream(new ByteArrayOutputStream()));
            Options options = new Options();
            options.addOption(new Option("h", "help", false, "display help"));

            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(80, "app", "header", options, "footer");
            formatter.printHelp(80, "app", "header", options, "footer", true);
        }
        finally
        {
            System.setOut(originalOut);
        }
    }

    @Test
    public void printHelp_givenNoHeaderNoFooterAutoUsageFalse_shouldPrintExpectedLayout()
    {
        Options options = new Options();
        options.addOption("v", false, "verbose mode");

        formatter.printHelp(pw, 80, "myApp arg1", null, options, 2, 4, null, false);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.startsWith("usage: myApp arg1"));
        assertTrue(output.indexOf("-v") != -1);
    }

    @Test
    public void printHelp_givenBlankHeaderAndFooter_shouldOmitHeaderAndFooter()
    {
        Options options = new Options();
        options.addOption("f", "file", true, "input file");

        formatter.printHelp(pw, 80, "myApp", "   ", options, 2, 4, " \t ", false);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.startsWith("usage: myApp"));
        assertTrue(output.indexOf("   ") != -1);
    }

    @Test
    public void printHelp_givenHeaderFooterAndAutoUsage_shouldRenderAllSections()
    {
        Options options = new Options();
        options.addOption("f", "file", true, "input file");

        formatter.printHelp(pw, 80, "myApp", "Start Header", options, 1, 2, "End Footer", true);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.indexOf("usage: myApp") != -1);
        assertTrue(output.indexOf("Start Header") != -1);
        assertTrue(output.indexOf("-f,--file") != -1);
        assertTrue(output.indexOf("End Footer") != -1);
    }

    @Test
    public void printHelp_givenPrintWriterOverloadWithoutAutoUsage_shouldDefaultToFalse()
    {
        Options options = new Options();
        options.addOption("a", false, "flag a");

        formatter.printHelp(pw, 80, "myApp", "Header", options, 1, 3, "Footer");
        pw.flush();

        String output = sw.toString();
        assertTrue(output.indexOf("usage: myApp") != -1);
        assertTrue(output.indexOf("Header") != -1);
        assertTrue(output.indexOf("-a") != -1);
        assertTrue(output.indexOf("Footer") != -1);
    }

    @Test
    public void printUsage_givenOptionsWithOptionGroup_shouldFormatGroupCorrectly()
    {
        Options options = new Options();
        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        requiredGroup.addOption(new Option("a", "opt A"));
        requiredGroup.addOption(new Option("b", "opt B"));

        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.setRequired(false);
        optionalGroup.addOption(new Option("c", "opt C"));
        optionalGroup.addOption(new Option("d", "opt D"));

        options.addOptionGroup(requiredGroup);
        options.addOptionGroup(optionalGroup);

        formatter.printUsage(pw, 80, "groupApp", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.indexOf("-a | -b") != -1);
        assertTrue(output.indexOf("[-c | -d]") != -1);
    }

    @Test
    public void printUsage_givenRequiredAndNonRequiredOptions_shouldRenderBracketsAppropriately()
    {
        Options options = new Options();
        Option optReq = new Option("r", "req", false, "required option");
        optReq.setRequired(true);

        Option optOpt = new Option("o", "opt", false, "optional option");
        optOpt.setRequired(false);

        options.addOption(optReq);
        options.addOption(optOpt);

        formatter.printUsage(pw, 80, "usageApp", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.indexOf("-r") != -1);
        assertTrue(output.indexOf("[-o]") != -1);
    }

    @Test
    public void printUsage_givenLongOptOnlyAndArgumentConfigurations_shouldRenderCorrectPlaceholders()
    {
        Options options = new Options();

        Option longOnly = new Option(null, "config", true, "configuration file");
        longOnly.setRequired(true);

        Option emptyArg = new Option("e", "empty", true, "empty arg name");
        emptyArg.setArgName("");

        Option customArg = new Option("c", "custom", true, "custom arg name");
        customArg.setArgName("myArg");

        options.addOption(longOnly);
        options.addOption(emptyArg);
        options.addOption(customArg);

        formatter.setLongOptSeparator("=");
        formatter.printUsage(pw, 80, "testApp", options);
        pw.flush();

        String output = sw.toString();
        assertTrue(output.indexOf("--config=<arg>") != -1);
        assertTrue(output.indexOf("[-e]") != -1);
        assertTrue(output.indexOf("[-c <myArg>]") != -1);
    }

    @Test
    public void printUsage_givenSingleSyntaxStringWithoutSpace_shouldWrapProperly()
    {
        formatter.printUsage(pw, 80, "SingleCommandNoArgs");
        pw.flush();

        String output = sw.toString();
        assertEquals("usage: SingleCommandNoArgs" + formatter.getNewLine(), output);
    }

    @Test
    public void printWrapped_givenTextShorterThanWidth_shouldNotWrap()
    {
        formatter.printWrapped(pw, 50, "Short line of text.");
        pw.flush();

        String output = sw.toString();
        assertEquals("Short line of text." + formatter.getNewLine(), output);
    }

    @Test
    public void printWrapped_givenNewlineAndTabBeforeWidth_shouldWrapAtDelimiters()
    {
        formatter.printWrapped(pw, 50, "Line 1\nLine 2\tLine 3");
        pw.flush();

        String output = sw.toString();
        String expected = "Line 1" + formatter.getNewLine() + "Line 2" + formatter.getNewLine() + "Line 3" + formatter.getNewLine();
        assertEquals(expected, output);
    }

    @Test
    public void printWrapped_givenLongSingleWord_shouldForceBreakAtWidth()
    {
        String longWord = "12345678901234567890";
        formatter.printWrapped(pw, 10, longWord);
        pw.flush();

        String output = sw.toString();
        String expected = "1234567890" + formatter.getNewLine() + "1234567890" + formatter.getNewLine();
        assertEquals(expected, output);
    }

    @Test
    public void printWrapped_givenNextLineTabStopGreaterThanOrEqualToWidth_shouldResetTabStopToOne()
    {
        String text = "First line is slightly long enough to wrap properly";
        formatter.printWrapped(pw, 20, 25, text);
        pw.flush();

        String output = sw.toString();
        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
        assertTrue(lines[1].startsWith(" "));
    }

    @Test
    public void printWrapped_givenWordMatchingNextLineTabStopBoundary_shouldBreakCorrectly()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 6, 4, "abcd 123456789");
        String output = sb.toString();
        assertTrue(output.indexOf("123456") != -1);
    }

    @Test
    public void renderOptions_givenVariousOptionTypes_shouldFormatColumnsProperly()
    {
        Options options = new Options();

        Option longOnly = new Option(null, "config", true, "configuration path");
        Option shortAndLong = new Option("o", "output", true, "output file path");
        Option shortOnlyNoArg = new Option("v", false, "verbose output flag");
        Option emptyArgName = new Option("x", "extend", true, "extend flag");
        emptyArgName.setArgName("");
        Option noDescription = new Option("n", "none", false, null);

        options.addOption(longOnly);
        options.addOption(shortAndLong);
        options.addOption(shortOnlyNoArg);
        options.addOption(emptyArgName);
        options.addOption(noDescription);

        formatter.setLongOptSeparator(" ");
        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 2, 4);

        String output = sb.toString();
        assertTrue(output.indexOf("--config <arg>") != -1);
        assertTrue(output.indexOf("-o,--output <arg>") != -1);
        assertTrue(output.indexOf("-v") != -1);
        assertTrue(output.indexOf("-x,--extend ") != -1);
        assertTrue(output.indexOf("-n,--none") != -1);
    }

    @Test
    public void renderOptions_givenOptionWithMultilineDescription_shouldWrapAndIndent()
    {
        Options options = new Options();
        Option multiline = new Option("m", "multi", false,
                "This is a very long description intended to test wrapping across multiple lines cleanly.");
        options.addOption(multiline);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 35, options, 1, 2);

        String output = sb.toString();
        String[] lines = output.split(formatter.getNewLine());
        assertTrue(lines.length > 1);
    }

    @Test
    public void findWrapPos_givenStartPosPlusWidthAtOrExceedingLength_shouldReturnMinusOne()
    {
        int pos = formatter.findWrapPos("short", 10, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenCarriageReturnAndNewline_shouldFindBoundary()
    {
        String text = "Line 1\r\nLine 2";
        int pos = formatter.findWrapPos(text, 10, 0);
        assertEquals(7, pos);
    }

    @Test
    public void findWrapPos_givenNoBreakPointAndMatchesEndOfString_shouldReturnMinusOne()
    {
        int pos = formatter.findWrapPos("12345", 5, 0);
        assertEquals(-1, pos);
    }

    @Test
    public void rtrim_givenNullOrEmptyString_shouldReturnOriginal()
    {
        assertEquals(null, formatter.rtrim(null));
        assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void rtrim_givenTrailingWhitespace_shouldTrimWhitespaceOnlyFromEnd()
    {
        assertEquals("  no whitespace at end", formatter.rtrim("  no whitespace at end"));
        assertEquals("hello", formatter.rtrim("hello   \t \r\n"));
    }

    @Test
    public void createPadding_givenLength_shouldReturnExactNumberOfSpaces()
    {
        assertEquals("", formatter.createPadding(0));
        assertEquals("   ", formatter.createPadding(3));
        assertEquals(10, formatter.createPadding(10).length());
    }

    @Test
    public void optionComparator_givenDifferentCasedKeys_shouldCompareIgnoreCase()
    {
        Comparator comp = formatter.getOptionComparator();
        Option optLower = new Option("a", "alpha");
        Option optUpper = new Option("A", "ALPHA");
        Option optB = new Option("b", "beta");

        assertEquals(0, comp.compare(optLower, optUpper));
        assertTrue(comp.compare(optLower, optB) < 0);
        assertTrue(comp.compare(optB, optLower) > 0);
    }
}