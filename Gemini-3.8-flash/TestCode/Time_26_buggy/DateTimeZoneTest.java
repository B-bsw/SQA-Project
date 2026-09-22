package org.joda.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;

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

    private static class NullKeyMockZone extends DateTimeZone {
        private static final long serialVersionUID = 1L;

        NullKeyMockZone(String id) {
            super(id);
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
            return this == object;
        }
    }

    @Test
    public void constructor_givenNullId_shouldThrowIllegalArgumentException() {
        try {
            new MockDateTimeZone(null, 0, 0, true);
            Assert.fail("Expected IllegalArgumentException for null id");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("Id must not be null", ex.getMessage());
        }
    }

    @Test
    public void getDefault_givenDefaultNotSet_shouldReturnSystemOrUtcZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        Assert.assertNotNull(zone);
    }

    @Test
    public void setDefault_givenNonNullZone_shouldUpdateDefaultZone() {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone utc = DateTimeZone.UTC;
        DateTimeZone.setDefault(utc);
        Assert.assertEquals(utc, DateTimeZone.getDefault());
        DateTimeZone.setDefault(original);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDefault_givenNullZone_shouldThrowIllegalArgumentException() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void forID_givenNullString_shouldReturnDefaultZone() {
        DateTimeZone result = DateTimeZone.forID(null);
        Assert.assertEquals(DateTimeZone.getDefault(), result);
    }

    @Test
    public void forID_givenUTC_shouldReturnUtcInstance() {
        DateTimeZone result = DateTimeZone.forID("UTC");
        Assert.assertSame(DateTimeZone.UTC, result);
    }

    @Test
    public void forID_givenProviderZoneId_shouldReturnRecognisedZone() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        Assert.assertNotNull(london);
        Assert.assertEquals("Europe/London", london.getID());
    }

    @Test
    public void forID_givenOffsetZeroString_shouldReturnUTC() {
        DateTimeZone plusZero = DateTimeZone.forID("+00:00");
        DateTimeZone minusZero = DateTimeZone.forID("-00:00");
        Assert.assertSame(DateTimeZone.UTC, plusZero);
        Assert.assertSame(DateTimeZone.UTC, minusZero);
    }

    @Test
    public void forID_givenPositiveFixedOffsetString_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        Assert.assertEquals("+02:00", zone.getID());
        Assert.assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void forID_givenNegativeFixedOffsetString_shouldReturnFixedZone() {
        DateTimeZone zone = DateTimeZone.forID("-05:30");
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forID_givenInvalidID_shouldThrowIllegalArgumentException() {
        DateTimeZone.forID("NonExistent/Zone_ID");
    }

    @Test
    public void forOffsetHours_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHours_givenPositiveAndNegative_shouldReturnCorrectFixedZones() {
        DateTimeZone plusTwo = DateTimeZone.forOffsetHours(2);
        Assert.assertEquals("+02:00", plusTwo.getID());
        Assert.assertEquals(7200000, plusTwo.getOffset(0L));

        DateTimeZone minusFive = DateTimeZone.forOffsetHours(-5);
        Assert.assertEquals("-05:00", minusFive.getID());
        Assert.assertEquals(-18000000, minusFive.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenZeroHourAndMinutes_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(0, 0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetHoursMinutes_givenPositiveHoursAndMinutes_shouldReturnPositiveZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        Assert.assertEquals("+05:30", zone.getID());
        Assert.assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void forOffsetHoursMinutes_givenNegativeHoursAndMinutes_shouldReturnNegativeZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        Assert.assertEquals("-05:30", zone.getID());
        Assert.assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenNegativeMinutes_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(5, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenMinuteOutOfRangeSixty_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(5, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forOffsetHoursMinutes_givenOverflowOffset_shouldThrowIllegalArgumentException() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 30);
    }

    @Test
    public void forOffsetMillis_givenZero_shouldReturnUTC() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        Assert.assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void forOffsetMillis_givenMillisecondFractions_shouldFormatWithSecondsAndMillis() {
        int offsetWithMillis = 3600000 + 60000 + 1000 + 123;
        DateTimeZone zone = DateTimeZone.forOffsetMillis(offsetWithMillis);
        Assert.assertEquals("+01:01:01.123", zone.getID());
        Assert.assertEquals(offsetWithMillis, zone.getOffset(0L));

        int offsetWithSecondsOnly = 3600000 + 1000;
        DateTimeZone secZone = DateTimeZone.forOffsetMillis(offsetWithSecondsOnly);
        Assert.assertEquals("+01:00:01", secZone.getID());

        int negativeOffset = -1 * (3600000 + 60000 + 1000 + 50);
        DateTimeZone negZone = DateTimeZone.forOffsetMillis(negativeOffset);
        Assert.assertEquals("-01:01:01.050", negZone.getID());
    }

    @Test
    public void forOffsetMillis_givenRepeatedCalls_shouldReturnCachedInstance() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(18000000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(18000000);
        Assert.assertSame(zone1, zone2);
    }

    @Test
    public void forTimeZone_givenNull_shouldReturnDefaultZone() {
        DateTimeZone result = DateTimeZone.forTimeZone(null);
        Assert.assertEquals(DateTimeZone.getDefault(), result);
    }

    @Test
    public void forTimeZone_givenUTCTimeZone_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, result);
    }

    @Test
    public void forTimeZone_givenMappedZoneId_shouldConvertProperly() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("America/New_York", result.getID());
    }

    @Test
    public void forTimeZone_givenProviderZoneId_shouldReturnCorrectZone() {
        TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("Europe/Paris", result.getID());
    }

    @Test
    public void forTimeZone_givenCustomGmtPositiveOffset_shouldReturnFixedZone() {
        TimeZone tz = TimeZone.getTimeZone("GMT+02:00");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        Assert.assertEquals("+02:00", result.getID());
    }

    @Test
    public void forTimeZone_givenCustomGmtZeroOffset_shouldReturnUTC() {
        TimeZone tz = TimeZone.getTimeZone("GMT+00:00");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        Assert.assertSame(DateTimeZone.UTC, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void forTimeZone_givenUnrecognisedTimeZone_shouldThrowIllegalArgumentException() {
        TimeZone tz = new SimpleTimeZone(0, "Unrecognized_Custom_TZ_123");
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void getAvailableIDs_givenNormalState_shouldContainUTC() {
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
    public void setProvider_givenProviderWithEmptyIDs_shouldThrowIllegalArgumentException() {
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
    public void setProvider_givenProviderWithoutUTC_shouldThrowIllegalArgumentException() {
        final Set<String> ids = new HashSet<String>();
        ids.add("EST");
        Provider noUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return null;
            }
            public Set<String> getAvailableIDs() {
                return ids;
            }
        };
        DateTimeZone.setProvider(noUtcProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setProvider_givenProviderWithInvalidUTCInstance_shouldThrowIllegalArgumentException() {
        final Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        Provider invalidUtcProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return new MockDateTimeZone("UTC", 0, 0, true);
            }
            public Set<String> getAvailableIDs() {
                return ids;
            }
        };
        DateTimeZone.setProvider(invalidUtcProvider);
    }

    @Test
    public void setProvider_givenValidCustomProvider_shouldSucceed() {
        final Set<String> ids = new HashSet<String>();
        ids.add("UTC");
        Provider validProvider = new Provider() {
            public DateTimeZone getZone(String id) {
                return "UTC".equals(id) ? DateTimeZone.UTC : null;
            }
            public Set<String> getAvailableIDs() {
                return ids;
            }
        };
        DateTimeZone.setProvider(validProvider);
        Assert.assertSame(validProvider, DateTimeZone.getProvider());
    }

    @Test
    public void setNameProvider_givenNull_shouldResetToDefaultNameProvider() {
        DateTimeZone.setNameProvider(null);
        Assert.assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void setNameProvider_givenCustomProvider_shouldUpdateCurrentNameProvider() {
        NameProvider custom = new DefaultNameProvider();
        DateTimeZone.setNameProvider(custom);
        Assert.assertSame(custom, DateTimeZone.getNameProvider());
    }

    @Test
    public void getNameAndShortName_givenNullKey_shouldReturnZoneId() {
        DateTimeZone zone = new NullKeyMockZone("NullKeyZone");
        Assert.assertEquals("NullKeyZone", zone.getName(0L));
        Assert.assertEquals("NullKeyZone", zone.getShortName(0L));
        Assert.assertEquals("NullKeyZone", zone.getName(0L, Locale.ENGLISH));
        Assert.assertEquals("NullKeyZone", zone.getShortName(0L, Locale.ENGLISH));
    }

    @Test
    public void getNameAndShortName_givenDefaultAndLocaleCalls_shouldReturnFormattedValues() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        long winterInstant = 0L;
        String shortName = london.getShortName(winterInstant);
        String name = london.getName(winterInstant);
        Assert.assertNotNull(shortName);
        Assert.assertNotNull(name);

        String shortNameFr = london.getShortName(winterInstant, Locale.FRENCH);
        String nameFr = london.getName(winterInstant, Locale.FRENCH);
        Assert.assertNotNull(shortNameFr);
        Assert.assertNotNull(nameFr);
    }

    @Test
    public void getNameAndShortName_whenProviderReturnsNull_shouldFallbackToPrintOffset() {
        DateTimeZone.setNameProvider(new NameProvider() {
            public String getShortName(Locale locale, String id, String nameKey) {
                return null;
            }
            public String getName(Locale locale, String id, String nameKey) {
                return null;
            }
        });

        DateTimeZone zone = new MockDateTimeZone("MockFallback", 3600000, 3600000, true);
        Assert.assertEquals("+01:00", zone.getName(0L));
        Assert.assertEquals("+01:00", zone.getShortName(0L));
    }

    @Test
    public void getOffset_givenReadableInstant_shouldDelegateToGetOffsetLong() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        Instant instant = new Instant(1000L);
        Assert.assertEquals(10800000, zone.getOffset(instant));
        Assert.assertEquals(10800000, zone.getOffset((ReadableInstant) null));
    }

    @Test
    public void isStandardOffset_givenStandardAndNonStandardInstants_shouldReturnAccurateFlag() {
        DateTimeZone standardZone = new MockDateTimeZone("Standard", 3600000, 3600000, true);
        Assert.assertTrue(standardZone.isStandardOffset(0L));

        DateTimeZone daylightZone = new MockDateTimeZone("Daylight", 3600000, 7200000, false);
        Assert.assertFalse(daylightZone.isStandardOffset(0L));
    }

    @Test
    public void getOffsetFromLocal_givenNormalOffsetWithoutGapOrOverlap_shouldReturnAdjustedOffset() {
        DateTimeZone zone = new MockDateTimeZone("FixedMock", 3600000, 3600000, true);
        Assert.assertEquals(3600000, zone.getOffsetFromLocal(10000L));
    }

    @Test
    public void getOffsetFromLocal_givenGapCondition_shouldReturnOffsetLocal() {
        TransitionMockZone gapZone = new TransitionMockZone("GapMock", 100000L, 3600000, 7200000);
        int offset = gapZone.getOffsetFromLocal(100000L + 3600000);
        Assert.assertEquals(3600000, offset);
    }

    @Test
    public void convertUTCToLocal_givenNormalValue_shouldAddOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        long local = zone.convertUTCToLocal(10000L);
        Assert.assertEquals(10000L + 7200000L, local);
    }

    @Test(expected = ArithmeticException.class)
    public void convertUTCToLocal_givenOverflowBoundary_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertUTCToLocal(Long.MAX_VALUE - 100L);
    }

    @Test
    public void convertLocalToUTC_givenStrictFalseInOverlap_shouldResolveOffset() {
        TransitionMockZone overlapZone = new TransitionMockZone("OverlapMock", 100000L, 7200000, 3600000);
        long instantLocal = 100000L + 3600000L;
        long utcNonStrict = overlapZone.convertLocalToUTC(instantLocal, false);
        Assert.assertEquals(instantLocal - 7200000L, utcNonStrict);
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertLocalToUTC_givenStrictTrueInGap_shouldThrowIllegalArgumentException() {
        TransitionMockZone gapZone = new TransitionMockZone("StrictGapMock", 100000L, 3600000, 7200000);
        gapZone.convertLocalToUTC(100000L + 3600000L, true);
    }

    @Test(expected = ArithmeticException.class)
    public void convertLocalToUTC_givenSubtractOverflow_shouldThrowArithmeticException() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        zone.convertLocalToUTC(Long.MIN_VALUE + 100L, false);
    }

    @Test
    public void getMillisKeepLocal_givenNullNewZone_shouldUseDefaultZone() {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone utc = DateTimeZone.UTC;
        DateTimeZone.setDefault(DateTimeZone.forOffsetHours(1));
        try {
            long result = utc.getMillisKeepLocal(null, 3600000L);
            Assert.assertEquals(0L, result);
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void getMillisKeepLocal_givenSameZone_shouldReturnOldInstant() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(3);
        long oldInstant = 12345678L;
        long result = zone.getMillisKeepLocal(zone, oldInstant);
        Assert.assertEquals(oldInstant, result);
    }

    @Test
    public void getMillisKeepLocal_givenDifferentZone_shouldKeepLocalWallClockTime() {
        DateTimeZone zone1 = DateTimeZone.forOffsetHours(1);
        DateTimeZone zone2 = DateTimeZone.forOffsetHours(3);
        long oldInstant = 10000000L;
        long result = zone1.getMillisKeepLocal(zone2, oldInstant);
        Assert.assertEquals(oldInstant - 7200000L, result);
    }

    @Test
    public void isLocalDateTimeGap_givenFixedZone_shouldReturnFalse() {
        DateTimeZone fixed = DateTimeZone.forOffsetHours(2);
        LocalDateTime ldt = new LocalDateTime(2023, 3, 26, 2, 30);
        Assert.assertFalse(fixed.isLocalDateTimeGap(ldt));
    }

    @Test
    public void isLocalDateTimeGap_givenNormalLocalDateTimeInTransitionZone_shouldReturnFalse() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        LocalDateTime normalTime = new LocalDateTime(2023, 1, 1, 12, 0);
        Assert.assertFalse(paris.isLocalDateTimeGap(normalTime));
    }

    @Test
    public void isLocalDateTimeGap_givenSpringForwardGap_shouldReturnTrue() {
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        LocalDateTime gapTime = new LocalDateTime(2023, 3, 26, 2, 30);
        Assert.assertTrue(paris.isLocalDateTimeGap(gapTime));
    }

    @Test
    public void toTimeZone_shouldReturnEquivalentJavaTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        TimeZone javaTz = zone.toTimeZone();
        Assert.assertNotNull(javaTz);
        Assert.assertEquals("Europe/London", javaTz.getID());
    }

    @Test
    public void hashCodeAndToString_shouldFollowContract() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(4);
        Assert.assertEquals("+04:00", zone.toString());
        Assert.assertEquals(57 + "+04:00".hashCode(), zone.hashCode());
    }

    @Test
    public void serialization_givenFixedAndNamedZones_shouldSerializeAndDeserializeCorrectly() throws Exception {
        DateTimeZone originalZone = DateTimeZone.forOffsetHours(5);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(originalZone);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        DateTimeZone deserializedZone = (DateTimeZone) ois.readObject();
        ois.close();

        Assert.assertEquals(originalZone, deserializedZone);

        ByteArrayOutputStream baosUtc = new ByteArrayOutputStream();
        ObjectOutputStream oosUtc = new ObjectOutputStream(baosUtc);
        oosUtc.writeObject(DateTimeZone.UTC);
        oosUtc.close();

        ByteArrayInputStream baisUtc = new ByteArrayInputStream(baosUtc.toByteArray());
        ObjectInputStream oisUtc = new ObjectInputStream(baisUtc);
        DateTimeZone deserializedUtc = (DateTimeZone) oisUtc.readObject();
        oisUtc.close();

        Assert.assertSame(DateTimeZone.UTC, deserializedUtc);
    }

    @Test
    public void stub_testReflectionAndInternalSerializationCoverage() throws Exception {
        Class<?>[] declaredClasses = DateTimeZone.class.getDeclaredClasses();
        Class<?> stubClass = null;
        for (int i = 0; i < declaredClasses.length; i++) {
            if ("org.joda.time.DateTimeZone$Stub".equals(declaredClasses[i].getName())) {
                stubClass = declaredClasses[i];
                break;
            }
        }
        Assert.assertNotNull(stubClass);

        Constructor<?> constructor = stubClass.getDeclaredConstructor(new Class[] { String.class });
        constructor.setAccessible(true);
        Object stubInstance = constructor.newInstance(new Object[] { "UTC" });

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
}