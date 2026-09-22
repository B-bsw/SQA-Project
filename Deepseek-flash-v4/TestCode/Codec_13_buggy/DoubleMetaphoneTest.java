package org.apache.commons.codec.language;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;

public class DoubleMetaphoneTest {

    private DoubleMetaphone dm;

    @Before
    public void setUp() {
        dm = new DoubleMetaphone();
    }

    @After
    public void tearDown() {
        dm = null;
    }

    @Test
    public void testDefaultMaxCodeLen() {
        assertEquals(4, dm.getMaxCodeLen());
    }

    @Test
    public void testSetMaxCodeLen() {
        dm.setMaxCodeLen(8);
        assertEquals(8, dm.getMaxCodeLen());
        dm.setMaxCodeLen(0);
        assertEquals(0, dm.getMaxCodeLen());
    }

    @Test
    public void testDoubleMetaphoneNull() {
        assertNull(dm.doubleMetaphone(null));
        assertNull(dm.doubleMetaphone(null, true));
    }

    @Test
    public void testDoubleMetaphoneEmptyString() {
        assertEquals("", dm.doubleMetaphone(""));
        assertEquals("", dm.doubleMetaphone("   "));
        assertEquals("", dm.doubleMetaphone("", true));
    }

    @Test
    public void testDoubleMetaphoneBasic() {
        assertEquals("KN", dm.doubleMetaphone("knight"));
        assertEquals("T", dm.doubleMetaphone("Thomas"));
        assertEquals("PRS", dm.doubleMetaphone("Peters"));
        assertEquals("J", dm.doubleMetaphone("Jose"));
        assertEquals("J", dm.doubleMetaphone("Jose", true));
    }

    @Test
    public void testDoubleMetaphoneSpecialCases() {
        assertEquals("JL", dm.doubleMetaphone("Williams"));
        assertEquals("KK", dm.doubleMetaphone("cocoa"));
        assertEquals("FKR", dm.doubleMetaphone("Vacher"));
        assertEquals("XRT", dm.doubleMetaphone("Xavier"));
    }

    @Test
    public void testDoubleMetaphoneAlternate() {
        assertEquals("J", dm.doubleMetaphone("Jose", false));
        assertEquals("H", dm.doubleMetaphone("Jose", true));
        assertEquals("RK", dm.doubleMetaphone("Rock", false));
        assertEquals("RK", dm.doubleMetaphone("Rock", true));
    }

    @Test
    public void testEncodeString() {
        assertEquals("KN", dm.encode("knight"));
        assertEquals("PKR", dm.encode("Packer"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        assertEquals("T", dm.encode((Object) "Thomas"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNonString() throws EncoderException {
        dm.encode(new Integer(123));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(dm.isDoubleMetaphoneEqual("Smith", "Schmidt"));
        assertTrue(dm.isDoubleMetaphoneEqual("bob", "Bob"));
        assertFalse(dm.isDoubleMetaphoneEqual("bob", "smith"));
        assertTrue(dm.isDoubleMetaphoneEqual("Jose", "Jose", false));
        assertFalse(dm.isDoubleMetaphoneEqual("Jose", "Jose", true));
    }

    @Test
    public void testLengthLimit() {
        dm.setMaxCodeLen(2);
        assertEquals("KN", dm.doubleMetaphone("knight"));
        assertEquals("T", dm.doubleMetaphone("Thomas"));
    }

    @Test
    public void testBoundaryCases() {
        assertEquals("", dm.doubleMetaphone("a"));
        assertEquals("", dm.doubleMetaphone("e"));
        assertEquals("A", dm.doubleMetaphone("A"));
        assertEquals("B", dm.doubleMetaphone("B"));
    }

    @Test
    public void testVowelHandling() {
        assertEquals("FR", dm.doubleMetaphone("Fry"));
        assertEquals("SR", dm.doubleMetaphone("Sour"));
        assertEquals("PLR", dm.doubleMetaphone("Pillar"));
    }

    @Test
    public void testComplexWords() {
        assertEquals("SPRL", dm.doubleMetaphone("spherical"));
        assertEquals("TRL", dm.doubleMetaphone("trolley"));
        assertEquals("KKR", dm.doubleMetaphone("cockroach"));
    }

    @Test
    public void testSpecialLetterCombinations() {
        assertEquals("MNT", dm.doubleMetaphone("minute"));
        assertEquals("NTR", dm.doubleMetaphone("entertain"));
        assertEquals("RBM", dm.doubleMetaphone("rhythm"));
    }
}