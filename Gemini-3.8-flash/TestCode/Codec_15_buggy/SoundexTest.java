package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SoundexTest {

    private Soundex soundex;

    @Before
    public void setUp() {
        this.soundex = new Soundex();
    }

    @Test
    public void soundex_givenNullOrEmpty_shouldReturnNullOrEmpty() {
        // Arrange & Act & Assert
        Assert.assertNull(this.soundex.soundex(null));
        Assert.assertEquals("", this.soundex.soundex(""));
    }

    @Test
    public void soundex_givenBasicNames_shouldReturnFourCharacterCode() {
        // Arrange & Act & Assert
        Assert.assertEquals("S530", this.soundex.soundex("Smith"));
        Assert.assertEquals("S530", this.soundex.soundex("Smythe"));
        Assert.assertEquals("J520", this.soundex.soundex("Jones"));
        Assert.assertEquals("W425", this.soundex.soundex("Wilson"));
    }

    @Test
    public void soundex_givenNamesWithHAndW_shouldIgnoreProperly() {
        // Arrange & Act & Assert
        Assert.assertEquals("A261", this.soundex.soundex("Ashcraft"));
        Assert.assertEquals("A261", this.soundex.soundex("Ashcroft"));
    }

    @Test
    public void difference_givenIdenticalStrings_shouldReturnFour() throws Exception {
        // Arrange & Act & Assert
        Assert.assertEquals(4, this.soundex.difference("Smith", "Smythe"));
    }

    @Test
    public void difference_givenCompletelyDifferentStrings_shouldReturnLowScore() throws Exception {
        // Arrange & Act & Assert
        Assert.assertEquals(0, this.soundex.difference("Smith", "Apple"));
    }

    @Test
    public void encode_givenString_shouldReturnSoundex() throws Exception {
        // Arrange & Act
        Object result = this.soundex.encode("Washington");

        // Assert
        Assert.assertEquals("W252", result);
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonString_shouldThrowEncoderException() throws Exception {
        // Arrange & Act & Assert
        this.soundex.encode(new Integer(42));
    }

    @Test
    public void soundex_givenCustomMapping_shouldEncodeAccordingToMapping() {
        // Arrange
        Soundex custom = new Soundex(Soundex.US_ENGLISH_MAPPING);

        // Act & Assert
        Assert.assertEquals("S530", custom.soundex("Smith"));
    }

    @Test
    public void maxLength_shouldGetAndSetCorrectly() {
        // Arrange & Act
        this.soundex.setMaxLength(6);

        // Assert
        Assert.assertEquals(6, this.soundex.getMaxLength());
    }
}
