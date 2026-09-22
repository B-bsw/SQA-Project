package org.joda.time.format;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Locale;

import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeriodFormatterBuilderTest {

    private PeriodFormatterBuilder builder;

    @Before
    public void setUp() {
        builder = new PeriodFormatterBuilder();
    }

    @Test
    public void testClear_shouldResetBuilderState() {
        builder.appendYears()
               .appendLiteral("Y")
               .minimumPrintedDigits(4)
               .maximumParsedDigits(5)
               .rejectSignedValues(true);

        builder.clear();
        PeriodFormatter formatter = builder.appendYears().toFormatter();
        Period p = new Period(5, 0, 0, 0, 0, 0, 0, 0);

        Assert.assertEquals("5", formatter.print(p));
    }

    @Test
    public void testAppendFormatter_givenValidFormatter_shouldAppendPrinterAndParser() {
        PeriodFormatter subFormatter = new PeriodFormatterBuilder()
                .appendYears()
                .appendSuffix("Y")
                .toFormatter();

        PeriodFormatter formatter = builder.append(subFormatter).toFormatter();
        Period period = new Period(3, 0, 0, 0, 0, 0, 0, 0);

        Assert.assertEquals("3Y", formatter.print(period));

        MutablePeriod mp = new MutablePeriod();
        int newPos = formatter.getParser().parseInto(mp, "3Y", 0, Locale.getDefault());
        Assert.assertEquals(2, newPos);
        Assert.assertEquals(3, mp.getYears());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendFormatter_givenNullFormatter_shouldThrowException() {
        builder.append((PeriodFormatter) null);
    }

    @Test
    public void testAppendPrinterParser_givenValidComponents_shouldSucceed() {
        PeriodFormatter sub = new PeriodFormatterBuilder().appendHours().toFormatter();
        PeriodFormatter formatter = builder.append(sub.getPrinter(), sub.getParser()).toFormatter();

        Period period = new Period(0, 0, 0, 0, 5, 0, 0, 0);
        Assert.assertEquals("5", formatter.print(period));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrinterParser_givenBothNull_shouldThrowException() {
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test
    public void testToPrinter_whenPrinterNull_shouldReturnNull() {
        PeriodFormatter sub = new PeriodFormatterBuilder().appendHours().toFormatter();
        builder.append((PeriodPrinter) null, sub.getParser());

        Assert.assertNull(builder.toPrinter());
        Assert.assertNotNull(builder.toParser());
    }

    @Test
    public void testToParser_whenParserNull_shouldReturnNull() {
        PeriodFormatter sub = new PeriodFormatterBuilder().appendHours().toFormatter();
        builder.append(sub.getPrinter(), (PeriodParser) null);

        Assert.assertNull(builder.toParser());
        Assert.assertNotNull(builder.toPrinter());
    }

    @Test(expected = IllegalStateException.class)
    public void testToFormatter_whenNeitherPrinterNorParser_shouldThrowException() {
        builder.append((PeriodPrinter) null, (PeriodParser) null_parser());
        builder.toFormatter();
    }

    private PeriodParser null_parser() {
        return null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendLiteral_givenNull_shouldThrowException() {
        builder.appendLiteral(null);
    }

    @Test
    public void testAppendLiteral_givenValidText_shouldPrintAndParse() {
        PeriodFormatter formatter = builder.appendLiteral("PT").appendHours().appendLiteral("H").toFormatter();
        Period p = new Period(0, 0, 0, 0, 2, 0, 0, 0);

        Assert.assertEquals("PT2H", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int res = formatter.getParser().parseInto(mp, "PT2H", 0, Locale.getDefault());
        Assert.assertEquals(4, res);
        Assert.assertEquals(2, mp.getHours());

        res = formatter.getParser().parseInto(mp, "XX", 0, Locale.getDefault());
        Assert.assertTrue(res < 0);
    }

    @Test
    public void testLiteral_countFieldsAndCalculatePrintedLength() {
        PeriodFormatterBuilder.Literal lit = new PeriodFormatterBuilder.Literal("TEST");
        Period p = new Period(1, 2, 3, 4, 5, 6, 7, 8);

        Assert.assertEquals(0, lit.countFieldsToPrint(p, 10, Locale.getDefault()));
        Assert.assertEquals(4, lit.calculatePrintedLength(p, Locale.getDefault()));

        StringBuffer sb = new StringBuffer();
        lit.printTo(sb, p, Locale.getDefault());
        Assert.assertEquals("TEST", sb.toString());
    }

    @Test
    public void testLiteral_printToWriter_shouldWriteExpectedText() throws IOException {
        PeriodFormatterBuilder.Literal lit = new PeriodFormatterBuilder.Literal("ABC");
        StringWriter sw = new StringWriter();
        lit.printTo(sw, Period.ZERO, Locale.getDefault());
        Assert.assertEquals("ABC", sw.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefix_givenNullText_shouldThrowException() {
        builder.appendPrefix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPlural_givenNullSingular_shouldThrowException() {
        builder.appendPrefix(null, "plural");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendPrefixPlural_givenNullPlural_shouldThrowException() {
        builder.appendPrefix("singular", null);
    }

    @Test
    public void testPrefix_simpleAndPlural_shouldFormatAndParse() {
        PeriodFormatter formatter = builder
                .appendPrefix("Pre:")
                .appendHours()
                .appendLiteral(" ")
                .appendPrefix("day ", "days ")
                .appendDays()
                .toFormatter();

        Period p1 = new Period(0, 0, 0, 1, 2, 0, 0, 0);
        Assert.assertEquals("Pre:2 day 1", formatter.print(p1));

        Period p2 = new Period(0, 0, 0, 4, 2, 0, 0, 0);
        Assert.assertEquals("Pre:2 days 4", formatter.print(p2));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "Pre:5 days 8", 0, Locale.getDefault());
        Assert.assertEquals(12, pos);
        Assert.assertEquals(5, mp.getHours());
        Assert.assertEquals(8, mp.getDays());

        int failPos = formatter.getParser().parseInto(mp, "Wrong:5 days 8", 0, Locale.getDefault());
        Assert.assertTrue(failPos < 0);
    }

    @Test
    public void testPrefix_compositePrefix_shouldChainPrefixes() {
        PeriodFormatter formatter = builder
                .appendPrefix("P_")
                .appendPrefix("Time_")
                .appendMinutes()
                .toFormatter();

        Period p = new Period(0, 0, 0, 0, 0, 45, 0, 0);
        Assert.assertEquals("P_Time_45", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "P_Time_45", 0, Locale.getDefault());
        Assert.assertEquals(9, pos);
        Assert.assertEquals(45, mp.getMinutes());
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixNotFollowedByField_shouldThrowExceptionOnLiteral() {
        builder.appendPrefix("pre").appendLiteral("literal");
    }

    @Test(expected = IllegalStateException.class)
    public void testPrefixNotFollowedByField_shouldThrowExceptionOnSeparator() {
        builder.appendPrefix("pre").appendSeparator(":");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffix_givenNullText_shouldThrowException() {
        builder.appendSuffix((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPlural_givenNullSingular_shouldThrowException() {
        builder.appendSuffix(null, "s");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSuffixPlural_givenNullPlural_shouldThrowException() {
        builder.appendSuffix("s", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_withoutField_shouldThrowException() {
        builder.appendSuffix("sec");
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSuffix_afterLiteral_shouldThrowException() {
        builder.appendLiteral("test").appendSuffix("sec");
    }

    @Test
    public void testSuffix_chainedCompositeSuffix_shouldWork() {
        PeriodFormatter formatter = builder
                .appendSeconds()
                .appendSuffix("s")
                .appendSuffix(".")
                .toFormatter();

        Period p = new Period(0, 0, 0, 0, 0, 0, 10, 0);
        Assert.assertEquals("10s.", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "10s.", 0, Locale.getDefault());
        Assert.assertEquals(4, pos);
        Assert.assertEquals(10, mp.getSeconds());
    }

    @Test
    public void testPluralAffix_scanAndParseBranches() {
        // Test pluralText shorter than singularText branch
        PeriodFormatter formatter = builder
                .appendMonths()
                .appendSuffix("MonthLong", "M")
                .toFormatter();

        Period single = new Period(0, 1, 0, 0, 0, 0, 0, 0);
        Period plural = new Period(0, 2, 0, 0, 0, 0, 0, 0);

        Assert.assertEquals("1MonthLong", formatter.print(single));
        Assert.assertEquals("2M", formatter.print(plural));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "1MonthLong", 0, Locale.getDefault());
        Assert.assertEquals(10, pos);
        Assert.assertEquals(1, mp.getMonths());

        pos = formatter.getParser().parseInto(mp, "2M", 0, Locale.getDefault());
        Assert.assertEquals(2, pos);
        Assert.assertEquals(2, mp.getMonths());
    }

    @Test
    public void testAllFields_printingAndParsing() {
        PeriodFormatter formatter = builder
                .appendYears().appendSuffix("y")
                .appendMonths().appendSuffix("m")
                .appendWeeks().appendSuffix("w")
                .appendDays().appendSuffix("d")
                .appendHours().appendSuffix("h")
                .appendMinutes().appendSuffix("min")
                .appendSeconds().appendSuffix("s")
                .appendMillis().appendSuffix("ms")
                .toFormatter();

        Period period = new Period(1, 2, 3, 4, 5, 6, 7, 8);
        String formatted = formatter.print(period);
        Assert.assertEquals("1y2m3w4d5h6min7s8ms", formatted);

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, formatted, 0, Locale.getDefault());
        Assert.assertEquals(formatted.length(), pos);
        Assert.assertEquals(period, mp.toPeriod());
    }

    @Test
    public void testAppendMillis3Digit_shouldPadMillis() {
        PeriodFormatter formatter = builder.appendMillis3Digit().toFormatter();
        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 5);

        Assert.assertEquals("005", formatter.print(p));
    }

    @Test
    public void testAppendSecondsWithMillis_formattingAndParsing() {
        PeriodFormatter formatter = builder.appendSecondsWithMillis().toFormatter();

        Period p = new Period(0, 0, 0, 0, 0, 0, 5, 20);
        Assert.assertEquals("5.020", formatter.print(p));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "5.020", 0, Locale.getDefault());
        Assert.assertEquals(5, pos);
        Assert.assertEquals(5, mp.getSeconds());
        Assert.assertEquals(20, mp.getMillis());

        // Comma as decimal separator
        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "12,3", 0, Locale.getDefault());
        Assert.assertEquals(4, pos);
        Assert.assertEquals(12, mp.getSeconds());
        Assert.assertEquals(300, mp.getMillis());

        // 2 fractional digits
        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "12.34", 0, Locale.getDefault());
        Assert.assertEquals(5, pos);
        Assert.assertEquals(12, mp.getSeconds());
        Assert.assertEquals(340, mp.getMillis());

        // Negative seconds with millis
        mp = new MutablePeriod();
        pos = formatter.getParser().parseInto(mp, "-2.050", 0, Locale.getDefault());
        Assert.assertEquals(6, pos);
        Assert.assertEquals(-2, mp.getSeconds());
        Assert.assertEquals(-50, mp.getMillis());
    }

    @Test
    public void testAppendSecondsWithOptionalMillis_formattingAndParsing() {
        PeriodFormatter formatter = builder.appendSecondsWithOptionalMillis().toFormatter();

        Period noMillis = new Period(0, 0, 0, 0, 0, 0, 5, 0);
        Period hasMillis = new Period(0, 0, 0, 0, 0, 0, 5, 300);

        Assert.assertEquals("5", formatter.print(noMillis));
        Assert.assertEquals("5.300", formatter.print(hasMillis));

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "14", 0, Locale.getDefault());
        Assert.assertEquals(2, pos);
        Assert.assertEquals(14, mp.getSeconds());
        Assert.assertEquals(0, mp.getMillis());
    }

    @Test
    public void testRejectSignedValues() {
        PeriodFormatter formatter = builder
                .rejectSignedValues(true)
                .appendHours()
                .toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "-5", 0, Locale.getDefault());
        Assert.assertTrue(pos < 0);

        pos = formatter.getParser().parseInto(mp, "+5", 0, Locale.getDefault());
        Assert.assertTrue(pos < 0);

        pos = formatter.getParser().parseInto(mp, "5", 0, Locale.getDefault());
        Assert.assertEquals(1, pos);
        Assert.assertEquals(5, mp.getHours());
    }

    @Test
    public void testAcceptSignedValues_positiveSign() {
        PeriodFormatter formatter = builder
                .rejectSignedValues(false)
                .appendHours()
                .toFormatter();

        MutablePeriod mp = new MutablePeriod();
        int pos = formatter.getParser().parseInto(mp, "+15", 0, Locale.getDefault());
        Assert.assertEquals(3, pos);
        Assert.assertEquals(15, mp.getHours());
    }

    @Test
    public void testPrintZeroAlways() {
        PeriodFormatter formatter = builder
                .printZeroAlways()
                .appendDays()
                .appendSuffix("d")
                .appendHours()
                .appendSuffix("h")
                .toFormatter();

        Period p = new Period(0, 0, 0, 0, 5, 0, 0, 0);
        Assert.assertEquals("0d5h", formatter.print(p));
    }

    @Test
    public void testPrintZeroNever() {
        PeriodFormatter formatter = builder
                .printZeroNever()
                .appendDays()
                .appendSuffix("d")
                .appendHours()
                .appendSuffix("h")
                .toFormatter();

        Period p = new Period(0, 0, 0, 0, 5, 0, 0, 0);
        Assert.assertEquals("5h", formatter.print(p));

        Period zero = Period.ZERO;
        Assert.assertEquals("", formatter.print(zero));
    }

    @Test
    public void testPrintZeroRarelyLast() {
        PeriodFormatter formatter = builder
                .printZeroRarelyLast()
                .appendDays().appendSuffix("d")
                .appendHours().appendSuffix("h")
                .toFormatter();

        Period p = Period.ZERO;
        Assert.assertEquals("0h", formatter.print(p));
    }

    @Test
    public void testPrintZeroRarelyFirst() {
        PeriodFormatter formatter = builder
                .printZeroRarelyFirst()
                .appendDays().appendSuffix("d")
                .appendHours().appendSuffix("h")
                .toFormatter();

        Period p = Period.ZERO;
        Assert.assertEquals("0d", formatter.print(p));
    }

    @Test
    public void testPrintZeroIfSupported() {
        PeriodFormatter formatter = builder
                .printZeroIfSupported()
                .appendDays().appendSuffix("d")
                .appendHours().appendSuffix("h")
                .toFormatter();

        Period p = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.days());
        Assert.assertEquals("0d", formatter.print(p));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_givenNullText_shouldThrowException() {
        builder.appendSeparator(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAppendSeparator_givenNullFinalText_shouldThrowException() {
        builder.appendSeparator("test", null);
    }

    @Test(expected = IllegalStateException.class)
    public void testAppendSeparator_twoAdjacentSeparators_shouldThrowException() {
        builder.appendDays()
               .appendSeparator(", ")
               .appendSeparator(" and ");
    }

    @Test
    public void testSeparator_singleAndMultipleFields() {
        PeriodFormatter formatter = builder
                .appendHours().appendSuffix("h")
                .appendSeparator(", ", " and ")
                .appendMinutes().appendSuffix("m")
                .appendSeparator(", ", " and ")
                .appendSeconds().appendSuffix("s")
                .toFormatter();

        Period p1 = new Period(0, 0, 0, 0, 1, 2, 0, 0);
        Assert.assertEquals("1h and 2m", formatter.print(p1));

        Period p2 = new Period(0, 0, 0, 0, 1, 2, 3, 0);
        Assert.assertEquals("1h, 2m and 3s", formatter.print(p2));

        MutablePeriod mp = new MutablePeriod();
        int