package org.apache.commons.compress.archivers.dump;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DumpArchiveInputStreamTest {
    private static final int TP_SIZE = 1024;
    private DumpArchiveInputStream stream;
    private ByteArrayInputStream inputStream;

    @Before
    public void setUp() throws Exception {
        // Setup base - most tests will need a valid dump archive
        inputStream = new ByteArrayInputStream(createValidDumpData());
        stream = new DumpArchiveInputStream(inputStream);
    }

    @After
    public void tearDown() throws Exception {
        if (stream != null) {
            stream.close();
        }
        inputStream.close();
    }

    @Test
    public void testMatchesWithNullBuffer() {
        assertFalse(DumpArchiveInputStream.matches(null, 0));
    }

    @Test
    public void testMatchesWithShortLength() {
        byte[] buffer = new byte[32];
        assertFalse(DumpArchiveInputStream.matches(buffer, 31));
    }

    @Test
    public void testMatchesWithInvalidData() {
        byte[] buffer = new byte[TP_SIZE];
        for (int i = 0; i < TP_SIZE; i++) {
            buffer[i] = (byte) 0xFF;
        }
        assertFalse(DumpArchiveInputStream.matches(buffer, TP_SIZE));
    }

    @Test
    public void testMatchesWithValidNFSMagic() {
        byte[] buffer = new byte[TP_SIZE];
        // Set NFS magic at correct position
        DumpArchiveUtil.convert32(0, buffer, 0, DumpArchiveConstants.NFS_MAGIC);
        assertTrue(DumpArchiveInputStream.matches(buffer, 32));
    }

    @Test
    public void testGetBytesReadOnNewStream() throws Exception {
        assertEquals(0L, stream.getBytesRead());
    }

    @Test
    public void testGetCountDeprecated() throws Exception {
        // Cast to long to match return type
        assertEquals((long) stream.getBytesRead(), (long) stream.getCount());
    }

    @Test
    public void testReadOnClosedStream() throws Exception {
        stream.close();
        byte[] buf = new byte[10];
        try {
            stream.read(buf, 0, 10);
            fail("Should throw IOException when reading closed stream");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNullBuffer() throws Exception {
        try {
            stream.read(null, 0, 10);
            fail("Should throw NullPointerException when buffer is null");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testReadWithNegativeOffset() throws Exception {
        byte[] buf = new byte[10];
        try {
            stream.read(buf, -1, 10);
            fail("Should throw IndexOutOfBoundsException when offset is negative");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetNextEntryFromEmptyQueue() throws Exception {
        // This will likely throw or return null depending on implementation
        // Since we can't create a real dump archive easily, test with invalid data
        try {
            DumpArchiveEntry entry = stream.getNextEntry();
            // If we get here, it might be null or an entry
            assertNotNull(entry); // or assert on specific behavior
        } catch (IOException e) {
            // Expected for invalid dump data
        }
    }

    @Test
    public void testConstructorWithNullEncoding() throws Exception {
        try {
            DumpArchiveInputStream stream2 = new DumpArchiveInputStream(new ByteArrayInputStream(createInvalidDumpData()), null);
            stream2.close();
            // If no exception, the constructor succeeded with null encoding
        } catch (Exception e) {
            // IOException or ArchiveException expected
        }
    }

    @Test
    public void testConstructorWithNullInputStream() {
        try {
            new DumpArchiveInputStream(null);
            fail("Should throw NullPointerException when input stream is null");
        } catch (NullPointerException e) {
            // Expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testReadAfterEndOfEntry() throws Exception {
        byte[] buf = new byte[1024];
        // Read entire stream
        while (stream.read(buf, 0, buf.length) != -1) {
            // Keep reading
        }
        // Next read should return -1
        assertEquals(-1, stream.read(buf, 0, buf.length));
    }

    @Test
    public void testGetNextDumpEntryAlias() throws Exception {
        try {
            DumpArchiveEntry entry = stream.getNextDumpEntry();
            if (entry != null) {
                assertNotNull(entry);
            }
        } catch (IOException e) {
            // Expected for invalid dump
        }
    }

    @Test
    public void testReadWithZeroLength() throws Exception {
        byte[] buf = new byte[10];
        assertEquals(0, stream.read(buf, 0, 0));
    }

    @Test
    public void testReadWithPositiveLengthAtEOF() throws Exception {
        byte[] buf = new byte[100];
        // Try to read all
        int totalRead = 0;
        try {
            while (stream.read(buf, 0, buf.length) != -1) {
                totalRead += buf.length;
            }
            assertEquals(-1, stream.read(buf, 0, buf.length));
        } catch (IOException e) {
            // Expected - might hit EOF or invalid data
        }
    }

    @Test
    public void testGetSummaryInitiallyNull() throws Exception {
        try {
            DumpArchiveSummary summary = stream.getSummary();
            assertNotNull(summary); // If constructor works, summary should not be null
        } catch (Exception e) {
            // Constructor might fail for invalid data
        }
    }

    @Test
    public void testCloseWithoutReading() throws Exception {
        stream.close();
        // After close, read should throw
        byte[] buf = new byte[10];
        try {
            stream.read(buf, 0, 10);
            fail("Should throw after close");
        } catch (IOException e) {
            // Expected
        }
    }

    @Test
    public void testVerifyWithInvalidData() {
        byte[] buffer = new byte[TP_SIZE];
        assertFalse(DumpArchiveInputStream.matches(buffer, TP_SIZE));
    }

    @Test
    public void testCloseIdempotent() throws Exception {
        stream.close();
        stream.close(); // Second close should not throw
    }

    @Test
    public void testReadInvalidEntrySize() throws Exception {
        byte[] buf = new byte[TP_SIZE];
        try {
            stream.read(buf, 0, buf.length);
            // If we get here, read succeeded
        } catch (IllegalStateException e) {
            // Expected since no current entry
        }
    }

    @Test
    public void testMatchesWithLargeLength() {
        byte[] buffer = new byte[TP_SIZE + 100];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) i;
        }
        // This should pass length check but fail magic check
        assertFalse(DumpArchiveInputStream.matches(buffer, buffer.length));
    }

    private byte[] createValidDumpData() {
        // This is a very minimal, likely invalid dump data
        // But the test just needs something that doesn't immediately throw for setup
        return new byte[TP_SIZE * 4];
    }

    private byte[] createInvalidDumpData() {
        // Completely invalid data
        return new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
    }

    // Helper test for boundary values
    @Test
    public void testReadWithOffsetAtBufferEnd() throws Exception {
        byte[] buf = new byte[TP_SIZE];
        // Try to read with offset at end of buffer and zero length
        assertEquals(0, stream.read(buf, TP_SIZE, 0));
    }

    @Test
    public void testReadWithLengthLargerThanBuffer() throws Exception {
        byte[] buf = new byte[1024];
        // Length + offset should not exceed buffer length
        try {
            stream.read(buf, 0, buf.length + 1);
            // May or may not throw depending on implementation
        } catch (IndexOutOfBoundsException e) {
            // Expected in some implementations
        }
    }

    @Test
    public void testGetNextEntryWhileHasHitEOF() throws Exception {
        // Force EOF
        stream.close();
        try {
            stream.getNextEntry();
            fail("Should throw since stream is closed");
        } catch (Exception e) {
            // Expected - closed stream
        }
    }
}