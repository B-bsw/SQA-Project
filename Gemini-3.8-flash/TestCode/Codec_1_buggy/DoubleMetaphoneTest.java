package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Complete JUnit 4 Test Suite for DoubleMetaphone implementation.
 * Designed for legacy enterprise build environments (Java 1.4 - 7 compatible).
 */
public class DoubleMetaphoneTest {

    private DoubleMetaphone doubleMetaphone;

    @Before
    public void setUp() {
        this.doubleMetaphone = new DoubleMetaphone();
    }

    // =========================================================================
    // 1. Instantiation & MaxCodeLen Configuration Tests
    // =========================================================================

    @Test
    public void doubleMetaphone_givenDefaultInstance_shouldHaveDefaultMaxCodeLenFour() {
        // Arrange & Act
        DoubleMetaphone encoder = new DoubleMetaphone();

        // Assert
        Assert.assertNotNull(encoder);
        Assert.assertEquals(4, encoder.getMaxCodeLen());
    }

    @Test
    public void setMaxCodeLen_givenCustomLength_shouldUpdateMaxCodeLen() {
        // Arrange
        int customLen = 8;

        // Act
        this.doubleMetaphone.setMaxCodeLen(customLen);

        // Assert
        Assert.assertEquals(customLen, this.doubleMetaphone.getMaxCodeLen());
    }

    @Test
    public void doubleMetaphone_givenCustomMaxCodeLen_shouldProduceLongerCode() {
        // Arrange
        String input = "Washingtonian";
        this.doubleMetaphone.setMaxCodeLen(8);

        // Act
        String result = this.doubleMetaphone.doubleMetaphone(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result.length() > 4);
    }

    // =========================================================================
    // 2. Boundary & Edge Cases (Null, Empty, Whitespace, Bounds)
    // =========================================================================

    @Test
    public void doubleMetaphone_givenNullInput_shouldReturnNull() {
        // Arrange
        String input = null;

        // Act
        String result = this.doubleMetaphone.doubleMetaphone(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void doubleMetaphone_givenEmptyString_shouldReturnNull() {
        // Arrange
        String input = "";

        // Act
        String result = this.doubleMetaphone.doubleMetaphone(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void doubleMetaphone_givenWhitespaceOnly_shouldReturnNull() {
        // Arrange
        String input = "    ";

        // Act
        String result = this.doubleMetaphone.doubleMetaphone(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void doubleMetaphone_givenLeadingAndTrailingWhitespace_shouldCleanAndEncode() {
        // Arrange
        String cleanInput = "SMITH";
        String dirtyInput = "   smith   ";

        // Act
        String cleanResult = this.doubleMetaphone.doubleMetaphone(cleanInput);
        String dirtyResult = this.doubleMetaphone.doubleMetaphone(dirtyInput);

        // Assert
        Assert.assertEquals(cleanResult, dirtyResult);
    }

    @Test
    public void charAt_givenOutOfBoundsIndex_shouldReturnMinValue() {
        // Arrange
        String value = "TEST";

        // Act & Assert
        Assert.assertEquals(Character.MIN_VALUE, this.doubleMetaphone.charAt(value, -1));
        Assert.assertEquals(Character.MIN_VALUE, this.doubleMetaphone.charAt(value, 4));
        Assert.assertEquals('T', this.doubleMetaphone.charAt(value, 0));
        Assert.assertEquals('S', this.doubleMetaphone.charAt(value, 2));
    }

    @Test
    public void contains_givenOutOfBoundsCriteria_shouldReturnFalseSafely() {
        // Arrange
        String value = "TEST";
        String[] criteria = new String[] { "TE" };

        // Act & Assert
        Assert.assertFalse(DoubleMetaphone.contains(value, -1, 2, criteria));
        Assert.assertFalse(DoubleMetaphone.contains(value, 3, 2, criteria));
        Assert.assertTrue(DoubleMetaphone.contains(value, 0, 2, criteria));
    }

    // =========================================================================
    // 3. Silent Start Patterns
    // =========================================================================

    @Test
    public void doubleMetaphone_givenSilentStartWords_shouldSkipInitialSilentLetter() {
        // Arrange
        String gnWord = "GNAT";
        String knWord = "KNIGHT";
        String pnWord = "PNEUMONIA";
        String wrWord = "WRITE";
        String psWord = "PSYCHOLOGY";

        // Act & Assert
        Assert.assertEquals("NT", this.doubleMetaphone.doubleMetaphone(gnWord));
        Assert.assertEquals("NT", this.doubleMetaphone.doubleMetaphone(knWord));
        Assert.assertEquals("NMN", this.doubleMetaphone.doubleMetaphone(pnWord));
        Assert.assertEquals("RT", this.doubleMetaphone.doubleMetaphone(wrWord));
        Assert.assertEquals("SKLK", this.doubleMetaphone.doubleMetaphone(psWord));
    }

    // =========================================================================
    // 4. Special Characters & Vowels
    // =========================================================================

    @Test
    public void doubleMetaphone_givenSpecialLatinCharacters_shouldEncodeProperly() {
        // Arrange
        String cedillaWord = "\u00C7A"; // ÇA
        String eneWord = "\u00D1O";     // ÑO

        // Act
        String resultCedilla = this.doubleMetaphone.doubleMetaphone(cedillaWord);
        String resultEne = this.doubleMetaphone.doubleMetaphone(eneWord);

        // Assert
        Assert.assertEquals("S", resultCedilla);
        Assert.assertEquals("N", resultEne);
    }

    @Test
    public void doubleMetaphone_givenInitialVowelsVsInternalVowels_shouldHandleVowels() {
        // Arrange
        String initialVowel = "APPLE";
        String internalVowel = "B";

        // Act
        String resultInitial = this.doubleMetaphone.doubleMetaphone(initialVowel);
        String resultInternal = this.doubleMetaphone.doubleMetaphone(internalVowel);

        // Assert
        Assert.assertEquals("APL", resultInitial);
        Assert.assertEquals("P", resultInternal);
    }

    // =========================================================================
    // 5. Consonants: B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Z
    // =========================================================================

    @Test
    public void doubleMetaphone_givenBAndDoubleB_shouldEncodeToP() {
        // Arrange & Act
        String singleB = this.doubleMetaphone.doubleMetaphone("BABY");
        String doubleB = this.doubleMetaphone.doubleMetaphone("RABBIT");

        // Assert
        Assert.assertEquals("PP", singleB);
        Assert.assertEquals("RPT", doubleB);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfC_shouldEncodeCorrectly() {
        // Arrange & Act
        String caesar = this.doubleMetaphone.doubleMetaphone("CAESAR");
        String czernyPrimary = this.doubleMetaphone.doubleMetaphone("CZERNY", false);
        String czernyAlternate = this.doubleMetaphone.doubleMetaphone("CZERNY", true);
        String focaccia = this.doubleMetaphone.doubleMetaphone("FOCACCIA");
        String accident = this.doubleMetaphone.doubleMetaphone("ACCIDENT");
        String bacher = this.doubleMetaphone.doubleMetaphone("BACHER");
        String chia = this.doubleMetaphone.doubleMetaphone("CHIA");
        String michael = this.doubleMetaphone.doubleMetaphone("MICHAEL", true);
        String chemistry = this.doubleMetaphone.doubleMetaphone("CHEMISTRY");
        String chore = this.doubleMetaphone.doubleMetaphone("CHORE");
        String macCaffrey = this.doubleMetaphone.doubleMetaphone("MAC CAFFREY");

        // Assert
        Assert.assertEquals("SSR", caesar);
        Assert.assertEquals("SRN", czernyPrimary);
        Assert.assertEquals("XRN", czernyAlternate);
        Assert.assertEquals("FX", focaccia);
        Assert.assertEquals("AKST", accident);
        Assert.assertEquals("PKR", bacher);
        Assert.assertEquals("K", chia);
        Assert.assertEquals("MXL", michael);
        Assert.assertEquals("KMST", chemistry);
        Assert.assertEquals("XR", chore);
        Assert.assertEquals("MKFR", macCaffrey);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfD_shouldEncodeCorrectly() {
        // Arrange & Act
        String edge = this.doubleMetaphone.doubleMetaphone("EDGE");
        String edgar = this.doubleMetaphone.doubleMetaphone("EDGAR");
        String ladder = this.doubleMetaphone.doubleMetaphone("LADDER");
        String schmidt = this.doubleMetaphone.doubleMetaphone("SCHMIDT");

        // Assert
        Assert.assertEquals("AJ", edge);
        Assert.assertEquals("ATKR", edgar);
        Assert.assertEquals("LTR", ladder);
        Assert.assertEquals("XMT", schmidt);
    }

    @Test
    public void doubleMetaphone_givenFAndDoubleF_shouldEncodeToF() {
        // Arrange & Act
        String fat = this.doubleMetaphone.doubleMetaphone("FAT");
        String off = this.doubleMetaphone.doubleMetaphone("OFF");

        // Assert
        Assert.assertEquals("FT", fat);
        Assert.assertEquals("AF", off);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfG_shouldEncodeCorrectly() {
        // Arrange & Act
        String ghost = this.doubleMetaphone.doubleMetaphone("GHOST");
        String ghila = this.doubleMetaphone.doubleMetaphone("GHILA");
        String hugh = this.doubleMetaphone.doubleMetaphone("HUGH");
        String laugh = this.doubleMetaphone.doubleMetaphone("LAUGH");
        String agnesPrimary = this.doubleMetaphone.doubleMetaphone("AGNES", false);
        String agnesAlternate = this.doubleMetaphone.doubleMetaphone("AGNES", true);
        String tagliaroPrimary = this.doubleMetaphone.doubleMetaphone("TAGLIARO", false);
        String tagliaroAlternate = this.doubleMetaphone.doubleMetaphone("TAGLIARO", true);
        String gelPrimary = this.doubleMetaphone.doubleMetaphone("GEL", false);
        String gelAlternate = this.doubleMetaphone.doubleMetaphone("GEL", true);
        String dangerPrimary = this.doubleMetaphone.doubleMetaphone("DANGER", false);
        String dangerAlternate = this.doubleMetaphone.doubleMetaphone("DANGER", true);
        String biaggi = this.doubleMetaphone.doubleMetaphone("BIAGGI");
        String egg = this.doubleMetaphone.doubleMetaphone("EGG");

        // Assert
        Assert.assertEquals("KST", ghost);
        Assert.assertEquals("JL", ghila);
        Assert.assertEquals("H", hugh);
        Assert.assertEquals("LF", laugh);
        Assert.assertEquals("AKNS", agnesPrimary);
        Assert.assertEquals("ANS", agnesAlternate);
        Assert.assertEquals("TKLR", tagliaroPrimary);
        Assert.assertEquals("TLR", tagliaroAlternate);
        Assert.assertEquals("KL", gelPrimary);
        Assert.assertEquals("JL", gelAlternate);
        Assert.assertEquals("TNJR", dangerPrimary);
        Assert.assertEquals("TNKR", dangerAlternate);
        Assert.assertEquals("PJ", biaggi);
        Assert.assertEquals("AK", egg);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfH_shouldHandleVowelContexts() {
        // Arrange & Act
        String hair = this.doubleMetaphone.doubleMetaphone("HAIR");
        String ahead = this.doubleMetaphone.doubleMetaphone("AHEAD");
        String john = this.doubleMetaphone.doubleMetaphone("JOHN");

        // Assert
        Assert.assertEquals("AR", hair);
        Assert.assertEquals("AHT", ahead);
        Assert.assertEquals("JN", john);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfJ_shouldHandleSpanishAndSlavic() {
        // Arrange & Act
        String jose = this.doubleMetaphone.doubleMetaphone("JOSE");
        String sanJacinto = this.doubleMetaphone.doubleMetaphone("SAN JACINTO");
        String jumpPrimary = this.doubleMetaphone.doubleMetaphone("JUMP", false);
        String jumpAlternate = this.doubleMetaphone.doubleMetaphone("JUMP", true);
        String bajaPrimary = this.doubleMetaphone.doubleMetaphone("BAJA", false);
        String bajaAlternate = this.doubleMetaphone.doubleMetaphone("BAJA", true);

        // Assert
        Assert.assertEquals("HS", jose);
        Assert.assertEquals("SNHS", sanJacinto);
        Assert.assertEquals("JMP", jumpPrimary);
        Assert.assertEquals("AMP", jumpAlternate);
        Assert.assertEquals("PJ", bajaPrimary);
        Assert.assertEquals("PH", bajaAlternate);
    }

    @Test
    public void doubleMetaphone_givenKAndDoubleK_shouldEncodeToK() {
        // Arrange & Act
        String kick = this.doubleMetaphone.doubleMetaphone("KICK");
        String bookkeeper = this.doubleMetaphone.doubleMetaphone("BOOKKEEPER");

        // Assert
        Assert.assertEquals("KK", kick);
        Assert.assertEquals("PKPR", bookkeeper);
    }

    @Test
    public void doubleMetaphone_givenSpanishL0Condition_shouldProduceAlternateWithoutL() {
        // Arrange
        String armillo = "ARMILLO";

        // Act
        String primary = this.doubleMetaphone.doubleMetaphone(armillo, false);
        String alternate = this.doubleMetaphone.doubleMetaphone(armillo, true);

        // Assert
        Assert.assertEquals("ARML", primary);
        Assert.assertEquals("ARM", alternate.trim());
    }

    @Test
    public void doubleMetaphone_givenMAndThumbCondition_shouldHandleM0() {
        // Arrange & Act
        String summer = this.doubleMetaphone.doubleMetaphone("SUMMER");
        String thumb = this.doubleMetaphone.doubleMetaphone("THUMB");

        // Assert
        Assert.assertEquals("SMR", summer);
        Assert.assertEquals("0M", thumb);
    }

    @Test
    public void doubleMetaphone_givenNAndDoubleN_shouldEncodeToN() {
        // Arrange & Act
        String dinner = this.doubleMetaphone.doubleMetaphone("DINNER");

        // Assert
        Assert.assertEquals("TNR", dinner);
    }

    @Test
    public void doubleMetaphone_givenPAndPhAndCupboard_shouldEncodeCorrectly() {
        // Arrange & Act
        String phone = this.doubleMetaphone.doubleMetaphone("PHONE");
        String apple = this.doubleMetaphone.doubleMetaphone("APPLE");
        String cupboard = this.doubleMetaphone.doubleMetaphone("CUPBOARD");

        // Assert
        Assert.assertEquals("FN", phone);
        Assert.assertEquals("APL", apple);
        Assert.assertEquals("KPRT", cupboard);
    }

    @Test
    public void doubleMetaphone_givenQ_shouldEncodeToK() {
        // Arrange & Act
        String quick = this.doubleMetaphone.doubleMetaphone("QUICK");

        // Assert
        Assert.assertEquals("KK", quick);
    }

    @Test
    public void doubleMetaphone_givenFrenchRAtEnd_shouldProduceAlternateR() {
        // Arrange
        String didier = "DIDIER";

        // Act
        String primary = this.doubleMetaphone.doubleMetaphone(didier, false);
        String alternate = this.doubleMetaphone.doubleMetaphone(didier, true);

        // Assert
        Assert.assertEquals("TT", primary);
        Assert.assertEquals("TTR", alternate);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfS_shouldHandleIslandSugarSchool() {
        // Arrange & Act
        String island = this.doubleMetaphone.doubleMetaphone("ISLAND");
        String sugarPrimary = this.doubleMetaphone.doubleMetaphone("SUGAR", false);
        String sugarAlternate = this.doubleMetaphone.doubleMetaphone("SUGAR", true);
        String ship = this.doubleMetaphone.doubleMetaphone("SHIP");
        String asiaPrimary = this.doubleMetaphone.doubleMetaphone("ASIA", false);
        String asiaAlternate = this.doubleMetaphone.doubleMetaphone("ASIA", true);
        String school = this.doubleMetaphone.doubleMetaphone("SCHOOL");
        String schermerhorn = this.doubleMetaphone.doubleMetaphone("SCHERMERHORN");
        String science = this.doubleMetaphone.doubleMetaphone("SCIENCE");
        String resnaisAlternate = this.doubleMetaphone.doubleMetaphone("RESNAIS", true);

        // Assert
        Assert.assertEquals("ALNT", island);
        Assert.assertEquals("XKR", sugarPrimary);
        Assert.assertEquals("SKR", sugarAlternate);
        Assert.assertEquals("XP", ship);
        Assert.assertEquals("AS", asiaPrimary);
        Assert.assertEquals("AX", asiaAlternate);
        Assert.assertEquals("SKL", school);
        Assert.assertEquals("XRMR", schermerhorn);
        Assert.assertEquals("SNS", science);
        Assert.assertEquals("RSNS", resnaisAlternate);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfT_shouldHandleTionTiaTh() {
        // Arrange & Act
        String nation = this.doubleMetaphone.doubleMetaphone("NATION");
        String catchWord = this.doubleMetaphone.doubleMetaphone("CATCH");
        String spatial = this.doubleMetaphone.doubleMetaphone("SPATIAL");
        String thePrimary = this.doubleMetaphone.doubleMetaphone("THE", false);
        String theAlternate = this.doubleMetaphone.doubleMetaphone("THE", true);
        String thomas = this.doubleMetaphone.doubleMetaphone("THOMAS");

        // Assert
        Assert.assertEquals("NX", nation);
        Assert.assertEquals("KX", catchWord);
        Assert.assertEquals("SPX", spatial);
        Assert.assertEquals("0", thePrimary);
        Assert.assertEquals("T", theAlternate);
        Assert.assertEquals("TMS", thomas);
    }

    @Test
    public void doubleMetaphone_givenVAndDoubleV_shouldEncodeToF() {
        // Arrange & Act
        String van = this.doubleMetaphone.doubleMetaphone("VAN");

        // Assert
        Assert.assertEquals("FN", van);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfW_shouldHandleWassermanWhiteWicz() {
        // Arrange & Act
        String wassermanPrimary = this.doubleMetaphone.doubleMetaphone("WASSERMAN", false);
        String wassermanAlternate = this.doubleMetaphone.doubleMetaphone("WASSERMAN", true);
        String white = this.doubleMetaphone.doubleMetaphone("WHITE");
        String filipowiczPrimary = this.doubleMetaphone.doubleMetaphone("FILIPOWICZ", false);
        String filipowiczAlternate = this.doubleMetaphone.doubleMetaphone("FILIPOWICZ", true);
        String arnowAlternate = this.doubleMetaphone.doubleMetaphone("ARNOW", true);

        // Assert
        Assert.assertEquals("ASRM", wassermanPrimary);
        Assert.assertEquals("FSRM", wassermanAlternate);
        Assert.assertEquals("AT", white);
        Assert.assertEquals("FLPT", filipowiczPrimary);
        Assert.assertEquals("FLPF", filipowiczAlternate);
        Assert.assertEquals("ARNF", arnowAlternate);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfX_shouldHandleXavierBreaux() {
        // Arrange & Act
        String xavier = this.doubleMetaphone.doubleMetaphone("XAVIER");
        String breaux = this.doubleMetaphone.doubleMetaphone("BREAUX");
        String box = this.doubleMetaphone.doubleMetaphone("BOX");

        // Assert
        Assert.assertEquals("SF", xavier);
        Assert.assertEquals("PR", breaux);
        Assert.assertEquals("PKS", box);
    }

    @Test
    public void doubleMetaphone_givenSpecialCasesOfZ_shouldHandleChineseAndGermanic() {
        // Arrange & Act
        String zhao = this.doubleMetaphone.doubleMetaphone("ZHAO");
        String zurich = this.doubleMetaphone.doubleMetaphone("ZURICH");

        // Assert
        Assert.assertEquals("J", zhao);
        Assert.assertEquals("SRK", zurich);
    }

    // =========================================================================
    // 6. StringEncoder Interface: encode(String) & encode(Object)
    // =========================================================================

    @Test
    public void encode_givenString_shouldDelegateToDoubleMetaphone() {
        // Arrange
        String input = "Smith";

        // Act
        String result = this.doubleMetaphone.encode(input);

        // Assert
        Assert.assertEquals("SM0", result);
        Assert.assertEquals(this.doubleMetaphone.doubleMetaphone(input), result);
    }

    @Test
    public void encode_givenStringObject_shouldReturnEncodedObject() throws EncoderException {
        // Arrange
        Object input = "Smith";

        // Act
        Object result = this.doubleMetaphone.encode(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof String);
        Assert.assertEquals("SM0", result);
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNullObject_shouldThrowEncoderException() throws EncoderException {
        // Arrange
        Object input = null;

        // Act
        this.doubleMetaphone.encode(input);

        // Assert - Expects EncoderException
    }

    @Test(expected = EncoderException.class)
    public void encode_givenNonStringObject_shouldThrowEncoderException() throws EncoderException {
        // Arrange
        Object input = new Integer(100);

        // Act
        this.doubleMetaphone.encode(input);

        // Assert - Expects EncoderException
    }

    @Test
    public void encode_givenNonStringObject_shouldThrowEncoderExceptionWithDetailedMessage() {
        // Arrange
        Object input = new Object();

        // Act & Assert
        try {
            this.doubleMetaphone.encode(input);
            Assert.fail("Expected EncoderException was not thrown for non-String object");
        } catch (EncoderException e) {
            Assert.assertEquals("DoubleMetaphone encode parameter is not of type String", e.getMessage());
        }
    }

    // =========================================================================
    // 7. isDoubleMetaphoneEqual Tests
    // =========================================================================

    @Test
    public void isDoubleMetaphoneEqual_givenHomophones_shouldReturnTrue() {
        // Arrange
        String val1 = "Smith";
        String val2 = "Smyth";

        // Act
        boolean equal = this.doubleMetaphone.isDoubleMetaphoneEqual(val1, val2);

        // Assert
        Assert.assertTrue(equal);
    }

    @Test
    public void isDoubleMetaphoneEqual_givenDifferentWords_shouldReturnFalse() {
        // Arrange
        String val1 = "Peter";
        String val2 = "Smith";

        // Act
        boolean equal = this.doubleMetaphone.isDoubleMetaphoneEqual(val1, val2);

        // Assert
        Assert.assertFalse(equal);
    }

    @Test
    public void isDoubleMetaphoneEqual_givenAlternateComparison_shouldCompareAlternateCodes() {
        // Arrange
        String val1 = "Wasserman";
        String val2 = "Vasserman";

        // Act
        boolean equalAlternate = this.doubleMetaphone.isDoubleMetaphoneEqual(val1, val2, true);

        // Assert
        Assert.assertTrue(equalAlternate);
    }

    @Test
    public void isDoubleMetaphoneEqual_givenSecondValueNull_shouldReturnFalse() {
        // Arrange
        String val1 = "Smith";
        String val2 = null;

        // Act
        boolean equal = this.doubleMetaphone.isDoubleMetaphoneEqual(val1, val2);

        // Assert
        Assert.assertFalse(equal);
    }

    @Test(expected = NullPointerException.class)
    public void isDoubleMetaphoneEqual_givenFirstValueNull_shouldThrowNullPointerException() {
        // Arrange
        String val1 = null;
        String val2 = "Smith";

        // Act
        this.doubleMetaphone.isDoubleMetaphoneEqual(val1, val2);

        // Assert - Expects NullPointerException because doubleMetaphone(null) is null and .equals() is invoked
    }

    // =========================================================================
    // 8. Inner Class DoubleMetaphoneResult Direct Branch Tests
    // =========================================================================

    @Test
    public void doubleMetaphoneResult_givenAppends_shouldManageBuffersAndTruncation() {
        // Arrange
        DoubleMetaphone.DoubleMetaphoneResult result = this.doubleMetaphone.new DoubleMetaphoneResult(4);

        // Act: test initial state
        Assert.assertEquals("", result.getPrimary());
        Assert.assertEquals("", result.getAlternate());
        Assert.assertFalse(result.isComplete());

        // Act: append chars
        result.append('A');
        result.append('B', 'C');
        Assert.assertEquals("AB", result.getPrimary());
        Assert.assertEquals("AC", result.getAlternate());

        // Act: append strings with length exceeding remaining capacity (covers truncation else-branch)
        result.append("XYZ", "123");

        // Assert
        Assert.assertEquals("ABXY", result.getPrimary());
        Assert.assertEquals("AC12", result.getAlternate());
        Assert.assertTrue(result.isComplete());

        // Act: append when already complete (should not append further)
        result.append('Z');
        result.appendPrimary('Z');
        result.appendAlternate('Z');
        result.append("ZZZ");
        result.appendPrimary("ZZZ");
        result.appendAlternate("ZZZ");

        // Assert
        Assert.assertEquals("ABXY", result.getPrimary());
        Assert.assertEquals("AC12", result.getAlternate());
    }
}
