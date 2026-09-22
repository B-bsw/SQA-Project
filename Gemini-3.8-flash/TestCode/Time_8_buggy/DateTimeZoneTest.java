package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        Locale.setDefault(originalLocale);
    }

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int standardOffset;
        private final int offset;
        private final boolean fixed;

        MockDateTimeZone(String id, int standardOffset, int offset, boolean fixed) {
            super(id);
            this.standardOffset = standardOffset;
            this.offset = offset;
            this.fixed = fixed;
        }

        public String getNameKey(long instant) {
            return "MOCK";
        }

        public int getOffset(long instant) {
            return this.offset;
        }

        public int getStandardOffset(long instant) {
            return this.standardOffset;
        }

        public boolean isFixed() {
            return this.fixed;
        }

        public long nextTransition(long instant) {
            return instant;
        }

        public long previousTransition(long instant) {
            return instant;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof MockDateTimeZone) {
                MockDateTimeZone other = (MockDateTimeZone) object;
                return getID().equals(other.getID());
            }
            return false;
        }
    }

    private static class TransitionDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final long transitionInstant;
        private final int offsetBefore;
        private final int offsetAfter;

        TransitionDateTimeZone(String id, long transitionInstant, int offsetBefore, int offsetAfter) {
            super(id);
            this.transitionInstant = transitionInstant;
            this.offsetBefore = offsetBefore;
            this.offsetAfter = offsetAfter;
        }

        public String getNameKey(long instant) {
            return instant < transitionInstant ? "WINTER" : "SUMMER";
        }

        public int getOffset(long instant) {
            return instant < transitionInstant ? offsetBefore : offsetAfter;
        }

        public int getStandardOffset(long instant) {
            return offsetBefore;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long instant) {
            return instant < transitionInstant ? transitionInstant : Long.MAX_VALUE;
        }

        public long previousTransition(long instant) {
            return instant > transitionInstant ? transitionInstant : Long.MIN_VALUE;
        }

        public boolean equals(Object object) {
            return this == object;
        }
    }

    @Test
    public void getDefault_givenDefaultZoneNull_shouldReturnConfiguredOrFallback() {
        DateTimeZone def = DateTimeZone.getDefault();
        Assert.assertNotNull(def);
    }

    @Test
    public void setDefault_givenValidZone_shouldUpdateDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.UTC);
            Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void forID_givenNullId_shouldReturnDefaultZone() {
        DateTimeZone zone = DateTimeZone.forID(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void forID_givenUTC_shouldReturnUTCConstant() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenKnownOffsetId_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertNotNull(zone);
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(2 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeOffsetId_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        Assert.assertNotNull(zone);
        Assert.assertEquals("-05:00", zone.getID());
        Assert.assertEquals(-5 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUTCConstant() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenKnownProviderId_shouldReturnZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        Assert.assertNotNull(zone);
        Assert.assertEquals("Europe/London", zone.getID());
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenUnknownId_shouldThrowException() {
        DateTimeZone.forID("NonExistentZoneId12345");
    }

    @Test
    public void forOffsetHours_givenZeroHours_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenPositiveHours_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(8);
        Assert.assertEquals("+08:00", zone.getID());
        Assert.assertEquals(8 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHours_givenNegativeHours_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-7);
        Assert.assertEquals("-07:00", zone.getID());
        Assert.assertEquals(-7 * 3600 * 1000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHoursAndMinutes_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveHoursAndMinutes_shouldCalculateCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals((5 * 60 + 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursAndMinutes_shouldCalculateCorrectOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-3, 30);
        Assert.assertEquals("-03:30", zone.getID());
        Assert.assertEquals((-3 * 60 - 30) * 60 * 1000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenHoursTooLow_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(-24, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenHoursTooHigh_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinutesNegative_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinutesTooLarge_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenValidPositiveOffset_shouldReturnFixedZone() {
        int millis = 3600 * 1000;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:00", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenOffsetWithSecondsAndMillis_shouldFormatCorrectly() {
        int millis = 3600 * 1000 + 120 * 1000 + 5000 + 123;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:02:05.123", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenNegativeOffsetWithSeconds_shouldFormatCorrectly() {
        int millis = -(3600 * 1000 + 15 * 60 * 1000 + 30 * 1000);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("-01:15:30", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetMillis_givenMillisTooLargePositive_shouldThrowException() {
        DateTimeZone.forOffsetMillis(86400 * 1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetMillis_givenMillisTooLargeNegative_shouldThrowException() {
        DateTimeZone.forOffsetMillis(-(86400 * 1000));
    }

    @Test
    public void forTimeZone_givenNullTimeZone_shouldReturnDefaultZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void forTimeZone_givenUTCTimeZone_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenConvertedId_shouldResolveCorrectZone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTFormat_shouldParseOffset() {
        TimeZone tz = TimeZone.getTimeZone("GMT+04:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("+04:00", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTZeroFormat_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenInvalidTimeZoneId_shouldThrowException() {
        TimeZone custom = new TimeZone() {
            private static final long serialVersionUID =