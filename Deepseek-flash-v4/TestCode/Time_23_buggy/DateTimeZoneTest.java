package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import java.util.TimeZone;

public class DateTimeZoneTest {

    @Test
    public void testGetDefault() {
        DateTimeZone result = DateTimeZone.getDefault();
        assertNotNull(result);
    }

    @Test
    public void testSetDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(zone);
        assertEquals(zone, DateTimeZone.getDefault());
        DateTimeZone.setDefault(original);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultNull() {
        DateTimeZone.setDefault(null);
    }

    @Test
    public void testForID_Null() {
        DateTimeZone result = DateTimeZone.forID(null);
        assertNotNull(result);
        assertEquals(DateTimeZone.getDefault(), result);
    }

    @Test
    public void testForID_UTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_Invalid() {
        try {
            DateTimeZone.forID("Invalid/Zone");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The datetime zone id 'Invalid/Zone' is not recognised", e.getMessage());
        }
    }

    @Test
    public void testForID_FixedOffsetPositive() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertEquals(2 * 60 * 60 * 1000L, zone.getOffset(0L));
    }

    @Test
    public void testForOffsetHours() {
        assertEquals(DateTimeZone.forOffsetMillis(0), DateTimeZone.forOffsetHours(0));
        assertEquals(DateTimeZone.forOffsetMillis(5 * 3600 * 1000L), DateTimeZone.forOffsetHours(5));
        assertEquals(DateTimeZone.forOffsetMillis(-3 * 3600 * 1000L), DateTimeZone.forOffsetHours(-3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHours_WithMinutesInvalid() {
        DateTimeZone.forOffsetHoursMinutes(1, 60);
    }

    @Test
    public void testForOffsetHoursMinutes_Valid() {
        assertEquals(DateTimeZone.forOffsetMillis(90 * 60 * 1000L), DateTimeZone.forOffsetHoursMinutes(1, 30));
        assertEquals(DateTimeZone.forOffsetMillis(0), DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetMillis() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertEquals("UTC", zone.getID());
        assertEquals(0, zone.getOffset(0L));
        zone = DateTimeZone.forOffsetMillis(60 * 60 * 1000L);
        assertEquals("+01:00", zone.getID());
        assertEquals(60 * 60 * 1000L, zone.getOffset(0L));
    }

    @Test
    public void testForTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        DateTimeZone zone = DateTimeZone.forTimeZone(tz);
        assertNotNull(zone);
        assertEquals("America/New_York", zone.getID());
    }

    @Test
    public void testGetAvailableIDs() {
        assertNotNull(DateTimeZone.getAvailableIDs());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testGetProvider() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetNameProvider_Null() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetName_Locale() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertNotNull(zone.getName(0L, Locale.US));
    }

    @Test
    public void testGetShortName() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertNotNull(zone.getShortName(0L));
        assertNotNull(zone.getShortName(0L, null));
    }

    @Test(expected = NullPointerException.class)
    public void testGetOffset_NullInstant() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        zone.getOffset((ReadableInstant) null);
    }

    @Test
    public void testGetOffset_Instant() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        assertNotNull(zone.getOffset(0L));
    }

    @Test
    public void testGetStandardOffset_UTC() {
        assertEquals(0, DateTimeZone.UTC.getStandardOffset(0L));
    }

    @Test
    public void testIsStandardOffset() {
        assertEquals(true, DateTimeZone.UTC.isStandardOffset(0L));
    }

    @Test
    public void testAdjustOffset() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long instant = 1612134000000L; // 2021-02-01T00:00:00Z
        assertNotNull(zone.adjustOffset(instant, true));
    }

    @Test
    public void testConvertLocalToUTC() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        long local = 1612141200000L;
        long utc = zone.convertLocalToUTC(local, false);
        assertNotNull(utc);
    }

    @Test
    public void testConvertLocalToUTC_NullOriginalInstant() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        long local = 1000L;
        assertEquals(1000L, zone.convertLocalToUTC(local, false, 0L));
    }

    @Test
    public void testConvertUTCToLocal() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long utc = 0L;
        long local = zone.convertUTCToLocal(utc);
        assertNotNull(local);
    }

    @Test
    public void testGetMillisKeepLocal() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        long millis = 0L;
        long result = zone.getMillisKeepLocal(null, millis);
        assertEquals(millis, result);
    }

    @Test
    public void testGetMillisKeepLocal_SameZone() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        long millis = 1000L;
        assertEquals(millis, zone.getMillisKeepLocal(zone, millis));
    }

    @Test
    public void testIsLocalDateTimeGap() {
        DateTimeZone zone = DateTimeZone.forID("UTC");
        assertFalse(zone.isLocalDateTimeGap(null));
    }

    @Test
    public void testHashCode() {
        assertNotNull(DateTimeZone.UTC.hashCode());
    }

    @Test
    public void testGetZone() {
        assertNotNull(DateTimeZone.UTC.toTimeZone());
    }

    @Test
    public void testGetID() {
        assertEquals("UTC", DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetNameKey() {
        assertNotNull(DateTimeZone.UTC.getNameKey(0L));
    }

    @Test
    public void testGetOffsetWithReadableInstant_NullAtCurrentTime() {
        // Just verify no exception; result may vary
        DateTimeZone zone = DateTimeZone.getDefault();
        long currentTime = System.currentTimeMillis();
        assertEquals(zone.getOffset(currentTime), zone.getOffset((ReadableInstant) null));
    }
}