package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Locale;

/**
 * Comprehensive Unit Tests for {@link LocaleUtils}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class LocaleUtilsTest {

    @Test
    public void toLocale_givenLanguageCountryVariant_shouldParse() {
        // Arrange & Act & Assert
        assertNull(LocaleUtils.toLocale(null));
        assertEquals(new Locale("en"), LocaleUtils.toLocale("en"));
        assertEquals(new Locale("en", "US"), LocaleUtils.toLocale("en_US"));
        assertEquals(new Locale("en", "US", "POSIX"), LocaleUtils.toLocale("en_US_POSIX"));
    }

    @Test
    public void isAvailableLocale_shouldCheckSystemLocales() {
        // Arrange & Act & Assert
        assertTrue(LocaleUtils.isAvailableLocale(Locale.ENGLISH));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void localeLookupList_shouldBuildFallbackHierarchy() {
        // Arrange
        Locale locale = new Locale("en", "US", "WIN");

        // Act
        List list = LocaleUtils.localeLookupList(locale);

        // Assert
        assertNotNull(list);
        assertTrue(list.size() >= 3);
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("en", "US"), list.get(1));
        assertEquals(new Locale("en"), list.get(2));
    }
}
