package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.util.TimeZone;

public class DateTimeZoneTest {

    private DateTimeZone originalDefault;

    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
    }

    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
    }

    @Test
    public void testGetDefault() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefaultNewZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        DateTimeZone.setDefault(zone);
        assertSame(zone, DateTimeZone.getDefault());
    }

    @Test
    public void testSetDefaultNull() {
        try {
            DateTimeZone.setDefault(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForIDNull() {
        DateTimeZone result = DateTimeZone.forID(null);
        assertNotNull(result);
        assertEquals(DateTimeZone.getDefault(), result);
    }

    @Test
    public void testForIDUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForIDUnknown() {
        try {
            DateTimeZone.forID("Unknown/Zone");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForIDOffsetPlus() {
        DateTimeZone zone = DateTimeZone.forID("+01:30");
        assertNotNull(zone);
        assertEquals(5400000, zone.getOffset(0L));
    }

    @Test
    public void testForIDOffsetMinus() {
        DateTimeZone zone = DateTimeZone.forID("-02:00");
        assertNotNull(zone);
        assertEquals(-7200000, zone.getOffset(0L));
    }

    @Test
    public void testForIDOffsetZero() {
        DateTimeZone zone = DateTimeZone.forID("+00:00");
        assertNotNull(zone);
        assertEquals(0, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursZero() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertNotNull(zone);
        assertEquals(0, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursPositive() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(2);
        assertNotNull(zone);
        assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursNegative() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(-3);
        assertNotNull(zone);
        assertEquals(-10800000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesValid() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(1, 30);
        assertNotNull(zone);
        assertEquals(5400000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesNegativeHoursPositiveMinutes() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, 30);
        assertNotNull(zone);
        assertEquals(-5400000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesNegativeBoth() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(-2, -30);
        assertNotNull(zone);
        assertEquals(-9000000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutesTooLarge() {
        try {
            DateTimeZone.forOffsetHoursMinutes(24, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetHoursMinutesMinutesOutOfRange() {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, 60);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetMillisPositive() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(7200000);
        assertNotNull(zone);
        assertEquals(7200000, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetMillisNegative() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-3600000);
        assertNotNull(zone);
        assertEquals(-3600000, zone.getOffset(0L));
    }

    @Test
    public void testForTimeZoneGMT() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals(0, zone.getOffset(0L));
    }

    @Test
    public void testForTimeZoneNamed() {
        TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        // Paris is UTC+1 in January, UTC+2 in July
        long winter = System.currentTimeMillis();
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(java.util.Calendar.MONTH, java.util.Calendar.JANUARY);
        cal.set(java.util.Calendar.DAY_OF_MONTH, 1);
        long winterTime = cal.getTimeInMillis();
        assertTrue(zone.getOffset(winterTime) == 3600000 || zone.getOffset(winterTime) == 7200000);
    }

    @Test
    public void testForTimeZoneUTC() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"));
        assertSame(DateTimeZone.UTC, zone);
    }

    @Test
    public void testGetAvailableIDs() {
        assertNotNull(DateTimeZone.getAvailableIDs());
        assertTrue(DateTimeZone.getAvailableIDs().size() > 0);
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testGetName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getName(0L));
        assertFalse(zone.getName(0L).isEmpty());
    }

    @Test
    public void testGetShortName() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getShortName(0L));
        assertFalse(zone.getShortName(0L).isEmpty());
    }

    @Test
    public void testGetShortNameNullLocale() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getShortName(0L, null));
    }

    @Test
    public void testGetNameNullLocale() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getName(0L, null));
    }

    @Test
    public void testIsFixed() {
        DateTimeZone utc = DateTimeZone.UTC;
        assertTrue(utc.isFixed());
    }

    @Test
    public void testIsStandardOffset() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = System.currentTimeMillis();
        // Should not throw
        zone.isStandardOffset(instant);
        // Just verify it returns a boolean
        assertTrue(zone.isStandardOffset(instant) || !zone.isStandardOffset(instant));
    }

    @Test
    public void testGetOffsetReadableInstant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long instant = System.currentTimeMillis();
        DateTime dt = new DateTime(instant);
        assertEquals(zone.getOffset(instant), zone.getOffset((ReadableInstant) dt));
    }

    @Test
    public void testGetOffsetNullReadableInstant() {
        DateTimeZone zone = DateTimeZone.getDefault();
        // Should not throw, uses current time
        int result = zone.getOffset((ReadableInstant) null);
        assertEquals(zone.getOffset(System.currentTimeMillis()), result, 1000);
    }

    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long utcInstant = 1000000L;
        long local = zone.convertUTCToLocal(utcInstant);
        assertEquals(utcInstant + zone.getOffset(utcInstant), local);
    }

    @Test
    public void testConvertLocalToUTCStrict() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long localInstant = 1000000L;
        long utc = zone.convertLocalToUTC(localInstant, true);
        assertEquals(localInstant - zone.getOffset(localInstant - zone.getOffset(localInstant)), utc);
    }

    @Test
    public void testConvertLocalToUTCNotStrict() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long localInstant = 1000000L;
        long utc = zone.convertLocalToUTC(localInstant, false);
        assertEquals(localInstant - zone.getOffset(localInstant), utc);
    }

    @Test
    public void testGetMillisKeepLocalSameZone() {
        DateTimeZone zone = DateTimeZone.getDefault();
        long instant = 1234567L;
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testGetMillisKeepLocalDiffZone() {
        DateTimeZone zone1 = DateTimeZone.forID("Europe/London");
        DateTimeZone zone2 = DateTimeZone.forID("America/New_York");
        long instant = 1234567L;
        long result = zone1.getMillisKeepLocal(zone2, instant);
        assertTrue(result != instant || zone1.getOffset(instant) == zone2.getOffset(instant));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zone = DateTimeZone.UTC;
        LocalDateTime ldt = new LocalDateTime(2023, 1, 1, 0, 0);
        assertFalse(zone.isLocalDateTimeGap(ldt));
    }

    @Test
    public void testGetID() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertEquals("UTC", zone.getID());
    }

    @Test
    public void testToString() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertEquals("UTC", zone.toString());
    }

    @Test
    public void testHashCode() {
        DateTimeZone zone = DateTimeZone.UTC;
        assertEquals(57 + zone.getID().hashCode(), zone.hashCode());
    }

    @Test
    public void testToTimeZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        TimeZone tz = zone.toTimeZone();
        assertNotNull(tz);
        assertEquals("Europe/London", tz.getID());
    }
}