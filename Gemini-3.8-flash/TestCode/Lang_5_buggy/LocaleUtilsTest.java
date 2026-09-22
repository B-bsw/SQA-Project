package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.junit.Test;

public class LocaleUtilsTest {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_GB = new Locale("en", "GB");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_QQ = new Locale("qq", "");
    private static final Locale LOCALE_QQ_ZZ = new Locale("qq", "ZZ");

    @Test
    public void constructor_whenInvoked_shouldInstantiateSuccessfully() {
        LocaleUtils utils = new LocaleUtils();
        assertNotNull(utils);
    }

    //-----------------------------------------------------------------------
    // toLocale tests
    //-----------------------------------------------------------------------

    @Test
    public void toLocale_givenNull_shouldReturnNull() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void toLocale_givenValidLanguageOnly_shouldReturnLocale() {
        Locale locale = LocaleUtils.toLocale("us");
        assertNotNull(locale);
        assertEquals("us", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());

        locale = LocaleUtils.toLocale("fr");
        assertNotNull(locale);
        assertEquals("fr", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenEmptyString_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenLength1String_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenFirstCharUpperCase_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("Us");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenSecondCharUpperCase_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("uS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenFirstCharNumeric_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("1s");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenSecondCharNumeric_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("s1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenLength3String_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("usa");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenLength4String_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_A");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenInvalidChar2Separator_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us-US");
    }

    @Test
    public void toLocale_givenLanguageAndVariantOnly_shouldReturnLocale() {
        Locale locale = LocaleUtils.toLocale("en__POSIX");
        assertNotNull(locale);
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());

        locale = LocaleUtils.toLocale("fr__A");
        assertNotNull(locale);
        assertEquals("fr", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("A", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenInvalidChar3CountryCode_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_uS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenInvalidChar4CountryCode_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_Us");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenNumericCountryCode_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_1S");
    }

    @Test
    public void toLocale_givenValidLanguageAndCountry_shouldReturnLocale() {
        Locale locale = LocaleUtils.toLocale("us_US");
        assertNotNull(locale);
        assertEquals("us", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("", locale.getVariant());

        locale = LocaleUtils.toLocale("fr_CA");
        assertNotNull(locale);
        assertEquals("fr", locale.getLanguage());
        assertEquals("CA", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenLength6String_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_US_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void toLocale_givenInvalidChar5Separator_shouldThrowIllegalArgumentException() {
        LocaleUtils.toLocale("us_US-POSIX");
    }

    @Test
    public void toLocale_givenLanguageCountryVariant_shouldReturnLocale() {
        Locale locale = LocaleUtils.toLocale("us_US_POSIX");
        assertNotNull(locale);
        assertEquals("us", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());

        locale = LocaleUtils.toLocale("fr_CA_special");
        assertNotNull(locale);
        assertEquals("fr", locale.getLanguage());
        assertEquals("CA", locale.getCountry());
        assertEquals("special", locale.getVariant());
    }

    //-----------------------------------------------------------------------
    // localeLookupList tests
    //-----------------------------------------------------------------------

    @Test
    public void localeLookupList_givenNullLocale_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void localeLookupList_givenNullLocaleWithDefault_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null, LOCALE_EN);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void localeLookupList_givenLanguageOnly_shouldReturnLanguageAndDefault() {
        List<Locale> list = LocaleUtils.localeLookupList(LOCALE_QQ, LOCALE_EN);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_QQ, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test
    public void localeLookupList_givenLanguageAndCountry_shouldReturnCountryLanguageAndDefault() {
        List<Locale> list = LocaleUtils.localeLookupList(LOCALE_QQ_ZZ, LOCALE_EN);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(LOCALE_QQ_ZZ, list.get(0));
        assertEquals(LOCALE_QQ, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));
    }

    @Test
    public void localeLookupList_givenLanguageCountryVariant_shouldReturnAllLevels() {
        Locale locale = new Locale("qq", "ZZ", "special");
        List<Locale> list = LocaleUtils.localeLookupList(locale, LOCALE_EN);
        assertNotNull(list);
        assertEquals(4, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(LOCALE_QQ_ZZ, list.get(1));
        assertEquals(LOCALE_QQ, list.get(2));
        assertEquals(LOCALE_EN, list.get(3));
    }

    @Test
    public void localeLookupList_givenLanguageAndVariantNoCountry_shouldHandleProperly() {
        Locale locale = new Locale("qq", "", "special");
        List<Locale> list = LocaleUtils.localeLookupList(locale, LOCALE_EN);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(LOCALE_QQ, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));
    }

    @Test
    public void localeLookupList_givenDefaultLocaleAlreadyInList_shouldNotDuplicate() {
        List<Locale> list = LocaleUtils.localeLookupList(LOCALE_FR_CA, LOCALE_FR);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_FR_CA, list.get(0));
        assertEquals(LOCALE_FR, list.get(1));
    }

    @Test
    public void localeLookupList_givenSingleArgument_shouldDefaultToSameLocale() {
        List<Locale> list = LocaleUtils.localeLookupList(LOCALE_FR_CA);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_FR_CA, list.get(0));
        assertEquals(LOCALE_FR, list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void localeLookupList_whenModifyingReturnedList_shouldThrowUnsupportedOperationException() {
        List<Locale> list = LocaleUtils.localeLookupList(LOCALE_FR_CA);
        list.add(LOCALE_EN);
    }

    //-----------------------------------------------------------------------
    // availableLocaleList / availableLocaleSet / isAvailableLocale tests
    //-----------------------------------------------------------------------

    @Test
    public void availableLocaleList_whenInvoked_shouldReturnAvailableLocales() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        List<Locale> expected = Arrays.asList(Locale.getAvailableLocales());
        assertEquals(expected.size(), list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void availableLocaleList_whenModifyingReturnedList_shouldThrowUnsupportedOperationException() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        list.add(LOCALE_EN);
    }

    @Test
    public void availableLocaleSet_whenInvoked_shouldReturnAvailableLocales() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        Set<Locale> expected = new HashSet<Locale>(Arrays.asList(Locale.getAvailableLocales()));
        assertEquals(expected.size(), set.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void availableLocaleSet_whenModifyingReturnedSet_shouldThrowUnsupportedOperationException() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        set.add(LOCALE_EN);
    }

    @Test
    public void isAvailableLocale_givenKnownLocale_shouldReturnTrue() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.ENGLISH));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void isAvailableLocale_givenUnknownLocale_shouldReturnFalse() {
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ));
        assertFalse(LocaleUtils.isAvailableLocale(LOCALE_QQ_ZZ));
    }

    //-----------------------------------------------------------------------
    // languagesByCountry tests
    //-----------------------------------------------------------------------

    @Test
    public void languagesByCountry_givenNull_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void languagesByCountry_givenUnknownCountry_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void languagesByCountry_givenValidCountry_shouldReturnExpectedLanguages() {
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        assertNotNull(list);
        assertFalse(list.isEmpty());
        for (Iterator<Locale> it = list.iterator(); it.hasNext(); ) {
            Locale locale = it.next();
            assertEquals("US", locale.getCountry());
            assertTrue(locale.getVariant().length() == 0);
        }
    }

    @Test
    public void languagesByCountry_givenRepeatedCall_shouldReturnCachedResult() {
        List<Locale> list1 = LocaleUtils.languagesByCountry("CA");
        List<Locale> list2 = LocaleUtils.languagesByCountry("CA");
        assertNotNull(list1);
        assertNotNull(list2);
        assertEquals(list1, list2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void languagesByCountry_whenModifyingReturnedList_shouldThrowUnsupportedOperationException() {
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        list.add(LOCALE_EN);
    }

    //-----------------------------------------------------------------------
    // countriesByLanguage tests
    //-----------------------------------------------------------------------

    @Test
    public void countriesByLanguage_givenNull_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void countriesByLanguage_givenUnknownLanguage_shouldReturnEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage("qq");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void countriesByLanguage_givenValidLanguage_shouldReturnExpectedCountries() {
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        assertNotNull(list);
        assertFalse(list.isEmpty());
        for (Iterator<Locale> it = list.iterator(); it.hasNext(); ) {
            Locale locale = it.next();
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() > 0);
            assertTrue(locale.getVariant().length() == 0);
        }
    }

    @Test
    public void countriesByLanguage_givenRepeatedCall_shouldReturnCachedResult() {
        List<Locale> list1 = LocaleUtils.countriesByLanguage("fr");
        List<Locale> list2 = LocaleUtils.countriesByLanguage("fr");
        assertNotNull(list1);
        assertNotNull(list2);
        assertEquals(list1, list2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void countriesByLanguage_whenModifyingReturnedList_shouldThrowUnsupportedOperationException() {
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        list.add(LOCALE_EN_US);
    }
}