package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import org.junit.Before;
import java.util.zip.ZipException;
import static org.junit.Assert.*;

public class X7875_NewUnixTest {
    private X7875_NewUnix extraField;

    @Before
    public void setUp() {
        extraField = new X7875_NewUnix();
    }

    @Test
    public void testDefaultConstructor() {
        assertEquals(1000L, extraField.getUID());
        assertEquals(1000L, extraField.getGID());
        assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", extraField.toString());
    }

    @Test
    public void testGetHeaderId() {
        assertEquals(0x7875, extraField.getHeaderId().getValue());
    }

    @Test
    public void testSetAndGetUID() {
        extraField.setUID(42L);
        assertEquals(42L, extraField.getUID());
    }

    @Test
    public void testSetAndGetGID() {
        extraField.setGID(43L);
        assertEquals(43L, extraField.getGID());
    }

    @Test
    public void testSetAndGetUIDWithMaxUnsignedInt() {
        extraField.setUID(0xFFFFFFFFL);
        assertEquals(0xFFFFFFFFL, extraField.getUID());
    }

    @Test
    public void testSetAndGetGIDWithZero() {
        extraField.setGID(0L);
        assertEquals(0L, extraField.getGID());
    }

    @Test
    public void testGetLocalFileDataLength() {
        extraField.setUID(0L);
        extraField.setGID(0L);
        assertEquals(5, extraField.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataLengthWithValues() {
        extraField.setUID(1000L);
        extraField.setGID(1000L);
        assertEquals(6, extraField.getLocalFileDataLength().getValue());
    }

    @Test
    public void testGetLocalFileDataData() {
        extraField.setUID(1L);
        extraField.setGID(1L);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(6, data.length);
        assertEquals(1, data[0]);
        assertEquals(1, data[1]);
        assertEquals(1, data[2]);
        assertEquals(1, data[3]);
        assertEquals(1, data[4]);
    }

    @Test
    public void testGetLocalFileDataDataWithZero() {
        extraField.setUID(0L);
        extraField.setGID(0L);
        byte[] data = extraField.getLocalFileDataData();
        assertEquals(5, data.length);
        assertEquals(1, data[0]);
        assertEquals(1, data[1]);
        assertEquals(0, data[2]);
        assertEquals(1, data[3]);
        assertEquals(0, data[4]);
    }

    @Test
    public void testParseFromLocalFileData() throws ZipException {
        byte[] data = new byte[] {1, 1, 5, 0, 0, 0, 1, 6, 0, 0};
        extraField.parseFromLocalFileData(data, 0, data.length);
        assertEquals(5L, extraField.getUID());
        assertEquals(6L, extraField.getGID());
    }

    @Test
    public void testParseFromLocalFileDataWithLargeValues() throws ZipException {
        byte[] data = new byte[] {1, 2, 0x10, 0x20, 2, 0x30, 0x40};
        extraField.parseFromLocalFileData(data, 0, data.length);
        assertEquals(0x2010L, extraField.getUID());
        assertEquals(0x4030L, extraField.getGID());
    }

    @Test
    public void testParseFromLocalFileDataWithZeroLength() throws ZipException {
        byte[] data = new byte[] {1, 0, 0};
        extraField.parseFromLocalFileData(data, 0, data.length);
        assertEquals(0L, extraField.getUID());
        assertEquals(0L, extraField.getGID());
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        byte[] data = new byte[] {1, 1, 5, 0, 0, 0, 1, 6, 0, 0};
        extraField.parseFromCentralDirectoryData(data, 0, data.length);
        assertEquals(1000L, extraField.getUID());
        assertEquals(1000L, extraField.getGID());
    }

    @Test
    public void testGetCentralDirectoryData() {
        byte[] data = extraField.getCentralDirectoryData();
        assertEquals(0, data.length);
    }

    @Test
    public void testGetCentralDirectoryLength() {
        extraField.setUID(10L);
        extraField.setGID(20L);
        assertEquals(extraField.getLocalFileDataLength().getValue(), extraField.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testEquals() {
        X7875_NewUnix other = new X7875_NewUnix();
        assertTrue(extraField.equals(other));
        assertTrue(extraField.equals(extraField));
        assertFalse(extraField.equals(null));
        assertFalse(extraField.equals("string"));

        other.setUID(123L);
        assertFalse(extraField.equals(other));
        assertFalse(other.equals(extraField));
    }

    @Test
    public void testEqualsWithDifferentVersion() throws ZipException {
        X7875_NewUnix other = new X7875_NewUnix();
        byte[] data = new byte[] {2, 1, 100, 1, 200};
        other.parseFromLocalFileData(data, 0, data.length);
        assertFalse(extraField.equals(other));
    }

    @Test
    public void testHashCode() {
        X7875_NewUnix same = new X7875_NewUnix();
        assertEquals(extraField.hashCode(), same.hashCode());

        X7875_NewUnix differentUID = new X7875_NewUnix();
        differentUID.setUID(2334L);
        assertNotEquals(extraField.hashCode(), differentUID.hashCode());
    }

    @Test
    public void testHashCodeWithDifferentGID() {
        X7875_NewUnix differentGID = new X7875_NewUnix();
        differentGID.setGID(999L);
        assertNotEquals(extraField.hashCode(), differentGID.hashCode());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {
        X7875_NewUnix cloned = (X7875_NewUnix) extraField.clone();
        assertNotSame(extraField, cloned);
        assertEquals(extraField, cloned);
        assertEquals(extraField.hashCode(), cloned.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", extraField.toString());

        extraField.setUID(123L);
        extraField.setGID(456L);
        assertEquals("0x7875 Zip Extra Field: UID=123 GID=456", extraField.toString());
    }

    @Test
    public void testTrimLeadingZeroesForceMinLength() {
        assertNull(X7875_NewUnix.trimLeadingZeroesForceMinLength(null));

        byte[] input = new byte[] {0, 0, 1, 2, 3};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(1, result.length);
        assertEquals(1, result[0]);

        result = X7875_NewUnix.trimLeadingZeroesForceMinLength(new byte[] {0, 0, 0});
        assertEquals(1, result.length);
        assertEquals(0, result[0]);
    }

    @Test
    public void testTrimLeadingZeroesForceMinLengthWithNoRemoval() {
        byte[] input = new byte[] {1, 2, 3};
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);
        assertEquals(3, result.length);
        assertArrayEquals(input, result);
    }

    @Test
    public void testParseFromLocalFileDataWithAllZeroes() throws ZipException {
        byte[] data = new byte[] {1, 1, 0, 1, 0};
        extraField.parseFromLocalFileData(data, 0, data.length);
        assertEquals(0L, extraField.getUID());
        assertEquals(0L, extraField.getGID());
    }

    @Test
    public void testParseFromLocalFileDataWithOffset() throws ZipException {
        byte[] data = new byte[] {9, 9, 1, 1, 5, 0, 0, 0, 1, 6};
        extraField.parseFromLocalFileData(data, 2, 8);
        assertEquals(5L, extraField.getUID());
        assertEquals(6L, extraField.getGID());
    }

    @Test
    public void testGetLocalFileDataDataAfterParse() throws ZipException {
        byte[] data = new byte[] {1, 2, 0x34, 0x12, 2, 0x56, 0x78};
        extraField.parseFromLocalFileData(data, 0, data.length);
        byte[] encodedData = extraField.getLocalFileDataData();
        assertEquals(7, encodedData.length);
        assertEquals(1, encodedData[0]);
        assertEquals(2, encodedData[1]);
        assertEquals(0x34, encodedData[2]);
        assertEquals(0x12, encodedData[3]);
        assertEquals(2, encodedData[4]);
        assertEquals(0x56, encodedData[5]);
        assertEquals(0x78, encodedData[6]);
    }
}