package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UnixStatTest {

    @Test
    public void testPermMaskValue() {
        assertEquals(07777, UnixStat.PERM_MASK);
    }

    @Test
    public void testLinkFlagValue() {
        assertEquals(0120000, UnixStat.LINK_FLAG);
    }

    @Test
    public void testFileFlagValue() {
        assertEquals(0100000, UnixStat.FILE_FLAG);
    }

    @Test
    public void testDirFlagValue() {
        assertEquals(040000, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultLinkPermValue() {
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirPermValue() {
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePermValue() {
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testFlagsAreDistinct() {
        assertTrue(UnixStat.LINK_FLAG != UnixStat.FILE_FLAG);
        assertTrue(UnixStat.FILE_FLAG != UnixStat.DIR_FLAG);
        assertTrue(UnixStat.LINK_FLAG != UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultPermsWithinMask() {
        assertEquals(UnixStat.DEFAULT_LINK_PERM, UnixStat.DEFAULT_LINK_PERM & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_DIR_PERM, UnixStat.DEFAULT_DIR_PERM & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_FILE_PERM, UnixStat.DEFAULT_FILE_PERM & UnixStat.PERM_MASK);
    }

    @Test
    public void testFlagBitsDoNotOverlapWithPermMask() {
        assertEquals(0, UnixStat.LINK_FLAG & UnixStat.PERM_MASK);
        assertEquals(0, UnixStat.FILE_FLAG & UnixStat.PERM_MASK);
        assertEquals(0, UnixStat.DIR_FLAG & UnixStat.PERM_MASK);
    }

    @Test
    public void testInterfaceIsImplementable() {
        UnixStat stat = new UnixStat() {
        };
        assertEquals(07777, stat.PERM_MASK);
    }

    @Test
    public void testConstantsAreCompileTimeConstants() {
        final int perm = UnixStat.PERM_MASK;
        final int link = UnixStat.LINK_FLAG;
        final int file = UnixStat.FILE_FLAG;
        final int dir = UnixStat.DIR_FLAG;
        final int defLink = UnixStat.DEFAULT_LINK_PERM;
        final int defDir = UnixStat.DEFAULT_DIR_PERM;
        final int defFile = UnixStat.DEFAULT_FILE_PERM;

        assertEquals(4095, perm);
        assertEquals(40960, link);
        assertEquals(32768, file);
        assertEquals(16384, dir);
        assertEquals(511, defLink);
        assertEquals(493, defDir);
        assertEquals(420, defFile);
    }
}