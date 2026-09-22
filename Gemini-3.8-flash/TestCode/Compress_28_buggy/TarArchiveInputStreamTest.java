package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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

    private static class CloseTrackerInputStream extends InputStream {
        private final InputStream delegate;
        private boolean closed = false;

        public CloseTrackerInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        public int read() throws IOException {
            return delegate.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }

        public void close() throws IOException {
            closed = true;
            delegate.close();
        }

        public boolean isClosed() {
            return closed;
        }
    }

    private static class MarkNotSupportedInputStream extends InputStream {
        private final InputStream delegate;

        public MarkNotSupportedInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        public int read() throws IOException {
            return delegate.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return delegate.read(b, off, len);
        }

        public boolean markSupported() {
            return false;
        }
    }

    private byte[] createTarHeader(String name, long size, byte typeFlag) {
        TarArchiveEntry entry = new TarArchiveEntry(name, typeFlag);
        entry.setSize(size);
        byte[] buf = new byte[TarConstants.DEFAULT_RCDSIZE];
        entry.writeEntryHeader(buf);
        return buf;
    }

    private byte[] createPaddedData(byte[] data, int recordSize) {
        int remainder = data.length % recordSize;
        int padding = (remainder == 0) ? 0 : recordSize - remainder;
        byte[] padded = new byte[data.length + padding];
        System.arraycopy(data, 0, padded, 0, data.length);
        return padded;
    }

    @Test
    public void constructor_givenInputStream_shouldInitializeWithDefaults() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        Assert.assertNull(tais.getCurrentEntry());
        Assert.assertFalse(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void constructor_givenEncoding_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void constructor_givenBlockSize_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024);
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void constructor_givenBlockSizeAndEncoding_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024, "UTF-8");
        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void constructor_givenBlockSizeAndRecordSize_shouldInitializeProperly() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is, 1024, 512);
        Assert.assertEquals(512, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingStream() throws IOException {
        CloseTrackerInputStream ctis = new CloseTrackerInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveInputStream tais = new TarArchiveInputStream(ctis);
        tais.close();
        Assert.assertTrue(ctis.isClosed());
    }

    @Test
    public void reset_whenInvoked_shouldDoNothingWithoutException() {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.reset();
    }

    @Test
    public void read_whenNoEntryLoaded_shouldThrowIllegalStateException() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[100]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        try {
            tais.read(new byte[10], 0, 10);
            Assert.fail("Expected IllegalStateException when reading without current entry");
        } catch (IllegalStateException expected) {
            Assert.assertEquals("No current tar entry", expected.getMessage());
        } finally {
            tais.close();
        }
    }

    @Test
    public void read_whenAtEOF_shouldReturnMinusOne() throws IOException {
        InputStream is = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(is);
        tais.setAtEOF(true);
        int read = tais.read(new byte[10], 0, 10);
        Assert.assertEquals(-1, read);
        tais.close();
    }

    @Test
    public void read_whenEntryOffsetReachesEntrySize_shouldReturnMinusOne() throws IOException {
        byte[] header = createTarHeader("test.txt", 0, TarConstants.LF_NORMAL);
        byte[] eof1 = new byte[512];
        byte[] eof2 = new byte[512];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(eof1);
        baos.write(eof2);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        int read = tais.read(new byte[10], 0, 10);
        Assert.assertEquals(-1, read);
        tais.close();
    }

    @Test
    public void read_whenValidDataProvided_shouldReadUpToAvailable() throws IOException {
        String content = "Hello World Tar Content";
        byte[] contentBytes = content.getBytes("UTF-8");
        byte[] header = createTarHeader("test.txt", contentBytes.length, TarConstants.LF_NORMAL);
        byte[] paddedContent = createPaddedData(contentBytes, 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(paddedContent);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[50];
        int readCount = tais.read(buf, 0, buf.length);
        Assert.assertEquals(contentBytes.length, readCount);
        Assert.assertEquals(content, new String(buf, 0, readCount, "UTF-8"));
        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(buf, 0, buf.length));
        tais.close();
    }

    @Test
    public void read_whenUnderlyingStreamReachesUnexpectedEOF_shouldSetHitEOF() throws IOException {
        byte[] header = createTarHeader("test.txt", 100, TarConstants.LF_NORMAL);
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(header));
        tais.getNextTarEntry();
        byte[] buf = new byte[50];
        int readCount = tais.read(buf, 0, buf.length);
        Assert.assertEquals(-1, readCount);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void available_whenSizeDiffExceedsIntegerMax_shouldReturnIntegerMax() throws IOException {
        TarArchiveEntry largeEntry = new TarArchiveEntry("large.bin");
        largeEntry.setSize(3000000000L);
        byte[] header = new byte[512];
        largeEntry.writeEntryHeader(header);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(header));
        tais.setCurrentEntry(largeEntry);

        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test
    public void skip_givenAmountWithinBounds_shouldSkipAndCountOffset() throws IOException {
        byte[] content = new byte[100];
        for (int i = 0; i < 100; i++) {
            content[i] = (byte) i;
        }
        byte[] header = createTarHeader("test.bin", 100, TarConstants.LF_NORMAL);
        byte[] padded = createPaddedData(content, 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(padded);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tais.getNextTarEntry();

        long skipped = tais.skip(40);
        Assert.assertEquals(40, skipped);
        Assert.assertEquals(60, tais.available());

        byte[] buf = new byte[20];
        int read = tais.read(buf, 0, 20);
        Assert.assertEquals(20, read);
        Assert.assertEquals(40, buf[0]);

        long remainingSkipped = tais.skip(100);
        Assert.assertEquals(40, remainingSkipped);
        Assert.assertEquals(0, tais.available());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenTwoZeroRecordsPresent_shouldConsumeEOFAndBlockRemainder() throws IOException {
        byte[] data = new byte[TarConstants.DEFAULT_BLKSIZE];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(data));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenUnderlyingStreamNotMarkSupported_shouldConsumeEOF() throws IOException {
        byte[] data = new byte[TarConstants.DEFAULT_BLKSIZE];
        MarkNotSupportedInputStream mnsis = new MarkNotSupportedInputStream(new ByteArrayInputStream(data));
        TarArchiveInputStream tais = new TarArchiveInputStream(mnsis);
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenHeaderBufferShort_shouldReturnNull() throws IOException {
        byte[] shortData = new byte[256];
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(shortData));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenCorruptHeaderDetected_shouldThrowIOException() {
        byte[] corrupt = new byte[512];
        Arrays.fill(corrupt, (byte) 'A');
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(corrupt));
        try {
            tais.getNextTarEntry();
            Assert.fail("Expected IOException on corrupt header");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Error detected parsing the header"));
            Assert.assertNotNull(e.getCause());
        } finally {
            try {
                tais.close();
            } catch (IOException ignored) {
            }
        }
    }

    @Test
    public void getNextTarEntry_whenMultipleEntriesExist_shouldSkipPaddingAndReadNext() throws IOException {
        byte[] content1 = new byte[10];
        byte[] header1 = createTarHeader("file1.bin", content1.length, TarConstants.LF_NORMAL);
        byte[] padded1 = createPaddedData(content1, 512);

        byte[] content2 = new byte[20];
        byte[] header2 = createTarHeader("file2.bin", content2.length, TarConstants.LF_NORMAL);
        byte[] padded2 = createPaddedData(content2, 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(padded1);
        baos.write(header2);
        baos.write(padded2);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry1 = tais.getNextTarEntry();
        Assert.assertNotNull(entry1);
        Assert.assertEquals("file1.bin", entry1.getName());

        ArchiveEntry entry2 = tais.getNextEntry();
        Assert.assertNotNull(entry2);
        Assert.assertEquals("file2.bin", entry2.getName());

        ArchiveEntry entry3 = tais.getNextEntry();
        Assert.assertNull(entry3);
        tais.close();
    }

    @Test
    public void getNextTarEntry_withGNULongName_shouldExtractCompleteLongName() throws IOException {
        String longName = "this/is/a/very/long/path/name/that/exceeds/one/hundred/characters/and/must/be/handled/using/gnu/long/name/entry/specifications/file.txt";
        byte[] longNameBytes = longName.getBytes("UTF-8");
        byte[] longNameHeader = createTarHeader(TarConstants.GNU_LONGLINK, longNameBytes.length + 1, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] paddedLongName = createPaddedData(longNameBytes, 512);

        byte[] actualHeader = createTarHeader("short.txt", 5, TarConstants.LF_NORMAL);
        byte[] actualData = createPaddedData(new byte[5], 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameHeader);
        baos.write(paddedLongName);
        baos.write(actualHeader);
        baos.write(actualData);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longName, entry.getName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_withGNULongLink_shouldExtractCompleteLinkName() throws IOException {
        String longLinkName = "target/of/a/very/long/symlink/path/that/exceeds/the/tar/standard/limit/for/link/names/link_target.txt";
        byte[] linkBytes = longLinkName.getBytes("UTF-8");
        byte[] linkHeader = createTarHeader(TarConstants.GNU_LONGLINK, linkBytes.length + 1, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] paddedLink = createPaddedData(linkBytes, 512);

        byte[] actualHeader = createTarHeader("symlink.txt", 0, TarConstants.LF_SYMLINK);
        byte[] actualData = new byte[0];

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(linkHeader);
        baos.write(paddedLink);
        baos.write(actualHeader);
        baos.write(actualData);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(longLinkName, entry.getLinkName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenLongNameTruncatedWithoutSubsequentEntry_shouldReturnNull() throws IOException {
        byte[] longNameBytes = "longname".getBytes("UTF-8");
        byte[] longNameHeader = createTarHeader(TarConstants.GNU_LONGLINK, longNameBytes.length + 1, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] paddedLongName = createPaddedData(longNameBytes, 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longNameHeader);
        baos.write(paddedLongName);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenLongLinkTruncatedWithoutSubsequentEntry_shouldReturnNull() throws IOException {
        byte[] longLinkBytes = "longlink".getBytes("UTF-8");
        byte[] longLinkHeader = createTarHeader(TarConstants.GNU_LONGLINK, longLinkBytes.length + 1, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] paddedLongLink = createPaddedData(longLinkBytes, 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(longLinkHeader);
        baos.write(paddedLongLink);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void parsePaxHeaders_givenValidPaxData_shouldApplyToCurrentEntry() throws IOException {
        StringBuilder paxBuilder = new StringBuilder();
        paxBuilder.append("25 path=new/pax/name.txt\n");
        paxBuilder.append("23 linkpath=target/path\n");
        paxBuilder.append("13 gid=1001\n");
        paxBuilder.append("16 gname=testgrp\n");
        paxBuilder.append("13 uid=2002\n");
        paxBuilder.append("17 uname=testuser\n");
        paxBuilder.append("13 size=5000\n");
        paxBuilder.append("21 mtime=123456789.5\n");
        paxBuilder.append("20 SCHILY.devminor=7\n");
        paxBuilder.append("20 SCHILY.devmajor=8\n");
        byte[] paxData = paxBuilder.toString().getBytes(CharsetNames.UTF_8);

        byte[] paxHeader = createTarHeader("PaxHeader/file.txt", paxData.length, TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        byte[] paddedPax = createPaddedData(paxData, 512);

        byte[] mainHeader = createTarHeader("oldname.txt", 10, TarConstants.LF_NORMAL);
        byte[] mainData = createPaddedData(new byte[10], 512);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paddedPax);
        baos.write(mainHeader);
        baos.write(mainData);
        baos.write(new byte[1024]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("new/pax/name.txt", entry.getName());
        Assert.assertEquals("target/path", entry.getLinkName());
        Assert.assertEquals(1001, entry.getGroupId());
        Assert.assertEquals("testgrp", entry.getGroupName());
        Assert.assertEquals(2002, entry.getUserId());
        Assert.assertEquals("testuser", entry.getUserName());
        Assert.assertEquals(5000L, entry.getSize());
        Assert.assertEquals(123456789500L, entry.getModTime().getTime());
        Assert.assertEquals(7, entry.getDevMinor());
        Assert.assertEquals(8, entry.getDevMajor());
        tais.close();
    }

    @Test
    public void parsePaxHeaders_whenLengthMismatch_shouldThrowIOException() throws IOException {
        String badPax = "30 path=truncated";
        InputStream stream = new ByteArrayInputStream(badPax.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            tais.parsePaxHeaders(stream);
            Assert.fail("Expected IOException on truncated pax header");
        } catch (IOException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to read Paxheader"));
        } finally {
            tais.close();
        }
    }

    @Test
    public void parsePaxHeaders_whenStreamEndsWithoutFullEntry_shouldReturnParsedSoFar() throws IOException {
        String pax = "20 path=valid.txt\n";
        InputStream stream = new ByteArrayInputStream(pax.getBytes(CharsetNames.UTF_8));
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Map<String, String> headers = tais.parsePaxHeaders(stream);
        Assert.assertEquals(1, headers.size());
        Assert.assertEquals("valid.txt", headers.get("path"));
        tais.close();
    }

    @Test
    public void canReadEntryData_whenGivenTarEntry_shouldReturnProperStatus() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry normalEntry = new TarArchiveEntry("file.txt");
        Assert.assertTrue(tais.canReadEntryData(normalEntry));

        TarArchiveEntry sparseEntry = new TarArchiveEntry("sparse.bin", TarConstants.LF_GNUTYPE_SPARSE);
        Assert.assertFalse(tais.canReadEntryData(sparseEntry));

        ArchiveEntry dummy = new DummyArchiveEntry();
        Assert.assertFalse(tais.canReadEntryData(dummy));
        Assert.assertFalse(tais.canReadEntryData(null));
    }

    @Test
    public void matches_variousSignatures_shouldValidateCorrectly() {
        byte[] shortSignature = new byte[10];
        Assert.assertFalse(TarArchiveInputStream.matches(shortSignature, shortSignature.length));

        byte[] posixSig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_POSIX.getBytes(), 0, posixSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_POSIX.getBytes(), 0, posixSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(posixSig, posixSig.length));

        byte[] gnuSpaceSig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuSpaceSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_SPACE.getBytes(), 0, gnuSpaceSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuSpaceSig, gnuSpaceSig.length));

        byte[] gnuZeroSig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_GNU.getBytes(), 0, gnuZeroSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_GNU_ZERO.getBytes(), 0, gnuZeroSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(gnuZeroSig, gnuZeroSig.length));

        byte[] antSig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy(TarConstants.MAGIC_ANT.getBytes(), 0, antSig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(TarConstants.VERSION_ANT.getBytes(), 0, antSig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);
        Assert.assertTrue(TarArchiveInputStream.matches(antSig, antSig.length));

        byte[] invalidSig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN];
        System.arraycopy("UNKNOWN".getBytes(), 0, invalidSig, TarConstants.MAGIC_OFFSET, 7);
        Assert.assertFalse(TarArchiveInputStream.matches(invalidSig, invalidSig.length));
    }

    @Test
    public void isEOFRecord_givenNullOrZeroOrNonZero_shouldValidateCorrectly() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertTrue(tais.isEOFRecord(null));
        Assert.assertTrue(tais.isEOFRecord(new byte[512]));

        byte[] nonZero = new byte[512];
        nonZero[10] = 1;
        Assert.assertFalse(tais.isEOFRecord(nonZero));
    }

    @Test
    public void setAndGetCurrentEntry_shouldFunctionAsExpected() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tais.setCurrentEntry(entry);
        Assert.assertSame(entry, tais.getCurrentEntry());
    }

    @Test
    public void setAndGetAtEOF_shouldFunctionAsExpected() {
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        Assert.assertFalse(tais.isAtEOF());
        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());
    }
}