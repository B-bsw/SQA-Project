package org.apache.commons.codec.language.bm;

import org.junit.Assert;
import org.junit.Test;

public class LangTest {

    @Test
    public void instance_givenNameType_shouldReturnNonNullSingleton() {
        // Arrange & Act
        Lang lang = Lang.instance(NameType.GENERIC);

        // Assert
        Assert.assertNotNull(lang);
    }

    @Test
    public void guessLanguage_givenEnglishWord_shouldReturnEnglish() {
        // Arrange
        Lang lang = Lang.instance(NameType.GENERIC);

        // Act
        String guessed = lang.guessLanguage("smith");

        // Assert
        Assert.assertNotNull(guessed);
    }

    @Test
    public void guessLanguages_givenInput_shouldReturnLanguageSet() {
        // Arrange
        Lang lang = Lang.instance(NameType.GENERIC);

        // Act
        Languages.LanguageSet languages = lang.guessLanguages("rossi");

        // Assert
        Assert.assertNotNull(languages);
        Assert.assertFalse(languages.isEmpty());
    }
}
