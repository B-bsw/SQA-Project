package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Comprehensive Unit Tests for {@link FastDateFormat}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FastDateFormatTest {

    @Test
    public void getInstance_shouldCacheInstances() {
        // Arrange
        String pattern = "yyyy-MM-dd HH:mm:ss";

        // Act
        FastDateFormat fdf1 = FastDateFormat.getInstance(pattern);
        FastDateFormat fdf2 = FastDateFormat.getInstance(pattern);

        // Assert
        assertNotNull(fdf1);
        assertSame(fdf1, fdf2);
        assertEquals(pattern, fdf1.getPattern());
    }

    @Test
    public void format_givenDateAndCalendar_shouldMatchSimpleDateFormat() {
        // Arrange
        String pattern = "yyyy/MM/dd";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
        Date now = new Date();

        // Act
        String fdfFormatted = fdf.format(now);
        String sdfFormatted = sdf.format(now);

        // Assert
        assertEquals(sdfFormatted, fdfFormatted);
    }

    @Test
    public void parse_givenValidDateString_shouldParseToDate() throws Exception {
        // Arrange
        String pattern = "yyyy-MM-dd";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern);

        // Act
        Date parsed = fdf.parse("2026-09-21");

        // Assert
        assertNotNull(parsed);
        Calendar cal = Calendar.getInstance();
        cal.setTime(parsed);
        assertEquals(2026, cal.get(Calendar.YEAR));
        assertEquals(Calendar.SEPTEMBER, cal.get(Calendar.MONTH));
        assertEquals(21, cal.get(Calendar.DAY_OF_MONTH));
    }
}
