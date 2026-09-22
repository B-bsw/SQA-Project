package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveOutputStreamTest {

    private File tempFile;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("zip_test", ".zip");
    }

    @After
    public void tearDown() throws Exception {
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
    }

    @Test
    public void isSeekable_givenStreamConstructor_shouldReturnFalse() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            Assert.assertFalse(zaos.isSeekable());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void isSeekable_givenFileConstructor_shouldReturnTrue() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            Assert.assertTrue(zaos.isSeekable());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void encoding_givenValidEncoding_shouldSetAndGetCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            Assert.assertEquals(ZipEncodingHelper.UTF8, zaos.getEncoding());
            zaos.setEncoding("US-ASCII");
            Assert.assertEquals("US-ASCII", zaos.getEncoding());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setUseLanguageEncodingFlag_givenVariousValues_shouldUpdateEfs() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setUseLanguageEncodingFlag(true);
            zaos.setUseLanguageEncodingFlag(false);
            zaos.setEncoding("US-ASCII");
            zaos.setUseLanguageEncodingFlag(true);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setComment_givenStringComment_shouldWriteCentralDirectoryEnd() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setComment("archive comment");
            zaos.finish();
            Assert.assertTrue(baos.size() > 0);
        } finally {
            zaos.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLevel_givenInvalidLowLevel_shouldThrowException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(-2);
        } finally {
            zaos.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setLevel_givenInvalidHighLevel_shouldThrowException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(10);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setLevel_givenValidLevel_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(Deflater.BEST_SPEED);
            zaos.setLevel(Deflater.BEST_COMPRESSION);
            zaos.setLevel(Deflater.DEFAULT_COMPRESSION);
            zaos.setLevel(Deflater.NO_COMPRESSION);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void setMethod_givenValidMethod_shouldUpdateDefaultMethod() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setMethod(ZipArchiveOutputStream.STORED);
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
            try {
                zaos.finish();
                Assert.fail("Expected IOException on unclosed entry");
            } catch (IOException expected) {
                Assert.assertEquals("This archives contains unclosed entries.", expected.getMessage());
            }
        } finally {
            try {
                zaos.closeArchiveEntry();
                zaos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void closeArchiveEntry_givenNullEntry_shouldReturnSilently() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.closeArchiveEntry();
        } finally {
            zaos.close();
        }
    }

    @Test(expected = ZipException.class)
    public void putArchiveEntry_givenStoredMethodOnStreamWithoutSize_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.bin");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            zaos.putArchiveEntry(entry);
        } finally {
            zaos.close();
        }
    }

    @Test(expected = ZipException.class)
    public void putArchiveEntry_givenStoredMethodOnStreamWithoutCrc_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("stored.bin");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(10);
            zaos.putArchiveEntry(entry);
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenStoredMethodOnStreamWithValidSizeAndCrc_shouldSucceed() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            byte[] data = "Hello World".getBytes("US-ASCII");
            CRC32 crc = new CRC32();
            crc.update(data);

            ZipArchiveEntry entry = new ZipArchiveEntry("stored.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length);
            entry.setCrc(crc.getValue());

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void closeArchiveEntry_givenStoredStreamWithMismatchedCrc_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            byte[] data = "Hello World".getBytes("US-ASCII");
            ZipArchiveEntry entry = new ZipArchiveEntry("mismatch_crc.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length);
            entry.setCrc(12345L);

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            try {
                zaos.closeArchiveEntry();
                Assert.fail("Expected ZipException for CRC mismatch");
            } catch (ZipException expected) {
                Assert.assertTrue(expected.getMessage().indexOf("bad CRC checksum") != -1);
            }
        } finally {
            try {
                zaos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void closeArchiveEntry_givenStoredStreamWithMismatchedSize_shouldThrowZipException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            byte[] data = "Hello World".getBytes("US-ASCII");
            CRC32 crc = new CRC32();
            crc.update(data);

            ZipArchiveEntry entry = new ZipArchiveEntry("mismatch_size.txt");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            entry.setSize(data.length + 5);
            entry.setCrc(crc.getValue());

            zaos.putArchiveEntry(entry);
            zaos.write(data, 0, data.length);
            try {
                zaos.closeArchiveEntry();
                Assert.fail("Expected ZipException for size mismatch");
            } catch (ZipException expected) {
                Assert.assertTrue(expected.getMessage().indexOf("bad size") != -1);
            }
        } finally {
            try {
                zaos.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void putArchiveEntry_givenStoredMethodOnFile_shouldCalculateCrcAndSizeOnClose() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("file_stored.bin");
            entry.setMethod(ZipArchiveOutputStream.STORED);
            zaos.putArchiveEntry(entry);
            byte[] data = "Stored in seekable file".getBytes("US-ASCII");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void putArchiveEntry_givenDeflatedMethodOnStream_shouldCompressAndWriteDataDescriptor() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("deflated.txt");
            zaos.putArchiveEntry(entry);
            byte[] data = "Sample deflated content repeated. ".getBytes("UTF-8");
            for (int i = 0; i < 10; i++) {
                zaos.write(data, 0, data.length);
            }
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void putArchiveEntry_givenDeflatedMethodOnFile_shouldUpdateHeaderDirectly() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("file_deflated.txt");
            zaos.putArchiveEntry(entry);
            byte[] data = "Data to be deflated into file".getBytes("UTF-8");
            zaos.write(data, 0, data.length);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void write_givenLargePayloadExceedingBlockSize_shouldSplitAndCompressCorrectly() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("large_payload.bin");
            zaos.putArchiveEntry(entry);
            byte[] largeData = new byte[8192 * 2 + 1024];
            for (int i = 0; i < largeData.length; i++) {
                largeData[i] = (byte) (i % 256);
            }
            zaos.write(largeData, 0, largeData.length);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
        Assert.assertTrue(baos.size() > 0);
    }

    @Test
    public void write_givenZeroLength_shouldHandleGracefully() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("zero_length.bin");
            zaos.putArchiveEntry(entry);
            byte[] empty = new byte[0];
            zaos.write(empty, 0, 0);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenCompressionLevelChanged_shouldApplyToDeflater() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setLevel(Deflater.BEST_SPEED);
            ZipArchiveEntry entry1 = new ZipArchiveEntry("fast.txt");
            zaos.putArchiveEntry(entry1);
            zaos.write("data1".getBytes("US-ASCII"), 0, 5);
            zaos.closeArchiveEntry();

            zaos.setLevel(Deflater.BEST_COMPRESSION);
            ZipArchiveEntry entry2 = new ZipArchiveEntry("compressed.txt");
            zaos.putArchiveEntry(entry2);
            zaos.write("data2".getBytes("US-ASCII"), 0, 5);
            zaos.closeArchiveEntry();

            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenImplicitMethodAndTime_shouldSetDefaults() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry = new ZipArchiveEntry("default_props.txt");
            Assert.assertEquals(-1, entry.getMethod());
            zaos.putArchiveEntry(entry);
            Assert.assertEquals(ZipArchiveOutputStream.DEFLATED, entry.getMethod());
            Assert.assertTrue(entry.getTime() != -1);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void putArchiveEntry_givenConsecutiveCalls_shouldAutomaticallyClosePreviousEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1.txt");
            zaos.putArchiveEntry(entry1);
            zaos.write("entry1 content".getBytes("US-ASCII"), 0, 14);

            ZipArchiveEntry entry2 = new ZipArchiveEntry("entry2.txt");
            zaos.putArchiveEntry(entry2);
            zaos.write("entry2 content".getBytes("US-ASCII"), 0, 14);

            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void unicodeExtraFieldPolicy_givenAlwaysPolicy_shouldAddUnicodeFields() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS);
            ZipArchiveEntry entry = new ZipArchiveEntry("unicode_test.txt");
            entry.setComment("test comment");
            zaos.putArchiveEntry(entry);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void unicodeExtraFieldPolicy_givenFallbackToUTF8AndNonEncodableName_shouldHandleFallback() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            zaos.setEncoding("US-ASCII");
            zaos.setFallbackToUTF8(true);
            zaos.setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE);

            ZipArchiveEntry entry = new ZipArchiveEntry("\u00fcber.txt");
            entry.setComment("\u00fcber comment");
            zaos.putArchiveEntry(entry);
            zaos.closeArchiveEntry();
            zaos.finish();
        } finally {
            zaos.close();
        }
    }

    @Test
    public void unicodeExtraFieldPolicy_givenToString_shouldReturnCorrectPolicyName() {
        Assert.assertEquals("always", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS.toString());
        Assert.assertEquals("never", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER.toString());
        Assert.assertEquals("not encodeable", ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NOT_ENCODEABLE.toString());
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldReturnZipArchiveEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        try {
            org.apache.commons.compress.archivers.ArchiveEntry entry = zaos.createArchiveEntry(tempFile, "entryFromTemp.txt");
            Assert.assertNotNull(entry);
            Assert.assertTrue(entry instanceof ZipArchiveEntry);
            Assert.assertEquals("entryFromTemp.txt", entry.getName());
        } finally {
            zaos.close();
        }
    }

    @Test
    public void flush_givenStreamAndFile_shouldFlushWithoutError() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaosStream = new ZipArchiveOutputStream(baos);
        try {
            zaosStream.flush();
        } finally {
            zaosStream.close();
        }

        ZipArchiveOutputStream zaosFile = new ZipArchiveOutputStream(tempFile);
        try {
            zaosFile.flush();
        } finally {
            zaosFile.close();
        }
    }

    @Test
    public void close_givenOpenArchive_shouldFinishAndCloseStreams() throws IOException {
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(tempFile);
        ZipArchiveEntry entry = new ZipArchiveEntry("dummy.txt");
        zaos.putArchiveEntry(entry);
        zaos.write("content".getBytes("US-ASCII"), 0, 7);
        zaos.closeArchiveEntry();
        zaos.close();
    }
}