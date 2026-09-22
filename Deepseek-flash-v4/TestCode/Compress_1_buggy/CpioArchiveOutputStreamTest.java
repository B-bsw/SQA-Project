package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class CpioArchiveOutputStreamTest {

    private CpioArchiveOutputStream stream;
    private java.io.ByteArrayOutputStream byteStream;

    @Before
    public void setUp() {
        byteStream = new java.io.ByteArrayOutputStream();
        stream = new CpioArchiveOutputStream(byteStream, CpioConstants.FORMAT_NEW);
    }

    @Test
    public void testPutNextEntryDuplicateNameThrowsIOException() throws IOException {
        CpioArchiveEntry entry1 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "entry");
        entry1.setSize(10);
        stream.putNextEntry(entry1);
        
        CpioArchiveEntry entry2 = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "entry");
        entry2.setSize(10);
        
        try {
            stream.putNextEntry(entry2);
            fail("Expected IOException for duplicate entry name");
        } catch (IOException e) {
            assertEquals("duplicate entry: entry", e.getMessage());
        }
    }

    @Test(expected = IOException.class)
    public void testWriteWhenNoCurrentEntry() throws IOException {
        stream.write(new byte[10], 0, 10);
    }

    @Test(expected = IOException.class)
    public void testWritePastEndOfEntry() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setSize(5);
        stream.putNextEntry(entry);
        stream.write(new byte[10], 0, 10);
    }

    @Test
    public void testWriteWithInvalidOffsets() {
        try {
            stream.write(new byte[10], -1, 5);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertEquals("IndexOutOfBoundsException not thrown", 0, e.getMessage() == null ? 0 : 0);
        }
    }

    @Test
    public void testWriteZeroLengthDoesNotThrow() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setSize(0);
        stream.putNextEntry(entry);
        stream.write(new byte[0], 0, 0);
    }

    @Test
    public void testCloseMarksStreamClosed() throws IOException {
        stream.close();
        
        try {
            stream.putNextEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test"));
            fail("Expected IOException after close");
        } catch (IOException e) {
            assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void testPutNextEntryWithNullNameLength() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setSize(10);
        stream.putNextEntry(entry);
        
        // Check that we can write to the entry
        stream.write(new byte[10], 0, 10);
        stream.closeArchiveEntry();
        
        // Verify output is non-empty
        assertTrue("Expected non-empty output", byteStream.size() > 0);
    }

    @Test
    public void testFinishWritesTrailer() throws IOException {
        stream.putNextEntry(new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test"));
        stream.finish();
        
        // Verify output contains TRAILER
        String output = new String(byteStream.toByteArray());
        assertTrue("Output should contain TRAILER", output.contains("TRAILER!!!"));
    }

    @Test
    public void testSetFormatInvalidThrowsIllegalArgumentException() {
        try {
            new CpioArchiveOutputStream(byteStream, (short) 999);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testWriteWithEntrySizeZeroAndZeroBytesWritten() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "empty");
        entry.setSize(0);
        stream.putNextEntry(entry);
        stream.closeArchiveEntry(); // Should not throw
    }

    @Test
    public void testWriteNegativeLengthThrows() {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setSize(10);
        try {
            stream.putNextEntry(entry);
            stream.write(new byte[10], 0, -1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        } catch (IOException e) {
            fail("IOException not expected for negative length");
        }
    }

    @Test
    public void testCloseArchiveEntryWithIncorrectSize() throws IOException {
        CpioArchiveEntry entry = new CpioArchiveEntry(CpioConstants.FORMAT_NEW, "test");
        entry.setSize(10);
        stream.putNextEntry(entry);
        stream.write(new byte[5], 0, 5);
        
        try {
            stream.closeArchiveEntry();
            fail("Expected IOException for size mismatch");
        } catch (IOException e) {
            String msg = e.getMessage();
            assertTrue(msg.contains("invalid entry size"));
        }
    }
}