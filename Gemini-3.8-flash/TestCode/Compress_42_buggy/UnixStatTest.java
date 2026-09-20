package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test suite for {@link UnixStat}.
 * Verifies standard Unix file mode constants, permissions, and bitmask logic.
 */
public class UnixStatTest {

    private static class UnixStatImpl implements UnixStat {
        // Concrete implementation to verify interface contract inheritance
    }

    @Test
    public void permMask_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 4095; // 07777 in decimal (0xFFF)
        int actual = UnixStat.PERM_MASK;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(07777, actual);
    }

    @Test
    public void linkFlag_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 40960; // 0120000 in decimal (0xA000)
        int actual = UnixStat.LINK_FLAG;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0120000, actual);
    }

    @Test
    public void fileFlag_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 32768; // 0100000 in decimal (0x8000)
        int actual = UnixStat.FILE_FLAG;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0100000, actual);
    }

    @Test
    public void dirFlag_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 16384; // 040000 in decimal (0x4000)
        int actual = UnixStat.DIR_FLAG;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(040000, actual);
    }

    @Test
    public void defaultLinkPerm_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 511; // 0777 in decimal (0x1FF)
        int actual = UnixStat.DEFAULT_LINK_PERM;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0777, actual);
    }

    @Test
    public void defaultDirPerm_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 493; // 0755 in decimal (0x1ED)
        int actual = UnixStat.DEFAULT_DIR_PERM;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0755, actual);
    }

    @Test
    public void defaultFilePerm_givenConstant_shouldMatchOctalValue() {
        // Arrange & Act
        int expected = 420; // 0644 in decimal (0x1A4)
        int actual = UnixStat.DEFAULT_FILE_PERM;

        // Assert
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0644, actual);
    }

    @Test
    public void permMask_givenFileMode_shouldExtractExactPermissions() {
        // Arrange
        int fileMode = UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM;
        int dirMode = UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM;
        int linkMode = UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM;

        // Act & Assert
        Assert.assertEquals(UnixStat.DEFAULT_FILE_PERM, fileMode & UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.DEFAULT_DIR_PERM, dirMode & UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.DEFAULT_LINK_PERM, linkMode & UnixStat.PERM_MASK);
    }

    @Test
    public void permMask_givenTypeFlags_shouldNotOverlapWithPermissions() {
        // Act & Assert
        Assert.assertEquals(0, UnixStat.LINK_FLAG & UnixStat.PERM_MASK);
        Assert.assertEquals(0, UnixStat.FILE_FLAG & UnixStat.PERM_MASK);
        Assert.assertEquals(0, UnixStat.DIR_FLAG & UnixStat.PERM_MASK);
    }

    @Test
    public void permMask_givenDefaultPerms_shouldRemainUnchangedWhenMasked() {
        // Act & Assert
        Assert.assertEquals(UnixStat.DEFAULT_LINK_PERM, UnixStat.DEFAULT_LINK_PERM & UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.DEFAULT_DIR_PERM, UnixStat.DEFAULT_DIR_PERM & UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.DEFAULT_FILE_PERM, UnixStat.DEFAULT_FILE_PERM & UnixStat.PERM_MASK);
    }

    @Test
    public void typeFlags_givenCombinedModes_shouldIsolateTypeFlagsCorrectly() {
        // Arrange
        int fileMode = UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM;
        int dirMode = UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM;
        int linkMode = UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM;

        // Act & Assert
        Assert.assertEquals(UnixStat.FILE_FLAG, fileMode & ~UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.DIR_FLAG, dirMode & ~UnixStat.PERM_MASK);
        Assert.assertEquals(UnixStat.LINK_FLAG, linkMode & ~UnixStat.PERM_MASK);
    }

    @Test
    public void typeFlags_givenDifferentConstants_shouldBeDistinct() {
        // Act & Assert
        Assert.assertTrue(UnixStat.LINK_FLAG != UnixStat.FILE_FLAG);
        Assert.assertTrue(UnixStat.LINK_FLAG != UnixStat.DIR_FLAG);
        Assert.assertTrue(UnixStat.FILE_FLAG != UnixStat.DIR_FLAG);
    }

    @Test
    public void interfaceImplementation_givenClassImplementingUnixStat_shouldAccessIdenticalValues() {
        // Arrange
        UnixStat instance = new UnixStatImpl();

        // Act & Assert
        Assert.assertNotNull(instance);
        Assert.assertEquals(UnixStat.PERM_MASK, UnixStatImpl.PERM_MASK);
        Assert.assertEquals(UnixStat.LINK_FLAG, UnixStatImpl.LINK_FLAG);
        Assert.assertEquals(UnixStat.FILE_FLAG, UnixStatImpl.FILE_FLAG);
        Assert.assertEquals(UnixStat.DIR_FLAG, UnixStatImpl.DIR_FLAG);
        Assert.assertEquals(UnixStat.DEFAULT_LINK_PERM, UnixStatImpl.DEFAULT_LINK_PERM);
        Assert.assertEquals(UnixStat.DEFAULT_DIR_PERM, UnixStatImpl.DEFAULT_DIR_PERM);
        Assert.assertEquals(UnixStat.DEFAULT_FILE_PERM, UnixStatImpl.DEFAULT_FILE_PERM);
    }
}