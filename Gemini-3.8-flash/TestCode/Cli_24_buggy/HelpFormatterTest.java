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
    private StringWriter sw;
    private PrintWriter pw;
    private PrintStream originalOut;
    private ByteArrayOutputStream outContent;

    @Before
    public void setUp()
    {
        formatter = new HelpFormatter();
        sw = new StringWriter();
        pw = new PrintWriter(sw);
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
    public void getSetWidth_givenValidWidth_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
        formatter.setWidth(100);
        Assert.assertEquals(100, formatter.getWidth());
    }

    @Test
    public void getSetLeftPadding_givenValidPadding_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, formatter.getLeftPadding());
        formatter.setLeftPadding(5);
        Assert.assertEquals(5, formatter.getLeftPadding());
    }

    @Test
    public void getSetDescPadding_givenValidPadding_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_DESC_PAD, formatter.getDescPadding());
        formatter.setDescPadding(8);
        Assert.assertEquals(8, formatter.getDescPadding());
    }

    @Test
    public void getSetSyntaxPrefix_givenValidPrefix_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, formatter.getSyntaxPrefix());
        formatter.setSyntaxPrefix("Syntax: ");
        Assert.assertEquals("Syntax: ", formatter.getSyntaxPrefix());
    }

    @Test
    public void getSetNewLine_givenValidNewLine_shouldUpdateAndReturn()
    {
        Assert.assertEquals(System.getProperty("line.separator"), formatter.getNewLine());
        formatter.setNewLine("\n");
        Assert.assertEquals("\n", formatter.getNewLine());
    }

    @Test
    public void getSetOptPrefix_givenValidPrefix_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, formatter.getOptPrefix());
        formatter.setOptPrefix("/");
        Assert.assertEquals("/", formatter.getOptPrefix());
    }

    @Test
    public void getSetLongOptPrefix_givenValidPrefix_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, formatter.getLongOptPrefix());
        formatter.setLongOptPrefix("--opt-");
        Assert.assertEquals("--opt-", formatter.getLongOptPrefix());
    }

    @Test
    public void getSetArgName_givenValidName_shouldUpdateAndReturn()
    {
        Assert.assertEquals(HelpFormatter.DEFAULT_ARG_NAME, formatter.getArgName());
        formatter.setArgName("parameter");
        Assert.assertEquals("parameter", formatter.getArgName());
    }

    @Test
    public void getSetOptionComparator_givenCustomComparator_shouldUseCustom()
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
    public void setOptionComparator_givenNull_shouldResetToDefaultComparator()
    {
        formatter.setOptionComparator(null);
        Assert.assertNotNull(formatter.getOptionComparator());

        Option optA = new Option("a", "alpha");
        Option optB = new Option("b", "beta");
        Assert.assertTrue(formatter.getOptionComparator().compare(optA, optB) < 0);
        Assert.assertTrue(formatter.getOptionComparator().compare(optB, optA) > 0);
        Assert.assertEquals(0, formatter.getOptionComparator().compare(optA, optA));
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenNullCmdLineSyntax_shouldThrowException()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, null, "Header", options, 1, 3, "Footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenEmptyCmdLineSyntax_shouldThrowException()
    {
        Options options = new Options();
        formatter.printHelp(pw, 80, "", "Header", options, 1, 3, "Footer", false);
    }

    @Test
    public void printHelp_givenAutoUsageFalseAndHeaderFooter_shouldRenderCompletely()
    {
        Options options = new Options();
        options.addOption("a", false, "description a");

        formatter.printHelp(pw, 80, "app", "Header text", options, 2, 2, "Footer text", false);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.indexOf("usage: app") != -1);
        Assert.assertTrue(output.indexOf("Header text") != -1);
        Assert.assertTrue(output.indexOf("-a") != -1);
        Assert.assertTrue(output.indexOf("description a") != -1);
        Assert.assertTrue(output.indexOf("Footer text") != -1);
    }

    @Test
    public void printHelp_givenNullAndWhitespaceHeaderFooter_shouldNotPrintHeaderFooter()
    {
        Options options = new Options();
        options.addOption("a", false, "desc");

        formatter.printHelp(pw, 80, "app", null, options, 2, 2, "   ", true);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.indexOf("usage: app") != -1);
        Assert.assertTrue(output.indexOf("-a") != -1);
    }

    @Test
    public void printHelp_givenConvenienceOverloads_shouldRouteToPrintHelp()
    {
        Options options = new Options();
        options.addOption("h", "help", false, "display help");

        formatter.printHelp("app", options);
        formatter.printHelp("app", options, true);
        formatter.printHelp("app", "header", options, "footer");
        formatter.printHelp("app", "header", options, "footer", true);
        formatter.printHelp(80, "app", "header", options, "footer");
        formatter.printHelp(80, "app", "header", options, "footer", true);

        String consoleOutput = outContent.toString();
        Assert.assertTrue(consoleOutput.length() > 0);
        Assert.assertTrue(consoleOutput.indexOf("usage: app") != -1);

        formatter.printHelp(pw, 80, "app", "header", options, 1, 3, "footer");
        pw.flush();
        Assert.assertTrue(sw.toString().indexOf("usage: app") != -1);
    }

    @Test
    public void printUsage_givenOptionsWithOptionGroup_shouldFormatCorrectly()
    {
        Options options = new Options();

        OptionGroup optionalGroup = new OptionGroup();
        optionalGroup.setRequired(false);
        Option optA = new Option("a", "alpha", false, "alpha desc");
        Option optB = new Option("b", false, "beta desc");
        optionalGroup.addOption(optA);
        optionalGroup.addOption(optB);
        options.addOptionGroup(optionalGroup);

        OptionGroup requiredGroup = new OptionGroup();
        requiredGroup.setRequired(true);
        Option optC = new Option("c", true, "gamma desc");
        optC.setArgName("val");
        Option optD = new Option(null, "delta", false, "delta desc");
        requiredGroup.addOption(optC);
        requiredGroup.addOption(optD);
        options.addOptionGroup(requiredGroup);

        Option regularRequired = new Option("r", false, "required option");
        regularRequired.setRequired(true);
        options.addOption(regularRequired);

        Option regularOptional = new Option("o", true, "optional option");
        regularOptional.setArgName("param");
        options.addOption(regularOptional);

        formatter.printUsage(pw, 120, "myapp", options);
        pw.flush();

        String usage = sw.toString();
        Assert.assertTrue(usage.indexOf("usage: myapp ") != -1);
        Assert.assertTrue(usage.indexOf("[-a | -b]") != -1 || usage.indexOf("[-b | -a]") != -1);
        Assert.assertTrue(usage.indexOf("-r") != -1);
        Assert.assertTrue(usage.indexOf("[-o <param>]") != -1);
        Assert.assertTrue(usage.indexOf("--delta") != -1);
        Assert.assertTrue(usage.indexOf("-c <val>") != -1);
    }

    @Test
    public void printUsage_givenAppWithoutSpaces_shouldWrapCorrectly()
    {
        formatter.printUsage(pw, 80, "myapp");
        pw.flush();
        Assert.assertEquals("usage: myapp" + System.getProperty("line.separator"), sw.toString());
    }

    @Test
    public void printUsage_givenAppWithArguments_shouldFormatAndWrap()
    {
        formatter.printUsage(pw, 80, "myapp arg1 arg2");
        pw.flush();
        Assert.assertEquals("usage: myapp arg1 arg2" + System.getProperty("line.separator"), sw.toString());
    }

    @Test
    public void printOptions_givenVariousOptionTypes_shouldRenderAligned()
    {
        Options options = new Options();
        Option longOnly = new Option(null, "config", true, "Configuration file");
        longOnly.setArgName("file");
        options.addOption(longOnly);

        Option shortAndLong = new Option("v", "verbose", false, "Verbose mode");
        options.addOption(shortAndLong);

        Option shortOnlyWithArg = new Option("x", true, "Extract");
        options.addOption(shortOnlyWithArg);

        Option noDesc = new Option("n", false, null);
        options.addOption(noDesc);

        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();

        String output = sw.toString();
        Assert.assertTrue(output.indexOf("--config <file>") != -1);
        Assert.assertTrue(output.indexOf("-v,--verbose") != -1);
        Assert.assertTrue(output.indexOf("-x ") != -1);
        Assert.assertTrue(output.indexOf("-n") != -1);
        Assert.assertTrue(output.indexOf("Verbose mode") != -1);
    }

    @Test
    public void printWrapped_givenSimpleText_shouldPrintFormatted()
    {
        formatter.printWrapped(pw, 80, "Simple wrapped text");
        pw.flush();
        Assert.assertEquals("Simple wrapped text" + System.getProperty("line.separator"), sw.toString());
    }

    @Test
    public void printWrapped_givenLongText_shouldWrapWithIndent()
    {
        String longText = "This is a long description text that definitely exceeds thirty chars limit";
        formatter.printWrapped(pw, 30, 4, longText);
        pw.flush();

        String result = sw.toString();
        String[] lines = result.split(System.getProperty("line.separator"));
        Assert.assertTrue(lines.length > 1);
        Assert.assertTrue(lines[1].startsWith("    "));
    }

    @Test(expected = IllegalStateException.class)
    public void renderWrappedText_givenTabStopGreaterThanWidth_shouldThrowException()
    {
        StringBuffer sb = new StringBuffer();
        String longText = "This is a long text that needs to wrap across lines";
        formatter.renderWrappedText(sb, 20, 25, longText);
    }

    @Test
    public void renderWrappedText_givenPosEqualNextLineTabStopMinusOne_shouldWrapAtWidth()
    {
        StringBuffer sb = new StringBuffer();
        int width = 10;
        int nextLineTabStop = 5;
        String text = "12345 67890 1234567890";
        formatter.renderWrappedText(sb, width, nextLineTabStop, text);
        Assert.assertTrue(sb.length() > 0);
    }

    @Test
    public void findWrapPos_givenNewlineWithinWidth_shouldReturnNewlineIndexPlusOne()
    {
        String text = "first line\nsecond line";
        int pos = formatter.findWrapPos(text, 20, 0);
        Assert.assertEquals(text.indexOf('\n') + 1, pos);
    }

    @Test
    public void findWrapPos_givenTabWithinWidth_shouldReturnTabIndexPlusOne()
    {
        String text = "first\tsecond line";
        int pos = formatter.findWrapPos(text, 20, 0);
        Assert.assertEquals(text.indexOf('\t') + 1, pos);
    }

    @Test
    public void findWrapPos_givenTextFitsWidth_shouldReturnNegativeOne()
    {
        String text = "short text";
        int pos = formatter.findWrapPos(text, 20, 0);
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenBreakOnSpace_shouldReturnSpaceIndex()
    {
        String text = "this is a very long string that should break at space";
        int pos = formatter.findWrapPos(text, 15, 0);
        Assert.assertTrue(pos <= 15);
        Assert.assertEquals(' ', text.charAt(pos));
    }

    @Test
    public void findWrapPos_givenUnbreakableWordExceedingWidth_shouldFindNextDelimiter()
    {
        String text = "supercalifragilisticexpialidocious and more words";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(text.indexOf(" and"), pos);
    }

    @Test
    public void findWrapPos_givenEntireStringWithoutBreak_shouldReturnNegativeOne()
    {
        String text = "supercalifragilisticexpialidocious";
        int pos = formatter.findWrapPos(text, 10, 0);
        Assert.assertEquals(-1, pos);
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
    public void rtrim_givenNullOrEmpty_shouldReturnSame()
    {
        Assert.assertNull(formatter.rtrim(null));
        Assert.assertEquals("", formatter.rtrim(""));
    }

    @Test
    public void rtrim_givenTrailingWhitespace_shouldTrimWhitespaceOnly()
    {
        Assert.assertEquals("  abc", formatter.rtrim("  abc   \t\n\r"));
        Assert.assertEquals("abc", formatter.rtrim("abc"));
    }
}