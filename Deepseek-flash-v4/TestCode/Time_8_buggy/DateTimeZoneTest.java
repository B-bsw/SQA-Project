package org.joda.time;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Collections;
import java.util.Set;
import java.util.TimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;

public class DateTimeZoneTest {

    private static Provider originalProvider;
    private static DateTimeZone originalDefault;
    private static NameProvider originalNameProvider;

    @BeforeClass
    public static void saveOriginals() {
        originalProvider = DateTimeZone.getProvider();
        originalDefault = DateTimeZone.getDefault();
        originalNameProvider = DateTimeZone.getNameProvider();
    }

    @After
    public void restore() {
        try { DateTimeZone.setProvider(originalProvider); } catch (SecurityException e) { }
        try { DateTimeZone.setDefault(originalDefault); } catch (SecurityException e) { }
        try { DateTimeZone.setNameProvider(originalNameProvider); } catch (SecurityException e) { }
    }

    @Test
    public void testForID_NullReturnsDefault() {
        assertNotNull(DateTimeZone.forID(null));
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forID(null));
    }

    @Test
    public void testForID_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_OffsetString() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("+00:00"));
        assertEquals(19800000, DateTimeZone.forID("+05:30").getOffset(0L));
        assertEquals(-3600000, DateTimeZone.forID("-01:00").getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForID_InvalidThrows() {
        DateTimeZone.forID("InvalidID");
    }

    @Test
    public void testForOffsetHoursMinutes_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_Normal() {
        assertEquals(5400000, DateTimeZone.forOffsetHoursMinutes(1, 30).getOffset(0L));
    }

    @Test
    public void testForOffsetHoursMinutes_NegativeHours() {
        assertEquals(-5400000, DateTimeZone.forOffsetHoursMinutes(-1, 30).getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_HoursOutOfRange() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutes_MinutesOutOfRange() {
        DateTimeZone.forOffsetHoursMinutes(0, 60);
    }

    @Test
    public void testForOffsetMillis_Zero() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_Boundary() {
        int max = (86400 * 1000) - 1;
        assertEquals(max, DateTimeZone.forOffsetMillis(max).getOffset(0L));
        assertEquals(-max, DateTimeZone.forOffsetMillis(-max).getOffset(0L));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetMillis_OutOfRange() {
        DateTimeZone.forOffsetMillis(86400 * 1000);
    }

    @Test
    public void testForTimeZone_Null() {
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.forTimeZone(null));
    }

    @Test
    public void testForTimeZone_UTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testForTimeZone_WithMapping() {
        DateTimeZone result = DateTimeZone.forTimeZone(TimeZone.getTimeZone("EST"));
        assertNotNull(result);
        assertEquals("America/New_York", result.getID());
    }

    @Test
    public void testForTimeZone_GMTString() {
        DateTimeZone result = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+05:30"));
        assertNotNull(result);
        assertEquals(19800000, result.getOffset(0L));
    }

    @Test
    public void testConvertUTCToLocal_Normal() {
        assertEquals(5 * 3600000L, DateTimeZone.forOffsetHours(5).convertUTCToLocal(0L));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertUTCToLocal_Overflow() {
        DateTimeZone.forOffsetMillis((86400 * 1000) - 1).convertUTCToLocal(Long.MAX_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_Normal() {
        assertEquals(-5 * 3600000L, DateTimeZone.forOffsetHours(5).convertLocalToUTC(0L, false));
    }

    @Test(expected = ArithmeticException.class)
    public void testConvertLocalToUTC_Overflow() {
        DateTimeZone.forOffsetHours(5).convertLocalToUTC(Long.MIN_VALUE, false);
    }

    @Test
    public void testAdjustOffset_FixedZone() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(5);
        long instant = 100000L;
        assertEquals(instant, zone.adjustOffset(instant, true));
        assertEquals(instant, zone.adjustOffset(instant, false));
    }

    @Test
    public void testGetOffsetFromLocal_FixedZone() {
        assertEquals(5 * 3600000, DateTimeZone.forOffsetHours(5).getOffsetFromLocal(0L));
    }

    @Test
    public void testIsLocalDateTimeGap_FixedZone() {
        assertFalse(DateTimeZone.forOffsetHours(5).isLocalDateTimeGap(new LocalDateTime(2020, 1, 1, 0, 0)));
    }

    @Test
    public void testSetDefault_Valid() {
        DateTimeZone testZone = DateTimeZone.forOffsetHours(2);
        DateTimeZone.setDefault(testZone);
        assertSame(testZone, DateTimeZone.getDefault());
        DateTimeZone.setDefault(originalDefault);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDefault_NullThrows() {
        DateTimeZone.setDefault(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProvider_NoUTC() {
        Provider noUTC = new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return Collections.singleton("Foo"); }
        };
        DateTimeZone.setProvider(noUTC);
    }

    @Test
    public void testSetProvider_Valid() {
        DateTimeZone.setProvider(originalProvider);
    }

    @Test
    public void testGetDefault_NotNull() {
        assertNotNull(DateTimeZone.getDefault());
    }

    @Test
    public void testGetAvailableIDs_ContainsUTC() {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testGetNameProvider_NotNull() {
        assertNotNull(DateTimeZone.getNameProvider());
    }
}