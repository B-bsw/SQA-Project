package org.apache.commons.codec.language.bm;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.HashSet;
import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.Test;

public class RuleTest {

    private static final LanguageSet EN_LANGS = LanguageSet.from(new HashSet<String>(Arrays.asList("en")));
    private static final LanguageSet ANY_LANGS = Languages.ANY_LANGUAGE;

    @Test
    public void testPhonemeConstructorWithCharSequenceAndLanguageSet() {
        Phoneme p = new Phoneme("test", EN_LANGS);
        assertEquals("test", p.getPhonemeText().toString());
        assertEquals(EN_LANGS, p.getLanguages());
    }

    @Test
    public void testPhonemeConstructorWithTwoPhonemes() {
        Phoneme left = new Phoneme("ab", EN_LANGS);
        Phoneme right = new Phoneme("cd", ANY_LANGS);
        Phoneme combined = new Phoneme(left, right);
        assertEquals("abcd", combined.getPhonemeText().toString());
        assertEquals(EN_LANGS, combined.getLanguages());
    }

    @Test
    public void testPhonemeConstructorWithTwoPhonemesAndLanguageSet() {
        Phoneme left = new Phoneme("a", EN_LANGS);
        Phoneme right = new Phoneme("b", EN_LANGS);
        Phoneme combined = new Phoneme(left, right, ANY_LANGS);
        assertEquals("ab", combined.getPhonemeText().toString());
        assertEquals(ANY_LANGS, combined.getLanguages());
    }

    @Test
    public void testPhonemeAppend() {
        Phoneme p = new Phoneme("a", EN_LANGS);
        p.append("bc");
        assertEquals("abc", p.getPhonemeText().toString());
        assertEquals(p, p.append("d"));
        assertEquals("abcd", p.getPhonemeText().toString());
    }

    @Test
    public void testPhonemeGetLanguages() {
        Phoneme p = new Phoneme("a", EN_LANGS);
        assertEquals(EN_LANGS, p.getLanguages());
    }

    @Test
    public void testPhonemeGetPhonemes() {
        Phoneme p = new Phoneme("a", EN_LANGS);
        Iterable<Phoneme> phonemes = p.getPhonemes();
        Phoneme single = phonemes.iterator().next();
        assertSame(p, single);
    }

    @Test
    public void testPhonemeGetPhonemeText() {
        Phoneme p = new Phoneme("hello", ANY_LANGS);
        assertEquals("hello", p.getPhonemeText().toString());
    }

    @Test
    public void testPhonemeJoin() {
        Phoneme left = new Phoneme("ab", EN_LANGS);
        Phoneme right = new Phoneme("cd", EN_LANGS);
        Phoneme joined = left.join(right);
        assertEquals("abcd", joined.getPhonemeText().toString());
        assertTrue(joined.getLanguages().equals(EN_LANGS));
    }

    @Test
    public void testPhonemeToString() {
        Phoneme p = new Phoneme("a", EN_LANGS);
        assertTrue(p.toString().contains("a["));
        assertTrue(p.toString().contains("]"));
    }

    @Test
    public void testPhonemeComparatorEqual() {
        Phoneme p1 = new Phoneme("ab", EN_LANGS);
        Phoneme p2 = new Phoneme("ab", EN_LANGS);
        assertEquals(0, Phoneme.COMPARATOR.compare(p1, p2));
    }

    @Test
    public void testPhonemeComparatorLessThan() {
        Phoneme p1 = new Phoneme("aa", EN_LANGS);
        Phoneme p2 = new Phoneme("ab", EN_LANGS);
        assertTrue(Phoneme.COMPARATOR.compare(p1, p2) < 0);
    }

    @Test
    public void testPhonemeComparatorGreaterThan() {
        Phoneme p1 = new Phoneme("bb", EN_LANGS);
        Phoneme p2 = new Phoneme("ab", EN_LANGS);
        assertTrue(Phoneme.COMPARATOR.compare(p1, p2) > 0);
    }

    @Test
    public void testPhonemeComparatorLengthLessThan() {
        Phoneme p1 = new Phoneme("ab", EN_LANGS);
        Phoneme p2 = new Phoneme("abx", EN_LANGS);
        assertTrue(Phoneme.COMPARATOR.compare(p1, p2) < 0);
    }

    @Test
    public void testPhonemeComparatorLengthGreaterThan() {
        Phoneme p1 = new Phoneme("abx", EN_LANGS);
        Phoneme p2 = new Phoneme("ab", EN_LANGS);
        assertTrue(Phoneme.COMPARATOR.compare(p1, p2) > 0);
    }

    @Test
    public void testPhonemeList() {
        Phoneme p1 = new Phoneme("a", EN_LANGS);
        Phoneme p2 = new Phoneme("b", ANY_LANGS);
        PhonemeList list = new PhonemeList(Arrays.asList(p1, p2));
        assertEquals(2, list.getPhonemes().size());
        assertSame(p1, list.getPhonemes().get(0));
    }

    @Test
    public void testAllStringsRPatternIsMatch() {
        assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch("any"));
        assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch(""));
    }

    @Test
    public void testParsePhonemeWithLanguageSet() {
        Phoneme p = Rule.parsePhoneme("hello[en]");
        assertEquals("hello", p.getPhonemeText().toString());
        assertTrue(p.getLanguages().equals(EN_LANGS));
    }

    @Test
    public void testParsePhonemeWithMultipleLanguages() {
        Phoneme p = Rule.parsePhoneme("hello[en+fr]");
        assertEquals("hello", p.getPhonemeText().toString());
        assertTrue(p.getLanguages().equals(LanguageSet.from(new HashSet<String>(Arrays.asList("en", "fr")))));
    }

    @Test
    public void testParsePhonemeNoLanguageSet() {
        Phoneme p = Rule.parsePhoneme("hello");
        assertEquals("hello", p.getPhonemeText().toString());
        assertSame(Languages.ANY_LANGUAGE, p.getLanguages());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePhonemeUnclosedBracket() {
        Rule.parsePhoneme("hello[en");
    }

    @Test
    public void testParsePhonemeExprWithParentheses() {
        PhonemeExpr expr = Rule.parsePhonemeExpr("(a|b|c)");
        int count = 0;
        for (Phoneme p : expr.getPhonemes()) {
            count++;
            assertNotNull(p);
        }
        assertEquals(3, count);
    }

    @Test
    public void testParsePhonemeExprWithLeadingPipe() {
        PhonemeExpr expr = Rule.parsePhonemeExpr("(|a)");
        int count = 0;
        for (Phoneme p : expr.getPhonemes()) {
            count++;
            assertNotNull(p);
        }
        assertEquals(2, count);
    }

    @Test
    public void testParsePhonemeExprWithTrailingPipe() {
        PhonemeExpr expr = Rule.parsePhonemeExpr("(a|)");
        int count = 0;
        for (Phoneme p : expr.getPhonemes()) {
            count++;
            assertNotNull(p);
        }
        assertEquals(2, count);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParsePhonemeExprUnclosedParen() {
        Rule.parsePhonemeExpr("(a|b");
    }

    @Test
    public void testParsePhonemeExprWithoutParentheses() {
        PhonemeExpr expr = Rule.parsePhonemeExpr("hello");
        assertTrue(expr instanceof Phoneme);
        assertEquals("hello", expr.getPhonemes().iterator().next().getPhonemeText().toString());
    }

    @Test
    public void testGetInstanceWithLanguageSetAny() {
        List<Rule> rules = Rule.getInstance(NameType.GENERIC, RuleType.EXACT, Languages.ANY_LANGUAGE);
        assertNotNull(rules);
    }

    @Test
    public void testGetInstanceWithLanguageSetSingleton() {
        List<Rule> rules = Rule.getInstance(NameType.GENERIC, RuleType.EXACT, EN_LANGS);
        assertNotNull(rules);
    }
}