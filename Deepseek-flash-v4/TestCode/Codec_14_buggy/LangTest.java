package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LangTest {
    
    @Test
    public void testInstanceReturnsNonNullForAllNameTypes() {
        for (NameType nameType : NameType.values()) {
            assertNotNull("Instance should not be null for " + nameType, 
                    Lang.instance(nameType));
        }
    }
    
    @Test
    public void testLoadFromResourceWithInvalidName() {
        try {
            Lang.loadFromResource("invalid/resource/path.txt", 
                    Languages.getInstance(NameType.GENERIC));
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        }
    }
    
    @Test
    public void testGuessLanguageWithNullInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        try {
            lang.guessLanguage(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected - null input should cause NPE when calling toLowerCase()
        }
    }
    
    @Test
    public void testGuessLanguagesWithEmptyString() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet result = lang.guessLanguages("");
        assertNotNull("Result should not be null", result);
        assertTrue("Result should contain at least one language", 
                !result.toString().isEmpty());
    }
    
    @Test
    public void testGuessLanguageWithKnownWord() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String language = lang.guessLanguage("aame");
        // The actual language guess depends on the rules file, but we can verify 
        // basic behavior - either returns a specific language or ANY
        assertNotNull("Language should not be null", language);
        assertTrue("Language should either be a specific language or ANY", 
                language.equals(Languages.ANY) || 
                Languages.getInstance(NameType.GENERIC).getLanguages().contains(language));
    }
    
    @Test
    public void testGuessLanguagesWithUppercaseInput() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String input = "HELLO";
        Languages.LanguageSet lowerCaseResult = lang.guessLanguages(input.toLowerCase());
        Languages.LanguageSet upperCaseResult = lang.guessLanguages(input);
        assertEquals("Results should be the same regardless of case", 
                lowerCaseResult, upperCaseResult);
    }
    
    @Test
    public void testGuessLanguagesWithNonExistentWord() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // A gibberish word that's unlikely to match any language rule strongly
        String gibberish = "zzxxqqwv";
        Languages.LanguageSet result = lang.guessLanguages(gibberish);
        assertNotNull("Result should not be null", result);
    }
    
    @Test
    public void testLoadFromResourceAndCustomRules() {
        // We can't easily unit test loadFromResource with a custom resource,
        // but we can test the method throws appropriately for null languages
        try {
            Lang.loadFromResource("some/path.txt", null);
            fail("Expected NullPointerException for null languages");
        } catch (NullPointerException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testGuessLanguagesReturnsLanguagesSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet emptyResult = lang.guessLanguages("");
        // Empty input should still return a valid LanguageSet, could be ANY or specific
        assertTrue("Result should not be null", emptyResult != null);
    }
    
    @Test
    public void testInstanceReturnsSameInstanceForSameNameType() {
        Lang lang1 = Lang.instance(NameType.GENERIC);
        Lang lang2 = Lang.instance(NameType.GENERIC);
        assertEquals("Same NameType should return same instance", lang1, lang2);
    }
    
    @Test
    public void testGuessLanguageWithSpecialCharacters() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String specialChars = "café";
        Languages.LanguageSet result = lang.guessLanguages(specialChars);
        assertNotNull("Result should not be null for special characters", result);
    }
    
    @Test
    public void testGuessLanguagesWithOneRuleMatch() {
        // This tests the branch where a single rule matches
        Lang lang = Lang.instance(NameType.GENERIC);
        // Try a word that likely matches patterns - we just verify no exception
        String testWord = "london";
        try {
            lang.guessLanguages(testWord);
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
    
    @Test
    public void testGuessLanguageWithMixedCase() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // Verify case insensitivity in input processing
        Languages.LanguageSet lower = lang.guessLanguages("paris");
        Languages.LanguageSet upper = lang.guessLanguages("PARIS");
        assertEquals("Case should not affect language guessing", lower, upper);
    }
    
    @Test
    public void testLoadFromResourceWithMalformedContent() {
        // Creating a test resource to test the malformed line scenario is complex,
        // but we can at least verify the method doesn't accept invalid resource names
        try {
            Lang.loadFromResource("", Languages.getInstance(NameType.GENERIC));
            fail("Expected exception for empty resource name");
        } catch (Exception e) {
            // expected - either IllegalArgumentException or IllegalStateException
        }
    }
    
    @Test
    public void testGuessLanguagesWithCombinedMatching() {
        Lang lang = Lang.instance(NameType.GENERIC);
        // Test with a language that exists in most rule sets
        // The actual result may vary, but ensure no crash
        lang.guessLanguages("example");
    }
}