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
    public void testDoubleMetaphoneBasic() {
        assertEquals("SMTH", dm.doubleMetaphone("Smith"));
        assertEquals("JNS", dm.doubleMetaphone("Jones"));
        assertEquals("AKSR", dm.doubleMetaphone("Acker"));
    }

    @Test
    public void testDoubleMetaphoneNullInput() {
        assertNull(dm.doubleMetaphone(null));
        assertNull(dm.doubleMetaphone(null, true));
    }

    @Test
    public void testDoubleMetaphoneEmptyInput() {
        assertEquals("", dm.doubleMetaphone(""));
        assertEquals("", dm.doubleMetaphone("   "));
    }

    @Test
    public void testDoubleMetaphoneAlternate() {
        String primary = dm.doubleMetaphone("Washington", false);
        String alternate = dm.doubleMetaphone("Washington", true);
        assertNotNull(primary);
        assertNotNull(alternate);
    }

    @Test
    public void testEncodeString() {
        assertEquals("SFT", dm.encode("Schmidt"));
    }

    @Test
    public void testEncodeObject() throws EncoderException {
        assertEquals("JNS", dm.encode((Object) "Jones"));
    }

    @Test(expected = EncoderException.class)
    public void testEncodeObjectInvalid() throws EncoderException {
        dm.encode((Object) Integer.valueOf(123));
    }

    @Test
    public void testIsDoubleMetaphoneEqual() {
        assertTrue(dm.isDoubleMetaphoneEqual("Smith", "Smyth"));
        assertFalse(dm.isDoubleMetaphoneEqual("Smith", "Jones"));
    }

    @Test
    public void testIsDoubleMetaphoneEqualAlternate() {
        assertTrue(dm.isDoubleMetaphoneEqual("Smith", "Smyth", true));
        assertTrue(dm.isDoubleMetaphoneEqual("Toth", "Toth", true));
    }

    @Test
    public void testGetSetMaxCodeLen() {
        assertEquals(4, dm.getMaxCodeLen());
        dm.setMaxCodeLen(6);
        assertEquals(6, dm.getMaxCodeLen());
        dm.setMaxCodeLen(4);
        assertEquals(4, dm.getMaxCodeLen());
    }

    @Test
    public void testDoubleMetaphoneSpecialCases() {
        assertEquals("KSR", dm.doubleMetaphone("Caesar"));
        assertEquals("KL", dm.doubleMetaphone("Klein"));
        assertEquals("SNR", dm.doubleMetaphone("Steiner"));
        assertEquals("PRZ", dm.doubleMetaphone("Pszczyna"));
        assertEquals("VKR", dm.doubleMetaphone("Wicker"));
        assertEquals("JK", dm.doubleMetaphone("Jack"));
        assertEquals("JSP", dm.doubleMetaphone("Jose"));
        assertEquals("SPTR", dm.doubleMetaphone("Spitler"));
        assertEquals("SNPR", dm.doubleMetaphone("Sneider"));
    }

    @Test
    public void testHandleSilentStarts() {
        assertEquals("NTR", dm.doubleMetaphone("Nstor"));
        assertEquals("NTR", dm.doubleMetaphone("Nestor"));
    }

    @Test
    public void testVowelHandling() {
        assertEquals("A", dm.doubleMetaphone("A"));
        assertEquals("AA", dm.doubleMetaphone("Eio"));
    }

    @Test
    public void testEdgeScenarios() {
        assertEquals("", dm.doubleMetaphone("1"));
        assertEquals("", dm.doubleMetaphone("!@#$"));
    }

    @Test
    public void testDoubleMetaphoneResultClass() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(4);
        result.append('P');
        result.appendAlternate('A');
        result.appendPrimary('X');
        result.append("BC", "DE");
        result.appendPrimary("FG");
        result.appendAlternate("HI");

        assertTrue(result.isComplete());
        assertEquals("XFG", result.getPrimary());
        assertEquals("ADEHI", result.getAlternate());
    }

    @Test
    public void testResultIsComplete() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(2);
        result.appendPrimary('A');
        result.appendAlternate('B');
        assertTrue(result.isComplete());
    }

    @Test
    public void testResultWithMaxLengthZero() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(0);
        result.append('A');
        assertEquals("", result.getPrimary());
        assertEquals("", result.getAlternate());
        assertTrue(result.isComplete());
    }

    @Test
    public void testResultAppendPrimaryStringDoesNotExceed() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(3);
        result.appendPrimary("ABCDE");
        assertEquals("ABC", result.getPrimary());
    }

    @Test
    public void testResultAppendAlternateStringDoesNotExceed() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(3);
        result.appendAlternate("ABCDE");
        assertEquals("ABC", result.getAlternate());
    }

    @Test
    public void testResultAppendStringWithBoth() {
        DoubleMetaphone.DoubleMetaphoneResult result = new DoubleMetaphone.DoubleMetaphoneResult(4);
        result.append("AB", "CD");
        assertEquals("AB", result.getPrimary());
        assertEquals("CD", result.getAlternate());
    }

    @Test
    public void testCleanInputTrim() {
        assertEquals("SMTH", dm.doubleMetaphone("  Smith  "));
    }
}