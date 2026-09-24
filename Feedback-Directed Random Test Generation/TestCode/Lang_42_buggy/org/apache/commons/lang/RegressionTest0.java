package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.lang.Entities entities0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "", "", "", "", "" };
        java.lang.String[][] strArray15 = new java.lang.String[][] { strArray7, strArray14 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray1, strArray2, strArray3, strArray4 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray1 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.lang.Class<?> wildcardClass7 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.Class<?> wildcardClass5 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "1) test0011(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.Class<?> wildcardClass12 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.size = (short) -1;
        int int5 = binaryEntityMap1.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        int int9 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        java.lang.String str7 = primitiveEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = entities6.entityName(100);
        java.lang.String str12 = entities6.entityName((int) ' ');
        java.lang.String str14 = entities6.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities6.map;
        entities0.map = entityMap15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "2) test0019(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        java.lang.String str13 = entities0.unescape("");
        entities0.addEntity("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.size;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = entities6.entityName(100);
        java.lang.String str12 = entities6.entityName((int) ' ');
        java.lang.String str14 = entities6.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities6.map;
        entities0.map = entityMap15;
        java.lang.Class<?> wildcardClass17 = entityMap15.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        entityMap9.add("", 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.ensureCapacity((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        int[] intArray6 = arrayEntityMap0.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        java.lang.String[] strArray13 = arrayEntityMap8.names;
        arrayEntityMap0.names = strArray13;
        arrayEntityMap0.growBy = '#';
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "3) test0029(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "1) test0029(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = entities6.entityName(100);
        java.lang.String str12 = entities6.entityName((int) ' ');
        java.lang.String str14 = entities6.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities6.map;
        entities0.map = entityMap15;
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "4) test0030(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "2) test0030(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.growBy;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        java.lang.String str18 = primitiveEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        java.lang.Class<?> wildcardClass5 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap3.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap3.mapNameToValue = map8;
        hashEntityMap2.mapNameToValue = map8;
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        hashEntityMap0.mapNameToValue = map11;
        java.lang.Class<?> wildcardClass13 = map11.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "5) test0036(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        int int3 = binaryEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '#');
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        java.lang.String str4 = primitiveEntityMap0.name(0);
        primitiveEntityMap0.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer3, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap1.names = strArray9;
        java.lang.String str12 = arrayEntityMap1.name(100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        java.lang.Class<?> wildcardClass4 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass7 = hashEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray6 = new int[] {};
        binaryEntityMap5.values = intArray6;
        int int9 = binaryEntityMap5.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        arrayEntityMap10.names = strArray14;
        binaryEntityMap5.names = strArray14;
        int int18 = binaryEntityMap5.value("hi!");
        entities0.map = binaryEntityMap5;
        java.lang.String str21 = binaryEntityMap5.name((int) (short) -1);
        java.lang.Class<?> wildcardClass22 = binaryEntityMap5.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "6) test0045(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap3.growBy = (short) 10;
        java.lang.String[] strArray6 = binaryEntityMap3.names;
        binaryEntityMap3.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray13;
        binaryEntityMap0.names = strArray13;
        java.lang.Class<?> wildcardClass16 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer4 = null;
        entities3.escape(writer4, "");
        int int8 = entities3.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray11);
        entities9.addEntities(strArray11);
// flaky "7) test0047(org.apache.commons.lang.RegressionTest0)":         entities3.addEntities(strArray11);
// flaky "3) test0047(org.apache.commons.lang.RegressionTest0)":         entities0.addEntities(strArray11);
        java.lang.String str17 = entities0.escape("hi!");
        java.lang.String str19 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.escape("hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (-1));
        primitiveEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        java.lang.String str14 = primitiveEntityMap0.name(1);
        java.lang.String str16 = primitiveEntityMap0.name(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "8) test0057(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[300]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(entityMap5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "9) test0058(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "10) test0062(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 1);
        java.lang.Class<?> wildcardClass10 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities entities2 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer3 = null;
        entities2.escape(writer3, "");
        java.lang.String[][] strArray6 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities2.addEntities(strArray6);
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer9 = null;
        entities8.escape(writer9, "");
        int int13 = entities8.entityValue("");
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray16 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities15.addEntities(strArray16);
        entities14.addEntities(strArray16);
        entities8.addEntities(strArray16);
        entities2.addEntities(strArray16);
        entities0.addEntities(strArray16);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str18 = entities0.entityName((-1));
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer19, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities11.map;
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str15 = entities13.unescape("");
        java.lang.String str17 = entities13.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray20 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities19.addEntities(strArray20);
        entities18.addEntities(strArray20);
        entities13.addEntities(strArray20);
        entities11.addEntities(strArray20);
        entities0.addEntities(strArray20);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (int) ' ');
        java.lang.Class<?> wildcardClass6 = hashEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        int int9 = hashEntityMap0.value("hi!");
        java.lang.String str11 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name(97);
        java.lang.Class<?> wildcardClass10 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer4 = null;
        entities3.escape(writer4, "");
        int int8 = entities3.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray11);
        entities9.addEntities(strArray11);
        entities3.addEntities(strArray11);
        entities0.addEntities(strArray11);
        java.lang.String str17 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(entityMap18);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap6.add("", (int) (short) 1);
        arrayEntityMap6.ensureCapacity((int) ' ');
        int int12 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        java.lang.String str15 = entities0.unescape("");
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName(100);
        java.lang.String str22 = entities16.unescape("hi!");
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray25 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities24.addEntities(strArray25);
        entities23.addEntities(strArray25);
        entities16.addEntities(strArray25);
        entities0.addEntities(strArray25);
        org.apache.commons.lang.Entities.EntityMap entityMap30 = entities0.map;
        java.lang.String str32 = entities0.escape("");
        int int34 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(entityMap30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.growBy;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "11) test0078(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "4) test0078(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        int[] intArray7 = arrayEntityMap4.values;
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "12) test0081(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 1);
        int int10 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities7.addEntities(strArray8);
        entities6.addEntities(strArray8);
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities6.addEntities(strArray11);
        entities0.addEntities(strArray11);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = '4';
        int int18 = binaryEntityMap14.value("hi!");
        java.lang.String str20 = binaryEntityMap14.name((int) '#');
        binaryEntityMap14.add("", (int) (byte) 0);
        entities0.map = binaryEntityMap14;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = (short) -1;
        arrayEntityMap1.size = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.lang.Class<?> wildcardClass8 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.unescape("hi!");
        java.lang.String str9 = entities0.entityName(10);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap14 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities10.map = primitiveEntityMap14;
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray18 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray18);
        entities16.addEntities(strArray18);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities16.addEntities(strArray21);
        entities10.addEntities(strArray21);
        entities0.addEntities(strArray21);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer4 = null;
        entities3.escape(writer4, "");
        int int8 = entities3.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray11);
        entities9.addEntities(strArray11);
        entities3.addEntities(strArray11);
        entities0.addEntities(strArray11);
        int int17 = entities0.entityValue("hi!");
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String[][] strArray19 = new java.lang.String[][] { strArray18 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
// flaky "13) test0090(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) ' ');
// flaky "14) test0091(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("", (int) (short) 1);
        java.lang.Class<?> wildcardClass4 = arrayEntityMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        binaryEntityMap0.size = 52;
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities1 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray2 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities1.addEntities(strArray2);
        entities0.addEntities(strArray2);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.entityName((int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entities1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer14 = null;
        entities13.escape(writer14, "");
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities13.map;
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer19 = null;
        entities18.escape(writer19, "");
        int int23 = entities18.entityValue("");
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray26 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities25.addEntities(strArray26);
        entities24.addEntities(strArray26);
        entities18.addEntities(strArray26);
        entities13.addEntities(strArray26);
        entities0.addEntities(strArray26);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "15) test0098(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "5) test0098(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNotNull(entities18);
// flaky "1) test0098(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = entities0.entityName((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        java.lang.Class<?> wildcardClass6 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        java.lang.String str18 = hashEntityMap0.name((int) 'a');
        hashEntityMap0.add("", 2);
        java.lang.String str23 = hashEntityMap0.name((int) '#');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities7.addEntities(strArray8);
        entities6.addEntities(strArray8);
        entities0.addEntities(strArray8);
        int int13 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        java.lang.Class<?> wildcardClass6 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.unescape("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int8 = primitiveEntityMap6.value("hi!");
        primitiveEntityMap6.add("", (int) (short) 10);
        primitiveEntityMap6.add("", 0);
        entities0.map = primitiveEntityMap6;
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap16 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int18 = primitiveEntityMap16.value("hi!");
        entities0.map = primitiveEntityMap16;
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        java.lang.String str7 = entities0.unescape("");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("");
        arrayEntityMap1.size = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities5 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray7 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities6.addEntities(strArray7);
        entities5.addEntities(strArray7);
        entities0.addEntities(strArray7);
        int int12 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(entities5);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(strArray7);
// flaky "16) test0112(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        int[] intArray5 = binaryEntityMap0.values;
        java.lang.Class<?> wildcardClass6 = intArray5.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        int int19 = hashEntityMap11.value("");
        java.util.Map map20 = hashEntityMap11.mapNameToValue;
        hashEntityMap9.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        java.util.Map map26 = hashEntityMap22.mapValueToName;
        hashEntityMap9.mapValueToName = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        hashEntityMap28.add("", (int) (byte) 10);
        int int36 = hashEntityMap28.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        hashEntityMap28.mapNameToValue = map42;
        hashEntityMap9.mapNameToValue = map42;
        java.util.Map map46 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapNameToValue = map46;
        hashEntityMap0.add("", 97);
        hashEntityMap0.add("", 10);
        java.lang.Class<?> wildcardClass54 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer6, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "17) test0116(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "18) test0119(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap7.ensureCapacity((int) 'a');
        arrayEntityMap7.ensureCapacity(0);
        arrayEntityMap7.add("hi!", 100);
        java.lang.String str16 = arrayEntityMap7.name((int) 'a');
        int int18 = arrayEntityMap7.value("");
        int[] intArray19 = arrayEntityMap7.values;
        int int20 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.lang.String[] strArray23 = new java.lang.String[] { "" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray23 };
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer18, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities9.addEntities(strArray10);
        entities0.addEntities(strArray10);
        java.lang.String str14 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities9.addEntities(strArray10);
        entities0.addEntities(strArray10);
        entities0.addEntity("hi!", 0);
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray23 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities22.addEntities(strArray23);
        entities21.addEntities(strArray23);
        entities16.addEntities(strArray23);
        entities0.addEntities(strArray23);
        java.lang.String str29 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities9.addEntities(strArray10);
        entities0.addEntities(strArray10);
        entities0.addEntity("hi!", 0);
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray23 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities22.addEntities(strArray23);
        entities21.addEntities(strArray23);
        entities16.addEntities(strArray23);
        entities0.addEntities(strArray23);
        java.lang.String str29 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        hashEntityMap6.mapNameToValue = map12;
        java.util.Map map15 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap0.name((int) '#');
        java.lang.String str20 = hashEntityMap0.name(0);
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) '4');
        int int26 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.add("hi!", 2);
        int[] intArray6 = arrayEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap3.growBy = (short) 10;
        java.lang.String[] strArray6 = binaryEntityMap3.names;
        binaryEntityMap3.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray13;
        binaryEntityMap0.names = strArray13;
        java.lang.String str17 = binaryEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap19.ensureCapacity((int) 'a');
        arrayEntityMap19.ensureCapacity(0);
        java.lang.String[] strArray24 = arrayEntityMap19.names;
        binaryEntityMap0.names = strArray24;
        java.lang.String str27 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.size = (byte) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky "19) test0129(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap1.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.growBy = (short) 10;
        java.lang.String[] strArray7 = binaryEntityMap4.names;
        int[] intArray8 = binaryEntityMap4.values;
        int[] intArray9 = binaryEntityMap4.values;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap4.names = strArray14;
        arrayEntityMap1.names = strArray14;
        java.lang.Class<?> wildcardClass17 = strArray14.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer9 = null;
        entities8.escape(writer9, "");
        java.lang.String[][] strArray12 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities8.addEntities(strArray12);
        entities0.addEntities(strArray12);
        java.lang.String str16 = entities0.escape("");
        java.lang.String str18 = entities0.unescape("");
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("hi!");
        java.lang.String str10 = entities0.entityName((int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.lang.String str37 = entities0.unescape("");
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer38, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap2.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        hashEntityMap2.mapNameToValue = map7;
        int int10 = hashEntityMap2.value("");
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        hashEntityMap0.mapNameToValue = map11;
        int int14 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        java.lang.String str15 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int18 = arrayEntityMap16.value("hi!");
        arrayEntityMap16.size = (byte) -1;
        entities0.map = arrayEntityMap16;
        java.lang.String[][] strArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        java.lang.String str11 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (-1));
        int int12 = primitiveEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass13 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        arrayEntityMap0.ensureCapacity(0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str9 = entities7.unescape("");
        java.lang.String str11 = entities7.entityName(100);
        java.lang.String str13 = entities7.entityName((int) ' ');
        java.lang.String str15 = entities7.entityName(10);
        java.lang.String str17 = entities7.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int20 = hashEntityMap18.value("hi!");
        java.util.Map map21 = hashEntityMap18.mapValueToName;
        int int23 = hashEntityMap18.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap24.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        hashEntityMap18.mapNameToValue = map33;
        entities7.map = hashEntityMap18;
        hashEntityMap18.add("", (int) (short) 10);
        java.util.Map map39 = hashEntityMap18.mapValueToName;
        hashEntityMap0.mapValueToName = map39;
        java.lang.String str42 = hashEntityMap0.name((int) ' ');
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str4 = entities0.unescape("hi!");
        java.lang.String str6 = entities0.entityName((int) '#');
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        entities0.addEntity("", (int) (byte) 0);
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entityMap6.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        arrayEntityMap1.add("hi!", (int) ' ');
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        hashEntityMap0.add("hi!", 1);
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str11 = binaryEntityMap9.name((int) (byte) 0);
        java.lang.String str13 = binaryEntityMap9.name((int) '#');
        int int15 = binaryEntityMap9.value("hi!");
        java.lang.String str17 = binaryEntityMap9.name((int) (byte) 1);
        entities0.map = binaryEntityMap9;
        java.lang.Class<?> wildcardClass19 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.growBy = 1;
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities5 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = entities6.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray12 = new int[] {};
        binaryEntityMap11.values = intArray12;
        int int15 = binaryEntityMap11.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        arrayEntityMap16.names = strArray20;
        binaryEntityMap11.names = strArray20;
        int int24 = binaryEntityMap11.value("hi!");
        entities6.map = binaryEntityMap11;
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer27 = null;
        entities26.escape(writer27, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap30 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities26.map = primitiveEntityMap30;
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities33.addEntities(strArray34);
        entities32.addEntities(strArray34);
        java.lang.String[][] strArray37 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities32.addEntities(strArray37);
        entities26.addEntities(strArray37);
        entities6.addEntities(strArray37);
        entities5.addEntities(strArray37);
        entities0.addEntities(strArray37);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(entities5);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        int int15 = binaryEntityMap11.value("hi!");
        entities0.map = binaryEntityMap11;
        int int18 = entities0.entityValue("hi!");
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer19, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray8 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities7.addEntities(strArray8);
        entities6.addEntities(strArray8);
        entities0.addEntities(strArray8);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass8 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer4 = null;
        entities3.escape(writer4, "");
        int int8 = entities3.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray11);
        entities9.addEntities(strArray11);
        entities3.addEntities(strArray11);
        entities0.addEntities(strArray11);
// flaky "20) test0155(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities3);
// flaky "6) test0155(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (short) 100);
        int[] intArray15 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray15;
        int[] intArray17 = null;
        arrayEntityMap1.values = intArray17;
        arrayEntityMap1.size = 100;
        int int21 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int15 = primitiveEntityMap13.value("hi!");
        primitiveEntityMap13.add("", (int) (short) 10);
        primitiveEntityMap13.add("", 0);
        int int23 = primitiveEntityMap13.value("");
        entities0.map = primitiveEntityMap13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap26.ensureCapacity((int) 'a');
        arrayEntityMap26.growBy = (byte) 100;
        arrayEntityMap26.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        binaryEntityMap33.add("", (int) (short) 100);
        int[] intArray40 = binaryEntityMap33.values;
        arrayEntityMap26.values = intArray40;
        int[] intArray42 = null;
        arrayEntityMap26.values = intArray42;
        arrayEntityMap26.size = 100;
        entities0.map = arrayEntityMap26;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap26.add("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[97]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = null; // flaky "21) test0159(org.apache.commons.lang.RegressionTest0)": entities0.entityName(100);
        java.lang.String str6 = null; // flaky "7) test0159(org.apache.commons.lang.RegressionTest0)": entities0.entityName((int) ' ');
        java.lang.String str8 = null; // flaky "2) test0159(org.apache.commons.lang.RegressionTest0)": entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        primitiveEntityMap0.add("hi!", 100);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = null; // flaky "22) test0161(org.apache.commons.lang.RegressionTest0)": entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = null; // flaky "23) test0163(org.apache.commons.lang.RegressionTest0)": entities0.entityName((int) (short) 10);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "8) test0163(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities1 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray2 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities1.addEntities(strArray2);
        entities0.addEntities(strArray2);
        java.lang.String str6 = entities0.unescape("");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entities1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.Class<?> wildcardClass5 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        int int14 = arrayEntityMap1.size;
        int[] intArray15 = null;
        arrayEntityMap1.values = intArray15;
        arrayEntityMap1.growBy = (short) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
// flaky "24) test0167(org.apache.commons.lang.RegressionTest0)":         entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
// flaky "9) test0167(org.apache.commons.lang.RegressionTest0)":         entities0.addEntity("", (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = entities0.entityValue("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("");
        arrayEntityMap0.ensureCapacity((int) (byte) 100);
        java.lang.String[] strArray5 = arrayEntityMap0.names;
        java.lang.Class<?> wildcardClass6 = arrayEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int3 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        int int16 = hashEntityMap12.value("");
        int int18 = hashEntityMap12.value("hi!");
        java.util.Map map19 = hashEntityMap12.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        hashEntityMap22.mapNameToValue = map27;
        int int30 = hashEntityMap22.value("");
        java.util.Map map31 = hashEntityMap22.mapNameToValue;
        hashEntityMap20.mapNameToValue = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        java.util.Map map35 = hashEntityMap33.mapValueToName;
        java.util.Map map36 = hashEntityMap33.mapNameToValue;
        java.util.Map map37 = hashEntityMap33.mapValueToName;
        hashEntityMap20.mapValueToName = map37;
        hashEntityMap12.mapValueToName = map37;
        hashEntityMap0.mapValueToName = map37;
        java.util.Map map41 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 0);
        java.lang.Class<?> wildcardClass45 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        java.lang.String str7 = null; // flaky "25) test0172(org.apache.commons.lang.RegressionTest0)": entityMap5.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = null; // flaky "26) test0173(org.apache.commons.lang.RegressionTest0)": entities0.entityName(100);
        java.lang.String str6 = null; // flaky "10) test0173(org.apache.commons.lang.RegressionTest0)": entities0.entityName((int) ' ');
        java.lang.String str8 = null; // flaky "3) test0173(org.apache.commons.lang.RegressionTest0)": entities0.entityName((int) '#');
// flaky "1) test0173(org.apache.commons.lang.RegressionTest0)":         entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities1 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray2 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities1.addEntities(strArray2);
        entities0.addEntities(strArray2);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = null; // flaky "27) test0174(org.apache.commons.lang.RegressionTest0)": entities6.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray12 = new int[] {};
        binaryEntityMap11.values = intArray12;
        int int15 = binaryEntityMap11.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        arrayEntityMap16.names = strArray20;
        binaryEntityMap11.names = strArray20;
        int int24 = binaryEntityMap11.value("hi!");
        entities6.map = binaryEntityMap11;
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer27 = null;
        entities26.escape(writer27, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap30 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities26.map = primitiveEntityMap30;
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities33.addEntities(strArray34);
        entities32.addEntities(strArray34);
        java.lang.String[][] strArray37 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities32.addEntities(strArray37);
        entities26.addEntities(strArray37);
        entities6.addEntities(strArray37);
        entities0.addEntities(strArray37);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entities1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities entities2 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str4 = entities2.unescape("");
        java.lang.String str6 = null; // flaky "28) test0175(org.apache.commons.lang.RegressionTest0)": entities2.entityName((int) (short) 0);
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray9 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities8.addEntities(strArray9);
        entities7.addEntities(strArray9);
        entities2.addEntities(strArray9);
        entities0.addEntities(strArray9);
        java.lang.String str15 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer17 = null;
        entities16.escape(writer17, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap20 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities16.map = primitiveEntityMap20;
        java.lang.String str23 = entities16.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer25 = null;
        entities24.escape(writer25, "");
        java.lang.String[][] strArray28 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities24.addEntities(strArray28);
        entities16.addEntities(strArray28);
        java.lang.String str32 = entities16.escape("");
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML32;
        entities33.addEntity("hi!", 0);
        java.lang.String[][] strArray37 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities33.addEntities(strArray37);
        entities16.addEntities(strArray37);
        entities0.addEntities(strArray37);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) '4');
        java.lang.Class<?> wildcardClass2 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities entities3 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer4 = null;
        entities3.escape(writer4, "");
        int int8 = 0; // flaky "29) test0177(org.apache.commons.lang.RegressionTest0)": entities3.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray11 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray11);
        entities9.addEntities(strArray11);
        entities3.addEntities(strArray11);
        entities0.addEntities(strArray11);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 0);
        java.lang.String str20 = binaryEntityMap16.name((int) '#');
        binaryEntityMap16.growBy = (byte) 10;
        binaryEntityMap16.growBy = 1;
        int int25 = binaryEntityMap16.size;
        entities0.map = binaryEntityMap16;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities3);
// flaky "11) test0177(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass11 = map10.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
// flaky "30) test0180(org.apache.commons.lang.RegressionTest0)":         entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.entityName((int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("hi!", (int) 'a');
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        org.apache.commons.lang.Entities entities1 = org.apache.commons.lang.Entities.XML;
        java.lang.String[][] strArray2 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities1.addEntities(strArray2);
        entities0.addEntities(strArray2);
        java.lang.String str6 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = null;
        entities0.map = entityMap7;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entities1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap2.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        hashEntityMap2.mapNameToValue = map7;
        int int10 = hashEntityMap2.value("");
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        hashEntityMap0.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        java.util.Map map17 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapValueToName = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        java.util.Map map21 = hashEntityMap19.mapValueToName;
        java.util.Map map22 = hashEntityMap19.mapNameToValue;
        hashEntityMap19.add("", (int) (byte) 10);
        int int27 = hashEntityMap19.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap28.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        hashEntityMap28.mapNameToValue = map33;
        hashEntityMap19.mapNameToValue = map33;
        hashEntityMap0.mapNameToValue = map33;
        java.util.Map map37 = hashEntityMap0.mapValueToName;
        java.lang.String str39 = hashEntityMap0.name((int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        java.util.Map map42 = hashEntityMap40.mapValueToName;
        int int44 = hashEntityMap40.value("");
        hashEntityMap40.add("", 1);
        java.util.Map map48 = hashEntityMap40.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = hashEntityMap49.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap51.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapNameToValue;
        hashEntityMap51.mapNameToValue = map56;
        int int59 = hashEntityMap51.value("");
        java.util.Map map60 = hashEntityMap51.mapNameToValue;
        hashEntityMap49.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = hashEntityMap62.mapNameToValue;
        java.util.Map map64 = hashEntityMap62.mapValueToName;
        java.util.Map map65 = hashEntityMap62.mapNameToValue;
        java.util.Map map66 = hashEntityMap62.mapValueToName;
        hashEntityMap49.mapValueToName = map66;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        java.util.Map map70 = hashEntityMap68.mapValueToName;
        java.util.Map map71 = hashEntityMap68.mapNameToValue;
        hashEntityMap68.add("", (int) (byte) 10);
        int int76 = hashEntityMap68.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap77.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = hashEntityMap81.mapNameToValue;
        hashEntityMap77.mapNameToValue = map82;
        hashEntityMap68.mapNameToValue = map82;
        hashEntityMap49.mapNameToValue = map82;
        java.util.Map map86 = hashEntityMap49.mapValueToName;
        hashEntityMap40.mapNameToValue = map86;
        hashEntityMap0.mapValueToName = map86;
        java.util.Map map89 = null;
        hashEntityMap0.mapValueToName = map89;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String str15 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        binaryEntityMap16.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap16.names = strArray26;
        binaryEntityMap0.names = strArray26;
        binaryEntityMap0.size = 32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap31.growBy = (short) 10;
        java.lang.String[] strArray34 = binaryEntityMap31.names;
        int int36 = binaryEntityMap31.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap38.ensureCapacity((int) 'a');
        arrayEntityMap38.ensureCapacity(0);
        arrayEntityMap38.add("hi!", 100);
        java.lang.String str47 = arrayEntityMap38.name((int) 'a');
        int int49 = arrayEntityMap38.value("");
        int[] intArray50 = arrayEntityMap38.values;
        int[] intArray51 = arrayEntityMap38.values;
        binaryEntityMap31.values = intArray51;
        binaryEntityMap0.values = intArray51;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray51);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        int int9 = hashEntityMap5.value("");
        hashEntityMap5.add("", 1);
        java.util.Map map13 = hashEntityMap5.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        int int24 = hashEntityMap16.value("");
        java.util.Map map25 = hashEntityMap16.mapNameToValue;
        hashEntityMap14.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        java.util.Map map31 = hashEntityMap27.mapValueToName;
        hashEntityMap14.mapValueToName = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        java.util.Map map35 = hashEntityMap33.mapValueToName;
        java.util.Map map36 = hashEntityMap33.mapNameToValue;
        hashEntityMap33.add("", (int) (byte) 10);
        int int41 = hashEntityMap33.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap42.mapNameToValue = map47;
        hashEntityMap33.mapNameToValue = map47;
        hashEntityMap14.mapNameToValue = map47;
        java.util.Map map51 = hashEntityMap14.mapValueToName;
        hashEntityMap5.mapNameToValue = map51;
        hashEntityMap0.mapValueToName = map51;
        java.lang.Class<?> wildcardClass54 = hashEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.io.Writer writer14 = null;
        entities0.escape(writer14, "");
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        hashEntityMap5.add("", (int) (byte) 10);
        int int13 = hashEntityMap5.value("");
        java.lang.String str15 = hashEntityMap5.name((int) (byte) 10);
        java.lang.String str17 = hashEntityMap5.name((int) (short) 0);
        java.lang.String str19 = hashEntityMap5.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap21.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        hashEntityMap21.mapNameToValue = map26;
        hashEntityMap20.mapNameToValue = map26;
        java.util.Map map29 = hashEntityMap20.mapNameToValue;
        int int31 = hashEntityMap20.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        java.util.Map map34 = hashEntityMap32.mapValueToName;
        java.util.Map map35 = hashEntityMap32.mapNameToValue;
        hashEntityMap20.mapValueToName = map35;
        hashEntityMap5.mapNameToValue = map35;
        java.lang.String str39 = hashEntityMap5.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int42 = hashEntityMap40.value("hi!");
        java.lang.String str44 = hashEntityMap40.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        java.util.Map map47 = hashEntityMap45.mapValueToName;
        java.util.Map map48 = hashEntityMap45.mapNameToValue;
        hashEntityMap45.add("", (int) (byte) 10);
        int int53 = hashEntityMap45.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap54.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapNameToValue;
        hashEntityMap54.mapNameToValue = map59;
        hashEntityMap45.mapNameToValue = map59;
        java.lang.String str63 = hashEntityMap45.name((int) 'a');
        hashEntityMap45.add("", (int) (short) 1);
        java.util.Map map67 = hashEntityMap45.mapNameToValue;
        hashEntityMap40.mapNameToValue = map67;
        hashEntityMap5.mapValueToName = map67;
        hashEntityMap0.mapNameToValue = map67;
        java.util.Map map71 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        int[] intArray6 = arrayEntityMap0.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        java.lang.String[] strArray13 = arrayEntityMap8.names;
        arrayEntityMap0.names = strArray13;
        arrayEntityMap0.ensureCapacity(97);
        java.lang.String str18 = arrayEntityMap0.name((-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
// flaky "31) test0191(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str5 = entities0.escape("hi!");
        // The following exception was thrown during execution in test generation
        try {
// flaky "12) test0191(org.apache.commons.lang.RegressionTest0)":             org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "4) test0191(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[300]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.size = (short) -1;
        int int5 = binaryEntityMap1.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        int int10 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        int int13 = lookupEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("hi!");
        int int6 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 10);
        int int11 = primitiveEntityMap0.value("");
        int int13 = primitiveEntityMap0.value("");
        java.lang.String str15 = primitiveEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        int int15 = binaryEntityMap11.value("hi!");
        entities0.map = binaryEntityMap11;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        int int7 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap8.mapNameToValue = map14;
        java.util.Map map17 = hashEntityMap8.mapNameToValue;
        int int19 = hashEntityMap8.value("hi!");
        hashEntityMap8.add("", (int) (byte) 0);
        java.lang.String str24 = hashEntityMap8.name((int) (short) 0);
        java.lang.String str26 = hashEntityMap8.name((int) (byte) 0);
        java.util.Map map27 = hashEntityMap8.mapNameToValue;
        java.util.Map map28 = hashEntityMap8.mapNameToValue;
        hashEntityMap0.mapNameToValue = map28;
        java.lang.String str31 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        java.lang.String str17 = entities0.entityName(1);
        java.lang.String str19 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("");
        java.lang.Class<?> wildcardClass11 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        int[] intArray2 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0 });
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "32) test0205(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.io.Writer writer14 = null;
        entities0.escape(writer14, "");
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        int int7 = hashEntityMap0.value("hi!");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass9 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.size;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
// flaky "33) test0209(org.apache.commons.lang.RegressionTest0)":         entities0.addEntity("", 97);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
// flaky "13) test0209(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int17 = arrayEntityMap15.value("hi!");
        entities10.map = arrayEntityMap15;
        arrayEntityMap15.size = (-1);
        entities0.map = arrayEntityMap15;
        java.io.Writer writer22 = null;
        entities0.escape(writer22, "");
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(entityMap25);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        java.lang.String str16 = binaryEntityMap0.name(0);
        java.lang.String str18 = binaryEntityMap0.name(2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        hashEntityMap0.add("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("");
        java.lang.Class<?> wildcardClass7 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.lang.String str37 = entities0.unescape("");
        java.lang.String str39 = entities0.entityName((int) ' ');
        java.lang.String str41 = entities0.entityName(0);
        java.io.Writer writer42 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer42, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        int int15 = binaryEntityMap10.value("");
        binaryEntityMap10.growBy = (short) 1;
        int int19 = binaryEntityMap10.value("");
        int[] intArray20 = binaryEntityMap10.values;
        binaryEntityMap0.values = intArray20;
        binaryEntityMap0.growBy = (short) 100;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (short) 100);
        int[] intArray15 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray15;
        int[] intArray17 = null;
        arrayEntityMap1.values = intArray17;
        arrayEntityMap1.size = 100;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = arrayEntityMap1.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        int int10 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        java.lang.String str11 = arrayEntityMap1.name((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str5 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        arrayEntityMap1.growBy = (byte) 10;
        arrayEntityMap1.add("hi!", (int) (short) 1);
        java.lang.String str22 = arrayEntityMap1.name(10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int8 = primitiveEntityMap6.value("hi!");
        primitiveEntityMap6.add("", (int) (short) 10);
        primitiveEntityMap6.add("", 0);
        entities0.map = primitiveEntityMap6;
        java.lang.String str17 = primitiveEntityMap6.name((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        java.util.Map map15 = null;
        hashEntityMap0.mapNameToValue = map15;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hashEntityMap0.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        java.lang.String str16 = hashEntityMap0.name((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 10);
        java.lang.String str4 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) 10);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
// flaky "34) test0231(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        java.lang.String str16 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str18 = hashEntityMap0.name((int) (byte) 0);
        java.util.Map map19 = hashEntityMap0.mapNameToValue;
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        java.lang.String str18 = hashEntityMap0.name((int) 'a');
        hashEntityMap0.add("", 2);
        int int23 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", 97);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap10 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int12 = primitiveEntityMap10.value("hi!");
        primitiveEntityMap10.add("", (int) (short) 10);
        primitiveEntityMap10.add("", 0);
        java.lang.String str20 = primitiveEntityMap10.name((int) '#');
        java.lang.String str22 = primitiveEntityMap10.name(97);
        int int24 = primitiveEntityMap10.value("");
        int int26 = primitiveEntityMap10.value("");
        entities0.map = primitiveEntityMap10;
        java.lang.String str29 = primitiveEntityMap10.name((int) (byte) 10);
        int int31 = primitiveEntityMap10.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "35) test0234(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky "14) test0234(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", (int) (short) 100);
        lookupEntityMap0.add("", (int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.growBy = 0;
        binaryEntityMap1.add("", 97);
        binaryEntityMap1.size = (short) 100;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        arrayEntityMap1.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null });
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap3.growBy = (short) 10;
        java.lang.String[] strArray6 = binaryEntityMap3.names;
        binaryEntityMap3.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray13;
        binaryEntityMap0.names = strArray13;
        java.lang.String str17 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        binaryEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        java.lang.String str12 = entities0.unescape("");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
// flaky "36) test0239(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        java.lang.String[] strArray13 = arrayEntityMap8.names;
        binaryEntityMap0.names = strArray13;
        int int15 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        binaryEntityMap0.growBy = (short) 0;
        binaryEntityMap0.size = 52;
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("hi!", 52);
        primitiveEntityMap0.add("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.Class<?> wildcardClass5 = entityMap4.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray6 = new int[] {};
        binaryEntityMap5.values = intArray6;
        int int9 = binaryEntityMap5.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        arrayEntityMap10.names = strArray14;
        binaryEntityMap5.names = strArray14;
        int int18 = binaryEntityMap5.value("hi!");
        entities0.map = binaryEntityMap5;
        int int21 = entities0.entityValue("");
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.add("", (int) (byte) 1);
        int int16 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str38 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str5 = primitiveEntityMap0.name((int) ' ');
        java.lang.Class<?> wildcardClass6 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", 10);
        primitiveEntityMap0.add("", (int) '#');
        int int15 = primitiveEntityMap0.value("");
        java.lang.String str17 = primitiveEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        hashEntityMap5.add("", (int) (byte) 10);
        int int13 = hashEntityMap5.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap5.mapNameToValue = map19;
        hashEntityMap5.add("", (int) (short) 0);
        hashEntityMap5.add("hi!", (int) '4');
        entities0.map = hashEntityMap5;
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer29, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        arrayEntityMap8.add("hi!", 100);
        java.lang.String str17 = arrayEntityMap8.name((int) 'a');
        int int19 = arrayEntityMap8.value("");
        arrayEntityMap8.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap24.ensureCapacity((int) 'a');
        int int27 = arrayEntityMap24.growBy;
        java.lang.String[] strArray28 = arrayEntityMap24.names;
        arrayEntityMap8.names = strArray28;
        binaryEntityMap0.names = strArray28;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[97]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int8 = primitiveEntityMap6.value("hi!");
        primitiveEntityMap6.add("", (int) (short) 10);
        primitiveEntityMap6.add("", 0);
        entities0.map = primitiveEntityMap6;
        int int17 = primitiveEntityMap6.value("");
        int int19 = primitiveEntityMap6.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str18 = entities0.entityName((-1));
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        entityMap19.add("", (int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int8 = hashEntityMap6.value("hi!");
        java.util.Map map9 = hashEntityMap6.mapValueToName;
        int int11 = hashEntityMap6.value("");
        java.util.Map map12 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapNameToValue = map12;
        java.lang.String str15 = hashEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        int int19 = hashEntityMap11.value("");
        java.util.Map map20 = hashEntityMap11.mapNameToValue;
        hashEntityMap9.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        java.util.Map map26 = hashEntityMap22.mapValueToName;
        hashEntityMap9.mapValueToName = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        hashEntityMap28.add("", (int) (byte) 10);
        int int36 = hashEntityMap28.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        hashEntityMap28.mapNameToValue = map42;
        hashEntityMap9.mapNameToValue = map42;
        java.util.Map map46 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapNameToValue = map46;
        hashEntityMap0.add("", 97);
        hashEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap57.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        hashEntityMap57.mapNameToValue = map62;
        hashEntityMap56.mapNameToValue = map62;
        java.util.Map map65 = hashEntityMap56.mapNameToValue;
        hashEntityMap54.mapNameToValue = map65;
        hashEntityMap0.mapNameToValue = map65;
        java.lang.Class<?> wildcardClass68 = map65.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) (byte) 100);
        java.lang.String str11 = primitiveEntityMap0.name((int) (byte) 10);
        int int13 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        int int6 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = '#';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        entities0.addEntity("", (int) '4');
        java.lang.String str8 = entities0.unescape("");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("hi!", (int) (short) -1);
        int int14 = arrayEntityMap1.growBy;
        java.lang.String str16 = arrayEntityMap1.name(2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap3.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap3.mapNameToValue = map8;
        hashEntityMap2.mapNameToValue = map8;
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        int int13 = hashEntityMap2.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        hashEntityMap2.mapValueToName = map17;
        hashEntityMap0.mapValueToName = map17;
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 97);
        hashEntityMap0.add("", 0);
        java.lang.Class<?> wildcardClass27 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        java.lang.String str15 = entities0.entityName(10);
        java.lang.String str17 = entities0.escape("hi!");
        java.lang.String str19 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
// flaky "37) test0260(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(100);
        binaryEntityMap1.add("", (-1));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "38) test0262(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
// flaky "15) test0262(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        int[] intArray16 = arrayEntityMap8.values;
        org.junit.Assert.assertNotNull(entities0);
// flaky "39) test0264(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky "16) test0264(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str9 = entities7.unescape("");
        int int11 = entities7.entityValue("");
        int int13 = entities7.entityValue("");
        entities7.addEntity("", 97);
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities7.addEntities(strArray21);
        entities0.addEntities(strArray21);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer25, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        int int11 = entities0.entityValue("hi!");
        java.io.Writer writer12 = null;
        entities0.escape(writer12, "");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
// flaky "40) test0266(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer5, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "41) test0267(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int int12 = binaryEntityMap0.value("");
        java.lang.String str14 = binaryEntityMap0.name((-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.growBy = 0;
        binaryEntityMap1.add("", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = '4';
        int[] intArray12 = binaryEntityMap9.values;
        binaryEntityMap1.values = intArray12;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        hashEntityMap6.mapNameToValue = map12;
        java.util.Map map15 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap0.name((int) '#');
        java.lang.String str20 = hashEntityMap0.name(0);
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        java.util.Map map22 = hashEntityMap0.mapNameToValue;
        java.lang.String str24 = hashEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        int int8 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities entities2 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer3 = null;
        entities2.escape(writer3, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities2.map = primitiveEntityMap6;
        java.lang.String str9 = entities2.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
        java.lang.String[][] strArray14 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray14);
        entities2.addEntities(strArray14);
        entities0.addEntities(strArray14);
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer18, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        int[] intArray13 = binaryEntityMap0.values;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        int int11 = entityMap9.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.unescape("hi!");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "42) test0276(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", 97);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap10 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int12 = primitiveEntityMap10.value("hi!");
        primitiveEntityMap10.add("", (int) (short) 10);
        primitiveEntityMap10.add("", 0);
        java.lang.String str20 = primitiveEntityMap10.name((int) '#');
        java.lang.String str22 = primitiveEntityMap10.name(97);
        int int24 = primitiveEntityMap10.value("");
        int int26 = primitiveEntityMap10.value("");
        entities0.map = primitiveEntityMap10;
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities0.map;
        entityMap28.add("", (int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "43) test0278(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
// flaky "17) test0278(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entityMap28);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        int int6 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.size = (byte) -1;
        int int6 = arrayEntityMap0.value("hi!");
        int int7 = arrayEntityMap0.size;
        java.lang.Class<?> wildcardClass8 = arrayEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int16 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        int int7 = binaryEntityMap0.size;
        int int8 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap12.ensureCapacity((int) 'a');
        arrayEntityMap12.growBy = (byte) 100;
        arrayEntityMap12.ensureCapacity(10);
        java.lang.String str20 = arrayEntityMap12.name((int) (byte) 1);
        int[] intArray21 = arrayEntityMap12.values;
        binaryEntityMap0.values = intArray21;
        java.lang.Class<?> wildcardClass23 = intArray21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int8 = primitiveEntityMap6.value("hi!");
        primitiveEntityMap6.add("", (int) (short) 10);
        primitiveEntityMap6.add("", 0);
        entities0.map = primitiveEntityMap6;
        int int17 = primitiveEntityMap6.value("");
        int int19 = primitiveEntityMap6.value("");
        primitiveEntityMap6.add("hi!", (int) '4');
        primitiveEntityMap6.add("", 32);
        primitiveEntityMap6.add("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap1.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.growBy = (short) 10;
        java.lang.String[] strArray7 = binaryEntityMap4.names;
        int[] intArray8 = binaryEntityMap4.values;
        int[] intArray9 = binaryEntityMap4.values;
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap4.names = strArray14;
        arrayEntityMap1.names = strArray14;
        arrayEntityMap1.size = 35;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 35 out of bounds for object array[4]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!" });
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        int int7 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap8.mapNameToValue = map14;
        java.util.Map map17 = hashEntityMap8.mapNameToValue;
        hashEntityMap8.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int23 = hashEntityMap21.value("hi!");
        java.util.Map map24 = hashEntityMap21.mapValueToName;
        int int26 = hashEntityMap21.value("");
        java.util.Map map27 = hashEntityMap21.mapNameToValue;
        hashEntityMap8.mapValueToName = map27;
        hashEntityMap0.mapNameToValue = map27;
        hashEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str4 = binaryEntityMap2.name((int) (byte) 0);
        int int6 = binaryEntityMap2.value("");
        binaryEntityMap2.growBy = 10;
        binaryEntityMap2.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray15 = new int[] {};
        binaryEntityMap14.values = intArray15;
        int int18 = binaryEntityMap14.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        arrayEntityMap19.names = strArray23;
        binaryEntityMap14.names = strArray23;
        binaryEntityMap13.names = strArray23;
        binaryEntityMap2.names = strArray23;
        arrayEntityMap1.names = strArray23;
        arrayEntityMap1.growBy = (short) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "44) test0287(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "18) test0287(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("hi!", (-1));
        primitiveEntityMap0.add("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "45) test0290(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "19) test0290(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = 10;
        java.lang.String str9 = arrayEntityMap1.name((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap0.names = strArray11;
        java.lang.String str14 = binaryEntityMap0.name(100);
        java.lang.Class<?> wildcardClass15 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        java.lang.String str10 = binaryEntityMap0.name(32);
        java.lang.Class<?> wildcardClass11 = binaryEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.growBy;
        java.lang.Class<?> wildcardClass8 = binaryEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        int int7 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.Class<?> wildcardClass4 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        int int15 = binaryEntityMap11.value("hi!");
        entities0.map = binaryEntityMap11;
        java.lang.String str18 = binaryEntityMap11.name((int) (short) 100);
        int int19 = binaryEntityMap11.size;
        binaryEntityMap11.growBy = (short) 1;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "46) test0299(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str6);
// flaky "20) test0299(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap7.name((int) '#');
        int[] intArray12 = binaryEntityMap7.values;
        entities0.map = binaryEntityMap7;
        java.io.Writer writer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer14, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        java.lang.String str13 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        java.lang.String str13 = binaryEntityMap0.name((-1));
        int int15 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.lang.String str4 = hashEntityMap0.name(100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap6.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        hashEntityMap6.mapNameToValue = map11;
        hashEntityMap5.mapNameToValue = map11;
        java.util.Map map14 = hashEntityMap5.mapNameToValue;
        java.util.Map map15 = hashEntityMap5.mapNameToValue;
        int int17 = hashEntityMap5.value("hi!");
        java.util.Map map18 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap17.ensureCapacity((int) 'a');
        int int20 = arrayEntityMap17.growBy;
        java.lang.String[] strArray21 = arrayEntityMap17.names;
        arrayEntityMap1.names = strArray21;
        int[] intArray23 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str9 = entities0.unescape("");
// flaky "47) test0305(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        int[] intArray6 = arrayEntityMap0.values;
        arrayEntityMap0.size = 2;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.io.Writer writer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer36, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", 10);
        java.lang.String str12 = primitiveEntityMap0.name(97);
        java.lang.Class<?> wildcardClass13 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        int[] intArray14 = binaryEntityMap0.values;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        java.lang.String str16 = hashEntityMap0.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        java.lang.String str20 = hashEntityMap17.name((int) (byte) 0);
        java.util.Map map21 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        int int32 = hashEntityMap24.value("");
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        hashEntityMap22.mapNameToValue = map33;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        java.util.Map map37 = hashEntityMap35.mapValueToName;
        java.util.Map map38 = hashEntityMap35.mapNameToValue;
        java.util.Map map39 = hashEntityMap35.mapValueToName;
        hashEntityMap22.mapValueToName = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        java.util.Map map43 = hashEntityMap41.mapValueToName;
        java.util.Map map44 = hashEntityMap41.mapNameToValue;
        hashEntityMap41.add("", (int) (byte) 10);
        int int49 = hashEntityMap41.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap50.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        hashEntityMap50.mapNameToValue = map55;
        hashEntityMap41.mapNameToValue = map55;
        hashEntityMap22.mapNameToValue = map55;
        java.util.Map map59 = hashEntityMap22.mapValueToName;
        hashEntityMap17.mapValueToName = map59;
        hashEntityMap0.mapNameToValue = map59;
        java.lang.Class<?> wildcardClass62 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (short) 100);
        int[] intArray15 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray15;
        int int17 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str12 = entities10.unescape("");
        java.io.Writer writer13 = null;
        entities10.escape(writer13, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities10.map = arrayEntityMap17;
        java.lang.String str20 = arrayEntityMap17.name((int) (byte) 100);
        java.lang.String[] strArray21 = arrayEntityMap17.names;
        int int22 = arrayEntityMap17.size;
        entities0.map = arrayEntityMap17;
        java.lang.String str25 = entities0.unescape("hi!");
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer26, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str6 = binaryEntityMap4.name((int) (byte) 0);
        java.lang.String str8 = binaryEntityMap4.name((int) '#');
        binaryEntityMap4.growBy = (byte) 10;
        binaryEntityMap4.growBy = 1;
        java.lang.String[] strArray13 = binaryEntityMap4.names;
        binaryEntityMap3.names = strArray13;
        arrayEntityMap1.names = strArray13;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.ensureCapacity((int) (short) 10);
        java.lang.String str10 = binaryEntityMap0.name(97);
        int int12 = binaryEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("hi!");
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer15, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky "48) test0317(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) '4');
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        java.lang.Class<?> wildcardClass17 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(0);
        java.lang.String str9 = lookupEntityMap0.name(100);
        int int11 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 100);
        binaryEntityMap0.growBy = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", 97);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int17 = arrayEntityMap15.value("hi!");
        entities10.map = arrayEntityMap15;
        arrayEntityMap15.size = (-1);
        entities0.map = arrayEntityMap15;
        java.io.Writer writer22 = null;
        entities0.escape(writer22, "");
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        java.io.Writer writer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer26, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(entityMap25);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap10.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        binaryEntityMap10.names = strArray20;
        binaryEntityMap7.names = strArray20;
        java.lang.String[] strArray23 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray23;
        java.lang.Class<?> wildcardClass25 = strArray23.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("", 2);
        int int15 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
// flaky "49) test0325(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        int int9 = arrayEntityMap5.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("hi!");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        int int11 = entities0.entityValue("");
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer12, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap3.growBy = (short) 10;
        java.lang.String[] strArray6 = binaryEntityMap3.names;
        binaryEntityMap3.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray13;
        binaryEntityMap0.names = strArray13;
        java.lang.String str17 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str12 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.size = (short) -1;
        int int5 = binaryEntityMap1.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        int int11 = entities0.entityValue("");
        int int13 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name(10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap2.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        hashEntityMap2.mapNameToValue = map7;
        int int10 = hashEntityMap2.value("");
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        hashEntityMap0.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        java.util.Map map17 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapValueToName = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        java.util.Map map21 = hashEntityMap19.mapValueToName;
        java.util.Map map22 = hashEntityMap19.mapNameToValue;
        hashEntityMap19.add("", (int) (byte) 10);
        int int27 = hashEntityMap19.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap28.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        hashEntityMap28.mapNameToValue = map33;
        hashEntityMap19.mapNameToValue = map33;
        hashEntityMap0.mapNameToValue = map33;
        int int38 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap40.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        hashEntityMap40.mapNameToValue = map45;
        hashEntityMap39.mapNameToValue = map45;
        java.util.Map map48 = hashEntityMap39.mapNameToValue;
        int int50 = hashEntityMap39.value("hi!");
        hashEntityMap39.add("", (int) (byte) 0);
        java.lang.String str55 = hashEntityMap39.name((int) (short) 0);
        java.lang.String str57 = hashEntityMap39.name((int) (byte) 0);
        int int59 = hashEntityMap39.value("hi!");
        java.util.Map map60 = hashEntityMap39.mapNameToValue;
        hashEntityMap0.mapNameToValue = map60;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        arrayEntityMap1.growBy = (-1);
        java.lang.Class<?> wildcardClass12 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = '4';
        java.lang.String str15 = binaryEntityMap11.name(100);
        int int16 = binaryEntityMap11.growBy;
        java.lang.String str18 = binaryEntityMap11.name((int) ' ');
        int[] intArray19 = binaryEntityMap11.values;
        java.lang.String str21 = binaryEntityMap11.name(2);
        entities0.map = binaryEntityMap11;
        java.lang.String str24 = binaryEntityMap11.name((int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        java.lang.String str15 = entities0.entityName((int) (byte) 10);
        java.lang.String str17 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap18 = null;
        entities0.map = entityMap18;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(entityMap20);
        org.junit.Assert.assertNull(entityMap21);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(35);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        java.lang.String str17 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.size = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[10]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        binaryEntityMap0.growBy = (short) 10;
        java.lang.Class<?> wildcardClass7 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        hashEntityMap5.add("", (int) (byte) 10);
        int int13 = hashEntityMap5.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap5.mapNameToValue = map19;
        hashEntityMap5.add("", (int) (short) 0);
        hashEntityMap5.add("hi!", (int) '4');
        entities0.map = hashEntityMap5;
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer29, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int int7 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        int int11 = binaryEntityMap0.size;
        java.lang.Class<?> wildcardClass12 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        int int15 = hashEntityMap0.value("");
        int int17 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("", 52);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String str4 = binaryEntityMap1.name((int) ' ');
        int int6 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.size = (short) -1;
        int int5 = binaryEntityMap1.value("hi!");
        int int6 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray8 = new int[] {};
        binaryEntityMap7.values = intArray8;
        int int11 = binaryEntityMap7.value("");
        java.lang.String str13 = binaryEntityMap7.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        int int19 = binaryEntityMap14.value("");
        binaryEntityMap14.growBy = (short) 1;
        binaryEntityMap14.size = 100;
        binaryEntityMap14.add("", 100);
        java.lang.String[] strArray27 = binaryEntityMap14.names;
        binaryEntityMap7.names = strArray27;
        binaryEntityMap7.size = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        java.lang.String str37 = binaryEntityMap33.name((int) '#');
        binaryEntityMap33.growBy = (byte) 10;
        binaryEntityMap33.growBy = 1;
        java.lang.String[] strArray42 = binaryEntityMap33.names;
        binaryEntityMap32.names = strArray42;
        binaryEntityMap7.names = strArray42;
        binaryEntityMap1.names = strArray42;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray42);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String str15 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        binaryEntityMap16.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap16.names = strArray26;
        binaryEntityMap0.names = strArray26;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int15 = primitiveEntityMap13.value("hi!");
        primitiveEntityMap13.add("", (int) (short) 10);
        primitiveEntityMap13.add("", 0);
        int int23 = primitiveEntityMap13.value("");
        entities0.map = primitiveEntityMap13;
        java.lang.String str26 = entities0.unescape("");
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "50) test0353(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "21) test0353(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "5) test0353(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("hi!");
        java.lang.String str16 = entities0.entityName((int) ' ');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "51) test0356(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap6 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int8 = primitiveEntityMap6.value("hi!");
        primitiveEntityMap6.add("", (int) (short) 10);
        primitiveEntityMap6.add("", 0);
        entities0.map = primitiveEntityMap6;
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap16 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int18 = primitiveEntityMap16.value("hi!");
        entities0.map = primitiveEntityMap16;
        int int21 = primitiveEntityMap16.value("hi!");
        primitiveEntityMap16.add("hi!", 35);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        binaryEntityMap1.add("", 35);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.lang.String str37 = entities0.entityName((int) ' ');
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer38, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.size = (byte) -1;
        int int16 = binaryEntityMap0.growBy;
        java.lang.Class<?> wildcardClass17 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        int int7 = arrayEntityMap1.value("hi!");
        int int9 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap2.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        hashEntityMap2.mapNameToValue = map7;
        int int10 = hashEntityMap2.value("");
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        hashEntityMap0.mapNameToValue = map11;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        java.util.Map map17 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapValueToName = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        java.util.Map map21 = hashEntityMap19.mapValueToName;
        java.util.Map map22 = hashEntityMap19.mapNameToValue;
        hashEntityMap19.add("", (int) (byte) 10);
        int int27 = hashEntityMap19.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap28.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        hashEntityMap28.mapNameToValue = map33;
        hashEntityMap19.mapNameToValue = map33;
        hashEntityMap0.mapNameToValue = map33;
        java.util.Map map37 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass38 = map37.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.size = (byte) -1;
        int int6 = arrayEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap0.add("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = entities0.entityName((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray13 = null;
        binaryEntityMap12.names = strArray13;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        entities0.map = binaryEntityMap12;
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray15);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(52);
        java.lang.String str16 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str18 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("hi!", 32);
        int int23 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.XML;
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        hashEntityMap5.add("", (int) (byte) 10);
        int int13 = hashEntityMap5.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap5.mapNameToValue = map19;
        hashEntityMap5.add("", (int) (short) 0);
        hashEntityMap5.add("hi!", (int) '4');
        entities0.map = hashEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str31 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities0.map;
        java.io.Writer writer33 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer33, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(entityMap32);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(10);
        java.lang.String str12 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap3.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap3.mapNameToValue = map8;
        hashEntityMap2.mapNameToValue = map8;
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        int int13 = hashEntityMap2.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        hashEntityMap2.mapValueToName = map17;
        hashEntityMap0.mapValueToName = map17;
        int int21 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str4 = binaryEntityMap2.name((int) (byte) 0);
        int int6 = binaryEntityMap2.value("");
        binaryEntityMap2.growBy = 10;
        binaryEntityMap2.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray15 = new int[] {};
        binaryEntityMap14.values = intArray15;
        int int18 = binaryEntityMap14.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        arrayEntityMap19.names = strArray23;
        binaryEntityMap14.names = strArray23;
        binaryEntityMap13.names = strArray23;
        binaryEntityMap2.names = strArray23;
        arrayEntityMap1.names = strArray23;
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer30 = null;
        entities29.escape(writer30, "");
        int int34 = entities29.entityValue("");
        java.lang.String str36 = entities29.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap38.growBy = (short) 10;
        java.lang.String[] strArray41 = binaryEntityMap38.names;
        arrayEntityMap37.names = strArray41;
        int[] intArray43 = arrayEntityMap37.values;
        entities29.map = arrayEntityMap37;
        arrayEntityMap37.growBy = (short) 10;
        java.lang.String str48 = arrayEntityMap37.name(10);
        int[] intArray49 = arrayEntityMap37.values;
        arrayEntityMap1.values = intArray49;
        arrayEntityMap1.growBy = (byte) 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", (int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        hashEntityMap0.add("", (int) (short) 0);
        hashEntityMap0.add("hi!", (int) '4');
        java.util.Map map23 = hashEntityMap0.mapNameToValue;
        int int25 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        int int14 = arrayEntityMap1.size;
        int[] intArray15 = null;
        arrayEntityMap1.values = intArray15;
        arrayEntityMap1.growBy = 0;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) '#');
        int int14 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap7.name((int) '#');
        int[] intArray12 = binaryEntityMap7.values;
        entities0.map = binaryEntityMap7;
        java.lang.String str15 = entities0.entityName(0);
        int int17 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("hi!");
        int int10 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[300]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        entities0.addEntity("", (int) '4');
        java.lang.String str8 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        int int9 = hashEntityMap0.value("");
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 10);
        lookupEntityMap0.add("", 0);
        lookupEntityMap0.add("", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.growBy = (short) 0;
        int int15 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap7.ensureCapacity((int) 'a');
        arrayEntityMap7.ensureCapacity(0);
        arrayEntityMap7.add("hi!", 100);
        java.lang.String str16 = arrayEntityMap7.name((int) 'a');
        int int18 = arrayEntityMap7.value("");
        int[] intArray19 = arrayEntityMap7.values;
        int int20 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.io.Writer writer22 = null;
        entities0.escape(writer22, "");
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer25, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.unescape("hi!");
        java.lang.String str12 = entities0.entityName((int) (byte) -1);
        int int14 = entities0.entityValue("hi!");
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) '4');
// flaky "52) test0387(org.apache.commons.lang.RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "22) test0387(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
// flaky "6) test0387(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        java.lang.String str3 = binaryEntityMap1.name((int) '4');
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap3.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap3.mapNameToValue = map8;
        hashEntityMap2.mapNameToValue = map8;
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        int int13 = hashEntityMap2.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        hashEntityMap2.mapValueToName = map17;
        hashEntityMap0.mapValueToName = map17;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        hashEntityMap22.mapNameToValue = map27;
        int int30 = hashEntityMap22.value("");
        java.util.Map map31 = hashEntityMap22.mapNameToValue;
        hashEntityMap20.mapNameToValue = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        java.util.Map map35 = hashEntityMap33.mapValueToName;
        java.util.Map map36 = hashEntityMap33.mapNameToValue;
        java.util.Map map37 = hashEntityMap33.mapValueToName;
        hashEntityMap20.mapValueToName = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapNameToValue;
        java.util.Map map41 = hashEntityMap39.mapValueToName;
        java.util.Map map42 = hashEntityMap39.mapNameToValue;
        hashEntityMap39.add("", (int) (byte) 10);
        int int47 = hashEntityMap39.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap48.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        hashEntityMap48.mapNameToValue = map53;
        hashEntityMap39.mapNameToValue = map53;
        hashEntityMap20.mapNameToValue = map53;
        hashEntityMap0.mapValueToName = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapNameToValue;
        java.util.Map map60 = hashEntityMap58.mapValueToName;
        int int62 = hashEntityMap58.value("");
        int int64 = hashEntityMap58.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap65.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map70 = hashEntityMap69.mapNameToValue;
        hashEntityMap65.mapNameToValue = map70;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        hashEntityMap65.mapValueToName = map73;
        hashEntityMap58.mapValueToName = map73;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = hashEntityMap76.mapNameToValue;
        java.util.Map map78 = hashEntityMap76.mapValueToName;
        int int80 = hashEntityMap76.value("");
        java.util.Map map81 = hashEntityMap76.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int84 = hashEntityMap82.value("hi!");
        java.util.Map map85 = hashEntityMap82.mapValueToName;
        int int87 = hashEntityMap82.value("");
        java.util.Map map88 = hashEntityMap82.mapNameToValue;
        hashEntityMap76.mapNameToValue = map88;
        hashEntityMap58.mapValueToName = map88;
        hashEntityMap0.mapNameToValue = map88;
        java.lang.String str93 = hashEntityMap0.name(32);
        hashEntityMap0.add("hi!", (int) (short) 0);
        hashEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap7.mapValueToName = map15;
        hashEntityMap0.mapValueToName = map15;
        java.lang.Class<?> wildcardClass18 = map15.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        int int10 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        int int14 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        java.lang.Class<?> wildcardClass3 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "53) test0395(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        int[] intArray13 = binaryEntityMap0.values;
        int int14 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray17 = binaryEntityMap0.values;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.growBy = 52;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        entities0.addEntities(strArray8);
        java.lang.String str11 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][] {});
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.lang.String str12 = entities0.escape("hi!");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        int int10 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray3 = new int[] {};
        binaryEntityMap2.values = intArray3;
        int int6 = binaryEntityMap2.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        arrayEntityMap7.names = strArray11;
        binaryEntityMap2.names = strArray11;
        binaryEntityMap1.names = strArray11;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        int int19 = hashEntityMap11.value("");
        java.util.Map map20 = hashEntityMap11.mapNameToValue;
        hashEntityMap9.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        java.util.Map map26 = hashEntityMap22.mapValueToName;
        hashEntityMap9.mapValueToName = map26;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        hashEntityMap28.add("", (int) (byte) 10);
        int int36 = hashEntityMap28.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        hashEntityMap28.mapNameToValue = map42;
        hashEntityMap9.mapNameToValue = map42;
        java.util.Map map46 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapNameToValue = map46;
        java.lang.String str49 = hashEntityMap0.name(97);
        org.apache.commons.lang.Entities entities50 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str52 = entities50.unescape("");
        int int54 = entities50.entityValue("");
        int int56 = entities50.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int59 = hashEntityMap57.value("hi!");
        java.util.Map map60 = hashEntityMap57.mapValueToName;
        int int62 = hashEntityMap57.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap64.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        hashEntityMap64.mapNameToValue = map69;
        hashEntityMap63.mapNameToValue = map69;
        java.util.Map map72 = hashEntityMap63.mapNameToValue;
        hashEntityMap57.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap74.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map79 = hashEntityMap78.mapNameToValue;
        hashEntityMap74.mapNameToValue = map79;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = hashEntityMap81.mapNameToValue;
        hashEntityMap74.mapValueToName = map82;
        hashEntityMap57.mapNameToValue = map82;
        entities50.map = hashEntityMap57;
        int int87 = hashEntityMap57.value("");
        java.util.Map map88 = hashEntityMap57.mapValueToName;
        hashEntityMap0.mapValueToName = map88;
        hashEntityMap0.add("", 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(entities50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
// flaky "54) test0403(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
// flaky "23) test0403(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str4 = entities0.unescape("hi!");
        java.lang.String str6 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entityMap7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.unescape("");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "55) test0405(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        java.lang.String str11 = binaryEntityMap0.name(52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int8 = hashEntityMap6.value("hi!");
        java.util.Map map9 = hashEntityMap6.mapValueToName;
        int int11 = hashEntityMap6.value("");
        java.util.Map map12 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapNameToValue = map12;
        java.lang.Class<?> wildcardClass14 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        int int17 = hashEntityMap0.value("hi!");
        int int19 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap3.growBy = (short) 10;
        java.lang.String[] strArray6 = binaryEntityMap3.names;
        binaryEntityMap3.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray13;
        binaryEntityMap0.names = strArray13;
        java.lang.String str17 = binaryEntityMap0.name((int) (short) 100);
        java.lang.String str19 = binaryEntityMap0.name(52);
        java.lang.String str21 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        int int10 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        java.lang.String str15 = binaryEntityMap11.name((int) '#');
        int[] intArray16 = binaryEntityMap11.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int18 = binaryEntityMap17.growBy;
        binaryEntityMap17.add("", (int) (short) 100);
        binaryEntityMap17.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap25.ensureCapacity((int) 'a');
        arrayEntityMap25.ensureCapacity(0);
        arrayEntityMap25.add("hi!", 100);
        java.lang.String str34 = arrayEntityMap25.name((int) 'a');
        int int36 = arrayEntityMap25.value("");
        arrayEntityMap25.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap41.ensureCapacity((int) 'a');
        int int44 = arrayEntityMap41.growBy;
        java.lang.String[] strArray45 = arrayEntityMap41.names;
        arrayEntityMap25.names = strArray45;
        binaryEntityMap17.names = strArray45;
        binaryEntityMap11.names = strArray45;
        binaryEntityMap0.names = strArray45;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int13 = arrayEntityMap1.value("hi!");
        int int14 = arrayEntityMap1.growBy;
        int int15 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str16 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str7 = binaryEntityMap5.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap15.growBy = (short) 10;
        java.lang.String[] strArray18 = binaryEntityMap15.names;
        binaryEntityMap8.names = strArray18;
        binaryEntityMap5.names = strArray18;
        binaryEntityMap5.growBy = (short) 0;
        entities0.map = binaryEntityMap5;
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities16.map = arrayEntityMap20;
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str24 = entities22.unescape("");
        java.lang.String str26 = entities22.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray28 = new int[] {};
        binaryEntityMap27.values = intArray28;
        int int31 = binaryEntityMap27.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        arrayEntityMap32.names = strArray36;
        binaryEntityMap27.names = strArray36;
        int int40 = binaryEntityMap27.value("hi!");
        entities22.map = binaryEntityMap27;
        java.lang.String str43 = binaryEntityMap27.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        int[] intArray47 = binaryEntityMap44.values;
        binaryEntityMap27.values = intArray47;
        arrayEntityMap20.values = intArray47;
        arrayEntityMap8.values = intArray47;
        java.lang.String str52 = arrayEntityMap8.name((int) 'a');
        int int54 = arrayEntityMap8.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        int int11 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (-1));
        binaryEntityMap0.add("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        binaryEntityMap0.add("", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.size = 100;
        int int9 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.lang.String[][] strArray8 = new java.lang.String[][] {};
        entities0.addEntities(strArray8);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[][] {});
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String str15 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str19 = arrayEntityMap17.name((int) (short) 100);
        int[] intArray22 = new int[] { (short) 0, (-1) };
        arrayEntityMap17.values = intArray22;
        binaryEntityMap0.values = intArray22;
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("hi!", 10);
        binaryEntityMap0.size = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = binaryEntityMap0.name((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, (-1) });
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        java.lang.String str12 = entities0.unescape("");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer14 = null;
        entities13.escape(writer14, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap17 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities13.map = primitiveEntityMap17;
        java.lang.String str20 = entities13.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer22 = null;
        entities21.escape(writer22, "");
        java.lang.String[][] strArray25 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities21.addEntities(strArray25);
        entities13.addEntities(strArray25);
        entities0.addEntities(strArray25);
        java.lang.Class<?> wildcardClass29 = strArray25.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        java.lang.String str17 = entities0.entityName(1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("", 1);
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer22, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", (int) (short) -1);
        primitiveEntityMap0.add("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray6 = new int[] {};
        binaryEntityMap5.values = intArray6;
        int int9 = binaryEntityMap5.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        arrayEntityMap10.names = strArray14;
        binaryEntityMap5.names = strArray14;
        int int18 = binaryEntityMap5.value("hi!");
        entities0.map = binaryEntityMap5;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entityMap20.add("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(entityMap20);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        int int9 = primitiveEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        int int14 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.io.Writer writer36 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer36, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        java.lang.String str15 = entities0.entityName(10);
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int7 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        int int9 = arrayEntityMap6.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        java.util.Map map13 = hashEntityMap9.mapNameToValue;
        java.util.Map map14 = hashEntityMap9.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        hashEntityMap15.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap15.mapNameToValue;
        hashEntityMap15.add("", (int) (byte) 1);
        java.util.Map map28 = hashEntityMap15.mapNameToValue;
        hashEntityMap9.mapNameToValue = map28;
        hashEntityMap0.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        java.util.Map map33 = hashEntityMap31.mapValueToName;
        java.util.Map map34 = hashEntityMap31.mapNameToValue;
        hashEntityMap31.add("", (int) (byte) 10);
        int int39 = hashEntityMap31.value("");
        java.lang.String str41 = hashEntityMap31.name((int) (byte) 10);
        java.lang.String str43 = hashEntityMap31.name((int) (short) 0);
        java.util.Map map44 = hashEntityMap31.mapValueToName;
        hashEntityMap0.mapValueToName = map44;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int15 = hashEntityMap13.value("hi!");
        java.util.Map map16 = hashEntityMap13.mapValueToName;
        int int18 = hashEntityMap13.value("");
        java.util.Map map19 = hashEntityMap13.mapNameToValue;
        hashEntityMap0.mapValueToName = map19;
        hashEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        hashEntityMap24.add("hi!", (int) 'a');
        int int35 = hashEntityMap24.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int38 = hashEntityMap36.value("hi!");
        java.util.Map map39 = hashEntityMap36.mapValueToName;
        int int41 = hashEntityMap36.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap43.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        hashEntityMap43.mapNameToValue = map48;
        hashEntityMap42.mapNameToValue = map48;
        java.util.Map map51 = hashEntityMap42.mapNameToValue;
        hashEntityMap36.mapNameToValue = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap53.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        hashEntityMap53.mapNameToValue = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = hashEntityMap60.mapNameToValue;
        hashEntityMap53.mapValueToName = map61;
        hashEntityMap36.mapNameToValue = map61;
        hashEntityMap24.mapNameToValue = map61;
        hashEntityMap0.mapNameToValue = map61;
        int int67 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.add("", (int) (short) 100);
        int[] intArray15 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray15;
        int[] intArray17 = null;
        arrayEntityMap1.values = intArray17;
        arrayEntityMap1.size = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        int int13 = hashEntityMap0.value("hi!");
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        java.util.Map map15 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        arrayEntityMap1.growBy = (byte) 10;
        int int19 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.growBy = ' ';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int18 = binaryEntityMap16.value("hi!");
        int[] intArray19 = binaryEntityMap16.values;
        int int20 = binaryEntityMap16.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        arrayEntityMap21.names = strArray25;
        int[] intArray27 = arrayEntityMap21.values;
        arrayEntityMap21.add("hi!", (int) '4');
        int int31 = arrayEntityMap21.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str34 = binaryEntityMap32.name((int) (byte) 0);
        int int36 = binaryEntityMap32.value("");
        binaryEntityMap32.growBy = 10;
        binaryEntityMap32.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray45 = new int[] {};
        binaryEntityMap44.values = intArray45;
        int int48 = binaryEntityMap44.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap50.growBy = (short) 10;
        java.lang.String[] strArray53 = binaryEntityMap50.names;
        arrayEntityMap49.names = strArray53;
        binaryEntityMap44.names = strArray53;
        binaryEntityMap43.names = strArray53;
        binaryEntityMap32.names = strArray53;
        arrayEntityMap21.names = strArray53;
        binaryEntityMap16.names = strArray53;
        binaryEntityMap0.names = strArray53;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] {});
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = entities0.entityName((int) ' ');
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        binaryEntityMap0.add("", 0);
        int int12 = binaryEntityMap0.value("hi!");
        int int13 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.unescape("hi!");
        entities0.addEntity("hi!", (int) (byte) 1);
        java.lang.String str17 = entities0.entityName((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", (int) (short) -1);
        int int21 = primitiveEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass22 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 100);
        int int13 = binaryEntityMap0.size;
        binaryEntityMap0.size = 97;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        java.lang.String str16 = binaryEntityMap0.name(0);
        java.lang.String str18 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap0.mapNameToValue = map14;
        java.lang.String str18 = hashEntityMap0.name((int) 'a');
        hashEntityMap0.add("", (int) (short) 1);
        hashEntityMap0.add("", (int) (byte) 0);
        java.util.Map map25 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass26 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 100);
        hashEntityMap0.add("", 32);
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.lang.String str10 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int13 = arrayEntityMap1.value("hi!");
        int int15 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("hi!", 52);
        int int5 = arrayEntityMap0.value("");
        arrayEntityMap0.add("hi!", (int) (byte) 100);
        int int10 = arrayEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", 35);
        int int15 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int15 = hashEntityMap13.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        hashEntityMap13.mapNameToValue = map17;
        hashEntityMap0.mapNameToValue = map17;
        java.lang.Class<?> wildcardClass20 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
// flaky "56) test0452(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        int int7 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.growBy = 1;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap1.size = (byte) -1;
        int[] intArray4 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        binaryEntityMap8.add("", (int) (byte) 0);
        binaryEntityMap8.growBy = 0;
        binaryEntityMap8.add("hi!", 2);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int21 = arrayEntityMap19.value("hi!");
        java.lang.String[] strArray22 = arrayEntityMap19.names;
        java.lang.String[] strArray23 = arrayEntityMap19.names;
        binaryEntityMap8.names = strArray23;
        arrayEntityMap1.names = strArray23;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.add("", (int) (short) 10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 10, (-1) });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap0.name((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        java.lang.String str15 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int18 = arrayEntityMap16.value("hi!");
        arrayEntityMap16.size = (byte) -1;
        entities0.map = arrayEntityMap16;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap16.add("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("");
        java.lang.String str10 = entities0.entityName(97);
        java.lang.Class<?> wildcardClass11 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
// flaky "57) test0458(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        arrayEntityMap5.names = strArray9;
        binaryEntityMap0.names = strArray9;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String str15 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str19 = arrayEntityMap17.name((int) (short) 100);
        int[] intArray22 = new int[] { (short) 0, (-1) };
        arrayEntityMap17.values = intArray22;
        binaryEntityMap0.values = intArray22;
        java.lang.String str26 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.add("hi!", (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 100, (-1) });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap2 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap3.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap3.mapNameToValue = map8;
        hashEntityMap2.mapNameToValue = map8;
        java.util.Map map11 = hashEntityMap2.mapNameToValue;
        int int13 = hashEntityMap2.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        hashEntityMap2.mapValueToName = map17;
        hashEntityMap0.mapValueToName = map17;
        hashEntityMap0.add("hi!", (int) (short) 10);
        int int24 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int[] intArray6 = arrayEntityMap1.values;
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        int int8 = hashEntityMap0.value("");
        int int10 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
// flaky "58) test0464(org.apache.commons.lang.RegressionTest0)":         entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.lang.String str9 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.ensureCapacity(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
// flaky "59) test0467(org.apache.commons.lang.RegressionTest0)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.unescape("");
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        java.lang.String str11 = arrayEntityMap1.name((int) (byte) -1);
        java.lang.String[] strArray12 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        java.util.Map map8 = hashEntityMap6.mapValueToName;
        java.util.Map map9 = hashEntityMap6.mapNameToValue;
        hashEntityMap6.add("", (int) (byte) 10);
        int int14 = hashEntityMap6.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap6.mapNameToValue = map20;
        java.lang.String str24 = hashEntityMap6.name((int) 'a');
        hashEntityMap6.add("", (int) (short) 1);
        hashEntityMap6.add("", (int) (byte) 0);
        java.util.Map map31 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap34 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str36 = lookupEntityMap34.name((int) (short) 0);
        java.lang.String str38 = lookupEntityMap34.name((int) (short) 1);
        java.lang.String str40 = lookupEntityMap34.name((int) (byte) 100);
        java.lang.String str42 = lookupEntityMap34.name(97);
        java.lang.String str44 = lookupEntityMap34.name(32);
        entities0.map = lookupEntityMap34;
        org.apache.commons.lang.Entities.EntityMap entityMap46 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(entityMap46);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer9, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str11 = binaryEntityMap9.name((int) (byte) 0);
        int int13 = binaryEntityMap9.value("hi!");
        binaryEntityMap9.ensureCapacity(52);
        int int17 = binaryEntityMap9.value("hi!");
        entities0.map = binaryEntityMap9;
        java.lang.Class<?> wildcardClass19 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        hashEntityMap6.mapNameToValue = map12;
        java.util.Map map15 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapNameToValue = map15;
        java.lang.String str18 = hashEntityMap0.name((int) '#');
        java.lang.String str20 = hashEntityMap0.name(0);
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) '4');
        java.lang.String str26 = hashEntityMap0.name(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap10.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        binaryEntityMap10.names = strArray20;
        binaryEntityMap7.names = strArray20;
        java.lang.String[] strArray23 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray23;
        binaryEntityMap0.add("hi!", 0);
        binaryEntityMap0.size = (short) -1;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        java.util.Map map8 = hashEntityMap6.mapValueToName;
        java.util.Map map9 = hashEntityMap6.mapNameToValue;
        hashEntityMap6.add("", (int) (byte) 10);
        int int14 = hashEntityMap6.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap6.mapNameToValue = map20;
        java.lang.String str24 = hashEntityMap6.name((int) 'a');
        hashEntityMap6.add("", (int) (short) 1);
        hashEntityMap6.add("", (int) (byte) 0);
        java.util.Map map31 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap34 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str36 = lookupEntityMap34.name((int) (short) 0);
        java.lang.String str38 = lookupEntityMap34.name((int) (short) 1);
        java.lang.String str40 = lookupEntityMap34.name((int) (byte) 100);
        java.lang.String str42 = lookupEntityMap34.name(97);
        java.lang.String str44 = lookupEntityMap34.name(32);
        entities0.map = lookupEntityMap34;
        java.lang.String str47 = lookupEntityMap34.name(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = lookupEntityMap34.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 100);
        int int13 = binaryEntityMap0.size;
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.entityName(52);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap8 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int10 = primitiveEntityMap8.value("hi!");
        primitiveEntityMap8.add("", (int) (short) 10);
        primitiveEntityMap8.add("", 0);
        java.lang.String str18 = primitiveEntityMap8.name((int) '#');
        java.lang.String str20 = primitiveEntityMap8.name(97);
        entities0.map = primitiveEntityMap8;
        java.lang.String str23 = entities0.entityName(0);
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer24, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.entityName(10);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities9.map;
        java.lang.String str12 = entities9.escape("hi!");
        java.lang.String str14 = entities9.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap16.ensureCapacity((int) 'a');
        arrayEntityMap16.ensureCapacity(0);
        arrayEntityMap16.add("hi!", 100);
        java.lang.String str25 = arrayEntityMap16.name((int) 'a');
        int int27 = arrayEntityMap16.value("");
        int[] intArray28 = arrayEntityMap16.values;
        int int29 = arrayEntityMap16.size;
        entities9.map = arrayEntityMap16;
        java.io.Writer writer31 = null;
        entities9.escape(writer31, "");
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities9.map;
        org.apache.commons.lang.Entities entities35 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer36 = null;
        entities35.escape(writer36, "");
        java.lang.String[][] strArray39 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities35.addEntities(strArray39);
        java.lang.String str42 = entities35.escape("hi!");
        java.lang.String str44 = entities35.unescape("");
        org.apache.commons.lang.Entities entities45 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str47 = entities45.unescape("");
        java.io.Writer writer48 = null;
        entities45.escape(writer48, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap52 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities45.map = arrayEntityMap52;
        java.lang.String str55 = arrayEntityMap52.name((int) (byte) 100);
        java.lang.String[] strArray56 = arrayEntityMap52.names;
        int int57 = arrayEntityMap52.size;
        entities35.map = arrayEntityMap52;
        java.lang.String str60 = entities35.unescape("hi!");
        org.apache.commons.lang.Entities entities61 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str63 = entities61.unescape("");
        java.lang.String str65 = entities61.entityName(100);
        java.lang.String str67 = entities61.entityName((int) ' ');
        java.lang.String str69 = entities61.entityName(10);
        java.lang.String str71 = entities61.escape("hi!");
        java.lang.String str73 = entities61.unescape("");
        org.apache.commons.lang.Entities entities74 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer75 = null;
        entities74.escape(writer75, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap78 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities74.map = primitiveEntityMap78;
        java.lang.String str81 = entities74.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities82 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer83 = null;
        entities82.escape(writer83, "");
        java.lang.String[][] strArray86 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities82.addEntities(strArray86);
        entities74.addEntities(strArray86);
        entities61.addEntities(strArray86);
        entities35.addEntities(strArray86);
        entities9.addEntities(strArray86);
        entities0.addEntities(strArray86);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertNotNull(entities35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(entities45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(entities61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(entities74);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(entities82);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        int int15 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.add("", (int) (short) 10);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int9 = hashEntityMap7.value("hi!");
        java.util.Map map10 = hashEntityMap7.mapValueToName;
        int int12 = hashEntityMap7.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        hashEntityMap7.mapNameToValue = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap24.mapValueToName = map32;
        hashEntityMap7.mapNameToValue = map32;
        entities0.map = hashEntityMap7;
        java.lang.String str37 = entities0.entityName((int) ' ');
        java.lang.String str39 = entities0.entityName((int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap4.add("", (int) (byte) -1);
        java.util.Map map8 = hashEntityMap4.mapNameToValue;
        java.lang.String str10 = hashEntityMap4.name((int) ' ');
        int int12 = hashEntityMap4.value("");
        hashEntityMap4.add("hi!", (int) 'a');
        java.lang.String str17 = hashEntityMap4.name((int) (byte) 100);
        entities0.map = hashEntityMap4;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
// flaky "60) test0482(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(100);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        java.lang.String str17 = entities0.entityName(1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("", 1);
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer22, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.size = (byte) -1;
        java.lang.String str6 = arrayEntityMap0.name((int) '4');
        arrayEntityMap0.size = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.io.Writer writer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("", (int) (short) 1);
        arrayEntityMap0.ensureCapacity((int) ' ');
        int int6 = arrayEntityMap0.growBy;
        java.lang.String str8 = arrayEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        entities0.map = arrayEntityMap8;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        entityMap17.add("", 10);
        org.junit.Assert.assertNotNull(entities0);
// flaky "61) test0488(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        java.lang.String[] strArray4 = arrayEntityMap0.names;
        int int5 = arrayEntityMap0.growBy;
        arrayEntityMap0.add("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        java.lang.String str9 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str8 = entities0.unescape("hi!");
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.entityName(2);
        int int14 = entities0.entityValue("hi!");
        java.lang.Class<?> wildcardClass15 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        java.lang.String str9 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = entities0.entityName((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray13 = null;
        binaryEntityMap12.names = strArray13;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        entities0.map = binaryEntityMap12;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        binaryEntityMap17.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = (short) 10;
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        binaryEntityMap17.names = strArray27;
        binaryEntityMap17.ensureCapacity((int) (short) 0);
        java.lang.String str32 = binaryEntityMap17.name((int) 'a');
        binaryEntityMap17.size = 1;
        binaryEntityMap17.growBy = (byte) 10;
        java.lang.String[] strArray37 = binaryEntityMap17.names;
        binaryEntityMap12.names = strArray37;
        binaryEntityMap12.size = '4';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = binaryEntityMap12.name(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap7.mapValueToName = map15;
        hashEntityMap0.mapValueToName = map15;
        java.lang.String str19 = hashEntityMap0.name((int) (byte) 1);
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        int int7 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("hi!", (-1));
        java.lang.String str12 = primitiveEntityMap4.name(32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        int int12 = arrayEntityMap7.value("");
        int int13 = arrayEntityMap7.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int11 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "62) test0498(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray6 = new int[] {};
        binaryEntityMap5.values = intArray6;
        int int9 = binaryEntityMap5.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        arrayEntityMap10.names = strArray14;
        binaryEntityMap5.names = strArray14;
        int int18 = binaryEntityMap5.value("hi!");
        entities0.map = binaryEntityMap5;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "63) test0499(org.apache.commons.lang.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(entityMap20);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNotNull(entityMap7);
    }
}
