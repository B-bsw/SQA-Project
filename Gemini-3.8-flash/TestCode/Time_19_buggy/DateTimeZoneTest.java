package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        private final int standardOffset;
        private final int offset;
        private final long nextTransition;
        private final long prevTransition;
        private final String nameKey;

        MockDateTimeZone(String id, int standardOffset, int offset, long prevTransition, long nextTransition, String nameKey) {
            super(id);
            this.standardOffset = standardOffset;
            this.offset = offset;
            this.prevTransition = prevTransition;
            this.nextTransition = nextTransition;
            this.nameKey = nameKey;
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
            return false;
        }

        public long nextTransition(long instant) {
            return nextTransition;
        }

        public long previousTransition(long instant) {
            return prevTransition;
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

    private static class TransitionMockZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final long transitionInstant;
        private final int offsetBefore;
        private final int offsetAfter;

        TransitionMockZone(String id, long transitionInstant, int offsetBefore, int offsetAfter) {
            super(id);
            this.transitionInstant = transitionInstant;
            this.offsetBefore = offsetBefore;
            this.offsetAfter = offsetAfter;
        }

        public String getNameKey(long instant) {
            return "MOCK";
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
            return instant < transitionInstant ? transitionInstant : instant;
        }

        public long previousTransition(long instant) {
            return instant > transitionInstant ? transitionInstant : instant;
        }

        public boolean equals(Object object) {
            return this == object;
        }
    }

    @Test
    public void constructor_givenNullId_shouldThrowIllegalArgumentException() {
        try {
            new MockDateTimeZone(null, 0, 0, 0L, 0L, "UTC");
            fail("Expected IllegalArgumentException for null ID");
        } catch (IllegalArgumentException ex) {
            assertEquals("Id must not be null", ex.getMessage());
        }
    }

    @Test
    public void getDefault_givenDefaultNotSet_shouldReturnSystemDefaultOrUTC() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
    }

    @Test
    public void setDefault_givenValidZone_shouldChangeDefault() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void forID_givenNullId_shouldReturnDefaultZone() {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        DateTimeZone result = DateTimeZone.forID(null);
        assertEquals(defaultZone, result);
    }

    @Test
    public void forID_givenUTC_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertSame(DateTimeZone.UTC, zone);
        assertEquals("UTC", zone.getID());
    }

    @Test
    public void forID_givenProviderZoneId_shouldReturnZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUTC() {
        DateTimeZone zonePositive = DateTimeZone.forID("+00:00");
        assertSame(DateTimeZone.UTC, zonePositive);

        DateTimeZone zoneNegative = DateTimeZone.forID("-00:00");
        assertSame(DateTimeZone.UTC, zoneNegative);
    }

    @Test
    public void forID_givenValidPositiveOffset_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+05:30");
        assertEquals("+05:30", zone.getID());
        assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenValidNegativeOffset_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-08:00");
        assertEquals("-08:00", zone.getID());
        assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenInvalidOffset_shouldThrowIllegalArgumentException() {
        DateTimeZone.forID("+invalid");
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenUnknownId_shouldThrowIllegalArgumentException() {
        DateTimeZone.forID("Unsupported/Timezone_Id_12345");
    }

    @Test
    public void forOffsetHours_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenValidPositiveHours_shouldReturnCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        assertEquals("+03:00", zone.getID());
        assertEquals(10800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHours_givenValidNegativeHours_shouldReturnCorrectZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        assertEquals("-05:00", zone.getID());
        assertEquals(-18000000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHoursAndMinutes_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveHoursAndMinutes_shouldReturnZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 45);
        assertEquals("+05:45", zone.getID());
        assertEquals(20700000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursAndMinutes_shouldReturnZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-4, 30);
        assertEquals("-04:30", zone.getID());
        assertEquals(-16200000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(2, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinuteOutOfRange_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(2, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenExtremeValues_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenPositiveWithSecondsAndMillis_shouldFormatCorrectly() {
        int millis = (1 * 3600000) + (2 * 60000) + (3 * 1000) + 4;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        assertEquals("+01:02:03.004", zone.getID());
        assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenPositiveWithSecondsOnly_shouldFormatCorrectly() {
        int millis = (1 * 3600000) + (2 * 60000) + (3 * 1000);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        assertEquals("+01:02:03", zone.getID());
        assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenNegativeWithSecondsAndMillis_shouldFormatCorrectly() {
        int millis = -((2 * 3600000) + (15 * 60000) + (30 * 1000) + 500);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);
        assertEquals("-02:15:30.500", zone.getID());
        assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenCacheHits_shouldReturnCachedInstance() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        assertSame(zone1, zone2);
    }

    @Test
    public void forTimeZone_givenNull_shouldReturnDefaultZone() {
        DateTimeZone defaultZone = DateTimeZone.getDefault();
        DateTimeZone result = DateTimeZone.forTimeZone(null);
        assertEquals(defaultZone, result);
    }

    @Test
    public void forTimeZone_givenUTCTimeZone_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenConvertedMappingId_shouldReturnMappedZone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTZero_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenCustomGMTPlusOffset_shouldReturnFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("+02:00", zone.getID());
    }

    @Test
    public void forTimeZone_givenCustomGMTMinusOffset_shouldReturnFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT-05:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals("-05:00", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTZeroOffsetString_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenUnknownTimeZone_shouldThrowIllegalArgumentException() {
        TimeZone tz = new TimeZone() {
            private static final long serialVersionUID = 1L;
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) { return 0; }
            public void setRawOffset(int offsetMillis) {}
            public int getRawOffset() { return 0; }
            public boolean useDaylightTime() { return false; }
            public boolean inDaylightTime(java.util.Date date) { return false; }
            public String getID() { return "UnknownTimeZoneCustom"; }
            public String getDisplayName(boolean daylight, int style, Locale locale) { return "UnknownTimeZoneCustom"; }
        };
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void getAvailableIDs_shouldReturnNonEmptySetContainingUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertNotNull(ids);
        assertTrue(ids.contains("UTC"));
    }

    @Test
    public void setProvider_givenNull_shouldResetToDefaultProvider() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithoutIDs_shouldThrowIllegalArgumentException() {
        Provider emptyProvider = new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.emptySet(); }
        };
        DateTimeZone.setProvider(emptyProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithoutUTC_shouldThrowIllegalArgumentException() {
        Provider noUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("America/New_York");
                return set;
            }
        };
        DateTimeZone.setProvider(noUtcProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithInvalidUTCZone_shouldThrowIllegalArgumentException() {
        Provider invalidUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    return DateTimeZone.forOffsetHours(1);
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
    public void setNameProvider_givenNull_shouldFallbackToDefaultNameProvider() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void getNameProvider_setNameProvider_givenCustomProvider_shouldReturnCustom() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        assertSame(custom, DateTimeZone.getNameProvider());
    }

    @Test
    public void getNameAndShortName_givenVariousInputs_shouldFormatProperly() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        assertNotNull(zone.getName(0L));
        assertNotNull(zone.getName(0L, Locale.US));
        assertNotNull(zone.getShortName(0L));
        assertNotNull(zone.getShortName(0L, Locale.US));

        MockDateTimeZone nullKeyZone = new MockDateTimeZone("CustomNullKey", 0, 3600000, 0L, 0L, null);
        assertEquals("CustomNullKey", nullKeyZone.getName(0L));
        assertEquals("CustomNullKey", nullKeyZone.getShortName(0L));

        MockDateTimeZone unknownKeyZone = new MockDateTimeZone("CustomUnknown", 0, 3600000, 0L, 0L, "UNKNOWN_KEY");
        assertEquals("+01:00", unknownKeyZone.getName(0L));
        assertEquals("+01:00", unknownKeyZone.getShortName(0L));
    }

    @Test
    public void getOffset_givenReadableInstant_shouldDelegateProperly() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        assertEquals(18000000, zone.getOffset((ReadableInstant) null));

        Instant instant = new Instant(100000L);
        assertEquals(18000000, zone.getOffset(instant));
    }

    @Test
    public void isStandardOffset_givenMatchingAndNonMatching_shouldReturnExpected() {
        MockDateTimeZone standard = new MockDateTimeZone("Mock", 3600000, 3600000, 0L, 0L, "MOCK");
        assertTrue(standard.isStandardOffset(0L));

        MockDateTimeZone daylight = new MockDateTimeZone("Mock", 3600000, 7200000, 0L, 0L, "MOCK");
        assertFalse(daylight.isStandardOffset(0L));
    }

    @Test
    public void convertUTCToLocal_givenNormalInstant_shouldAddOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long utc = 10000L;
        assertEquals(10000L + 7200000L, zone.convertUTCToLocal(utc));
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenOverflow_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE - 1000L);
    }

    @Test
    public void convertLocalToUTC_strictFalse_givenNormalInstant_shouldSubtractOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = 10000L + 7200000L;
        assertEquals(10000L, zone.convertLocalToUTC(local, false));
    }

    @Test
    public void convertLocalToUTC_strictTrue_givenGap_shouldThrowIllegalArgumentException() {
        TransitionMockZone gapZone = new TransitionMockZone("GAP", 10000000L, 3600000, 7200000);
        long localGapInstant = 10000000L + 3600000 + 1000;
        try {
            gapZone.convertLocalToUTC(localGapInstant, true);
            fail("Expected IllegalArgumentException on gap transition");
        } catch (IllegalArgumentException ex) {
            assertTrue(ex.getMessage().contains("Illegal instant due to time zone offset transition"));
        }
    }

    @Test
    public void convertLocalToUTC_strictFalse_givenGap_shouldResolveUsingLocalOffset() {
        TransitionMockZone gapZone = new TransitionMockZone("GAP", 10000000L, 3600000, 7200000);
        long localGapInstant = 10000000L + 3600000 + 1000;
        long utc = gapZone.convertLocalToUTC(localGapInstant, false);
        assertEquals(localGapInstant - gapZone.getOffset(localGapInstant), utc);
    }

    @Test
    public void convertLocalToUTC_givenOriginalInstantWithMatchingOffset_shouldUseOriginal() {
        TransitionMockZone overlapZone = new TransitionMockZone("OVERLAP", 10000000L, 7200000, 3600000);
        long originalInstantUTC = 9000000L;
        long local = originalInstantUTC + overlapZone.getOffset(originalInstantUTC);
        long result = overlapZone.convertLocalToUTC(local, false, originalInstantUTC);
        assertEquals(originalInstantUTC, result);
    }

    @Test(expected = ArithmeticException.class)
    public void convertLocalToUTC_givenUnderflow_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE + 1000L, false);
    }

    @Test
    public void getOffsetFromLocal_givenNormalAndOverlapTimes_shouldReturnProperOffsets() {
        DateTimeZone utc = DateTimeZone.UTC;
        assertEquals(0, utc.getOffsetFromLocal(1000L));

        TransitionMockZone overlapZone = new TransitionMockZone("OVERLAP", 10000000L, 7200000, 3600000);
        int offset = overlapZone.getOffsetFromLocal(10000000L + 3600000);
        assertTrue(offset == 7200000 || offset == 3600000);
    }

    @Test
    public void getMillisKeepLocal_givenSameZone_shouldReturnOldInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instant = 12345678L;
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void getMillisKeepLocal_givenNullTargetZone_shouldUseDefault() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instant = 10000000L;
        long result = zone.getMillisKeepLocal(null, instant);
        long expected = DateTimeZone.getDefault().convertLocalToUTC(zone.convertUTCToLocal(instant), false, instant);
        assertEquals(expected, result);
    }

    @Test
    public void getMillisKeepLocal_givenDifferentZone_shouldKeepLocalTime() {
        DateTimeZone zoneA = DateTimeZone.forOffsetHours(1);
        DateTimeZone zoneB = DateTimeZone.forOffsetHours(3);
        long instantA = 10000000L;
        long instantB = zoneA.getMillisKeepLocal(zoneB, instantA);
        assertEquals(zoneA.convertUTCToLocal(instantA), zoneB.convertUTCToLocal(instantB));
    }

    @Test
    public void isLocalDateTimeGap_givenFixedZone_shouldReturnFalse() {
        DateTimeZone utc = DateTimeZone.UTC;
        assertFalse(utc.isLocalDateTimeGap(new LocalDateTime(2023, 1, 1, 0, 0)));
    }

    @Test
    public void adjustOffset_givenFlatZone_shouldReturnSameInstant() {
        DateTimeZone zone = DateTimeZone.UTC;
        long instant = 50000000L;
        assertEquals(instant, zone.adjustOffset(instant, true));
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    @Test
    public void toTimeZone_shouldReturnValidJavaTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        TimeZone tz = zone.toTimeZone();
        assertNotNull(tz);
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void equals_hashCode_toString_givenVariousZones_shouldBehaveConsistently() {
        DateTimeZone zoneA = DateTimeZone.forOffsetHours(2);
        DateTimeZone zoneB = DateTimeZone.forOffsetHours(2);
        DateTimeZone zoneC = DateTimeZone.forOffsetHours(3);

        assertEquals(zoneA, zoneB);
        assertFalse(zoneA.equals(zoneC));
        assertFalse(zoneA.equals(null));
        assertFalse(zoneA.equals(new Object()));

        assertEquals(zoneA.hashCode(), zoneB.hashCode());
        assertEquals("+02:00", zoneA.toString());
        assertEquals("+02:00", zoneA.getID());
    }

    @Test
    public void serialization_givenDateTimeZone_shouldSerializeAndDeserializeCorrectly() throws Exception {
        DateTimeZone original = DateTimeZone.forOffsetHoursMinutes(4, 30);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        assertEquals(original, deserialized);
        assertSame(original, deserialized);
    }
}