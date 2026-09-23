package org.joda.time.base;

import static org.junit.Assert.*;
import org.junit.Test;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePeriod;
import org.joda.time.base.BasePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.Duration;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTime;
import org.joda.time.MutablePeriod;
import org.joda.time.ReadWritablePeriod;

public class BasePeriodTest extends BasePeriod {

    public BasePeriodTest() {
        super(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
    }

    @Test
    public void testConstructorWithAllFields() {
        BasePeriod period = new BasePeriodTest() {
            {
                setPeriod(1, 2, 3, 4, 5, 6, 7, 8);
            }
        };
        assertEquals(1, period.getValue(0));
        assertEquals(2, period.getValue(1));
        assertEquals(3, period.getValue(2));
        assertEquals(4, period.getValue(3));
        assertEquals(5, period.getValue(4));
        assertEquals(6, period.getValue(5));
        assertEquals(7, period.getValue(6));
        assertEquals(8, period.getValue(7));
        assertNull(period.getPeriodType());
    }

    @Test
    public void testConstructorWithLongDuration() {
        BasePeriod period = new BasePeriod(1000L);
        assertEquals(1, period.getValue(0));
        assertEquals(0, period.getValue(1));
        assertEquals(0, period.getValue(2));
        assertEquals(0, period.getValue(3));
        assertEquals(0, period.getValue(4));
        assertEquals(0, period.getValue(5));
        assertEquals(0, period.getValue(6));
        assertEquals(0, period.getValue(7));
    }

    @Test
    public void testConstructorWithNullPeriod() {
        try {
            new BasePeriod(null, PeriodType.standard(), ISOChronology.getInstance()) {
                {
                }
            };
            fail("Expected IllegalArgumentException for null period");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("null"));
        }
    }

    @Test
    public void testSetFieldWithSupportedField() {
        BasePeriod period = new BasePeriodTest();
        period.setField(DurationFieldType.years(), 5);
        assertEquals(5, period.getValue(0));
        period.setField(DurationFieldType.hours(), 10);
        assertEquals(10, period.getValue(4));
    }

    @Test
    public void testSetFieldUnsupportedField() {
        BasePeriod period = new BasePeriodTest();
        DurationFieldType unsupported = new DurationFieldType("years") {
        };
        try {
            period.setField(unsupported, 1);
            fail("Expected IllegalArgumentException for unsupported field");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not support"));
        }
    }

    @Test
    public void testSetFieldWithNullFieldAndNonZeroValue() {
        BasePeriod period = new BasePeriodTest();
        try {
            period.setField(null, 1);
            fail("Expected IllegalArgumentException for null field with non-zero value");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not support"));
        }
    }

    @Test
    public void testSetFieldWithNullFieldAndZeroValue() {
        BasePeriod period = new BasePeriodTest();
        period.setField(null, 0);
        // Should not throw exception
    }

    @Test
    public void testAddFieldSupported() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(1, 0, 0, 0, 0, 0, 0, 0);
        period.addField(DurationFieldType.years(), 2);
        assertEquals(3, period.getValue(0));
        period.addField(DurationFieldType.hours(), 5);
        assertEquals(5, period.getValue(4));
    }

    @Test
    public void testAddFieldUnsupported() {
        BasePeriod period = new BasePeriodTest();
        DurationFieldType unsupported = new DurationFieldType("months") {
        };
        try {
            period.addField(unsupported, 1);
            fail("Expected IllegalArgumentException for unsupported field");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not support"));
        }
    }

    @Test
    public void testAddFieldWithZeroValue() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(0, 0, 0, 0, 0, 0, 0, 0);
        period.addField(DurationFieldType.days(), 0);
        assertEquals(0, period.getValue(3));
    }

    @Test
    public void testMergePeriodWithNull() {
        BasePeriod period = new BasePeriodTest();
        period.mergePeriod(null);
        assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, period.getValues());
    }

    @Test
    public void testMergePeriodWithValues() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(1, 2, 3, 4, 5, 6, 7, 8);
        MutablePeriod merge = new MutablePeriod(1, 1, 1, 1, 1, 1, 1, 1, PeriodType.standard());
        period.mergePeriod(merge);
        assertArrayEquals(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, period.getValues());
    }

    @Test
    public void testAddPeriodWithNull() {
        BasePeriod period = new BasePeriodTest();
        period.addPeriod(null);
        assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0}, period.getValues());
    }

    @Test
    public void testAddPeriodWithValues() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(1, 2, 3, 4, 5, 6, 7, 8);
        MutablePeriod add = new MutablePeriod(0, 1, 0, 1, 0, 1, 0, 1, PeriodType.standard());
        period.addPeriod(add);
        assertArrayEquals(new int[] {1, 3, 3, 5, 5, 7, 7, 9}, period.getValues());
    }

    @Test
    public void testAddPeriodUnsupportedField() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(0, 0, 0, 0, 0, 0, 0, 0);
        MutablePeriod unsupported = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        unsupported.setField(DurationFieldType.weeks(), 1);
        try {
            period.addPeriod(unsupported);
            fail("Expected IllegalArgumentException for unsupported field");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("not support"));
        }
    }

    @Test
    public void testToDurationFrom() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(0, 0, 0, 1, 0, 0, 0, 0);
        DateTime start = new DateTime(2020, 1, 1, 0, 0, 0, 0);
        Duration duration = period.toDurationFrom(start);
        assertEquals(86400000L, duration.getMillis());
    }

    @Test
    public void testToDurationTo() {
        BasePeriod period = new BasePeriodTest();
        period.setPeriod(0, 0, 0, 1, 0, 0, 0, 0);
        DateTime end = new DateTime(2020, 1, 2, 0, 0, 0, 0);
        Duration duration = period.toDurationTo(end);
        assertEquals(86400000L, duration.getMillis());
    }

    @Test
    public void testGetValueInvalidIndex() {
        BasePeriod period = new BasePeriodTest();
        try {
            period.getValue(100);
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testSetValues() {
        BasePeriod period = new BasePeriodTest();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        period.setValues(values);
        assertArrayEquals(values, period.getValues());
    }

    @Test
    public void testCheckAndUpdateWithNullField() {
        BasePeriod period = new BasePeriodTest();
        int[] values = new int[period.size()];
        period.checkAndUpdate(null, values, 0);
        assertArrayEquals(new int[period.size()], values);
    }
}