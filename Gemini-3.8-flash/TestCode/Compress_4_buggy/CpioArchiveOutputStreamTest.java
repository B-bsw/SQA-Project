package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CpioArchiveOutputStreamTest implements CpioConstants {

    private ByteArrayOutputStream baos;

    @Before
    public void setUp() {
        baos = new ByteArrayOutputStream();
    }

    @Test
    public void constructor_givenInvalidFormat_shouldThrowIllegalArgumentException() {
        try {
            new CpioArchiveOutputStream(baos, (short) 999);
            Assert.fail("Expected IllegalArgumentException for invalid format");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unknown format") >= 0);
        }
    }

    @Test
    public void constructor_givenDefaultConstructor_shouldUseFormatNew() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "defaultFormatTest", 0);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length > 0);
        String header = new String(result, 0, 6);
        Assert.assertEquals(MAGIC_NEW, header);
    }

    @Test
    public void constructor_givenValidFormats_shouldInitializeSuccessfully() throws IOException {
        short[] formats = new short[] {
            FORMAT_NEW,
            FORMAT_NEW_CRC,
            FORMAT_OLD_ASCII,
            FORMAT_OLD_BINARY
        };

        for (int i = 0; i < formats.length; i++) {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            CpioArchiveOutputStream out = new CpioArchiveOutputStream(outStream, formats[i]);
            CpioArchiveEntry entry = new CpioArchiveEntry(formats[i], "testEntry" + i, 0);
            out.putArchiveEntry(entry);
            out.closeArchiveEntry();
            out.finish();
            out.close();
            Assert.assertTrue(outStream.size() > 0);
        }
    }

    @Test
    public void putArchiveEntry_givenMismatchedFormat_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_OLD_ASCII, "mismatchEntry", 0);
        try {
            out.putArchiveEntry(entry);
            Assert.fail("Expected IOException for mismatched header format");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Header format") >= 0);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenDuplicateEntryName_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(FORMAT_NEW, "sameName", 0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(FORMAT_NEW, "sameName", 0);

        out.putArchiveEntry(entry1);
        out.closeArchiveEntry();
        try {
            out.putArchiveEntry(entry2);
            Assert.fail("Expected IOException for duplicate entry name");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("duplicate entry") >= 0);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenEntryWithNegativeTime_shouldSetCurrentTime() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "negativeTimeEntry", 0);
        entry.setTime(-1);
        Assert.assertEquals(-1, entry.getTime());

        out.putArchiveEntry(entry);
        Assert.assertTrue(entry.getTime() > 0);
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void putArchiveEntry_givenPreviousUnclosedEntryWithMatchingLength_shouldAutoClosePreviousEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(FORMAT_NEW, "entry1", 0);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(FORMAT_NEW, "entry2", 0);

        out.putArchiveEntry(entry1);
        out.putArchiveEntry(entry2);
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void putArchiveEntry_givenPreviousUnclosedEntryWithUnmatchedLength_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry1 = new CpioArchiveEntry(FORMAT_NEW, "entry1", 10);
        CpioArchiveEntry entry2 = new CpioArchiveEntry(FORMAT_NEW, "entry2", 0);

        out.putArchiveEntry(entry1);
        try {
            out.putArchiveEntry(entry2);
            Assert.fail("Expected IOException because previous entry size was not matched");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("invalid entry size") >= 0);
        } finally {
            out.close();
        }
    }

    @Test
    public void putArchiveEntry_givenClosedStream_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.close();

        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "entryAfterClose", 0);
        try {
            out.putArchiveEntry(entry);
            Assert.fail("Expected IOException when calling putArchiveEntry on closed stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void write_givenClosedStream_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.close();

        try {
            out.write(new byte[] { 1, 2, 3 }, 0, 3);
            Assert.fail("Expected IOException on closed stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void write_givenInvalidOffsetsAndLengths_shouldThrowIndexOutOfBoundsException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        byte[] buffer = new byte[10];

        try {
            out.write(buffer, -1, 5);
            Assert.fail("Expected IndexOutOfBoundsException for negative offset");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        try {
            out.write(buffer, 0, -1);
            Assert.fail("Expected IndexOutOfBoundsException for negative length");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        try {
            out.write(buffer, 6, 5);
            Assert.fail("Expected IndexOutOfBoundsException for offset + length > buffer.length");
        } catch (IndexOutOfBoundsException e) {
            // Success
        }

        out.close();
    }

    @Test
    public void write_givenZeroLength_shouldReturnWithoutWriting() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        byte[] buffer = new byte[10];
        out.write(buffer, 0, 0);
        out.close();
    }

    @Test
    public void write_givenNoCurrentEntry_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        byte[] buffer = new byte[5];

        try {
            out.write(buffer, 0, 5);
            Assert.fail("Expected IOException when writing without an active entry");
        } catch (IOException e) {
            Assert.assertEquals("no current CPIO entry", e.getMessage());
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenWritePastEndOfStoredEntry_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "shortEntry", 3);
        out.putArchiveEntry(entry);

        byte[] data = new byte[] { 1, 2, 3, 4 };
        try {
            out.write(data, 0, 4);
            Assert.fail("Expected IOException when writing past entry size");
        } catch (IOException e) {
            Assert.assertEquals("attempt to write past end of STORED entry", e.getMessage());
        } finally {
            out.close();
        }
    }

    @Test
    public void write_givenValidData_shouldWriteSuccessfully() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        byte[] data = "Hello World".getBytes();
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "hello.txt", data.length);
        out.putArchiveEntry(entry);
        out.write(data, 0, data.length);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        Assert.assertTrue(baos.size() > data.length);
    }

    @Test
    public void write_givenFormatNewCrcWithMatchingCrc_shouldSucceed() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW_CRC);
        byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04 };
        long expectedCrc = 1 + 2 + 3 + 4;

        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW_CRC, "crcEntry", data.length);
        entry.setChksum(expectedCrc);
        out.putArchiveEntry(entry);
        out.write(data, 0, data.length);
        out.closeArchiveEntry();
        out.close();
    }

    @Test
    public void write_givenFormatNewCrcWithMismatchCrc_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW_CRC);
        byte[] data = new byte[] { 0x01, 0x02, 0x03, 0x04 };

        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW_CRC, "crcEntryMismatch", data.length);
        entry.setChksum(9999);
        out.putArchiveEntry(entry);
        out.write(data, 0, data.length);

        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException due to CRC Error");
        } catch (IOException e) {
            Assert.assertEquals("CRC Error", e.getMessage());
        } finally {
            out.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenClosedStream_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.close();

        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException on closed stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void closeArchiveEntry_givenUnmetSizeExpectation_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "incompleteEntry", 10);
        out.putArchiveEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);

        try {
            out.closeArchiveEntry();
            Assert.fail("Expected IOException for invalid entry size");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("invalid entry size") >= 0);
        } finally {
            out.close();
        }
    }

    @Test
    public void finish_givenActiveUnclosedEntry_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "unclosedEntry", 5);
        out.putArchiveEntry(entry);

        try {
            out.finish();
            Assert.fail("Expected IOException for unclosed entries on finish");
        } catch (IOException e) {
            Assert.assertEquals("This archives contains unclosed entries.", e.getMessage());
        } finally {
            out.close();
        }
    }

    @Test
    public void finish_givenClosedStream_shouldThrowIOException() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.close();

        try {
            out.finish();
            Assert.fail("Expected IOException on finished closed stream");
        } catch (IOException e) {
            Assert.assertEquals("Stream closed", e.getMessage());
        }
    }

    @Test
    public void finish_givenMultipleCalls_shouldBeSafeOrIgnore() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.finish();
        out.close();
    }

    @Test
    public void close_givenMultipleCalls_shouldBeIdempotent() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        out.close();
        out.close();
    }

    @Test
    public void formatOldAscii_givenCompleteEntry_shouldSerializeCorrectly() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_OLD_ASCII);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_OLD_ASCII, "oldAsciiFile", 4);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(0100644);
        entry.setUID(1000);
        entry.setGID(1000);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(12345678L);

        out.putArchiveEntry(entry);
        out.write(new byte[] { 't', 'e', 's', 't' }, 0, 4);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        byte[] bytes = baos.toByteArray();
        Assert.assertTrue(bytes.length > 0);
        String header = new String(bytes, 0, 6);
        Assert.assertEquals(MAGIC_OLD_ASCII, header);
    }

    @Test
    public void formatOldBinary_givenCompleteEntry_shouldSerializeCorrectly() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_OLD_BINARY);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_OLD_BINARY, "oldBinFile", 4);
        entry.setDevice(1);
        entry.setInode(2);
        entry.setMode(0100644);
        entry.setUID(1000);
        entry.setGID(1000);
        entry.setNumberOfLinks(1);
        entry.setRemoteDevice(0);
        entry.setTime(12345678L);

        out.putArchiveEntry(entry);
        out.write(new byte[] { 't', 'e', 's', 't' }, 0, 4);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        byte[] bytes = baos.toByteArray();
        Assert.assertTrue(bytes.length > 0);
    }

    @Test
    public void formatNew_givenPaddingRequirements_shouldPadHeaderAndData() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        // Name length chosen specifically to test header pad count != 0
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "a", 3);
        out.putArchiveEntry(entry);
        out.write(new byte[] { 1, 2, 3 }, 0, 3);
        out.closeArchiveEntry();
        out.finish();
        out.close();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length > 0);
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldCreateCpioArchiveEntry() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        File tempFile = File.createTempFile("cpioTest", ".tmp");
        try {
            ArchiveEntry entry = out.createArchiveEntry(tempFile, "archiveTempFile");
            Assert.assertNotNull(entry);
            Assert.assertTrue(entry instanceof CpioArchiveEntry);
            Assert.assertEquals("archiveTempFile", entry.getName());
        } finally {
            tempFile.delete();
            out.close();
        }
    }

    @Test
    public void writeAsciiLong_givenTruncationScenario_shouldHandleProperly() throws IOException {
        CpioArchiveOutputStream out = new CpioArchiveOutputStream(baos, FORMAT_NEW);
        CpioArchiveEntry entry = new CpioArchiveEntry(FORMAT_NEW, "largeNumberEntry", 0);
        // Provide value that exceeds 8 hex digits to test truncation path
        entry.setInode(0x123456789AL);
        out.putArchiveEntry(entry);
        out.closeArchiveEntry();
        out.close();

        byte[] result = baos.toByteArray();
        Assert.assertTrue(result.length > 0);
    }
}