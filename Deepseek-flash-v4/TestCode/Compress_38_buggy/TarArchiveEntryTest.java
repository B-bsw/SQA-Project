package org.apache.commons.compress.archivers.tar;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TarArchiveEntryTest {

    @Test
    public void testConstructors() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        assertNotNull(entry);
        assertEquals("test.txt", entry.getName());
        assertEquals(0, entry.getSize());
        assertFalse(entry.isDirectory());
        assertFalse(entry.isFile());
        assertTrue(entry.getModTime() instanceof Date);
        
        entry = new TarArchiveEntry("dir/", true);
        assertTrue(entry.isDirectory());
        assertTrue(entry.getName().endsWith("/"));
        
        entry = new TarArchiveEntry("file.txt", TarConstants.LF_NORMAL);
        assertEquals(TarConstants.LF_NORMAL, entry.getLinkFlag());
        
        entry = new TarArchiveEntry(("file.txt"), TarConstants.LF_GNUTYPE_LONGNAME, false);
        assertEquals(TarConstants.MAGIC_GNU, entry.getMagic());
    }
    
    @Test
    public void testFileConstructor() {
        File tmp = new File("target/testfile.tmp");
        try {
            tmp.createNewFile();
            TarArchiveEntry entry = new TarArchiveEntry(tmp);
            assertEquals(tmp.getPath(), entry.getName());
            assertTrue(entry.isFile());
            assertEquals(tmp.length(), entry.getSize());
        } catch (IOException e) {
            fail();
        } finally {
            if (tmp != null) tmp.delete();
        }
    }
    
    @Test
    public void testDirEntries() {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        assertEquals(0, entry.getDirectoryEntries().length);
        
        File dir = new File("target/testdir");
        dir.mkdirs();
        File f1 = new File(dir, "a.txt");
        try {
            f1.createNewFile();
            TarArchiveEntry dEntry = new TarArchiveEntry(dir);
            assertEquals(1, dEntry.getDirectoryEntries().length);
            assertEquals("a.txt", dEntry.getDirectoryEntries()[0].getName().endsWith("a.txt")?"a.txt":dEntry.getDirectoryEntries()[0].getName().substring(dEntry.getDirectoryEntries()[0].getName().lastIndexOf(File.separator)+1));
        } catch (IOException e) {
            fail();
        } finally {
            f1.delete();
            dir.delete();
        }
    }
    
    @Test
    public void testSetSize() {
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setSize(100);
        assertEquals(100, entry.getSize());
        
        try {
            entry.setSize(-1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }
    
    @Test
    public void testSetDevMajorMinor() {
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setDevMajor(1);
        assertEquals(1, entry.getDevMajor());
        
        try {
            entry.setDevMajor(-1);
            fail();
        } catch (IllegalArgumentException e) {}
    }
    
    @Test
    public void testSetDevMinor() {
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setDevMinor(2);
        assertEquals(2, entry.getDevMinor());
        
        try {
            entry.setDevMinor(-1);
            fail();
        } catch (IllegalArgumentException e) {}
    }
    
    @Test
    public void testLinkFlags() {
        TarArchiveEntry entry = new TarArchiveEntry("link", TarConstants.LF_SYMLINK);
        assertTrue(entry.isSymbolicLink());
        assertFalse(entry.isLink());
        assertFalse(entry.isCharacterDevice());
        assertFalse(entry.isBlockDevice());
        assertFalse(entry.isFIFO());
        
        entry = new TarArchiveEntry("link", TarConstants.LF_LINK);
        assertTrue(entry.isLink());
        
        entry = new TarArchiveEntry("dev", TarConstants.LF_CHR);
        assertTrue(entry.isCharacterDevice());
        
        entry = new TarArchiveEntry("dev", TarConstants.LF_BLK);
        assertTrue(entry.isBlockDevice());
        
        entry = new TarArchiveEntry("fifo", TarConstants.LF_FIFO);
        assertTrue(entry.isFIFO());
        
        entry = new TarArchiveEntry("pax", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        assertTrue(entry.isPaxHeader());
        
        entry = new TarArchiveEntry("global", TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        assertTrue(entry.isGlobalPaxHeader());
        
        entry = new TarArchiveEntry("gnu", TarConstants.LF_GNUTYPE_LONGNAME);
        assertTrue(entry.isGNULongNameEntry());
        
        entry = new TarArchiveEntry("gnuLink", TarConstants.LF_GNUTYPE_LONGLINK);
        assertTrue(entry.isGNULongLinkEntry());
    }
    
    @Test
    public void testSparseChecks() {
        TarArchiveEntry entry = new TarArchiveEntry("f");
        assertFalse(entry.isSparse());
        assertFalse(entry.isGNUSparse());
        assertFalse(entry.isOldGNUSparse());
        assertFalse(entry.isPaxGNUSparse());
        assertFalse(entry.isStarSparse());
        
        entry = new TarArchiveEntry("f", TarConstants.LF_GNUTYPE_SPARSE);
        assertTrue(entry.isOldGNUSparse());
        assertTrue(entry.isGNUSparse());
        assertTrue(entry.isSparse());
    }
    
    @Test
    public void testSetIdsNamesAndTimes() {
        TarArchiveEntry entry = new TarArchiveEntry("f");
        entry.setIds(10, 20);
        assertEquals(10, entry.getUserId());
        assertEquals(20, entry.getGroupId());
        
        entry.setNames("user", "group");
        assertEquals("user", entry.getUserName());
        assertEquals("group", entry.getGroupName());
        
        long time = 123456789L;
        entry.setModTime(time);
        assertEquals(time * 1000, entry.getModTime().getTime());
        
        Date d = new Date(time*1000);
        entry.setModTime(d);
        assertEquals(time*1000, entry.getModTime().getTime());
    }
    
    @Test
    public void testEqualsAndHashCode() {
        TarArchiveEntry e1 = new TarArchiveEntry("a");
        TarArchiveEntry e2 = new TarArchiveEntry("a");
        assertEquals(e1, e2);
        assertEquals(e1.hashCode(), e2.hashCode());
        
        e2 = new TarArchiveEntry("b");
        assertNotEquals(e1, e2);
        
        assertFalse(e1.equals(null));
        assertFalse(e1.equals(new Object()));
        
        assertFalse(e1.equals(new TarArchiveEntry("a") {{ setLinkName("x"); }}));
    }
    
    @Test
    public void testIsDescendent() {
        TarArchiveEntry dir = new TarArchiveEntry("dir");
        TarArchiveEntry sub = new TarArchiveEntry("dir/sub");
        assertTrue(sub.isDescendent(dir));
        assertFalse(dir.isDescendent(sub));
    }
    
    @Test
    public void testFieldsNullBehavior() {
        TarArchiveEntry entry = new TarArchiveEntry("name", true);
        assertEquals("name", entry.getName());
        
        entry.setName("other");
        assertFalse(entry.getName().startsWith("/"));
        
        entry.setName("/abs");
        assertFalse(entry.getName().startsWith("/"));
    }
}