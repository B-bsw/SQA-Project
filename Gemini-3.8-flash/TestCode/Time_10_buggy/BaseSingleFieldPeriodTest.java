package org.joda.time.base;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.Days;
import org.joda.time.DurationFieldType;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MutablePeriod;
import org.joda.time.Partial;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.junit.Assert;
import org.junit.Test;

public class BaseSingleFieldPeriodTest {

    private static class MockSingleFieldPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;
        private final DurationFieldType fieldType;
        private final PeriodType periodType;

        public MockSingleFieldPeriod(int period) {
            this(period, DurationFieldType.days(), PeriodType.days());
        }

        public MockSingleFieldPeriod(int period, DurationFieldType fieldType, PeriodType periodType) {
            super(period);
            this.fieldType = fieldType;
            this.periodType = periodType;
        }

        public DurationFieldType getFieldType() {
            return fieldType;
        }

        public PeriodType getPeriodType() {
            return periodType;
        }

        public void setValuePublic(int value) {
            super.setValue(value);
        }
    }

    private static class AnotherSingleFieldPeriod extends BaseSingleFieldPeriod {
        private static final long serialVersionUID = 1L;

        public AnotherSingleFieldPeriod(int period) {
            super(period);
        }

        public DurationFieldType getFieldType() {
            return DurationFieldType.hours();
        }

        public PeriodType getPeriodType() {
            return PeriodType.hours();
        }
    }

    // -----------------------------------------------------------------------
    // Tests for between(ReadableInstant, ReadableInstant, DurationFieldType)
    // -----------------------------------------------------------------------

    @Test
    public void betweenInstants_givenValidInstants_shouldReturnDifference() {
        ReadableInstant start = new Instant(0L);
        ReadableInstant end = new Instant(86400000L * 3L);
        int result = BaseSingleFieldPeriod.between(start, end, DurationFieldType.days());
        Assert.assertEquals(3, result);
    }

    @Test
    public void betweenInstants_givenEndBeforeStart_shouldReturnNegativeDifference() {
        ReadableInstant start = new Instant(86400000L * 5L);
        ReadableInstant end = new Instant(86400000L * 2L);
        int result = BaseSingleFieldPeriod.between(start, end, DurationFieldType.days());
        Assert.assertEquals(-3, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenInstants_givenNullStart_shouldThrowIllegalArgumentException() {
        ReadableInstant end = new Instant(1000L);
        BaseSingleFieldPeriod.between(null, end, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenInstants_givenNullEnd_shouldThrowIllegalArgumentException() {
        ReadableInstant start = new Instant(1000L);
        BaseSingleFieldPeriod.between(start, null, DurationFieldType.days());
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenInstants_givenBothNull_shouldThrowIllegalArgumentException() {
        BaseSingleFieldPeriod.between((ReadableInstant) null, (ReadableInstant) null, DurationFieldType.days());
    }

    // -----------------------------------------------------------------------
    // Tests for between(ReadablePartial, ReadablePartial, ReadablePeriod)
    // -----------------------------------------------------------------------

    @Test
    public void betweenPartials_givenValidPartials_shouldReturnDifference() {
        ReadablePartial start = new LocalDate(2021, 1, 1);
        ReadablePartial end = new LocalDate(2021, 1, 15);
        ReadablePeriod zero = new MockSingleFieldPeriod(0, DurationFieldType.days(), PeriodType.days());
        int result = BaseSingleFieldPeriod.between(start, end, zero);
        Assert.assertEquals(14, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenPartials_givenNullStart_shouldThrowIllegalArgumentException() {
        ReadablePartial end = new LocalDate(2021, 1, 15);
        ReadablePeriod zero = new MockSingleFieldPeriod(0);
        BaseSingleFieldPeriod.between((ReadablePartial) null, end, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenPartials_givenNullEnd_shouldThrowIllegalArgumentException() {
        ReadablePartial start = new LocalDate(2021, 1, 1);
        ReadablePeriod zero = new MockSingleFieldPeriod(0);
        BaseSingleFieldPeriod.between(start, (ReadablePartial) null, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenPartials_givenDifferentSizes_shouldThrowIllegalArgumentException() {
        ReadablePartial start = new LocalDate(2021, 1, 1); // size 3
        ReadablePartial end = new YearMonth(2021, 1);     // size 2
        ReadablePeriod zero = new MockSingleFieldPeriod(0);
        BaseSingleFieldPeriod.between(start, end, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenPartials_givenSameSizeDifferentTypes_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] types1 = new DateTimeFieldType[] { DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour() };
        DateTimeFieldType[] types2 = new DateTimeFieldType[] { DateTimeFieldType.minuteOfHour(), DateTimeFieldType.secondOfMinute() };
        ReadablePartial start = new Partial(types1, new int[] { 10, 20 });
        ReadablePartial end = new Partial(types2, new int[] { 10, 20 });
        ReadablePeriod zero = new MockSingleFieldPeriod(0);
        BaseSingleFieldPeriod.between(start, end, zero);
    }

    @Test(expected = IllegalArgumentException.class)
    public void betweenPartials_givenNonContiguousPartial_shouldThrowIllegalArgumentException() {
        DateTimeFieldType[] nonContiguousTypes = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth() };
        ReadablePartial start = new Partial(nonContiguousTypes, new int[] { 2021, 1 });
        ReadablePartial end = new Partial(nonContiguousTypes, new int[] { 2021, 15 });
        ReadablePeriod zero = new MockSingleFieldPeriod(0);
        BaseSingleFieldPeriod.between(start, end, zero);
    }

    // -----------------------------------------------------------------------
    // Tests for standardPeriodIn(ReadablePeriod, long)
    // -----------------------------------------------------------------------

    @Test
    public void standardPeriodIn_givenNullPeriod_shouldReturnZero() {
        int result = BaseSingleFieldPeriod.standardPeriodIn(null, 1000L);
        Assert.assertEquals(0, result);
    }

    @Test
    public void standardPeriodIn_givenAllZeroFields_shouldReturnZero() {
        Period period = new Period(0, 0, 0, 0, 0, 0, 0, 0);
        int result = BaseSingleFieldPeriod.standardPeriodIn(period, 1000L);
        Assert.assertEquals(0, result);
    }

    @Test
    public void standardPeriodIn_givenStandardPrecisePeriod_shouldCalculateCorrectUnits() {
        // 1 day = 86,400,000 ms, 2 hours = 7,200,000 ms, total = 93,600,000 ms
        Period period = new Period(0, 0, 0, 1, 2, 0, 0, 0);
        long millisPerHour = 3600000L;
        int result = BaseSingleFieldPeriod.standardPeriodIn(period, millisPerHour);
        Assert.assertEquals(26, result);
    }

    @Test
    public void standardPeriodIn_givenWeeksAndDaysAndHours_shouldCalculateCorrectUnits() {
        // 1 week (7 days) + 3 days = 10 days = 240 hours
        Period period = new Period(0, 0, 1, 3, 0, 0, 0, 0);
        long millisPerHour = 3600000L;
        int result = BaseSingleFieldPeriod.standardPeriodIn(period, millisPerHour);
        Assert.assertEquals(240, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void standardPeriodIn_givenImpreciseMonthField_shouldThrowIllegalArgumentException() {
        Period period = Period.months(1);
        BaseSingleFieldPeriod.standardPeriodIn(period, 1000L);
    }

    @Test(expected = IllegalArgumentException.class)
    public void standardPeriodIn_givenImpreciseYearField_shouldThrowIllegalArgumentException() {
        Period period = Period.years(2);
        BaseSingleFieldPeriod.standardPeriodIn(period, 1000L);
    }

    // -----------------------------------------------------------------------
    // Tests for instance methods: size, getFieldType, getValue, setValue
    // -----------------------------------------------------------------------

    @Test
    public void size_givenAnyInstance_shouldReturnOne() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        Assert.assertEquals(1, period.size());
    }

    @Test
    public void getValue_givenInitializedValue_shouldReturnValue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(42);
        Assert.assertEquals(42, period.getValue());
    }

    @Test
    public void setValue_givenNewValue_shouldUpdateStoredValue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(10);
        Assert.assertEquals(10, period.getValue());
        period.setValuePublic(99);
        Assert.assertEquals(99, period.getValue());
    }

    @Test
    public void getFieldTypeAtIndex_givenIndexZero_shouldReturnFieldType() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        Assert.assertEquals(DurationFieldType.days(), period.getFieldType(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFieldTypeAtIndex_givenPositiveIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getFieldType(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getFieldTypeAtIndex_givenNegativeIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(5);
        period.getFieldType(-1);
    }

    @Test
    public void getValueAtIndex_givenIndexZero_shouldReturnValue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(123);
        Assert.assertEquals(123, period.getValue(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValueAtIndex_givenPositiveIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(123);
        period.getValue(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getValueAtIndex_givenNegativeIndexOutOfBounds_shouldThrowIndexOutOfBoundsException() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(123);
        period.getValue(-1);
    }

    // -----------------------------------------------------------------------
    // Tests for get(DurationFieldType) & isSupported(DurationFieldType)
    // -----------------------------------------------------------------------

    @Test
    public void get_givenMatchingFieldType_shouldReturnValue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertEquals(7, period.get(DurationFieldType.days()));
    }

    @Test
    public void get_givenNonMatchingFieldType_shouldReturnZero() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertEquals(0, period.get(DurationFieldType.hours()));
    }

    @Test
    public void get_givenNullFieldType_shouldReturnZero() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertEquals(0, period.get(null));
    }

    @Test
    public void isSupported_givenMatchingFieldType_shouldReturnTrue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertTrue(period.isSupported(DurationFieldType.days()));
    }

    @Test
    public void isSupported_givenNonMatchingFieldType_shouldReturnFalse() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertFalse(period.isSupported(DurationFieldType.minutes()));
    }

    @Test
    public void isSupported_givenNullFieldType_shouldReturnFalse() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(7);
        Assert.assertFalse(period.isSupported(null));
    }

    // -----------------------------------------------------------------------
    // Tests for toPeriod() & toMutablePeriod()
    // -----------------------------------------------------------------------

    @Test
    public void toPeriod_givenSingleFieldPeriod_shouldReturnEquivalentPeriod() {
        MockSingleFieldPeriod testPeriod = new MockSingleFieldPeriod(14);
        Period result = testPeriod.toPeriod();
        Assert.assertNotNull(result);
        Assert.assertEquals(14, result.getDays());
        Assert.assertEquals(0, result.getHours());
    }

    @Test
    public void toMutablePeriod_givenSingleFieldPeriod_shouldReturnEquivalentMutablePeriod() {
        MockSingleFieldPeriod testPeriod = new MockSingleFieldPeriod(15);
        MutablePeriod result = testPeriod.toMutablePeriod();
        Assert.assertNotNull(result);
        Assert.assertEquals(15, result.getDays());
        Assert.assertEquals(0, result.getHours());
    }

    // -----------------------------------------------------------------------
    // Tests for equals(Object) & hashCode()
    // -----------------------------------------------------------------------

    @Test
    public void equals_givenSameInstance_shouldReturnTrue() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(10);
        Assert.assertTrue(period.equals(period));
    }

    @Test
    public void equals_givenNull_shouldReturnFalse() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(10);
        Assert.assertFalse(period.equals(null));
    }

    @Test
    public void equals_givenNonReadablePeriodObject_shouldReturnFalse() {
        MockSingleFieldPeriod period = new MockSingleFieldPeriod(10);
        Assert.assertFalse(period.equals("Not a period"));
    }

    @Test
    public void equals_givenDifferentPeriodType_shouldReturnFalse() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10, DurationFieldType.days(), PeriodType.days());
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10, DurationFieldType.hours(), PeriodType.hours());
        Assert.assertFalse(period1.equals(period2));
    }

    @Test
    public void equals_givenSamePeriodTypeDifferentValue_shouldReturnFalse() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(20);
        Assert.assertFalse(period1.equals(period2));
    }

    @Test
    public void equals_givenSamePeriodTypeAndValue_shouldReturnTrue() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10);
        Assert.assertTrue(period1.equals(period2));
    }

    @Test
    public void equals_givenMatchingReadablePeriod_shouldReturnTrue() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(5, DurationFieldType.days(), PeriodType.days());
        Days days = Days.days(5);
        Assert.assertTrue(period1.equals(days));
    }

    @Test
    public void hashCode_givenEqualObjects_shouldHaveSameHashCode() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(25);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(25);
        Assert.assertEquals(period1.hashCode(), period2.hashCode());
    }

    @Test
    public void hashCode_givenDifferentValues_shouldHaveDifferentHashCode() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(25);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(26);
        Assert.assertTrue(period1.hashCode() != period2.hashCode());
    }

    // -----------------------------------------------------------------------
    // Tests for compareTo(BaseSingleFieldPeriod)
    // -----------------------------------------------------------------------

    @Test
    public void compareTo_givenEqualValues_shouldReturnZero() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10);
        Assert.assertEquals(0, period1.compareTo(period2));
    }

    @Test
    public void compareTo_givenGreaterValue_shouldReturnOne() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(15);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10);
        Assert.assertEquals(1, period1.compareTo(period2));
    }

    @Test
    public void compareTo_givenLesserValue_shouldReturnNegativeOne() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(5);
        MockSingleFieldPeriod period2 = new MockSingleFieldPeriod(10);
        Assert.assertEquals(-1, period1.compareTo(period2));
    }

    @Test(expected = NullPointerException.class)
    public void compareTo_givenNull_shouldThrowNullPointerException() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        period1.compareTo(null);
    }

    @Test(expected = ClassCastException.class)
    public void compareTo_givenDifferentSubclass_shouldThrowClassCastException() {
        MockSingleFieldPeriod period1 = new MockSingleFieldPeriod(10);
        AnotherSingleFieldPeriod period2 = new AnotherSingleFieldPeriod(10);
        period1.compareTo(period2);
    }
}