package org.apache.commons.cli;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Comparator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelpFormatterTest {

    private HelpFormatter formatter;
    private StringWriter out;
    private PrintWriter pw;

    @Before
    public void setUp() {
        formatter = new HelpFormatter();
        out = new StringWriter();
        pw = new PrintWriter(out);
    }

    @After
    public void tearDown() {
        if (pw != null) {
            pw.close();
        }
    }

    @Test
    public void setWidth_givenValidWidth_shouldUpdateWidth() {
        // Arrange
        int expectedWidth = 100;

        // Act
        formatter.setWidth(expectedWidth);

        // Assert
        Assert.assertEquals(expectedWidth, formatter.getWidth());
    }

    @Test
    public void setLeftPadding_givenValidPadding_shouldUpdateLeftPadding() {
        // Arrange
        int expectedPadding = 5;

        // Act
        formatter.setLeftPadding(expectedPadding);

        // Assert
        Assert.assertEquals(expectedPadding, formatter.getLeftPadding());
    }

    @Test
    public void setDescPadding_givenValidPadding_shouldUpdateDescPadding() {
        // Arrange
        int expectedPadding = 8;

        // Act
        formatter.setDescPadding(expectedPadding);

        // Assert
        Assert.assertEquals(expectedPadding, formatter.getDescPadding());
    }

    @Test
    public void setSyntaxPrefix_givenValidPrefix_shouldUpdateSyntaxPrefix() {
        // Arrange
        String expectedPrefix = "syntax: ";

        // Act
        formatter.setSyntaxPrefix(expectedPrefix);

        // Assert
        Assert.assertEquals(expectedPrefix, formatter.getSyntaxPrefix());
    }

    @Test
    public void setNewLine_givenValidNewLine_shouldUpdateNewLine() {
        // Arrange
        String expectedNewLine = "\n";

        // Act
        formatter.setNewLine(expectedNewLine);

        // Assert
        Assert.assertEquals(expectedNewLine, formatter.getNewLine());
    }

    @Test
    public void setOptPrefix_givenValidPrefix_shouldUpdateOptPrefix() {
        // Arrange
        String expectedPrefix = "/";

        // Act
        formatter.setOptPrefix(expectedPrefix);

        // Assert
        Assert.assertEquals(expectedPrefix, formatter.getOptPrefix());
    }

    @Test
    public void setLongOptPrefix_givenValidPrefix_shouldUpdateLongOptPrefix() {
        // Arrange
        String expectedPrefix = "//";

        // Act
        formatter.setLongOptPrefix(expectedPrefix);

        // Assert
        Assert.assertEquals(expectedPrefix, formatter.getLongOptPrefix());
    }

    @Test
    public void setArgName_givenValidName_shouldUpdateArgName() {
        // Arrange
        String expectedArgName = "parameter";

        // Act
        formatter.setArgName(expectedArgName);

        // Assert
        Assert.assertEquals(expectedArgName, formatter.getArgName());
    }

    @Test
    public void setOptionComparator_givenNull_shouldUseDefaultOptionComparator() {
        // Arrange
        formatter.setOptionComparator(null);

        // Act
        Comparator comparator = formatter.getOptionComparator();

        // Assert
        Assert.assertNotNull(comparator);
        Option optA = new Option("a", "Alpha option");
        Option optB = new Option("b", "Beta option");
        Assert.assertTrue(comparator.compare(optA, optB) < 0);
    }

    @Test
    public void setOptionComparator_givenCustomComparator_shouldUseCustomComparator() {
        // Arrange
        Comparator reverseComparator = new Comparator() {
            public int compare(Object o1, Object o2) {
                Option opt1 = (Option) o1;
                Option opt2 = (Option) o2;
                return opt2.getKey().compareToIgnoreCase(opt1.getKey());
            }
        };

        // Act
        formatter.setOptionComparator(reverseComparator);

        // Assert
        Assert.assertSame(reverseComparator, formatter.getOptionComparator());
        Option optA = new Option("a", "Alpha option");
        Option optB = new Option("b", "Beta option");
        Assert.assertTrue(formatter.getOptionComparator().compare(optA, optB) > 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenNullCmdLineSyntax_shouldThrowIllegalArgumentException() {
        // Arrange
        Options options = new Options();

        // Act
        formatter.printHelp(pw, 80, null, "header", options, 2, 2, "footer", false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void printHelp_givenEmptyCmdLineSyntax_shouldThrowIllegalArgumentException() {
        // Arrange
        Options options = new Options();

        // Act
        formatter.printHelp(pw, 80, "", "header", options, 2, 2, "footer", false);
    }

    @Test
    public void printHelp_givenCmdLineSyntaxAndOptions_shouldPrintUsageAndOptions() {
        // Arrange
        Options options = new Options();
        options.addOption("a", "alpha", false, "Desc of alpha");

        // Act
        formatter.printHelp(pw, 80, "app", null, options, 1, 3, null, false);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("usage: app") != -1);
        Assert.assertTrue(result.indexOf("-a,--alpha") != -1);
        Assert.assertTrue(result.indexOf("Desc of alpha") != -1);
    }

    @Test
    public void printHelp_givenCmdLineSyntaxAndOptionsWithAutoUsage_shouldPrintAutoGeneratedUsage() {
        // Arrange
        Options options = new Options();
        Option optA = new Option("a", false, "Desc of a");
        optA.setRequired(true);
        options.addOption(optA);

        // Act
        formatter.printHelp(pw, 80, "myApp", null, options, 1, 3, null, true);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("usage: myApp -a") != -1);
    }

    @Test
    public void printHelp_givenHeaderAndFooter_shouldPrintWrappedHeaderAndFooter() {
        // Arrange
        Options options = new Options();
        options.addOption("h", false, "Help option");
        String header = "--- Header Start ---";
        String footer = "--- Footer End ---";

        // Act
        formatter.printHelp(pw, 80, "app", header, options, 1, 3, footer, false);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf(header) != -1);
        Assert.assertTrue(result.indexOf(footer) != -1);
    }

    @Test
    public void printHelp_givenBlankHeaderAndFooter_shouldSkipHeaderAndFooter() {
        // Arrange
        Options options = new Options();
        options.addOption("h", false, "Help option");
        String blankHeader = "   ";
        String blankFooter = " \t ";

        // Act
        formatter.printHelp(pw, 80, "app", blankHeader, options, 1, 3, blankFooter, false);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("usage: app") != -1);
        Assert.assertTrue(result.indexOf("-h") != -1);
    }

    @Test
    public void printHelp_givenOverloadWithTwoParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp("app", options);

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithThreeParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp("app", options, true);

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithFourParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp("app", "Header", options, "Footer");

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithFiveParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp("app", "Header", options, "Footer", true);

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithWidthAndFiveParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp(60, "app", "Header", options, "Footer");

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithWidthAndSixParams_shouldExecuteWithoutException() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp(60, "app", "Header", options, "Footer", true);

        // Assert - verified no exception thrown
        Assert.assertEquals(HelpFormatter.DEFAULT_WIDTH, formatter.getWidth());
    }

    @Test
    public void printHelp_givenOverloadWithPrintWriterAndEightParams_shouldPrintCorrectly() {
        // Arrange
        Options options = new Options();
        options.addOption("v", "verbose", false, "Verbose mode");

        // Act
        formatter.printHelp(pw, 80, "app", "Header", options, 2, 2, "Footer");
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("Header") != -1);
        Assert.assertTrue(result.indexOf("Footer") != -1);
        Assert.assertTrue(result.indexOf("-v") != -1);
    }

    @Test
    public void printUsage_givenOptionsWithOptionGroup_shouldFormatGroupCorrectly() {
        // Arrange
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(false);
        Option optA = new Option("a", "Alpha");
        Option optB = new Option("b", "Beta");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        // Act
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("[-a | -b]") != -1 || result.indexOf("[-b | -a]") != -1);
    }

    @Test
    public void printUsage_givenRequiredOptionGroup_shouldFormatWithoutSquareBrackets() {
        // Arrange
        Options options = new Options();
        OptionGroup group = new OptionGroup();
        group.setRequired(true);
        Option optA = new Option("a", "Alpha");
        Option optB = new Option("b", "Beta");
        group.addOption(optA);
        group.addOption(optB);
        options.addOptionGroup(group);

        // Act
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("-a | -b") != -1 || result.indexOf("-b | -a") != -1);
        Assert.assertTrue(result.indexOf("[-a | -b]") == -1);
    }

    @Test
    public void printUsage_givenOptionWithArgumentAndArgName_shouldIncludeArgName() {
        // Arrange
        Options options = new Options();
        Option opt = new Option("f", true, "File option");
        opt.setArgName("filename");
        options.addOption(opt);

        // Act
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("[-f <filename>]") != -1);
    }

    @Test
    public void printUsage_givenOptionWithLongOptOnly_shouldFormatWithDoubleDash() {
        // Arrange
        Options options = new Options();
        Option opt = new Option(null, "verbose", false, "Verbose only");
        options.addOption(opt);

        // Act
        formatter.printUsage(pw, 80, "app", options);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("[--verbose]") != -1);
    }

    @Test
    public void printUsage_givenCmdLineSyntaxOnly_shouldPrintCorrectly() {
        // Arrange
        String syntax = "mycommand <file> [options]";

        // Act
        formatter.printUsage(pw, 80, syntax);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf(formatter.getSyntaxPrefix() + syntax) != -1);
    }

    @Test
    public void printOptions_givenMultipleOptions_shouldFormatAndPadAllOptions() {
        // Arrange
        Options options = new Options();
        Option opt1 = new Option("a", "all", false, "Show all files");
        Option opt2 = new Option("f", "file", true, "Specify file");
        opt2.setArgName("path");
        Option opt3 = new Option(null, "config", false, "Config file only");
        options.addOption(opt1);
        options.addOption(opt2);
        options.addOption(opt3);

        // Act
        formatter.printOptions(pw, 80, options, 2, 4);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("-a,--all") != -1);
        Assert.assertTrue(result.indexOf("-f,--file <path>") != -1);
        Assert.assertTrue(result.indexOf("--config") != -1);
        Assert.assertTrue(result.indexOf("Show all files") != -1);
    }

    @Test
    public void printOptions_givenOptionWithArgAndNoArgName_shouldAppendSpace() {
        // Arrange
        Options options = new Options();
        Option opt = new Option("x", true, "Option without arg name");
        opt.setArgName("");
        options.addOption(opt);

        // Act
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("-x ") != -1);
    }

    @Test
    public void printOptions_givenOptionWithNullDescription_shouldRenderWithoutCrashing() {
        // Arrange
        Options options = new Options();
        Option opt = new Option("n", null);
        options.addOption(opt);

        // Act
        formatter.printOptions(pw, 80, options, 1, 3);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("-n") != -1);
    }

    @Test
    public void printWrapped_givenTextFittingWithinWidth_shouldPrintWithoutWrapping() {
        // Arrange
        String text = "Short line of text";

        // Act
        formatter.printWrapped(pw, 80, text);
        pw.flush();
        String result = out.toString().trim();

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void printWrapped_givenTextExceedingWidth_shouldWrapAtWhitespace() {
        // Arrange
        String text = "The quick brown fox jumps over the lazy dog and runs away.";

        // Act
        formatter.printWrapped(pw, 20, 0, text);
        pw.flush();
        String result = out.toString();

        // Assert
        String[] lines = result.split(formatter.getNewLine());
        Assert.assertTrue(lines.length > 1);
        for (int i = 0; i < lines.length; i++) {
            Assert.assertTrue(lines[i].length() <= 20);
        }
    }

    @Test
    public void printWrapped_givenTextWithNewline_shouldBreakAtNewline() {
        // Arrange
        String text = "First line\nSecond line";

        // Act
        formatter.printWrapped(pw, 80, 0, text);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("First line") != -1);
        Assert.assertTrue(result.indexOf("Second line") != -1);
    }

    @Test
    public void printWrapped_givenTextWithTab_shouldBreakAtTab() {
        // Arrange
        String text = "BeforeTab\tAfterTab";

        // Act
        formatter.printWrapped(pw, 80, 0, text);
        pw.flush();
        String result = out.toString();

        // Assert
        Assert.assertTrue(result.indexOf("BeforeTab") != -1);
        Assert.assertTrue(result.indexOf("AfterTab") != -1);
    }

    @Test
    public void printWrapped_givenLongSingleWord_shouldForceBreakWithoutWhitespace() {
        // Arrange
        String text = "SupercalifragilisticexpialidociousLongWord";

        // Act
        formatter.printWrapped(pw, 10, 0, text);
        pw.flush();
        String result = out.toString();

        // Assert
        String[] lines = result.split(formatter.getNewLine());
        Assert.assertTrue(lines.length > 1);
    }

    @Test
    public void printWrapped_givenNextLineTabStop_shouldIndentWrappedLines() {
        // Arrange
        String text = "Line one that is long enough to wrap over to line two";

        // Act
        formatter.printWrapped(pw, 25, 4, text);
        pw.flush();
        String result = out.toString();

        // Assert
        String[] lines = result.split(formatter.getNewLine());
        Assert.assertTrue(lines.length > 1);
        Assert.assertTrue(lines[1].startsWith("    "));
    }

    @Test
    public void findWrapPos_givenStartPosPlusWidthGreaterThanLength_shouldReturnMinusOne() {
        // Arrange
        String text = "Simple text";

        // Act
        int pos = formatter.findWrapPos(text, 50, 0);

        // Assert
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void findWrapPos_givenWhitespaceAtBoundary_shouldReturnBoundaryPos() {
        // Arrange
        String text = "One Two Three";

        // Act
        int pos = formatter.findWrapPos(text, 7, 0);

        // Assert
        Assert.assertEquals(7, pos);
    }

    @Test
    public void findWrapPos_givenNoWhitespaceBeforeWidth_shouldLookAhead() {
        // Arrange
        String text = "VeryLongWordAndThenSome More";

        // Act
        int pos = formatter.findWrapPos(text, 5, 0);

        // Assert
        Assert.assertEquals(23, pos);
    }

    @Test
    public void findWrapPos_givenUnbreakableWordToEnd_shouldReturnMinusOne() {
        // Arrange
        String text = "UnbreakableWordWithoutAnySpace";

        // Act
        int pos = formatter.findWrapPos(text, 10, 0);

        // Assert
        Assert.assertEquals(-1, pos);
    }

    @Test
    public void createPadding_givenZeroLength_shouldReturnEmptyString() {
        // Act
        String padding = formatter.createPadding(0);

        // Assert
        Assert.assertEquals("", padding);
    }

    @Test
    public void createPadding_givenPositiveLength_shouldReturnSpacesOfGivenLength() {
        // Act
        String padding = formatter.createPadding(5);

        // Assert
        Assert.assertEquals("     ", padding);
        Assert.assertEquals(5, padding.length());
    }

    @Test
    public void rtrim_givenNullString_shouldReturnNull() {
        // Act
        String result = formatter.rtrim(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void rtrim_givenEmptyString_shouldReturnEmptyString() {
        // Act
        String result = formatter.rtrim("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void rtrim_givenTrailingWhitespace_shouldTrimTrailingWhitespaceOnly() {
        // Arrange
        String text = "   Hello World! \t \r\n ";

        // Act
        String result = formatter.rtrim(text);

        // Assert
        Assert.assertEquals("   Hello World!", result);
    }

    @Test
    public void rtrim_givenNoTrailingWhitespace_shouldReturnSameString() {
        // Arrange
        String text = "NoWhitespace";

        // Act
        String result = formatter.rtrim(text);

        // Assert
        Assert.assertEquals("NoWhitespace", result);
    }

    @Test
    public void optionComparator_givenEqualKeysWithDifferentCase_shouldEvaluateToZero() {
        // Arrange
        Comparator comparator = formatter.getOptionComparator();
        Option opt1 = new Option("a", "lowercase");
        Option opt2 = new Option("A", "UPPERCASE");

        // Act
        int result = comparator.compare(opt1, opt2);

        // Assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void optionComparator_givenDifferentKeys_shouldSortAlphabetically() {
        // Arrange
        Comparator comparator = formatter.getOptionComparator();
        Option optA = new Option("a", "Option A");
        Option optZ = new Option("z", "Option Z");

        // Act & Assert
        Assert.assertTrue(comparator.compare(optA, optZ) < 0);
        Assert.assertTrue(comparator.compare(optZ, optA) > 0);
    }
}