package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import java.util.zip.ZipException;

public class Zip64ExtendedInformationExtraFieldTest {
    private Zip64ExtendedInformationExtraField field;
    private static final byte[] LOCAL_DATA = new byte[16];
    private static final byte[] CENTRAL_DATA_24 = new byte[24];
    private static final byte[] CENTRAL_DATA_28 = new byte[28];
    private static final byte[] CENTRAL_DATA_32 = new byte[32];
    private static final byte[] CENTRAL_DATA_LENGTH_MISMATCH = new byte[20];

    public Zip64ExtendedInformationExtraFieldTest() {
    }

    @Before
    public void setUp() {
        field = new Zip64ExtendedInformationExtraField();
        java.util.Arrays.fill(LOCAL_DATA, (byte) 0);
        byte[] sizeBytes = new byte[8];
        java.util.Arrays.fill(sizeBytes, (byte) 1);
        System.arraycopy(sizeBytes, 0, LOCAL_DATA, 0, 8);
        System.arraycopy(sizeBytes, 0, LOCAL_DATA, 8, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_24, 0, 24);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 0, 24);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_32, 0, 32);
        java.util.Arrays.fill(CENTRAL_DATA_28, (byte) 0);
        java.util.Arrays.fill(CENTRAL_DATA_32, (byte) 0);
        java.util.Arrays.fill(CENTRAL_DATA_LENGTH_MISMATCH, (byte) 0);
    }

    @After
    public void tearDown() {
        field = null;
    }

    @Test
    public void testDefaultConstructor() {
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField();
        assertNull(f.getSize());
        assertNull(f.getCompressedSize());
        assertNull(f.getRelativeHeaderOffset());
        assertNull(f.getDiskStartNumber());
    }

    @Test
    public void testGetHeaderId() {
        assertEquals(ZipShort.getValue(new ZipShort(0x0001)), ZipShort.getValue(field.getHeaderId()));
    }

    @Test
    public void testLocalFileDataLengthNoSizes() {
        assertEquals(0, ZipShort.getValue(new ZipShort(0)));
        Zip64ExtendedInformationExtraField f = new Zip64ExtendedInformationExtraField(null, null, null, null);
        assertEquals(0, ZipShort.getValue(f.getLocalFileDataLength()));
    }

    @Test
    public void testLocalFileDataLengthWithSizes() {
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0});
        field.setSize(size);
        int expected = 16;
        assertEquals(expected, ZipShort.getValue(field.getLocalFileDataLength()));
    }

    @Test
    public void testCentralDirectoryLengthAllNull() {
        assertEquals(0, ZipShort.getValue(field.getCentralDirectoryLength()));
    }

    @Test
    public void testCentralDirectoryLengthSizeOnly() {
        field.setSize(new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0}));
        int expected = 8;
        assertEquals(expected, ZipShort.getValue(field.getCentralDirectoryLength()));
    }

    @Test
    public void testCentralDirectoryLengthAllFields() {
        field.setSize(new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0}));
        field.setCompressedSize(new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0}));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0}));
        field.setDiskStartNumber(new ZipLong(1));
        int expected = 8 + 8 + 8 + 4;
        assertEquals(expected, ZipShort.getValue(field.getCentralDirectoryLength()));
    }

    @Test
    public void testGetLocalFileDataDataNoSizes() {
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test
    public void testGetLocalFileDataDataOneSizeSet() {
        field.setSize(new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0}));
        try {
            field.getLocalFileDataData();
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testGetLocalFileDataDataBothSizes() {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        field.setCompressedSize(new ZipEightByteInteger(sizeBytes));
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(16, data.length);
        assertArrayEquals(sizeBytes, java.util.Arrays.copyOfRange(data, 0, 8));
        assertArrayEquals(sizeBytes, java.util.Arrays.copyOfRange(data, 8, 16));
    }

    @Test
    public void testGetCentralDirectoryDataNoValues() {
        byte[] data = field.getCentralDirectoryData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test
    public void testGetCentralDirectoryDataWithSizeOnly() {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        byte[] data = field.getCentralDirectoryData();
        assertArrayEquals(sizeBytes, data);
    }

    @Test
    public void testGetCentralDirectoryDataWithAllFields() {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        field.setSize(new ZipEightByteInteger(sizeBytes));
        field.setCompressedSize(new ZipEightByteInteger(sizeBytes));
        field.setRelativeHeaderOffset(new ZipEightByteInteger(sizeBytes));
        field.setDiskStartNumber(new ZipLong(256));
        byte[] data = field.getCentralDirectoryData();
        assertEquals(28, data.length);
        assertArrayEquals(sizeBytes, java.util.Arrays.copyOfRange(data, 0, 8));
        assertArrayEquals(sizeBytes, java.util.Arrays.copyOfRange(data, 8, 16));
        assertArrayEquals(sizeBytes, java.util.Arrays.copyOfRange(data, 16, 24));
        assertEquals(256, ZipLong.getValue(new ZipLong(data, 24)));
    }

    @Test
    public void testParseFromLocalFileDataEmpty() throws Exception {
        field.parseFromLocalFileData(new byte[0], 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
    }

    @Test
    public void testParseFromLocalFileDataTooShort() {
        try {
            field.parseFromLocalFileData(new byte[8], 0, 8);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testParseFromLocalFileDataMinimal() throws Exception {
        byte[] data = new byte[16];
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, data, 0, 8);
        System.arraycopy(sizeBytes, 0, data, 8, 8);
        field.parseFromLocalFileData(data, 0, 16);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileDataWithOffset() throws Exception {
        byte[] data = new byte[20];
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, data, 2, 8);
        System.arraycopy(sizeBytes, 0, data, 10, 8);
        field.parseFromLocalFileData(data, 2, 16);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getCompressedSize());
    }

    @Test
    public void testParseFromLocalFileDataWithRelativeHeaderOffset() throws Exception {
        byte[] data = new byte[24];
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, data, 0, 8);
        System.arraycopy(sizeBytes, 0, data, 8, 8);
        System.arraycopy(sizeBytes, 0, data, 16, 8);
        field.parseFromLocalFileData(data, 0, 24);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromLocalFileDataWithAllFields() throws Exception {
        byte[] data = new byte[28];
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, data, 0, 8);
        System.arraycopy(sizeBytes, 0, data, 8, 8);
        System.arraycopy(sizeBytes, 0, data, 16, 8);
        System.arraycopy(new byte[]{1,0,0,0}, 0, data, 24, 4);
        field.parseFromLocalFileData(data, 0, 28);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getRelativeHeaderOffset());
        assertEquals(new ZipLong(1), field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataAllFields() throws Exception {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 0, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 8, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 16, 8);
        System.arraycopy(new byte[]{1,0,0,0}, 0, CENTRAL_DATA_28, 24, 4);
        field.parseFromCentralDirectoryData(CENTRAL_DATA_28, 0, 28);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getCompressedSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getRelativeHeaderOffset());
        assertEquals(new ZipLong(1), field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataNoSizes() throws Exception {
        field.parseFromCentralDirectoryData(new byte[0], 0, 0);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryDataLengthMismatch() {
        field.parseFromCentralDirectoryData(CENTRAL_DATA_LENGTH_MISMATCH, 0, 20);
        try {
            field.reparseCentralDirectoryData(false, false, false, false);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testReparseCentralDirectoryDataValidLength() throws Exception {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_24, 0, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_24, 8, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_24, 16, 8);
        field.parseFromCentralDirectoryData(CENTRAL_DATA_24, 0, 24);
        field.reparseCentralDirectoryData(true, true, false, false);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testReparseCentralDirectoryDataAllFields() throws Exception {
        byte[] sizeBytes = new byte[]{1,2,3,4,5,6,7,8};
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 0, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 8, 8);
        System.arraycopy(sizeBytes, 0, CENTRAL_DATA_28, 16, 8);
        System.arraycopy(new byte[]{1,0,0,0}, 0, CENTRAL_DATA_28, 24, 4);
        field.parseFromCentralDirectoryData(CENTRAL_DATA_28, 0, 28);
        field.reparseCentralDirectoryData(true, true, true, true);
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getCompressedSize());
        assertEquals(new ZipEightByteInteger(sizeBytes), field.getRelativeHeaderOffset());
        assertEquals(new ZipLong(1), field.getDiskStartNumber());
    }

    @Test
    public void testSetGetSize() {
        assertNull(field.getSize());
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0});
        field.setSize(size);
        assertSame(size, field.getSize());
    }

    @Test
    public void testSetGetCompressedSize() {
        assertNull(field.getCompressedSize());
        ZipEightByteInteger size = new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0});
        field.setCompressedSize(size);
        assertSame(size, field.getCompressedSize());
    }

    @Test
    public void testSetGetRelativeHeaderOffset() {
        assertNull(field.getRelativeHeaderOffset());
        ZipEightByteInteger offset = new ZipEightByteInteger(new byte[]{1,0,0,0,0,0,0,0});
        field.setRelativeHeaderOffset(offset);
        assertSame(offset, field.getRelativeHeaderOffset());
    }

    @Test
    public void testSetGetDiskStartNumber() {
        assertNull(field.getDiskStartNumber());
        ZipLong ds = new ZipLong(1);
        field.setDiskStartNumber(ds);
        assertSame(ds, field.getDiskStartNumber());
    }

    @Test
    public void testGetLocalFileDataLengthNoSizes() {
        field.setSize(null);
        field.setCompressedSize(null);
        assertEquals(0, ZipShort.getValue(field.getLocalFileDataLength()));
    }

    @Test
    public void testGetLocalFileDataDataBothNullReturnsEmpty() {
        byte[] data = field.getLocalFileDataData();
        assertNotNull(data);
        assertEquals(0, data.length);
    }

    @Test
    public void testParseFromLocalFileDataLengthLessThanDoubleDword() {
        byte[] data = new byte[15];
        java.util.Arrays.fill(data, (byte) 0);
        try {
            field.parseFromLocalFileData(data, 0, 15);
            fail("Expected ZipException");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testParseFromCentralDirectoryDataLength24() throws Exception {
        field.parseFromCentralDirectoryData(CENTRAL_DATA_24, 0, 24);
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
        assertNull(field.getDiskStartNumber());
    }

    @Test
    public void testParseFromCentralDirectoryDataLength28() throws Exception {
        field.parseFromCentralDirectoryData(CENTRAL_DATA_28, 0, 28);
        assertEquals(new ZipLong(0), field.getDiskStartNumber());
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
    }

    @Test
    public void testParseFromCentralDirectoryDataLengthLessThanWord() throws Exception {
        field.parseFromCentralDirectoryData(new byte[3], 0, 3);
        assertNull(field.getDiskStartNumber());
        assertNull(field.getSize());
        assertNull(field.getCompressedSize());
        assertNull(field.getRelativeHeaderOffset());
    }
}