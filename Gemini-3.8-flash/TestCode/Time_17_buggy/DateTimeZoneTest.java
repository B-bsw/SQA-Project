package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
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

    @Before
    public void setUp() {
        originalDefaultZone = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefaultZone);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int offset;
        private final int standardOffset;
        private final String nameKey;
        private final boolean fixed;

        MockDateTimeZone(String id, int offset, int standardOffset, String nameKey, boolean fixed) {
            super(id);
            this.offset = offset;
            this.standardOffset = standardOffset;
            this.nameKey = nameKey;
            this.fixed = fixed;
        }

        public String getNameKey(long instant) {
            return nameKey;
        }

        public int getOffset(long instant) {
            return offset;
        }

        public int getStandardOffset(long instant) {
            return standardOffset;
        }

        public boolean isFixed() {
            return fixed;
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
                return getID().equals(other.getID()) && offset == other.offset;
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
            return "TRANS";
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
            return instant < transitionInstant ? transitionInstant : transitionInstant + 1000000L;
        }

        public long previousTransition(long instant) {
            return instant > transitionInstant ? transitionInstant : transitionInstant - 1000000L;
        }

        public boolean equals(Object object) {
            return this == object;
        }
    }

    private static class CustomProvider implements Provider {
        private final Set<String> ids;

        CustomProvider(Set<String> ids) {
            this.ids = ids;
        }

        public DateTimeZone getZone(String id) {
            if ("UTC".equals(id)) {
                return DateTimeZone.UTC;
            }
            if (ids.contains(id)) {
                return new MockDateTimeZone(id, 3600000, 3600000, "CUSTOM", true);
            }
            return null;
        }

        public Set<String> getAvailableIDs() {
            return ids;
        }
    }

    @Test
    public void constructor_givenNullId_shouldThrowIllegalArgumentException() {
        try {
            new MockDateTimeZone(null, 0, 0, "TEST", true);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Id must not be null", ex.getMessage());
        }
    }

    @Test
    public void getDefault_givenSystemPropertyOrFallback_shouldReturnNonNullZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void setDefault_givenValidZone_shouldUpdateDefault() {
        DateTimeZone previous = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        Assert.assertEquals(DateTimeZone.UTC, DateTimeZone.getDefault());
        DateTimeZone.setDefault(previous);
    }

    @Test
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        try {
            DateTimeZone.setDefault(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The datetime zone must not be null", ex.getMessage());
        }
    }

    @Test
    public void forID_givenNullId_shouldReturnDefaultZone() {
        DateTimeZone expected = DateTimeZone.getDefault();
        DateTimeZone actual = DateTimeZone.forID(null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void forID_givenUTC_shouldReturnUTCConstant() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenProviderZoneId_shouldReturnZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        Assert.assertNotNull(zone);
        Assert.assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUTC() {
        DateTimeZone zonePlus = DateTimeZone.forID("+00:00");
        DateTimeZone zoneMinus = DateTimeZone.forID("-00:00");
        Assert.assertSame(DateTimeZone.UTC, zonePlus);
        Assert.assertSame(DateTimeZone.UTC, zoneMinus);
    }

    @Test
    public void forID_givenPositiveOffsetString_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertNotNull(zone);
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeOffsetString_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        Assert.assertNotNull(zone);
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenInvalidId_shouldThrowIllegalArgumentException() {
        try {
            DateTimeZone.forID("NonExistent/Timezone");
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("is not recognised") >= 0);
        }
    }

    @Test
    public void forOffsetHours_givenZeroHours_shouldReturnUTC() {
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
        DateTimeZone zone = DateTimeZone.forOffsetHours(-8);
        Assert.assertEquals("-08:00", zone.getID());
        Assert.assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroBoth_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveHoursAndMinutes_shouldReturnCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursAndMinutes_shouldReturnCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-4, 30);
        Assert.assertEquals("-04:30", zone.getID());
        Assert.assertEquals(-16200000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowIllegalArgumentException() {
        try {
            DateTimeZone.forOffsetHoursMinutes(2, -1);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Minutes out of range") >= 0);
        }
    }

    @Test
    public void forOffsetHoursMinutes_givenMinutesGreaterThan59_shouldThrowIllegalArgumentException() {
        try {
            DateTimeZone.forOffsetHoursMinutes(2, 60);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Minutes out of range") >= 0);
        }
    }

    @Test
    public void forOffsetHoursMinutes_givenLargeOffsetCausingArithmeticException_shouldThrowIllegalArgumentException() {
        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Offset is too large", ex.getMessage());
        }
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenMillisWithHoursMinutesSeconds_shouldFormatProperly() {
        int millis = (2 * 3600 + 30 * 60 + 15) * 1000;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+02:30:15", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenMillisWithFractionalSeconds_shouldFormatWithMilliseconds() {
        int millis = (1 * 3600 + 2 * 60 + 3) * 1000 + 456;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("+01:02:03.456", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenNegativeMillisWithFractionalSeconds_shouldFormatCorrectly() {
        int millis = -((1 * 3600 + 2 * 60 + 3) * 1000 + 456);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        Assert.assertEquals("-01:02:03.456", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenRepeatedCalls_shouldUseCache() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(1234567);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(1234567);
        Assert.assertSame(zone1, zone2);
    }

    @Test
    public void forTimeZone_givenNullTimeZone_shouldReturnDefaultZone() {
        DateTimeZone expected = DateTimeZone.getDefault();
        DateTimeZone actual = DateTimeZone.forTimeZone(null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void forTimeZone_givenUTCTimeZone_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenConvertedMappingId_shouldReturnMappedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);

        TimeZone tzEst = TimeZone.getTimeZone("EST");
        DateTimeZone zoneEst = DateTimeZone.forTimeZone(tzEst);
        Assert.assertNotNull(zoneEst);
    }

    @Test
    public void forTimeZone_givenCustomGmtOffsetDisplayNameZero_shouldReturnUTC() {
        TimeZone customTz = new SimpleTimeZone(0, "UNKNOWN_ID") {
            private static final long serialVersionUID = 1L;
            public String getDisplayName() {
                return "GMT+00:00";
            }
        };
        DateTimeZone zone = DateTimeZone.forTimeZone(customTz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenCustomGmtOffsetDisplayNameNonZero_shouldReturnFixedZone() {
        TimeZone customTz = new SimpleTimeZone(7200000, "UNKNOWN_ID") {
            private static final long serialVersionUID = 1L;
            public String getDisplayName() {
                return "GMT+02:00";
            }
        };
        DateTimeZone zone = DateTimeZone.forTimeZone(customTz);
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void forTimeZone_givenUnrecognisedTimeZone_shouldThrowIllegalArgumentException() {
        TimeZone customTz = new SimpleTimeZone(0, "INVALID_TZ_XYZ") {
            private static final long serialVersionUID = 1L;
            public String getDisplayName() {
                return "CUSTOM_NO_GMT";
            }
        };
        try {
            DateTimeZone.forTimeZone(customTz);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("is not recognised") >= 0);
        }
    }

    @Test
    public void getAvailableIDs_givenStandardProvider_shouldContainUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
    }

    @Test
    public void setProvider_givenNull_shouldRestoreDefaultProvider() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void setProvider_givenEmptyIdsProvider_shouldThrowIllegalArgumentException() {
        Provider emptyProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        };
        try {
            DateTimeZone.setProvider(emptyProvider);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The provider doesn't have any available ids", ex.getMessage());
        }
    }

    @Test
    public void setProvider_givenProviderWithoutUTC_shouldThrowIllegalArgumentException() {
        Set<String> ids = new HashSet<String>();
        ids.add("EST");
        Provider noUtcProvider = new CustomProvider(ids);
        try {
            DateTimeZone.setProvider(noUtcProvider);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("The provider doesn't support UTC", ex.getMessage());
        }
    }

    @Test
    public void setProvider_givenProviderWithInvalidUTC_shouldThrowIllegalArgumentException() {
        Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        Provider invalidUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return new MockDateTimeZone("UTC", 3600000, 3600000, "BAD", true);
            }
            public Set<String> getAvailableIDs() {
                return ids;
            }
        };
        try {
            DateTimeZone.setProvider(invalidUtcProvider);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Invalid UTC zone provided", ex.getMessage());
        }
    }

    @Test
    public void setProvider_givenValidProvider_shouldUpdateProvider() {
        Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        ids.add("Custom/Zone");
        Provider validProvider = new CustomProvider(ids);
        DateTimeZone.setProvider(validProvider);
        Assert.assertSame(validProvider, DateTimeZone.getProvider());
        Assert.assertTrue(DateTimeZone.getAvailableIDs().contains("Custom/Zone"));
    }

    @Test
    public void setNameProvider_givenNull_shouldRestoreDefaultNameProvider() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
        Assert.assertTrue(DateTimeZone.getNameProvider() instanceof DefaultNameProvider);
    }

    @Test
    public void setNameProvider_givenCustomNameProvider_shouldUpdateNameProvider() {
        NameProvider customNameProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return "CST_SHORT";
            }
            public String getName(Locale locale, String id, String nameKey) {
                return "CST_LONG";
            }
        };
        DateTimeZone.setNameProvider(customNameProvider);
        Assert.assertSame(customNameProvider, DateTimeZone.getNameProvider());

        MockDateTimeZone zone = new MockDateTimeZone("Custom/Zone", 0, 0, "TEST", true);
        Assert.assertEquals("CST_SHORT", zone.getShortName(0L));
        Assert.assertEquals("CST_LONG", zone.getName(0L));
    }

    @Test
    public void getShortName_givenNullNameKey_shouldReturnZoneID() {
        MockDateTimeZone zone = new MockDateTimeZone("ZoneWithNoKey", 0, 0, null, true);
        Assert.assertEquals("ZoneWithNoKey", zone.getShortName(0L));
    }

    @Test
    public void getName_givenNullNameKey_shouldReturnZoneID() {
        MockDateTimeZone zone = new MockDateTimeZone("ZoneWithNoKey", 0, 0, null, true);
        Assert.assertEquals("ZoneWithNoKey", zone.getName(0L));
    }

    @Test
    public void getShortName_givenUnmappedName_shouldReturnFormattedOffset() {
        NameProvider emptyNameProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        };
        DateTimeZone.setNameProvider(emptyNameProvider);
        MockDateTimeZone zone = new MockDateTimeZone("ZoneUnmapped", 7200000, 7200000, "KEY", true);
        Assert.assertEquals("+02:00", zone.getShortName(0L, Locale.ENGLISH));
    }

    @Test
    public void getName_givenUnmappedName_shouldReturnFormattedOffset() {
        NameProvider emptyNameProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        };
        DateTimeZone.setNameProvider(emptyNameProvider);
        MockDateTimeZone zone = new MockDateTimeZone("ZoneUnmapped", -18000000, -18000000, "KEY", true);
        Assert.assertEquals("-05:00", zone.getName(0L, Locale.ENGLISH));
    }

    @Test
    public void getOffset_givenReadableInstant_shouldDelegateToGetOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        Instant instant = new Instant(1000L);
        Assert.assertEquals(7200000, zone.getOffset(instant));
        Assert.assertEquals(7200000, zone.getOffset(null));
    }

    @Test
    public void isStandardOffset_givenStandardAndNonStandardOffset_shouldReturnExpectedBoolean() {
        MockDateTimeZone standardZone = new MockDateTimeZone("Standard", 3600000, 3600000, "STD", true);
        MockDateTimeZone daylightZone = new MockDateTimeZone("Daylight", 7200000, 3600000, "DST", true);

        Assert.assertTrue(standardZone.isStandardOffset(0L));
        Assert.assertFalse(daylightZone.isStandardOffset(0L));
    }

    @Test
    public void getOffsetFromLocal_givenStandardZone_shouldReturnAdjustedOffset() {
        DateTimeZone zone = DateTimeZone.UTC;
        Assert.assertEquals(0, zone.getOffsetFromLocal(1000L));
    }

    @Test
    public void getOffsetFromLocal_givenTransitionZone_shouldHandleOffsetDifferences() {
        long transition = 10000000L;
        TransitionDateTimeZone zone = new TransitionDateTimeZone("Trans", transition, 3600000, 7200000);
        int offsetBefore = zone.getOffsetFromLocal(transition - 1000000L);
        int offsetAfter = zone.getOffsetFromLocal(transition + 10000000L);
        Assert.assertEquals(3600000, offsetBefore);
        Assert.assertEquals(7200000, offsetAfter);
    }

    @Test
    public void convertUTCToLocal_givenValidInstant_shouldAddOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = 1000000L;
        long local = zone.convertUTCToLocal(utc);
        Assert.assertEquals(utc + 7200000, local);
    }

    @Test
    public void convertUTCToLocal_givenOverflow_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        try {
            zone.convertUTCToLocal(Long.MAX_VALUE);
            Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException ex) {
            Assert.assertEquals("Adding time zone offset caused overflow", ex.getMessage());
        }
    }

    @Test
    public void convertLocalToUTC_givenStrictAndGap_shouldThrowIllegalArgumentException() {
        long transition = 10000000L;
        DateTimeZone zone = new DateTimeZone("GapZone") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "GAP"; }
            public int getOffset(long instant) {
                return instant < transition ? 0 : 3600000;
            }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return false; }
            public long nextTransition(long instant) {
                return instant < transition ? transition : Long.MAX_VALUE;
            }
            public long previousTransition(long instant) {
                return instant > transition ? transition : Long.MIN_VALUE;
            }
            public boolean equals(Object obj) { return this == obj; }
        };

        try {
            zone.convertLocalToUTC(transition + 1800000L, true);
            Assert.fail("Expected IllegalArgumentException due to gap");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0);
        }
    }

    @Test
    public void convertLocalToUTC_givenNonStrictAndGap_shouldReturnAdjustedInstant() {
        long transition = 10000000L;
        DateTimeZone zone = new DateTimeZone("GapZone") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "GAP"; }
            public int getOffset(long instant) {
                return instant < transition ? 0 : 3600000;
            }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return false; }
            public long nextTransition(long instant) {
                return instant < transition ? transition : Long.MAX_VALUE;
            }
            public long previousTransition(long instant) {
                return instant > transition ? transition : Long.MIN_VALUE;
            }
            public boolean equals(Object obj) { return this == obj; }
        };

        long result = zone.convertLocalToUTC(transition + 1800000L, false);
        Assert.assertEquals(transition + 1800000L - 3600000L, result);
    }

    @Test
    public void convertLocalToUTC_givenOverflow_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        try {
            zone.convertLocalToUTC(Long.MIN_VALUE, false);
            Assert.fail("Expected ArithmeticException");
        } catch (ArithmeticException ex) {
            Assert.assertEquals("Subtracting time zone offset caused overflow", ex.getMessage());
        }
    }

    @Test
    public void convertLocalToUTC_withOriginalInstantUTC_shouldReturnExpectedInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long originalUTC = 5000L;
        long local = zone.convertUTCToLocal(originalUTC);
        long calculatedUTC = zone.convertLocalToUTC(local, false, originalUTC);
        Assert.assertEquals(originalUTC, calculatedUTC);
    }

    @Test
    public void getMillisKeepLocal_givenSameZone_shouldReturnSameMillis() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 12345678L;
        long result = zone.getMillisKeepLocal(zone, instant);
        Assert.assertEquals(instant, result);
    }

    @Test
    public void getMillisKeepLocal_givenNullZone_shouldUseDefault() {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        DateTimeZone zone = DateTimeZone.forOffsetHours(defaultZone.getOffset(0L) / 3600000 + 1);
        long instant = 10000000L;
        long expected = zone.getMillisKeepLocal(defaultZone, instant);
        long actual = zone.getMillisKeepLocal(null, instant);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMillisKeepLocal_givenDifferentZone_shouldKeepLocalTime() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);
        long instant = 10000000L;
        long result = zone1.getMillisKeepLocal(zone2, instant);
        Assert.assertEquals(instant - 2 * 3600000L, result);
    }

    @Test
    public void isLocalDateTimeGap_givenFixedZone_shouldReturnFalse() {
        DateTimeZone zone = DateTimeZone.UTC;
        LocalDateTime ldt = new LocalDateTime(2023, 1, 1, 0, 0);
        Assert.assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void isLocalDateTimeGap_givenTransitionGap_shouldReturnTrue() {
        final long transition = 10000000L;
        DateTimeZone zone = new DateTimeZone("GapZone") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "GAP"; }
            public int getOffset(long instant) {
                return instant < transition ? 0 : 3600000;
            }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return false; }
            public long nextTransition(long instant) {
                return instant < transition ? transition : Long.MAX_VALUE;
            }
            public long previousTransition(long instant) {
                return instant > transition ? transition : Long.MIN_VALUE;
            }
            public boolean equals(Object obj) { return this == obj; }
        };

        LocalDateTime ldt = new LocalDateTime(transition + 1800000L, zone);
        boolean isGap = zone.isLocalDateTimeGap(ldt);
        Assert.assertFalse(isGap);
    }

    @Test
    public void adjustOffset_givenNoOffsetDifferenceAroundInstant_shouldReturnSameInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instant = 1000000L;
        long adjusted = zone.adjustOffset(instant, true);
        Assert.assertEquals(instant, adjusted);
    }

    @Test
    public void toTimeZone_givenUTC_shouldReturnMatchingTimeZone() {
        DateTimeZone zone = DateTimeZone.UTC;
        TimeZone tz = zone.toTimeZone();
        Assert.assertNotNull(tz);
        Assert.assertEquals("UTC", tz.getID());
    }

    @Test
    public void hashCode_givenEqualZones_shouldReturnEqualHashCodes() {
        DateTimeZone zone1 = DateTimeZone.forID("+02:00");
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals(zone1.hashCode(), zone2.hashCode());
    }

    @Test
    public void toString_shouldReturnZoneID() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Assert.assertEquals("+05:00", zone.toString());
    }

    @Test
    public void serialization_givenZone_shouldSerializeAndDeserializeCorrectly() throws Exception {
        DateTimeZone zone = DateTimeZone.forID("+03:00");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }
}