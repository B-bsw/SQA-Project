package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.zip.ZipException;

public class X7875_NewUnixTest {

    private X7875_NewUnix xf;

    @Before
    public void setUp() {
        xf = new X7875_NewUnix();
    }

    @Test
    public void getHeaderId_defaultInstance_shouldReturnExpectedHeaderId() {
        // Arrange
        ZipShort expected = new ZipShort(0x7875);

        // Act
        ZipShort actual = xf.getHeaderId();

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0x7875, actual.getValue());
    }

    @Test
    public void constructor_defaultInstance_shouldInitializeToDefaultValues() {
        // Arrange & Act
        long uid = xf.getUID();
        long gid = xf.getGID();

        // Assert
        Assert.assertEquals(1000L, uid);
        Assert.assertEquals(1000L, gid);
    }

    @Test
    public void setAndGetUID_givenPositiveValues_shouldReturnCorrectValues() {
        // Arrange & Act & Assert
        xf.setUID(0L);
        Assert.assertEquals(0L, xf.getUID());

        xf.setUID(1L);
        Assert.assertEquals(1L, xf.getUID());

        xf.setUID(65534L);
        Assert.assertEquals(65534L, xf.getUID());

        xf.setUID(4294967295L); // 0xFFFFFFFFL (32-bit unsigned max)
        Assert.assertEquals(4294967295L, xf.getUID());
    }

    @Test
    public void setAndGetGID_givenPositiveValues_shouldReturnCorrectValues() {
        // Arrange & Act & Assert
        xf.setGID(0L);
        Assert.assertEquals(0L, xf.getGID());

        xf.setGID(1L);
        Assert.assertEquals(1L, xf.getGID());

        xf.setGID(65534L);
        Assert.assertEquals(65534L, xf.getGID());

        xf.setGID(4294967295L);
        Assert.assertEquals(4294967295L, xf.getGID());
    }

    @Test
    public void getLocalFileDataLength_givenDefaultValues_shouldReturnCorrectLength() {
        // Arrange: default UID=1000, GID=1000 (both take 2 bytes: 0x03, 0xE8)
        // Length formula: 3 + uidSize (2) + gidSize (2) = 7
        ZipShort expected = new ZipShort(7);

        // Act
        ZipShort actual = xf.getLocalFileDataLength();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getLocalFileDataLength_givenZeroUIDAndGID_shouldEnforceMinLengthOne() {
        // Arrange: UID=0 (1 byte), GID=0 (1 byte)
        // Length formula: 3 + uidSize (1) + gidSize (1) = 5
        xf.setUID(0L);
        xf.setGID(0L);
        ZipShort expected = new ZipShort(5);

        // Act
        ZipShort actual = xf.getLocalFileDataLength();

        // Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCentralDirectoryLength_shouldMatchLocalFileDataLength() {
        // Arrange & Act
        ZipShort localLen = xf.getLocalFileDataLength();
        ZipShort centralLen = xf.getCentralDirectoryLength();

        // Assert
        Assert.assertEquals(localLen, centralLen);
    }

    @Test
    public void getCentralDirectoryData_shouldReturnEmptyByteArray() {
        // Arrange & Act
        byte[] data = xf.getCentralDirectoryData();

        // Assert
        Assert.assertNotNull(data);
        Assert.assertEquals(0, data.length);
    }

    @Test
    public void getLocalFileDataData_givenDefaultValues_shouldReturnExpectedBytes() {
        // Arrange: UID=1000 (0x03E8 -> little endian: E8 03), GID=1000
        // version=1, uidSize=2, uid={0xE8, 0x03}, gidSize=2, gid={0xE8, 0x03}
        byte[] expected = new byte[] {
            1,          // version
            2,          // uidSize
            (byte) 0xE8, 3, // uid in little-endian
            2,          // gidSize
            (byte) 0xE8, 3  // gid in little-endian
        };

        // Act
        byte[] actual = xf.getLocalFileDataData();

        // Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLocalFileDataData_givenZeroUIDAndGID_shouldReturnSingleZeroBytes() {
        // Arrange
        xf.setUID(0L);
        xf.setGID(0L);
        byte[] expected = new byte[] {
            1, // version
            1, // uidSize
            0, // uid = 0
            1, // gidSize
            0  // gid = 0
        };

        // Act
        byte[] actual = xf.getLocalFileDataData();

        // Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void parseFromLocalFileData_givenValidData_shouldPopulateFieldsCorrectly() throws Exception {
        // Arrange
        byte[] data = new byte[] {
            1,                      // version
            2,                      // uidSize
            (byte) 0x34, (byte) 0x12, // uid = 0x1234 = 4660
            4,                      // gidSize
            (byte) 0x78, (byte) 0x56, (byte) 0x34, (byte) 0x12 // gid = 0x12345678 = 305419896
        };

        // Act
        xf.parseFromLocalFileData(data, 0, data.length);

        // Assert
        Assert.assertEquals(4660L, xf.getUID());
        Assert.assertEquals(305419896L, xf.getGID());
    }

    @Test
    public void parseFromLocalFileData_givenOffsetAndPadding_shouldParseCorrectSlice() throws Exception {
        // Arrange
        byte[] buffer = new byte[15];
        // Populate dummy prefix
        buffer[0] = (byte) 0xFF;
        buffer[1] = (byte) 0xFF;

        int offset = 2;
        buffer[offset]     = 1; // version
        buffer[offset + 1] = 1; // uidSize
        buffer[offset + 2] = 5; // uid = 5
        buffer[offset + 3] = 1; // gidSize
        buffer[offset + 4] = 9; // gid = 9

        // Act
        xf.parseFromLocalFileData(buffer, offset, 5);

        // Assert
        Assert.assertEquals(5L, xf.getUID());
        Assert.assertEquals(9L, xf.getGID());
    }

    @Test
    public void parseFromLocalFileData_givenEmptyUIDAndGID_shouldParseAsZero() throws Exception {
        // Arrange: uidSize=0, gidSize=0
        byte[] data = new byte[] {
            1, // version
            0, // uidSize
            0  // gidSize
        };

        // Act
        xf.parseFromLocalFileData(data, 0, data.length);

        // Assert
        Assert.assertEquals(0L, xf.getUID());
        Assert.assertEquals(0L, xf.getGID());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void parseFromLocalFileData_givenTruncatedData_shouldThrowException() throws Exception {
        // Arrange: declared uidSize = 4, but array has only 1 byte available
        byte[] data = new byte[] { 1, 4, 0x10 };

        // Act
        xf.parseFromLocalFileData(data, 0, data.length);
    }

    @Test
    public void parseFromCentralDirectoryData_shouldDoNothingAndNotThrowException() throws Exception {
        // Arrange
        byte[] buffer = new byte[] { 1, 2, 3 };

        // Act
        xf.parseFromCentralDirectoryData(buffer, 0, buffer.length);

        // Assert: state remains default
        Assert.assertEquals(1000L, xf.getUID());
        Assert.assertEquals(1000L, xf.getGID());
    }

    @Test
    public void roundTripSerialization_shouldPreserveValues() throws Exception {
        // Arrange
        xf.setUID(123456789L);
        xf.setGID(987654321L);

        // Act
        byte[] localData = xf.getLocalFileDataData();
        X7875_NewUnix parsed = new X7875_NewUnix();
        parsed.parseFromLocalFileData(localData, 0, localData.length);

        // Assert
        Assert.assertEquals(xf.getUID(), parsed.getUID());
        Assert.assertEquals(xf.getGID(), parsed.getGID());
        Assert.assertEquals(xf, parsed);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenNull_shouldReturnNull() {
        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(null);

        // Assert
        Assert.assertNull(result);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenEmptyArray_shouldReturnSingleZero() {
        // Arrange
        byte[] input = new byte[0];

        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(0, result[0]);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenOnlyZeroes_shouldReturnSingleZero() {
        // Arrange
        byte[] input = new byte[] { 0, 0, 0 };

        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(0, result[0]);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenSingleZero_shouldReturnSingleZero() {
        // Arrange
        byte[] input = new byte[] { 0 };

        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);

        // Assert
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(0, result[0]);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenLeadingZeroes_shouldTrimCorrectly() {
        // Arrange
        byte[] input = new byte[] { 0, 0, 1, 2, 3 };

        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);

        // Assert
        Assert.assertArrayEquals(new byte[] { 1, 2, 3 }, result);
    }

    @Test
    public void trimLeadingZeroesForceMinLength_givenNoLeadingZeroes_shouldReturnExactBytes() {
        // Arrange
        byte[] input = new byte[] { 1, 2, 3, 0 };

        // Act
        byte[] result = X7875_NewUnix.trimLeadingZeroesForceMinLength(input);

        // Assert
        Assert.assertArrayEquals(input, result);
    }

    @Test
    public void equals_contractVerification() {
        // Arrange
        X7875_NewUnix xf1 = new X7875_NewUnix();
        X7875_NewUnix xf2 = new X7875_NewUnix();
        X7875_NewUnix xf3 = new X7875_NewUnix();
        xf3.setUID(2000L);
        X7875_NewUnix xf4 = new X7875_NewUnix();
        xf4.setGID(2000L);

        // Reflexive
        Assert.assertTrue(xf1.equals(xf1));

        // Symmetric
        Assert.assertTrue(xf1.equals(xf2));
        Assert.assertTrue(xf2.equals(xf1));

        // Not equal checks
        Assert.assertFalse(xf1.equals(xf3));
        Assert.assertFalse(xf1.equals(xf4));
        Assert.assertFalse(xf3.equals(xf4));

        // Non-nullity
        Assert.assertFalse(xf1.equals(null));

        // Incompatible type
        Assert.assertFalse(xf1.equals("SomeString"));
    }

    @Test
    public void hashCode_contractVerification() {
        // Arrange
        X7875_NewUnix xf1 = new X7875_NewUnix();
        X7875_NewUnix xf2 = new X7875_NewUnix();
        X7875_NewUnix xf3 = new X7875_NewUnix();
        xf3.setUID(500L);

        // Assert
        Assert.assertEquals(xf1.hashCode(), xf2.hashCode());
        Assert.assertTrue(xf1.hashCode() != xf3.hashCode());
    }

    @Test
    public void toString_shouldContainUidAndGidValues() {
        // Arrange
        xf.setUID(12345L);
        xf.setGID(67890L);

        // Act
        String str = xf.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertTrue(str.indexOf("0x7875") != -1);
        Assert.assertTrue(str.indexOf("UID=12345") != -1);
        Assert.assertTrue(str.indexOf("GID=67890") != -1);
    }

    @Test
    public void clone_shouldCreateIndependentEqualCopy() throws Exception {
        // Arrange
        xf.setUID(54321L);
        xf.setGID(98765L);

        // Act
        X7875_NewUnix cloned = (X7875_NewUnix) xf.clone();

        // Assert
        Assert.assertNotSame(xf, cloned);
        Assert.assertEquals(xf, cloned);
        Assert.assertEquals(xf.getUID(), cloned.getUID());
        Assert.assertEquals(xf.getGID(), cloned.getGID());

        // Mutating cloned does not mutate original
        cloned.setUID(11111L);
        Assert.assertFalse(xf.equals(cloned));
        Assert.assertEquals(54321L, xf.getUID());
    }

    @Test
    public void javaSerialization_shouldSerializeAndDeserializeCorrectly() throws Exception {
        // Arrange
        xf.setUID(77777L);
        xf.setGID(88888L);

        // Act
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(xf);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        X7875_NewUnix deserialized = (X7875_NewUnix) ois.readObject();
        ois.close();

        // Assert
        Assert.assertNotSame(xf, deserialized);
        Assert.assertEquals(xf, deserialized);
        Assert.assertEquals(xf.getUID(), deserialized.getUID());
        Assert.assertEquals(xf.getGID(), deserialized.getGID());
    }
}