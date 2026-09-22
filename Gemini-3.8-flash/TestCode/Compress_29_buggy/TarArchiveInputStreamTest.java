package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static class DummyArchiveEntry implements ArchiveEntry {
        public String getName() {
            return "dummy";
        }
        public long getSize() {
            return 0;
        }
        public boolean isDirectory() {
            return false;
        }
        public java.util.Date getLastModifiedDate() {
            return new java.util.Date();
        }
    }

    private static class CloseTrackerInputStream extends ByteArrayInputStream {
        private boolean closed = false;

        public CloseTrackerInputStream(byte[] buf) {
            super(buf);
        }

        public void close() throws IOException {
            closed = true;
            super.close();
        }

        public boolean isClosed() {
            return closed;
        }
    }

    private static class NonMarkableInputStream extends FilterInputStream {
        public NonMarkableInputStream(InputStream in) {
            super(in);
        }

        public boolean markSupported() {
            return false;
        }
    }

    private static class EofOnReadInputStream extends InputStream {
        public int read() throws IOException {
            return -1;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return -1;
        }
    }

    private byte[] createHeader(String name, long size, byte typeFlag) throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry(name, typeFlag);
        entry.setSize(size);
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        entry.writeEntryHeader(header);
        return header;
    }

    private byte[] createDefaultHeader(String name, long size) throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(size);
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        entry.writeEntryHeader(header);
        return header;
    }

    @Test
    public void constructors_givenDifferentParameters_shouldInitializeCorrectly() throws Exception {
        byte[] empty = new byte[0];
        InputStream is1 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais1 = new TarArchiveInputStream(is1);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        InputStream is2 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais2 = new TarArchiveInputStream(is2, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        InputStream is3 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais3 = new TarArchiveInputStream(is3, 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        tais3.close();

        InputStream is4 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais4 = new TarArchiveInputStream(is4, 1024, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
        tais4.close();

        InputStream is5 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais5 = new TarArchiveInputStream(is5, 1024, 512);
        Assert.assertEquals(512, tais5.getRecordSize());
        tais5.close();

        InputStream is6 = new ByteArrayInputStream(empty);
        TarArchiveInputStream tais6 = new TarArchiveInputStream(is6, 1024, 512, "UTF-8");
        Assert.assertEquals(512, tais6.getRecordSize());
        tais6.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingInputStream() throws Exception {
        CloseTrackerInputStream ctis = new CloseTrackerInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(ctis);
        Assert.assertFalse(ctis.isClosed());
        tais.close();
        Assert.assertTrue(ctis.isClosed());
    }

    @Test
    public void markAndReset_givenAnyCall_shouldBeNoOpAndReturnFalse() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset();
        tais.close();
    }

    @Test
    public void available_givenEntryOffsets_shouldReturnExpectedRemainingBytes() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        entry.setSize(100L);
        tais.setCurrentEntry(entry);

        tais.skip(10);
        Assert.assertEquals(0, tais.available());

        byte[] header = createDefaultHeader("test.txt", 100L);
        byte[] body = new byte[100];
        byte[] record = new byte[header.length + 512];
        System.arraycopy(header, 0, record, 0, header.length);
        System.arraycopy(body, 0, record, header.length, body.length);

        TarArchiveInputStream taisValid = new TarArchiveInputStream(new ByteArrayInputStream(record));
        TarArchiveEntry parsed = taisValid.getNextTarEntry();
        Assert.assertNotNull(parsed);
        Assert.assertEquals(100, taisValid.available());

        byte[] buf = new byte[40];
        int read = taisValid.read(buf, 0, 40);
        Assert.assertEquals(40, read);
        Assert.assertEquals(60, taisValid.available());
        taisValid.close();
        tais.close();
    }

    @Test
    public void skip_givenNegativeOrZero_shouldReturnZero() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertEquals(0L, tais.skip(-5));
        Assert.assertEquals(0L, tais.skip(0));
        tais.close();
    }

    @Test
    public void skip_givenAvailableEntryData_shouldSkipAndCountBytes() throws Exception {
        byte[] header = createDefaultHeader("test.txt", 50L);
        byte[] body = new byte[50];
        for (int i = 0; i < body.length; i++) {
            body[i] = (byte) (i + 1);
        }
        byte[] block = new byte[512 + 512];
        System.arraycopy(header, 0, block, 0, 512);
        System.arraycopy(body, 0, block, 512, 50);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(block));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(20);
        Assert.assertEquals(20L, skipped);
        Assert.assertEquals(30, tais.available());

        byte[] remaining = new byte[30];
        int readBytes = tais.read(remaining, 0, 30);
        Assert.assertEquals(30, readBytes);
        Assert.assertEquals(21, remaining[0]);
        tais.close();
    }

    @Test(expected = IllegalStateException.class)
    public void read_givenNoCurrentTarEntry_shouldThrowIllegalStateException() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        byte[] buf = new byte[10];
        tais.read(buf, 0, 10);
    }

    @Test
    public void read_givenHitEofOrExceededSize_shouldReturnMinusOne() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        tais.setAtEOF(true);
        byte[] buf = new byte[10];
        Assert.assertEquals(-1, tais.read(buf, 0, 10));

        tais.setAtEOF(false);
        TarArchiveEntry entry = new TarArchiveEntry("empty.txt");
        entry.setSize(0);
        tais.setCurrentEntry(entry);
        Assert.assertEquals(-1, tais.read(buf, 0, 10));
        tais.close();
    }

    @Test(expected = IOException.class)
    public void read_givenPrematureStreamEof_shouldThrowTruncatedTarArchive() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new EofOnReadInputStream());
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(100L);
        tais.setCurrentEntry(entry);
        byte[] buf = new byte[10];
        tais.read(buf, 0, 10);
    }

    @Test
    public void read_givenZeroNumToReadAndStreamEof_shouldSetHitEofAndReturnMinusOne() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new EofOnReadInputStream());
        TarArchiveEntry entry = new TarArchiveEntry("file.txt");
        entry.setSize(100L);
        tais.setCurrentEntry(entry);
        byte[] buf = new byte[10];
        int read = tais.read(buf, 0, 0);
        Assert.assertEquals(-1, read);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void canReadEntryData_givenDifferentEntryTypes_shouldReturnExpectedBoolean() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(tais.canReadEntryData(null));
        Assert.assertFalse(tais.canReadEntryData(new DummyArchiveEntry()));

        TarArchiveEntry normalEntry = new TarArchiveEntry("test.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        byte[] sparseHeader = new byte[512];
        sparseHeader[TarConstants.LF_OFFSET] = TarConstants.LF_GNUTYPE_SPARSE;
        sparseHeader[TarConstants.MAGIC_OFFSET] = 'u';
        sparseHeader[TarConstants.MAGIC_OFFSET + 1] = 's';
        sparseHeader[TarConstants.MAGIC_OFFSET + 2] = 't';
        sparseHeader[TarConstants.MAGIC_OFFSET + 3] = 'a';
        sparseHeader[TarConstants.MAGIC_OFFSET + 4] = 'r';
        TarArchiveEntry sparseEntry = new TarArchiveEntry(sparseHeader);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));
        tais.close();
    }

    @Test
    public void gettersAndSetters_givenValues_shouldMaintainState() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertFalse(tais.isAtEOF());

        TarArchiveEntry entry = new TarArchiveEntry("foo.txt");
        tais.setCurrentEntry(entry);
        Assert.assertSame(entry, tais.getCurrentEntry());

        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void isEOFRecord_givenNullZeroOrData_shouldEvaluateCorrectly() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tais.isEOFRecord(null));

        byte[] zeroRecord = new byte[512];
        Assert.assertTrue(tais.isEOFRecord(zeroRecord));

        byte[] nonZeroRecord = new byte[512];
        nonZeroRecord[0] = 1;
        Assert.assertFalse(tais.isEOFRecord(nonZeroRecord));
        tais.close();
    }

    @Test
    public void readRecord_givenLessThanRecordSize_shouldReturnNull() throws Exception {
        byte[] incomplete = new byte[100];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(incomplete));
        Assert.assertNull(tais.readRecord());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenEmptyStream_shouldReturnNull() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void getNextTarEntry_givenCorruptedHeader_shouldThrowIOException() throws Exception {
        byte[] invalidHeader = new byte[512];
        Arrays.fill(invalidHeader, (byte) 'A');
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(invalidHeader));
        tais.getNextTarEntry();
    }

    @Test
    public void getNextTarEntry_givenSingleRecordWithZeroBlock_shouldHitEofAndConsumeSecondBlock() throws Exception {
        byte[] doubleZeroRecord = new byte[1024];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(doubleZeroRecord));
        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertTrue(tais.isAtEOF());
        tais.close();

        NonMarkableInputStream nmis = new NonMarkableInputStream(new ByteArrayInputStream(doubleZeroRecord));
        TarArchiveInputStream taisNonMarkable = new TarArchiveInputStream(nmis);
        Assert.assertNull(taisNonMarkable.getNextTarEntry());
        Assert.assertTrue(taisNonMarkable.isAtEOF());
        taisNonMarkable.close();
    }

    @Test
    public void getNextTarEntry_givenTwoSequentialEntriesWithPadding_shouldReadBothCorrectly() throws Exception {
        byte[] header1 = createDefaultHeader("file1.txt", 10L);
        byte[] body1 = new byte[512];
        Arrays.fill(body1, 0, 10, (byte) 'a');

        byte[] header2 = createDefaultHeader("file2.txt", 20L);
        byte[] body2 = new byte[512];
        Arrays.fill(body2, 0, 20, (byte) 'b');

        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(body1);
        baos.write(header2);
        baos.write(body2);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ArchiveEntry entry1 = tais.getNextEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("file1.txt", entry1.getName());

        ArchiveEntry entry2 = tais.getNextEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("file2.txt", entry2.getName());

        Assert.assertNull(tais.getNextEntry());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGnuLongNameEntry_shouldSetUnfoldedName() throws Exception {
        String longName = "very/long/path/name/that/exceeds/the/normal/tar/limit/of/one/hundred/characters/which/requires/gnu/long/name/entry/implementation/test.txt";
        byte[] longNameBytes = longName.getBytes("UTF-8");
        byte[] longNameBlock = new byte[512];
        System.arraycopy(longNameBytes, 0, longNameBlock, 0, longNameBytes.length);

        byte[] gnuHeader = createHeader("././@LongLink", (long) longNameBytes.length + 1, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] realHeader = createDefaultHeader("short.txt", 5L);
        byte[] realBody = new byte[512];
        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuHeader);
        baos.write(longNameBlock);
        baos.write(realHeader);
        baos.write(realBody);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longName, entry.getName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGnuLongLinkEntry_shouldSetUnfoldedLinkName() throws Exception {
        String longLink = "target/link/destination/that/is/exceptionally/long/and/requires/gnu/long/link/header/support/test_link.txt";
        byte[] longLinkBytes = longLink.getBytes("UTF-8");
        byte[] longLinkBlock = new byte[512];
        System.arraycopy(longLinkBytes, 0, longLinkBlock, 0, longLinkBytes.length);

        byte[] gnuHeader = createHeader("././@LongLink", (long) longLinkBytes.length + 1, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] realHeader = createDefaultHeader("symlink.txt", 0L);
        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuHeader);
        baos.write(longLinkBlock);
        baos.write(realHeader);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longLink, entry.getLinkName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGnuLongNameWithoutNextEntry_shouldReturnNull() throws Exception {
        byte[] longNameBytes = "longNameOnly".getBytes("UTF-8");
        byte[] longNameBlock = new byte[512];
        System.arraycopy(longNameBytes, 0, longNameBlock, 0, longNameBytes.length);

        byte[] gnuHeader = createHeader("././@LongLink", (long) longNameBytes.length, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuHeader);
        baos.write(longNameBlock);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenPaxHeader_shouldParseAndApplyAttributes() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("25 path=new/path/name.txt\n");
        sb.append("26 linkpath=target/path\n");
        sb.append("13 gid=1001\n");
        sb.append("18 gname=testgroup\n");
        sb.append("13 uid=2002\n");
        sb.append("17 uname=testuser\n");
        sb.append("14 size=5000\n");
        sb.append("22 mtime=1350000000.5\n");
        sb.append("20 SCHILY.devminor=7\n");
        sb.append("20 SCHILY.devmajor=8\n");
        byte[] paxData = sb.toString().getBytes(CharsetNames.UTF_8);
        byte[] paxBlock = new byte[512];
        System.arraycopy(paxData, 0, paxBlock, 0, paxData.length);

        byte[] paxHeader = createHeader("PaxHeader", paxData.length, TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        byte[] realHeader = createDefaultHeader("old.txt", 100L);
        byte[] eof = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxBlock);
        baos.write(realHeader);
        baos.write(eof);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("new/path/name.txt", entry.getName());
        Assert.assertEquals("target/path", entry.getLinkName());
        Assert.assertEquals(1001, entry.getGroupId());
        Assert.assertEquals("testgroup", entry.getGroupName());
        Assert.assertEquals(2002, entry.getUserId());
        Assert.assertEquals("testuser", entry.getUserName());
        Assert.assertEquals(5000L, entry.getSize());
        Assert.assertEquals(1350000000500L, entry.getModTime().getTime());
        Assert.assertEquals(7, entry.getDevMinor());
        Assert.assertEquals(8, entry.getDevMajor());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void parsePaxHeaders_givenTruncatedPayload_shouldThrowIOException() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String truncated = "50 path=short";
        tais.parsePaxHeaders(new ByteArrayInputStream(truncated.getBytes(CharsetNames.UTF_8)));
    }

    @Test
    public void parsePaxHeaders_givenEmptyInput_shouldReturnEmptyMap() throws Exception {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map headers = tais.parsePaxHeaders(new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(headers.isEmpty());
        tais.close();
    }

    @Test
    public void matches_givenShortLength_shouldReturnFalse() {
        byte[] sig = new byte[100];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, 100));
        Assert.assertFalse(TarArchiveInputStream.matches(sig, TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN - 1));
    }

    @Test
    public void matches_givenPosixMagic_shouldReturnTrue() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void matches_givenGnuMagicWithSpaceOrZero_shouldReturnTrue() {
        byte[] sigSpace = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, sigSpace, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, sigSpace, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sigSpace, 512));

        byte[] sigZero = new byte[512];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, sigZero, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, sigZero, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sigZero, 512));
    }

    @Test
    public void matches_givenAntMagic_shouldReturnTrue() {
        byte[] sig = new byte[512];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sig, 512));
    }

    @Test
    public void matches_givenInvalidSignatures_shouldReturnFalse() {
        byte[] sig = new byte[512];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, 512));

        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        sig[TarConstants.VERSION_OFFSET] = '9';
        sig[TarConstants.VERSION_OFFSET + 1] = '9';
        Assert.assertFalse(TarArchiveInputStream.matches(sig, 512));
    }
}