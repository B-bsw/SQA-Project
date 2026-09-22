package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class UtilTest {

    @Test
    public void testStripLeadingHyphensNoHyphens() {
        assertEquals("test", Util.stripLeadingHyphens("test"));
    }

    @Test
    public void testStripLeadingHyphensOneHyphen() {
        assertEquals("test", Util.stripLeadingHyphens("-test"));
    }

    @Test
    public void testStripLeadingHyphensTwoHyphens() {
        assertEquals("test", Util.stripLeadingHyphens("--test"));
    }

    @Test
    public void testStripLeadingHyphensMoreThanTwoHyphens() {
        assertEquals("-test", Util.stripLeadingHyphens("---test"));
    }

    @Test
    public void testStripLeadingHyphensEmptyString() {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    @Test
    public void testStripLeadingHyphensSingleHyphen() {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    @Test
    public void testStripLeadingHyphensDoubleHyphens() {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesNoQuotes() {
        assertEquals("test", Util.stripLeadingAndTrailingQuotes("test"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyLeading() {
        assertEquals("test\"", Util.stripLeadingAndTrailingQuotes("\"test\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyTrailing() {
        assertEquals("\"test", Util.stripLeadingAndTrailingQuotes("\"test\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesBothQuotes() {
        assertEquals("test", Util.stripLeadingAndTrailingQuotes("\"test\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyQuote() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesEmptyString() {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesNoMatch() {
        assertEquals("test", Util.stripLeadingAndTrailingQuotes("test"));
    }
}