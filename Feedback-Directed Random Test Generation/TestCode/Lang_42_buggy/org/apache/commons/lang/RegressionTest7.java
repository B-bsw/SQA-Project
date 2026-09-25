package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        entities0.addEntity("hi!", 100);
        java.io.Writer writer28 = null;
        entities0.escape(writer28, "");
        java.lang.String str32 = entities0.entityName((-1));
        entities0.addEntity("hi!", 97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "1) test3501(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
// flaky "1) test3501(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "1) test3501(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        java.lang.String str28 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) (short) 10);
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer32, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        java.lang.String str8 = binaryEntityMap0.name(2);
        int int9 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        java.lang.String str26 = binaryEntityMap0.name((int) (short) 10);
        binaryEntityMap0.add("", (int) (short) -1);
        binaryEntityMap0.add("", 35);
        binaryEntityMap0.growBy = 0;
        java.lang.Class<?> wildcardClass35 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 35 });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities0.map;
        java.io.Writer writer34 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer34, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(entityMap33);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        int int6 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String str4 = binaryEntityMap1.name((int) ' ');
        binaryEntityMap1.size = 101;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.ensureCapacity((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 101 out of bounds for object array[32]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.entityName(2);
        entities0.addEntity("hi!", (int) '#');
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
// flaky "2) test3508(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
// flaky "2) test3508(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        java.lang.String str13 = entities0.escape("");
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
// flaky "3) test3509(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        arrayEntityMap1.ensureCapacity((int) (byte) 0);
        arrayEntityMap1.growBy = 52;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        int int8 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        java.util.Map map12 = hashEntityMap9.mapNameToValue;
        hashEntityMap9.add("", (int) (byte) 10);
        int int17 = hashEntityMap9.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap18.mapNameToValue = map23;
        hashEntityMap9.mapNameToValue = map23;
        java.lang.String str27 = hashEntityMap9.name((int) 'a');
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
        hashEntityMap28.add("", (int) (short) 0);
        hashEntityMap28.add("hi!", (int) '4');
        java.util.Map map51 = hashEntityMap28.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        int int56 = hashEntityMap52.value("");
        int int58 = hashEntityMap52.value("hi!");
        java.util.Map map59 = hashEntityMap52.mapValueToName;
        hashEntityMap28.mapValueToName = map59;
        hashEntityMap9.mapNameToValue = map59;
        hashEntityMap0.mapNameToValue = map59;
        java.util.Map map63 = hashEntityMap0.mapValueToName;
        java.lang.String str65 = hashEntityMap0.name(52);
        java.lang.String str67 = hashEntityMap0.name((int) '#');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.size = 100;
        binaryEntityMap0.size = (short) 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        java.io.Writer writer17 = null;
        entities0.escape(writer17, "");
        org.apache.commons.lang.Entities entities20 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str22 = entities20.unescape("");
        entities20.addEntity("", (int) (short) 0);
        java.io.Writer writer26 = null;
        entities20.escape(writer26, "");
        java.lang.String str30 = entities20.entityName((int) '4');
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer32 = null;
        entities31.escape(writer32, "");
        java.lang.String[][] strArray35 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities31.addEntities(strArray35);
        java.lang.String str38 = entities31.escape("hi!");
        java.lang.String str40 = entities31.unescape("");
        org.apache.commons.lang.Entities entities41 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str43 = entities41.unescape("");
        java.io.Writer writer44 = null;
        entities41.escape(writer44, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities41.map = arrayEntityMap48;
        java.lang.String str51 = arrayEntityMap48.name((int) (byte) 100);
        java.lang.String[] strArray52 = arrayEntityMap48.names;
        int int53 = arrayEntityMap48.size;
        entities31.map = arrayEntityMap48;
        java.lang.String str56 = entities31.unescape("hi!");
        org.apache.commons.lang.Entities entities57 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str59 = entities57.unescape("");
        java.lang.String str61 = entities57.entityName(100);
        java.lang.String str63 = entities57.entityName((int) ' ');
        java.lang.String str65 = entities57.entityName(10);
        java.lang.String str67 = entities57.escape("hi!");
        java.lang.String str69 = entities57.unescape("");
        org.apache.commons.lang.Entities entities70 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer71 = null;
        entities70.escape(writer71, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap74 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities70.map = primitiveEntityMap74;
        java.lang.String str77 = entities70.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities78 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer79 = null;
        entities78.escape(writer79, "");
        java.lang.String[][] strArray82 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities78.addEntities(strArray82);
        entities70.addEntities(strArray82);
        entities57.addEntities(strArray82);
        entities31.addEntities(strArray82);
        entities20.addEntities(strArray82);
        entities0.addEntities(strArray82);
        entities0.addEntity("", 3);
        java.lang.String str93 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(entities41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(entities57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "hi!" + "'", str67, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(entities70);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(entities78);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        java.lang.String str43 = entities0.unescape("");
        java.lang.String str45 = entities0.entityName((int) ' ');
        entities0.addEntity("", (int) (byte) 100);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap49 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int51 = primitiveEntityMap49.value("hi!");
        primitiveEntityMap49.add("", (int) (short) 10);
        primitiveEntityMap49.add("", 0);
        java.lang.String str59 = primitiveEntityMap49.name((int) '#');
        java.lang.String str61 = primitiveEntityMap49.name((int) (short) -1);
        primitiveEntityMap49.add("hi!", 10);
        int int66 = primitiveEntityMap49.value("");
        primitiveEntityMap49.add("hi!", (int) (short) 100);
        entities0.map = primitiveEntityMap49;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str5 = binaryEntityMap0.name(2);
        binaryEntityMap0.size = 0;
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        arrayEntityMap11.names = strArray15;
        int[] intArray17 = arrayEntityMap11.values;
        binaryEntityMap0.values = intArray17;
        binaryEntityMap0.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        binaryEntityMap22.add("", (int) (short) 100);
        java.lang.String str30 = binaryEntityMap22.name((int) (byte) 1);
        binaryEntityMap22.ensureCapacity((int) '#');
        int int34 = binaryEntityMap22.value("");
        java.lang.String[] strArray35 = binaryEntityMap22.names;
        binaryEntityMap0.names = strArray35;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap1.add("", 100);
        java.lang.String str6 = binaryEntityMap1.name(52);
        java.lang.String str8 = binaryEntityMap1.name(0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        binaryEntityMap1.size = (short) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.add("", (int) 'a');
        int[] intArray8 = binaryEntityMap4.values;
        binaryEntityMap1.values = intArray8;
        binaryEntityMap1.size = (byte) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        binaryEntityMap12.size = (short) 100;
        java.lang.String[] strArray18 = binaryEntityMap12.names;
        java.lang.String[] strArray19 = binaryEntityMap12.names;
        binaryEntityMap1.names = strArray19;
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (byte) 10);
        java.lang.String str14 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        int int19 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 97);
        java.lang.String str24 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map25 = hashEntityMap0.mapValueToName;
        java.lang.String str27 = hashEntityMap0.name(32);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str7 = binaryEntityMap5.name((int) (byte) 0);
        java.lang.String str9 = binaryEntityMap5.name((int) '#');
        binaryEntityMap5.growBy = (byte) 10;
        binaryEntityMap5.growBy = 1;
        java.lang.String str15 = binaryEntityMap5.name((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        binaryEntityMap16.add("", 97);
        binaryEntityMap16.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray25 = new int[] {};
        binaryEntityMap24.values = intArray25;
        int int28 = binaryEntityMap24.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap30.growBy = (short) 10;
        java.lang.String[] strArray33 = binaryEntityMap30.names;
        arrayEntityMap29.names = strArray33;
        binaryEntityMap24.names = strArray33;
        int int37 = binaryEntityMap24.value("hi!");
        java.lang.String str39 = binaryEntityMap24.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str43 = arrayEntityMap41.name((int) (short) 100);
        int[] intArray46 = new int[] { (short) 0, (-1) };
        arrayEntityMap41.values = intArray46;
        binaryEntityMap24.values = intArray46;
        binaryEntityMap16.values = intArray46;
        binaryEntityMap5.values = intArray46;
        entities0.map = binaryEntityMap5;
        java.lang.String str53 = binaryEntityMap5.name((int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] {});
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(intArray46);
// flaky "4) test3520(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertArrayEquals(intArray46, new int[] { 97, (-1) });
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap29.growBy = '4';
        binaryEntityMap29.size = (byte) -1;
        java.lang.String str35 = binaryEntityMap29.name((int) (short) 100);
        binaryEntityMap29.size = (byte) 0;
        int int39 = binaryEntityMap29.value("");
        binaryEntityMap29.add("", 0);
        int int44 = binaryEntityMap29.value("");
        binaryEntityMap29.growBy = (short) 100;
        entities0.map = binaryEntityMap29;
        java.io.Writer writer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer48, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        hashEntityMap0.add("", 0);
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 100);
        hashEntityMap0.add("", (int) (byte) 0);
        java.util.Map map23 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        int int28 = hashEntityMap24.value("");
        java.util.Map map29 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int32 = hashEntityMap30.value("hi!");
        java.util.Map map33 = hashEntityMap30.mapValueToName;
        int int35 = hashEntityMap30.value("");
        java.util.Map map36 = hashEntityMap30.mapNameToValue;
        hashEntityMap24.mapNameToValue = map36;
        hashEntityMap24.add("hi!", 0);
        java.util.Map map41 = hashEntityMap24.mapValueToName;
        java.util.Map map42 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int45 = hashEntityMap43.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap43.mapNameToValue = map47;
        java.util.Map map49 = hashEntityMap43.mapValueToName;
        hashEntityMap24.mapValueToName = map49;
        java.util.Map map51 = hashEntityMap24.mapNameToValue;
        hashEntityMap0.mapNameToValue = map51;
        java.util.Map map53 = hashEntityMap0.mapNameToValue;
        java.util.Map map54 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.entityName(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) ' ');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        int int17 = hashEntityMap13.value("");
        int int19 = hashEntityMap13.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap20.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap20.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        hashEntityMap20.mapValueToName = map28;
        hashEntityMap13.mapValueToName = map28;
        int int32 = hashEntityMap13.value("hi!");
        hashEntityMap13.add("hi!", 97);
        java.lang.String str37 = hashEntityMap13.name((int) (short) 100);
        int int39 = hashEntityMap13.value("hi!");
        java.util.Map map40 = hashEntityMap13.mapValueToName;
        java.util.Map map41 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapNameToValue = map41;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        int int5 = hashEntityMap0.value("");
        int int7 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.unescape("");
        int int12 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        int int10 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        entities0.addEntity("hi!", 100);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        java.lang.String str26 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (byte) 0);
        java.io.Writer writer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer31, "");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("hi!", (int) 'a');
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String[] strArray8 = binaryEntityMap0.names;
        java.lang.String str10 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        java.lang.String str26 = entities0.entityName((int) (short) 10);
        java.lang.String str28 = entities0.entityName((int) ' ');
        java.lang.String str30 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 100);
        java.lang.String str35 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.growBy;
        java.lang.String str9 = binaryEntityMap0.name(3);
        java.lang.String str11 = binaryEntityMap0.name(1);
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        entities0.addEntity("hi!", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str30 = binaryEntityMap28.name((int) (byte) 0);
        java.lang.String str32 = binaryEntityMap28.name((int) '#');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray35 = arrayEntityMap34.names;
        binaryEntityMap28.names = strArray35;
        entities0.map = binaryEntityMap28;
        java.io.Writer writer38 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer38, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray35);
// flaky "5) test3534(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "nbsp" });
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        int int25 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap12.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        hashEntityMap0.add("hi!", 1);
        hashEntityMap0.add("hi!", (int) (byte) 1);
        java.util.Map map39 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 3);
        java.util.Map map43 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = 10;
        arrayEntityMap1.growBy = 0;
        int int10 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) 1);
        java.lang.String str21 = lookupEntityMap0.name(1);
        java.lang.Class<?> wildcardClass22 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        java.util.Map map13 = hashEntityMap11.mapValueToName;
        java.util.Map map14 = hashEntityMap11.mapNameToValue;
        hashEntityMap11.add("", (int) (byte) 10);
        int int19 = hashEntityMap11.value("");
        java.lang.String str21 = hashEntityMap11.name((int) (byte) 10);
        java.lang.String str23 = hashEntityMap11.name((int) (short) 0);
        java.lang.String str25 = hashEntityMap11.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        hashEntityMap26.mapNameToValue = map32;
        java.util.Map map35 = hashEntityMap26.mapNameToValue;
        int int37 = hashEntityMap26.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.util.Map map40 = hashEntityMap38.mapValueToName;
        java.util.Map map41 = hashEntityMap38.mapNameToValue;
        hashEntityMap26.mapValueToName = map41;
        hashEntityMap11.mapNameToValue = map41;
        java.util.Map map44 = hashEntityMap11.mapNameToValue;
        java.lang.String str46 = hashEntityMap11.name(10);
        java.util.Map map47 = hashEntityMap11.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        java.util.Map map50 = hashEntityMap48.mapValueToName;
        int int52 = hashEntityMap48.value("");
        hashEntityMap48.add("", 1);
        java.util.Map map56 = hashEntityMap48.mapNameToValue;
        hashEntityMap11.mapNameToValue = map56;
        hashEntityMap0.mapValueToName = map56;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name(97);
        binaryEntityMap0.growBy = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.add("hi!", (int) (byte) 10);
        binaryEntityMap1.add("", 32);
        java.lang.String str11 = binaryEntityMap1.name(32);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap5.add("", (int) (byte) -1);
        java.util.Map map9 = hashEntityMap5.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        java.util.Map map13 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", (int) (byte) 10);
        int int18 = hashEntityMap10.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        hashEntityMap10.mapNameToValue = map24;
        hashEntityMap5.mapValueToName = map24;
        hashEntityMap0.mapNameToValue = map24;
        java.lang.String str30 = hashEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int int7 = binaryEntityMap0.size;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass22 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.ensureCapacity((int) (short) 10);
        java.lang.String str10 = binaryEntityMap0.name(97);
        int int12 = binaryEntityMap0.value("");
        int int13 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer8 = null;
        entities7.escape(writer8, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap11 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities7.map = primitiveEntityMap11;
        java.lang.String str14 = entities7.entityName((int) (short) -1);
        java.lang.String[][] strArray15 = new java.lang.String[][] {};
        entities7.addEntities(strArray15);
        entities0.addEntities(strArray15);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[][] {});
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        binaryEntityMap0.ensureCapacity((int) (byte) -1);
        int int31 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap7 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int9 = primitiveEntityMap7.value("hi!");
        primitiveEntityMap7.add("", (int) (short) 10);
        primitiveEntityMap7.add("", 0);
        java.lang.String str17 = primitiveEntityMap7.name((int) '#');
        java.lang.String str19 = primitiveEntityMap7.name((int) (short) -1);
        java.lang.String str21 = primitiveEntityMap7.name(1);
        java.lang.String str23 = primitiveEntityMap7.name((int) (short) 0);
        entities0.map = primitiveEntityMap7;
        java.lang.String str26 = primitiveEntityMap7.name((int) '4');
        java.lang.String str28 = primitiveEntityMap7.name((int) (byte) 10);
        int int30 = primitiveEntityMap7.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        int int90 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.entityName((int) (short) 1);
        java.lang.String str12 = entities0.escape("");
        java.lang.String str14 = entities0.unescape("");
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        entities15.addEntity("hi!", 0);
        java.lang.String[][] strArray19 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities15.addEntities(strArray19);
        java.lang.String str22 = entities15.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities23.map;
        java.lang.String str26 = entities23.escape("hi!");
        java.lang.String str28 = entities23.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap30.ensureCapacity((int) 'a');
        arrayEntityMap30.ensureCapacity(0);
        arrayEntityMap30.add("hi!", 100);
        java.lang.String str39 = arrayEntityMap30.name((int) 'a');
        int int41 = arrayEntityMap30.value("");
        int[] intArray42 = arrayEntityMap30.values;
        int int43 = arrayEntityMap30.size;
        entities23.map = arrayEntityMap30;
        java.io.Writer writer45 = null;
        entities23.escape(writer45, "");
        org.apache.commons.lang.Entities.EntityMap entityMap48 = entities23.map;
        entities23.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap53.ensureCapacity((int) 'a');
        arrayEntityMap53.growBy = (byte) 100;
        arrayEntityMap53.ensureCapacity(10);
        java.lang.String str61 = arrayEntityMap53.name((int) (byte) 1);
        arrayEntityMap53.size = 0;
        int int65 = arrayEntityMap53.value("hi!");
        entities23.map = arrayEntityMap53;
        org.apache.commons.lang.Entities entities67 = org.apache.commons.lang.Entities.HTML32;
        entities67.addEntity("hi!", 0);
        java.lang.String[][] strArray71 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities67.addEntities(strArray71);
        entities23.addEntities(strArray71);
        entities15.addEntities(strArray71);
        entities0.addEntities(strArray71);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(entityMap48);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(entities67);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.util.Map map11 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.size = (byte) -1;
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str5 = binaryEntityMap1.name(32);
        int int7 = binaryEntityMap1.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        java.lang.String str12 = binaryEntityMap8.name((int) '#');
        binaryEntityMap8.growBy = (byte) 10;
        binaryEntityMap8.growBy = 1;
        java.lang.String[] strArray17 = binaryEntityMap8.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        int[] intArray21 = binaryEntityMap18.values;
        binaryEntityMap8.values = intArray21;
        binaryEntityMap1.values = intArray21;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int[] intArray8 = binaryEntityMap0.values;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        int int13 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        java.lang.String str22 = entities0.entityName(0);
        java.lang.String str24 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String str4 = binaryEntityMap1.name((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str7 = binaryEntityMap5.name((int) (byte) 0);
        int int9 = binaryEntityMap5.value("");
        binaryEntityMap5.growBy = 10;
        binaryEntityMap5.ensureCapacity(2);
        int int14 = binaryEntityMap5.size;
        int[] intArray15 = binaryEntityMap5.values;
        binaryEntityMap1.values = intArray15;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        arrayEntityMap18.ensureCapacity(0);
        arrayEntityMap18.add("hi!", 100);
        java.lang.String str27 = arrayEntityMap18.name((int) 'a');
        arrayEntityMap18.add("hi!", (int) (short) -1);
        arrayEntityMap18.growBy = '4';
        int int34 = arrayEntityMap18.value("");
        arrayEntityMap18.ensureCapacity(0);
        arrayEntityMap18.size = (short) -1;
        java.lang.String[] strArray39 = arrayEntityMap18.names;
        binaryEntityMap1.names = strArray39;
        int int41 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 10);
        java.lang.String str3 = arrayEntityMap1.name(100);
        arrayEntityMap1.add("", (int) (byte) 10);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        java.lang.String str17 = hashEntityMap0.name((int) (byte) 0);
        java.lang.String str19 = hashEntityMap0.name(32);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        java.lang.String str23 = hashEntityMap20.name((int) (byte) 0);
        java.util.Map map24 = hashEntityMap20.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        int int35 = hashEntityMap27.value("");
        java.util.Map map36 = hashEntityMap27.mapNameToValue;
        hashEntityMap25.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.util.Map map40 = hashEntityMap38.mapValueToName;
        java.util.Map map41 = hashEntityMap38.mapNameToValue;
        java.util.Map map42 = hashEntityMap38.mapValueToName;
        hashEntityMap25.mapValueToName = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        java.util.Map map46 = hashEntityMap44.mapValueToName;
        java.util.Map map47 = hashEntityMap44.mapNameToValue;
        hashEntityMap44.add("", (int) (byte) 10);
        int int52 = hashEntityMap44.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap53.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        hashEntityMap53.mapNameToValue = map58;
        hashEntityMap44.mapNameToValue = map58;
        hashEntityMap25.mapNameToValue = map58;
        java.util.Map map62 = hashEntityMap25.mapValueToName;
        hashEntityMap20.mapValueToName = map62;
        hashEntityMap0.mapNameToValue = map62;
        java.lang.String str66 = hashEntityMap0.name((-1));
        java.lang.String str68 = hashEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap7.ensureCapacity((int) 'a');
        arrayEntityMap7.ensureCapacity(0);
        arrayEntityMap7.add("hi!", 100);
        java.lang.String str16 = arrayEntityMap7.name((int) 'a');
        int int18 = arrayEntityMap7.value("");
        int[] intArray19 = arrayEntityMap7.values;
        int[] intArray20 = arrayEntityMap7.values;
        binaryEntityMap0.values = intArray20;
        int int22 = binaryEntityMap0.size;
        int int23 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = '4';
        binaryEntityMap24.size = (byte) -1;
        java.lang.String str30 = binaryEntityMap24.name((int) (short) 100);
        binaryEntityMap24.size = (byte) 0;
        int int34 = binaryEntityMap24.value("");
        binaryEntityMap24.ensureCapacity((int) (byte) 10);
        int int38 = binaryEntityMap24.value("hi!");
        java.lang.String[] strArray39 = binaryEntityMap24.names;
        binaryEntityMap0.names = strArray39;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
// flaky "6) test3559(org.apache.commons.lang.RegressionTest7)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        arrayEntityMap5.size = (-1);
        int int12 = arrayEntityMap5.value("");
        arrayEntityMap5.size = 2;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = arrayEntityMap5.value("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str5 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str10 = primitiveEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
// flaky "7) test3561(org.apache.commons.lang.RegressionTest7)":         entities0.addEntities(strArray4);
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
        int int27 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap28.add("", (int) (short) 100);
        java.lang.String str36 = binaryEntityMap28.name((int) (byte) 1);
        java.lang.String str38 = binaryEntityMap28.name((int) ' ');
        binaryEntityMap28.add("", (int) (short) 0);
        entities0.map = binaryEntityMap28;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        java.lang.String[] strArray47 = binaryEntityMap44.names;
        arrayEntityMap43.names = strArray47;
        binaryEntityMap28.names = strArray47;
        binaryEntityMap28.size = 52;
        binaryEntityMap28.growBy = 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap55 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap55.size = (byte) -1;
        java.lang.String[] strArray58 = arrayEntityMap55.names;
        binaryEntityMap28.names = strArray58;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        java.lang.String str13 = binaryEntityMap0.name((-1));
        int[] intArray14 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = null;
        hashEntityMap0.mapNameToValue = map8;
        // The following exception was thrown during execution in test generation
        try {
            hashEntityMap0.add("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str5 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("hi!", (int) (short) 10);
        primitiveEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 1);
        binaryEntityMap1.add("", 98);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int11 = binaryEntityMap10.size;
        java.lang.String[] strArray12 = binaryEntityMap10.names;
        binaryEntityMap1.names = strArray12;
        java.lang.Class<?> wildcardClass14 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap1.names = strArray9;
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
        java.lang.String[] strArray23 = binaryEntityMap11.names;
        arrayEntityMap1.names = strArray23;
        java.lang.String str26 = arrayEntityMap1.name((int) 'a');
        int int27 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.escape("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String[] strArray3 = binaryEntityMap1.names;
        java.lang.String str5 = binaryEntityMap1.name(3);
        java.lang.String str7 = binaryEntityMap1.name(2);
        java.lang.String str9 = binaryEntityMap1.name(101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.size = (short) -1;
        binaryEntityMap0.growBy = 3;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        entities0.addEntity("hi!", 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap5.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        arrayEntityMap9.names = strArray13;
        int[] intArray15 = arrayEntityMap9.values;
        binaryEntityMap5.values = intArray15;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        int int22 = binaryEntityMap17.value("");
        binaryEntityMap17.growBy = (short) 1;
        binaryEntityMap17.size = 100;
        binaryEntityMap17.add("", 100);
        java.lang.String[] strArray30 = binaryEntityMap17.names;
        binaryEntityMap5.names = strArray30;
        arrayEntityMap1.names = strArray30;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", (int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str14 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        java.lang.String[] strArray17 = null;
        arrayEntityMap1.names = strArray17;
        int int19 = arrayEntityMap1.size;
        java.lang.String str21 = arrayEntityMap1.name(100);
        arrayEntityMap1.size = (-1);
        int int24 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str34 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(entityMap35);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        int int15 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
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
            arrayEntityMap1.ensureCapacity(101);
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
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int11 = entities0.entityValue("hi!");
        int int13 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        java.lang.String str16 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap1.size = 52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = binaryEntityMap1.name(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        int int11 = hashEntityMap8.value("");
        hashEntityMap8.add("hi!", (int) '4');
        entities0.map = hashEntityMap8;
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        hashEntityMap17.add("", 32);
        java.util.Map map22 = hashEntityMap17.mapNameToValue;
        entities0.map = hashEntityMap17;
        entities0.addEntity("", (int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        int int9 = binaryEntityMap0.growBy;
        java.lang.String str11 = binaryEntityMap0.name(97);
        int int13 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name(97);
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name(100);
        java.lang.String str19 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        java.lang.String[] strArray26 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap30.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int36 = arrayEntityMap35.growBy;
        int int37 = arrayEntityMap35.size;
        arrayEntityMap35.size = (short) -1;
        arrayEntityMap35.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int44 = arrayEntityMap43.growBy;
        java.lang.String[] strArray45 = arrayEntityMap43.names;
        int int47 = arrayEntityMap43.value("");
        int int48 = arrayEntityMap43.size;
        java.lang.String[] strArray49 = arrayEntityMap43.names;
        arrayEntityMap35.names = strArray49;
        binaryEntityMap30.names = strArray49;
        binaryEntityMap30.growBy = 1;
        int[] intArray54 = binaryEntityMap30.values;
        arrayEntityMap28.values = intArray54;
        binaryEntityMap0.values = intArray54;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 100, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap4.add("", (int) (byte) -1);
        java.util.Map map8 = hashEntityMap4.mapNameToValue;
        java.util.Map map9 = hashEntityMap4.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        hashEntityMap10.mapNameToValue = map16;
        java.util.Map map19 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", (int) (byte) 1);
        java.util.Map map23 = hashEntityMap10.mapNameToValue;
        hashEntityMap4.mapNameToValue = map23;
        hashEntityMap4.add("", (int) 'a');
        entities0.map = hashEntityMap4;
        java.lang.String str30 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        int int23 = binaryEntityMap18.value("");
        binaryEntityMap18.growBy = (short) 1;
        int int27 = binaryEntityMap18.value("");
        binaryEntityMap18.add("hi!", 100);
        int int32 = binaryEntityMap18.value("hi!");
        entities0.map = binaryEntityMap18;
        int int35 = entities0.entityValue("");
        java.lang.String str37 = entities0.entityName((int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str11 = lookupEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        binaryEntityMap0.size = 1;
        int int18 = binaryEntityMap0.growBy;
        int int19 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int22 = arrayEntityMap21.growBy;
        int int23 = arrayEntityMap21.size;
        arrayEntityMap21.size = (short) -1;
        arrayEntityMap21.ensureCapacity((int) (byte) 1);
        arrayEntityMap21.ensureCapacity((int) (short) 0);
        java.lang.String str31 = arrayEntityMap21.name((int) (byte) -1);
        int[] intArray32 = arrayEntityMap21.values;
        binaryEntityMap0.values = intArray32;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        binaryEntityMap0.add("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) ' ');
        java.lang.String str14 = lookupEntityMap0.name((int) (byte) 0);
        int int16 = lookupEntityMap0.value("");
        java.lang.String str18 = lookupEntityMap0.name((int) 'a');
        java.lang.String str20 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        int int28 = hashEntityMap24.value("");
        int int30 = hashEntityMap24.value("hi!");
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap0.mapValueToName = map31;
        hashEntityMap0.add("", (int) (byte) 10);
        java.lang.String str37 = hashEntityMap0.name(0);
        hashEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        binaryEntityMap0.growBy = (short) 100;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
// flaky "8) test3591(org.apache.commons.lang.RegressionTest7)":         entities0.addEntity("hi!", 100);
        java.lang.String str16 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "3) test3591(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name(0);
        int int7 = binaryEntityMap0.size;
        int int8 = binaryEntityMap0.growBy;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int3 = binaryEntityMap0.growBy;
        int[] intArray4 = binaryEntityMap0.values;
        binaryEntityMap0.size = 52;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(10);
        int int4 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("", 0);
        int int13 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String[] strArray8 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        binaryEntityMap0.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        arrayEntityMap11.names = strArray15;
        int[] intArray17 = arrayEntityMap11.values;
        binaryEntityMap7.values = intArray17;
        binaryEntityMap0.values = intArray17;
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        int int25 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray27 = new int[] {};
        binaryEntityMap26.values = intArray27;
        int int30 = binaryEntityMap26.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.growBy = (short) 10;
        java.lang.String[] strArray35 = binaryEntityMap32.names;
        arrayEntityMap31.names = strArray35;
        binaryEntityMap26.names = strArray35;
        int int39 = binaryEntityMap26.value("hi!");
        java.lang.String str41 = binaryEntityMap26.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str45 = arrayEntityMap43.name((int) (short) 100);
        int[] intArray48 = new int[] { (short) 0, (-1) };
        arrayEntityMap43.values = intArray48;
        binaryEntityMap26.values = intArray48;
        binaryEntityMap26.growBy = 1;
        binaryEntityMap26.add("hi!", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap57 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str59 = binaryEntityMap57.name((int) (byte) 100);
        int int61 = binaryEntityMap57.value("hi!");
        int[] intArray62 = binaryEntityMap57.values;
        binaryEntityMap26.values = intArray62;
        binaryEntityMap0.values = intArray62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 10, (-1) });
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] {});
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap10.mapNameToValue = map15;
        int int18 = hashEntityMap10.value("");
        java.util.Map map19 = hashEntityMap10.mapNameToValue;
        hashEntityMap8.mapNameToValue = map19;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        java.util.Map map23 = hashEntityMap21.mapValueToName;
        java.util.Map map24 = hashEntityMap21.mapNameToValue;
        java.util.Map map25 = hashEntityMap21.mapValueToName;
        hashEntityMap8.mapValueToName = map25;
        hashEntityMap0.mapValueToName = map25;
        int int29 = hashEntityMap0.value("");
        java.lang.String str31 = hashEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map5 = treeEntityMap4.mapNameToValue;
        hashEntityMap0.mapValueToName = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        java.util.Map map9 = hashEntityMap7.mapValueToName;
        java.util.Map map10 = hashEntityMap7.mapNameToValue;
        java.util.Map map11 = hashEntityMap7.mapValueToName;
        java.util.Map map12 = hashEntityMap7.mapValueToName;
        java.util.Map map13 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapValueToName = map13;
        int int16 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap21 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str23 = lookupEntityMap21.name((int) (short) 0);
        java.lang.String str25 = lookupEntityMap21.name((int) (byte) 0);
        java.lang.String str27 = lookupEntityMap21.name(35);
        entities0.map = lookupEntityMap21;
        java.lang.String str30 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        int int6 = binaryEntityMap0.value("");
        binaryEntityMap0.size = 3;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str11 = entities9.unescape("");
        java.lang.String str13 = entities9.entityName((int) (short) 0);
        java.lang.String str15 = entities9.entityName(1);
        java.lang.String str17 = entities9.escape("");
        int int19 = entities9.entityValue("hi!");
        java.lang.String str21 = entities9.unescape("hi!");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer23 = null;
        entities22.escape(writer23, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap26 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities22.map = primitiveEntityMap26;
        java.lang.String str29 = entities22.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer31 = null;
        entities30.escape(writer31, "");
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities30.addEntities(strArray34);
        entities22.addEntities(strArray34);
        java.lang.String str38 = entities22.escape("");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        entities39.addEntity("hi!", 0);
        java.lang.String[][] strArray43 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities39.addEntities(strArray43);
        entities22.addEntities(strArray43);
        entities9.addEntities(strArray43);
        entities0.addEntities(strArray43);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int50 = hashEntityMap48.value("hi!");
        java.lang.String str52 = hashEntityMap48.name((int) (short) 0);
        hashEntityMap48.add("", 0);
        java.lang.String str57 = hashEntityMap48.name(0);
        int int59 = hashEntityMap48.value("");
        entities0.map = hashEntityMap48;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.unescape("");
        java.lang.Class<?> wildcardClass11 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        int int14 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray15 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entityMap7);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        int int13 = binaryEntityMap0.value("hi!");
        int int14 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        entities0.addEntity("hi!", 0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap10.mapNameToValue = map15;
        int int18 = hashEntityMap10.value("");
        java.util.Map map19 = hashEntityMap10.mapNameToValue;
        hashEntityMap8.mapNameToValue = map19;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        java.util.Map map23 = hashEntityMap21.mapValueToName;
        java.util.Map map24 = hashEntityMap21.mapNameToValue;
        java.util.Map map25 = hashEntityMap21.mapValueToName;
        hashEntityMap8.mapValueToName = map25;
        hashEntityMap0.mapValueToName = map25;
        java.lang.String str29 = hashEntityMap0.name((int) (byte) 10);
        java.util.Map map30 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 0);
        int int20 = binaryEntityMap16.value("");
        binaryEntityMap16.add("", (int) (short) -1);
        int[] intArray24 = binaryEntityMap16.values;
        binaryEntityMap0.values = intArray24;
        binaryEntityMap0.growBy = 52;
        binaryEntityMap0.growBy = 'a';
        binaryEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap30.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        hashEntityMap30.mapNameToValue = map35;
        hashEntityMap30.add("hi!", (int) 'a');
        int int41 = hashEntityMap30.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int44 = hashEntityMap42.value("hi!");
        java.util.Map map45 = hashEntityMap42.mapValueToName;
        int int47 = hashEntityMap42.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap49.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        hashEntityMap49.mapNameToValue = map54;
        hashEntityMap48.mapNameToValue = map54;
        java.util.Map map57 = hashEntityMap48.mapNameToValue;
        hashEntityMap42.mapNameToValue = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap59.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = hashEntityMap63.mapNameToValue;
        hashEntityMap59.mapNameToValue = map64;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        hashEntityMap59.mapValueToName = map67;
        hashEntityMap42.mapNameToValue = map67;
        hashEntityMap30.mapNameToValue = map67;
        java.lang.String str72 = hashEntityMap30.name(100);
        java.lang.String str74 = hashEntityMap30.name(3);
        java.lang.String str76 = hashEntityMap30.name((int) (byte) 100);
        java.util.Map map77 = hashEntityMap30.mapNameToValue;
        hashEntityMap0.mapValueToName = map77;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = hashEntityMap79.mapNameToValue;
        java.util.Map map81 = hashEntityMap79.mapValueToName;
        java.util.Map map82 = hashEntityMap79.mapNameToValue;
        java.util.Map map83 = hashEntityMap79.mapValueToName;
        java.util.Map map84 = hashEntityMap79.mapValueToName;
        java.util.Map map85 = hashEntityMap79.mapNameToValue;
        hashEntityMap79.add("hi!", (int) (short) -1);
        int int90 = hashEntityMap79.value("");
        java.util.Map map91 = hashEntityMap79.mapValueToName;
        hashEntityMap0.mapNameToValue = map91;
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
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap4.add("", (int) (byte) -1);
        java.util.Map map8 = hashEntityMap4.mapNameToValue;
        hashEntityMap4.add("", 10);
        int int13 = hashEntityMap4.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        int int25 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap4.mapValueToName = map29;
        hashEntityMap0.mapValueToName = map29;
        hashEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 1);
        int int11 = binaryEntityMap0.value("hi!");
        java.lang.String str13 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        int int14 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        int int29 = binaryEntityMap0.value("");
        int int30 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        int int7 = lookupEntityMap0.value("");
        int int9 = lookupEntityMap0.value("");
        java.lang.String str11 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name(10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        int int18 = hashEntityMap0.value("");
        int int20 = hashEntityMap0.value("");
        java.util.Map map21 = hashEntityMap0.mapNameToValue;
        int int23 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap24.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        java.util.Map map34 = hashEntityMap24.mapNameToValue;
        int int36 = hashEntityMap24.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        java.util.Map map40 = hashEntityMap37.mapNameToValue;
        hashEntityMap37.add("", (int) (byte) 10);
        int int45 = hashEntityMap37.value("");
        java.lang.String str47 = hashEntityMap37.name((int) (byte) 10);
        java.lang.String str49 = hashEntityMap37.name((int) (short) 0);
        java.lang.String str51 = hashEntityMap37.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap53.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        hashEntityMap53.mapNameToValue = map58;
        hashEntityMap52.mapNameToValue = map58;
        java.util.Map map61 = hashEntityMap52.mapNameToValue;
        int int63 = hashEntityMap52.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        java.util.Map map66 = hashEntityMap64.mapValueToName;
        java.util.Map map67 = hashEntityMap64.mapNameToValue;
        hashEntityMap52.mapValueToName = map67;
        hashEntityMap37.mapNameToValue = map67;
        hashEntityMap37.add("", (int) ' ');
        hashEntityMap37.add("hi!", 52);
        java.lang.String str77 = hashEntityMap37.name(101);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap78.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map83 = hashEntityMap82.mapNameToValue;
        hashEntityMap78.mapNameToValue = map83;
        java.util.Map map85 = hashEntityMap78.mapValueToName;
        hashEntityMap37.mapNameToValue = map85;
        hashEntityMap24.mapValueToName = map85;
        hashEntityMap0.mapNameToValue = map85;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.growBy = (short) 100;
        binaryEntityMap0.ensureCapacity((-1));
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("", (int) (short) 1);
        arrayEntityMap0.size = (byte) 0;
        int int6 = arrayEntityMap0.size;
        arrayEntityMap0.add("", 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
// flaky "9) test3621(org.apache.commons.lang.RegressionTest7)":             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 100 out of bounds for object array[97]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "4) test3621(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (short) 0);
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.escape("");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        java.lang.String str15 = entities12.unescape("hi!");
        java.lang.String str17 = entities12.unescape("");
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str20 = entities18.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities18.map = arrayEntityMap22;
        entities18.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities18);
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str30 = entities28.unescape("");
        java.lang.String str32 = entities28.entityName((int) (short) 0);
        java.lang.String str34 = entities28.unescape("hi!");
        org.apache.commons.lang.Entities entities35 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str37 = entities35.unescape("");
        int int39 = entities35.entityValue("");
        int int41 = entities35.entityValue("");
        entities35.addEntity("", 97);
        org.apache.commons.lang.Entities entities45 = org.apache.commons.lang.Entities.HTML32;
        entities45.addEntity("hi!", 0);
        java.lang.String[][] strArray49 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities45.addEntities(strArray49);
        entities35.addEntities(strArray49);
        entities28.addEntities(strArray49);
        entities18.addEntities(strArray49);
        entities12.addEntities(strArray49);
        entities0.addEntities(strArray49);
        java.io.Writer writer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer56, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
// flaky "10) test3623(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(entities35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(entities45);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.size = (byte) 10;
        java.lang.Class<?> wildcardClass6 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        java.lang.String str6 = binaryEntityMap0.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        int int11 = binaryEntityMap7.value("");
        binaryEntityMap7.add("", (int) (short) -1);
        binaryEntityMap7.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap19.ensureCapacity((int) 'a');
        arrayEntityMap19.ensureCapacity(0);
        java.lang.String[] strArray24 = arrayEntityMap19.names;
        binaryEntityMap7.names = strArray24;
        binaryEntityMap0.names = strArray24;
        int int27 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap28.add("", (int) (short) 100);
        binaryEntityMap28.add("", (-1));
        int int39 = binaryEntityMap28.value("hi!");
        int[] intArray40 = binaryEntityMap28.values;
        binaryEntityMap28.add("", (int) (short) 10);
        int[] intArray44 = binaryEntityMap28.values;
        binaryEntityMap0.values = intArray44;
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.growBy = (short) 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(intArray44);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("hi!");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        hashEntityMap15.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap15.mapNameToValue;
        int int26 = hashEntityMap15.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        hashEntityMap15.mapValueToName = map30;
        hashEntityMap0.mapNameToValue = map30;
        java.lang.String str34 = hashEntityMap0.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int37 = hashEntityMap35.value("hi!");
        java.lang.String str39 = hashEntityMap35.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        java.util.Map map42 = hashEntityMap40.mapValueToName;
        java.util.Map map43 = hashEntityMap40.mapNameToValue;
        hashEntityMap40.add("", (int) (byte) 10);
        int int48 = hashEntityMap40.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap49.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        hashEntityMap49.mapNameToValue = map54;
        hashEntityMap40.mapNameToValue = map54;
        java.lang.String str58 = hashEntityMap40.name((int) 'a');
        hashEntityMap40.add("", (int) (short) 1);
        java.util.Map map62 = hashEntityMap40.mapNameToValue;
        hashEntityMap35.mapNameToValue = map62;
        hashEntityMap0.mapValueToName = map62;
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("", 1);
        int int75 = hashEntityMap0.value("hi!");
        int int77 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = hashEntityMap81.mapNameToValue;
        int int84 = hashEntityMap81.value("");
        hashEntityMap81.add("hi!", (int) (byte) 1);
        int int89 = hashEntityMap81.value("hi!");
        int int91 = hashEntityMap81.value("hi!");
        hashEntityMap81.add("", (int) (short) -1);
        java.util.Map map95 = hashEntityMap81.mapNameToValue;
        hashEntityMap0.mapNameToValue = map95;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
        int int13 = entities0.entityValue("hi!");
        int int15 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int26 = arrayEntityMap24.value("hi!");
        java.lang.String[] strArray27 = arrayEntityMap24.names;
        entities0.map = arrayEntityMap24;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) 'a');
        java.lang.String str13 = hashEntityMap0.name((int) (byte) 100);
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) (short) 100);
        java.util.Map map18 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        arrayEntityMap1.ensureCapacity((int) (byte) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap17.add("", 52);
        java.lang.String[] strArray21 = arrayEntityMap17.names;
        arrayEntityMap1.names = strArray21;
        int[] intArray23 = arrayEntityMap1.values;
        int int25 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
        int int13 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        int int16 = entities0.entityValue("");
        java.lang.String str18 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        java.lang.String str11 = hashEntityMap0.name((int) (byte) -1);
        int int13 = hashEntityMap0.value("hi!");
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap25.add("", 52);
        java.lang.String[] strArray29 = arrayEntityMap25.names;
        int int30 = arrayEntityMap25.size;
        arrayEntityMap25.ensureCapacity((int) (byte) -1);
        entities0.map = arrayEntityMap25;
        int int35 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        entities0.addEntity("hi!", (int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray8 = new int[] {};
        binaryEntityMap7.values = intArray8;
        int int11 = binaryEntityMap7.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.growBy = (short) 10;
        java.lang.String[] strArray16 = binaryEntityMap13.names;
        arrayEntityMap12.names = strArray16;
        binaryEntityMap7.names = strArray16;
        binaryEntityMap0.names = strArray16;
        binaryEntityMap0.growBy = ' ';
        java.lang.String str23 = binaryEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.ensureCapacity((int) (byte) 100);
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", 32);
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name(97);
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name(0);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("", (int) (byte) 10);
        java.lang.String str17 = lookupEntityMap0.name((int) ' ');
        int int19 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        int int19 = hashEntityMap15.value("");
        hashEntityMap15.add("", 1);
        java.util.Map map23 = hashEntityMap15.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap26.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        hashEntityMap26.mapNameToValue = map31;
        int int34 = hashEntityMap26.value("");
        java.util.Map map35 = hashEntityMap26.mapNameToValue;
        hashEntityMap24.mapNameToValue = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        java.util.Map map40 = hashEntityMap37.mapNameToValue;
        java.util.Map map41 = hashEntityMap37.mapValueToName;
        hashEntityMap24.mapValueToName = map41;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        java.util.Map map45 = hashEntityMap43.mapValueToName;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        hashEntityMap43.add("", (int) (byte) 10);
        int int51 = hashEntityMap43.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap52.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = hashEntityMap56.mapNameToValue;
        hashEntityMap52.mapNameToValue = map57;
        hashEntityMap43.mapNameToValue = map57;
        hashEntityMap24.mapNameToValue = map57;
        java.util.Map map61 = hashEntityMap24.mapValueToName;
        hashEntityMap15.mapNameToValue = map61;
        java.util.Map map63 = hashEntityMap15.mapValueToName;
        hashEntityMap0.mapValueToName = map63;
        int int66 = hashEntityMap0.value("");
        java.util.Map map67 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 101);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.entityName((-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
// flaky "11) test3644(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        int int4 = lookupEntityMap0.value("hi!");
        java.lang.String str6 = lookupEntityMap0.name(101);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.unescape("hi!");
        java.lang.String str12 = entities0.entityName(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "12) test3646(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) (byte) 1);
        int int13 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        int int18 = hashEntityMap14.value("");
        hashEntityMap14.add("", 1);
        java.util.Map map22 = hashEntityMap14.mapNameToValue;
        hashEntityMap0.mapValueToName = map22;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
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
        java.lang.String str20 = binaryEntityMap9.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.lang.String str12 = entities0.escape("hi!");
        entities0.addEntity("", 100);
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities16.map;
        java.lang.String str19 = entities16.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap20.add("", (int) (byte) -1);
        java.util.Map map24 = hashEntityMap20.mapNameToValue;
        java.util.Map map25 = hashEntityMap20.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        hashEntityMap26.mapNameToValue = map32;
        java.util.Map map35 = hashEntityMap26.mapNameToValue;
        hashEntityMap26.add("", (int) (byte) 1);
        java.util.Map map39 = hashEntityMap26.mapNameToValue;
        hashEntityMap20.mapNameToValue = map39;
        hashEntityMap20.add("", (int) 'a');
        entities16.map = hashEntityMap20;
        entities16.addEntity("", (int) (byte) -1);
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str50 = entities48.unescape("");
        java.lang.String str52 = entities48.entityName((int) (short) 0);
        java.lang.String str54 = entities48.entityName(1);
        java.lang.String str56 = entities48.escape("");
        int int58 = entities48.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap59 = entities48.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities48);
        org.apache.commons.lang.Entities entities61 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str63 = entities61.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities61.map = arrayEntityMap65;
        entities61.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities61);
        org.apache.commons.lang.Entities entities71 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str73 = entities71.unescape("");
        java.lang.String str75 = entities71.entityName((int) (short) 0);
        java.lang.String str77 = entities71.unescape("hi!");
        org.apache.commons.lang.Entities entities78 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str80 = entities78.unescape("");
        int int82 = entities78.entityValue("");
        int int84 = entities78.entityValue("");
        entities78.addEntity("", 97);
        org.apache.commons.lang.Entities entities88 = org.apache.commons.lang.Entities.HTML32;
        entities88.addEntity("hi!", 0);
        java.lang.String[][] strArray92 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities88.addEntities(strArray92);
        entities78.addEntities(strArray92);
        entities71.addEntities(strArray92);
        entities61.addEntities(strArray92);
        entities48.addEntities(strArray92);
        entities16.addEntities(strArray92);
        entities0.addEntities(strArray92);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(entityMap59);
        org.junit.Assert.assertNotNull(entities61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(entities71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(entities78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 32 + "'", int82 == 32);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 32 + "'", int84 == 32);
        org.junit.Assert.assertNotNull(entities88);
        org.junit.Assert.assertNotNull(strArray92);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        java.lang.String str7 = entities0.escape("");
        entities0.addEntity("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int19 = arrayEntityMap18.growBy;
        arrayEntityMap18.growBy = (short) -1;
        arrayEntityMap18.add("", 1);
        int int26 = arrayEntityMap18.value("hi!");
        entities0.map = arrayEntityMap18;
        java.io.Writer writer28 = null;
        entities0.escape(writer28, "");
        org.apache.commons.lang.Entities.EntityMap entityMap31 = null;
        entities0.map = entityMap31;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = entities0.entityName((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.size = 1;
        binaryEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        arrayEntityMap18.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray24 = new int[] {};
        binaryEntityMap23.values = intArray24;
        int[] intArray26 = binaryEntityMap23.values;
        int[] intArray27 = binaryEntityMap23.values;
        arrayEntityMap18.values = intArray27;
        java.lang.String[] strArray29 = arrayEntityMap18.names;
        binaryEntityMap0.names = strArray29;
        binaryEntityMap0.size = (byte) 10;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "hi!" });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] {});
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        arrayEntityMap15.names = strArray19;
        int[] intArray21 = arrayEntityMap15.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap23.ensureCapacity((int) 'a');
        arrayEntityMap23.ensureCapacity(0);
        java.lang.String[] strArray28 = arrayEntityMap23.names;
        arrayEntityMap15.names = strArray28;
        arrayEntityMap15.ensureCapacity(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str35 = arrayEntityMap33.name((int) (short) 100);
        int[] intArray38 = new int[] { (short) 0, (-1) };
        arrayEntityMap33.values = intArray38;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap40.growBy = (short) 10;
        java.lang.String[] strArray43 = binaryEntityMap40.names;
        int[] intArray44 = binaryEntityMap40.values;
        arrayEntityMap33.values = intArray44;
        arrayEntityMap33.add("hi!", (int) (short) 1);
        java.lang.String[] strArray49 = arrayEntityMap33.names;
        arrayEntityMap15.names = strArray49;
        binaryEntityMap0.names = strArray49;
        binaryEntityMap0.add("", 10);
        int int55 = binaryEntityMap0.size;
        binaryEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2 + "'", int55 == 2);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) '4');
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap8.add("", (int) (byte) -1);
        java.util.Map map12 = hashEntityMap8.mapNameToValue;
        hashEntityMap8.add("", 10);
        int int17 = hashEntityMap8.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        hashEntityMap18.mapNameToValue = map24;
        java.util.Map map27 = hashEntityMap18.mapNameToValue;
        int int29 = hashEntityMap18.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        java.util.Map map32 = hashEntityMap30.mapValueToName;
        java.util.Map map33 = hashEntityMap30.mapNameToValue;
        hashEntityMap18.mapValueToName = map33;
        hashEntityMap8.mapValueToName = map33;
        hashEntityMap0.mapValueToName = map33;
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        java.lang.String str39 = hashEntityMap0.name(3);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int[] intArray14 = arrayEntityMap1.values;
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        java.lang.String str17 = arrayEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (-1));
        int int12 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("", (int) '#');
        java.lang.String str20 = primitiveEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        binaryEntityMap0.growBy = 101;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
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
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(98);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        binaryEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("hi!", 0);
        int int14 = binaryEntityMap0.growBy;
        int int16 = binaryEntityMap0.value("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        java.util.Map map22 = hashEntityMap13.mapNameToValue;
        int int24 = hashEntityMap13.value("hi!");
        hashEntityMap13.add("", (int) (byte) 0);
        java.lang.String str29 = hashEntityMap13.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        java.lang.String str33 = hashEntityMap30.name((int) (byte) 0);
        java.util.Map map34 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        int int45 = hashEntityMap37.value("");
        java.util.Map map46 = hashEntityMap37.mapNameToValue;
        hashEntityMap35.mapNameToValue = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        java.util.Map map50 = hashEntityMap48.mapValueToName;
        java.util.Map map51 = hashEntityMap48.mapNameToValue;
        java.util.Map map52 = hashEntityMap48.mapValueToName;
        hashEntityMap35.mapValueToName = map52;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        java.util.Map map56 = hashEntityMap54.mapValueToName;
        java.util.Map map57 = hashEntityMap54.mapNameToValue;
        hashEntityMap54.add("", (int) (byte) 10);
        int int62 = hashEntityMap54.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap63.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = hashEntityMap67.mapNameToValue;
        hashEntityMap63.mapNameToValue = map68;
        hashEntityMap54.mapNameToValue = map68;
        hashEntityMap35.mapNameToValue = map68;
        java.util.Map map72 = hashEntityMap35.mapValueToName;
        hashEntityMap30.mapValueToName = map72;
        hashEntityMap13.mapNameToValue = map72;
        hashEntityMap0.mapNameToValue = map72;
        java.util.Map map76 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 0);
        java.lang.String str81 = hashEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap1.add("", 52);
        java.lang.String str6 = arrayEntityMap1.name(0);
        int int7 = arrayEntityMap1.size;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) -1);
        int int14 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity(98);
        binaryEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("", 2);
        int int11 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
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
        binaryEntityMap0.ensureCapacity(52);
        binaryEntityMap0.growBy = ' ';
        java.lang.String str21 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        int int27 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = 32;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        int int10 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
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
        java.lang.String str34 = entities0.unescape("");
        java.lang.String str36 = entities0.escape("");
        java.io.Writer writer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer37, "");
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap8.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        hashEntityMap8.mapNameToValue = map13;
        int int16 = hashEntityMap8.value("");
        java.util.Map map17 = hashEntityMap8.mapNameToValue;
        hashEntityMap6.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap6.mapValueToName;
        hashEntityMap0.mapNameToValue = map19;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        hashEntityMap22.mapNameToValue = map27;
        hashEntityMap21.mapNameToValue = map27;
        java.util.Map map30 = hashEntityMap21.mapNameToValue;
        int int32 = hashEntityMap21.value("hi!");
        hashEntityMap21.add("", (int) (byte) 0);
        java.lang.String str37 = hashEntityMap21.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.lang.String str41 = hashEntityMap38.name((int) (byte) 0);
        java.util.Map map42 = hashEntityMap38.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap45.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = hashEntityMap49.mapNameToValue;
        hashEntityMap45.mapNameToValue = map50;
        int int53 = hashEntityMap45.value("");
        java.util.Map map54 = hashEntityMap45.mapNameToValue;
        hashEntityMap43.mapNameToValue = map54;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = hashEntityMap56.mapNameToValue;
        java.util.Map map58 = hashEntityMap56.mapValueToName;
        java.util.Map map59 = hashEntityMap56.mapNameToValue;
        java.util.Map map60 = hashEntityMap56.mapValueToName;
        hashEntityMap43.mapValueToName = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = hashEntityMap62.mapNameToValue;
        java.util.Map map64 = hashEntityMap62.mapValueToName;
        java.util.Map map65 = hashEntityMap62.mapNameToValue;
        hashEntityMap62.add("", (int) (byte) 10);
        int int70 = hashEntityMap62.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap71.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = hashEntityMap75.mapNameToValue;
        hashEntityMap71.mapNameToValue = map76;
        hashEntityMap62.mapNameToValue = map76;
        hashEntityMap43.mapNameToValue = map76;
        java.util.Map map80 = hashEntityMap43.mapValueToName;
        hashEntityMap38.mapValueToName = map80;
        hashEntityMap21.mapNameToValue = map80;
        hashEntityMap0.mapValueToName = map80;
        java.util.Map map84 = hashEntityMap0.mapValueToName;
        int int86 = hashEntityMap0.value("hi!");
        java.util.Map map87 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass88 = hashEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (short) 0);
        arrayEntityMap1.ensureCapacity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = (byte) 10;
        java.lang.String str14 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.add("hi!", 2);
        java.lang.String str19 = binaryEntityMap0.name(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        int int25 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap12.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        hashEntityMap0.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap38.mapNameToValue = map44;
        java.util.Map map47 = hashEntityMap38.mapNameToValue;
        int int49 = hashEntityMap38.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        java.util.Map map52 = hashEntityMap50.mapValueToName;
        java.util.Map map53 = hashEntityMap50.mapNameToValue;
        hashEntityMap38.mapValueToName = map53;
        hashEntityMap36.mapValueToName = map53;
        hashEntityMap36.add("hi!", (int) (short) 10);
        java.lang.String str60 = hashEntityMap36.name((int) (short) 1);
        java.util.Map map61 = hashEntityMap36.mapValueToName;
        hashEntityMap0.mapValueToName = map61;
        java.util.Map map63 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        int int15 = arrayEntityMap1.growBy;
        arrayEntityMap1.ensureCapacity(10);
        int int18 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        binaryEntityMap27.add("", 97);
        binaryEntityMap27.size = (byte) -1;
        int int36 = binaryEntityMap27.value("");
        java.lang.String str38 = binaryEntityMap27.name((int) (byte) 10);
        java.lang.String[] strArray39 = binaryEntityMap27.names;
        entities0.map = binaryEntityMap27;
        org.apache.commons.lang.Entities.EntityMap entityMap41 = entities0.map;
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(entityMap41);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        int int12 = hashEntityMap0.value("hi!");
        int int14 = hashEntityMap0.value("");
        hashEntityMap0.add("", 100);
        java.lang.String str19 = hashEntityMap0.name((int) (byte) 10);
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        int int22 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 1);
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        java.lang.String str15 = hashEntityMap0.name((int) '#');
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.size = (short) 100;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        arrayEntityMap8.add("hi!", 100);
        java.lang.String str17 = arrayEntityMap8.name((int) 'a');
        int int19 = arrayEntityMap8.value("");
        int[] intArray20 = arrayEntityMap8.values;
        int[] intArray21 = arrayEntityMap8.values;
        java.lang.String[] strArray22 = arrayEntityMap8.names;
        binaryEntityMap0.names = strArray22;
        binaryEntityMap0.growBy = 3;
        int[] intArray26 = binaryEntityMap0.values;
        binaryEntityMap0.size = 2;
        java.lang.String str30 = binaryEntityMap0.name((int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        int[] intArray3 = binaryEntityMap1.values;
        binaryEntityMap1.add("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        java.util.Map map13 = hashEntityMap10.mapNameToValue;
        java.util.Map map14 = hashEntityMap10.mapValueToName;
        java.util.Map map15 = hashEntityMap10.mapNameToValue;
        java.util.Map map16 = hashEntityMap10.mapValueToName;
        java.util.Map map17 = hashEntityMap10.mapValueToName;
        hashEntityMap0.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 35);
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.lang.String str11 = hashEntityMap0.name(10);
        hashEntityMap0.add("hi!", (int) '#');
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        hashEntityMap0.add("hi!", 0);
        java.util.Map map17 = hashEntityMap0.mapValueToName;
        java.util.Map map18 = hashEntityMap0.mapValueToName;
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        java.lang.String str21 = hashEntityMap0.name(100);
        java.lang.String str23 = hashEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = 1;
        int[] intArray8 = arrayEntityMap1.values;
        java.lang.String str10 = arrayEntityMap1.name((int) ' ');
        java.lang.String str12 = arrayEntityMap1.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.growBy = (short) 10;
        java.lang.String[] strArray7 = binaryEntityMap4.names;
        binaryEntityMap4.add("", (int) (short) 100);
        binaryEntityMap4.add("", (-1));
        int int15 = binaryEntityMap4.value("hi!");
        java.lang.String[] strArray16 = binaryEntityMap4.names;
        binaryEntityMap0.names = strArray16;
        java.lang.String str19 = binaryEntityMap0.name((int) (byte) 100);
        int int20 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        java.lang.String str25 = binaryEntityMap21.name(32);
        int[] intArray26 = binaryEntityMap21.values;
        binaryEntityMap0.values = intArray26;
        binaryEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray26);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str16 = binaryEntityMap14.name((int) (byte) 0);
        java.lang.String str18 = binaryEntityMap14.name((int) '#');
        java.lang.String str20 = binaryEntityMap14.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str23 = binaryEntityMap21.name((int) (byte) 0);
        int int25 = binaryEntityMap21.value("");
        binaryEntityMap21.add("", (int) (short) -1);
        binaryEntityMap21.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap33.ensureCapacity((int) 'a');
        arrayEntityMap33.ensureCapacity(0);
        java.lang.String[] strArray38 = arrayEntityMap33.names;
        binaryEntityMap21.names = strArray38;
        binaryEntityMap14.names = strArray38;
        binaryEntityMap0.names = strArray38;
        java.lang.String[] strArray42 = binaryEntityMap0.names;
        int int43 = binaryEntityMap0.size;
        java.lang.String str45 = binaryEntityMap0.name(97);
        java.lang.String str47 = binaryEntityMap0.name(1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.lang.String str3 = hashEntityMap0.name((int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap5.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        hashEntityMap5.mapNameToValue = map10;
        hashEntityMap4.mapNameToValue = map10;
        hashEntityMap0.mapNameToValue = map10;
        java.lang.String str15 = hashEntityMap0.name(100);
        int int17 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        java.util.Map map21 = hashEntityMap18.mapNameToValue;
        hashEntityMap18.add("", (int) (byte) 10);
        int int26 = hashEntityMap18.value("");
        java.lang.String str28 = hashEntityMap18.name((int) (byte) 10);
        java.lang.String str30 = hashEntityMap18.name((int) (short) 0);
        java.lang.String str32 = hashEntityMap18.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap34.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        hashEntityMap34.mapNameToValue = map39;
        hashEntityMap33.mapNameToValue = map39;
        java.util.Map map42 = hashEntityMap33.mapNameToValue;
        int int44 = hashEntityMap33.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        java.util.Map map47 = hashEntityMap45.mapValueToName;
        java.util.Map map48 = hashEntityMap45.mapNameToValue;
        hashEntityMap33.mapValueToName = map48;
        hashEntityMap18.mapNameToValue = map48;
        hashEntityMap18.add("", (int) ' ');
        java.util.Map map54 = hashEntityMap18.mapNameToValue;
        java.util.Map map55 = hashEntityMap18.mapNameToValue;
        hashEntityMap0.mapNameToValue = map55;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        java.lang.String str17 = hashEntityMap0.name((int) (byte) 0);
        java.lang.String str19 = hashEntityMap0.name(32);
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int23 = hashEntityMap21.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap21.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap21.mapValueToName;
        hashEntityMap0.mapValueToName = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int31 = hashEntityMap29.value("hi!");
        java.lang.String str33 = hashEntityMap29.name((int) (short) 0);
        java.util.Map map34 = hashEntityMap29.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        int int45 = hashEntityMap37.value("");
        java.util.Map map46 = hashEntityMap37.mapNameToValue;
        hashEntityMap35.mapNameToValue = map46;
        java.util.Map map48 = hashEntityMap35.mapValueToName;
        hashEntityMap29.mapNameToValue = map48;
        java.util.Map map50 = hashEntityMap29.mapValueToName;
        java.util.Map map51 = hashEntityMap29.mapValueToName;
        hashEntityMap0.mapNameToValue = map51;
        java.util.Map map53 = hashEntityMap0.mapValueToName;
        java.lang.String str55 = hashEntityMap0.name(32);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int11 = entities0.entityValue("hi!");
        int int13 = entities0.entityValue("hi!");
        int int15 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("", (int) (short) 1);
        arrayEntityMap0.ensureCapacity((int) ' ');
        int int6 = arrayEntityMap0.growBy;
        arrayEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        java.lang.String str17 = entities0.entityName(97);
        java.lang.String str19 = entities0.unescape("hi!");
        int int21 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (short) 10);
        int int26 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        java.lang.String[] strArray30 = binaryEntityMap27.names;
        entities0.map = binaryEntityMap27;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name(32);
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int8 = binaryEntityMap0.size;
        binaryEntityMap0.size = 2;
        java.lang.String str12 = binaryEntityMap0.name(52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer14 = null;
        entities0.escape(writer14, "");
        java.io.Writer writer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("hi!");
        int int18 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        binaryEntityMap13.add("", (int) (byte) 0);
        binaryEntityMap13.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        arrayEntityMap21.names = strArray25;
        int[] intArray27 = arrayEntityMap21.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap29.ensureCapacity((int) 'a');
        arrayEntityMap29.ensureCapacity(0);
        java.lang.String[] strArray34 = arrayEntityMap29.names;
        arrayEntityMap21.names = strArray34;
        binaryEntityMap13.names = strArray34;
        binaryEntityMap0.names = strArray34;
        int int39 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray40 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        int int9 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap10.mapNameToValue = map15;
        hashEntityMap10.add("hi!", (int) '4');
        int int21 = hashEntityMap10.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        int int26 = hashEntityMap22.value("");
        int int28 = hashEntityMap22.value("hi!");
        java.util.Map map29 = hashEntityMap22.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        int int40 = hashEntityMap32.value("");
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        hashEntityMap30.mapNameToValue = map41;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        java.util.Map map45 = hashEntityMap43.mapValueToName;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        java.util.Map map47 = hashEntityMap43.mapValueToName;
        hashEntityMap30.mapValueToName = map47;
        hashEntityMap22.mapValueToName = map47;
        hashEntityMap10.mapValueToName = map47;
        hashEntityMap0.mapValueToName = map47;
        org.apache.commons.lang.Entities entities52 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str54 = entities52.unescape("");
        int int56 = entities52.entityValue("");
        int int58 = entities52.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int61 = hashEntityMap59.value("hi!");
        java.util.Map map62 = hashEntityMap59.mapValueToName;
        int int64 = hashEntityMap59.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap66.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = hashEntityMap70.mapNameToValue;
        hashEntityMap66.mapNameToValue = map71;
        hashEntityMap65.mapNameToValue = map71;
        java.util.Map map74 = hashEntityMap65.mapNameToValue;
        hashEntityMap59.mapNameToValue = map74;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap76.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map81 = hashEntityMap80.mapNameToValue;
        hashEntityMap76.mapNameToValue = map81;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap83 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map84 = hashEntityMap83.mapNameToValue;
        hashEntityMap76.mapValueToName = map84;
        hashEntityMap59.mapNameToValue = map84;
        entities52.map = hashEntityMap59;
        java.util.Map map88 = hashEntityMap59.mapNameToValue;
        hashEntityMap0.mapNameToValue = map88;
        int int91 = hashEntityMap0.value("");
        int int93 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(entities52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.unescape("hi!");
        int int12 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        binaryEntityMap11.add("", 97);
        binaryEntityMap11.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray20 = new int[] {};
        binaryEntityMap19.values = intArray20;
        int int23 = binaryEntityMap19.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap25.growBy = (short) 10;
        java.lang.String[] strArray28 = binaryEntityMap25.names;
        arrayEntityMap24.names = strArray28;
        binaryEntityMap19.names = strArray28;
        int int32 = binaryEntityMap19.value("hi!");
        java.lang.String str34 = binaryEntityMap19.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str38 = arrayEntityMap36.name((int) (short) 100);
        int[] intArray41 = new int[] { (short) 0, (-1) };
        arrayEntityMap36.values = intArray41;
        binaryEntityMap19.values = intArray41;
        binaryEntityMap11.values = intArray41;
        binaryEntityMap0.values = intArray41;
        binaryEntityMap0.growBy = 98;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0, (-1) });
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        entities17.addEntity("", (int) '4');
        java.lang.String str25 = entities17.unescape("");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str28 = entities26.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities26.map = arrayEntityMap30;
        entities26.addEntity("", (int) ' ');
        java.lang.String str36 = entities26.unescape("");
        entities26.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer41 = null;
        entities40.escape(writer41, "");
        java.lang.String[][] strArray44 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities40.addEntities(strArray44);
        entities26.addEntities(strArray44);
        entities17.addEntities(strArray44);
        java.lang.String str49 = entities17.entityName(100);
        org.apache.commons.lang.Entities.EntityMap entityMap50 = entities17.map;
        entities0.map = entityMap50;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(entityMap50);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.add("", (int) 'a');
        int[] intArray14 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str7 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", (int) '#');
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 10);
        lookupEntityMap0.add("hi!", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        int int5 = binaryEntityMap1.value("hi!");
        int int7 = binaryEntityMap1.value("hi!");
        int[] intArray8 = binaryEntityMap1.values;
        int int9 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) 'a');
        int int10 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) (byte) 1);
        int int13 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int16 = hashEntityMap14.value("hi!");
        java.lang.String str18 = hashEntityMap14.name((int) (short) 0);
        java.util.Map map19 = hashEntityMap14.mapValueToName;
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
        java.util.Map map33 = hashEntityMap20.mapValueToName;
        hashEntityMap14.mapNameToValue = map33;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap36.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        hashEntityMap36.mapNameToValue = map41;
        hashEntityMap35.mapNameToValue = map41;
        java.util.Map map44 = hashEntityMap35.mapNameToValue;
        int int46 = hashEntityMap35.value("hi!");
        hashEntityMap35.add("", (int) (byte) 0);
        java.lang.String str51 = hashEntityMap35.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.lang.String str55 = hashEntityMap52.name((int) (byte) 0);
        java.util.Map map56 = hashEntityMap52.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap59.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = hashEntityMap63.mapNameToValue;
        hashEntityMap59.mapNameToValue = map64;
        int int67 = hashEntityMap59.value("");
        java.util.Map map68 = hashEntityMap59.mapNameToValue;
        hashEntityMap57.mapNameToValue = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = hashEntityMap70.mapNameToValue;
        java.util.Map map72 = hashEntityMap70.mapValueToName;
        java.util.Map map73 = hashEntityMap70.mapNameToValue;
        java.util.Map map74 = hashEntityMap70.mapValueToName;
        hashEntityMap57.mapValueToName = map74;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = hashEntityMap76.mapNameToValue;
        java.util.Map map78 = hashEntityMap76.mapValueToName;
        java.util.Map map79 = hashEntityMap76.mapNameToValue;
        hashEntityMap76.add("", (int) (byte) 10);
        int int84 = hashEntityMap76.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap85.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap89 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map90 = hashEntityMap89.mapNameToValue;
        hashEntityMap85.mapNameToValue = map90;
        hashEntityMap76.mapNameToValue = map90;
        hashEntityMap57.mapNameToValue = map90;
        java.util.Map map94 = hashEntityMap57.mapValueToName;
        hashEntityMap52.mapValueToName = map94;
        hashEntityMap35.mapNameToValue = map94;
        hashEntityMap14.mapValueToName = map94;
        hashEntityMap0.mapValueToName = map94;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10 + "'", int84 == 10);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 0);
        java.util.Map map24 = hashEntityMap0.mapValueToName;
        int int26 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map5 = treeEntityMap4.mapNameToValue;
        hashEntityMap0.mapValueToName = map5;
        hashEntityMap0.add("hi!", 0);
        int int11 = hashEntityMap0.value("");
        int int13 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        binaryEntityMap0.size = '#';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray18 = new int[] {};
        binaryEntityMap17.values = intArray18;
        int int21 = binaryEntityMap17.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        arrayEntityMap22.names = strArray26;
        binaryEntityMap17.names = strArray26;
        int int30 = binaryEntityMap17.value("hi!");
        java.lang.String str32 = binaryEntityMap17.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        binaryEntityMap33.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap40.growBy = (short) 10;
        java.lang.String[] strArray43 = binaryEntityMap40.names;
        binaryEntityMap33.names = strArray43;
        binaryEntityMap17.names = strArray43;
        binaryEntityMap0.names = strArray43;
        java.lang.String str48 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
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
        hashEntityMap0.add("hi!", 10);
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str24 = entities22.unescape("");
        java.lang.String str26 = entities22.entityName(100);
        java.lang.String str28 = entities22.entityName((int) ' ');
        java.lang.String str30 = entities22.entityName(10);
        java.lang.String str32 = entities22.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int35 = hashEntityMap33.value("hi!");
        java.util.Map map36 = hashEntityMap33.mapValueToName;
        int int38 = hashEntityMap33.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap40.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        hashEntityMap40.mapNameToValue = map45;
        hashEntityMap39.mapNameToValue = map45;
        java.util.Map map48 = hashEntityMap39.mapNameToValue;
        hashEntityMap33.mapNameToValue = map48;
        entities22.map = hashEntityMap33;
        hashEntityMap33.add("", (int) (short) 10);
        java.util.Map map54 = hashEntityMap33.mapValueToName;
        hashEntityMap0.mapNameToValue = map54;
        hashEntityMap0.add("", 32);
        hashEntityMap0.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap63.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = hashEntityMap67.mapNameToValue;
        hashEntityMap63.mapNameToValue = map68;
        hashEntityMap62.mapNameToValue = map68;
        java.util.Map map71 = hashEntityMap62.mapNameToValue;
        int int73 = hashEntityMap62.value("hi!");
        hashEntityMap62.add("", (int) (byte) 0);
        java.util.Map map77 = hashEntityMap62.mapValueToName;
        java.lang.String str79 = hashEntityMap62.name((int) (byte) 0);
        java.lang.String str81 = hashEntityMap62.name(32);
        java.util.Map map82 = hashEntityMap62.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap83 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int85 = hashEntityMap83.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap86 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map87 = hashEntityMap86.mapNameToValue;
        hashEntityMap83.mapNameToValue = map87;
        java.util.Map map89 = hashEntityMap83.mapValueToName;
        hashEntityMap62.mapValueToName = map89;
        hashEntityMap0.mapNameToValue = map89;
        java.lang.String str93 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        java.util.Map map11 = hashEntityMap0.mapNameToValue;
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        int int11 = entities0.entityValue("hi!");
        java.lang.String str13 = entities0.entityName((int) (byte) 100);
        entities0.addEntity("", (int) (byte) 1);
        java.io.Writer writer17 = null;
        entities0.escape(writer17, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap8 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str10 = lookupEntityMap8.name((int) (short) 0);
        java.lang.String str12 = lookupEntityMap8.name((int) (short) 1);
        java.lang.String str14 = lookupEntityMap8.name((int) (byte) 100);
        java.lang.String str16 = lookupEntityMap8.name((int) 'a');
        int int18 = lookupEntityMap8.value("");
        int int20 = lookupEntityMap8.value("");
        java.lang.String str22 = lookupEntityMap8.name(52);
        java.lang.String str24 = lookupEntityMap8.name((int) '#');
        entities0.map = lookupEntityMap8;
        java.lang.String str27 = lookupEntityMap8.name(100);
        lookupEntityMap8.add("", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer15 = null;
        entities14.escape(writer15, "");
        java.lang.String[][] strArray18 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities14.addEntities(strArray18);
        java.lang.String str21 = entities14.escape("hi!");
        java.lang.String str23 = entities14.unescape("");
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str26 = entities24.unescape("");
        java.io.Writer writer27 = null;
        entities24.escape(writer27, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities24.map = arrayEntityMap31;
        java.lang.String str34 = arrayEntityMap31.name((int) (byte) 100);
        java.lang.String[] strArray35 = arrayEntityMap31.names;
        int int36 = arrayEntityMap31.size;
        entities14.map = arrayEntityMap31;
        java.lang.String str39 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str42 = entities40.unescape("");
        java.lang.String str44 = entities40.entityName(100);
        java.lang.String str46 = entities40.entityName((int) ' ');
        java.lang.String str48 = entities40.entityName(10);
        java.lang.String str50 = entities40.escape("hi!");
        java.lang.String str52 = entities40.unescape("");
        org.apache.commons.lang.Entities entities53 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer54 = null;
        entities53.escape(writer54, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap57 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities53.map = primitiveEntityMap57;
        java.lang.String str60 = entities53.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities61 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer62 = null;
        entities61.escape(writer62, "");
        java.lang.String[][] strArray65 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities61.addEntities(strArray65);
        entities53.addEntities(strArray65);
        entities40.addEntities(strArray65);
        entities14.addEntities(strArray65);
        entities0.addEntities(strArray65);
        org.apache.commons.lang.Entities.EntityMap entityMap71 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(entities53);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(entities61);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(entityMap71);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        int int26 = binaryEntityMap0.growBy;
        java.lang.String str28 = binaryEntityMap0.name(97);
        java.lang.String str30 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 10;
        int[] intArray9 = binaryEntityMap0.values;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        entities0.addEntity("hi!", (int) (short) -1);
        java.lang.String str10 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        java.lang.String str7 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        int int11 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
// flaky "13) test3721(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        arrayEntityMap1.add("hi!", (int) (short) 1);
        int int17 = arrayEntityMap1.size;
        java.lang.String str19 = arrayEntityMap1.name((int) (byte) 100);
        int int20 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int22 = binaryEntityMap21.growBy;
        binaryEntityMap21.ensureCapacity((int) '4');
        binaryEntityMap21.growBy = '4';
        java.lang.String str28 = binaryEntityMap21.name((int) (short) 0);
        int[] intArray29 = binaryEntityMap21.values;
        arrayEntityMap1.values = intArray29;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        int int11 = binaryEntityMap6.value("");
        binaryEntityMap6.growBy = (short) 1;
        int int15 = binaryEntityMap6.value("");
        int[] intArray16 = binaryEntityMap6.values;
        binaryEntityMap6.growBy = (byte) 100;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = '4';
        java.lang.String str23 = binaryEntityMap19.name(100);
        int int24 = binaryEntityMap19.growBy;
        java.lang.String str26 = binaryEntityMap19.name((int) ' ');
        int[] intArray27 = binaryEntityMap19.values;
        binaryEntityMap6.values = intArray27;
        binaryEntityMap0.values = intArray27;
        int[] intArray30 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
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
        java.lang.String str17 = hashEntityMap0.name((int) (byte) 0);
        java.lang.String str19 = hashEntityMap0.name(32);
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        java.lang.String str12 = binaryEntityMap0.name((int) (short) 0);
        java.lang.String str14 = binaryEntityMap0.name((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String[] strArray8 = binaryEntityMap0.names;
        java.lang.String str10 = binaryEntityMap0.name(3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap5.growBy = (short) 10;
        java.lang.String[] strArray8 = binaryEntityMap5.names;
        arrayEntityMap4.names = strArray8;
        int[] intArray10 = arrayEntityMap4.values;
        binaryEntityMap0.values = intArray10;
        java.lang.String str13 = binaryEntityMap0.name(35);
        binaryEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 1);
        binaryEntityMap0.growBy = (short) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = new int[] {};
        binaryEntityMap12.values = intArray13;
        int int16 = binaryEntityMap12.value("");
        java.lang.String str18 = binaryEntityMap12.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = (short) 10;
        java.lang.String[] strArray22 = binaryEntityMap19.names;
        int int24 = binaryEntityMap19.value("");
        binaryEntityMap19.growBy = (short) 1;
        binaryEntityMap19.size = 100;
        binaryEntityMap19.add("", 100);
        java.lang.String[] strArray32 = binaryEntityMap19.names;
        binaryEntityMap12.names = strArray32;
        binaryEntityMap0.names = strArray32;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        lookupEntityMap0.add("hi!", 32);
        java.lang.String str10 = lookupEntityMap0.name(97);
        java.lang.String str12 = lookupEntityMap0.name(2);
        java.lang.String str14 = lookupEntityMap0.name(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (byte) 10);
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 1);
        int int14 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (short) 0);
        arrayEntityMap4.growBy = (byte) 100;
        java.lang.String[] strArray12 = arrayEntityMap4.names;
        arrayEntityMap4.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        binaryEntityMap0.size = 1;
        binaryEntityMap0.growBy = (byte) 10;
        java.lang.String[] strArray20 = binaryEntityMap0.names;
        java.lang.String[] strArray21 = binaryEntityMap0.names;
        int[] intArray22 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray22);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.add("hi!", 2);
        int int6 = arrayEntityMap0.size;
        java.lang.String str8 = arrayEntityMap0.name((int) (short) -1);
        int int9 = arrayEntityMap0.growBy;
        int[] intArray10 = arrayEntityMap0.values;
        java.lang.String str12 = arrayEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) 1);
        int int21 = lookupEntityMap0.value("hi!");
        java.lang.String str23 = lookupEntityMap0.name(32);
        java.lang.Class<?> wildcardClass24 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        java.lang.String str12 = binaryEntityMap8.name((int) '#');
        binaryEntityMap8.growBy = (byte) 10;
        binaryEntityMap8.growBy = 1;
        int int17 = binaryEntityMap8.growBy;
        java.lang.String[] strArray18 = binaryEntityMap8.names;
        arrayEntityMap1.names = strArray18;
        arrayEntityMap1.growBy = (-1);
        arrayEntityMap1.growBy = (byte) 10;
        int[] intArray24 = arrayEntityMap1.values;
        java.lang.String str26 = arrayEntityMap1.name(32);
        int int27 = arrayEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) 1);
        java.lang.String str21 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("hi!", (int) (short) 0);
        lookupEntityMap0.add("", 97);
        lookupEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.lang.String str11 = hashEntityMap0.name(10);
        hashEntityMap0.add("hi!", (int) '#');
        int int16 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (int) (byte) 10);
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.growBy = ' ';
        java.lang.String str11 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.growBy = 10;
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 1);
        java.lang.String str17 = binaryEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
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
        binaryEntityMap0.ensureCapacity(52);
        binaryEntityMap0.growBy = ' ';
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        binaryEntityMap0.add("", 0);
        int int26 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(101);
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray7 = new int[] {};
        binaryEntityMap6.values = intArray7;
        int[] intArray9 = binaryEntityMap6.values;
        int[] intArray10 = binaryEntityMap6.values;
        arrayEntityMap1.values = intArray10;
        java.lang.String[] strArray12 = null;
        arrayEntityMap1.names = strArray12;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] {});
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        java.lang.String str10 = arrayEntityMap7.name((int) (byte) 100);
        java.lang.String[] strArray11 = arrayEntityMap7.names;
        int int12 = arrayEntityMap7.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray14 = new int[] {};
        binaryEntityMap13.values = intArray14;
        int int17 = binaryEntityMap13.value("");
        java.lang.String str19 = binaryEntityMap13.name((int) (byte) 1);
        java.lang.String str21 = binaryEntityMap13.name(0);
        java.lang.String[] strArray22 = binaryEntityMap13.names;
        arrayEntityMap7.names = strArray22;
        arrayEntityMap7.add("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        java.lang.String str4 = arrayEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        hashEntityMap0.add("", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        hashEntityMap0.mapValueToName = map26;
        java.util.Map map28 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        java.util.Map map34 = hashEntityMap32.mapValueToName;
        int int36 = hashEntityMap32.value("");
        hashEntityMap32.add("", 1);
        java.util.Map map40 = hashEntityMap32.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        java.util.Map map45 = hashEntityMap41.mapNameToValue;
        java.util.Map map46 = hashEntityMap41.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap48.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        hashEntityMap48.mapNameToValue = map53;
        hashEntityMap47.mapNameToValue = map53;
        java.util.Map map56 = hashEntityMap47.mapNameToValue;
        hashEntityMap47.add("", (int) (byte) 1);
        java.util.Map map60 = hashEntityMap47.mapNameToValue;
        hashEntityMap41.mapNameToValue = map60;
        hashEntityMap32.mapNameToValue = map60;
        hashEntityMap0.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap64.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        hashEntityMap64.mapNameToValue = map69;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = hashEntityMap71.mapNameToValue;
        hashEntityMap64.mapValueToName = map72;
        java.util.Map map74 = hashEntityMap64.mapNameToValue;
        hashEntityMap0.mapValueToName = map74;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        java.lang.String str17 = entities0.entityName(97);
        java.lang.String str19 = entities0.unescape("hi!");
        int int21 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str26 = entities0.entityName((int) ' ');
        entities0.addEntity("hi!", (int) (byte) 1);
        int int31 = entities0.entityValue("");
        java.io.Writer writer32 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer32, "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap13.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        hashEntityMap13.mapNameToValue = map18;
        hashEntityMap12.mapNameToValue = map18;
        java.util.Map map21 = hashEntityMap12.mapNameToValue;
        hashEntityMap12.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int27 = hashEntityMap25.value("hi!");
        java.util.Map map28 = hashEntityMap25.mapValueToName;
        int int30 = hashEntityMap25.value("");
        java.util.Map map31 = hashEntityMap25.mapNameToValue;
        hashEntityMap12.mapValueToName = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap36.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        hashEntityMap36.mapNameToValue = map41;
        hashEntityMap35.mapNameToValue = map41;
        java.util.Map map44 = hashEntityMap35.mapNameToValue;
        int int46 = hashEntityMap35.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        java.util.Map map49 = hashEntityMap47.mapValueToName;
        java.util.Map map50 = hashEntityMap47.mapNameToValue;
        hashEntityMap35.mapValueToName = map50;
        hashEntityMap33.mapValueToName = map50;
        java.util.Map map53 = hashEntityMap33.mapValueToName;
        hashEntityMap12.mapNameToValue = map53;
        hashEntityMap0.mapNameToValue = map53;
        hashEntityMap0.add("hi!", (int) (short) 0);
        hashEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        binaryEntityMap0.growBy = ' ';
        int int13 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 52;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        java.lang.String str14 = hashEntityMap0.name(97);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity((int) '4');
        binaryEntityMap0.growBy = '4';
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("", 100);
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        java.lang.String str16 = entities0.entityName((int) (short) 0);
        java.lang.String str18 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "14) test3750(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        primitiveEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
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
        int int25 = entities0.entityValue("");
        java.lang.String str27 = entities0.escape("hi!");
        java.lang.String str29 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky "15) test3752(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.lang.String str11 = hashEntityMap0.name(10);
        java.lang.String str13 = hashEntityMap0.name(32);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        java.util.Map map17 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        java.lang.String str49 = hashEntityMap0.name((int) (byte) 1);
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        java.util.Map map20 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 0);
        hashEntityMap0.add("hi!", (int) (short) -1);
        java.util.Map map27 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        int int10 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.growBy = 3;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("hi!", (int) 'a');
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        java.io.Writer writer14 = null;
        entities0.escape(writer14, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        int int6 = binaryEntityMap1.value("");
        int[] intArray7 = null;
        binaryEntityMap1.values = intArray7;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        entities0.addEntity("hi!", 100);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int17 = arrayEntityMap15.value("hi!");
        entities10.map = arrayEntityMap15;
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities10.map;
        entities0.map = entityMap19;
        java.lang.String str22 = entities0.escape("hi!");
        entities0.addEntity("", (int) (short) 100);
        int int27 = entities0.entityValue("hi!");
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer28, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky "16) test3760(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(entityMap19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        int int15 = arrayEntityMap0.growBy;
        arrayEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        int int14 = hashEntityMap10.value("");
        hashEntityMap10.add("", 1);
        java.util.Map map18 = hashEntityMap10.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap21.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        hashEntityMap21.mapNameToValue = map26;
        int int29 = hashEntityMap21.value("");
        java.util.Map map30 = hashEntityMap21.mapNameToValue;
        hashEntityMap19.mapNameToValue = map30;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        java.util.Map map34 = hashEntityMap32.mapValueToName;
        java.util.Map map35 = hashEntityMap32.mapNameToValue;
        java.util.Map map36 = hashEntityMap32.mapValueToName;
        hashEntityMap19.mapValueToName = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.util.Map map40 = hashEntityMap38.mapValueToName;
        java.util.Map map41 = hashEntityMap38.mapNameToValue;
        hashEntityMap38.add("", (int) (byte) 10);
        int int46 = hashEntityMap38.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap47.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapNameToValue;
        hashEntityMap47.mapNameToValue = map52;
        hashEntityMap38.mapNameToValue = map52;
        hashEntityMap19.mapNameToValue = map52;
        java.util.Map map56 = hashEntityMap19.mapValueToName;
        hashEntityMap10.mapNameToValue = map56;
        hashEntityMap10.add("", 97);
        hashEntityMap10.add("", 10);
        java.lang.String str65 = hashEntityMap10.name((int) ' ');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap68.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        hashEntityMap68.mapNameToValue = map73;
        int int76 = hashEntityMap68.value("");
        java.util.Map map77 = hashEntityMap68.mapNameToValue;
        hashEntityMap66.mapNameToValue = map77;
        java.util.Map map79 = hashEntityMap66.mapValueToName;
        java.util.Map map80 = hashEntityMap66.mapNameToValue;
        hashEntityMap10.mapNameToValue = map80;
        hashEntityMap0.mapNameToValue = map80;
        java.lang.String str84 = hashEntityMap0.name((int) ' ');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        entities0.addEntity("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str30 = binaryEntityMap28.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap31.growBy = (short) 10;
        java.lang.String[] strArray34 = binaryEntityMap31.names;
        binaryEntityMap31.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap38.growBy = (short) 10;
        java.lang.String[] strArray41 = binaryEntityMap38.names;
        binaryEntityMap31.names = strArray41;
        binaryEntityMap28.names = strArray41;
        java.lang.String str45 = binaryEntityMap28.name((int) (short) 100);
        java.lang.String str47 = binaryEntityMap28.name(52);
        binaryEntityMap28.add("", (int) (short) 100);
        entities0.map = binaryEntityMap28;
        binaryEntityMap28.add("", (int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("", (int) (short) 1);
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.lang.String str15 = binaryEntityMap10.name((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap10.add("", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
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
        java.lang.String str17 = entities0.entityName(97);
        java.lang.String str19 = entities0.unescape("hi!");
        int int21 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", 1);
        java.io.Writer writer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer25, "");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        binaryEntityMap0.size = 1;
        binaryEntityMap0.growBy = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str22 = binaryEntityMap20.name((int) (byte) 0);
        int int24 = binaryEntityMap20.value("");
        binaryEntityMap20.add("", (int) (short) -1);
        binaryEntityMap20.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap32 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap32.ensureCapacity((int) 'a');
        arrayEntityMap32.ensureCapacity(0);
        java.lang.String[] strArray37 = arrayEntityMap32.names;
        binaryEntityMap20.names = strArray37;
        binaryEntityMap0.names = strArray37;
        int[] intArray40 = binaryEntityMap0.values;
        binaryEntityMap0.size = 52;
        binaryEntityMap0.growBy = (byte) 1;
        java.lang.String[] strArray45 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 0);
        int int2 = arrayEntityMap1.size;
        java.lang.String str4 = arrayEntityMap1.name(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) ' ');
        int int14 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        int int13 = hashEntityMap0.value("hi!");
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        java.lang.String str16 = hashEntityMap0.name(2);
        java.lang.String str18 = hashEntityMap0.name((int) '#');
        java.lang.String str20 = hashEntityMap0.name(2);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String str12 = hashEntityMap0.name((int) '#');
        int int14 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        java.lang.String str5 = hashEntityMap0.name((int) 'a');
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        int int8 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        java.util.Map map12 = hashEntityMap9.mapNameToValue;
        java.util.Map map13 = hashEntityMap9.mapValueToName;
        java.util.Map map14 = hashEntityMap9.mapValueToName;
        int int16 = hashEntityMap9.value("hi!");
        java.util.Map map17 = hashEntityMap9.mapValueToName;
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
        hashEntityMap19.add("", (int) (short) 0);
        hashEntityMap19.add("hi!", (int) '4');
        java.util.Map map42 = hashEntityMap19.mapNameToValue;
        hashEntityMap0.mapValueToName = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap44.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        hashEntityMap44.mapNameToValue = map49;
        hashEntityMap44.add("hi!", (int) '4');
        java.util.Map map54 = hashEntityMap44.mapValueToName;
        hashEntityMap0.mapNameToValue = map54;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap7.name((int) '#');
        int[] intArray12 = binaryEntityMap7.values;
        entities0.map = binaryEntityMap7;
        java.lang.String str15 = entities0.escape("hi!");
        int int17 = entities0.entityValue("");
        java.lang.String str19 = entities0.escape("");
        entities0.addEntity("hi!", 0);
        java.lang.String str24 = entities0.unescape("");
        int int26 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        binaryEntityMap11.add("", 97);
        binaryEntityMap11.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray20 = new int[] {};
        binaryEntityMap19.values = intArray20;
        int int23 = binaryEntityMap19.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap25.growBy = (short) 10;
        java.lang.String[] strArray28 = binaryEntityMap25.names;
        arrayEntityMap24.names = strArray28;
        binaryEntityMap19.names = strArray28;
        int int32 = binaryEntityMap19.value("hi!");
        java.lang.String str34 = binaryEntityMap19.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str38 = arrayEntityMap36.name((int) (short) 100);
        int[] intArray41 = new int[] { (short) 0, (-1) };
        arrayEntityMap36.values = intArray41;
        binaryEntityMap19.values = intArray41;
        binaryEntityMap11.values = intArray41;
        binaryEntityMap0.values = intArray41;
        int int47 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 0;
        int int51 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        java.lang.String str20 = entities0.entityName(0);
        java.lang.String str22 = entities0.entityName(1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(32);
        int int3 = arrayEntityMap1.value("");
        int[] intArray4 = null;
        arrayEntityMap1.values = intArray4;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(35);
        int int3 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        int int4 = arrayEntityMap0.value("");
        java.lang.String[] strArray5 = arrayEntityMap0.names;
        int int6 = arrayEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str5 = binaryEntityMap0.name(2);
        binaryEntityMap0.size = 0;
        int int8 = binaryEntityMap0.size;
        binaryEntityMap0.size = (short) 100;
        int[] intArray11 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        int[] intArray10 = binaryEntityMap0.values;
        int int12 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str5 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", 0);
        lookupEntityMap0.add("hi!", 100);
        java.lang.String str13 = lookupEntityMap0.name((int) (byte) 1);
        int int15 = lookupEntityMap0.value("");
        java.lang.String str17 = lookupEntityMap0.name(97);
        int int19 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap11.ensureCapacity((int) 'a');
        arrayEntityMap11.ensureCapacity(0);
        arrayEntityMap11.add("hi!", 100);
        java.lang.String str20 = arrayEntityMap11.name((int) 'a');
        int int22 = arrayEntityMap11.value("");
        int[] intArray23 = arrayEntityMap11.values;
        int int24 = arrayEntityMap11.size;
        int int26 = arrayEntityMap11.value("");
        entities0.map = arrayEntityMap11;
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap14);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str16 = entities14.unescape("");
        java.lang.String str18 = entities14.entityName(100);
        java.lang.String str20 = entities14.entityName((int) ' ');
        java.lang.String str22 = entities14.entityName((int) '#');
        entities14.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap26 = entities14.map;
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities14.map;
        java.lang.String str29 = entities14.entityName((int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap31.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        hashEntityMap31.mapNameToValue = map36;
        hashEntityMap30.mapNameToValue = map36;
        java.util.Map map39 = hashEntityMap30.mapNameToValue;
        int int41 = hashEntityMap30.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        java.util.Map map44 = hashEntityMap42.mapValueToName;
        java.util.Map map45 = hashEntityMap42.mapNameToValue;
        hashEntityMap30.mapValueToName = map45;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        java.util.Map map49 = hashEntityMap47.mapValueToName;
        java.util.Map map50 = hashEntityMap47.mapNameToValue;
        hashEntityMap30.mapValueToName = map50;
        entities14.map = hashEntityMap30;
        java.util.Map map53 = hashEntityMap30.mapValueToName;
        hashEntityMap0.mapValueToName = map53;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(entityMap26);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        java.lang.String str17 = hashEntityMap0.name((int) (byte) 0);
        java.util.Map map18 = hashEntityMap0.mapValueToName;
        java.lang.String str20 = hashEntityMap0.name((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        java.lang.String str6 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        int int11 = binaryEntityMap7.value("hi!");
        int[] intArray12 = binaryEntityMap7.values;
        binaryEntityMap0.values = intArray12;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int23 = binaryEntityMap22.growBy;
        binaryEntityMap22.add("", (int) ' ');
        java.lang.String str28 = binaryEntityMap22.name((int) ' ');
        int int30 = binaryEntityMap22.value("hi!");
        int int31 = binaryEntityMap22.growBy;
        binaryEntityMap22.ensureCapacity((int) (byte) 10);
        int int35 = binaryEntityMap22.value("hi!");
        entities0.map = binaryEntityMap22;
        binaryEntityMap22.size = 98;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        int int25 = entities0.entityValue("");
        java.lang.String str27 = entities0.entityName(1);
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.lang.String str15 = binaryEntityMap10.name((int) (byte) 100);
        int[] intArray16 = null;
        binaryEntityMap10.values = intArray16;
        int int18 = binaryEntityMap10.growBy;
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str21 = entities19.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities19.map = arrayEntityMap23;
        int int25 = arrayEntityMap23.size;
        arrayEntityMap23.add("hi!", (int) (short) 0);
        arrayEntityMap23.growBy = (byte) 100;
        arrayEntityMap23.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        java.lang.String str37 = binaryEntityMap33.name((int) '#');
        int[] intArray38 = binaryEntityMap33.values;
        arrayEntityMap23.values = intArray38;
        binaryEntityMap10.values = intArray38;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        binaryEntityMap0.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        int[] intArray11 = binaryEntityMap7.values;
        int[] intArray12 = binaryEntityMap7.values;
        binaryEntityMap0.values = intArray12;
        java.lang.String[] strArray14 = null;
        binaryEntityMap0.names = strArray14;
        java.lang.String str17 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str19 = binaryEntityMap0.name(101);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str23 = arrayEntityMap21.name((int) (short) 100);
        int[] intArray26 = new int[] { (short) 0, (-1) };
        arrayEntityMap21.values = intArray26;
        int int28 = arrayEntityMap21.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str31 = binaryEntityMap29.name((int) (byte) 0);
        int int33 = binaryEntityMap29.value("");
        binaryEntityMap29.growBy = 10;
        java.lang.String str37 = binaryEntityMap29.name((int) (byte) 10);
        java.lang.String[] strArray38 = binaryEntityMap29.names;
        arrayEntityMap21.names = strArray38;
        arrayEntityMap21.ensureCapacity((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap42.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap47 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap47.growBy = (short) 10;
        java.lang.String[] strArray50 = binaryEntityMap47.names;
        arrayEntityMap46.names = strArray50;
        int[] intArray52 = arrayEntityMap46.values;
        binaryEntityMap42.values = intArray52;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap54 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap54.growBy = (short) 10;
        java.lang.String[] strArray57 = binaryEntityMap54.names;
        int int59 = binaryEntityMap54.value("");
        binaryEntityMap54.growBy = (short) 1;
        binaryEntityMap54.size = 100;
        binaryEntityMap54.add("", 100);
        java.lang.String[] strArray67 = binaryEntityMap54.names;
        binaryEntityMap42.names = strArray67;
        arrayEntityMap21.names = strArray67;
        java.lang.String[] strArray70 = arrayEntityMap21.names;
        binaryEntityMap0.names = strArray70;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name(0);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        java.lang.String str14 = lookupEntityMap0.name(0);
        int int16 = lookupEntityMap0.value("");
        java.lang.String str18 = lookupEntityMap0.name(35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
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
        hashEntityMap0.add("hi!", (int) ' ');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap51.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapNameToValue;
        hashEntityMap51.mapNameToValue = map56;
        java.util.Map map58 = hashEntityMap51.mapValueToName;
        java.util.Map map59 = hashEntityMap51.mapNameToValue;
        hashEntityMap51.add("", (int) (byte) 100);
        java.util.Map map63 = hashEntityMap51.mapValueToName;
        hashEntityMap0.mapNameToValue = map63;
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
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities0.map;
        java.lang.String str26 = entities0.unescape("");
        java.lang.String str28 = entities0.escape("");
        java.lang.String str30 = entities0.entityName((int) (short) 1);
        java.io.Writer writer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer31, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        binaryEntityMap0.size = (short) 10;
        int[] intArray17 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("");
        java.lang.String str6 = primitiveEntityMap0.name((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        java.lang.String str10 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(2);
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name((int) 'a');
        int int16 = lookupEntityMap0.value("hi!");
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        entities0.addEntity("hi!", 97);
        java.lang.String str22 = entities0.unescape("");
        java.lang.String str24 = entities0.escape("");
        int int26 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int28 = binaryEntityMap27.growBy;
        binaryEntityMap27.add("", (int) ' ');
        java.lang.String str33 = binaryEntityMap27.name((int) ' ');
        int int35 = binaryEntityMap27.value("hi!");
        binaryEntityMap27.ensureCapacity((int) (short) 10);
        entities0.map = binaryEntityMap27;
        int int39 = binaryEntityMap27.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        arrayEntityMap1.add("hi!", (int) (short) 1);
        int int17 = arrayEntityMap1.size;
        arrayEntityMap1.size = (-1);
        int int21 = arrayEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name(1);
        int int14 = hashEntityMap0.value("");
        int int16 = hashEntityMap0.value("");
        java.util.Map map17 = hashEntityMap0.mapNameToValue;
        java.lang.String str19 = hashEntityMap0.name(2);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int[] intArray6 = arrayEntityMap1.values;
        int[] intArray7 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        binaryEntityMap8.size = (short) 100;
        java.lang.String[] strArray14 = binaryEntityMap8.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int17 = arrayEntityMap15.value("");
        arrayEntityMap15.ensureCapacity((int) (byte) 100);
        int[] intArray20 = arrayEntityMap15.values;
        binaryEntityMap8.values = intArray20;
        arrayEntityMap1.values = intArray20;
        int int23 = arrayEntityMap1.growBy;
        arrayEntityMap1.ensureCapacity(10);
        int int26 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name(0);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        java.lang.String str14 = lookupEntityMap0.name(0);
        int int16 = lookupEntityMap0.value("");
        java.lang.String str18 = lookupEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap10.mapNameToValue = map15;
        hashEntityMap9.mapNameToValue = map15;
        java.util.Map map18 = hashEntityMap9.mapNameToValue;
        int int20 = hashEntityMap9.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        java.util.Map map23 = hashEntityMap21.mapValueToName;
        java.util.Map map24 = hashEntityMap21.mapNameToValue;
        hashEntityMap9.mapValueToName = map24;
        hashEntityMap7.mapValueToName = map24;
        hashEntityMap0.mapNameToValue = map24;
        hashEntityMap0.add("hi!", (int) (byte) 100);
        int int32 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        java.util.Map map35 = hashEntityMap33.mapValueToName;
        int int37 = hashEntityMap33.value("");
        hashEntityMap33.add("", 1);
        java.util.Map map41 = hashEntityMap33.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap44.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        hashEntityMap44.mapNameToValue = map49;
        int int52 = hashEntityMap44.value("");
        java.util.Map map53 = hashEntityMap44.mapNameToValue;
        hashEntityMap42.mapNameToValue = map53;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapNameToValue;
        java.util.Map map57 = hashEntityMap55.mapValueToName;
        java.util.Map map58 = hashEntityMap55.mapNameToValue;
        java.util.Map map59 = hashEntityMap55.mapValueToName;
        hashEntityMap42.mapValueToName = map59;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        java.util.Map map63 = hashEntityMap61.mapValueToName;
        java.util.Map map64 = hashEntityMap61.mapNameToValue;
        hashEntityMap61.add("", (int) (byte) 10);
        int int69 = hashEntityMap61.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap70.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map75 = hashEntityMap74.mapNameToValue;
        hashEntityMap70.mapNameToValue = map75;
        hashEntityMap61.mapNameToValue = map75;
        hashEntityMap42.mapNameToValue = map75;
        java.util.Map map79 = hashEntityMap42.mapValueToName;
        hashEntityMap33.mapNameToValue = map79;
        java.util.Map map81 = hashEntityMap33.mapNameToValue;
        hashEntityMap0.mapValueToName = map81;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
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
        int int47 = arrayEntityMap26.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray49 = new int[] {};
        binaryEntityMap48.values = intArray49;
        int int52 = binaryEntityMap48.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap54 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap54.growBy = (short) 10;
        java.lang.String[] strArray57 = binaryEntityMap54.names;
        arrayEntityMap53.names = strArray57;
        binaryEntityMap48.names = strArray57;
        java.lang.String[] strArray60 = binaryEntityMap48.names;
        arrayEntityMap26.names = strArray60;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) ' ');
        int int11 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 100);
        primitiveEntityMap0.add("", 100);
        java.lang.String str22 = primitiveEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.growBy = (short) 0;
        binaryEntityMap0.add("hi!", 1);
        int int17 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (short) 0);
        int int10 = arrayEntityMap4.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int7 = lookupEntityMap0.value("hi!");
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name(10);
        java.lang.String str13 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.unescape("");
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int13 = arrayEntityMap11.value("hi!");
        arrayEntityMap11.size = (byte) -1;
        int int17 = arrayEntityMap11.value("");
        entities0.map = arrayEntityMap11;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", 2);
        java.lang.String str15 = lookupEntityMap0.name(98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(97);
        binaryEntityMap0.add("", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        java.lang.String str26 = entities0.entityName((int) (short) 10);
        java.lang.String str28 = entities0.entityName((int) ' ');
        java.lang.String str30 = entities0.entityName((int) '#');
        java.io.Writer writer31 = null;
        entities0.escape(writer31, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
// flaky "17) test3822(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "5) test3822(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String[][] strArray6 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray6);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        java.util.Map map10 = hashEntityMap8.mapValueToName;
        int int12 = hashEntityMap8.value("");
        hashEntityMap8.add("", 1);
        hashEntityMap8.add("", (int) (short) 0);
        entities0.map = hashEntityMap8;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap1.add("", 100);
        java.lang.String str6 = binaryEntityMap1.name(52);
        binaryEntityMap1.add("", 1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        entities0.addEntity("", (int) (byte) 1);
        java.lang.String str16 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        int int12 = binaryEntityMap7.value("");
        binaryEntityMap7.growBy = (short) 1;
        binaryEntityMap7.size = 100;
        binaryEntityMap7.add("", 100);
        java.lang.String[] strArray20 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray20;
        int int22 = binaryEntityMap0.growBy;
        int int23 = binaryEntityMap0.size;
        java.lang.String[] strArray24 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        entities0.addEntity("", (int) '4');
        java.lang.String str8 = entities0.unescape("");
        java.lang.String str10 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        binaryEntityMap0.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = new int[] {};
        binaryEntityMap12.values = intArray13;
        int int16 = binaryEntityMap12.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        binaryEntityMap12.names = strArray21;
        binaryEntityMap11.names = strArray21;
        binaryEntityMap0.names = strArray21;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap0.names = strArray29;
        binaryEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 100);
        int int18 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int21 = binaryEntityMap19.value("");
        java.lang.String str23 = binaryEntityMap19.name((int) (short) 0);
        int int24 = binaryEntityMap19.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap26.ensureCapacity((int) 'a');
        int int29 = arrayEntityMap26.growBy;
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap26.names = strArray34;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap36 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str38 = binaryEntityMap36.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap39.growBy = (short) 10;
        java.lang.String[] strArray42 = binaryEntityMap39.names;
        binaryEntityMap39.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap46.growBy = (short) 10;
        java.lang.String[] strArray49 = binaryEntityMap46.names;
        binaryEntityMap39.names = strArray49;
        binaryEntityMap36.names = strArray49;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str54 = binaryEntityMap52.name((int) (byte) 0);
        int int56 = binaryEntityMap52.value("");
        binaryEntityMap52.add("", (int) (short) -1);
        int[] intArray60 = binaryEntityMap52.values;
        binaryEntityMap36.values = intArray60;
        arrayEntityMap26.values = intArray60;
        binaryEntityMap19.values = intArray60;
        binaryEntityMap19.add("", (int) (byte) 0);
        entities0.map = binaryEntityMap19;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap68 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap68.add("", (int) 'a');
        binaryEntityMap68.add("", 10);
        binaryEntityMap68.ensureCapacity(0);
        java.lang.String str78 = binaryEntityMap68.name((int) (byte) 10);
        binaryEntityMap68.add("hi!", 0);
        binaryEntityMap68.ensureCapacity((int) (byte) 100);
        int[] intArray84 = binaryEntityMap68.values;
        binaryEntityMap19.values = intArray84;
        int int87 = binaryEntityMap19.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str34 = entities0.escape("hi!");
        java.lang.String str36 = entities0.entityName((-1));
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        entities0.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities0.map;
        java.lang.String str31 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int34 = binaryEntityMap32.value("");
        binaryEntityMap32.size = '#';
        java.lang.String str38 = binaryEntityMap32.name((int) '#');
        int int39 = binaryEntityMap32.growBy;
        java.lang.String str41 = binaryEntityMap32.name((int) (byte) 0);
        java.lang.String str43 = binaryEntityMap32.name(100);
        entities0.map = binaryEntityMap32;
        org.apache.commons.lang.Entities.EntityMap entityMap45 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(entityMap45);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        entities0.addEntity("hi!", (int) (byte) 100);
        java.io.Writer writer37 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer37, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        int[] intArray14 = binaryEntityMap10.values;
        arrayEntityMap1.values = intArray14;
        java.lang.Class<?> wildcardClass16 = intArray14.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        hashEntityMap0.add("", 0);
        java.util.Map map25 = hashEntityMap0.mapValueToName;
        int int27 = hashEntityMap0.value("hi!");
        java.util.Map map28 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str31 = entities29.unescape("");
        java.lang.String str33 = entities29.entityName(100);
        java.lang.String str35 = entities29.entityName((int) ' ');
        java.lang.String str37 = entities29.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap38 = entities29.map;
        java.lang.String str40 = entities29.escape("");
        java.lang.String str42 = entities29.entityName((int) (byte) -1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities29);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap44.add("", (int) (byte) -1);
        java.util.Map map48 = hashEntityMap44.mapNameToValue;
        java.lang.String str50 = hashEntityMap44.name((int) ' ');
        int int52 = hashEntityMap44.value("");
        entities29.map = hashEntityMap44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap55.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        hashEntityMap55.mapNameToValue = map60;
        hashEntityMap54.mapNameToValue = map60;
        java.util.Map map63 = hashEntityMap54.mapNameToValue;
        int int65 = hashEntityMap54.value("hi!");
        hashEntityMap54.add("", (int) (byte) 0);
        java.lang.String str70 = hashEntityMap54.name((int) (short) 0);
        java.lang.String str72 = hashEntityMap54.name((int) (byte) 0);
        java.util.Map map73 = hashEntityMap54.mapNameToValue;
        hashEntityMap44.mapValueToName = map73;
        java.lang.String str76 = hashEntityMap44.name(32);
        int int78 = hashEntityMap44.value("hi!");
        hashEntityMap44.add("", 10);
        java.util.Map map82 = hashEntityMap44.mapNameToValue;
        hashEntityMap0.mapValueToName = map82;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(entityMap38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        int int19 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 97);
        java.lang.String str24 = hashEntityMap0.name((int) (short) 100);
        int int26 = hashEntityMap0.value("hi!");
        java.lang.String str28 = hashEntityMap0.name((int) (short) 100);
        java.lang.String str30 = hashEntityMap0.name((int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int33 = hashEntityMap31.value("hi!");
        java.util.Map map34 = hashEntityMap31.mapValueToName;
        int int36 = hashEntityMap31.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap38.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        hashEntityMap38.mapNameToValue = map43;
        hashEntityMap37.mapNameToValue = map43;
        java.util.Map map46 = hashEntityMap37.mapNameToValue;
        hashEntityMap31.mapNameToValue = map46;
        java.lang.String str49 = hashEntityMap31.name((int) '#');
        java.lang.String str51 = hashEntityMap31.name(0);
        java.util.Map map52 = hashEntityMap31.mapValueToName;
        hashEntityMap31.add("", 0);
        java.util.Map map56 = hashEntityMap31.mapValueToName;
        int int58 = hashEntityMap31.value("hi!");
        java.util.Map map59 = hashEntityMap31.mapValueToName;
        hashEntityMap0.mapValueToName = map59;
        java.util.Map map61 = hashEntityMap0.mapNameToValue;
        java.util.Map map62 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        binaryEntityMap0.size = 10;
        java.lang.String str15 = binaryEntityMap0.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = '4';
        java.lang.String str20 = binaryEntityMap16.name(100);
        int[] intArray21 = binaryEntityMap16.values;
        binaryEntityMap0.values = intArray21;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities9.map = primitiveEntityMap13;
        java.lang.String str16 = entities9.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer18 = null;
        entities17.escape(writer18, "");
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities9.addEntities(strArray21);
        entities0.addEntities(strArray21);
        java.lang.String str26 = entities0.entityName(0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str29 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap30 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str32 = lookupEntityMap30.name(97);
        lookupEntityMap30.add("hi!", (int) (byte) 10);
        entities0.map = lookupEntityMap30;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
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
        hashEntityMap0.add("hi!", (int) '#');
        int int29 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap30.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        java.util.Map map36 = hashEntityMap34.mapValueToName;
        java.util.Map map37 = hashEntityMap34.mapNameToValue;
        java.util.Map map38 = hashEntityMap34.mapValueToName;
        java.util.Map map39 = hashEntityMap34.mapNameToValue;
        java.util.Map map40 = hashEntityMap34.mapValueToName;
        hashEntityMap30.mapValueToName = map40;
        hashEntityMap0.mapValueToName = map40;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int13 = arrayEntityMap11.value("hi!");
        java.lang.String[] strArray14 = arrayEntityMap11.names;
        java.lang.String[] strArray15 = arrayEntityMap11.names;
        binaryEntityMap0.names = strArray15;
        java.lang.String str18 = binaryEntityMap0.name(1);
        int int19 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        entities0.addEntity("", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        java.lang.String str15 = entities0.entityName((int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        hashEntityMap16.mapNameToValue = map22;
        java.util.Map map25 = hashEntityMap16.mapNameToValue;
        int int27 = hashEntityMap16.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        hashEntityMap16.mapValueToName = map31;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        java.util.Map map35 = hashEntityMap33.mapValueToName;
        java.util.Map map36 = hashEntityMap33.mapNameToValue;
        hashEntityMap16.mapValueToName = map36;
        entities0.map = hashEntityMap16;
        java.io.Writer writer39 = null;
        entities0.escape(writer39, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        hashEntityMap15.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap15.mapNameToValue;
        int int26 = hashEntityMap15.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        hashEntityMap15.mapValueToName = map30;
        hashEntityMap0.mapNameToValue = map30;
        hashEntityMap0.add("", (int) ' ');
        hashEntityMap0.add("hi!", 52);
        java.lang.String str40 = hashEntityMap0.name(1);
        int int42 = hashEntityMap0.value("");
        java.lang.String str44 = hashEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        java.lang.String str11 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("", (int) '4');
        java.lang.String str16 = lookupEntityMap0.name((int) 'a');
        java.lang.String str18 = lookupEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int int12 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity((int) (short) 100);
        java.lang.String str16 = binaryEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.lang.String str11 = hashEntityMap0.name(10);
        hashEntityMap0.add("hi!", (int) '#');
        int int16 = hashEntityMap0.value("hi!");
        java.util.Map map17 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        java.util.Map map22 = hashEntityMap18.mapNameToValue;
        java.util.Map map23 = hashEntityMap18.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap24.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        hashEntityMap24.add("", (int) (byte) 1);
        java.util.Map map37 = hashEntityMap24.mapNameToValue;
        hashEntityMap18.mapNameToValue = map37;
        hashEntityMap18.add("", (int) (byte) 10);
        java.util.Map map42 = hashEntityMap18.mapValueToName;
        hashEntityMap0.mapValueToName = map42;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        entities0.addEntity("hi!", 0);
        java.lang.String str15 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) -1);
        binaryEntityMap0.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap(0);
        int[] intArray21 = arrayEntityMap20.values;
        binaryEntityMap0.values = intArray21;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] {});
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        binaryEntityMap0.growBy = (short) 10;
        int int7 = binaryEntityMap0.size;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 100);
        int int10 = binaryEntityMap0.growBy;
        java.lang.String str12 = binaryEntityMap0.name(32);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
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
        java.lang.String str23 = hashEntityMap0.name((int) ' ');
        java.lang.String str25 = hashEntityMap0.name(10);
        hashEntityMap0.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        java.util.Map map31 = hashEntityMap29.mapValueToName;
        java.util.Map map32 = hashEntityMap29.mapNameToValue;
        hashEntityMap29.add("", (int) (byte) 10);
        int int37 = hashEntityMap29.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap38.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        hashEntityMap38.mapNameToValue = map43;
        hashEntityMap29.mapNameToValue = map43;
        java.lang.String str47 = hashEntityMap29.name((int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        java.util.Map map50 = hashEntityMap48.mapValueToName;
        java.util.Map map51 = hashEntityMap48.mapNameToValue;
        hashEntityMap48.add("", (int) (byte) 10);
        int int56 = hashEntityMap48.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap57.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        hashEntityMap57.mapNameToValue = map62;
        hashEntityMap48.mapNameToValue = map62;
        hashEntityMap48.add("", (int) (short) 0);
        hashEntityMap48.add("hi!", (int) '4');
        java.util.Map map71 = hashEntityMap48.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        java.util.Map map74 = hashEntityMap72.mapValueToName;
        int int76 = hashEntityMap72.value("");
        int int78 = hashEntityMap72.value("hi!");
        java.util.Map map79 = hashEntityMap72.mapValueToName;
        hashEntityMap48.mapValueToName = map79;
        hashEntityMap29.mapNameToValue = map79;
        hashEntityMap0.mapValueToName = map79;
        java.util.Map map83 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.io.Writer writer4 = null;
        entities0.escape(writer4, "");
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", 100);
        java.lang.String str11 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        int int24 = arrayEntityMap17.growBy;
        int int25 = arrayEntityMap17.size;
        int int27 = arrayEntityMap17.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        int int16 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) 1);
        lookupEntityMap0.add("", (int) 'a');
        int int24 = lookupEntityMap0.value("hi!");
        java.lang.String str26 = lookupEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        int int4 = arrayEntityMap0.size;
        int int5 = arrayEntityMap0.size;
        java.lang.String[] strArray6 = arrayEntityMap0.names;
        arrayEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        int int25 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap12.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        hashEntityMap0.add("hi!", 1);
        hashEntityMap0.add("", (int) (short) 0);
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
        java.util.Map map58 = hashEntityMap39.mapNameToValue;
        java.util.Map map59 = hashEntityMap39.mapNameToValue;
        hashEntityMap0.mapNameToValue = map59;
        java.util.Map map61 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap63.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = hashEntityMap67.mapNameToValue;
        hashEntityMap63.mapNameToValue = map68;
        hashEntityMap62.mapNameToValue = map68;
        hashEntityMap0.mapValueToName = map68;
        java.util.Map map72 = hashEntityMap0.mapValueToName;
        java.util.Map map73 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", (int) (short) -1);
        java.lang.String str21 = primitiveEntityMap0.name((int) (short) 10);
        java.lang.String str23 = primitiveEntityMap0.name(0);
        java.lang.String str25 = primitiveEntityMap0.name(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        java.lang.String str20 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int4 = binaryEntityMap2.value("");
        java.lang.String str6 = binaryEntityMap2.name((int) (short) 0);
        int int7 = binaryEntityMap2.size;
        int[] intArray8 = binaryEntityMap2.values;
        java.lang.String str10 = binaryEntityMap2.name(10);
        int int12 = binaryEntityMap2.value("");
        int[] intArray13 = binaryEntityMap2.values;
        binaryEntityMap1.values = intArray13;
        binaryEntityMap1.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        primitiveEntityMap0.add("hi!", 10);
        int int17 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (short) 100);
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("", 3);
        primitiveEntityMap0.add("hi!", 35);
        java.lang.String str31 = primitiveEntityMap0.name(1);
        int int33 = primitiveEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 1);
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int19 = hashEntityMap17.value("hi!");
        java.lang.String str21 = hashEntityMap17.name((int) (short) 0);
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        int int33 = hashEntityMap25.value("");
        java.util.Map map34 = hashEntityMap25.mapNameToValue;
        hashEntityMap23.mapNameToValue = map34;
        java.util.Map map36 = hashEntityMap23.mapValueToName;
        hashEntityMap17.mapNameToValue = map36;
        java.util.Map map38 = hashEntityMap17.mapValueToName;
        java.util.Map map39 = hashEntityMap17.mapValueToName;
        hashEntityMap0.mapValueToName = map39;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        java.lang.String str13 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        entities15.addEntity("hi!", 0);
        java.lang.String[][] strArray19 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities15.addEntities(strArray19);
        entities0.addEntities(strArray19);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        binaryEntityMap0.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = new int[] {};
        binaryEntityMap12.values = intArray13;
        int int16 = binaryEntityMap12.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        binaryEntityMap12.names = strArray21;
        binaryEntityMap11.names = strArray21;
        binaryEntityMap0.names = strArray21;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap0.names = strArray29;
        binaryEntityMap0.size = 0;
        binaryEntityMap0.growBy = 3;
        int[] intArray35 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(intArray35);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
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
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        java.lang.String str4 = primitiveEntityMap0.name(0);
        int int6 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        java.lang.String str17 = binaryEntityMap0.name(1);
        int int19 = binaryEntityMap0.value("hi!");
        int int20 = binaryEntityMap0.growBy;
        java.lang.String str22 = binaryEntityMap0.name(10);
        int int23 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        java.util.Map map10 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapNameToValue = map10;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        java.util.Map map15 = hashEntityMap12.mapNameToValue;
        hashEntityMap12.add("", (int) (byte) 10);
        int int20 = hashEntityMap12.value("");
        java.lang.String str22 = hashEntityMap12.name((int) (byte) 10);
        java.lang.String str24 = hashEntityMap12.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int27 = hashEntityMap25.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap25.mapNameToValue = map29;
        hashEntityMap12.mapNameToValue = map29;
        java.util.Map map32 = hashEntityMap12.mapValueToName;
        hashEntityMap0.mapValueToName = map32;
        hashEntityMap0.add("hi!", 3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray11 = null;
        binaryEntityMap10.names = strArray11;
        entities0.map = binaryEntityMap10;
        java.lang.String str15 = binaryEntityMap10.name((int) (byte) 100);
        int[] intArray16 = null;
        binaryEntityMap10.values = intArray16;
        binaryEntityMap10.growBy = (byte) 10;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        int int3 = arrayEntityMap1.value("");
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int6 = binaryEntityMap5.growBy;
        binaryEntityMap5.add("", (int) (short) 100);
        binaryEntityMap5.size = (byte) 100;
        int int12 = binaryEntityMap5.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        int[] intArray23 = arrayEntityMap17.values;
        binaryEntityMap13.values = intArray23;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap25.growBy = (short) 10;
        java.lang.String[] strArray28 = binaryEntityMap25.names;
        int int30 = binaryEntityMap25.value("");
        binaryEntityMap25.growBy = (short) 1;
        binaryEntityMap25.size = 100;
        binaryEntityMap25.add("", 100);
        java.lang.String[] strArray38 = binaryEntityMap25.names;
        binaryEntityMap13.names = strArray38;
        binaryEntityMap13.add("", 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap44 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap44.ensureCapacity((int) 'a');
        arrayEntityMap44.ensureCapacity(0);
        arrayEntityMap44.add("hi!", 100);
        java.lang.String str53 = arrayEntityMap44.name((int) 'a');
        int int55 = arrayEntityMap44.value("");
        int[] intArray56 = arrayEntityMap44.values;
        int[] intArray57 = arrayEntityMap44.values;
        binaryEntityMap13.values = intArray57;
        binaryEntityMap5.values = intArray57;
        arrayEntityMap1.values = intArray57;
        int int61 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
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
        entities0.addEntity("hi!", (int) (byte) 1);
        java.lang.String str22 = entities0.unescape("");
        java.lang.String str24 = entities0.escape("hi!");
        java.io.Writer writer25 = null;
        entities0.escape(writer25, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        primitiveEntityMap16.add("hi!", (int) (short) -1);
        int int24 = primitiveEntityMap16.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        entities0.addEntity("", (int) '#');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int24 = entities0.entityValue("");
        entities0.addEntity("", (int) '#');
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str30 = entities28.unescape("");
        java.io.Writer writer31 = null;
        entities28.escape(writer31, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities28.map = arrayEntityMap35;
        arrayEntityMap35.size = 0;
        int int39 = arrayEntityMap35.growBy;
        entities0.map = arrayEntityMap35;
        arrayEntityMap35.ensureCapacity(98);
        arrayEntityMap35.size = (byte) 1;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        int int25 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        java.lang.String str29 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        int int27 = entities0.entityValue("hi!");
        java.lang.String str29 = entities0.escape("");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        entities0.addEntity("", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        entities0.addEntity("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap29.growBy = '4';
        binaryEntityMap29.size = (byte) -1;
        java.lang.String str35 = binaryEntityMap29.name((int) (short) 100);
        binaryEntityMap29.size = (byte) 0;
        int int39 = binaryEntityMap29.value("");
        binaryEntityMap29.add("", 0);
        int int44 = binaryEntityMap29.value("");
        binaryEntityMap29.growBy = (short) 100;
        entities0.map = binaryEntityMap29;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str50 = binaryEntityMap48.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap51 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap51.growBy = (short) 10;
        java.lang.String[] strArray54 = binaryEntityMap51.names;
        binaryEntityMap51.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap58.growBy = (short) 10;
        java.lang.String[] strArray61 = binaryEntityMap58.names;
        binaryEntityMap51.names = strArray61;
        binaryEntityMap48.names = strArray61;
        int[] intArray64 = binaryEntityMap48.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap66.ensureCapacity((int) 'a');
        arrayEntityMap66.ensureCapacity(0);
        java.lang.String[] strArray71 = arrayEntityMap66.names;
        binaryEntityMap48.names = strArray71;
        binaryEntityMap48.add("", (int) (short) 0);
        java.lang.String str77 = binaryEntityMap48.name((int) (short) 100);
        binaryEntityMap48.growBy = 97;
        entities0.map = binaryEntityMap48;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNull(str77);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) -1);
        java.util.Map map26 = hashEntityMap22.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        hashEntityMap27.add("", (int) (byte) 10);
        int int35 = hashEntityMap27.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap36.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        hashEntityMap36.mapNameToValue = map41;
        hashEntityMap27.mapNameToValue = map41;
        hashEntityMap22.mapValueToName = map41;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        java.util.Map map47 = hashEntityMap45.mapValueToName;
        java.util.Map map48 = hashEntityMap45.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap49 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map50 = treeEntityMap49.mapNameToValue;
        hashEntityMap45.mapValueToName = map50;
        java.util.Map map52 = hashEntityMap45.mapValueToName;
        hashEntityMap22.mapValueToName = map52;
        hashEntityMap0.mapValueToName = map52;
        java.util.Map map55 = hashEntityMap0.mapNameToValue;
        int int57 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        hashEntityMap0.add("", 0);
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 100);
        hashEntityMap0.add("", (int) (byte) 0);
        int int24 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 100);
        java.lang.String str29 = hashEntityMap0.name((int) (byte) -1);
        hashEntityMap0.add("hi!", 98);
        int int34 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        hashEntityMap0.add("", 0);
        int int26 = hashEntityMap0.value("hi!");
        java.util.Map map27 = hashEntityMap0.mapValueToName;
        java.lang.String str29 = hashEntityMap0.name((int) (short) 1);
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(35);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        int int11 = binaryEntityMap6.value("");
        binaryEntityMap6.growBy = (short) 1;
        int int15 = binaryEntityMap6.value("");
        int[] intArray16 = binaryEntityMap6.values;
        binaryEntityMap6.growBy = (byte) 100;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = '4';
        java.lang.String str23 = binaryEntityMap19.name(100);
        int int24 = binaryEntityMap19.growBy;
        java.lang.String str26 = binaryEntityMap19.name((int) ' ');
        int[] intArray27 = binaryEntityMap19.values;
        binaryEntityMap6.values = intArray27;
        binaryEntityMap0.values = intArray27;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap30.growBy = '4';
        java.lang.String str34 = binaryEntityMap30.name(100);
        int int35 = binaryEntityMap30.growBy;
        java.lang.String[] strArray36 = binaryEntityMap30.names;
        java.lang.String[] strArray37 = binaryEntityMap30.names;
        binaryEntityMap0.names = strArray37;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        hashEntityMap0.add("", (int) (short) 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map1 = treeEntityMap0.mapNameToValue;
        treeEntityMap0.add("", (int) (short) 100);
        java.util.Map map5 = treeEntityMap0.mapValueToName;
        java.util.Map map6 = treeEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        java.util.Map map19 = hashEntityMap17.mapValueToName;
        int int21 = hashEntityMap17.value("");
        hashEntityMap17.add("", 1);
        java.util.Map map25 = hashEntityMap17.mapValueToName;
        java.util.Map map26 = hashEntityMap17.mapValueToName;
        entities0.map = hashEntityMap17;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int30 = arrayEntityMap28.value("");
        arrayEntityMap28.ensureCapacity((int) (byte) 100);
        int[] intArray33 = arrayEntityMap28.values;
        int int35 = arrayEntityMap28.value("");
        entities0.map = arrayEntityMap28;
        entities0.addEntity("hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "18) test3887(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertNull(str4);
// flaky "6) test3887(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String[] strArray15 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        binaryEntityMap1.add("hi!", (int) (byte) 1);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) 'a');
        binaryEntityMap1.ensureCapacity((int) (byte) 1);
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = 0;
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        java.util.Map map23 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap24.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        java.util.Map map34 = hashEntityMap24.mapNameToValue;
        int int36 = hashEntityMap24.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        java.util.Map map40 = hashEntityMap37.mapNameToValue;
        hashEntityMap37.add("", (int) (byte) 10);
        int int45 = hashEntityMap37.value("");
        java.lang.String str47 = hashEntityMap37.name((int) (byte) 10);
        java.lang.String str49 = hashEntityMap37.name((int) (short) 0);
        java.lang.String str51 = hashEntityMap37.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap53.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        hashEntityMap53.mapNameToValue = map58;
        hashEntityMap52.mapNameToValue = map58;
        java.util.Map map61 = hashEntityMap52.mapNameToValue;
        int int63 = hashEntityMap52.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        java.util.Map map66 = hashEntityMap64.mapValueToName;
        java.util.Map map67 = hashEntityMap64.mapNameToValue;
        hashEntityMap52.mapValueToName = map67;
        hashEntityMap37.mapNameToValue = map67;
        hashEntityMap37.add("", (int) ' ');
        hashEntityMap37.add("hi!", 52);
        java.lang.String str77 = hashEntityMap37.name(101);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap78.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap82 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map83 = hashEntityMap82.mapNameToValue;
        hashEntityMap78.mapNameToValue = map83;
        java.util.Map map85 = hashEntityMap78.mapValueToName;
        hashEntityMap37.mapNameToValue = map85;
        hashEntityMap24.mapValueToName = map85;
        hashEntityMap0.mapNameToValue = map85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (short) 10);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        org.apache.commons.lang.Entities.EntityMap entityMap38 = entities0.map;
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str41 = entities39.unescape("");
        int int43 = entities39.entityValue("");
        java.lang.String str45 = entities39.escape("");
        java.lang.String str47 = entities39.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities39);
        java.lang.String str50 = entities39.escape("hi!");
        org.apache.commons.lang.Entities entities51 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer52 = null;
        entities51.escape(writer52, "");
        java.lang.String[][] strArray55 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities51.addEntities(strArray55);
        entities39.addEntities(strArray55);
        entities0.addEntities(strArray55);
        java.lang.String str60 = entities0.entityName((int) (short) 100);
        java.lang.Class<?> wildcardClass61 = entities0.getClass();
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
        org.junit.Assert.assertNotNull(entityMap38);
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(entities51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("", 2);
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 10);
        binaryEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap19.size = ' ';
        arrayEntityMap19.growBy = (byte) 1;
        java.lang.String[] strArray24 = arrayEntityMap19.names;
        binaryEntityMap0.names = strArray24;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        java.util.Map map18 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        java.util.Map map21 = hashEntityMap19.mapValueToName;
        hashEntityMap0.mapNameToValue = map21;
        java.util.Map map23 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap9.add("", (int) (short) 1);
        arrayEntityMap9.ensureCapacity((int) ' ');
        entities0.map = arrayEntityMap9;
        java.lang.String str17 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str20 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        binaryEntityMap0.growBy = ' ';
        int int13 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        int[] intArray18 = binaryEntityMap14.values;
        int[] intArray19 = binaryEntityMap14.values;
        java.lang.String[] strArray24 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap14.names = strArray24;
        binaryEntityMap0.names = strArray24;
        int int28 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        java.util.Map map19 = hashEntityMap17.mapValueToName;
        int int21 = hashEntityMap17.value("");
        hashEntityMap17.add("", 1);
        java.util.Map map25 = hashEntityMap17.mapValueToName;
        java.util.Map map26 = hashEntityMap17.mapValueToName;
        entities0.map = hashEntityMap17;
        hashEntityMap17.add("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 100);
        int int14 = binaryEntityMap0.value("hi!");
        int[] intArray15 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.unescape("hi!");
        java.lang.String str12 = entities0.entityName(32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        int int21 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) -1);
        hashEntityMap0.add("", (-1));
        java.util.Map map13 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        hashEntityMap14.add("", (int) (byte) 1);
        hashEntityMap14.add("", 0);
        java.util.Map map30 = hashEntityMap14.mapValueToName;
        hashEntityMap14.add("", 100);
        hashEntityMap14.add("", (int) (byte) 0);
        int int38 = hashEntityMap14.value("hi!");
        hashEntityMap14.add("hi!", (int) 'a');
        java.util.Map map42 = hashEntityMap14.mapValueToName;
        hashEntityMap0.mapValueToName = map42;
        hashEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int7 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.size;
        int int10 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int13 = arrayEntityMap11.value("");
        arrayEntityMap11.ensureCapacity((int) (byte) 100);
        java.lang.String[] strArray16 = arrayEntityMap11.names;
        arrayEntityMap1.names = strArray16;
        arrayEntityMap1.add("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer16 = null;
        entities15.escape(writer16, "");
        int int20 = entities15.entityValue("");
        java.lang.String str22 = entities15.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = (short) 10;
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        arrayEntityMap23.names = strArray27;
        int[] intArray29 = arrayEntityMap23.values;
        entities15.map = arrayEntityMap23;
        arrayEntityMap23.growBy = (short) 10;
        java.lang.String str34 = arrayEntityMap23.name(10);
        int[] intArray35 = arrayEntityMap23.values;
        arrayEntityMap0.values = intArray35;
        int int37 = arrayEntityMap0.growBy;
        int int38 = arrayEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(entities15);
// flaky "19) test3904(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
// flaky "7) test3904(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 1);
        hashEntityMap0.add("", 0);
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        int int25 = hashEntityMap17.value("");
        java.util.Map map26 = hashEntityMap17.mapNameToValue;
        hashEntityMap0.mapNameToValue = map26;
        java.util.Map map28 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        java.util.Map map31 = hashEntityMap29.mapValueToName;
        java.util.Map map32 = hashEntityMap29.mapNameToValue;
        java.util.Map map33 = hashEntityMap29.mapValueToName;
        java.util.Map map34 = hashEntityMap29.mapValueToName;
        int int36 = hashEntityMap29.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap38.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        hashEntityMap38.mapNameToValue = map43;
        hashEntityMap37.mapNameToValue = map43;
        java.util.Map map46 = hashEntityMap37.mapNameToValue;
        int int48 = hashEntityMap37.value("hi!");
        hashEntityMap37.add("", (int) (byte) 0);
        java.lang.String str53 = hashEntityMap37.name((int) (short) 0);
        java.lang.String str55 = hashEntityMap37.name((int) (byte) 0);
        java.util.Map map56 = hashEntityMap37.mapNameToValue;
        java.util.Map map57 = hashEntityMap37.mapNameToValue;
        hashEntityMap29.mapNameToValue = map57;
        hashEntityMap0.mapValueToName = map57;
        java.util.Map map60 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", 10);
        primitiveEntityMap0.add("", (-1));
        primitiveEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str18 = primitiveEntityMap0.name(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        binaryEntityMap0.add("hi!", (int) (short) 100);
        binaryEntityMap0.growBy = ' ';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        int int7 = primitiveEntityMap4.value("");
        int int9 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("", 0);
        primitiveEntityMap4.add("hi!", 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int[] intArray8 = binaryEntityMap0.values;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int14 = arrayEntityMap12.value("");
        arrayEntityMap12.ensureCapacity((int) (byte) 100);
        int[] intArray17 = arrayEntityMap12.values;
        int int19 = arrayEntityMap12.value("");
        java.lang.String[] strArray20 = arrayEntityMap12.names;
        binaryEntityMap0.names = strArray20;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        int int14 = hashEntityMap10.value("");
        hashEntityMap10.add("", 1);
        java.util.Map map18 = hashEntityMap10.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        java.util.Map map23 = hashEntityMap19.mapNameToValue;
        java.util.Map map24 = hashEntityMap19.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap26.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        hashEntityMap26.mapNameToValue = map31;
        hashEntityMap25.mapNameToValue = map31;
        java.util.Map map34 = hashEntityMap25.mapNameToValue;
        hashEntityMap25.add("", (int) (byte) 1);
        java.util.Map map38 = hashEntityMap25.mapNameToValue;
        hashEntityMap19.mapNameToValue = map38;
        hashEntityMap10.mapNameToValue = map38;
        hashEntityMap0.mapValueToName = map38;
        java.util.Map map42 = hashEntityMap0.mapValueToName;
        java.util.Map map43 = null;
        hashEntityMap0.mapValueToName = map43;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        int int19 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 97);
        int int24 = hashEntityMap0.value("hi!");
        int int26 = hashEntityMap0.value("hi!");
        java.util.Map map27 = hashEntityMap0.mapNameToValue;
        int int29 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int32 = hashEntityMap30.value("hi!");
        java.lang.String str34 = hashEntityMap30.name((int) (short) 0);
        java.util.Map map35 = hashEntityMap30.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap37.mapNameToValue = map42;
        hashEntityMap36.mapNameToValue = map42;
        java.util.Map map45 = hashEntityMap36.mapNameToValue;
        int int47 = hashEntityMap36.value("hi!");
        hashEntityMap36.add("", (int) (byte) 0);
        java.lang.String str52 = hashEntityMap36.name((int) (short) 0);
        java.lang.String str54 = hashEntityMap36.name((int) (byte) 0);
        java.util.Map map55 = hashEntityMap36.mapNameToValue;
        hashEntityMap30.mapValueToName = map55;
        hashEntityMap30.add("hi!", (-1));
        java.util.Map map60 = hashEntityMap30.mapValueToName;
        hashEntityMap0.mapValueToName = map60;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        java.util.Map map15 = hashEntityMap12.mapNameToValue;
        hashEntityMap0.mapValueToName = map15;
        int int18 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("hi!", 10);
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        int int20 = binaryEntityMap0.value("");
        int int22 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
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
        entities16.addEntity("hi!", 0);
        java.lang.String[][] strArray20 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities16.addEntities(strArray20);
        entities0.addEntities(strArray20);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map7 = hashEntityMap6.mapNameToValue;
        java.util.Map map8 = hashEntityMap6.mapValueToName;
        java.util.Map map9 = hashEntityMap6.mapNameToValue;
        hashEntityMap6.add("", (int) (byte) 10);
        int int14 = hashEntityMap6.value("");
        java.lang.String str16 = hashEntityMap6.name((int) (byte) 10);
        hashEntityMap6.add("", (int) (byte) 10);
        java.util.Map map20 = hashEntityMap6.mapNameToValue;
        java.util.Map map21 = hashEntityMap6.mapNameToValue;
        entities0.map = hashEntityMap6;
        java.util.Map map23 = hashEntityMap6.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        int int6 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
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
        int int18 = entities0.entityValue("hi!");
        java.lang.Class<?> wildcardClass19 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.entityName(101);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 10;
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        java.lang.String str23 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        java.lang.String[] strArray17 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = (short) 10;
        java.lang.String[] strArray22 = binaryEntityMap19.names;
        arrayEntityMap18.names = strArray22;
        int[] intArray24 = arrayEntityMap18.values;
        binaryEntityMap0.values = intArray24;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        int int31 = binaryEntityMap26.value("");
        binaryEntityMap26.growBy = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str36 = binaryEntityMap34.name((int) (byte) 0);
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        binaryEntityMap26.names = strArray37;
        java.lang.String str40 = binaryEntityMap26.name(100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap41 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap42.growBy = (short) 10;
        java.lang.String[] strArray45 = binaryEntityMap42.names;
        arrayEntityMap41.names = strArray45;
        int[] intArray47 = arrayEntityMap41.values;
        binaryEntityMap26.values = intArray47;
        binaryEntityMap0.values = intArray47;
        int int50 = binaryEntityMap0.size;
        binaryEntityMap0.size = 101;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 101 + "'", int50 == 101);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.unescape("hi!");
        java.lang.String str16 = entities0.entityName((int) (byte) 10);
        java.lang.String str18 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int3 = binaryEntityMap1.value("");
        binaryEntityMap1.growBy = 1;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer7 = null;
        entities6.escape(writer7, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities6);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int13 = arrayEntityMap11.value("hi!");
        entities6.map = arrayEntityMap11;
        java.lang.String str16 = entities6.entityName((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray19 = null;
        binaryEntityMap18.names = strArray19;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        entities6.map = binaryEntityMap18;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap23.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap30.growBy = (short) 10;
        java.lang.String[] strArray33 = binaryEntityMap30.names;
        binaryEntityMap23.names = strArray33;
        binaryEntityMap23.ensureCapacity((int) (short) 0);
        java.lang.String str38 = binaryEntityMap23.name((int) 'a');
        binaryEntityMap23.size = 1;
        binaryEntityMap23.growBy = (byte) 10;
        java.lang.String[] strArray43 = binaryEntityMap23.names;
        binaryEntityMap18.names = strArray43;
        binaryEntityMap1.names = strArray43;
        java.lang.Class<?> wildcardClass46 = binaryEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        binaryEntityMap0.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = new int[] {};
        binaryEntityMap12.values = intArray13;
        int int16 = binaryEntityMap12.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        binaryEntityMap12.names = strArray21;
        binaryEntityMap11.names = strArray21;
        binaryEntityMap0.names = strArray21;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap0.names = strArray29;
        java.lang.String str32 = binaryEntityMap0.name(1);
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        binaryEntityMap0.size = 1;
        binaryEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str22 = binaryEntityMap0.name(2);
        int int23 = binaryEntityMap0.growBy;
        java.lang.Class<?> wildcardClass24 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        java.lang.String str9 = hashEntityMap0.name((int) (short) 10);
        int int11 = hashEntityMap0.value("hi!");
        java.lang.String str13 = hashEntityMap0.name(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str14 = entities12.unescape("");
        java.lang.String str16 = entities12.entityName(100);
        java.lang.String str18 = entities12.entityName((int) ' ');
        java.lang.String str20 = entities12.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities12.map;
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities12.map;
        entities12.addEntity("", (int) (byte) 100);
        java.lang.String str27 = entities12.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        int int31 = hashEntityMap28.value("");
        hashEntityMap28.add("", (int) '4');
        entities12.map = hashEntityMap28;
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str38 = entities36.unescape("");
        java.lang.String str40 = entities36.entityName(100);
        java.lang.String str42 = entities36.entityName((int) ' ');
        java.lang.String str44 = entities36.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap45 = entities36.map;
        org.apache.commons.lang.Entities.EntityMap entityMap46 = entities36.map;
        java.lang.String str48 = entities36.unescape("hi!");
        org.apache.commons.lang.Entities entities49 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer50 = null;
        entities49.escape(writer50, "");
        java.lang.String[][] strArray53 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities49.addEntities(strArray53);
        entities49.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities58 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer59 = null;
        entities58.escape(writer59, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap62 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities58.map = primitiveEntityMap62;
        java.lang.String str65 = entities58.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer67 = null;
        entities66.escape(writer67, "");
        java.lang.String[][] strArray70 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities66.addEntities(strArray70);
        entities58.addEntities(strArray70);
        entities49.addEntities(strArray70);
        entities36.addEntities(strArray70);
        entities12.addEntities(strArray70);
        entities0.addEntities(strArray70);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertNotNull(entityMap22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(entityMap45);
        org.junit.Assert.assertNotNull(entityMap46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(entities49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(entities58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        java.lang.String str7 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.escape("");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        entities11.addEntity("hi!", 0);
        java.lang.String[][] strArray15 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities11.addEntities(strArray15);
        java.lang.String str18 = entities11.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities19.map;
        java.lang.String str22 = entities19.escape("hi!");
        java.lang.String str24 = entities19.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap26.ensureCapacity((int) 'a');
        arrayEntityMap26.ensureCapacity(0);
        arrayEntityMap26.add("hi!", 100);
        java.lang.String str35 = arrayEntityMap26.name((int) 'a');
        int int37 = arrayEntityMap26.value("");
        int[] intArray38 = arrayEntityMap26.values;
        int int39 = arrayEntityMap26.size;
        entities19.map = arrayEntityMap26;
        java.io.Writer writer41 = null;
        entities19.escape(writer41, "");
        org.apache.commons.lang.Entities.EntityMap entityMap44 = entities19.map;
        entities19.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap49.ensureCapacity((int) 'a');
        arrayEntityMap49.growBy = (byte) 100;
        arrayEntityMap49.ensureCapacity(10);
        java.lang.String str57 = arrayEntityMap49.name((int) (byte) 1);
        arrayEntityMap49.size = 0;
        int int61 = arrayEntityMap49.value("hi!");
        entities19.map = arrayEntityMap49;
        org.apache.commons.lang.Entities entities63 = org.apache.commons.lang.Entities.HTML32;
        entities63.addEntity("hi!", 0);
        java.lang.String[][] strArray67 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities63.addEntities(strArray67);
        entities19.addEntities(strArray67);
        entities11.addEntities(strArray67);
        entities0.addEntities(strArray67);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(entityMap44);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(entities63);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.size = (short) 1;
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        int int14 = entities9.entityValue("");
        java.lang.String str16 = entities9.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        int[] intArray23 = arrayEntityMap17.values;
        entities9.map = arrayEntityMap17;
        arrayEntityMap17.growBy = (short) 10;
        java.lang.String str28 = arrayEntityMap17.name(10);
        int[] intArray29 = arrayEntityMap17.values;
        binaryEntityMap0.values = intArray29;
        binaryEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        binaryEntityMap13.add("", (int) (byte) 0);
        binaryEntityMap13.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        arrayEntityMap21.names = strArray25;
        int[] intArray27 = arrayEntityMap21.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap29.ensureCapacity((int) 'a');
        arrayEntityMap29.ensureCapacity(0);
        java.lang.String[] strArray34 = arrayEntityMap29.names;
        arrayEntityMap21.names = strArray34;
        binaryEntityMap13.names = strArray34;
        binaryEntityMap0.names = strArray34;
        int int39 = binaryEntityMap0.value("hi!");
        java.lang.String str41 = binaryEntityMap0.name((int) (short) 10);
        binaryEntityMap0.ensureCapacity(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str8 = binaryEntityMap1.name(0);
        int[] intArray9 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", 2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 2, 100, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        binaryEntityMap7.add("", (int) (byte) 0);
        int int13 = binaryEntityMap7.size;
        int[] intArray14 = binaryEntityMap7.values;
        entities0.map = binaryEntityMap7;
        java.lang.String str17 = binaryEntityMap7.name((int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
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
        java.util.Map map41 = hashEntityMap0.mapValueToName;
        int int43 = hashEntityMap0.value("");
        int int45 = hashEntityMap0.value("");
        java.lang.String str47 = hashEntityMap0.name(98);
        java.util.Map map48 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
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
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str31 = binaryEntityMap0.name(98);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, (-1) });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("hi!", (int) (short) 1);
        primitiveEntityMap0.add("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        int int12 = hashEntityMap0.value("");
        int int14 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
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
        java.lang.String str27 = binaryEntityMap11.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        int[] intArray31 = binaryEntityMap28.values;
        binaryEntityMap11.values = intArray31;
        arrayEntityMap4.values = intArray31;
        arrayEntityMap4.add("hi!", (int) (byte) 1);
        int int37 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
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
        int int49 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        java.util.Map map52 = hashEntityMap50.mapValueToName;
        int int54 = hashEntityMap50.value("");
        java.util.Map map55 = hashEntityMap50.mapValueToName;
        hashEntityMap0.mapNameToValue = map55;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap57.add("", (int) (byte) -1);
        java.util.Map map61 = hashEntityMap57.mapNameToValue;
        hashEntityMap57.add("", 10);
        hashEntityMap57.add("hi!", (int) (short) -1);
        java.util.Map map68 = hashEntityMap57.mapNameToValue;
        hashEntityMap0.mapValueToName = map68;
        java.lang.String str71 = hashEntityMap0.name(35);
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        java.lang.String str11 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int14 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        arrayEntityMap1.size = (byte) 1;
        arrayEntityMap1.size = 0;
        java.lang.Class<?> wildcardClass25 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        entities0.addEntity("", (int) (byte) 100);
        java.lang.String str15 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        int int19 = hashEntityMap16.value("");
        hashEntityMap16.add("", (int) '4');
        entities0.map = hashEntityMap16;
        java.lang.String str25 = entities0.entityName(32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        java.lang.String str11 = lookupEntityMap0.name(2);
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", (int) 'a');
        java.lang.String str20 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (-1);
        int int10 = binaryEntityMap0.value("hi!");
        int int11 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int12 = hashEntityMap10.value("hi!");
        java.util.Map map13 = hashEntityMap10.mapValueToName;
        int int15 = hashEntityMap10.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        hashEntityMap16.mapNameToValue = map22;
        java.util.Map map25 = hashEntityMap16.mapNameToValue;
        hashEntityMap10.mapNameToValue = map25;
        java.lang.String str28 = hashEntityMap10.name((int) '#');
        java.lang.String str30 = hashEntityMap10.name(0);
        java.util.Map map31 = hashEntityMap10.mapValueToName;
        java.util.Map map32 = hashEntityMap10.mapNameToValue;
        hashEntityMap0.mapValueToName = map32;
        java.lang.String str35 = hashEntityMap0.name((int) (short) 1);
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
        java.lang.String str54 = hashEntityMap36.name((int) '#');
        java.lang.String str56 = hashEntityMap36.name(0);
        java.util.Map map57 = hashEntityMap36.mapValueToName;
        hashEntityMap36.add("", 0);
        java.util.Map map61 = hashEntityMap36.mapValueToName;
        hashEntityMap0.mapValueToName = map61;
        hashEntityMap0.add("hi!", 32);
        java.lang.String str67 = hashEntityMap0.name(101);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(str67);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        hashEntityMap15.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap15.mapNameToValue;
        int int26 = hashEntityMap15.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        hashEntityMap15.mapValueToName = map30;
        hashEntityMap0.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap0.mapNameToValue;
        java.lang.String str35 = hashEntityMap0.name(10);
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        int int41 = hashEntityMap37.value("");
        hashEntityMap37.add("", 1);
        java.util.Map map45 = hashEntityMap37.mapNameToValue;
        hashEntityMap0.mapNameToValue = map45;
        int int48 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str11 = entities9.unescape("");
        java.lang.String str13 = entities9.entityName((int) (short) 0);
        java.lang.String str15 = entities9.entityName(1);
        java.lang.String str17 = entities9.escape("");
        int int19 = entities9.entityValue("hi!");
        java.lang.String str21 = entities9.unescape("hi!");
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer23 = null;
        entities22.escape(writer23, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap26 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities22.map = primitiveEntityMap26;
        java.lang.String str29 = entities22.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer31 = null;
        entities30.escape(writer31, "");
        java.lang.String[][] strArray34 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities30.addEntities(strArray34);
        entities22.addEntities(strArray34);
        java.lang.String str38 = entities22.escape("");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        entities39.addEntity("hi!", 0);
        java.lang.String[][] strArray43 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities39.addEntities(strArray43);
        entities22.addEntities(strArray43);
        entities9.addEntities(strArray43);
        entities0.addEntities(strArray43);
        java.lang.String str49 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        java.lang.String str31 = binaryEntityMap0.name((int) (short) 10);
        java.lang.Class<?> wildcardClass32 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, (-1) });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (short) 0);
        int int11 = arrayEntityMap4.value("hi!");
        int int13 = arrayEntityMap4.value("hi!");
        arrayEntityMap4.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
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
        java.lang.String str47 = lookupEntityMap34.name((int) (byte) 100);
        int int49 = lookupEntityMap34.value("");
        java.lang.String str51 = lookupEntityMap34.name((int) (short) 100);
        java.lang.String str53 = lookupEntityMap34.name(3);
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (-1));
        int int18 = lookupEntityMap0.value("hi!");
        java.lang.String str20 = lookupEntityMap0.name(3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.growBy = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        int int25 = hashEntityMap14.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap12.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        hashEntityMap0.add("hi!", 1);
        hashEntityMap0.add("", (int) (short) 0);
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
        java.util.Map map58 = hashEntityMap39.mapNameToValue;
        java.util.Map map59 = hashEntityMap39.mapNameToValue;
        hashEntityMap0.mapNameToValue = map59;
        java.util.Map map61 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.lang.String str64 = hashEntityMap62.name((int) (byte) -1);
        java.util.Map map65 = hashEntityMap62.mapValueToName;
        hashEntityMap0.mapNameToValue = map65;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        binaryEntityMap0.ensureCapacity(52);
        binaryEntityMap0.add("", 98);
        java.lang.String[] strArray21 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        java.lang.String str23 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities0.map;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", 101);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(entityMap24);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int25 = binaryEntityMap23.value("hi!");
        int[] intArray26 = binaryEntityMap23.values;
        int[] intArray27 = binaryEntityMap23.values;
        binaryEntityMap5.values = intArray27;
        java.lang.String str30 = binaryEntityMap5.name(98);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
// flaky "20) test3961(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertArrayEquals(intArray26, new int[] { 402, 913, 914, 915, 916, 917, 918, 919, 920, 921 });
        org.junit.Assert.assertNotNull(intArray27);
// flaky "8) test3961(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertArrayEquals(intArray27, new int[] { 402, 913, 914, 915, 916, 917, 918, 919, 920, 921 });
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
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
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        java.lang.String str17 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.size = (short) 0;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        lookupEntityMap0.add("hi!", 32);
        java.lang.String str16 = lookupEntityMap0.name(101);
        int int18 = lookupEntityMap0.value("");
        java.lang.String str20 = lookupEntityMap0.name(101);
        java.lang.String str22 = lookupEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        int int23 = binaryEntityMap0.value("hi!");
        int[] intArray24 = binaryEntityMap0.values;
        java.lang.String str26 = binaryEntityMap0.name((int) (short) 100);
        java.lang.String str28 = binaryEntityMap0.name((int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 100);
        int int11 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        int int12 = binaryEntityMap7.value("");
        binaryEntityMap7.growBy = (short) 1;
        binaryEntityMap7.size = 100;
        binaryEntityMap7.add("", 100);
        java.lang.String[] strArray20 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray20;
        binaryEntityMap0.size = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str28 = binaryEntityMap26.name((int) (byte) 0);
        java.lang.String str30 = binaryEntityMap26.name((int) '#');
        binaryEntityMap26.growBy = (byte) 10;
        binaryEntityMap26.growBy = 1;
        java.lang.String[] strArray35 = binaryEntityMap26.names;
        binaryEntityMap25.names = strArray35;
        binaryEntityMap0.names = strArray35;
        int int38 = binaryEntityMap0.size;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = binaryEntityMap0.name(98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        int int28 = hashEntityMap24.value("");
        int int30 = hashEntityMap24.value("hi!");
        java.util.Map map31 = hashEntityMap24.mapValueToName;
        hashEntityMap0.mapValueToName = map31;
        hashEntityMap0.add("", (int) (byte) 10);
        java.lang.String str37 = hashEntityMap0.name(0);
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str40 = entities38.unescape("");
// flaky "21) test3967(org.apache.commons.lang.RegressionTest7)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities38);
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities38.map;
        java.lang.String str44 = entities38.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap47.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapNameToValue;
        hashEntityMap47.mapNameToValue = map52;
        int int55 = hashEntityMap47.value("");
        java.util.Map map56 = hashEntityMap47.mapNameToValue;
        hashEntityMap45.mapNameToValue = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapNameToValue;
        java.util.Map map60 = hashEntityMap58.mapValueToName;
        java.util.Map map61 = hashEntityMap58.mapNameToValue;
        java.util.Map map62 = hashEntityMap58.mapValueToName;
        hashEntityMap45.mapValueToName = map62;
        entities38.map = hashEntityMap45;
        java.util.Map map65 = hashEntityMap45.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        java.util.Map map68 = hashEntityMap66.mapValueToName;
        java.util.Map map69 = hashEntityMap66.mapNameToValue;
        java.lang.String str71 = hashEntityMap66.name((int) 'a');
        java.util.Map map72 = hashEntityMap66.mapValueToName;
        hashEntityMap45.mapValueToName = map72;
        java.util.Map map74 = hashEntityMap45.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap76.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map81 = hashEntityMap80.mapNameToValue;
        hashEntityMap76.mapNameToValue = map81;
        hashEntityMap75.mapNameToValue = map81;
        hashEntityMap45.mapValueToName = map81;
        hashEntityMap0.mapNameToValue = map81;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities0.map;
        java.lang.String str26 = entities0.unescape("");
        java.lang.String str28 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(entityMap24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(entityMap29);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        binaryEntityMap0.ensureCapacity(52);
        binaryEntityMap0.add("", 98);
        int int21 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        binaryEntityMap7.add("", (int) (byte) 0);
        int int13 = binaryEntityMap7.size;
        int[] intArray14 = binaryEntityMap7.values;
        entities0.map = binaryEntityMap7;
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        int int12 = hashEntityMap0.value("hi!");
        int int14 = hashEntityMap0.value("");
        hashEntityMap0.add("", 100);
        java.lang.String str19 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", 1);
        hashEntityMap0.add("", (int) (short) 1);
        java.lang.String str27 = hashEntityMap0.name((-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        int int26 = arrayEntityMap1.size;
        java.lang.String[] strArray27 = arrayEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("hi!");
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str5 = primitiveEntityMap0.name((int) ' ');
        java.lang.String str7 = primitiveEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("");
        int int8 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities9.map = primitiveEntityMap13;
        java.lang.String str16 = entities9.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer18 = null;
        entities17.escape(writer18, "");
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities9.addEntities(strArray21);
        java.lang.String str25 = entities9.escape("");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        entities26.addEntity("hi!", 0);
        java.lang.String[][] strArray30 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities26.addEntities(strArray30);
        entities9.addEntities(strArray30);
        int int34 = entities9.entityValue("");
        java.lang.String str36 = entities9.entityName(1);
        org.apache.commons.lang.Entities entities37 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str39 = entities37.unescape("");
        java.lang.String str41 = entities37.entityName(100);
        java.lang.String str43 = entities37.entityName((int) ' ');
        java.lang.String str45 = entities37.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap46 = entities37.map;
        java.lang.String[][] strArray47 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities37.addEntities(strArray47);
        java.lang.String[][] strArray49 = new java.lang.String[][] {};
        entities37.addEntities(strArray49);
        entities9.addEntities(strArray49);
        entities0.addEntities(strArray49);
        entities0.addEntity("hi!", 52);
        java.io.Writer writer56 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer56, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "22) test3975(org.apache.commons.lang.RegressionTest7)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(entities37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(entityMap46);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[][] {});
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.growBy = 0;
        int int6 = binaryEntityMap1.size;
        int int7 = binaryEntityMap1.size;
        int int9 = binaryEntityMap1.value("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("", 32);
        java.lang.String str9 = lookupEntityMap0.name(0);
        java.lang.String str11 = lookupEntityMap0.name((int) 'a');
        java.lang.Class<?> wildcardClass12 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        java.util.Map map13 = hashEntityMap10.mapNameToValue;
        java.util.Map map14 = hashEntityMap10.mapValueToName;
        java.util.Map map15 = hashEntityMap10.mapNameToValue;
        java.util.Map map16 = hashEntityMap10.mapValueToName;
        java.util.Map map17 = hashEntityMap10.mapValueToName;
        hashEntityMap0.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 35);
        java.lang.String str24 = hashEntityMap0.name(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        int int11 = hashEntityMap8.value("");
        hashEntityMap8.add("hi!", (int) '4');
        entities0.map = hashEntityMap8;
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        hashEntityMap17.add("", 32);
        java.util.Map map22 = hashEntityMap17.mapNameToValue;
        entities0.map = hashEntityMap17;
        hashEntityMap17.add("", (int) (short) -1);
        java.lang.String str28 = hashEntityMap17.name(98);
        int int30 = hashEntityMap17.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.add("", (int) (short) 1);
        int int20 = binaryEntityMap0.growBy;
        java.lang.String str22 = binaryEntityMap0.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap23.add("", (int) (short) 100);
        binaryEntityMap23.add("", (-1));
        int int34 = binaryEntityMap23.value("hi!");
        int[] intArray35 = binaryEntityMap23.values;
        binaryEntityMap23.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray40 = new int[] {};
        binaryEntityMap39.values = intArray40;
        int int43 = binaryEntityMap39.value("");
        java.lang.String str45 = binaryEntityMap39.name((int) (byte) 1);
        java.lang.String str47 = binaryEntityMap39.name(0);
        java.lang.String[] strArray48 = binaryEntityMap39.names;
        binaryEntityMap23.names = strArray48;
        binaryEntityMap0.names = strArray48;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] {});
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name(2);
        java.util.Map map5 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        hashEntityMap6.mapNameToValue = map12;
        java.util.Map map15 = hashEntityMap6.mapNameToValue;
        hashEntityMap6.add("", (int) (byte) 1);
        hashEntityMap6.add("", 0);
        java.util.Map map22 = hashEntityMap6.mapValueToName;
        int int24 = hashEntityMap6.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        int int35 = hashEntityMap27.value("");
        java.util.Map map36 = hashEntityMap27.mapNameToValue;
        hashEntityMap25.mapNameToValue = map36;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.util.Map map40 = hashEntityMap38.mapValueToName;
        java.util.Map map41 = hashEntityMap38.mapNameToValue;
        java.util.Map map42 = hashEntityMap38.mapValueToName;
        hashEntityMap25.mapValueToName = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        java.util.Map map46 = hashEntityMap44.mapValueToName;
        java.util.Map map47 = hashEntityMap44.mapNameToValue;
        hashEntityMap44.add("", (int) (byte) 10);
        int int52 = hashEntityMap44.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap53.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        hashEntityMap53.mapNameToValue = map58;
        hashEntityMap44.mapNameToValue = map58;
        hashEntityMap25.mapNameToValue = map58;
        java.util.Map map62 = hashEntityMap25.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = hashEntityMap63.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap66.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = hashEntityMap70.mapNameToValue;
        hashEntityMap66.mapNameToValue = map71;
        hashEntityMap65.mapNameToValue = map71;
        java.util.Map map74 = hashEntityMap65.mapNameToValue;
        int int76 = hashEntityMap65.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map78 = hashEntityMap77.mapNameToValue;
        java.util.Map map79 = hashEntityMap77.mapValueToName;
        java.util.Map map80 = hashEntityMap77.mapNameToValue;
        hashEntityMap65.mapValueToName = map80;
        hashEntityMap63.mapValueToName = map80;
        java.util.Map map83 = hashEntityMap63.mapValueToName;
        hashEntityMap25.mapNameToValue = map83;
        java.lang.String str86 = hashEntityMap25.name(2);
        int int88 = hashEntityMap25.value("");
        java.util.Map map89 = hashEntityMap25.mapNameToValue;
        hashEntityMap6.mapNameToValue = map89;
        hashEntityMap0.mapValueToName = map89;
        java.util.Map map92 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
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
        java.lang.String str43 = hashEntityMap0.name((int) '4');
        int int45 = hashEntityMap0.value("");
        hashEntityMap0.add("", (int) ' ');
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
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray2 = null;
        binaryEntityMap1.names = strArray2;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str6 = binaryEntityMap4.name((int) (byte) 0);
        int int8 = binaryEntityMap4.value("");
        binaryEntityMap4.growBy = 10;
        binaryEntityMap4.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray17 = new int[] {};
        binaryEntityMap16.values = intArray17;
        int int20 = binaryEntityMap16.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        arrayEntityMap21.names = strArray25;
        binaryEntityMap16.names = strArray25;
        binaryEntityMap15.names = strArray25;
        binaryEntityMap4.names = strArray25;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap30.growBy = (short) 10;
        java.lang.String[] strArray33 = binaryEntityMap30.names;
        binaryEntityMap4.names = strArray33;
        binaryEntityMap1.names = strArray33;
        binaryEntityMap1.size = 32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str40 = binaryEntityMap38.name((int) (byte) 0);
        java.lang.String str42 = binaryEntityMap38.name((int) '#');
        binaryEntityMap38.growBy = (byte) 10;
        binaryEntityMap38.growBy = 1;
        java.lang.String[] strArray47 = binaryEntityMap38.names;
        binaryEntityMap38.add("", 0);
        int[] intArray51 = binaryEntityMap38.values;
        binaryEntityMap1.values = intArray51;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(intArray51);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        entities17.addEntity("hi!", 0);
        java.lang.String[][] strArray21 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities17.addEntities(strArray21);
        entities0.addEntities(strArray21);
        entities0.addEntity("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        java.lang.String str29 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
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
        int int18 = entities0.entityValue("");
        java.lang.String str20 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        int int40 = hashEntityMap32.value("");
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        hashEntityMap30.mapNameToValue = map41;
        java.util.Map map43 = hashEntityMap30.mapValueToName;
        hashEntityMap30.add("", (int) (byte) 100);
        java.util.Map map47 = hashEntityMap30.mapValueToName;
        java.util.Map map48 = hashEntityMap30.mapNameToValue;
        java.util.Map map49 = hashEntityMap30.mapValueToName;
        hashEntityMap0.mapValueToName = map49;
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
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        int int5 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name(97);
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        binaryEntityMap0.growBy = 2;
        binaryEntityMap0.size = 98;
        java.lang.String str16 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        binaryEntityMap0.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray13 = new int[] {};
        binaryEntityMap12.values = intArray13;
        int int16 = binaryEntityMap12.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        binaryEntityMap12.names = strArray21;
        binaryEntityMap11.names = strArray21;
        binaryEntityMap0.names = strArray21;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap0.names = strArray29;
        binaryEntityMap0.size = 0;
        int int33 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map25 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        hashEntityMap26.add("", (int) (byte) 10);
        int int34 = hashEntityMap26.value("");
        java.lang.String str36 = hashEntityMap26.name((int) (byte) 10);
        hashEntityMap26.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap42.mapNameToValue = map47;
        int int50 = hashEntityMap42.value("");
        java.util.Map map51 = hashEntityMap42.mapNameToValue;
        hashEntityMap40.mapNameToValue = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        java.util.Map map55 = hashEntityMap53.mapValueToName;
        java.util.Map map56 = hashEntityMap53.mapNameToValue;
        java.util.Map map57 = hashEntityMap53.mapValueToName;
        hashEntityMap40.mapValueToName = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        java.util.Map map61 = hashEntityMap59.mapValueToName;
        java.util.Map map62 = hashEntityMap59.mapNameToValue;
        hashEntityMap59.add("", (int) (byte) 10);
        int int67 = hashEntityMap59.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap68.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        hashEntityMap68.mapNameToValue = map73;
        hashEntityMap59.mapNameToValue = map73;
        hashEntityMap40.mapNameToValue = map73;
        int int78 = hashEntityMap40.value("hi!");
        java.util.Map map79 = hashEntityMap40.mapNameToValue;
        hashEntityMap26.mapNameToValue = map79;
        java.util.Map map81 = hashEntityMap26.mapNameToValue;
        hashEntityMap0.mapNameToValue = map81;
        int int84 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        int int15 = lookupEntityMap0.value("");
        java.lang.String str17 = lookupEntityMap0.name((int) '#');
        java.lang.String str19 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = lookupEntityMap0.name((int) (byte) -1);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        java.util.Map map11 = hashEntityMap7.mapNameToValue;
        java.util.Map map12 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapValueToName = map12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        hashEntityMap14.add("", (int) (byte) 10);
        int int22 = hashEntityMap14.value("");
        java.lang.String str24 = hashEntityMap14.name((int) (byte) 10);
        java.lang.String str26 = hashEntityMap14.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int29 = hashEntityMap27.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        hashEntityMap27.mapNameToValue = map31;
        hashEntityMap14.mapNameToValue = map31;
        java.util.Map map34 = hashEntityMap14.mapValueToName;
        int int36 = hashEntityMap14.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int39 = hashEntityMap37.value("hi!");
        java.lang.String str41 = hashEntityMap37.name((int) (short) 0);
        java.util.Map map42 = hashEntityMap37.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap45.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = hashEntityMap49.mapNameToValue;
        hashEntityMap45.mapNameToValue = map50;
        int int53 = hashEntityMap45.value("");
        java.util.Map map54 = hashEntityMap45.mapNameToValue;
        hashEntityMap43.mapNameToValue = map54;
        java.util.Map map56 = hashEntityMap43.mapValueToName;
        hashEntityMap37.mapNameToValue = map56;
        java.util.Map map58 = hashEntityMap37.mapValueToName;
        hashEntityMap14.mapValueToName = map58;
        hashEntityMap0.mapNameToValue = map58;
        int int62 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) '4');
        java.lang.String[] strArray9 = null;
        binaryEntityMap1.names = strArray9;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int12 = binaryEntityMap11.growBy;
        binaryEntityMap11.add("", (int) ' ');
        java.lang.String str17 = binaryEntityMap11.name((int) ' ');
        binaryEntityMap11.size = (short) 1;
        int int21 = binaryEntityMap11.value("hi!");
        java.lang.String[] strArray22 = binaryEntityMap11.names;
        binaryEntityMap1.names = strArray22;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        entities0.addEntity("hi!", (int) (byte) 1);
        java.lang.String str22 = entities0.unescape("");
        entities0.addEntity("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        int int9 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int12 = arrayEntityMap10.value("hi!");
        java.lang.String[] strArray13 = arrayEntityMap10.names;
        int int14 = arrayEntityMap10.size;
        int int15 = arrayEntityMap10.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = (short) 10;
        java.lang.String[] strArray22 = binaryEntityMap19.names;
        binaryEntityMap19.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap19.names = strArray29;
        binaryEntityMap16.names = strArray29;
        int int32 = binaryEntityMap16.size;
        int[] intArray33 = binaryEntityMap16.values;
        arrayEntityMap10.values = intArray33;
        binaryEntityMap0.values = intArray33;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap37.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int43 = arrayEntityMap42.growBy;
        int int44 = arrayEntityMap42.size;
        arrayEntityMap42.size = (short) -1;
        arrayEntityMap42.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int51 = arrayEntityMap50.growBy;
        java.lang.String[] strArray52 = arrayEntityMap50.names;
        int int54 = arrayEntityMap50.value("");
        int int55 = arrayEntityMap50.size;
        java.lang.String[] strArray56 = arrayEntityMap50.names;
        arrayEntityMap42.names = strArray56;
        binaryEntityMap37.names = strArray56;
        binaryEntityMap37.growBy = 1;
        int[] intArray61 = binaryEntityMap37.values;
        binaryEntityMap0.values = intArray61;
        binaryEntityMap0.growBy = (-1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 100, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        java.util.Map map41 = hashEntityMap0.mapValueToName;
        java.util.Map map42 = hashEntityMap0.mapValueToName;
        java.util.Map map43 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        int int17 = hashEntityMap9.value("");
        java.util.Map map18 = hashEntityMap9.mapNameToValue;
        hashEntityMap7.mapNameToValue = map18;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        java.util.Map map22 = hashEntityMap20.mapValueToName;
        java.util.Map map23 = hashEntityMap20.mapNameToValue;
        java.util.Map map24 = hashEntityMap20.mapValueToName;
        hashEntityMap7.mapValueToName = map24;
        entities0.map = hashEntityMap7;
        java.util.Map map27 = hashEntityMap7.mapNameToValue;
        java.lang.Class<?> wildcardClass28 = map27.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map1 = treeEntityMap0.mapNameToValue;
        treeEntityMap0.add("", (int) (short) 100);
        java.util.Map map5 = treeEntityMap0.mapNameToValue;
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
        java.util.Map map25 = hashEntityMap6.mapNameToValue;
        treeEntityMap0.mapNameToValue = map25;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.entityName(1);
        org.apache.commons.lang.Entities.EntityMap entityMap9 = null;
        entities0.map = entityMap9;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }
}
