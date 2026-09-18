package org.apache.commons.cli2.builder;

import org.apache.commons.cli2.Option;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PatternBuilderTest {

    private PatternBuilder builder;

    @Before
    public void setUp() {
        builder = new PatternBuilder();
    }

    @Test
    public void testDefaultConstructor_shouldInstantiateSuccessfully() {
        PatternBuilder pb = new PatternBuilder();
        Assert.assertNotNull(pb);
    }

    @Test
    public void testCustomConstructor_shouldInstantiateSuccessfully() {
        GroupBuilder gb = new GroupBuilder();
        DefaultOptionBuilder ob = new DefaultOptionBuilder();
        ArgumentBuilder ab = new ArgumentBuilder();
        PatternBuilder pb = new PatternBuilder(gb, ob, ab);
        Assert.assertNotNull(pb);
    }

    @Test
    public void create_givenNoPatternConfigured_shouldReturnEmptyGroup() {
        Option option = builder.create();
        Assert.assertNotNull(option);
    }

    @Test
    public void create_givenSingleOptionPattern_shouldReturnSingleOption() {
        builder.withPattern("a");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-a", option.getPreferredName());
    }

    @Test
    public void create_givenMultipleOptionPattern_shouldReturnGroupOption() {
        builder.withPattern("ab");
        Option option = builder.create();
        Assert.assertNotNull(option);
    }

    @Test
    public void create_calledTwice_shouldResetOnFirstCall() {
        builder.withPattern("a");
        Option first = builder.create();
        Assert.assertNotNull(first);
        Assert.assertEquals("-a", first.getPreferredName());

        Option second = builder.create();
        Assert.assertNotNull(second);
        Assert.assertFalse("-a".equals(second.getPreferredName()));
    }

    @Test
    public void reset_givenPatternConfigured_shouldClearOptions() {
        builder.withPattern("a");
        PatternBuilder returned = builder.reset();
        Assert.assertSame(builder, returned);

        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertFalse("-a".equals(option.getPreferredName()));
    }

    @Test(expected = NullPointerException.class)
    public void withPattern_givenNullPattern_shouldThrowNullPointerException() {
        builder.withPattern(null);
    }

    @Test
    public void withPattern_givenEmptyPattern_shouldProduceNoOptions() {
        builder.withPattern("");
        Option option = builder.create();
        Assert.assertNotNull(option);
    }

    @Test
    public void withPattern_givenOnlyModifiersWithoutOpt_shouldProduceNoOptions() {
        builder.withPattern("!@:%");
        Option option = builder.create();
        Assert.assertNotNull(option);
    }

    @Test
    public void withPattern_givenFlagWithoutArgument_shouldBuildSuccessfully() {
        builder.withPattern("x");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-x", option.getPreferredName());
        Assert.assertFalse(option.isRequired());
    }

    @Test
    public void withPattern_givenRequiredFlagWithoutArgument_shouldBuildSuccessfully() {
        builder.withPattern("x!");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-x", option.getPreferredName());
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void withPattern_givenExclamationBeforeOpt_shouldApplyRequiredToOpt() {
        builder.withPattern("!x");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-x", option.getPreferredName());
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void withPattern_givenStringArgumentColon_shouldBuildOptionWithNullValidator() {
        builder.withPattern("s:");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-s", option.getPreferredName());
    }

    @Test
    public void withPattern_givenClassValidatorAtSign_shouldBuildSuccessfully() {
        builder.withPattern("c@");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-c", option.getPreferredName());
    }

    @Test
    public void withPattern_givenClassValidatorPlusSign_shouldBuildSuccessfully() {
        builder.withPattern("c+");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-c", option.getPreferredName());
    }

    @Test
    public void withPattern_givenNumberValidatorPercentSign_shouldBuildSuccessfully() {
        builder.withPattern("n%");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-n", option.getPreferredName());
    }

    @Test
    public void withPattern_givenDateValidatorHashSign_shouldBuildSuccessfully() {
        builder.withPattern("d#");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-d", option.getPreferredName());
    }

    @Test
    public void withPattern_givenExistingFileValidatorLessThanSign_shouldBuildSuccessfully() {
        builder.withPattern("f<");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-f", option.getPreferredName());
    }

    @Test
    public void withPattern_givenFileValidatorGreaterThanSign_shouldBuildSuccessfully() {
        builder.withPattern("f>");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-f", option.getPreferredName());
    }

    @Test
    public void withPattern_givenFileValidatorAsteriskSign_shouldBuildWithUnlimitedMaximum() {
        builder.withPattern("f*");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-f", option.getPreferredName());
    }

    @Test
    public void withPattern_givenFileValidatorAsteriskAndRequired_shouldBuildWithMinimumOne() {
        builder.withPattern("f!*");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-f", option.getPreferredName());
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void withPattern_givenUrlValidatorSlashSign_shouldBuildSuccessfully() {
        builder.withPattern("u/");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-u", option.getPreferredName());
    }

    @Test
    public void withPattern_givenRequiredArgumentOption_shouldSetArgumentMinimum() {
        builder.withPattern("k!:");
        Option option = builder.create();
        Assert.assertNotNull(option);
        Assert.assertEquals("-k", option.getPreferredName());
        Assert.assertTrue(option.isRequired());
    }

    @Test
    public void withPattern_givenMultipleChainedOptions_shouldResetStatePerOption() {
        builder.withPattern("a!@b:c%d+e#f<g>h*i/j");
        Option option = builder.create();
        Assert.assertNotNull(option);
    }

    @Test
    public void withPattern_givenTrailingOptionWithoutType_shouldBuildSuccessfully() {
        builder.withPattern("a:b");
        Option option = builder.create();
        Assert.assertNotNull(option);
    }
}