package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class MetaphoneTest {

    private Metaphone metaphone;

    @Before
    public void setUp() {
        metaphone = new Metaphone();
    }

    @After
    public void tearDown() {
        metaphone = null;
    }

    @Test
    public void testMetaphoneBasic() {
        assertEquals("K", metaphone.metaphone("K"));
        assertEquals("", metaphone.metaphone(""));
        assertEquals("", metaphone.metaphone(null));
    }

    @Test
    public void testMetaphoneCalc() {
        assertEquals("KSM", metaphone.metaphone("cosmos"));
        assertEquals("TNF", metaphone.metaphone("dumb"));
        assertEquals("TNK", metaphone.metaphone("tonk"));
        assertEquals("", metaphone.metaphone(" "));
    }

    @Test
    public void testMetaphoneSingleChar() {
        assertEquals("A", metaphone.metaphone("a"));
        assertEquals("B", metaphone.metaphone("b"));
        assertEquals("C", metaphone.metaphone("c"));
    }

    @Test
    public void testMetaphoneDoubleVowels() {
        assertEquals("AE", metaphone.metaphone("ae"));
        assertEquals("W", metaphone.metaphone("wh"));
        assertEquals("R", metaphone.metaphone("wr"));
    }

    @Test
    public void testMetaphoneKN() {
        assertEquals("N", metaphone.metaphone("kn"));
        assertEquals("N", metaphone.metaphone("gn"));
        assertEquals("N", metaphone.metaphone("pn"));
    }

    @Test
    public void testMetaphoneX() {
        assertEquals("S", metaphone.metaphone("x"));
        assertEquals("SST", metaphone.metaphone("xstacy"));
    }

    @Test
    public void testMetaphoneSilentH() {
        assertEquals("LT", metaphone.metaphone("light"));
        assertEquals("TH", metaphone.metaphone("think"));
    }

    @Test
    public void testMetaphoneRegionMatch() {
        assertEquals("KS", metaphone.metaphone("CIA"));
        assertEquals("S", metaphone.metaphone("SH"));
        assertEquals("SK", metaphone.metaphone("SCH"));
    }

    @Test
    public void testMetaphoneG() {
        assertEquals("J", metaphone.metaphone("GEM"));
        assertEquals("K", metaphone.metaphone("GUN"));
        assertEquals("NK", metaphone.metaphone("GNOME"));
    }

    @Test
    public void testMetaphoneC() {
        assertEquals("K", metaphone.metaphone("CAT"));
        assertEquals("S", metaphone.metaphone("CITY"));
        assertEquals("K", metaphone.metaphone("CYCLE"));
    }

    @Test
    public void testMetaphoneTCH() {
        assertEquals("TCH", metaphone.metaphone("TCH"));
        assertEquals("K", metaphone.metaphone("TCHAI"));
    }

    @Test
    public void testMetaphoneDGE() {
        assertEquals("J", metaphone.metaphone("DGE"));
        assertEquals("JT", metaphone.metaphone("DGET"));
    }

    @Test
    public void testEncodeString() {
        assertEquals("KSM", metaphone.encode("cosmos"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        assertEquals("KSM", metaphone.encode((Object) "cosmos"));
        try {
            metaphone.encode((Object) new Integer(123));
            fail("Should have thrown EncoderException");
        } catch (EncoderException e) {
            // expected
        }
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNonString() throws EncoderException {
        metaphone.encode(new Integer(123));
    }

    @Test
    public void testIsMetaphoneEqual() {
        assertTrue(metaphone.isMetaphoneEqual("cosmos", "cosmo"));
        assertFalse(metaphone.isMetaphoneEqual("light", "right"));
    }

    @Test
    public void testMaxCodeLen() {
        assertEquals(4, metaphone.getMaxCodeLen());
        metaphone.setMaxCodeLen(5);
        assertEquals(5, metaphone.getMaxCodeLen());
        String result = metaphone.metaphone("important");
        assertEquals(5, result.length());
    }

    @Test
    public void testPhonetics() {
        assertEquals(metaphone.metaphone("their"), metaphone.metaphone("there"));
        assertEquals(metaphone.metaphone("write"), metaphone.metaphone("right"));
        assertTrue(metaphone.isMetaphoneEqual("phone", "fone"));
    }

    @Test
    public void testBoundary() {
        assertEquals(4, metaphone.metaphone("aaaaaaaaaa").length());
        metaphone.setMaxCodeLen(6);
        assertEquals(6, metaphone.metaphone("aaaaaaaaaa").length());
        metaphone.setMaxCodeLen(4);
    }

    @Test
    public void testEmptyAndWhitespace() {
        assertEquals("", metaphone.metaphone("   "));
    }

    @Test
    public void testSilentLetters() {
        assertEquals("KN", metaphone.metaphone("knight"));
        assertEquals("SG", metaphone.metaphone("sign"));
    }
}