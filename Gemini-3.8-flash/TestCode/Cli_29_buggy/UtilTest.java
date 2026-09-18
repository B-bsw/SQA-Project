package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest
{
    @Test
    public void constructor_instantiation_shouldCreateInstance()
    {
        // Arrange & Act
        Util util = new Util();

        // Assert
        Assert.assertNotNull(util);
    }

    @Test
    public void stripLeadingHyphens_givenNull_shouldReturnNull()
    {
        // Arrange
        String input = null;

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void stripLeadingHyphens_givenDoubleHyphenPrefix_shouldStripTwoHyphens()
    {
        // Arrange
        String input = "--foo";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", result);
    }

    @Test
    public void stripLeadingHyphens_givenDoubleHyphenOnly_shouldReturnEmptyString()
    {
        // Arrange
        String input = "--";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingHyphens_givenTripleHyphen_shouldStripTwoHyphensOnly()
    {
        // Arrange
        String input = "---foo";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("-foo", result);
    }

    @Test
    public void stripLeadingHyphens_givenSingleHyphenPrefix_shouldStripOneHyphen()
    {
        // Arrange
        String input = "-foo";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", result);
    }

    @Test
    public void stripLeadingHyphens_givenSingleHyphenOnly_shouldReturnEmptyString()
    {
        // Arrange
        String input = "-";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingHyphens_givenNoHyphen_shouldReturnOriginalString()
    {
        // Arrange
        String input = "foo";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", result);
    }

    @Test
    public void stripLeadingHyphens_givenEmptyString_shouldReturnEmptyString()
    {
        // Arrange
        String input = "";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingHyphens_givenHyphenInMiddle_shouldReturnOriginalString()
    {
        // Arrange
        String input = "foo-bar";

        // Act
        String result = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo-bar", result);
    }

    @Test(expected = NullPointerException.class)
    public void stripLeadingAndTrailingQuotes_givenNull_shouldThrowNullPointerException()
    {
        // Arrange
        String input = null;

        // Act
        Util.stripLeadingAndTrailingQuotes(input);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenSurroundingQuotes_shouldStripBothQuotes()
    {
        // Arrange
        String input = "\"one two\"";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenLeadingQuoteOnly_shouldStripLeadingQuote()
    {
        // Arrange
        String input = "\"one two";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenTrailingQuoteOnly_shouldStripTrailingQuote()
    {
        // Arrange
        String input = "one two\"";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenNoQuotes_shouldReturnOriginalString()
    {
        // Arrange
        String input = "one two";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenEmptyString_shouldReturnEmptyString()
    {
        // Arrange
        String input = "";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenSingleQuote_shouldReturnEmptyString()
    {
        // Arrange
        String input = "\"";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenTwoQuotesOnly_shouldReturnEmptyString()
    {
        // Arrange
        String input = "\"\"";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", result);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenInnerQuotes_shouldRetainInnerQuotes()
    {
        // Arrange
        String input = "\"foo\"bar\"";

        // Act
        String result = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("foo\"bar", result);
    }
}