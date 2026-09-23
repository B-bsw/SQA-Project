package org.joda.time.format;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PeriodFormatterBuilderTest {
    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    @After
    public void tearDown() {
        builder = null;
    }

    @Test
    public void testDefaultState() {
        assertNotNull(builder.toFormatter());
        assertNotNull(builder.toPrinter());
        assertNotNull(builder.toParser());
        assertNotNull(builder.toFormatter().getPrinter());
        assertNotNull(builder.toFormatter().getParser());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullFormatter() {
        builder.append((PeriodFormatter) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullPrinterAndParser() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendNullLiteral() {
        builder.appendLiteral(null);
    }

    @Test
    public void testAppendLiteralEmptyString() {
        PeriodFormatter formatter = builder.appendLiteral("").toFormatter();
        assertNotNull(formatter);
        assertEquals("", formatter.getPrinter().toString());
    }

    @Test
    public void testAppendLiteralWithText() {
        builder.appendLiteral("abc");
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixNull() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixNullSingularPlural() {
        builder.appendPrefix(null, "plural");
    }

    @Test
    public void testAppendYears() {
        builder.appendYears();
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
    }

    @Test
    public void testAppendMonths() {
        builder.appendMonths();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendWeeks() {
        builder.appendWeeks();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendDays() {
        builder.appendDays();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendHours() {
        builder.appendHours();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendMinutes() {
        builder.appendMinutes();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSeconds() {
        builder.appendSeconds();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSecondsWithMillis() {
        builder.appendSecondsWithMillis();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSecondsWithOptionalMillis() {
        builder.appendSecondsWithOptionalMillis();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendMillis() {
        builder.appendMillis();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendMillis3Digit() {
        builder.appendMillis3Digit();
        assertNotNull(builder.toFormatter());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixNullText() {
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixNullSingularPlural() {
        builder.appendSuffix(null, "plural");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparatorNullText() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparatorNullFinalText() {
        builder.appendSeparator("text", null);
    }

    @Test
    public void testClear() {
        builder.appendYears().appendLiteral("y");
        builder.clear();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testClearEmptyBuilder() {
        builder.clear();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMinimumPrintedDigitsNegative() {
        builder.minimumPrintedDigits(-1);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMinimumPrintedDigitsZero() {
        builder.minimumPrintedDigits(0);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMinimumPrintedDigitsPositive() {
        builder.minimumPrintedDigits(5);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMaximumParsedDigitsNegative() {
        builder.maximumParsedDigits(-1);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMaximumParsedDigitsZero() {
        builder.maximumParsedDigits(0);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testRejectSignedValuesTrue() {
        builder.rejectSignedValues(true);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testRejectSignedValuesFalse() {
        builder.rejectSignedValues(false);
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testPrintZeroRarelyLast() {
        builder.printZeroRarelyLast();
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testPrintZeroRarelyFirst() {
        builder.printZeroRarelyFirst();
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testPrintZeroIfSupported() {
        builder.printZeroIfSupported();
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testPrintZeroAlways() {
        builder.printZeroAlways();
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testPrintZeroNever() {
        builder.printZeroNever();
        builder.appendYears();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSeparatorUseBeforeAndAfter() {
        builder.appendYears();
        builder.appendSeparator(", ");
        builder.appendMonths();
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
    }

    @Test
    public void testAppendSeparatorIfFieldsAfter() {
        builder.appendYears();
        builder.appendSeparatorIfFieldsAfter(", ");
        builder.appendMonths();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSeparatorIfFieldsBefore() {
        builder.appendYears();
        builder.appendSeparatorIfFieldsBefore(", ");
        builder.appendMonths();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testAppendSeparatorWithFinalText() {
        builder.appendYears();
        builder.appendSeparator(", ", " and ");
        builder.appendMonths();
        assertNotNull(builder.toFormatter());
    }

    @Test
    public void testMultipleAppendMethods() {
        builder.appendYears()
               .appendSuffix("y")
               .appendSeparator(", ")
               .appendMonths()
               .appendSuffix("m")
               .appendMinutes()
               .appendSuffix("min");
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
    }

    @Test
    public void testToPrinterAfterClear() {
        builder.appendYears();
        builder.clear();
        assertNotNull(builder.toPrinter());
    }

    @Test
    public void testToParserAfterClear() {
        builder.appendYears();
        builder.clear();
        assertNotNull(builder.toParser());
    }

    @Test
    public void testEmptyFormatterPrint() {
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter.getPrinter());
        assertNotNull(formatter.getParser());
    }

    @Test
    public void testComplexFormatting() {
        builder.appendYears()
               .appendSuffix(" year", " years")
               .appendSeparator(", ")
               .appendMonths()
               .appendSuffix(" month", " months")
               .appendSeparator(", ")
               .appendDays()
               .appendSuffix(" day", " days");
        PeriodFormatter formatter = builder.toFormatter();
        assertNotNull(formatter);
    }
}