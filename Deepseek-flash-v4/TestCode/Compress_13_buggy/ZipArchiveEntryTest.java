package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.zip.ZipException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ZipArchiveEntryTest {

    private static final ZipShort HEADER_ID = new ZipShort(0x1234);
    private static final byte[] EXTRA_DATA = new byte[] {1, 2, 3, 4};
    private static final byte[] CENTRAL_DATA = new byte[] {5, 6, 7, 8};

    private ZipArchiveEntry entry;

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test");
    }

    @After
    public void tearDown() {
        entry = null;
    }

    @Test
    public void testDefaultConstructor() throws ZipException {
        ZipArchiveEntry e = new ZipArchiveEntry("foo");
        assertEquals("foo", e.getName());
        assertEquals(-1, e.getMethod());
        assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, e.getSize());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, e.getPlatform());
        assertEquals(0, e.getInternalAttributes());
        assertEquals(0L, e.getExternalAttributes());
    }

    @Test(expected = ZipException.class)
    public void testCopyZipEntryWithInvalidExtra() throws ZipException {
        java.util.zip.ZipEntry z = new java.util.zip.ZipEntry("foo");
        z.setExtra(new byte[] {(byte) 0xFF, (byte) 0xFF});
        new ZipArchiveEntry(z);
    }

    @Test
    public void testCopyZipEntryNullExtra() throws ZipException {
        java.util.zip.ZipEntry z = new java.util.zip.ZipEntry("bar");
        z.setExtra(null);
        ZipArchiveEntry e = new ZipArchiveEntry(z);
        assertEquals("bar", e.getName());
        assertNotNull(e.getExtraFields());
        assertEquals(0, e.getExtraFields().length);
    }

    @Test
    public void testCopyZipEntryWithValidExtra() throws ZipException {
        byte[] extra = new byte[] {0x01, 0x23, 0x00, 0x01, 0x42};
        java.util.zip.ZipEntry z = new java.util.zip.ZipEntry("baz");
        z.setExtra(extra);
        ZipArchiveEntry e = new ZipArchiveEntry(z);
        assertEquals("baz", e.getName());
        assertNotNull(e.getLocalFileDataExtra());
        assertTrue(e.getLocalFileDataExtra().length >= 0);
    }

    @Test
    public void testCopyConstructorWithZipEntry() throws ZipException {
        java.util.zip.ZipEntry z = new java.util.zip.ZipEntry("item");
        z.setMethod(java.util.zip.ZipEntry.DEFLATED);
        z.setSize(100L);
        z.setTime(123456789L);
        ZipArchiveEntry e = new ZipArchiveEntry(z);
        assertEquals("item", e.getName());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, e.getMethod());
        assertEquals(100L, e.getSize());
        assertEquals(123456789L, e.getTime());
    }

    @Test
    public void testCopyConstructorWithFullEntry() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("orig");
        original.setUnixMode(0755);
        original.setInternalAttributes(123);
        original.setExternalAttributes(456L);
        ZipArchiveEntry copy = new ZipArchiveEntry(original);
        assertEquals("orig", copy.getName());
        assertEquals(original.getUnixMode(), copy.getUnixMode());
        assertEquals(123, copy.getInternalAttributes());
        assertEquals(456L, copy.getExternalAttributes());
    }

    @Test
    public void testFileConstructorDirectory() {
        File f = new File("src/test/resources");
        ZipArchiveEntry e = new ZipArchiveEntry(f, "subdir");
        assertTrue(e.isDirectory());
        assertEquals("subdir/", e.getName());
    }

    @Test
    public void testFileConstructorFile() {
        File f = new File("pom.xml");
        ZipArchiveEntry e = new ZipArchiveEntry(f, "pom.xml");
        assertFalse(e.isDirectory());
        assertEquals("pom.xml", e.getName());
        assertTrue(e.getSize() > 0);
        assertTrue(e.getTime() > 0);
    }

    @Test
    public void testClone() throws ZipException {
        ZipArchiveEntry original = new ZipArchiveEntry("clone");
        original.setUnixMode(0755);
        original.setExtraFields(new ZipExtraField[] {new UnparseableExtraFieldData()});
        ZipArchiveEntry clone = (ZipArchiveEntry) original.clone();
        assertEquals(original.getName(), clone.getName());
        assertEquals(original.getUnixMode(), clone.getUnixMode());
        assertEquals(original.getInternalAttributes(), clone.getInternalAttributes());
        assertEquals(original.getExternalAttributes(), clone.getExternalAttributes());
    }

    @Test
    public void testSetMethodNegative() throws ZipException {
        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("ZIP compression method can not be negative: -1", e.getMessage());
        }
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testSetMethodValid() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testGetMethodDefault() {
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testSetAndGetInternalAttributes() {
        entry.setInternalAttributes(0x1234);
        assertEquals(0x1234, entry.getInternalAttributes());
    }

    @Test
    public void testSetAndGetExternalAttributes() {
        entry.setExternalAttributes(0x12345678L);
        assertEquals(0x12345678L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixModeWithDirectory() {
        entry.setName("dir/");
        entry.setUnixMode(0755);
        assertEquals(0755, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        long attrs = entry.getExternalAttributes();
        assertTrue((attrs & 0x10) != 0);
    }

    @Test
    public void testSetUnixModeWithFileReadWrite() {
        entry.setName("file.txt");
        entry.setUnixMode(0644);
        assertEquals(0644, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        long attrs = entry.getExternalAttributes();
        assertTrue((attrs & 1) == 0);
    }

    @Test
    public void testSetUnixModeWithFileReadOnly() {
        entry.setName("file.txt");
        entry.setUnixMode(0444);
        assertEquals(0444, entry.getUnixMode());
        long attrs = entry.getExternalAttributes();
        assertTrue((attrs & 1) != 0);
    }

    @Test
    public void testGetUnixModeWhenNotUnix() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_FAT);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatformDefault() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetPlatform() {
        entry.setPlatform(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
    }

    @Test
    public void testAddExtraFieldBasic() {
        ZipExtraField field = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        entry.addExtraField(field);
        assertSame(field, entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testAddExtraFieldReplace() {
        ZipExtraField field1 = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        ZipExtraField field2 = new ExtraFieldStub(HEADER_ID, CENTRAL_DATA);
        entry.addExtraField(field1);
        entry.addExtraField(field2);
        assertSame(field2, entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testAddExtraFieldUnparseable() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testAddAsFirstExtraFieldToEmpty() {
        ZipExtraField field = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        entry.addAsFirstExtraField(field);
        assertSame(field, entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testAddAsFirstExtraFieldWithExisting() {
        ZipShort firstHeader = new ZipShort(0x0001);
        ZipShort secondHeader = new ZipShort(0x0002);
        ZipExtraField first = new ExtraFieldStub(firstHeader, EXTRA_DATA);
        ZipExtraField second = new ExtraFieldStub(secondHeader, CENTRAL_DATA);
        entry.addExtraField(first);
        entry.addAsFirstExtraField(second);
        assertEquals(second, entry.getExtraFields()[0]);
        assertEquals(first, entry.getExtraField(firstHeader));
    }

    @Test
    public void testRemoveExtraField() {
        ZipExtraField field = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        entry.addExtraField(field);
        entry.removeExtraField(HEADER_ID);
        assertNull(entry.getExtraField(HEADER_ID));
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveExtraFieldNotPresent() {
        entry.removeExtraField(HEADER_ID);
    }

    @Test
    public void testRemoveUnparseableExtraField() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testRemoveUnparseableExtraFieldNotPresent() {
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testGetExtraFieldNotPresent() {
        assertNull(entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testGetExtraFieldsEmpty() {
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testGetExtraFieldsIncludeUnparseableOnly() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        ZipExtraField[] fields = entry.getExtraFields(true);
        assertEquals(1, fields.length);
        assertSame(unparseable, fields[0]);
    }

    @Test
    public void testGetExtraFieldsExcludeUnparseableOnly() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(unparseable);
        assertEquals(0, entry.getExtraFields(false).length);
    }

    @Test
    public void testGetExtraFieldsWithBoth() throws ZipException {
        ZipExtraField normal = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.addExtraField(normal);
        entry.addExtraField(unparseable);
        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(2, entry.getExtraFields(true).length);
    }

    @Test
    public void testSetExtraWithNull() {
        entry.setExtra((byte[]) null);
        assertNotNull(entry.getExtraFields());
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getLocalFileDataExtra());
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraWithInvalidData() {
        entry.setExtra(new byte[] {0x00, 0x01});
    }

    @Test
    public void testSetExtraWithValidData() {
        byte[] data = new byte[] {0x01, 0x00, 0x04, 0x00, 1, 2, 3, 4};
        entry.setExtra(data);
        assertNotNull(entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        byte[] central = new byte[] {0x01, 0x00, 0x04, 0x00, 5, 6, 7, 8};
        entry.setCentralDirectoryExtra(central);
        assertNotNull(entry.getCentralDirectoryExtra());
    }

    @Test
    public void testGetLocalFileDataExtraNoFields() {
        byte[] extras = entry.getLocalFileDataExtra();
        assertNotNull(extras);
        assertEquals(0, extras.length);
    }

    @Test
    public void testGetName() {
        assertEquals("test", entry.getName());
    }

    @Test
    public void testIsDirectory() {
        assertFalse(entry.isDirectory());
        entry.setName("sub/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testGetSizeDefault() {
        assertEquals(ZipArchiveEntry.SIZE_UNKNOWN, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() {
        entry.setSize(-1);
    }

    @Test
    public void testSetSizeZero() {
        entry.setSize(0);
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testSetSizePositive() {
        entry.setSize(100L);
        assertEquals(100L, entry.getSize());
    }

    @Test
    public void testGetRawNameDefault() {
        assertNull(entry.getRawName());
    }

    @Test
    public void testGetLastModifiedDate() {
        entry.setTime(123456789L);
        Date d = entry.getLastModifiedDate();
        assertEquals(123456789L, d.getTime());
    }

    @Test
    public void testGetGeneralPurposeBit() {
        assertNotNull(entry.getGeneralPurposeBit());
    }

    @Test
    public void testSetGeneralPurposeBit() {
        GeneralPurposeBit gpb = new GeneralPurposeBit();
        gpb.useDataDescriptor(true);
        entry.setGeneralPurposeBit(gpb);
        assertSame(gpb, entry.getGeneralPurposeBit());
    }

    @Test
    public void testHasExtraField() {
        entry.addExtraField(new ExtraFieldStub(HEADER_ID, EXTRA_DATA));
        assertTrue(entry.hasExtraField(HEADER_ID));
        assertFalse(entry.hasExtraField(new ZipShort((short) 99)));
    }

    @Test
    public void testHashCodeConsistent() {
        entry.setName("hash");
        int h1 = entry.hashCode();
        int h2 = new ZipArchiveEntry("hash").hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCodeDifferentNames() {
        assertTrue(entry.hashCode() != new ZipArchiveEntry("other").hashCode());
    }

    @Test
    public void testEqualsSameObject() {
        assertTrue(entry.equals(entry));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(entry.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        assertFalse(entry.equals(new Object()));
    }

    @Test
    public void testEqualsSameValues() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("same");
        ZipArchiveEntry e2 = new ZipArchiveEntry("same");
        assertTrue(e1.equals(e2));
        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    public void testEqualsDifferentNames() {
        ZipArchiveEntry other = new ZipArchiveEntry("different");
        assertFalse(entry.equals(other));
    }

    @Test
    public void testEqualsBothNameNull() throws ZipException {
        ZipArchiveEntry e1 = new ZipArchiveEntry("x");
        ZipArchiveEntry e2 = new ZipArchiveEntry("x");
        assertEquals(e1, e2);
    }

    @Test
    public void testEqualsDifferentTimeUnits() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("time");
        e1.setTime(1000);
        ZipArchiveEntry e2 = new ZipArchiveEntry("time");
        e2.setTime(1000);
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsSameNameDifferentTime() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("t");
        e1.setTime(1000);
        ZipArchiveEntry e2 = new ZipArchiveEntry("t");
        e2.setTime(2000);
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testToStringNotNull() {
        assertNotNull(entry.toString());
    }

    @Test
    public void testSetNameNull() {
        entry.setName(null);
        assertNull(entry.getName());
    }

    @Test
    public void testGetRawNameWithExtra() throws ZipException {
        byte[] raw = new byte[] {1, 2, 3};
        entry.setName(new String(raw, java.nio.charset.StandardCharsets.ISO_8859_1));
        byte[] copy = entry.getRawName();
        assertNotNull(copy);
    }

    @Test
    public void testGetCentralDirectoryExtraNoFields() {
        byte[] central = entry.getCentralDirectoryExtra();
        assertNotNull(central);
        assertEquals(0, central.length);
    }

    @Test
    public void testGetExtraFieldsReturnsNonModifiableArray() throws ZipException {
        ZipExtraField field = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        entry.addExtraField(field);
        ZipExtraField[] fields = entry.getExtraFields();
        try {
            fields[0] = new ExtraFieldStub(new ZipShort((short) 99), EXTRA_DATA);
        } catch (Exception e) {
        }
        assertNotNull(entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testSetNameWithDirectorySlash() {
        entry.setName("folder/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testGetUnixModeAfterSetUnixModeRepeated() {
        entry.setName("file");
        entry.setUnixMode(0755);
        entry.setUnixMode(0600);
        assertEquals(0600, entry.getUnixMode());
    }

    @Test
    public void testSetExtraFieldsWithNull() {
        entry.setExtraFields(null);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testSetExtraFieldsWithEmpty() {
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testSetExtraFieldsWithUnparseable() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData();
        entry.setExtraFields(new ZipExtraField[] {unparseable});
        assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testSetExtraFieldsNormal() {
        ZipExtraField field = new ExtraFieldStub(HEADER_ID, EXTRA_DATA);
        entry.setExtraFields(new ZipExtraField[] {field});
        assertSame(field, entry.getExtraField(HEADER_ID));
    }

    @Test
    public void testSetExtraFieldsReplacesExisting() throws ZipException {
        ZipExtraField oldField = new ExtraFieldStub(new ZipShort((short) 1), EXTRA_DATA);
        ZipExtraField newField = new ExtraFieldStub(new ZipShort((short) 2), EXTRA_DATA);
        entry.addExtraField(oldField);
        entry.setExtraFields(new ZipExtraField[] {newField});
        assertEquals(1, entry.getExtraFields().length);
        assertNull(entry.getExtraField(new ZipShort((short) 1)));
    }

    private static class ExtraFieldStub implements ZipExtraField {
        private final ZipShort headerId;
        private final byte[] localData;
        private final byte[] centralData;

        ExtraFieldStub(ZipShort headerId, byte[] data) {
            this.headerId = headerId;
            this.localData = data;
            this.centralData = data;
        }

        @Override
        public ZipShort getHeaderId() {
            return headerId;
        }

        @Override
        public ZipShort getLocalFileDataLength() {
            return new ZipShort(localData.length);
        }

        @Override
        public ZipShort getCentralDirectoryLength() {
            return new ZipShort(centralData.length);
        }

        @Override
        public byte[] getLocalFileDataData() {
            return localData;
        }

        @Override
        public byte[] getCentralDirectoryData() {
            return centralData;
        }

        @Override
        public void parseFromLocalFileData(byte[] buffer, int offset, int length) throws ZipException {
        }

        @Override
        public void parseFromCentralDirectoryData(byte[] buffer, int offset, int length) throws ZipException {
        }
    }
}