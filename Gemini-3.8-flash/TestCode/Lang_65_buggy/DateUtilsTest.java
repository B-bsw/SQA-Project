package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

/**
 * Comprehensive Unit Tests for {@link DateUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class DateUtilsTest {

    @Test
    public void isSameDay_givenIdenticalAndDifferentDates_shouldEvaluateCorrectly() {
        // Arrange
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2026, Calendar.SEPTEMBER, 21, 10, 0, 0);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2026, Calendar.SEPTEMBER, 21, 18, 30, 0);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(2026, Calendar.SEPTEMBER, 22, 10, 0, 0);

        // Act & Assert
        assertTrue(DateUtils.isSameDay(cal1.getTime(), cal2.getTime()));
        assertFalse(DateUtils.isSameDay(cal1.getTime(), cal3.getTime()));
    }

    @Test
    public void addDaysAndAddHours_shouldModifyDates() {
        // Arrange
        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.JANUARY, 1, 12, 0, 0);
        Date initial = cal.getTime();

        // Act
        Date afterDays = DateUtils.addDays(initial, 5);
        Date afterHours = DateUtils.addHours(initial, 2);

        // Assert
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(afterDays);
        assertEquals(6, resCal.get(Calendar.DAY_OF_MONTH));

        resCal.setTime(afterHours);
        assertEquals(14, resCal.get(Calendar.HOUR_OF_DAY));
    }

    @Test
    public void truncate_shouldClearLowerFields() {
        // Arrange
        Calendar cal = Calendar.getInstance();
        cal.set(2026, Calendar.MARCH, 15, 10, 30, 45);
        Date date = cal.getTime();

        // Act
        Date truncated = DateUtils.truncate(date, Calendar.DAY_OF_MONTH);

        // Assert
        Calendar resCal = Calendar.getInstance();
        resCal.setTime(truncated);
        assertEquals(0, resCal.get(Calendar.HOUR_OF_DAY));
        assertEquals(0, resCal.get(Calendar.MINUTE));
        assertEquals(0, resCal.get(Calendar.SECOND));
    }

    @Test
    public void parseDate_givenPattern_shouldParseString() throws Exception {
        // Arrange
        String[] patterns = new String[] { "yyyy-MM-dd", "yyyy/MM/dd" };

        // Act
        Date d1 = DateUtils.parseDate("2026-09-21", patterns);
        Date d2 = DateUtils.parseDate("2026/09/21", patterns);

        // Assert
        assertNotNull(d1);
        assertNotNull(d2);
        assertEquals(d1, d2);
    }
}
