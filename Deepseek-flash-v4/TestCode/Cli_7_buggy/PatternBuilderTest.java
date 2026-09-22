package org.apache.commons.cli2.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.validation.ClassValidator;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.Validator;
import org.junit.Before;
import org.junit.Test;

public class PatternBuilderTest {

    private PatternBuilder builder;
    private GroupBuilder groupBuilder;
    private DefaultOptionBuilder optionBuilder;
    private ArgumentBuilder argumentBuilder;

    @Before
    public void setUp() {
        groupBuilder = new GroupBuilder();
        optionBuilder = new DefaultOptionBuilder();
        argumentBuilder = new ArgumentBuilder();
        builder = new PatternBuilder(groupBuilder, optionBuilder, argumentBuilder);
    }

    @Test
    public void testDefaultConstructor() {
        PatternBuilder b = new PatternBuilder();
        assertNotNull(b);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullArguments() {
        new PatternBuilder(null, null, null);
    }

    @Test
    public void testCreateWithNoOptions() {
        Option result = builder.create();
        assertNotNull(result);
    }

    @Test
    public void testCreateWithSingleOption() {
        builder.withPattern("a");
        Option result = builder.create();
        assertNotNull(result);
        assertEquals("a", result.getPreferredName());
        assertNull(result.getArgument());
        assertTrue(!result.isRequired());
    }

    @Test
    public void testCreateWithMultipleOptions() {
        builder.withPattern("ab");
        Option result = builder.create();
        assertNotNull(result);
    }

    @Test
    public void testReset() {
        builder.withPattern("abc");
        builder.reset();
        assertEquals(0, builder.options.size());
    }

    @Test
    public void testWithPatternSingleCharOption() {
        builder.withPattern("a");
        assertEquals(1, builder.options.size());
    }

    @Test
    public void testWithPatternMultipleOptions() {
        builder.withPattern("abc");
        assertEquals(3, builder.options.size());
    }

    @Test
    public void testWithPatternEmptyString() {
        builder.withPattern("");
        assertEquals(0, builder.options.size());
    }

    @Test
    public void testWithPatternRequiredFlagBeforeOption() {
        builder.withPattern("!a");
        assertEquals(1, builder.options.size());
        Option option = (Option) builder.options.iterator().next();
        assertTrue(option.isRequired());
    }

    @Test
    public void testWithPatternRequiredFlagAfterOption() {
        builder.withPattern("a!");
        assertEquals(1, builder.options.size());
        Option option = (Option) builder.options.iterator().next();
        assertTrue(!option.isRequired());
    }

    @Test
    public void testWithPatternResetOfAttributes() {
        builder.withPattern("!a@b");
        assertEquals(2, builder.options.size());
    }

    @Test
    public void testWithPatternTypeString() {
        builder.withPattern("a:");
        Argument arg = ((Option) builder.options.iterator().next()).getArgument();
        assertNull(arg);
    }

    @Test
    public void testWithPatternTypeClass() {
        builder.withPattern("a@");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof ClassValidator);
    }

    @Test
    public void testWithPatternTypeClassInstance() {
        builder.withPattern("a+");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof ClassValidator);
    }

    @Test
    public void testWithPatternTypeNumber() {
        builder.withPattern("a%");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof NumberValidator);
    }

    @Test
    public void testWithPatternTypeDate() {
        builder.withPattern("a#");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof DateValidator);
    }

    @Test
    public void testWithPatternTypeExistingFile() {
        builder.withPattern("a<");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof FileValidator);
        FileValidator validator = (FileValidator) option.getArgument().getValidator();
        assertTrue(validator.isExisting());
        assertTrue(validator.isFile());
    }

    @Test
    public void testWithPatternTypeFileOutput() {
        builder.withPattern("a>");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof FileValidator);
    }

    @Test
    public void testWithPatternTypeFileAny() {
        builder.withPattern("a*");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof FileValidator);
    }

    @Test
    public void testWithPatternTypeUrl() {
        builder.withPattern("a/");
        Option option = (Option) builder.options.iterator().next();
        assertNotNull(option.getArgument());
        assertTrue(option.getArgument().getValidator() instanceof UrlValidator);
    }

    @Test
    public void testWithPatternUnsupportedTypeDefaultsToNullValidator() {
        builder.withPattern("ax");
        Option option = (Option) builder.options.iterator().next();
        assertNull(option.getArgument());
    }

    @Test
    public void testWithPatternTypeSpecifiedWithoutOption() {
        builder.withPattern("!");
        assertEquals(0, builder.options.size());
    }

    @Test
    public void testWithPatternMultipleTypeFlagsForSameOption() {
        builder.withPattern("a@+");
        assertEquals(1, builder.options.size());
    }

    @Test
    public void testWithPatternOptionThenTypeThenOption() {
        builder.withPattern("a@b");
        assertEquals(2, builder.options.size());
        assertTrue(builder.options.contains(createOption("a", '@')));
        assertTrue(builder.options.contains(createOption("b", ' ')));
    }

    @Test
    public void testWithPatternSingleQuotedOption() {
        builder.withPattern("'a'");
        assertEquals(3, builder.options.size()); // quotes treated as option chars by default
    }

    @Test
    public void testWithPatternRequiredWithType() {
        builder.withPattern("!a@");
        Option option = (Option) builder.options.iterator().next();
        assertTrue(option.isRequired());
        assertNotNull(option.getArgument());
    }

    @Test
    public void testWithPatternRequiredWithTypeAndMin() {
        builder.withPattern("!a@");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(1, option.getArgument().getMinimum());
    }

    @Test
    public void testWithPatternNonRequiredWithTypeAndMax() {
        builder.withPattern("a@");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(1, option.getArgument().getMaximum());
    }

    @Test
    public void testWithPatternNonRequiredNoTypeNoMax() {
        builder.withPattern("a");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(-1, option.getArgument().getMaximum());
    }

    @Test
    public void testWithPatternNonRequiredNoTypeNoMin() {
        builder.withPattern("a");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(-1, option.getArgument().getMinimum());
    }

    @Test
    public void testWithPatternRequiredWithTypeAndNoMax() {
        builder.withPattern("!a*");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(-1, option.getArgument().getMaximum());
    }

    @Test
    public void testWithPatternRequiredWithTypeAndMinSet() {
        builder.withPattern("!a+");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(1, option.getArgument().getMinimum());
    }

    @Test
    public void testWithPatternNonRequiredWithTypeAndMaxUnlimited() {
        builder.withPattern("a*");
        Option option = (Option) builder.options.iterator().next();
        assertEquals(-1, option.getArgument().getMaximum());
    }

    @Test
    public void testWithPatternThreeOptionsMixed() {
        builder.withPattern("ab:c@");
        assertEquals(3, builder.options.size());
    }

    @Test
    public void testWithPatternLargePattern() {
        builder.withPattern("a@b%c#d<e>f/g+h*i/");
        assertEquals(9, builder.options.size());
    }

    @Test
    public void testWithPatternNoOptionsAfterReset() {
        builder.withPattern("a");
        builder.reset();
        builder.withPattern("b");
        assertEquals(1, builder.options.size());
    }

    @Test
    public void testCreateResetsOptions() {
        builder.withPattern("a");
        builder.create();
        assertEquals(0, builder.options.size());
    }

    @Test
    public void testCreateWithGroup() {
        builder.withPattern("ab");
        Option option = builder.create();
        assertNotNull(option);
    }

    @Test
    public void testWithPatternOptionSeparator() {
        builder.withPattern("a_b");
        assertEquals(3, builder.options.size());
    }

    @Test
    public void testWithPatternSpaceIsNotSpecial() {
        builder.withPattern("a b");
        assertEquals(3, builder.options.size());
    }

    @Test
    public void testValidatorNullForDefaultCase() {
        assertNull(PatternBuilder.validator('z'));
    }
}