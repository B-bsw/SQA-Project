package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.utils.CharsetNames;
import org.junit.Assert;
import org.junit.Test;

public class TarArchiveInputStreamTest {

    private static class TestArchiveEntry implements ArchiveEntry {
        public String getName() {
            return "test";
        }
        public long getSize() {
            return 0;
        }
        public boolean isDirectory() {
            return false;
        }
        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private static class CloseCheckingInputStream extends ByteArrayInputStream {
        private boolean closed = false;

        public CloseCheckingInputStream(byte[] buf) {
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

    private static class NonMarkableInputStream extends InputStream {
        private final InputStream in;

        public NonMarkableInputStream(InputStream in) {
            this.in = in;
        }

        public int read() throws IOException {
            return in.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return in.read(b, off, len);
        }

        public boolean markSupported() {
            return false;
        }
    }

    private static byte[] createTarHeader(String name, long size, byte linkFlag) {
        TarArchiveEntry entry = new TarArchiveEntry(name);
        entry.setSize(size);
        entry.setModTime(100000000000L);
        byte[] buf = new byte[TarConstants.DEFAULT_RCDSIZE];
        entry.writeEntryHeader(buf);
        if (linkFlag != 0) {
            buf[156] = linkFlag;
            for (int i = 148; i < 156; i++) {
                buf[i] = ' ';
            }
            long sum = 0;
            for (int i = 0; i < 512; i++) {
                sum += (buf[i] & 0xFF);
            }
            String s = Long.toOctalString(sum);
            while (s.length() < 6) {
                s = "0" + s;
            }
            for (int i = 0; i < 6; i++) {
                buf[148 + i] = (byte) s.charAt(i);
            }
            buf[154] = 0;
            buf[155] = ' ';
        }
        return buf;
    }

    private static byte[] createTarArchive(byte[] header, byte[] data) {
        int rcdSize = TarConstants.DEFAULT_RCDSIZE;
        int dataLen = data != null ? data.length : 0;
        int pad = (rcdSize - (dataLen % rcdSize)) % rcdSize;
        int totalLen = rcdSize + dataLen + pad + (rcdSize * 2);
        byte[] archive = new byte[totalLen];
        System.arraycopy(header, 0, archive, 0, header.length);
        if (dataLen > 0) {
            System.arraycopy(data, 0, archive, rcdSize, dataLen);
        }
        return archive;
    }

    @Test
    public void constructor_givenInputStream_shouldUseDefaultSettings() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void constructor_givenInputStreamAndEncoding_shouldInitializeCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, CharsetNames.UTF_8);

        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        Assert.assertEquals(CharsetNames.UTF_8, tais.encoding);
        tais.close();
    }

    @Test
    public void constructor_givenInputStreamAndBlockSize_shouldInitializeCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024);

        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        tais.close();
    }

    @Test
    public void constructor_givenInputStreamBlockSizeAndEncoding_shouldInitializeCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024, CharsetNames.ISO_8859_1);

        Assert.assertEquals(TarConstants.DEFAULT_RCDSIZE, tais.getRecordSize());
        Assert.assertEquals(CharsetNames.ISO_8859_1, tais.encoding);
        tais.close();
    }

    @Test
    public void constructor_givenInputStreamBlockSizeAndRecordSize_shouldInitializeCorrectly() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais, 1024, 512);

        Assert.assertEquals(512, tais.getRecordSize());
        Assert.assertNull(tais.encoding);
        tais.close();
    }

    @Test
    public void close_givenOpenStream_shouldCloseUnderlyingStream() throws IOException {
        CloseCheckingInputStream bais = new CloseCheckingInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertFalse(bais.isClosed());
        tais.close();
        Assert.assertTrue(bais.isClosed());
    }

    @Test
    public void markAndReset_shouldNotSupportMarkAndBeNoOp() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertFalse(tais.markSupported());
        tais.mark(10);
        tais.reset();
        tais.close();
    }

    @Test
    public void isAtEOF_and_setAtEOF_givenStateChange_shouldReflect() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertFalse(tais.isAtEOF());
        tais.setAtEOF(true);
        Assert.assertTrue(tais.isAtEOF());
        tais.setAtEOF(false);
        Assert.assertFalse(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void getCurrentEntry_and_setCurrentEntry_givenEntry_shouldReflect() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertNull(tais.getCurrentEntry());
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        tais.setCurrentEntry(entry);
        Assert.assertSame(entry, tais.getCurrentEntry());
        tais.close();
    }

    @Test
    public void canReadEntryData_givenVariousEntryTypes_shouldReturnExpected() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertFalse(tais.canReadEntryData(null));
        Assert.assertFalse(tais.canReadEntryData(new TestArchiveEntry()));

        TarArchiveEntry standardEntry = new TarArchiveEntry("file.txt");
        Assert.assertTrue(tais.canReadEntryData(standardEntry));

        tais.close();
    }

    @Test
    public void matches_givenShortLength_shouldReturnFalse() {
        byte[] sig = new byte[TarConstants.VERSION_OFFSET + TarConstants.VERSIONLEN - 1];
        Assert.assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void matches_givenPosixHeader_shouldReturnTrue() {
        byte[] sig = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] magic = TarConstants.MAGIC_POSIX.getBytes();
        byte[] version = TarConstants.VERSION_POSIX.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void matches_givenGnuSpaceHeader_shouldReturnTrue() {
        byte[] sig = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] magic = TarConstants.MAGIC_GNU.getBytes();
        byte[] version = TarConstants.VERSION_GNU_SPACE.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void matches_givenGnuZeroHeader_shouldReturnTrue() {
        byte[] sig = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] magic = TarConstants.MAGIC_GNU.getBytes();
        byte[] version = TarConstants.VERSION_GNU_ZERO.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void matches_givenAntHeader_shouldReturnTrue() {
        byte[] sig = new byte[TarConstants.DEFAULT_RCDSIZE];
        byte[] magic = TarConstants.MAGIC_ANT.getBytes();
        byte[] version = TarConstants.VERSION_ANT.getBytes();
        System.arraycopy(magic, 0, sig, TarConstants.MAGIC_OFFSET, TarConstants.MAGICLEN);
        System.arraycopy(version, 0, sig, TarConstants.VERSION_OFFSET, TarConstants.VERSIONLEN);

        Assert.assertTrue(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void matches_givenRandomHeader_shouldReturnFalse() {
        byte[] sig = new byte[TarConstants.DEFAULT_RCDSIZE];
        for (int i = 0; i < sig.length; i++) {
            sig[i] = (byte) (i % 127);
        }
        Assert.assertFalse(TarArchiveInputStream.matches(sig, sig.length));
    }

    @Test
    public void isEOFRecord_givenNullOrZeroOrNonZero_shouldReturnExpected() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertTrue(tais.isEOFRecord(null));
        Assert.assertTrue(tais.isEOFRecord(new byte[TarConstants.DEFAULT_RCDSIZE]));

        byte[] nonZero = new byte[TarConstants.DEFAULT_RCDSIZE];
        nonZero[5] = 1;
        Assert.assertFalse(tais.isEOFRecord(nonZero));
        tais.close();
    }

    @Test
    public void readRecord_givenUnderlyingShorterThanRecordSize_shouldReturnNull() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[100]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertNull(tais.readRecord());
        tais.close();
    }

    @Test
    public void read_whenNoCurrentEntry_shouldThrowIllegalStateException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[100]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        byte[] buf = new byte[10];
        try {
            tais.read(buf, 0, buf.length);
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException expected) {
            Assert.assertTrue(expected.getMessage().contains("No current tar entry"));
        } finally {
            tais.close();
        }
    }

    @Test
    public void read_whenAtEOF_shouldReturnNegativeOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.setAtEOF(true);
        byte[] buf = new byte[10];

        Assert.assertEquals(-1, tais.read(buf, 0, buf.length));
        tais.close();
    }

    @Test
    public void available_whenEntryOffsetGreaterThanEntrySize_shouldReturnZero() throws IOException {
        byte[] content = "Hello World".getBytes(CharsetNames.UTF_8);
        byte[] header = createTarHeader("file.txt", content.length, (byte) 0);
        byte[] archive = createTarArchive(header, content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        byte[] buf = new byte[content.length];
        int read = tais.read(buf, 0, buf.length);
        Assert.assertEquals(content.length, read);

        Assert.assertEquals(0, tais.available());
        Assert.assertEquals(-1, tais.read(buf, 0, buf.length));
        tais.close();
    }

    @Test
    public void available_whenDifferenceExceedsMaxInt_shouldCapAtMaxInt() throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Field entrySizeField = TarArchiveInputStream.class.getDeclaredField("entrySize");
        entrySizeField.setAccessible(true);
        entrySizeField.set(tais, Long.valueOf(3000000000L));

        Field entryOffsetField = TarArchiveInputStream.class.getDeclaredField("entryOffset");
        entryOffsetField.setAccessible(true);
        entryOffsetField.set(tais, Long.valueOf(0L));

        Assert.assertEquals(Integer.MAX_VALUE, tais.available());
        tais.close();
    }

    @Test
    public void skip_givenNegativeOrZero_shouldReturnZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertEquals(0, tais.skip(0));
        Assert.assertEquals(0, tais.skip(-10));
        tais.close();
    }

    @Test
    public void skip_givenValidSkip_shouldAdvanceOffset() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes(CharsetNames.UTF_8);
        byte[] header = createTarHeader("skip.txt", content.length, (byte) 0);
        byte[] archive = createTarArchive(header, content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        tais.getNextEntry();

        long skipped = tais.skip(5);
        Assert.assertEquals(5, skipped);
        Assert.assertEquals(11, tais.available());

        byte[] buf = new byte[5];
        int read = tais.read(buf, 0, buf.length);
        Assert.assertEquals(5, read);
        Assert.assertEquals("56789", new String(buf, 0, read, CharsetNames.UTF_8));
        tais.close();
    }

    @Test
    public void skip_givenAmountGreaterThanAvailable_shouldSkipAvailableOnly() throws IOException {
        byte[] content = "Hello".getBytes(CharsetNames.UTF_8);
        byte[] header = createTarHeader("skipAll.txt", content.length, (byte) 0);
        byte[] archive = createTarArchive(header, content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(archive));
        tais.getNextEntry();

        long skipped = tais.skip(100);
        Assert.assertEquals(5, skipped);
        Assert.assertEquals(0, tais.available());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void getNextTarEntry_whenAlreadyAtEOF_shouldReturnNull() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);
        tais.setAtEOF(true);

        Assert.assertNull(tais.getNextTarEntry());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenCorruptedHeader_shouldThrowIOException() throws IOException {
        byte[] corruptHeader = new byte[TarConstants.DEFAULT_RCDSIZE];
        for (int i = 0; i < corruptHeader.length; i++) {
            corruptHeader[i] = (byte) 0xFF;
        }
        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(corruptHeader));
        try {
            tais.getNextTarEntry();
            Assert.fail("Expected IOException due to parsing corrupt header");
        } catch (IOException expected) {
            Assert.assertEquals("Error detected parsing the header", expected.getMessage());
            Assert.assertNotNull(expected.getCause());
        } finally {
            tais.close();
        }
    }

    @Test
    public void getNextTarEntry_givenSingleEOFRecordWithoutMarkSupport_shouldHandleGracefully() throws IOException {
        byte[] eofBlock = new byte[TarConstants.DEFAULT_RCDSIZE * 2];
        NonMarkableInputStream nmis = new NonMarkableInputStream(new ByteArrayInputStream(eofBlock));
        TarArchiveInputStream tais = new TarArchiveInputStream(nmis);

        Assert.assertNull(tais.getNextTarEntry());
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }

    @Test
    public void read_givenPrematureStreamEnd_shouldThrowTruncatedIOException() throws IOException {
        byte[] content = "0123456789".getBytes(CharsetNames.UTF_8);
        byte[] header = createTarHeader("truncated.txt", 100, (byte) 0);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        tais.getNextTarEntry();

        byte[] buf = new byte[50];
        int read1 = tais.read(buf, 0, buf.length);
        Assert.assertEquals(10, read1);

        try {
            tais.read(buf, 0, buf.length);
            Assert.fail("Expected IOException on truncated stream");
        } catch (IOException expected) {
            Assert.assertEquals("Truncated TAR archive", expected.getMessage());
        } finally {
            tais.close();
        }
    }

    @Test
    public void getNextTarEntry_givenMultipleEntriesWithPadding_shouldReadBothCorrectly() throws IOException {
        byte[] content1 = "Sample 12345".getBytes(CharsetNames.UTF_8);
        byte[] header1 = createTarHeader("file1.txt", content1.length, (byte) 0);

        byte[] content2 = "Second File Content".getBytes(CharsetNames.UTF_8);
        byte[] header2 = createTarHeader("file2.txt", content2.length, (byte) 0);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header1);
        baos.write(content1);
        int pad1 = TarConstants.DEFAULT_RCDSIZE - (content1.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad1]);

        baos.write(header2);
        baos.write(content2);
        int pad2 = TarConstants.DEFAULT_RCDSIZE - (content2.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad2]);

        baos.write(new byte[TarConstants.DEFAULT_RCDSIZE * 2]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));

        TarArchiveEntry e1 = tais.getNextTarEntry();
        Assert.assertNotNull(e1);
        Assert.assertEquals("file1.txt", e1.getName());

        TarArchiveEntry e2 = tais.getNextTarEntry();
        Assert.assertNotNull(e2);
        Assert.assertEquals("file2.txt", e2.getName());

        byte[] readBuf = new byte[content2.length];
        int read = tais.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(content2.length, read);
        Assert.assertEquals("Second File Content", new String(readBuf, 0, read, CharsetNames.UTF_8));

        TarArchiveEntry e3 = tais.getNextTarEntry();
        Assert.assertNull(e3);
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGNULongNameEntry_shouldApplyLongName() throws IOException {
        String longFileName = "this/is/a/very/long/file/path/that/exceeds/one/hundred/characters/and/must/be/handled/by/gnu/longname/extension/in/tar/file.txt";
        byte[] longNameBytes = (longFileName + "\0").getBytes(CharsetNames.UTF_8);

        byte[] gnuLongHeader = createTarHeader("././@LongLink", longNameBytes.length, TarConstants.LF_GNUTYPE_LONGNAME);
        byte[] realHeader = createTarHeader("short.txt", 5, (byte) 0);
        byte[] fileData = "hello".getBytes(CharsetNames.UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuLongHeader);
        baos.write(longNameBytes);
        int pad1 = TarConstants.DEFAULT_RCDSIZE - (longNameBytes.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad1]);

        baos.write(realHeader);
        baos.write(fileData);
        int pad2 = TarConstants.DEFAULT_RCDSIZE - (fileData.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad2]);

        baos.write(new byte[TarConstants.DEFAULT_RCDSIZE * 2]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals(longFileName, entry.getName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGNULongLinkEntry_shouldApplyLongLinkName() throws IOException {
        String longLinkName = "target/of/a/very/long/symbolic/link/path/that/exceeds/one/hundred/characters/link_destination_target_file.txt";
        byte[] longLinkBytes = (longLinkName + "\0").getBytes(CharsetNames.UTF_8);

        byte[] gnuLongLinkHeader = createTarHeader("././@LongLink", longLinkBytes.length, TarConstants.LF_GNUTYPE_LONGLINK);
        byte[] realHeader = createTarHeader("symlink", 0, TarConstants.LF_SYMLINK);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuLongLinkHeader);
        baos.write(longLinkBytes);
        int pad1 = TarConstants.DEFAULT_RCDSIZE - (longLinkBytes.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad1]);

        baos.write(realHeader);
        baos.write(new byte[TarConstants.DEFAULT_RCDSIZE * 2]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals(longLinkName, entry.getLinkName());
        tais.close();
    }

    @Test
    public void getNextTarEntry_givenGNULongNameWithoutSubsequentEntry_shouldReturnNull() throws IOException {
        String longFileName = "orphan/long/name/file.txt";
        byte[] longNameBytes = (longFileName + "\0").getBytes(CharsetNames.UTF_8);

        byte[] gnuLongHeader = createTarHeader("././@LongLink", longNameBytes.length, TarConstants.LF_GNUTYPE_LONGNAME);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(gnuLongHeader);
        baos.write(longNameBytes);
        int pad1 = TarConstants.DEFAULT_RCDSIZE - (longNameBytes.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[pad1]);
        baos.write(new byte[TarConstants.DEFAULT_RCDSIZE * 2]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();

        Assert.assertNull(entry);
        tais.close();
    }

    @Test
    public void parsePaxHeaders_givenValidHeaders_shouldParseAllProperties() throws IOException {
        StringBuilder pax = new StringBuilder();
        pax.append("25 path=overridden/path.txt\n");
        pax.append("23 linkpath=target/path\n");
        pax.append("14 gid=1234\n");
        pax.append("18 gname=testgroup\n");
        pax.append("14 uid=5678\n");
        pax.append("17 uname=testuser\n");
        pax.append("13 size=2048\n");
        pax.append("24 mtime=1234567890.123\n");
        pax.append("24 SCHILY.devminor=999\n");
        pax.append("24 SCHILY.devmajor=888\n");

        byte[] paxBytes = pax.toString().getBytes(CharsetNames.UTF_8);
        ByteArrayInputStream bais = new ByteArrayInputStream(paxBytes);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        Map<String, String> headers = tais.parsePaxHeaders(bais);

        Assert.assertEquals("overridden/path.txt", headers.get("path"));
        Assert.assertEquals("target/path", headers.get("linkpath"));
        Assert.assertEquals("1234", headers.get("gid"));
        Assert.assertEquals("testgroup", headers.get("gname"));
        Assert.assertEquals("5678", headers.get("uid"));
        Assert.assertEquals("testuser", headers.get("uname"));
        Assert.assertEquals("2048", headers.get("size"));
        Assert.assertEquals("1234567890.123", headers.get("mtime"));
        Assert.assertEquals("999", headers.get("SCHILY.devminor"));
        Assert.assertEquals("888", headers.get("SCHILY.devmajor"));
        tais.close();
    }

    @Test
    public void parsePaxHeaders_givenTruncatedStream_shouldThrowIOException() throws IOException {
        String pax = "50 path=incomplete";
        byte[] paxBytes = pax.getBytes(CharsetNames.UTF_8);
        ByteArrayInputStream bais = new ByteArrayInputStream(paxBytes);
        TarArchiveInputStream tais = new TarArchiveInputStream(bais);

        try {
            tais.parsePaxHeaders(bais);
            Assert.fail("Expected IOException for truncated Pax header");
        } catch (IOException expected) {
            Assert.assertTrue(expected.getMessage().contains("Failed to read Paxheader"));
        } finally {
            tais.close();
        }
    }

    @Test
    public void getNextTarEntry_givenPaxHeaderAndNormalEntry_shouldApplyHeadersToEntry() throws IOException {
        StringBuilder pax = new StringBuilder();
        pax.append("25 path=pax/newname.txt\n");
        pax.append("23 linkpath=pax/target\n");
        pax.append("13 gid=1001\n");
        pax.append("15 gname=paxgrp\n");
        pax.append("13 uid=2002\n");
        pax.append("15 uname=paxusr\n");
        pax.append("11 size=5\n");
        pax.append("19 mtime=100000.0\n");
        pax.append("22 SCHILY.devminor=12\n");
        pax.append("22 SCHILY.devmajor=34\n");

        byte[] paxBytes = pax.toString().getBytes(CharsetNames.UTF_8);
        byte[] paxHeader = createTarHeader("PaxHeader/orig.txt", paxBytes.length, TarConstants.LF_PAX_EXTENDED_HEADER_LC);

        byte[] realHeader = createTarHeader("orig.txt", 5, (byte) 0);
        byte[] realData = "12345".getBytes(CharsetNames.UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(paxHeader);
        baos.write(paxBytes);
        int padPax = TarConstants.DEFAULT_RCDSIZE - (paxBytes.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[padPax]);

        baos.write(realHeader);
        baos.write(realData);
        int padData = TarConstants.DEFAULT_RCDSIZE - (realData.length % TarConstants.DEFAULT_RCDSIZE);
        baos.write(new byte[padData]);

        baos.write(new byte[TarConstants.DEFAULT_RCDSIZE * 2]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        TarArchiveEntry entry = tais.getNextTarEntry();

        Assert.assertNotNull(entry);
        Assert.assertEquals("pax/newname.txt", entry.getName());
        Assert.assertEquals("pax/target", entry.getLinkName());
        Assert.assertEquals(1001, entry.getGroupId());
        Assert.assertEquals("paxgrp", entry.getGroupName());
        Assert.assertEquals(2002, entry.getUserId());
        Assert.assertEquals("paxusr", entry.getUserName());
        Assert.assertEquals(5, entry.getSize());
        Assert.assertEquals(100000000L, entry.getModTime().getTime());
        Assert.assertEquals(12, entry.getDevMinor());
        Assert.assertEquals(34, entry.getDevMajor());
        tais.close();
    }

    @Test
    public void consumeRemainderOfLastBlock_givenNonAlignedBlocks_shouldSkipPadding() throws IOException {
        byte[] content = "Data".getBytes(CharsetNames.UTF_8);
        byte[] header = createTarHeader("block.txt", content.length, (byte) 0);

        int blockSize = 1024;
        int recordSize = 512;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(header);
        baos.write(content);
        baos.write(new byte[recordSize - content.length]);
        baos.write(new byte[recordSize * 2]);
        baos.write(new byte[blockSize]);

        TarArchiveInputStream tais = new TarArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()), blockSize, recordSize);

        TarArchiveEntry entry = tais.getNextTarEntry();
        Assert.assertNotNull(entry);

        TarArchiveEntry eofEntry = tais.getNextTarEntry();
        Assert.assertNull(eofEntry);
        Assert.assertTrue(tais.isAtEOF());
        tais.close();
    }
}