package org.joda.time.chrono;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.Partial;
import org.joda.time.YearMonth;
import org.junit.Assert;
import org.junit.Test;

public class GJChronologyTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");

    @Test
    public void getInstanceUTC_givenNoArgs_shouldReturnUtcInstance() {
        // Arrange & Act
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.UTC, chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_givenNoArgs_shouldReturnDefaultZoneInstance() {
        // Arrange
        DateTimeZone defaultZone = DateTimeZone.getDefault();

        // Act
        GJChronology chrono = GJChronology.getInstance();

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(defaultZone, chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_givenZone_shouldReturnInstanceForZone() {
        // Arrange & Act
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(PARIS, chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void getInstance_givenZoneAndCutover_shouldReturnConfiguredInstance() {
        // Arrange
        Instant cutover = new Instant(0L);

        // Act
        GJChronology chrono = GJChronology.getInstance(LONDON, cutover);

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(LONDON, chrono.getZone());
        Assert.assertEquals(cutover, chrono.getGregorianCutover());
        Assert.assertEquals(4, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_givenNullZoneAndNullCutover_shouldUseDefaults() {
        // Arrange & Act
        GJChronology chrono = GJChronology.getInstance(null, (Instant) null, 4);

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(DateTimeZone.getDefault(), chrono.getZone());
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void getInstance_givenCutoverMillisMatchesDefault_shouldConvertProperly() {
        // Arrange
        long defaultCutoverMillis = GJChronology.DEFAULT_CUTOVER.getMillis();

        // Act
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, defaultCutoverMillis, 4);

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(GJChronology.DEFAULT_CUTOVER, chrono.getGregorianCutover());
    }

    @Test
    public void getInstance_givenCustomCutoverMillis_shouldStoreSpecifiedCutover() {
        // Arrange
        long customCutoverMillis = 10000000000L;

        // Act
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC, customCutoverMillis, 5);

        // Assert
        Assert.assertNotNull(chrono);
        Assert.assertEquals(new Instant(customCutoverMillis), chrono.getGregorianCutover());
        Assert.assertEquals(5, chrono.getMinimumDaysInFirstWeek());
    }

    @Test
    public void getInstance_givenSameParametersRepeatedly_shouldReturnCachedInstance() {
        // Arrange & Act
        GJChronology chrono1 = GJChronology.getInstance(PARIS, new Instant(12345678L), 3);
        GJChronology chrono2 = GJChronology.getInstance(PARIS, new Instant(12345678L), 3);

        // Assert
        Assert.assertSame(chrono1, chrono2);
    }

    @Test
    public void getInstance_givenDifferentParameters_shouldNotReturnCachedInstance() {
        // Arrange & Act
        GJChronology chrono1 = GJChronology.getInstance(PARIS, new Instant(12345678L), 3);
        GJChronology chrono2 = GJChronology.getInstance(PARIS, new Instant(12345678L), 4);
        GJChronology chrono3 = GJChronology.getInstance(PARIS, new Instant(87654321L), 3);

        // Assert
        Assert.assertNotSame(chrono1, chrono2);
        Assert.assertNotSame(chrono1, chrono3);
    }

    @Test
    public void getZone_givenUtcInstance_shouldReturnUtc() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act
        DateTimeZone zone = chrono.getZone();

        // Assert
        Assert.assertEquals(DateTimeZone.UTC, zone);
    }

    @Test
    public void withUTC_givenZonedInstance_shouldReturnUtcInstance() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Act
        Chronology utcChrono = chrono.withUTC();

        // Assert
        Assert.assertEquals(DateTimeZone.UTC, utcChrono.getZone());
    }

    @Test
    public void withZone_givenNullZone_shouldReturnDefaultZoneInstance() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(DateTimeZone.UTC);

        // Act
        Chronology zoned = chrono.withZone(null);

        // Assert
        Assert.assertEquals(DateTimeZone.getDefault(), zoned.getZone());
    }

    @Test
    public void withZone_givenSameZone_shouldReturnSameInstance() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Act
        Chronology same = chrono.withZone(PARIS);

        // Assert
        Assert.assertSame(chrono, same);
    }

    @Test
    public void withZone_givenDifferentZone_shouldReturnNewZonedInstance() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Act
        Chronology london = chrono.withZone(LONDON);

        // Assert
        Assert.assertEquals(LONDON, london.getZone());
    }

    @Test
    public void getDateTimeMillis_givenFourArgsGregorianDate_shouldCalculateMillis() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act: 2000-01-01 00:00:00.000
        long millis = chrono.getDateTimeMillis(2000, 1, 1, 0);

        // Assert
        Assert.assertEquals(946684800000L, millis);
    }

    @Test
    public void getDateTimeMillis_givenFourArgsJulianDate_shouldCalculateMillis() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act: Year 1000-01-01 is prior to 1582 cutover
        long millis = chrono.getDateTimeMillis(1000, 1, 1, 1234);

        // Assert
        long expected = JulianChronology.getInstanceUTC().getDateTimeMillis(1000, 1, 1, 1234);
        Assert.assertEquals(expected, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDateTimeMillis_givenFourArgsNonExistentCutoverDate_shouldThrowException() {
        // Arrange: 1582-10-05 was dropped by the Gregorian reform
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act
        chrono.getDateTimeMillis(1582, 10, 5, 0);
    }

    @Test
    public void getDateTimeMillis_givenFourArgsWithBase_shouldDelegateToBase() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Act
        long millis = chrono.getDateTimeMillis(2020, 6, 15, 500);

        // Assert
        Assert.assertTrue(millis != 0L);
    }

    @Test
    public void getDateTimeMillis_givenSevenArgsGregorianDate_shouldCalculateMillis() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act
        long millis = chrono.getDateTimeMillis(2015, 12, 31, 23, 59, 59, 999);

        // Assert
        Assert.assertEquals(1451606399999L, millis);
    }

    @Test
    public void getDateTimeMillis_givenSevenArgsWithBase_shouldDelegateToBase() {
        // Arrange
        GJChronology chrono = GJChronology.getInstance(PARIS);

        // Act
        long millis = chrono.getDateTimeMillis(2015, 12, 31, 23, 59, 59, 999);

        // Assert
        Assert.assertTrue(millis != 0L);
    }

    @Test
    public void getDateTimeMillis_givenSevenArgsJulianDate_shouldCalculateMillis() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act
        long millis = chrono.getDateTimeMillis(1500, 5, 10, 10, 20, 30, 40);

        // Assert
        long expected = JulianChronology.getInstanceUTC().getDateTimeMillis(1500, 5, 10, 10, 20, 30, 40);
        Assert.assertEquals(expected, millis);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getDateTimeMillis_givenSevenArgsNonExistentCutoverDate_shouldThrowException() {
        // Arrange
        GJChronology chrono = GJChronology.getInstanceUTC();

        // Act: 1582-10-10 was omitted
        chrono.getDateTimeMillis(1582, 10, 10, 12, 0, 0, 0);
    }

    @Test
    public void getDateTimeMillis_givenSevenArgsJulianLeapYearFeb29BeforeCutover_shouldSucceed() {
        //