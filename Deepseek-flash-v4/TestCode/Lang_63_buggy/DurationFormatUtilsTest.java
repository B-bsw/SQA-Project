package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DurationFormatUtilsTest {
    
    private TimeZone defaultTimeZone;
    
    @Before
    public void setUp() {
        defaultTimeZone = TimeZone.getDefault();
        TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
    }
    
    @After
    public void tearDown() {
        TimeZone.setDefault(defaultTimeZone);
    }
    
    @Test
    public void testFormatDurationHMS() {
        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(0));
        assertEquals("0:00:00.001", DurationFormatUtils.formatDurationHMS(1));
        assertEquals("1:02:03.004", DurationFormatUtils.formatDurationHMS(3600000 + 120000 + 3000 + 4));
        assertEquals("23:59:59.999", DurationFormatUtils.formatDurationHMS(86399999));
        assertEquals("24:00:00.000", DurationFormatUtils.formatDurationHMS(86400000));
    }
    
    @Test
    public void testFormatDurationISO() {
        assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatDurationISO(0));
        assertEquals("P0Y0M0DT0H0M1.000S", DurationFormatUtils.formatDurationISO(1000));
        assertEquals("P0Y0M0DT1H2M3.004S", DurationFormatUtils.formatDurationISO(3600000 + 120000 + 3000 + 4));
    }
    
    @Test
    public void testFormatDuration() {
        assertEquals("0", DurationFormatUtils.formatDuration(0, "H"));
        assertEquals("00:00:00.000", DurationFormatUtils.formatDuration(0, "HH:mm:ss.SSS"));
        assertEquals("01:02:03.004", DurationFormatUtils.formatDuration(3723004, "HH:mm:ss.SSS"));
        assertEquals("00:00:01.000", DurationFormatUtils.formatDuration(1000, "HH:mm:ss.SSS"));
        assertEquals("1", DurationFormatUtils.formatDuration(1000, "H", false));
        assertEquals("00:00:00.001", DurationFormatUtils.formatDuration(1, "HH:mm:ss.SSS"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFormatDurationNullFormat() {
        DurationFormatUtils.formatDuration(1000, null);
    }
    
    @Test
    public void testFormatDurationZeroPadding() {
        assertEquals("000:00:00.000", DurationFormatUtils.formatDuration(0, "HHH:mm:ss.SSS"));
        assertEquals("001:00:00.000", DurationFormatUtils.formatDuration(3600000, "HHH:mm:ss.SSS", true));
        assertEquals("1:00:00.000", DurationFormatUtils.formatDuration(3600000, "H:mm:ss.SSS", false));
    }
    
    @Test
    public void testFormatPeriod() {
        long start = 0;
        long end = 3723004;
        assertEquals("00:00:00.000", DurationFormatUtils.formatPeriod(start, end, "HH:mm:ss.SSS"));
        
        assertEquals("0 00:00:00.000", DurationFormatUtils.formatPeriod(start, 0, "d HH:mm:ss.SSS"));
        assertEquals("1 00:00:00.000", DurationFormatUtils.formatPeriod(start, 86400000, "d HH:mm:ss.SSS"));
        assertEquals("0 00:00:01.000", DurationFormatUtils.formatPeriod(start, 1000, "d HH:mm:ss.SSS"));
    }
    
    @Test
    public void testFormatPeriodWithTimeZone() {
        long start = 0;
        long end = 3723004;
        assertEquals("0 00:00:00.000", DurationFormatUtils.formatPeriod(start, end, "d HH:mm:ss.SSS", true, TimeZone.getDefault()));
    }
    
    @Test
    public void testFormatPeriodISO() {
        long start = 0;
        long end = 3723004;
        assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatPeriodISO(start, end));
        
        end = 86400000;
        assertEquals("P0Y0M1DT0H0M0.000S", DurationFormatUtils.formatPeriodISO(start, end));
    }
    
    @Test
    public void testTokenEqualsAndHashCode() {
        DurationFormatUtils.Token token1 = new DurationFormatUtils.Token("y");
        DurationFormatUtils.Token token2 = new DurationFormatUtils.Token("y");
        DurationFormatUtils.Token token3 = new DurationFormatUtils.Token("M");
        
        assertTrue(token1.equals(token1));
        assertTrue(token1.equals(token2));
        assertFalse(token1.equals(null));
        assertFalse(token1.equals(new Object()));
        assertFalse(token1.equals(token3));
        assertEquals(token1.hashCode(), token2.hashCode());
        
        DurationFormatUtils.Token token4 = new DurationFormatUtils.Token(new StringBuffer("test"));
        DurationFormatUtils.Token token5 = new DurationFormatUtils.Token(new StringBuffer("test"));
        assertTrue(token4.equals(token5));
    }
    
    @Test
    public void testTokenContainsTokenWithValue() {
        DurationFormatUtils.Token[] tokens = new DurationFormatUtils.Token[] {
            new DurationFormatUtils.Token("y"),
            new DurationFormatUtils.Token("M"),
            new DurationFormatUtils.Token("d")
        };
        
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, "y"));
        assertTrue(DurationFormatUtils.Token.containsTokenWithValue(tokens, "M"));
        assertFalse(DurationFormatUtils.Token.containsTokenWithValue(tokens, "H"));
    }
    
    @Test
    public void testTokenToString() {
        DurationFormatUtils.Token token = new DurationFormatUtils.Token("y", 3);
        assertEquals("yyy", token.toString());
    }
    
    @Test
    public void testTokenGetCount() {
        DurationFormatUtils.Token token = new DurationFormatUtils.Token("y", 3);
        assertEquals(3, token.getCount());
    }
    
    @Test
    public void testTokenGetValue() {
        Object value = new String("y");
        DurationFormatUtils.Token token = new DurationFormatUtils.Token(value);
        assertSame(value, token.getValue());
    }
    
    @Test
    public void testFormatDurationNegativeDuration() {
        assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(-1000));
    }
    
    @Test
    public void testFormatPeriodReverse() {
        long start = 86400000;
        long end = 0;
        assertEquals("0 00:00:00.000", DurationFormatUtils.formatPeriod(start, end, "d HH:mm:ss.SSS"));
    }
    
    @Test
    public void testSuppressLeadingZeroElements() {
        assertEquals("1 day 0 hours 0 minutes 0 seconds", 
            DurationFormatUtils.formatDurationWords(86400000, false, false));
        assertEquals("1 day 0 hours 0 minutes 0 seconds", 
            DurationFormatUtils.formatDurationWords(86400000, true, false));
    }
    
    @Test
    public void testFormatDurationWords() {
        assertEquals("0 seconds", DurationFormatUtils.formatDurationWords(0, false, false));
        assertEquals("1 second", DurationFormatUtils.formatDurationWords(1000, false, false));
        assertEquals("1 minute 0 seconds", DurationFormatUtils.formatDurationWords(60000, false, false));
        assertEquals("1 hour 0 minutes 0 seconds", DurationFormatUtils.formatDurationWords(3600000, false, false));
        assertEquals("1 day 0 hours 0 minutes 0 seconds", DurationFormatUtils.formatDurationWords(86400000, false, false));
    }
}