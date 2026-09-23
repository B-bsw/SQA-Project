package org.apache.commons.lang;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.*;

public class LocaleUtilsTest {

    @Before
    public void setUp() {
        // nothing to set up
    }

    @After
    public void tearDown() {
        // nothing to tear down
    }

    @Test
    public void testToLocaleValidLanguage() {
        Locale result = LocaleUtils.toLocale("en");
        Assert.assertNotNull(result);
        Assert.assertEquals("en", result.getLanguage());
        Assert.assertEquals("", result.getCountry());
        Assert.assertEquals("", result.getVariant());
    }

    @Test
    public void testToLocaleValidLanguageCountry() {
        Locale result = LocaleUtils.toLocale("en_GB");
        Assert.assertNotNull(result);
        Assert.assertEquals("en", result.getLanguage());
        Assert.assertEquals("GB", result.getCountry());
        Assert.assertEquals("", result.getVariant());
    }

    @Test
    public void testToLocaleValidLanguageCountryVariant() {
        Locale result = LocaleUtils.toLocale("en_GB_xxx");
        Assert.assertNotNull(result);
        Assert.assertEquals("en", result.getLanguage());
        Assert.assertEquals("GB", result.getCountry());
        Assert.assertEquals("xxx", result.getVariant());
    }

    @Test
    public void testToLocaleNullInput() {
        Assert.assertNull("null should return null", LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocaleInvalidLength() {
        try {
            LocaleUtils.toLocale("e");
            Assert.fail("Expected IllegalArgumentException for too short input");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocaleInvalidLanguageCase() {
        try {
            LocaleUtils.toLocale("En");
            Assert.fail("Expected IllegalArgumentException for uppercase language");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocaleInvalidCountryCase() {
        try {
            LocaleUtils.toLocale("en_gb");
            Assert.fail("Expected IllegalArgumentException for lowercase country");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocaleMissingUnderscore() {
        try {
            LocaleUtils.toLocale("engb");
            Assert.fail("Expected IllegalArgumentException for missing underscore");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testToLocaleInvalidVariantSeparator() {
        try {
            LocaleUtils.toLocale("en_GBx");
            Assert.fail("Expected IllegalArgumentException for invalid variant separator");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testLocaleLookupListNullAndDefault() {
        Locale defaultLocale = Locale.ENGLISH;
        List result = LocaleUtils.localeLookupList(null, defaultLocale);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testLocaleLookupListOnlyLocale() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List result = LocaleUtils.localeLookupList(locale);
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(locale, result.get(0));
        Assert.assertEquals(new Locale("fr", "CA"), result.get(1));
        Assert.assertEquals(new Locale("fr"), result.get(2));
    }

    @Test
    public void testLocaleLookupListWithDefault() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List result = LocaleUtils.localeLookupList(locale, defaultLocale);
        Assert.assertNotNull(result);
        Assert.assertEquals(4, result.size());
        Assert.assertTrue(result.contains(defaultLocale));
    }

    @Test
    public void testLocaleLookupListWithoutDefaultDuplicate() {
        Locale locale = new Locale("en", "US");
        Locale defaultLocale = new Locale("en", "US");
        List result = LocaleUtils.localeLookupList(locale, defaultLocale);
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(locale, result.get(0));
        Assert.assertEquals(new Locale("en"), result.get(1));
        Assert.assertEquals(defaultLocale, result.get(2));
    }

    @Test
    public void testLocaleLookupListCountryOnly() {
        Locale locale = new Locale("", "US");
        List result = LocaleUtils.localeLookupList(locale);
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(locale, result.get(0));
    }

    @Test
    public void testAvailableLocaleList() {
        List result = LocaleUtils.availableLocaleList();
        Assert.assertNotNull(result);
        Assert.assertTrue(result.size() > 0);
        try {
            result.clear();
            Assert.fail("Should be unmodifiable");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testAvailableLocaleSet() {
        Set result1 = LocaleUtils.availableLocaleSet();
        Set result2 = LocaleUtils.availableLocaleSet();
        Assert.assertNotNull(result1);
        Assert.assertSame("Should be cached", result1, result2);
        try {
            result1.clear();
            Assert.fail("Should be unmodifiable");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testIsAvailableLocaleWithNull() {
        Assert.assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testIsAvailableLocaleExisting() {
        Locale locale = (Locale) LocaleUtils.availableLocaleList().get(0);
        Assert.assertTrue(LocaleUtils.isAvailableLocale(locale));
    }

    @Test
    public void testIsAvailableLocaleNotExisting() {
        Assert.assertFalse(LocaleUtils.isAvailableLocale(new Locale("xx", "YY")));
    }

    @Test
    public void testLanguagesByCountryNull() {
        List result = LocaleUtils.languagesByCountry(null);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testLanguagesByCountryValid() {
        List result = LocaleUtils.languagesByCountry("US");
        Assert.assertNotNull(result);
        Assert.assertTrue(result.size() > 0);
        for (int i = 0; i < result.size(); i++) {
            Locale locale = (Locale) result.get(i);
            Assert.assertEquals("US", locale.getCountry());
        }
    }

    @Test
    public void testLanguagesByCountryInvalid() {
        List result = LocaleUtils.languagesByCountry("XX");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testLanguagesByCountryWithVariants() {
        List result = LocaleUtils.languagesByCountry("FR");
        Assert.assertNotNull(result);
        for (int i = 0; i < result.size(); i++) {
            Locale locale = (Locale) result.get(i);
            Assert.assertEquals("", locale.getVariant());
        }
    }

    @Test
    public void testCountriesByLanguageNull() {
        List result = LocaleUtils.countriesByLanguage(null);
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testCountriesByLanguageValid() {
        List result = LocaleUtils.countriesByLanguage("en");
        Assert.assertNotNull(result);
        Assert.assertTrue(result.size() > 0);
        for (int i = 0; i < result.size(); i++) {
            Locale locale = (Locale) result.get(i);
            Assert.assertEquals("en", locale.getLanguage());
        }
    }

    @Test
    public void testCountriesByLanguageInvalid() {
        List result = LocaleUtils.countriesByLanguage("zz");
        Assert.assertNotNull(result);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testCountriesByLanguageCachedResults() {
        List first = LocaleUtils.countriesByLanguage("en");
        List second = LocaleUtils.countriesByLanguage("en");
        Assert.assertNotNull(first);
        // Note: cache is populated, so it should return the same instance
        Assert.assertSame(first, second);
    }

    @Test
    public void testLocaleLookupListStartsWithDefault() {
        Locale locale = new Locale("fr", "CA");
        List result = LocaleUtils.localeLookupList(locale, new Locale("en"));
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(locale, result.get(0));
        Assert.assertEquals(new Locale("en"), result.get(1));
    }

    @Test
    public void testLocaleLookupListWithVariantAndDefault() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("fr");
        List result = LocaleUtils.localeLookupList(locale, defaultLocale);
        Assert.assertNotNull(result);
        Assert.assertEquals(3, result.size());
        Assert.assertEquals(locale, result.get(0));
        Assert.assertEquals(new Locale("fr", "CA"), result.get(1));
        Assert.assertEquals(new Locale("fr"), result.get(2));
    }

    @Test
    public void testToLocaleBoundaryLengths() {
        // length 2 and 5 are valid; length 3, 4, 6 are invalid
        LocaleUtils.toLocale("en");
        LocaleUtils.toLocale("en_GB");
        try {
            LocaleUtils.toLocale("en_");
            Assert.fail("Expected IllegalArgumentException for length 3");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
}