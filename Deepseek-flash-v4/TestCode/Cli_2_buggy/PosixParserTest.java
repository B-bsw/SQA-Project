package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PosixParserTest {

    private PosixParser parser;
    private Options options;

    @Before
    public void setUp() {
        parser = new PosixParser();
        options = new Options();
        options.addOption("a", "alpha", false, "Alpha option");
        options.addOption("b", "beta", true, "Beta option with arg");
        options.addOption("c", "gamma", true, "Gamma option with arg");
    }

    @After
    public void tearDown() {
        parser = null;
        options = null;
    }

    @Test
    public void testFlatten_SimpleSingleHyphenOptions_PreservesOptionsWithSeparators() {
        String[] input = {"-a", "-b", "-cvalue"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("-cvalue", result[2]);
    }

    @Test
    public void testFlatten_SingleHyphenWithArgAndConsecutiveArg_AddsArgToCurrentOption() {
        String[] input = {"-b", "value", "extra"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("-b", result[0]);
        assertEquals("value", result[1]);
        assertEquals("extra", result[2]);
    }

    @Test
    public void testFlatten_MultipleOptionsWithArgs_ProcessesAllTokens() {
        String[] input = {"-b", "arg1", "-c", "arg2", "-a"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 5 elements", 5, result.length);
        assertEquals("-b", result[0]);
        assertEquals("arg1", result[1]);
        assertEquals("-c", result[2]);
        assertEquals("arg2", result[3]);
        assertEquals("-a", result[4]);
    }

    @Test
    public void testFlatten_DoubleHyphen_AddsAsIs() {
        String[] input = {"--alpha", "--beta=value"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("--alpha", result[0]);
        assertEquals("--beta", result[1]);
        assertEquals("value", result[2]);
    }

    @Test
    public void testFlatten_SingleHyphenAlone_AddsSingleHyphenToken() {
        String[] input = {"-", "arg"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 2 elements", 2, result.length);
        assertEquals("-", result[0]);
        assertEquals("arg", result[1]);
    }

    @Test
    public void testFlatten_LongPatternWithStopAtNonOption_ProcessFullCombinedTokenAsNonOption() {
        String[] input = {"-abc", "value", "--", "rest"};
        String[] result = parser.flatten(options, input, true);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 4 elements", 4, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("-c", result[2]);
        assertEquals("value", result[3]);
    }

    @Test
    public void testFlatten_DoubleHyphenWithSeparator_SplitsCorrectly() {
        String[] input = {"--beta=value1", "extra"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 2 elements", 2, result.length);
        assertEquals("--beta", result[0]);
        assertEquals("value1", result[1]);
        assertEquals("extra", result[2]);
    }

    @Test
    public void testFlatten_DoubleHyphenWithOptionWithEquals_HandlesLongOptionEquals() {
        String[] input = {"--alpha=value", "--gamma=value2"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 4 elements", 4, result.length);
        assertEquals("--alpha", result[0]);
        assertEquals("value", result[1]);
        assertEquals("--gamma", result[2]);
        assertEquals("value2", result[3]);
    }

    @Test
    public void testFlatten_SingleTokenWithOptionAndArg_AddsRemainingCharsAsArg() {
        String[] input = {"-bvalue"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 2 elements", 2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("value", result[1]);
    }

    @Test
    public void testFlatten_StopAtNonOptionEatsRest_WhenOptionMissingAndStops() {
        String[] input = {"-x", "rest1", "rest2"};
        String[] result = parser.flatten(options, input, true);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("--", result[0]);
        assertEquals("rest1", result[1]);
        assertEquals("rest2", result[2]);
    }

    @Test
    public void testFlatten_WithStopAtNonOptionAndLongToken_BurstsThenEatsRest() {
        String[] input = {"-ab", "extra1", "extra2"};
        String[] result = parser.flatten(options, input, true);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 5 elements", 5, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("--", result[2]);
        assertEquals("extra1", result[3]);
        assertEquals("extra2", result[4]);
    }

    @Test
    public void testFlatten_NonOptionWithoutStop_AddsTokenNormally() {
        String[] input = {"value1", "-a", "value2"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("value1", result[0]);
        assertEquals("-a", result[1]);
        assertEquals("value2", result[2]);
    }

    @Test
    public void testFlatten_OptionWithHasArgs_AddsMultipleTokensUntilNextOption() {
        options.addOption("d", "delta", true, "Delta with args");
        String[] input = {"-d", "arg1", "arg2", "arg3"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 4 elements", 4, result.length);
        assertEquals("-d", result[0]);
        assertEquals("arg1", result[1]);
        assertEquals("arg2", result[2]);
        assertEquals("arg3", result[3]);
    }

    @Test
    public void testFlatten_OptionWithHasArgAndMoreTokens_AddsGoodValue() {
        options.addOption("d", "delta", true, "Delta with arg");
        String[] input = {"-dvalue1", "rest"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 2 elements", 2, result.length);
        assertEquals("-d", result[0]);
        assertEquals("value1", result[1]);
        assertEquals("rest", result[2]);
    }

    @Test
    public void testFlatten_ConsecutiveOptionsWithoutArgs_AddsEachOption() {
        String[] input = {"-abc"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.length);
        assertEquals("-a", result[0]);
        assertEquals("-b", result[1]);
        assertEquals("-c", result[2]);
    }

    @Test
    public void testFlatten_OptionWithHasArgsAndMoreTokensInSameToken_SplitsCorrectly() {
        String[] input = {"-bcvalue"};
        String[] result = parser.flatten(options, input, false);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 2 elements", 2, result.length);
        assertEquals("-b", result[0]);
        assertEquals("cvalue", result[1]);
    }
}