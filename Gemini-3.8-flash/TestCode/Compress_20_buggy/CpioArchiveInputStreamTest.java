package org.apache.commons.compress.archivers.cpio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Assert;
import org.junit.Test;

public class CpioArchiveInputStreamTest {

    private static class CloseTrackerInputStream extends InputStream {
        private final InputStream delegate;
        private boolean closed = false;

        public CloseTrackerInputStream(InputStream delegate) {
            this.delegate = delegate;
        }

        public int read() throws IOException {
            return this.delegate.read();
        }

        public int read(byte[] b, int off, int len) throws IOException {
            return this.delegate.read(b, off, len);
        }

        public void close() throws IOException {
            this.closed = true;
            this.delegate.close();
        }

        public boolean isClosed() {
            return this.closed;
        }
    }

    private static String padHex(long val, int length) {
        String s = Long.toHexString(val);
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }

    private static String padOctal(long val, int length) {
        String s = Long.toOctalString(val);
        while (s.length() < length) {
            s = "0" + s;
        }
        return s;
    }

    private static void writeShort(ByteArrayOutputStream baos, int val, boolean swap) {
        byte b0 = (byte) ((val >> 8) & 0xFF);
        byte b1 = (byte) (val & 0xFF);
        if (swap) {
            baos.write(b0);
            baos.write(b1);
        } else {
            baos.write(b1);
            baos.write(b0);
        }
    }

    private static void writeInt(ByteArrayOutputStream baos, long val, boolean swap) {
        int b0 = (int) ((val >> 24) & 0xFF);
        int b1 = (int) ((val >> 16) & 0xFF);
        int b2 = (int) ((val >> 8) & 0xFF);
        int b3 = (int) (val & 0xFF);
        if (swap) {
            baos.write(b1);
            baos.write(b0);
            baos.write(b3);
            baos.write(b2);
        } else {
            baos.write(b2);
            baos.write(b3);
            baos.write(b0);
            baos.write(b1);
        }
    }

    private byte[] createNewFormatEntry(String magic, String name, long mode, byte[] content, long checksum) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(magic.getBytes("US-ASCII")); // 6 bytes
        baos.write(padHex(1, 8).getBytes("US-ASCII")); // inode
        baos.write(padHex(mode, 8).getBytes("US-ASCII")); // mode
        baos.write(padHex(1000, 8).getBytes("US-ASCII")); // uid
        baos.write(padHex(1000, 8).getBytes("US-ASCII")); // gid
        baos.write(padHex(1, 8).getBytes("US-ASCII")); // nlink
        baos.write(padHex(0, 8).getBytes("US-ASCII")); // mtime
        baos.write(padHex(content.length, 8).getBytes("US-ASCII")); // filesize
        baos.write(padHex(0, 8).getBytes("US-ASCII")); // devmajor
        baos.write(padHex(0, 8).getBytes("US-ASCII")); // devminor
        baos.write(padHex(0, 8).getBytes("US-ASCII")); // rdevmajor
        baos.write(padHex(0, 8).getBytes("US-ASCII")); // rdevminor
        byte[] nameBytes = name.getBytes("US-ASCII");
        baos.write(padHex(nameBytes.length + 1, 8).getBytes("US-ASCII")); // namesize
        baos.write(padHex(checksum, 8).getBytes("US-ASCII")); // chksum
        baos.write(nameBytes);
        baos.write(0); // null terminator

        int headerAndNameLen = 110 + nameBytes.length + 1;
        int headerPad = (4 - (headerAndNameLen % 4)) % 4;
        for (int i = 0; i < headerPad; i++) {
            baos.write(0);
        }

        baos.write(content);
        int dataPad = (4 - (content.length % 4)) % 4;
        for (int i = 0; i < dataPad; i++) {
            baos.write(0);
        }
        return baos.toByteArray();
    }

    private byte[] createOldAsciiEntry(String name, long mode, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write("070707".getBytes("US-ASCII")); // magic 6 bytes
        baos.write(padOctal(0, 6).getBytes("US-ASCII")); // dev
        baos.write(padOctal(1, 6).getBytes("US-ASCII")); // ino
        baos.write(padOctal(mode, 6).getBytes("US-ASCII")); // mode
        baos.write(padOctal(1000, 6).getBytes("US-ASCII")); // uid
        baos.write(padOctal(1000, 6).getBytes("US-ASCII")); // gid
        baos.write(padOctal(1, 6).getBytes("US-ASCII")); // nlink
        baos.write(padOctal(0, 6).getBytes("US-ASCII")); // rdev
        baos.write(padOctal(0, 11).getBytes("US-ASCII")); // mtime
        byte[] nameBytes = name.getBytes("US-ASCII");
        baos.write(padOctal(nameBytes.length + 1, 6).getBytes("US-ASCII")); // namesize
        baos.write(padOctal(content.length, 11).getBytes("US-ASCII")); // filesize
        baos.write(nameBytes);
        baos.write(0); // null terminator
        baos.write(content);
        return baos.toByteArray();
    }

    private byte[] createOldBinaryEntry(String name, long mode, byte[] content, boolean swapHalfWord) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int magic = CpioConstants.MAGIC_OLD_BINARY;
        writeShort(baos, magic, swapHalfWord);
        writeShort(baos, 0, swapHalfWord); // dev
        writeShort(baos, 1, swapHalfWord); // ino
        writeShort(baos, (int) mode, swapHalfWord); // mode
        writeShort(baos, 1000, swapHalfWord); // uid
        writeShort(baos, 1000, swapHalfWord); // gid
        writeShort(baos, 1, swapHalfWord); // nlink
        writeShort(baos, 0, swapHalfWord); // rdev
        writeInt(baos, 0, swapHalfWord); // mtime
        byte[] nameBytes = name.getBytes("US-ASCII");
        writeShort(baos, nameBytes.length + 1, swapHalfWord); // namesize
        writeInt(baos, content.length, swapHalfWord); // filesize
        baos.write(nameBytes);
        baos.write(0); // null terminator
        int headerAndNameLen = 26 + nameBytes.length + 1;
        if ((headerAndNameLen % 2) != 0) {
            baos.write(0);
        }
        baos.write(content);
        if ((content.length % 2) != 0) {
            baos.write(0);
        }
        return baos.toByteArray();
    }

    @Test
    public void matches_givenShortLength_shouldReturnFalse() {
        byte[] sig = new byte[] {0x71, (byte) 0xc7, 0, 0, 0};
        Assert.assertFalse(CpioArchiveInputStream.matches(sig, 5));
    }

    @Test
    public void matches_givenOldBinarySignatures_shouldReturnTrue() {
        byte[] sig1 = new byte[] {0x71, (byte) 0xc7, 0, 0, 0, 0};
        Assert.assertTrue(CpioArchiveInputStream.matches(sig1, 6));

        byte[] sig2 = new byte[] {(byte) 0xc7, 0x71, 0, 0, 0, 0};
        Assert.assertTrue(CpioArchiveInputStream.matches(sig2, 6));
    }

    @Test
    public void matches_givenAsciiSignatures_shouldReturnExpected() {
        byte[] newSig = new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x31};
        Assert.assertTrue(CpioArchiveInputStream.matches(newSig, 6));

        byte[] crcSig = new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x32};
        Assert.assertTrue(CpioArchiveInputStream.matches(crcSig, 6));

        byte[] oldAsciiSig = new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x37};
        Assert.assertTrue(CpioArchiveInputStream.matches(oldAsciiSig, 6));

        byte[] badLastByte = new byte[] {0x30, 0x37, 0x30, 0x37, 0x30, 0x33};
        Assert.assertFalse(CpioArchiveInputStream.matches(badLastByte, 6));

        byte[] badByte0 = new byte[] {0x31, 0x37, 0x30, 0x37, 0x30, 0x31};
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte0, 6));

        byte[] badByte1 = new byte[] {0x30, 0x38, 0x30, 0x37, 0x30, 0x31};
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte1, 6));

        byte[] badByte2 = new byte[] {0x30, 0x37, 0x31, 0x37, 0x30, 0x31};
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte2, 6));

        byte[] badByte3 = new byte[] {0x30, 0x37, 0x30, 0x38, 0x30, 0x31};
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte3, 6));

        byte[] badByte4 = new byte[] {0x30, 0x37, 0x30, 0x37, 0x31, 0x31};
        Assert.assertFalse(CpioArchiveInputStream.matches(badByte4, 6));
    }

    @Test
    public void read_givenNewEntry_shouldReadContentAndTrailer() throws IOException {
        byte[] fileData = "Hello CPIO New Format!".getBytes("UTF-8");
        byte[] entryBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW, "test.txt", 0100644, fileData, 0);
        byte[] trailerBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW, CpioConstants.CPIO_TRAILER, 0, new byte[0], 0);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        Assert.assertEquals(1, cpioIn.available());

        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(fileData.length, entry.getSize());
        Assert.assertEquals(0100644, entry.getMode());

        byte[] readBuf = new byte[fileData.length];
        int readBytes = cpioIn.read(readBuf, 0, readBuf.length);
        Assert.assertEquals(fileData.length, readBytes);
        Assert.assertArrayEquals(fileData, readBuf);

        Assert.assertEquals(-1, cpioIn.read(readBuf, 0, 1));
        Assert.assertEquals(0, cpioIn.available());

        CpioArchiveEntry next = cpioIn.getNextEntry();
        Assert.assertNull(next);
        Assert.assertEquals(0, cpioIn.available());

        cpioIn.close();
    }

    @Test
    public void read_givenNewCrcFormat_shouldVerifyChecksumSuccess() throws IOException {
        byte[] fileData = "Checksum Test Content".getBytes("UTF-8");
        long crc = 0;
        for (int i = 0; i < fileData.length; i++) {
            crc += fileData[i] & 0xFF;
        }

        byte[] entryBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW_CRC, "crc.txt", 0100644, fileData, crc);
        byte[] trailerBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW_CRC, CpioConstants.CPIO_TRAILER, 0, new byte[0], 0);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals(CpioConstants.FORMAT_NEW_CRC, entry.getFormat());

        byte[] buf = new byte[1024];
        int readCount = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(fileData.length, readCount);

        int eof = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(-1, eof);

        cpioIn.close();
    }

    @Test(expected = IOException.class)
    public void read_givenNewCrcFormatWithCorruptedChecksum_shouldThrowIOException() throws IOException {
        byte[] fileData = "Checksum Test Content".getBytes("UTF-8");
        long wrongCrc = 123456L;

        byte[] entryBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW_CRC, "badcrc.txt", 0100644, fileData, wrongCrc);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(entryBytes));
        cpioIn.getNextCPIOEntry();

        byte[] buf = new byte[1024];
        cpioIn.read(buf, 0, buf.length);
        cpioIn.read(buf, 0, buf.length); // triggers checksum check on EOF
    }

    @Test
    public void read_givenOldAsciiEntry_shouldReadCorrectly() throws IOException {
        byte[] fileData = "Old ASCII Content".getBytes("UTF-8");
        byte[] entryBytes = createOldAsciiEntry("oldascii.txt", 0100644, fileData);
        byte[] trailerBytes = createOldAsciiEntry(CpioConstants.CPIO_TRAILER, 0, new byte[0]);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("oldascii.txt", entry.getName());
        Assert.assertEquals(fileData.length, entry.getSize());
        Assert.assertEquals(CpioConstants.FORMAT_OLD_ASCII, entry.getFormat());

        byte[] buf = new byte[fileData.length];
        int readBytes = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(fileData.length, readBytes);
        Assert.assertArrayEquals(fileData, buf);

        Assert.assertNull(cpioIn.getNextCPIOEntry());
        cpioIn.close();
    }

    @Test
    public void read_givenOldBinaryEntryUnswapped_shouldReadCorrectly() throws IOException {
        byte[] fileData = "Old Binary Content Unswapped".getBytes("UTF-8");
        byte[] entryBytes = createOldBinaryEntry("binary1.txt", 0100644, fileData, false);
        byte[] trailerBytes = createOldBinaryEntry(CpioConstants.CPIO_TRAILER, 0, new byte[0], false);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("binary1.txt", entry.getName());
        Assert.assertEquals(fileData.length, entry.getSize());
        Assert.assertEquals(CpioConstants.FORMAT_OLD_BINARY, entry.getFormat());

        byte[] buf = new byte[fileData.length];
        int readBytes = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(fileData.length, readBytes);
        Assert.assertArrayEquals(fileData, buf);

        Assert.assertNull(cpioIn.getNextCPIOEntry());
        cpioIn.close();
    }

    @Test
    public void read_givenOldBinaryEntrySwapped_shouldReadCorrectly() throws IOException {
        byte[] fileData = "Old Binary Content Swapped".getBytes("UTF-8");
        byte[] entryBytes = createOldBinaryEntry("binary2.txt", 0100644, fileData, true);
        byte[] trailerBytes = createOldBinaryEntry(CpioConstants.CPIO_TRAILER, 0, new byte[0], true);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNotNull(entry);
        Assert.assertEquals("binary2.txt", entry.getName());
        Assert.assertEquals(fileData.length, entry.getSize());

        byte[] buf = new byte[fileData.length];
        int readBytes = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(fileData.length, readBytes);
        Assert.assertArrayEquals(fileData, buf);

        Assert.assertNull(cpioIn.getNextCPIOEntry());
        cpioIn.close();
    }

    @Test
    public void getNextCPIOEntry_givenConsecutiveEntriesWithoutReadingFully_shouldAutoClosePreviousEntry() throws IOException {
        byte[] data1 = "First file data".getBytes("UTF-8");
        byte[] data2 = "Second file data".getBytes("UTF-8");
        byte[] entry1 = createNewFormatEntry(CpioConstants.MAGIC_NEW, "file1.txt", 0100644, data1, 0);
        byte[] entry2 = createNewFormatEntry(CpioConstants.MAGIC_NEW, "file2.txt", 0100644, data2, 0);
        byte[] trailer = createNewFormatEntry(CpioConstants.MAGIC_NEW, CpioConstants.CPIO_TRAILER, 0, new byte[0], 0);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entry1);
        total.write(entry2);
        total.write(trailer);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        CpioArchiveEntry first = cpioIn.getNextCPIOEntry();
        Assert.assertEquals("file1.txt", first.getName());

        CpioArchiveEntry second = cpioIn.getNextCPIOEntry();
        Assert.assertEquals("file2.txt", second.getName());

        byte[] buf = new byte[data2.length];
        int count = cpioIn.read(buf, 0, buf.length);
        Assert.assertEquals(data2.length, count);
        Assert.assertArrayEquals(data2, buf);

        Assert.assertNull(cpioIn.getNextCPIOEntry());
        cpioIn.close();
    }

    @Test
    public void skipRemainderOfLastBlock_givenCustomBlockSize_shouldPadCorrectly() throws IOException {
        byte[] trailer = createNewFormatEntry(CpioConstants.MAGIC_NEW, CpioConstants.CPIO_TRAILER, 0, new byte[0], 0);
        int blockSize = 512;
        int paddingRequired = blockSize - (trailer.length % blockSize);
        if (paddingRequired == blockSize) {
            paddingRequired = 0;
        }

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(trailer);
        for (int i = 0; i < paddingRequired; i++) {
            total.write(0);
        }

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()), blockSize);
        CpioArchiveEntry entry = cpioIn.getNextCPIOEntry();
        Assert.assertNull(entry);
        Assert.assertEquals(0, cpioIn.available());
        cpioIn.close();
    }

    @Test
    public void skip_givenPositiveLength_shouldSkipExpectedBytes() throws IOException {
        byte[] fileData = "0123456789ABCDEF".getBytes("UTF-8");
        byte[] entryBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW, "skip.txt", 0100644, fileData, 0);
        byte[] trailerBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW, CpioConstants.CPIO_TRAILER, 0, new byte[0], 0);

        ByteArrayOutputStream total = new ByteArrayOutputStream();
        total.write(entryBytes);
        total.write(trailerBytes);

        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(total.toByteArray()));
        cpioIn.getNextCPIOEntry();

        long skipped = cpioIn.skip(5);
        Assert.assertEquals(5, skipped);

        byte[] remaining = new byte[11];
        int read = cpioIn.read(remaining, 0, remaining.length);
        Assert.assertEquals(11, read);
        Assert.assertEquals("56789ABCDEF", new String(remaining, "UTF-8"));

        long skipPastEnd = cpioIn.skip(10);
        Assert.assertEquals(0, skipPastEnd);

        cpioIn.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void skip_givenNegativeLength_shouldThrowIllegalArgumentException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            cpioIn.skip(-1);
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_givenNegativeOffset_shouldThrowIndexOutOfBoundsException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            cpioIn.read(new byte[10], -1, 5);
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_givenNegativeLength_shouldThrowIndexOutOfBoundsException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            cpioIn.read(new byte[10], 0, -1);
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void read_givenOffsetPlusLengthGreaterThanBuffer_shouldThrowIndexOutOfBoundsException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            cpioIn.read(new byte[10], 5, 6);
        } finally {
            cpioIn.close();
        }
    }

    @Test
    public void read_givenZeroLength_shouldReturnZero() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        int count = cpioIn.read(new byte[10], 0, 0);
        Assert.assertEquals(0, count);
        cpioIn.close();
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        int count = cpioIn.read(new byte[10], 0, 5);
        Assert.assertEquals(-1, count);
        cpioIn.close();
    }

    @Test(expected = IOException.class)
    public void read_whenStreamClosed_shouldThrowIOException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        cpioIn.close();
        cpioIn.read(new byte[10], 0, 5);
    }

    @Test(expected = IOException.class)
    public void available_whenStreamClosed_shouldThrowIOException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        cpioIn.close();
        cpioIn.available();
    }

    @Test(expected = IOException.class)
    public void skip_whenStreamClosed_shouldThrowIOException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        cpioIn.close();
        cpioIn.skip(10);
    }

    @Test(expected = IOException.class)
    public void getNextEntry_whenStreamClosed_shouldThrowIOException() throws IOException {
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        cpioIn.close();
        cpioIn.getNextEntry();
    }

    @Test
    public void close_shouldCloseUnderlyingStreamAndBeIdempotent() throws IOException {
        CloseTrackerInputStream ct = new CloseTrackerInputStream(new ByteArrayInputStream(new byte[0]));
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(ct);
        Assert.assertFalse(ct.isClosed());

        cpioIn.close();
        Assert.assertTrue(ct.isClosed());

        cpioIn.close(); // second close should do nothing
        Assert.assertTrue(ct.isClosed());
    }

    @Test(expected = IOException.class)
    public void getNextCPIOEntry_givenInvalidMagic_shouldThrowIOException() throws IOException {
        byte[] badMagic = "999999invalid".getBytes("US-ASCII");
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(badMagic));
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = EOFException.class)
    public void getNextCPIOEntry_givenPrematureEofInMagic_shouldThrowEOFException() throws IOException {
        byte[] incomplete = new byte[] {0x30};
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(incomplete));
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void getNextCPIOEntry_givenNewFormatModeZeroNonTrailer_shouldThrowIOException() throws IOException {
        byte[] entryBytes = createNewFormatEntry(CpioConstants.MAGIC_NEW, "nontrailer.txt", 0, new byte[0], 0);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(entryBytes));
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void getNextCPIOEntry_givenOldAsciiModeZeroNonTrailer_shouldThrowIOException() throws IOException {
        byte[] entryBytes = createOldAsciiEntry("nontrailer.txt", 0, new byte[0]);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(entryBytes));
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void getNextCPIOEntry_givenOldBinaryModeZeroNonTrailer_shouldThrowIOException() throws IOException {
        byte[] entryBytes = createOldBinaryEntry("nontrailer.txt", 0, new byte[0], false);
        CpioArchiveInputStream cpioIn = new CpioArchiveInputStream(new ByteArrayInputStream(entryBytes));
        try {
            cpioIn.getNextCPIOEntry();
        } finally {
            cpioIn.close();
        }
    }
}