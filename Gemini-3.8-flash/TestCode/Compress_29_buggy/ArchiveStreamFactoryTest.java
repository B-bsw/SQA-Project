package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveInputStream;
import org.apache.commons.compress.archivers.cpio.CpioArchiveOutputStream;
import org.apache.commons.compress.archivers.dump.DumpArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveInputStream;
import org.apache.commons.compress.archivers.jar.JarArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveStreamFactoryTest {

    private static final byte[] ZIP_SIG = new byte[] { 0x50, 0x4B, 0x03, 0x04 };
    private static final byte[] AR_SIG = new byte[] { '!', '<', 'a', 'r', 'c', 'h', '>', '\n' };
    private static final byte[] ARJ_SIG = new byte[] { (byte) 0x60, (byte) 0xEA };
    private static final byte[] CPIO_SIG = new byte[] { '0', '7', '0', '7', '0', '1' };
    private static final byte[] SEVEN_Z_SIG = new byte[] { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };

    private static class UnmarkableInputStream extends InputStream {
        private final InputStream in;

        public UnmarkableInputStream(InputStream in) {
            this.in = in;
        }

        public int read() throws IOException {
            return in.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return in.read(b, off, len);
        }

        public boolean markSupported() {
            return false;
        }
    }

    private static class BrokenResetInputStream extends ByteArrayInputStream {
        public BrokenResetInputStream(byte[] buf) {
            super(buf);
        }

        public synchronized void reset() {
            throw new RuntimeException(new IOException("Reset failed"));
        }
    }

    private static class ResetIOExceptionInputStream extends InputStream {
        private final byte[] data;
        private int pos = 0;

        public ResetIOExceptionInputStream(byte[] data) {
            this.data = data;
        }

        public int read() throws IOException {
            if (pos < data.length) {
                return data[pos++] & 0xFF;
            }
            return -1;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (pos >= data.length) {
                return -1;
            }
            int available = data.length - pos;
            int toRead = len < available ? len : available;
            System.arraycopy(data, pos, b, off, toRead);
            pos += toRead;
            return toRead;
        }

        public boolean markSupported() {
            return true;
        }

        public synchronized void mark(int readlimit) {
        }

        public synchronized void reset() throws IOException {
            throw new IOException("Simulated reset failure");
        }
    }

    @Test
    public void defaultConstructor_givenNoArgs_shouldInitializeNullEncodings() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        Assert.assertNull(factory.getEntryEncoding());
    }

    @Test
    public void parameterizedConstructor_givenEncoding_shouldStoreEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        Assert.assertEquals("UTF-8", factory.getEntryEncoding());
    }

    @Test
    public void setEntryEncoding_givenDefaultConstructor_shouldAllowChangingEncoding() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        Assert.assertNull(factory.getEntryEncoding());
        factory.setEntryEncoding("ISO-8859-1");
        Assert.assertEquals("ISO-8859-1", factory.getEntryEncoding());
        factory.setEntryEncoding(null);
        Assert.assertNull(factory.getEntryEncoding());
    }

    @Test
    public void setEntryEncoding_givenParameterizedConstructor_shouldThrowIllegalStateException() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        try {
            factory.setEntryEncoding("ISO-8859-1");
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Cannot overide encoding set by the constructor", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenNullArchiverName_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenNullInputStream_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("InputStream must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenUnknownArchiverName_shouldThrowArchiveException() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream("unknownFormat", new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().indexOf("not found") != -1);
        }
    }

    @Test
    public void createArchiveInputStream_givenSevenZ_shouldThrowStreamingNotSupportedException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException e) {
            Assert.assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void createArchiveInputStream_givenAr_shouldReturnArArchiveInputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(ArchiveStreamFactory.AR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenArj_shouldReturnArjArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.ARJ, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof ArjArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("CP437");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.ARJ, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof ArjArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenZip_shouldReturnZipArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.ZIP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof ZipArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.ZIP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof ZipArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenTar_shouldReturnTarArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.TAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof TarArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.TAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof TarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenJar_shouldReturnJarArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.JAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof JarArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.JAR, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof JarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenCpio_shouldReturnCpioArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof CpioArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.CPIO, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof CpioArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenDump_shouldReturnDumpArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(ArchiveStreamFactory.DUMP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais1 instanceof DumpArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(ArchiveStreamFactory.DUMP, new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(ais2 instanceof DumpArchiveInputStream);
    }

    @Test
    public void createArchiveOutputStream_givenNullArchiverName_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenNullOutputStream_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("OutputStream must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenUnknownArchiverName_shouldThrowArchiveException() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveOutputStream("unknownFormat", new ByteArrayOutputStream());
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().indexOf("not found") != -1);
        }
    }

    @Test
    public void createArchiveOutputStream_givenSevenZ_shouldThrowStreamingNotSupportedException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveOutputStream(ArchiveStreamFactory.SEVEN_Z, new ByteArrayOutputStream());
            Assert.fail("Expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException e) {
            Assert.assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void createArchiveOutputStream_givenAr_shouldReturnArArchiveOutputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.AR, new ByteArrayOutputStream());
        Assert.assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenZip_shouldReturnZipArchiveOutputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveOutputStream aos1 = defaultFactory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        Assert.assertTrue(aos1 instanceof ZipArchiveOutputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos2 = customFactory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, new ByteArrayOutputStream());
        Assert.assertTrue(aos2 instanceof ZipArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenTar_shouldReturnTarArchiveOutputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveOutputStream aos1 = defaultFactory.createArchiveOutputStream(ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        Assert.assertTrue(aos1 instanceof TarArchiveOutputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos2 = customFactory.createArchiveOutputStream(ArchiveStreamFactory.TAR, new ByteArrayOutputStream());
        Assert.assertTrue(aos2 instanceof TarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenJar_shouldReturnJarArchiveOutputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveOutputStream aos = factory.createArchiveOutputStream(ArchiveStreamFactory.JAR, new ByteArrayOutputStream());
        Assert.assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenCpio_shouldReturnCpioArchiveOutputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveOutputStream aos1 = defaultFactory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        Assert.assertTrue(aos1 instanceof CpioArchiveOutputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveOutputStream aos2 = customFactory.createArchiveOutputStream(ArchiveStreamFactory.CPIO, new ByteArrayOutputStream());
        Assert.assertTrue(aos2 instanceof CpioArchiveOutputStream);
    }

    @Test
    public void autoDetect_givenNullStream_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream((InputStream) null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Stream must not be null.", e.getMessage());
        }
    }

    @Test
    public void autoDetect_givenMarkNotSupported_shouldThrowIllegalArgumentException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream unmarkable = new UnmarkableInputStream(new ByteArrayInputStream(new byte[10]));
        try {
            factory.createArchiveInputStream(unmarkable);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Mark is not supported.", e.getMessage());
        }
    }

    @Test
    public void autoDetect_givenResetThrowsIOException_shouldThrowArchiveException() {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        InputStream brokenStream = new ResetIOExceptionInputStream(new byte[32]);
        try {
            factory.createArchiveInputStream(brokenStream);
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertEquals("Could not use reset and mark operations.", e.getMessage());
            Assert.assertNotNull(e.getCause());
        }
    }

    @Test
    public void autoDetect_givenZipSignature_shouldReturnZipArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(new ByteArrayInputStream(ZIP_SIG));
        Assert.assertTrue(ais1 instanceof ZipArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(new ByteArrayInputStream(ZIP_SIG));
        Assert.assertTrue(ais2 instanceof ZipArchiveInputStream);
    }

    @Test
    public void autoDetect_givenArSignature_shouldReturnArArchiveInputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(new ByteArrayInputStream(AR_SIG));
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void autoDetect_givenCpioSignature_shouldReturnCpioArchiveInputStream() throws Exception {
        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(new ByteArrayInputStream(CPIO_SIG));
        Assert.assertTrue(ais1 instanceof CpioArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(new ByteArrayInputStream(CPIO_SIG));
        Assert.assertTrue(ais2 instanceof CpioArchiveInputStream);
    }

    @Test
    public void autoDetect_givenArjSignature_shouldReturnArjArchiveInputStream() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        ArchiveInputStream ais = factory.createArchiveInputStream(new ByteArrayInputStream(ARJ_SIG));
        Assert.assertTrue(ais instanceof ArjArchiveInputStream);
    }

    @Test
    public void autoDetect_givenSevenZSignature_shouldThrowStreamingNotSupportedException() throws Exception {
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(new ByteArrayInputStream(SEVEN_Z_SIG));
            Assert.fail("Expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException e) {
            Assert.assertEquals(ArchiveStreamFactory.SEVEN_Z, e.getFormat());
        }
    }

    @Test
    public void autoDetect_givenDumpSignature_shouldReturnDumpArchiveInputStream() throws Exception {
        byte[] dumpSig = new byte[32];
        dumpSig[24] = (byte) 0x6B;
        dumpSig[25] = (byte) 0xEA;
        dumpSig[26] = 0x00;
        dumpSig[27] = 0x00;

        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(new ByteArrayInputStream(dumpSig));
        Assert.assertTrue(ais1 instanceof DumpArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(new ByteArrayInputStream(dumpSig));
        Assert.assertTrue(ais2 instanceof DumpArchiveInputStream);
    }

    @Test
    public void autoDetect_givenTarSignature_shouldReturnTarArchiveInputStream() throws Exception {
        byte[] tarHeader = new byte[512];
        byte[] magic = new byte[] { 'u', 's', 't', 'a', 'r', 0 };
        System.arraycopy(magic, 0, tarHeader, 257, magic.length);

        ArchiveStreamFactory defaultFactory = new ArchiveStreamFactory();
        ArchiveInputStream ais1 = defaultFactory.createArchiveInputStream(new ByteArrayInputStream(tarHeader));
        Assert.assertTrue(ais1 instanceof TarArchiveInputStream);

        ArchiveStreamFactory customFactory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais2 = customFactory.createArchiveInputStream(new ByteArrayInputStream(tarHeader));
        Assert.assertTrue(ais2 instanceof TarArchiveInputStream);
    }

    @Test
    public void autoDetect_givenTarChecksumValidWithoutMagic_shouldReturnTarArchiveInputStream() throws Exception {
        byte[] tarHeader = new byte[512];
        byte[] name = "test.txt".getBytes("US-ASCII");
        System.arraycopy(name, 0, tarHeader, 0, name.length);

        byte[] mode = "0000644\0".getBytes("US-ASCII");
        System.arraycopy(mode, 0, tarHeader, 100, mode.length);

        byte[] uid = "0000765\0".getBytes("US-ASCII");
        System.arraycopy(uid, 0, tarHeader, 108, uid.length);

        byte[] gid = "0000765\0".getBytes("US-ASCII");
        System.arraycopy(gid, 0, tarHeader, 116, gid.length);

        byte[] size = "00000000000\0".getBytes("US-ASCII");
        System.arraycopy(size, 0, tarHeader, 124, size.length);

        byte[] mtime = "13425123456\0".getBytes("US-ASCII");
        System.arraycopy(mtime, 0, tarHeader, 136, mtime.length);

        for (int i = 148; i < 156; i++) {
            tarHeader[i] = ' ';
        }

        long unsignedSum = 0;
        for (int i = 0; i < tarHeader.length; i++) {
            unsignedSum += (tarHeader[i] & 0xFF);
        }

        String octalSum = Long.toOctalString(unsignedSum);
        while (octalSum.length() < 6) {
            octalSum = "0" + octalSum;
        }
        byte[] chkBytes = (octalSum + "\0 ").getBytes("US-ASCII");
        System.arraycopy(chkBytes, 0, tarHeader, 148, 8);

        ArchiveStreamFactory factory = new ArchiveStreamFactory("UTF-8");
        ArchiveInputStream ais = factory.createArchiveInputStream(new ByteArrayInputStream(tarHeader));
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void autoDetect_given512NonTarBytes_shouldThrowArchiveException() {
        byte[] nonTarData = new byte[512];
        for (int i = 0; i < nonTarData.length; i++) {
            nonTarData[i] = (byte) 0xFF;
        }

        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(new ByteArrayInputStream(nonTarData));
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertEquals("No Archiver found for the stream signature", e.getMessage());
        }
    }

    @Test
    public void autoDetect_givenUnrecognizedShortStream_shouldThrowArchiveException() {
        byte[] shortData = new byte[] { 1, 2, 3, 4 };
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(new ByteArrayInputStream(shortData));
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertEquals("No Archiver found for the stream signature", e.getMessage());
        }
    }

    @Test
    public void autoDetect_givenEmptyStream_shouldThrowArchiveException() {
        byte[] emptyData = new byte[0];
        ArchiveStreamFactory factory = new ArchiveStreamFactory();
        try {
            factory.createArchiveInputStream(new ByteArrayInputStream(emptyData));
            Assert.fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            Assert.assertEquals("No Archiver found for the stream signature", e.getMessage());
        }
    }
}