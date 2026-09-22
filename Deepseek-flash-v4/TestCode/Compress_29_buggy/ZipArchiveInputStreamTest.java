package org.apache.commons.compress.archivers.zip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;

import static org.junit.Assert.*;

public class ZipArchiveInputStreamTest {

    private ZipArchiveInputStream zipArchiveInputStream;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
    }

    @After
    public void tearDown() throws IOException {
        if (zipArchiveInputStream != null) {
            zipArchiveInputStream.close();
        }
        outputStream.close();
    }

    @Test
    public void testConstructorWithNullInputStream() {
        assertThrows(NullPointerException.class, () -> new ZipArchiveInputStream((InputStream) null));
    }

    @Test
    public void testGetNextZipEntryFromEmptyStream() throws IOException {
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertNull(zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWithInvalidSignature() throws IOException {
        byte[] invalidZip = new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08};
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(invalidZip));
        assertThrows(ZipException.class, () -> zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWithSplitArchive() throws IOException {
        byte[] splitMarker = new byte[30];
        System.arraycopy(ZipArchiveOutputStream.LFH_SIG, 0, splitMarker, 0, 4);
        System.arraycopy(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes(), 0, splitMarker, 4, 4);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(splitMarker));
        assertThrows(UnsupportedZipFeatureException.class, () -> zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testGetNextZipEntryWithDataDescriptorSignature() throws IOException {
        byte[] dataDescriptor = new byte[30];
        System.arraycopy(ZipArchiveOutputStream.DD_SIG, 0, dataDescriptor, 0, 4);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(dataDescriptor));
        assertThrows(UnsupportedZipFeatureException.class, () -> zipArchiveInputStream.getNextZipEntry());
    }

    @Test
    public void testReadStoredEntryWithoutDataDescriptor() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        byte[] content = "Hello World".getBytes();
        byte[] src = new byte[localHeader.length + content.length];
        System.arraycopy(localHeader, 0, src, 0, localHeader.length);
        System.arraycopy(content, 0, src, localHeader.length, content.length);

        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(src));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipMethod.STORED.getCode(), entry.getMethod());

        byte[] buffer = new byte[11];
        int read = zipArchiveInputStream.read(buffer, 0, buffer.length);
        assertEquals(11, read);
        assertEquals("Hello World", new String(buffer));
        assertEquals(-1, zipArchiveInputStream.read(buffer, 0, buffer.length));
    }

    @Test
    public void testReadStoredEntryWithDataDescriptor() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), true);
        byte[] content = "Hello".getBytes();
        byte[] ddSig = {0x50, 0x4b, 0x07, 0x08};
        byte[] ddCrc = {0x01, 0x02, 0x03, 0x04};
        byte[] ddSize = {0x05, 0x00, 0x00, 0x00};
        byte[] ddCompressed = {0x05, 0x00, 0x00, 0x00};

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(localHeader, 0, localHeader.length);
        baos.write(content, 0, content.length);
        baos.write(ddSig, 0, 4);
        baos.write(ddCrc, 0, 4);
        baos.write(ddSize, 0, 4);
        baos.write(ddCompressed, 0, 4);

        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipMethod.STORED.getCode(), entry.getMethod());

        byte[] buffer = new byte[5];
        int read = zipArchiveInputStream.read(buffer, 0, 5);
        assertEquals(-1, read);
    }

    @Test
    public void testReadDeflatedEntry() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.DEFLATED.getCode(), false);
        byte[] deflatedData = createDeflatedData("Compressed data".getBytes());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(localHeader, 0, localHeader.length);
        baos.write(deflatedData, 0, deflatedData.length);

        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(baos.toByteArray()));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertNotNull(entry);
        assertEquals(ZipMethod.DEFLATED.getCode(), entry.getMethod());

        byte[] buffer = new byte[100];
        int read = zipArchiveInputStream.read(buffer, 0, 100);
        assertTrue(read > 0);
        assertEquals("Compressed data", new String(buffer, 0, read));
    }

    @Test
    public void testReadWithClosedStream() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(localHeader));
        zipArchiveInputStream.getNextZipEntry();
        zipArchiveInputStream.close();
        assertThrows(IOException.class, () -> zipArchiveInputStream.read(new byte[1], 0, 1));
    }

    @Test
    public void testReadWithNullOffset() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(localHeader));
        zipArchiveInputStream.getNextZipEntry();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> zipArchiveInputStream.read(new byte[10], 5, 10));
    }

    @Test
    public void testSkipWithNegativeValue() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(localHeader));
        zipArchiveInputStream.getNextZipEntry();
        assertEquals(0, zipArchiveInputStream.skip(-10));
    }

    @Test
    public void testSkipBeyondEntrySize() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        byte[] content = "Hello".getBytes();
        byte[] src = new byte[localHeader.length + content.length];
        System.arraycopy(localHeader, 0, src, 0, localHeader.length);
        System.arraycopy(content, 0, src, localHeader.length, content.length);

        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(src));
        ZipArchiveEntry entry = zipArchiveInputStream.getNextZipEntry();
        assertEquals(5, zipArchiveInputStream.skip(10));
        assertEquals(-1, zipArchiveInputStream.read(new byte[1], 0, 1));
    }

    @Test
    public void testAvailableWithStoredEntry() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        byte[] content = "Hello".getBytes();
        byte[] src = new byte[localHeader.length + content.length];
        System.arraycopy(localHeader, 0, src, 0, localHeader.length);
        System.arraycopy(content, 0, src, localHeader.length, content.length);

        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(src));
        zipArchiveInputStream.getNextZipEntry();
        assertEquals(5, zipArchiveInputStream.available());
    }

    @Test
    public void testCanReadEntryDataWithInvalidEntry() {
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(zipArchiveInputStream.canReadEntryData(new ZipArchiveEntry("test")));
    }

    @Test
    public void testCanReadEntryDataWithNullEntry() {
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(new byte[0]));
        assertFalse(zipArchiveInputStream.canReadEntryData(null));
    }

    @Test
    public void testGetNextEntryInterfaceMethod() throws IOException {
        byte[] localHeader = createLocalHeader(ZipMethod.STORED.getCode(), false);
        zipArchiveInputStream = new ZipArchiveInputStream(new ByteArrayInputStream(localHeader));
        assertNotNull(zipArchiveInputStream.getNextEntry());
    }

    @Test
    public void testMatchesWithNullSignature() {
        assertFalse(ZipArchiveInputStream.matches(null, 4));
    }

    @Test
    public void testMatchesWithShortLength() {
        assertFalse(ZipArchiveInputStream.matches(new byte[]{0x50, 0x4b, 0x03}, 3));
    }

    @Test
    public void testMatchesWithCorrectSignature() {
        byte[] sig = {0x50, 0x4b, 0x03, 0x04};
        assertTrue(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesWithIncorrectSignature() {
        byte[] sig = {0x50, 0x4b, 0x03, 0x05};
        assertFalse(ZipArchiveInputStream.matches(sig, 4));
    }

    @Test
    public void testMatchesWithNullElementInSignature() {
        assertFalse(ZipArchiveInputStream.matches(null, 4));
    }

    private byte[] createLocalHeader(int method, boolean hasDataDescriptor) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(ZipArchiveOutputStream.LFH_SIG, 0, 4);
        baos.write(new byte[]{0x00, 0x00}, 0, 2); // version made by
        baos.write(new byte[]{0x00, 0x00}, 0, 2); // version needed
        short flags = 0;
        if (hasDataDescriptor) {
            flags = 0x08;
        }
        baos.write((byte) (flags & 0xff), 0, 1);
        baos.write((byte) ((flags >> 8) & 0xff), 0, 1);
        baos.write((byte) (method & 0xff), 0, 1);
        baos.write((byte) ((method >> 8) & 0xff), 0, 1);
        baos.write(new byte[]{0x00, 0x00, 0x00, 0x00}, 0, 4); // time
        baos.write(new byte[]{0x00, 0x00, 0x00, 0x00}, 0, 4); // crc
        baos.write(new byte[]{0x00, 0x00, 0x00, 0x00}, 0, 4); // compressed size
        baos.write(new byte[]{0x00, 0x00, 0x00, 0x00}, 0, 4); // uncompressed size
        baos.write(new byte[]{0x00, 0x00}, 0, 2); // file name length
        baos.write(new byte[]{0x00, 0x00}, 0, 2); // extra length
        return baos.toByteArray();
    }

    private byte[] createDeflatedData(byte[] data) throws IOException {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater();
        deflater.setInput(data);
        deflater.finish();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int len = deflater.deflate(buffer);
            baos.write(buffer, 0, len);
        }
        return baos.toByteArray();
    }
}