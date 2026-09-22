package org.apache.commons.codec.language;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class CaverphoneTest {

    private Caverphone caverphone;

    @Before
    public void setUp() {
        caverphone = new Caverphone();
    }

    @Test
    public void testCaverphoneNullInput() {
        assertEquals("1111111111", caverphone.caverphone(null));
    }

    @Test
    public void testCaverphoneEmptyString() {
        assertEquals("1111111111", caverphone.caverphone(""));
    }

    @Test
    public void testCaverphoneBasicLowerCase() {
        assertEquals("1111111111", caverphone.caverphone("a"));
    }

    @Test
    public void testCaverphoneRemoveNonAlphabeticCharacters() {
        assertEquals("1111111111", caverphone.caverphone("a1b2c3!@#"));
    }

    @Test
    public void testCaverphoneCoughStart() {
        assertEquals("1111111111", caverphone.caverphone("cough"));
    }

    @Test
    public void testCaverphoneRoughStart() {
        assertEquals("1111111111", caverphone.caverphone("rough"));
    }

    @Test
    public void testCaverphoneToughStart() {
        assertEquals("1111111111", caverphone.caverphone("tough"));
    }

    @Test
    public void testCaverphoneEnoughStart() {
        assertEquals("1111111111", caverphone.caverphone("enough"));
    }

    @Test
    public void testCaverphoneTroughStart() {
        assertEquals("1111111111", caverphone.caverphone("trough"));
    }

    @Test
    public void testCaverphoneGnStart() {
        assertEquals("1111111111", caverphone.caverphone("gnome"));
    }

    @Test
    public void testCaverphoneMbStart() {
        assertEquals("1111111111", caverphone.caverphone("mbira"));
    }

    @Test
    public void testCaverphoneCqReplacement() {
        assertEquals("1111111111", caverphone.caverphone("acquire"));
    }

    @Test
    public void testCaverphoneCiReplacement() {
        assertEquals("1111111111", caverphone.caverphone("cinder"));
    }

    @Test
    public void testCaverphoneCeReplacement() {
        assertEquals("1111111111", caverphone.caverphone("center"));
    }

    @Test
    public void testCaverphoneCyReplacement() {
        assertEquals("1111111111", caverphone.caverphone("cycle"));
    }

    @Test
    public void testCaverphoneTchReplacement() {
        assertEquals("1111111111", caverphone.caverphone("watch"));
    }

    @Test
    public void testCaverphoneCReplacement() {
        assertEquals("1111111111", caverphone.caverphone("car"));
    }

    @Test
    public void testCaverphoneQReplacement() {
        assertEquals("1111111111", caverphone.caverphone("quick"));
    }

    @Test
    public void testCaverphoneXReplacement() {
        assertEquals("1111111111", caverphone.caverphone("box"));
    }

    @Test
    public void testCaverphoneVReplacement() {
        assertEquals("1111111111", caverphone.caverphone("van"));
    }

    @Test
    public void testCaverphoneDgReplacement() {
        assertEquals("1111111111", caverphone.caverphone("edge"));
    }

    @Test
    public void testCaverphoneTioReplacement() {
        assertEquals("1111111111", caverphone.caverphone("nation"));
    }

    @Test
    public void testCaverphoneTiaReplacement() {
        assertEquals("1111111111", caverphone.caverphone("spatial"));
    }

    @Test
    public void testCaverphoneDReplacement() {
        assertEquals("1111111111", caverphone.caverphone("dog"));
    }

    @Test
    public void testCaverphonePhReplacement() {
        assertEquals("1111111111", caverphone.caverphone("phone"));
    }

    @Test
    public void testCaverphoneBReplacement() {
        assertEquals("1111111111", caverphone.caverphone("bat"));
    }

    @Test
    public void testCaverphoneShReplacement() {
        assertEquals("1111111111", caverphone.caverphone("ship"));
    }

    @Test
    public void testCaverphoneZReplacement() {
        assertEquals("1111111111", caverphone.caverphone("zebra"));
    }

    @Test
    public void testCaverphoneVowelStart() {
        assertEquals("1111111111", caverphone.caverphone("apple"));
    }

    @Test
    public void testCaverphoneVowelMiddle() {
        assertEquals("1111111111", caverphone.caverphone("cat"));
    }

    @Test
    public void testCaverphoneJReplacement() {
        assertEquals("1111111111", caverphone.caverphone("jump"));
    }

    @Test
    public void testCaverphoneY3Handling() {
        assertEquals("1111111111", caverphone.caverphone("yacht"));
    }

    @Test
    public void testCaverphoneYStart() {
        assertEquals("1111111111", caverphone.caverphone("yes"));
    }

    @Test
    public void testCaverphoneYMiddle() {
        assertEquals("1111111111", caverphone.caverphone("beyond"));
    }

    @Test
    public void testCaverphoneGh3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("laugh3"));
    }

    @Test
    public void testCaverphoneGhReplacement() {
        assertEquals("1111111111", caverphone.caverphone("roughg"));
    }

    @Test
    public void testCaverphoneGReplacement() {
        assertEquals("1111111111", caverphone.caverphone("goat"));
    }

    @Test
    public void testCaverphoneMultipleSReplacement() {
        assertEquals("1111111111", caverphone.caverphone("ssss"));
    }

    @Test
    public void testCaverphoneMultipleTReplacement() {
        assertEquals("1111111111", caverphone.caverphone("tttt"));
    }

    @Test
    public void testCaverphoneMultiplePReplacement() {
        assertEquals("1111111111", caverphone.caverphone("pppp"));
    }

    @Test
    public void testCaverphoneMultipleKReplacement() {
        assertEquals("1111111111", caverphone.caverphone("kkkk"));
    }

    @Test
    public void testCaverphoneMultipleFReplacement() {
        assertEquals("1111111111", caverphone.caverphone("ffff"));
    }

    @Test
    public void testCaverphoneMultipleMReplacement() {
        assertEquals("1111111111", caverphone.caverphone("mmmm"));
    }

    @Test
    public void testCaverphoneMultipleNReplacement() {
        assertEquals("1111111111", caverphone.caverphone("nnnn"));
    }

    @Test
    public void testCaverphoneW3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("cow3"));
    }

    @Test
    public void testCaverphoneWh3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("wh3ale"));
    }

    @Test
    public void testCaverphoneWEndReplacement() {
        assertEquals("1111111111", caverphone.caverphone("cow"));
    }

    @Test
    public void testCaverphoneWReplacement() {
        assertEquals("1111111111", caverphone.caverphone("wagon"));
    }

    @Test
    public void testCaverphoneHStartReplacement() {
        assertEquals("1111111111", caverphone.caverphone("hello"));
    }

    @Test
    public void testCaverphoneHReplacement() {
        assertEquals("1111111111", caverphone.caverphone("hat"));
    }

    @Test
    public void testCaverphoneR3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("car3"));
    }

    @Test
    public void testCaverphoneREndReplacement() {
        assertEquals("1111111111", caverphone.caverphone("car"));
    }

    @Test
    public void testCaverphoneRReplacement() {
        assertEquals("1111111111", caverphone.caverphone("run"));
    }

    @Test
    public void testCaverphoneL3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("lal3"));
    }

    @Test
    public void testCaverphoneLEndReplacement() {
        assertEquals("1111111111", caverphone.caverphone("all"));
    }

    @Test
    public void testCaverphoneLReplacement() {
        assertEquals("1111111111", caverphone.caverphone("land"));
    }

    @Test
    public void testCaverphoneRemove2Replacement() {
        assertEquals("1111111111", caverphone.caverphone("2abc"));
    }

    @Test
    public void testCaverphoneRemove3EndA() {
        assertEquals("1111111111", caverphone.caverphone("abc3"));
    }

    @Test
    public void testCaverphoneRemove3Replacement() {
        assertEquals("1111111111", caverphone.caverphone("ab3cd"));
    }

    @Test
    public void testCaverphoneLongString() {
        String result = caverphone.caverphone("this is a very long string with many characters");
        assertEquals(10, result.length());
    }

    @Test
    public void testCaverphoneTenOnesSuffix() {
        String result = caverphone.caverphone("a");
        assertTrue(result.endsWith("1111111111"));
    }

    @Test
    public void testCaverphoneTruncatedToTen() {
        String result = caverphone.caverphone("abcdefghijklmnopqrstuvwxyz");
        assertEquals(10, result.length());
    }

    @Test
    public void testEncodeString() {
        assertEquals(caverphone.caverphone("test"), caverphone.encode("test"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeNonStringObject() throws EncoderException {
        caverphone.encode(new Integer(1));
    }

    @Test
    public void testEncodeStringObject() throws EncoderException {
        String result = (String) caverphone.encode((Object) "test");
        assertEquals(caverphone.caverphone("test"), result);
    }

    @Test
    public void testIsCaverphoneEqualSameStrings() {
        assertTrue(caverphone.isCaverphoneEqual("hello", "hello"));
    }

    @Test
    public void testIsCaverphoneEqualDifferentStrings() {
        assertFalse(caverphone.isCaverphoneEqual("hello", "world"));
    }

    @Test
    public void testIsCaverphoneEqualCaseInsensitive() {
        assertTrue(caverphone.isCaverphoneEqual("Hello", "hello"));
    }

    @Test
    public void testCaverphoneMixedCaseInput() {
        assertEquals(caverphone.caverphone("Hello"), caverphone.caverphone("hello"));
    }

    @Test
    public void testCaverphoneSpecialCharactersOnly() {
        assertEquals("1111111111", caverphone.caverphone("!@#$%^&*()"));
    }

    @Test
    public void testCaverphoneRemoveFinalE() {
        assertEquals(caverphone.caverphone("make"), caverphone.caverphone("mak"));
    }

    @Test
    public void testCaverphoneWh3ReplacementEdge() {
        String result = caverphone.caverphone("wh3");
        assertTrue(result.length() == 10);
    }

    @Test
    public void testCaverphoneY3ReplacementEdge() {
        String result = caverphone.caverphone("y3");
        assertTrue(result.length() == 10);
    }
}