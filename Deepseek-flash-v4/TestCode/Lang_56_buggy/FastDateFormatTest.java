package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatTest {
    private FastDateFormat format;
    private static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    private static final Locale US = Locale.US;
    private static final Date DATE = new Date(86400000L); // 1970-01-02 00:00:00 UTC

    @Before
    public void setUp() {
        format = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", UTC, US);
    }

    @After
    public void tearDown() {
        format = null;
    }

    @Test
    public void testGetInstance_NoArgs() {
        FastDateFormat f = FastDateFormat.getInstance();
        assertNotNull(f);
        assertEquals(f.getPattern(), new java.text.SimpleDateFormat().toPattern());
        assertFalse(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_NullPattern() {
        try {
            FastDateFormat.getInstance(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("The pattern must not be null", e.getMessage());
        }
    }

    @Test
    public void testGetInstance_InvalidPattern() {
        try {
            FastDateFormat.getInstance("Invalid[Pattern");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetDateInstance_InvalidStyle() {
        try {
            FastDateFormat.getDateInstance(1000);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetTimeInstance_NullTimeZone() {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, (TimeZone) null, US);
        assertNotNull(f);
        assertEquals(TimeZone.getDefault(), f.getTimeZone());
        assertFalse(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testGetInstance_WithTimeZoneAndLocale() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy", UTC, US);
        assertSame(UTC, f.getTimeZone());
        assertEquals(US, f.getLocale());
        assertTrue(f.getTimeZoneOverridesCalendar());
    }

    @Test
    public void testFormat_Date() {
        Date date = new Date(86400000L);
        assertEquals("1970-01-02 00:00:00", format.format(date));
    }

    @Test
    public void testFormat_Calendar_WithTimeZoneOverride() {
        FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss", UTC, US);
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT+8"));
        cal.setTime(new Date(86400000L));
        assertEquals("1970-01-02 00:00:00", f.format(cal));
    }

    @Test
    public void testFormat_Long() {
        assertEquals("1970-01-02 00:00:00", format.format(86400000L));
    }

    @Test
    public void testFormat_Object_Invalid() {
        try {
            format.format(new Object());
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Unknown class: " + Object.class, e.getMessage());
        }
    }

    @Test
    public void testFormat_Object_Date() {
        assertEquals("1970-01-02 00:00:00", format.format(new Date(86400000L))); 
    }

    @Test
    public void testFormat_Object_Calendar() {
        Calendar cal = Calendar.getInstance(UTC, US);
        cal.setTimeInMillis(86400000L);
        assertEquals("1970-01-02 00:00:00", format.format(cal));
    }

    @Test
    public void testFormat_Object_Long() {
        assertEquals("1970-01-02 00:00:00", format.format(Long.valueOf(86400000L)));
    }

    @Test
    public void testFormat_Null() {
        try {
            format.format((Date) null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testParseObject_ReturnsNull() {
        assertNull(format.parseObject("invalid", new ParsePosition(0)));
    }

    @Test
    public void testGetPattern() {
        assertEquals("yyyy-MM-dd HH:mm:ss", format.getPattern());
    }

    @Test
    public void testGetMaxLengthEstimate() {
        assertTrue(format.getMaxLengthEstimate() > 0);
    }

    @Test
    public void testEquals_SameObject() {
        assertTrue(format.equals(format));
    }

    @Test
    public void testEquals_Null() {
        assertFalse(format.equals(null));
    }

    @Test
    public void testEquals_DifferentClass() {
        assertFalse(format.equals(new Object()));
    }

    @Test
    public void testEquals_EqualPatterns() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        assertTrue(f1.equals(f2));
        assertEquals(f1.hashCode(), f2.hashCode());
    }

    @Test
    public void testEquals_DifferentLocale() {
        FastDateFormat f1 = FastDateFormat.getInstance("yyyy-MM-dd", UTC, US);
        FastDateFormat f2 = FastDateFormat.getInstance("yyyy-MM-dd", UTC, Locale.FRANCE);
        assertFalse(f1.equals(f2));
    }

    @Test
    public void testHashCode_Consistent() {
        int hash1 = format.hashCode();
        assertEquals(hash1, format.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("FastDateFormat[yyyy-MM-dd HH:mm:ss]", format.toString());
    }

    @Test
    public void testFormat_TimezoneNameRule_Forced() {
        FastDateFormat f = FastDateFormat.getInstance("z", TimeZone.getTimeZone("America/New_York"), US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(1970, Calendar.JANUARY, 1, 12, 0, 0);
        cal.set(Calendar.DST_OFFSET, 0);
        String result = f.format(cal);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testFormat_TimezoneNumberRule_Colon() {
        FastDateFormat f = FastDateFormat.getInstance("Z", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(1970, Calendar.JANUARY, 1, 12, 0, 0);
        String result = f.format(cal);
        assertNotNull(result);
        assertEquals("+0000", result);
    }

    @Test
    public void testFormat_TwoDigitYear() {
        FastDateFormat f = FastDateFormat.getInstance("yy", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1);
        assertEquals("24", f.format(cal));
    }

    @Test
    public void testFormat_TwoDigitMonth() {
        FastDateFormat f = FastDateFormat.getInstance("MM", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.OKT     // December (index 11)
        );
        assertEquals("12", f.format(cal));
    }

    @Test
    public void testFormat_TwelveHourField_Midnight() {
        FastDateFormat f = FastDateFormat.getInstance("h", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("12", f.format(cal));
    }

    @Test
    public void testFormat_TwentyFourHourField_Midnight() {
        FastDateFormat f = FastDateFormat.getInstance("H", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1, 0, 0, 0);
        assertEquals("0", f.format(cal));
    }

    @Test
    public void testFormat_UnpaddedNumberField_SmallValue() {
        FastDateFormat f = FastDateFormat.getInstance("d", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 5);
        assertEquals("5", f.format(cal));
    }

    @Test
    public void testFormat_UnpaddedNumberField_TwoDigits() {
        FastDateFormat f = FastDateFormat.getInstance("d", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 15);
        assertEquals("15", f.format(cal));
    }

    @Test
    public void testFormat_PaddedNumberField_SizeThree() {
        FastDateFormat f = FastDateFormat.getInstance("DDD", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1);
        assertEquals("001", f.format(cal));
    }

    @Test
    public void testFormat_PaddedNumberField_SizeTwo() {
        FastDateFormat f = FastDateFormat.getInstance("mm", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1, 0, 5, 0);
        assertEquals("05", f.format(cal));
    }

    @Test
    public void testFormat_NumberRule_LargeValue() {
        FastDateFormat f = FastDateFormat.getInstance("YYYY", UTC, US);
        Calendar cal = new GregorianCalendar(UTC, US);
        cal.set(2024, Calendar.JANUARY, 1);
        assertEquals("2024", f.format(cal));
    }

    @Test
    public void testFormat_SingleQuotedLiteral() {
        FastDateFormat f = FastDateFormat.getInstance("'T'", UTC, US);
        assertEquals("T", f.format(new Date(0)));
    }

    @Test
    public void testFormat_EscapedSingleQuote() {
        FastDateFormat f = FastDateFormat.getInstance("''", UTC, US);
        assertEquals("'", f.format(new Date(0)));
    }

    @Test
    public void testFormat_EmptyPattern() {
        FastDateFormat f = FastDateFormat.getInstance("", UTC, US);
        assertEquals("", f.format(new Date(0)));
    }

    @Test
    public void testGetDateInstance_WithTimeZoneAndLocale_Cache() {
        FastDateFormat f1 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, UTC, US);
        FastDateFormat f2 = FastDateFormat.getDateInstance(FastDateFormat.SHORT, UTC, US);
        assertSame(f1, f2);
    }

    @Test
    public void testGetTimeInstance_WithLocale_NullTimeZone() {
        FastDateFormat f = FastDateFormat.getTimeInstance(FastDateFormat.SHORT, US);
        assertNotNull(f.getTimeZone());
        assertEquals(US, f.getLocale());
    }
}