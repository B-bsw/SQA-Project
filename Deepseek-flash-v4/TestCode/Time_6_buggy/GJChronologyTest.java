package org.joda.time.chrono;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.ReadableInstant;
import org.joda.time.chrono.GJChronology;

public class GJChronologyTest {

    private GJChronology utc;
    private GJChronology defaultZone;

    @Before
    public void setUp() {
        utc = GJChronology.getInstanceUTC();
        defaultZone = GJChronology.getInstance();
    }

    @Test
    public void testGetInstanceUTC() {
        assertNotNull(utc);
        assertEquals(DateTimeZone.UTC, utc.getZone());
    }

    @Test
    public void testGetInstanceDefault() {
        assertNotNull(defaultZone);
        assertEquals(DateTimeZone.getDefault(), defaultZone.getZone());
    }

    @Test
    public void testGetInstanceWithZone() {
        DateTimeZone zone = DateTimeZone.forID("Europe/London");
        GJChronology chrono = GJChronology.getInstance(zone);
        assertEquals(zone, chrono.getZone());
    }

    @Test
    public void testGetInstanceNullCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (ReadableInstant) null);
        assertNotNull(chrono);
        assertEquals(DateTimeZone.UTC, chrono.getZone());
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithCutover() {
        Instant cutover = new Instant(1000000L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceLongCutoverEqualsDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, GJChronology.DEFAULT_CUTOVER.getMillis(), 4);
        assertNotNull(chrono);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetDateTimeMillisJulianDate() {
        long instant = utc.getDateTimeMillis(1, 1, 1, 0);
        assertTrue("Instant should be before cutover", instant < GJChronology.DEFAULT_CUTOVER.getMillis());
    }

    @Test
    public void testGetDateTimeMillisGregorianDate() {
        long instant = utc.getDateTimeMillis(2000, 1, 1, 0);
        assertTrue("Instant should be after cutover", instant > GJChronology.DEFAULT_CUTOVER.getMillis());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetDateTimeMillisNonExistentDate() {
        utc.getDateTimeMillis(1582, 10, 10, 0);
    }

    @Test
    public void testGetDateTimeMillisWithTime() {
        long instant = utc.getDateTimeMillis(2000, 6, 15, 12, 30, 0, 0);
        assertNotNull(instant);
    }

    @Test
    public void testGetDateTimeMillisLeapYearHandling() {
        try {
            utc.getDateTimeMillis(1700, 2, 29, 0, 0, 0, 0);
            fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWithZoneSameZone() {
        assertSame(utc, utc.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testWithZoneDifferentZone() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        GJChronology zoned = (GJChronology) utc.withZone(zone);
        assertNotNull(zoned);
        assertEquals(zone, zoned.getZone());
    }

    @Test
    public void testWithUTC() {
        DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
        GJChronology zoned = GJChronology.getInstance(zone);
        org.joda.time.Chronology utcResult = zoned.withUTC();
        assertEquals(DateTimeZone.UTC, utcResult.getZone());
    }

    @Test
    public void testGetGregorianCutover() {
        assertEquals(GJChronology.DEFAULT_CUTOVER, utc.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek() {
        assertEquals(4, utc.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testEqualsSame() {
        assertTrue(utc.equals(utc));
    }

    @Test
    public void testEqualsDifferentInstances() {
        GJChronology other = GJChronology.getInstanceUTC();
        assertTrue(utc.equals(other));
    }

    @Test
    public void testEqualsDifferent() {
        GJChronology withCutover = GJChronology.getInstance(DateTimeZone.UTC, new Instant(0));
        assertFalse(utc.equals(withCutover));
    }

    @Test
    public void testHashCode() {
        int h1 = utc.hashCode();
        int h2 = GJChronology.getInstanceUTC().hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testToStringDefault() {
        String str = utc.toString();
        assertTrue(str.startsWith("GJChronology[UTC]"));
        assertFalse(str.contains("cutover="));
    }

    @Test
    public void testToStringWithCutover() {
        Instant cutover = new Instant(500000000000L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        String str = chrono.toString();
        assertTrue(str.contains("cutover="));
    }

}