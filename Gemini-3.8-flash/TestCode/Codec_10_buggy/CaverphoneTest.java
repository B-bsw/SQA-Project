package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.language.Caverphone;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for Caverphone 2.0 implementation.
 * Designed for legacy enterprise build environments (Java 1.4 - 7 compatible).
 */
public class CaverphoneTest {

    private Caverphone caverphone ;

    @Before
    public void setUp() {
        this.caverphone = new Caverphone();
    }

    // =========================================================================
    // 1. Instantiation & Basic Contract Tests
    // =========================================================================

    @Test
    public void caverphone_givenNewInstance_shouldBeNotNull() {
        // Arrange & Act
        Caverphone instance = new Caverphone();

        // Assert
        Assert.assertNotNull(instance);
    }

    // =========================================================================
    // 2. Boundary & Edge Cases (Null, Empty, Whitespace, Non-Alpha)
    // =========================================================================

    @Test
    public void caverphone_givenNullInput_shouldReturnTenOnes() {
        // Arrange
        String input = null;

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    @Test
    public void caverphone_givenEmptyString_shouldReturnTenOnes() {
        // Arrange
        String input = "";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    @Test
    public void caverphone_givenWhitespaceOnly_shouldReturnTenOnes() {
        // Arrange
        String input = "    ";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    @Test
    public void caverphone_givenNonAlphaCharactersOnly_shouldReturnTenOnes() {
        // Arrange
        String input = "1234567890!@#$%^&*()-_=+[]{}|;:'\",.<>/?`~";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    @Test
    public void caverphone_givenUppercaseInput_shouldMatchLowerCaseEncoding() {
        // Arrange
        String upper = "PETER";
        String lower = "peter";

        // Act
        String resultUpper = this.caverphone.caverphone(upper);
        String resultLower = this.caverphone.caverphone(lower);

        // Assert
        Assert.assertEquals(resultLower, resultUpper);
    }

    @Test
    public void caverphone_givenMixedAlphaAndSymbols_shouldStripNonAlphaAndEncode() {
        // Arrange
        String cleanInput = "peter";
        String dirtyInput = " p-e.t_e#r!123 ";

        // Act
        String cleanResult = this.caverphone.caverphone(cleanInput);
        String dirtyResult = this.caverphone.caverphone(dirtyInput);

        // Assert
        Assert.assertEquals(cleanResult, dirtyResult);
    }

    @Test
    public void caverphone_givenLongInputString_shouldTruncateToExactLengthTen() {
        // Arrange
        String longInput = "WashingtonianismAndSupercalifragilisticexpialidocious";

        // Act
        String result = this.caverphone.caverphone(longInput);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(10, result.length());
    }

    @Test
    public void caverphone_givenSingleCharacterInput_shouldPadWithOnesToLengthTen() {
        // Arrange
        String singleChar = "a";

        // Act
        String result = this.caverphone.caverphone(singleChar);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(10, result.length());
        Assert.assertEquals("A111111111", result);
    }

    // =========================================================================
    // 3. Phonetic Rule Branches Coverage
    // =========================================================================

    @Test
    public void caverphone_givenWordEndingWithE_shouldRemoveFinalE() {
        // Arrange & Act
        // "take" without 'e' -> "tak"
        String withE = this.caverphone.caverphone("take");
        String withoutE = this.caverphone.caverphone("tak");

        // Assert
        Assert.assertEquals(withoutE, withE);
    }

    @Test
    public void caverphone_givenWordStartingWithCough_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "cough";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("KF11111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithRough_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "rough";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("RF11111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithTough_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "tough";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("TF11111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithEnough_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "enough";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("ANF1111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithTrough_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "trough";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("TRF1111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithGn_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "gnat";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("NT11111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithMb_shouldHandlePrefixCorrectly() {
        // Arrange
        String input = "mbira";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("MRA1111111", result);
    }

    @Test
    public void caverphone_givenWordWithCq_shouldReplaceWith2q() {
        // Arrange
        String input = "acquire";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("AKA1111111", result);
    }

    @Test
    public void caverphone_givenWordWithCiCeCy_shouldReplaceWithSiSeSy() {
        // Arrange & Act
        String resultCi = this.caverphone.caverphone("cider");
        String resultCe = this.caverphone.caverphone("cedar");
        String resultCy = this.caverphone.caverphone("cyan");

        // Assert
        Assert.assertEquals("STA1111111", resultCi);
        Assert.assertEquals("STA1111111", resultCe);
        Assert.assertEquals("SN11111111", resultCy);
    }

    @Test
    public void caverphone_givenWordWithTch_shouldReplaceWith2ch() {
        // Arrange
        String input = "catch";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("KK11111111", result);
    }

    @Test
    public void caverphone_givenWordWithConsonantsCQX_shouldReplaceWithK() {
        // Arrange
        String inputC = "cat";
        String inputQ = "quick";
        String inputX = "box";

        // Act
        String resultC = this.caverphone.caverphone(inputC);
        String resultQ = this.caverphone.caverphone(inputQ);
        String resultX = this.caverphone.caverphone(inputX);

        // Assert
        Assert.assertEquals("KT11111111", resultC);
        Assert.assertEquals("KWK1111111", resultQ);
        Assert.assertEquals("PK11111111", resultX);
    }

    @Test
    public void caverphone_givenWordWithV_shouldReplaceWithF() {
        // Arrange
        String input = "van";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("FN11111111", result);
    }

    @Test
    public void caverphone_givenWordWithDg_shouldReplaceWith2g() {
        // Arrange
        String input = "edge";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("AK11111111", result);
    }

    @Test
    public void caverphone_givenWordWithTioAndTia_shouldReplaceWithSioAndSia() {
        // Arrange
        String inputTio = "nation";
        String inputTia = "spatial";

        // Act
        String resultTio = this.caverphone.caverphone(inputTio);
        String resultTia = this.caverphone.caverphone(inputTia);

        // Assert
        Assert.assertEquals("NSN1111111", resultTio);
        Assert.assertEquals("SPSA111111", resultTia);
    }

    @Test
    public void caverphone_givenWordWithD_shouldReplaceWithT() {
        // Arrange
        String input = "dan";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("TN11111111", result);
    }

    @Test
    public void caverphone_givenWordWithPh_shouldReplaceWithFh() {
        // Arrange
        String input = "phone";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("FN11111111", result);
    }

    @Test
    public void caverphone_givenWordWithB_shouldReplaceWithP() {
        // Arrange
        String input = "bat";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("PT11111111", result);
    }

    @Test
    public void caverphone_givenWordWithSh_shouldReplaceWithS2() {
        // Arrange
        String input = "ship";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("SP11111111", result);
    }

    @Test
    public void caverphone_givenWordWithZ_shouldReplaceWithS() {
        // Arrange
        String input = "zoo";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("SA11111111", result);
    }

    @Test
    public void caverphone_givenWordWithInitialAndInternalVowels_shouldHandleVowels() {
        // Arrange
        String input = "apple";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("APA1111111", result);
    }

    @Test
    public void caverphone_givenWordWithJ_shouldReplaceWithY() {
        // Arrange
        String input = "jam";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("YM11111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithYFollowedByVowel_shouldReplaceWithY3() {
        // Arrange
        String input = "yellow";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("YLA1111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithYFollowedByConsonant_shouldReplaceWithA() {
        // Arrange
        String input = "yvonne";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("AFN1111111", result);
    }

    @Test
    public void caverphone_givenWordWithYInMiddle_shouldReplaceWithThree() {
        // Arrange
        String input = "rhythm";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("TM11111111", result);
    }

    @Test
    public void caverphone_givenWordWithVowelGhVowel_shouldReplaceWith3kh3() {
        // Arrange
        String input = "spaghetti";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("SPKTA11111", result);
    }

    @Test
    public void caverphone_givenWordWithGhNotSurroundedByVowels_shouldReplaceWith22() {
        // Arrange
        String input = "night";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("NT11111111", result);
    }

    @Test
    public void caverphone_givenWordWithG_shouldReplaceWithK() {
        // Arrange
        String input = "gap";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("KP11111111", result);
    }

    @Test
    public void caverphone_givenConsecutiveIdenticalConsonants_shouldCollapseToOneUppercase() {
        // Arrange & Act
        String resultS = this.caverphone.caverphone("kiss");
        String resultT = this.caverphone.caverphone("little");
        String resultP = this.caverphone.caverphone("apple");
        String resultK = this.caverphone.caverphone("bookkeeper");
        String resultF = this.caverphone.caverphone("coffee");
        String resultM = this.caverphone.caverphone("summer");
        String resultN = this.caverphone.caverphone("dinner");

        // Assert
        Assert.assertEquals("KS11111111", resultS);
        Assert.assertEquals("LTA1111111", resultT);
        Assert.assertEquals("APA1111111", resultP);
        Assert.assertEquals("PKPA111111", resultK);
        Assert.assertEquals("KFA1111111", resultF);
        Assert.assertEquals("SMA1111111", resultM);
        Assert.assertEquals("TNA1111111", resultN);
    }

    @Test
    public void caverphone_givenWordWithWAndWhFollowedByVowel_shouldHandleWPrefixes() {
        // Arrange
        String inputWater = "water";
        String inputWhite = "white";

        // Act
        String resultWater = this.caverphone.caverphone(inputWater);
        String resultWhite = this.caverphone.caverphone(inputWhite);

        // Assert
        Assert.assertEquals("WTA1111111", resultWater);
        Assert.assertEquals("WT11111111", resultWhite);
    }

    @Test
    public void caverphone_givenWordWithWAtEnd_shouldReplaceWithThree() {
        // Arrange
        String input = "bow";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("PA11111111", result);
    }

    @Test
    public void caverphone_givenWordWithWFollowedByConsonant_shouldReplaceWithTwo() {
        // Arrange
        String input = "awkward";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("AKWT111111", result);
    }

    @Test
    public void caverphone_givenWordStartingWithH_shouldReplaceWithA() {
        // Arrange
        String input = "hill";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("ALA1111111", result);
    }

    @Test
    public void caverphone_givenWordWithHInMiddle_shouldReplaceWithTwo() {
        // Arrange
        String input = "ahead";

        // Act
        String result = this.caverphone.caverphone(input);

        // Assert
        Assert.assertEquals("AT11111111", result);
    }

    @Test
    public void caverphone_givenWordWithRVariations_shouldHandleR3TrailingRAndIntervocalicR() {
        // Arrange
        String inputR3 = "red";
        String inputTrailingR = "car";
        String inputOtherR = "dark";

        // Act
        String resultR3 = this.caverphone.caverphone(inputR3);
        String resultTrailingR = this.caverphone.caverphone(inputTrailingR);
        String resultOtherR = this.caverphone.caverphone(inputOtherR);

        // Assert
        Assert.assertEquals("RT11111111", resultR3);
        Assert.assertEquals("KA11111111", resultTrailingR);
        Assert.assertEquals("TK11111111", resultOtherR);
    }

    @Test
    public void caverphone_givenWordWithLVariations_shouldHandleL3TrailingLAndIntervocalicL() {
        // Arrange
        String inputL3 = "lip";
        String inputTrailingL = "call";
        String inputOtherL = "milk";

        // Act
        String resultL3 = this.caverphone.caverphone(inputL3);
        String resultTrailingL = this.caverphone.caverphone(inputTrailingL);
        String resultOtherL = this.caverphone.caverphone(inputOtherL);

        // Assert
        Assert.assertEquals("LP11111111", resultL3);
        Assert.assertEquals("KLA1111111", resultTrailingL);
        Assert.assertEquals("MK11111111", resultOtherL);
    }

    // =========================================================================
    // 4. StringEncoder Interface: encode(String) Tests
    // =========================================================================

    @Test
    public void encode_givenValidString_shouldReturnCaverphoneValue() {
        // Arrange
        String input = "Peter";

        // Act
        String result = this.caverphone.encode(input);

        // Assert
        Assert.assertEquals("PTA1111111", result);
        Assert.assertEquals(this.caverphone.caverphone(input), result);
    }

    @Test
    public void encode_givenNullString_shouldReturnTenOnes() {
        // Arrange
        String input = null;

        // Act
        String result = this.caverphone.encode(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    @Test
    public void encode_givenEmptyString_shouldReturnTenOnes() {
        // Arrange
        String input = "";

        // Act
        String result = this.caverphone.encode(input);

        // Assert
        Assert.assertEquals("1111111111", result);
    }

    // =========================================================================
    // 5. Encoder Interface: encode(Object) Tests & Exception Branches
    // =========================================================================

    @Test
    public void encode_givenStringObject_shouldReturnEncodedString() throws EncoderException {
        // Arrange
        Object input = "Stevenson";

        // Act
        Object result = this.caverphone.encode(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals("STFNSN1111", result);
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNullObject_shouldThrowEncoderException() throws EncoderException {
        // Arrange
        Object input = null;

        // Act
        this.caverphone.encode(input);

        // Assert - Expects EncoderException
    }

    @Test(expected = EncoderException.class)
    public void encode_givenIntegerObject_shouldThrowEncoderException() throws EncoderException {
        // Arrange
        Object input = new Integer(100);

        // Act
        this.caverphone.encode(input);

        // Assert - Expects EncoderException
    }

    @Test(expected = EncoderException.class)
    public void encode_givenBooleanObject_shouldThrowEncoderException() throws EncoderException {
        // Arrange
        Object input = Boolean.TRUE;

        // Act
        this.caverphone.encode(input);

        // Assert - Expects EncoderException
    }

    @Test
    public void encode_givenNonStringObject_shouldThrowEncoderExceptionWithExpectedMessage() {
        // Arrange
        Object input = new Object();

        // Act & Assert
        try {
            this.caverphone.encode(input);
            Assert.fail("Expected EncoderException was not thrown for non-String object");
        } catch (EncoderException e) {
            Assert.assertEquals("Parameter supplied to Caverphone encode is not of type java.lang.String", e.getMessage());
        }
    }

    // =========================================================================
    // 6. isCaverphoneEqual(String, String) Tests
    // =========================================================================

    @Test
    public void isCaverphoneEqual_givenIdenticalStrings_shouldReturnTrue() {
        // Arrange
        String str1 = "Peter";
        String str2 = "Peter";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenHomophones_shouldReturnTrue() {
        // Arrange
        String str1 = "Stevenson";
        String str2 = "Stephenson";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenHomophonesLeeAndLeigh_shouldReturnTrue() {
        // Arrange
        String str1 = "Lee";
        String str2 = "Leigh";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenDifferentCases_shouldReturnTrue() {
        // Arrange
        String str1 = "STEVENSON";
        String str2 = "stephenson";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenDistinctPhoneticWords_shouldReturnFalse() {
        // Arrange
        String str1 = "Peter";
        String str2 = "Smith";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertFalse(equal);
    }

    @Test
    public void isCaverphoneEqual_givenBothNull_shouldReturnTrue() {
        // Arrange
        String str1 = null;
        String str2 = null;

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenBothEmpty_shouldReturnTrue() {
        // Arrange
        String str1 = "";
        String str2 = "";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenOneNullAndOneEmpty_shouldReturnTrue() {
        // Arrange
        String str1 = null;
        String str2 = "";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isCaverphoneEqual_givenOneNullAndOneValidWord_shouldReturnFalse() {
        // Arrange
        String str1 = null;
        String str2 = "Peter";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertFalse(equal);
    }

    @Test
    public void isCaverphoneEqual_givenOneEmptyAndOneValidWord_shouldReturnFalse() {
        // Arrange
        String str1 = "";
        String str2 = "Peter";

        // Act
        boolean equal = this.caverphone.isCaverphoneEqual(str1, str2);

        // Assert
        Assert.assertFalse(equal);
    }
}
