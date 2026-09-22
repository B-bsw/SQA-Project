package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ZipArchiveInputStreamTest {

    private static byte[] createZipArchive(String entryName, byte[] content, int method) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);
        ZipArchiveEntry entry = new ZipArchiveEntry(entryName);
        entry.setMethod(method);
        entry.setSize(content.length);
        if (method == ZipArchiveOutputStream.STORED) {
            CRC32 crc = new CRC32();
            crc.update(content);
            entry.setCrc(crc.getValue());
            entry.setCompressedSize(content.length);
        }
        zaos.putArchiveEntry(entry);
        zaos.write(content);
        zaos.closeArchiveEntry();
        zaos.close();
        return baos.toByteArray();
    }

    private static byte[] createZipWithCentralDirectoryOnly() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.CFH_SIG, 0, 4);
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG, 0, 4);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }
        return baos.toByteArray();
    }

    private static byte[] createZipWithDataDescriptor(String name, byte[] content) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG, 0, 4);
        baos.write(new byte[]{20, 0});
        baos.write(new byte[]{8, 8});
        baos.write(new byte[]{8, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        baos.write(new byte[]{0, 0, 0, 0});
        byte[] nameBytes = name.getBytes("UTF-8");
        baos.write((byte) (nameBytes.length & 0xFF));
        baos.write((byte) ((nameBytes.length >> 8) & 0xFF));
        baos.write(new byte[]{0, 0});
        baos.write(nameBytes);

        ByteArrayOutputStream deflatedStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, true);
        byte[] defBuf = new byte[128];
        deflater.setInput(content);
        deflater.finish();
        while (!deflater.finished()) {
            int count = deflater.deflate(defBuf, 0, defBuf.length);
            if (count > 0) {
                deflatedStream.write(defBuf, 0, count);
            }
        }
        deflater.end();
        byte[] deflatedBytes = deflatedStream.toByteArray();
        baos.write(deflatedBytes);

        CRC32 crc = new CRC32();
        crc.update(content);
        long crcVal = crc.getValue();

        baos.write(ZipArchiveOutputStream.DD_SIG, 0, 4);
        baos.write(new byte[]{
            (byte) (crcVal & 0xFF),
            (byte) ((crcVal >> 8) & 0xFF),
            (byte) ((crcVal >> 16) & 0xFF),
            (byte) ((crcVal >> 24) & 0xFF)
        });
        int cSize = deflatedBytes.length;
        baos.write(new byte[]{
            (byte) (cSize & 0xFF),
            (byte) ((cSize >> 8) & 0xFF),
            (byte) ((cSize >> 16) & 0xFF),
            (byte) ((cSize >> 24) & 0xFF)
        });
        int size = content.length;
        baos.write(new byte[]{
            (byte) (size & 0xFF),
            (byte) ((size >> 8) & 0xFF),
            (byte) ((size >> 16) & 0xFF),
            (byte) ((size >> 24) & 0xFF)
        });

        baos.write(ZipArchiveOutputStream.CFH_SIG, 0, 4);
        for (int i = 0; i < 42; i++) {
            baos.write(0);
        }
        baos.write(ZipArchiveOutputStream.EOCD_SIG, 0, 4);
        for (int i = 0; i < 18; i++) {
            baos.write(0);
        }
        return baos.toByteArray();
    }

    @Test
    public void constructor_givenInputStream_shouldInitializeSuccessfully() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in);
        try {
            Assert.assertNull(zipIn.getNextZipEntry());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void constructor_givenEncoding_shouldInitializeSuccessfully() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in, "UTF-8");
        try {
            Assert.assertNull(zipIn.getNextEntry());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void constructor_givenEncodingAndUnicodeExtraFields_shouldInitializeSuccessfully() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in, "UTF-8", true);
        try {
            Assert.assertNull(zipIn.getNextZipEntry());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void matches_givenValidSignatures_shouldReturnTrue() {
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.LFH_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.EOCD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.DD_SIG, 4));
        Assert.assertTrue(ZipArchiveInputStream.matches(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes(), 4));
    }

    @Test
    public void matches_givenInvalidSignaturesOrShortLength_shouldReturnFalse() {
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[]{0, 0, 0, 0}, 4));
        Assert.assertFalse(ZipArchiveInputStream.matches(ZipArchiveOutputStream.LFH_SIG, 3));
        Assert.assertFalse(ZipArchiveInputStream.matches(new byte[0], 0));
        byte[] corrupted = new byte[]{ZipArchiveOutputStream.LFH_SIG[0], 0, 0, 0};
        Assert.assertFalse(ZipArchiveInputStream.matches(corrupted, 4));
    }

    @Test
    public void getNextZipEntry_givenEmptyStream_shouldReturnNull() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in);
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNull(entry);
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void getNextZipEntry_givenClosedStream_shouldReturnNull() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in);
        zipIn.close();
        Assert.assertNull(zipIn.getNextZipEntry());
    }

    @Test(expected = UnsupportedZipFeatureException.class)
    public void getNextZipEntry_givenSplitArchiveSignature_shouldThrowUnsupportedZipFeatureException() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.DD_SIG.getBytes());
        for (int i = 0; i < 30; i++) {
            baos.write(0);
        }
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            zipIn.getNextZipEntry();
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void getNextZipEntry_givenSingleSegmentSplitMarker_shouldHandleAndReturnEntry() throws IOException {
        byte[] content = "Hello Marker".getBytes("UTF-8");
        byte[] validZip = createZipArchive("marker.txt", content, ZipArchiveOutputStream.DEFLATED);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
        baos.write(validZip);

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("marker.txt", entry.getName());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void getNextZipEntry_givenCentralDirectorySignatureFirst_shouldHitCentralDirectoryAndReturnNull() throws IOException {
        byte[] cdZip = createZipWithCentralDirectoryOnly();
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(cdZip));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNull(entry);
            Assert.assertNull(zipIn.getNextZipEntry());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void getNextZipEntry_givenNonLFHSignature_shouldReturnNull() throws IOException {
        byte[] invalidSig = new byte[30];
        invalidSig[0] = 0x12;
        invalidSig[1] = 0x34;
        invalidSig[2] = 0x56;
        invalidSig[3] = 0x78;
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(invalidSig));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNull(entry);
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void read_givenDeflatedEntry_shouldReadContentCorrectly() throws IOException {
        byte[] content = "Testing Deflated Content Stream in ZIP".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("deflated.txt", content, ZipArchiveOutputStream.DEFLATED);

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("deflated.txt", entry.getName());

            ByteArrayOutputStream readOut = new ByteArrayOutputStream();
            byte[] buf = new byte[8];
            int readBytes;
            while ((readBytes = zipIn.read(buf, 0, buf.length)) != -1) {
                readOut.write(buf, 0, readBytes);
            }
            Assert.assertArrayEquals(content, readOut.toByteArray());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void read_givenStoredEntry_shouldReadContentCorrectly() throws IOException {
        byte[] content = "Testing Stored Content Stream in ZIP".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("stored.txt", content, ZipArchiveOutputStream.STORED);

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("stored.txt", entry.getName());

            ByteArrayOutputStream readOut = new ByteArrayOutputStream();
            byte[] buf = new byte[8];
            int readBytes;
            while ((readBytes = zipIn.read(buf, 0, buf.length)) != -1) {
                readOut.write(buf, 0, readBytes);
            }
            Assert.assertArrayEquals(content, readOut.toByteArray());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void read_givenNoCurrentEntry_shouldReturnMinusOne() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in);
        try {
            byte[] buf = new byte[10];
            int result = zipIn.read(buf, 0, buf.length);
            Assert.assertEquals(-1, result);
        } finally {
            zipIn.close();
        }
    }

    @Test(expected = IOException.class)
    public void read_givenClosedStream_shouldThrowIOException() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("test.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        zipIn.getNextZipEntry();
        zipIn.close();
        byte[] buf = new byte[10];
        zipIn.read(buf, 0, buf.length);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenNegativeOffset_shouldThrowException() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("test.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            byte[] buf = new byte[10];
            zipIn.read(buf, -1, 5);
        } finally {
            zipIn.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenNegativeLength_shouldThrowException() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("test.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            byte[] buf = new byte[10];
            zipIn.read(buf, 0, -1);
        } finally {
            zipIn.close();
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void read_givenOffsetPlusLengthOutOfBounds_shouldThrowException() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("test.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            byte[] buf = new byte[10];
            zipIn.read(buf, 5, 6);
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void read_givenDataDescriptorWithDeflatedEntry_shouldReadSuccessfully() throws IOException {
        byte[] content = "Data descriptor test with deflated stream".getBytes("UTF-8");
        byte[] zipBytes = createZipWithDataDescriptor("dd_entry.txt", content);

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            ZipArchiveEntry entry = zipIn.getNextZipEntry();
            Assert.assertNotNull(entry);
            Assert.assertEquals("dd_entry.txt", entry.getName());

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[16];
            int readBytes;
            while ((readBytes = zipIn.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, readBytes);
            }
            Assert.assertArrayEquals(content, out.toByteArray());
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void skip_givenPositiveBytes_shouldSkipExpectedAmount() throws IOException {
        byte[] content = "0123456789ABCDEF".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("skip.txt", content, ZipArchiveOutputStream.STORED);

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            long skipped = zipIn.skip(5);
            Assert.assertEquals(5, skipped);

            byte[] remaining = new byte[5];
            int read = zipIn.read(remaining, 0, 5);
            Assert.assertEquals(5, read);
            Assert.assertEquals("56789", new String(remaining, "UTF-8"));
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void skip_givenZero_shouldReturnZero() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("zero.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            long skipped = zipIn.skip(0);
            Assert.assertEquals(0, skipped);
        } finally {
            zipIn.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void skip_givenNegativeValue_shouldThrowIllegalArgumentException() throws IOException {
        byte[] content = "test".getBytes("UTF-8");
        byte[] zipBytes = createZipArchive("negative.txt", content, ZipArchiveOutputStream.STORED);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(zipBytes));
        try {
            zipIn.getNextZipEntry();
            zipIn.skip(-1);
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void canReadEntryData_givenVariousEntries_shouldReturnExpectedBoolean() throws IOException {
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        try {
            ArchiveEntry dummyEntry = new ArchiveEntry() {
                public String getName() { return "dummy"; }
                public long getSize() { return 0; }
                public boolean isDirectory() { return false; }
                public java.util.Date getLastModifiedDate() { return null; }
            };
            Assert.assertFalse(zipIn.canReadEntryData(dummyEntry));

            ZipArchiveEntry deflatedEntry = new ZipArchiveEntry("test.txt");
            deflatedEntry.setMethod(ZipEntry.DEFLATED);
            Assert.assertTrue(zipIn.canReadEntryData(deflatedEntry));

            ZipArchiveEntry storedEntry = new ZipArchiveEntry("stored.txt");
            storedEntry.setMethod(ZipEntry.STORED);
            Assert.assertTrue(zipIn.canReadEntryData(storedEntry));

            ZipArchiveEntry ddStoredEntry = new ZipArchiveEntry("stored_dd.txt");
            ddStoredEntry.setMethod(ZipEntry.STORED);
            GeneralPurposeBit bit = new GeneralPurposeBit();
            bit.useDataDescriptor(true);
            ddStoredEntry.setGeneralPurposeBit(bit);

            Assert.assertFalse(zipIn.canReadEntryData(ddStoredEntry));

            ZipArchiveInputStream zipInAllowDD = new ZipArchiveInputStream(
                new ByteArrayInputStream(new byte[0]), "UTF-8", true, true);
            Assert.assertTrue(zipInAllowDD.canReadEntryData(ddStoredEntry));
            zipInAllowDD.close();
        } finally {
            zipIn.close();
        }
    }

    @Test
    public void close_multipleCalls_shouldNotThrowException() throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(in);
        zipIn.close();
        zipIn.close();
    }

    @Test
    public void closeEntry_givenUnreadEntry_shouldDrainAndAdvanceToNextEntry() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ZipArchiveOutputStream zaos = new ZipArchiveOutputStream(baos);

        ZipArchiveEntry entry1 = new ZipArchiveEntry("entry1.txt");
        byte[] c1 = "First Entry Content Long Enough".getBytes("UTF-8");
        zaos.putArchiveEntry(entry1);
        zaos.write(c1);
        zaos.closeArchiveEntry();

        ZipArchiveEntry entry2 = new ZipArchiveEntry("entry2.txt");
        byte[] c2 = "Second Entry Content".getBytes("UTF-8");
        zaos.putArchiveEntry(entry2);
        zaos.write(c2);
        zaos.closeArchiveEntry();

        zaos.close();

        ZipArchiveInputStream zipIn = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        try {
            ZipArchiveEntry readEntry1 = zipIn.getNextZipEntry();
            Assert.assertNotNull(readEntry1);
            Assert.assertEquals("entry1.txt", readEntry1.getName());

            ZipArchiveEntry readEntry2 = zipIn.getNextZipEntry();
            Assert.assertNotNull(readEntry2);
            Assert.assertEquals("entry2.txt", readEntry2.getName());

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[16];
            int r;
            while ((r = zipIn.read(buf, 0, buf.length)) != -1) {
                out.write(buf, 0, r);
            }
            Assert.assertArrayEquals(c2, out.toByteArray());
            Assert.assertNull(zipIn.getNextZipEntry());
        } finally {
            zipIn.close();
        }
    }
}