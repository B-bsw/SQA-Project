package org.apache.commons.codec.binary;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

public class Base64InputStreamTest {

    @Test
    public void testConstructorDefaultDecode() throws IOException {
        byte[] original = "Hello World".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] decoded = readAll(in);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testConstructorDoEncodeFalse() throws IOException {
        byte[] original = "TestData".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] decoded = readAll(in);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testConstructorDoEncodeTrue() throws IOException {
        byte[] original = "TestData".getBytes("UTF-8");
        InputStream in = new Base64InputStream(new ByteArrayInputStream(original), true);
        byte[] encoded = readAll(in);
        byte[] expected = Base64.encodeBase64(original, false);
        assertArrayEquals(expected, encoded);
    }

    @Test
    public void testConstructorWithLineLengthAndSeparator() throws IOException {
        byte[] original = new byte[100];
        for (int i = 0; i < original.length; i++) {
            original[i] = (byte) (i % 256);
        }
        byte[] separator = "\n".getBytes("UTF-8");
        InputStream in = new Base64InputStream(new ByteArrayInputStream(original), true, 10, separator);
        byte[] encoded = readAll(in);

        byte[] expected = Base64.encodeBase64Chunked(original);
        // Base64.encodeBase64Chunked uses lineLength 76 and CRLF by default,
        // so we compute expected using Base64 with same parameters directly.
        Base64 base64 = new Base64(10, separator);
        byte[] expectedCustom = base64.encode(original);
        assertArrayEquals(expectedCustom, encoded);
    }

    @Test
    public void testReadSingleByteDecodeNormal() throws IOException {
        byte[] original = "A".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        int b = in.read();
        assertEquals('A', b);
        int eof = in.read();
        assertEquals(-1, eof);
    }

    @Test
    public void testReadSingleByteEncodeNormal() throws IOException {
        byte[] original = "A".getBytes("UTF-8");
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(original), true);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int b;
        while ((b = in.read()) != -1) {
            bos.write(b);
        }
        byte[] expected = Base64.encodeBase64(original, false);
        assertArrayEquals(expected, bos.toByteArray());
    }

    @Test
    public void testReadEmptyInputStreamReturnsEOF() throws IOException {
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(new byte[0]));
        int result = in.read();
        assertEquals(-1, result);
    }

    @Test
    public void testReadByteArrayNormal() throws IOException {
        byte[] original = "Hello World, this is a test string for Base64 encoding!".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        Base64InputStream in = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] decoded = readAll(in);
        assertArrayEquals(original, decoded);
    }

    @Test
    public void testReadByteArrayZeroLenReturnsZero() throws IOException {
        byte[] original = "Hello".getBytes("UTF-8");
        byte[] encoded = Base