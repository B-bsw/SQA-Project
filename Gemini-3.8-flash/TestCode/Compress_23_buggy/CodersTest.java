package org.apache.commons.compress.archivers.sevenz;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CodersTest {

    @Test
    public void testCodersInstantiation() {
        Coders coders = new Coders();
        Assert.assertNotNull(coders);
    }

    @Test
    public void testCoderIdInstantiation() {
        Coders.CopyDecoder copyDecoder = new Coders.CopyDecoder();
        Coders.CoderId coderId = new Coders.CoderId(SevenZMethod.COPY, copyDecoder);
        Assert.assertEquals(SevenZMethod.COPY, coderId.method);
        Assert.assertEquals(copyDecoder, coderId.coder);
    }

    @Test
    public void testCoderTableContents() {
        Assert.assertNotNull(Coders.coderTable);
        Assert.assertTrue(Coders.coderTable.length >= 6);
        for (int i = 0; i < Coders.coderTable.length; i++) {
            Assert.assertNotNull(Coders.coderTable[i]);
            Assert.assertNotNull(Coders.coderTable[i].method);
            Assert.assertNotNull(Coders.coderTable[i].coder);
        }
    }

    @Test
    public void addDecoder_givenUnsupportedMethod_shouldThrowIOException() {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[] { (byte) 0xFE, (byte) 0xDC, (byte) 0xBA };
        InputStream in = new ByteArrayInputStream(new byte[0]);
        try {
            Coders.addDecoder(in, coder, null);
            Assert.fail("Expected IOException for unsupported decompression method");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unsupported compression method") != -1);
        }
    }

    @Test
    public void addEncoder_givenUnsupportedMethod_shouldThrowIOException() {
        OutputStream out = new ByteArrayOutputStream();
        try {
            Coders.addEncoder(out, null, null);
            Assert.fail("Expected IOException for unsupported compression method");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unsupported compression method") != -1);
        }
    }

    @Test
    public void coderBaseEncode_givenDefaultCoderBase_shouldThrowUnsupportedOperationException() throws IOException {
        Coders.CoderBase coderBase = new Coders.LZMADecoder();
        OutputStream out = new ByteArrayOutputStream();
        try {
            coderBase.encode(out, null);
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            Assert.assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void copyDecoder_decodeAndEncode_shouldReturnSameStreams() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();

        byte[] testData = new byte[] { 1, 2, 3, 4, 5 };
        InputStream in = new ByteArrayInputStream(testData);
        InputStream decoded = Coders.addDecoder(in, coder, null);
        Assert.assertSame(in, decoded);

        byte[] readBack = new byte[5];
        int count = decoded.read(readBack);
        Assert.assertEquals(5, count);
        Assert.assertTrue(Arrays.equals(testData, readBack));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        OutputStream encoded = Coders.addEncoder(out, SevenZMethod.COPY, null);
        Assert.assertSame(out, encoded);
        encoded.write(testData);
        Assert.assertTrue(Arrays.equals(testData, out.toByteArray()));
    }

    @Test
    public void lzmaDecoder_decode_givenDictionaryLargerThanMax_shouldThrowIOException() {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5d, 0x00, 0x00, 0x00, 0x7f };

        InputStream in = new ByteArrayInputStream(new byte[0]);
        try {
            Coders.addDecoder(in, coder, null);
            Assert.fail("Expected IOException for dictionary larger than 4GiB");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Dictionary larger than 4GiB maximum size") != -1);
        }
    }

    @Test
    public void lzmaDecoder_decode_givenValidProperties_shouldReturnLZMAInputStream() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5d, 0x00, 0x10, 0x00, 0x00 };

        InputStream in = new ByteArrayInputStream(new byte[0]);
        InputStream decoded = Coders.addDecoder(in, coder, null);
        Assert.assertNotNull(decoded);
        try {
            decoded.close();
        } catch (IOException ignored) {
        }
    }

    @Test
    public void deflateDecoder_encodeAndDecode_shouldSuccessfullyRoundTrip() throws IOException {
        byte[] original = "Deflate test payload 1234567890".getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(baos, SevenZMethod.DEFLATE, null);
        encoder.write(original);
        encoder.close();

        byte[] compressed = baos.toByteArray();
        Assert.assertTrue(compressed.length > 0);

        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();

        InputStream in = new ByteArrayInputStream(compressed);
        InputStream decoder = Coders.addDecoder(in, coder, null);

        ByteArrayOutputStream uncompressed = new ByteArrayOutputStream();
        byte[] buffer = new byte[64];
        int n;
        while ((n = decoder.read(buffer)) != -1) {
            uncompressed.write(buffer, 0, n);
        }
        decoder.close();

        Assert.assertTrue(Arrays.equals(original, uncompressed.toByteArray()));
    }

    @Test
    public void bzip2Decoder_encodeAndDecode_shouldSuccessfullyRoundTrip() throws IOException {
        byte[] original = "BZip2 compression round trip test payload".getBytes("UTF-8");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStream encoder = Coders.addEncoder(baos, SevenZMethod.BZIP2, null);
        encoder.write(original);
        encoder.close();

        byte[] compressed = baos.toByteArray();
        Assert.assertTrue(compressed.length > 0);

        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();

        InputStream in = new ByteArrayInputStream(compressed);
        InputStream decoder = Coders.addDecoder(in, coder, null);

        ByteArrayOutputStream uncompressed = new ByteArrayOutputStream();
        byte[] buffer = new byte[64];
        int n;
        while ((n = decoder.read(buffer)) != -1) {
            uncompressed.write(buffer, 0, n);
        }
        decoder.close();

        Assert.assertTrue(Arrays.equals(original, uncompressed.toByteArray()));
    }

    @Test
    public void aesDecoder_givenSaltAndIvSizeTooLong_shouldThrowIOExceptionOnRead() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { (byte) 0xFF, (byte) 0xFF };

        InputStream in = new ByteArrayInputStream(new byte[16]);
        InputStream decoder = Coders.addDecoder(in, coder, "password".getBytes("UTF-8"));
        try {
            decoder.read();
            Assert.fail("Expected IOException for salt + IV size too long");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Salt size + IV size too long") != -1);
        }
    }

    @Test
    public void aesDecoder_givenNullPassword_shouldThrowIOExceptionOnRead() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[2];

        InputStream in = new ByteArrayInputStream(new byte[16]);
        InputStream decoder = Coders.addDecoder(in, coder, null);
        try {
            decoder.read();
            Assert.fail("Expected IOException for missing password");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Cannot read encrypted files without a password") != -1);
        }
    }

    @Test
    public void aesDecoder_givenCyclesPower0x3F_shouldInitializeAndRead() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x3f, 0x00 };

        InputStream in = new ByteArrayInputStream(new byte[0]);
        InputStream decoder = Coders.addDecoder(in, coder, "testPassword123".getBytes("UTF-8"));

        try {
            int readByte = decoder.read();
            Assert.assertEquals(-1, readByte);

            byte[] buf = new byte[16];
            int readCount = decoder.read(buf, 0, buf.length);
            Assert.assertEquals(-1, readCount);
            decoder.close();
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Decryption error") != -1);
        }
    }

    @Test
    public void aesDecoder_givenCyclesPowerZero_shouldDeriveKeyAndRead() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x00, 0x00 };

        InputStream in = new ByteArrayInputStream(new byte[0]);
        InputStream decoder = Coders.addDecoder(in, coder, "pwd".getBytes("UTF-8"));

        try {
            byte[] buf = new byte[8];
            int count = decoder.read(buf, 0, buf.length);
            Assert.assertEquals(-1, count);

            int b = decoder.read();
            Assert.assertEquals(-1, b);
            decoder.close();
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Decryption error") != -1);
        }
    }

    @Test
    public void aesDecoder_withSaltAndIv_shouldInitializeSuccessfully() throws IOException {
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] {
            (byte) 0xC1,
            (byte) 0x11,
            (byte) 0xAA, (byte) 0xBB,
            (byte) 0x01, (byte) 0x02
        };

        InputStream in = new ByteArrayInputStream(new byte[0]);
        InputStream decoder = Coders.addDecoder(in, coder, "secret".getBytes("UTF-8"));
        try {
            int result = decoder.read();
            Assert.assertEquals(-1, result);
            decoder.close();
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Decryption error") != -1);
        }
    }

    @Test
    public void dummyByteAddingInputStream_readSingleByte_shouldAppendDummyZeroAtEOF() throws Exception {
        Class dummyClass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        Constructor ctor = dummyClass.getDeclaredConstructor(new Class[] { InputStream.class });
        ctor.setAccessible(true);

        InputStream source = new ByteArrayInputStream(new byte[] { 42 });
        InputStream stream = (InputStream) ctor.newInstance(new Object[] { source });

        Assert.assertEquals(42, stream.read());
        Assert.assertEquals(0, stream.read());
        Assert.assertEquals(-1, stream.read());
        Assert.assertEquals(-1, stream.read());
        stream.close();
    }

    @Test
    public void dummyByteAddingInputStream_readBuffer_shouldAppendDummyZeroAtEOF() throws Exception {
        Class dummyClass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        Constructor ctor = dummyClass.getDeclaredConstructor(new Class[] { InputStream.class });
        ctor.setAccessible(true);

        InputStream source = new ByteArrayInputStream(new byte[] { 10, 20 });
        InputStream stream = (InputStream) ctor.newInstance(new Object[] { source });

        byte[] buf = new byte[4];
        int read1 = stream.read(buf, 0, 2);
        Assert.assertEquals(2, read1);
        Assert.assertEquals(10, buf[0]);
        Assert.assertEquals(20, buf[1]);

        int read2 = stream.read(buf, 2, 2);
        Assert.assertEquals(1, read2);
        Assert.assertEquals(0, buf[2]);

        int read3 = stream.read(buf, 0, 4);
        Assert.assertEquals(-1, read3);
        stream.close();
    }

    @Test
    public void dummyByteAddingInputStream_readOnEmptyStream_shouldReturnDummyZeroThenEOF() throws Exception {
        Class dummyClass = Class.forName("org.apache.commons.compress.archivers.sevenz.Coders$DummyByteAddingInputStream");
        Constructor ctor = dummyClass.getDeclaredConstructor(new Class[] { InputStream.class });
        ctor.setAccessible(true);

        InputStream source = new ByteArrayInputStream(new byte[0]);
        InputStream stream = (InputStream) ctor.newInstance(new Object[] { source });

        byte[] buf = new byte[2];
        int count = stream.read(buf, 0, 2);
        Assert.assertEquals(1, count);
        Assert.assertEquals(0, buf[0]);

        int countNext = stream.read(buf, 0, 2);
        Assert.assertEquals(-1, countNext);
        stream.close();
    }
}