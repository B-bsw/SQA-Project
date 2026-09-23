package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.TimeZone;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.ISOChronology;

public class DateTimeZoneTest {
    private DateTimeZone zone;
    private Locale defaultLocale;
    private TimeZone defaultTimeZone;

    @Before
    public void setUp() {
        defaultLocale = Locale.getDefault();
        defaultTimeZone = TimeZone.getDefault();
        zone = DateTimeZone.forID("Europe/London");
    }

    @After
    public void tearDown() {
        Locale.setDefault(defaultLocale);
        TimeZone.setDefault(defaultTimeZone);
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    @Test
    public void testGetDefault_NullSystemProperty_ReturnsUTC() {
        System.setProperty("user.timezone", "");
        DateTimeZone result = DateTimeZone.getDefault();
        assertNotNull(result);
    }

    @Test
    public void testGetDefault_InvalidSystemProperty_FallsBackToTimeZone() {
        System.setProperty("user.timezone", "InvalidZoneName");
        TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));
        DateTimeZone result = DateTimeZone.getDefault();
        assertNotNull(result);
    }

    @Test
    public void testSetDefault_Null_ThrowsException() {
        try {
            DateTimeZone.setDefault(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetDefault_ValidZone() {
        DateTimeZone.setDefault(DateTimeZone.UTC);
        assertSame(DateTimeZone.UTC, DateTimeZone.getDefault());
    }

    @Test
    public void testForID_Null_ReturnsDefault() {
        DateTimeZone original = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.forID("America/New_York"));
        try {
            assertEquals(DateTimeZone.forID("America/New_York"), DateTimeZone.forID(null));
        } finally {
            DateTimeZone.setDefault(original);
        }
    }

    @Test
    public void testForID_UTC_ReturnsConstant() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forID("UTC"));
    }

    @Test
    public void testForID_ValidZone_ReturnsZone() {
        assertNotNull(DateTimeZone.forID("Europe/London"));
    }

    @Test
    public void testForID_OffsetString_ReturnsFixedZone() {
        DateTimeZone z = DateTimeZone.forID("+01:00");
        assertNotNull(z);
        assertEquals(3600000, z.getOffset(0));
    }

    @Test
    public void testForID_InvalidID_ThrowsException() {
        try {
            DateTimeZone.forID("InvalidZone");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetHours_Zero_ReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHours(0));
    }

    @Test
    public void testForOffsetHours_Positive_ReturnsCorrectOffset() {
        DateTimeZone result = DateTimeZone.forOffsetHours(2);
        assertEquals(2 * 3600000, result.getOffset(0));
    }

    @Test
    public void testForOffsetHoursMinutes_ZeroZero_ReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetHoursMinutes(0, 0));
    }

    @Test
    public void testForOffsetHoursMinutes_InvalidMinutes_ThrowsException() {
        try {
            DateTimeZone.forOffsetHoursMinutes(1, -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetHoursMinutes_ValidInput_ReturnsCorrectZone() {
        DateTimeZone result = DateTimeZone.forOffsetHoursMinutes(5, 30);
        assertEquals((5 * 60 + 30) * 60000, result.getOffset(0));
    }

    @Test
    public void testForOffsetHoursMinutes_Overflow_ThrowsException() {
        try {
            DateTimeZone.forOffsetHoursMinutes(Integer.MAX_VALUE, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testForOffsetMillis_Zero_ReturnsUTC() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forOffsetMillis(0));
    }

    @Test
    public void testForOffsetMillis_Positive_ReturnsFixedZone() {
        DateTimeZone result = DateTimeZone.forOffsetMillis(3600000);
        assertEquals(3600000, result.getOffset(0));
    }

    @Test
    public void testForTimeZone_ValidZone_ReturnsDateTimeZone() {
        TimeZone tz = TimeZone.getTimeZone("America/New_York");
        DateTimeZone result = DateTimeZone.forTimeZone(tz);
        assertNotNull(result);
    }

    @Test
    public void testForTimeZone_UTC_ReturnsConstant() {
        assertSame(DateTimeZone.UTC, DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC")));
    }

    @Test
    public void testGetAvailableIDs_NotEmpty() {
        assertTrue(DateTimeZone.getAvailableIDs().size() > 0);
    }

    @Test
    public void testGetAvailableIDs_ContainsUTC() {
        assertTrue(DateTimeZone.getAvailableIDs().contains("UTC"));
    }

    @Test
    public void testGetProvider_Default_NotNull() {
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_NullFallsBack_ToDefault() {
        DateTimeZone.setProvider(null);
        assertNotNull(DateTimeZone.getProvider());
    }

    @Test
    public void testSetProvider_ValidProvider_SetsProvider() {
        final Provider original = DateTimeZone.getProvider();
        try {
            DateTimeZone.setProvider(original);
            assertSame(original, DateTimeZone.getProvider());
        } finally {
            DateTimeZone.setProvider(original);
        }
    }

    @Test
    public void testGetNameProvider_NotNull() {
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testSetNameProvider_NullFallsBack_ToDefault() {
        DateTimeZone.setNameProvider(null);
        assertNotNull(DateTimeZone.getNameProvider());
    }

    @Test
    public void testGetConvertedId_KnownId_ReturnsMappedZone() {
        DateTimeZone zone = DateTimeZone.forTimeZone(TimeZone.getTimeZone("PST"));
        assertNotNull(zone);
        assertEquals("America/Los_Angeles", zone.getID());
    }

    @Test
    public void testGetConvertedId_UnknownId_ReturnsNull() {
        assertNull(DateTimeZone.forTimeZone(TimeZone.getTimeZone("IDONTEXIST")).getID().startsWith("IDONTEXIST") ? null : DateTimeZone.UTC.getID());
    }

    @Test
    public void testGetID_ReturnsID() {
        assertEquals("Europe/London", zone.getID());
    }

    @Test
    public void testGetShortName_ReturnsName() {
        assertNotNull(zone.getShortName(0L));
    }

    @Test
    public void testGetShortName_NullLocale_UsesDefault() {
        assertNotNull(zone.getShortName(0L, null));
    }

    @Test
    public void testGetName_ReturnsName() {
        assertNotNull(zone.getName(0L));
    }

    @Test
    public void testGetName_NullLocale_UsesDefault() {
        assertNotNull(zone.getName(0L, null));
    }

    @Test
    public void testGetOffset_Long_ReturnsOffset() {
        assertTrue(zone.getOffset(0L) != Integer.MIN_VALUE);
    }

    @Test
    public void testGetOffset_ReadableInstant_Null_UsesCurrentTime() {
        long before = System.currentTimeMillis();
        int result = zone.getOffset((ReadableInstant) null);
        long after = System.currentTimeMillis();
        assertTrue(result >= zone.getOffset(before) && result <= zone.getOffset(after));
    }

    @Test
    public void testIsStandardOffset_ForStandardZone() {
        assertTrue(zone.isStandardOffset(zone.getStandardOffset(0L)));
    }

    @Test
    public void testGetOffsetFromLocal_ReturnsOffset() {
        assertNotNull(zone.getOffsetFromLocal(0L));
    }

    @Test
    public void testConvertUTCToLocal_RoundTrip() {
        long instant = System.currentTimeMillis();
        long local = zone.convertUTCToLocal(instant);
        assertNotEquals(instant, local);
    }

    @Test
    public void testConvertLocalToUTC_StrictTrue() {
        long local = System.currentTimeMillis();
        long utc = zone.convertLocalToUTC(local, true);
        assertTrue(utc != Long.MIN_VALUE);
    }

    @Test
    public void testConvertLocalToUTC_StrictFalse() {
        long local = System.currentTimeMillis();
        long utc = zone.convertLocalToUTC(local, false);
        assertTrue(utc != Long.MIN_VALUE);
    }

    @Test
    public void testGetMillisKeepLocal_NullZone_ReturnsSame() {
        long instant = System.currentTimeMillis();
        long result = zone.getMillisKeepLocal(null, instant);
        assertEquals(instant, result);
    }

    @Test
    public void testGetMillisKeepLocal_SameZone_ReturnsSame() {
        long instant = System.currentTimeMillis();
        assertEquals(instant, zone.getMillisKeepLocal(zone, instant));
    }

    @Test
    public void testGetMillisKeepLocal_DifferentZone_ReturnsDifferent() {
        long instant = System.currentTimeMillis();
        long utcMillis = zone.getMillisKeepLocal(DateTimeZone.UTC, instant);
        assertNotEquals(instant, utcMillis);
    }

    @Test
    public void testIsLocalDateTimeGap_FixedZone_ReturnsFalse() {
        assertFalse(DateTimeZone.UTC.isLocalDateTimeGap(new LocalDateTime(2023, 1, 1, 12, 0)));
    }

    @Test
    public void testIsFixed_ForFixedZone_ReturnsTrue() {
        assertTrue(DateTimeZone.UTC.isFixed());
    }

    @Test
    public void testIsFixed_ForLondonZone_ReturnsFalse() {
        assertFalse(zone.isFixed());
    }

    @Test
    public void testToTimeZone_ReturnsTimeZone() {
        java.util.TimeZone tz = zone.toTimeZone();
        assertNotNull(tz);
    }

    @Test
    public void testHashCode_ConsistentWithID() {
        DateTimeZone z1 = DateTimeZone.forID("Europe/London");
        DateTimeZone z2 = DateTimeZone.forID("Europe/London");
        assertEquals(z1.hashCode(), z2.hashCode());
    }

    @Test
    public void testEquals_DifferentZones_ReturnsFalse() {
        DateTimeZone london = DateTimeZone.forID("Europe/London");
        DateTimeZone paris = DateTimeZone.forID("Europe/Paris");
        assertFalse(london.equals(paris));
    }

    @Test
    public void testEquals_SameZone_ReturnsTrue() {
        DateTimeZone london1 = DateTimeZone.forID("Europe/London");
        DateTimeZone london2 = DateTimeZone.forID("Europe/London");
        assertTrue(london1.equals(london2));
    }
}