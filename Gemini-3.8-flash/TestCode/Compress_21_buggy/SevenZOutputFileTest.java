package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SevenZOutputFileTest {

    private File tempFile;
    private File tempDir;
    private SevenZOutputFile sevenZOutput;

    @Before
    public void setUp() throws Exception {
        tempFile = File.createTempFile("sevenz_test_", ".7z");
        tempDir = File.createTempFile("sevenz_test_dir_", "");
        tempDir.delete();
        tempDir.mkdir();
    }

    @After
    public void tearDown() throws Exception {
        if (sevenZOutput != null) {
            try {
                sevenZOutput.close();
            } catch (IOException ignored) {
            }
        }
        if (tempFile != null && tempFile.exists()) {
            tempFile.delete();
        }
        if (tempDir != null && tempDir.exists()) {
            tempDir.delete();
        }
    }

    @Test
    public void createArchiveEntry_givenFileAndName_shouldPopulateCorrectMetadata() throws IOException {
        File dummyFile = File.createTempFile("dummy_entry_", ".txt");
        try {
            sevenZOutput = new SevenZOutputFile(tempFile);
            SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(dummyFile, "folder/dummy.txt");

            Assert.assertNotNull(entry);
            Assert.assertEquals("folder/dummy.txt", entry.getName());
            Assert.assertFalse(entry.isDirectory());
            Assert.assertEquals(new Date(dummyFile.lastModified()), entry.getLastModifiedDate());
        } finally {
            dummyFile.delete();
        }
    }

    @Test
    public void createArchiveEntry_givenDirectory_shouldSetDirectoryFlagTrue() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        SevenZArchiveEntry entry = sevenZOutput.createArchiveEntry(tempDir, "testDir");

        Assert.assertNotNull(entry);
        Assert.assertEquals("testDir", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void finish_whenArchiveIsEmpty_shouldSucceedAndProduceValidHeader() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.finish();

        Assert.assertTrue(tempFile.length() > SevenZFile.SIGNATURE_HEADER_SIZE);
    }

    @Test(expected = IOException.class)
    public void finish_whenCalledTwice_shouldThrowIOException() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.finish();
        sevenZOutput.finish();
    }

    @Test
    public void close_whenCalledMultipleTimes_shouldNotThrowException() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.close();
        sevenZOutput.close();
    }

    @Test
    public void write_givenSingleByteAndBuffer_shouldWriteDataSuccessfully() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("sample.bin");
        sevenZOutput.putArchiveEntry(entry);

        sevenZOutput.write(65);
        byte[] data = new byte[] { 66, 67, 68, 69 };
        sevenZOutput.write(data);
        sevenZOutput.write(data, 1, 2);
        sevenZOutput.write(data, 0, 0);

        sevenZOutput.closeArchiveEntry();
        sevenZOutput.close();

        Assert.assertTrue(tempFile.length() > 0);
        Assert.assertTrue(entry.hasStream());
        Assert.assertEquals(7L, entry.getSize());
        Assert.assertTrue(entry.getCompressedSize() > 0);
        Assert.assertTrue(entry.getHasCrc());
    }

    @Test
    public void closeArchiveEntry_givenZeroBytesWritten_shouldMarkEntryWithoutStream() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("empty.txt");
        sevenZOutput.putArchiveEntry(entry);

        sevenZOutput.closeArchiveEntry();
        sevenZOutput.close();

        Assert.assertFalse(entry.hasStream());
        Assert.assertEquals(0L, entry.getSize());
        Assert.assertEquals(0L, entry.getCompressedSize());
        Assert.assertFalse(entry.getHasCrc());
    }

    @Test
    public void setContentCompression_givenCopyMethod_shouldEncodeWithoutCompressionProperties() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);
        sevenZOutput.setContentCompression(SevenZMethod.COPY);

        SevenZArchiveEntry entry = new SevenZArchiveEntry();
        entry.setName("plain.txt");
        sevenZOutput.putArchiveEntry(entry);

        byte[] content = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        sevenZOutput.write(content);
        sevenZOutput.closeArchiveEntry();
        sevenZOutput.close();

        Assert.assertTrue(entry.hasStream());
        Assert.assertEquals(8L, entry.getSize());
        Assert.assertEquals(8L, entry.getCompressedSize());
    }

    @Test
    public void writeArchive_givenAllEntriesHaveAllAttributes_shouldWriteFullAttributeHeaders() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        Date now = new Date(1600000000000L);

        SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
        entry1.setName("file1.txt");
        entry1.setCreationDate(now);
        entry1.setAccessDate(now);
        entry1.setLastModifiedDate(now);
        entry1.setWindowsAttributes(0x20);
        sevenZOutput.putArchiveEntry(entry1);
        sevenZOutput.write(10);
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
        entry2.setName("file2.txt");
        entry2.setCreationDate(now);
        entry2.setAccessDate(now);
        entry2.setLastModifiedDate(now);
        entry2.setWindowsAttributes(0x01);
        sevenZOutput.putArchiveEntry(entry2);
        sevenZOutput.write(20);
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.close();
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void writeArchive_givenPartialAttributes_shouldWriteBitMasksForAttributes() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        Date date1 = new Date(1500000000000L);
        Date date2 = new Date(1550000000000L);

        SevenZArchiveEntry entry1 = new SevenZArchiveEntry();
        entry1.setName("partial1.txt");
        entry1.setCreationDate(date1);
        entry1.setLastModifiedDate(date1);
        sevenZOutput.putArchiveEntry(entry1);
        sevenZOutput.write(new byte[] { 1, 2, 3 });
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry entry2 = new SevenZArchiveEntry();
        entry2.setName("partial2.txt");
        entry2.setAccessDate(date2);
        entry2.setWindowsAttributes(0x10);
        sevenZOutput.putArchiveEntry(entry2);
        sevenZOutput.write(new byte[] { 4, 5, 6 });
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.close();
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void writeArchive_givenEmptyFilesDirectoriesAndAntiItems_shouldWriteEmptyStreamsSections() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        SevenZArchiveEntry streamEntry = new SevenZArchiveEntry();
        streamEntry.setName("data.txt");
        sevenZOutput.putArchiveEntry(streamEntry);
        sevenZOutput.write(100);
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry emptyFile = new SevenZArchiveEntry();
        emptyFile.setName("emptyFile.txt");
        emptyFile.setDirectory(false);
        emptyFile.setAntiItem(false);
        sevenZOutput.putArchiveEntry(emptyFile);
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry dirEntry = new SevenZArchiveEntry();
        dirEntry.setName("emptyDir");
        dirEntry.setDirectory(true);
        dirEntry.setAntiItem(false);
        sevenZOutput.putArchiveEntry(dirEntry);
        sevenZOutput.closeArchiveEntry();

        SevenZArchiveEntry antiEntry = new SevenZArchiveEntry();
        antiEntry.setName("antiItem.txt");
        antiEntry.setDirectory(false);
        antiEntry.setAntiItem(true);
        sevenZOutput.putArchiveEntry(antiEntry);
        sevenZOutput.closeArchiveEntry();

        sevenZOutput.close();
        Assert.assertTrue(tempFile.length() > 0);
    }

    @Test
    public void writeArchive_givenMoreThanEightEntries_shouldExerciseBitMaskShifting() throws IOException {
        sevenZOutput = new SevenZOutputFile(tempFile);

        for (int i = 0; i < 10; i++) {
            SevenZArchiveEntry entry = new SevenZArchiveEntry();
            entry.setName("entry_" + i + ".txt");
            if (i % 2 == 0) {
                entry.setCreationDate(new Date(1000000000L * i));
                entry.setAccessDate(new Date(1000000000L * i));
                entry.setLastModifiedDate(new Date(1000000000L * i));
                entry.setWindowsAttributes(i);
            }
            sevenZOutput.putArchiveEntry(entry);
            if (i % 3 == 0) {
                sevenZOutput.write(i);
            }
            sevenZOutput.closeArchiveEntry();
        }

        sevenZOutput.close();
        Assert.assertTrue(tempFile.length() > 0);
    }
}