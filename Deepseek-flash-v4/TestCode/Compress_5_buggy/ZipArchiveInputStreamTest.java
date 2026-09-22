package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static final byte[] EMPTY_ZIP = new byte[] {
        0x50, 0x4b, 0x05, 0x06, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00
    };

    private static final byte[] STORED_ENTRY_ZIP = new byte[] {
        0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x21, 0x51, (byte) 0x8d, 0x3c, 0x05, 0x00, 0x00,
        0x00, 0x05, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        (byte) 0x61, 0x62, 0x63, 0x64, 0x65
    };

    private static final byte[] STORED_ENTRY_LARGE_ZIP = new byte[] {
        0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x21, 0x51, (byte) 0x8d, 0x3c, 0x05, 0x00, 0x00,
        0x00, 0x05, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        (byte) 0x61, 0x62, 0x63, 0x64, 0x65
    };

    private static final byte[] STORED_ENTRY_MULTI_ZIP = new byte[] {
        0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x21, 0x51, (byte) 0x8d, 0x3c, 0x05, 0x00, 0x00,
        0x00, 0x05, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        (byte) 0x61, 0x62, 0x63, 0x64, 0x65,
        0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
        0x00, 0x00, 0x21, 0x51, (byte) 0x8d, 0x3c, 0x05, 0x00, 0x00,
        0x00, 0x05, 0x00, 0x00, 0x00, 0x01, 0x00, 0x00, 0x00,
        (byte) 0x66, 0x67, 0x68, 0x69, 0x6a
    };

    private ZipArchiveInputStream zin;

    @Before
    public void setUp() throws Exception {
        // Not needed for static tests, but kept for consistency
    }

    @After
    public void tearDown() throws Exception {
        if (zin != null) {
            zin.close();
        }
    }

    @Test
    public void testMatches() throws Exception {
        byte[] signature = new byte[] {
            0x50, 0x4b, 0x03, 0x04, 0x14, 0x00
        };
        assertTrue(ZipArchiveInputStream.matches(signature, 6));
        assertFalse(ZipArchiveInputStream.matches(signature, 4));
        assertFalse(ZipArchiveInputStream.matches(new byte[0], 0));
        assertFalse(ZipArchiveInputStream.matches(new byte[] {1, 2, 3}, 3));
    }

    @Test
    public void testMatchesEOCD() {
        byte[] signature = new byte[] {
            0x50, 0x4b, 0x05, 0x06, 0x00, 0x00
        };
        assertTrue(ZipArchiveInputStream.matches(signature, 6));
    }

    @Test
    public void testMatchesNull() {
        try {
            ZipArchiveInputStream.matches(null, 0);
            fail("Should throw NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testConstructors() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        assertNotNull(zin);
        zin.close();
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP),
                                        "UTF-8", true);
        assertNotNull(zin);
        zin.close();
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP),
                                        "CP1252", false);
        assertNotNull(zin);
        zin.close();
        // Test with null encoding (default)
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP),
                                        null, false);
        assertNotNull(zin);
        zin.close();
    }

    @Test
    public void testGetNextEntryEmptyZip() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        assertNull(zin.getNextEntry());
        assertNull(zin.getNextEntry()); // subsequent calls return null
    }

    @Test
    public void testGetNextEntryStored() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(STORED_ENTRY_ZIP));
        ZipArchiveEntry entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(entry);
        assertEquals("a", entry.getName());
        assertEquals(ZipArchiveOutputStream.STORED, entry.getMethod());
        byte[] content = new byte[5];
        assertEquals(5, zin.read(content));
        assertEquals(0, new String(content, "UTF-8").compareTo("abcde"));
        assertEquals(-1, zin.read(content)); // EOF after entry
        entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNull(entry);
    }

    @Test
    public void testGetNextEntryWithUnicodeExtraField() throws Exception {
        // Craft a zip with unicode extra field
        byte[] zipWithUnicode = new byte[] {
            0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x08, 0x00, 0x00, 0x00,
            0x00, 0x00, 0x21, 0x51, (byte) 0x8d, 0x3c, 0x05, 0x00, 0x00,
            0x00, 0x05, 0x00, 0x00, 0x00, 0x09, 0x00, 0x00, 0x00,
            0x75, 0x00, 0x6e, 0x00, 0x69, 0x00, 0x63, 0x00, 0x6f, 0x00,
            0x64, 0x00, 0x65, 0x00, 0x01, 0x00, 0x00, 0x00, 0x05, 0x00,
            0x00, 0x00, 0x61, 0x62, 0x63, 0x64, 0x65
        };
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(zipWithUnicode));
        ZipArchiveEntry entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(entry);
        assertEquals("unico", entry.getName()); // from UTF-8 extra field
    }

    @Test
    public void testGetNextEntryInvalidSignature() throws Exception {
        byte[] invalid = new byte[] {1, 2, 3, 4, 5, 6, 7, 8};
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(invalid));
        assertNull(zin.getNextEntry());
    }

    @Test
    public void testGetNextEntryEOCDRightAway() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        assertNull(zin.getNextEntry());
    }

    @Test
    public void testGetNextEntryDeflated() throws Exception {
        // Create a deflated zip entry
        byte[] deflated = new byte[] {
            0x50, 0x4b, 0x03, 0x04, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
            (byte) 0x9b, (byte) 0xbe, 0x7b, 0x5d, 0x10, 0x00, 0x00,
            0x00, 0x03, 0x00, 0x00, 0x00, 0x0c, 0x00, 0x00, 0x00,
            (byte) 0x9b, (byte) 0x81, (byte) 0x9b, (byte) 0x9b
        };
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(deflated));
        ZipArchiveEntry entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(entry);
        assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());
        byte[] content = new byte[100];
        int read = zin.read(content);
        assertEquals(3, read);
        assertEquals("abc", new String(content, 0, read, "UTF-8"));
    }

    @Test
    public void testMultipleEntries() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(STORED_ENTRY_MULTI_ZIP));
        ZipArchiveEntry e1 = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(e1);
        assertEquals("a", e1.getName());
        byte[] buf = new byte[10];
        int n1 = zin.read(buf);
        assertEquals(5, n1);
        assertEquals("abcde", new String(buf, 0, n1));
        
        // Skip remaining bytes in the entry (if any) - read should return -1
        assertEquals(-1, zin.read(buf));
        
        ZipArchiveEntry e2 = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(e2);
        assertEquals("f", e2.getName());
        int n2 = zin.read(buf);
        assertEquals(5, n2);
        assertEquals("fghij", new String(buf, 0, n2));
        assertEquals(-1, zin.read(buf));
        assertNull(zin.getNextEntry());
    }

    @Test
    public void testSkip() throws Exception {
        // Create a zip with a large stored entry (e.g., more than 1024 bytes)
        // For testing skip, we'll use a stream with a single entry
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(STORED_ENTRY_LARGE_ZIP));
        ZipArchiveEntry entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(entry);
        long skipped = zin.skip(2);
        assertEquals(2, skipped);
        byte[] buf = new byte[3];
        assertEquals(3, zin.read(buf));
        assertEquals("cde", new String(buf, "UTF-8"));
        assertEquals(-1, zin.read(buf));
    }

    @Test
    public void testSkipNegative() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        try {
            zin.skip(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected
        }
    }

    @Test
    public void testReadArrayIndexOutOfBounds() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(STORED_ENTRY_ZIP));
        zin.getNextEntry();
        byte[] buf = new byte[10];
        try {
            zin.read(buf, 5, 10); // length > buffer.length - start
            fail("Expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReadNullBuffer() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(STORED_ENTRY_ZIP));
        ZipArchiveEntry entry = (ZipArchiveEntry) zin.getNextEntry();
        assertNotNull(entry);
        try {
            zin.read(null, 0, 5);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testReadAfterClose() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        zin.close();
        try {
            zin.read(new byte[10]);
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
        try {
            zin.getNextEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
        try {
            zin.closeEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testCloseEntryNullCurrent() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        zin.getNextEntry(); // returns null
        zin.closeEntry(); // should not throw
    }

    @Test
    public void testReadAfterEntryEnd() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        assertNull(zin.getNextEntry());
        assertEquals(-1, zin.read(new byte[10]));
    }

    @Test
    public void testSkipOnEmptyZip() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        assertEquals(0, zin.skip(10)); // no entries, so skip returns 0
    }

    @Test
    public void testCloseIdempotent() throws Exception {
        zin = new ZipArchiveInputStream(new ByteArrayInputStream(EMPTY_ZIP));
        zin.close();
        zin.close(); // should not throw
    }
}