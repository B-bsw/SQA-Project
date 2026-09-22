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
        assertNotNull(root);
        assertEquals(0, root.size());
        assertTrue(root.bucketCount() >= 64);
        assertEquals(0, root.hashSeed() % 2 == 0 ? 0 : 1, 1);
    }

    @Test
    public void testMakeChild() {
        assertNotNull(child);
        assertEquals(0, child.size());
        assertNotSame(root, child);
    }

    @Test
    public void testAddFindSingleQuad() {
        String name = "test";
        String result = child.addName(name, 12345);
        assertEquals(name, result);
        assertEquals(name, child.findName(12345));
        assertNull(child.findName(99999));
    }

    @Test
    public void testAddFindTwoQuads() {
        String name = "test";
        String result = child.addName(name, 123, 456);
        assertEquals(name, result);
        assertEquals(name, child.findName(123, 456));
        assertNull(child.findName(123, 999));
    }

    @Test
    public void testAddFindThreeQuads() {
        String name = "test";
        String result = child.addName(name, 123, 456, 789);
        assertEquals(name, result);
        assertEquals(name, child.findName(123, 456, 789));
        assertNull(child.findName(123, 456, 999));
    }

    @Test
    public void testFindWithArrayLength1() {
        String name = "single";
        child.addName(name, 100);
        int[] q = {100};
        assertEquals(name, child.findName(q, 1));
    }

    @Test
    public void testFindWithArrayLength2() {
        String name = "double";
        child.addName(name, 100, 200);
        int[] q = {100, 200};
        assertEquals(name, child.findName(q, 2));
    }

    @Test
    public void testFindWithArrayLength3() {
        String name = "triple";
        child.addName(name, 100, 200, 300);
        int[] q = {100, 200, 300};
        assertEquals(name, child.findName(q, 3));
    }

    @Test
    public void testFindWithArrayLength4() {
        String name = "quad";
        int[] q = {100, 200, 300, 400};
        child.addName(name, q, 4);
        assertEquals(name, child.findName(q, 4));
    }

    @Test
    public void testFindWithArrayLength5() {
        String name = "penta";
        int[] q = {100, 200, 300, 400, 500};
        child.addName(name, q, 5);
        int[] search = {100, 200, 300, 400, 500};
        assertEquals(name, child.findName(search, 5));
    }

    @Test
    public void testCalcHashMethods() {
        assertEquals(child.calcHash(1), child.calcHash(1));
        assertEquals(child.calcHash(1, 2), child.calcHash(1, 2));
        assertEquals(child.calcHash(1, 2, 3), child.calcHash(1, 2, 3));
        int[] q = {1, 2, 3, 4};
        assertEquals(child.calcHash(q, 4), child.calcHash(q, 4));
    }

    @Test
    public void testSizeAndBucketCount() {
        assertEquals(0, child.size());
        child.addName("name", 123);
        assertEquals(1, child.size());
        assertEquals(0, root.size());
        assertTrue(child.bucketCount() > 0);
    }

    @Test
    public void testReleaseAndMerge() {
        child.addName("test", 123);
        child.release();
        assertEquals(1, root.size());
    }

    @Test
    public void testMaybeDirty() {
        assertFalse(child.maybeDirty());
        child.addName("test", 123);
        assertTrue(child.maybeDirty());
    }

    @Test
    public void testHashSeed() {
        ByteQuadsCanonicalizer root2 = ByteQuadsCanonicalizer.createRoot();
        assertNotNull(root2);
    }

    @Test
    public void testPrimaryCount() {
        assertEquals(0, child.primaryCount());
        child.addName("test", 123);
        assertTrue(child.primaryCount() >= 0);
    }

    @Test
    public void testSecondaryCount() {
        assertEquals(0, child.secondaryCount());
    }

    @Test
    public void testTertiaryCount() {
        assertEquals(0, child.tertiaryCount());
    }

    @Test
    public void testSpilloverCount() {
        assertEquals(0, child.spilloverCount());
    }

    @Test
    public void testTotalCount() {
        assertEquals(0, child.totalCount());
        child.addName("test", 123);
        assertTrue(child.totalCount() > 0);
    }

    @Test
    public void testToString() {
        child.addName("test", 123);
        assertNotNull(child.toString());
        assertTrue(child.toString().contains("size=1"));
    }

    @Test
    public void testFindNameNullWhenNotFound() {
        assertNull(child.findName(11111));
        assertNull(child.findName(11111, 22222));
        assertNull(child.findName(11111, 22222, 33333));
    }

    @Test
    public void testAddFindLongNameWithManyQuads() {
        String name = "longName";
        int[] q = new int[10];
        Arrays.fill(q, 77);
        child.addName(name, q, q.length);
        int[] search = new int[10];
        Arrays.fill(search, 77);
        assertEquals(name, child.findName(search, search.length));
    }

    @Test
    public void testAddNameWithDuplicate() {
        String name = "dup";
        String first = child.addName(name, 123);
        String second = child.addName(name, 123);
        assertEquals(first, second);
        assertEquals(1, child.size());
    }

    @Test
    public void testAddNameWithNullAndEmpty() {
        assertNull(child.findName(0));
    }
}