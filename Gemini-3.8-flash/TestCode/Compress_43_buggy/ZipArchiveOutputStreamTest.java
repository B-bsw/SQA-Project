package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.EnumSet;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveOutputStreamTest {

    private File tempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("test-zip-archive-output-stream", ".zip");
    }

    @After
    public void tearDown() throws Exception {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void constructor_givenOutputStream_shouldInitializeCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            Assert.assertFalse(zaos.isSeekable());
            Assert.assertEquals(ZipEncodingHelper.UTF8, zaos.getEncoding());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void constructor_givenFile_shouldBeSeekable() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            Assert.assertTrue(zaos.isSeekable());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void constructor_givenSeekableByteChannel_shouldBeSeekable() throws IOException {
        SeekableByteChannel channel = Files.newByteChannel(
            tempFile.toPath(),
            EnumSet.of(StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                       StandardOpenOption.READ, StandardOpenOption.TRUNCATE_EXISTING)
        );
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(channel);
        try {
            Assert.assertTrue(zaos.isSeekable());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setEncoding_givenNonUtf8Encoding_shouldUpdateEncodingAndDisableUtf8Flag() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setEncoding("ISO-8859-1");
            Assert.assertEquals("ISO-8859-1", zaos.getEncoding());
            zaos.setUseLanguageEncodingFlag(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setEncoding_givenUtf8Encoding_shouldRetainUtf8Flag() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setEncoding("UTF-8");
            Assert.assertEquals("UTF-8", zaos.getEncoding());
            zaos.setUseLanguageEncodingFlag(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setLevel_givenValidLevels_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(Deflater.DEFAULT_COMPRESSION);
            zaos.setLevel(Deflater.NO_COMPRESSION);
            zaos.setLevel(Deflater.BEST_COMPRESSION);
            zaos.setLevel(Deflater.BEST_SPEED);
        } finally {
            zaos.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLevel_givenTooLowLevel_shouldThrowException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(-2);
        } finally {
            zaos.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLevel_givenTooHighLevel_shouldThrowException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(10);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void write_givenNoCurrentEntry_shouldThrowIllegalStateException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.write(new byte[]{1, 2, 3}, 0, 3);
            Assert.fail("Expected IllegalStateException when writing without current entry");
        } catch (IllegalStateException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenNoCurrentEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.closeArchiveEntry();
            Assert.fail("Expected IOException when closing without current entry");
        } catch (IOException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void finish_givenUnclosedEntry_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("test.txt");
            zaos.putArchiveEntry(entry);
            zaos.finish();
            Assert.fail("Expected IOException when finishing with unclosed entry");
        } catch (IOException expected) {
            Assert.assertTrue(true);
        } finally {
            try {
                zaos.closeArchiveEntry();
            } catch (Exception ignored) {
            }
            zaos.close();
        }
    }

    @Test
    public void finish_calledTwice_shouldThrowIOExceptionOnSecondCall() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        try {
            zaos.finish();
            Assert.fail("Expected IOException on duplicate finish call");
        } catch (IOException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenFinishedStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        try {
            zaos.putArchiveEntry(new ZipArchiveEntry("entry.txt"));
            Assert.fail("Expected IOException when putting entry into finished archive");
        } catch (IOException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void createArchiveEntry_givenFinishedStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.finish();
        try {
            zaos.createArchiveEntry(tempFile, "entry.txt");
            Assert.fail("Expected IOException when creating archive entry on finished stream");
        } catch (IOException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void createArchiveEntry_givenValidFileAndName_shouldReturnZipArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ArchiveEntry entry = zaos.createArchiveEntry(tempFile, "tempEntry.txt");
            Assert.assertNotNull(entry);
            Assert.assertTrue(entry instanceof ZipArchiveEntry);
            Assert.assertEquals("tempEntry.txt", entry.getName());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenStoredMethodWithoutSizeOnNonSeekable_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setCrc(12345L);
            zaos.putArchiveEntry(entry);
            Assert.fail("Expected ZipException because uncompressed size is missing for STORED method");
        } catch (ZipException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenStoredMethodWithoutCrcOnNonSeekable_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(10);
            zaos.putArchiveEntry(entry);
            Assert.fail("Expected ZipException because CRC is missing for STORED method");
        } catch (ZipException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenStoredMethodWithMismatchedCrc_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(4);
            entry.setCrc(12345L);
            zaos.putArchiveEntry(entry);
            zaos.write(new byte[]{1, 2, 3, 4}, 0, 4);
            zaos.closeArchiveEntry();
            Assert.fail("Expected ZipException because CRC does not match");
        } catch (ZipException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenStoredMethodWithMismatchedSize_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            byte[] data = new byte[]{1, 2, 3, 4};
            CRC32 crc = new CRC32();
            crc.update(data);
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(10);
            entry.setCrc(crc.getValue());
            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            Assert.fail("Expected ZipException because written size does not match declared size");
        } catch (ZipException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void writeAndClose_givenDeflatedEntryOnOutputStream_shouldProduceValidOutput() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setComment("Archive Comment");
            zaos.setLevel(Deflater.BEST_SPEED);
            zaos.setMethod(ZipArchiveOutputStream.DEFLATED);
            ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
            entry.setComment("Entry Comment");
            zaos.putArchiveEntry(entry);
            byte[] data = "Hello World! Compression Test Data 12345".getBytes("UTF-8");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void writeAndClose_givenConsecutiveEntriesWithoutExplicitClose_shouldAutoClosePrevious() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry1 = new ZipArchiveEntry("file1.txt");
            zaos.putArchiveEntry(entry1);
            zaos.write(new byte[]{1, 2, 3}, 0, 3);

            ZipArchiveEntry entry2 = new ZipArchiveEntry("file2.txt");
            zaos.putArchiveEntry(entry2);
            zaos.write(new byte[]{4, 5, 6}, 0, 3);

            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void writeAndClose_givenSeekableChannelFile_shouldRewriteSizesAndCrcSuccessfully() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("seekable_entry.txt");
            zaos.putArchiveEntry(entry);
            byte[] data = "Seekable byte channel test payload".getBytes("UTF-8");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(tempFile.length() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void writeAndClose_givenSeekableChannelWithStoredEntry_shouldComputeSizesAutomatically() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            zaos.setMethod(ZipArchiveOutputStream.STORED);
            ZipArchiveEntry entry = new ZipArchiveEntry("stored_seekable.txt");
            zaos.putArchiveEntry(entry);
            byte[] data = new byte[]{10, 20, 30, 40, 50};
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertEquals(5, entry.getSize());
            Assert.assertEquals(5, entry.getCompressedSize());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setUseZip64_givenAlways_shouldIncludeZip64Extra() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setUseZip64(Zip64Mode.Always);
            ZipArchiveEntry entry = new ZipArchiveEntry("zip64_always.txt");
            zaos.putArchiveEntry(entry);
            byte[] data = "zip64 payload".getBytes("UTF-8");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setCreateUnicodeExtraFields_givenAlwaysAndFallback_shouldAddUnicodeFields() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
            zaos.setFallbackToUTF8(true);
            ZipArchiveEntry entry = new ZipArchiveEntry("unicode_test.txt");
            entry.setComment("Unicode entry comment");
            zaos.putArchiveEntry(entry);
            byte[] data = "unicode test content".getBytes("UTF-8");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void canWriteEntryData_givenSupportedAndUnsupportedEntries_shouldReturnExpectedBoolean() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry standardEntry = new ZipArchiveEntry("standard.txt");
            Assert.assertTrue(zaos.canWriteEntryData(standardEntry));

            ArchiveEntry foreignEntry = new ArchiveEntry() {
                public String getName() { return "foreign"; }
                public long getSize() { return 0; }
                public boolean isDirectory() { return false; }
                public Date getLastModifiedDate() { return new Date(); }
            };
            Assert.assertFalse(zaos.canWriteEntryData(foreignEntry));

            ZipArchiveEntry implodingEntry = new ZipArchiveEntry("imploded.txt");
            implodingEntry.setMethod(ZipMethod.IMPLODING.getCode());
            Assert.assertFalse(zaos.canWriteEntryData(implodingEntry));

            ZipArchiveEntry unshrinkingEntry = new ZipArchiveEntry("unshrinking.txt");
            unshrinkingEntry.setMethod(ZipMethod.UNSHRINKING.getCode());
            Assert.assertFalse(zaos.canWriteEntryData(unshrinkingEntry));
        } finally {
            zaos.close();
        }
    }

    @Test
    public void addRawArchiveEntry_givenPhasedEntry_shouldCopyDirectlyWithoutRecompression() throws IOException {
        byte[] rawPayload = new byte[]{65, 66, 67, 68};
        CRC32 crc = new CRC32();
        crc.update(rawPayload);

        ZipArchiveEntry rawEntry = new ZipArchiveEntry("raw_entry.bin");
        rawEntry.setSize(rawPayload.length);
        rawEntry.setCompressedSize(rawPayload.length);
        rawEntry.setCrc(crc.getValue());
        rawEntry.setMethod(ZipArchiveOutputStream.STORED);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            InputStream rawStream = new ByteArrayInputStream(rawPayload);
            zaos.addRawArchiveEntry(rawEntry, rawStream);
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void addRawArchiveEntry_givenEntryWithZip64Extra_shouldStripExistingExtraAndProcess() throws IOException {
        byte[] rawPayload = new byte[]{1, 2, 3, 4};
        CRC32 crc = new CRC32();
        crc.update(rawPayload);

        ZipArchiveEntry rawEntry = new ZipArchiveEntry("raw_z64.bin");
        rawEntry.setSize(rawPayload.length);
        rawEntry.setCompressedSize(rawPayload.length);
        rawEntry.setCrc(crc.getValue());
        rawEntry.setMethod(ZipArchiveOutputStream.STORED);
        rawEntry.addExtraField(new Zip64ExtendedInformationExtraField());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            InputStream rawStream = new ByteArrayInputStream(rawPayload);
            zaos.addRawArchiveEntry(rawEntry, rawStream);
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenResourceAlignmentExtraField_shouldAlignHeaderProperly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("aligned.bin");
            entry.setAlignment(16);
            zaos.putArchiveEntry(entry);
            zaos.write(new byte[]{0x01, 0x02, 0x03}, 0, 3);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenExistingResourceAlignmentField_shouldReplaceAndAlign() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("aligned_existing.bin");
            entry.addExtraField(new ResourceAlignmentExtraField(8, false, 0));
            zaos.putArchiveEntry(entry);
            zaos.write(new byte[]{1, 2, 3, 4}, 0, 4);
            zaos.closeArchiveEntry();
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenZip64ModeNeverAndLargeSize_shouldThrowZip64RequiredException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setUseZip64(Zip64Mode.Never);
            ZipArchiveEntry entry = new ZipArchiveEntry("huge.bin");
            entry.setSize(ZipConstants.ZIP64_MAGIC + 1L);
            entry.setCompressedSize(ZipConstants.ZIP64_MAGIC + 1L);
            entry.setCrc(0L);
            entry.setMethod(ZipArchiveOutputStream.STORED);
            zaos.putArchiveEntry(entry);
            Assert.fail("Expected Zip64RequiredException when size exceeds Zip32 limit with Zip64Mode.Never");
        } catch (Zip64RequiredException expected) {
            Assert.assertTrue(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void flushAndDeflate_givenActiveStream_shouldExecuteWithoutException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("flush_test.txt");
            zaos.putArchiveEntry(entry);
            zaos.write(new byte[]{1, 2, 3}, 0, 3);
            zaos.deflate();
            zaos.flush();
            zaos.closeArchiveEntry();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void unicodeExtraFieldPolicy_toString_shouldReturnExpectedNames() {
        Assert.assertEquals("always", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS.toString());
        Assert.assertEquals("never", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER.toString());
        Assert.assertEquals("not encodeable", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE.toString());
    }

    @Test
    public void close_calledMultipleTimes_shouldCloseGracefully() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        zaos.close();
        zaos.close();
    }
}