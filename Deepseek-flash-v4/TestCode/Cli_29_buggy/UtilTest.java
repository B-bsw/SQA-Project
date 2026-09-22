package org.apache.commons.cli;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class UtilTest {
    private String originalValue;

    @Before
    public void setUp() {
        originalValue = null;
    }

    @After
    public void tearDown() {
        originalValue = null;
    }

    // Tests for stripLeadingHyphens
    @Test
    public void testStripLeadingHyphensNull() {
        assertNull("Null should return null", Util.stripLeadingHyphens(null));
    }

    @Test
    public void testStripLeadingHyphensDoubleHyphen() {
        assertEquals("--test", "test", Util.stripLeadingHyphens("--test"));
    }

    @Test
    public void testStripLeadingHyphensSingleHyphen() {
        assertEquals("-test", "test", Util.stripLeadingHyphens("-test"));
    }

    @Test
    public void testStripLeadingHyphensNoHyphen() {
        assertEquals("test", "test", Util.stripLeadingHyphens("test"));
    }

    @Test
    public void testStripLeadingHyphensOnlyDoubleHyphen() {
        assertEquals("--", "", Util.stripLeadingHyphens("--"));
    }

    @Test
    public void testStripLeadingHyphensOnlySingleHyphen() {
        assertEquals("-", "", Util.stripLeadingHyphens("-"));
    }

    @Test
    public void testStripLeadingHyphensEmptyString() {
        assertEquals("", "", Util.stripLeadingHyphens(""));
    }

    @Test
    public void testStripLeadingHyphensDoubleHyphenWithHyphenFollowing() {
        assertEquals("---test", "-test", Util.stripLeadingHyphens("---test"));
    }

    @Test
    public void testStripLeadingHyphensMultipleDoubleHyphens() {
        assertEquals("----test", "--test", Util.stripLeadingHyphens("----test"));
    }

    // Tests for stripLeadingAndTrailingQuotes
    @Test
    public void testStripLeadingAndTrailingQuotesNeither() {
        assertEquals("test", "test", Util.stripLeadingAndTrailingQuotes("test"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesBothQuotes() {
        assertEquals("\"test\"", "test", Util.stripLeadingAndTrailingQuotes("\"test\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesLeadingQuoteOnly() {
        assertEquals("\"test", "test", Util.stripLeadingAndTrailingQuotes("\"test"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesTrailingQuoteOnly() {
        assertEquals("test\"", "test", Util.stripLeadingAndTrailingQuotes("test\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesEmptyString() {
        assertEquals("", "", Util.stripLeadingAndTrailingQuotes(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyQuotes() {
        assertEquals("\"\"", "", Util.stripLeadingAndTrailingQuotes("\"\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesWithSpaces() {
        assertEquals("\"one two\"", "one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyLeadingQuoteInEmptyString() {
        assertEquals("\"", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyTrailingQuoteInEmptyString() {
        assertEquals("\"", "", Util.stripLeadingAndTrailingQuotes("\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesMultiplePairs() {
        assertEquals("\"\"test\"\"", "\"test\"", Util.stripLeadingAndTrailingQuotes("\"\"test\"\""));
    }
}