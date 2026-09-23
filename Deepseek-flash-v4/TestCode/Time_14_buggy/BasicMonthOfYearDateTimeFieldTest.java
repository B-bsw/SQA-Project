package org.joda.time.chrono;

import org.junit.Before;
import org.junit.Test;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.field.ImpreciseDateTimeField;
import static org.junit.Assert.*;

public class BasicMonthOfYearDateTimeFieldTest {
    private BasicChronology chronology;
    private BasicMonthOfYearDateTimeField field;

    @Before
    public void setUp() {
        // Use a concrete BasicChronology implementation
        chronology = new BasicChronology(null, null, 0);
        field = new BasicMonthOfYearDateTimeField(chronology, DateTimeConstants.FEBRUARY);
    }

    @Test
    public void testIsLenient() {
        assertFalse(field.isLenient());
    }

    @Test
    public void testGetWithInstant() {
        long instant = DateTimeUtils.currentTimeMillis();
        // Set a specific time: Jan 1, 2020 00:00:00
        instant = 1577836800000L;
        int month = field.get(instant);
        assertEquals(DateTimeConstants.JANUARY, month);
    }

    @Test
    public void testAddWithZeroMonths() {
        long instant = 1577836800000L; // Jan 1, 2020
        assertEquals(instant, field.add(instant, 0));
    }

    @Test
    public void testAddPositiveMonths() {
        long instant = 1577836800000L; // Jan 1, 2020
        long result = field.add(instant, 1);
        assertEquals(1580515200000L, result); // Feb 1, 2020
    }

    @Test
    public void testAddNegativeMonths() {
        long instant = 1580515200000L; // Feb 1, 2020
        long result = field.add(instant, -1);
        assertEquals(1577836800000L, result); // Jan 1, 2020
    }

    @Test
    public void testAddToEndOfMonth() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-01-31T00:00:00");
        long result = field.add(instant, 1);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-02-29T00:00:00"), result);
    }

    @Test
    public void testAddMarginalFromEndOfMonth() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-01-31T00:00:00");
        long result = field.add(instant, -1);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2019-12-31T00:00:00"), result);
    }

    @Test
    public void testAddForcesDayOfMonth() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-07-31T00:00:00");
        long result = field.add(instant, 1);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-08-31T00:00:00"), result);
    }

    @Test
    public void testAddWrapAroundYear() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-12-31T00:00:00");
        long result = field.add(instant, 1);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2021-01-31T00:00:00"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddLongWithValueTooLarge() {
        long instant = 1577836800000L; // Jan 1, 2020
        field.add(instant, Integer.MAX_VALUE + 10L);
    }

    @Test
    public void testAddLongNormalCase() {
        long instant = 1577836800000L; // Jan 1, 2020
        long result = field.add(instant, 12L);
        assertEquals(1617235200000L, result); // Jan 1, 2021
    }

    @Test
    public void testAddPartial() {
        ReadablePartial partial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }
            @Override
            public DateTimeFieldType getFieldType(int index) {
                return index == 0 ? DateTimeFieldType.monthOfYear() : DateTimeFieldType.dayOfMonth();
            }
            @Override
            public int getValue(int index) {
                return index == 0 ? 5 : 15;
            }
            @Override
            public DateTimeFieldType getFieldType() {
                return null;
            }
            @Override
            public int get(DateTimeFieldType fieldType) {
                return fieldType.equals(DateTimeFieldType.monthOfYear()) ? 5 : 15;
            }
            @Override
            public DateTimeFieldType getField(int index) {
                return getFieldType(index);
            }
        };
        int[] values = new int[]{5, 15};
        int[] result = field.add(partial, 0, values, 3);
        assertArrayEquals(new int[]{8, 15}, result);
    }

    @Test
    public void testAddPartialWithNoContiguous() {
        ReadablePartial partial = new ReadablePartial() {
            @Override
            public int size() {
                return 2;
            }
            @Override
            public DateTimeFieldType getFieldType(int index) {
                return index == 0 ? DateTimeFieldType.monthOfYear() : DateTimeFieldType.dayOfMonth();
            }
            @Override
            public int getValue(int index) {
                return index == 0 ? 15 : 30;
            }
            @Override
            public DateTimeFieldType getFieldType() {
                return null;
            }
            @Override
            public int get(DateTimeFieldType fieldType) {
                return fieldType.equals(DateTimeFieldType.monthOfYear()) ? 15 : 30;
            }
            @Override
            public DateTimeFieldType getField(int index) {
                return getFieldType(index);
            }
        };
        int[] values = new int[]{15, 30};
        int[] result = field.add(partial, 0, values, 3);
        assertArrayEquals(new int[]{18, 30}, result);
    }

    @Test
    public void testAddWrapField() {
        long instant = 1577836800000L; // Jan 1, 2020
        long result = field.addWrapField(instant, 13);
        assertEquals(field.set(instant, DateTimeConstants.JANUARY + 1), result);
    }

    @Test
    public void testGetDifferenceAsLong() {
        long minuend = DateTimeUtils.dateTimeParser().parseMillis("2020-03-15T00:00:00");
        long subtrahend = DateTimeUtils.dateTimeParser().parseMillis("2020-01-15T00:00:00");
        assertEquals(2L, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifferenceAsLongNegative() {
        long minuend = DateTimeUtils.dateTimeParser().parseMillis("2020-01-15T00:00:00");
        long subtrahend = DateTimeUtils.dateTimeParser().parseMillis("2020-03-15T00:00:00");
        assertEquals(-2L, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testGetDifferenceAsLongWithDayOfMonthAdjustment() {
        long minuend = DateTimeUtils.dateTimeParser().parseMillis("2020-02-29T00:00:00");
        long subtrahend = DateTimeUtils.dateTimeParser().parseMillis("2020-01-31T00:00:00");
        assertEquals(1L, field.getDifferenceAsLong(minuend, subtrahend));
    }

    @Test
    public void testSetValidField() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-01-15T00:00:00");
        long result = field.set(instant, 3);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-03-15T00:00:00"), result);
    }

    @Test
    public void testSetWithDayOfMonthAdjustment() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-01-31T00:00:00");
        long result = field.set(instant, DateTimeConstants.FEBRUARY);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-02-29T00:00:00"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetInvalidMonth() {
        long instant = 1577836800000L;
        field.set(instant, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetMonthTooHigh() {
        long instant = 1577836800000L;
        field.set(instant, 13);
    }

    @Test
    public void testGetRangeDurationField() {
        assertNotNull(field.getRangeDurationField());
        assertEquals("years()", field.getRangeDurationField().getName());
    }

    @Test
    public void testIsLeap() {
        long leapYearInstant = DateTimeUtils.dateTimeParser().parseMillis("2020-02-15T00:00:00");
        assertTrue(field.isLeap(leapYearInstant));
    }

    @Test
    public void testIsNotLeap() {
        long nonLeapYearInstant = DateTimeUtils.dateTimeParser().parseMillis("2020-03-15T00:00:00");
        assertFalse(field.isLeap(nonLeapYearInstant));
    }

    @Test
    public void testGetLeapAmountWhenLeap() {
        long leapInstant = DateTimeUtils.dateTimeParser().parseMillis("2020-02-15T00:00:00");
        assertEquals(1, field.getLeapAmount(leapInstant));
    }

    @Test
    public void testGetLeapAmountWhenNotLeap() {
        long nonLeapInstant = DateTimeUtils.dateTimeParser().parseMillis("2020-03-15T00:00:00");
        assertEquals(0, field.getLeapAmount(nonLeapInstant));
    }

    @Test
    public void testGetLeapDurationField() {
        assertNotNull(field.getLeapDurationField());
        assertEquals("days()", field.getLeapDurationField().getName());
    }

    @Test
    public void testGetMinimumValue() {
        assertEquals(DateTimeConstants.JANUARY, field.getMinimumValue());
    }

    @Test
    public void testGetMaximumValue() {
        assertEquals(12, field.getMaximumValue());
    }

    @Test
    public void testRoundFloor() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-02-15T10:30:00");
        long floor = field.roundFloor(instant);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-02-01T00:00:00"), floor);
    }

    @Test
    public void testRemainder() {
        long instant = DateTimeUtils.dateTimeParser().parseMillis("2020-02-15T10:30:00");
        long remainder = field.remainder(instant);
        assertEquals(DateTimeUtils.dateTimeParser().parseMillis("2020-02-15T00:00:00") - 
                     DateTimeUtils.dateTimeParser().parseMillis("2020-02-01T00:00:00"), remainder);
    }
}

class BasicChronology extends org.joda.time.chrono.BasicChronology {
    public BasicChronology(org.joda.time.chrono.BasicChronology base, Object param, int minDaysInFirstWeek) {
        super(base, param, minDaysInFirstWeek);
    }
    // Need to implement abstract methods or use a concrete implementation
    // For testing purposes, we'll use a simple GregorianChronology
    public BasicChronology() {
        super(null, null, 4);
    }
    // Override abstract methods
    @Override
    public int getMinYear() {
        return -292269055;
    }
    @Override
    public int getMaxYear() {
        return 292278993;
    }
}