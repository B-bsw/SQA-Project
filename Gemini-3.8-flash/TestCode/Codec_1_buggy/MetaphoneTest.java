package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MetaphoneTest {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        this.metaphone = new Metaphone();
    }

    @Test
    public void metaphone_givenNullOrEmpty_shouldReturnEmptyString() {
        // Arrange & Act & Assert
        Assert.assertEquals("", this.metaphone.metaphone(null));
        Assert.assertEquals("", this.metaphone.metaphone(""));
    }

    @Test
    public void metaphone_givenSingleChar_shouldReturnUppercaseChar() {
        // Arrange & Act & Assert
        Assert.assertEquals("A", this.metaphone.metaphone("a"));
        Assert.assertEquals("Z", this.metaphone.metaphone("Z"));
    }

    @Test
    public void metaphone_givenKnGn_shouldDropInitialSilentLetter() {
        // Arrange & Act & Assert
        Assert.assertEquals("N", this.metaphone.metaphone("KN"));
        Assert.assertEquals("N", this.metaphone.metaphone("GN"));
        Assert.assertEquals("N", this.metaphone.metaphone("PN"));
        Assert.assertEquals("N", this.metaphone.metaphone("AE"));
        Assert.assertEquals("R", this.metaphone.metaphone("WR"));
    }

    @Test
    public void metaphone_givenWh_shouldTransformToW() {
        // Arrange & Act & Assert
        Assert.assertEquals("W", this.metaphone.metaphone("WH"));
        Assert.assertEquals("W", this.metaphone.metaphone("WHITE").substring(0, 1));
    }

    @Test
    public void metaphone_givenX_shouldTransformToS() {
        // Arrange & Act & Assert
        Assert.assertEquals("S", this.metaphone.metaphone("X"));
        Assert.assertEquals("S", this.metaphone.metaphone("Xavier").substring(0, 1));
    }

    @Test
    public void metaphone_givenVariousNames_shouldEncodeExpectedly() {
        // Arrange & Act & Assert
        Assert.assertEquals("SM0", this.metaphone.metaphone("Smith"));
        Assert.assertEquals("SN0", this.metaphone.metaphone("Smyth"));
        Assert.assertEquals("JNX", this.metaphone.metaphone("Jones"));
        Assert.assertEquals("WLSN", this.metaphone.metaphone("Wilson"));
    }

    @Test
    public void metaphone_givenMaxCodeLen_shouldTruncateToMaxLength() {
        // Arrange
        this.metaphone.setMaxCodeLen(2);

        // Act
        String result = this.metaphone.metaphone("Washington");

        // Assert
        Assert.assertEquals(2, result.length());
        Assert.assertEquals(2, this.metaphone.getMaxCodeLen());
    }

    @Test
    public void encode_givenValidString_shouldReturnMetaphoneCode() throws Exception {
        // Arrange & Act
        Object result = this.metaphone.encode("Smith");

        // Assert
        Assert.assertEquals("SM0", result);
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonStringObject_shouldThrowEncoderException() throws Exception {
        // Arrange & Act & Assert
        this.metaphone.encode(new Integer(123));
    }

    @Test
    public void isMetaphoneEqual_givenMatchingWords_shouldReturnTrue() {
        // Arrange & Act & Assert
        Assert.assertTrue(this.metaphone.isMetaphoneEqual("Smith", "Schmidt"));
        Assert.assertTrue(this.metaphone.isMetaphoneEqual("white", "whyt"));
    }

    @Test
    public void isMetaphoneEqual_givenDifferentWords_shouldReturnFalse() {
        // Arrange & Act & Assert
        Assert.assertFalse(this.metaphone.isMetaphoneEqual("Smith", "Jones"));
        Assert.assertFalse(this.metaphone.isMetaphoneEqual("", "TCH"));
    }
}
