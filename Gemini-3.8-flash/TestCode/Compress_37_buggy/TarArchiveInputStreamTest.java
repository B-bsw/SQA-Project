package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static class CustomTestInputStream extends InputStream {
        private final byte[] data;
        private int pos = 0;
        private boolean closed = false;

        public CustomTestInputStream(byte[] data) {
            this.data = data;
        }

        public int read() throws IOException {
            if (closed) {
                throw new IOException("Stream closed");
            }
            if (pos >= data.length) {
                return -1;
            }
            return data[pos++] & 0xFF;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (closed) {
                throw new IOException("Stream closed");
            }
            if (b == null) {
                throw new NullPointerException();
            }
            if (off < 0 || len < 0 || len > b.length - off) {
                throw new IndexOutOfBoundsException();
            }
            if (len == 0) {
                return 0;
            }
            if (pos >= data.length) {
                return -1;
            }
            int available = data.length - pos;
            int toRead = Math.min(len, available);
            System.arraycopy(data, pos, b, off, toRead);
            pos += toRead;
            return toRead;
        }

        public void close() throws IOException {
            this.closed = true;
        }

        public boolean isClosed() {
            return closed;
        }

        public boolean markSupported() {
            return false;
        }
    }

    private static class TruncatedInputStream extends InputStream {
        private int remainingReads;

        public TruncatedInputStream(int allowedReads) {
            this.remainingReads = allowedReads;
        }

        public int read() throws IOException {
            if (remainingReads > 0) {
                remainingReads--;
                return 0;
            }
            return -1;
        }

        public int read(byte[] b, int off, int len) throws IOException {
            if (remainingReads > 0) {
                int toRead = Math.min(len, remainingReads);
                Arrays.fill(b, off, off + toRead, (byte) 0);
                remainingReads -= toRead;
                return toRead;
            }
            return -1;
        }
    }

    private byte[] createTarHeader(String name, long size, byte linkFlag) {
        byte[] header = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] nameBytes = name.getBytes();
        System.arraycopy(nameBytes, 0, header, 0, Math.min(nameBytes.length, 100));

        formatOctalBytes(0100644, header, 100, 8);
        formatOctalBytes(0, header, 108, 8);
        formatOctalBytes(0, header, 116, 8);
        formatOctalBytes(size, header, 124, 12);
        formatOctalBytes(System.currentTimeMillis() / 1000L, header, 136, 12);

        header[156] = linkFlag;

        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        long chksum = 0;
        Arrays.fill(header, 148, 148 + 8, (byte) ' ');
        for (int i = 0; i < header.length; i++) {
            chksum += (header[i] & 0xFF);
        }
        formatCheckSumOctalBytes(chksum, header, 148, 8);

        return header;
    }

    private void formatOctalBytes(long value, byte[] buf, int offset, int length) {
        int idx = length - 1;
        buf[offset + idx] = 0;
        idx--;
        buf[offset + idx] = (byte) ' ';
        idx--;
        if (value == 0) {
            buf[offset + idx] = (byte) '0';
            idx--;
        } else {
            long val = value;
            while (idx >= 0 && val > 0) {
                buf[offset + idx] = (byte) ((byte) '0' + (byte) (val & 7));
                val = val >> 3;
                idx--;
            }
        }
        while (idx >= 0) {
            buf[offset + idx] = (byte) '0';
            idx--;
        }
    }

    private void formatCheckSumOctalBytes(long value, byte[] buf, int offset, int length) {
        formatOctalBytes(value, buf, offset, length - 1);
        buf[offset + length - 1] = (byte) ' ';
    }

    @Test
    public void constructors_givenVariousParameters_shouldInitializeCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais1 = new TarArchiveInputStream(bais);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais1.getRecordSize());
        Assert.assertNull(tais1.encoding);
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(bais, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais2.getRecordSize());
        Assert.assertEquals("UTF-8", tais2.encoding);
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(bais, 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais3.getRecordSize());
        tais3.close();

        TarArchiveInputStream tais4 = new TarArchiveInputStream(bais, 1024, "ISO-8859-1");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais4.getRecordSize());
        Assert.assertEquals("ISO-8859-1", tais4.encoding);
        tais4.close();

        TarArchiveInputStream tais5 = new TarArchiveInputStream(bais, 1024, 256);
        Assert.assertEquals(256, tais5.getRecordSize());
        Assert.assertNull(tais5.encoding);
        tais5.close();

        TarArchiveInputStream tais6 = new TarArchiveInputStream(bais, 1024, 256, "UTF-8");
        Assert.assertEquals(256, tais6.getRecordSize());
        Assert.assertEquals("UTF-8", tais6.encoding);
        tais6.close();
    }

    @Test
    public void close_givenOpenStream_shouldDelegateCloseToUnderlyingStream() throws IOException {
        CustomTestInputStream ctis = new CustomTestInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(ctis);
        Assert.assertFalse(ctis.isClosed());
        tais.close();
        Assert.assertTrue(ctis.isClosed());
    }

    @Test
    public void markAndReset_givenAnyStream_shouldBeNoOpAndReturnFalse() {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertFalse(tais.markSupported());
        tais.mark(100);
        tais.reset();
    }

    @Test
    public void available_givenVariousEntryStates_shouldReturnExpectedBounds() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertEquals(0, tais.available());

        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/", TarConstants.LF_DIR);
        tais.setCurrentEntry(dirEntry);
        Assert.assertEquals(0, tais.available());

        byte[] header = createTarHeader("file.txt", 100L, TarConstants.LF_NORMAL);
        TarArchiveEntry fileEntry = new TarArchiveEntry(header);
        fileEntry.setSize(100L);
        tais.setCurrentEntry(fileEntry);

        tais.setAtEOF(true);
        tais.setAtEOF(false);

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(header));
        TarArchiveEntry next = tais2.getNextTarEntry();
        Assert.assertNotNull(next);
        Assert.assertEquals(100, tais2.available());
    }

    @Test
    public void skip_givenNegativeOrZeroOrDirectory_shouldReturnZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[100]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertEquals(0, tais.skip(-5));
        Assert.assertEquals(0, tais.skip(0));

        TarArchiveEntry dirEntry = new TarArchiveEntry("dir/", TarConstants.LF_DIR);
        tais.setCurrentEntry(dirEntry);
        Assert.assertEquals(0, tais.skip(10));
    }

    @Test
    public void skip_givenActiveEntry_shouldSkipAvailableBytes() throws IOException {
        byte[] header = createTarHeader("file.txt", 20L, TarConstants.LF_NORMAL);
        byte[] content = new byte[512];
        for (int i = 0; i < 20; i++) {
            content[i] = (byte) (i + 1);
        }

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        long skipped = tais.skip(5);
        Assert.assertEquals(5, skipped);
        Assert.assertEquals(15, tais.available());

        long skippedExcess = tais.skip(100);
        Assert.assertEquals(15, skippedExcess);
        Assert.assertEquals(0, tais.available());
    }

    @Test
    public void read_withoutCurrentEntry_shouldThrowIllegalStateException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        try {
            tais.read(new byte[10], 0, 10);
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            Assert.assertEquals("No current tar entry", e.getMessage());
        }
    }

    @Test
    public void read_givenDirectoryOrEOF_shouldReturnMinusOne() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[10]));
        tais.setAtEOF(true);
        Assert.assertEquals(-1, tais.read(new byte[10], 0, 10));

        tais.setAtEOF(false);
        TarArchiveEntry dirEntry = new TarArchiveEntry("testdir/", TarConstants.LF_DIR);
        tais.setCurrentEntry(dirEntry);
        Assert.assertEquals(-1, tais.read(new byte[10], 0, 10));
    }

    @Test
    public void read_givenEntryData_shouldReadExpectedBytes() throws IOException {
        byte[] header = createTarHeader("sample.txt", 5L, TarConstants.LF_NORMAL);
        byte[] data = new byte[512];
        data[0] = 'a';
        data[1] = 'b';
        data[2] = 'c';
        data[3] = 'd';
        data[4] = 'e';

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(data);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("sample.txt", entry.getName());
        Assert.assertEquals(tais.getCurrentEntry(), entry);

        byte[] buf = new byte[3];
        int read1 = tais.read(buf, 0, 3);
        Assert.assertEquals(3, read1);
        Assert.assertEquals('a', buf[0]);
        Assert.assertEquals('b', buf[1]);
        Assert.assertEquals('c', buf[2]);

        byte[] buf2 = new byte[5];
        int read2 = tais.read(buf2, 0, 5);
        Assert.assertEquals(2, read2);
        Assert.assertEquals('d', buf2[0]);
        Assert.assertEquals('e', buf2[1]);

        int eofRead = tais.read(buf2, 0, 5);
        Assert.assertEquals(-1, eofRead);
    }

    @Test
    public void read_givenTruncatedStream_shouldThrowIOException() throws IOException {
        byte[] header = createTarHeader("truncated.txt", 100L, TarConstants.LF_NORMAL);
        ByteArrayInputStream bais = new ByteArrayInputStream(header);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[50];
        try {
            tais.read(buf, 0, 50);
            Assert.fail("Expected IOException on truncated stream");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Truncated TAR archive"));
        }
    }

    @Test
    public void getNextTarEntry_givenZeroHeader_shouldRecognizeEOF() throws IOException {
        byte[] emptyRecords = new byte[1024];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(emptyRecords));

        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertTrue(tais.isAtEOF());

        Assert.assertNull(tais.getNextTarEntry());
    }

    @Test
    public void getNextTarEntry_givenIncompleteHeader_shouldReturnNull() throws IOException {
        byte[] incomplete = new byte[256];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(incomplete));

        TarArchiveEntry entry = tais.getNextEntry();
        Assert.assertNull(entry);
    }

    @Test
    public void getNextTarEntry_givenCorruptHeader_shouldThrowIOException() {
        byte[] corrupt = new byte[512];
        corrupt[0] = 'A';
        Arrays.fill(corrupt, 148, 156, (byte) '9');

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(corrupt));
        try {
            tais.getNextTarEntry();
            Assert.fail("Expected IOException for invalid header");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Error detected parsing the header"));
        }
    }

    @Test
    public void getNextTarEntry_givenConsecutiveEntriesWithPadding_shouldSkipPaddingCorrectly() throws IOException {
        byte[] header1 = createTarHeader("first.txt", 5L, TarConstants.LF_NORMAL);
        byte[] data1 = new byte[512];
        data1[0] = 'H';
        data1[1] = 'e';
        data1[2] = 'l';
        data1[3] = 'l';
        data1[4] = 'o';

        byte[] header2 = createTarHeader("second.txt", 0L, TarConstants.LF_NORMAL);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(data1);
        baos.write(header2);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry e1 = tais.getNextTarEntry();
        Assert.assertEquals("first.txt", e1.getName());

        TarArchiveEntry e2 = tais.getNextTarEntry();
        Assert.assertEquals("second.txt", e2.getName());

        Assert.assertNull(tais.getNextTarEntry());
    }

    @Test
    public void getNextTarEntry_givenGNULongNameEntry_shouldSetExtendedName() throws IOException {
        String longName = "this/is/a/very/long/file/path/that/exceeds/the/standard/one/hundred/characters/limit/for/tar/archives/test.txt";
        byte[] nameBytes = longName.getBytes("UTF-8");
        byte[] nameBytesWithNull = new byte[nameBytes.length + 1];
        System.arraycopy(nameBytes, 0, nameBytesWithNull, 0, nameBytes.length);

        byte[] longNameHeader = createTarHeader(TarConstants.GNU_LONGLINK, nameBytesWithNull.length, TarConstants.LF_GNUTYPE_LONGNAME);
        int paddedLen = ((nameBytesWithNull.length + 511) / 512) * 512;
        byte[] longNameData = new byte[paddedLen];
        System.arraycopy(nameBytesWithNull, 0, longNameData, 0, nameBytesWithNull.length);

        byte[] actualFileHeader = createTarHeader("short.txt", 0L, TarConstants.LF_NORMAL);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameHeader);
        baos.write(longNameData);
        baos.write(actualFileHeader);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longName, entry.getName());
    }

    @Test
    public void getNextTarEntry_givenGNULongLinkEntry_shouldSetExtendedLinkName() throws IOException {
        String longLink = "symlink/target/path/which/is/extremely/long/and/requires/gnu/extended/longlink/entry/target.txt";
        byte[] linkBytes = longLink.getBytes("UTF-8");
        byte[] linkBytesWithNull = new byte[linkBytes.length + 1];
        System.arraycopy(linkBytes, 0, linkBytesWithNull, 0, linkBytes.length);

        byte[] longLinkHeader = createTarHeader(TarConstants.GNU_LONGLINK, linkBytesWithNull.length, TarConstants.LF_GNUTYPE_LONGLINK);
        int paddedLen = ((linkBytesWithNull.length + 511) / 512) * 512;
        byte[] longLinkData = new byte[paddedLen];
        System.arraycopy(linkBytesWithNull, 0, longLinkData, 0, linkBytesWithNull.length);

        byte[] actualFileHeader = createTarHeader("link.txt", 0L, TarConstants.LF_SYMLINK);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longLinkHeader);
        baos.write(longLinkData);
        baos.write(actualFileHeader);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longLink, entry.getLinkName());
    }

    @Test
    public void getNextTarEntry_givenPaxHeader_shouldApplyProperties() throws IOException {
        String paxContent = "25 path=pax/custom.txt\n"
                          + "20 linkpath=target/lnk\n"
                          + "12 gid=1001\n"
                          + "14 gname=testgrp\n"
                          + "12 uid=2002\n"
                          + "14 uname=testusr\n"
                          + "12 size=1024\n"
                          + "18 mtime=123456.78\n"
                          + "19 SCHILY.devminor=5\n"
                          + "19 SCHILY.devmajor=8\n";
        byte[] paxBytes = paxContent.getBytes("UTF-8");
        int paddedPax = ((paxBytes.length + 511) / 512) * 512;
        byte[] paxData = new byte[paddedPax];
        System.arraycopy(paxBytes, 0, paxData, 0, paxBytes.length);

        byte[] paxHeader = createTarHeader("PaxHeader/file", paxBytes.length, TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        byte[] fileHeader = createTarHeader("dummy.txt", 0L, TarConstants.LF_NORMAL);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxData);
        baos.write(fileHeader);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("pax/custom.txt", entry.getName());
        Assert.assertEquals("target/lnk", entry.getLinkName());
        Assert.assertEquals(1001L, entry.getLongGroupId());
        Assert.assertEquals("testgrp", entry.getGroupName());
        Assert.assertEquals(2002L, entry.getLongUserId());
        Assert.assertEquals("testusr", entry.getUserName());
        Assert.assertEquals(1024L, entry.getSize());
        Assert.assertEquals(123456780L, entry.getModTime().getTime());
        Assert.assertEquals(5, entry.getDevMinor());
        Assert.assertEquals(8, entry.getDevMajor());
    }

    @Test
    public void getNextTarEntry_givenGlobalPaxHeader_shouldApplyToSubsequentEntries() throws IOException {
        String globalPax = "14 gname=global\n";
        byte[] paxBytes = globalPax.getBytes("UTF-8");
        int paddedPax = ((paxBytes.length + 511) / 512) * 512;
        byte[] paxData = new byte[paddedPax];
        System.arraycopy(paxBytes, 0, paxData, 0, paxBytes.length);

        byte[] globalHeader = createTarHeader("GlobalHead", paxBytes.length, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        byte[] fileHeader1 = createTarHeader("file1.txt", 0L, TarConstants.LF_NORMAL);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(globalHeader);
        baos.write(paxData);
        baos.write(fileHeader1);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("file1.txt", entry.getName());
        Assert.assertEquals("global", entry.getGroupName());
    }

    @Test
    public void parsePaxHeaders_givenDeleteKey_shouldRemoveKey() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String paxContent = "14 gname=initial\n"
                          + "8 gname=\n";
        ByteArrayInputStream in = new ByteArrayInputStream(paxContent.getBytes("UTF-8"));
        Map headers = tais.parsePaxHeaders(in);
        Assert.assertFalse(headers.containsKey("gname"));
    }

    @Test
    public void parsePaxHeaders_givenTruncatedPax_shouldThrowIOException() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String paxContent = "30 path=truncated";
        ByteArrayInputStream in = new ByteArrayInputStream(paxContent.getBytes());
        try {
            tais.parsePaxHeaders(in);
            Assert.fail("Expected IOException on truncated PaxHeader");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to read Paxheader"));
        }
    }

    @Test
    public void canReadEntryData_givenNormalOrSparseEntry_shouldReturnProperFlag() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry normalEntry = new TarArchiveEntry("test.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        ArchiveEntry dummyNonTarEntry = new ArchiveEntry() {
            public String getName() {
                return "test";
            }
            public long getSize() {
                return 0;
            }
            public boolean isDirectory() {
                return false;
            }
            public java.util.Date getLastModifiedDate() {
                return null;
            }
        };
        Assert.assertFalse(tais.canReadEntryData(dummyNonTarEntry));
    }

    @Test
    public void matches_givenVariousSignatures_shouldMatchExpectedFormats() {
        byte[] shortSignature = new byte[10];
        Assert.assertFalse(TarArchiveInputStream.matches(shortSignature, shortSignature.length));

        byte[] posixSig = new byte[TarConstants.DEFAULT_RCDSIZE];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, posixSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, posixSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(posixSig, posixSig.length));

        byte[] gnuSpaceSig = new byte[TarConstants.DEFAULT_RCDSIZE];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuSpaceSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, gnuSpaceSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuSpaceSig, gnuSpaceSig.length));

        byte[] gnuZeroSig = new byte[TarConstants.DEFAULT_RCDSIZE];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuZeroSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, gnuZeroSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuZeroSig, gnuZeroSig.length));

        byte[] antSig = new byte[TarConstants.DEFAULT_RCDSIZE];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, antSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, antSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));

        byte[] invalidSig = new byte[TarConstants.DEFAULT_RCDSIZE];
        Assert.assertFalse(TarArchiveInputStream.matches(invalidSig, invalidSig.length));
    }

    @Test
    public void isEOFRecord_givenNullOrZeroOrNonZero_shouldValidate() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tais.isEOFRecord(null));
        Assert.assertTrue(tais.isEOFRecord(new byte[512]));

        byte[] nonZero = new byte[512];
        nonZero[10] = 1;
        Assert.assertFalse(tais.isEOFRecord(nonZero));
    }

    @Test
    public void tryToConsumeSecondEOFRecord_givenMarkSupportedStream_shouldHandleNonEofSecondRecord() throws IOException {
        byte[] firstEof = new byte[512];
        byte[] nextRecord = createTarHeader("after_eof.txt", 0L, TarConstants.LF_NORMAL);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(firstEof);
        baos.write(nextRecord);
        baos.write(new byte[10240]);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 10240, 512);

        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertTrue(tais.isAtEOF());
    }

    @Test
    public void getLongNameData_givenNullCurrentEntry_shouldReturnNull() throws IOException {
        byte[] longNameHeader = createTarHeader(TarConstants.GNU_LONGLINK, 10L, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] data = new byte[512];
        System.arraycopy("1234567890".getBytes(), 0, data, 0, 10);

        byte[] emptyRecords = new byte[1024];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameHeader);
        baos.write(data);
        baos.write(emptyRecords);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
    }
}