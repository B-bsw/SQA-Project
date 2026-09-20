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

import org.junit.Test;

public class Base64InputStreamTest {

    @Test
    public void testMarkSupportedReturnsFalse() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        Base64InputStream b64is = new Base64InputStream(in);
        assertFalse(b64is.markSupported());
    }

    @Test
    public void testDefaultConstructorDecodesData() throws IOException {
        byte[] original = "Hello World".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded));
        byte[] result = readAll(b64is);
        assertArrayEquals(original, result);
    }

    @Test
    public void testConstructorDoEncodeFalseDecodesData() throws IOException {
        byte[] original = "Some test data for decoding".getBytes("UTF-8");
        byte[] encoded = Base64.encodeBase64(original);
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(encoded), false);
        byte[] result = readAll(b64is);
        assertArrayEquals(original, result);
    }

    @Test
    public void testConstructorDoEncodeTrueEncodesData() throws IOException {
        byte[] original = "abcdefghijklmnopqrstuvwxyz".getBytes("UTF-8");
        Base64InputStream b64is = new Base64InputStream(new ByteArrayInputStream(original), true);
        byte[] encodedResult = readAll(b64is);
        byte[] decodedBack = Base64.decodeBase64(encodedResult);
        assertArrayEquals(original, decodedBack);
    }

    @Test
    public void testConst