package org.apache.commons.codec.binary;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

public class BaseNCodecInputStreamTest {

    // ---------- Helper subclass to expose protected constructor ----------
    private static class TestableStream extends BaseNCodecInputStream {
        TestableStream(InputStream in, BaseNCodec codec, boolean doEncode) {
            super(in, codec, doEncode);
        }
    }

    // ---------- markSupported() ----------

    @Test
    public void testMarkSupportedReturnsFalse() {
        Base64 codec = new Base64();
        InputStream in = new ByteArrayInputStream(new byte[] { 1, 2, 3 });
        BaseNCodecInputStream stream = new TestableStream(in, codec, true);
        assertFalse(stream.markSupported());
    }

    // ---------- read() single byte ----------

    @Test
    public void testReadSingleByteNormal() throws IOException {
        byte[] original = "AB".getBytes("UTF-8");
        Base64 codec = new Base64();
        InputStream in = new ByteArrayInputStream(original);
        BaseNCodecInputStream stream = new TestableStream(in, codec, true);

        int b;
        StringBuilder sb = new StringBuilder();
        while ((b = stream.read()) != -1) {
            sb.append((char) b);
        }
        String encoded = sb.toString();
        assertEquals(Base64.encodeBase64String(original), encoded);
    }

    @Test
    public void testReadSingleByteEOFOnEmptyInput() throws IOException {
        Base64 codec = new Base64();
        InputStream in = new ByteArrayInputStream(new byte[0]);
        BaseNCodecInputStream stream = new TestableStream(in, codec, true);

        int result = stream.read();
        assertEquals(-1, result);
    }

    @Test
    public void testReadS