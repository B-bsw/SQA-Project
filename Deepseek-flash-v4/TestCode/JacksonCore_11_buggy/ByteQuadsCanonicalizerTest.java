package com.fasterxml.jackson.core.sym;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ByteQuadsCanonicalizerTest {

    private ByteQuadsCanonicalizer root;
    private ByteQuadsCanonicalizer child;

    @Before
    public void setUp() {
        root = ByteQuadsCanonicalizer.createRoot();
        child = root.makeChild(0);
    }

    @Test
    public void testCreateRoot() {
        ByteQuadsCanonicalizer r = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(r);
        assertEquals(0, r.size());
        assertTrue(r.bucketCount() >= 16);
        assertFalse(r.maybeDirty());
        assertTrue(r.hashSeed() != 0);
    }

    @Test
    public void testMakeChildAndRelease() {
        child.addName("a", 1);
        assertEquals(1, child.size());
        assertEquals(0, root.size());
        child.release();
        assertEquals(1, root.size());
        assertTrue(root.maybeDirty());
    }

    @Test
    public void testSizeAndBucketCount() {
        assertEquals(0, child.size());
        child.addName("a", 1);
        assertEquals(1, child.size());
        assertTrue(child.bucketCount() >= 16);
        assertEquals(0, root.size());
    }

    @Test
    public void testAddNameSingle() {
        String name = "test";
        String ret = child.addName(name, 1);
        assertEquals(name, ret);
        assertSame(name, child.findName(1));
    }

    @Test
    public void testAddNameTwoQuads() {
        String name = "test2";
        String ret = child.addName(name, 1, 2);
        assertEquals(name, ret);
        assertSame(name, child.findName(1, 2));
    }

    @Test
    public void testAddNameThreeQuads() {
        String name = "test3";
        String ret = child.addName(name, 1, 2, 3);
        assertEquals(name, ret);
        assertSame(name, child.findName(1, 2, 3));
    }

    @Test
    public void testAddNameQuadArray() {
        String name = "test-array";
        int[] q = {1, 2, 3, 4, 5};
        String ret = child.addName(name, q, q.length);
        assertEquals(name, ret);
        assertSame(name, child.findName(q, q.length));
    }

    @Test
    public void testFindNameNotFound() {
        assertNull(child.findName(999));
        assertNull(child.findName(998, 997));
        assertNull(child.findName(996, 995, 994));
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertNull(child.findName(q, q.length));
    }

    @Test
    public void testAddNameOverwrite() {
        String name1 = "first";
        String name2 = "second";
        child.addName(name1, 42);
        String ret = child.addName(name2, 42);
        assertEquals(name2, ret);
        assertSame(name2, child.findName(42));
    }

    @Test
    public void testAddNameWithIntern() {
        String base = new String("interned");
        String ret = child.addName(base, 10);
        // With intern enabled, should return interned instance
        assertSame(base.intern(), ret);
    }

    @Test
    public void testMakeChildWithFlags() {
        ByteQuadsCanonicalizer c2 = root.makeChild(0);
        assertNotNull(c2);
        assertEquals(0, c2.size());
    }

    @Test
    public void testReleaseMergesChild() {
        child.addName("x", 1);
        child.addName("y", 2, 3);
        child.release();
        assertEquals(2, root.size());
        assertNotNull(root.findName(1));
        assertNotNull(root.findName(2, 3));
    }

    @Test
    public void testReleaseEmptyChild() {
        child.release();
        assertEquals(0, root.size());
    }

    @Test
    public void testCounts() {
        child.addName("a", 1);
        child.addName("b", 1, 2);
        child.addName("c", 1, 2, 3);
        child.addName("d", new int[]{1, 2, 3, 4}, 4);
        assertEquals(4, child.size());
        assertEquals(4, child.totalCount());
        assertEquals(4, child.primaryCount() + child.secondaryCount() + child.tertiaryCount() + child.spilloverCount());
    }

    @Test
    public void testFindNameWithLongName() {
        String longName = "aVeryLongNameThatExceedsTheSingleQuadLimitForSure";
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        child.addName(longName, q, q.length);
        assertSame(longName, child.findName(q, q.length));
    }

    @Test
    public void testCalcHashBoundary() {
        assertEquals(child.calcHash(Integer.MIN_VALUE), child.calcHash(0));
        assertEquals(child.calcHash(Integer.MAX_VALUE), child.calcHash(Integer.MAX_VALUE));
    }

    @Test
    public void testReleaseMultipleChildren() {
        ByteQuadsCanonicalizer c1 = root.makeChild(0);
        ByteQuadsCanonicalizer c2 = root.makeChild(0);
        c1.addName("c1name", 100);
        c2.addName("c2name", 200);
        c1.release();
        c2.release();
        assertEquals(2, root.size());
        assertNotNull(root.findName(100));
        assertNotNull(root.findName(200));
    }

    @Test
    public void testRehash() {
        for (int i = 0; i < 100; i++) {
            child.addName("name" + i, i);
        }
        assertEquals(100, child.size());
        for (int i = 0; i < 100; i++) {
            assertNotNull(child.findName(i));
        }
    }

    @Test
    public void testFindNameAfterRelease() {
        child.addName("toFind", 77);
        child.release();
        assertNotNull(root.findName(77));
        assertNull(child.findName(77));
    }

    @Test
    public void testBucketCount() {
        assertTrue(child.bucketCount() >= 16);
        int count = child.bucketCount();
        for (int i = 0; i < 100; i++) {
            child.addName("n" + i, i);
        }
        assertTrue(child.bucketCount() >= count);
    }

    @Test
    public void testHashSharedInitially() {
        assertTrue(child.maybeDirty());
        child = root.makeChild(0);
        assertFalse(child.maybeDirty());
    }

    @Test
    public void testFindNameWithSpillover() {
        for (int i = 0; i < 300; i++) {
            child.addName("spill" + i, i);
        }
        assertNotNull(child.findName(299));
        assertNull(child.findName(9999));
    }

    @Test
    public void testVerifyLongName() throws Exception {
        java.lang.reflect.Method method = ByteQuadsCanonicalizer.class.getDeclaredMethod("_verifyLongName2", int[].class, int.class, int.class);
        method.setAccessible(true);
        ByteQuadsCanonicalizer canon = ByteQuadsCanonicalizer.createRoot();
        int[] q = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Cannot easily test private directly; just verify through public API
        canon.addName("long", q, q.length);
        assertEquals("long", canon.findName(q, q.length));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcOffsetInvalid() {
        // The _calcOffset is private; test via reflection indirectly
        // Or just call a method that uses it with an invalid hash
        // This test will simply verify that the code path doesn't crash
        child.findName(Integer.MIN_VALUE);
    }

    @Test
    public void testManySingleNames() {
        for (int i = 0; i < 50; i++) {
            child.addName("single" + i, i);
        }
        for (int i = 0; i < 50; i++) {
            assertNotNull(child.findName(i));
        }
    }

    @Test
    public void testManyMultiQuadNames() {
        for (int i = 0; i < 50; i++) {
            child.addName("multi" + i, i, i+1, i+2);
        }
        for (int i = 0; i < 50; i++) {
            assertNotNull(child.findName(i, i+1, i+2));
        }
    }

    @Test
    public void testReleaseWithEmptyTable() {
        child.release();
        child.release();
        assertEquals(0, root.size());
    }
}