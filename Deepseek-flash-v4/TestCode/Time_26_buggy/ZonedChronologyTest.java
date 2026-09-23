package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.field.DividedDateTimeField;
import org.joda.time.field.MillisDurationField;
import org.joda.time.field.UnsupportedDurationField;
import java.util.Locale;

public class ZonedChronologyTest {

    private static class MockChronology extends BaseMockChronology {
        private final DateTimeZone zone;
        
        MockChronology(DateTimeZone zone) {
            this.zone = zone;
        }
        
        public DateTimeZone getZone() {
            return zone;
        }
        
        public Chronology withUTC() {
            return new MockChronology(DateTimeZone.UTC);
        }
        
        public Chronology withZone(DateTimeZone z) {
            return new MockChronology(z);
        }
        
        public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) {
            return year * 31536000000L + monthOfYear * 86400000L + dayOfMonth * 86400000L + millisOfDay;
        }
        
        public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay,
                int minuteOfHour, int secondOfMinute, int millisOfSecond) {
            return year * 31536000000L + monthOfYear * 86400000L + dayOfMonth * 86400000L;
        }
        
        public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour,
                int secondOfMinute, int millisOfSecond) {
            return instant;
        }
        
        public int hashCode() {
            return 1;
        }
        
        public boolean equals(Object obj) {
            if (obj instanceof MockChronology) {
                return true;
            }
            return false;
        }
        
        public String toString() {
            return "MockChronology";
        }
    }
    
    private static abstract class BaseMockChronology extends org.joda.time.chrono.AssembledChronology {
        protected BaseMockChronology() {
            super(null, null);
        }
        
        protected void assemble(Fields fields) {
            fields.eras = UnsupportedDurationField.getInstance(DurationFieldType.eras());
            fields.centuries = UnsupportedDurationField.getInstance(DurationFieldType.centuries());
            fields.years = UnsupportedDurationField.getInstance(DurationFieldType.years());
            fields.months = UnsupportedDurationField.getInstance(DurationFieldType.months());
            fields.weekyears = UnsupportedDurationField.getInstance(DurationFieldType.weekyears());
            fields.weeks = UnsupportedDurationField.getInstance(DurationFieldType.weeks());
            fields.days = UnsupportedDurationField.getInstance(DurationFieldType.days());
            fields.halfdays = UnsupportedDurationField.getInstance(DurationFieldType.halfdays());
            fields.hours = UnsupportedDurationField.getInstance(DurationFieldType.hours());
            fields.minutes = UnsupportedDurationField.getInstance(DurationFieldType.minutes());
            fields.seconds = UnsupportedDurationField.getInstance(DurationFieldType.seconds());
            fields.millis = UnsupportedDurationField.getInstance(DurationFieldType.millis());
        }
        
        protected abstract static class Fields extends AssembledChronology.Fields {
            public DurationField eras;
            public DurationField centuries;
            public DurationField years;
            public DurationField months;
            public DurationField weekyears;
            public DurationField weeks;
            public DurationField days;
            public DurationField halfdays;
            public DurationField hours;
            public DurationField minutes;
            public DurationField seconds;
            public DurationField millis;
        }
        
        public abstract static class AssembledChronology {
            protected static class Fields {
                public DurationField eras;
                public DurationField centuries;
                public DurationField years;
                public DurationField months;
                public DurationField weekyears;
                public DurationField weeks;
                public DurationField days;
                public DurationField halfdays;
                public DurationField hours;
                public DurationField minutes;
                public DurationField seconds;
                public DurationField millis;
                public DateTimeField year;
                public DateTimeField yearOfEra;
                public DateTimeField yearOfCentury;
                public DateTimeField centuryOfEra;
                public DateTimeField era;
                public DateTimeField dayOfWeek;
                public DateTimeField dayOfMonth;
                public DateTimeField dayOfYear;
                public DateTimeField monthOfYear;
                public DateTimeField weekOfWeekyear;
                public DateTimeField weekyear;
                public DateTimeField weekyearOfCentury;
                public DateTimeField millisOfSecond;
                public DateTimeField millisOfDay;
                public DateTimeField secondOfMinute;
                public DateTimeField secondOfDay;
                public DateTimeField minuteOfHour;
                public DateTimeField minuteOfDay;
                public DateTimeField hourOfDay;
                public DateTimeField hourOfHalfday;
                public DateTimeField clockhourOfDay;
                public DateTimeField clockhourOfHalfday;
                public DateTimeField halfdayOfDay;
            }
        }
    }
    
    private static class TestChronology extends BaseMockChronology {
        private static final long serialVersionUID = 1L;
        private final DateTimeZone zone;
        
        public TestChronology(DateTimeZone zone) {
            this.zone = zone;
        }
        
        public DateTimeZone getZone() {
            return zone;
        }
        
        public Chronology withUTC() {
            return new TestChronology(DateTimeZone.UTC);
        }
        
        public Chronology withZone(DateTimeZone z) {
            return new TestChronology(z);
        }
        
        public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) {
            return year * 31536000000L + monthOfYear * 86400000L + dayOfMonth * 86400000L + millisOfDay;
        }
        
        protected void assemble(Fields fields) {
            fields.year = new MockDateTimeField("year", fields.millis);
            fields.monthOfYear = new MockDateTimeField("month", fields.millis);
            fields.dayOfMonth = new MockDateTimeField("day", fields.millis);
        }
    }
    
    private static class MockDateTimeField extends org.joda.time.field.BaseDateTimeField {
        private final String name;
        
        MockDateTimeField(String name, DurationField durationField) {
            super(durationField);
            this.name = name;
        }
        
        public int get(long instant) {
            return (int) (instant % 1000);
        }
        
        public long set(long instant, int value) {
            return instant;
        }
        
        public DurationField getDurationField() {
            return MillisDurationField.INSTANCE;
        }
        
        public DurationField getRangeDurationField() {
            return null;
        }
        
        public int getMinimumValue() {
            return 0;
        }
        
        public int getMaximumValue() {
            return 999;
        }
        
        public boolean isLenient() {
            return false;
        }
        
        public String getName() {
            return name;
        }
    }
    
    private static class MockDurationField extends org.joda.time.field.BaseDurationField {
        private final long millis;
        
        MockDurationField(int type, long millis) {
            super(type);
            this.millis = millis;
        }
        
        public long getUnitMillis() {
            return millis;
        }
        
        public long getValueAsLong(long duration, long instant) {
            return duration / millis;
        }
        
        public long getMillis(long value, long instant) {
            return value * millis;
        }
        
        public long add(long instant, long value) {
            return instant + value * millis;
        }
        
        public int getValue(long duration, long instant) {
            return (int) getValueAsLong(duration, instant);
        }
        
        public long getMillis(int value, long instant) {
            return value * millis;
        }
        
        public boolean isPrecise() {
            return true;
        }
        
        public boolean isSupported() {
            return true;
        }
        
        public long getDifference(long minuendInstant, long subtrahendInstant) {
            return (minuendInstant - subtrahendInstant) / millis;
        }
        
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return (minuendInstant - subtrahendInstant) / millis;
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullBase() {
        ZonedChronology.getInstance(null, DateTimeZone.UTC);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceNullZone() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology.getInstance(base, null);
    }
    
    @Test
    public void testGetInstance() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology result = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        assertNotNull(result);
        assertEquals(DateTimeZone.UTC, result.getZone());
    }
    
    @Test
    public void testGetInstanceNullUTCTimeZone() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology result = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        assertNotNull(result);
        assertSame(DateTimeZone.UTC, result.getZone());
    }
    
    @Test
    public void testWithZone() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        ZonedChronology result = (ZonedChronology) zc.withZone(DateTimeZone.forOffsetHours(1));
        assertNotNull(result);
        assertEquals(DateTimeZone.forOffsetHours(1), result.getZone());
    }
    
    @Test
    public void testWithZoneNull() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        ZonedChronology result = (ZonedChronology) zc.withZone(null);
        assertNotNull(result);
        assertEquals(DateTimeZone.getDefault(), result.getZone());
    }
    
    @Test
    public void testWithUTCSameInstance() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        Chronology result = zc.withUTC();
        assertSame(base, result);
    }
    
    @Test
    public void testGetDateTimeMillis() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        long result = zc.getDateTimeMillis(2023, 1, 1, 0);
        assertTrue(result > 0);
    }
    
    @Test
    public void testUseTimeArithmeticNull() {
        assertFalse(ZonedChronology.useTimeArithmetic(null));
    }
    
    @Test
    public void testUseTimeArithmeticSupported() {
        assertTrue(ZonedChronology.useTimeArithmetic(new MockDurationField(0, 1000)));
        assertTrue(ZonedChronology.useTimeArithmetic(new MockDurationField(0, 43200000)));
        assertFalse(ZonedChronology.useTimeArithmetic(new MockDurationField(0, 43200001)));
    }
    
    @Test
    public void testEquals() {
        TestChronology base1 = new TestChronology(DateTimeZone.UTC);
        TestChronology base2 = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc1 = ZonedChronology.getInstance(base1, DateTimeZone.UTC);
        ZonedChronology zc2 = ZonedChronology.getInstance(base2, DateTimeZone.UTC);
        assertEquals(zc1, zc2);
        assertEquals(zc1.hashCode(), zc2.hashCode());
    }
    
    @Test
    public void testEqualsDifferent() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc1 = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        ZonedChronology zc2 = ZonedChronology.getInstance(base, DateTimeZone.forOffsetHours(1));
        assertFalse(zc1.equals(zc2));
    }
    
    @Test
    public void testToString() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        assertNotNull(zc.toString());
    }
    
    @Test
    public void testZonedDateTimeField() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        ZonedChronology.ZonedDateTimeField field = zc.new ZonedDateTimeField(new MockDateTimeField("test", MillisDurationField.INSTANCE), DateTimeZone.UTC, MillisDurationField.INSTANCE);
        assertNotNull(field);
        assertEquals(0, field.get(0L));
        assertNotNull(field.getDurationField());
        assertNotNull(field.getRangeDurationField());
        assertFalse(field.isLenient());
        assertEquals(0, field.getMinimumValue());
        assertEquals(999, field.getMaximumValue());
    }
    
    @Test
    public void testZonedDurationField() {
        TestChronology base = new TestChronology(DateTimeZone.UTC);
        ZonedChronology zc = ZonedChronology.getInstance(base, DateTimeZone.UTC);
        MockDurationField mockField = new MockDurationField(0, 1000);
        ZonedChronology.ZonedDurationField field = zc.new ZonedDurationField(mockField, DateTimeZone.UTC);
        assertNotNull(field);
        assertEquals(1000L, field.getUnitMillis());
        assertTrue(field.isPrecise());
        assertTrue(field.isSupported());
    }
}