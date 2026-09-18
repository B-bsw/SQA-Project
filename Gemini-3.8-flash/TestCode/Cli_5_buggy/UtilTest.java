package org.apache.commons.cli;

import org.junit.Assert;
import org.junit.Test;

public class UtilTest {

    @Test
    public void constructor_givenDefaultInstantiation_shouldCreateInstanceSuccessfully() {
        // Arrange & Act
        Util util = new Util();

        // Assert
        Assert.assertNotNull(util);
    }

    @Test
    public void stripLeadingHyphens_givenDoubleHyphenPrefixedString_shouldStripTwoHyphens() {
        // Arrange
        String input = "--foo";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", actual);
    }

    @Test
    public void stripLeadingHyphens_givenSingleHyphenPrefixedString_shouldStripOneHyphen() {
        // Arrange
        String input = "-foo";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", actual);
    }

    @Test
    public void stripLeadingHyphens_givenTripleHyphenPrefixedString_shouldStripTwoHyphensOnly() {
        // Arrange
        String input = "---foo";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("-foo", actual);
    }

    @Test
    public void stripLeadingHyphens_givenOnlyTwoHyphens_shouldReturnEmptyString() {
        // Arrange
        String input = "--";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingHyphens_givenOnlyOneHyphen_shouldReturnEmptyString() {
        // Arrange
        String input = "-";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingHyphens_givenStringWithoutHyphen_shouldReturnOriginalString() {
        // Arrange
        String input = "foo";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo", actual);
    }

    @Test
    public void stripLeadingHyphens_givenStringWithInternalHyphen_shouldReturnOriginalString() {
        // Arrange
        String input = "foo-bar";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("foo-bar", actual);
    }

    @Test
    public void stripLeadingHyphens_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        String input = "";

        // Act
        String actual = Util.stripLeadingHyphens(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingHyphens_givenNullInput_shouldThrowNullPointerException() {
        // Arrange
        String input = null;

        // Act & Assert
        try {
            Util.stripLeadingHyphens(input);
            Assert.fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenEnclosedQuotes_shouldStripBothQuotes() {
        // Arrange
        String input = "\"one two\"";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenLeadingQuoteOnly_shouldStripLeadingQuote() {
        // Arrange
        String input = "\"one two";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenTrailingQuoteOnly_shouldStripTrailingQuote() {
        // Arrange
        String input = "one two\"";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenStringWithoutQuotes_shouldReturnOriginalString() {
        // Arrange
        String input = "one two";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one two", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenSingleQuoteChar_shouldReturnEmptyString() {
        // Arrange
        String input = "\"";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenTwoQuoteCharsOnly_shouldReturnEmptyString() {
        // Arrange
        String input = "\"\"";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenMultipleQuotesSurroundingAndInside_shouldStripOnlyOuterQuotes() {
        // Arrange
        String input = "\"one \"two\" three\"";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("one \"two\" three", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenEmptyString_shouldReturnEmptyString() {
        // Arrange
        String input = "";

        // Act
        String actual = Util.stripLeadingAndTrailingQuotes(input);

        // Assert
        Assert.assertEquals("", actual);
    }

    @Test
    public void stripLeadingAndTrailingQuotes_givenNullInput_shouldThrowNullPointerException() {
        // Arrange
        String input = null;

        // Act & Assert
        try {
            Util.stripLeadingAndTrailingQuotes(input);
            Assert.fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }
}