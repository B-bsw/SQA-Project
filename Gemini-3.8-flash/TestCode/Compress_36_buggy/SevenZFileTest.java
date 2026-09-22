package org.apache.commons.compress.archivers.sevenz;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SevenZFileTest {

    private final ArrayList<File> tempFiles = new ArrayList<File>();

    @Before
    public void setUp() {
        tempFiles.clear();
    }

    @After
    public void tearDown() {
        for (int i = 0; i < tempFiles.size(); i++) {
            File f = tempFiles.get(i);
            if (f != null && f.exists()) {
                f.delete();
            }
        }
        tempFiles.clear();
    }

    private File createTempFile(byte[] contents) throws IOException {
        File file = File.createTempFile("sevenz_test_", ".7z");
        file.deleteOnExit();
        tempFiles.add(file);
        FileOutputStream fos = new FileOutputStream(file);
        try {
            if (contents != null) {
                fos.write(contents);
            }
        } finally {
            fos.close();
        }
        return file;
    }

    private byte[] buildValid7zArchive(byte[] headerBytes) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);

        dos.write(SevenZFile.sevenZSignature);
        dos.writeByte(0); // major version
        dos.writeByte(0); // minor version

        ByteArrayOutputStream startHeaderBaos = new ByteArrayOutputStream();
        DataOutputStream startHeaderDos = new DataOutputStream(startHeaderBaos);

        startHeaderDos.writeLong(Long.reverseBytes(0L));
        startHeaderDos.writeLong(Long.reverseBytes((long) headerBytes.length));

        CRC32 headerCrc = new CRC32();
        headerCrc.update(headerBytes);
        startHeaderDos.writeInt(Integer.reverseBytes((int) headerCrc.getValue()));
        startHeaderDos.flush();

        byte[] startHeader = startHeaderBaos.toByteArray();

        CRC32 startHeaderCrc = new CRC32();
        startHeaderCrc.update(startHeader);
        dos.writeInt(Integer.reverseBytes((int) startHeaderCrc.getValue()));

        dos.write(startHeader);
        dos.write(headerBytes);
        dos.flush();

        return baos.toByteArray();
    }

    @Test
    public void matches_givenExactSignature_shouldReturnTrue() {
        byte[] sig = new byte[] { (byte) '7', (byte) 'z', (byte) 0xBC, (byte) 0xAF, (byte) 0x27, (byte) 0x1C };
        Assert.assertTrue(SevenZFile.matches(sig, 6));
    }

    @Test
    public void matches_givenLongerSignatureWithMatchingPrefix_shouldReturnTrue() {
        byte[] sig = new byte[] { (byte) '7', (byte) 'z', (byte) 0xBC, (byte) 0xAF, (byte) 0x27, (byte) 0x1C, 0x00, 0x01 };
        Assert.assertTrue(SevenZFile.matches(sig, 8));
    }

    @Test
    public void matches_givenLengthLessThanSignatureLength_shouldReturnFalse() {
        byte[] sig = new byte[] { (byte) '7', (byte) 'z', (byte) 0xBC, (byte) 0xAF, (byte) 0x27 };
        Assert.assertFalse(SevenZFile.matches(sig, 5));
    }

    @Test
    public void matches_givenMismatchedSignature_shouldReturnFalse() {
        byte[] sig = new byte[] { (byte) '7', (byte) 'z', (byte) 0xBC, (byte) 0xAF, (byte) 0x27, (byte) 0x00 };
        Assert.assertFalse(SevenZFile.matches(sig, 6));
    }

    @Test
    public void constructor_givenNonExistentFile_shouldThrowException() {
        File nonExistent = new File("non_existent_file_for_7z_test.7z");
        try {
            new SevenZFile(nonExistent);
            Assert.fail("Expected IOException for non-existent file");
        } catch (IOException expected) {
            Assert.assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void constructor_givenBadSignature_shouldThrowIOException() throws IOException {
        byte[] badSig = new byte[32];
        File file = createTempFile(badSig);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for bad signature");
        } catch (IOException e) {
            Assert.assertEquals("Bad 7z signature", e.getMessage());
        }
    }

    @Test
    public void constructor_givenUnsupportedVersion_shouldThrowIOException() throws IOException {
        byte[] data = new byte[32];
        System.arraycopy(SevenZFile.sevenZSignature, 0, data, 0, 6);
        data[6] = 1; // unsupported major version
        data[7] = 0;
        File file = createTempFile(data);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for unsupported version");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Unsupported 7z version") >= 0);
        }
    }

    @Test
    public void constructor_givenCorruptedStartHeaderCrc_shouldThrowIOException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        archive[8] ^= 0xFF; // corrupt StartHeader CRC
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for StartHeader CRC mismatch");
        } catch (IOException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }

    @Test
    public void constructor_givenCorruptedNextHeaderCrc_shouldThrowIOException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        archive[28] ^= 0xFF; // corrupt nextHeaderCrc in StartHeader

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(archive, 0, 8);
        byte[] startHeader = new byte[20];
        System.arraycopy(archive, 12, startHeader, 0, 20);
        CRC32 shCrc = new CRC32();
        shCrc.update(startHeader);

        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeInt(Integer.reverseBytes((int) shCrc.getValue()));
        dos.write(startHeader);
        dos.write(header);
        dos.flush();

        File file = createTempFile(baos.toByteArray());
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for NextHeader CRC mismatch");
        } catch (IOException e) {
            Assert.assertEquals("NextHeader CRC mismatch", e.getMessage());
        }
    }

    @Test
    public void constructor_givenBrokenArchiveNoHeaderNid_shouldThrowIOException() throws IOException {
        byte[] header = new byte[] { 0x02, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for broken archive without Header");
        } catch (IOException e) {
            Assert.assertEquals("Broken or unsupported archive: no Header", e.getMessage());
        }
    }

    @Test
    public void constructor_givenAdditionalStreamsUnsupported_shouldThrowIOException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x03, 0x00 }; // kHeader, kAdditionalStreamsInfo
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for additional streams");
        } catch (IOException e) {
            Assert.assertEquals("Additional streams unsupported", e.getMessage());
        }
    }

    @Test
    public void constructor_givenBadlyTerminatedHeader_shouldThrowIOException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x02 }; // ends with 0x02 instead of kEnd (0x00)
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for badly terminated header");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Badly terminated header") >= 0);
        }
    }

    @Test
    public void constructor_givenEmptyArchive_shouldOpenAndNavigateSuccessfully() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            Assert.assertNull(sevenZFile.getNextEntry());
            Iterable<SevenZArchiveEntry> entries = sevenZFile.getEntries();
            Assert.assertNotNull(entries);
            Assert.assertFalse(entries.iterator().hasNext());
            Assert.assertNotNull(sevenZFile.toString());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenPassword_shouldRetainAndWipeOnClose() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);

        byte[] password = new byte[] { 's', 'e', 'c', 'r', 'e', 't' };
        SevenZFile sevenZFile = new SevenZFile(file, password);
        sevenZFile.close();
        // Multiple close calls must be safe
        sevenZFile.close();
    }

    @Test
    public void read_withoutActiveEntry_shouldThrowIllegalStateException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            sevenZFile.read();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().indexOf("No current 7z entry") >= 0);
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void readBuffer_withoutActiveEntry_shouldThrowIllegalStateException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            byte[] buf = new byte[10];
            sevenZFile.read(buf);
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().indexOf("No current 7z entry") >= 0);
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void readBufferWithOffset_withoutActiveEntry_shouldThrowIllegalStateException() throws IOException {
        byte[] header = new byte[] { 0x01, 0x05, 0x00, 0x00, 0x00 };
        byte[] archive = buildValid7zArchive(header);
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            byte[] buf = new byte[10];
            sevenZFile.read(buf, 0, 5);
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().indexOf("No current 7z entry") >= 0);
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenArchiveWithProperties_shouldReadSuccessfully() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x02); // kArchiveProperties
        headerBaos.write(0x01); // nid (not kEnd)
        headerBaos.write(0x02); // propertySize = 2
        headerBaos.write(new byte[] { 0x11, 0x22 }); // property bytes
        headerBaos.write(0x00); // kEnd for archive properties
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x00); // 0 files
        headerBaos.write(0x00); // kEnd for files info properties
        headerBaos.write(0x00); // kEnd for header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            Assert.assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenFilesInfoWithDummyAndUnknownProperties_shouldSkipProperly() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x00); // 0 files
        headerBaos.write(0x19); // NID.kDummy
        headerBaos.write(0x02); // size = 2
        headerBaos.write(new byte[] { 0x01, 0x02 }); // dummy bytes
        headerBaos.write(0x7F); // unknown property type
        headerBaos.write(0x01); // size = 1
        headerBaos.write(0x55); // unknown byte
        headerBaos.write(0x00); // kEnd of properties
        headerBaos.write(0x00); // kEnd of header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            Assert.assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenFilesInfoWithEmptyStreamAndFiles_shouldHandleEmptyItems() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x0E); // kEmptyStream
        headerBaos.write(0x01); // size 1
        headerBaos.write(0x80); // bit 0 is set: file 0 has empty stream
        headerBaos.write(0x0F); // kEmptyFile
        headerBaos.write(0x01); // size 1
        headerBaos.write(0x80); // bit 0 is set: empty file is NOT a directory
        headerBaos.write(0x10); // kAnti
        headerBaos.write(0x01); // size 1
        headerBaos.write(0x00); // bit 0 is false: not anti
        headerBaos.write(0x00); // kEnd of properties
        headerBaos.write(0x00); // kEnd of header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            SevenZArchiveEntry entry = sevenZFile.getNextEntry();
            Assert.assertNotNull(entry);
            Assert.assertFalse(entry.hasStream());
            Assert.assertFalse(entry.isDirectory());
            Assert.assertFalse(entry.isAntiItem());
            Assert.assertEquals(0, entry.getSize());
            Assert.assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenEmptyFileBeforeEmptyStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x0F); // kEmptyFile before kEmptyStream
        headerBaos.write(0x01); // size 1
        headerBaos.write(0x00);
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for kEmptyFile before kEmptyStream");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("kEmptyStream must appear before kEmptyFile") >= 0);
        }
    }

    @Test
    public void constructor_givenAntiBeforeEmptyStream_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x10); // kAnti before kEmptyStream
        headerBaos.write(0x01); // size 1
        headerBaos.write(0x00);
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for kAnti before kEmptyStream");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("kEmptyStream must appear before kAnti") >= 0);
        }
    }

    @Test
    public void constructor_givenFilesInfoWithFileNames_shouldParseFileNameProperly() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x0C); // NID.kName
        // Filename: "a\0" in UTF-16LE = 0x61, 0x00, 0x00, 0x00 (4 bytes)
        // size field includes the 1 byte external flag: 1 + 4 = 5
        headerBaos.write(0x05); // size
        headerBaos.write(0x00); // external = 0
        headerBaos.write(new byte[] { 'a', 0x00, 0x00, 0x00 });
        headerBaos.write(0x00); // kEnd of properties
        headerBaos.write(0x00); // kEnd of header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            Iterator<SevenZArchiveEntry> it = sevenZFile.getEntries().iterator();
            Assert.assertTrue(it.hasNext());
            SevenZArchiveEntry entry = it.next();
            Assert.assertEquals("a", entry.getName());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenFilesInfoWithInvalidNameLength_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x0C); // NID.kName
        headerBaos.write(0x04); // odd size - 1 -> invalid length
        headerBaos.write(0x00);
        headerBaos.write(new byte[] { 'a', 0x00, 0x00 });
        headerBaos.write(0x00);
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for invalid file names length");
        } catch (IOException e) {
            Assert.assertEquals("File names length invalid", e.getMessage());
        }
    }

    @Test
    public void constructor_givenFilesInfoWithMismatchedNamesCount_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x02); // 2 files expected, but only 1 provided
        headerBaos.write(0x0C); // NID.kName
        headerBaos.write(0x05); // size = 5 (1 external + 4 bytes)
        headerBaos.write(0x00); // external
        headerBaos.write(new byte[] { 'a', 0x00, 0x00, 0x00 });
        headerBaos.write(0x00);
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for error parsing file names");
        } catch (IOException e) {
            Assert.assertEquals("Error parsing file names", e.getMessage());
        }
    }

    @Test
    public void constructor_givenFilesInfoWithTimestampsAndAttributes_shouldPopulateCorrectly() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file

        // CTime
        headerBaos.write(0x12); // NID.kCTime
        headerBaos.write(0x0A); // size: 1 (allDefined) + 1 (external) + 8 (long) = 10
        headerBaos.write(0x01); // allDefined = 1
        headerBaos.write(0x00); // external = 0
        ByteArrayOutputStream longBaos = new ByteArrayOutputStream();
        DataOutputStream longDos = new DataOutputStream(longBaos);
        longDos.writeLong(Long.reverseBytes(12345678L));
        headerBaos.write(longBaos.toByteArray());

        // ATime
        headerBaos.write(0x13); // NID.kATime
        headerBaos.write(0x0A);
        headerBaos.write(0x01);
        headerBaos.write(0x00);
        headerBaos.write(longBaos.toByteArray());

        // MTime
        headerBaos.write(0x14); // NID.kMTime
        headerBaos.write(0x0A);
        headerBaos.write(0x01);
        headerBaos.write(0x00);
        headerBaos.write(longBaos.toByteArray());

        // WinAttributes
        headerBaos.write(0x15); // NID.kWinAttributes
        headerBaos.write(0x06); // size: 1 (allDefined) + 1 (external) + 4 (int) = 6
        headerBaos.write(0x01);
        headerBaos.write(0x00);
        ByteArrayOutputStream intBaos = new ByteArrayOutputStream();
        DataOutputStream intDos = new DataOutputStream(intBaos);
        intDos.writeInt(Integer.reverseBytes(0x20));
        headerBaos.write(intBaos.toByteArray());

        headerBaos.write(0x00); // kEnd of properties
        headerBaos.write(0x00); // kEnd of header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            SevenZArchiveEntry entry = sevenZFile.getNextEntry();
            Assert.assertNotNull(entry);
            Assert.assertTrue(entry.getHasCreationDate());
            Assert.assertTrue(entry.getHasAccessDate());
            Assert.assertTrue(entry.getHasLastModifiedDate());
            Assert.assertTrue(entry.getHasWindowsAttributes());
            Assert.assertEquals(0x20, entry.getWindowsAttributes());
        } finally {
            sevenZFile.close();
        }
    }

    @Test
    public void constructor_givenKStartPosInFilesInfo_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x05); // kFilesInfo
        headerBaos.write(0x01); // 1 file
        headerBaos.write(0x18); // NID.kStartPos
        headerBaos.write(0x01);
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for kStartPos");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("kStartPos is unsupported") >= 0);
        }
    }

    @Test
    public void constructor_givenStreamsInfoWithBadTermination_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x02); // invalid nid instead of kEnd (0x00)
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for badly terminated StreamsInfo");
        } catch (IOException e) {
            Assert.assertEquals("Badly terminated StreamsInfo", e.getMessage());
        }
    }

    @Test
    public void constructor_givenPackInfoWithBadTermination_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x06); // kPackInfo
        headerBaos.write(0x00); // packPos = 0
        headerBaos.write(0x00); // numPackStreams = 0
        headerBaos.write(0x02); // unexpected nid instead of kEnd (0x00)
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for badly terminated PackInfo");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Badly terminated PackInfo") >= 0);
        }
    }

    @Test
    public void constructor_givenUnpackInfoNotStartingWithFolder_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x07); // kUnpackInfo
        headerBaos.write(0x02); // expected kFolder (0x0B)
        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for missing kFolder");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Expected kFolder") >= 0);
        }
    }

    @Test
    public void constructor_givenFolderWithZeroOutputStreams_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x07); // kUnpackInfo
        headerBaos.write(0x0B); // kFolder
        headerBaos.write(0x01); // numFolders = 1
        headerBaos.write(0x00); // external = 0

        // readFolder
        headerBaos.write(0x01); // numCoders = 1
        // coder 0:
        // bits: isSimple=false (bit 4 set: 0x10), idSize = 1 -> bits = 0x11
        headerBaos.write(0x11);
        headerBaos.write(0x01); // decompressionMethodId = [0x01]
        headerBaos.write(0x01); // numInStreams = 1
        headerBaos.write(0x00); // numOutStreams = 0

        headerBaos.write(0x00);

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for zero output streams");
        } catch (IOException e) {
            Assert.assertEquals("Total output streams can't be 0", e.getMessage());
        }
    }

    @Test
    public void constructor_givenFolderWithAlternativeMethods_shouldThrowIOException() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x07); // kUnpackInfo
        headerBaos.write(0x0B); // kFolder
        headerBaos.write(0x01); // numFolders = 1
        headerBaos.write(0x00); // external = 0

        // readFolder
        headerBaos.write(0x01); // numCoders = 1
        // coder 0 with alternative methods flag (bit 7 set: 0x80)
        headerBaos.write(0x81); // idSize = 1, isSimple = true, moreAlternativeMethods = true
        headerBaos.write(0x01); // decompressionMethodId

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);
        try {
            new SevenZFile(file);
            Assert.fail("Expected IOException for alternative methods");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().indexOf("Alternative methods are unsupported") >= 0);
        }
    }

    @Test
    public void constructor_givenFolderWithAttributes_shouldReadAttributes() throws IOException {
        ByteArrayOutputStream headerBaos = new ByteArrayOutputStream();
        headerBaos.write(0x01); // kHeader
        headerBaos.write(0x04); // kMainStreamsInfo
        headerBaos.write(0x07); // kUnpackInfo
        headerBaos.write(0x0B); // kFolder
        headerBaos.write(0x01); // numFolders = 1
        headerBaos.write(0x00); // external = 0

        // readFolder
        headerBaos.write(0x01); // numCoders = 1
        // coder 0 with attributes flag (bit 5 set: 0x20), simple=true (bit 4 unset), idSize=1 -> 0x21
        headerBaos.write(0x21);
        headerBaos.write(0x01); // id
        headerBaos.write(0x02); // propertiesSize = 2
        headerBaos.write(new byte[] { 0x12, 0x34 }); // properties
        // numBindPairs = totalOutStreams - 1 = 1 - 1 = 0
        // totalInStreams (1) >= numBindPairs (0)
        // numPackedStreams = totalInStreams - 0 = 1
        // packedStreams[0] is resolved
        headerBaos.write(0x0C); // NID.kCodersUnpackSize
        headerBaos.write(0x0A); // unpackSize = 10
        headerBaos.write(0x00); // kEnd for UnpackInfo
        headerBaos.write(0x00); // kEnd for StreamsInfo
        headerBaos.write(0x00); // kEnd for Header

        byte[] archive = buildValid7zArchive(headerBaos.toByteArray());
        File file = createTempFile(archive);

        SevenZFile sevenZFile = new SevenZFile(file);
        try {
            Assert.assertNull(sevenZFile.getNextEntry());
        } finally {
            sevenZFile.close();
        }
    }
}