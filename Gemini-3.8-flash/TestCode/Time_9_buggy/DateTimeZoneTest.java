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
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone originalDefaultZone;
    private Provider originalProvider;
    private NameProvider originalNameProvider;
    private Locale originalLocale;

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int standardOffset;
        private final int offset;
        private final long transition;

        MockDateTimeZone(String id, int standardOffset, int offset, long transition) {
            super(id);
            this.standardOffset = standardOffset;
            this.offset = offset;
            this.transition = transition;
        }

        public String getNameKey(long instant) {
            return "MOCK";
        }

        public int getOffset(long instant) {
            return instant < transition ? standardOffset : offset;
        }

        public int getStandardOffset(long instant) {
            return standardOffset;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long instant) {
            return instant < transition ? transition : Long.MAX_VALUE;
        }

        public long previousTransition(long instant) {
            return instant > transition ? transition : Long.MIN_VALUE;
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

    private static class MockNameProvider implements NameProvider {
        public String getShortName(Locale locale, String id, String nameKey) {
            if ("FAIL".equals(nameKey)) {
                return null;
            }
            return "SHORT_" + id;
        }

        public String getName(Locale locale, String id, String nameKey) {
            if ("FAIL".equals(nameKey)) {
                return null;
            }
            return "LONG_" + id;
        }
    }

    private static class MockNullNameKeyZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;

        MockNullNameKeyZone() {
            super("NullKeyZone");
        }

        public String getNameKey(long instant) {
            return null;
        }

        public int getOffset(long instant) {
            return 3600000;
        }

        public int getStandardOffset(long instant) {
            return 3600000;
        }

        public boolean isFixed() {
            return true;
        }

        public long nextTransition(long instant) {
            return instant;
        }

        public long previousTransition(long instant) {
            return instant;
        }

        public boolean equals(Object object) {
            return object instanceof MockNullNameKeyZone;
        }
    }

    private static class MockOverlapZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final long transitionInstant;

        MockOverlapZone(String id, long transitionInstant) {
            super(id);
            this.transitionInstant = transitionInstant;
        }

        public String getNameKey(long instant) {
            return "OVL";
        }

        public int getOffset(long instant) {
            return instant < transitionInstant ? 7200000 : 3600000;
        }

        public int getStandardOffset(long instant) {
            return 3600000;
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
            return object instanceof MockOverlapZone;
        }
    }

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        originalLocale = Locale.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setDefault(originalDefaultZone);
        Locale.setDefault(originalLocale);
    }

    @Test
    public void getDefault_shouldReturnNonNullZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void setDefault_givenValidZone_shouldUpdateDefault() {
        DateTimeZone previous = DateTimeZone.getDefault();
        try {
            DateTimeZone.setDefault(DateTimeZone.UTC);
            Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
        } finally {
            DateTimeZone.setDefault(previous);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void forID_givenNullString_shouldReturnDefaultZone() {
        DateTimeZone zone = DateTimeZone.forID(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void forID_givenUTC_shouldReturnUTCConstant() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenPositiveOffset_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeOffset_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:00");
        Assert.assertEquals("-05:00", zone.getID());
        Assert.assertEquals(-18000000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenInvalidID_shouldThrowException() {
        DateTimeZone.forID("Invalid/NonExistent_Zone");
    }

    @Test
    public void forOffsetHours_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenPositiveHours_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        Assert.assertEquals("+03:00", zone.getID());
        Assert.assertEquals(10800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHours_givenNegativeHours_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-4);
        Assert.assertEquals("-04:00", zone.getID());
        Assert.assertEquals(-14400000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHours_givenOutOfRange_shouldThrowException() {
        DateTimeZone.forOffsetHours(1000000);
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHoursAndMinutes_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveHoursAndMinutes_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursAndMinutes_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinutesGreaterThan59_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenExtremeValuesCausingArithmeticException_shouldThrowException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenPositiveMillisWithSubMinutes_shouldFormatCorrectly() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3661001);
        Assert.assertEquals("+01:01:01.001", zone.getID());
        Assert.assertEquals(3661001, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenNegativeMillisWithSubMinutes_shouldFormatCorrectly() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3661001);
        Assert.assertEquals("-01:01:01.001", zone.getID());
        Assert.assertEquals(-3661001, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenCachedCall_shouldReturnSameReference() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        Assert.assertSame(zone1, zone2);
    }

    @Test
    public void forTimeZone_givenNull_shouldReturnDefaultZone() {
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
    public void forTimeZone_givenConvertedPST_shouldReturnAmericaLosAngeles() {
        TimeZone tz = TimeZone.getTimeZone("PST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTPlusOffset_shouldReturnFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+04:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("+04:00", zone.getID());
        Assert.assertEquals(14400000, zone.getOffset(0L));
    }

    @Test
    public void forTimeZone_givenGMTZero_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT-00:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenUnrecognisedZone_shouldThrowException() {
        TimeZone tz = new TimeZone() {
            private static final long serialVersionUID = 1L;
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) {
                return 0;
            }
            public void setRawOffset(int offsetMillis) {}
            public int getRawOffset() {
                return 0;
            }
            public boolean useDaylightTime() {
                return false;
            }
            public boolean inDaylightTime(java.util.Date date) {
                return false;
            }
            public String getID() {
                return "TotallyUnknownID";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void getAvailableIDs_shouldContainUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
    }

    @Test
    public void setProvider_givenNull_shouldResetToDefaultProvider() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithoutUTC_shouldThrowException() {
        Provider invalidProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("GMT");
                return set;
            }
        };
        DateTimeZone.setProvider(invalidProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenEmptyProvider_shouldThrowException() {
        Provider emptyProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        };
        DateTimeZone.setProvider(emptyProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderReturningInvalidUTCZone_shouldThrowException() {
        Provider invalidUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return new MockDateTimeZone("UTC", 3600000, 3600000, 0L);
                }
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        };
        DateTimeZone.setProvider(invalidUtcProvider);
    }

    @Test
    public void setNameProvider_givenNull_shouldFallbackToDefault() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
        Assert.assertTrue(DateTimeZone.getNameProvider() instanceof DefaultNameProvider);
    }

    @Test
    public void setNameProvider_givenCustomProvider_shouldReturnCustomNames() {
        DateTimeZone.setNameProvider(new MockNameProvider());
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertEquals("SHORT_UTC", zone.getShortName(0L, Locale.ENGLISH));
        Assert.assertEquals("LONG_UTC", zone.getName(0L, Locale.ENGLISH));
    }

    @Test
    public void getShortName_and_getName_givenNullKey_shouldFallbackToID() {
        MockNullNameKeyZone zone = new MockNullNameKeyZone();
        Assert.assertEquals("NullKeyZone", zone.getShortName(0L, null));
        Assert.assertEquals("NullKeyZone", zone.getName(0L, null));
    }

    @Test
    public void getShortName_and_getName_givenProviderReturningNull_shouldFallbackToOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        });
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        Assert.assertEquals("+01:00", zone.getShortName(0L, Locale.US));
        Assert.assertEquals("+01:00", zone.getName(0L, Locale.US));
    }

    @Test
    public void getOffset_givenReadableInstant_shouldHandleNullAndNonNull() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(7200000, zone.getOffset((ReadableInstant) null));
        ReadableInstant instant = new Instant(1000L);
        Assert.assertEquals(7200000, zone.getOffset(instant));
    }

    @Test
    public void isStandardOffset_shouldIdentifyCorrectly() {
        MockDateTimeZone zone = new MockDateTimeZone("Mock", 3600000, 7200000, 100000L);
        Assert.assertTrue(zone.isStandardOffset(50000L));
        Assert.assertFalse(zone.isStandardOffset(150000L));
    }

    @Test
    public void convertUTCToLocal_shouldComputeCorrectly() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = zone.convertUTCToLocal(1000L);
        Assert.assertEquals(1000L + 7200000L, local);
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenOverflow_shouldThrowException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void convertLocalToUTC_strictFalse_shouldComputeCorrectly() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = zone.convertLocalToUTC(7201000L, false);
        Assert.assertEquals(1000L