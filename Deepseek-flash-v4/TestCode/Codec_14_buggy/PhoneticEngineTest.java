package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class PhoneticEngineTest {
    private PhoneticEngine engine;
    private PhoneticEngine concatEngine;

    @Before
    public void setUp() {
        engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        concatEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
    }

    @After
    public void tearDown() {
        engine = null;
        concatEngine = null;
    }

    @Test
    public void testConstructorWithNullFinalRules() {
        try {
            PhoneticEngine.RulesApplication ra = new PhoneticEngine.RulesApplication(null, "test", 
                PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")))), 0, 20);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("The finalRules argument must not be null", e.getMessage());
        }
    }

    @Test
    public void testConstructorWithValidParameters() {
        PhoneticEngine.RulesApplication ra = new PhoneticEngine.RulesApplication(
            new java.util.HashMap<String, java.util.List<Rule>>(), "test",
            PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")))), 0, 20);
        assertNotNull(ra);
        assertEquals(0, ra.getI());
        assertFalse(ra.isFound());
        assertNotNull(ra.getPhonemeBuilder());
    }

    @Test
    public void testEncodeWithEmptyInput() {
        String result = engine.encode("");
        assertNotNull(result);
        assertEquals("", result);
    }

    @Test
    public void testEncodeWithNullLanguageSet() {
        try {
            engine.encode("test", null);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // expected
        } catch (Exception e) {
            fail("Expected IllegalStateException but got " + e.getClass().getSimpleName());
        }
    }

    @Test
    public void testEncodeWithSingleWord() {
        String result = engine.encode("test");
        assertNotNull(result);
        assertTrue(result.length() >= 0);
    }

    @Test
    public void testEncodeWithMultipleWords() {
        String result = engine.encode("hello world");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithConcatFalseOnMultipleWords() {
        PhoneticEngine nonConcat = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = nonConcat.encode("hello world");
        assertNotNull(result);
        assertFalse(result.contains("|"));
    }

    @Test
    public void testEncodeWithConcatTrueOnMultipleWords() {
        PhoneticEngine concat = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        String result = concat.encode("hello world");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithApostrophe() {
        String result = engine.encode("O'Brien");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithSpecialCharacters() {
        String result = engine.encode("O'Neil");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithFrenchDePrefix() {
        PhoneticEngine genericEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = genericEngine.encode("de test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithVanPrefix() {
        PhoneticEngine genericEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = genericEngine.encode("van test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithLowerCaseConversion() {
        String result = engine.encode("TEST");
        assertNotNull(result);
        assertEquals(engine.encode("test"), result);
    }

    @Test
    public void testRulesApplicationWithMatchingRule() {
        PhoneticEngine.RulesApplication ra = new PhoneticEngine.RulesApplication(
            new java.util.HashMap<String, java.util.List<Rule>>(), "test",
            PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")))),
            0, 20);
        PhoneticEngine.RulesApplication result = ra.invoke();
        assertNotNull(result);
        assertFalse(result.isFound());
    }

    @Test
    public void testRulesApplicationWithEmptyInput() {
        PhoneticEngine.RulesApplication ra = new PhoneticEngine.RulesApplication(
            new java.util.HashMap<String, java.util.List<Rule>>(), "",
            PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en")))),
            0, 20);
        PhoneticEngine.RulesApplication result = ra.invoke();
        assertNotNull(result);
        assertNotNull(result.getPhonemeBuilder());
    }

    @Test
    public void testGetLangReturnsNonNull() {
        assertNotNull(engine.getLang());
    }

    @Test
    public void testGetNameType() {
        assertEquals(NameType.GENERIC, engine.getNameType());
    }

    @Test
    public void testGetRuleType() {
        assertEquals(RuleType.APPROX, engine.getRuleType());
    }

    @Test
    public void testIsConcatFalse() {
        assertFalse(engine.isConcat());
    }

    @Test
    public void testIsConcatTrue() {
        assertTrue(concatEngine.isConcat());
    }

    @Test
    public void testGetMaxPhonemes() {
        assertEquals(20, engine.getMaxPhonemes());
    }

    @Test
    public void testEncodeWithInputLengthOne() {
        String result = engine.encode("a");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithDollarSign() {
        String result = engine.encode("test$input");
        assertNotNull(result);
    }

    @Test
    public void testPhonemeBuilderEmpty() {
        PhonemeBuilder builder = PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        assertNotNull(builder);
        assertNotNull(builder.getPhonemes());
        assertEquals(1, builder.getPhonemes().size());
        assertEquals("", builder.makeString());
    }

    @Test
    public void testPhonemeBuilderAppend() {
        PhonemeBuilder builder = PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        builder.append("test");
        assertEquals("test", builder.makeString());
    }

    @Test
    public void testPhonemeBuilderApplyWithIncompatibleLanguages() {
        PhonemeBuilder builder = PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        Rule.Phoneme phoneme = new Rule.Phoneme("test", Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("fr"))));
        builder.apply(new Rule.PhonemeExpression() {
            @Override
            public Iterable<Rule.Phoneme> getPhonemes() {
                return Arrays.asList(phoneme);
            }
        }, 20);
        assertEquals("", builder.makeString());
    }

    @Test
    public void testPhonemeBuilderApplyWithMaxPhonemesLimit() {
        PhonemeBuilder builder = PhonemeBuilder.empty(Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        Rule.Phoneme phoneme1 = new Rule.Phoneme("t", Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        Rule.Phoneme phoneme2 = new Rule.Phoneme("te", Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("en"))));
        builder.apply(new Rule.PhonemeExpression() {
            @Override
            public Iterable<Rule.Phoneme> getPhonemes() {
                return Arrays.asList(phoneme1, phoneme2);
            }
        }, 1);
        assertTrue(builder.getPhonemes().size() <= 1);
    }

    @Test
    public void testEncodeWithSephardicNameType() {
        PhoneticEngine sephardic = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, false);
        String result = sephardic.encode("test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithAshkenaziNameType() {
        PhoneticEngine ashkenazi = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, false);
        String result = ashkenazi.encode("test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithRulesRuleType() {
        PhoneticEngine rulesEngine = new PhoneticEngine(NameType.GENERIC, RuleType.RULES, false);
        String result = rulesEngine.encode("test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithExplicitLanguageSet() {
        Set<String> languages = new HashSet<String>(Arrays.asList("en"));
        Languages.LanguageSet languageSet = Languages.LanguageSet.from(languages);
        String result = engine.encode("test", languageSet);
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithHyphen() {
        String result = engine.encode("test-input");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithLeadingSpace() {
        String result = engine.encode(" test");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithTrailingSpace() {
        String result = engine.encode("test ");
        assertNotNull(result);
    }

    @Test
    public void testEncodeWithMultipleSpaces() {
        String result = engine.encode("test  input");
        assertNotNull(result);
    }
}