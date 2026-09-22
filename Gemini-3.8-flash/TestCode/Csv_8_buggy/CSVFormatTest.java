package org.apache.commons.csv;

import org.junit.Assert;
import org.junit.Test;

public class CSVFormatTest {

    @Test
    public void predefinedFormats_shouldHaveCorrectDefaults() {
        // Arrange & Act & Assert
        Assert.assertEquals(',', CSVFormat.DEFAULT.getDelimiter());
        Assert.assertEquals('\t', CSVFormat.TDF.getDelimiter());
        Assert.assertEquals('\t', CSVFormat.MYSQL.getDelimiter());
        Assert.assertEquals(',', CSVFormat.RFC4180.getDelimiter());
        Assert.assertEquals(',', CSVFormat.EXCEL.getDelimiter());
    }

    @Test
    public void withDelimiter_shouldUpdateDelimiter() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withDelimiter(';');

        // Assert
        Assert.assertEquals(';', custom.getDelimiter());
        Assert.assertEquals(',', CSVFormat.DEFAULT.getDelimiter()); // original remains immutable
    }

    @Test
    public void withQuote_shouldUpdateQuoteChar() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withQuote('\'');

        // Assert
        Assert.assertEquals(new Character('\''), custom.getQuoteCharacter());
    }

    @Test
    public void withEscape_shouldUpdateEscapeChar() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withEscape('\\');

        // Assert
        Assert.assertEquals(new Character('\\'), custom.getEscapeCharacter());
    }

    @Test
    public void withCommentMarker_shouldUpdateCommentMarker() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withCommentMarker('#');

        // Assert
        Assert.assertEquals(new Character('#'), custom.getCommentMarker());
    }

    @Test
    public void withIgnoreSurroundingSpaces_shouldUpdateFlag() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces(true);

        // Assert
        Assert.assertTrue(custom.getIgnoreSurroundingSpaces());
    }

    @Test
    public void withIgnoreEmptyLines_shouldUpdateFlag() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withIgnoreEmptyLines(false);

        // Assert
        Assert.assertFalse(custom.getIgnoreEmptyLines());
    }

    @Test
    public void withRecordSeparator_shouldUpdateSeparator() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withRecordSeparator("\n");

        // Assert
        Assert.assertEquals("\n", custom.getRecordSeparator());
    }

    @Test
    public void withNullString_shouldUpdateNullString() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withNullString("NULL");

        // Assert
        Assert.assertEquals("NULL", custom.getNullString());
    }

    @Test
    public void withHeader_shouldUpdateHeader() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withHeader("Col1", "Col2");

        // Assert
        Assert.assertNotNull(custom.getHeader());
        Assert.assertEquals(2, custom.getHeader().length);
        Assert.assertEquals("Col1", custom.getHeader()[0]);
        Assert.assertEquals("Col2", custom.getHeader()[1]);
    }

    @Test
    public void withSkipHeaderRecord_shouldUpdateFlag() {
        // Arrange & Act
        CSVFormat custom = CSVFormat.DEFAULT.withSkipHeaderRecord(true);

        // Assert
        Assert.assertTrue(custom.getSkipHeaderRecord());
    }

    @Test(expected = IllegalArgumentException.class)
    public void validate_givenSameDelimiterAndQuote_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        CSVFormat.DEFAULT.withDelimiter('"').validate();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validate_givenSameDelimiterAndEscape_shouldThrowIllegalArgumentException() {
        // Arrange & Act & Assert
        CSVFormat.DEFAULT.withEscape(',').validate();
    }

    @Test
    public void format_givenValues_shouldFormatAccordingToRules() {
        // Arrange
        CSVFormat format = CSVFormat.DEFAULT;

        // Act
        String result = format.format("a", "b", "c");

        // Assert
        Assert.assertEquals("a,b,c", result);
    }

    @Test
    public void equalsAndHashCode_givenIdenticalFormats_shouldBeEqual() {
        // Arrange
        CSVFormat f1 = CSVFormat.DEFAULT.withDelimiter(';');
        CSVFormat f2 = CSVFormat.DEFAULT.withDelimiter(';');

        // Act & Assert
        Assert.assertTrue(f1.equals(f2));
        Assert.assertEquals(f1.hashCode(), f2.hashCode());
    }
}
