package org.apache.commons.compress.compressors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPOutputStream;

import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class CompressorStreamFactoryTest {

    private CompressorStreamFactory factory;

    @Before
    public void setUp() {
        factory = new CompressorStreamFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testCreateCompressorInputStreamWithNullName() {
        try (InputStream in = new ByteArrayInputStream(new byte[0])) {
            factory.createCompressorInputStream(null, in);
            fail("Expected IllegalArgumentException for null name");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithNullInputStream() {
        try {
            factory.createCompressorInputStream("gz", null);
            fail("Expected IllegalArgumentException for null stream");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithNullNameAndStream() {
        try {
            factory.createCompressorInputStream(null, null);
            fail("Expected IllegalArgumentException for null name and stream");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithInvalidName() {
        InputStream in = new ByteArrayInputStream(new byte[] {(byte) 0x1f, (byte) 0x8b});
        try {
            factory.createCompressorInputStream("invalid", in);
            fail("Expected CompressorException for invalid name");
        } catch (Exception e) {
            assertTrue(e instanceof CompressorException);
            assertTrue(e.getMessage().contains("not found"));
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithNullNameAndNullInput() {
        try {
            factory.createCompressorInputStream(null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithEmptySignature() {
        try {
            factory.createCompressorInputStream(new ByteArrayInputStream(new byte[0]));
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithUnknownSignature() {
        try {
            factory.createCompressorInputStream(new ByteArrayInputStream(new byte[] {1, 2, 3, 4}));
            fail("Expected CompressorException");
        } catch (Exception e) {
            assertTrue(e instanceof CompressorException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithBZip2Signature() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (var bzip2Out = new BZip2CompressorOutputStream(output)) {
            bzip2Out.write("hello".getBytes());
        }
        try (InputStream in = new ByteArrayInputStream(output.toByteArray())) {
            CompressorInputStream result = factory.createCompressorInputStream(in);
            assertNotNull(result);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithGzipSignature() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (GZIPOutputStream gzipOut = new GZIPOutputStream(output)) {
            gzipOut.write("hello".getBytes());
        }
        try (InputStream in = new ByteArrayInputStream(output.toByteArray())) {
            CompressorInputStream result = factory.createCompressorInputStream(in);
            assertNotNull(result);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithGzipNameAndNullOutput() {
        try {
            factory.createCompressorInputStream(CompressorStreamFactory.GZIP, null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorOutputStreamWithNullName() {
        try {
            factory.createCompressorOutputStream(null, new ByteArrayOutputStream());
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorOutputStreamWithNullOutput() {
        try {
            factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorOutputStreamWithInvalidName() {
        try {
            factory.createCompressorOutputStream("invalid", new ByteArrayOutputStream());
            fail("Expected CompressorException");
        } catch (Exception e) {
            assertTrue(e instanceof CompressorException);
        }
    }

    @Test
    public void testCreateCompressorOutputStreamWithGzipName() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, output)) {
            out.write("hello".getBytes());
        }
        assertTrue(output.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStreamWithBZip2Name() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.BZIP2, output)) {
            out.write("hello".getBytes());
        }
        assertTrue(output.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStreamWithDeflateName() throws Exception {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.DEFLATE, output)) {
            out.write("hello".getBytes());
        }
        assertTrue(output.size() > 0);
    }

    @Test
    public void testCreateCompressorOutputStreamWithXZName() throws Exception {
        if (XZUtils.isXZCompressionAvailable()) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.XZ, output)) {
                out.write("hello".getBytes());
            }
            assertTrue(output.size() > 0);
        }
    }

    @Test
    public void testCreateCompressorOutputStreamWithLZMAName() throws Exception {
        if (LZMAUtils.isLZMACompressionAvailable()) {
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            try (CompressorOutputStream out = factory.createCompressorOutputStream(CompressorStreamFactory.LZMA, output)) {
                out.write("hello".getBytes());
            }
            assertTrue(output.size() > 0);
        }
    }

    @Test
    public void testSetDecompressConcatenatedDeprecated() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.setDecompressConcatenated(true);
        assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void testSetDecompressConcatenatedWithConstructorSetting() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        try {
            factory.setDecompressConcatenated(true);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Cannot override"));
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithDecompressConcatenatedTrue() throws Exception {
        CompressorStreamFactory factoryWithTrue = new CompressorStreamFactory(true);
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try (GZIPOutputStream gzipOut = new GZIPOutputStream(output)) {
            gzipOut.write("hello".getBytes());
        }
        try (InputStream in = new ByteArrayInputStream(output.toByteArray())) {
            CompressorInputStream result = factoryWithTrue.createCompressorInputStream(in);
            assertNotNull(result);
            byte[] buffer = new byte[5];
            int read = result.read(buffer);
            assertEquals(5, read);
            assertEquals("hello", new String(buffer));
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithDeflateNameAndNullInput() {
        try {
            factory.createCompressorInputStream(CompressorStreamFactory.DEFLATE, null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithZNameAndNullInput() {
        try {
            factory.createCompressorInputStream(CompressorStreamFactory.Z, null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void testCreateCompressorInputStreamWithPack200NameAndNullInput() {
        try {
            factory.createCompressorInputStream(CompressorStreamFactory.PACK200, null);
            fail("Expected IllegalArgumentException");
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }
}