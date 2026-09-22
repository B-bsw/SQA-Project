package org.apache.commons.compress.archivers;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public class ArchiveStreamFactoryTest {

    private ArchiveStreamFactory factory;

    @Before
    public void setUp() {
        factory = new ArchiveStreamFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testCreateArchiveOutputStreamWithNullArchiverName() {
        try {
            factory.createArchiveOutputStream(null, new ByteArrayOutputStream());
            Assert.fail("Expected IllegalArgumentException for null archiver name");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        } catch (ArchiveException e) {
            Assert.fail("Unexpected ArchiveException");
        }
    }

    @Test
    public void testCreateArchiveOutputStreamWithNullOutputStream() {
        try {
            factory.createArchiveOutputStream("zip", null);
            Assert.fail("Expected IllegalArgumentException for null output stream");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("OutputStream must not be null.", e.getMessage());
        } catch (ArchiveException e) {
            Assert.fail("Unexpected ArchiveException");
        }
    }

    @Test
    public void testCreateArchiveOutputStreamWithInvalidArchiverName() {
        try {
            factory.createArchiveOutputStream("invalid", new ByteArrayOutputStream());
            Assert.fail("Expected ArchiveException for invalid archiver name");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().contains("invalid"));
        } catch (IllegalArgumentException e) {
            Assert.fail("Unexpected IllegalArgumentException");
        }
    }

    @Test
    public void testCreateArchiveOutputStreamWithUpperCaseZip() throws Exception {
        ArchiveOutputStream stream = factory.createArchiveOutputStream("ZIP", new ByteArrayOutputStream());
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof ZipArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithLowerCaseTar() throws Exception {
        ArchiveOutputStream stream = factory.createArchiveOutputStream("tar", new ByteArrayOutputStream());
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof TarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithMixedCaseJar() throws Exception {
        ArchiveOutputStream stream = factory.createArchiveOutputStream("JaR", new ByteArrayOutputStream());
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof JarArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithCpio() throws Exception {
        ArchiveOutputStream stream = factory.createArchiveOutputStream("cpio", new ByteArrayOutputStream());
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof CpioArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveOutputStreamWithAr() throws Exception {
        ArchiveOutputStream stream = factory.createArchiveOutputStream("AR", new ByteArrayOutputStream());
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof ArArchiveOutputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithNullInputStream() {
        try {
            factory.createArchiveInputStream("zip", null);
            Assert.fail("Expected IllegalArgumentException for null input stream");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("InputStream must not be null.", e.getMessage());
        } catch (ArchiveException e) {
            Assert.fail("Unexpected ArchiveException");
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithNullArchiverName() {
        try {
            factory.createArchiveInputStream(null, new ByteArrayInputStream(new byte[0]));
            Assert.fail("Expected IllegalArgumentException for null archiver name");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Archivername must not be null.", e.getMessage());
        } catch (ArchiveException e) {
            Assert.fail("Unexpected ArchiveException");
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithInvalidSignature() throws Exception {
        byte[] invalidData = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        InputStream in = new ByteArrayInputStream(invalidData);
        try {
            factory.createArchiveInputStream(in);
            Assert.fail("Expected ArchiveException for invalid signature");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().contains("No Archiver found"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithEmptyStream() throws Exception {
        byte[] emptyData = new byte[0];
        InputStream in = new ByteArrayInputStream(emptyData);
        try {
            factory.createArchiveInputStream(in);
            Assert.fail("Expected ArchiveException for empty stream");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().contains("No Archiver found"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithZipSignature() throws Exception {
        byte[] zipSignature = new byte[]{0x50, 0x4B, 0x03, 0x04};
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(zipSignature);
        bos.write(new byte[8]); // padding
        InputStream in = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream = factory.createArchiveInputStream(in);
        Assert.assertNotNull(stream);
        Assert.assertTrue(stream instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithJarSignature() throws Exception {
        byte[] jarSignature = new byte[]{0x50, 0x4B, 0x03, 0x04};
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(jarSignature);
        bos.write(new byte[8]); // padding
        InputStream in = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream = factory.createArchiveInputStream(in);
        // JAR is a subtype of ZIP, so it returns ZipArchiveInputStream
        Assert.assertTrue(stream instanceof ZipArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithArSignature() throws Exception {
        byte[] arSignature = new byte[]{0x21, 0x3C, 0x61, 0x72, 0x63, 0x68, 0x3E, 0x0D, 0x0A};
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(arSignature);
        bos.write(new byte[3]); // padding
        InputStream in = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream = factory.createArchiveInputStream(in);
        Assert.assertTrue(stream instanceof ArArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithTarSignature() throws Exception {
        byte[] tarHeader = new byte[512];
        tarHeader[0] = 0x75; // 'u' - no actual TAR signature, but TAR uses magic at offset 257
        tarHeader[257] = 'u';
        tarHeader[258] = 's';
        tarHeader[259] = 't';
        tarHeader[260] = 'a';
        tarHeader[261] = 'r';
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(tarHeader, 0, 512);
        InputStream in = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream = factory.createArchiveInputStream(in);
        Assert.assertTrue(stream instanceof TarArchiveInputStream);
    }

    @Test
    public void testCreateArchiveInputStreamWithNonMarkableStream() throws Exception {
        InputStream in = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
            @Override
            public boolean markSupported() {
                return false;
            }
        };
        try {
            factory.createArchiveInputStream(in);
            Assert.fail("Expected IllegalArgumentException for non-markable stream");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Mark is not supported.", e.getMessage());
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithMarkableStreamButInvalidData() throws Exception {
        InputStream in = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        try {
            factory.createArchiveInputStream(in);
            Assert.fail("Expected ArchiveException for invalid signature");
        } catch (ArchiveException e) {
            Assert.assertTrue(e.getMessage().contains("No Archiver found"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamWithDuplicateNames() throws Exception {
        byte[] zipSignature = new byte[]{0x50, 0x4B, 0x03, 0x04};
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(zipSignature);
        bos.write(new byte[8]); // padding
        InputStream in = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream1 = factory.createArchiveInputStream(in);
        Assert.assertNotNull(stream1);
        // Test again with a different stream
        InputStream in2 = new ByteArrayInputStream(bos.toByteArray());
        ArchiveInputStream stream2 = factory.createArchiveInputStream(in2);
        Assert.assertNotNull(stream2);
    }
}