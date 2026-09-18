package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
    }

    @Test
    public void setWidth_givenPositiveValue_shouldUpdateDefaultWidth()
    {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());
    }

    @Test
    public void setLeftPadding_givenPositiveValue_shouldUpdateDefaultLeftPad()
    {
        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void setDescPadding_givenPositiveValue_shouldUpdateDefaultDescPad()
    {
        formatter.setDescPadding(8);
        Assert.assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void setSyntaxPrefix_givenCustomPrefix_shouldUpdateDefaultSyntaxPrefix()
    {
        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void setNewLine_givenCustomNewLine_shouldUpdateDefaultNewLine()
    {
        formatter.setNewLine("\n");
        Assert.assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void setOptPrefix_givenCustomPrefix_shouldUpdateDefaultOptPrefix()
    {
        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());
    }

    @Test
    public void setLongOptPrefix_givenCustomPrefix_shouldUpdateDefaultLongOptPrefix()
    {
        formatter.setLongOptPrefix("++");
        Assert.assertEquals("++", formatter.getLongOptPrefix());
    }

    @Test
    public void setArgName_givenCustomArgName_shouldUpdateDefaultArgName()
    {
        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void setOptionComparator_givenNull_shouldRestoreDefaultOptionComparator()
    {
        Comparator customComparator = new Comparator()
        {
            public int compare(Object o1, Object o2)
            {
                return 0;
            }
        };
        formatter.setOptionComparator(customComparator);
        Assert.assertSame(customComparator, formatter.getOptionComparator());

        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
        Assert.assertNotSame(customComparator, formatter.getOptionComparator());
    }

    @Test
    public void optionComparator_givenDifferentKeyCases_shouldSortIgnoreCase()
    {
        Option optA = new Option("a", "Option A");
        Option optB = new Option("B", "Option B");
        Comparator comp = formatter.getOptionComparator();

        Assert.assertTrue(comp.compare(optA, optB) < 0);
        Assert.assertTrue(comp.compare(optB, optA) > 0);
        Assert.assertEquals(0, comp.compare(optA, new Option("A", "Option upper A")));
    }

    @Test
    public void printHelp_givenNullSyntax_shouldThrowIllegalArgumentException()
    {
        Options options = new Options();
        try
        {
            formatter.printHelp(printWriter, 80, null, "Header", options, 1, 3, "Footer", false);
            Assert.fail("Expected IllegalArgumentException on null cmdLineSyntax");
        }
        catch (IllegalArgumentException ex)
        {
            Assert.assertEquals("cmdLineSyntax not provided", ex.getMessage());
        }
    }

    @Test
    public void printHelp_givenEmptySyntax_shouldThrowIllegalArgumentException()
    {
        Options options = new Options();
        try
        {
            formatter.printHelp(printWriter, 80, "", "Header", options, 1, 3, "Footer", false);
            Assert.fail("Expected IllegalArgumentException on empty cmdLineSyntax");
        }
        catch (IllegalArgumentException ex)
        {
            Assert.assertEquals("cmdLineSyntax not provided", ex.getMessage());
        }
    }

    @Test
    public void printHelp_givenAutoUsageFalseWithHeaderAndFooter_shouldFormatAllSections()
    {
        Options options = new Options();
        options.addOption("h", "help", false, "display help");

        formatter.printHelp(printWriter, 80, "myapp [options]", "Header Text", options, 2, 4, "Footer Text", false);
        printWriter.flush();
        String output = stringWriter.toString();

        Assert.assertTrue(output.indexOf("usage: myapp [options]") != -1);
        Assert.assertTrue(output.indexOf("Header Text") != -1);
        Assert.assertTrue(output.indexOf("-h,--help") != -1);
        Assert.assertTrue(output.indexOf("display help") != -1);
        Assert.assertTrue(output.indexOf("Footer Text") != -1);
    }

    @Test
    public void printHelp_givenAutoUsageTrue_shouldInvokeAutoUsageAndRenderGroups()
    {
        Options options = new Options();
        Option optA = new Option("a", "alpha", false, "alpha option");
        Option optB = new Option("b", "beta", true, "beta option");
        optB.setArgName("VALUE");

        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        Option optReq = new Option("r", "req", false, "required option");
        optReq.setRequired(true);
        options.addOption(optReq);

        formatter.printHelp(printWriter, 80, "testapp", null, options, 1, 3, null, true);
        printWriter.flush();
        String output = stringWriter.toString();

        Assert.assertTrue(output.indexOf("usage: testapp") != -1);
        Assert.assertTrue(output.indexOf("[-a | -b <VALUE>]") != -1);
        Assert.assertTrue(output.indexOf("-r") != -1);
    }

    @Test
    public void printHelp_givenRequiredGroup_shouldRenderGroupWithoutSquareBrackets()
    {
        Options options = new Options();
        Option optX = new Option("x", false, "option x");
        Option optY = new Option(null, "optY", false, "option y");

        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        group.addOption(optX);
        group.addOption(optY);
        options.addOptionGroup(group);

        formatter.printHelp(printWriter, 80, "testgroup", "   ", options, 1, 3, "   ", true);
        printWriter.flush();
        String output = stringWriter.toString();

        Assert.assertTrue(output.indexOf("-x | --optY") != -1);
        Assert.assertTrue(output.indexOf("[-x | --optY]") == -1);
    }

    @Test
    public void printHelp_convenienceOverloads_shouldExecuteWithoutExceptions()
    {
        Options options = new Options();
        options.addOption("v", false, "verbose");

        formatter.printHelp(printWriter, 80, "cmd", "hdr", options, 1, 2, "ftr");
        formatter.printHelp("cmd", options);
        formatter.printHelp("cmd", options, true);
        formatter.printHelp("cmd", "hdr", options, "ftr");
        formatter.printHelp("cmd", "hdr", options, "ftr", true);
        formatter.printHelp(80, "cmd", "hdr", options, "ftr");
        formatter.printHelp(80, "cmd", "hdr", options, "ftr", true);

        printWriter.flush();
        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: cmd") != -1);
    }

    @Test
    public void printUsage_givenCommandLineSyntaxWithoutSpace_shouldCalculateIndentCorrectly()
    {
        formatter.printUsage(printWriter, 80, "SingleCommandNoSpace");
        printWriter.flush();
        String output = stringWriter.toString();
        Assert.assertEquals("usage: SingleCommandNoSpace" + formatter.getNewLine(), output);
    }

    @Test
    public void printUsage_givenCommandLineSyntaxWithSpace_shouldCalculateIndentAfterSpace()
    {
        formatter.printUsage(printWriter, 80, "myapp subCommand arg1 arg2");
        printWriter.flush();
        String output = stringWriter.toString();
        Assert.assertEquals("usage: myapp subCommand arg1 arg2" + formatter.getNewLine(), output);
    }

    @Test
    public void printOptions_givenLongOptionOnlyAndArgWithoutArgName_shouldRenderCorrectly()
    {
        Options options = new Options();
        Option longOnly = new Option(null, "long-only", true, "description for long-only");
        longOnly.setArgName(null);
        options.addOption(longOnly);

        Option noDesc = new Option("n", "no-desc", false, null);
        options.addOption(noDesc);

        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();
        String output = stringWriter.toString();

        Assert.assertTrue(output.indexOf("--long-only") != -1);
        Assert.assertTrue(output.indexOf("-n,--no-desc") != -1);
        Assert.assertTrue(output.indexOf("description for long-only") != -1);
    }

    @Test
    public void printWrapped_givenShortText_shouldRenderWithoutWrap()
    {
        formatter.printWrapped(printWriter, 80, "Short line text");
        printWriter.flush();
        String output = stringWriter.toString();
        Assert.assertEquals("Short line text" + formatter.getNewLine(), output);
    }

    @Test
    public void renderWrappedText_givenTabAndNewlineWithinWidth_shouldWrapAtFirstDelimiter()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 20, 4, "first line\nsecond line");
        String result = sb.toString();
        Assert.assertTrue(result.startsWith("first line"));

        StringBuffer sbTab = new StringBuffer();
        formatter.renderWrappedText(sbTab, 20, 4, "tab\there");
        String resultTab = sbTab.toString();
        Assert.assertTrue(resultTab.startsWith("tab\t"));
    }

    @Test
    public void renderWrappedText_givenNoBreaksBeforeWidth_shouldWrapAtNextSpace()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 10, 2, "1234567890123 continue");
        String result = sb.toString();
        Assert.assertTrue(result.startsWith("1234567890123"));
    }

    @Test
    public void renderWrappedText_givenTextCannotBeWrappedWithinNextLineTabStop_shouldThrowRuntimeException()
    {
        StringBuffer sb = new StringBuffer();
        try
        {
            formatter.renderWrappedText(sb, 5, 5, "123456 7890");
            Assert.fail("Expected RuntimeException for line exceeding width with infinite loop guard");
        }
        catch (RuntimeException ex)
        {
            Assert.assertTrue(ex.getMessage().indexOf("CLI-162") != -1);
        }
    }

    @Test
    public void findWrapPos_givenStartPosPlusWidthExceedingLength_shouldReturnMinusOne()
    {
        int pos = formatter.findWrapPos("short", 10, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenExactLengthWithoutWhitespace_shouldReturnMinusOne()
    {
        int pos = formatter.findWrapPos("1234567890", 5, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenSpaceBeforeWidth_shouldReturnFirstPrecedingSpacePos()
    {
        int pos = formatter.findWrapPos("hello world example", 12, 0);
        Assert.assertEquals(11, pos);
    }

    @Test
    public void findWrapPos_givenNewlineDelimiterWithinWidth_shouldReturnPosPlusOne()
    {
        int pos = formatter.findWrapPos("hello\nworld", 10, 0);
        Assert.assertEquals(6, pos);
    }

    @Test
    public void findWrapPos_givenTabDelimiterWithinWidth_shouldReturnPosPlusOne()
    {
        int pos = formatter.findWrapPos("hello\tworld", 10, 0);
        Assert.assertEquals(6, pos);
    }

    @Test
    public void createPadding_givenVariousLengths_shouldGenerateExpectedSpaceCount()
    {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals(" ", formatter.createPadding(1));
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void rtrim_givenNullOrEmptyString_shouldReturnOriginal()
    {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void rtrim_givenTrailingWhitespace_shouldTrimTrailingWhitespaceOnly()
    {
        Assert.assertEquals("  text", formatter.rtrim("  text   \t \n"));
        Assert.assertEquals("no-whitespace", formatter.rtrim("no-whitespace"));
    }
}