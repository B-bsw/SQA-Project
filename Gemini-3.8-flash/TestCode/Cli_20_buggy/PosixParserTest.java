package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
    }

    @Test
    public void flatten_givenEmptyArguments_shouldReturnEmptyArray() {
        String[] args = new String[0];
        String[] result = parser.flatten(options, args, false);

        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void flatten_givenSingleHyphenToken_shouldPreserveSingleHyphen() {
        String[] args = new String[] { "-" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-" }, result);
    }

    @Test
    public void flatten_givenDoubleHyphenToken_shouldPreserveDoubleHyphen() {
        String[] args = new String[] { "--" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "--" }, result);
    }

    @Test
    public void flatten_givenLongOptionWithoutEquals_shouldPreserveToken() {
        options.addOption(new Option("f", "foo", false, "foo option"));
        String[] args = new String[] { "--foo" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "--foo" }, result);
    }

    @Test
    public void flatten_givenLongOptionWithEquals_shouldSplitKeyAndValue() {
        options.addOption(new Option("f", "foo", true, "foo option"));
        String[] args = new String[] { "--foo=bar" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "--foo", "bar" }, result);
    }

    @Test
    public void flatten_givenLongOptionWithEmptyValue_shouldSplitKeyAndEmptyString() {
        options.addOption(new Option("f", "foo", true, "foo option"));
        String[] args = new String[] { "--foo=" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "--foo", "" }, result);
    }

    @Test
    public void flatten_givenOnlyDoubleHyphenAndEquals_shouldSplitProperly() {
        String[] args = new String[] { "--=" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "--", "" }, result);
    }

    @Test
    public void flatten_givenValidTwoCharOption_shouldAddOption() {
        options.addOption(new Option("a", false, "option a"));
        String[] args = new String[] { "-a" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-a" }, result);
    }

    @Test
    public void flatten_givenValidTwoCharOptionWithArg_shouldConsumeNextTokenAsArgWhenStopAtNonOptionIsTrue() {
        options.addOption(new Option("a", true, "option a with arg"));
        String[] args = new String[] { "-a", "value1" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] { "-a", "value1" }, result);
    }

    @Test
    public void flatten_givenUnrecognizedTwoCharOptionAndStopAtNonOptionIsTrue_shouldEatTheRest() {
        String[] args = new String[] { "-u", "extra1", "extra2" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] { "-u", "extra1", "extra2" }, result);
    }

    @Test
    public void flatten_givenUnrecognizedTwoCharOptionAndStopAtNonOptionIsFalse_shouldNotEatTheRest() {
        String[] args = new String[] { "-u", "extra1" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-u", "extra1" }, result);
    }

    @Test
    public void flatten_givenMultiCharTokenRecognizedByOptions_shouldAddDirectly() {
        options.addOption(new Option("help", false, "help option"));
        String[] args = new String[] { "-help" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-help" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithMultipleValidNoArgOptions_shouldBurstAll() {
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("b", false, "option b"));
        options.addOption(new Option("c", false, "option c"));

        String[] args = new String[] { "-abc" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-a", "-b", "-c" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithOptionHavingArg_shouldBurstAndKeepRemainderAsArg() {
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("f", true, "option f with arg"));

        String[] args = new String[] { "-afbar" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-a", "-f", "bar" }, result);
    }

    @Test
    public void flatten_givenBurstTokenEndingWithArgOption_shouldConsumeSeparateNextTokenWhenStopAtNonOptionIsTrue() {
        options.addOption(new Option("a", false, "option a"));
        options.addOption(new Option("f", true, "option f with arg"));

        String[] args = new String[] { "-af", "myValue" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] { "-a", "-f", "myValue" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharAndStopAtNonOptionIsTrue_shouldProcessAndEatTheRest() {
        options.addOption(new Option("a", false, "option a"));

        String[] args = new String[] { "-az", "remainder" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] { "-a", "--", "z", "remainder" }, result);
    }

    @Test
    public void flatten_givenBurstTokenWithUnrecognizedCharAndStopAtNonOptionIsFalse_shouldAddRawToken() {
        options.addOption(new Option("a", false, "option a"));

        String[] args = new String[] { "-az" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "-a", "-az" }, result);
    }

    @Test
    public void flatten_givenNonOptionAndStopAtNonOptionIsFalse_shouldAddTokenDirectly() {
        String[] args = new String[] { "nonOption1", "nonOption2" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] { "nonOption1", "nonOption2" }, result);
    }

    @Test
    public void flatten_givenNonOptionAndStopAtNonOptionIsTrueAndNoCurrentOption_shouldAddDoubleHyphenAndEatTheRest() {
        String[] args = new String[] { "nonOption1", "nonOption2" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] { "--", "nonOption1", "nonOption2" }, result);
    }

    @Test
    public void flatten_givenSuccessiveCalls_shouldResetInternalStateProperly() {
        options.addOption(new Option("a", true, "option a"));

        String[] firstArgs = new String[] { "-a", "valA", "extra" };
        String[] firstResult = parser.flatten(options, firstArgs, true);
        Assert.assertArrayEquals(new String[] { "-a", "valA", "--", "extra" }, firstResult);

        String[] secondArgs = new String[] { "newNonOption" };
        String[] secondResult = parser.flatten(options, secondArgs, false);
        Assert.assertArrayEquals(new String[] { "newNonOption" }, secondResult);
    }

    @Test
    public void flatten_givenMultipleOptionsAndArguments_shouldFlattenCorrectly() {
        options.addOption(new Option("a", false, "all"));
        options.addOption(new Option("b", true, "buffer"));
        options.addOption(new Option("c", false, "close"));

        String[] args = new String[] { "-a", "--longOpt=val", "-", "-b", "bufValue", "--", "extraArg" };
        String[] result = parser.flatten(options, args, false);

        Assert.assertArrayEquals(new String[] {
            "-a",
            "--longOpt",
            "val",
            "-",
            "-b",
            "bufValue",
            "--",
            "extraArg"
        }, result);
    }

    @Test
    public void flatten_givenStopAtNonOptionTrueAfterOptionWithArg_shouldAddRemainingArguments() {
        options.addOption(new Option("o", true, "output file"));

        String[] args = new String[] { "-o", "out.txt", "file1.txt", "file2.txt" };
        String[] result = parser.flatten(options, args, true);

        Assert.assertArrayEquals(new String[] {
            "-o",
            "out.txt",
            "--",
            "file1.txt",
            "file2.txt"
        }, result);
    }
}