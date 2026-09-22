package org.joda.time.base;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.Duration;
import org.joda.time.DurationFieldType;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.MonthDay;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.YearMonth;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

public class BasePeriodTest {

    private static class TestPeriodImpl extends BasePeriod {
        private static final long serialVersionUID = 1L;

        public TestPeriodImpl(int years, int months, int weeks, int days,
                              int hours, int minutes, int seconds, int millis,
                              PeriodType type) {
            super(years, months, weeks, days, hours, minutes, seconds, millis, type);
        }

        public TestPeriodImpl(long startInstant, long endInstant, PeriodType type, Chronology chrono) {
            super(startInstant, endInstant, type, chrono);
        }

        public TestPeriodImpl(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) {
            super(startInstant, endInstant, type);
        }

        public TestPeriodImpl(ReadablePartial start, ReadablePartial end, PeriodType type) {
            super(start, end, type);
        }

        public TestPeriodImpl(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) {
            super(startInstant, duration, type);
        }

        public TestPeriodImpl(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) {
            super(duration, endInstant, type);
        }

        public TestPeriodImpl(long duration) {
            super(duration);
        }

        public TestPeriodImpl(long duration, PeriodType type, Chronology chrono) {
            super(duration, type, chrono);
        }

        public TestPeriodImpl(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public TestPeriodImpl(int[] values, PeriodType type) {
            super(values, type);
        }

        public PeriodType publicCheckPeriodType(PeriodType type) {
            return super.checkPeriodType(type);
        }

        public void publicSetPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        public void publicSetPeriod(int years, int months, int weeks, int days,
                                    int hours, int minutes, int seconds, int millis) {
            super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        public void publicSetField(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        public void publicSetFieldInto(int[] values, DurationFieldType field, int value) {
            super.setFieldInto(values, field, value);
        }

        public void publicAddField(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        public void publicAddFieldInto(int[] values, DurationFieldType field, int value) {
            super.addFieldInto(values, field, value);
        }

        public void publicMergePeriod(ReadablePeriod period) {
            super.mergePeriod(period);
        }

        public int[] publicMergePeriodInto(int[] values, ReadablePeriod period) {
            return super.mergePeriodInto(values, period);
        }

        public void publicAddPeriod(ReadablePeriod period) {
            super.addPeriod(period);
        }

        public int[] publicAddPeriodInto(int[] values, ReadablePeriod period) {
            return super.addPeriodInto(values, period);
        }

        public void publicSetValue(int index, int value) {
            super.setValue(index, value);
        }

        public void publicSetValues(int[] values) {
            super.setValues(values);
        }
    }

    private static class TestReadWritablePeriodImpl extends BasePeriod implements ReadWritablePeriod {
        private static final long serialVersionUID = 1L;

        public TestReadWritablePeriodImpl(Object period, PeriodType type, Chronology chrono) {
            super(period, type, chrono);
        }

        public void clear() {
            setValues(new int[size()]);
        }

        public void setValue(int index, int value) {
            super.setValue(index, value);
        }

        public void set(DurationFieldType field, int value) {
            super.setField(field, value);
        }

        public void setPeriod(ReadablePeriod period) {
            super.setPeriod(period);
        }

        public void setPeriod(int years, int months, int weeks, int days,
                              int hours, int minutes, int seconds, int millis) {
            super.setPeriod(years, months, weeks, days, hours, minutes, seconds, millis);
        }

        public void setYears(int years) {
            super.setField(DurationFieldType.years(), years);
        }

        public void setMonths(int months) {
            super.setField(DurationFieldType.months(), months);
        }

        public void setWeeks(int weeks) {
            super.setField(DurationFieldType.weeks(), weeks);
        }

        public void setDays(int days) {
            super.setField(DurationFieldType.days(), days);
        }

        public void setHours(int hours) {
            super.setField(DurationFieldType.hours(), hours);
        }

        public void setMinutes(int minutes) {
            super.setField(DurationFieldType.minutes(), minutes);
        }

        public void setSeconds(int seconds) {
            super.setField(DurationFieldType.seconds(), seconds);
        }

        public void setMillis(int millis) {
            super.setField(DurationFieldType.millis(), millis);
        }

        public void add(DurationFieldType field, int value) {
            super.addField(field, value);
        }

        public void add(ReadablePeriod period) {
            super.addPeriod(period);
        }

        public void add(int years, int months, int weeks, int days,
                        int hours, int minutes, int seconds, int millis) {
            super.addField(DurationFieldType.years(), years);
            super.addField(DurationFieldType.months(), months);
            super.addField(DurationFieldType.weeks(), weeks);
            super.addField(DurationFieldType.days(), days);
            super.addField(DurationFieldType.hours(), hours);
            super.addField(DurationFieldType.minutes(), minutes);
            super.addField(DurationFieldType.seconds(), seconds);
            super.addField(DurationFieldType.millis(), millis);
        }

        public void addYears(int years) {
            super.addField(DurationFieldType.years(), years);
        }

        public void addMonths(int months) {
            super.addField(DurationFieldType.months(), months);
        }

        public void addWeeks(int weeks) {
            super.addField(DurationFieldType.weeks(), weeks);
        }

        public void addDays(int days) {
            super.addField(DurationFieldType.days(), days);
        }

        public void addHours(int hours) {
            super.addField(DurationFieldType.hours(), hours);
        }

        public void addMinutes(int minutes) {
            super.addField(DurationFieldType.minutes(), minutes);
        }

        public void addSeconds(int seconds) {
            super.addField(DurationFieldType.seconds(), seconds);
        }

        public void addMillis(int millis) {
            super.addField(DurationFieldType.millis(), millis);
        }

        public void add(ReadableDuration duration) {
            if (duration != null) {
                addPeriod(new Period(duration.getMillis(), getPeriodType()));
            }
        }

        public void setPeriod(ReadableDuration duration) {
            if (duration != null) {
                setPeriod(new Period(duration.getMillis(), getPeriodType()));
            } else {
                setPeriod((ReadablePeriod) null);
            }
        }
    }

    private static class CustomContiguousPartial extends BasePartial {
        private final DateTimeFieldType[] iTypes;
        private final int[] iValues;

        public CustomContiguousPartial(DateTimeFieldType[] types, int[] values) {
            super();
            iTypes = types;
            iValues = values;
        }

        public int size() {
            return iTypes.length;
        }

        protected DateTimeFieldType getFieldType(int index, Chronology chrono) {
            return iTypes[index];
        }

        public int getValue(int index) {
            return iValues[index];
        }

        public Chronology getChronology() {
            return ISOChronology.getInstanceUTC();
        }
    }

    @Test
    public void constructorValues_givenStandardValues_shouldInitializeProperly() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());

        Assert.assertEquals(PeriodType.standard(), period.getPeriodType());
        Assert.assertEquals(8, period.size());
        Assert.assertEquals(1, period.getValue(0));
        Assert.assertEquals(2, period.getValue(1));
        Assert.assertEquals(3, period.getValue(2));
        Assert.assertEquals(4, period.getValue(3));
        Assert.assertEquals(5, period.getValue(4));
        Assert.assertEquals(6, period.getValue(5));
        Assert.assertEquals(7, period.getValue(6));
        Assert.assertEquals(8, period.getValue(7));
    }

    @Test
    public void constructorValues_givenNullPeriodType_shouldDefaultToStandard() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, null);

        Assert.assertEquals(PeriodType.standard(), period.getPeriodType());
        Assert.assertEquals(1, period.getValue(0));
        Assert.assertEquals(8, period.getValue(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorValues_givenUnsupportedFieldWithValue_shouldThrowException() {
        new TestPeriodImpl(1, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
    }

    @Test
    public void constructorInstants_givenEpochTimesAndNullChronology_shouldCalculatePeriod() {
        long start = 0L;
        long end = 3600000L * 2 + 5000L;
        TestPeriodImpl period = new TestPeriodImpl(start, end, PeriodType.time(), null);

        Assert.assertEquals(PeriodType.time(), period.getPeriodType());
        Assert.assertEquals(2, period.get(DurationFieldType.hours()));
        Assert.assertEquals(5, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void constructorInstants_givenEpochTimesAndExplicitChronology_shouldCalculatePeriod() {
        long start = 0L;
        long end = 1000L * 60;
        TestPeriodImpl period = new TestPeriodImpl(start, end, PeriodType.standard(), CopticChronology.getInstanceUTC());

        Assert.assertEquals(1, period.get(DurationFieldType.minutes()));
    }

    @Test
    public void constructorReadableInstants_givenBothNull_shouldInitializeWithZeroValues() {
        TestPeriodImpl period = new TestPeriodImpl((ReadableInstant) null, (ReadableInstant) null, PeriodType.standard());

        Assert.assertEquals(PeriodType.standard(), period.getPeriodType());
        for (int i = 0; i < period.size(); i++) {
            Assert.assertEquals(0, period.getValue(i));
        }
    }

    @Test
    public void constructorReadableInstants_givenNonNullInstants_shouldCalculatePeriod() {
        Instant start = new Instant(0L);
        Instant end = new Instant(120000L);
        TestPeriodImpl period = new TestPeriodImpl(start, end, PeriodType.standard());

        Assert.assertEquals(2, period.get(DurationFieldType.minutes()));
    }

    @Test
    public void constructorReadableInstants_givenOneNullInstant_shouldUseCurrentTime() {
        long now = 100000000L;
        DateTimeUtils.setCurrentMillisFixed(now);
        try {
            Instant end = new Instant(now + 60000L);
            TestPeriodImpl period = new TestPeriodImpl((ReadableInstant) null, end, PeriodType.standard());
            Assert.assertEquals(1, period.get(DurationFieldType.minutes()));
        } finally {
            DateTimeUtils.setCurrentMillisSystem();
        }
    }

    @Test
    public void constructorReadablePartial_givenBaseLocalInstancesOfSameClass_shouldCalculatePeriod() {
        LocalDate start = new LocalDate(2020, 1, 1);
        LocalDate end = new LocalDate(2021, 3, 10);
        TestPeriodImpl period = new TestPeriodImpl(start, end, PeriodType.yearMonthDay());

        Assert.assertEquals(1, period.get(DurationFieldType.years()));
        Assert.assertEquals(2, period.get(DurationFieldType.months()));
        Assert.assertEquals(9, period.get(DurationFieldType.days()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorReadablePartial_givenNullStart_shouldThrowException() {
        new TestPeriodImpl((ReadablePartial) null, new LocalDate(2020, 1, 1), PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorReadablePartial_givenNullEnd_shouldThrowException() {
        new TestPeriodImpl(new LocalDate(2020, 1, 1), (ReadablePartial) null, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorReadablePartial_givenDifferentSizePartials_shouldThrowException() {
        YearMonth ym = new YearMonth(2020, 1);
        LocalDate ld = new LocalDate(2020, 1, 1);
        new TestPeriodImpl(ym, ld, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorReadablePartial_givenSameSizeDifferentFields_shouldThrowException() {
        DateTimeFieldType[] types1 = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear()
        };
        DateTimeFieldType[] types2 = new DateTimeFieldType[] {
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        CustomContiguousPartial start = new CustomContiguousPartial(types1, new int[] { 2020, 1 });
        CustomContiguousPartial end = new CustomContiguousPartial(types2, new int[] { 1, 15 });
        new TestPeriodImpl(start, end, PeriodType.standard());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructorReadablePartial_givenNonContiguousPartial_shouldThrowException() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.dayOfMonth()
        };
        CustomContiguousPartial start = new CustomContiguousPartial(types, new int[] { 2020, 1 });
        CustomContiguousPartial end = new CustomContiguousPartial(types, new int[] { 2020, 2 });
        new TestPeriodImpl(start, end, PeriodType.standard());
    }

    @Test
    public void constructorReadablePartial_givenCustomContiguousPartials_shouldCalculatePeriod() {
        DateTimeFieldType[] types = new DateTimeFieldType[] {
            DateTimeFieldType.year(),
            DateTimeFieldType.monthOfYear(),
            DateTimeFieldType.dayOfMonth()
        };
        CustomContiguousPartial start = new CustomContiguousPartial(types, new int[] { 2020, 1, 1 });
        CustomContiguousPartial end = new CustomContiguousPartial(types, new int[] { 2021, 2, 5 });
        TestPeriodImpl period = new TestPeriodImpl(start, end, PeriodType.yearMonthDay());

        Assert.assertEquals(1, period.get(DurationFieldType.years()));
        Assert.assertEquals(1, period.get(DurationFieldType.months()));
        Assert.assertEquals(4, period.get(DurationFieldType.days()));
    }

    @Test
    public void constructorInstantAndDuration_givenValidInputs_shouldCalculatePeriod() {
        Instant start = new Instant(1000L);
        Duration duration = new Duration(5000L);
        TestPeriodImpl period = new TestPeriodImpl(start, duration, PeriodType.standard());

        Assert.assertEquals(6, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void constructorDurationAndInstant_givenValidInputs_shouldCalculatePeriod() {
        Duration duration = new Duration(5000L);
        Instant end = new Instant(6000L);
        TestPeriodImpl period = new TestPeriodImpl(duration, end, PeriodType.standard());

        Assert.assertEquals(5, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void constructorSingleDuration_givenMillis_shouldCalculatePeriod() {
        TestPeriodImpl period = new TestPeriodImpl(65000L);

        Assert.assertEquals(1, period.get(DurationFieldType.minutes()));
        Assert.assertEquals(5, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void constructorDurationTypeChrono_givenParameters_shouldCalculatePeriod() {
        TestPeriodImpl period = new TestPeriodImpl(3661000L, PeriodType.time(), ISOChronology.getInstanceUTC());

        Assert.assertEquals(1, period.get(DurationFieldType.hours()));
        Assert.assertEquals(1, period.get(DurationFieldType.minutes()));
        Assert.assertEquals(1, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void constructorObjectPeriod_givenPeriodStringAndNonReadWritable_shouldUseMutablePeriodConverter() {
        TestPeriodImpl period = new TestPeriodImpl("P1Y2M3D", null, null);

        Assert.assertEquals(1, period.get(DurationFieldType.years()));
        Assert.assertEquals(2, period.get(DurationFieldType.months()));
        Assert.assertEquals(3, period.get(DurationFieldType.days()));
    }

    @Test
    public void constructorObjectPeriod_givenReadWritableSubclass_shouldSetIntoDirectly() {
        TestReadWritablePeriodImpl period = new TestReadWritablePeriodImpl("P2Y4M", PeriodType.yearMonthDay(), ISOChronology.getInstanceUTC());

        Assert.assertEquals(2, period.get(DurationFieldType.years()));
        Assert.assertEquals(4, period.get(DurationFieldType.months()));
        Assert.assertEquals(0, period.get(DurationFieldType.days()));
    }

    @Test
    public void constructorIntArray_givenArrayAndType_shouldHoldSameReference() {
        int[] vals = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        TestPeriodImpl period = new TestPeriodImpl(vals, PeriodType.standard());

        Assert.assertEquals(8, period.size());
        Assert.assertEquals(3, period.getValue(2));
    }

    @Test
    public void checkPeriodType_givenNull_shouldReturnStandard() {
        TestPeriodImpl period = new TestPeriodImpl(new int[8], PeriodType.standard());
        PeriodType result = period.publicCheckPeriodType(null);

        Assert.assertEquals(PeriodType.standard(), result);
    }

    @Test
    public void checkPeriodType_givenNonNull_shouldReturnSame() {
        TestPeriodImpl period = new TestPeriodImpl(new int[8], PeriodType.standard());
        PeriodType type = PeriodType.yearMonthDay();
        PeriodType result = period.publicCheckPeriodType(type);

        Assert.assertSame(type, result);
    }

    @Test
    public void getFieldType_givenValidIndex_shouldReturnFieldType() {
        TestPeriodImpl period = new TestPeriodImpl(new int[8], PeriodType.standard());

        Assert.assertEquals(DurationFieldType.years(), period.getFieldType(0));
        Assert.assertEquals(DurationFieldType.millis(), period.getFieldType(7));
    }

    @Test
    public void toDurationFrom_givenInstant_shouldCalculateDurationForward() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard());
        DateTime start = new DateTime(2021, 1, 1, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration dur = period.toDurationFrom(start);

        Assert.assertEquals(86400000L, dur.getMillis());
    }

    @Test
    public void toDurationTo_givenInstant_shouldCalculateDurationBackward() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 1, 0, 0, 0, 0, PeriodType.standard());
        DateTime end = new DateTime(2021, 1, 2, 0, 0, 0, 0, ISOChronology.getInstanceUTC());
        Duration dur = period.toDurationTo(end);

        Assert.assertEquals(86400000L, dur.getMillis());
    }

    @Test
    public void setPeriod_givenNullReadablePeriod_shouldResetValuesToZero() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        period.publicSetPeriod((ReadablePeriod) null);

        for (int i = 0; i < period.size(); i++) {
            Assert.assertEquals(0, period.getValue(i));
        }
    }

    @Test
    public void setPeriod_givenNonNullReadablePeriod_shouldCopyValues() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        Period source = new Period(2, 3, 0, 5, 6, 7, 8, 9);
        period.publicSetPeriod(source);

        Assert.assertEquals(2, period.get(DurationFieldType.years()));
        Assert.assertEquals(3, period.get(DurationFieldType.months()));
        Assert.assertEquals(5, period.get(DurationFieldType.days()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPeriod_givenUnsupportedFieldInSource_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
        Period source = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        period.publicSetPeriod(source);
    }

    @Test
    public void setPeriod_given8Ints_shouldUpdateValues() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        period.publicSetPeriod(10, 20, 30, 40, 50, 60, 70, 80);

        Assert.assertEquals(10, period.getValue(0));
        Assert.assertEquals(20, period.getValue(1));
        Assert.assertEquals(30, period.getValue(2));
        Assert.assertEquals(40, period.getValue(3));
        Assert.assertEquals(50, period.getValue(4));
        Assert.assertEquals(60, period.getValue(5));
        Assert.assertEquals(70, period.getValue(6));
        Assert.assertEquals(80, period.getValue(7));
    }

    @Test
    public void setField_givenValidField_shouldUpdateField() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        period.publicSetField(DurationFieldType.hours(), 12);

        Assert.assertEquals(12, period.get(DurationFieldType.hours()));
    }

    @Test
    public void setFieldInto_givenUnsupportedFieldWithZeroValue_shouldNotThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
        int[] values = new int[period.size()];
        period.publicSetFieldInto(values, DurationFieldType.years(), 0);

        Assert.assertEquals(0, values[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFieldInto_givenUnsupportedFieldWithNonZeroValue_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
        int[] values = new int[period.size()];
        period.publicSetFieldInto(values, DurationFieldType.years(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setFieldInto_givenNullField_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        int[] values = new int[period.size()];
        period.publicSetFieldInto(values, null, 0);
    }

    @Test
    public void addField_givenValidField_shouldAddValue() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 5, 0, 0, 0, PeriodType.standard());
        period.publicAddField(DurationFieldType.hours(), 7);

        Assert.assertEquals(12, period.get(DurationFieldType.hours()));
    }

    @Test
    public void addFieldInto_givenUnsupportedFieldWithZeroValue_shouldIgnore() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
        int[] values = new int[period.size()];
        period.publicAddFieldInto(values, DurationFieldType.years(), 0);

        Assert.assertEquals(0, values[0]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addFieldInto_givenUnsupportedFieldWithNonZeroValue_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.time());
        int[] values = new int[period.size()];
        period.publicAddFieldInto(values, DurationFieldType.years(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addFieldInto_givenNullField_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.standard());
        int[] values = new int[period.size()];
        period.publicAddFieldInto(values, null, 0);
    }

    @Test
    public void mergePeriod_givenNull_shouldDoNothing() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        period.publicMergePeriod(null);

        Assert.assertEquals(1, period.getValue(0));
    }

    @Test
    public void mergePeriod_givenValidPeriod_shouldOverwriteOnlyFieldsInSource() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period source = new Period().withHours(22).withMinutes(33);
        period.publicMergePeriod(source);

        Assert.assertEquals(1, period.getValue(0));
        Assert.assertEquals(22, period.get(DurationFieldType.hours()));
        Assert.assertEquals(33, period.get(DurationFieldType.minutes()));
        Assert.assertEquals(7, period.get(DurationFieldType.seconds()));
    }

    @Test
    public void addPeriod_givenNull_shouldDoNothing() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        period.publicAddPeriod(null);

        Assert.assertEquals(1, period.getValue(0));
    }

    @Test
    public void addPeriod_givenValidPeriod_shouldAddValues() {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());
        Period delta = new Period(2, 0, 0, 1, 0, 0, 0, 0);
        period.publicAddPeriod(delta);

        Assert.assertEquals(3, period.get(DurationFieldType.years()));
        Assert.assertEquals(2, period.get(DurationFieldType.months()));
        Assert.assertEquals(5, period.get(DurationFieldType.days()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPeriod_givenUnsupportedNonZeroField_shouldThrowException() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.time());
        Period delta = new Period(1, 0, 0, 0, 0, 0, 0, 0);
        period.publicAddPeriod(delta);
    }

    @Test
    public void addPeriod_givenUnsupportedZeroField_shouldIgnoreAndSucceed() {
        TestPeriodImpl period = new TestPeriodImpl(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.time());
        Period delta = new Period(0, 0, 0, 0, 1, 0, 0, 0);
        period.publicAddPeriod(delta);

        Assert.assertEquals(2, period.get(DurationFieldType.hours()));
    }

    @Test
    public void setValue_givenValidIndex_shouldUpdateSingleValue() {
        TestPeriodImpl period = new TestPeriodImpl(new int[8], PeriodType.standard());
        period.publicSetValue(3, 99);

        Assert.assertEquals(99, period.getValue(3));
    }

    @Test
    public void setValues_givenNewArray_shouldReplaceInternalArray() {
        TestPeriodImpl period = new TestPeriodImpl(new int[8], PeriodType.standard());
        int[] newVals = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };
        period.publicSetValues(newVals);

        Assert.assertEquals(8, period.getValue(0));
        Assert.assertEquals(1, period.getValue(7));
    }

    @Test
    public void serialization_givenBasePeriod_shouldRoundTripSuccessfully() throws Exception {
        TestPeriodImpl period = new TestPeriodImpl(1, 2, 3, 4, 5, 6, 7, 8, PeriodType.standard());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(period);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TestPeriodImpl deserialized = (TestPeriodImpl) ois.readObject();
        ois.close();

        Assert.assertEquals(period.getPeriodType(), deserialized.getPeriodType());
        Assert.assertEquals(period.size(), deserialized.size());
        for (int i = 0; i < period.size(); i++) {
            Assert.assertEquals(period.getValue(i), deserialized.getValue(i));
        }
    }
}