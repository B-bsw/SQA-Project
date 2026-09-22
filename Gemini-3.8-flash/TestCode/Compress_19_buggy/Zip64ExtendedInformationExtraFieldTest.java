package org.apache.commons.compress.archivers.zip;

import java.util.zip.ZipException;
import org.junit.Assert;
import org.junit.Test;

public class Zip64ExtendedInformationExtraFieldTest {

    private static final ZipEightByteInteger SIZE_1000 = new ZipEightByteInteger(1000L);
    private static final ZipEightByteInteger SIZE_2000 = new ZipEightByteInteger(2000L);
    private static final ZipEightByteInteger OFFSET_3000 = new ZipEightByteInteger(3000L);
    private static final ZipLong DISK_4 = new ZipLong(4L);

    @Test
    public void getHeaderId_defaultConstructor_shouldReturnHeaderId() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        Assert.assertEquals(new ZipShort(0x0001), field.getHeaderId());
    }

    @Test
    public void constructor_twoArgs_shouldInitializeSizes() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000);
        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void constructor_fourArgs_shouldInitializeAllFields() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000, OFFSET_3000, DISK_4);
        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void setAndGet_allFields_shouldUpdateCorrectly() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(SIZE_1000);
        field.setCompressedSize(SIZE_2000);
        field.setRelativeHeaderOffset(OFFSET_3000);
        field.setDiskStartNumber(DISK_4);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void getLocalFileDataLength_whenSizeIsNull_shouldReturnZero() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        Assert.assertEquals(new ZipShort(0), field.getLocalFileDataLength());
    }

    @Test
    public void getLocalFileDataLength_whenSizeIsNotNull_shouldReturnSixteen() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000);
        Assert.assertEquals(new ZipShort(16), field.getLocalFileDataLength());
    }

    @Test
    public void getCentralDirectoryLength_whenEmpty_shouldReturnZero() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        Assert.assertEquals(new ZipShort(0), field.getCentralDirectoryLength());
    }

    @Test
    public void getCentralDirectoryLength_whenAllPresent_shouldReturnTwentyEight() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000, OFFSET_3000, DISK_4);
        Assert.assertEquals(new ZipShort(28), field.getCentralDirectoryLength());
    }

    @Test
    public void getCentralDirectoryLength_partialFields_shouldCalculateCorrectly() {
        Zip64ExtendedInformationExtraField field1 = new Zip64ExtendedInformationExtraField(SIZE_1000, null, null, null);
        Assert.assertEquals(new ZipShort(8), field1.getCentralDirectoryLength());

        Zip64ExtendedInformationExtraField field2 = new Zip64ExtendedInformationExtraField(null, SIZE_2000, null, null);
        Assert.assertEquals(new ZipShort(8), field2.getCentralDirectoryLength());

        Zip64ExtendedInformationExtraField field3 = new Zip64ExtendedInformationExtraField(null, null, OFFSET_3000, null);
        Assert.assertEquals(new ZipShort(8), field3.getCentralDirectoryLength());

        Zip64ExtendedInformationExtraField field4 = new Zip64ExtendedInformationExtraField(null, null, null, DISK_4);
        Assert.assertEquals(new ZipShort(4), field4.getCentralDirectoryLength());
    }

    @Test
    public void getLocalFileDataData_whenBothSizesNull_shouldReturnEmptyArray() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] data = field.getLocalFileDataData();
        Assert.assertNotNull(data);
        Assert.assertEquals(0, data.length);
    }

    @Test
    public void getLocalFileDataData_whenBothSizesNotNull_shouldReturnSixteenBytes() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000);
        byte[] data = field.getLocalFileDataData();
        Assert.assertEquals(16, data.length);

        ZipEightByteInteger uncompressed = new ZipEightByteInteger(data, 0);
        ZipEightByteInteger compressed = new ZipEightByteInteger(data, 8);
        Assert.assertEquals(SIZE_1000, uncompressed);
        Assert.assertEquals(SIZE_2000, compressed);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLocalFileDataData_whenSizePresentCompressedNull_shouldThrowException() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setSize(SIZE_1000);
        field.getLocalFileDataData();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getLocalFileDataData_whenSizeNullCompressedPresent_shouldThrowException() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.setCompressedSize(SIZE_2000);
        field.getLocalFileDataData();
    }

    @Test
    public void getCentralDirectoryData_whenAllFieldsPresent_shouldContainTwentyEightBytes() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(SIZE_1000, SIZE_2000, OFFSET_3000, DISK_4);
        byte[] data = field.getCentralDirectoryData();
        Assert.assertEquals(28, data.length);

        Assert.assertEquals(SIZE_1000, new ZipEightByteInteger(data, 0));
        Assert.assertEquals(SIZE_2000, new ZipEightByteInteger(data, 8));
        Assert.assertEquals(OFFSET_3000, new ZipEightByteInteger(data, 16));
        Assert.assertEquals(DISK_4, new ZipLong(data, 24));
    }

    @Test
    public void getCentralDirectoryData_whenOnlyOffsetAndDiskStart_shouldSerializeCorrectly() {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField(null, null, OFFSET_3000, DISK_4);
        byte[] data = field.getCentralDirectoryData();
        Assert.assertEquals(12, data.length);

        Assert.assertEquals(OFFSET_3000, new ZipEightByteInteger(data, 0));
        Assert.assertEquals(DISK_4, new ZipLong(data, 8));
    }

    @Test
    public void parseFromLocalFileData_lengthZero_shouldDoNothing() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[10];
        field.parseFromLocalFileData(buffer, 0, 0);
        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
    }

    @Test(expected = ZipException.class)
    public void parseFromLocalFileData_lengthLessThanSixteen_shouldThrowZipException() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        byte[] buffer = new byte[15];
        field.parseFromLocalFileData(buffer, 0, 15);
    }

    @Test
    public void parseFromLocalFileData_lengthSixteen_shouldParseSizesOnly() throws ZipException {
        byte[] buffer = new byte[20];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 2, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 10, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 2, 16);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void parseFromLocalFileData_lengthTwentyFour_shouldParseSizesAndOffset() throws ZipException {
        byte[] buffer = new byte[24];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 0, 24);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void parseFromLocalFileData_lengthTwentyEight_shouldParseAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 0, 28);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void parseFromLocalFileData_lengthGreaterThanTwentyEight_shouldParseAllAndIgnoreExtra() throws ZipException {
        byte[] buffer = new byte[32];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromLocalFileData(buffer, 0, 32);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void parseFromCentralDirectoryData_lengthTwentyEight_shouldParseAllViaLocalFileLogic() throws ZipException {
        byte[] buffer = new byte[28];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 28);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void parseFromCentralDirectoryData_lengthTwentyFour_shouldParseThreeSizes() throws ZipException {
        byte[] buffer = new byte[24];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 24);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void parseFromCentralDirectoryData_lengthModEightEqualsFour_shouldParseDiskStart() throws ZipException {
        byte[] buffer = new byte[20];
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 16, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 20);

        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void parseFromCentralDirectoryData_lengthModEightEqualsFourMinLengthFour_shouldParseDiskStart() throws ZipException {
        byte[] buffer = new byte[4];
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 0, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 4);

        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void parseFromCentralDirectoryData_unrecognizedLength_shouldNotPopulateFields() throws ZipException {
        byte[] buffer = new byte[8];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 8);

        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void reparseCentralDirectoryData_whenRawDataNull_shouldDoNothing() throws ZipException {
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.reparseCentralDirectoryData(true, true, true, true);
        Assert.assertNull(field.getSize());
    }

    @Test(expected = ZipException.class)
    public void reparseCentralDirectoryData_whenLengthMismatch_shouldThrowZipException() throws ZipException {
        byte[] buffer = new byte[16];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 16);

        field.reparseCentralDirectoryData(true, true, true, false);
    }

    @Test
    public void reparseCentralDirectoryData_allTrue_shouldReparseAllFields() throws ZipException {
        byte[] buffer = new byte[28];
        System.arraycopy(SIZE_1000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 8, 8);
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 16, 8);
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 24, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 28);

        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(true, true, true, true);

        Assert.assertEquals(SIZE_1000, field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void reparseCentralDirectoryData_onlyCompressedSizeAndDiskStart_shouldParseSelectedFields() throws ZipException {
        byte[] buffer = new byte[12];
        System.arraycopy(SIZE_2000.getBytes(), 0, buffer, 0, 8);
        System.arraycopy(DISK_4.getBytes(), 0, buffer, 8, 4);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 12);

        field.setSize(null);
        field.setCompressedSize(null);
        field.setRelativeHeaderOffset(null);
        field.setDiskStartNumber(null);

        field.reparseCentralDirectoryData(false, true, false, true);

        Assert.assertNull(field.getSize());
        Assert.assertEquals(SIZE_2000, field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertEquals(DISK_4, field.getDiskStartNumber());
    }

    @Test
    public void reparseCentralDirectoryData_onlyRelativeHeaderOffset_shouldParseOffsetOnly() throws ZipException {
        byte[] buffer = new byte[8];
        System.arraycopy(OFFSET_3000.getBytes(), 0, buffer, 0, 8);

        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 8);

        field.reparseCentralDirectoryData(false, false, true, false);

        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
        Assert.assertEquals(OFFSET_3000, field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }

    @Test
    public void reparseCentralDirectoryData_allFalse_whenLengthZero_shouldSucceed() throws ZipException {
        byte[] buffer = new byte[0];
        Zip64ExtendedInformationExtraField field = new Zip64ExtendedInformationExtraField();
        field.parseFromCentralDirectoryData(buffer, 0, 0);

        field.reparseCentralDirectoryData(false, false, false, false);

        Assert.assertNull(field.getSize());
        Assert.assertNull(field.getCompressedSize());
        Assert.assertNull(field.getRelativeHeaderOffset());
        Assert.assertNull(field.getDiskStartNumber());
    }
}