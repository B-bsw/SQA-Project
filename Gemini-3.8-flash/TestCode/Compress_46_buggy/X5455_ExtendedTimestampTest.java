package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestampTest {

    private X5455_ExtendedTimestamp xf;

    @Before
    public void setUp() {
        this.xf = new X5455_ExtendedTimestamp();
    }

    @Test
    public void getHeaderId_shouldReturnExpectedHeaderId() {
        // Arrange & Act
        ZipShort headerId = this.xf.getHeaderId();

        // Assert
        Assert.assertEquals(new ZipShort(0x5455), headerId);
    }

    @Test
    public void defaultConstructor_shouldInitializeWithZeroFlags() {
        // Arrange & Act
        X5455_ExtendedTimestamp timestamp = new X5455_ExtendedTimestamp();

        // Assert
        Assert.assertEquals((byte) 0, timestamp.getFlags());
        Assert.assertFalse(timestamp.isBit0_modifyTimePresent());
        Assert.assertFalse(timestamp.isBit1_accessTimePresent());
        Assert.assertFalse(timestamp.isBit2_createTimePresent());
        Assert.assertNull(timestamp.getModifyTime());
        Assert.assertNull(timestamp.getAccessTime());
        Assert.assertNull(timestamp.getCreateTime());
    }

    @Test
    public void setAndGetFlags_givenFlagBits_shouldStoreAndExposePresence() {
        // Arrange & Act
        this.xf.setFlags((byte) (X5455_ExtendedTimestamp.MODIFY_TIME_BIT | X5455_ExtendedTimestamp.ACCESS_TIME_BIT));

        // Assert
        Assert.assertTrue(this.xf.isBit0_modifyTimePresent());
        Assert.assertTrue(this.xf.isBit1_accessTimePresent());
        Assert.assertFalse(this.xf.isBit2_createTimePresent());
    }

    @Test
    public void setModifyTime_givenZipLong_shouldUpdateFlagsAndReturnExpected() {
        // Arrange
        ZipLong time = new ZipLong(1000000L);

        // Act
        this.xf.setModifyTime(time);

        // Assert
        Assert.assertTrue(this.xf.isBit0_modifyTimePresent());
        Assert.assertEquals(time, this.xf.getModifyTime());
        Assert.assertNotNull(this.xf.getModifyJavaTime());
        Assert.assertEquals(1000000L * 1000L, this.xf.getModifyJavaTime().getTime());
    }

    @Test
    public void setAccessTime_givenZipLong_shouldUpdateFlagsAndReturnExpected() {
        // Arrange
        ZipLong time = new ZipLong(2000000L);

        // Act
        this.xf.setAccessTime(time);

        // Assert
        Assert.assertTrue(this.xf.isBit1_accessTimePresent());
        Assert.assertEquals(time, this.xf.getAccessTime());
        Assert.assertNotNull(this.xf.getAccessJavaTime());
        Assert.assertEquals(2000000L * 1000L, this.xf.getAccessJavaTime().getTime());
    }

    @Test
    public void setCreateTime_givenZipLong_shouldUpdateFlagsAndReturnExpected() {
        // Arrange
        ZipLong time = new ZipLong(3000000L);

        // Act
        this.xf.setCreateTime(time);

        // Assert
        Assert.assertTrue(this.xf.isBit2_createTimePresent());
        Assert.assertEquals(time, this.xf.getCreateTime());
        Assert.assertNotNull(this.xf.getCreateJavaTime());
        Assert.assertEquals(3000000L * 1000L, this.xf.getCreateJavaTime().getTime());
    }

    @Test
    public void setJavaTimes_givenDate_shouldConvertSecondsAccurately() {
        // Arrange
        Date now = new Date(1500000000000L);

        // Act
        this.xf.setModifyJavaTime(now);
        this.xf.setAccessJavaTime(now);
        this.xf.setCreateJavaTime(now);

        // Assert
        Assert.assertEquals(now.getTime() / 1000L, this.xf.getModifyTime().getValue());
        Assert.assertEquals(now.getTime() / 1000L, this.xf.getAccessTime().getValue());
        Assert.assertEquals(now.getTime() / 1000L, this.xf.getCreateTime().getValue());
    }

    @Test
    public void getLocalFileDataData_and_parseFromLocalFileData_shouldRoundTrip() throws ZipException {
        // Arrange
        this.xf.setModifyTime(new ZipLong(123456L));
        this.xf.setAccessTime(new ZipLong(234567L));
        this.xf.setCreateTime(new ZipLong(345678L));

        // Act
        byte[] localData = this.xf.getLocalFileDataData();
        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromLocalFileData(localData, 0, localData.length);

        // Assert
        Assert.assertEquals(this.xf.getFlags(), parsed.getFlags());
        Assert.assertEquals(this.xf.getModifyTime(), parsed.getModifyTime());
        Assert.assertEquals(this.xf.getAccessTime(), parsed.getAccessTime());
        Assert.assertEquals(this.xf.getCreateTime(), parsed.getCreateTime());
    }

    @Test
    public void getCentralDirectoryData_shouldOnlyContainModifyTime() throws ZipException {
        // Arrange
        this.xf.setModifyTime(new ZipLong(111L));
        this.xf.setAccessTime(new ZipLong(222L));
        this.xf.setCreateTime(new ZipLong(333L));

        // Act
        byte[] centralData = this.xf.getCentralDirectoryData();

        // Assert
        Assert.assertEquals(5, centralData.length); // 1 byte flags + 4 bytes modify time
        X5455_ExtendedTimestamp parsed = new X5455_ExtendedTimestamp();
        parsed.parseFromCentralDirectoryData(centralData, 0, centralData.length);
        Assert.assertEquals(new ZipLong(111L), parsed.getModifyTime());
        Assert.assertNull(parsed.getAccessTime());
        Assert.assertNull(parsed.getCreateTime());
    }

    @Test
    public void clone_givenConfiguredInstance_shouldReturnIndependentCopy() throws Exception {
        // Arrange
        this.xf.setModifyTime(new ZipLong(55555L));

        // Act
        X5455_ExtendedTimestamp cloned = (X5455_ExtendedTimestamp) this.xf.clone();

        // Assert
        Assert.assertNotNull(cloned);
        Assert.assertEquals(this.xf, cloned);
        Assert.assertNotSame(this.xf, cloned);
    }

    @Test
    public void equalsAndHashCode_givenTimestamps_shouldEvaluateCorrectly() {
        // Arrange
        X5455_ExtendedTimestamp t1 = new X5455_ExtendedTimestamp();
        t1.setModifyTime(new ZipLong(999L));
        X5455_ExtendedTimestamp t2 = new X5455_ExtendedTimestamp();
        t2.setModifyTime(new ZipLong(999L));
        X5455_ExtendedTimestamp t3 = new X5455_ExtendedTimestamp();
        t3.setModifyTime(new ZipLong(888L));

        // Act & Assert
        Assert.assertTrue(t1.equals(t2));
        Assert.assertEquals(t1.hashCode(), t2.hashCode());
        Assert.assertFalse(t1.equals(t3));
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("differentType"));
    }

    @Test
    public void toString_shouldContainTimestampDetails() {
        // Arrange
        this.xf.setModifyTime(new ZipLong(12345L));

        // Act
        String str = this.xf.toString();

        // Assert
        Assert.assertNotNull(str);
        Assert.assertTrue(str.contains("0x5455"));
    }
}
