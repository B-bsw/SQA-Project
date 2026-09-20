package org.jsoup.parser;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

public class ParseSettingsTest {

    @Test
    public void htmlDefault_givenDefaultInstance_shouldHaveTagCaseFalse() {
        // Arrange & Act
        ParseSettings settings = ParseSettings.htmlDefault;

        // Assert
        Assert.assertFalse(settings.preserveTagCase());
    }

    @Test
    public void preserveCase_givenPreserveCaseInstance_shouldHaveTagCaseTrue() {
        // Arrange & Act
        ParseSettings settings = ParseSettings.preserveCase;

        // Assert
        Assert.assertTrue(settings.preserveTagCase());
    }

    @Test
    public void preserveTagCase_givenTagTrueAttributeFalse_shouldReturnTrue() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, false);

        // Act
        boolean result = settings.preserveTagCase();

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void preserveTagCase_givenTagFalseAttributeTrue_shouldReturnFalse() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, true);

        // Act
        boolean result = settings.preserveTagCase();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void normalizeTag_givenPreserveTagCaseFalse_shouldLowerCaseAndTrim() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);
        String inputTag = "  DIV  ";

        // Act
        String result = settings.normalizeTag(inputTag);

        // Assert
        Assert.assertEquals("div", result);
    }

    @Test
    public void normalizeTag_givenPreserveTagCaseTrue_shouldTrimAndKeepCase() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, false);
        String inputTag = "  DiV  ";

        // Act
        String result = settings.normalizeTag(inputTag);

        // Assert
        Assert.assertEquals("DiV", result);
    }

    @Test
    public void normalizeTag_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);

        // Act
        String result = settings.normalizeTag("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void normalizeTag_givenWhitespaceOnly_shouldReturnEmptyString() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, true);

        // Act
        String result = settings.normalizeTag("   \t\n  ");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void normalizeTag_givenNullString_shouldThrowNullPointerException() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, true);

        // Act
        settings.normalizeTag(null);
    }

    @Test
    public void normalizeAttribute_givenPreserveAttributeCaseFalse_shouldLowerCaseAndTrim() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);
        String inputAttr = "  HRef  ";

        // Act
        String result = settings.normalizeAttribute(inputAttr);

        // Assert
        Assert.assertEquals("href", result);
    }

    @Test
    public void normalizeAttribute_givenPreserveAttributeCaseTrue_shouldTrimAndKeepCase() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, true);
        String inputAttr = "  HRef  ";

        // Act
        String result = settings.normalizeAttribute(inputAttr);

        // Assert
        Assert.assertEquals("HRef", result);
    }

    @Test
    public void normalizeAttribute_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);

        // Act
        String result = settings.normalizeAttribute("");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void normalizeAttribute_givenWhitespaceOnly_shouldReturnEmptyString() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, true);

        // Act
        String result = settings.normalizeAttribute("   \t\n  ");

        // Assert
        Assert.assertEquals("", result);
    }

    @Test(expected = NullPointerException.class)
    public void normalizeAttribute_givenNullString_shouldThrowNullPointerException() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);

        // Act
        settings.normalizeAttribute(null);
    }

    @Test
    public void normalizeAttributes_givenPreserveAttributeCaseFalse_shouldNormalizeAttributes() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);
        Attributes attributes = new Attributes();
        attributes.put("KeyName", "ValueData");

        // Act
        Attributes result = settings.normalizeAttributes(attributes);

        // Assert
        Assert.assertSame(attributes, result);
        Assert.assertTrue(result.hasKey("keyname"));
        Assert.assertFalse(result.hasKey("KeyName"));
    }

    @Test
    public void normalizeAttributes_givenPreserveAttributeCaseTrue_shouldPreserveAttributeCase() {
        // Arrange
        ParseSettings settings = new ParseSettings(true, true);
        Attributes attributes = new Attributes();
        attributes.put("KeyName", "ValueData");

        // Act
        Attributes result = settings.normalizeAttributes(attributes);

        // Assert
        Assert.assertSame(attributes, result);
        Assert.assertTrue(result.hasKey("KeyName"));
    }

    @Test
    public void normalizeAttributes_givenNullAttributesWhenPreserveAttributeCaseTrue_shouldReturnNull() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, true);

        // Act
        Attributes result = settings.normalizeAttributes(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void normalizeAttributes_givenNullAttributesWhenPreserveAttributeCaseFalse_shouldThrowNullPointerException() {
        // Arrange
        ParseSettings settings = new ParseSettings(false, false);

        // Act
        settings.normalizeAttributes(null);
    }
}