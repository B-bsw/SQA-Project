package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnixStatTest {

    @Test
    public void testMaskPermissions() {
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
    public void testDefaultLinkPermissions() {
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirectoryPermissions() {
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePermissions() {
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testPermissionsMaskedConsistency() {
        assertEquals(UnixStat.PERM_MASK & UnixStat.DEFAULT_FILE_PERM, 
                     UnixStat.DEFAULT_FILE_PERM & UnixStat.PERM_MASK);
    }
}