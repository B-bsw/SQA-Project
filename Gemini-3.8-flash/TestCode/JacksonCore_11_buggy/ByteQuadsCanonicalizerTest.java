package com.fasterxml.jackson.core.sym;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import com.fasterxml.jackson.core.JsonFactory;

public class ByteQuadsCanonicalizerTest {

    private ByteQuadsCanonicalizer root;

    @Before
    public void setUp() {
        root = ByteQuadsCanonicalizer.createRoot(12345);
    }

    @Test
    public void createRoot_givenDefault_shouldInitializeProperly() {
        // Arrange & Act
        ByteQuadsCanonicalizer defaultRoot = ByteQuadsCanonicalizer.createRoot();

        // Assert
        assertNotNull(defaultRoot);
        assertEquals(0, defaultRoot.size());
        assertEquals(64, defaultRoot.bucketCount());
        assertFalse(defaultRoot.maybeDirty());
        assertTrue((defaultRoot.hashSeed() & 1) != 0);
    }

    @Test
    public void createRoot_givenCustomSeed_shouldRetainSeed() {
        // Arrange & Act
        ByteQuadsCanonicalizer customRoot = ByteQuadsCanonicalizer.createRoot(987654321);

        // Assert
        assertEquals(987654321, customRoot.hashSeed());
        assertEquals(0, customRoot.size());
        assertEquals(64, customRoot.bucketCount());
    }

    @Test
    public void makeChild_givenFlags_shouldCreateChildWithExpectedSettings() {
        // Arrange
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask()
                | JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.getMask();

        // Act
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Assert
        assertNotNull(child);
        assertEquals(0, child.size());
        assertEquals(root.bucketCount(), child.bucketCount());
        assertEquals(root.hashSeed(), child.hashSeed());
        assertFalse(child.maybeDirty());
    }

    @Test
    public void release_givenUnmodifiedChild_shouldNotAffectParent() {
        // Arrange
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act
        child.release();

        // Assert
        assertEquals(0, root.size());
        assertFalse(child.maybeDirty());
    }

    @Test
    public void release_givenModifiedChild_shouldMergeToParent() {
        // Arrange
        int flags = JsonFactory.Feature.INTERN_FIELD_NAMES.getMask();
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child.addName("symbolA", 100);
        assertTrue(child.maybeDirty());

        // Act
        child.release();

        // Assert
        assertFalse(child.maybeDirty());
        assertEquals(1, root.size());
        assertEquals("symbolA", root.findName(100));
    }

    @Test
    public void release_givenChildExceedingMaxEntries_shouldResetParentTable() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child._count = ByteQuadsCanonicalizer.MAX_ENTRIES_FOR_REUSE + 1;
        child._hashShared = false;

        // Act
        child.release();

        // Assert
        assertEquals(0, root.size());
        assertEquals(64, root.bucketCount());
    }

    @Test
    public void release_givenParentNull_shouldDoNothing() {
        // Arrange & Act
        root.release();

        // Assert
        assertEquals(0, root.size());
    }

    @Test
    public void addName_givenSingleQuad_shouldAddAndFind() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act
        String added = child.addName("field1", 111);
        String found = child.findName(111);
        String notFound = child.findName(222);

        // Assert
        assertEquals("field1", added);
        assertEquals("field1", found);
        assertNull(notFound);
        assertEquals(1, child.size());
    }

    @Test
    public void addName_givenTwoQuads_shouldAddAndFind() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act
        String addedNonZero = child.addName("twoQuads", 111, 222);
        String addedZeroQ2 = child.addName("twoQuadsZeroQ2", 333, 0);

        // Assert
        assertEquals("twoQuads", addedNonZero);
        assertEquals("twoQuads", child.findName(111, 222));
        assertNull(child.findName(111, 999));
        assertNull(child.findName(999, 222));

        assertEquals("twoQuadsZeroQ2", addedZeroQ2);
        assertEquals("twoQuadsZeroQ2", child.findName(333, 0));
    }

    @Test
    public void addName_givenThreeQuads_shouldAddAndFind() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act
        String added = child.addName("threeQuads", 10, 20, 30);
        String found = child.findName(10, 20, 30);
        String notFound1 = child.findName(10, 20, 99);
        String notFound2 = child.findName(10, 99, 30);
        String notFound3 = child.findName(99, 20, 30);

        // Assert
        assertEquals("threeQuads", added);
        assertEquals("threeQuads", found);
        assertNull(notFound1);
        assertNull(notFound2);
        assertNull(notFound3);
    }

    @Test
    public void addName_givenQuadArray_shouldDelegateAndHandleAllSizes() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act & Assert 1 quad array
        child.addName("arr1", new int[] { 101 }, 1);
        assertEquals("arr1", child.findName(new int[] { 101 }, 1));

        // Act & Assert 2 quads array
        child.addName("arr2", new int[] { 101, 202 }, 2);
        assertEquals("arr2", child.findName(new int[] { 101, 202 }, 2));

        // Act & Assert 3 quads array
        child.addName("arr3", new int[] { 101, 202, 303 }, 3);
        assertEquals("arr3", child.findName(new int[] { 101, 202, 303 }, 3));

        // Act & Assert 4 quads array
        int[] q4 = new int[] { 101, 202, 303, 404 };
        child.addName("arr4", q4, 4);
        assertEquals("arr4", child.findName(q4, 4));

        // Verify lookup mismatch on 4 quads
        assertNull(child.findName(new int[] { 101, 202, 303, 999 }, 4));
    }

    @Test
    public void addName_givenVariousLongQuadLengths_shouldVerifyCorrectly() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act & Assert lengths 5, 6, 7, 8, 9, 12
        int[] lengths = new int[] { 5, 6, 7, 8, 9, 12 };
        for (int i = 0; i < lengths.length; i++) {
            int len = lengths[i];
            int[] q = new int[len];
            for (int j = 0; j < len; j++) {
                q[j] = (i + 1) * 1000 + j;
            }
            String name = "longField_" + len;
            child.addName(name, q, len);
            assertEquals(name, child.findName(q, len));

            // Tamper one entry to verify mismatch
            int[] mismatched = new int[len];
            System.arraycopy(q, 0, mismatched, 0, len);
            mismatched[len - 1] = 999999;
            assertNull(child.findName(mismatched, len));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void calcHash_givenArrayLengthLessThanFour_shouldThrowIllegalArgumentException() {
        // Arrange & Act
        root.calcHash(new int[] { 1, 2, 3 }, 3);
    }

    @Test
    public void calcHash_givenIndividualMethods_shouldComputeDeterministicHashes() {
        // Arrange & Act
        int h1 = root.calcHash(1234);
        int h2 = root.calcHash(1234, 5678);
        int h3 = root.calcHash(1234, 5678, 9012);
        int h4 = root.calcHash(new int[] { 1234, 5678, 9012, 3456 }, 4);

        // Assert
        assertEquals(h1, root.calcHash(1234));
        assertEquals(h2, root.calcHash(1234, 5678));
        assertEquals(h3, root.calcHash(1234, 5678, 9012));
        assertEquals(h4, root.calcHash(new int[] { 1234, 5678, 9012, 3456 }, 4));
    }

    @Test
    public void addName_givenCollidingHashes_shouldFindInSecondaryTertiaryAndSpillover() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act: insert enough entries to produce secondary, tertiary, and spillover entries
        for (int i = 0; i < 40; i++) {
            child.addName("name1_" + i, i * 64);
            child.addName("name2_" + i, i * 64, i + 1);
            child.addName("name3_" + i, i * 64, i + 1, i + 2);
            child.addName("name4_" + i, new int[] { i * 64, i + 1, i + 2, i + 3 }, 4);
        }

        // Assert
        for (int i = 0; i < 40; i++) {
            assertEquals("name1_" + i, child.findName(i * 64));
            assertEquals("name2_" + i, child.findName(i * 64, i + 1));
            assertEquals("name3_" + i, child.findName(i * 64, i + 1, i + 2));
            assertEquals("name4_" + i, child.findName(new int[] { i * 64, i + 1, i + 2, i + 3 }, 4));
        }

        // Search for non-existent in collided slots
        assertNull(child.findName(999999));
        assertNull(child.findName(999999, 1));
        assertNull(child.findName(999999, 1, 2));
        assertNull(child.findName(new int[] { 999999, 1, 2, 3 }, 4));
    }

    @Test
    public void _calcTertiaryShift_givenVariousSizes_shouldCalculateAccurately() {
        // primarySlots >> 2 < 64 -> 4
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(16));
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(64));
        assertEquals(4, ByteQuadsCanonicalizer._calcTertiaryShift(252));

        // tertSlots <= 256 -> 5
        assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(256));
        assertEquals(5, ByteQuadsCanonicalizer._calcTertiaryShift(1024));

        // tertSlots <= 1024 -> 6
        assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(1028));
        assertEquals(6, ByteQuadsCanonicalizer._calcTertiaryShift(4096));

        // tertSlots > 1024 -> 7
        assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(4100));
        assertEquals(7, ByteQuadsCanonicalizer._calcTertiaryShift(16384));
    }

    @Test
    public void rehash_whenCapacityExceeded_shouldRehashAndPreserveAllEntries() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        int initialBucketCount = child.bucketCount();

        // Act: add enough symbols to trigger rehash
        int count = 100;
        for (int i = 0; i < count; i++) {
            child.addName("item" + i, i * 7 + 1);
        }

        // Assert
        assertTrue(child.bucketCount() > initialBucketCount);
        assertEquals(count, child.size());
        for (int i = 0; i < count; i++) {
            assertEquals("item" + i, child.findName(i * 7 + 1));
        }
    }

    @Test
    public void rehash_givenLongNamesArrayExpansion_shouldResizeProperly() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act: add 1, 2, 3 and long quads requiring expansion during rehash
        for (int i = 0; i < 30; i++) {
            child.addName("q1_" + i, 1000 + i);
            child.addName("q2_" + i, 2000 + i, 20);
            child.addName("q3_" + i, 3000 + i, 30, 31);
            int[] longQ = new int[] { 4000 + i, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56 };
            child.addName("qLong_" + i, longQ, longQ.length);
        }

        // Assert
        for (int i = 0; i < 30; i++) {
            assertEquals("q1_" + i, child.findName(1000 + i));
            assertEquals("q2_" + i, child.findName(2000 + i, 20));
            assertEquals("q3_" + i, child.findName(3000 + i, 30, 31));
            int[] longQ = new int[] { 4000 + i, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56 };
            assertEquals("qLong_" + i, child.findName(longQ, longQ.length));
        }
    }

    @Test
    public void countsAndToString_givenPopulatedCanonicalizer_shouldReturnExpectedValues() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child.addName("k1", 1);
        child.addName("k2", 2);

        // Act
        int primary = child.primaryCount();
        int secondary = child.secondaryCount();
        int tertiary = child.tertiaryCount();
        int spill = child.spilloverCount();
        int total = child.totalCount();
        String str = child.toString();

        // Assert
        assertEquals(2, primary + secondary + tertiary + spill);
        assertEquals(2, total);
        assertTrue(str.contains("size=2"));
        assertTrue(str.contains("ByteQuadsCanonicalizer"));
    }

    @Test
    public void _reportTooManyCollisions_whenHashSizeSmall_shouldNotThrowException() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child._hashSize = 1024;

        // Act & Assert (should return without throwing)
        child._reportTooManyCollisions();
    }

    @Test(expected = IllegalStateException.class)
    public void _reportTooManyCollisions_whenHashSizeLarge_shouldThrowIllegalStateException() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child._hashSize = 2048;

        // Act & Assert
        child._reportTooManyCollisions();
    }

    @Test
    public void rehash_whenExceedsMaxTSize_shouldNukeSymbols() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);
        child.addName("first", 100);

        // Manually simulate max table size reached to force nukeSymbols
        child._hashSize = 0x10000;
        child._needRehash = true;

        // Act: adding next name triggers rehash() where newSize > MAX_T_SIZE
        child.addName("overflow", 200);

        // Assert
        assertEquals(1, child.size());
        assertEquals("overflow", child.findName(200));
        assertNull(child.findName(100));
    }

    @Test
    public void _appendLongName_givenCapacityExceeded_shouldExpandHashArea() {
        // Arrange
        int flags = 0;
        ByteQuadsCanonicalizer child = root.makeChild(flags);

        // Act: Add multiple long quad arrays to cause buffer expansion
        for (int i = 0; i < 50; i++) {
            int[] longQuads = new int[30];
            for (int k = 0; k < 30; k++) {
                longQuads[k] = i * 100 + k;
            }
            child.addName("big_" + i, longQuads, 30);
        }

        // Assert
        for (int i = 0; i < 50; i++) {
            int[] longQuads = new int[30];
            for (int k = 0; k < 30; k++) {
                longQuads[k] = i * 100 + k;
            }
            assertEquals("big_" + i, child.findName(longQuads, 30));
        }
    }
}