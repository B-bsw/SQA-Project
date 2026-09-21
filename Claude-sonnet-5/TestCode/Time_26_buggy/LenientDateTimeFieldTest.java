package org.joda.time.field;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Test;

public class LenientDateTimeFieldTest {

    // ---------- getInstance tests ----------

    @Test
    public void testGetInstance_nullField() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField result = LenientDateTimeField.getInstance(null, chrono);
        assertNull(result);
    }

    @Test
    public void testGetInstance_strictField_unwraps() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        StrictDateTimeField strict = new StrictDateTimeField(dom);

        DateTimeField result = LenientDateTimeField.getInstance(strict, chrono);

        assertNotNull(result);
        assertTrue(result instanceof LenientDateTimeField);
        assertTrue(result.isLenient());
        assertEquals(dom.getType(), result.getType());
    }

    @Test
    public void testGetInstance_alreadyLenient_returnsSame() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        // create a lenient field first
        DateTimeField lenientField = LenientDateTimeField.getInstance(dom, chrono);
        assertTrue(lenientField.isLenient());

        DateTimeField result = LenientDateTimeField.getInstance(lenientField, chrono);
        assertSame(lenientField, result);
    }

    @Test
    public void testGetInstance_normalField_createsNewLenient() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        // dom is strict by default (not lenient)
        assertTrue(!dom.isLenient());

        DateTimeField result = LenientDateTimeField.getInstance(dom, chrono);

        assertNotNull(result);
        assertTrue(result instanceof LenientDateTimeField);
        assertTrue(result.isLenient());
        assertEquals(dom.getType(), result.getType());
    }

    // ---------- isLenient tests ----------

    @Test
    public void testIsLenient_alwaysTrue() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        LenientDateTimeField lenient = new LenientDateTimeField(dom, chrono);
        assertTrue(lenient.isLenient());
    }

    // ---------- set tests ----------

    @Test
    public void testSet_normalValueWithinBounds() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        LenientDateTimeField lenient = new LenientDateTimeField(dom, chrono);

        long instant = new DateTime(2004, 2, 15, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 20);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(20, resultDt.getDayOfMonth());
        assertEquals(2, resultDt.getMonthOfYear());
        assertEquals(2004, resultDt.getYear());
    }

    @Test
    public void testSet_outOfBounds_rollsForward() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        LenientDateTimeField lenient = new LenientDateTimeField(dom, chrono);

        // Feb 2004 is a leap year, so Feb has 29 days. Setting day to 30 should roll to March 1.
        long instant = new DateTime(2004, 2, 29, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 30);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(3, resultDt.getMonthOfYear());
        assertEquals(1, resultDt.getDayOfMonth());
        assertEquals(2004, resultDt.getYear());
    }

    @Test
    public void testSet_outOfBounds_rollsBackward() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        LenientDateTimeField lenient = new LenientDateTimeField(dom, chrono);

        // Setting day of month to 0 for March 1, 2004 should roll back to Feb 29, 2004 (leap year)
        long instant = new DateTime(2004, 3, 1, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 0);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(2, resultDt.getMonthOfYear());
        assertEquals(29, resultDt.getDayOfMonth());
        assertEquals(2004, resultDt.getYear());
    }

    @Test
    public void testSet_boundaryValue_sameAsCurrent() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        LenientDateTimeField lenient = new LenientDateTimeField(dom, chrono);

        long instant = new DateTime(2004, 2, 15, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 15);

        assertEquals(instant, result);
    }

    @Test
    public void testSet_withTimeZoneOffset() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        Chronology chronoZone = ISOChronology.getInstance(zone);
        DateTimeField domZone = chronoZone.dayOfMonth();
        LenientDateTimeField lenientZone = new LenientDateTimeField(domZone, chronoZone);

        long instant = new DateTime(2004, 2, 15, 10, 0, 0, 0, chronoZone).getMillis();
        long result = lenientZone.set(instant, 20);

        DateTime resultDt = new DateTime(result, chronoZone);
        assertEquals(20, resultDt.getDayOfMonth());
        assertEquals(2, resultDt.getMonthOfYear());
        assertEquals(2004, resultDt.getYear());
    }

    @Test
    public void testSet_multipleFieldRollover_monthOfYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField moy = chrono.monthOfYear();
        LenientDateTimeField lenient = new LenientDateTimeField(moy, chrono);

        // Setting month of year to 13 for a date in Nov 2004 should roll into next year
        long instant = new DateTime(2004, 11, 15, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 13);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(2005, resultDt.getYear());
        assertEquals(1, resultDt.getMonthOfYear());
        assertEquals(15, resultDt.getDayOfMonth());
    }

    @Test
    public void testSet_negativeMultipleFieldRollover_monthOfYear() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField moy = chrono.monthOfYear();
        LenientDateTimeField lenient = new LenientDateTimeField(moy, chrono);

        // Setting month of year to 0 for a date in Jan 2004 should roll into previous year (month 12)
        long instant = new DateTime(2004, 1, 15, 0, 0, 0, 0, chrono).getMillis();
        long result = lenient.set(instant, 0);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(2003, resultDt.getYear());
        assertEquals(12, resultDt.getMonthOfYear());
        assertEquals(15, resultDt.getDayOfMonth());
    }

    // ---------- getInstance combined with set ----------

    @Test
    public void testGetInstance_thenSet_behavesLenient() {
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField dom = chrono.dayOfMonth();
        DateTimeField lenientField = LenientDateTimeField.getInstance(dom, chrono);

        long instant = new DateTime(2004, 2, 29, 0, 0, 0, 0, chrono).getMillis();
        long result = lenientField.set(instant, 30);

        DateTime resultDt = new DateTime(result, chrono);
        assertEquals(3, resultDt.getMonthOfYear());
        assertEquals(1, resultDt.getDayOfMonth());
    }
}