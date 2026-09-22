package org.apache.commons.codec.language;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import org.apache.commons.codec.EncoderException;

public class DoubleMetaphoneTest {
    private DoubleMetaphone dm;

    @Before
    public void setUp() {
        dm = new DoubleMetaphone();
    }

    @Test
    public void testDefaultMaxCodeLen() {
        assertEquals(4, dm.getMaxCodeLen());
    }

    @Test
    public void testSetMaxCodeLen() {
        dm.setMaxCodeLen(8);
        assertEquals(8, dm.getMaxCodeLen());
    }

    @Test
    public void testSetMaxCodeLenBoundary() {
        dm.setMaxCodeLen(1);
        assertEquals(1, dm.getMaxCodeLen());
        dm.setMaxCodeLen(0);
        assertEquals(0, dm.getMaxCodeLen());
    }

    @Test
    public void testDoubleMetaphoneNullInput() {
        assertNull(dm.doubleMetaphone(null));
        assertNull(dm.doubleMetaphone(null, true));
    }

    @Test
    public void testDoubleMetaphoneEmptyString() {
        assertNull(dm.doubleMetaphone(""));
        assertNull(dm.doubleMetaphone("   "));
        assertNull(dm.doubleMetaphone("", true));
    }

    @Test
    public void testDoubleMetaphoneSingleChar() {
        assertEquals("A", dm.doubleMetaphone("A"));
        assertEquals("A", dm.doubleMetaphone("a"));
    }

    @Test
    public void testDoubleMetaphoneBasicWords() {
        assertEquals("JST", dm.doubleMetaphone("Joseph"));
        assertEquals("JST", dm.doubleMetaphone("Josef"));
        assertEquals("PRK", dm.doubleMetaphone("Park"));
        assertEquals("RK", dm.doubleMetaphone("Rock"));
    }

    @Test
    public void testDoubleMetaphoneAlternate() {
        assertNotEquals(dm.doubleMetaphone("Zed"), dm.doubleMetaphone("Zed"));
        assertNotNull(dm.doubleMetaphone("Zed", true));
    }

    @Test
    public void testEncodeObjectValid() throws EncoderException {
        Object result = dm.encode("Smith");
        assertEquals("SM0", result);
        assertEquals("SM0", dm.encode((Object) "Smith"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalidType() throws EncoderException {
        dm.encode(new Integer(123));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectNull() throws EncoderException {
        dm.encode(null);
    }

    @Test
    public void testEncodeString() {
        assertEquals("SM0", dm.encode("Smith"));
        assertNull(dm.encode((String) null));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(dm.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertTrue(dm.isDoubleMetaphoneEqual("Scott", "Scoot"));
        assertFalse(dm.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testIsDoubleMetaphoneEqualWithAlternate() {
        assertTrue(dm.isDoubleMetaphoneEqual("Ci", "Si", false));
        assertFalse(dm.isDoubleMetaphoneEqual("Smith", "Jones", true));
    }

    @Test
    public void testIsDoubleMetaphoneEqualNull() {
        assertFalse(dm.isDoubleMetaphoneEqual(null, "Smith"));
        assertFalse(dm.isDoubleMetaphoneEqual("Smith", null));
        assertFalse(dm.isDoubleMetaphoneEqual(null, null));
    }

    @Test
    public void testDoubleMetaphoneSpecificBranches() {
        assertEquals("KK", dm.doubleMetaphone("Czerny"));
        assertEquals("X", dm.doubleMetaphone("Xavier"));
        assertEquals("J", dm.doubleMetaphone("Jose"));
        assertEquals("SF", dm.doubleMetaphone("Sfinks"));
        assertEquals("T", dm.doubleMetaphone("The"));
    }

    @Test
    public void testDoubleMetaphoneVowelStart() {
        assertEquals("ALP", dm.doubleMetaphone("Alpha"));
        assertEquals("E", dm.doubleMetaphone("Eon"));
        assertEquals("I", dm.doubleMetaphone("Ivy"));
    }

    @Test
    public void testDoubleMetaphoneConsonantCluster() {
        assertEquals("KNR", dm.doubleMetaphone("Kn"));
        assertEquals("NR", dm.doubleMetaphone("Nero"));
        assertEquals("LMT", dm.doubleMetaphone("Lambert"));
    }

    @Test
    public void testDoubleMetaphoneEdgeCases() {
        assertEquals("", dm.doubleMetaphone(" "));
        assertEquals("K", dm.doubleMetaphone("k"));
        assertEquals("P", dm.doubleMetaphone("p"));
    }

    @Test
    public void testDoubleMetaphoneResultClass() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(4);
        result.append('A');
        result.append('B', 'C');
        result.appendPrimary('D');
        result.appendAlternate('E');
        assertEquals("ABD", result.getPrimary());
        assertEquals("ACE", result.getAlternate());
        assertFalse(result.isComplete());
    }

    @Test
    public void testDoubleMetaphoneResultAppendString() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(6);
        result.append("He");
        result.append("ll", "wo");
        assertEquals("Hell", result.getPrimary());
        assertEquals("Hewo", result.getAlternate());
    }

    @Test
    public void testDoubleMetaphoneResultAppendPrimaryAlternate() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(3);
        result.append('A', 'B');
        result.appendPrimary("CD");
        result.appendAlternate("EF");
        assertEquals("AC", result.getPrimary());
        assertEquals("BE", result.getAlternate());
    }

    @Test
    public void testDoubleMetaphoneResultIsComplete() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(2);
        result.append("AB");
        assertTrue(result.isComplete());
    }

    @Test
    public void testDoubleMetaphoneResultNotComplete() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(5);
        result.append("A");
        assertFalse(result.isComplete());
    }

    @Test
    public void testDoubleMetaphoneLongWord() {
        assertEquals("KF", dm.doubleMetaphone("Church"));
        assertEquals("TRT", dm.doubleMetaphone("Tart"));
        assertEquals("NLT", dm.doubleMetaphone("NlT"));
    }

    @Test
    public void testDoubleMetaphoneSilentLetters() {
        assertEquals("", dm.doubleMetaphone("Gn"));
        assertEquals("P", dm.doubleMetaphone("Pedro"));
        assertEquals("KP", dm.doubleMetaphone("Copa"));
    }

    @Test
    public void testDoubleMetaphoneSpecialCases() {
        assertEquals("HS", dm.doubleMetaphone("Hello"));
        assertEquals("PR", dm.doubleMetaphone("Pro"));
        assertEquals("MT", dm.doubleMetaphone("Mith"));
    }

    @Test
    public void testDoubleMetaphoneBoundaryLength() {
        dm.setMaxCodeLen(10);
        assertEquals("PRK", dm.doubleMetaphone("Park"));
        dm.setMaxCodeLen(2);
        assertEquals("PR", dm.doubleMetaphone("Park"));
    }
}