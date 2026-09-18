package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void getWidth_default_shouldReturnDefaultWidth() {
        // Arrange & Act
        int width = formatter.getWidth();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, width);
    }

    @Test
    public void setWidth_givenCustomWidth_shouldUpdateWidth() {
        // Arrange
        int customWidth = 100;

        // Act
        formatter.setWidth(customWidth);

        // Assert
        Assert.assertEquals(customWidth, formatter.getWidth());
    }

    @Test
    public void getLeftPadding_default_shouldReturnDefaultLeftPadding() {
        // Arrange & Act
        int leftPad = formatter.getLeftPadding();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_LEFT_PAD, leftPad);
    }

    @Test
    public void setLeftPadding_givenCustomPadding_shouldUpdateLeftPadding() {
        // Arrange
        int customPad = 5;

        // Act
        formatter.setLeftPadding(customPad);

        // Assert
        Assert.assertEquals(customPad, formatter.getLeftPadding());
    }

    @Test
    public void getDescPadding_default_shouldReturnDefaultDescPadding() {
        // Arrange & Act
        int descPad = formatter.getDescPadding();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_DESC_PAD, descPad);
    }

    @Test
    public void setDescPadding_givenCustomPadding_shouldUpdateDescPadding() {
        // Arrange
        int customPad = 8;

        // Act
        formatter.setDescPadding(customPad);

        // Assert
        Assert.assertEquals(customPad, formatter.getDescPadding());
    }

    @Test
    public void getSyntaxPrefix_default_shouldReturnDefaultSyntaxPrefix() {
        // Arrange & Act
        String prefix = formatter.getSyntaxPrefix();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_SYNTAX_PREFIX, prefix);
    }

    @Test
    public void setSyntaxPrefix_givenCustomPrefix_shouldUpdateSyntaxPrefix() {
        // Arrange
        String customPrefix = "SYNTAX: ";

        // Act
        formatter.setSyntaxPrefix(customPrefix);

        // Assert
        Assert.assertEquals(customPrefix, formatter.getSyntaxPrefix());
    }

    @Test
    public void getNewLine_default_shouldReturnSystemLineSeparator() {
        // Arrange & Act
        String nl = formatter.getNewLine();

        // Assert
        Assert.assertEquals(System.getProperty("line.separator"), nl);
    }

    @Test
    public void setNewLine_givenCustomNewLine_shouldUpdateNewLine() {
        // Arrange
        String customNl = "\n";

        // Act
        formatter.setNewLine(customNl);

        // Assert
        Assert.assertEquals(customNl, formatter.getNewLine());
    }

    @Test
    public void getOptPrefix_default_shouldReturnDefaultOptPrefix() {
        // Arrange & Act
        String optPrefix = formatter.getOptPrefix();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_OPT_PREFIX, optPrefix);
    }

    @Test
    public void setOptPrefix_givenCustomPrefix_shouldUpdateOptPrefix() {
        // Arrange
        String customPrefix = "/";

        // Act
        formatter.setOptPrefix(customPrefix);

        // Assert
        Assert.assertEquals(customPrefix, formatter.getOptPrefix());
    }

    @Test
    public void getLongOptPrefix_default_shouldReturnDefaultLongOptPrefix() {
        // Arrange & Act
        String longOptPrefix = formatter.getLongOptPrefix();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_LONG_OPT_PREFIX, longOptPrefix);
    }

    @Test
    public void setLongOptPrefix_givenCustomPrefix_shouldUpdateLongOptPrefix() {
        // Arrange
        String customPrefix = "--opt-";

        // Act
        formatter.setLongOptPrefix(customPrefix);

        // Assert
        Assert.assertEquals(customPrefix, formatter.getLongOptPrefix());
    }

    @Test
    public void getArgName_default_shouldReturnDefaultArgName() {
        // Arrange & Act
        String argName = formatter.getArgName();

        // Assert
        Assert.assertEquals(HelpFormatter.DEFAULT_ARG_NAME, argName);
    }

    @Test
    public void setArgName_givenCustomArgName_shouldUpdateArgName() {
        // Arrange
        String customArg = "value";

        // Act
        formatter.setArgName(customArg);

        // Assert
        Assert.assertEquals(customArg, formatter.getArgName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenNullCmdLineSyntax_shouldThrowIllegalArgumentException() {
        // Arrange
        Options options = new Options();

        // Act
        formatter.printHelp(printWriter, 80, null, "header", options, 1, 3, "footer", true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenEmptyCmdLineSyntax_shouldThrowIllegalArgumentException() {
        // Arrange
        Options options = new Options();

        // Act
        formatter.printHelp(printWriter, 80, "", "header", options, 1, 3, "footer", true);
    }

    @Test
    public void printHelp_withAllOverloads_shouldExecuteSuccessfully() {
        // Arrange
        Options options = new Options();
        options.addOption("h", "help", false, "display help");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(outContent));

            // Act: test all System.out delegating overloads
            formatter.printHelp("app", options);
            formatter.printHelp("app", options, true);
            formatter.printHelp("app", "header", options, "footer");
            formatter.printHelp("app", "header", options, "footer", true);
            formatter.printHelp(80, "app", "header", options, "footer");
            formatter.printHelp(80, "app", "header", options, "footer", true);

            // Assert
            String output = outContent.toString();
            Assert.assertTrue(output.indexOf("usage: app") != -1);
            Assert.assertTrue(output.indexOf("--help") != -1);
        } finally {
            System.setOut(originalOut);
        }
    }

    @Test
    public void printHelp_givenPrintWriterOverloadWithoutAutoUsage_shouldCallCorrectDelegate() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "version", false, "show version");

        // Act
        formatter.printHelp(printWriter, 80, "myapp", "header", options, 2, 4, "footer");
        printWriter.flush();

        // Assert
        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: myapp") != -1);
        Assert.assertTrue(output.indexOf("header") != -1);
        Assert.assertTrue(output.indexOf("-v,--version") != -1);
        Assert.assertTrue(output.indexOf("footer") != -1);
    }

    @Test
    public void printHelp_givenEmptyHeaderAndFooter_shouldNotPrintHeaderOrFooter() {
        // Arrange
        Options options = new Options();
        options.addOption("a", false, "description a");

        // Act
        formatter.printHelp(printWriter, 80, "cmd", "   ", options, 1, 3, "", false);
        printWriter.flush();

        // Assert
        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("usage: cmd") != -1);
        Assert.assertTrue(output.indexOf("-a") != -1);
    }

    @Test
    public void printUsage_givenSimpleCommandLine_shouldPrintWrappedUsage() {
        // Arrange
        String cmdLine = "app param1 param2";

        // Act
        formatter.printUsage(printWriter, 80, cmdLine);
        printWriter.flush();

        // Assert
        String output = stringWriter.toString();
        Assert.assertEquals("usage: app param1 param2" + formatter.getNewLine(), output);
    }

    @Test
    public void printUsage_withOptionsAndOptionGroups_shouldFormatProperly() {
        // Arrange
        Options options = new Options();

        Option optA = new Option("a", "alpha", false, "option a");
        Option optB = new Option("b", "beta", true, "option b");
        optB.setArgName("val");

        OptionGroup reqGroup = new OptionGroup();
        reqGroup.setRequired(true);
        reqGroup.addOption(optA);
        reqGroup.addOption(optB);

        Option optC = new Option(null, "config", false, "option c");
        Option optD = new Option("d", "debug", true, "option d");
        optD.setArgName(null);

        OptionGroup optGroup = new OptionGroup();
        optGroup.setRequired(false);
        optGroup.addOption(optC);
        optGroup.addOption(optD);

        Option optReq = new Option("r", "require", true, "required option");
        optReq.setRequired(true);
        optReq.setArgName("reqfile");

        Option optNotReq = new Option("n", false, "non-required option");

        Option optLongOnlyReq = new Option(null, "exclusive", false, "long only required");
        optLongOnlyReq.setRequired(true);

        options.addOptionGroup(reqGroup);
        options.addOptionGroup(optGroup);
        options.addOption(optReq);
        options.addOption(optNotReq);
        options.addOption(optLongOnlyReq);

        // Act
        formatter.printUsage(printWriter, 80, "testApp", options);
        printWriter.flush();

        // Assert
        String output = stringWriter.toString();
        Assert.assertTrue(output.startsWith("usage: testApp "));
        Assert.assertTrue(output.indexOf("-a") != -1);
        Assert.assertTrue(output.indexOf("-b <val>") != -1);
        Assert.assertTrue(output.indexOf("[-r <reqfile>]") == -1);
        Assert.assertTrue(output.indexOf("-r <reqfile>") != -1);
        Assert.assertTrue(output.indexOf("[-n]") != -1);
        Assert.assertTrue(output.indexOf("--exclusive") != -1);
        Assert.assertTrue(output.indexOf("[--config | -d]") != -1);
    }

    @Test
    public void renderOptions_withDifferentOptionVariations_shouldCoverAllBranches() {
        // Arrange
        Options options = new Options();

        Option opt1 = new Option(null, "long-only", false, "long only desc");
        Option opt2 = new Option("s", "short-long", false, null);
        Option opt3 = new Option("f", false, "short only desc");
        Option opt4 = new Option("a", "arg-opt", true, "with arg and custom arg name");
        opt4.setArgName("MYARG");
        Option opt5 = new Option("b", "noargname", true, "with arg but blank arg name");
        opt5.setArgName("");

        options.addOption(opt1);
        options.addOption(opt2);
        options.addOption(opt3);
        options.addOption(opt4);
        options.addOption(opt5);

        // Act
        formatter.printOptions(printWriter, 80, options, 2, 4);
        printWriter.flush();

        // Assert
        String output = stringWriter.toString();
        Assert.assertTrue(output.indexOf("--long-only") != -1);
        Assert.assertTrue(output.indexOf("-s,--short-long") != -1);
        Assert.assertTrue(output.indexOf("-f") != -1);
        Assert.assertTrue(output.indexOf("-a,--arg-opt <MYARG>") != -1);
        Assert.assertTrue(output.indexOf("-b,--noargname ") != -1);
    }

    @Test
    public void renderWrappedText_givenShortText_shouldNotWrap() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "Simple short text";

        // Act
        formatter.renderWrappedText(sb, 80, 0, text);

        // Assert
        Assert.assertEquals("Simple short text", sb.toString());
    }

    @Test
    public void renderWrappedText_givenTextWithNewlineBeforeWidth_shouldWrapAtNewline() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "Line 1\nLine 2 is longer";

        // Act
        formatter.renderWrappedText(sb, 80, 4, text);

        // Assert
        String expected = "Line 1" + formatter.getNewLine() + "    Line 2 is longer";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_givenTextWithTabBeforeWidth_shouldWrapAtTab() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "Word1\tWord2 and more words";

        // Act
        formatter.renderWrappedText(sb, 80, 2, text);

        // Assert
        String expected = "Word1" + formatter.getNewLine() + "  Word2 and more words";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_givenTextWithMultipleWrapsOnSpaces_shouldWrapCorrectly() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "The quick brown fox jumps over the lazy dog repeatedly and continuously.";

        // Act
        formatter.renderWrappedText(sb, 20, 2, text);

        // Assert
        String output = sb.toString();
        String[] lines = output.split(formatter.getNewLine());
        Assert.assertTrue(lines.length > 1);
        for (int i = 1; i < lines.length; i++) {
            Assert.assertTrue(lines[i].startsWith("  "));
        }
    }

    @Test
    public void renderWrappedText_givenLongWordExceedingWidth_shouldWrapAtWordEnd() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "Supercalifragilisticexpialidocious text";

        // Act
        formatter.renderWrappedText(sb, 10, 0, text);

        // Assert
        String expected = "Supercalifragilisticexpialidocious" + formatter.getNewLine() + "text";
        Assert.assertEquals(expected, sb.toString());
    }

    @Test
    public void renderWrappedText_givenSingleWordExceedingWidth_shouldNotLoopInfinitely() {
        // Arrange
        StringBuffer sb = new StringBuffer();
        String text = "UnbreakableSingleWordLargerThanWidth";

        // Act
        formatter.renderWrappedText(sb, 10, 0, text);

        // Assert
        Assert.assertEquals("UnbreakableSingleWordLargerThanWidth", sb.toString());
    }

    @Test
    public void printWrapped_withTwoArguments_shouldDelegateCorrectly() {
        // Arrange
        String text = "Simple text to print";

        // Act
        formatter.printWrapped(printWriter, 80, text);
        printWriter.flush();

        // Assert
        Assert.assertEquals("Simple text to print" + formatter.getNewLine(), stringWriter.toString());
    }

    @Test
    public void createPadding_givenLengthZero_shouldReturnEmptyString() {
        // Arrange & Act
        String padding = formatter.createPadding(0);

        // Assert
        Assert.assertEquals("", padding);
    }

    @Test
    public void createPadding_givenPositiveLength_shouldReturnSpaces() {
        // Arrange & Act
        String padding = formatter.createPadding(5);

        // Assert
        Assert.assertEquals("     ", padding);
    }

    @Test
    public void rtrim_givenNullString_shouldReturnNull() {
        // Arrange & Act
        String result = formatter.rtrim(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void rtrim_givenEmptyString_shouldReturnEmptyString() {
        // Arrange & Act
        String result = formatter.rtrim("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void rtrim_givenStringWithoutTrailingWhitespace_shouldReturnSameString() {
        // Arrange & Act
        String result = formatter.rtrim("abc");

        // Assert
        Assert.assertEquals("abc", result);
    }

    @Test
    public void rtrim_givenStringWithTrailingWhitespace_shouldTrimOnlyTrailingWhitespace() {
        // Arrange & Act
        String result = formatter.rtrim("  abc \t \n ");

        // Assert
        Assert.assertEquals("  abc", result);
    }

    @Test
    public void rtrim_givenStringWithOnlyWhitespace_shouldReturnEmptyString() {
        // Arrange & Act
        String result = formatter.rtrim("   \t\n\r  ");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void findWrapPos_withCarriageReturnAndNewline_shouldFindWrapPosition() {
        // Arrange
        String text = "first line\r\nsecond line";

        // Act
        int pos = formatter.findWrapPos(text, 12, 0);

        // Assert
        Assert.assertTrue(pos != -1);
    }
}