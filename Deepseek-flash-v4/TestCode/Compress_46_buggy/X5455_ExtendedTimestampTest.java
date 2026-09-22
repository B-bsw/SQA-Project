package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.zip.ZipException;

import org.junit.Before;
import org.junit.Test;

public class X5455_ExtendedTimestampTest {

    private X5455_ExtendedTimestamp xt;
    private static final int DWORD = 4;

    @Before
    public void setUp() {
        xt = new X5455_ExtendedTimestamp();
    }

    @Test
    public void testInitialState() {
        assertNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
        assertNull(xt.getModifyJavaTime());
        assertNull(xt.getAccessJavaTime());
        assertNull(xt.getCreateJavaTime());
        assertEquals(0, xt.getFlags());
        assertEquals(new ZipShort(0x5455), xt.getHeaderId());
        assertEquals(new ZipShort(1), xt.getLocalFileDataLength());
        assertEquals(new ZipShort(1), xt.getCentralDirectoryLength());
    }

    @Test
    public void testSetFlagsOnly() {
        xt.setFlags((byte) 0x07);
        assertEquals((byte) 0x07, xt.getFlags());
        assertTrue(xt.isBit0_modifyTimePresent());
        assertTrue(xt.isBit1_accessTimePresent());
        assertTrue(xt.isBit2_createTimePresent());
        assertNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
        assertEquals(new ZipShort(1), xt.getLocalFileDataLength());
        assertEquals(new ZipShort(1), xt.getCentralDirectoryLength());
    }

    @Test
    public void testSetModifyTime() {
        final ZipLong time = new ZipLong(1234567890L);
        xt.setModifyTime(time);
        assertSame(time, xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
        assertEquals((byte) 0, xt.getFlags());
        assertEquals(new ZipShort(1 + DWORD), xt.getLocalFileDataLength());
        assertEquals(new ZipShort(1 + DWORD), xt.getCentralDirectoryLength());
        assertEquals(5, xt.getLocalFileDataData().length);
        assertEquals(5, xt.getCentralDirectoryData().length);
    }

    @Test
    public void testSetAccessTime() {
        final ZipLong time = new ZipLong(123456789L);
        xt.setAccessTime(time);
        assertSame(time, xt.getAccessTime());
        assertNull(xt.getModifyTime());
        assertNull(xt.getCreateTime());
        assertEquals(1, xt.getLocalFileDataLength().getValue());
        assertEquals(0, xt.getLocalFileDataData()[0]);
    }

    @Test
    public void testSetCreateTime() {
        final ZipLong time = new ZipLong(12345678L);
        xt.setCreateTime(time);
        assertSame(time, xt.getCreateTime());
        assertNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertEquals(1, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testSetJavaTimes() {
        final Date d = new Date(1000L * 1234567890L);
        xt.setModifyJavaTime(d);
        assertEquals(new ZipLong(1234567890L), xt.getModifyTime());
        assertEquals(d, xt.getModifyJavaTime());

        xt.setAccessJavaTime(d);
        assertEquals(new ZipLong(1234567890L), xt.getAccessTime());
        assertEquals(d, xt.getAccessJavaTime());

        xt.setCreateJavaTime(d);
        assertEquals(new ZipLong(1234567890L), xt.getCreateTime());
        assertEquals(d, xt.getCreateJavaTime());
    }

    @Test
    public void testSetNullJavaTimes() {
        xt.setModifyJavaTime(null);
        assertNull(xt.getModifyTime());
        assertNull(xt.getModifyJavaTime());

        xt.setAccessJavaTime(null);
        assertNull(xt.getAccessTime());
        assertNull(xt.getAccessJavaTime());

        xt.setCreateJavaTime(null);
        assertNull(xt.getCreateTime());
        assertNull(xt.getCreateJavaTime());
    }

    @Test
    public void testParseFromLocalFileDataModifyOnly() throws ZipException {
        final byte[] data = new byte[5];
        data[0] = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
        final ZipLong zl = new ZipLong(987654321L);
        System.arraycopy(zl.getBytes(), 0, data, 1, DWORD);
        xt.parseFromLocalFileData(data, 0, 5);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertFalse(xt.isBit1_accessTimePresent());
        assertFalse(xt.isBit2_createTimePresent());
        assertEquals(zl, xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
        assertEquals(5, xt.getLocalFileDataLength().getValue());
        assertEquals(5, xt.getCentralDirectoryLength().getValue());
        final byte[] out = xt.getLocalFileDataData();
        assertEquals(5, out.length);
        assertEquals((byte) X5455_ExtendedTimestamp.MODIFY_TIME_BIT, out[0]);
    }

    @Test
    public void testParseFromLocalFileDataAllThree() throws ZipException {
        final byte[] data = new byte[13];
        data[0] = 0x07;
        final ZipLong mt = new ZipLong(111111L);
        final ZipLong at = new ZipLong(222222L);
        final ZipLong ct = new ZipLong(333333L);
        System.arraycopy(mt.getBytes(), 0, data, 1, DWORD);
        System.arraycopy(at.getBytes(), 0, data, 5, DWORD);
        System.arraycopy(ct.getBytes(), 0, data, 9, DWORD);
        xt.parseFromLocalFileData(data, 0, data.length);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertTrue(xt.isBit1_accessTimePresent());
        assertTrue(xt.isBit2_createTimePresent());
        assertEquals(mt, xt.getModifyTime());
        assertEquals(at, xt.getAccessTime());
        assertEquals(ct, xt.getCreateTime());
        assertEquals(13, xt.getLocalFileDataLength().getValue());
        assertEquals(5, xt.getCentralDirectoryLength().getValue());
        final byte[] central = xt.getCentralDirectoryData();
        assertEquals(5, central.length);
        assertEquals((byte) 0x03, central[0]);
    }

    @Test
    public void testParseFromCentralDirectoryData() throws ZipException {
        final byte[] data = new byte[5];
        data[0] = X5455_ExtendedTimestamp.MODIFY_TIME_BIT;
        final ZipLong mt = new ZipLong(555555L);
        System.arraycopy(mt.getBytes(), 0, data, 1, DWORD);
        xt.parseFromCentralDirectoryData(data, 0, data.length);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertEquals(mt, xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
        assertEquals(5, xt.getLocalFileDataLength().getValue());
        assertEquals(5, xt.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testParseFromCentralDirectoryDataWithExtraBitsCleared() throws ZipException {
        final byte[] data = new byte[5];
        data[0] = 0x07;
        System.arraycopy(new ZipLong(42L).getBytes(), 0, data, 1, DWORD);
        xt.parseFromCentralDirectoryData(data, 0, data.length);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertFalse(xt.isBit1_accessTimePresent());
        assertFalse(xt.isBit2_createTimePresent());
        assertNotNull(xt.getModifyTime());
        assertNull(xt.getAccessTime());
        assertNull(xt.getCreateTime());
    }

    @Test
    public void testParseEmptyData() throws ZipException {
        final byte[] data = new byte[1];
        data[0] = 0;
        xt.parseFromLocalFileData(data, 0, 1);
        assertFalse(xt.isBit0_modifyTimePresent());
        assertFalse(xt.isBit1_accessTimePresent());
        assertFalse(xt.isBit2_createTimePresent());
        assertNull(xt.getModifyTime());
        assertEquals(1, xt.getLocalFileDataLength().getValue());
    }

    @Test
    public void testParseBoundaryAccessTimeGoingPastEndIgnored() throws ZipException {
        final byte[] data = new byte[6];
        data[0] = (byte) 0x03;
        final ZipLong mt = new ZipLong(1L);
        System.arraycopy(mt.getBytes(), 0, data, 1, DWORD);
        data[5] = (byte) 0xFF;
        xt.parseFromCentralDirectoryData(data, 0, 6);
        assertTrue(xt.isBit0_modifyTimePresent());
        assertTrue(xt.isBit1_accessTimePresent());
        assertNull(xt.getAccessTime());
        assertEquals(1L, xt.getModifyTime().getValue());
    }

    @Test
    public void testEquals() {
        final X5455_ExtendedTimestamp other = new X5455_ExtendedTimestamp();
        assertEquals(xt, other);
        assertEquals(xt.hashCode(), other.hashCode());
        final ZipLong t = new ZipLong(1234L);
        xt.setModifyTime(t);
        other.setModifyTime(t);
        assertEquals(xt, other);
        assertEquals(xt.hashCode(), other.hashCode());
        other.setAccessTime(new ZipLong(999L));
    }

    @Test
    public void testEqualsNull() {
        assertFalse(xt.equals(null));
        assertFalse(xt.equals(new Object()));
    }

    @Test
    public void testClone() {
        xt.setModifyTime(new ZipLong(5L));
        final X5455_ExtendedTimestamp clone = (X5455_ExtendedTimestamp) xt.clone();
        assertEquals(xt, clone);
        assertNotSame(xt, clone);
        assertEquals(xt.getModifyTime(), clone.getModifyTime());
    }

    @Test
    public void testToString() {
        xt.setModifyTime(new ZipLong(5L));
        final String s = xt.toString();
        assertNotNull(s);
        assertFalse(s.isEmpty());
    }

    @Test
    public void testHashCodeConsistent() {
        final int h1 = xt.hashCode();
        assertEquals(h1, xt.hashCode());
        xt.setModifyTime(new ZipLong(1L));
        assertTrue(h1 != xt.hashCode());
    }
}