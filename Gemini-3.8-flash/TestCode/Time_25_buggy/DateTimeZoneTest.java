package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
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

    // -----------------------------------------------------------------------
    // Static Default & Security / Lifecycle Tests
    // -----------------------------------------------------------------------

    @Test
    public void getDefault_givenDefaultState_shouldReturnNonNullZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void setDefault_givenValidZone_shouldUpdateDefaultZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        DateTimeZone.setDefault(zone);
        Assert.assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // forID(String) Tests
    // -----------------------------------------------------------------------

    @Test
    public void forID_givenNullString_shouldReturnDefaultZone() {
        DateTimeZone zone = DateTimeZone.forID(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void forID_givenUtcString_shouldReturnUtcZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUtcZone() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        Assert.assertSame(DateTimeZone.UTC, zone);

        DateTimeZone zoneNegativeZero = DateTimeZone.forID("-00:00");
        Assert.assertSame(DateTimeZone.UTC, zoneNegativeZero);
    }

    @Test
    public void forID_givenPositiveOffsetString_shouldReturnFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeOffsetString_shouldReturnFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenIdenticalOffsetStrings_shouldReturnCachedInstance() {
        DateTimeZone zone1 = DateTimeZone.forID("+03:00");
        DateTimeZone zone2 = DateTimeZone.forID("+03:00");
        Assert.assertSame(zone1, zone2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenUnrecognisedString_shouldThrowIllegalArgumentException() {
        DateTimeZone.forID("NonExistent/Timezone_Name");
    }

    // -----------------------------------------------------------------------
    // forOffsetHours / forOffsetHoursMinutes / forOffsetMillis Tests
    // -----------------------------------------------------------------------

    @Test
    public void forOffsetHours_givenZeroHours_shouldReturnUtcZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenPositiveHours_shouldReturnExpectedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Assert.assertEquals("+05:00", zone.getID());
        Assert.assertEquals(18000000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHours_givenNegativeHours_shouldReturnExpectedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-8);
        Assert.assertEquals("-08:00", zone.getID());
        Assert.assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHourZeroMinute_shouldReturnUtc() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveValues_shouldReturnExpectedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 45);
        Assert.assertEquals("+05:45", zone.getID());
        Assert.assertEquals(20700000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHourPositiveMinute_shouldSubtractMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(1, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinutesGreaterThan59_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenExtremeOffset_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUtc() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenSubSecondOffset_shouldFormatWithMillis() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(1234);
        Assert.assertEquals("+00:00:01.234", zone.getID());
    }

    @Test
    public void forOffsetMillis_givenNegativeSecondsOffset_shouldFormatWithSeconds() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-45000);
        Assert.assertEquals("-00:00:45", zone.getID());
    }

    // -----------------------------------------------------------------------
    // forTimeZone(TimeZone) Tests
    // -----------------------------------------------------------------------

    @Test
    public void forTimeZone_givenNullTimeZone_shouldReturnDefaultZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), zone);
    }

    @Test
    public void forTimeZone_givenUtcTimeZone_shouldReturnUtc() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenConvertedIdMapping_shouldResolveCorrectZone() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void forTimeZone_givenCustomGmtOffset_shouldParseOffset() {
        TimeZone tz = TimeZone.getTimeZone("GMT+04:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("+04:00", zone.getID());
    }

    @Test
    public void forTimeZone_givenCustomGmtZeroOffset_shouldReturnUtc() {
        TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenUnrecognisedTimeZone_shouldThrowIllegalArgumentException() {
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
                return "Unknown_Invalid_ID";
            }
            public String getDisplayName() {
                return "Unknown_Display_Name";
            }
        };
        DateTimeZone.forTimeZone(tz);
    }

    // -----------------------------------------------------------------------
    // Provider & NameProvider Management Tests
    // -----------------------------------------------------------------------

    @Test
    public void setProvider_givenNullProvider_shouldResetToDefaultProvider() {
        DateTimeZone.setProvider(null);
        Assert.assertNotNull(DateTimeZone.getProvider());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenEmptyIdsProvider_shouldThrowIllegalArgumentException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return Collections.emptySet();
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithoutUtc_shouldThrowIllegalArgumentException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("America/New_York");
                return set;
            }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithInvalidUtcZone_shouldThrowIllegalArgumentException() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return new MockDateTimeZone("UTC", 3600000, 3600000);
            }
            public Set<String> getAvailableIDs() {
                Set<String> set = new HashSet<String>();
                set.add("UTC");
                return set;
            }
        });
    }

    @Test
    public void getAvailableIDs_givenStandardProvider_shouldContainUtc() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        Assert.assertNotNull(ids);
        Assert.assertTrue(ids.contains("UTC"));
    }

    @Test
    public void setNameProvider_givenCustomProvider_shouldReturnCustomNames() {
        NameProvider customProvider = new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return "CUSTOM_SHORT";
            }
            public String getName(Locale locale, String id, String nameKey) {
                return "CUSTOM_LONG";
            }
        };

        DateTimeZone.setNameProvider(customProvider);
        Assert.assertSame(customProvider, DateTimeZone.getNameProvider());

        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 0, 0);
        Assert.assertEquals("CUSTOM_SHORT", zone.getShortName(0L, Locale.ENGLISH));
        Assert.assertEquals("CUSTOM_LONG", zone.getName(0L, Locale.ENGLISH));
    }

    @Test
    public void setNameProvider_givenNull_shouldResetToDefaultNameProvider() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Instance Methods & Math/Overflow Tests
    // -----------------------------------------------------------------------

    @Test
    public void constructor_givenNullId_shouldThrowIllegalArgumentException() {
        try {
            new MockDateTimeZone(null, 0, 0);
            Assert.fail("Expected IllegalArgumentException on null ID");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Id must not be null", ex.getMessage());
        }
    }

    @Test
    public void getOffset_givenReadableInstant_shouldDelegateToMillis() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 1000, 1000);
        Instant instant = new Instant(5000L);
        Assert.assertEquals(1000, zone.getOffset(instant));
        Assert.assertEquals(1000, zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void isStandardOffset_givenMatchingAndDivergentOffsets_shouldEvaluateCorrectly() {
        MockDateTimeZone zoneStandard = new MockDateTimeZone("MockStandard", 3600000, 3600000);
        Assert.assertTrue(zoneStandard.isStandardOffset(0L));

        MockDateTimeZone zoneDaylight = new MockDateTimeZone("MockDaylight", 7200000, 3600000);
        Assert.assertFalse(zoneDaylight.isStandardOffset(0L));
    }

    @Test
    public void getNameAndShortName_givenNullNameFromProvider_shouldFallbackToOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        });

        MockDateTimeZone zone = new MockDateTimeZone("MockFallback", 3600000, 3600000);
        Assert.assertEquals("+01:00", zone.getShortName(0L, null));
        Assert.assertEquals("+01:00", zone.getName(0L, null));
    }

    @Test
    public void getNameAndShortName_givenNullNameKey_shouldReturnZoneID() {
        MockDateTimeZone zone = new MockDateTimeZone("NullKeyZone", 0, 0) {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) {
                return null;
            }
        };
        Assert.assertEquals("NullKeyZone", zone.getShortName(0L));
        Assert.assertEquals("NullKeyZone", zone.getName(0L));
    }

    @Test
    public void convertUTCToLocal_givenSafeInstant_shouldAddOffset() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 3600000, 3600000);
        long local = zone.convertUTCToLocal(10000L);
        Assert.assertEquals(3610000L, local);
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenOverflowCondition_shouldThrowArithmeticException() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 1000, 1000);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void convertLocalToUTC_givenSafeInstantNonStrict_shouldSubtractOffset() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 3600000, 3600000);
        long utc = zone.convertLocalToUTC(3610000L, false);
        Assert.assertEquals(10000L, utc);
    }

    @Test(expected = ArithmeticException.class)
    public void convertLocalToUTC_givenOverflowCondition_shouldThrowArithmeticException() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 10000, 10000);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void convertLocalToUTC_withOriginalInstant_shouldMatchOriginalOffset() {
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 3600000, 3600000);
        long utc = zone.convertLocalToUTC(3610000L, true, 0L);
        Assert.assertEquals(10000L, utc);
    }

    @Test
    public void convertLocalToUTC_strictTransitionGap_shouldThrowIllegalArgumentException() {
        TransitionMockZone zone = new TransitionMockZone("TransitionGap", 0, 3600000, 1000L);
        try {
            zone.convertLocalToUTC(1800000L, true);
            Assert.fail("Expected IllegalArgumentException during gap transition in strict mode");
        } catch (IllegalArgumentException ex) {
            Assert.assertTrue(ex.getMessage().startsWith("Illegal instant due to time zone offset transition"));
        }
    }

    @Test
    public void convertLocalToUTC_nonStrictTransitionGap_shouldUseLocalOffset() {
        TransitionMockZone zone = new TransitionMockZone("TransitionGap", 0, 3600000, 1000L);
        long utc = zone.convertLocalToUTC(1800000L, false);
        Assert.assertEquals(1800000L, utc);
    }

    @Test
    public void getOffsetFromLocal_whenOffsetsDifferAndNextTransitionsDiffer_shouldReturnOffsetLocal() {
        DateTimeZone zone = new DateTimeZone("TestOffsetLocal") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "TOL"; }
            public int getOffset(long instant) {
                return (instant < 1000L) ? -3600000 : 0;
            }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return false; }
            public long nextTransition(long instant) {
                if (instant < 0L) return 0L;
                return 2000L;
            }
            public long previousTransition(long instant) { return 0L; }
            public boolean equals(Object object) { return this == object; }
        };

        int offset = zone.getOffsetFromLocal(500L);
        Assert.assertEquals(-3600000, offset);
    }

    @Test
    public void getMillisKeepLocal_givenSameZone_shouldReturnOldInstant() {
        MockDateTimeZone zone = new MockDateTimeZone("ZoneA", 3600000, 3600000);
        long result = zone.getMillisKeepLocal(zone, 12345L);
        Assert.assertEquals(12345L, result);
    }

    @Test
    public void getMillisKeepLocal_givenNullTargetZone_shouldUseDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        try {
            MockDateTimeZone defaultZone = new MockDateTimeZone("DefaultMock", 7200000, 7200000);
            DateTimeZone.setDefault(defaultZone);

            MockDateTimeZone zoneA = new MockDateTimeZone("ZoneA", 3600000, 3600000);
            long result = zoneA.getMillisKeepLocal(null, 10000000L);
            Assert.assertEquals(10000000L + 3600000L - 7200000L, result);
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void isLocalDateTimeGap_givenFixedZone_shouldReturnFalse() {
        DateTimeZone fixedZone = DateTimeZone.forOffsetHours(2);
        LocalDateTime ldt = new LocalDateTime(2020, 1, 1, 0, 0);
        Assert.assertFalse(fixedZone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void isLocalDateTimeGap_givenTransitionGap_shouldReturnTrue() {
        TransitionMockZone zone = new TransitionMockZone("TransitionGap", 0, 3600000, 1000000L);
        LocalDateTime ldt = new LocalDateTime(1000500L);
        Assert.assertTrue(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void toTimeZone_shouldReturnMatchingJavaTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        TimeZone tz = zone.toTimeZone();
        Assert.assertEquals("UTC", tz.getID());
    }

    @Test
    public void toStringAndHashCode_shouldReflectZoneId() {
        MockDateTimeZone zone = new MockDateTimeZone("TestID", 0, 0);
        Assert.assertEquals("TestID", zone.toString());
        Assert.assertEquals(57 + "TestID".hashCode(), zone.hashCode());
    }

    // -----------------------------------------------------------------------
    // Serialization Tests
    // -----------------------------------------------------------------------

    @Test
    public void serialization_givenFixedOffsetZone_shouldDeserializeCorrectly() throws Exception {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(zone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserialized = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertSame(zone, deserialized);
    }

    @Test
    public void stubSerialization_shouldDeserializeViaReadResolve() throws Exception {
        Class<?> stubClass = Class.forName("org.joda.time.DateTimeZone$Stub");
        Constructor<?> constructor = stubClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object stubInstance = constructor.newInstance("UTC");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(stubInstance);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object resolved = ois.readObject();
        ois.close();

        Assert.assertSame(DateTimeZone.UTC, resolved);
    }

    // -----------------------------------------------------------------------
    // Helper Mock Classes
    // -----------------------------------------------------------------------

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int offset;
        private final int standardOffset;

        MockDateTimeZone(String id, int offset, int standardOffset) {
            super(id);
            this.offset = offset;
            this.standardOffset = standardOffset;
        }

        public String getNameKey(long instant) {
            return "KEY";
        }

        public int getOffset(long instant) {
            return offset;
        }

        public int getStandardOffset(long instant) {
            return standardOffset;
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
            if (this == object) {
                return true;
            }
            if (object instanceof MockDateTimeZone) {
                MockDateTimeZone other = (MockDateTimeZone) object;
                return getID().equals(other.getID()) && offset == other.offset && standardOffset == other.standardOffset;
            }
            return false;
        }
    }

    private static class TransitionMockZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int offsetBefore;
        private final int offsetAfter;
        private final long transitionInstant;

        TransitionMockZone(String id, int offsetBefore, int offsetAfter, long transitionInstant) {
            super(id);
            this.offsetBefore = offsetBefore;
            this.offsetAfter = offsetAfter;
            this.transitionInstant = transitionInstant;
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
            return instant < transitionInstant ? transitionInstant : Long.MAX_VALUE;
        }

        public long previousTransition(long instant) {
            return instant > transitionInstant ? transitionInstant : Long.MIN_VALUE;
        }

        public boolean equals(Object object) {
            return this == object;
        }
    }
}