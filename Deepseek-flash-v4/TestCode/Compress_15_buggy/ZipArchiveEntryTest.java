package org.apache.commons.compress.archivers.zip;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;

import static org.junit.Assert.*;

public class ZipArchiveEntryTest {

    private ZipArchiveEntry entry;
    private static final ZipShort ASI_HEADER_ID = new ZipShort(0x4153); // "AS"

    @Before
    public void setUp() {
        entry = new ZipArchiveEntry("test.txt");
    }

    @Test
    public void testConstructorWithName() {
        assertEquals("test.txt", entry.getName());
        assertFalse(entry.isDirectory());
        assertEquals(-1, entry.getMethod());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
        assertEquals(0, entry.getInternalAttributes());
        assertEquals(0L, entry.getExternalAttributes());
        assertNull(entry.getRawName());
        assertNotNull(entry.getGeneralPurposeBit());
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getExtraField(ASI_HEADER_ID));
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testConstructorWithDirectoryName() {
        ZipArchiveEntry dirEntry = new ZipArchiveEntry("folder/");
        assertTrue(dirEntry.isDirectory());
    }

    @Test
    public void testCopyConstructorFromZipEntry() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("copy.txt");
        zipEntry.setSize(100);
        zipEntry.setMethod(java.util.zip.ZipEntry.DEFLATED);
        ZipArchiveEntry copyEntry = new ZipArchiveEntry(zipEntry);
        assertEquals("copy.txt", copyEntry.getName());
        assertEquals(100, copyEntry.getSize());
        assertEquals(java.util.zip.ZipEntry.DEFLATED, copyEntry.getMethod());
    }

    @Test
    public void testCopyConstructorFromNullZipEntry() throws ZipException {
        java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("null.txt");
        zipEntry.setExtra(new byte[]{1, 2, 3});
        try {
            new ZipArchiveEntry(zipEntry);
            fail("Expected ZipException for invalid extra data");
        } catch (ZipException e) {
            // expected
        }
    }

    @Test
    public void testCopyConstructorFromZipArchiveEntry() throws ZipException {
        entry.setInternalAttributes(1);
        entry.setExternalAttributes(0x100L);
        entry.setUnixMode(0644);
        ZipArchiveEntry copy = new ZipArchiveEntry(entry);
        assertEquals(1, copy.getInternalAttributes());
        assertEquals(0x100L, copy.getExternalAttributes());
        assertEquals(Integer.toOctalString(0644), Integer.toOctalString(copy.getUnixMode()));
    }

    @Test
    public void testProtectedConstructorWithEmptyName() {
        ZipArchiveEntry emptyEntry = new ZipArchiveEntry(""){};
        assertEquals("", emptyEntry.getName());
        assertTrue(emptyEntry.getName().isEmpty());
    }

    @Test
    public void testConstructorFromFileAndDirectory() {
        File dir = new File(".");
        ZipArchiveEntry fileEntry = new ZipArchiveEntry(dir, "name");
        assertTrue(fileEntry.isDirectory());
        assertEquals("name/", fileEntry.getName());
    }

    @Test
    public void testConstructorFromFile() {
        File file = new File(".");
        long beforeTime = System.currentTimeMillis();
        ZipArchiveEntry fileEntry = new ZipArchiveEntry(file, "file.txt");
        assertTrue(fileEntry.getSize() > 0);
        assertTrue(fileEntry.getTime() <= beforeTime);
        assertFalse(fileEntry.isDirectory());
    }

    @Test
    public void testClone() {
        entry.setInternalAttributes(5);
        entry.setExternalAttributes(10L);
        entry.setUnixMode(0755);
        ZipArchiveEntry cloned = (ZipArchiveEntry) entry.clone();
        assertNotSame(entry, cloned);
        assertEquals(5, cloned.getInternalAttributes());
        assertEquals(10L, cloned.getExternalAttributes());
        assertEquals(0755, cloned.getUnixMode());
    }

    @Test
    public void testSetAndGetMethod() {
        entry.setMethod(8);
        assertEquals(8, entry.getMethod());
    }

    @Test
    public void testSetMethodNegative() {
        try {
            entry.setMethod(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetMethodZero() {
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
    }

    @Test
    public void testSetMethodLarge() {
        entry.setMethod(2000);
        assertEquals(2000, entry.getMethod());
    }

    @Test
    public void testInternalAttributes() {
        entry.setInternalAttributes(256);
        assertEquals(256, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributes() {
        entry.setExternalAttributes(0x100L);
        assertEquals(0x100L, entry.getExternalAttributes());
    }

    @Test
    public void testSetUnixMode() {
        entry.setUnixMode(0644);
        assertEquals(0644, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
    }

    @Test
    public void testSetUnixModeForDirectory() {
        entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0755);
        assertEquals(0755, entry.getUnixMode());
        assertTrue((entry.getExternalAttributes() & 0x10) != 0);
    }

    @Test
    public void testGetUnixModeForFatPlatform() {
        entry.setPlatform(0);
        assertEquals(0, entry.getUnixMode());
    }

    @Test
    public void testGetPlatformDefault() {
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, new ZipArchiveEntry("x").getPlatform());
    }

    @Test
    public void testSetPlatformProtected() {
        ZipArchiveEntry e = new ZipArchiveEntry("x") {
            public void setPlat(int p) {
                setPlatform(p);
            }
        };
        e.setPlat(ZipArchiveEntry.PLATFORM_UNIX);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, e.getPlatform());
    }

    @Test
    public void testSetExtraFields() {
        ZipExtraField[] fields = new ZipExtraField[0];
        entry.setExtraFields(fields);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testSetExtraFieldsWithNull() {
        entry.setExtraFields(null);
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testGetExtraFieldsEmpty() {
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields(false).length);
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testGetExtraFieldsWithContent() {
        ZipExtraField field = new AsiExtraField();
        entry.addExtraField(field);
        assertEquals(1, entry.getExtraFields(false).length);
        assertEquals(1, entry.getExtraFields(true).length);
    }

    @Test
    public void testGetExtraFieldsIncludeUnparseable() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData(new byte[]{1, 2, 3});
        entry.addExtraField(unparseable);
        assertEquals(0, entry.getExtraFields(false).length);
        assertEquals(1, entry.getExtraFields(true).length);
        assertSame(unparseable, entry.getExtraFields(true)[0]);
    }

    @Test
    public void testAddExtraField() {
        ZipExtraField field = new AsiExtraField();
        entry.addExtraField(field);
        assertSame(field, entry.getExtraField(field.getHeaderId()));
    }

    @Test
    public void testAddExtraFieldReplaceExisting() {
        AsiExtraField field1 = new AsiExtraField();
        ZipExtraField field2 = new AsiExtraField();
        entry.addExtraField(field1);
        entry.addExtraField(field2);
        assertSame(field2, entry.getExtraField(field1.getHeaderId()));
    }

    @Test
    public void testAddExtraFieldWithUnparseable() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData(new byte[]{1, 2, 3});
        entry.addExtraField(unparseable);
        assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testAddAsFirstExtraField() {
        ZipExtraField field = new AsiExtraField();
        entry.addAsFirstExtraField(field);
        assertSame(field, entry.getExtraField(field.getHeaderId()));
    }

    @Test
    public void testAddAsFirstExtraFieldWithUnparseable() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData(new byte[]{1, 2, 3});
        entry.addAsFirstExtraField(unparseable);
        assertSame(unparseable, entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveExtraField() {
        ZipExtraField field = new AsiExtraField();
        entry.addExtraField(field);
        entry.removeExtraField(field.getHeaderId());
        assertNull(entry.getExtraField(field.getHeaderId()));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveExtraFieldNonExistent() {
        entry.removeExtraField(new ZipShort(0x1234));
    }

    @Test
    public void testRemoveUnparseableExtraFieldData() {
        UnparseableExtraFieldData unparseable = new UnparseableExtraFieldData(new byte[]{1, 2, 3});
        entry.addExtraField(unparseable);
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataNotPresent() {
        entry.removeUnparseableExtraFieldData();
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testGetExtraFieldNonExistent() {
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testSetExtra() throws ZipException {
        byte[] data = new byte[]{0x01, 0x02, 0x00, 0x00};
        entry.setExtra(data);
        assertNotNull(entry.getExtra());
        assertEquals(4, entry.getExtra().length);
    }

    @Test(expected = RuntimeException.class)
    public void testSetExtraWithInvalidData() {
        byte[] data = new byte[]{0x01, 0x02, 0x03};
        entry.setExtra(data);
    }

    @Test
    public void testSetCentralDirectoryExtra() {
        ZipExtraField field = new AsiExtraField();
        entry.addExtraField(field);
        byte[] centralData = entry.getCentralDirectoryExtra();
        assertNotNull(centralData);
        assertTrue(centralData.length > 0);
    }

    @Test
    public void testGetLocalFileDataExtra() {
        byte[] data = entry.getLocalFileDataExtra();
        assertNotNull(data);
    }

    @Test
    public void testSetTime() {
        long time = System.currentTimeMillis();
        entry.setTime(time);
        assertEquals(time, entry.getTime());
    }

    @Test
    public void testGetLastModifiedDate() {
        long time = System.currentTimeMillis();
        entry.setTime(time);
        Date d = entry.getLastModifiedDate();
        assertNotNull(d);
        assertTrue(Math.abs(d.getTime() - time) < 1000);
    }

    @Test
    public void testGetRawName() {
        ZipArchiveEntry e = new ZipArchiveEntry("name.txt");
        byte[] b = e.getRawName();
        assertNull(b);
    }

    @Test
    public void testHttpGetNameWithRawName() throws ZipException, IOException {
        byte[] rawNameBytes = "raw".getBytes("UTF-8");
        ZipArchiveEntry e = new ZipArchiveEntry("raw.txt") {
            @Override
            public byte[] getRawName() {
                return rawNameBytes;
            }
        };
        assertEquals("raw.txt", e.getName());
    }

    @Test
    public void testHashCode() {
        entry.setName("hashMe");
        assertEquals("hashMe".hashCode(), entry.hashCode());
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
    public void testEqualsIdenticalFields() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("same.txt");
        ZipArchiveEntry e2 = new ZipArchiveEntry("same.txt");
        e1.setSize(100);
        e2.setSize(100);
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsBothNullNames() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        e1.setName("");
        e2.setName("");
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testEqualsOneNullName() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("a");
        ZipArchiveEntry e2 = new ZipArchiveEntry("b");
        e1.setName("");
        e2.setName("x");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testEqualsDifferentComments() {
        ZipArchiveEntry e1 = new ZipArchiveEntry("c");
        ZipArchiveEntry e2 = new ZipArchiveEntry("c");
        e1.setComment(null);
        e2.setComment("comment");
        assertFalse(e1.equals(e2));

        e1.setComment("comment");
        e2.setComment(null);
        assertFalse(e1.equals(e2));

        e1.setComment("a");
        e2.setComment("b");
        assertFalse(e1.equals(e2));
    }

    @Test
    public void testGetSetName() {
        entry.setName("newName");
        assertEquals("newName", entry.getName());
    }

    @Test
    public void testSetSizeNegative() {
        try {
            entry.setSize(-1);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testSetSizeZero() {
        entry.setSize(0);
        assertEquals(0, entry.getSize());
    }

    @Test
    public void testSetSizeLarge() {
        entry.setSize(0x100000000L);
        assertEquals(0x100000000L, entry.getSize());
    }

    @Test
    public void testGetSize() {
        entry.setSize(10);
        assertEquals(10, entry.getSize());
    }

    @Test
    public void testIsDirectory() {
        entry.setName("folder/");
        assertTrue(entry.isDirectory());
    }

    @Test
    public void testCheckUnixMode() {
        entry.setUnixMode(0755);
        assertEquals(0755, entry.getUnixMode());
        entry.setUnixMode(0644);
        assertEquals(0644, entry.getUnixMode());
    }

    @Test
    public void testGetCentralDirectoryExtra() {
        ZipExtraField field = new AsiExtraField();
        entry.addExtraField(field);
        assertNotNull(entry.getCentralDirectoryExtra());
        assertEquals(4, entry.getCentralDirectoryExtra().length);
    }

    @Test
    public void testGetExtraFieldsWithNullExtra() {
        ZipArchiveEntry e = new ZipArchiveEntry("x");
        e.setExtra(new byte[] {1,2,3,4});
        ZipExtraField[] fields = e.getExtraFields();
        assertEquals(0, fields.length);
    }

    @Test
    public void testGetExtraFieldsWithParseableExtra() throws ZipException {
        byte[] extraData = new byte[] {0x01, 0x02, 0x00, 0x00};
        entry.setExtra(extraData);
        assertEquals(0, entry.getExtraFields().length);
    }
}