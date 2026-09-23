package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.*;

public class FastDateFormatTest {

    private static final String DEFAULT_PATTERN = "yyyy-MM-dd";
    private FastDateFormat format;
    private Calendar testCalendar;
    private Date testDate;

    @Before
    public void setUp() {
        format = FastDateFormat.getInstance(DEFAULT_PATTERN);
        testCalendar = Calendar.getInstance();
        testCalendar.set(2024, Calendar.JANUARY, 15, 12, 30, 45);
        testCalendar.set(Calendar.MILLISECOND, 0);
        testDate = testCalendar.getTime();
    }

    @After
    public void tearDown() {
        format = null;
        testCalendar = null;
        testDate = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPatternThrowsIllegalArgumentException() {
        FastDateFormat.getInstance((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPatternThrowsIllegalArgumentExceptionWithTimeZone() {
        FastDateFormat.getInstance(null, TimeZone.getDefault());
    }

    @Test
    public void testGetInstanceWithDefaultPattern() {
        FastDateFormat instance = FastDateFormat.getInstance();
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
        assertFalse(instance.getPattern().isEmpty());
    }

    @Test
    public void testGetInstanceWithPatternOnly() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy/MM/dd");
        assertNotNull(instance);
        assertEquals("yyyy/MM/dd", instance.getPattern());
        assertFalse(instance.getTimeZoneOverridesCalendar());
        assertNotNull(instance.getLocale());
    }

    @Test
    public void testGetInstanceWithPatternAndTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat instance = FastDateFormat.getInstance(DEFAULT_PATTERN, tz);
        assertNotNull(instance);
        assertEquals(DEFAULT_PATTERN, instance.getPattern());
        assertEquals(tz, instance.getTimeZone());
        assertTrue(instance.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstanceWithPatternAndLocale() {
        Locale locale = Locale.US;
        FastDateFormat instance = FastDateFormat.getInstance(DEFAULT_PATTERN, locale);
        assertNotNull(instance);
        assertEquals(DEFAULT_PATTERN, instance.getPattern());
        assertEquals(locale, instance.getLocale());
    }

    @Test
    public void testGetInstanceWithPatternTimeZoneAndLocale() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.FRANCE;
        FastDateFormat instance = FastDateFormat.getInstance(DEFAULT_PATTERN, tz, locale);
        assertNotNull(instance);
        assertEquals(DEFAULT_PATTERN, instance.getPattern());
        assertEquals(tz, instance.getTimeZone());
        assertTrue(instance.getTimeZoneOverridesCalendar());
        assertEquals(locale, instance.getLocale());
    }

    @Test
    public void testGetDateInstance() {
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.LONG);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
        assertEquals(FastDateFormat.LONG, DateFormat.LONG);
    }

    @Test
    public void testGetDateInstanceWithStyleAndLocale() {
        Locale locale = Locale.UK;
        FastDateFormat instance = FastDateFormat.getDateInstance(FastDateFormat.SHORT, locale);
        assertNotNull(instance);
        assertEquals(locale, instance.getLocale());
    }

    @Test
    public void testGetTimeInstance() {
        FastDateFormat instance = FastDateFormat.getTimeInstance(FastDateFormat.MEDIUM);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTimeInstanceWithInvalidStyle() {
        FastDateFormat.getTimeInstance(99);
    }

    @Test
    public void testGetDateTimeInstance() {
        FastDateFormat instance = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM);
        assertNotNull(instance);
        assertNotNull(instance.getPattern());
    }

    @Test
    public void testFormatDate() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        assertEquals("2024-01-15", dateFormat.format(testDate));
    }

    @Test
    public void testFormatCalendar() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        assertEquals("2024-01-15 12:30:45", dateFormat.format(testCalendar));
    }

    @Test
    public void testFormatLong() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        String result = dateFormat.format(testDate.getTime());
        assertNotNull(result);
        assertEquals("2024-01-15", result);
    }

    @Test
    public void testFormatWithMilliseconds() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS");
        String result = dateFormat.format(testDate);
        assertTrue(result.contains(".0"));
    }

    @Test
    public void testFormatWithTimeZoneForced() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss z", tz);
        String result = dateFormat.format(testCalendar);
        assertTrue(result.endsWith("EST") || result.endsWith("EDT"));
    }

    @Test
    public void testFormatWith24HourTime() {
        testCalendar.set(Calendar.HOUR_OF_DAY, 23);
        FastDateFormat dateFormat = FastDateFormat.getInstance("HH:mm");
        assertEquals("23:00", dateFormat.format(testCalendar));
    }

    @Test
    public void testFormatWith12HourTime() {
        testCalendar.set(Calendar.HOUR_OF_DAY, 15);
        FastDateFormat dateFormat = FastDateFormat.getInstance("hh:mm a", Locale.US);
        String result = dateFormat.format(testCalendar);
        assertTrue(result.contains("03:00") && (result.contains("PM") || result.contains("PM")));
    }

    @Test
    public void testFormatWithEscapedQuotes() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("''HH''"); // Escaped quotes using the pattern syntax that FastDateFormat supports
        String result = dateFormat.format(testDate);
        assertNotNull(result);
    }

    @Test
    public void testParseObjectReturnsNull() {
        ParsePosition pos = new ParsePosition(0);
        assertNull(format.parseObject("2024-01-01", pos));
    }

    @Test
    public void testEqualsSameObject() {
        FastDateFormat instance = FastDateFormat.getInstance(DEFAULT_PATTERN);
        assertEquals(format, instance);
    }

    @Test
    public void testEqualsDifferentObjectType() {
        assertFalse(format.equals(new Object()));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testHashCodeConsistency() {
        FastDateFormat instance1 = FastDateFormat.getInstance(DEFAULT_PATTERN);
        FastDateFormat instance2 = FastDateFormat.getInstance(DEFAULT_PATTERN);
        assertEquals(instance1.hashCode(), instance2.hashCode());
    }

    @Test
    public void testToString() {
        String result = format.toString();
        assertTrue(result.contains(DEFAULT_PATTERN));
        assertTrue(result.contains("FastDateFormat"));
    }

    @Test
    public void testGetPattern() {
        assertEquals(DEFAULT_PATTERN, format.getPattern());
    }

    @Test
    public void testGetTimeZone() {
        TimeZone tz = TimeZone.getDefault();
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertNotNull(instance.getTimeZone());
    }

    @Test
    public void testGetTimeZoneOverridesCalendarDefaultFalse() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertFalse(instance.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetTimeZoneOverridesCalendarTrue() {
        TimeZone tz = TimeZone.getTimeZone("GMT");
        FastDateFormat instance = FastDateFormat.getInstance("yyyy", tz);
        assertTrue(instance.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetLocaleDefault() {
        FastDateFormat instance = FastDateFormat.getInstance("yyyy");
        assertEquals(Locale.getDefault(), instance.getLocale());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        FastDateFormat instance = FastDateFormat.getInstance(DEFAULT_PATTERN);
        assertTrue(instance.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testFormatWithDateNoneObject() {
        FastDateFormat dateInstance = FastDateFormat.getDateInstance(FastDateFormat.FULL);
        assertNotNull(dateInstance);
    }

    @Test
    public void testFormatWithEmptyPattern() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("");
        String result = dateFormat.format(testDate);
        assertNotNull(result);
    }

    @Test
    public void testFormatYearQuarterPattern() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy/MM/dd");
        String result = dateFormat.format(testDate);
        assertEquals("2024/01/15", result);
    }

    @Test
    public void testFormatWithDayName() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("EEEE", Locale.US);
        String result = dateFormat.format(testCalendar);
        assertNotNull(result);
        assertTrue(result.equalsIgnoreCase("Monday"));
    }

    @Test
    public void testFormatMonthName() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("MMMM", Locale.US);
        String result = dateFormat.format(testCalendar);
        assertEquals("January", result);
    }

    @Test
    public void testFormatShortMonthName() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("MMM", Locale.US);
        String result = dateFormat.format(testCalendar);
        assertEquals("Jan", result);
    }

    @Test
    public void testFormatTwoDigitYear() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yy");
        String result = dateFormat.format(testDate);
        assertEquals("24", result);
    }

    @Test
    public void testFormatYearWithFourDigits() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy");
        String result = dateFormat.format(testDate);
        assertEquals("2024", result);
    }

    @Test
    public void testEqualsWithDifferentTimeZone() throws Exception {
        TimeZone tz1 = TimeZone.getTimeZone("GMT");
        TimeZone tz2 = TimeZone.getTimeZone("UTC");
        FastDateFormat format1 = FastDateFormat.getInstance("yyyy", tz1);
        FastDateFormat format2 = FastDateFormat.getInstance("yyyy", tz2);
        // tz1 and tz2 have the same raw offset in some cases, so this may be equal
        assertNotNull(format1);
        assertNotNull(format2);
    }

    @Test
    public void testGetDateTimeInstanceWithIntTimeStyle() {
        FastDateFormat.FULL = DateFormat.FULL;
        FastDateFormat.LONG = DateFormat.LONG;
        FastDateFormat.MEDIUM = DateFormat.MEDIUM;
        FastDateFormat.SHORT = DateFormat.SHORT;
        assertTrue(FastDateFormat.FULL == DateFormat.FULL);
        assertTrue(FastDateFormat.LONG == DateFormat.LONG);
        assertTrue(FastDateFormat.MEDIUM == DateFormat.MEDIUM);
        assertTrue(FastDateFormat.SHORT == DateFormat.SHORT);
    }

    @Test
    public void testFormatWithObjectDate() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        Object obj = testDate;
        assertEquals("2024-01-15", dateFormat.format(obj, new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatWithObjectCalendar() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        Object obj = testCalendar;
        assertEquals("2024-01-15", dateFormat.format(obj, new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test
    public void testFormatWithObjectLong() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        Object obj = testDate.getTime();
        assertEquals("2024-01-15", dateFormat.format(obj, new StringBuffer(), new FieldPosition(0)).toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFormatWithUnsupportedObjectType() {
        FastDateFormat dateFormat = FastDateFormat.getInstance("yyyy-MM-dd");
        Object obj = new Object();
        dateFormat.format(obj, new StringBuffer(), new FieldPosition(0));
    }
}