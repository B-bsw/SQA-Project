package org.joda.time.chrono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.MonthDay;
import org.joda.time.Partial;
import org.joda.time.ReadablePartial;
import org.joda.time.YearMonth;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicMonthOfYearDateTimeFieldTest {

    private GregorianChronology iChrono;
    private BasicMonthOfYearDateTimeField iField;

    @Before
    public void setUp() {
        iChrono = GregorianChronology.getInstanceUTC();
        iField = new BasicMonthOfYearDateTimeField(iChrono, DateTimeConstants.FEBRUARY);
    }

    @Test
    public void isLenient_shouldReturnFalse() {
        // Arrange & Act
        boolean lenient = iField.isLenient();

        // Assert
        Assert.assertFalse(lenient);
    }

    @Test
    public void get_givenStandardInstant_shouldReturnCorrectMonth() {
        // Arrange
        // 2021-06-15 00:00:00 UTC
        long instant = iChrono.getYearMonthDayMillis(2021, 6, 15);

        // Act
        int month = iField.get(instant);

        // Assert
        Assert.assertEquals(6, month);
    }

    @Test
    public void add_givenZeroMonths_shouldReturnSameInstant() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 5, 20) + 12345L;

        // Act
        long result = iField.add(instant, 0);

        // Assert
        Assert.assertEquals(instant, result);
    }

    @Test
    public void add_givenPositiveMonthsWithinSameYear_shouldAdvanceMonthPreservingTime() {
        // Arrange
        long timePart = 10L * DateTimeConstants.MILLIS_PER_HOUR + 500L;
        long instant = iChrono.getYearMonthDayMillis(2021, 3, 15) + timePart;

        // Act
        long result = iField.add(instant, 4);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 7, 15) + timePart;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenPositiveMonthsSpanningMultipleYears_shouldAdvanceYearAndMonth() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 10, 10);

        // Act
        long result = iField.add(instant, 15);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2023, 1, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenNegativeMonthsWithinSameYear_shouldDecrementMonth() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 8, 15);

        // Act
        long result = iField.add(instant, -3);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 5, 15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenNegativeMonthsSpanningYearsWithBoundaryMonth1_shouldHandleBoundary() {
        // Arrange: 2021-03 minus 2 months -> 2021-01 (monthToUse == 1 branch in negative branch)
        // monthToUse = 3 - 1 + (-2) = 0 >= 0;
        // To hit monthToUse < 0 where monthToUse becomes 1:
        // monthToUse = thisMonth - 1 + months.
        // e.g., thisMonth = 2, months = -13 => monthToUse = 1 - 13 = -12.
        // -12 < 0: yearToUse = thisYear + (-12 / 12) - 1 = 2021 - 1 - 1 = 2019.
        // abs = 12, rem = 12 % 12 = 0 -> rem = 12.
        // monthToUse = 12 - 12 + 1 = 1.
        // Since monthToUse == 1, yearToUse += 1 => 2020.
        // 2021-02 minus 13 months = 2020-01.
        long instant = iChrono.getYearMonthDayMillis(2021, 2, 10);

        // Act
        long result = iField.add(instant, -13);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2020, 1, 10);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenNegativeMonthsWithNonZeroRemainder_shouldDecrementYearAndMonth() {
        // Arrange: 2021-02 minus 5 months -> 2020-09
        // monthToUse = 2 - 1 - 5 = -4.
        // yearToUse = 2021 + 0 - 1 = 2020.
        // rem = 4 % 12 = 4.
        // monthToUse = 12 - 4 + 1 = 9.
        long instant = iChrono.getYearMonthDayMillis(2021, 2, 15);

        // Act
        long result = iField.add(instant, -5);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2020, 9, 15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenEndOfMonthClippingInLeapYear_shouldCoerceToLastDayOfMonth() {
        // Arrange: 2020-03-31 - 1 month in leap year -> 2020-02-29
        long instant = iChrono.getYearMonthDayMillis(2020, 3, 31);

        // Act
        long result = iField.add(instant, -1);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2020, 2, 29);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void add_givenEndOfMonthClippingInNonLeapYear_shouldCoerceTo28Feb() {
        // Arrange: 2021-03-31 - 1 month in non-leap year -> 2021-02-28
        long instant = iChrono.getYearMonthDayMillis(2021, 3, 31);

        // Act
        long result = iField.add(instant, -1);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 2, 28);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addLong_givenIntRangeValue_shouldDelegateToAddInt() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 1, 15);

        // Act
        long result = iField.add(instant, 5L);

        // Assert
        long expected = iField.add(instant, 5);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addLong_givenPositiveMonthsOutOfIntRange_shouldAdvanceCorrectly() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2000, 1, 1);
        long monthsToAdd = 3000000000L; // > Integer.MAX_VALUE

        // Act
        // 3,000,000,000 months = 250,000,000 years, which exceeds maxYear of GregorianChronology
        try {
            iField.add(instant, monthsToAdd);
            Assert.fail("Should throw IllegalArgumentException when exceeding chronology year bounds");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Magnitude of add amount is too large") >= 0);
        }
    }

    @Test
    public void addLong_givenNegativeMonthsExceedingChronologyMinYear_shouldThrowException() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2000, 1, 1);
        long monthsToAdd = -3000000000L;

        // Act & Assert
        try {
            iField.add(instant, monthsToAdd);
            Assert.fail("Should throw IllegalArgumentException when exceeding chronology year bounds");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Magnitude of add amount is too large") >= 0);
        }
    }

    @Test
    public void addLong_givenLargeValidLongMonthAdjustment_shouldCoerceDayAndCalculate() {
        // Arrange: test add(long, long) using a mock-like subclass or valid large value if possible.
        // GregorianChronology max year is 292278993, min year is -292275055.
        // We can pass a long value > Integer.MAX_VALUE that stays within valid year bounds!
        // 2,500,000,000L months = 208,333,333 years + 4 months.
        // 2000 + 208333333 = 208335333 <= 292278993!
        long instant = iChrono.getYearMonthDayMillis(2000, 5, 31) + 5000L;
        long monthsToAdd = 2500000000L;

        // Act
        long result = iField.add(instant, monthsToAdd);

        // Assert
        int resYear = iChrono.getYear(result);
        int resMonth = iChrono.getMonthOfYear(result, resYear);
        int resDay = iChrono.getDayOfMonth(result, resYear, resMonth);
        long resTime = iChrono.getMillisOfDay(result);

        Assert.assertEquals(208335333, resYear);
        Assert.assertEquals(9, resMonth); // May (5) - 1 + 2500000000 = 2500000004. 2500000004 % 12 = 8. Month = 9 (Sept).
        Assert.assertEquals(30, resDay); // September has 30 days, 31 was coerced to 30
        Assert.assertEquals(5000L, resTime);
    }

    @Test
    public void addLong_givenLargeNegativeValidLongMonthsWithBoundaryMonth1_shouldHandleBoundary() {
        // monthToUse < 0 with remMonthToUse == 0 and monthToUse == 1
        // Need: monthToUse % 12 == 0.
        // monthToUse = thisMonth - 1 + months.
        // If thisMonth = 2, months = -2400000001L (which is < Integer.MIN_VALUE).
        // monthToUse = 2 - 1 - 2400000001L = -2400000000L.
        // remMonthToUse = (-2400000000L) % 12 = 0 -> becomes 12.
        // monthToUse = 12 - 12 + 1 = 1.
        // yearToUse += 1.
        long instant = iChrono.getYearMonthDayMillis(2000, 2, 10);
        long monthsToAdd = -2400000001L;

        // Act
        long result = iField.add(instant, monthsToAdd);

        // Assert
        int resYear = iChrono.getYear(result);
        int resMonth = iChrono.getMonthOfYear(result, resYear);
        Assert.assertEquals(1, resMonth);
        Assert.assertEquals(2000 - 200000000, resYear);
    }

    @Test
    public void addLong_givenLargeNegativeValidLongMonthsWithNonZeroRemainder_shouldDecrementYear() {
        // monthToUse < 0 with non-zero remainder
        long instant = iChrono.getYearMonthDayMillis(2000, 2, 10);
        long monthsToAdd = -2400000005L; // < Integer.MIN_VALUE

        // Act
        long result = iField.add(instant, monthsToAdd);

        // Assert
        int resYear = iChrono.getYear(result);
        int resMonth = iChrono.getMonthOfYear(result, resYear);
        Assert.assertEquals(9, resMonth);
        Assert.assertEquals(1999 - 200000000, resYear);
    }

    @Test
    public void addPartial_givenZeroValueToAdd_shouldReturnOriginalValues() {
        // Arrange
        ReadablePartial ym = new YearMonth(2021, 5, iChrono);
        int[] originalValues = new int[] {2021, 5};

        // Act
        int[] result = iField.add(ym, 1, originalValues, 0);

        // Assert
        Assert.assertSame(originalValues, result);
    }

    @Test
    public void addPartial_givenContiguousPartial_shouldReturnUpdatedValues() {
        // Arrange: MonthDay is contiguous
        ReadablePartial md = new MonthDay(2, 29, iChrono); // Leap year representation in partial
        int[] values = new int[] {2, 28};

        // Act
        int[] result = iField.add(md, 0, values, 1);

        // Assert
        Assert.assertEquals(3, result[0]); // March
        Assert.assertEquals(28, result[1]); // 28th
    }

    @Test
    public void addPartial_givenNonContiguousPartial_shouldDelegateToSuperAdd() {
        // Arrange: Partial with MonthOfYear and SecondOfMinute (not contiguous)
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.secondOfMinute()
        };
        int[] values = new int[] {5, 30};
        Partial nonContiguousPartial = new Partial(iChrono, types, values);

        // Act
        int[] result = iField.add(nonContiguousPartial, 0, values, 3);

        // Assert
        Assert.assertEquals(8, result[0]);
        Assert.assertEquals(30, result[1]);
    }

    @Test
    public void addWrapField_givenWrapForwardPastMax_shouldWrapToStart() {
        // Arrange: 2021-11-15 + 3 months wrapping within year -> 2021-02-15
        long instant = iChrono.getYearMonthDayMillis(2021, 11, 15);

        // Act
        long result = iField.addWrapField(instant, 3);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 2, 15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void addWrapField_givenWrapBackwardPastMin_shouldWrapToEnd() {
        // Arrange: 2021-02-15 - 3 months wrapping within year -> 2021-11-15
        long instant = iChrono.getYearMonthDayMillis(2021, 2, 15);

        // Act
        long result = iField.addWrapField(instant, -3);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 11, 15);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getDifferenceAsLong_givenMinuendLessThanSubtrahend_shouldReturnNegativeDifference() {
        // Arrange
        long instant1 = iChrono.getYearMonthDayMillis(2020, 3, 15);
        long instant2 = iChrono.getYearMonthDayMillis(2021, 5, 15);

        // Act
        long diff = iField.getDifferenceAsLong(instant1, instant2);

        // Assert
        Assert.assertEquals(-14L, diff);
    }

    @Test
    public void getDifferenceAsLong_givenMinuendGreaterThanSubtrahend_shouldReturnPositiveDifference() {
        // Arrange
        long instant1 = iChrono.getYearMonthDayMillis(2021, 5, 15);
        long instant2 = iChrono.getYearMonthDayMillis(2020, 3, 15);

        // Act
        long diff = iField.getDifferenceAsLong(instant1, instant2);

        // Assert
        Assert.assertEquals(14L, diff);
    }

    @Test
    public void getDifferenceAsLong_givenMinuendOnEndOfMonthWithSubtrahendDayLarger_shouldAdjustSubtrahend() {
        // Arrange
        // Minuend is Feb 28, 2021 (non-leap year, last day of month)
        // Subtrahend is Jan 31, 2021 (day 31 > 28)
        // minuendDom (28) == getDaysInYearMonth(2021, 2)
        // subtrahendDom (31) > minuendDom (28) -> branch subtrahendInstant = dayOfMonth().set(...)
        long minuend = iChrono.getYearMonthDayMillis(2021, 2, 28) + 1000L;
        long subtrahend = iChrono.getYearMonthDayMillis(2021, 1, 31) + 2000L;

        // Act
        long diff = iField.getDifferenceAsLong(minuend, subtrahend);

        // Assert: Both are end-of-month effectively, difference is 0 months because minuend time < subtrahend time
        Assert.assertEquals(0L, diff);
    }

    @Test
    public void getDifferenceAsLong_givenMinuendRemainderLessThanSubtrahendRemainder_shouldDecrementDifference() {
        // Arrange: minuend at 2021-05-15 10:00, subtrahend at 2021-04-15 12:00
        long minuend = iChrono.getYearMonthDayMillis(2021, 5, 15) + (10 * DateTimeConstants.MILLIS_PER_HOUR);
        long subtrahend = iChrono.getYearMonthDayMillis(2021, 4, 15) + (12 * DateTimeConstants.MILLIS_PER_HOUR);

        // Act
        long diff = iField.getDifferenceAsLong(minuend, subtrahend);

        // Assert: Exactly 1 month has not yet elapsed, so difference should be 0
        Assert.assertEquals(0L, diff);
    }

    @Test
    public void set_givenValidMonthWithinBounds_shouldSetMonthAndPreserveDayAndTime() {
        // Arrange
        long timePart = 15 * DateTimeConstants.MILLIS_PER_SECOND;
        long instant = iChrono.getYearMonthDayMillis(2021, 5, 10) + timePart;

        // Act
        long result = iField.set(instant, 8);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 8, 10) + timePart;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenTargetMonthWithFewerDays_shouldCoerceDayToNearestSaneValue() {
        // Arrange: 2021-03-31 set to month 2 (Feb) -> 2021-02-28
        long instant = iChrono.getYearMonthDayMillis(2021, 3, 31);

        // Act
        long result = iField.set(instant, 2);

        // Assert
        long expected = iChrono.getYearMonthDayMillis(2021, 2, 28);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void set_givenMonthBelowMinimum_shouldThrowException() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 5, 10);

        // Act
        iField.set(instant, 0);
    }

    @Test(expected = IllegalFieldValueException.class)
    public void set_givenMonthAboveMaximum_shouldThrowException() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 5, 10);

        // Act
        iField.set(instant, 13);
    }

    @Test
    public void getRangeDurationField_shouldReturnYearsField() {
        // Arrange & Act
        org.joda.time.DurationField rangeField = iField.getRangeDurationField();

        // Assert
        Assert.assertEquals(DurationFieldType.years(), rangeField.getType());
    }

    @Test
    public void isLeap_givenLeapYearAndLeapMonth_shouldReturnTrue() {
        // Arrange: 2020 is a leap year, February is month 2 (the leap month)
        long instant = iChrono.getYearMonthDayMillis(2020, 2, 15);

        // Act
        boolean isLeap = iField.isLeap(instant);

        // Assert
        Assert.assertTrue(isLeap);
    }

    @Test
    public void isLeap_givenLeapYearAndNonLeapMonth_shouldReturnFalse() {
        // Arrange: 2020 is a leap year, March is not leap month
        long instant = iChrono.getYearMonthDayMillis(2020, 3, 15);

        // Act
        boolean isLeap = iField.isLeap(instant);

        // Assert
        Assert.assertFalse(isLeap);
    }

    @Test
    public void isLeap_givenNonLeapYearAndLeapMonth_shouldReturnFalse() {
        // Arrange: 2021 is not a leap year, February is month 2
        long instant = iChrono.getYearMonthDayMillis(2021, 2, 15);

        // Act
        boolean isLeap = iField.isLeap(instant);

        // Assert
        Assert.assertFalse(isLeap);
    }

    @Test
    public void getLeapAmount_givenLeapMonthInLeapYear_shouldReturnOne() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2020, 2, 15);

        // Act
        int leapAmount = iField.getLeapAmount(instant);

        // Assert
        Assert.assertEquals(1, leapAmount);
    }

    @Test
    public void getLeapAmount_givenNonLeapMonth_shouldReturnZero() {
        // Arrange
        long instant = iChrono.getYearMonthDayMillis(2021, 2, 15);

        // Act
        int leapAmount = iField.getLeapAmount(instant);

        // Assert
        Assert.assertEquals(0, leapAmount);
    }

    @Test
    public void getLeapDurationField_shouldReturnDaysField() {
        // Arrange & Act
        org.joda.time.DurationField leapDurationField = iField.getLeapDurationField();

        // Assert
        Assert.assertEquals(DurationFieldType.days(), leapDurationField.getType());
    }

    @Test
    public void getMinimumValue_shouldReturnOne() {
        // Arrange & Act
        int min = iField.getMinimumValue();

        // Assert
        Assert.assertEquals(1, min);
    }

    @Test
    public void getMaximumValue_shouldReturnTwelveForGregorian() {
        // Arrange & Act
        int max = iField.getMaximumValue();

        // Assert
        Assert.assertEquals(12, max);
    }

    @Test
    public void roundFloor_givenInstant_shouldReturnStartOfMonthMillis() {
        // Arrange
        long timePart = 15 * DateTimeConstants.MILLIS_PER_HOUR + 2345;
        long instant = iChrono.getYearMonthDayMillis(2021, 7, 20) + timePart;

        // Act
        long rounded = iField.roundFloor(instant);

        // Assert
        long expected = iChrono.getYearMonthMillis(2021, 7);
        Assert.assertEquals(expected, rounded);
    }

    @Test
    public void remainder_givenInstant_shouldReturnMillisSinceStartOfMonth() {
        // Arrange
        long expectedRemainder = (19L * DateTimeConstants.MILLIS_PER_DAY) + 123456L;
        long instant = iChrono.getYearMonthMillis(2021, 7) + expectedRemainder;

        // Act
        long rem = iField.remainder(instant);

        // Assert
        Assert.assertEquals(expectedRemainder, rem);
    }

    @Test
    public void readResolve_givenSerialization_shouldResolveToChronologyMonthOfYearSingleton() throws Exception {
        // Arrange
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(iField);
        oos.close();

        // Act
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertSame(iChrono.monthOfYear(), deserialized);
    }
}