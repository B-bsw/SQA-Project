package org.joda.time.chrono;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.field.BaseDateTimeField;
import org.joda.time.DurationField;
import java.util.Locale;

public class GJChronologyTest {
    private GJChronology chronology;
    private DateTimeZone zone;

    @Before
    public void setUp() {
        zone = DateTimeZone.UTC;
        chronology = GJChronology.getInstance(zone);
    }

    @After
    public void tearDown() {
        chronology = null;
        zone = null;
    }

    @Test
    public void testGetInstanceUTC() {
        GJChronology chrono = GJChronology.getInstanceUTC();
        assertNotNull(chrono);
        assertEquals(DateTimeZone.UTC, chrono.getZone());
    }

    @Test
    public void testGetInstanceDefault() {
        GJChronology chrono = GJChronology.getInstance();
        assertNotNull(chrono);
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
    }

    @Test
    public void testGetInstanceWithZone() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        assertNotNull(chrono);
        assertEquals(DateTimeZone.UTC, chrono.getZone());
    }

    @Test
    public void testGetInstanceWithZoneAndCutover() {
        Instant cutover = new Instant(1000L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertNotNull(chrono);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithNullGregorianCutover() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, (ReadableInstant) null);
        assertNotNull(chrono);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetInstanceWithZoneAndDays() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, null, 2);
        assertNotNull(chrono);
        assertEquals(2, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testCachingSameInstance() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertSame(chrono1, chrono2);
    }

    @Test
    public void testGetZone() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.getDefault());
        assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        GJChronology utcChrono = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithUTC() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.getDefault());
        Chronology utcChrono = chrono.withUTC();
        assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void testWithZone() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        DateTimeZone newZone = DateTimeZone.getDefault();
        Chronology newChrono = chrono.withZone(newZone);
        assertEquals(newZone, newChrono.getZone());
    }

    @Test
    public void testWithZoneNull() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        Chronology newChrono = chrono.withZone(null);
        assertEquals(DateTimeZone.getDefault(), newChrono.getZone());
    }

    @Test
    public void testWithZoneSameZoneReturnsThis() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        assertSame(chrono, chrono.withZone(DateTimeZone.UTC));
    }

    @Test
    public void testGetGregorianCutover() {
        Instant cutover = new Instant(123456789L);
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, cutover);
        assertEquals(cutover, chrono.getGregorianCutover());
    }

    @Test
    public void testGetGregorianCutoverDefault() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void testGetMinimumDaysInFirstWeek() {
        GJChronology chronoDefault = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(4, chronoDefault.getMinimumDaysInFirstWeek());
        GJChronology chronoCustom = GJChronology.getInstance(DateTimeZone.UTC, null, 2);
        assertEquals(2, chronoCustom.getMinimumDaysInFirstWeek());
    }

    @Test
    public void testEquals() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertTrue(chrono1.equals(chrono2));
        assertTrue(chrono1.equals(chrono1));
        assertFalse(chrono1.equals(null));
        assertFalse(chrono1.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        GJChronology chrono1 = GJChronology.getInstance(DateTimeZone.UTC);
        GJChronology chrono2 = GJChronology.getInstance(DateTimeZone.UTC);
        assertEquals(chrono1.hashCode(), chrono2.hashCode());
    }

    @Test
    public void testToString() {
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);
        assertNotNull(chrono.toString());
        assertTrue(chrono.toString().contains("GJChronology"));
    }

    @Test
    public void testGetDateTimeMillis() {
        long millis = chronology.getDateTimeMillis(2000, 1, 1, 0);
        assertTrue(millis > 0);
    }

    @Test
    public void testGetDateTimeMillisNonExistentDate() {
        try {
            chronology.getDateTimeMillis(1582, 10, 15, 0);
            fail("Should throw IllegalArgumentException for non-existent date");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetDateTimeMillisJulianDate() {
        long millis = chronology.getDateTimeMillis(1500, 2, 29, 0);
        assertTrue(millis > 0);
    }

    @Test
    public void testGetDateTimeMillisFiveParams() {
        try {
            long millis = chronology.getDateTimeMillis(2000, 1, 1, 0, 0, 0, 0);
            assertTrue(millis > 0);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testGetDifference() {
        long instant1 = chronology.getDateTimeMillis(2000, 1, 1, 0);
        long instant2 = chronology.getDateTimeMillis(1999, 1, 1, 0);
        assertTrue(chronology.getDifference(instant1, instant2) > 0);
        assertEquals(0, chronology.getDifference(instant1, instant1));
    }

    @Test
    public void testGetDifferenceAsLong() {
        long instant1 = chronology.getDateTimeMillis(2000, 1, 1, 0);
        long instant2 = chronology.getDateTimeMillis(1999, 1, 1, 0);
        assertTrue(chronology.getDifferenceAsLong(instant1, instant2) > 0);
        assertEquals(0L, chronology.getDifferenceAsLong(instant1, instant1));
    }

    @Test
    public void testGetDateTimeMillisDifferentCalendars() {
        long julianDate = chronology.getDateTimeMillis(1500, 2, 29, 0);
        long gregorianDate = chronology.getDateTimeMillis(2000, 2, 29, 0);
        assertTrue(julianDate != gregorianDate);
    }

    @Test
    public void testGetDateTimeMillisCutoverBoundary() {
        chronology = GJChronology.getInstance(DateTimeZone.UTC, new Instant(-12219292800000L));
        long millis = chronology.getDateTimeMillis(1582, 10, 4, 0);
        assertTrue(millis > 0);
        try {
            chronology.getDateTimeMillis(1582, 10, 10, 0);
            fail("Should throw IllegalArgumentException for non-existent date");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}