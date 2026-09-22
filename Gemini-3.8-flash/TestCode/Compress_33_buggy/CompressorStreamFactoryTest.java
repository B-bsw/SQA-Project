package org.apache.commons.compress.compressors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorInputStream;
import org.apache.commons.compress.compressors.deflate.DeflateCompressorOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class CompressorStreamFactoryTest {

    private static final byte[] TEST_DATA = new byte[] { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };

    private byte[] createGzipData(byte[] data) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        GzipCompressorOutputStream out = new GzipCompressorOutputStream(bout);
        out.write(data);
        out.close();
        return bout.toByteArray();
    }

    private byte[] createBzip2Data(byte[] data) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        BZip2CompressorOutputStream out = new BZip2CompressorOutputStream(bout);
        out.write(data);
        out.close();
        return bout.toByteArray();
    }

    private byte[] createDeflateData(byte[] data) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DeflateCompressorOutputStream out = new DeflateCompressorOutputStream(bout);
        out.write(data);
        out.close();
        return bout.toByteArray();
    }

    private static class NonMarkSupportedInputStream extends InputStream {
        public int read() {
            return -1;
        }

        public boolean markSupported() {
            return false;
        }
    }

    private static class BrokenInputStream extends InputStream {
        public int read() throws IOException {
            throw new IOException("Simulated read exception");
        }

        public boolean markSupported() {
            return true;
        }

        public synchronized void mark(int readlimit) {
        }

        public synchronized void reset() throws IOException {
            throw new IOException("Simulated reset exception");
        }
    }

    private static class BrokenOutputStream extends OutputStream {
        public void write(int b) throws IOException {
            throw new IOException("Simulated write exception");
        }

        public void write(byte[] b, int off, int len) throws IOException {
            throw new IOException("Simulated write exception");
        }
    }

    @Test
    public void testConstants_definedValues_shouldMatchSpecification() {
        Assert.assertEquals("bzip2", CompressorStreamFactory.BZIP2);
        Assert.assertEquals("gz", CompressorStreamFactory.GZIP);
        Assert.assertEquals("pack200", CompressorStreamFactory.PACK200);
        Assert.assertEquals("xz", CompressorStreamFactory.XZ);
        Assert.assertEquals("lzma", CompressorStreamFactory.LZMA);
        Assert.assertEquals("snappy-framed", CompressorStreamFactory.SNAPPY_FRAMED);
        Assert.assertEquals("snappy-raw", CompressorStreamFactory.SNAPPY_RAW);
        Assert.assertEquals("z", CompressorStreamFactory.Z);
        Assert.assertEquals("deflate", CompressorStreamFactory.DEFLATE);
    }

    @Test
    public void constructor_default_shouldInitializeWithFalseDecompressConcatenated() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void constructor_booleanArgTrue_shouldSetDecompressConcatenatedTrue() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        Assert.assertTrue(factory.getDecompressConcatenated());
    }

    @Test
    public void constructor_booleanArgFalse_shouldSetDecompressConcatenatedFalse() {
        CompressorStreamFactory factory = new CompressorStreamFactory(false);
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test
    public void setDecompressConcatenated_afterDefaultConstructor_shouldUpdateValue() {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        Assert.assertFalse(factory.getDecompressConcatenated());

        factory.setDecompressConcatenated(true);
        Assert.assertTrue(factory.getDecompressConcatenated());

        factory.setDecompressConcatenated(false);
        Assert.assertFalse(factory.getDecompressConcatenated());
    }

    @Test(expected = IllegalStateException.class)
    public void setDecompressConcatenated_afterParameterizedConstructor_shouldThrowIllegalStateException() {
        CompressorStreamFactory factory = new CompressorStreamFactory(true);
        factory.setDecompressConcatenated(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorInputStream_nullStream_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream((InputStream) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorInputStream_streamWithoutMarkSupport_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(new NonMarkSupportedInputStream());
    }

    @Test
    public void createCompressorInputStream_autodetectGzip_shouldReturnGzipCompressorInputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] gzData = createGzipData(TEST_DATA);
        ByteArrayInputStream bin = new ByteArrayInputStream(gzData);

        CompressorInputStream in = factory.createCompressorInputStream(bin);
        try {
            Assert.assertTrue(in instanceof GzipCompressorInputStream);
        } finally {
            in.close();
        }
    }

    @Test
    public void createCompressorInputStream_autodetectBzip2_shouldReturnBzip2CompressorInputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] bzData = createBzip2Data(TEST_DATA);
        ByteArrayInputStream bin = new ByteArrayInputStream(bzData);

        CompressorInputStream in = factory.createCompressorInputStream(bin);
        try {
            Assert.assertTrue(in instanceof BZip2CompressorInputStream);
        } finally {
            in.close();
        }
    }

    @Test(expected = CompressorException.class)
    public void createCompressorInputStream_unrecognizedSignature_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] unknownData = new byte[] { 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C };
        ByteArrayInputStream bin = new ByteArrayInputStream(unknownData);

        factory.createCompressorInputStream(bin);
    }

    @Test(expected = CompressorException.class)
    public void createCompressorInputStream_ioExceptionDuringDetection_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(new BrokenInputStream());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorInputStreamByName_nullName_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream bin = new ByteArrayInputStream(TEST_DATA);
        factory.createCompressorInputStream(null, bin);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorInputStreamByName_nullStream_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorInputStreamByName_nullNameAndStream_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorInputStream(null, null);
    }

    @Test(expected = CompressorException.class)
    public void createCompressorInputStreamByName_unknownName_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayInputStream bin = new ByteArrayInputStream(TEST_DATA);
        factory.createCompressorInputStream("unknown-compressor", bin);
    }

    @Test
    public void createCompressorInputStreamByName_gzipCaseInsensitive_shouldReturnGzipInputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] gzData = createGzipData(TEST_DATA);
        ByteArrayInputStream bin = new ByteArrayInputStream(gzData);

        CompressorInputStream in = factory.createCompressorInputStream("GZ", bin);
        try {
            Assert.assertTrue(in instanceof GzipCompressorInputStream);
        } finally {
            in.close();
        }
    }

    @Test
    public void createCompressorInputStreamByName_bzip2CaseInsensitive_shouldReturnBzip2InputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] bzData = createBzip2Data(TEST_DATA);
        ByteArrayInputStream bin = new ByteArrayInputStream(bzData);

        CompressorInputStream in = factory.createCompressorInputStream("BZip2", bin);
        try {
            Assert.assertTrue(in instanceof BZip2CompressorInputStream);
        } finally {
            in.close();
        }
    }

    @Test
    public void createCompressorInputStreamByName_deflateCaseInsensitive_shouldReturnDeflateInputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] defData = createDeflateData(TEST_DATA);
        ByteArrayInputStream bin = new ByteArrayInputStream(defData);

        CompressorInputStream in = factory.createCompressorInputStream("Deflate", bin);
        try {
            Assert.assertTrue(in instanceof DeflateCompressorInputStream);
        } finally {
            in.close();
        }
    }

    @Test(expected = CompressorException.class)
    public void createCompressorInputStreamByName_corruptGzipStream_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        byte[] invalidGzipData = new byte[] { 0x1f, 0x20, 0x00, 0x00 };
        ByteArrayInputStream bin = new ByteArrayInputStream(invalidGzipData);

        factory.createCompressorInputStream(CompressorStreamFactory.GZIP, bin);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorOutputStream_nullName_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        factory.createCompressorOutputStream(null, bout);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorOutputStream_nullStream_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(CompressorStreamFactory.GZIP, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createCompressorOutputStream_nullNameAndStream_shouldThrowIllegalArgumentException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(null, null);
    }

    @Test(expected = CompressorException.class)
    public void createCompressorOutputStream_unknownName_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        factory.createCompressorOutputStream("unsupported-format", bout);
    }

    @Test
    public void createCompressorOutputStream_gzipCaseInsensitive_shouldReturnGzipOutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        CompressorOutputStream out = factory.createCompressorOutputStream("GZ", bout);
        try {
            Assert.assertTrue(out instanceof GzipCompressorOutputStream);
        } finally {
            out.close();
        }
    }

    @Test
    public void createCompressorOutputStream_bzip2CaseInsensitive_shouldReturnBzip2OutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        CompressorOutputStream out = factory.createCompressorOutputStream("BZip2", bout);
        try {
            Assert.assertTrue(out instanceof BZip2CompressorOutputStream);
        } finally {
            out.close();
        }
    }

    @Test
    public void createCompressorOutputStream_deflateCaseInsensitive_shouldReturnDeflateOutputStream() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        CompressorOutputStream out = factory.createCompressorOutputStream("Deflate", bout);
        try {
            Assert.assertTrue(out instanceof DeflateCompressorOutputStream);
        } finally {
            out.close();
        }
    }

    @Test(expected = CompressorException.class)
    public void createCompressorOutputStream_brokenStreamOnInit_shouldThrowCompressorException() throws Exception {
        CompressorStreamFactory factory = new CompressorStreamFactory();
        factory.createCompressorOutputStream(CompressorStreamFactory.BZIP2, new BrokenOutputStream());
    }
}