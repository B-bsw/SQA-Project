package org.apache.commons.codec.language;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.apache.commons.codec.EncoderException;
import org.junit.Before;
import org.junit.Test;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    @Test
    public void testNullInput() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testEmptyInput() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testNonAlphaInput() {
        // All characters removed, results in same code as empty string
        assertEquals("1111111111", caverphone.caverphone("12345"));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("A111111111", caverphone.caverphone("a"));
    }

    @Test
    public void testCoughStart() {
        assertEquals("KF11111111", caverphone.caverphone("cough"));
    }

    @Test
    public void testGnStart() {
        assertEquals("NT11111111", caverphone.caverphone("gnat"));
    }

    @Test
    public void testMbStart() {
        assertEquals("MT11111111", caverphone.caverphone("mbat"));
    }

    @Test
    public void testTchReplacement() {
        assertEquals("WK11111111", caverphone.caverphone("watch"));
    }

    @Test
    public void testPhReplacementAndFinalERemoval() {
        assertEquals("FN11111111", caverphone.caverphone("phone"));
    }

    @Test
    public void testHStartReplacement() {
        assertEquals("AS11111111", caverphone.caverphone("house"));
    }

    @Test
    public void testBReplacementAndDoubleVowel() {
        assertEquals("PK11111111", caverphone.caverphone("book"));
    }

    @Test
    public void testDoubleConsonantCollapseAndTrailingVowelRule() {
        assertEquals("APA1111111", caverphone.caverphone("hobby"));
    }

    @Test
    public void testYStartReplacement() {
        assertEquals("YK11111111", caverphone.caverphone("york"));
    }

    @Test
    public void testNormalWordPeter() {
        assertEquals("PTA1111111", caverphone.caverphone("Peter"));
    }

    @Test
    public void testUpperCaseInputEqualsLowerCase() {
        assertEquals(caverphone.caverphone("Peter"), caverphone.caverphone("PETER"));
    }

    @Test
    public void testIsCaverphoneEqualTrue() {
        assertTrue(caverphone.isCaverphoneEqual("Thompson", "Tompson"));
    }

    @Test
    public void testIsCaverphoneEqualFalse() {
        assertFalse(caverphone.isCaverphoneEqual("Peter", "Smith"));
    }

    @Test
    public void testEncodeString() {
        String result = caverphone.encode("Peter");
        assertNotNull(result);
        assertEquals("PTA1111111", result);
    }

    @Test
    public void testEncodeObjectSuccess() throws EncoderException {
        Object result = caverphone.encode((Object) "Peter");
        assertNotNull(result);
        assertEquals("PTA1111111", result);
    }

    @Test
    public void testEncodeObjectWithNullString() throws EncoderException {
        Object result = caverphone.encode((Object) null == null ? (Object) null : "x");
        // encode(null) as Object is not a String instance check path;
        // but null itself would throw EncoderException since it's not instanceof String
        try {
            caverphone.encode((Object) null);
            fail("Expected EncoderException for null object");
        } catch (EncoderException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectException() throws EncoderException {
        caverphone.encode(new Integer(5));
    }

    @Test
    public void testResultLengthIsAlwaysTen() {
        assertEquals(10, caverphone.caverphone("Thompson").length());
        assertEquals(10, caverphone.caverphone("a").length());
        assertEquals(10, caverphone.caverphone("").length());
        assertEquals(10, caverphone.caverphone("Supercalifragilisticexpialidocious").length());
    }

    @Test
    public void testLongWordTruncation() {
        String result = caverphone.caverphone("Supercalifragilisticexpialidocious");
        assertNotNull(result);
        assertEquals(10, result.length());
    }
}