package org.apache.commons.compress.archivers.tar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TarArchiveEntryTest implements TarConstants {

    private File tempDir;

    @Before
    public void setUp() throws Exception {
        tempDir = File.createTempFile("tar_test_dir", "");
        if (!tempDir.delete() || !tempDir.mkdir()) {
            throw new IOException("Failed to create temp directory: " + tempDir.getAbsolutePath());
        }
    }

    @After
    public void tearDown() throws Exception {
        if (tempDir != null && tempDir.exists()) {
            deleteRecursive(tempDir);
        }
    }

    private void deleteRecursive(File f) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            if (files != null) {
                for (int i = 0; i < files.length; i++) {
                    deleteRecursive(files[i]);
                }
            }
        }
        f.delete();
    }

    @Test
    public void constructor_givenSimpleFileName_shouldInitializeDefaultFileAttributes() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");

        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        Assert.assertEquals(LF_NORMAL, entry.isFile() ? LF_NORMAL : LF_DIR);
        Assert.assertEquals(0L, entry.getSize());
        Assert.assertNull(entry.getFile());
        Assert.assertEquals("", entry.getUserName());
        Assert.assertTrue(entry.isFile());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenDirectoryNameEndingWithSlash_shouldInitializeDirectoryAttributes() {
        TarArchiveEntry entry = new TarArchiveEntry("my_dir/");

        Assert.assertEquals("my_dir/", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        Assert.assertTrue(entry.isDirectory());
        Assert.assertFalse(entry.isFile());
        Assert.assertNull(entry.getFile());
    }

    @Test
    public void constructor_givenLeadingSlashAndPreserveFalse_shouldStripLeadingSlash() {
        TarArchiveEntry entry = new TarArchiveEntry("/leading/path.txt", false);
        Assert.assertEquals("leading/path.txt", entry.getName());
    }

    @Test
    public void constructor_givenLeadingSlashAndPreserveTrue_shouldKeepLeadingSlash() {
        TarArchiveEntry entry = new TarArchiveEntry("/leading/path.txt", true);
        Assert.assertEquals("/leading/path.txt", entry.getName());
    }

    @Test
    public void constructor_givenMultipleLeadingSlashesAndPreserveFalse_shouldStripAllLeadingSlashes() {
        TarArchiveEntry entry = new TarArchiveEntry("///multiple/slashes.txt", false);
        Assert.assertEquals("multiple/slashes.txt", entry.getName());
    }

    @Test
    public void constructor_givenGnuLongNameLinkFlag_shouldSetGnuMagicAndVersion() {
        TarArchiveEntry entry = new TarArchiveEntry("long_name_entry", LF_GNUTYPE_LONGNAME);

        Assert.assertTrue(entry.isGNULongNameEntry());
        byte[] buffer = new byte[512];
        entry.writeEntryHeader(buffer);
        TarArchiveEntry parsed = new TarArchiveEntry(buffer);
        Assert.assertTrue(parsed.isGNULongNameEntry());
    }

    @Test
    public void constructor_givenFileObjectForRegularFile_shouldExtractAttributes() throws Exception {
        File file = new File(tempDir, "sample.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(new byte[] { 1, 2, 3, 4, 5 });
        fos.close();

        TarArchiveEntry entry = new TarArchiveEntry(file);

        Assert.assertEquals(file, entry.getFile());
        Assert.assertEquals(5L, entry.getSize());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        Assert.assertTrue(entry.isFile());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void constructor_givenFileObjectForDirectory_shouldAppendSlashIfNotPresent() {
        TarArchiveEntry entry = new TarArchiveEntry(tempDir);

        Assert.assertEquals(tempDir, entry.getFile());
        Assert.assertTrue(entry.getName().endsWith("/"));
        Assert.assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        Assert.assertTrue(entry.isDirectory());
        Assert.assertFalse(entry.isFile());
    }

    @Test
    public void constructor_givenFileAndExplicitNameWithoutTrailingSlash_shouldAppendSlashForDir() {
        TarArchiveEntry entry = new TarArchiveEntry(tempDir, "custom_dir");

        Assert.assertEquals("custom_dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void constructor_givenFileAndExplicitNameWithTrailingSlash_shouldKeepSingleTrailingSlash() {
        TarArchiveEntry entry = new TarArchiveEntry(tempDir, "custom_dir/");

        Assert.assertEquals("custom_dir/", entry.getName());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void equals_givenSameName_shouldBeEqual() {
        TarArchiveEntry entry1 = new TarArchiveEntry("archive/file.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("archive/file.txt");

        Assert.assertTrue(entry1.equals(entry2));
        Assert.assertTrue(entry1.equals((Object) entry2));
        Assert.assertEquals(entry1.hashCode(), entry2.hashCode());
    }

    @Test
    public void equals_givenDifferentName_shouldNotBeEqual() {
        TarArchiveEntry entry1 = new TarArchiveEntry("archive/file1.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("archive/file2.txt");

        Assert.assertFalse(entry1.equals(entry2));
        Assert.assertFalse(entry1.equals((Object) entry2));
    }

    @Test
    public void equals_givenNullOrDifferentType_shouldReturnFalse() {
        TarArchiveEntry entry = new TarArchiveEntry("archive/file.txt");

        Assert.assertFalse(entry.equals((Object) null));
        Assert.assertFalse(entry.equals("archive/file.txt"));
    }

    @Test
    public void isDescendent_givenChildPath_shouldReturnTrue() {
        TarArchiveEntry parent = new TarArchiveEntry("parent/");
        TarArchiveEntry child = new TarArchiveEntry("parent/child.txt");

        Assert.assertTrue(parent.isDescendent(child));
        Assert.assertFalse(child.isDescendent(parent));
    }

    @Test
    public void setName_givenNewNameWithLeadingSlash_shouldNormalizeBasedOnPreserveFlag() {
        TarArchiveEntry entry = new TarArchiveEntry("initial.txt", false);
        entry.setName("/updated/path.txt");
        Assert.assertEquals("updated/path.txt", entry.getName());

        TarArchiveEntry entryPreserved = new TarArchiveEntry("initial.txt", true);
        entryPreserved.setName("/updated/path.txt");
        Assert.assertEquals("/updated/path.txt", entryPreserved.getName());
    }

    @Test
    public void setMode_and_getMode_shouldSetAndRetrieveCorrectValue() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setMode(0777);
        Assert.assertEquals(0777, entry.getMode());
    }

    @Test
    public void setLinkName_and_getLinkName_shouldSetAndRetrieveCorrectValue() {
        TarArchiveEntry entry = new TarArchiveEntry("link.txt");
        entry.setLinkName("target.txt");
        Assert.assertEquals("target.txt", entry.getLinkName());
    }

    @Test
    public void setUserId_givenIntAndLongValues_shouldStoreCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setUserId(1001);
        Assert.assertEquals(1001, entry.getUserId());
        Assert.assertEquals(1001L, entry.getLongUserId());

        entry.setUserId(0x1ffffffffL);
        Assert.assertEquals((int) (0x1ffffffffL & 0xffffffffL), entry.getUserId());
        Assert.assertEquals(0x1ffffffffL, entry.getLongUserId());
    }

    @Test
    public void setGroupId_givenIntAndLongValues_shouldStoreCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setGroupId(2002);
        Assert.assertEquals(2002, entry.getGroupId());
        Assert.assertEquals(2002L, entry.getLongGroupId());

        entry.setGroupId(0x2ffffffffL);
        Assert.assertEquals((int) (0x2ffffffffL & 0xffffffffL), entry.getGroupId());
        Assert.assertEquals(0x2ffffffffL, entry.getLongGroupId());
    }

    @Test
    public void setIds_givenUserAndGroupId_shouldSetBoth() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setIds(501, 502);
        Assert.assertEquals(501, entry.getUserId());
        Assert.assertEquals(502, entry.getGroupId());
    }

    @Test
    public void setNames_givenUserAndGroupName_shouldSetBoth() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setNames("root", "wheel");
        Assert.assertEquals("root", entry.getUserName());
        Assert.assertEquals("wheel", entry.getGroupName());
    }

    @Test
    public void setModTime_givenLongMillis_shouldConvertSecondsCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        long timeMillis = 1600000000000L;
        entry.setModTime(timeMillis);

        Assert.assertEquals(new Date(timeMillis), entry.getModTime());
        Assert.assertEquals(new Date(timeMillis), entry.getLastModifiedDate());
    }

    @Test
    public void setModTime_givenDateObject_shouldConvertSecondsCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        Date date = new Date(1600000005000L);
        entry.setModTime(date);

        Assert.assertEquals(date, entry.getModTime());
    }

    @Test
    public void setSize_givenValidSize_shouldStoreSize() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(1024L);
        Assert.assertEquals(1024L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setSize_givenNegativeValue_shouldThrowIllegalArgumentException() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(-1L);
    }

    @Test
    public void setDevMajor_givenValidValue_shouldStoreValue() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setDevMajor(8);
        Assert.assertEquals(8, entry.getDevMajor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDevMajor_givenNegativeValue_shouldThrowIllegalArgumentException() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setDevMajor(-1);
    }

    @Test
    public void setDevMinor_givenValidValue_shouldStoreValue() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setDevMinor(1);
        Assert.assertEquals(1, entry.getDevMinor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void setDevMinor_givenNegativeValue_shouldThrowIllegalArgumentException() {
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setDevMinor(-1);
    }

    @Test
    public void isGNULongLinkEntry_givenLinkFlag_shouldReturnTrue() {
        TarArchiveEntry entry = new TarArchiveEntry("long_link", LF_GNUTYPE_LONGLINK);
        Assert.assertTrue(entry.isGNULongLinkEntry());
        Assert.assertFalse(entry.isGNULongNameEntry());
    }

    @Test
    public void isPaxHeader_givenPaxLCAndUCFlags_shouldReturnExpected() {
        TarArchiveEntry entryLc = new TarArchiveEntry("pax_lc", LF_PAX_EXTENDED_HEADER_LC);
        Assert.assertTrue(entryLc.isPaxHeader());

        TarArchiveEntry entryUc = new TarArchiveEntry("pax_uc", LF_PAX_EXTENDED_HEADER_UC);
        Assert.assertTrue(entryUc.isPaxHeader());

        TarArchiveEntry normalEntry = new TarArchiveEntry("normal", LF_NORMAL);
        Assert.assertFalse(normalEntry.isPaxHeader());
    }

    @Test
    public void isGlobalPaxHeader_givenGlobalPaxFlag_shouldReturnTrue() {
        TarArchiveEntry entry = new TarArchiveEntry("global_pax", LF_PAX_GLOBAL_EXTENDED_HEADER);
        Assert.assertTrue(entry.isGlobalPaxHeader());
        Assert.assertFalse(entry.isPaxHeader());
    }

    @Test
    public void isFile_givenOldNormAndNormalFlags_shouldReturnTrue() {
        TarArchiveEntry entry1 = new TarArchiveEntry("old_norm", LF_OLDNORM);
        Assert.assertTrue(entry1.isFile());

        TarArchiveEntry entry2 = new TarArchiveEntry("regular", LF_NORMAL);
        Assert.assertTrue(entry2.isFile());

        TarArchiveEntry dirEntry = new TarArchiveEntry("dir/", LF_DIR);
        Assert.assertFalse(dirEntry.isFile());
    }

    @Test
    public void fileTypeFlags_givenVariousFlags_shouldReturnTrueForAppropriateTypes() {
        TarArchiveEntry symlink = new TarArchiveEntry("symlink", LF_SYMLINK);
        Assert.assertTrue(symlink.isSymbolicLink());

        TarArchiveEntry link = new TarArchiveEntry("link", LF_LINK);
        Assert.assertTrue(link.isLink());

        TarArchiveEntry chr = new TarArchiveEntry("chr", LF_CHR);
        Assert.assertTrue(chr.isCharacterDevice());

        TarArchiveEntry blk = new TarArchiveEntry("blk", LF_BLK);
        Assert.assertTrue(blk.isBlockDevice());

        TarArchiveEntry fifo = new TarArchiveEntry("fifo", LF_FIFO);
        Assert.assertTrue(fifo.isFIFO());
    }

    @Test
    public void isSparse_and_isOldGNUSparse_givenSparseFlag_shouldReturnTrue() {
        TarArchiveEntry entry = new TarArchiveEntry("sparse", LF_GNUTYPE_SPARSE);
        Assert.assertTrue(entry.isOldGNUSparse());
        Assert.assertTrue(entry.isGNUSparse());
        Assert.assertTrue(entry.isSparse());
    }

    @Test
    public void fillGNUSparse0xData_givenSparseHeaders_shouldSetFieldsCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("entry");
        Map headers = new HashMap();
        headers.put("GNU.sparse.size", "4096");
        headers.put("GNU.sparse.name", "sparse_file_name");

        entry.fillGNUSparse0xData(headers);

        Assert.assertTrue(entry.isPaxGNUSparse());
        Assert.assertTrue(entry.isGNUSparse());
        Assert.assertTrue(entry.isSparse());
        Assert.assertEquals(4096L, entry.getRealSize());
        Assert.assertEquals("sparse_file_name", entry.getName());
    }

    @Test
    public void fillGNUSparse0xData_givenMissingNameHeader_shouldRetainExistingName() {
        TarArchiveEntry entry = new TarArchiveEntry("initial_sparse_name");
        Map headers = new HashMap();
        headers.put("GNU.sparse.size", "2048");

        entry.fillGNUSparse0xData(headers);

        Assert.assertTrue(entry.isPaxGNUSparse());
        Assert.assertEquals(2048L, entry.getRealSize());
        Assert.assertEquals("initial_sparse_name", entry.getName());
    }

    @Test
    public void fillGNUSparse1xData_givenSparseHeaders_shouldSetFieldsCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("entry");
        Map headers = new HashMap();
        headers.put("GNU.sparse.realsize", "8192");
        headers.put("GNU.sparse.name", "sparse_1x_name");

        entry.fillGNUSparse1xData(headers);

        Assert.assertTrue(entry.isPaxGNUSparse());
        Assert.assertEquals(8192L, entry.getRealSize());
        Assert.assertEquals("sparse_1x_name", entry.getName());
    }

    @Test
    public void fillStarSparseData_givenStarHeaders_shouldSetFieldsCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("star");
        Map headers = new HashMap();
        headers.put("SCHILY.realsize", "16384");

        entry.fillStarSparseData(headers);

        Assert.assertTrue(entry.isStarSparse());
        Assert.assertTrue(entry.isSparse());
        Assert.assertEquals(16384L, entry.getRealSize());
    }

    @Test
    public void getDirectoryEntries_givenNullOrNonDirectoryFile_shouldReturnEmptyArray() throws Exception {
        TarArchiveEntry entryFromNull = new TarArchiveEntry("simple.txt");
        Assert.assertEquals(0, entryFromNull.getDirectoryEntries().length);

        File regularFile = new File(tempDir, "test.txt");
        FileOutputStream fos = new FileOutputStream(regularFile);
        fos.write(42);
        fos.close();

        TarArchiveEntry entryFromFile = new TarArchiveEntry(regularFile);
        Assert.assertEquals(0, entryFromFile.getDirectoryEntries().length);
    }

    @Test
    public void getDirectoryEntries_givenValidDirectoryWithFiles_shouldReturnEntries() throws Exception {
        File subFile1 = new File(tempDir, "f1.txt");
        File subFile2 = new File(tempDir, "f2.txt");
        FileOutputStream fos1 = new FileOutputStream(subFile1);
        fos1.write(1);
        fos1.close();
        FileOutputStream fos2 = new FileOutputStream(subFile2);
        fos2.write(2);
        fos2.close();

        TarArchiveEntry dirEntry = new TarArchiveEntry(tempDir);
        TarArchiveEntry[] entries = dirEntry.getDirectoryEntries();

        Assert.assertNotNull(entries);
        Assert.assertEquals(2, entries.length);
    }

    @Test
    public void writeEntryHeader_and_parseTarHeader_shouldRoundtripCorrectly() {
        TarArchiveEntry entry = new TarArchiveEntry("test_roundtrip.txt");
        entry.setSize(512L);
        entry.setMode(0644);
        entry.setUserId(100);
        entry.setGroupId(200);
        entry.setModTime(1500000000000L);
        entry.setUserName("testuser");
        entry.setGroupName("testgroup");
        entry.setLinkName("link_target");

        byte[] header = new byte[512];
        entry.writeEntryHeader(header);

        TarArchiveEntry parsed = new TarArchiveEntry(header);

        Assert.assertEquals("test_roundtrip.txt", parsed.getName());
        Assert.assertEquals(512L, parsed.getSize());
        Assert.assertEquals(0644, parsed.getMode());
        Assert.assertEquals(100, parsed.getUserId());
        Assert.assertEquals(200, parsed.getGroupId());
        Assert.assertEquals(1500000000000L, parsed.getModTime().getTime());
        Assert.assertEquals("testuser", parsed.getUserName());
        Assert.assertEquals("testgroup", parsed.getGroupName());
        Assert.assertEquals("link_target", parsed.getLinkName());
        Assert.assertTrue(parsed.isCheckSumOK());
        Assert.assertFalse(parsed.isExtended());
    }

    @Test
    public void writeEntryHeader_givenStarModeTrue_shouldFormatProperly() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("star_entry.txt");
        entry.setSize(100L);
        entry.setDevMajor(3);
        entry.setDevMinor(5);

        byte[] header = new byte[512];
        entry.writeEntryHeader(header, TarUtils.DEFAULT_ENCODING, true);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        Assert.assertEquals("star_entry.txt", parsed.getName());
        Assert.assertEquals(100L, parsed.getSize());
        Assert.assertEquals(3, parsed.getDevMajor());
        Assert.assertEquals(5, parsed.getDevMinor());
        Assert.assertTrue(parsed.isCheckSumOK());
    }

    @Test
    public void parseTarHeader_givenOldGnuMagic_shouldEvaluateAsOldGnu() {
        TarArchiveEntry entry = new TarArchiveEntry("gnu.txt", LF_GNUTYPE_SPARSE);
        entry.setSize(128L);

        byte[] header = new byte[512];
        System.arraycopy(MAGIC_GNU.getBytes(), 0, header, MAGIC_OFFSET, MAGIC_GNU.length());
        TarUtils.formatNameBytes("gnu.txt", header, 0, NAMELEN);
        TarUtils.formatLongOctalBytes(0644, header, 100, MODELEN);
        TarUtils.formatLongOctalBytes(100, header, 108, UIDLEN);
        TarUtils.formatLongOctalBytes(200, header, 116, GIDLEN);
        TarUtils.formatLongOctalBytes(128, header, 124, SIZELEN);
        TarUtils.formatLongOctalBytes(1000000, header, 136, MODTIMELEN);
        header[156] = LF_GNUTYPE_SPARSE;

        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        Assert.assertTrue(parsed.isOldGNUSparse());
    }

    @Test
    public void parseTarHeader_givenXstarMagic_shouldEvaluateAsXstarAndPrependPrefix() {
        byte[] header = new byte[512];
        TarUtils.formatNameBytes("file.txt", header, 0, NAMELEN);
        TarUtils.formatLongOctalBytes(0644, header, 100, MODELEN);
        TarUtils.formatLongOctalBytes(100, header, 108, UIDLEN);
        TarUtils.formatLongOctalBytes(200, header, 116, GIDLEN);
        TarUtils.formatLongOctalBytes(0, header, 124, SIZELEN);
        TarUtils.formatLongOctalBytes(1000000, header, 136, MODTIMELEN);
        header[156] = LF_NORMAL;

        System.arraycopy(MAGIC_POSIX.getBytes(), 0, header, MAGIC_OFFSET, MAGIC_POSIX.length());
        System.arraycopy(MAGIC_XSTAR.getBytes(), 0, header, XSTAR_MAGIC_OFFSET, MAGIC_XSTAR.length());
        TarUtils.formatNameBytes("xstar_prefix", header, 345, PREFIXLEN_XSTAR);

        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        Assert.assertEquals("xstar_prefix/file.txt", parsed.getName());
    }

    @Test
    public void parseTarHeader_givenPosixPrefix_shouldPrependPrefix() {
        byte[] header = new byte[512];
        TarUtils.formatNameBytes("test.txt", header, 0, NAMELEN);
        TarUtils.formatLongOctalBytes(0644, header, 100, MODELEN);
        TarUtils.formatLongOctalBytes(100, header, 108, UIDLEN);
        TarUtils.formatLongOctalBytes(200, header, 116, GIDLEN);
        TarUtils.formatLongOctalBytes(0, header, 124, SIZELEN);
        TarUtils.formatLongOctalBytes(1000000, header, 136, MODTIMELEN);
        header[156] = LF_NORMAL;

        System.arraycopy(MAGIC_POSIX.getBytes(), 0, header, MAGIC_OFFSET, MAGIC_POSIX.length());
        TarUtils.formatNameBytes("posix_dir", header, 345, PREFIXLEN);

        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        Assert.assertEquals("posix_dir/test.txt", parsed.getName());
    }

    @Test
    public void parseTarHeader_givenDirectoryWithoutTrailingSlashAndPosixPrefix_shouldAppendSlashAndPrefix() {
        byte[] header = new byte[512];
        TarUtils.formatNameBytes("subdir", header, 0, NAMELEN);
        TarUtils.formatLongOctalBytes(DEFAULT_DIR_MODE, header, 100, MODELEN);
        TarUtils.formatLongOctalBytes(100, header, 108, UIDLEN);
        TarUtils.formatLongOctalBytes(200, header, 116, GIDLEN);
        TarUtils.formatLongOctalBytes(0, header, 124, SIZELEN);
        TarUtils.formatLongOctalBytes(1000000, header, 136, MODTIMELEN);
        header[156] = LF_DIR;

        System.arraycopy(MAGIC_POSIX.getBytes(), 0, header, MAGIC_OFFSET, MAGIC_POSIX.length());
        TarUtils.formatNameBytes("root", header, 345, PREFIXLEN);

        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, 148, CHKSUMLEN);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        Assert.assertEquals("root/subdir/", parsed.getName());
        Assert.assertTrue(parsed.isDirectory());
    }
}