package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelpFormatterTest
{
    private HelpFormatter formatter;
    private StringWriter stringWriter;
    private PrintWriter printWriter;
    private PrintStream originalOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        stringWriter = new StringWriter();
        printWriter = new PrintWriter(stringWriter);
        originalOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown()
    {
        System.setOut(originalOut);
    }

    @Test
    public void defaultValues_givenNewInstance_shouldMatchDefaults()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        Assert.assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        Assert.assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        Assert.assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        Assert.assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        Assert.assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        Assert.assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        Assert.assertEquals(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, formatter.getLongOptSeparator());
        Assert.assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        Assert.assertNotNull(formatter.getOptionComparator());
    }

    @Test
    public void setWidth_givenNewWidth_shouldUpdateWidth()
    {
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());
    }

    @Test
    public void setLeftPadding_givenNewPadding_shouldUpdateLeftPadding()
    {
        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void setDescPadding_givenNewPadding_shouldUpdateDescPadding()
    {
        formatter.setDescPadding(8);
        Assert.assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void setSyntaxPrefix_givenNewPrefix_shouldUpdateSyntaxPrefix()
    {
        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void setNewLine_givenNewSeparator_shouldUpdateNewLine()
    {
        formatter.setNewLine("\n");
        Assert.assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void setOptPrefix_givenNewPrefix_shouldUpdateOptPrefix()
    {
        formatter.setOptPrefix("/");
        Assert.assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void setLongOptPrefix_givenNewPrefix_shouldUpdateLongOptPrefix()
    {
        formatter.setLongOptPrefix("//");
        Assert.assertEquals("//", formatter.getLongOptPrefix());
    }

    @Test
    public void setLongOptSeparator_givenNewSeparator_shouldUpdateLongOptSeparator()
    {
        formatter.setLongOptSeparator("=");
        Assert.assertEquals("=", formatter.getLongOptSeparator());
    }

    @Test
    public void setArgName_givenNewArgName_shouldUpdateArgName()
    {
        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void setOptionComparator_givenNull_shouldResetToDefaultComparator()
    {
        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());
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
        Assert.assertSame(customComparator, formatter.getOptionComparator());
    }

    @Test
    public void optionComparator_givenDifferentOptionKeys_shouldSortCaseInsensitively()
    {
        Comparator comp = formatter.getOptionComparator();
        Option optA = new Option("a", "description A");
        Option optB = new Option("B", "description B");
        Option optSame = new Option("A", "description A uppercase");

        Assert.assertTrue(comp.compare(optA, optB) < 0);
        Assert.assertTrue(comp.compare(optB, optA) > 0);
        Assert.assertEquals(0, comp.compare(optA, optSame));
    }

    @Test
    public void rtrim_givenNull_shouldReturnNull()
    {
        Assert.assertNull(formatter.rtrim(null));
    }

    @Test
    public void rtrim_givenEmptyString_shouldReturnEmptyString()
    {
        Assert.assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void rtrim_givenStringWithTrailingSpaces_shouldTrimTrailingSpacesOnly()
    {
        Assert.assertEquals("  text", formatter.rtrim("  text   "));
    }

    @Test
    public void rtrim_givenStringWithoutTrailingSpaces_shouldReturnUnmodifiedString()
    {
        Assert.assertEquals("text", formatter.rtrim("text"));
    }

    @Test
    public void rtrim_givenAllWhitespaceString_shouldReturnEmptyString()
    {
        Assert.assertEquals("", formatter.rtrim("     "));
    }

    @Test
    public void createPadding_givenLengthZero_shouldReturnEmptyString()
    {
        Assert.assertEquals("", formatter.createPadding(0));
    }

    @Test
    public void createPadding_givenPositiveLength_shouldReturnSpaces()
    {
        Assert.assertEquals("   ", formatter.createPadding(3));
    }

    @Test
    public void findWrapPos_givenNewlineWithinWidth_shouldReturnPositionAfterNewline()
    {
        String text = "hello\nworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(6, pos);
    }

    @Test
    public void findWrapPos_givenTabWithinWidth_shouldReturnPositionAfterTab()
    {
        String text = "hello\tworld";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(6, pos);
    }

    @Test
    public void findWrapPos_givenTextLengthWithinWidth_shouldReturnMinusOne()
    {
        String text = "hello";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenSpaceBeforeWidthBoundary_shouldReturnSpaceIndex()
    {
        String text = "quick brown fox";
        int pos = formatter.findWrapPos(text, 8, 0);
        Assert.assertEquals(5, pos);
    }

    @Test
    public void findWrapPos_givenContinuousWordExceedingWidthWithSpaceLater_shouldReturnNextSpace()
    {
        String text = "supercalifragilisticexpialidocious is a long word";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(34, pos);
    }

    @Test
    public void findWrapPos_givenContinuousWordWithoutAnySpace_shouldReturnMinusOne()
    {
        String text = "supercalifragilisticexpialidocious";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void renderWrappedText_givenSingleLineText_shouldAppendTrimmedText()
    {
        StringBuffer sb = new StringBuffer();
        formatter.renderWrappedText(sb, 50, 0, "short text   ");
        Assert.assertEquals("short text", sb.toString());
    }

    @Test
    public void renderWrappedText_givenMultiLineText_shouldWrapWithPadding()
    {
        StringBuffer sb = new StringBuffer();
        formatter.setNewLine("\n");
        formatter.renderWrappedText(sb, 12, 2, "hello beautiful world");
        String expected = "hello\n  beautiful\n  world";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_givenTabStopGreaterThanOrEqualToWidth_shouldResetTabStopToOne()
    {
        StringBuffer sb = new StringBuffer();
        formatter.setNewLine("\n");
        formatter.renderWrappedText(sb, 10, 10, "hello world test");
        String expected = "hello\n world\n test";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_givenWordExceedingWidthAtTabStopBoundary_shouldBreakAtWidth()
    {
        StringBuffer sb = new StringBuffer();
        formatter.setNewLine("\n");
        formatter.renderWrappedText(sb, 8, 3, "abc 1234567890");
        String expected = "abc\n   12345\n   67890";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void printWrapped_givenTextAndWidth_shouldPrintWithNewline()
    {
        formatter.printWrapped(printWriter, 20, "simple line");
        printWriter.flush();
        String expected = "simple line" + System.getProperty("line.separator");
        Assert.assertEquals(expected, stringWriter.toString());
    }

    @Test
    public void printWrapped_givenTabStopTextAndWidth_shouldPrintWrapped()
    {
        formatter.printWrapped(printWriter, 12, 2, "hello beautiful world");
        printWriter.flush();
        String separator = System.getProperty("line.separator");
        Assert.assertTrue(stringWriter.toString().startsWith("hello" + separator + "  beautiful"));
    }

    @Test
    public void printUsage_givenSyntaxWithSpace_shouldWrapAtFirstArgument()
    {
        formatter.printUsage(printWriter, 40, "app arg1 arg2 arg3");
        printWriter.flush();
        Assert.assertTrue(stringWriter.toString().startsWith(formatter.getSyntaxPrefix() + "app arg1"));
    }

    @Test
    public void printUsage_givenSyntaxWithoutSpace_shouldPrintDirectly()
    {
        formatter.printUsage(printWriter, 40, "app");
        printWriter.flush();
        Assert.assertEquals(formatter.getSyntaxPrefix() + "app" + System.getProperty("line.separator"), stringWriter.toString());
    }

    @Test
    public void printUsage_givenOptionsAndOptionGroup_shouldFormatCorrectly()
    {
        Options options = new Options();
        Option optA = new Option("a", "alpha", false, "desc A");
        Option optB = new Option("b", "beta", true, "desc B");
        optB.setRequired(true);
        optB.setArgName("val");

        OptionGroup group = new OptionGroup();
        Option optC = new Option("c", false, "desc C");
        Option optD = new Option(null, "delta", true, "desc D");
        optD.setArgName("dval");
        group.addOption(optC);
        group.addOption(optD);

        options.addOption(optA);
        options.addOption(optB);
        options.addOptionGroup(group);

        formatter.printUsage(printWriter, 80, "myApp", options);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("usage: myApp"));
        Assert.assertTrue(result.contains("[-a]"));
        Assert.assertTrue(result.contains("-b <val>"));
        Assert.assertTrue(result.contains("[-c | --delta <dval>]"));
    }

    @Test
    public void printUsage_givenRequiredOptionGroup_shouldFormatWithoutSquareBrackets()
    {
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optX = new Option("x", false, "desc X");
        Option optY = new Option("y", false, "desc Y");
        group.addOption(optX);
        group.addOption(optY);
        options.addOptionGroup(group);

        formatter.printUsage(printWriter, 80, "groupApp", options);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("-x | -y"));
        Assert.assertFalse(result.contains("[-x | -y]"));
    }

    @Test
    public void printUsage_givenOptionWithLongOptOnlyAndNoArgName_shouldFormatCorrectly()
    {
        Options options = new Options();
        Option optLongOnly = new Option(null, "verbose", false, "verbose mode");
        options.addOption(optLongOnly);

        formatter.printUsage(printWriter, 80, "app", options);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("[--verbose]"));
    }

    @Test
    public void renderOptions_givenVariousOptionConfigurations_shouldRenderAlignedColumns()
    {
        Options options = new Options();
        Option optShortOnly = new Option("s", false, "short only");
        Option optShortAndLong = new Option("m", "multi", false, "short and long");
        Option optLongOnly = new Option(null, "longonly", false, "long only");
        Option optWithArgCustomName = new Option("c", "custom", true, "custom arg");
        optWithArgCustomName.setArgName("customName");
        Option optWithArgDefaultName = new Option("d", "default", true, "default arg");
        Option optWithArgEmptyName = new Option("e", "empty", true, "empty arg");
        optWithArgEmptyName.setArgName("");
        Option optNoDesc = new Option("n", false, null);

        options.addOption(optShortOnly);
        options.addOption(optShortAndLong);
        options.addOption(optLongOnly);
        options.addOption(optWithArgCustomName);
        options.addOption(optWithArgDefaultName);
        options.addOption(optWithArgEmptyName);
        options.addOption(optNoDesc);

        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("-s"));
        Assert.assertTrue(result.contains("-m,--multi"));
        Assert.assertTrue(result.contains("--longonly"));
        Assert.assertTrue(result.contains("-c,--custom <customName>"));
        Assert.assertTrue(result.contains("-d,--default <arg>"));
        Assert.assertTrue(result.contains("-e,--empty "));
        Assert.assertTrue(result.contains("-n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenNullSyntax_shouldThrowIllegalArgumentException()
    {
        formatter.printHelp(printWriter, 80, null, "header", new Options(), 1, 3, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenEmptySyntax_shouldThrowIllegalArgumentException()
    {
        formatter.printHelp(printWriter, 80, "", "header", new Options(), 1, 3, "footer", false);
    }

    @Test
    public void printHelp_givenAutoUsageTrueAndFullHeaders_shouldRenderAllSections()
    {
        Options options = new Options();
        options.addOption(new Option("h", "help", false, "print help"));

        formatter.printHelp(printWriter, 80, "app", "Header Message", options, 1, 3, "Footer Message", true);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("usage: app [-h]"));
        Assert.assertTrue(result.contains("Header Message"));
        Assert.assertTrue(result.contains("-h,--help   print help"));
        Assert.assertTrue(result.contains("Footer Message"));
    }

    @Test
    public void printHelp_givenAutoUsageFalseAndBlankHeaderFooter_shouldOmitHeaderAndFooter()
    {
        Options options = new Options();
        options.addOption(new Option("v", false, "version"));

        formatter.printHelp(printWriter, 80, "app", "   ", options, 1, 3, null, false);
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("usage: app"));
        Assert.assertFalse(result.contains("   \n"));
        Assert.assertTrue(result.contains("-v   version"));
    }

    @Test
    public void printHelp_givenOverloadWithoutAutoUsage_shouldDefaultToFalse()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "alpha"));

        formatter.printHelp(printWriter, 80, "app", "header", options, 1, 3, "footer");
        printWriter.flush();
        String result = stringWriter.toString();

        Assert.assertTrue(result.contains("usage: app"));
        Assert.assertFalse(result.contains("usage: app [-a]"));
    }

    @Test
    public void printHelp_givenSimpleSyntaxAndOptions_shouldUseDefaults()
    {
        Options options = new Options();
        options.addOption(new Option("a", false, "alpha"));

        formatter.printHelp("app", options);
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("-a   alpha"));
    }

    @Test
    public void printHelp_givenSyntaxOptionsAndAutoUsage_shouldRespectAutoUsage()
    {
        Options options = new Options();
        options.addOption(new Option("b", false, "beta"));

        formatter.printHelp("app", options, true);
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app [-b]"));
    }

    @Test
    public void printHelp_givenSyntaxHeaderOptionsAndFooter_shouldFormatProperly()
    {
        Options options = new Options();
        options.addOption(new Option("c", false, "charlie"));

        formatter.printHelp("app", "Start", options, "End");
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("Start"));
        Assert.assertTrue(output.contains("-c   charlie"));
        Assert.assertTrue(output.contains("End"));
    }

    @Test
    public void printHelp_givenSyntaxHeaderOptionsFooterAndAutoUsage_shouldFormatProperly()
    {
        Options options = new Options();
        options.addOption(new Option("d", false, "delta"));

        formatter.printHelp("app", "Header", options, "Footer", true);
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app [-d]"));
        Assert.assertTrue(output.contains("Header"));
        Assert.assertTrue(output.contains("Footer"));
    }

    @Test
    public void printHelp_givenWidthSyntaxHeaderOptionsAndFooter_shouldFormatProperly()
    {
        Options options = new Options();
        options.addOption(new Option("e", false, "echo"));

        formatter.printHelp(60, "app", "Header", options, "Footer");
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app"));
        Assert.assertTrue(output.contains("-e   echo"));
    }

    @Test
    public void printHelp_givenAllParameters_shouldFormatProperly()
    {
        Options options = new Options();
        options.addOption(new Option("f", false, "foxtrot"));

        formatter.printHelp(60, "app", "Header", options, "Footer", true);
        String output = outContent.toString();

        Assert.assertTrue(output.contains("usage: app [-f]"));
        Assert.assertTrue(output.contains("foxtrot"));
    }
}