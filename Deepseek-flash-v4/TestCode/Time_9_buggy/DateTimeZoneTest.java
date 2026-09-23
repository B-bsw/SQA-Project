package org.joda.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.TimeZone;
import java.util.Locale;

public class DateTimeZoneTest {

    private static DateTimeZone originalDefault;
    private static Provider originalProvider;
    private static NameProvider originalNameProvider;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
        originalProvider = DateTimeZone.getProvider();
        originalNameProvider = DateTimeZone.getNameProvider();
        DateTimeZone.setProvider(new UTCProvider());
        DateTimeZone.setNameProvider(null);
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @After
    public void tearDown() {
        DateTimeZone.setProvider(originalProvider);
        DateTimeZone.setNameProvider(originalNameProvider);
        DateTimeZone.setDefault(originalDefault);
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_NullReturnsDefault() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_OffsetPlus() {
        DateTimeZone zone = DateTimeZone.forID("+05:30");
        assertNotNull(zone);
        assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void testForID_OffsetMinus() {
        DateTimeZone zone = DateTimeZone.forID("-08:00");
        assertNotNull(zone);
        assertEquals(-28800000, zone.getOffset(0L));
    }

    @Test
    public void testForID_OffsetZero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("-00:00"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidId() {
        DateTimeZone.forID("Invalid/Zone");
    }

    @Test
    public void testForOffsetHoursMinutes_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_Positive() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals(19800000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHours() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 0);
        assertEquals(-18000000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHoursWithMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-5, 30);
        assertEquals(-19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesNegative() {
        DateTimeZone.forOffsetHoursMinutes(0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesTooHigh() {
        DateTimeZone.forOffsetHoursMinutes(0, 60);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_Overflow() {
        DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
    }

    @Test
    public void testForOffsetMillis_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_Positive() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillis_Negative() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-7200000);
        assertEquals(-7200000, zone.getOffset(0L));
    }

    @Test
    public void testForTimeZone_Null() {
        assertSame(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(tz));
    }

    @Test
    public void testForTimeZone_GMTWithOffset() {
        TimeZone tz = TimeZone.getTimeZone("GMT+0530");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertEquals(19800000, zone.getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForTimeZone_UnknownId() {
        TimeZone tz = TimeZone.getTimeZone("Bogus/Zone");
        DateTimeZone.forTimeZone(tz);
    }

    @Test
    public void testSetDefault_Normal() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_Null() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testGetDefault_Cached() {
        DateTimeZone zone = DateTimeZone.getDefault();
        assertNotNull(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test
    public void testConvertUTCToLocal_PositiveOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000L, zone.convertUTCToLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_NegativeOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-7200000);
        assertEquals(-7199000L, zone.convertUTCToLocal(1000L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_Overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(Integer.MAX_VALUE);
        zone.convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_Simple() {
        assertEquals(1000L, DateTimeZone.UTC.convertLocalToUTC(1000L, false));
    }

    @Test
    public void testConvertLocalToUTC_WithOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(1000L, zone.convertLocalToUTC(3601000L, false));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_Overflow() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        zone.convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testIsLocalDateTimeGap_FixedZoneReturnsFalse() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(null));
    }

    @Test
    public void testIsLocalDateTimeGap_NoGap() {
        DateTimeZone zone = DateTimeZone.forID("+05:30");
        LocalDateTime ldt = new LocalDateTime(2020, 6, 1, 12, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testAdjustOffset_NoDST() {
        assertEquals(0L, DateTimeZone.UTC.adjustOffset(0L, true));
        assertEquals(1000L, DateTimeZone.UTC.adjustOffset(1000L, false));
    }

    @Test
    public void testGetName_UTC() {
        assertEquals("UTC", DateTimeZone.UTC.getName(0L));
    }

    @Test
    public void testGetShortName_UTC() {
        assertEquals("UTC", DateTimeZone.UTC.getShortName(0L));
    }

    @Test
    public void testGetName_LocaleNonNull() {
        assertEquals("UTC", DateTimeZone.UTC.getName(0L, Locale.US));
    }

    @Test
    public void testGetShortName_LocaleNonNull() {
        assertEquals("UTC", DateTimeZone.UTC.getShortName(0L, Locale.US));
    }

    @Test
    public void testGetOffsetFromLocal_Simple() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000, zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testGetAvailableIDs_ContainsUTC() {
        Set<String> ids = DateTimeZone.getAvailableIDs();
        assertTrue(ids.contains("UTC"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_NullIds() {
        Provider badProvider = new Provider() {
            public Set<String> getAvailableIDs() { return null; }
            public DateTimeZone getZone(String id) { return null; }
        };
        DateTimeZone.setProvider(badProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_NoUTC() {
        Provider badProvider = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> ids = new java.util.HashSet<>();
                ids.add("Europe/London");
                return ids;
            }
            public DateTimeZone getZone(String id) { return null; }
        };
        DateTimeZone.setProvider(badProvider);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_InvalidUTC() {
        Provider badProvider = new Provider() {
            public Set<String> getAvailableIDs() {
                Set<String> ids = new java.util.HashSet<>();
                ids.add("UTC");
                return ids;
            }
            public DateTimeZone getZone(String id) { return null; }
        };
        DateTimeZone.setProvider(badProvider);
    }

    @Test
    public void testSetProvider_Valid() {
        Provider goodProvider = new UTCProvider();
        DateTimeZone.setProvider(goodProvider);
        assertSame(goodProvider, DateTimeZone.getProvider());
    }

    @Test
    public void testSetNameProvider_NullSetsDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetMillisKeepLocal_SameZone() {
        long instant = 1000L;
        assertEquals(instant, DateTimeZone.UTC.getMillisKeepLocal(DateTimeZone.UTC, instant));
    }

    @Test
    public void testGetMillisKeepLocal_DifferentZone() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(3600000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        long instant = 1000L;
        long expected = zone1.convertUTCToLocal(instant);
        expected = zone2.convertLocalToUTC(expected, false, instant);
        assertEquals(expected, zone1.getMillisKeepLocal(zone2, instant));
    }

    @Test
    public void testToTimeZone_ReturnsTimeZoneWithSameID() {
        TimeZone tz = DateTimeZone.UTC.toTimeZone();
        assertEquals("UTC", tz.getID());
    }

    @Test
    public void testHashCode_Consistent() {
        int hc = DateTimeZone.UTC.hashCode();
        assertEquals(hc, DateTimeZone.UTC.hashCode());
    }

    @Test
    public void testToString_ReturnsID() {
        assertEquals("UTC", DateTimeZone.UTC.toString());
    }

    @Test
    public void testIsStandardOffset_UTC() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0L));
    }
}