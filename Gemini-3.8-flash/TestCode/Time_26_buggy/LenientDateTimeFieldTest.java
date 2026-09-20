package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.junit.Assert;
import org.junit.Test;

/**
 * Complete Unit Test Suite for LenientDateTimeField.
 */
public class LenientDateTimeFieldTest {

    @Test
    public void getInstance_givenNullField_shouldReturnNull() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();

        // Act
        DateTimeField result = LenientDateTimeField.getInstance(null, chrono);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void getInstance_givenAlreadyLenientField_shouldReturnSameInstance() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.dayOfMonth();
        DateTimeField lenientField = LenientDateTimeField.getInstance(rawField, chrono);

        // Act
        DateTimeField result = LenientDateTimeField.getInstance(lenientField, chrono);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertSame(lenientField, result);
    }

    @Test
    public void getInstance_givenStrictField_shouldUnwrapAndReturnLenient() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.dayOfMonth();
        DateTimeField strictField = StrictDateTimeField.getInstance(rawField);

        // Act
        DateTimeField lenientField = LenientDateTimeField.getInstance(strictField, chrono);

        // Assert
        Assert.assertNotNull(lenientField);
        Assert.assertTrue(lenientField.isLenient());
        Assert.assertTrue(lenientField instanceof LenientDateTimeField);
        Assert.assertEquals(rawField.getType(), lenientField.getType());
    }

    @Test
    public void getInstance_givenStrictFieldWrappingLenient_shouldUnwrapAndReturnOriginalLenient() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.dayOfMonth();
        DateTimeField lenientField = LenientDateTimeField.getInstance(rawField, chrono);
        DateTimeField strictField = StrictDateTimeField.getInstance(lenientField);

        // Act
        DateTimeField result = LenientDateTimeField.getInstance(strictField, chrono);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertSame(lenientField, result);
    }

    @Test
    public void getInstance_givenStandardField_shouldReturnLenientInstance() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.dayOfMonth();

        // Act
        DateTimeField result = LenientDateTimeField.getInstance(rawField, chrono);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof LenientDateTimeField);
        Assert.assertTrue(result.isLenient());
    }

    @Test
    public void isLenient_whenCalled_shouldReturnTrue() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField rawField = chrono.hourOfDay();
        DateTimeField lenientField = new LenientDateTimeField(rawField, chrono);

        // Act
        boolean lenient = lenientField.isLenient();

        // Assert
        Assert.assertTrue(lenient);
    }

    @Test
    public void set_givenValueWithinBounds_shouldSetCorrectly() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientDay = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        long instant = chrono.getDateTimeMillis(2023, 5, 10, 12, 0, 0, 0);

        // Act
        long result = lenientDay.set(instant, 25);

        // Assert
        long expected = chrono.getDateTimeMillis(2023, 5, 25, 12, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenValueBeyondUpperBounds_shouldRollForwardToNextMonth() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientDay = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        // 2023-05-10: May has 31 days. Setting day to 35 = +25 days -> 2023-06-04
        long instant = chrono.getDateTimeMillis(2023, 5, 10, 12, 0, 0, 0);

        // Act
        long result = lenientDay.set(instant, 35);

        // Assert
        long expected = chrono.getDateTimeMillis(2023, 6, 4, 12, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenZeroValue_shouldRollBackToPreviousMonth() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientDay = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        // 2023-05-10: difference = 0 - 10 = -10 days -> 2023-04-30
        long instant = chrono.getDateTimeMillis(2023, 5, 10, 12, 0, 0, 0);

        // Act
        long result = lenientDay.set(instant, 0);

        // Assert
        long expected = chrono.getDateTimeMillis(2023, 4, 30, 12, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenNegativeValue_shouldRollBackAppropriately() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientDay = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        // 2023-05-10: difference = -5 - 10 = -15 days -> 2023-04-25
        long instant = chrono.getDateTimeMillis(2023, 5, 10, 12, 0, 0, 0);

        // Act
        long result = lenientDay.set(instant, -5);

        // Assert
        long expected = chrono.getDateTimeMillis(2023, 4, 25, 12, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenMonthBeyond12_shouldRollForwardToNextYear() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientMonth = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);
        // 2023-05-15: set month to 15 -> difference = 15 - 5 = +10 months -> 2024-03-15
        long instant = chrono.getDateTimeMillis(2023, 5, 15, 0, 0, 0, 0);

        // Act
        long result = lenientMonth.set(instant, 15);

        // Assert
        long expected = chrono.getDateTimeMillis(2024, 3, 15, 0, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenMonthLessThan1_shouldRollBackToPreviousYear() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientMonth = LenientDateTimeField.getInstance(chrono.monthOfYear(), chrono);
        // 2023-05-15: set month to 0 -> difference = 0 - 5 = -5 months -> 2022-12-15
        long instant = chrono.getDateTimeMillis(2023, 5, 15, 0, 0, 0, 0);

        // Act
        long result = lenientMonth.set(instant, 0);

        // Assert
        long expected = chrono.getDateTimeMillis(2022, 12, 15, 0, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenNonUtcTimeZone_shouldAccountForZoneOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(7);
        Chronology zonedChrono = ISOChronology.getInstance(zone);
        DateTimeField lenientDay = LenientDateTimeField.getInstance(zonedChrono.dayOfMonth(), zonedChrono);

        long instant = zonedChrono.getDateTimeMillis(2023, 8, 20, 14, 30, 0, 0);

        // Act
        // setting day to 35: August has 31 days. 35 - 20 = +15 days -> 2023-09-04 14:30:00+07:00
        long result = lenientDay.set(instant, 35);

        // Assert
        long expected = zonedChrono.getDateTimeMillis(2023, 9, 4, 14, 30, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenNegativeTimeZoneOffset_shouldAccountForZoneOffset() {
        // Arrange
        DateTimeZone zone = DateTimeZone.forOffsetHours(-5);
        Chronology zonedChrono = ISOChronology.getInstance(zone);
        DateTimeField lenientHour = LenientDateTimeField.getInstance(zonedChrono.hourOfDay(), zonedChrono);

        long instant = zonedChrono.getDateTimeMillis(2023, 3, 15, 20, 0, 0, 0);

        // Act
        // setting hour to 27: 27 - 20 = +7 hours -> 2023-03-16 03:00:00-05:00
        long result = lenientHour.set(instant, 27);

        // Assert
        long expected = zonedChrono.getDateTimeMillis(2023, 3, 16, 3, 0, 0, 0);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void set_givenSameValueAsCurrent_shouldReturnIdenticalInstant() {
        // Arrange
        Chronology chrono = ISOChronology.getInstanceUTC();
        DateTimeField lenientDay = LenientDateTimeField.getInstance(chrono.dayOfMonth(), chrono);
        long instant = chrono.getDateTimeMillis(2023, 6, 15, 8, 30, 0, 0);

        // Act
        long result = lenientDay.set(instant, 15);

        // Assert
        Assert.assertEquals(instant, result);
    }
}