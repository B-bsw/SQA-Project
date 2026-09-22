package org.apache.commons.compress.archivers;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;

public class ArchiveStreamFactoryTest {

    private static final String TAR_NAME = "tar";
    private static final String ZIP_NAME = "zip";
    private static final String JAR_NAME = "jar";
    private static final String CPIO_NAME = "cpio";
    private static final String DUMP_NAME = "dump";
    private static final String SEVEN_Z_NAME = "7z";
    private static final String AR_NAME = "ar";
    private static final String ARJ_NAME = "arj";
    private static final String UNKNOWN = "unknown";

    private final ArchiveStreamFactory factory = new ArchiveStreamFactory();

    @Test
    public void testCreateArchiveInputStreamNullName() {
        try {
            factory.createArchiveInputStream((String) null, new ByteArrayInputStream(new byte[0]));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Archivername"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveInputStreamNullStream() {
        try {
            factory.createArchiveInputStream(TAR_NAME, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("InputStream"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveInputStreamUnsupportedMark() {
        try {
            InputStream in = new InputStream() {
                @Override
                public int read() {
                    return -1;
                }

                @Override
                public boolean markSupported() {
                    return false;
                }
            };
            factory.createArchiveInputStream(TAR_NAME, in);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Mark"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveInputStreamUnknownArchiver() {
        try {
            factory.createArchiveInputStream(UNKNOWN, new ByteArrayInputStream(new byte[0]));
            fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("not found"));
        }
    }

    @Test
    public void testCreateArchiveInputStreamSevenZNonStreamable() {
        try {
            factory.createArchiveInputStream(SEVEN_Z_NAME, new ByteArrayInputStream(new byte[0]));
            fail("Expected StreamingNotSupportedException");
        } catch (StreamingNotSupportedException e) {
            assertTrue(e.getMessage().contains("7z"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveInputStreamNullNameForInput() {
        try {
            factory.createArchiveInputStream((String) null, new ByteArrayInputStream(new byte[0]));
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNull(e.getMessage());
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveOutputStreamNullStream() {
        try {
            factory.createArchiveOutputStream(TAR_NAME, null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("OutputStream"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testCreateArchiveOutputStreamUnknownArchiver() {
        try {
            factory.createArchiveOutputStream(UNKNOWN, new java.io.ByteArrayOutputStream());
            fail("Expected ArchiveException");
        } catch (ArchiveException e) {
            assertTrue(e.getMessage().contains("not found"));
        }
    }
}