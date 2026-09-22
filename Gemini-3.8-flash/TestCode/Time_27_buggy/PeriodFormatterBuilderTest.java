package org.joda.time.format;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePeriod;
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
    public void toFormatter_givenDefaultBuilder_shouldReturnEmptyFormatter() {
        // Arrange & Act
        PeriodFormatter formatter = builder.toFormatter();

        // Assert
        Assert.assertNotNull(formatter);
        Assert.assertNotNull(formatter.getPrinter());
        Assert.assertNotNull(formatter.getParser());
        Assert.assertEquals("", formatter.print(Period.ZERO));
    }

    @Test
    public void toPrinter_givenPrinterAvailable_shouldReturnPrinter() {
        // Arrange
        builder.appendLiteral("test");

        // Act
        PeriodPrinter printer = builder.toPrinter();

        // Assert
        Assert.assertNotNull(printer);
    }

    @Test
    public void toParser_givenParserAvailable_shouldReturnParser() {
        // Arrange
        builder.appendLiteral("test");

        // Act
        PeriodParser parser = builder.toParser();

        // Assert
        Assert.assertNotNull(parser);
    }

    @Test
    public void toPrinter_whenNotPrinter_shouldReturnNull() {
        // Arrange
        PeriodParser mockParser = new PeriodParser() {
            public int parseInto(ReadWritablePeriod period, String text, int position, Locale locale) {
                return position;
            }
        };
        builder.append(null, mockParser);

        // Act
        PeriodPrinter printer = builder.toPrinter();

        // Assert
        Assert.assertNull(printer);
    }

    @Test
    public void toParser_whenNotParser_shouldReturnNull() {
        // Arrange
        PeriodPrinter mockPrinter = new PeriodPrinter() {
            public int calculatePrintedLength(ReadablePeriod period, Locale locale) {
                return 0;
            }
            public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {
                return 0;
            }
            public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {
            }
            public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {
            }
        };
        builder.append(mockPrinter, null);

        // Act
        PeriodParser parser = builder.toParser();

        // Assert
        Assert.assertNull(parser);
    }

    @Test(expected = IllegalStateException.class)
    public void toFormatter_whenNeitherPrinterNorParser_shouldThrowIllegalStateException() {
        // Arrange
        PeriodPrinter mockPrinter = new PeriodPrinter() {
            public int calculatePrintedLength(ReadablePeriod period, Locale locale) {
                return 0;
            }
            public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale) {
                return 0;
            }
            public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale) {
            }
            public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException {
            }
        };
        PeriodParser mockParser = new PeriodParser() {
            public int parseInto(ReadWritablePeriod period, String text, int position, Locale locale) {
                return position;
            }
        };
        builder.append(mockPrinter, null);
        builder.append(null, mockParser);

        // Act
        builder.toFormatter();
    }

    @Test
    public void clear_givenConfiguredBuilder_shouldResetState() {
        // Arrange
        builder.minimumPrintedDigits(4)
               .maximumParsedDigits(5)
               .rejectSignedValues(true)
               .printZeroAlways()
               .appendDays();

        // Act
        builder.clear();
        PeriodFormatter formatter = builder.toFormatter();

        // Assert
        Assert.assertEquals("", formatter.print(Period.ZERO));
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenNullFormatter_shouldThrowIllegalArgumentException() {
        // Act
        builder.append((PeriodFormatter) null);
    }

    @Test
    public void append_givenValidFormatter_shouldAppendPrinterAndParser() {
        // Arrange
        PeriodFormatter subFormatter = new PeriodFormatterBuilder().appendDays().appendSuffix("d").toFormatter();

        // Act
        builder.append(subFormatter);
        PeriodFormatter formatter = builder.toFormatter();

        // Assert
        Period period = new Period().withDays(5);
        Assert.assertEquals("5d", formatter.print(period));
    }

    @Test(expected = IllegalArgumentException.class)
    public void append_givenBothNullPrinterAndParser_shouldThrowIllegalArgumentException() {
        // Act
        builder.append((PeriodPrinter) null, (PeriodParser) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendLiteral_givenNull_shouldThrowIllegalArgumentException() {
        // Act
        builder.appendLiteral(null);
    }

    @Test
    public void appendLiteral_givenValidText_shouldPrintAndParseLiteral() {
        // Arrange
        builder.appendLiteral("PREFIX_").appendDays();
        PeriodFormatter formatter = builder.toFormatter();

        // Act & Assert Print
        Assert.assertEquals("PREFIX_2", formatter.print(new Period().withDays(2)));

        // Act & Assert Parse
        MutablePeriod p = new MutablePeriod();
        int newPos = formatter.getParser().parseInto(p, "PREFIX_2", 0, Locale.getDefault());
        Assert.assertEquals(8, newPos);
        Assert.assertEquals(2, p.getDays());

        // Mismatched literal
        int failPos = formatter.getParser().parseInto(p, "WRONG_2", 0, Locale.getDefault());
        Assert.assertTrue(failPos < 0);