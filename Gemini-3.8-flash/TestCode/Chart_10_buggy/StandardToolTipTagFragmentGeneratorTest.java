package org.jfree.chart.imagemap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test suite for {@link StandardToolTipTagFragmentGenerator}.
 */
public class StandardToolTipTagFragmentGeneratorTest {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        this.generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void constructor_whenInstantiated_shouldCreateNonNullInstance() {
        // Arrange & Act
        StandardToolTipTagFragmentGenerator instance = new StandardToolTipTagFragmentGenerator();

        // Assert
        Assert.assertNotNull(instance);
        Assert.assertTrue(instance instanceof ToolTipTagFragmentGenerator);
    }

    @Test
    public void generateToolTipFragment_givenNormalText_shouldReturnFormattedTitleAndEmptyAlt() {
        // Arrange
        String toolTipText = "Series 1, Item 1";
        String expected = " title=\"Series 1, Item 1\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenEmptyString_shouldReturnEmptyTitleAndEmptyAlt() {
        // Arrange
        String toolTipText = "";
        String expected = " title=\"\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenNullText_shouldConcatenateNullLiteral() {
        // Arrange
        String toolTipText = null;
        String expected = " title=\"null\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenWhitespaceOnly_shouldPreserveWhitespace() {
        // Arrange
        String toolTipText = "   \t\n   ";
        String expected = " title=\"   \t\n   \" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenHtmlTagsAndQuotes_shouldIncludeCharactersVerbatim() {
        // Arrange
        String toolTipText = "<b>Bold</b> & \"Quoted\"";
        String expected = " title=\"<b>Bold</b> & \"Quoted\"\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenUnicodeCharacters_shouldPreserveUnicode() {
        // Arrange
        String toolTipText = "ค่าทดสอบ ภาษาไทย \u00A9 \u00AE";
        String expected = " title=\"ค่าทดสอบ ภาษาไทย \u00A9 \u00AE\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void generateToolTipFragment_givenLongText_shouldReturnExactAppendedString() {
        // Arrange
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 500; i++) {
            buffer.append("data_");
        }
        String toolTipText = buffer.toString();
        String expected = " title=\"" + toolTipText + "\" alt=\"\"";

        // Act
        String actual = this.generator.generateToolTipFragment(toolTipText);

        // Assert
        Assert.assertEquals(expected, actual);
    }
}