package org.apache.commons.compress.archivers.sevenz;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

import org.junit.Test;

public class CodersTest {

    private static final byte[] EMPTY_PASSWORD = new byte[0];
    private static final byte[] SAMPLE_PASSWORD = "password".getBytes();

    private static class TestCoderBase extends Coders.CoderBase {
        @Override
        InputStream decode(InputStream in, Coder coder, byte[] password) throws IOException {
            return in;
        }
    }

    private static class TestCoderId extends Coders.CoderId {
        TestCoderId(SevenZMethod method, Coders.CoderBase coder) {
            super(method, coder);
        }
    }

    private static final Coders.CoderId[] TEST_CODER_TABLE = new Coders.CoderId[] {
        new TestCoderId(SevenZMethod.COPY, new Coders.CopyDecoder()),
        new TestCoderId(SevenZMethod.LZMA, new Coders.LZMADecoder()),
        new TestCoderId(SevenZMethod.LZMA2, new Coders.LZMADecoder()),
        new TestCoderId(SevenZMethod.DEFLATE, new Coders.DeflateDecoder()),
        new TestCoderId(SevenZMethod.BZIP2, new Coders.BZIP2Decoder()),
        new TestCoderId(SevenZMethod.AES256SHA256, new Coders.AES256SHA256Decoder())
    };

    @Test
    public void testAddDecoder_SupportedMethod() throws IOException {
        Coders.CoderId coderId = TEST_CODER_TABLE[0];
        Coder coder = new Coder();
        coder.decompressionMethodId = coderId.method.getId();
        coder.properties = new byte[0];
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        InputStream result = Coders.addDecoder(inputStream, coder, EMPTY_PASSWORD);
        assertSame(inputStream, result);
    }

    @Test
    public void testAddDecoder_UnsupportedMethod() {
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[] { (byte) 0x99 };
        coder.properties = new byte[0];
        try {
            Coders.addDecoder(null, coder, EMPTY_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddDecoder_NullMethod_ThrowsException() {
        Coder coder = new Coder();
        coder.decompressionMethodId = null;
        coder.properties = new byte[0];
        try {
            Coders.addDecoder(null, coder, EMPTY_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddEncoder_SupportedMethod() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream result = Coders.addEncoder(outputStream, SevenZMethod.COPY, EMPTY_PASSWORD);
        assertSame(outputStream, result);
    }

    @Test
    public void testAddEncoder_UnsupportedMethod() {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), SevenZMethod.LZMA2, EMPTY_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddEncoder_NullMethod_ThrowsException() {
        try {
            Coders.addEncoder(new ByteArrayOutputStream(), null, EMPTY_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddEncoder_Copy_ReturnsSameStream() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try (OutputStream result = Coders.addEncoder(outputStream, SevenZMethod.COPY, EMPTY_PASSWORD)) {
            assertSame(outputStream, result);
        }
    }

    @Test
    public void testAddDecoder_Copy_ReturnsSameStream() throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(new byte[0]);
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.COPY.getId();
        coder.properties = new byte[0];
        try (InputStream result = Coders.addDecoder(inputStream, coder, EMPTY_PASSWORD)) {
            assertSame(inputStream, result);
        }
    }

    @Test
    public void testLZMADecoder_ValidProperties() throws IOException {
        Coders.CoderBase decoder = new Coders.CoderBase() {
            @Override
            InputStream decode(InputStream in, Coder coder, byte[] password) throws IOException {
                return new Coders.LZMADecoder().decode(in, coder, password);
            }
        };
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5D, 0x00, 0x00, 0x10, 0x00 };
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        InputStream result = decoder.decode(inputStream, coder, EMPTY_PASSWORD);
        assertNotNull(result);
    }

    @Test(expected = IOException.class)
    public void testLZMADecoder_LargeDictionary_ThrowsException() throws IOException {
        Coders.CoderBase decoder = new Coders.CoderBase() {
            @Override
            InputStream decode(InputStream in, Coder coder, byte[] password) throws IOException {
                return new Coders.LZMADecoder().decode(in, coder, password);
            }
        };
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5D, (byte) 0xE0, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF };
        decoder.decode(new ByteArrayInputStream(new byte[0]), coder, EMPTY_PASSWORD);
    }

    @Test
    public void testLZMADecoder_ShortProperties_ThrowsException() {
        Coders.CoderBase decoder = new Coders.CoderBase() {
            @Override
            InputStream decode(InputStream in, Coder coder, byte[] password) throws IOException {
                return new Coders.LZMADecoder().decode(in, coder, password);
            }
        };
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.LZMA.getId();
        coder.properties = new byte[] { 0x5D };
        try {
            decoder.decode(new ByteArrayInputStream(new byte[0]), coder, EMPTY_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

    @Test
    public void testDeflateDecoder_ReadsData() throws IOException {
        byte[] originalData = "Hello, World!".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (DeflaterOutputStream dos = new DeflaterOutputStream(baos, new Deflater(9, true))) {
            dos.write(originalData);
        }
        byte[] compressedData = baos.toByteArray();
        
        byte[] testDataWithDummy = new byte[compressedData.length + 1];
        System.arraycopy(compressedData, 0, testDataWithDummy, 0, compressedData.length);
        testDataWithDummy[compressedData.length] = 0;
        
        Coders.CoderBase decoder = new Coders.DeflateDecoder();
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        coder.properties = new byte[0];
        
        try (InputStream in = decoder.decode(new ByteArrayInputStream(testDataWithDummy), coder, EMPTY_PASSWORD)) {
            byte[] buffer = new byte[originalData.length];
            int read = in.read(buffer);
            assertArrayEquals(originalData, java.util.Arrays.copyOf(buffer, read));
        }
    }

    @Test
    public void testBzip2Decoder_ReadsData() throws IOException {
        byte[] originalData = "BZip2 test data".getBytes();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (BZip2CompressorOutputStream bzos = new BZip2CompressorOutputStream(baos)) {
            bzos.write(originalData);
        }
        byte[] compressedData = baos.toByteArray();
        
        Coders.CoderBase decoder = new Coders.BZIP2Decoder();
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();
        coder.properties = new byte[0];
        
        try (InputStream in = decoder.decode(new ByteArrayInputStream(compressedData), coder, EMPTY_PASSWORD)) {
            byte[] buffer = new byte[originalData.length];
            int read = in.read(buffer);
            assertArrayEquals(originalData, java.util.Arrays.copyOf(buffer, read));
        }
    }

    @Test
    public void testAES256Decoder_MissingProperties_DecryptionError() throws IOException {
        Coders.CoderBase decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[0];
        try {
            decoder.decode(new ByteArrayInputStream(new byte[0]), coder, SAMPLE_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Decryption error"));
        }
    }

    @Test
    public void testAES256Decoder_WithPassword() throws IOException {
        Coders.CoderBase decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        try {
            decoder.decode(new ByteArrayInputStream(new byte[0]), coder, SAMPLE_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Decryption error"));
        }
    }

    @Test
    public void testCopyDecoder_Encode() throws IOException {
        Coders.CopyDecoder copyDecoder = new Coders.CopyDecoder();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream result = copyDecoder.encode(outputStream, EMPTY_PASSWORD);
        assertSame(outputStream, result);
    }

    @Test
    public void testCoderId_StoreMethodAndCoder() {
        Coders.CoderBase coder = new Coders.CopyDecoder();
        Coders.CoderId coderId = new Coders.CoderId(SevenZMethod.COPY, coder);
        assertEquals(SevenZMethod.COPY, coderId.method);
        assertSame(coder, coderId.coder);
    }

    @Test
    public void testCoderBase_DefaultEncode_ThrowsException() {
        Coders.CoderBase coder = new Coders.CoderBase() {
            @Override
            InputStream decode(InputStream in, Coder coder, byte[] password) throws IOException {
                return in;
            }
        };
        try {
            coder.encode(new ByteArrayOutputStream(), EMPTY_PASSWORD);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testDeflateDecoder_Encode() throws IOException {
        Coders.DeflateDecoder deflateDecoder = new Coders.DeflateDecoder();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream result = deflateDecoder.encode(outputStream, EMPTY_PASSWORD);
        assertTrue(result instanceof DeflaterOutputStream);
        result.close();
    }

    @Test
    public void testBzip2Decoder_Encode() throws IOException {
        Coders.BZIP2Decoder bzip2Decoder = new Coders.BZIP2Decoder();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        OutputStream result = bzip2Decoder.encode(outputStream, EMPTY_PASSWORD);
        assertTrue(result instanceof BZip2CompressorOutputStream);
        result.close();
    }

    @Test
    public void testAES256Decoder_Encode_ThrowsException() {
        Coders.CoderBase aesDecoder = new Coders.AES256SHA256Decoder();
        try {
            aesDecoder.encode(new ByteArrayOutputStream(), EMPTY_PASSWORD);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("method doesn't support writing", e.getMessage());
        }
    }

    @Test
    public void testAES256Decoder_DecodeWithPasswordAndCycles() throws IOException {
        Coders.CoderBase decoder = new Coders.AES256SHA256Decoder();
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[] { 
            (byte) 0x3C, // byte0: numCyclesPower=0x3C, flags
            (byte) 0x00, // byte1: ivSize=0, saltSize=0
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
        };
        try {
            decoder.decode(new ByteArrayInputStream(new byte[0]), coder, SAMPLE_PASSWORD);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Decryption error"));
        }
    }

    @Test
    public void testDummyByteAddingInputStream_FirstRead() throws IOException {
        java.io.ByteArrayInputStream emptyStream = new java.io.ByteArrayInputStream(new byte[0]);
        Coders.DummyByteAddingInputStream dummyStream = new Coders.DummyByteAddingInputStream(emptyStream);
        assertEquals(0, dummyStream.read());
        assertEquals(-1, dummyStream.read());
    }

    @Test
    public void testDummyByteAddingInputStream_ReadWithBuffer() throws IOException {
        byte[] buffer = new byte[10];
        java.io.ByteArrayInputStream emptyStream = new java.io.ByteArrayInputStream(new byte[0]);
        Coders.DummyByteAddingInputStream dummyStream = new Coders.DummyByteAddingInputStream(emptyStream);
        assertEquals(1, dummyStream.read(buffer, 0, 10));
        assertEquals(0, buffer[0]);
        assertEquals(-1, dummyStream.read(buffer, 0, 10));
    }

    @Test
    public void testDummyByteAddingInputStream_ReadWithData() throws IOException {
        byte[] data = { 1, 2, 3 };
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(data);
        Coders.DummyByteAddingInputStream dummyStream = new Coders.DummyByteAddingInputStream(inputStream);
        byte[] buffer = new byte[10];
        int read = dummyStream.read(buffer, 0, 10);
        assertEquals(3, read);
        assertArrayEquals(new byte[] { 1, 2, 3 }, java.util.Arrays.copyOf(buffer, read));
        assertEquals(1, dummyStream.read(buffer, 0, 10));
        assertEquals(0, buffer[0]);
    }
}