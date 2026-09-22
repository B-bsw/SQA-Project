package org.apache.commons.codec.language.bm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class RuleTest {

    @Test
    public void phoneme_givenTextAndLanguages_shouldInitializeProperly() {
        // Arrange
        Rule.Phoneme p = new Rule.Phoneme("test", Languages.NO_LANGUAGES);

        // Act & Assert
        Assert.assertEquals("test", p.getPhonemeText().toString());
        Assert.assertEquals(Languages.NO_LANGUAGES, p.getLanguages());
    }

    @Test
    public void phoneme_givenAppend_shouldConcatenateText() {
        // Arrange
        Rule.Phoneme p = new Rule.Phoneme("hello", Languages.NO_LANGUAGES);

        // Act
        Rule.Phoneme appended = p.append("world");

        // Assert
        Assert.assertEquals("helloworld", appended.getPhonemeText().toString());
    }

    @Test
    public void phoneme_givenJoin_shouldCombinePhonemes() {
        // Arrange
        Rule.Phoneme p1 = new Rule.Phoneme("foo", Languages.NO_LANGUAGES);
        Rule.Phoneme p2 = new Rule.Phoneme("bar", Languages.NO_LANGUAGES);

        // Act
        Rule.Phoneme joined = p1.join(p2);

        // Assert
        Assert.assertEquals("foobar", joined.getPhonemeText().toString());
    }

    @Test
    public void phoneme_givenComparator_shouldSortCorrectly() {
        // Arrange
        Rule.Phoneme p1 = new Rule.Phoneme("apple", Languages.NO_LANGUAGES);
        Rule.Phoneme p2 = new Rule.Phoneme("banana", Languages.NO_LANGUAGES);

        // Act & Assert
        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p2) < 0);
        Assert.assertTrue(Rule.Phoneme.COMPARATOR.compare(p2, p1) > 0);
        Assert.assertEquals(0, Rule.Phoneme.COMPARATOR.compare(p1, p1));
    }

    @Test
    public void getInstance_givenValidNameTypeAndRuleType_shouldReturnRuleList() {
        // Arrange & Act
        List<Rule> rules = Rule.getInstance(NameType.GENERIC, RuleType.APPROX, "common");

        // Assert
        Assert.assertNotNull(rules);
    }
}
