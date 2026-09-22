package org.apache.commons.compress.archivers.cpio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

public class CpioArchiveOutputStreamTest {

    private ByteArrayOutputStream byteOut;
    private CpioArchiveOutputStream cpioOut;

    @Before
    public void setUp() {
        byteOut = new ByteArrayOutputStream();
    }

    @Test
    public void testConstructorValidFormats() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW_CRC);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_OLD_ASCII);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_OLD_BINARY);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW, 512);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW, 512, "UTF-8");
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut);
        cpioOut.close();
        cpioOut = new CpioArchiveOutputStream(byteOut, "UTF-8");
        cpioOut.close();
    }

    @Test
    public void testConstructorInvalidFormat() {
        try {
            new CpioArchiveOutputStream(byteOut, (short) -1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Unknown format: -1", e.getMessage());
        }
    }

    @Test
    public void testConstructorNullOutputStream() {
        try {
            new CpioArchiveOutputStream(null, CpioConstants.FORMAT_NEW);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void testPutArchiveEntryWhenFinished() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        cpioOut.finish();
        try {
            CpioArchiveEntry entry = new CpioArchiveEntry();
            entry.setName("test");
            cpioOut.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryClosedStream() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        cpioOut.close();
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        try {
            cpioOut.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryDuplicateName() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry();
        entry1.setName("file1");
        entry1.setFormat(CpioConstants.FORMAT_NEW);
        entry1.setMode(CpioConstants.C_ISREG);
        entry1.setSize(0);

        CpioArchiveEntry entry2 = new CpioArchiveEntry();
        entry2.setName("file1");
        entry2.setFormat(CpioConstants.FORMAT_NEW);
        entry2.setMode(CpioConstants.C_ISREG);
        entry2.setSize(0);

        cpioOut.putArchiveEntry(entry1);
        try {
            cpioOut.putArchiveEntry(entry2);
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("duplicate entry: file1", e.getMessage());
        }
    }

    @Test
    public void testPutArchiveEntryMismatchedFormat() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("file1");
        entry.setFormat(CpioConstants.FORMAT_NEW_CRC);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(0);
        try {
            cpioOut.putArchiveEntry(entry);
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("Header format: 2 does not match"));
        }
    }

    @Test
    public void testCloseArchiveEntrySizeMismatch() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(10);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[]{1, 2, 3});
        try {
            cpioOut.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("invalid entry size"));
        }
    }

    @Test
    public void testWriteWithInvalidOffLen() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(10);
        cpioOut.putArchiveEntry(entry);

        try {
            cpioOut.write(new byte[]{1, 2, 3}, -1, 1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            cpioOut.write(new byte[]{1, 2, 3}, 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }

        try {
            cpioOut.write(new byte[]{1, 2, 3}, 2, 2);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testWriteZeroLength() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(0);
        cpioOut.putArchiveEntry(entry);
        cpioOut.closeArchiveEntry();
        cpioOut.close();
    }

    @Test
    public void testWriteExceedSize() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(2);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[]{1, 2, 3});
        try {
            cpioOut.closeArchiveEntry();
            fail("Expected IOException");
        } catch (IOException e) {
            assertTrue(e.getMessage().startsWith("invalid entry size"));
        }
    }

    @Test
    public void testWriteValidData() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(3);
        cpioOut.putArchiveEntry(entry);
        cpioOut.write(new byte[]{1, 2, 3});
        cpioOut.closeArchiveEntry();
        cpioOut.close();
        assertTrue(byteOut.size() > 0);
    }

    @Test
    public void testFinishNormalCase() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry();
        entry.setName("test");
        entry.setFormat(CpioConstants.FORMAT_NEW);
        entry.setMode(CpioConstants.C_ISREG);
        entry.setSize(0);
        cpioOut.putArchiveEntry(entry);
        cpioOut.closeArchiveEntry();
        cpioOut.finish();
        cpioOut.close();
    }

    @Test
    public void testFinishTwice() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        cpioOut.finish();
        try {
            cpioOut.putArchiveEntry(new CpioArchiveEntry());
            fail("Expected IOException");
        } catch (IOException e) {
            assertEquals("Stream has already been finished", e.getMessage());
        }
        cpioOut.close();
    }

    @Test
    public void testCreateArchiveEntry() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        File file = File.createTempFile("test", ".txt");
        try {
            CpioArchiveEntry entry = (CpioArchiveEntry) cpioOut.createArchiveEntry(file, "test.txt");
            assertNotNull(entry);
            assertEquals("test.txt", entry.getName());
            assertTrue(entry.getSize() >= 0);
        } finally {
            file.delete();
        }
    }

    @Test
    public void testWriteBinaryLong() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        java.lang.reflect.Method method = CpioArchiveOutputStream.class.getDeclaredMethod("writeBinaryLong", long.class, int.class, boolean.class);
        method.setAccessible(true);
        method.invoke(cpioOut, 0x11223344L, 4, true);
        method.invoke(cpioOut, 0x11223344L, 4, false);
        method.invoke(cpioOut, 0x1122L, 2, true);
        method.invoke(cpioOut, 0x1122L, 2, false);
        method.invoke(cpioOut, 0x11L, 1, true);
        method.invoke(cpioOut, 0x11L, 1, false);
        cpioOut.close();
    }

    @Test
    public void testWriteAsciiLong() throws IOException {
        cpioOut = new CpioArchiveOutputStream(byteOut, CpioConstants.FORMAT_NEW);
        java.lang.reflect.Method method = CpioArchiveOutputStream.class.getDeclaredMethod("writeAsciiLong", long.class, int.class, int.class);
        method.setAccessible(true);
        method.invoke(cpioOut, 0x1122334455667788L, 16, 16);
        method.invoke(cpioOut, 0x1122334455667788L, 16, 8);
        method.invoke(cpioOut, 0x1122334455667788L, 10, 16);
        method.invoke(cpioOut, 0x1122334455667788L, 10, 8);
        cpioOut.close();
    }
}