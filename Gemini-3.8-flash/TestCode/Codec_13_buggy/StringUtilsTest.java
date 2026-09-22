package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void getBytesUtf8_givenNull_shouldReturnNull() {
        // Arrange & Act & Assert
        Assert.assertNull(StringUtils.getBytesUtf8(null));
    }

    @Test
    public void getBytesUtf8_givenEmpty_shouldReturnEmptyArray() {
        // Arrange & Act & Assert
        Assert.assertEquals(0, StringUtils.getBytesUtf8("").length);
    }

    @Test
    public void getBytesUtf8_and_newStringUtf8_shouldRoundTrip() {
        // Arrange
        String text = "Hello UTF-8 \u00e9\u00e8\u00e0";

        // Act
        byte[] bytes = StringUtils.getBytesUtf8(text);
        String result = StringUtils.newStringUtf8(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void newStringUtf8_givenNull_shouldReturnNull() {
        // Arrange & Act & Assert
        Assert.assertNull(StringUtils.newStringUtf8(null));
    }

    @Test
    public void getBytesIso8859_1_and_newStringIso8859_1_shouldRoundTrip() {
        // Arrange
        String text = "Hello ISO-8859-1 \u00e9";

        // Act
        byte[] bytes = StringUtils.getBytesIso8859_1(text);
        String result = StringUtils.newStringIso8859_1(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void getBytesUsAscii_and_newStringUsAscii_shouldRoundTrip() {
        // Arrange
        String text = "Hello ASCII 123";

        // Act
        byte[] bytes = StringUtils.getBytesUsAscii(text);
        String result = StringUtils.newStringUsAscii(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void getBytesUtf16_and_newStringUtf16_shouldRoundTrip() {
        // Arrange
        String text = "Hello UTF-16";

        // Act
        byte[] bytes = StringUtils.getBytesUtf16(text);
        String result = StringUtils.newStringUtf16(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void getBytesUtf16Be_and_newStringUtf16Be_shouldRoundTrip() {
        // Arrange
        String text = "Hello UTF-16BE";

        // Act
        byte[] bytes = StringUtils.getBytesUtf16Be(text);
        String result = StringUtils.newStringUtf16Be(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void getBytesUtf16Le_and_newStringUtf16Le_shouldRoundTrip() {
        // Arrange
        String text = "Hello UTF-16LE";

        // Act
        byte[] bytes = StringUtils.getBytesUtf16Le(text);
        String result = StringUtils.newStringUtf16Le(bytes);

        // Assert
        Assert.assertEquals(text, result);
    }

    @Test
    public void newString_givenNullBytes_shouldReturnNull() {
        // Arrange & Act & Assert
        Assert.assertNull(StringUtils.newString(null, "UTF-8"));
    }

    @Test
    public void getBytesUnchecked_givenNull_shouldReturnNull() {
        // Arrange & Act & Assert
        Assert.assertNull(StringUtils.getBytesUnchecked(null, "UTF-8"));
    }
}
