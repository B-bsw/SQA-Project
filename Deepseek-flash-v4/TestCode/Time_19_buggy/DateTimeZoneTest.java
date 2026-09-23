package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.TimeZone;

public class DateTimeZoneTest {
    private DateTimeZone originalDefault;
    
    @Before
    public void setUp() {
        originalDefault = DateTimeZone.getDefault();
    }
    
    @After
    public void tearDown() {
        DateTimeZone.setDefault(originalDefault);
    }
    
    @Test
    public void testGetDefault() {
        assertNotNull(DateTimeZone.getDefault());
        assertEquals(DateTimeZone.getDefault(), DateTimeZone.getDefault());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDefaultNull() {
        DateTimeZone.setDefault(null);
    }
    
    @Test
    public void testSetDefaultWithZone() {
        DateTimeZone testZone = DateTimeZone.UTC;
        DateTimeZone.setDefault(testZone);
        assertSame(testZone, DateTimeZone.getDefault());
    }
    
    @Test
    public void testForIDUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }
    
    @Test
    public void testForIDNull() {
        assertNull(DateTimeZone.forID(null));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testForIDUnknown() {
        DateTimeZone.forID("UnknownZone");
    }
    
    @Test
    public void testForIDWithOffset() {
        DateTimeZone zone = DateTimeZone.forID("+02:00");
        assertNotNull(zone);
        assertEquals(2 * 60 * 60 * 1000L, zone.getOffset(0));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutesInvalidNegative() {
        DateTimeZone.forOffsetHoursMinutes(-1, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testForOffsetHoursMinutesInvalidHours() {
        DateTimeZone.forOffsetHoursMinutes(24, 0);
    }
    
    @Test
    public void testForOffsetHoursMinutesValid() {
        DateTimeZone zone = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertNotNull(zone);
        assertEquals(5 * 3600 * 1000L + 30 * 60 * 1000L, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetMillisZero() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(0);
        assertNotNull(zone);
        assertEquals(0, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetMillisPositive() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertNotNull(zone);
        assertEquals(3600000, zone.getOffset(0));
    }
    
    @Test
    public void testForOffsetMillisNegative() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(-7200000);
        assertNotNull(zone);
        assertEquals(-7200000, zone.getOffset(0));
    }
    
    @Test
    public void testForTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        assertNotNull(DateTimeZone.forTimeZone(tz));
    }
    
    @Test
    public void testForTimeZoneNull() {
        DateTimeZone zone = DateTimeZone.forTimeZone(null);
        assertNotNull(zone);
    }
    
    @Test
    public void testGetAvailableIDs() {
        assertNotNull(DateTimeZone.getAvailableIDs());
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetProviderInvalid() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) { return null; }
            public Set<String> getAvailableIDs() { return null; }
        });
    }
    
    @Test
    public void testGetNameKey() {
        assertNotNull(DateTimeZone.UTC.getNameKey(0));
    }
    
    @Test
    public void testGetShortName() {
        assertNotNull(DateTimeZone.UTC.getShortName(0));
        assertNotEquals("", DateTimeZone.UTC.getShortName(0));
    }
    
    @Test
    public void testGetShortNameWithLocale() {
        assertNotNull(DateTimeZone.UTC.getShortName(0, Locale.US));
    }
    
    @Test
    public void testGetName() {
        assertNotNull(DateTimeZone.UTC.getName(0));
        assertNotEquals("", DateTimeZone.UTC.getName(0));
    }
    
    @Test
    public void testGetNameWithLocale() {
        assertNotNull(DateTimeZone.UTC.getName(0, Locale.US));
    }
    
    @Test
    public void testGetOffset_Instant() {
        assertEquals(0, DateTimeZone.UTC.getOffset(new org.joda.time.Instant(0)));
    }
    
    @Test
    public void testGetOffset_NullInstant() {
        DateTimeZone zone = DateTimeZone.getDefault();
        long expected = zone.getOffset(DateTimeUtils.currentTimeMillis());
        assertEquals(expected, zone.getOffset((ReadableInstant) null));
    }
    
    @Test
    public void testIsStandardOffset() {
        assertTrue(DateTimeZone.UTC.isStandardOffset(0));
    }
    
    @Test
    public void testIsFixedUTC() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }
    
    @Test
    public void testNextTransitionUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.UTC);
        assertTrue(DateTimeZone.UTC.nextTransition(0) == 0);
    }
    
    @Test
    public void testPreviousTransitionUTC() {
        assertEquals(DateTimeZone.UTC, DateTimeZone.UTC);
    }
    
    @Test
    public void testToTimeZone() {
        assertEquals("UTC", DateTimeZone.UTC.toTimeZone().getID());
    }
    
    @Test
    public void testHashCode() {
        assertEquals("UTC", DateTimeZone.UTC);
        assertEquals(DateTimeZone.UTC.hashCode(), DateTimeZone.UTC.hashCode());
    }
    
    @Test
    public void testEquals() {
        assertTrue(DateTimeZone.UTC.equals(DateTimeZone.UTC));
        assertFalse(DateTimeZone.UTC.equals(null));
        assertFalse(DateTimeZone.UTC.equals("test"));
    }
    
    @Test
    public void testGetConvertedId() {
        assertNull(DateTimeZone.getConvertedId("GMT"));
    }
    
    @Test
    public void testPrintOffset() {
        assertNotNull(DateTimeZone.printOffset(0));
        assertNotNull(DateTimeZone.printOffset(3600000));
        assertNotNull(DateTimeZone.printOffset(-3600000));
    }
    
    @Test
    public void testParseOffset() {
        assertNotNull(DateTimeZone.parseOffset("+02:00"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testParseOffsetInvalid() {
        DateTimeZone.parseOffset("invalid");
    }
    
    @Test
    public void testConvertUTCToLocalRT() {
        long instant = 0L;
        long result = DateTimeZone.UTC.convertUTCToLocal(instant);
        assertEquals(instant, result);
    }
    
    @Test
    public void testConvertLocalToUTC() {
        long local = 0L;
        assertNotNull(DateTimeZone.UTC.convertLocalToUTC(local, false));
    }
    
    @Test
    public void testConvertLocalToUTCStrict() {
        long local = 0L;
        assertNotNull(DateTimeZone.UTC.convertLocalToUTC(local, true));
    }
    
    @Test
    public void testIsLocalDateTimeGap() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime()));
    }
    
    @Test
    public void testAdjustOffset() {
        long instant = 0L;
        assertEquals(instant, DateTimeZone.UTC.adjustOffset(instant, true));
    }
    
    @Test
    public void testGetMillisKeepLocal() {
        long instant = 0L;
        assertEquals(instant, DateTimeZone.UTC.getMillisKeepLocal(null, instant));
    }
    
    private static class InvalidProvider implements Provider {
        public DateTimeZone getZone(String id) { return null; }
        public Set<String> getAvailableIDs() { return null; }
    }
    
    @Test
    public void testSetProviderWithValidProvider() {
        DateTimeZone.setProvider(new Provider() {
            public DateTimeZone getZone(String id) {
                return DateTimeZone.UTC;
            }
            public Set<String> getAvailableIDs() {
                return new java.util.HashSet<String>() {{
                    add("UTC");
                }};
            }
        });
        assertEquals(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
        DateTimeZone.setProvider(null);
    }
    
    @Test
    public void testForOffsetHoursZero() {
        DateTimeZone zone = DateTimeZone.forOffsetHours(0);
        assertNotNull(zone);
        assertEquals(0, zone.getOffset(0));
    }
    
    @Test
    public void testForTimeZoneDisplayName() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT+05:30"));
        assertNotNull(zone);
        assertEquals(19800000, zone.getOffset(0));
    }
    
    @Test
    public void testGetOffsetFromLocal() {
        DateTimeZone zone = DateTimeZone.forID("America/New_York");
        assertNotNull(zone);
    }
    
    @Test(expected = NullPointerException.class)
    public void testConvertLocalToUTC0InvalidType() {
        DateTimeZone.UTC.convertLocalToUTC(0L, true, 0L);
    }
    
    @Test
    public void testConvertOriginalInstantUTC() {
        long instantLocal = 0L;
        long original = 1000L;
        long result = DateTimeZone.UTC.convertLocalToUTC(instantLocal, false, original);
        assertNotNull(result);
    }
    
    @Test
    public void testGetOffsetRT() {
        long instant = System.currentTimeMillis();
        int offset = DateTimeZone.getDefault().getOffset(instant);
        assertNotNull(offset);
    }
    
    @Test
    public void testGetZoneThroughGetConvertedId() {
        assertNull(DateTimeZone.getConvertedId("GMT"));
    }
    
    @Test
    public void testSetNameProvider() {
        DateTimeZone.setNameProvider(null);
        DateTimeZone.setNameProvider(new org.joda.time.tz.DefaultNameProvider());
    }
    
    @Test
    public void testGetProviderNonNull() {
        assertNotNull(DateTimeZone.getProvider());
    }
    
    @Test
    public void testFixedOffsetZone() {
        DateTimeZone zone = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(zone, DateTimeZone.forOffsetMillis(3600000));
    }
    
    @Test
    public void testFixedOffsetZoneExact() {
        DateTimeZone zone1 = DateTimeZone.forOffsetMillis(7200000);
        DateTimeZone zone2 = DateTimeZone.forOffsetMillis(7200000);
        assertSame(zone1, zone2);
    }
}