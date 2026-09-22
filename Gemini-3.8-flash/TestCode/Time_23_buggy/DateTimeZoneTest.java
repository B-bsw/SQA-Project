/*
 * Test Matrix & Analysis for org.joda.time.DateTimeZone
 * 
 * Phase 1 - Code Analysis:
 * 1. Happy Paths:
 *    - getDefault() caching and initial retrieval.
 *    - setDefault(DateTimeZone) updates cDefault correctly.
 *    - forID(String) with "UTC", provider zone ("Europe/London"), offsets ("+01:00", "-05:00", "+00:00").
 *    - forOffsetHours(int), forOffsetHoursMinutes(int, int), forOffsetMillis(int).
 *    - forTimeZone(TimeZone) with UTC, mapped IDs (EST, GMT), standard IDs, and display names ("GMT+02:00").
 *    - Name and ShortName retrieval with and without custom locale and custom NameProvider.
 *    - Offset querying (instant, ReadableInstant, local instant, standard offset check).
 *    - Time zone conversions: convertUTCToLocal, convertLocalToUTC (strict & non-strict).
 *    - getMillisKeepLocal for same zone, null zone, and different zones.
 *    - adjustOffset with transitions and without transitions.
 *    - Serialization round-trip via Stub.
 *
 * 2. Boundary & Edge Cases:
 *    - forID(null) defaults to getDefault().
 *    - Offset parsing with exact hours, minutes, seconds, milliseconds: "+01:02:03.456", "-00:00:00.001".
 *    - forOffsetHoursMinutes boundaries: minutes 0, 59; negative hours with positive minutes.
 *    - Fixed offset caching: repeated retrieval for fixed offset zones hits SoftReference cache.
 *    - isLocalDateTimeGap with fixed vs non-fixed zones.
 *    - adjustOffset where local instant before == after (no overlap/gap).
 *    - toTimeZone, equals, hashCode, toString consistency.
 *
 * 3. Error & Exception Branches:
 *    - setDefault(null) -> IllegalArgumentException.
 *    - forID("unrecognized_zone_name") -> IllegalArgumentException.
 *    - forOffsetHoursMinutes with minutes < 0 or > 59 -> IllegalArgumentException.
 *    - forOffsetHoursMinutes arithmetic overflow -> IllegalArgumentException.
 *    - forTimeZone with unrecognized zone ID -> IllegalArgumentException.
 *    - setProvider(null) -> resets to default.
 *    - setProvider with empty IDs -> IllegalArgumentException.
 *    - setProvider without UTC -> IllegalArgumentException.
 *    - setProvider with invalid UTC instance -> IllegalArgumentException.
 *    - Constructor new DateTimeZone(null) -> IllegalArgumentException.
 *    - convertUTCToLocal overflow -> ArithmeticException.
 *    - convertLocalToUTC strict mode transition gap -> IllegalArgumentException.
 *    - convertLocalToUTC overflow -> ArithmeticException.
 */

package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;

import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;
    private Provider originalProvider;
    private NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
    }

    // -----------------------------------------------------------------------
    // Mock / Subclass Implementations for Testing
    // -----------------------------------------------------------------------

    private static class MockDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final int standardOffset;
        private final int offset;
        private final long nextTransition;
        private final long previousTransition;

        public MockDateTimeZone(String id, int standardOffset, int offset, long nextTransition, long previousTransition) {
            super(id);
            this.standardOffset = standardOffset;
            this.offset = offset;
            this.nextTransition = nextTransition;
            this.previousTransition = previousTransition;
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
            return false;
        }

        public long nextTransition(long instant) {
            return this.nextTransition;
        }

        public long previousTransition(long instant) {
            return this.previousTransition;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof MockDateTimeZone) {
                MockDateTimeZone other = (MockDateTimeZone) object;
                return getID().equals(other.getID()) && this.offset == other.offset;
            }
            return false;
        }
    }

    private static class MockTransitionDateTimeZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;
        private final long transition;
        private final int offsetBefore;
        private final int offsetAfter;

        public MockTransitionDateTimeZone(String id, long transition, int offsetBefore, int offsetAfter) {
            super(id);
            this.transition = transition;
            this.offsetBefore = offsetBefore;
            this.offsetAfter = offsetAfter;
        }

        public String getNameKey(long instant) {
            return instant < transition ? "PRE" : "POST";
        }

        public int getOffset(long instant) {
            return instant < transition ? offsetBefore : offsetAfter;
        }

        public int getStandardOffset(long instant) {
            return offsetBefore;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long instant) {
            return instant < transition ? transition : transition;
        }

        public long previousTransition(long instant) {
            return instant > transition ? transition : transition;
        }

        public boolean equals(Object object) {
            return this == object;
        }
    }

    private static class MockProvider implements Provider {
        private final Set<String> ids;

        public MockProvider(Set<String> ids) {
            this.ids = ids;
        }

        public DateTimeZone getZone(String id) {
            if ("UTC".equals(id)) {
                return DateTimeZone.UTC;
            }
            if (ids.contains(id)) {
                return new FixedDateTimeZone(id, id, 0, 0);
            }
            return null;
        }

        public Set<String> getAvailableIDs() {
            return this.ids;
        }
    }

    private static class MockNameProvider implements NameProvider {
        private final String shortName;
        private final String longName;

        public MockNameProvider(String shortName, String longName) {
            this.shortName = shortName;
            this.longName = longName;
        }

        public String getShortName(Locale locale, String id, String nameKey) {
            return this.shortName;
        }

        public String getName(Locale locale, String id, String nameKey) {
            return this.longName;
        }
    }

    // -----------------------------------------------------------------------
    // Tests: getDefault / setDefault
    // -----------------------------------------------------------------------

    @Test
    public void getDefault_givenDefaultNotNull_shouldReturnCurrentDefault() {
        // Arrange
        DateTimeZone expected = DateTimeZone.UTC;
        DateTimeZone.setDefault(expected);

        // Act
        DateTimeZone actual = DateTimeZone.getDefault();

        // Assert
        Assert.assertSame(expected, actual);
    }

    @Test
    public void getDefault_givenSystemPropertySet_shouldReturnResolvedZone() {
        // Arrange
        String previousProp = System.getProperty("user.timezone");
        try {
            System.setProperty("user.timezone", "Europe/London");
            clearDefaultZoneField();

            // Act
            DateTimeZone zone = DateTimeZone.getDefault();

            // Assert
            Assert.assertNotNull(zone);
            Assert.assertEquals("Europe/London", zone.getID());
        } finally {
            if (previousProp != null) {
                System.setProperty("user.timezone", previousProp);
            } else {
                System.clearProperty("user.timezone");
            }
            clearDefaultZoneField();
        }
    }

    @Test
    public void getDefault_givenInvalidSystemProperty_shouldFallbackToTimeZoneDefault() {
        // Arrange
        String previousProp = System.getProperty("user.timezone");
        TimeZone previousTz = TimeZone.getDefault();
        try {
            System.setProperty("user.timezone", "Invalid/Zone_Name_XYZ");
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
            clearDefaultZoneField();

            // Act
            DateTimeZone zone = DateTimeZone.getDefault();

            // Assert
            Assert.assertNotNull(zone);
            Assert.assertEquals(DateTimeZone.UTC, zone);
        } finally {
            if (previousProp != null) {
                System.setProperty("user.timezone", previousProp);
            } else {
                System.clearProperty("user.timezone");
            }
            TimeZone.setDefault(previousTz);
            clearDefaultZoneField();
        }
    }

    @Test
    public void setDefault_givenValidZone_shouldUpdateDefault() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("America/New_York");

        // Act
        DateTimeZone.setDefault(zone);

        // Assert
        Assert.assertEquals(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        // Act
        DateTimeZone.setDefault(null);
    }

    // -----------------------------------------------------------------------
    // Tests: forID
    // -----------------------------------------------------------------------

    @Test
    public void forID_givenNull_shouldReturnDefaultZone() {
        // Arrange
        DateTimeZone expected = DateTimeZone.getDefault();

        // Act
        DateTimeZone actual = DateTimeZone.forID(null);

        // Assert
        Assert.assertSame(expected, actual);
    }

    @Test
    public void forID_givenUTC_shouldReturnUTCConstant() {
        // Act
        DateTimeZone zone = DateTimeZone.forID("UTC");

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forID_givenProviderZone_shouldReturnCorrectZone() {
        // Act
        DateTimeZone zone = DateTimeZone.forID("Europe/Paris");

        // Assert
        Assert.assertNotNull(zone);
        Assert.assertEquals("Europe/Paris", zone.getID());
    }

    @Test
    public void forID_givenZeroOffsetString_shouldReturnUTC() {
        // Act
        DateTimeZone zonePlus = DateTimeZone.forID("+00:00");
        DateTimeZone zoneMinus = DateTimeZone.forID("-00:00");

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zonePlus);
        Assert.assertSame(DateTimeZone.UTC, zoneMinus);
    }

    @Test
    public void forID_givenPositiveOffsetString_shouldReturnFixedZone() {
        // Act
        DateTimeZone zone = DateTimeZone.forID("+05:30");

        // Assert
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeOffsetString_shouldReturnFixedZone() {
        // Act
        DateTimeZone zone = DateTimeZone.forID("-08:00");

        // Assert
        Assert.assertEquals("-08:00", zone.getID());
        Assert.assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenUnrecognisedID_shouldThrowIllegalArgumentException() {
        // Act
        DateTimeZone.forID("NonExistent/Zone");
    }

    // -----------------------------------------------------------------------
    // Tests: forOffsetHours, forOffsetHoursMinutes, forOffsetMillis
    // -----------------------------------------------------------------------

    @Test
    public void forOffsetHours_givenZero_shouldReturnUTC() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenPositive_shouldReturnCorrectOffsetZone() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);

        // Assert
        Assert.assertEquals("+03:00", zone.getID());
        Assert.assertEquals(3 * 3600000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHours_givenNegative_shouldReturnCorrectOffsetZone() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);

        // Assert
        Assert.assertEquals("-05:00", zone.getID());
        Assert.assertEquals(-5 * 3600000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroZero_shouldReturnUTC() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursPositiveMinutes_shouldCalculateCorrectNegativeOffset() {
        // Act (-5 hours and 30 minutes offset = -5h30m = -330 minutes)
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);

        // Assert
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-(5 * 3600000 + 30 * 60000), zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHoursPositiveMinutes_shouldCalculateCorrectPositiveOffset() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 45);

        // Assert
        Assert.assertEquals("+00:45", zone.getID());
        Assert.assertEquals(45 * 60000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowIllegalArgumentException() {
        // Act
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinutesGreaterThan59_shouldThrowIllegalArgumentException() {
        // Act
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenExtremeHoursCausingOverflow_shouldThrowIllegalArgumentException() {
        // Act
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        // Act
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenPositiveWithSecondsAndMillis_shouldFormatCorrectly() {
        // Act: 1 hr + 2 mins + 3 secs + 456 millis = 3723456 ms
        int millis = 3600000 + 2 * 60000 + 3 * 1000 + 456;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);

        // Assert
        Assert.assertEquals("+01:02:03.456", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenNegativeWithSecondsNoMillis_shouldFormatCorrectly() {
        // Act: -(1 hr + 2 mins + 3 secs) = -3723000 ms
        int millis = -(3600000 + 2 * 60000 + 3 * 1000);
        DateTimeZone zone = DateTimeZone.forOffsetMillis(millis);

        // Assert
        Assert.assertEquals("-01:02:03", zone.getID());
        Assert.assertEquals(millis, zone.getOffset(0L));
    }

    @Test
    public void forOffsetMillis_givenRepeatedCall_shouldReturnCachedInstance() {
        // Act
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);

        // Assert
        Assert.assertSame(zone1, zone2);
    }

    // -----------------------------------------------------------------------
    // Tests: forTimeZone
    // -----------------------------------------------------------------------

    @Test
    public void forTimeZone_givenNull_shouldReturnDefaultZone() {
        // Arrange
        DateTimeZone expected = DateTimeZone.getDefault();

        // Act
        DateTimeZone actual = DateTimeZone.forTimeZone(null);

        // Assert
        Assert.assertSame(expected, actual);
    }

    @Test
    public void forTimeZone_givenUTCTimeZone_shouldReturnUTC() {
        // Arrange
        TimeZone tz = TimeZone.getTimeZone("UTC");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenMappedConversionId_shouldResolveToMappedZone() {
        // Arrange: "EST" converts to "America/New_York"
        TimeZone tz = TimeZone.getTimeZone("EST");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void forTimeZone_givenGMTConversionId_shouldResolveToUTC() {
        // Arrange: "GMT" converts to "UTC"
        TimeZone tz = TimeZone.getTimeZone("GMT");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forTimeZone_givenDirectProviderZone_shouldResolveDirectly() {
        // Arrange
        TimeZone tz = TimeZone.getTimeZone("Europe/London");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void forTimeZone_givenCustomGMTPlusOffset_shouldResolveToFixedOffset() {
        // Arrange
        TimeZone tz = TimeZone.getTimeZone("GMT+04:00");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertEquals("+04:00", zone.getID());
        Assert.assertEquals(14400000, zone.getOffset(0L));
    }

    @Test
    public void forTimeZone_givenCustomGMTMinusZeroOffset_shouldResolveToUTC() {
        // Arrange
        TimeZone tz = TimeZone.getTimeZone("GMT-00:00");

        // Act
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);

        // Assert
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenUnrecognisedTimeZone_shouldThrowIllegalArgumentException() {
        // Arrange
        TimeZone tz = new TimeZone() {
            private static final long serialVersionUID = 1L;
            public int getOffset(int era, int year, int month, int day, int dayOfWeek, int milliseconds) { return 0; }
            public void setRawOffset(int offsetMillis) {}
            public int getRawOffset() { return 0; }
            public boolean useDaylightTime() { return false; }
            public boolean inDaylightTime(java.util.Date date) { return false; }
            public String getID() { return "UnknownNonExistent"; }
            public String getDisplayName() { return "UnknownNonExistent"; }
        };

        // Act
        DateTimeZone.forTimeZone(tz);
    }

    // -----------------------------------------------------------------------
    // Tests: Provider Management
    // -----------------------------------------------------------------------

    @Test
    public void setProvider_givenNull_shouldResetToDefaultProvider() {
        // Arrange
        Provider original = DateTimeZone.getProvider();

        // Act
        DateTimeZone.setProvider(null);

        // Assert
        Assert.assertNotNull(DateTimeZone.getProvider());
        Assert.assertNotNull(DateTimeZone.getAvailableIDs());
        Assert.assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void setProvider_givenValidCustomProvider_shouldUpdateProvider() {
        // Arrange
        Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        ids.add("CustomZone");
        Provider mockProvider = new MockProvider(ids);

        // Act
        DateTimeZone.setProvider(mockProvider);

        // Assert
        Assert.assertSame(mockProvider, DateTimeZone.getProvider());
        Assert.assertEquals(ids, DateTimeZone.getAvailableIDs());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithEmptyIds_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> emptyIds = Collections.emptySet();
        Provider mockProvider = new MockProvider(emptyIds);

        // Act
        DateTimeZone.setProvider(mockProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithoutUTC_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> ids = new HashSet<String>();
        ids.add("Europe/London");
        Provider mockProvider = new MockProvider(ids);

        // Act
        DateTimeZone.setProvider(mockProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithInvalidUTCInstance_shouldThrowIllegalArgumentException() {
        // Arrange
        Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        Provider invalidUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                if ("UTC".equals(id)) {
                    // Returns a zone not equal to DateTimeZone.UTC
                    return new FixedDateTimeZone("UTC", "UTC", 3600, 3600);
                }
                return null;
            }
            public Set<String> getAvailableIDs() {
                return Collections.singleton("UTC");
            }
        };

        // Act
        DateTimeZone.setProvider(invalidUtcProvider);
    }

    // -----------------------------------------------------------------------
    // Tests: NameProvider Management
    // -----------------------------------------------------------------------

    @Test
    public void setNameProvider_givenNull_shouldResetToDefault() {
        // Act
        DateTimeZone.setNameProvider(null);

        // Assert
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void setNameProvider_givenCustomProvider_shouldUpdateNameProvider() {
        // Arrange
        NameProvider custom = new MockNameProvider("SN", "LN");

        // Act
        DateTimeZone.setNameProvider(custom);

        // Assert
        Assert.assertSame(custom, DateTimeZone.getNameProvider());
    }

    // -----------------------------------------------------------------------
    // Tests: Constructor validation
    // -----------------------------------------------------------------------

    @Test
    public void constructor_givenNullId_shouldThrowIllegalArgumentException() {
        try {
            new MockDateTimeZone(null, 0, 0, 0, 0);
            Assert.fail("Expected IllegalArgumentException for null ID");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Id must not be null", ex.getMessage());
        }
    }

    // -----------------------------------------------------------------------
    // Tests: getName / getShortName
    // -----------------------------------------------------------------------

    @Test
    public void getName_givenNullLocale_shouldUseDefaultLocale() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        // Act
        String name = zone.getName(0L, null);

        // Assert
        Assert.assertNotNull(name);
        Assert.assertEquals(zone.getName(0L, Locale.getDefault()), name);
    }

    @Test
    public void getName_singleArgument_shouldDelegateToTwoArguments() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        // Act
        String name1 = zone.getName(0L);
        String name2 = zone.getName(0L, Locale.getDefault());

        // Assert
        Assert.assertEquals(name2, name1);
    }

    @Test
    public void getName_givenNullNameKey_shouldReturnID() {
        // Arrange
        DateTimeZone zone = new DateTimeZone("ZoneNullKey") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return null; }
            public int getOffset(long instant) { return 0; }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return true; }
            public long nextTransition(long instant) { return instant; }
            public long previousTransition(long instant) { return instant; }
            public boolean equals(Object object) { return this == object; }
        };

        // Act
        String name = zone.getName(0L, Locale.ENGLISH);

        // Assert
        Assert.assertEquals("ZoneNullKey", name);
    }

    @Test
    public void getName_givenNameProviderReturnsNull_shouldFallbackToPrintOffset() {
        // Arrange
        DateTimeZone.setNameProvider(new MockNameProvider(null, null));
        DateTimeZone zone = new MockDateTimeZone("ZoneFallback", 3600000, 3600000, 0, 0);

        // Act
        String name = zone.getName(0L, Locale.ENGLISH);

        // Assert
        Assert.assertEquals("+01:00", name);
    }

    @Test
    public void getShortName_givenNullLocale_shouldUseDefaultLocale() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        // Act
        String shortName = zone.getShortName(0L, null);

        // Assert
        Assert.assertNotNull(shortName);
        Assert.assertEquals(zone.getShortName(0L, Locale.getDefault()), shortName);
    }

    @Test
    public void getShortName_singleArgument_shouldDelegateToTwoArguments() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");

        // Act
        String name1 = zone.getShortName(0L);
        String name2 = zone.getShortName(0L, Locale.getDefault());

        // Assert
        Assert.assertEquals(name2, name1);
    }

    @Test
    public void getShortName_givenNullNameKey_shouldReturnID() {
        // Arrange
        DateTimeZone zone = new DateTimeZone("ZoneNullKeyShort") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return null; }
            public int getOffset(long instant) { return 0; }
            public int getStandardOffset(long instant) { return 0; }
            public boolean isFixed() { return true; }
            public long nextTransition(long instant) { return instant; }
            public long previousTransition(long instant) { return instant; }
            public boolean equals(Object object) { return this == object; }
        };

        // Act
        String shortName = zone.getShortName(0L, Locale.ENGLISH);

        // Assert
        Assert.assertEquals("ZoneNullKeyShort", shortName);
    }

    @Test
    public void getShortName_givenNameProviderReturnsNull_shouldFallbackToPrintOffset() {
        // Arrange
        DateTimeZone.setNameProvider(new MockNameProvider(null, null));
        DateTimeZone zone = new MockDateTimeZone("ZoneFallbackShort", 3600000, 3600000, 0, 0);

        // Act
        String shortName = zone.getShortName(0L, Locale.ENGLISH);

        // Assert
        Assert.assertEquals("+01:00", shortName);
    }

    // -----------------------------------------------------------------------
    // Tests: Offset and StandardOffset
    // -----------------------------------------------------------------------

    @Test
    public void getOffset_givenReadableInstant_shouldReturnCorrectOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        ReadableInstant instant = new Instant(1000000L);

        // Act
        int offset = zone.getOffset(instant);

        // Assert
        Assert.assertEquals(7200000, offset);
    }

    @Test
    public void getOffset_givenNullReadableInstant_shouldUseCurrentTime() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        // Act
        int offset = zone.getOffset((ReadableInstant) null);

        // Assert
        Assert.assertEquals(7200000, offset);
    }

    @Test
    public void isStandardOffset_givenStandardAndDaylightInstants_shouldReturnExpectedBoolean() {
        // Arrange
        MockDateTimeZone zone = new MockDateTimeZone("MockZone", 3600000, 3600000, 0, 0);
        MockDateTimeZone dstZone = new MockDateTimeZone("MockZoneDST", 3600000, 7200000, 0, 0);

        // Act & Assert
        Assert.assertTrue(zone.isStandardOffset(0L));
        Assert.assertFalse(dstZone.isStandardOffset(0L));
    }

    // -----------------------------------------------------------------------
    // Tests: getOffsetFromLocal
    // -----------------------------------------------------------------------

    @Test
    public void getOffsetFromLocal_givenNormalCaseWithoutTransition_shouldReturnOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);

        // Act
        int offset = zone.getOffsetFromLocal(0L);

        // Assert
        Assert.assertEquals(7200000, offset);
    }

    @Test
    public void getOffsetFromLocal_givenGapCondition_shouldReturnAppropriateOffset() {
        // Arrange: transition at instant 100000, offset changes from 0 to 3600000 (spring forward gap)
        MockTransitionDateTimeZone zone = new MockTransitionDateTimeZone("GapZone", 100000L, 0, 3600000);

        // Local instant in gap: 101000.
        // offsetLocal = getOffset(101000) = 3600000
        // instantAdjusted = 101000 - 3600000 = -3499000
        // offsetAdjusted = getOffset(-3499000) = 0
        // (offsetLocal - offsetAdjusted) = 3600000 > 0.
        // Act
        int offset = zone.getOffsetFromLocal(101000L);

        // Assert
        Assert.assertEquals(0, offset);
    }

    @Test
    public void getOffsetFromLocal_givenOverlapCondition_shouldReturnAppropriateOffset() {
        // Arrange: transition at 100000, offset changes from 3600000 to 0 (fall back overlap)
        MockTransitionDateTimeZone zone = new MockTransitionDateTimeZone("OverlapZone", 100000L, 3600000, 0);

        // Local instant during overlap: 101000.
        // offsetLocal = getOffset(101000) = 0
        // instantAdjusted = 101000 - 0 = 101000
        // offsetAdjusted = getOffset(101000) = 0
        // Act
        int offset = zone.getOffsetFromLocal(101000L);

        // Assert
        Assert.assertEquals(0, offset);
    }

    @Test
    public void getOffsetFromLocal_givenOffsetLocalGreaterThanZeroWithPrevTransitionClose_shouldReturnPrevOffset() {
        // Arrange: transition occurred recently
        final long transition = 50000L;
        DateTimeZone zone = new DateTimeZone("TestPrevTrans") {
            private static final long serialVersionUID = 1L;
            public String getNameKey(long instant) { return "K"; }
            public int getOffset(long instant) {
                return instant >= transition ? 3600000 : 7200000;
            }
            public int getStandardOffset(long instant) { return 3600000; }
            public boolean isFixed() { return false; }
            public long nextTransition(long instant) { return Long.MAX_VALUE; }
            public long previousTransition(long instant) { return transition; }
            public boolean equals(Object object) { return this == object; }
        };

        // Act: instantLocal = 51000 + 3600000 = 3651000
        // offsetLocal = 3600000, instantAdjusted = 51000
        // offsetAdjusted = 3600000
        // prev = 50000 < instantAdjusted (51000)
        // offsetPrev = 7200000, diff = 7200000 - 3600000 = 3600000
        // instantAdjusted - prev = 1000 <= diff (3600000) -> returns offsetPrev (7200000)
        int offset = zone.getOffsetFromLocal(3651000L);

        // Assert
        Assert.assertEquals(7200000, offset);
    }

    // -----------------------------------------------------------------------
    // Tests: convertUTCToLocal
    // -----------------------------------------------------------------------

    @Test
    public void convertUTCToLocal_givenNormalInstant_shouldAddOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instantUTC = 1000000L;

        // Act
        long local = zone.convertUTCToLocal(instantUTC);

        // Assert
        Assert.assertEquals(1000000L + 7200000L, local);
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenMaxInstantCausingPositiveOverflow_shouldThrowArithmeticException() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);

        // Act
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenMinInstantCausingNegativeOverflow_shouldThrowArithmeticException() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(-1);

        // Act
        zone.convertUTCToLocal(Long.MIN_VALUE);
    }

    // -----------------------------------------------------------------------
    // Tests: convertLocalToUTC
    // -----------------------------------------------------------------------

    @Test
    public void convertLocalToUTC_givenStrictFalse_shouldSubtractOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = 7200000L;

        // Act
        long utc = zone.convertLocalToUTC(local, false);

        // Assert
        Assert.assertEquals(0L, utc);
    }

    @Test
    public void convertLocalToUTC_givenStrictTrueWithoutGap_shouldConvertSuccessfully() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long local = 10000000L;

        // Act
        long utc = zone.convertLocalToUTC(local, true);

        // Assert
        Assert.assertEquals(10000000L - (3 * 3600000L), utc);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertLocalToUTC_givenGapAndStrictTrue_shouldThrowIllegalArgumentException() {
        // Arrange: gap from 0 to 3600000 at transition instant 0
        MockTransitionDateTimeZone zone = new MockTransitionDateTimeZone("GapStrict", 0L, 0, 3600000);

        // Local instant in gap: 1800000
        // Act
        zone.convertLocalToUTC(1800000L, true);
    }

    @Test
    public void convertLocalToUTC_givenGapAndStrictFalse_shouldFallbackToOffsetLocal() {
        // Arrange
        MockTransitionDateTimeZone zone = new MockTransitionDateTimeZone("GapNonStrict", 0L, 0, 3600000);

        // Local instant in gap: 1800000
        // Act
        long utc = zone.convertLocalToUTC(1800000L, false);

        // Assert (offsetLocal = 3600000, utc = 1800000 - 3600000 = -1800000)
        Assert.assertEquals(-1800000L, utc);
    }

    @Test(expected = ArithmeticException.class)
    public void convertLocalToUTC_givenMinInstantCausingOverflow_shouldThrowArithmeticException() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);

        // Act
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void convertLocalToUTC_threeArgsMatchingOriginalOffset_shouldReturnInstantDirectly() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long originalInstantUTC = 5000000L;
        long local = zone.convertUTCToLocal(originalInstantUTC);

        // Act
        long utc = zone.convertLocalToUTC(local, false, originalInstantUTC);

        // Assert
        Assert.assertEquals(originalInstantUTC, utc);
    }

    @Test
    public void convertLocalToUTC_threeArgsDifferentOriginalOffset_shouldDelegateToTwoArgs() {
        // Arrange: transition at instant 100000
        MockTransitionDateTimeZone zone = new MockTransitionDateTimeZone("Transition3Arg", 100000L, 0, 3600000);
        long originalInstantUTC = 50000L; // offset is 0
        long local = 200000L; // offset is 3600000

        // Act
        long utc = zone.convertLocalToUTC(local, false, originalInstantUTC);

        // Assert
        Assert.assertEquals(local - 3600000L, utc);
    }

    // -----------------------------------------------------------------------
    // Tests: getMillisKeepLocal
    // -----------------------------------------------------------------------

    @Test
    public void getMillisKeepLocal_givenSameZone_shouldReturnSameMillis() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long instant = 123456789L;

        // Act
        long result = zone.getMillisKeepLocal(zone, instant);

        // Assert
        Assert.assertEquals(instant, result);
    }

    @Test
    public void getMillisKeepLocal_givenNullNewZone_shouldUseDefaultZone() {
        // Arrange
        DateTimeZone zone = DateTimeZone.UTC;
        DateTimeZone.setDefault(DateTimeZone.forOffsetHours(1));
        long instant = 0L;

        // Act
        long result = zone.getMillisKeepLocal(null, instant);

        // Assert
        Assert.assertEquals(-3600000L, result);
    }

    @Test
    public void getMillisKeepLocal_givenDifferentZones_shouldMaintainLocalWallClock() {
        // Arrange
        DateTimeZone zoneFrom = DateTimeZone.forOffsetHours(1); // UTC+1
        DateTimeZone zoneTo = DateTimeZone.forOffsetHours(3);   // UTC+3
        long instant = 36000000L; // UTC 10:00 -> ZoneFrom local 11:00

        // Act: to get 11:00 local in ZoneTo (UTC+3), UTC instant should be 08:00 (28800000L)
        long result = zoneFrom.getMillisKeepLocal(zoneTo, instant);

        // Assert
        Assert.assertEquals(28800000L, result);
    }

    // -----------------------------------------------------------------------
    // Tests: isLocalDateTimeGap
    // -----------------------------------------------------------------------

    @Test
    public void isLocalDateTimeGap_givenFixedZone_shouldReturnFalse() {
        // Arrange
        DateTimeZone zone = DateTimeZone.UTC;
        LocalDateTime ldt = new LocalDateTime(2023, 1, 1, 0, 0);

        // Act & Assert
        Assert.assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void isLocalDateTimeGap_givenTransitionGap_shouldReturnTrue() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // Spring forward gap in Europe/London: 2023-03-26 01:00 to 02:00 does not exist
        LocalDateTime gapLdt = new LocalDateTime(2023, 3, 26, 1, 30);

        // Act & Assert
        Assert.assertTrue(zone.isLocalDateTimeGap(gapLdt));
    }

    @Test
    public void isLocalDateTimeGap_givenNormalLocalDateTime_shouldReturnFalse() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        LocalDateTime normalLdt = new LocalDateTime(2023, 3, 26, 3, 30);

        // Act & Assert
        Assert.assertFalse(zone.isLocalDateTimeGap(normalLdt));
    }

    // -----------------------------------------------------------------------
    // Tests: adjustOffset
    // -----------------------------------------------------------------------

    @Test
    public void adjustOffset_givenNoTransitionNearby_shouldReturnSameInstant() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(1);
        long instant = 10000000L;

        // Act
        long adjustedEarlier = zone.adjustOffset(instant, false);
        long adjustedLater = zone.adjustOffset(instant, true);

        // Assert
        Assert.assertEquals(instant, adjustedEarlier);
        Assert.assertEquals(instant, adjustedLater);
    }

    @Test
    public void adjustOffset_givenOverlapInstant_shouldAdjustEarlierOrLater() {
        // Arrange: Europe/London fall back on 2023-10-29.
        // 02:00 BST -> 01:00 GMT (01:00 - 02:00 repeats)
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        // Instant at 2023-10-29 01:30 BST: UTC is 00:30 (1698539400000)
        long instant = 1698539400000L;

        // Act
        long earlier = zone.adjustOffset(instant, false);
        long later = zone.adjustOffset(instant, true);

        // Assert
        Assert.assertTrue(earlier <= later);
        Assert.assertEquals(earlier, zone.adjustOffset(later, false));
        Assert.assertEquals(later, zone.adjustOffset(earlier, true));
    }

    // -----------------------------------------------------------------------
    // Tests: toTimeZone, equals, hashCode, toString
    // -----------------------------------------------------------------------

    @Test
    public void toTimeZone_givenZone_shouldReturnMatchingJavaTimeZone() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forID("America/Chicago");

        // Act
        TimeZone tz = zone.toTimeZone();

        // Assert
        Assert.assertNotNull(tz);
        Assert.assertEquals("America/Chicago", tz.getID());
    }

    @Test
    public void equals_and_hashCode_and_toString_shouldBeConsistent() {
        // Arrange
        DateTimeZone zone1 = DateTimeZone.forID("Europe/Paris");
        DateTimeZone zone2 = DateTimeZone.forID("Europe/Paris");
        DateTimeZone zone3 = DateTimeZone.forID("UTC");

        // Act & Assert
        Assert.assertTrue(zone1.equals(zone1));
        Assert.assertTrue(zone1.equals(zone2));
        Assert.assertFalse(zone1.equals(zone3));
        Assert.assertFalse(zone1.equals(null));
        Assert.assertFalse(zone1.equals("SomeString"));

        Assert.assertEquals(zone1.hashCode(), zone2.hashCode());
        Assert.assertEquals(57 + "Europe/Paris".hashCode(), zone1.hashCode());
        Assert.assertEquals("Europe/Paris", zone1.toString());
    }

    // -----------------------------------------------------------------------
    // Tests: Serialization (writeReplace / Stub)
    // -----------------------------------------------------------------------

    @Test
    public void serialization_givenZone_shouldRoundTripSuccessfully() throws Exception {
        // Arrange
        DateTimeZone original = DateTimeZone.forID("America/New_York");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        // Act
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        // Assert
        Assert.assertEquals(original, deserialized);
    }

    @Test
    public void serialization_stubDirectUsage_shouldDeserializeToExpectedZone() throws Exception {
        // Arrange: Access inner private static class Stub via reflection
        Class<?> stubClass = Class.forName("org.joda.time.DateTimeZone$Stub");
        Constructor<?> constructor = stubClass.getDeclaredConstructor(new Class<?>[] { String.class });
        constructor.setAccessible(true);
        Object stubInstance = constructor.newInstance(new Object[] { "UTC" });

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(stubInstance);
        oos.close();

        // Act
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object resolved = ois.readObject();
        ois.close();

        // Assert
        Assert.assertSame(DateTimeZone.UTC, resolved);
    }

    // -----------------------------------------------------------------------
    // Helper Methods
    // -----------------------------------------------------------------------

    private static void clearDefaultZoneField() {
        try {
            Field field = DateTimeZone.class.getDeclaredField("cDefault");
            field.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
            field.set(null, null);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to reset cDefault via reflection", ex);
        }
    }
}