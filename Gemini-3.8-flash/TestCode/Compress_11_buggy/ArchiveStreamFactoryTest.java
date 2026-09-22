package org.apache.commons.compress.archivers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveInputStream;
import org.apache.commons.compress.archivers.ar.ArArchiveOutputStream;
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
import org.junit.Before;
import org.junit.Test;

public class ArchiveStreamFactoryTest {

    private ArchiveStreamFactory factory;

    @Before
    public void setUp() {
        factory = new ArchiveStreamFactory();
    }

    @Test
    public void createArchiveInputStream_givenNullArchiverName_shouldThrowIllegalArgumentException() throws Exception {
        try {
            factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected IllegalArgumentException when archiverName is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenNullInputStream_shouldThrowIllegalArgumentException() throws Exception {
        try {
            factory.createArchiveInputStream(ArchiveStreamFactory.ZIP, null);
            Assert.fail("Expected IllegalArgumentException when in is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("InputStream must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenArNameLowerCase_shouldReturnArArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("ar", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenArNameUpperCase_shouldReturnArArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("AR", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenZipNameLowerCase_shouldReturnZipArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("zip", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenZipNameUpperCase_shouldReturnZipArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("ZIP", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenTarNameLowerCase_shouldReturnTarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("tar", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenTarNameUpperCase_shouldReturnTarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("TAR", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenJarNameLowerCase_shouldReturnJarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("jar", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenJarNameUpperCase_shouldReturnJarArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("JAR", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof JarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenCpioNameLowerCase_shouldReturnCpioArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("cpio", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenCpioNameUpperCase_shouldReturnCpioArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("CPIO", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenDumpNameLowerCase_shouldReturnDumpArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("dump", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof DumpArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenDumpNameUpperCase_shouldReturnDumpArchiveInputStream() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ArchiveInputStream ais = factory.createArchiveInputStream("DUMP", in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof DumpArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenUnknownName_shouldThrowArchiveException() {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        try {
            factory.createArchiveInputStream("unknown_format", in);
            Assert.fail("Expected ArchiveException for unknown format");
        } catch (ArchiveException e) {
            Assert.assertEquals("Archiver: unknown_format not found.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenNullArchiverName_shouldThrowIllegalArgumentException() throws Exception {
        try {
            factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
            Assert.fail("Expected IllegalArgumentException when archiverName is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenNullOutputStream_shouldThrowIllegalArgumentException() throws Exception {
        try {
            factory.createArchiveOutputStream(ArchiveStreamFactory.ZIP, null);
            Assert.fail("Expected IllegalArgumentException when out is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("OutputStream must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenArNameLowerCase_shouldReturnArArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("ar", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenArNameUpperCase_shouldReturnArArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("AR", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof ArArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenZipNameLowerCase_shouldReturnZipArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("zip", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenZipNameUpperCase_shouldReturnZipArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("ZIP", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof ZipArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenTarNameLowerCase_shouldReturnTarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("tar", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenTarNameUpperCase_shouldReturnTarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("TAR", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof TarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenJarNameLowerCase_shouldReturnJarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("jar", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenJarNameUpperCase_shouldReturnJarArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("JAR", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof JarArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenCpioNameLowerCase_shouldReturnCpioArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("cpio", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenCpioNameUpperCase_shouldReturnCpioArchiveOutputStream() throws Exception {
        OutputStream out = new ByteArrayOutputStream();
        ArchiveOutputStream aos = factory.createArchiveOutputStream("CPIO", out);
        Assert.assertNotNull(aos);
        Assert.assertTrue(aos instanceof CpioArchiveOutputStream);
    }

    @Test
    public void createArchiveOutputStream_givenDumpName_shouldThrowArchiveException() {
        OutputStream out = new ByteArrayOutputStream();
        try {
            factory.createArchiveOutputStream("dump", out);
            Assert.fail("Expected ArchiveException for dump output stream");
        } catch (ArchiveException e) {
            Assert.assertEquals("Archiver: dump not found.", e.getMessage());
        }
    }

    @Test
    public void createArchiveOutputStream_givenUnknownName_shouldThrowArchiveException() {
        OutputStream out = new ByteArrayOutputStream();
        try {
            factory.createArchiveOutputStream("unknown_format", out);
            Assert.fail("Expected ArchiveException for unknown format");
        } catch (ArchiveException e) {
            Assert.assertEquals("Archiver: unknown_format not found.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenNullStreamForAutoDetect_shouldThrowIllegalArgumentException() throws Exception {
        try {
            factory.createArchiveInputStream((InputStream) null);
            Assert.fail("Expected IllegalArgumentException when input stream is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Stream must not be null.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenNonMarkSupportedStream_shouldThrowIllegalArgumentException() throws Exception {
        InputStream nonMarkStream = new InputStream() {
            public int read() {
                return -1;
            }

            public boolean markSupported() {
                return false;
            }
        };

        try {
            factory.createArchiveInputStream(nonMarkStream);
            Assert.fail("Expected IllegalArgumentException when mark is not supported");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Mark is not supported.", e.getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenZipSignature_shouldReturnZipArchiveInputStream() throws Exception {
        byte[] zipHeader = new byte[] { (byte) 0x50, (byte) 0x4B, (byte) 0x03, (byte) 0x04, 0, 0, 0, 0, 0, 0, 0, 0 };
        InputStream in = new ByteArrayInputStream(zipHeader);

        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ZipArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenArSignature_shouldReturnArArchiveInputStream() throws Exception {
        byte[] arHeader = new byte[] { '!', '<', 'a', 'r', 'c', 'h', '>', '\n', 0, 0, 0, 0 };
        InputStream in = new ByteArrayInputStream(arHeader);

        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof ArArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenCpioSignature_shouldReturnCpioArchiveInputStream() throws Exception {
        byte[] cpioHeader = new byte[] { '0', '7', '0', '7', '0', '1', 0, 0, 0, 0, 0, 0 };
        InputStream in = new ByteArrayInputStream(cpioHeader);

        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof CpioArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenTarSignature_shouldReturnTarArchiveInputStream() throws Exception {
        byte[] tarHeader = new byte[512];
        tarHeader[257] = 'u';
        tarHeader[258] = 's';
        tarHeader[259] = 't';
        tarHeader[260] = 'a';
        tarHeader[261] = 'r';
        tarHeader[262] = '\0';
        InputStream in = new ByteArrayInputStream(tarHeader);

        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenEmptyTarBlockFallback_shouldReturnTarArchiveInputStream() throws Exception {
        byte[] emptyTarBlock = new byte[512];
        InputStream in = new ByteArrayInputStream(emptyTarBlock);

        ArchiveInputStream ais = factory.createArchiveInputStream(in);
        Assert.assertNotNull(ais);
        Assert.assertTrue(ais instanceof TarArchiveInputStream);
    }

    @Test
    public void createArchiveInputStream_givenResetFailure_shouldThrowArchiveException() {
        InputStream failingStream = new ByteArrayInputStream(new byte[12]) {
            public synchronized void reset() throws IOException {
                throw new IOException("Simulated reset failure");
            }
        };

        try {
            factory.createArchiveInputStream(failingStream);
            Assert.fail("Expected ArchiveException when reset fails");
        } catch (ArchiveException e) {
            Assert.assertEquals("Could not use reset and mark operations.", e.getMessage());
            Assert.assertNotNull(e.getCause());
            Assert.assertEquals("Simulated reset failure", e.getCause().getMessage());
        }
    }

    @Test
    public void createArchiveInputStream_givenInvalidSignatureData_shouldThrowArchiveException() {
        byte[] invalidHeader = new byte[512];
        for (int i = 0; i < invalidHeader.length; i++) {
            invalidHeader[i] = (byte) 0xFF;
        }
        InputStream in = new ByteArrayInputStream(invalidHeader);

        try {
            factory.createArchiveInputStream(in);
            Assert.fail("Expected ArchiveException for unknown stream signature");
        } catch (ArchiveException e) {
            Assert.assertEquals("No Archiver found for the stream signature", e.getMessage());
        }
    }
}