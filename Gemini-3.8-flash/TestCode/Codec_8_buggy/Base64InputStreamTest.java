package org.apache.commons.codec.binary;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Base64InputStreamTest {

    @Test
    public void read_givenEmptyInputStream_shouldReturnMinusOne() throws Exception {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(bais);

        // Act & Assert
        Assert.assertEquals(-1, in.read());
        in.close();
    }

    @Test
    public void read_givenSingleByteReads_shouldDecodeCorrectly() throws Exception {
        // Arrange
        byte[] encoded = "SGVsbG8gV29ybGQh".getBytes("UTF-8");
        InputStream bais = new ByteArrayInputStream(encoded);
        Base64InputStream in = new Base64InputStream(bais);

        // Act
        StringBuffer sb = new StringBuffer();
        int b;
        while ((b = in.read()) != -1) {
            sb.append((char) b);
        }
        in.close();

        // Assert
        Assert.assertEquals("Hello World!", sb.toString());
    }

    @Test
    public void read_givenByteArrayBuffer_shouldDecodeIntoBuffer() throws Exception {
        // Arrange
        byte[] encoded = "SGVsbG8=".getBytes("UTF-8");
        InputStream bais = new ByteArrayInputStream(encoded);
        Base64InputStream in = new Base64InputStream(bais);

        // Act
        byte[] buf = new byte[10];
        int count = in.read(buf, 0, buf.length);
        in.close();

        // Assert
        Assert.assertEquals(5, count);
        Assert.assertEquals("Hello", new String(buf, 0, count, "UTF-8"));
    }

    @Test
    public void read_givenEncodeMode_shouldEncodeStreamCorrectly() throws Exception {
        // Arrange
        byte[] raw = "Hello World!".getBytes("UTF-8");
        InputStream bais = new ByteArrayInputStream(raw);
        Base64InputStream in = new Base64InputStream(bais, true);

        // Act
        StringBuffer sb = new StringBuffer();
        int b;
        while ((b = in.read()) != -1) {
            sb.append((char) b);
        }
        in.close();

        // Assert
        Assert.assertEquals("SGVsbG8gV29ybGQh", sb.toString().trim());
    }

    @Test
    public void markSupported_givenInstance_shouldReturnFalse() throws Exception {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[0]);
        Base64InputStream in = new Base64InputStream(bais);

        // Act & Assert
        Assert.assertFalse(in.markSupported());
        in.close();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws Exception {
        // Arrange
        InputStream bais = new ByteArrayInputStream(new byte[10]);
        Base64InputStream in = new Base64InputStream(bais);

        // Act & Assert
        try {
            in.read(new byte[10], -1, 5);
        } finally {
            in.close();
        }
    }
}
