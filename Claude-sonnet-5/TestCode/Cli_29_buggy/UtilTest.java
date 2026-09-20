package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UtilTest
{
    @Test
    public void testStripLeadingHyphensNull()
    {
        assertNull(Util.stripLeadingHyphens(null));
    }

    @Test
    public void testStripLeadingHyphensDoubleHyphen()
    {
        assertEquals("foo", Util.stripLeadingHyphens("--foo"));
    }

    @Test
    public void testStripLeadingHyphensSingleHyphen()
    {
        assertEquals("foo", Util.stripLeadingHyphens("-foo"));
    }

    @Test
    public void testStripLeadingHyphensNoHyphen()
    {
        assertEquals("foo", Util.stripLeadingHyphens("foo"));
    }

    @Test
    public void testStripLeadingHyphensEmptyString()
    {
        assertEquals("", Util.stripLeadingHyphens(""));
    }

    @Test
    public void testStripLeadingHyphensOnlyDoubleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("--"));
    }

    @Test
    public void testStripLeadingHyphensOnlySingleHyphen()
    {
        assertEquals("", Util.stripLeadingHyphens("-"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesBoth()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesLeadingOnly()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("\"one two"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesTrailingOnly()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two\""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesNoQuotes()
    {
        assertEquals("one two", Util.stripLeadingAndTrailingQuotes("one two"));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesEmptyString()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes(""));
    }

    @Test
    public void testStripLeadingAndTrailingQuotesOnlyOneQuoteChar()
    {
        assertEquals("", Util.stripLeadingAndTrailingQuotes("\""));
    }
}