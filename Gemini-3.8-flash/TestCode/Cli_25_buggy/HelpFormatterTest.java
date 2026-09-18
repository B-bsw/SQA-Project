package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    public void testGettersAndSetters_givenCustomValues_shouldReturnConfiguredValues()
    {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());

        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());

        formatter.setDescPadding(7);
        Assert.assertEquals(7, formatter.getDescPadding());

        formatter.setSyntaxPrefix("Usage: ");
        Assert.assertEquals("Usage: ", formatter.getSyntaxPrefix());

        formatter.setNewLine("\r\n");
        Assert.assertEquals("\r\n", formatter.getNewLine());

        formatter.setOptPrefix("+");
        Assert.assertEquals("+", formatter.getOptPrefix());

        formatter.setLongOptPrefix("++");
        Assert.assertEquals("++", formatter.getLongOptPrefix());

        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void setOptionComparator_givenNull_shouldResetToDefaultComparator()
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
    public void printHelp_givenNullCmdLineSyntax_shouldThrowIllegalArgumentException()
    {
        try
        {
            formatter.printHelp(printWriter, 80, null, "header", new Options(), 1, 3, "footer", false);
            Assert.fail("Expected IllegalArgumentException for null cmdLineSyntax");
        }
        catch (IllegalArgumentException e)
        {
            Assert.assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void printHelp_givenEmptyCmdLineSyntax_shouldThrowIllegalArgumentException()
    {
        try
        {
            formatter.printHelp(printWriter, 80, "", "header", new Options(), 1, 3, "footer", false);
            Assert.fail("Expected IllegalArgumentException for empty cmdLineSyntax");
        }
        catch (IllegalArgumentException e)
        {
            Assert.assertEquals("cmdLineSyntax not provided", e.getMessage());
        }
    }

    @Test
    public void printHelp_givenCompleteParametersWithoutAutoUsage_shouldFormatCorrectly()
    {
        Options options = new Options();
        options.addOption("a", "alpha", false, "Alpha description");

        formatter.printHelp(printWriter, 80, "myapp -a", "Header text", options, 2, 4, "Footer text", false);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: myapp -a") != -1);
        Assert.assertTrue(output.indexOf("Header text") != -1);
        Assert.assertTrue(output.indexOf("-a,--alpha") != -1);
        Assert.assertTrue(output.indexOf("Alpha description") != -1);
        Assert.assertTrue(output.indexOf("Footer text") != -1);
    }

    @Test
    public void printHelp_givenNullAndWhitespaceHeaderFooter_shouldOmitHeaderAndFooter()
    {
        Options options = new Options();
        options.addOption("b", false, "Beta description");

        formatter.printHelp(printWriter, 80, "myapp", "   ", options, 1, 2, null, false);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: myapp") != -1);
        Assert.assertTrue(output.indexOf("-b") != -1);
        Assert.assertTrue(output.indexOf("Beta description") != -1);
    }

    @Test
    public void printHelp_givenAutoUsageTrue_shouldAutoGenerateUsage()
    {
        Options options = new Options();
        options.addOption("c", "config", true, "Config file");

        formatter.printHelp(printWriter, 80, "appname", null, options, 1, 3, null, true);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: appname [-c <config>]") != -1 || output.indexOf("usage: appname [-c <arg>]") != -1);
    }

    @Test
    public void printHelp_usingOverloadedMethods_shouldDelegateCorrectly()
    {
        Options options = new Options();
        options.addOption("h", "help", false, "Print help");

        formatter.printHelp(printWriter, 80, "cmd", "hdr", options, 1, 2, "ftr");
        printWriter.flush();
        Assert.assertTrue(stringWriter.toString().indexOf("usage: cmd") != -1);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try
        {
            System.setOut(new PrintStream(baos));

            formatter.printHelp("cmd", options);
            formatter.printHelp("cmd", options, true);
            formatter.printHelp("cmd", "header", options, "footer");
            formatter.printHelp("cmd", "header", options, "footer", true);
            formatter.printHelp(70, "cmd", "header", options, "footer");
            formatter.printHelp(70, "cmd", "header", options, "footer", true);
        }
        finally
        {
            System.setOut(originalOut);
        }

        String sysOutText = baos.toString();
        Assert.assertTrue(sysOutText.indexOf("usage: cmd") != -1);
    }

    @Test
    public void printUsage_givenOptionsAndOptionGroup_shouldFormatGroupCorrectly()
    {
        Options options = new Options();
        Option optA = new Option("a", "first option");
        Option optB = new Option("b", "second option");
        OptionGroup group = new OptionGroup();
        group.addOption(optA);
        group.addOption(optB);
        group.setRequired(false);
        options.addOptionGroup(group);

        Option requiredOpt = new Option("r", "req", false, "required option");
        requiredOpt.setRequired(true);
        options.addOption(requiredOpt);

        Option longOnlyOpt = new Option(null, "longonly", true, "long only option");
        longOnlyOpt.setArgName("FILE");
        options.addOption(longOnlyOpt);

        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("[-a | -b]") != -1);
        Assert.assertTrue(output.indexOf("-r") != -1);
        Assert.assertTrue(output.indexOf("[--longonly <FILE>]") != -1);
    }

    @Test
    public void printUsage_givenRequiredOptionGroup_shouldFormatWithoutEnclosingBrackets()
    {
        Options options = new Options();
        Option optX = new Option("x", false, "option X");
        Option optY = new Option("y", false, "option Y");
        OptionGroup group = new OptionGroup();
        group.addOption(optX);
        group.addOption(optY);
        group.setRequired(true);
        options.addOptionGroup(group);

        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("-x | -y") != -1);
        Assert.assertTrue(output.indexOf("[-x | -y]") == -1);
    }

    @Test
    public void printUsage_givenCommandLineWithoutSpaces_shouldFormatCorrectly()
    {
        formatter.printUsage(printWriter, 80, "singlecommand");
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertEquals("usage: singlecommand" + formatter.getNewLine(), output);
    }

    @Test
    public void printUsage_givenCommandLineWithSpaces_shouldIndentCorrectly()
    {
        formatter.printUsage(printWriter, 80, "command arg1 arg2");
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertEquals("usage: command arg1 arg2" + formatter.getNewLine(), output);
    }

    @Test
    public void renderOptions_givenOptionsWithoutShortOptAndWithoutDescription_shouldRenderProperly()
    {
        Options options = new Options();
        Option longOnly = new Option(null, "onlylong", false, null);
        options.addOption(longOnly);

        Option shortOptWithArgNoName = new Option("v", true, "Verbose level");
        shortOptWithArgNoName.setArgName(null);
        options.addOption(shortOptWithArgNoName);

        StringBuffer sb = new StringBuffer();
        formatter.renderOptions(sb, 80, options, 1, 3);
        String rendered = sb.toString();

        Assert.assertTrue(rendered.indexOf("--onlylong") != -1);
        Assert.assertTrue(rendered.indexOf("-v") != -1);
        Assert.assertTrue(rendered.indexOf("Verbose level") != -1);
    }

    @Test
    public void renderWrappedText_givenShortText_shouldNotWrap()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 50, 0, "Simple short string");
        Assert.assertEquals("Simple short string", sb.toString());
    }

    @Test
    public void renderWrappedText_givenTabStopExceedingWidth_shouldAdjustTabStop()
    {
        StringBuffer sb = new StringBuffer();
        String text = "First line that is sufficiently long to trigger a wrap and move down to next line.";
        formatter.renderWrappedText(sb, 30, 35, text);

        String result = sb.toString();
        Assert.assertTrue(result.indexOf(formatter.getNewLine()) != -1);
    }

    @Test
    public void renderWrappedText_givenUnbreakableWordExceedingWidth_shouldForceWrapAtWidth()
    {
        StringBuffer sb = new StringBuffer();
        String text = "abc " + "123456789012345678901234567890";
        formatter.renderWrappedText(sb, 10, 5, text);

        String result = sb.toString();
        Assert.assertTrue(result.indexOf(formatter.getNewLine()) != -1);
    }

    @Test
    public void printWrapped_givenTextAndTabStop_shouldPrintToPrintWriter()
    {
        formatter.printWrapped(printWriter, 40, "Single wrapped line");
        formatter.printWrapped(printWriter, 40, 4, "Another wrapped line");
        printWriter.flush();

        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("Single wrapped line") != -1);
        Assert.assertTrue(output.indexOf("Another wrapped line") != -1);
    }

    @Test
    public void findWrapPos_givenNewlineOrTabWithinWidth_shouldReturnBreakPosition()
    {
        Assert.assertEquals(5, formatter.findWrapPos("line\none", 10, 0));
        Assert.assertEquals(5, formatter.findWrapPos("line\tone", 10, 0));
    }

    @Test
    public void findWrapPos_givenTextShorterThanWidth_shouldReturnMinusOne()
    {
        Assert.assertEquals(-1, formatter.findWrapPos("short text", 20, 0));
    }

    @Test
    public void findWrapPos_givenSpaceBeforeWidth_shouldBreakAtSpace()
    {
        String text = "The quick brown fox jumps";
        int pos = formatter.findWrapPos(text, 12, 0);
        Assert.assertEquals(9, pos);
    }

    @Test
    public void findWrapPos_givenNoSpaceBeforeWidthButSpaceAfter_shouldBreakAtNextSpace()
    {
        String text = "Supercalifragilisticexpialidocious extra words";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(34, pos);
    }

    @Test
    public void findWrapPos_givenNoSpaceInEntireString_shouldReturnMinusOne()
    {
        String text = "Supercalifragilisticexpialidocious";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void createPadding_givenLength_shouldReturnExactSpaces()
    {
        Assert.assertEquals("", formatter.createPadding(0));
        Assert.assertEquals(" ", formatter.createPadding(1));
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void rtrim_givenVariousStrings_shouldStripTrailingWhitespaceOnly()
    {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
        Assert.assertEquals("", formatter.rtrim("   "));
        Assert.assertEquals("  abc", formatter.rtrim("  abc   \t \n"));
        Assert.assertEquals("abc", formatter.rtrim("abc"));
    }

    @Test
    public void optionComparator_givenOptionsWithDifferentCases_shouldSortAlphabeticallyCaseInsensitive()
    {
        Option optA = new Option("a", "Alpha");
        Option optB = new Option("B", "Beta");
        Option optC = new Option("c", "Charlie");

        Comparator comparator = formatter.getOptionComparator();
        Assert.assertTrue(comparator.compare(optA, optB) < 0);
        Assert.assertTrue(comparator.compare(optB, optA) > 0);
        Assert.assertTrue(comparator.compare(optA, optA) == 0);
        Assert.assertTrue(comparator.compare(optB, optC) < 0);
    }
}