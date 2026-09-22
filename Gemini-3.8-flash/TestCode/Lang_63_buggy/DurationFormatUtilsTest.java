package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link DurationFormatUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class DurationFormatUtilsTest {

    @Test
    public void formatDuration_givenMillisAndPattern_shouldFormat() {
        // Arrange
        long millis = (2 * 3600 + 30 * 60 + 15) * 1000L; // 2h 30m 15s

        // Act
        String result = DurationFormatUtils.formatDuration(millis, "HH:mm:ss");

        // Assert
        assertEquals("02:30:15", result);
    }

    @Test
    public void formatDurationHMS_shouldFormatHoursMinutesSeconds() {
        // Arrange
        long millis = 5000L;

        // Act
        String result = DurationFormatUtils.formatDurationHMS(millis);

        // Assert
        assertTrue(result.contains("0:00:05") || result.contains("00:00:05"));
    }

    @Test
    public void formatDurationWords_shouldGenerateHumanReadableDuration() {
        // Arrange
        long millis = (24 * 3600 * 1000L) + (2 * 3600 * 1000L); // 1 day 2 hours

        // Act
        String words = DurationFormatUtils.formatDurationWords(millis, true, true);

        // Assert
        assertNotNull(words);
        assertTrue(words.contains("day"));
    }
}
