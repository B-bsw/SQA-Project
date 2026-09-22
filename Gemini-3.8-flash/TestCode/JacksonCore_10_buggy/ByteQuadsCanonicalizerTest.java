package com.fasterxml.jackson.core.sym;

import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    @Test
    public void createRoot_givenDefaultSeed_shouldInitializeCorrectly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot();
        Assert.assertNotNull(root);
        Assert.assertEquals(0, root.size());
        Assert.assertEquals(64, root.bucketCount());
        Assert.assertFalse(root.maybeDirty());
        Assert.assertEquals(0, root.primaryCount());
        Assert.assertEquals(0, root.secondaryCount());
        Assert.assertEquals(0, root.tertiaryCount());
        Assert.assertEquals(0, root.spilloverCount());
        Assert.assertEquals(0, root.totalCount());
    }

    @Test
    public void createRoot_givenSpecificSeed_shouldRetainSeed() {
        int seed = 12345;
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(seed);
        Assert.assertEquals(seed, root.hashSeed());
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void toString_givenEmptyAndPopulated_shouldReturnFormattedString() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1);
        String desc = root.toString();
        Assert.assertTrue(desc.indexOf("size=0") >= 0);
        Assert.assertTrue(desc.indexOf("hashSize=64") >= 0);

        root.addName("a", 10);
        String desc2 = root.toString();
        Assert.assertTrue(desc2.indexOf("size=1") >= 0);
    }

    @Test
    public void addName_givenSingleQuad_shouldBeFoundAndCountUpdated() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(999);
        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());

        String name = child.addName("field1", 100);
        Assert.assertEquals("field1", name);
        Assert.assertEquals(1, child.size());
        Assert.assertTrue(child.maybeDirty());

        String found = child.findName(100);
        Assert.assertEquals("field1", found);

        String notFound = child.findName(101);
        Assert.assertNull(notFound);
    }

    @Test
    public void addName_givenTwoQuads_shouldBeFoundAndCountUpdated() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(123);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        String name1 = child.addName("pair1", 10, 20);
        Assert.assertEquals("pair1", name1);
        Assert.assertEquals("pair1", child.findName(10, 20));
        Assert.assertNull(child.findName(10, 21));
        Assert.assertNull(child.findName(11, 20));

        // When q2 == 0, hash is calculated via calcHash(q1)
        String name2 = child.addName("pairZero", 30, 0);
        Assert.assertEquals("pairZero", name2);
        Assert.assertEquals("pairZero", child.findName(30, 0));
    }

    @Test
    public void addName_givenThreeQuads_shouldBeFoundAndCountUpdated() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(456);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        String name = child.addName("triple", 10, 20, 30);
        Assert.assertEquals("triple", name);
        Assert.assertEquals("triple", child.findName(10, 20, 30));
        Assert.assertNull(child.findName(10, 20, 31));
        Assert.assertNull(child.findName(10, 21, 30));
        Assert.assertNull(child.findName(11, 20, 30));
    }

    @Test
    public void addName_givenQuadArrayLengths1To3_shouldDelegateProperly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(789);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int[] q1 = new int[] { 111 };
        int[] q2 = new int[] { 111, 222 };
        int[] q3 = new int[] { 111, 222, 333 };

        child.addName("arr1", q1, 1);
        child.addName("arr2", q2, 2);
        child.addName("arr3", q3, 3);

        Assert.assertEquals("arr1", child.findName(q1, 1));
        Assert.assertEquals("arr1", child.findName(111));

        Assert.assertEquals("arr2", child.findName(q2, 2));
        Assert.assertEquals("arr2", child.findName(111, 222));

        Assert.assertEquals("arr3", child.findName(q3, 3));
        Assert.assertEquals("arr3", child.findName(111, 222, 333));
    }

    @Test
    public void addName_givenLongQuads_shouldStoreAndFindCorrectly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1011);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int[] q4 = new int[] { 1, 2, 3, 4 };
        int[] q5 = new int[] { 1, 2, 3, 4, 5 };
        int[] q6 = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] q7 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] q8 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] q9 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        child.addName("four", q4, 4);
        child.addName("five", q5, 5);
        child.addName("six", q6, 6);
        child.addName("seven", q7, 7);
        child.addName("eight", q8, 8);
        child.addName("nine", q9, 9);

        Assert.assertEquals("four", child.findName(q4, 4));
        Assert.assertEquals("five", child.findName(q5, 5));
        Assert.assertEquals("six", child.findName(q6, 6));
        Assert.assertEquals("seven", child.findName(q7, 7));
        Assert.assertEquals("eight", child.findName(q8, 8));
        Assert.assertEquals("nine", child.findName(q9, 9));

        // Mismatches with same lengths
        int[] q4Bad = new int[] { 1, 2, 3, 5 };
        Assert.assertNull(child.findName(q4Bad, 4));

        int[] q8Bad = new int[] { 1, 2, 3, 4, 5, 6, 7, 9 };
        Assert.assertNull(child.findName(q8Bad, 8));

        int[] q9Bad = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
        Assert.assertNull(child.findName(q9Bad, 9));
    }

    @Test
    public void calcHash_givenDifferentQuadLengths_shouldComputeExpectedHashes() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1234);

        int h1 = root.calcHash(42);
        int h2 = root.calcHash(42, 84);
        int h3 = root.calcHash(42, 84, 126);
        int[] q4 = new int[] { 42, 84, 126, 168 };
        int h4 = root.calcHash(q4, 4);
        int[] q5 = new int[] { 42, 84, 126, 168, 210 };
        int h5 = root.calcHash(q5, 5);

        Assert.assertTrue(h1 != 0);
        Assert.assertTrue(h2 != 0);
        Assert.assertTrue(h3 != 0);
        Assert.assertTrue(h4 != 0);
        Assert.assertTrue(h5 != 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcHash_givenQuadArrayLessThanFour_shouldThrowIllegalArgumentException() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1234);
        int[] q = new int[] { 1, 2, 3 };
        root.calcHash(q, 3);
    }

    @Test
    public void release_givenChildWithModifications_shouldMergeIntoParent() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(111);
        Assert.assertEquals(0, root.size());

        ByteQuadsCanonicalizer child = root.makeChild(JsonFactory.Feature.INTERN_FIELD_NAMES.getMask());
        child.addName("k1", 1);
        child.addName("k2", 2);
        Assert.assertEquals(2, child.size());
        Assert.assertTrue(child.maybeDirty());

        child.release();
        Assert.assertFalse(child.maybeDirty());
        Assert.assertEquals(2, root.size());

        // Subsequent release should be no-op
        child.release();
        Assert.assertEquals(2, root.size());
    }

    @Test
    public void release_givenUnchangedChild_shouldNotMergeIntoParent() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(222);
        ByteQuadsCanonicalizer child = root.makeChild(0);
        Assert.assertFalse(child.maybeDirty());

        child.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void release_givenRootRelease_shouldBeNoOp() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(333);
        root.release();
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void release_givenChildExceedingMaxEntriesForReuse_shouldResetParentTable() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(444);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Populate > 6000 entries into child
        for (int i = 0; i < 6001; i++) {
            child.addName("name" + i, i);
        }
        Assert.assertEquals(6001, child.size());

        child.release();
        // Since childCount > MAX_ENTRIES_FOR_REUSE (6000), parent resets to initial size (0 entries)
        Assert.assertEquals(0, root.size());
    }

    @Test
    public void collisions_givenMultipleCollidingKeys_shouldTraverseSecondaryTertiaryAndSpillover() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(777);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Find keys with hash collision on single quad
        int targetOffset = child.calcHash(0) & (child.bucketCount() - 1);
        int collisionsFound = 0;
        int[] collidingKeys = new int[16];

        for (int candidate = 0; collisionsFound < 16 && candidate < 100000; candidate++) {
            if ((child.calcHash(candidate) & (child.bucketCount() - 1)) == targetOffset) {
                collidingKeys[collisionsFound++] = candidate;
            }
        }
        Assert.assertTrue(collisionsFound >= 8);

        for (int i = 0; i < collisionsFound; i++) {
            child.addName("colSingle" + i, collidingKeys[i]);
        }

        for (int i = 0; i < collisionsFound; i++) {
            String found = child.findName(collidingKeys[i]);
            Assert.assertEquals("colSingle" + i, found);
        }

        Assert.assertNull(child.findName(9999999));
    }

    @Test
    public void collisions_givenTwoQuadsCollisions_shouldFindSecondaryTertiaryAndSpillover() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(888);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int targetOffset = child.calcHash(0, 1) & (child.bucketCount() - 1);
        int foundCount = 0;
        int[] keysA = new int[16];
        int[] keysB = new int[16];

        for (int candidate = 1; foundCount < 16 && candidate < 100000; candidate++) {
            if ((child.calcHash(candidate, candidate + 1) & (child.bucketCount() - 1)) == targetOffset) {
                keysA[foundCount] = candidate;
                keysB[foundCount] = candidate + 1;
                foundCount++;
            }
        }
        Assert.assertTrue(foundCount >= 8);

        for (int i = 0; i < foundCount; i++) {
            child.addName("colPair" + i, keysA[i], keysB[i]);
        }

        for (int i = 0; i < foundCount; i++) {
            String found = child.findName(keysA[i], keysB[i]);
            Assert.assertEquals("colPair" + i, found);
        }

        Assert.assertNull(child.findName(keysA[0], keysB[0] + 9999));
    }

    @Test
    public void collisions_givenThreeQuadsCollisions_shouldFindSecondaryTertiaryAndSpillover() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(999);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int targetOffset = child.calcHash(1, 2, 3) & (child.bucketCount() - 1);
        int foundCount = 0;
        int[] keysA = new int[16];
        int[] keysB = new int[16];
        int[] keysC = new int[16];

        for (int candidate = 1; foundCount < 16 && candidate < 100000; candidate++) {
            if ((child.calcHash(candidate, candidate + 1, candidate + 2) & (child.bucketCount() - 1)) == targetOffset) {
                keysA[foundCount] = candidate;
                keysB[foundCount] = candidate + 1;
                keysC[foundCount] = candidate + 2;
                foundCount++;
            }
        }
        Assert.assertTrue(foundCount >= 8);

        for (int i = 0; i < foundCount; i++) {
            child.addName("colTriple" + i, keysA[i], keysB[i], keysC[i]);
        }

        for (int i = 0; i < foundCount; i++) {
            String found = child.findName(keysA[i], keysB[i], keysC[i]);
            Assert.assertEquals("colTriple" + i, found);
        }

        Assert.assertNull(child.findName(keysA[0], keysB[0], keysC[0] + 9999));
    }

    @Test
    public void collisions_givenLongQuadsCollisions_shouldFindSecondaryTertiaryAndSpillover() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(1357);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int[][] quadsList = new int[16][];
        int foundCount = 0;
        int[] base = new int[] { 10, 20, 30, 40 };
        int targetOffset = child.calcHash(base, 4) & (child.bucketCount() - 1);

        for (int candidate = 0; foundCount < 16 && candidate < 100000; candidate++) {
            int[] q = new int[] { candidate, candidate + 1, candidate + 2, candidate + 3 };
            if ((child.calcHash(q, 4) & (child.bucketCount() - 1)) == targetOffset) {
                quadsList[foundCount++] = q;
            }
        }
        Assert.assertTrue(foundCount >= 8);

        for (int i = 0; i < foundCount; i++) {
            child.addName("colLong" + i, quadsList[i], 4);
        }

        for (int i = 0; i < foundCount; i++) {
            String found = child.findName(quadsList[i], 4);
            Assert.assertEquals("colLong" + i, found);
        }

        int[] nonExistent = new int[] { 999999, 999998, 999997, 999996 };
        Assert.assertNull(child.findName(nonExistent, 4));
    }

    @Test
    public void rehash_givenHeavyLoad_shouldExpandBucketCountAndPreserveAllEntries() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(12345);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        int initialBuckets = child.bucketCount();
        Assert.assertEquals(64, initialBuckets);

        // Add 100 elements, which will trigger rehash when count > hashSize * 0.8
        for (int i = 0; i < 100; i++) {
            child.addName("item" + i, i * 3, i * 7);
        }

        Assert.assertTrue(child.bucketCount() > initialBuckets);
        Assert.assertEquals(100, child.size());

        for (int i = 0; i < 100; i++) {
            Assert.assertEquals("item" + i, child.findName(i * 3, i * 7));
        }
    }

    @Test
    public void rehash_givenVariousQuadLengths_shouldRehashAllCorrectly() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(54321);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Mix 1-quad, 2-quad, 3-quad, and long quads
        for (int i = 0; i < 30; i++) {
            child.addName("single" + i, i);
            child.addName("double" + i, i, i + 1);
            child.addName("triple" + i, i, i + 1, i + 2);
            int[] longQ = new int[] { i, i + 1, i + 2, i + 3, i + 4 };
            child.addName("long" + i, longQ, 5);
        }

        Assert.assertEquals(120, child.size());
        Assert.assertTrue(child.bucketCount() > 64);

        for (int i = 0; i < 30; i++) {
            Assert.assertEquals("single" + i, child.findName(i));
            Assert.assertEquals("double" + i, child.findName(i, i + 1));
            Assert.assertEquals("triple" + i, child.findName(i, i + 1, i + 2));
            int[] longQ = new int[] { i, i + 1, i + 2, i + 3, i + 4 };
            Assert.assertEquals("long" + i, child.findName(longQ, 5));
        }
    }

    @Test
    public void calcTertiaryShift_givenVariousSizes_shouldReturnExpectedShifts() {
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        Assert.assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(255));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));
        Assert.assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(1024));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(2048));
        Assert.assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(4096));
        Assert.assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(8192));
    }

    @Test
    public void appendLongName_givenLongNamesArrayExpansion_shouldGrowBufferSafely() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(9876);
        ByteQuadsCanonicalizer child = root.makeChild(0);

        // Add multiple very long quads (> 16 ints) to force expansion of _hashArea in _appendLongName
        for (int i = 0; i < 50; i++) {
            int[] longQuads = new int[20];
            for (int j = 0; j < 20; j++) {
                longQuads[j] = (i * 20) + j + 1;
            }
            child.addName("longItem" + i, longQuads, 20);
        }

        for (int i = 0; i < 50; i++) {
            int[] longQuads = new int[20];
            for (int j = 0; j < 20; j++) {
                longQuads[j] = (i * 20) + j + 1;
            }
            Assert.assertEquals("longItem" + i, child.findName(longQuads, 20));
        }
    }

    @Test
    public void verifySharing_givenChildModifications_shouldCopyArraysAndUnshare() {
        ByteQuadsCanonicalizer root = ByteQuadsCanonicalizer.createRoot(135);
        ByteQuadsCanonicalizer child1 = root.makeChild(0);
        ByteQuadsCanonicalizer child2 = root.makeChild(0);

        child1.addName("fromChild1", 100);
        Assert.assertEquals("fromChild1", child1.findName(100));
        Assert.assertNull(child2.findName(100));

        child1.release();
        Assert.assertEquals(1, root.size());

        // New child spawned after release should see the entry
        ByteQuadsCanonicalizer child3 = root.makeChild(0);
        Assert.assertEquals("fromChild1", child3.findName(100));
    }
}