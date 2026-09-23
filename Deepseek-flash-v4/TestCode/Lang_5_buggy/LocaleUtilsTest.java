package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Locale;

import org.junit.Test;

public class LocaleUtilsTest {

    @Test
    public void testToLocale() {
        assertNull(LocaleUtils.toLocale(null));
        assertEquals(new Locale("en"), LocaleUtils.toLocale("en"));
        assertEquals(new Locale("en", "GB"), LocaleUtils.toLocale("en_GB"));
        assertEquals(new Locale("en", "GB", "xxx"), LocaleUtils.toLocale("en_GB_xxx"));
        assertEquals(new Locale("en", "", "GB"), LocaleUtils.toLocale("en__GB"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleInvalidLength() {
        LocaleUtils.toLocale("e");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleInvalidSeparator() {
        LocaleUtils.toLocale("en-GB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleUpperCaseLanguage() {
        LocaleUtils.toLocale("EN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleLowerCaseCountry() {
        LocaleUtils.toLocale("en_gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocaleInvalidVariantSeparator() {
        LocaleUtils.toLocale("en_GB_xx_yy");
    }

    @Test
    public void testToLocaleWithUnderscoreAfterLanguage() {
        Locale l = LocaleUtils.toLocale("en__");
        assertEquals("en", l.getLanguage());
        assertEquals("", l.getCountry());
        assertEquals("", l.getVariant());
    }

    @Test
    public void testLocaleLookupListWithVariant() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale, new Locale("en"));
        assertEquals(4, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr"), list.get(2));
        assertEquals(new Locale("en"), list.get(3));
    }

    @Test
    public void testLocaleLookupListWithoutCountry() {
        Locale locale = new Locale("fr", "", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale, null);
        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "", "xxx"), list.get(0));
        assertEquals(new Locale("fr"), list.get(1));
        assertNull(list.get(2));
    }

    @Test
    public void testLocaleLookupListNull() {
        List<Locale> list = LocaleUtils.localeLookupList(null, null);
        assertEquals(1, list.size());
        assertNull(list.get(0));
    }

    @Test
    public void testLocaleLookupListDefaultIncluded() {
        Locale locale = new Locale("en", "US");
        List<Locale> list = LocaleUtils.localeLookupList(locale, new Locale("en"));
        assertEquals(3, list.size());
    }

    @Test
    public void testAvailableLocaleList() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertTrue(list.size() > 0);
        try {
            list.add(Locale.ENGLISH);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testAvailableLocaleSet() {
        assertNotNull(LocaleUtils.availableLocaleSet());
        assertTrue(LocaleUtils.availableLocaleSet().size() > 0);
    }

    @Test
    public void testIsAvailableLocale() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.ENGLISH));
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("xx", "XX")));
    }

    @Test
    public void testLanguagesByCountryNull() {
        assertEquals(java.util.Collections.emptyList(), LocaleUtils.languagesByCountry(null));
    }

    @Test
    public void testLanguagesByCountryInvalid() {
        List<Locale> langs = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(langs);
        assertTrue(langs.isEmpty());
    }

    @Test
    public void testLanguagesByCountryValid() {
        List<Locale> langs = LocaleUtils.languagesByCountry("CA");
        assertNotNull(langs);
        assertTrue(langs.size() >= 2);
    }

    @Test
    public void testLanguagesByCountryVariantRemoved() {
        List<Locale> langs = LocaleUtils.languagesByCountry("FR");
        for (Locale locale : langs) {
            assertEquals("", locale.getVariant());
            assertEquals("FR", locale.getCountry());
        }
    }

    @Test
    public void testLanguagesByCountryCache() {
        List<Locale> first = LocaleUtils.languagesByCountry("CA");
        List<Locale> second = LocaleUtils.languagesByCountry("CA");
        assertSame(first, second);
        try {
            first.add(Locale.ENGLISH);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }

    @Test
    public void testCountriesByLanguageNull() {
        assertEquals(java.util.Collections.emptyList(), LocaleUtils.countriesByLanguage(null));
    }

    @Test
    public void testCountriesByLanguageValid() {
        List<Locale> countries = LocaleUtils.countriesByLanguage("en");
        assertNotNull(countries);
        assertTrue(countries.size() > 0);
        for (Locale locale : countries) {
            assertEquals("en", locale.getLanguage());
        }
    }

    @Test
    public void testCountriesByLanguageInvalid() {
        List<Locale> countries = LocaleUtils.countriesByLanguage("xx");
        assertNotNull(countries);
        assertTrue(countries.isEmpty());
    }
}