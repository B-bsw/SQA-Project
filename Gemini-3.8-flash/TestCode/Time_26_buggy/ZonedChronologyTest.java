package org.joda.time.chrono;

import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;

public class ZonedChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    @Test
    public void getInstance_givenValidBaseAndZone_shouldCreateInstance() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(base, chrono.getBase());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInstance_givenNullBase_shouldThrowException() {
        ZonedChronology.getInstance(null, PARIS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInstance_givenNullZone_shouldThrowException() {
        ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInstance_givenBaseWithNullUTC_shouldThrowException() {
        Chronology mockBase = new BaseChronology() {
            private static final long serialVersionUID = 1L;
            public DateTimeZone getZone() {
                return DateTimeZone.UTC;
            }
            public Chronology withUTC() {
                return null;
            }
            public Chronology withZone(DateTimeZone zone) {
                return this;
            }
            public String toString() {
                return "MockBase";
            }
        };
        ZonedChronology.getInstance(mockBase, PARIS);
    }

    @Test
    public void withUTC_givenZonedChronology_shouldReturnBaseChronology() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Chronology result = chrono.withUTC();
        Assert.assertEquals(base, result);
    }

    @Test
    public void withZone_givenNullZone_shouldUseDefaultZone() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Chronology result = chrono.withZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), result.getZone());
    }

    @Test
    public void withZone_givenSameZone_shouldReturnSameInstance() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Chronology result = chrono.withZone(PARIS);
        Assert.assertSame(chrono, result);
    }

    @Test
    public void withZone_givenUTCZone_shouldReturnBaseChronology() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Chronology result = chrono.withZone(DateTimeZone.UTC);
        Assert.assertSame(base, result);
    }

    @Test
    public void withZone_givenDifferentZone_shouldReturnNewZonedChronology() {
        Chronology base = ISOChronology.getInstanceUTC();
        ZonedChronology chrono = ZonedChronology.getInstance(base, PARIS);

        Chronology result = chrono.withZone(NEW_YORK);
        Assert.assertNotSame(chrono, result);
        Assert.assertEquals(NEW_YORK, result.getZone());
    }

    @Test
    public void getDateTimeMillis_givenDateAndMillisOfDay_shouldCalculateCorrectly() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        long millis = chrono.getDateTimeMillis(2021, 6, 15, 3600000);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 14, 23, 0, 0, 0);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void getDateTimeMillis_givenYMDHMSM_shouldCalculateCorrectly() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        long millis = chrono.getDateTimeMillis(2021, 6, 15, 14, 30, 45, 123);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 12, 30, 45, 123);
        Assert.assertEquals(expected, millis);
    }

    @Test
    public void getDateTimeMillis_givenInstantAndHMSM_shouldCalculateCorrectly() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        long baseInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 0, 0, 0, 0);
        long millis = chrono.getDateTimeMillis(baseInstant, 10, 20, 30, 40);
        long expected = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 8, 20, 30, 40);
        Assert.assertEquals(expected, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDateTimeMillis_givenGapTransition_shouldThrowIllegalArgumentException() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), NEW_YORK);
        chrono.getDateTimeMillis(2007, 3, 11, 2, 30, 0, 0);
    }

    @Test
    public void equalsAndHashCode_givenVariousScenarios_shouldAdhereToContract() {
        Chronology isoBase = ISOChronology.getInstanceUTC();
        Chronology gjBase = GJChronology.getInstanceUTC();

        ZonedChronology chrono1 = ZonedChronology.getInstance(isoBase, PARIS);
        ZonedChronology chrono2 = ZonedChronology.getInstance(isoBase, PARIS);
        ZonedChronology chrono3 = ZonedChronology.getInstance(isoBase, NEW_YORK);
        ZonedChronology chrono4 = ZonedChronology.getInstance(gjBase, PARIS);

        Assert.assertTrue(chrono1.equals(chrono1));
        Assert.assertTrue(chrono1.equals(chrono2));
        Assert.assertEquals(chrono1.hashCode(), chrono2.hashCode());

        Assert.assertFalse(chrono1.equals(chrono3));
        Assert.assertFalse(chrono1.equals(chrono4));
        Assert.assertFalse(chrono1.equals(null));
        Assert.assertFalse(chrono1.equals("SomeString"));
    }

    @Test
    public void toString_givenZonedChronology_shouldContainBaseAndZoneName() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        String str = chrono.toString();
        Assert.assertTrue(str.startsWith("ZonedChronology["));
        Assert.assertTrue(str.indexOf(PARIS.getID()) >= 0);
    }

    @Test
    public void useTimeArithmetic_givenVariousFields_shouldReturnCorrectFlag() {
        DurationField millisField = ISOChronology.getInstanceUTC().millis();
        DurationField hoursField = ISOChronology.getInstanceUTC().hours();
        DurationField daysField = ISOChronology.getInstanceUTC().days();
        DurationField yearsField = ISOChronology.getInstanceUTC().years();

        Assert.assertFalse(ZonedChronology.useTimeArithmetic(null));
        Assert.assertTrue(ZonedChronology.useTimeArithmetic(millisField));
        Assert.assertTrue(ZonedChronology.useTimeArithmetic(hoursField));
        Assert.assertFalse(ZonedChronology.useTimeArithmetic(daysField));
        Assert.assertFalse(ZonedChronology.useTimeArithmetic(yearsField));
    }

    @Test
    public void zonedDurationField_methods_shouldWorkAsExpected() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DurationField days = chrono.days();
        DurationField hours = chrono.hours();

        Assert.assertTrue(days.isSupported());
        Assert.assertFalse(days.isPrecise());
        Assert.assertTrue(hours.isPrecise());
        Assert.assertEquals(86400000L, days.getUnitMillis());

        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 1, 12, 0, 0, 0);

        Assert.assertEquals(2, days.getValue(172800000L, instant));
        Assert.assertEquals(2L, days.getValueAsLong(172800000L, instant));
        Assert.assertEquals(172800000L, days.getMillis(2, instant));
        Assert.assertEquals(172800000L, days.getMillis(2L, instant));

        long addedDaysInt = days.add(instant, 2);
        long addedDaysLong = days.add(instant, 2L);
        Assert.assertEquals(addedDaysInt, addedDaysLong);

        long addedHoursInt = hours.add(instant, 5);
        long addedHoursLong = hours.add(instant, 5L);
        Assert.assertEquals(addedHoursInt, addedHoursLong);
        Assert.assertEquals(instant + 5 * 3600000L, addedHoursInt);

        Assert.assertEquals(2, days.getDifference(addedDaysInt, instant));
        Assert.assertEquals(2L, days.getDifferenceAsLong(addedDaysLong, instant));
        Assert.assertEquals(5, hours.getDifference(addedHoursInt, instant));
        Assert.assertEquals(5L, hours.getDifferenceAsLong(addedHoursLong, instant));
    }

    @Test(expected = IllegalArgumentException.class)
    public void zonedDurationField_givenUnsupportedField_shouldThrowException() {
        DurationField unsupportedField = new UnsupportedDurationField(DurationFieldType.days());
        new ZonedChronology.ZonedDurationField(unsupportedField, PARIS);
    }

    private static class UnsupportedDurationField extends DurationField {
        private final DurationFieldType iType;
        UnsupportedDurationField(DurationFieldType type) {
            this.iType = type;
        }
        public DurationFieldType getType() {
            return this.iType;
        }
        public String getName() {
            return this.iType.getName();
        }
        public boolean isSupported() {
            return false;
        }
        public boolean isPrecise() {
            return false;
        }
        public long getUnitMillis() {
            return 0;
        }
        public int getValue(long duration) { return 0; }
        public long getValueAsLong(long duration) { return 0; }
        public int getValue(long duration, long instant) { return 0; }
        public long getValueAsLong(long duration, long instant) { return 0; }
        public long getMillis(int value) { return 0; }
        public long getMillis(long value) { return 0; }
        public long getMillis(int value, long instant) { return 0; }
        public long getMillis(long value, long instant) { return 0; }
        public long add(long instant, int value) { return instant; }
        public long add(long instant, long value) { return instant; }
        public int getDifference(long minuendInstant, long subtrahendInstant) { return 0; }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { return 0; }
        public int compareTo(Object o) { return 0; }
    }

    @Test(expected = IllegalArgumentException.class)
    public void zonedDateTimeField_givenUnsupportedField_shouldThrowException() {
        DateTimeField unsupported = new UnsupportedDateTimeField();
        DurationField dur = ISOChronology.getInstanceUTC().days();
        new ZonedChronology.ZonedDateTimeField(unsupported, PARIS, dur, dur, dur);
    }

    private static class UnsupportedDateTimeField extends DateTimeField {
        public DateTimeFieldType getType() {
            return DateTimeFieldType.dayOfMonth();
        }
        public String getName() {
            return "dayOfMonth";
        }
        public boolean isSupported() {
            return false;
        }
        public boolean isLenient() {
            return false;
        }
        public int get(long instant) { return 0; }
        public String getAsText(long instant, Locale locale) { return null; }
        public String getAsText(long instant) { return null; }
        public String getAsText(int fieldValue, Locale locale) { return null; }
        public String getAsText(int fieldValue) { return null; }
        public String getAsShortText(long instant, Locale locale) { return null; }
        public String getAsShortText(long instant) { return null; }
        public String getAsShortText(int fieldValue, Locale locale) { return null; }
        public String getAsShortText(int fieldValue) { return null; }
        public long add(long instant, int value) { return 0; }
        public long add(long instant, long value) { return 0; }
        public int[] add(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return values; }
        public int[] addWrapPartial(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return values; }
        public long addWrapField(long instant, int value) { return 0; }
        public int[] addWrapField(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd) { return values; }
        public int getDifference(long minuendInstant, long subtrahendInstant) { return 0; }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { return 0; }
        public long set(long instant, int value) { return 0; }
        public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, int newValue) { return values; }
        public long set(long instant, String text, Locale locale) { return 0; }
        public long set(long instant, String text) { return 0; }
        public int[] set(org.joda.time.ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale) { return values; }
        public DurationField getDurationField() { return null; }
        public DurationField getRangeDurationField() { return null; }
        public boolean isLeap(long instant) { return false; }
        public int getLeapAmount(long instant) { return 0; }
        public DurationField getLeapDurationField() { return null; }
        public int getMinimumValue() { return 0; }
        public int getMinimumValue(long instant) { return 0; }
        public int getMinimumValue(org.joda.time.ReadablePartial instant) { return 0; }
        public int getMinimumValue(org.joda.time.ReadablePartial instant, int[] values) { return 0; }
        public int getMaximumValue() { return 0; }
        public int getMaximumValue(long instant) { return 0; }
        public int getMaximumValue(org.joda.time.ReadablePartial instant) { return 0; }
        public int getMaximumValue(org.joda.time.ReadablePartial instant, int[] values) { return 0; }
        public int getMaximumTextLength(Locale locale) { return 0; }
        public int getMaximumShortTextLength(Locale locale) { return 0; }
        public long roundFloor(long instant) { return 0; }
        public long roundCeiling(long instant) { return 0; }
        public long roundHalfFloor(long instant) { return 0; }
        public long roundHalfCeiling(long instant) { return 0; }
        public long roundHalfEven(long instant) { return 0; }
        public long remainder(long instant) { return 0; }
    }

    @Test
    public void zonedDateTimeField_timeFieldOperations_shouldWorkCorrectly() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField hourField = chrono.hourOfDay();
        DateTimeField minuteField = chrono.minuteOfHour();

        Assert.assertFalse(hourField.isLenient());
        Assert.assertNotNull(hourField.getDurationField());
        Assert.assertNotNull(hourField.getRangeDurationField());
        Assert.assertNull(hourField.getLeapDurationField());
        Assert.assertFalse(hourField.isLeap(0L));
        Assert.assertEquals(0, hourField.getLeapAmount(0L));

        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 12, 0, 0, 0);

        Assert.assertEquals(14, hourField.get(instant));
        Assert.assertEquals("14", hourField.getAsText(instant, Locale.ENGLISH));
        Assert.assertEquals("14", hourField.getAsShortText(instant, Locale.ENGLISH));
        Assert.assertEquals("5", hourField.getAsText(5, Locale.ENGLISH));
        Assert.assertEquals("5", hourField.getAsShortText(5, Locale.ENGLISH));

        long addedInt = hourField.add(instant, 2);
        Assert.assertEquals(16, hourField.get(addedInt));
        long addedLong = hourField.add(instant, 2L);
        Assert.assertEquals(16, hourField.get(addedLong));

        long wrapAdded = hourField.addWrapField(instant, 15);
        Assert.assertEquals(5, hourField.get(wrapAdded));

        long setVal = hourField.set(instant, 8);
        Assert.assertEquals(8, hourField.get(setVal));

        long setStr = hourField.set(instant, "9", Locale.ENGLISH);
        Assert.assertEquals(9, hourField.get(setStr));

        Assert.assertEquals(2, hourField.getDifference(addedInt, instant));
        Assert.assertEquals(2L, hourField.getDifferenceAsLong(addedLong, instant));

        long roundFloor = minuteField.roundFloor(instant + 45000L);
        Assert.assertEquals(instant, roundFloor);

        long roundCeiling = minuteField.roundCeiling(instant + 45000L);
        Assert.assertEquals(instant + 60000L, roundCeiling);

        long rem = minuteField.remainder(instant + 45000L);
        Assert.assertEquals(45000L, rem);

        Assert.assertEquals(0, hourField.getMinimumValue());
        Assert.assertEquals(0, hourField.getMinimumValue(instant));
        Assert.assertEquals(23, hourField.getMaximumValue());
        Assert.assertEquals(23, hourField.getMaximumValue(instant));
        Assert.assertEquals(2, hourField.getMaximumTextLength(Locale.ENGLISH));
        Assert.assertEquals(2, hourField.getMaximumShortTextLength(Locale.ENGLISH));

        Partial partial = new Partial(DateTimeFieldType.hourOfDay(), 10);
        Assert.assertEquals(0, hourField.getMinimumValue(partial));
        Assert.assertEquals(0, hourField.getMinimumValue(partial, new int[]{10}));
        Assert.assertEquals(23, hourField.getMaximumValue(partial));
        Assert.assertEquals(23, hourField.getMaximumValue(partial, new int[]{10}));
    }

    @Test
    public void zonedDateTimeField_dateFieldOperations_shouldWorkCorrectly() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), PARIS);
        DateTimeField dayField = chrono.dayOfMonth();
        DateTimeField monthField = chrono.monthOfYear();
        DateTimeField yearField = chrono.year();

        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 12, 0, 0, 0);

        Assert.assertEquals(15, dayField.get(instant));
        Assert.assertEquals(6, monthField.get(instant));
        Assert.assertEquals(2021, yearField.get(instant));

        long dayAddedInt = dayField.add(instant, 5);
        Assert.assertEquals(20, dayField.get(dayAddedInt));

        long dayAddedLong = dayField.add(instant, 5L);
        Assert.assertEquals(20, dayField.get(dayAddedLong));

        long dayWrap = dayField.addWrapField(instant, 20);
        Assert.assertEquals(5, dayField.get(dayWrap));

        long daySet = dayField.set(instant, 25);
        Assert.assertEquals(25, dayField.get(daySet));

        long monthSetText = monthField.set(instant, "January", Locale.ENGLISH);
        Assert.assertEquals(1, monthField.get(monthSetText));

        long floor = dayField.roundFloor(instant);
        Assert.assertEquals(ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 14, 22, 0, 0, 0), floor);

        long ceil = dayField.roundCeiling(instant);
        Assert.assertEquals(ISOChronology.getInstanceUTC().getDateTimeMillis(2021, 6, 15, 22, 0, 0, 0), ceil);

        long leapInstant = ISOChronology.getInstanceUTC().getDateTimeMillis(2020, 2, 1, 0, 0, 0, 0);
        Assert.assertTrue(yearField.isLeap(leapInstant));
        Assert.assertEquals(1, yearField.getLeapAmount(leapInstant));
        Assert.assertNotNull(yearField.getLeapDurationField());
    }

    @Test(expected = IllegalFieldValueException.class)
    public void zonedDateTimeField_setDuringDstGap_shouldThrowIllegalFieldValueException() {
        Chronology chrono = ZonedChronology.getInstance(ISOChronology.getInstanceUTC(), NEW_YORK);
        long instant = ISOChronology.getInstanceUTC().getDateTimeMillis(2007, 3, 11, 0, 0, 0, 0);
        chrono.hourOfDay().set(instant, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void zonedDurationField_offsetOverflow_shouldThrowArithmeticException() {
        DateTimeZone zoneWithLargeOffset = new DateTimeZone("TestZone") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "TZ"; }
            public int getOffset(long instant) { return 100000; }
            public int getStandardOffset(long instant) { return 100000; }
            public boolean isFixed() { return true; }
            public long nextTransition(long instant) { return instant; }
            public long previousTransition(long instant) { return instant; }
            public boolean equals(Object obj) { return this == obj; }
        };
        ZonedChronology.ZonedDurationField field = new ZonedChronology.ZonedDurationField(
                ISOChronology.getInstanceUTC().hours(), zoneWithLargeOffset);
        field.add(Long.MAX_VALUE - 10, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void zonedDurationField_offsetUnderflow_shouldThrowArithmeticException() {
        DateTimeZone zoneWithNegativeOffset = new DateTimeZone("NegZone") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "NZ"; }
            public int getOffset(long instant) { return -100000; }
            public int getStandardOffset(long instant) { return -100000; }
            public int getOffsetFromLocal(long instant) { return 100000; }
            public boolean isFixed() { return true; }
            public long nextTransition(long instant) { return instant; }
            public long previousTransition(long instant) { return instant; }
            public boolean equals(Object obj) { return this == obj; }
        };
        ZonedChronology.ZonedDurationField field = new ZonedChronology.ZonedDurationField(
                ISOChronology.getInstanceUTC().days(), zoneWithNegativeOffset);
        field.add(Long.MIN_VALUE + 10, 1);
    }

    @Test(expected = ArithmeticException.class)
    public void zonedDateTimeField_offsetOverflow_shouldThrowArithmeticException() {
        DateTimeZone zoneWithLargeOffset = new DateTimeZone("TestZone2") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "TZ2"; }
            public int getOffset(long instant) { return 100000; }
            public int getStandardOffset(long instant) { return 100000; }
            public boolean isFixed() { return true; }
            public long nextTransition(long instant) { return instant; }
            public long previousTransition(long instant) { return instant; }
            public boolean equals(Object obj) { return this == obj; }
        };
        DurationField dur = ISOChronology.getInstanceUTC().hours();
        ZonedChronology.ZonedDateTimeField field = new ZonedChronology.ZonedDateTimeField(
                ISOChronology.getInstanceUTC().hourOfDay(), zoneWithLargeOffset, dur, dur, null);
        field.add(Long.MAX_VALUE - 10, 1);
    }
}