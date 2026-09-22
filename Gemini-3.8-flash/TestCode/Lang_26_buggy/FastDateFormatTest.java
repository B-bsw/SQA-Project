package org.apache.commons.lang3.time;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

public class FastDateFormatTest {

    @Test
    public void getInstance_givenNoArgs_shouldReturnDefaultInstance() {
        FastDateFormat fdf1 = FastDateFormat.getInstance();
        FastDateFormat fdf2 = FastDateFormat.getInstance();
        Assert.assertNotNull(fdf1);
        Assert.assertSame(fdf1, fdf2);
        Assert.assertNotNull(fdf1.getPattern());
    }

    @Test
    public void getInstance_givenPattern_shouldReturnCachedInstance() {
        String pattern = "yyyy-MM-dd";
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern);
        Assert.assertNotNull(fdf1);
        Assert.assertSame(fdf1, fdf2);
        Assert.assertEquals(pattern, fdf1.getPattern());
        Assert.assertFalse(fdf1.getTimeZoneOverridesCalendar());
    }

    @Test
    public void getInstance_givenPatternAndTimeZone_shouldReturnCachedInstance() {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern, tz);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern, tz);
        Assert.assertNotNull(fdf1);
        Assert.assertSame(fdf1, fdf2);
        Assert.assertEquals(tz, fdf1.getTimeZone());
        Assert.assertTrue(fdf1.getTimeZoneOverridesCalendar());
    }

    @Test
    public void getInstance_givenPatternAndLocale_shouldReturnCachedInstance() {
        String pattern = "yyyy-MMMM-dd";
        Locale locale = Locale.GERMANY;
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern, locale);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern, locale);
        Assert.assertNotNull(fdf1);
        Assert.assertSame(fdf1, fdf2);
        Assert.assertEquals(locale, fdf1.getLocale());
    }

    @Test
    public void getInstance_givenPatternTimeZoneAndLocale_shouldReturnCachedInstance() {
        String pattern = "yyyy/MM/dd";
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern, tz, locale);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern, tz, locale);
        Assert.assertNotNull(fdf1);
        Assert.assertSame(fdf1, fdf2);
        Assert.assertEquals(pattern, fdf1.getPattern());
        Assert.assertEquals(tz, fdf1.getTimeZone());
        Assert.assertEquals(locale, fdf1.getLocale());
        Assert.assertTrue(fdf1.getTimeZoneOverridesCalendar());
    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_givenNullPattern_shouldThrowIllegalArgumentException() {
        new FastDateFormat(null, TimeZone.getDefault(), Locale.getDefault());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getInstance_givenIllegalPatternChar_shouldThrowIllegalArgumentException() {
        FastDateFormat.getInstance("yyyy-MM-dd X");
    }

    @Test
    public void getDateInstance_givenValidStyles_shouldReturnValidInstances() {
        FastDateFormat fdfShort = FastDateFormat.getDateInstance(FastDateFormat.SHORT);
        FastDateFormat fdfMedium = FastDateFormat.getDateInstance(FastDateFormat.MEDIUM);
        FastDateFormat fdfLong = FastDateFormat.getDateInstance(FastDateFormat.LONG);
        FastDateFormat fdfFull = FastDateFormat.getDateInstance(FastDateFormat.FULL);

        Assert.assertNotNull(fdfShort);
        Assert.assertNotNull(fdfMedium);
        Assert.assertNotNull(fdfLong);
        Assert.assertNotNull(fdfFull);

        FastDateFormat fdfLocale = FastDateFormat.getDateInstance(FastDateFormat.SHORT, Locale.FRANCE);
        Assert.assertEquals(Locale.FRANCE, fdfLocale.getLocale());

        TimeZone tz = TimeZone.getTimeZone("GMT+2");
        FastDateFormat fdfTz = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz);
        Assert.assertEquals(tz, fdfTz.getTimeZone());

        FastDateFormat fdfBoth = FastDateFormat.getDateInstance(FastDateFormat.SHORT, tz, Locale.ITALY);
        Assert.assertEquals(tz, fdfBoth.getTimeZone());
        Assert.assertEquals(Locale.ITALY, fdfBoth.getLocale());
    }

    @Test
    public void getTimeInstance_givenValidStyles_shouldReturnValidInstances() {
        FastDateFormat fdfShort = FastDateFormat.getTimeInstance(FastDateFormat.SHORT);
        FastDateFormat fdfMedium = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM);
        FastDateFormat fdfLong = FastDateFormat.getTimeInstance(FastDateFormat.LONG);
        FastDateFormat fdfFull = FastDateFormat.getTimeInstance(FastDateFormat.FULL);

        Assert.assertNotNull(fdfShort);
        Assert.assertNotNull(fdfMedium);
        Assert.assertNotNull(fdfLong);
        Assert.assertNotNull(fdfFull);

        FastDateFormat fdfLocale = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, Locale.GERMANY);
        Assert.assertEquals(Locale.GERMANY, fdfLocale.getLocale());

        TimeZone tz = TimeZone.getTimeZone("GMT-5");
        FastDateFormat fdfTz = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz);
        Assert.assertEquals(tz, fdfTz.getTimeZone());

        FastDateFormat fdfBoth = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz, Locale.GERMANY);
        Assert.assertEquals(tz, fdfBoth.getTimeZone());
        Assert.assertEquals(Locale.GERMANY, fdfBoth.getLocale());

        FastDateFormat fdfNullLocale = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, tz, null);
        Assert.assertEquals(Locale.getDefault(), fdfNullLocale.getLocale());
    }

    @Test
    public void getDateTimeInstance_givenValidStyles_shouldReturnValidInstances() {
        FastDateFormat fdf1 = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        Assert.assertNotNull(fdf1);

        FastDateFormat fdfLocale = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.UK);
        Assert.assertEquals(Locale.UK, fdfLocale.getLocale());

        TimeZone tz = TimeZone.getTimeZone("UTC");
        FastDateFormat fdfTz = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, tz);
        Assert.assertEquals(tz, fdfTz.getTimeZone());

        FastDateFormat fdfBoth = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, tz, Locale.CANADA);
        Assert.assertEquals(tz, fdfBoth.getTimeZone());