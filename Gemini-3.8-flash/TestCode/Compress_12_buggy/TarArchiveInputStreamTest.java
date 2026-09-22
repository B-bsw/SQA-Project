package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static byte[] createTarHeader(String name, long size, byte linkFlag) {
        byte[] header = new byte[512];
        byte[] nameBytes = name.getBytes();
        int nameLen = nameBytes.length > 100 ? 100 : nameBytes.length;
        System.arraycopy(nameBytes, 0, header, 0, nameLen);

        writeOctal(header, 100, 8, 0644);
        writeOctal(header, 108, 8, 0);
        writeOctal(header, 116, 8, 0);
        writeOctal(header, 124, 12, size);
        writeOctal(header, 136, 12, 1000000000L);
        header[156] = linkFlag;

        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, header, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, header, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        for (int i = 148; i < 156; i++) {
            header[i] = ' ';
        }

        long sum = 0;
        for (int i = 0; i < 512; i++) {
            sum += (header[i] & 0xFF);
        }
        writeOctal(header, 148, 8, sum);

        return header;
    }

    private static void writeOctal(byte[] buf, int offset, int length, long val) {
        int idx = length - 1;
        buf[offset + idx] = 0;
        idx--;
        if (val == 0) {
            buf[offset + idx] = '0';
            idx--;
        } else {
            long temp = val;
            while (idx >= 0 && temp > 0) {
                buf[offset + idx] = (byte) ('0' + (temp & 7));
                temp >>= 3;
                idx--;
            }
        }
        while (idx >= 0) {
            buf[offset + idx] = '0';
            idx--;
        }
    }

    private static byte[] padToRecord(byte[] data, int recordSize) {
        int remainder = data.length % recordSize;
        if (remainder == 0) {
            return data;
        }
        int total = data.length + (recordSize - remainder);
        byte[] res = new byte[total];
        System.arraycopy(data, 0, res, 0, data.length);
        return res;
    }

    @Test
    public void constructors_givenDifferentParameters_shouldInitializeCorrectly() throws IOException {
        byte[] empty = new byte[0];
        TarArchiveInputStream tais1 = new TarArchiveInputStream(new ByteArrayInputStream(empty));
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais1.getRecordSize());
        tais1.close();

        TarArchiveInputStream tais2 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024);
        Assert.assertEquals(TarBuffer.DEFAULT_RCDSIZE, tais2.getRecordSize());
        tais2.close();

        TarArchiveInputStream tais3 = new TarArchiveInputStream(new ByteArrayInputStream(empty), 1024, 512);
        Assert.assertEquals(512, tais3.getRecordSize());
        tais3.close();
    }

    @Test
    public void matches_givenVariousSignatures_shouldValidateTarMagicAndVersion() {
        byte[] tooShort = new byte[100];
        Assert.assertFalse(TarArchiveInputStream.matches(tooShort, 100));

        byte[] sig = new byte[300];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, sig.length));

        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));

        byte[] gnuSpace = new byte[300];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuSpace, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, gnuSpace, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuSpace, gnuSpace.length));

        byte[] gnuZero = new byte[300];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuZero, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, gnuZero, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuZero, gnuZero.length));

        byte[] antSig = new byte[300];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, antSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, antSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));
    }

    @Test
    public void canReadEntryData_givenDifferentArchiveEntries_shouldReturnExpectedBoolean() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));

        ArchiveEntry fakeEntry = new ArchiveEntry() {
            public String getName() { return "fake"; }
            public long getSize() { return 0; }
            public boolean isDirectory() { return false; }
            public java.util.Date getLastModifiedDate() { return new java.util.Date(); }
        };
        Assert.assertFalse(tais.canReadEntryData(fakeEntry));

        TarArchiveEntry normalEntry = new TarArchiveEntry("test.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        byte[] sparseHeader = createTarHeader("sparse.txt", 100, TarConstants.LF_GNUTYPE_SPARSE);
        TarArchiveEntry sparseEntry = new TarArchiveEntry(sparseHeader);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));
    }

    @Test
    public void getNextTarEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenSingleNormalEntry_shouldReadContentAndAvailable() throws IOException {
        String content = "Hello Tar Archive Content!";
        byte[] contentBytes = content.getBytes();
        byte[] header = createTarHeader("file1.txt", contentBytes.length, TarConstants.LF_NORMAL);
        byte[] paddedContent = padToRecord(contentBytes, 512);

        byte[] archive = new byte[header.length + paddedContent.length + 1024];
        System.arraycopy(header, 0, archive, 0, header.length);
        System.arraycopy(paddedContent, 0, archive, header.length, paddedContent.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = (TarArchiveEntry) tais.getNextEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("file1.txt", entry.getName());
        Assert.assertEquals(contentBytes.length, entry.getSize());
        Assert.assertEquals(contentBytes.length, tais.available());

        byte[] readBuffer = new byte[contentBytes.length];
        int readCount = tais.read(readBuffer, 0, readBuffer.length);
        Assert.assertEquals(contentBytes.length, readCount);
        Assert.assertEquals(content, new String(readBuffer));

        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(readBuffer, 0, readBuffer.length));

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenMultipleEntriesWithoutReadingBody_shouldSkipAndReadNext() throws IOException {
        byte[] h1 = createTarHeader("first.txt", 10, TarConstants.LF_NORMAL);
        byte[] c1 = padToRecord(new byte[10], 512);
        byte[] h2 = createTarHeader("second.txt", 20, TarConstants.LF_NORMAL);
        byte[] c2 = padToRecord(new byte[20], 512);

        byte[] streamBytes = new byte[h1.length + c1.length + h2.length + c2.length + 1024];
        int pos = 0;
        System.arraycopy(h1, 0, streamBytes, pos, h1.length); pos += h1.length;
        System.arraycopy(c1, 0, streamBytes, pos, c1.length); pos += c1.length;
        System.arraycopy(h2, 0, streamBytes, pos, h2.length); pos += h2.length;
        System.arraycopy(c2, 0, streamBytes, pos, c2.length); pos += c2.length;

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(streamBytes));
        TarArchiveEntry entry1 = tais.getNextTarEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("first.txt", entry1.getName());

        TarArchiveEntry entry2 = tais.getNextTarEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("second.txt", entry2.getName());

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void skip_givenNumberOfBytes_shouldSkipCorrectAmount() throws IOException {
        byte[] content = new byte[9000];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i % 128);
        }
        byte[] header = createTarHeader("large.bin", content.length, TarConstants.LF_NORMAL);
        byte[] padded = padToRecord(content, 512);

        byte[] archive = new byte[header.length + padded.length + 1024];
        System.arraycopy(header, 0, archive, 0, header.length);
        System.arraycopy(padded, 0, archive, header.length, padded.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        tais.getNextTarEntry();

        long skipped = tais.skip(8500);
        Assert.assertEquals(8500, skipped);
        Assert.assertEquals(500, tais.available());

        long skipRest = tais.skip(1000);
        Assert.assertEquals(500, skipRest);
        Assert.assertEquals(0, tais.available());

        tais.reset();
        tais.close();
    }

    @Test
    public void read_givenPartialReadsAndRemainingBuffers_shouldCoverAllReadBranches() throws IOException {
        byte[] content = new byte[600];
        for (int i = 0; i < content.length; i++) {
            content[i] = (byte) (i & 0xFF);
        }
        byte[] header = createTarHeader("chunk.bin", content.length, TarConstants.LF_NORMAL);
        byte[] padded = padToRecord(content, 512);

        byte[] archive = new byte[header.length + padded.length + 1024];
        System.arraycopy(header, 0, archive, 0, header.length);
        System.arraycopy(padded, 0, archive, header.length, padded.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        tais.getNextTarEntry();

        byte[] chunk1 = new byte[100];
        int r1 = tais.read(chunk1, 0, 100);
        Assert.assertEquals(100, r1);

        byte[] chunk2 = new byte[200];
        int r2 = tais.read(chunk2, 0, 200);
        Assert.assertEquals(200, r2);

        byte[] chunk3 = new byte[500];
        int r3 = tais.read(chunk3, 0, 500);
        Assert.assertEquals(300, r3);

        int r4 = tais.read(chunk3, 0, 10);
        Assert.assertEquals(-1, r4);

        tais.close();
    }

    @Test(expected = IOException.class)
    public void read_givenUnexpectedEofDuringRecordRead_shouldThrowIOException() throws IOException {
        byte[] header = createTarHeader("truncated.bin", 500, TarConstants.LF_NORMAL);
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(header));
        tais.getNextTarEntry();
        byte[] buf = new byte[500];
        tais.read(buf, 0, 500);
    }

    @Test(expected = RuntimeException.class)
    public void getNextTarEntry_givenCorruptedSkipStream_shouldThrowRuntimeException() throws IOException {
        byte[] header = createTarHeader("corrupted.bin", 500, TarConstants.LF_NORMAL);
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(header));
        tais.getNextTarEntry();
        tais.getNextTarEntry();
    }

    @Test
    public void getNextTarEntry_givenGnuLongNameEntry_shouldSetActualLongName() throws IOException {
        String longName = "very/long/path/directory/structure/that/exceeds/one/hundred/characters/filename_test_1234567890.txt";
        byte[] longNameBytes = (longName + "\0").getBytes();
        byte[] gnuHeader = createTarHeader(TarConstants.GNU_LONGLINK, longNameBytes.length, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] paddedName = padToRecord(longNameBytes, 512);

        byte[] realHeader = createTarHeader("short.txt", 12, TarConstants.LF_NORMAL);
        byte[] realContent = padToRecord("Hello World!".getBytes(), 512);

        byte[] archive = new byte[gnuHeader.length + paddedName.length + realHeader.length + realContent.length + 1024];
        int pos = 0;
        System.arraycopy(gnuHeader, 0, archive, pos, gnuHeader.length); pos += gnuHeader.length;
        System.arraycopy(paddedName, 0, archive, pos, paddedName.length); pos += paddedName.length;
        System.arraycopy(realHeader, 0, archive, pos, realHeader.length); pos += realHeader.length;
        System.arraycopy(realContent, 0, archive, pos, realContent.length); pos += realContent.length;

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longName, entry.getName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGnuLongNameFollowedByEof_shouldReturnNull() throws IOException {
        byte[] longNameBytes = "only_name\0".getBytes();
        byte[] gnuHeader = createTarHeader(TarConstants.GNU_LONGLINK, longNameBytes.length, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] paddedName = padToRecord(longNameBytes, 512);

        byte[] archive = new byte[gnuHeader.length + paddedName.length + 1024];
        System.arraycopy(gnuHeader, 0, archive, 0, gnuHeader.length);
        System.arraycopy(paddedName, 0, archive, gnuHeader.length, paddedName.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenPaxHeaders_shouldParseAndApplyAttributes() throws IOException {
        String paxData = "28 path=pax/custom/path.txt\n"
                       + "25 linkpath=link/target\n"
                       + "14 gid=1001\n"
                       + "16 gname=paxgroup\n"
                       + "14 uid=2001\n"
                       + "15 uname=paxuser\n"
                       + "15 size=3000000000\n";
        byte[] paxBytes = paxData.getBytes("UTF-8");
        byte[] paxHeader = createTarHeader("pax_header", paxBytes.length, TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        byte[] paddedPax = padToRecord(paxBytes, 512);

        byte[] realHeader = createTarHeader("dummy.txt", 0, TarConstants.LF_NORMAL);

        byte[] archive = new byte[paxHeader.length + paddedPax.length + realHeader.length + 1024];
        int pos = 0;
        System.arraycopy(paxHeader, 0, archive, pos, paxHeader.length); pos += paxHeader.length;
        System.arraycopy(paddedPax, 0, archive, pos, paddedPax.length); pos += paddedPax.length;
        System.arraycopy(realHeader, 0, archive, pos, realHeader.length); pos += realHeader.length;

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("pax/custom/path.txt", entry.getName());
        Assert.assertEquals("link/target", entry.getLinkName());
        Assert.assertEquals(1001, entry.getGroupId());
        Assert.assertEquals("paxgroup", entry.getGroupName());
        Assert.assertEquals(2001, entry.getUserId());
        Assert.assertEquals("paxuser", entry.getUserName());
        Assert.assertEquals(3000000000L, entry.getSize());
        Assert.assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test(expected = IOException.class)
    public void parsePaxHeaders_givenMalformedLengthHeader_shouldThrowIOException() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String malformed = "50 path=short\n";
        tais.parsePaxHeaders(new StringReader(malformed));
    }

    @Test
    public void parsePaxHeaders_givenValidHeaders_shouldReturnParsedMap() throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        String valid = "22 path=test/path.txt\n11 uid=500\n";
        Map<String, String> map = tais.parsePaxHeaders(new StringReader(valid));
        Assert.assertEquals(2, map.size());
        Assert.assertEquals("test/path.txt", map.get("path"));
        Assert.assertEquals("500", map.get("uid"));
    }

    @Test
    public void getNextTarEntry_givenGnuSparseEntryWithExtendedRecords_shouldReadSparseEntryRecords() throws IOException {
        byte[] sparseHeader = createTarHeader("sparse_file.txt", 0, TarConstants.LF_GNUTYPE_SPARSE);
        sparseHeader[482] = 1;

        byte[] extSparseHeader = new byte[512];
        extSparseHeader[504] = 0;

        byte[] archive = new byte[sparseHeader.length + extSparseHeader.length + 1024];
        System.arraycopy(sparseHeader, 0, archive, 0, sparseHeader.length);
        System.arraycopy(extSparseHeader, 0, archive, sparseHeader.length, extSparseHeader.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("sparse_file.txt", entry.getName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGnuSparseWithEofOnNextRecord_shouldHandleGracefully() throws IOException {
        byte[] sparseHeader = createTarHeader("sparse_eof.txt", 0, TarConstants.LF_GNUTYPE_SPARSE);
        sparseHeader[482] = 1;

        byte[] archive = new byte[sparseHeader.length + 1024];
        System.arraycopy(sparseHeader, 0, archive, 0, sparseHeader.length);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void protectedAccessors_givenValues_shouldSetAndGetState() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(tais.isAtEOF());
        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());

        Assert.assertNull(tais.getCurrentEntry());
        TarArchiveEntry entry = new TarArchiveEntry("direct.txt");
        tais.setCurrentEntry(entry);
        Assert.assertSame(entry, tais.getCurrentEntry());
    }
}