package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Comprehensive Unit Tests for {@link FastDateFormat}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class FastDateFormatTest {

    @Test
    public void getInstanceAndFormat_shouldMatchSimpleDateFormat() {
        // Arrange
        String pattern = "yyyy-MM-dd HH:mm:ss";
        FastDateFormat fdf = FastDateFormat.getInstance(pattern, Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.US);
        Date now = new Date();

        // Act
        String fdfStr = fdf.format(now);
        String sdfStr = sdf.format(now);

        // Assert
        assertEquals(sdfStr, fdfStr);
        assertEquals(pattern, fdf.getPattern());
    }

    @Test
    public void parse_shouldParseFormattedDate() throws Exception {
        // Arrange
        FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd");

        // Act
        Date date = fdf.parse("2026-09-21");

        // Assert
        assertNotNull(date);
    }
}
