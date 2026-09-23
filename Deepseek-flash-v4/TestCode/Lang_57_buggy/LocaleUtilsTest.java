package org.apache.commons.lang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

public class LocaleUtilsTest {

    @Test
    public void testConstructor() {
        assertNotNull(new LocaleUtils());
    }

    @Test
    public void testToLocale_NullInput() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_ValidLanguageOnly() {
        Locale result = LocaleUtils.toLocale("en");
        assertEquals("en", result.getLanguage());
        assertEquals("", result.getCountry());
        assertEquals("", result.getVariant());
    }

    @Test
    public void testToLocale_ValidLanguageCountry() {
        Locale result = LocaleUtils.toLocale("en_GB");
        assertEquals("en", result.getLanguage());
        assertEquals("GB", result.getCountry());
        assertEquals("", result.getVariant());
    }

    @Test
    public void testToLocale_ValidLanguageCountryVariant() {
        Locale result = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals("en", result.getLanguage());
        assertEquals("GB", result.getCountry());
        assertEquals("xxx", result.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidFormat_LengthNot2or5andLessThan7() {
        LocaleUtils.toLocale("en_GB_xx");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidFirstCharLowerCase() {
        LocaleUtils.toLocale("En");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidSecondCharLowerCase() {
        LocaleUtils.toLocale("eN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidSeparatorAt3() {
        LocaleUtils.toLocale("en-GB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidCountryCodeUpperCase() {
        LocaleUtils.toLocale("en_gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_InvalidVariantSeparator() {
        LocaleUtils.toLocale("en_GB.xxx");
    }

    @Test
    public void testLocaleLookupList_NullLocale() {
        List list = LocaleUtils.localeLookupList(null, Locale.ENGLISH);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupList_VariantCountryLanguage() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List list = LocaleUtils.localeLookupList(locale, Locale.ENGLISH);
        assertEquals(4, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
        assertEquals(Locale.ENGLISH, list.get(3));
    }

    @Test
    public void testLocaleLookupList_AlreadyContainsDefault() {
        Locale locale = new Locale("fr", "CA");
        List list = LocaleUtils.localeLookupList(locale, locale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("fr", ""), list.get(1));
    }

    @Test
    public void testAvailableLocaleList_NotNull() {
        List list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        assertSame(LocaleUtils.availableLocaleList(), LocaleUtils.availableLocaleList());
    }

    @Test
    public void testAvailableLocaleSet_ReturnsSameInstance() {
        Set set1 = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        assertNotNull(set1);
        assertSame(set1, set2);
    }

    @Test
    public void testIsAvailableLocale_ExistingLocale() {
        Locale testLocale = null;
        List locales = LocaleUtils.availableLocaleList();
        if (locales.size() > 0) {
            testLocale = (Locale) locales.get(0);
        }
        if (testLocale != null) {
            assertTrue(LocaleUtils.isAvailableLocale(testLocale));
        }
    }

    @Test
    public void testIsAvailableLocale_Null() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountry_NullCountry() {
        List langs = LocaleUtils.languagesByCountry(null);
        assertNotNull(langs);
        assertTrue(langs.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_ExistingCountry() {
        List langs = LocaleUtils.languagesByCountry("CA");
        assertNotNull(langs);
        assertFalse(langs.isEmpty());
        for (Object obj : langs) {
            Locale locale = (Locale) obj;
            assertEquals("CA", locale.getCountry());
            assertEquals("", locale.getVariant());
        }
    }

    @Test
    public void testLanguagesByCountry_NonExistingCountry() {
        List langs = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(langs);
        assertTrue(langs.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_NullLanguage() {
        List countries = LocaleUtils.countriesByLanguage(null);
        assertNotNull(countries);
        assertTrue(countries.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_ExistingLanguage() {
        List countries = LocaleUtils.countriesByLanguage("en");
        assertNotNull(countries);
        assertFalse(countries.isEmpty());
        for (Object obj : countries) {
            Locale locale = (Locale) obj;
            assertEquals("en", locale.getLanguage());
            assertEquals(0, locale.getVariant().length());
        }
    }

    @Test
    public void testCountriesByLanguage_NonExistingLanguage() {
        List countries = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(countries);
        assertTrue(countries.isEmpty());
    }

    @Test
    public void testLang864() {
        List countries = LocaleUtils.countriesByLanguage("fr");
        assertNotNull(countries);
        assertFalse(countries.isEmpty());
    }

}