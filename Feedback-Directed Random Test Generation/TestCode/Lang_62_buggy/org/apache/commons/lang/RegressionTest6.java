package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
// flaky "1) test3001(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 10);
        java.lang.String str11 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("hi!", 2);
        java.lang.String str16 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int3 = binaryEntityMap2.growBy;
        int[] intArray4 = binaryEntityMap2.values;
        binaryEntityMap1.values = intArray4;
        int int6 = binaryEntityMap1.size;
        int int7 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(52);
        java.lang.String str16 = hashEntityMap0.name((int) (short) 100);
        hashEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        entities0.addEntity("", (int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        int[] intArray42 = binaryEntityMap0.values;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] {});
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        int int5 = binaryEntityMap1.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        arrayEntityMap6.names = strArray10;
        int[] intArray12 = arrayEntityMap6.values;
        arrayEntityMap6.add("hi!", (int) '4');
        int int16 = arrayEntityMap6.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str19 = binaryEntityMap17.name((int) (byte) 0);
        int int21 = binaryEntityMap17.value("");
        binaryEntityMap17.growBy = 10;
        binaryEntityMap17.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray30 = new int[] {};
        binaryEntityMap29.values = intArray30;
        int int33 = binaryEntityMap29.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap35.growBy = (short) 10;
        java.lang.String[] strArray38 = binaryEntityMap35.names;
        arrayEntityMap34.names = strArray38;
        binaryEntityMap29.names = strArray38;
        binaryEntityMap28.names = strArray38;
        binaryEntityMap17.names = strArray38;
        arrayEntityMap6.names = strArray38;
        binaryEntityMap1.names = strArray38;
        int int45 = binaryEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str28 = entities26.unescape("");
        java.lang.String str30 = entities26.entityName(100);
        java.lang.String str32 = entities26.entityName((int) ' ');
        java.lang.String str34 = entities26.entityName(10);
        java.lang.String str36 = entities26.escape("hi!");
        java.lang.String str38 = entities26.unescape("");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer40 = null;
        entities39.escape(writer40, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap43 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities39.map = primitiveEntityMap43;
        java.lang.String str46 = entities39.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer48 = null;
        entities47.escape(writer48, "");
        java.lang.String[][] strArray51 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities47.addEntities(strArray51);
        entities39.addEntities(strArray51);
        entities26.addEntities(strArray51);
        entities0.addEntities(strArray51);
        java.io.Writer writer56 = null;
        entities0.escape(writer56, "");
        java.lang.String str60 = entities0.entityName((int) (short) 10);
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
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        java.lang.String str18 = primitiveEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        binaryEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.lang.String str20 = arrayEntityMap1.name(101);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        java.util.Map map25 = hashEntityMap0.mapNameToValue;
        java.util.Map map26 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = entities0.entityName((int) ' ');
        int int12 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str15 = entities13.unescape("");
        java.lang.String str17 = entities13.entityName(100);
        java.lang.String str19 = entities13.entityName((int) ' ');
        java.lang.String str21 = entities13.entityName((int) '#');
        java.lang.String str23 = entities13.unescape("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = '4';
        java.lang.String str28 = binaryEntityMap24.name(100);
        int int29 = binaryEntityMap24.growBy;
        java.lang.String str31 = binaryEntityMap24.name((int) ' ');
        int[] intArray32 = binaryEntityMap24.values;
        java.lang.String str34 = binaryEntityMap24.name(2);
        entities13.map = binaryEntityMap24;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap36 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str38 = binaryEntityMap36.name((int) (byte) 0);
        java.lang.String str40 = binaryEntityMap36.name((int) '#');
        binaryEntityMap36.growBy = (byte) 10;
        binaryEntityMap36.growBy = 1;
        binaryEntityMap36.ensureCapacity((int) (byte) 0);
        binaryEntityMap36.size = 2;
        int[] intArray49 = binaryEntityMap36.values;
        binaryEntityMap24.values = intArray49;
        entities0.map = binaryEntityMap24;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        int int56 = hashEntityMap54.value("hi!");
        java.util.Map map57 = hashEntityMap54.mapValueToName;
        int int59 = hashEntityMap54.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        hashEntityMap60.mapNameToValue = map66;
        java.util.Map map69 = hashEntityMap60.mapNameToValue;
        hashEntityMap54.mapNameToValue = map69;
        java.lang.String str72 = hashEntityMap54.name((int) '#');
        java.lang.String str74 = hashEntityMap54.name(0);
        java.util.Map map75 = hashEntityMap54.mapValueToName;
        hashEntityMap54.add("", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = hashEntityMap79.mapNameToValue;
        hashEntityMap54.mapValueToName = map80;
        hashEntityMap0.mapValueToName = map80;
        java.util.Map map83 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        int int7 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        int int8 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.lang.String str9 = hashEntityMap0.name(35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        hashEntityMap10.mapNameToValue = map16;
        java.util.Map map19 = hashEntityMap10.mapNameToValue;
        int int21 = hashEntityMap10.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap24.mapNameToValue = map30;
        java.util.Map map33 = hashEntityMap24.mapNameToValue;
        int int35 = hashEntityMap24.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        java.util.Map map38 = hashEntityMap36.mapValueToName;
        java.util.Map map39 = hashEntityMap36.mapNameToValue;
        hashEntityMap24.mapValueToName = map39;
        hashEntityMap22.mapValueToName = map39;
        hashEntityMap10.mapNameToValue = map39;
        hashEntityMap10.add("hi!", 1);
        hashEntityMap10.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap50.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        hashEntityMap50.mapNameToValue = map55;
        hashEntityMap49.mapNameToValue = map55;
        java.util.Map map58 = hashEntityMap49.mapNameToValue;
        int int60 = hashEntityMap49.value("hi!");
        hashEntityMap49.add("", (int) (byte) 0);
        java.lang.String str65 = hashEntityMap49.name((int) (short) 0);
        java.lang.String str67 = hashEntityMap49.name((int) (byte) 0);
        java.util.Map map68 = hashEntityMap49.mapNameToValue;
        java.util.Map map69 = hashEntityMap49.mapNameToValue;
        hashEntityMap10.mapNameToValue = map69;
        java.util.Map map71 = hashEntityMap10.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap73.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map78 = hashEntityMap77.mapNameToValue;
        hashEntityMap73.mapNameToValue = map78;
        hashEntityMap72.mapNameToValue = map78;
        hashEntityMap10.mapValueToName = map78;
        hashEntityMap0.mapNameToValue = map78;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        int int12 = binaryEntityMap0.growBy;
        int int13 = binaryEntityMap0.size;
        java.lang.String str15 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.ensureCapacity(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        entities0.addEntity("", (int) (byte) 100);
        java.lang.String str15 = entities0.unescape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        int int30 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(entityMap31);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", (int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str14 = entities12.unescape("");
        java.lang.String str16 = entities12.entityName(100);
        java.lang.String str18 = entities12.entityName((int) ' ');
        java.lang.String str20 = entities12.entityName((int) '#');
        java.lang.String str22 = entities12.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities12.map;
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities24.map;
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer27 = null;
        entities26.escape(writer27, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap30 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities26.map = primitiveEntityMap30;
        java.lang.String str33 = entities26.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer35 = null;
        entities34.escape(writer35, "");
        java.lang.String[][] strArray38 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities34.addEntities(strArray38);
        entities26.addEntities(strArray38);
        entities24.addEntities(strArray38);
        entities12.addEntities(strArray38);
        entities0.addEntities(strArray38);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities entities5 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities5.map;
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer8 = null;
        entities7.escape(writer8, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap11 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities7.map = primitiveEntityMap11;
        java.lang.String str14 = entities7.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer16 = null;
        entities15.escape(writer16, "");
        java.lang.String[][] strArray19 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities15.addEntities(strArray19);
        entities7.addEntities(strArray19);
        entities5.addEntities(strArray19);
        entities0.addEntities(strArray19);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(entities5);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        int int9 = hashEntityMap5.value("");
        hashEntityMap5.add("", 1);
        java.util.Map map13 = hashEntityMap5.mapValueToName;
        java.util.Map map14 = hashEntityMap5.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        int int19 = hashEntityMap15.value("");
        hashEntityMap15.add("", 1);
        java.util.Map map23 = hashEntityMap15.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        java.util.Map map28 = hashEntityMap24.mapNameToValue;
        java.util.Map map29 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap31.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        hashEntityMap31.mapNameToValue = map36;
        hashEntityMap30.mapNameToValue = map36;
        java.util.Map map39 = hashEntityMap30.mapNameToValue;
        hashEntityMap30.add("", (int) (byte) 1);
        java.util.Map map43 = hashEntityMap30.mapNameToValue;
        hashEntityMap24.mapNameToValue = map43;
        hashEntityMap15.mapNameToValue = map43;
        hashEntityMap5.mapValueToName = map43;
        java.util.Map map47 = hashEntityMap5.mapNameToValue;
        entities0.map = hashEntityMap5;
        hashEntityMap5.add("", 101);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        int[] intArray4 = binaryEntityMap0.values;
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("hi!", 10);
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        int int7 = lookupEntityMap0.value("");
        int int9 = lookupEntityMap0.value("");
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 0);
        int int13 = lookupEntityMap0.value("");
        java.lang.String str15 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.unescape("");
        java.lang.String str9 = entities0.entityName((int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) -1);
        binaryEntityMap0.growBy = (short) 1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        java.lang.String str24 = hashEntityMap0.name((int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        java.util.Map map27 = hashEntityMap25.mapValueToName;
        java.util.Map map28 = hashEntityMap25.mapNameToValue;
        hashEntityMap25.add("", (int) (byte) 10);
        int int33 = hashEntityMap25.value("");
        java.lang.String str35 = hashEntityMap25.name((int) (byte) 10);
        java.lang.String str37 = hashEntityMap25.name((int) (short) 0);
        java.lang.String str39 = hashEntityMap25.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        hashEntityMap40.mapNameToValue = map46;
        java.util.Map map49 = hashEntityMap40.mapNameToValue;
        int int51 = hashEntityMap40.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap40.mapValueToName = map55;
        hashEntityMap25.mapNameToValue = map55;
        java.lang.String str59 = hashEntityMap25.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int62 = hashEntityMap60.value("hi!");
        java.lang.String str64 = hashEntityMap60.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        java.util.Map map67 = hashEntityMap65.mapValueToName;
        java.util.Map map68 = hashEntityMap65.mapNameToValue;
        hashEntityMap65.add("", (int) (byte) 10);
        int int73 = hashEntityMap65.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap74.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map79 = hashEntityMap78.mapNameToValue;
        hashEntityMap74.mapNameToValue = map79;
        hashEntityMap65.mapNameToValue = map79;
        java.lang.String str83 = hashEntityMap65.name((int) 'a');
        hashEntityMap65.add("", (int) (short) 1);
        java.util.Map map87 = hashEntityMap65.mapNameToValue;
        hashEntityMap60.mapNameToValue = map87;
        hashEntityMap25.mapValueToName = map87;
        hashEntityMap0.mapValueToName = map87;
        hashEntityMap0.add("hi!", (int) (short) 100);
        hashEntityMap0.add("", (int) '4');
        java.util.Map map97 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        java.lang.String str16 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        int int27 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 101 + "'", int4 == 101);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 101 + "'", int6 == 101);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("", 32);
        java.lang.String str9 = lookupEntityMap0.name(0);
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("");
        int[] intArray12 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer14 = null;
        entities13.escape(writer14, "");
        java.lang.String[][] strArray17 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities13.addEntities(strArray17);
        entities13.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str24 = binaryEntityMap22.name((int) (byte) 0);
        java.lang.String str26 = binaryEntityMap22.name((int) '#');
        int int28 = binaryEntityMap22.value("hi!");
        java.lang.String str30 = binaryEntityMap22.name((int) (byte) 1);
        entities13.map = binaryEntityMap22;
        int int33 = binaryEntityMap22.value("hi!");
        java.lang.String[] strArray34 = binaryEntityMap22.names;
        binaryEntityMap0.names = strArray34;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        java.lang.String str14 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.lang.String str9 = entities0.entityName((int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int8 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name((int) ' ');
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
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
        java.lang.String str23 = hashEntityMap5.name((int) 'a');
        hashEntityMap5.add("", (int) (short) 1);
        java.util.Map map27 = hashEntityMap5.mapNameToValue;
        hashEntityMap0.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 0);
        java.util.Map map33 = hashEntityMap0.mapNameToValue;
        java.util.Map map34 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("", 2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap12 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str14 = lookupEntityMap12.name(0);
        lookupEntityMap12.add("", (int) (short) 100);
        lookupEntityMap12.add("hi!", 32);
        java.lang.String str22 = lookupEntityMap12.name(97);
        entities0.map = lookupEntityMap12;
        java.lang.String str25 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.util.Map map90 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        int int37 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int40 = entities0.entityValue("hi!");
        java.lang.String str42 = entities0.escape("hi!");
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        java.lang.String str7 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        java.lang.String[] strArray22 = arrayEntityMap7.names;
        arrayEntityMap7.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        java.lang.String str15 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        java.lang.String str8 = binaryEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        int int12 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int17 = binaryEntityMap15.value("");
        binaryEntityMap15.size = '#';
        binaryEntityMap15.size = (byte) 10;
        java.lang.String str23 = binaryEntityMap15.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap25.ensureCapacity((int) 'a');
        arrayEntityMap25.ensureCapacity(0);
        arrayEntityMap25.add("hi!", 100);
        java.lang.String str34 = arrayEntityMap25.name((int) 'a');
        int int36 = arrayEntityMap25.value("");
        int[] intArray37 = arrayEntityMap25.values;
        int[] intArray38 = arrayEntityMap25.values;
        binaryEntityMap15.values = intArray38;
        binaryEntityMap0.values = intArray38;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        int int15 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int11 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        int int22 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        int int14 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        java.lang.String[] strArray13 = arrayEntityMap8.names;
        binaryEntityMap0.names = strArray13;
        int[] intArray15 = null;
        binaryEntityMap0.values = intArray15;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 0);
        int int3 = arrayEntityMap1.value("");
        java.lang.String str5 = arrayEntityMap1.name((int) (byte) 10);
        int[] intArray6 = new int[] {};
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int int13 = binaryEntityMap8.value("");
        binaryEntityMap8.growBy = (short) 1;
        binaryEntityMap8.size = 100;
        binaryEntityMap8.add("", 100);
        java.lang.String[] strArray21 = binaryEntityMap8.names;
        java.lang.String[] strArray22 = binaryEntityMap8.names;
        java.lang.String str24 = binaryEntityMap8.name(0);
        java.lang.String[] strArray25 = binaryEntityMap8.names;
        arrayEntityMap1.names = strArray25;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        int int11 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        hashEntityMap0.add("", (int) (short) 0);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 100);
        hashEntityMap0.add("hi!", 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        arrayEntityMap5.size = (-1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str14 = arrayEntityMap12.name((int) (short) 100);
        int[] intArray17 = new int[] { (short) 0, (-1) };
        arrayEntityMap12.values = intArray17;
        int int19 = arrayEntityMap12.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str22 = binaryEntityMap20.name((int) (byte) 0);
        int int24 = binaryEntityMap20.value("");
        binaryEntityMap20.growBy = 10;
        java.lang.String str28 = binaryEntityMap20.name((int) (byte) 10);
        java.lang.String[] strArray29 = binaryEntityMap20.names;
        arrayEntityMap12.names = strArray29;
        arrayEntityMap5.names = strArray29;
        int int32 = arrayEntityMap5.size;
        java.lang.Class<?> wildcardClass33 = arrayEntityMap5.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.lang.Class<?> wildcardClass17 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map5 = treeEntityMap4.mapNameToValue;
        hashEntityMap0.mapValueToName = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        java.util.Map map10 = hashEntityMap8.mapValueToName;
        java.util.Map map11 = hashEntityMap8.mapNameToValue;
        hashEntityMap8.add("", (int) (byte) 10);
        int int16 = hashEntityMap8.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        hashEntityMap8.mapNameToValue = map22;
        hashEntityMap8.add("", (int) (short) 0);
        java.util.Map map28 = hashEntityMap8.mapNameToValue;
        hashEntityMap0.mapValueToName = map28;
        java.lang.String str31 = hashEntityMap0.name(52);
        java.util.Map map32 = hashEntityMap0.mapValueToName;
        int int34 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        int int16 = arrayEntityMap1.value("");
        arrayEntityMap1.growBy = 10;
        int int20 = arrayEntityMap1.value("");
        arrayEntityMap1.growBy = 0;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.size = 100;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.lang.String str12 = entities0.entityName(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity((int) (byte) 10);
        int int13 = binaryEntityMap0.size;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name(100);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str21 = entities19.unescape("");
        java.lang.String str23 = entities19.entityName((int) (short) 0);
        java.lang.String str25 = entities19.unescape("hi!");
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str28 = entities26.unescape("");
        int int30 = entities26.entityValue("");
        int int32 = entities26.entityValue("");
        entities26.addEntity("", 97);
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML32;
        entities36.addEntity("hi!", 0);
        java.lang.String[][] strArray40 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities36.addEntities(strArray40);
        entities26.addEntities(strArray40);
        entities19.addEntities(strArray40);
        entities0.addEntities(strArray40);
        java.lang.String str46 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity((int) '4');
        binaryEntityMap0.growBy = '4';
        java.lang.String str7 = binaryEntityMap0.name((int) (short) 0);
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.growBy = 52;
        int int12 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        arrayEntityMap1.size = '4';
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        arrayEntityMap1.size = 10;
        arrayEntityMap1.growBy = (short) 10;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { null });
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        java.lang.String str7 = binaryEntityMap0.name(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        int int12 = binaryEntityMap8.value("");
        binaryEntityMap8.add("", (int) (short) -1);
        int[] intArray16 = binaryEntityMap8.values;
        binaryEntityMap0.values = intArray16;
        binaryEntityMap0.growBy = (byte) 0;
        int int20 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.lang.String str12 = entities0.unescape("hi!");
        java.lang.String str14 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        int int11 = binaryEntityMap0.growBy;
        java.lang.String str13 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String[] strArray3 = binaryEntityMap1.names;
        java.lang.String str5 = binaryEntityMap1.name((int) (short) 100);
        java.lang.String str7 = binaryEntityMap1.name((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        arrayEntityMap1.size = (short) -1;
        java.lang.String str22 = arrayEntityMap1.name((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("");
        int int7 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (byte) 100;
        java.lang.String str11 = binaryEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        entities0.addEntity("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", 35);
        arrayEntityMap1.growBy = (short) 0;
        java.lang.String[] strArray10 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        int int19 = hashEntityMap0.value("hi!");
        java.lang.String str21 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name(97);
        int int4 = primitiveEntityMap0.value("");
        java.lang.String str6 = primitiveEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str4 = entities0.unescape("hi!");
        java.lang.String str6 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer28 = null;
        entities27.escape(writer28, "");
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities27.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map33 = hashEntityMap32.mapNameToValue;
        java.util.Map map34 = hashEntityMap32.mapValueToName;
        java.util.Map map35 = hashEntityMap32.mapNameToValue;
        hashEntityMap32.add("", (int) (byte) 10);
        int int40 = hashEntityMap32.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        hashEntityMap32.mapNameToValue = map46;
        hashEntityMap32.add("", (int) (short) 0);
        hashEntityMap32.add("hi!", (int) '4');
        entities27.map = hashEntityMap32;
        org.apache.commons.lang.Entities entities56 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer57 = null;
        entities56.escape(writer57, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap60 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities56.map = primitiveEntityMap60;
        java.lang.String str63 = entities56.entityName((int) (short) -1);
        java.lang.String[][] strArray64 = new java.lang.String[][] {};
        entities56.addEntities(strArray64);
        entities27.addEntities(strArray64);
        entities0.addEntities(strArray64);
        org.apache.commons.lang.Entities entities68 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str70 = entities68.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap72 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities68.map = arrayEntityMap72;
        entities68.addEntity("", (int) ' ');
        java.lang.String str78 = entities68.unescape("");
        entities68.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities82 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer83 = null;
        entities82.escape(writer83, "");
        java.lang.String[][] strArray86 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities82.addEntities(strArray86);
        entities68.addEntities(strArray86);
        entities0.addEntities(strArray86);
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
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(entities56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entities68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(entities82);
        org.junit.Assert.assertNotNull(strArray86);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        int int9 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity((int) (byte) 10);
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.growBy = (short) 100;
        int[] intArray14 = null;
        binaryEntityMap0.values = intArray14;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = binaryEntityMap0.value("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        int int13 = entities0.entityValue("");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "2) test3091(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
// flaky "1) test3091(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
        java.lang.String str14 = entities0.escape("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        hashEntityMap15.mapNameToValue = map21;
        java.util.Map map24 = hashEntityMap15.mapNameToValue;
        int int26 = hashEntityMap15.value("hi!");
        hashEntityMap15.add("", (int) (byte) 0);
        java.lang.String str31 = hashEntityMap15.name((int) (short) 0);
        int int33 = hashEntityMap15.value("hi!");
        entities0.map = hashEntityMap15;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
// flaky "3) test3092(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.ensureCapacity(0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.lang.String str12 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        java.util.Map map17 = hashEntityMap13.mapValueToName;
        java.util.Map map18 = hashEntityMap13.mapValueToName;
        entities0.map = hashEntityMap13;
        java.util.Map map20 = hashEntityMap13.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.add("", (int) 'a');
        binaryEntityMap23.add("", 10);
        binaryEntityMap23.ensureCapacity(0);
        java.lang.String str33 = binaryEntityMap23.name((int) (byte) 10);
        binaryEntityMap23.add("hi!", 0);
        entities0.map = binaryEntityMap23;
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("");
        java.lang.String str7 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        java.util.Map map54 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        java.util.Map map48 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 32);
        java.lang.String str53 = hashEntityMap0.name((int) '4');
        java.util.Map map54 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 10);
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 10);
        java.lang.String str11 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", 98);
        java.lang.String str16 = lookupEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap28.add("", (int) (short) 100);
        java.lang.String str36 = binaryEntityMap28.name((int) (byte) 1);
        java.lang.String str38 = binaryEntityMap28.name((int) ' ');
        binaryEntityMap28.add("", (int) (short) 0);
        entities0.map = binaryEntityMap28;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("", (int) '4');
        int int8 = hashEntityMap0.value("hi!");
        int int10 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        hashEntityMap40.mapNameToValue = map46;
        java.util.Map map49 = hashEntityMap40.mapNameToValue;
        int int51 = hashEntityMap40.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap40.mapValueToName = map55;
        hashEntityMap38.mapValueToName = map55;
        java.util.Map map58 = hashEntityMap38.mapValueToName;
        hashEntityMap0.mapNameToValue = map58;
        java.lang.String str61 = hashEntityMap0.name(2);
        int int63 = hashEntityMap0.value("");
        java.util.Map map64 = hashEntityMap0.mapNameToValue;
        java.util.Map map65 = hashEntityMap0.mapNameToValue;
        int int67 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (short) 1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", 32);
        lookupEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.ensureCapacity((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int12 = binaryEntityMap10.value("hi!");
        int int13 = binaryEntityMap10.growBy;
        int[] intArray14 = binaryEntityMap10.values;
        binaryEntityMap1.values = intArray14;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 0 });
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(entityMap5);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap19.add("", 100);
        java.lang.String str24 = binaryEntityMap19.name(52);
        int[] intArray25 = binaryEntityMap19.values;
        binaryEntityMap0.values = intArray25;
        binaryEntityMap0.growBy = 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100 });
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.Class<?> wildcardClass15 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int15 = hashEntityMap13.value("hi!");
        java.util.Map map16 = hashEntityMap13.mapValueToName;
        java.lang.String str18 = hashEntityMap13.name((int) 'a');
        java.util.Map map19 = hashEntityMap13.mapNameToValue;
        int int21 = hashEntityMap13.value("hi!");
        entities0.map = hashEntityMap13;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String str12 = hashEntityMap0.name((int) '#');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        hashEntityMap13.add("", (int) (byte) 10);
        int int21 = hashEntityMap13.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap22.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        hashEntityMap22.mapNameToValue = map27;
        hashEntityMap13.mapNameToValue = map27;
        hashEntityMap13.add("", (int) (short) 0);
        hashEntityMap13.add("hi!", (int) '4');
        java.util.Map map36 = hashEntityMap13.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        int int41 = hashEntityMap37.value("");
        int int43 = hashEntityMap37.value("hi!");
        java.util.Map map44 = hashEntityMap37.mapValueToName;
        hashEntityMap13.mapValueToName = map44;
        hashEntityMap13.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int51 = hashEntityMap49.value("hi!");
        java.util.Map map52 = hashEntityMap49.mapValueToName;
        int int54 = hashEntityMap49.value("");
        java.util.Map map55 = hashEntityMap49.mapNameToValue;
        hashEntityMap49.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        java.util.Map map61 = hashEntityMap59.mapValueToName;
        java.util.Map map62 = hashEntityMap59.mapNameToValue;
        java.util.Map map63 = hashEntityMap59.mapValueToName;
        java.util.Map map64 = hashEntityMap59.mapNameToValue;
        java.util.Map map65 = hashEntityMap59.mapValueToName;
        java.util.Map map66 = hashEntityMap59.mapValueToName;
        hashEntityMap49.mapNameToValue = map66;
        hashEntityMap13.mapNameToValue = map66;
        hashEntityMap0.mapValueToName = map66;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap19.add("", 100);
        java.lang.String str24 = binaryEntityMap19.name(52);
        int[] intArray25 = binaryEntityMap19.values;
        binaryEntityMap0.values = intArray25;
        java.lang.String[] strArray27 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 100 });
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.escape("hi!");
        java.lang.String str8 = entities0.entityName(0);
        entities0.addEntity("", 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        java.lang.String str20 = entities0.entityName(52);
        int int22 = entities0.entityValue("");
        java.lang.String str24 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        int int28 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", 10);
        primitiveEntityMap0.add("", (int) '#');
        int int15 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) -1);
        binaryEntityMap0.ensureCapacity((int) 'a');
        binaryEntityMap0.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        int[] intArray10 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        int int13 = hashEntityMap9.value("");
        hashEntityMap9.add("", 1);
        java.util.Map map17 = hashEntityMap9.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap20.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap20.mapNameToValue = map25;
        int int28 = hashEntityMap20.value("");
        java.util.Map map29 = hashEntityMap20.mapNameToValue;
        hashEntityMap18.mapNameToValue = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        java.util.Map map33 = hashEntityMap31.mapValueToName;
        java.util.Map map34 = hashEntityMap31.mapNameToValue;
        java.util.Map map35 = hashEntityMap31.mapValueToName;
        hashEntityMap18.mapValueToName = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        java.util.Map map39 = hashEntityMap37.mapValueToName;
        java.util.Map map40 = hashEntityMap37.mapNameToValue;
        hashEntityMap37.add("", (int) (byte) 10);
        int int45 = hashEntityMap37.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap46.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        hashEntityMap46.mapNameToValue = map51;
        hashEntityMap37.mapNameToValue = map51;
        hashEntityMap18.mapNameToValue = map51;
        java.util.Map map55 = hashEntityMap18.mapValueToName;
        hashEntityMap9.mapNameToValue = map55;
        java.util.Map map57 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapValueToName = map57;
        int int60 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        hashEntityMap40.mapNameToValue = map46;
        java.util.Map map49 = hashEntityMap40.mapNameToValue;
        int int51 = hashEntityMap40.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap40.mapValueToName = map55;
        hashEntityMap38.mapValueToName = map55;
        java.util.Map map58 = hashEntityMap38.mapValueToName;
        hashEntityMap0.mapNameToValue = map58;
        java.lang.String str61 = hashEntityMap0.name(2);
        java.util.Map map62 = hashEntityMap0.mapValueToName;
        int int64 = hashEntityMap0.value("");
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap1.size = (byte) 10;
        arrayEntityMap1.size = 0;
        int int6 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        int int8 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str11 = binaryEntityMap9.name((int) (byte) 0);
        int int13 = binaryEntityMap9.value("");
        binaryEntityMap9.growBy = 10;
        java.lang.String str17 = binaryEntityMap9.name((int) (byte) 10);
        java.lang.String[] strArray18 = binaryEntityMap9.names;
        arrayEntityMap1.names = strArray18;
        arrayEntityMap1.ensureCapacity((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        java.lang.String[] strArray30 = binaryEntityMap27.names;
        arrayEntityMap26.names = strArray30;
        int[] intArray32 = arrayEntityMap26.values;
        binaryEntityMap22.values = intArray32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        int int39 = binaryEntityMap34.value("");
        binaryEntityMap34.growBy = (short) 1;
        binaryEntityMap34.size = 100;
        binaryEntityMap34.add("", 100);
        java.lang.String[] strArray47 = binaryEntityMap34.names;
        binaryEntityMap22.names = strArray47;
        arrayEntityMap1.names = strArray47;
        arrayEntityMap1.ensureCapacity((int) (short) -1);
        int int53 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        java.util.Map map25 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap26.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        hashEntityMap26.mapNameToValue = map31;
        hashEntityMap26.add("hi!", (int) '4');
        int int37 = hashEntityMap26.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap38.mapNameToValue = map44;
        java.util.Map map47 = hashEntityMap38.mapNameToValue;
        hashEntityMap38.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int53 = hashEntityMap51.value("hi!");
        java.util.Map map54 = hashEntityMap51.mapValueToName;
        int int56 = hashEntityMap51.value("");
        java.util.Map map57 = hashEntityMap51.mapNameToValue;
        hashEntityMap38.mapValueToName = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap62.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        hashEntityMap62.mapNameToValue = map67;
        hashEntityMap61.mapNameToValue = map67;
        java.util.Map map70 = hashEntityMap61.mapNameToValue;
        int int72 = hashEntityMap61.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map74 = hashEntityMap73.mapNameToValue;
        java.util.Map map75 = hashEntityMap73.mapValueToName;
        java.util.Map map76 = hashEntityMap73.mapNameToValue;
        hashEntityMap61.mapValueToName = map76;
        hashEntityMap59.mapValueToName = map76;
        java.util.Map map79 = hashEntityMap59.mapValueToName;
        hashEntityMap38.mapNameToValue = map79;
        hashEntityMap26.mapNameToValue = map79;
        java.util.Map map82 = null;
        hashEntityMap26.mapValueToName = map82;
        java.util.Map map84 = hashEntityMap26.mapNameToValue;
        hashEntityMap0.mapNameToValue = map84;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap86 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map87 = hashEntityMap86.mapNameToValue;
        java.util.Map map88 = hashEntityMap86.mapValueToName;
        java.util.Map map89 = hashEntityMap86.mapNameToValue;
        java.util.Map map90 = hashEntityMap86.mapValueToName;
        java.lang.String str92 = hashEntityMap86.name((int) '4');
        int int94 = hashEntityMap86.value("hi!");
        java.util.Map map95 = hashEntityMap86.mapNameToValue;
        hashEntityMap0.mapValueToName = map95;
        java.util.Map map97 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) 100);
        java.lang.String str14 = primitiveEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        hashEntityMap0.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        hashEntityMap18.mapNameToValue = map24;
        java.util.Map map27 = hashEntityMap18.mapNameToValue;
        hashEntityMap0.mapNameToValue = map27;
        hashEntityMap0.add("hi!", 98);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.String str38 = arrayEntityMap4.name((int) (short) -1);
        arrayEntityMap4.ensureCapacity(52);
        arrayEntityMap4.add("hi!", 2);
        java.lang.String str45 = arrayEntityMap4.name((int) 'a');
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
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.Class<?> wildcardClass7 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("", 2);
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 10);
        binaryEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
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
        java.lang.String str17 = entities0.entityName(97);
        java.lang.String str19 = entities0.unescape("");
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer20, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str5 = binaryEntityMap1.name(32);
        int int6 = binaryEntityMap1.size;
        int int7 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) -1);
        hashEntityMap0.add("", (int) 'a');
        hashEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        int int13 = binaryEntityMap0.value("");
        int int15 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity(2);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 1);
        int int9 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        int int12 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        java.lang.String str8 = arrayEntityMap4.name((int) (byte) 0);
        int int10 = arrayEntityMap4.value("hi!");
        int int11 = arrayEntityMap4.growBy;
        arrayEntityMap4.ensureCapacity(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        lookupEntityMap0.add("hi!", 32);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        int int15 = hashEntityMap12.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        java.util.Map map20 = hashEntityMap16.mapNameToValue;
        hashEntityMap16.add("", 10);
        int int25 = hashEntityMap16.value("");
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
        hashEntityMap16.mapValueToName = map41;
        hashEntityMap12.mapValueToName = map41;
        java.lang.String str46 = hashEntityMap12.name(0);
        entities0.map = hashEntityMap12;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap50.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        hashEntityMap50.mapNameToValue = map55;
        int int58 = hashEntityMap50.value("");
        java.util.Map map59 = hashEntityMap50.mapNameToValue;
        hashEntityMap48.mapNameToValue = map59;
        java.util.Map map61 = hashEntityMap48.mapValueToName;
        java.util.Map map62 = hashEntityMap48.mapValueToName;
        hashEntityMap12.mapNameToValue = map62;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(100);
        int int16 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        arrayEntityMap15.names = strArray19;
        int[] intArray21 = arrayEntityMap15.values;
        binaryEntityMap0.values = intArray21;
        binaryEntityMap0.size = 52;
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray21);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        java.lang.String str17 = entities0.entityName(0);
        java.lang.String str19 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(entityMap20);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.lang.String str12 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int16 = binaryEntityMap14.value("");
        int int17 = binaryEntityMap14.size;
        int int19 = binaryEntityMap14.value("hi!");
        entities0.map = binaryEntityMap14;
        java.lang.String str22 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        binaryEntityMap0.size = (short) 100;
        binaryEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.growBy = 0;
        int int6 = binaryEntityMap1.size;
        int int7 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        int int6 = binaryEntityMap0.value("");
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 1);
        java.lang.String str10 = binaryEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.size;
        int int10 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int13 = binaryEntityMap11.value("");
        java.lang.String str15 = binaryEntityMap11.name((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int17 = binaryEntityMap16.growBy;
        int[] intArray18 = binaryEntityMap16.values;
        binaryEntityMap11.values = intArray18;
        binaryEntityMap0.values = intArray18;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", 10);
        primitiveEntityMap0.add("", (-1));
        primitiveEntityMap0.add("hi!", (int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        entities0.addEntity("hi!", 0);
        java.io.Writer writer31 = null;
        entities0.escape(writer31, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", 1);
        hashEntityMap0.add("hi!", (int) 'a');
        hashEntityMap0.add("hi!", (int) ' ');
        java.util.Map map19 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass20 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        int int7 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int10 = binaryEntityMap8.value("");
        binaryEntityMap8.size = '#';
        java.lang.String str14 = binaryEntityMap8.name((int) '#');
        int int15 = binaryEntityMap8.growBy;
        java.lang.String str17 = binaryEntityMap8.name((int) (byte) 0);
        int[] intArray18 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray18;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        entities0.addEntity("hi!", (int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        java.util.Map map15 = hashEntityMap12.mapNameToValue;
        java.util.Map map16 = hashEntityMap12.mapValueToName;
        java.util.Map map17 = hashEntityMap12.mapValueToName;
        java.util.Map map18 = hashEntityMap12.mapNameToValue;
        hashEntityMap12.add("hi!", (int) (short) -1);
        entities0.map = hashEntityMap12;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        java.lang.String str7 = binaryEntityMap0.name(0);
        binaryEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        entities0.addEntity("", (int) (short) -1);
        int int21 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(entityMap22);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = (byte) 10;
        binaryEntityMap0.add("", (-1));
        binaryEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        hashEntityMap0.add("hi!", 52);
        java.util.Map map17 = hashEntityMap0.mapNameToValue;
        java.util.Map map18 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = binaryEntityMap0.name(32);
        binaryEntityMap0.growBy = 97;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("hi!", (int) (short) -1);
        arrayEntityMap1.growBy = '4';
        int int17 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str21 = arrayEntityMap1.name((int) ' ');
        int[] intArray22 = arrayEntityMap1.values;
        int int24 = arrayEntityMap1.value("");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (short) 0);
        int int11 = arrayEntityMap4.value("hi!");
        int int13 = arrayEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int14 = hashEntityMap12.value("");
        entities0.map = hashEntityMap12;
        java.io.Writer writer16 = null;
        entities0.escape(writer16, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        java.lang.String str11 = arrayEntityMap1.name((int) (byte) -1);
        int[] intArray12 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int14 = binaryEntityMap13.growBy;
        binaryEntityMap13.add("", (int) (short) 100);
        binaryEntityMap13.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap21.ensureCapacity((int) 'a');
        arrayEntityMap21.ensureCapacity(0);
        arrayEntityMap21.add("hi!", 100);
        java.lang.String str30 = arrayEntityMap21.name((int) 'a');
        int int32 = arrayEntityMap21.value("");
        arrayEntityMap21.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap37.ensureCapacity((int) 'a');
        int int40 = arrayEntityMap37.growBy;
        java.lang.String[] strArray41 = arrayEntityMap37.names;
        arrayEntityMap21.names = strArray41;
        binaryEntityMap13.names = strArray41;
        arrayEntityMap1.names = strArray41;
        int int45 = arrayEntityMap1.growBy;
        int int46 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = 1;
        int[] intArray8 = arrayEntityMap1.values;
        java.lang.String str10 = arrayEntityMap1.name((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("hi!", (int) (short) -1);
        int int12 = hashEntityMap0.value("");
        java.lang.String str14 = hashEntityMap0.name((int) '#');
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        java.lang.String str17 = hashEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        int int29 = hashEntityMap0.value("");
        java.lang.Class<?> wildcardClass30 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        java.lang.String str16 = lookupEntityMap0.name((int) (byte) 0);
        int int18 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (short) -1);
        int int23 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.growBy = ' ';
        java.lang.String str11 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.growBy = 10;
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray18 = null;
        binaryEntityMap17.names = strArray18;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str22 = binaryEntityMap20.name((int) (byte) 0);
        int int24 = binaryEntityMap20.value("");
        binaryEntityMap20.growBy = 10;
        binaryEntityMap20.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray33 = new int[] {};
        binaryEntityMap32.values = intArray33;
        int int36 = binaryEntityMap32.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap38.growBy = (short) 10;
        java.lang.String[] strArray41 = binaryEntityMap38.names;
        arrayEntityMap37.names = strArray41;
        binaryEntityMap32.names = strArray41;
        binaryEntityMap31.names = strArray41;
        binaryEntityMap20.names = strArray41;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap46.growBy = (short) 10;
        java.lang.String[] strArray49 = binaryEntityMap46.names;
        binaryEntityMap20.names = strArray49;
        binaryEntityMap17.names = strArray49;
        java.lang.String[] strArray52 = binaryEntityMap17.names;
        binaryEntityMap0.names = strArray52;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] {});
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.entityName((int) (short) 1);
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str16 = entities14.unescape("");
        java.lang.String str18 = entities14.entityName((int) (short) 0);
        java.lang.String str20 = entities14.entityName(1);
        java.lang.String str22 = entities14.escape("");
        int int24 = entities14.entityValue("hi!");
        java.lang.String str26 = entities14.unescape("hi!");
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer28 = null;
        entities27.escape(writer28, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap31 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities27.map = primitiveEntityMap31;
        java.lang.String str34 = entities27.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities35 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer36 = null;
        entities35.escape(writer36, "");
        java.lang.String[][] strArray39 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities35.addEntities(strArray39);
        entities27.addEntities(strArray39);
        java.lang.String str43 = entities27.escape("");
        org.apache.commons.lang.Entities entities44 = org.apache.commons.lang.Entities.HTML32;
        entities44.addEntity("hi!", 0);
        java.lang.String[][] strArray48 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities44.addEntities(strArray48);
        entities27.addEntities(strArray48);
        entities14.addEntities(strArray48);
        entities0.addEntities(strArray48);
        org.apache.commons.lang.Entities.EntityMap entityMap53 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(entities35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(entities44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(entityMap53);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        java.lang.String str7 = primitiveEntityMap0.name((int) (byte) 0);
        java.lang.String str9 = primitiveEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.apache.commons.lang.Entities entities4 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer5 = null;
        entities4.escape(writer5, "");
        int int9 = entities4.entityValue("");
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities4.addEntities(strArray10);
        entities0.addEntities(strArray10);
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertNotNull(entities4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (-1));
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities12.map;
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer15 = null;
        entities14.escape(writer15, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap18 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities14.map = primitiveEntityMap18;
        java.lang.String str21 = entities14.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer23 = null;
        entities22.escape(writer23, "");
        java.lang.String[][] strArray26 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities22.addEntities(strArray26);
        entities14.addEntities(strArray26);
        entities12.addEntities(strArray26);
        entities0.addEntities(strArray26);
        java.lang.String str32 = entities0.unescape("hi!");
        java.lang.String str34 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.lang.String str19 = hashEntityMap0.name(3);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.entityName((int) (byte) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap10.ensureCapacity((int) 'a');
        arrayEntityMap10.ensureCapacity(0);
        arrayEntityMap10.add("hi!", 100);
        java.lang.String str19 = arrayEntityMap10.name((int) 'a');
        int[] intArray20 = arrayEntityMap10.values;
        int int21 = arrayEntityMap10.growBy;
        entities0.map = arrayEntityMap10;
        java.lang.String str24 = entities0.escape("hi!");
        int int26 = entities0.entityValue("hi!");
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) 10);
        java.lang.String str13 = binaryEntityMap0.name((int) (byte) 10);
        int int15 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.size = 52;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        java.lang.String str7 = binaryEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap9.ensureCapacity((int) 'a');
        arrayEntityMap9.ensureCapacity(0);
        arrayEntityMap9.add("hi!", 100);
        java.lang.String str18 = arrayEntityMap9.name((int) 'a');
        int[] intArray19 = arrayEntityMap9.values;
        binaryEntityMap0.values = intArray19;
        int int21 = binaryEntityMap0.growBy;
        int int22 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.String str20 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer22 = null;
        entities21.escape(writer22, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities21);
        java.lang.String str27 = entities21.unescape("");
        java.lang.String str29 = entities21.escape("hi!");
        java.lang.String str31 = entities21.entityName((int) (short) 1);
        java.lang.String str33 = entities21.entityName((int) '#');
        java.io.Writer writer34 = null;
        entities21.escape(writer34, "");
        java.lang.String str38 = entities21.entityName(32);
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities21.map;
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer41 = null;
        entities40.escape(writer41, "");
        java.lang.String[][] strArray44 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities40.addEntities(strArray44);
        entities40.addEntity("hi!", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap49 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str51 = binaryEntityMap49.name((int) (byte) 0);
        java.lang.String str53 = binaryEntityMap49.name((int) '#');
        int int55 = binaryEntityMap49.value("hi!");
        java.lang.String str57 = binaryEntityMap49.name((int) (byte) 1);
        entities40.map = binaryEntityMap49;
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str61 = entities59.unescape("");
        java.lang.String str63 = entities59.entityName((int) (short) 0);
        java.lang.String str65 = entities59.unescape("hi!");
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str68 = entities66.unescape("");
        int int70 = entities66.entityValue("");
        int int72 = entities66.entityValue("");
        entities66.addEntity("", 97);
        org.apache.commons.lang.Entities entities76 = org.apache.commons.lang.Entities.HTML32;
        entities76.addEntity("hi!", 0);
        java.lang.String[][] strArray80 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities76.addEntities(strArray80);
        entities66.addEntities(strArray80);
        entities59.addEntities(strArray80);
        entities40.addEntities(strArray80);
        entities21.addEntities(strArray80);
        entities0.addEntities(strArray80);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(entities76);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.growBy = ' ';
        binaryEntityMap0.add("", (int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        java.lang.String str17 = binaryEntityMap13.name((int) '#');
        java.lang.String str19 = binaryEntityMap13.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str22 = binaryEntityMap20.name((int) (byte) 0);
        binaryEntityMap20.add("", (int) (byte) 0);
        binaryEntityMap20.growBy = 0;
        binaryEntityMap20.add("hi!", 2);
        binaryEntityMap20.size = (byte) 1;
        int[] intArray33 = binaryEntityMap20.values;
        int int34 = binaryEntityMap20.size;
        binaryEntityMap20.growBy = (short) 10;
        int[] intArray37 = binaryEntityMap20.values;
        binaryEntityMap13.values = intArray37;
        binaryEntityMap0.values = intArray37;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray37);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int22 = binaryEntityMap20.value("hi!");
        binaryEntityMap20.size = (byte) 100;
        entities0.map = binaryEntityMap20;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
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
        hashEntityMap0.add("", (int) (short) 0);
        java.util.Map map57 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        int[] intArray10 = binaryEntityMap0.values;
        int int11 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", 32);
        int[] intArray15 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        int int5 = binaryEntityMap1.value("hi!");
        java.lang.Class<?> wildcardClass6 = binaryEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name((int) '4');
        int int8 = hashEntityMap0.value("hi!");
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("hi!", (int) (short) -1);
        int int12 = hashEntityMap0.value("");
        java.lang.String str14 = hashEntityMap0.name((int) '#');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap15.add("hi!", (int) '4');
        int int26 = hashEntityMap15.value("");
        java.util.Map map27 = hashEntityMap15.mapNameToValue;
        java.util.Map map28 = hashEntityMap15.mapValueToName;
        java.lang.String str30 = hashEntityMap15.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int33 = hashEntityMap31.value("hi!");
        java.lang.String str35 = hashEntityMap31.name((int) (short) 0);
        hashEntityMap31.add("", 0);
        java.lang.String str40 = hashEntityMap31.name((int) (short) 10);
        java.lang.String str42 = hashEntityMap31.name(0);
        int int44 = hashEntityMap31.value("");
        java.util.Map map45 = hashEntityMap31.mapNameToValue;
        hashEntityMap15.mapValueToName = map45;
        hashEntityMap0.mapValueToName = map45;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        binaryEntityMap0.growBy = 97;
        binaryEntityMap0.add("", 0);
        java.lang.Class<?> wildcardClass25 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 'a';
        java.lang.String str10 = binaryEntityMap0.name(100);
        binaryEntityMap0.add("", (int) (short) 1);
        int int14 = binaryEntityMap0.size;
        int int15 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.size = (byte) 1;
        binaryEntityMap1.growBy = 100;
        binaryEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap10.size = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap1.names = strArray13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        int int14 = hashEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass15 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        int int10 = binaryEntityMap0.value("");
        int int11 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        entities0.addEntity("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str12 = binaryEntityMap0.name((int) (byte) 1);
        int int13 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str16 = binaryEntityMap14.name((int) (byte) 0);
        binaryEntityMap14.add("", (int) (byte) 0);
        binaryEntityMap14.growBy = 0;
        binaryEntityMap14.add("hi!", 2);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int27 = arrayEntityMap25.value("hi!");
        java.lang.String[] strArray28 = arrayEntityMap25.names;
        java.lang.String[] strArray29 = arrayEntityMap25.names;
        binaryEntityMap14.names = strArray29;
        java.lang.String str32 = binaryEntityMap14.name(1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        int int38 = binaryEntityMap33.value("");
        binaryEntityMap33.growBy = (short) 1;
        binaryEntityMap33.size = 100;
        binaryEntityMap33.add("", 100);
        binaryEntityMap33.add("hi!", (int) (byte) -1);
        int[] intArray49 = binaryEntityMap33.values;
        binaryEntityMap14.values = intArray49;
        binaryEntityMap0.values = intArray49;
        binaryEntityMap0.size = (byte) -1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap1.add("", 100);
        java.lang.String str6 = binaryEntityMap1.name(52);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        int int11 = arrayEntityMap8.growBy;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap8.names = strArray16;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str20 = binaryEntityMap18.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        java.lang.String[] strArray24 = binaryEntityMap21.names;
        binaryEntityMap21.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap21.names = strArray31;
        binaryEntityMap18.names = strArray31;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str36 = binaryEntityMap34.name((int) (byte) 0);
        int int38 = binaryEntityMap34.value("");
        binaryEntityMap34.add("", (int) (short) -1);
        int[] intArray42 = binaryEntityMap34.values;
        binaryEntityMap18.values = intArray42;
        arrayEntityMap8.values = intArray42;
        int[] intArray45 = arrayEntityMap8.values;
        binaryEntityMap1.values = intArray45;
        binaryEntityMap1.size = 3;
        java.lang.String str50 = binaryEntityMap1.name(3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(0);
        binaryEntityMap0.size = 'a';
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 32);
        java.lang.String str6 = hashEntityMap0.name((int) '#');
        java.lang.String str8 = hashEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String str13 = binaryEntityMap0.name((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.util.Map map28 = hashEntityMap0.mapNameToValue;
        java.lang.String str30 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap67.add("", (int) (byte) -1);
        java.util.Map map71 = hashEntityMap67.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        java.util.Map map74 = hashEntityMap72.mapValueToName;
        java.util.Map map75 = hashEntityMap72.mapNameToValue;
        hashEntityMap72.add("", (int) (byte) 10);
        int int80 = hashEntityMap72.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap81.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map86 = hashEntityMap85.mapNameToValue;
        hashEntityMap81.mapNameToValue = map86;
        hashEntityMap72.mapNameToValue = map86;
        hashEntityMap67.mapValueToName = map86;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap90 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map91 = hashEntityMap90.mapNameToValue;
        java.util.Map map92 = hashEntityMap90.mapValueToName;
        java.util.Map map93 = hashEntityMap90.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap94 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map95 = treeEntityMap94.mapNameToValue;
        hashEntityMap90.mapValueToName = map95;
        java.util.Map map97 = hashEntityMap90.mapValueToName;
        hashEntityMap67.mapValueToName = map97;
        hashEntityMap0.mapNameToValue = map97;
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
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        int int7 = arrayEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap9.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int15 = arrayEntityMap14.growBy;
        int int16 = arrayEntityMap14.size;
        arrayEntityMap14.size = (short) -1;
        arrayEntityMap14.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int23 = arrayEntityMap22.growBy;
        java.lang.String[] strArray24 = arrayEntityMap22.names;
        int int26 = arrayEntityMap22.value("");
        int int27 = arrayEntityMap22.size;
        java.lang.String[] strArray28 = arrayEntityMap22.names;
        arrayEntityMap14.names = strArray28;
        binaryEntityMap9.names = strArray28;
        arrayEntityMap1.names = strArray28;
        int[] intArray32 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = 98;
        int int36 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
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
        java.lang.Class<?> wildcardClass30 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.unescape("hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        java.lang.Class<?> wildcardClass18 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { null });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap1.names = strArray9;
        arrayEntityMap1.add("", (int) (short) 100);
        java.lang.String[] strArray14 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name(0);
        java.lang.String str17 = lookupEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.size = 3;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.String str34 = hashEntityMap0.name((int) (short) 1);
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
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) -1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 100);
        int int10 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.size = 101;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        int int7 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 97);
        java.lang.String str12 = hashEntityMap0.name(97);
        java.lang.String str14 = hashEntityMap0.name(35);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str13 = binaryEntityMap0.name(97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        int int9 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 1);
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
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
        binaryEntityMap0.size = (short) -1;
        java.lang.String str26 = binaryEntityMap0.name((int) (short) 10);
        int[] intArray27 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(intArray27);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        int int7 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = binaryEntityMap0.name(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.lang.String str4 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap32.mapNameToValue = map38;
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        int int43 = hashEntityMap32.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        java.util.Map map46 = hashEntityMap44.mapValueToName;
        java.util.Map map47 = hashEntityMap44.mapNameToValue;
        hashEntityMap32.mapValueToName = map47;
        hashEntityMap30.mapValueToName = map47;
        java.util.Map map50 = hashEntityMap30.mapValueToName;
        java.util.Map map51 = hashEntityMap30.mapValueToName;
        hashEntityMap0.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        int int7 = arrayEntityMap1.value("");
        int int9 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
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
        primitiveEntityMap0.add("", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(0);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = '4';
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.util.Map map36 = hashEntityMap33.mapNameToValue;
        hashEntityMap33.add("", (int) (byte) 10);
        int int41 = hashEntityMap33.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap42.mapNameToValue = map47;
        hashEntityMap33.mapNameToValue = map47;
        hashEntityMap33.add("", (int) (short) 0);
        hashEntityMap33.add("hi!", (int) '4');
        java.util.Map map56 = hashEntityMap33.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map58 = hashEntityMap57.mapNameToValue;
        java.util.Map map59 = hashEntityMap57.mapValueToName;
        int int61 = hashEntityMap57.value("");
        int int63 = hashEntityMap57.value("hi!");
        java.util.Map map64 = hashEntityMap57.mapValueToName;
        hashEntityMap33.mapValueToName = map64;
        hashEntityMap33.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap69 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int71 = hashEntityMap69.value("hi!");
        java.util.Map map72 = hashEntityMap69.mapValueToName;
        int int74 = hashEntityMap69.value("");
        java.util.Map map75 = hashEntityMap69.mapNameToValue;
        hashEntityMap69.add("", (int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = hashEntityMap79.mapNameToValue;
        java.util.Map map81 = hashEntityMap79.mapValueToName;
        java.util.Map map82 = hashEntityMap79.mapNameToValue;
        java.util.Map map83 = hashEntityMap79.mapValueToName;
        java.util.Map map84 = hashEntityMap79.mapNameToValue;
        java.util.Map map85 = hashEntityMap79.mapValueToName;
        java.util.Map map86 = hashEntityMap79.mapValueToName;
        hashEntityMap69.mapNameToValue = map86;
        hashEntityMap33.mapNameToValue = map86;
        java.util.Map map89 = hashEntityMap33.mapNameToValue;
        hashEntityMap0.mapValueToName = map89;
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
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        int int14 = hashEntityMap0.value("hi!");
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int18 = hashEntityMap16.value("hi!");
        java.util.Map map19 = hashEntityMap16.mapValueToName;
        int int21 = hashEntityMap16.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap23.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        hashEntityMap23.mapNameToValue = map28;
        hashEntityMap22.mapNameToValue = map28;
        java.util.Map map31 = hashEntityMap22.mapNameToValue;
        hashEntityMap16.mapNameToValue = map31;
        java.lang.String str34 = hashEntityMap16.name((int) '#');
        java.lang.String str36 = hashEntityMap16.name(0);
        java.util.Map map37 = hashEntityMap16.mapValueToName;
        hashEntityMap16.add("", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        hashEntityMap16.mapValueToName = map42;
        java.util.Map map44 = hashEntityMap16.mapValueToName;
        hashEntityMap0.mapValueToName = map44;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        java.util.Map map27 = hashEntityMap0.mapValueToName;
        java.util.Map map28 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) '#');
        binaryEntityMap0.add("", 0);
        java.lang.String str15 = binaryEntityMap0.name((-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        java.lang.String str20 = entities0.entityName((int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("", 2);
        int[] intArray14 = binaryEntityMap0.values;
        binaryEntityMap0.growBy = 101;
        java.lang.String str18 = binaryEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
        java.lang.Class<?> wildcardClass13 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        java.lang.String str8 = entities0.entityName((int) '4');
        entities0.addEntity("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(52);
        lookupEntityMap0.add("", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = lookupEntityMap0.name((int) (byte) -1);
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
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        java.lang.String str13 = entities0.entityName((int) (short) 10);
        int int15 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        java.lang.String str15 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        primitiveEntityMap0.add("hi!", 10);
        int int17 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (short) 100);
        primitiveEntityMap0.add("", (int) ' ');
        java.lang.String str25 = primitiveEntityMap0.name(100);
        primitiveEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        arrayEntityMap1.size = 100;
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        lookupEntityMap0.add("", (int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str8 = entities0.unescape("hi!");
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.growBy = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int15 = binaryEntityMap13.value("");
        java.lang.String str17 = binaryEntityMap13.name((int) (short) 0);
        int int18 = binaryEntityMap13.size;
        int int19 = binaryEntityMap13.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray22 = arrayEntityMap21.names;
        binaryEntityMap13.names = strArray22;
        int int25 = binaryEntityMap13.value("");
        java.lang.String[] strArray26 = binaryEntityMap13.names;
        binaryEntityMap0.names = strArray26;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { null });
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        entities0.addEntity("hi!", 10);
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.entityName((-1));
        int int12 = entities0.entityValue("hi!");
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        int int17 = entities0.entityValue("");
        int int19 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        binaryEntityMap0.growBy = (short) 0;
        java.lang.String str19 = binaryEntityMap0.name(97);
        int int20 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity((int) (short) 10);
        java.lang.String str24 = binaryEntityMap0.name((int) (byte) 1);
        int int26 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        int int26 = hashEntityMap0.value("hi!");
        int int28 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
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
        entities0.addEntity("", (-1));
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        int int20 = hashEntityMap0.value("");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        hashEntityMap0.add("hi!", (int) (byte) 0);
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.lang.String str4 = hashEntityMap0.name(100);
        java.lang.String str6 = hashEntityMap0.name(32);
        int int8 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.ensureCapacity(52);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        java.lang.String str12 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int15 = binaryEntityMap13.value("");
        java.lang.String str17 = binaryEntityMap13.name((int) (short) 0);
        int int18 = binaryEntityMap13.size;
        int int19 = binaryEntityMap13.growBy;
        binaryEntityMap13.size = 'a';
        java.lang.String str23 = binaryEntityMap13.name(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int25 = binaryEntityMap24.growBy;
        binaryEntityMap24.add("", (int) (short) 100);
        binaryEntityMap24.size = (byte) 100;
        int int31 = binaryEntityMap24.size;
        int int32 = binaryEntityMap24.growBy;
        binaryEntityMap24.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap36.ensureCapacity((int) 'a');
        arrayEntityMap36.growBy = (byte) 100;
        arrayEntityMap36.ensureCapacity(10);
        java.lang.String str44 = arrayEntityMap36.name((int) (byte) 1);
        int[] intArray45 = arrayEntityMap36.values;
        binaryEntityMap24.values = intArray45;
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str49 = entities47.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities47.map = arrayEntityMap51;
        org.apache.commons.lang.Entities entities53 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str55 = entities53.unescape("");
        java.lang.String str57 = entities53.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray59 = new int[] {};
        binaryEntityMap58.values = intArray59;
        int int62 = binaryEntityMap58.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap63 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap64 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap64.growBy = (short) 10;
        java.lang.String[] strArray67 = binaryEntityMap64.names;
        arrayEntityMap63.names = strArray67;
        binaryEntityMap58.names = strArray67;
        int int71 = binaryEntityMap58.value("hi!");
        entities53.map = binaryEntityMap58;
        java.lang.String str74 = binaryEntityMap58.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap75 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap75.growBy = (short) 10;
        int[] intArray78 = binaryEntityMap75.values;
        binaryEntityMap58.values = intArray78;
        arrayEntityMap51.values = intArray78;
        binaryEntityMap24.values = intArray78;
        binaryEntityMap13.values = intArray78;
        entities0.map = binaryEntityMap13;
        entities0.addEntity("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(entities53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] {});
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(intArray78);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.lang.String str3 = hashEntityMap0.name((int) (byte) 0);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        int int15 = hashEntityMap7.value("");
        java.util.Map map16 = hashEntityMap7.mapNameToValue;
        hashEntityMap5.mapNameToValue = map16;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        java.util.Map map21 = hashEntityMap18.mapNameToValue;
        java.util.Map map22 = hashEntityMap18.mapValueToName;
        hashEntityMap5.mapValueToName = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        java.util.Map map27 = hashEntityMap24.mapNameToValue;
        hashEntityMap24.add("", (int) (byte) 10);
        int int32 = hashEntityMap24.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap24.mapNameToValue = map38;
        hashEntityMap5.mapNameToValue = map38;
        java.util.Map map42 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapValueToName = map42;
        int int45 = hashEntityMap0.value("");
        java.lang.String str47 = hashEntityMap0.name(2);
        hashEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.lang.String str11 = hashEntityMap0.name((int) (short) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int14 = hashEntityMap12.value("hi!");
        java.lang.String str16 = hashEntityMap12.name((int) (short) 0);
        java.util.Map map17 = hashEntityMap12.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        hashEntityMap18.mapNameToValue = map24;
        java.util.Map map27 = hashEntityMap18.mapNameToValue;
        int int29 = hashEntityMap18.value("hi!");
        hashEntityMap18.add("", (int) (byte) 0);
        java.lang.String str34 = hashEntityMap18.name((int) (short) 0);
        java.lang.String str36 = hashEntityMap18.name((int) (byte) 0);
        java.util.Map map37 = hashEntityMap18.mapNameToValue;
        hashEntityMap12.mapValueToName = map37;
        hashEntityMap0.mapNameToValue = map37;
        hashEntityMap0.add("", 52);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
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
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap24 = entities0.map;
        entities0.addEntity("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap22);
        org.junit.Assert.assertNotNull(entityMap24);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap5.growBy = (short) 10;
        java.lang.String[] strArray8 = binaryEntityMap5.names;
        arrayEntityMap4.names = strArray8;
        int[] intArray10 = arrayEntityMap4.values;
        binaryEntityMap0.values = intArray10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        int int17 = binaryEntityMap12.value("");
        binaryEntityMap12.growBy = (short) 1;
        binaryEntityMap12.size = 100;
        binaryEntityMap12.add("", 100);
        java.lang.String[] strArray25 = binaryEntityMap12.names;
        binaryEntityMap0.names = strArray25;
        binaryEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap31.ensureCapacity((int) 'a');
        arrayEntityMap31.ensureCapacity(0);
        arrayEntityMap31.add("hi!", 100);
        java.lang.String str40 = arrayEntityMap31.name((int) 'a');
        int int42 = arrayEntityMap31.value("");
        int[] intArray43 = arrayEntityMap31.values;
        int[] intArray44 = arrayEntityMap31.values;
        binaryEntityMap0.values = intArray44;
        java.lang.String str47 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        int[] intArray13 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        hashEntityMap40.mapNameToValue = map46;
        java.util.Map map49 = hashEntityMap40.mapNameToValue;
        int int51 = hashEntityMap40.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap40.mapValueToName = map55;
        hashEntityMap38.mapValueToName = map55;
        java.util.Map map58 = hashEntityMap38.mapValueToName;
        hashEntityMap0.mapNameToValue = map58;
        java.lang.String str61 = hashEntityMap0.name(2);
        int int63 = hashEntityMap0.value("");
        java.util.Map map64 = hashEntityMap0.mapNameToValue;
        int int66 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        java.util.Map map9 = hashEntityMap7.mapValueToName;
        int int11 = hashEntityMap7.value("");
        hashEntityMap7.add("", 1);
        java.util.Map map15 = hashEntityMap7.mapValueToName;
        hashEntityMap0.mapValueToName = map15;
        hashEntityMap0.add("hi!", (int) '4');
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 32);
        java.lang.String str9 = binaryEntityMap0.name(3);
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        int int13 = lookupEntityMap0.value("");
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        int int11 = binaryEntityMap0.size;
        int[] intArray12 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        int int21 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        int int11 = binaryEntityMap0.growBy;
        int int13 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        entities0.addEntity("", (int) (byte) -1);
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str34 = entities32.unescape("");
        java.lang.String str36 = entities32.entityName((int) (short) 0);
        java.lang.String str38 = entities32.entityName(1);
        java.lang.String str40 = entities32.escape("");
        int int42 = entities32.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap43 = entities32.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities32);
        org.apache.commons.lang.Entities entities45 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str47 = entities45.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities45.map = arrayEntityMap49;
        entities45.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities45);
        org.apache.commons.lang.Entities entities55 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str57 = entities55.unescape("");
        java.lang.String str59 = entities55.entityName((int) (short) 0);
        java.lang.String str61 = entities55.unescape("hi!");
        org.apache.commons.lang.Entities entities62 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str64 = entities62.unescape("");
        int int66 = entities62.entityValue("");
        int int68 = entities62.entityValue("");
        entities62.addEntity("", 97);
        org.apache.commons.lang.Entities entities72 = org.apache.commons.lang.Entities.HTML32;
        entities72.addEntity("hi!", 0);
        java.lang.String[][] strArray76 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities72.addEntities(strArray76);
        entities62.addEntities(strArray76);
        entities55.addEntities(strArray76);
        entities45.addEntities(strArray76);
        entities32.addEntities(strArray76);
        entities0.addEntities(strArray76);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertNotNull(entities45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(entities55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(entities62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        org.junit.Assert.assertNotNull(entities72);
        org.junit.Assert.assertNotNull(strArray76);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
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
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str21 = entities19.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities19.map = arrayEntityMap23;
        int int25 = arrayEntityMap23.size;
        int[] intArray26 = arrayEntityMap23.values;
        arrayEntityMap1.values = intArray26;
        int int28 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap(52);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int33 = arrayEntityMap31.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap35.growBy = (short) 10;
        java.lang.String[] strArray38 = binaryEntityMap35.names;
        arrayEntityMap34.names = strArray38;
        int[] intArray40 = arrayEntityMap34.values;
        arrayEntityMap31.values = intArray40;
        binaryEntityMap30.values = intArray40;
        arrayEntityMap1.values = intArray40;
        int int45 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(52);
        java.lang.String str16 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map17 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        java.util.Map map21 = hashEntityMap18.mapNameToValue;
        hashEntityMap18.add("", (int) (byte) 10);
        int int26 = hashEntityMap18.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        hashEntityMap18.mapNameToValue = map32;
        java.lang.String str36 = hashEntityMap18.name((int) 'a');
        hashEntityMap18.add("", (int) (short) 1);
        java.lang.String str41 = hashEntityMap18.name(100);
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
        int int80 = hashEntityMap42.value("hi!");
        java.util.Map map81 = hashEntityMap42.mapNameToValue;
        hashEntityMap18.mapNameToValue = map81;
        hashEntityMap0.mapValueToName = map81;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str41);
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
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        java.lang.String str23 = lookupEntityMap0.name((int) (byte) 1);
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
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        java.lang.String str27 = entityMap25.name(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", 3);
        binaryEntityMap0.size = 35;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        binaryEntityMap11.add("", (int) (byte) 0);
        binaryEntityMap11.growBy = 0;
        binaryEntityMap11.add("hi!", 2);
        binaryEntityMap11.size = (byte) 1;
        int[] intArray24 = binaryEntityMap11.values;
        int int25 = binaryEntityMap11.size;
        binaryEntityMap11.growBy = (short) 10;
        int[] intArray28 = binaryEntityMap11.values;
        int[] intArray29 = binaryEntityMap11.values;
        binaryEntityMap0.values = intArray29;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        int[] intArray8 = arrayEntityMap1.values;
        int int9 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        binaryEntityMap0.growBy = ' ';
        int int13 = binaryEntityMap0.growBy;
        java.lang.String str15 = binaryEntityMap0.name(2);
        int int17 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        java.lang.String str33 = hashEntityMap28.name((int) 'a');
        java.util.Map map34 = hashEntityMap28.mapValueToName;
        hashEntityMap7.mapValueToName = map34;
        java.util.Map map36 = hashEntityMap7.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap38.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        hashEntityMap38.mapNameToValue = map43;
        hashEntityMap37.mapNameToValue = map43;
        hashEntityMap7.mapValueToName = map43;
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
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        java.lang.String str20 = arrayEntityMap1.name((int) 'a');
        java.lang.String[] strArray21 = arrayEntityMap1.names;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.ensureCapacity((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray21);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap7.ensureCapacity((int) 'a');
        int int10 = arrayEntityMap7.growBy;
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap7.names = strArray15;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str19 = binaryEntityMap17.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        binaryEntityMap20.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        java.lang.String[] strArray30 = binaryEntityMap27.names;
        binaryEntityMap20.names = strArray30;
        binaryEntityMap17.names = strArray30;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        int int37 = binaryEntityMap33.value("");
        binaryEntityMap33.add("", (int) (short) -1);
        int[] intArray41 = binaryEntityMap33.values;
        binaryEntityMap17.values = intArray41;
        arrayEntityMap7.values = intArray41;
        binaryEntityMap0.values = intArray41;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int48 = binaryEntityMap46.value("hi!");
        int[] intArray49 = binaryEntityMap46.values;
        binaryEntityMap0.values = intArray49;
        int int52 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int[] intArray5 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int7 = binaryEntityMap6.growBy;
        binaryEntityMap6.add("", (int) (short) 100);
        binaryEntityMap6.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap14.ensureCapacity((int) 'a');
        arrayEntityMap14.ensureCapacity(0);
        arrayEntityMap14.add("hi!", 100);
        java.lang.String str23 = arrayEntityMap14.name((int) 'a');
        int int25 = arrayEntityMap14.value("");
        arrayEntityMap14.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap30.ensureCapacity((int) 'a');
        int int33 = arrayEntityMap30.growBy;
        java.lang.String[] strArray34 = arrayEntityMap30.names;
        arrayEntityMap14.names = strArray34;
        binaryEntityMap6.names = strArray34;
        binaryEntityMap0.names = strArray34;
        binaryEntityMap0.add("hi!", (int) ' ');
        int int41 = binaryEntityMap0.size;
        java.lang.Class<?> wildcardClass42 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        int int15 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 10;
        arrayEntityMap1.add("hi!", (int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        java.lang.String str25 = binaryEntityMap21.name(32);
        int[] intArray26 = binaryEntityMap21.values;
        arrayEntityMap1.values = intArray26;
        java.lang.String str29 = arrayEntityMap1.name((int) (byte) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        java.lang.String str19 = binaryEntityMap10.name(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
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
        int int24 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        binaryEntityMap1.add("", 35);
        binaryEntityMap1.add("", 52);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        java.util.Map map56 = null;
        hashEntityMap0.mapValueToName = map56;
        java.util.Map map58 = hashEntityMap0.mapNameToValue;
        int int60 = hashEntityMap0.value("");
        java.util.Map map61 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(map61);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        java.lang.String str10 = entities6.entityName(100);
        java.lang.String str12 = entities6.entityName((int) ' ');
        java.lang.String str14 = entities6.entityName(10);
        java.lang.String str16 = entities6.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int19 = hashEntityMap17.value("hi!");
        java.util.Map map20 = hashEntityMap17.mapValueToName;
        int int22 = hashEntityMap17.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        hashEntityMap23.mapNameToValue = map29;
        java.util.Map map32 = hashEntityMap23.mapNameToValue;
        hashEntityMap17.mapNameToValue = map32;
        entities6.map = hashEntityMap17;
        hashEntityMap17.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap38.mapNameToValue = map44;
        java.util.Map map47 = hashEntityMap38.mapNameToValue;
        hashEntityMap38.add("", (int) (byte) 1);
        hashEntityMap38.add("", 0);
        java.util.Map map54 = hashEntityMap38.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap55.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        hashEntityMap55.mapNameToValue = map60;
        int int63 = hashEntityMap55.value("");
        java.util.Map map64 = hashEntityMap55.mapNameToValue;
        hashEntityMap38.mapNameToValue = map64;
        hashEntityMap17.mapValueToName = map64;
        hashEntityMap0.mapNameToValue = map64;
        java.lang.String str69 = hashEntityMap0.name((int) (byte) 100);
        java.util.Map map70 = hashEntityMap0.mapNameToValue;
        java.util.Map map71 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap26.add("", (int) (byte) -1);
        java.util.Map map30 = hashEntityMap26.mapNameToValue;
        hashEntityMap26.add("", (int) (byte) 1);
        java.lang.String str35 = hashEntityMap26.name((-1));
        hashEntityMap26.add("hi!", (int) (byte) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap39.add("hi!", (int) 'a');
        int int50 = hashEntityMap39.value("");
        java.util.Map map51 = hashEntityMap39.mapValueToName;
        hashEntityMap26.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap26.mapNameToValue;
        hashEntityMap0.mapValueToName = map53;
        int int56 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        java.lang.String[] strArray30 = binaryEntityMap27.names;
        binaryEntityMap27.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        binaryEntityMap27.names = strArray37;
        binaryEntityMap27.ensureCapacity((int) (short) 0);
        java.lang.String str42 = binaryEntityMap27.name((int) 'a');
        binaryEntityMap27.size = 1;
        binaryEntityMap27.growBy = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap47 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str49 = binaryEntityMap47.name((int) (byte) 0);
        int int51 = binaryEntityMap47.value("");
        binaryEntityMap47.add("", (int) (short) -1);
        binaryEntityMap47.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap59 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap59.ensureCapacity((int) 'a');
        arrayEntityMap59.ensureCapacity(0);
        java.lang.String[] strArray64 = arrayEntityMap59.names;
        binaryEntityMap47.names = strArray64;
        binaryEntityMap27.names = strArray64;
        int[] intArray67 = binaryEntityMap27.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap69 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        int[] intArray70 = binaryEntityMap69.values;
        binaryEntityMap27.values = intArray70;
        binaryEntityMap0.values = intArray70;
        binaryEntityMap0.add("hi!", (int) '#');
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
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(intArray70);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        hashEntityMap20.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap20.mapNameToValue = map25;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        hashEntityMap20.mapValueToName = map28;
        int int31 = hashEntityMap20.value("");
        java.util.Map map32 = hashEntityMap20.mapNameToValue;
        hashEntityMap0.mapValueToName = map32;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
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
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str28 = entities26.unescape("");
        java.lang.String str30 = entities26.entityName(100);
        java.lang.String str32 = entities26.entityName((int) ' ');
        java.lang.String str34 = entities26.entityName(10);
        java.lang.String str36 = entities26.escape("hi!");
        java.lang.String str38 = entities26.unescape("");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer40 = null;
        entities39.escape(writer40, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap43 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities39.map = primitiveEntityMap43;
        java.lang.String str46 = entities39.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer48 = null;
        entities47.escape(writer48, "");
        java.lang.String[][] strArray51 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities47.addEntities(strArray51);
        entities39.addEntities(strArray51);
        entities26.addEntities(strArray51);
        entities0.addEntities(strArray51);
        int int57 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int59 = binaryEntityMap58.growBy;
        binaryEntityMap58.add("", (int) ' ');
        java.lang.String str64 = binaryEntityMap58.name((int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap66.ensureCapacity((int) 'a');
        arrayEntityMap66.ensureCapacity(0);
        java.lang.String[] strArray71 = arrayEntityMap66.names;
        binaryEntityMap58.names = strArray71;
        java.lang.String str74 = binaryEntityMap58.name((int) (short) -1);
        entities0.map = binaryEntityMap58;
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
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        int int9 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap11.ensureCapacity((int) 'a');
        arrayEntityMap11.ensureCapacity(0);
        arrayEntityMap11.add("hi!", 100);
        java.lang.String str20 = arrayEntityMap11.name((int) 'a');
        int int22 = arrayEntityMap11.value("");
        arrayEntityMap11.add("hi!", (int) (byte) 0);
        arrayEntityMap11.growBy = (byte) 10;
        arrayEntityMap11.add("hi!", (int) (short) 1);
        int int32 = arrayEntityMap11.value("hi!");
        int[] intArray33 = arrayEntityMap11.values;
        binaryEntityMap0.values = intArray33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.add("hi!", 2);
        int int6 = arrayEntityMap0.size;
        java.lang.String str8 = arrayEntityMap0.name((int) (short) -1);
        int int9 = arrayEntityMap0.growBy;
        int[] intArray10 = arrayEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) ' ');
        int int11 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("hi!", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        binaryEntityMap0.growBy = 2;
        binaryEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.lang.String str14 = hashEntityMap0.name(52);
        java.lang.String str16 = hashEntityMap0.name((int) (short) 100);
        java.util.Map map17 = hashEntityMap0.mapValueToName;
        int int19 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.lang.String str9 = hashEntityMap0.name(35);
        hashEntityMap0.add("hi!", (int) (short) 10);
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
        java.util.Map map28 = hashEntityMap13.mapValueToName;
        java.lang.String str30 = hashEntityMap13.name((int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        java.util.Map map33 = hashEntityMap31.mapValueToName;
        java.util.Map map34 = hashEntityMap31.mapNameToValue;
        hashEntityMap31.add("", (int) (byte) 10);
        int int39 = hashEntityMap31.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap40.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        hashEntityMap40.mapNameToValue = map45;
        hashEntityMap31.mapNameToValue = map45;
        hashEntityMap13.mapValueToName = map45;
        java.util.Map map49 = hashEntityMap13.mapValueToName;
        hashEntityMap0.mapValueToName = map49;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.lang.String str41 = hashEntityMap38.name((int) (byte) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap43.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        hashEntityMap43.mapNameToValue = map48;
        hashEntityMap42.mapNameToValue = map48;
        hashEntityMap38.mapNameToValue = map48;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap52.add("", (int) (byte) 10);
        int int60 = hashEntityMap52.value("");
        java.lang.String str62 = hashEntityMap52.name((int) (byte) 10);
        java.lang.String str64 = hashEntityMap52.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int67 = hashEntityMap65.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        hashEntityMap65.mapNameToValue = map69;
        hashEntityMap52.mapNameToValue = map69;
        java.util.Map map72 = hashEntityMap52.mapValueToName;
        hashEntityMap38.mapNameToValue = map72;
        hashEntityMap0.mapNameToValue = map72;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = hashEntityMap75.mapNameToValue;
        java.util.Map map77 = hashEntityMap75.mapValueToName;
        java.util.Map map78 = hashEntityMap75.mapNameToValue;
        java.util.Map map79 = hashEntityMap75.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int82 = hashEntityMap80.value("hi!");
        java.util.Map map83 = hashEntityMap80.mapValueToName;
        int int85 = hashEntityMap80.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap86 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap87 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap87.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap91 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map92 = hashEntityMap91.mapNameToValue;
        hashEntityMap87.mapNameToValue = map92;
        hashEntityMap86.mapNameToValue = map92;
        java.util.Map map95 = hashEntityMap86.mapNameToValue;
        hashEntityMap80.mapNameToValue = map95;
        hashEntityMap75.mapValueToName = map95;
        hashEntityMap0.mapValueToName = map95;
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.add("hi!", (int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap9.ensureCapacity((int) 'a');
        int int12 = arrayEntityMap9.growBy;
        java.lang.String[] strArray13 = arrayEntityMap9.names;
        binaryEntityMap0.names = strArray13;
        binaryEntityMap0.size = 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 10);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map4 = hashEntityMap3.mapNameToValue;
        hashEntityMap0.mapNameToValue = map4;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        java.util.Map map7 = null;
        hashEntityMap0.mapValueToName = map7;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(1);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) 0);
        java.lang.String str5 = binaryEntityMap1.name(97);
        int int6 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("hi!");
        int int6 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 10);
        int int11 = primitiveEntityMap0.value("");
        int int13 = primitiveEntityMap0.value("");
        int int15 = primitiveEntityMap0.value("");
        int int17 = primitiveEntityMap0.value("hi!");
        java.lang.String str19 = primitiveEntityMap0.name((int) 'a');
        java.lang.String str21 = primitiveEntityMap0.name(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        entities0.escape(writer24, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.entityName((int) (short) 1);
        java.lang.String str12 = entities0.entityName((int) '#');
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer16, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        hashEntityMap6.mapNameToValue = map12;
        java.util.Map map15 = hashEntityMap6.mapNameToValue;
        int int17 = hashEntityMap6.value("hi!");
        hashEntityMap6.add("", (int) (byte) 0);
        java.lang.String str22 = hashEntityMap6.name((int) (short) 0);
        java.lang.String str24 = hashEntityMap6.name((int) (byte) 0);
        java.util.Map map25 = hashEntityMap6.mapNameToValue;
        hashEntityMap0.mapValueToName = map25;
        hashEntityMap0.add("hi!", (-1));
        java.util.Map map30 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer32 = null;
        entities31.escape(writer32, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap35 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities31.map = primitiveEntityMap35;
        java.lang.String str38 = entities31.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer40 = null;
        entities39.escape(writer40, "");
        java.lang.String[][] strArray43 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities39.addEntities(strArray43);
        entities31.addEntities(strArray43);
        java.lang.String str47 = entities31.escape("");
        java.lang.String str49 = entities31.unescape("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        java.util.Map map52 = hashEntityMap50.mapValueToName;
        int int54 = hashEntityMap50.value("");
        int int56 = hashEntityMap50.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap57.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        hashEntityMap57.mapNameToValue = map62;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        hashEntityMap57.mapValueToName = map65;
        hashEntityMap50.mapValueToName = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        java.util.Map map70 = hashEntityMap68.mapValueToName;
        int int72 = hashEntityMap68.value("");
        java.util.Map map73 = hashEntityMap68.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int76 = hashEntityMap74.value("hi!");
        java.util.Map map77 = hashEntityMap74.mapValueToName;
        int int79 = hashEntityMap74.value("");
        java.util.Map map80 = hashEntityMap74.mapNameToValue;
        hashEntityMap68.mapNameToValue = map80;
        hashEntityMap50.mapValueToName = map80;
        entities31.map = hashEntityMap50;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap84 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map85 = treeEntityMap84.mapNameToValue;
        hashEntityMap50.mapValueToName = map85;
        hashEntityMap0.mapValueToName = map85;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(2);
        int int10 = binaryEntityMap0.value("");
        java.lang.String str12 = binaryEntityMap0.name((int) '4');
        java.lang.String str14 = binaryEntityMap0.name(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        int int7 = lookupEntityMap0.value("");
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        int[] intArray13 = binaryEntityMap0.values;
        int int14 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        java.lang.String str18 = hashEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) ' ');
        java.lang.String str14 = lookupEntityMap0.name((int) (byte) 0);
        int int16 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(100);
        java.lang.String str12 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        int[] intArray2 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", 52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        int int23 = arrayEntityMap16.value("");
        java.lang.String str25 = arrayEntityMap16.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        java.util.Map map18 = hashEntityMap15.mapNameToValue;
        hashEntityMap15.add("", (int) (byte) 10);
        java.util.Map map22 = hashEntityMap15.mapNameToValue;
        hashEntityMap0.mapValueToName = map22;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        binaryEntityMap0.growBy = 2;
        java.lang.String[] strArray24 = binaryEntityMap0.names;
        int int25 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name((int) '4');
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.lang.String str3 = hashEntityMap0.name((int) (byte) 0);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap7.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapNameToValue;
        hashEntityMap7.mapNameToValue = map12;
        int int15 = hashEntityMap7.value("");
        java.util.Map map16 = hashEntityMap7.mapNameToValue;
        hashEntityMap5.mapNameToValue = map16;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        java.util.Map map21 = hashEntityMap18.mapNameToValue;
        java.util.Map map22 = hashEntityMap18.mapValueToName;
        hashEntityMap5.mapValueToName = map22;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        java.util.Map map27 = hashEntityMap24.mapNameToValue;
        hashEntityMap24.add("", (int) (byte) 10);
        int int32 = hashEntityMap24.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap24.mapNameToValue = map38;
        hashEntityMap5.mapNameToValue = map38;
        java.util.Map map42 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapValueToName = map42;
        int int45 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap48.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        hashEntityMap48.mapNameToValue = map53;
        int int56 = hashEntityMap48.value("");
        java.util.Map map57 = hashEntityMap48.mapNameToValue;
        hashEntityMap46.mapNameToValue = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        java.util.Map map61 = hashEntityMap59.mapValueToName;
        java.util.Map map62 = hashEntityMap59.mapNameToValue;
        java.util.Map map63 = hashEntityMap59.mapValueToName;
        hashEntityMap46.mapValueToName = map63;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        java.util.Map map67 = hashEntityMap65.mapValueToName;
        java.util.Map map68 = hashEntityMap65.mapNameToValue;
        hashEntityMap65.add("", (int) (byte) 10);
        int int73 = hashEntityMap65.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap74 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap74.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map79 = hashEntityMap78.mapNameToValue;
        hashEntityMap74.mapNameToValue = map79;
        hashEntityMap65.mapNameToValue = map79;
        hashEntityMap46.mapNameToValue = map79;
        int int84 = hashEntityMap46.value("hi!");
        java.util.Map map85 = hashEntityMap46.mapNameToValue;
        hashEntityMap0.mapValueToName = map85;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        int int13 = hashEntityMap0.value("hi!");
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        java.util.Map map18 = hashEntityMap15.mapNameToValue;
        hashEntityMap15.add("", (int) (byte) 10);
        int int23 = hashEntityMap15.value("");
        java.lang.String str25 = hashEntityMap15.name((int) (byte) 10);
        java.lang.String str27 = hashEntityMap15.name((int) (short) 0);
        java.lang.String str29 = hashEntityMap15.name(1);
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
        hashEntityMap15.mapNameToValue = map45;
        java.lang.String str49 = hashEntityMap15.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int52 = hashEntityMap50.value("hi!");
        java.lang.String str54 = hashEntityMap50.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapNameToValue;
        java.util.Map map57 = hashEntityMap55.mapValueToName;
        java.util.Map map58 = hashEntityMap55.mapNameToValue;
        hashEntityMap55.add("", (int) (byte) 10);
        int int63 = hashEntityMap55.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap64.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap68 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map69 = hashEntityMap68.mapNameToValue;
        hashEntityMap64.mapNameToValue = map69;
        hashEntityMap55.mapNameToValue = map69;
        java.lang.String str73 = hashEntityMap55.name((int) 'a');
        hashEntityMap55.add("", (int) (short) 1);
        java.util.Map map77 = hashEntityMap55.mapNameToValue;
        hashEntityMap50.mapNameToValue = map77;
        hashEntityMap15.mapValueToName = map77;
        java.util.Map map80 = hashEntityMap15.mapNameToValue;
        hashEntityMap0.mapNameToValue = map80;
        java.lang.Class<?> wildcardClass82 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", (int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        int int2 = entities0.entityValue("hi!");
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.unescape("hi!");
        java.lang.String str9 = entities0.entityName(10);
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        org.apache.commons.lang.Entities.EntityMap entityMap22 = entities0.map;
        java.io.Writer writer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer23, "");
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
        org.junit.Assert.assertNotNull(entityMap22);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        binaryEntityMap0.add("", (int) (byte) -1);
        binaryEntityMap0.growBy = (-1);
        java.lang.Class<?> wildcardClass35 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray7 = new int[] {};
        binaryEntityMap6.values = intArray7;
        int int10 = binaryEntityMap6.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        arrayEntityMap11.names = strArray15;
        binaryEntityMap6.names = strArray15;
        int int19 = binaryEntityMap6.value("hi!");
        java.lang.String str21 = binaryEntityMap6.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str25 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray28 = new int[] { (short) 0, (-1) };
        arrayEntityMap23.values = intArray28;
        binaryEntityMap6.values = intArray28;
        java.lang.String[] strArray31 = binaryEntityMap6.names;
        binaryEntityMap0.names = strArray31;
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) '#');
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int13 = binaryEntityMap12.growBy;
        binaryEntityMap12.add("", (int) (short) 100);
        binaryEntityMap12.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap20.ensureCapacity((int) 'a');
        arrayEntityMap20.ensureCapacity(0);
        arrayEntityMap20.add("hi!", 100);
        java.lang.String str29 = arrayEntityMap20.name((int) 'a');
        int int31 = arrayEntityMap20.value("");
        arrayEntityMap20.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap36.ensureCapacity((int) 'a');
        int int39 = arrayEntityMap36.growBy;
        java.lang.String[] strArray40 = arrayEntityMap36.names;
        arrayEntityMap20.names = strArray40;
        binaryEntityMap12.names = strArray40;
        java.lang.String[] strArray43 = binaryEntityMap12.names;
        binaryEntityMap0.names = strArray43;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap47 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str49 = binaryEntityMap47.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap50.growBy = (short) 10;
        java.lang.String[] strArray53 = binaryEntityMap50.names;
        binaryEntityMap50.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap57 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap57.growBy = (short) 10;
        java.lang.String[] strArray60 = binaryEntityMap57.names;
        binaryEntityMap50.names = strArray60;
        binaryEntityMap47.names = strArray60;
        int[] intArray63 = binaryEntityMap47.values;
        binaryEntityMap46.values = intArray63;
        int[] intArray65 = binaryEntityMap46.values;
        binaryEntityMap0.values = intArray65;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertNotNull(intArray65);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.ensureCapacity(0);
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String str15 = binaryEntityMap0.name(52);
        int int17 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        arrayEntityMap15.names = strArray19;
        int[] intArray21 = arrayEntityMap15.values;
        binaryEntityMap0.values = intArray21;
        binaryEntityMap0.size = 52;
        java.lang.String str26 = binaryEntityMap0.name(0);
        java.lang.String str28 = binaryEntityMap0.name((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap30.ensureCapacity((int) 'a');
        arrayEntityMap30.growBy = (byte) 100;
        arrayEntityMap30.ensureCapacity(10);
        java.lang.String str38 = arrayEntityMap30.name((int) (byte) 1);
        arrayEntityMap30.size = 0;
        int int42 = arrayEntityMap30.value("hi!");
        entities0.map = arrayEntityMap30;
        int int45 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(entityMap8);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int12 = entities0.entityValue("hi!");
        entities0.addEntity("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.entityName(97);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map11 = hashEntityMap10.mapNameToValue;
        java.util.Map map12 = hashEntityMap10.mapValueToName;
        java.util.Map map13 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", (int) (byte) 10);
        int int18 = hashEntityMap10.value("");
        java.lang.String str20 = hashEntityMap10.name((int) (byte) 10);
        hashEntityMap10.add("", (int) (byte) 10);
        java.util.Map map24 = hashEntityMap10.mapNameToValue;
        entities0.map = hashEntityMap10;
        java.lang.String str27 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", (int) (short) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        java.lang.String[] strArray27 = binaryEntityMap0.names;
        binaryEntityMap0.ensureCapacity(32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        java.lang.String[] strArray4 = arrayEntityMap0.names;
        int int5 = arrayEntityMap0.size;
        int int6 = arrayEntityMap0.size;
        int int7 = arrayEntityMap0.growBy;
        int[] intArray8 = arrayEntityMap0.values;
        int int9 = arrayEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap5.growBy = (short) 10;
        java.lang.String[] strArray8 = binaryEntityMap5.names;
        arrayEntityMap4.names = strArray8;
        int[] intArray10 = arrayEntityMap4.values;
        binaryEntityMap0.values = intArray10;
        int[] intArray12 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        java.lang.String str17 = binaryEntityMap13.name((int) '#');
        int[] intArray18 = binaryEntityMap13.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int20 = binaryEntityMap19.growBy;
        binaryEntityMap19.add("", (int) (short) 100);
        binaryEntityMap19.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap27.ensureCapacity((int) 'a');
        arrayEntityMap27.ensureCapacity(0);
        arrayEntityMap27.add("hi!", 100);
        java.lang.String str36 = arrayEntityMap27.name((int) 'a');
        int int38 = arrayEntityMap27.value("");
        arrayEntityMap27.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap43.ensureCapacity((int) 'a');
        int int46 = arrayEntityMap43.growBy;
        java.lang.String[] strArray47 = arrayEntityMap43.names;
        arrayEntityMap27.names = strArray47;
        binaryEntityMap19.names = strArray47;
        binaryEntityMap13.names = strArray47;
        binaryEntityMap0.names = strArray47;
        int[] intArray52 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(intArray52);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        entities0.addEntity("", (int) (short) 0);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer12 = null;
        entities11.escape(writer12, "");
        java.lang.String[][] strArray15 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities11.addEntities(strArray15);
        java.lang.String str18 = entities11.escape("hi!");
        java.lang.String str20 = entities11.unescape("");
        org.apache.commons.lang.Entities entities21 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str23 = entities21.unescape("");
        java.io.Writer writer24 = null;
        entities21.escape(writer24, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities21.map = arrayEntityMap28;
        java.lang.String str31 = arrayEntityMap28.name((int) (byte) 100);
        java.lang.String[] strArray32 = arrayEntityMap28.names;
        int int33 = arrayEntityMap28.size;
        entities11.map = arrayEntityMap28;
        java.lang.String str36 = entities11.unescape("hi!");
        org.apache.commons.lang.Entities entities37 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str39 = entities37.unescape("");
        java.lang.String str41 = entities37.entityName(100);
        java.lang.String str43 = entities37.entityName((int) ' ');
        java.lang.String str45 = entities37.entityName(10);
        java.lang.String str47 = entities37.escape("hi!");
        java.lang.String str49 = entities37.unescape("");
        org.apache.commons.lang.Entities entities50 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer51 = null;
        entities50.escape(writer51, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap54 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities50.map = primitiveEntityMap54;
        java.lang.String str57 = entities50.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities58 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer59 = null;
        entities58.escape(writer59, "");
        java.lang.String[][] strArray62 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities58.addEntities(strArray62);
        entities50.addEntities(strArray62);
        entities37.addEntities(strArray62);
        entities11.addEntities(strArray62);
        entities0.addEntities(strArray62);
        java.lang.String str69 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "4) test3354(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(entities37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(entities50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(entities58);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.lang.String str13 = entities0.entityName(2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "5) test3357(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.unescape("hi!");
        java.lang.String str12 = entities0.entityName((int) (byte) -1);
        java.lang.String str14 = entities0.escape("");
        java.lang.String str16 = entities0.entityName(3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        entities0.addEntity("", (int) '4');
        java.lang.String str8 = entities0.unescape("");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str11 = entities9.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities9.map = arrayEntityMap13;
        entities9.addEntity("", (int) ' ');
        java.lang.String str19 = entities9.unescape("");
        entities9.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer24 = null;
        entities23.escape(writer24, "");
        java.lang.String[][] strArray27 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities23.addEntities(strArray27);
        entities9.addEntities(strArray27);
        entities0.addEntities(strArray27);
        java.lang.String str32 = entities0.entityName(100);
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(entityMap33);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        binaryEntityMap0.growBy = ' ';
        int int13 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = (short) 100;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.add("", 2);
        int[] intArray14 = binaryEntityMap0.values;
        java.lang.String str16 = binaryEntityMap0.name(2);
        int int17 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int[] intArray4 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 100);
        binaryEntityMap0.ensureCapacity((int) (short) 10);
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        int int28 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "6) test3364(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int7 = lookupEntityMap0.value("");
        java.lang.String str9 = lookupEntityMap0.name((int) 'a');
        lookupEntityMap0.add("", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 100);
        int int14 = binaryEntityMap0.value("hi!");
        int int15 = binaryEntityMap0.size;
        java.lang.String str17 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        binaryEntityMap0.add("", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        binaryEntityMap16.add("", (int) (short) 100);
        java.lang.String str24 = binaryEntityMap16.name((int) (byte) 1);
        binaryEntityMap16.ensureCapacity((int) '#');
        java.lang.String[] strArray27 = binaryEntityMap16.names;
        binaryEntityMap0.names = strArray27;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        java.lang.String str26 = entities0.unescape("");
        java.lang.String str28 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.size = (byte) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.add("", (int) 'a');
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(100);
        binaryEntityMap0.add("hi!", (int) (short) -1);
        int int12 = binaryEntityMap0.value("");
        int int13 = binaryEntityMap0.size;
        binaryEntityMap0.size = (short) 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", 97);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        entities10.addEntity("hi!", 0);
        java.lang.String[][] strArray14 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities10.addEntities(strArray14);
        entities0.addEntities(strArray14);
        java.io.Writer writer17 = null;
        entities0.escape(writer17, "");
        java.lang.String str21 = entities0.unescape("");
        java.lang.String str23 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(0);
        java.lang.String str15 = lookupEntityMap0.name(0);
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        java.lang.String str12 = entities0.unescape("");
        java.lang.String str14 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int43 = hashEntityMap41.value("hi!");
        java.util.Map map44 = hashEntityMap41.mapValueToName;
        int int46 = hashEntityMap41.value("");
        java.util.Map map47 = hashEntityMap41.mapNameToValue;
        hashEntityMap41.add("", (int) (byte) 0);
        java.util.Map map51 = hashEntityMap41.mapValueToName;
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
        hashEntityMap41.mapValueToName = map88;
        hashEntityMap0.mapValueToName = map88;
        java.lang.String str92 = hashEntityMap0.name((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
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
        org.junit.Assert.assertNull(str92);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) 'a');
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str13 = entities11.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities11.map = arrayEntityMap15;
        entities11.addEntity("", (int) ' ');
        java.lang.String str21 = entities11.unescape("");
        entities11.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer26 = null;
        entities25.escape(writer26, "");
        java.lang.String[][] strArray29 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities25.addEntities(strArray29);
        entities11.addEntities(strArray29);
        entities0.addEntities(strArray29);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertNotNull(strArray29);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        java.util.Map map34 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        java.util.Map map21 = hashEntityMap18.mapNameToValue;
        hashEntityMap18.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        java.util.Map map29 = hashEntityMap25.mapNameToValue;
        java.util.Map map30 = hashEntityMap25.mapValueToName;
        hashEntityMap18.mapValueToName = map30;
        java.util.Map map32 = hashEntityMap18.mapNameToValue;
        hashEntityMap0.mapValueToName = map32;
        java.lang.String str35 = hashEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        int[] intArray11 = binaryEntityMap7.values;
        binaryEntityMap0.values = intArray11;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str16 = arrayEntityMap14.name((int) (short) 100);
        int[] intArray19 = new int[] { (short) 0, (-1) };
        arrayEntityMap14.values = intArray19;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str23 = binaryEntityMap21.name((int) (byte) 0);
        java.lang.String str25 = binaryEntityMap21.name((int) '#');
        binaryEntityMap21.growBy = (byte) 10;
        binaryEntityMap21.growBy = 1;
        int int30 = binaryEntityMap21.growBy;
        java.lang.String[] strArray31 = binaryEntityMap21.names;
        arrayEntityMap14.names = strArray31;
        binaryEntityMap0.names = strArray31;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        int[] intArray38 = binaryEntityMap34.values;
        int[] intArray39 = binaryEntityMap34.values;
        binaryEntityMap0.values = intArray39;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.growBy = ' ';
        int int16 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        binaryEntityMap1.ensureCapacity(1);
        binaryEntityMap1.add("hi!", 10);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str9 = entities7.unescape("");
        int int11 = entities7.entityValue("");
        int int13 = entities7.entityValue("");
        entities7.addEntity("", 97);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap17 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int19 = primitiveEntityMap17.value("hi!");
        primitiveEntityMap17.add("", (int) (short) 10);
        primitiveEntityMap17.add("", 0);
        java.lang.String str27 = primitiveEntityMap17.name((int) '#');
        java.lang.String str29 = primitiveEntityMap17.name(97);
        int int31 = primitiveEntityMap17.value("");
        int int33 = primitiveEntityMap17.value("");
        entities7.map = primitiveEntityMap17;
        org.apache.commons.lang.Entities.EntityMap entityMap35 = entities7.map;
        int int37 = entities7.entityValue("");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap39 = entities38.map;
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer41 = null;
        entities40.escape(writer41, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap44 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities40.map = primitiveEntityMap44;
        java.lang.String str47 = entities40.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer49 = null;
        entities48.escape(writer49, "");
        java.lang.String[][] strArray52 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities48.addEntities(strArray52);
        entities40.addEntities(strArray52);
        entities38.addEntities(strArray52);
        entities7.addEntities(strArray52);
        entities0.addEntities(strArray52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(entityMap35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNotNull(entityMap39);
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
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
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        entities0.addEntity("hi!", 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        java.lang.String str7 = binaryEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap9.ensureCapacity((int) 'a');
        arrayEntityMap9.ensureCapacity(0);
        arrayEntityMap9.add("hi!", 100);
        java.lang.String str18 = arrayEntityMap9.name((int) 'a');
        int[] intArray19 = arrayEntityMap9.values;
        binaryEntityMap0.values = intArray19;
        int int22 = binaryEntityMap0.value("");
        int[] intArray23 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        int int23 = binaryEntityMap18.value("");
        binaryEntityMap18.growBy = (short) 1;
        binaryEntityMap18.size = 100;
        binaryEntityMap18.add("", 100);
        java.lang.String[] strArray31 = binaryEntityMap18.names;
        java.lang.String[] strArray32 = binaryEntityMap18.names;
        binaryEntityMap0.names = strArray32;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        int[] intArray36 = arrayEntityMap35.values;
        binaryEntityMap0.values = intArray36;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap38.growBy = (short) 10;
        java.lang.String[] strArray41 = binaryEntityMap38.names;
        binaryEntityMap38.add("", (int) (short) 100);
        int[] intArray45 = binaryEntityMap38.values;
        java.lang.String str47 = binaryEntityMap38.name((int) (short) 1);
        binaryEntityMap38.growBy = (short) 10;
        binaryEntityMap38.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap52.growBy = (short) 10;
        binaryEntityMap52.add("", 97);
        binaryEntityMap52.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray61 = new int[] {};
        binaryEntityMap60.values = intArray61;
        int int64 = binaryEntityMap60.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap66 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap66.growBy = (short) 10;
        java.lang.String[] strArray69 = binaryEntityMap66.names;
        arrayEntityMap65.names = strArray69;
        binaryEntityMap60.names = strArray69;
        int int73 = binaryEntityMap60.value("hi!");
        java.lang.String str75 = binaryEntityMap60.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap77 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str79 = arrayEntityMap77.name((int) (short) 100);
        int[] intArray82 = new int[] { (short) 0, (-1) };
        arrayEntityMap77.values = intArray82;
        binaryEntityMap60.values = intArray82;
        binaryEntityMap52.values = intArray82;
        binaryEntityMap38.values = intArray82;
        binaryEntityMap0.values = intArray82;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] {});
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 0, (-1) });
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        java.lang.String str24 = lookupEntityMap0.name(52);
        java.lang.Class<?> wildcardClass25 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        int int9 = entities0.entityValue("hi!");
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str9 = hashEntityMap0.name((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        int int23 = lookupEntityMap0.value("");
        int int25 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.String str50 = entities0.unescape("hi!");
        java.lang.String str52 = entities0.unescape("");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int14 = hashEntityMap12.value("hi!");
        java.util.Map map15 = hashEntityMap12.mapValueToName;
        int int17 = hashEntityMap12.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        hashEntityMap18.mapNameToValue = map24;
        java.util.Map map27 = hashEntityMap18.mapNameToValue;
        hashEntityMap12.mapNameToValue = map27;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap29.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        hashEntityMap29.mapNameToValue = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap29.mapValueToName = map37;
        hashEntityMap12.mapNameToValue = map37;
        hashEntityMap0.mapNameToValue = map37;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map42 = hashEntityMap41.mapNameToValue;
        java.util.Map map43 = hashEntityMap41.mapValueToName;
        java.util.Map map44 = hashEntityMap41.mapNameToValue;
        java.util.Map map45 = hashEntityMap41.mapValueToName;
        java.lang.String str47 = hashEntityMap41.name((int) '4');
        hashEntityMap41.add("hi!", (int) (byte) 100);
        java.util.Map map51 = hashEntityMap41.mapNameToValue;
        hashEntityMap0.mapValueToName = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap55.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        hashEntityMap55.mapNameToValue = map60;
        int int63 = hashEntityMap55.value("");
        java.util.Map map64 = hashEntityMap55.mapNameToValue;
        hashEntityMap53.mapNameToValue = map64;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        java.util.Map map68 = hashEntityMap66.mapValueToName;
        java.util.Map map69 = hashEntityMap66.mapNameToValue;
        java.util.Map map70 = hashEntityMap66.mapValueToName;
        hashEntityMap53.mapValueToName = map70;
        hashEntityMap0.mapValueToName = map70;
        java.util.Map map73 = hashEntityMap0.mapValueToName;
        java.lang.String str75 = hashEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(2);
        int int10 = binaryEntityMap0.value("");
        java.lang.String str12 = binaryEntityMap0.name((int) '4');
        int[] intArray13 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        java.io.Writer writer16 = null;
        entities0.escape(writer16, "");
        org.apache.commons.lang.Entities.EntityMap entityMap19 = null;
        entities0.map = entityMap19;
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(entityMap21);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        java.util.Map map22 = hashEntityMap0.mapNameToValue;
        java.lang.String str24 = hashEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int2 = arrayEntityMap1.growBy;
        int int4 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        int int13 = hashEntityMap0.value("");
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", 32);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        java.lang.String[] strArray4 = arrayEntityMap0.names;
        int int5 = arrayEntityMap0.size;
        int int6 = arrayEntityMap0.size;
        int int7 = arrayEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        binaryEntityMap11.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        binaryEntityMap11.names = strArray21;
        binaryEntityMap8.names = strArray21;
        binaryEntityMap8.growBy = (short) 0;
        java.lang.String str27 = binaryEntityMap8.name(97);
        binaryEntityMap8.add("hi!", 35);
        java.lang.String str32 = binaryEntityMap8.name((int) (byte) 10);
        java.lang.String[] strArray33 = binaryEntityMap8.names;
        arrayEntityMap0.names = strArray33;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(52);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        int int31 = hashEntityMap0.value("hi!");
        int int33 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        int[] intArray18 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        int int23 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str5 = binaryEntityMap1.name((int) (byte) 1);
        binaryEntityMap1.add("", 98);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        int[] intArray12 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray17 = new int[] {};
        binaryEntityMap16.values = intArray17;
        int int20 = binaryEntityMap16.value("");
        java.lang.String str22 = binaryEntityMap16.name((int) (byte) 1);
        java.lang.String str24 = binaryEntityMap16.name(0);
        java.lang.String[] strArray25 = binaryEntityMap16.names;
        binaryEntityMap0.names = strArray25;
        int[] intArray32 = new int[] { 97, (byte) 10, 35, '#', (short) 1 };
        binaryEntityMap0.values = intArray32;
        int int34 = binaryEntityMap0.growBy;
        int int35 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 10, 35, 35, 1 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name(35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = lookupEntityMap0.name((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.lang.String str3 = hashEntityMap0.name((int) (byte) 0);
        hashEntityMap0.add("hi!", (int) (byte) 0);
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        int int9 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap11.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        hashEntityMap11.mapNameToValue = map16;
        hashEntityMap10.mapNameToValue = map16;
        java.util.Map map19 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", (int) (byte) 1);
        hashEntityMap10.add("", 0);
        java.util.Map map26 = hashEntityMap10.mapValueToName;
        hashEntityMap10.add("", 100);
        java.util.Map map30 = hashEntityMap10.mapNameToValue;
        hashEntityMap0.mapNameToValue = map30;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.util.Map map45 = hashEntityMap0.mapNameToValue;
        java.lang.String str47 = hashEntityMap0.name((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
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
        int int18 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap20.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap20.mapNameToValue = map25;
        hashEntityMap19.mapNameToValue = map25;
        java.util.Map map28 = hashEntityMap19.mapNameToValue;
        java.util.Map map29 = hashEntityMap19.mapNameToValue;
        hashEntityMap0.mapValueToName = map29;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        hashEntityMap31.mapNameToValue = map37;
        hashEntityMap0.mapValueToName = map37;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        arrayEntityMap1.add("hi!", 52);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(intArray40);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        int int53 = binaryEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap39.mapValueToName = map47;
        java.util.Map map49 = hashEntityMap39.mapValueToName;
        java.util.Map map50 = hashEntityMap39.mapNameToValue;
        hashEntityMap0.mapValueToName = map50;
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
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        org.apache.commons.lang.Entities.EntityMap entityMap19 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertNotNull(entityMap19);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("hi!", 0);
        int int14 = binaryEntityMap0.growBy;
        java.lang.String str16 = binaryEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities9.map = primitiveEntityMap13;
        int int16 = primitiveEntityMap13.value("");
        int int18 = primitiveEntityMap13.value("");
        primitiveEntityMap13.add("", (int) (byte) 1);
        entities0.map = primitiveEntityMap13;
        entities0.addEntity("", 100);
        entities0.addEntity("", 35);
        java.lang.String str30 = entities0.unescape("");
        java.lang.String str32 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        int int10 = entities0.entityValue("");
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) '#');
        int int12 = binaryEntityMap0.value("");
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        int[] intArray12 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray17 = new int[] {};
        binaryEntityMap16.values = intArray17;
        int int20 = binaryEntityMap16.value("");
        java.lang.String str22 = binaryEntityMap16.name((int) (byte) 1);
        java.lang.String str24 = binaryEntityMap16.name(0);
        java.lang.String[] strArray25 = binaryEntityMap16.names;
        binaryEntityMap0.names = strArray25;
        int[] intArray32 = new int[] { 97, (byte) 10, 35, '#', (short) 1 };
        binaryEntityMap0.values = intArray32;
        int int34 = binaryEntityMap0.growBy;
        int int35 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 10, 35, 35, 1 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) '4');
        primitiveEntityMap0.add("", 98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray2 = null;
        binaryEntityMap1.names = strArray2;
        java.lang.String str5 = binaryEntityMap1.name(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int8 = binaryEntityMap6.value("");
        java.lang.String str10 = binaryEntityMap6.name((int) (short) 0);
        int int11 = binaryEntityMap6.size;
        int int12 = binaryEntityMap6.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray15 = arrayEntityMap14.names;
        binaryEntityMap6.names = strArray15;
        int int18 = binaryEntityMap6.value("");
        java.lang.String[] strArray19 = binaryEntityMap6.names;
        binaryEntityMap1.names = strArray19;
        int[] intArray21 = binaryEntityMap1.values;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] {});
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int3 = binaryEntityMap1.value("");
        binaryEntityMap1.growBy = 100;
        int int6 = binaryEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        int[] intArray11 = binaryEntityMap7.values;
        int[] intArray12 = binaryEntityMap7.values;
        binaryEntityMap1.values = intArray12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", 0);
        int int15 = binaryEntityMap0.value("");
        int int16 = binaryEntityMap0.size;
        java.lang.String str18 = binaryEntityMap0.name(101);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.String str36 = binaryEntityMap0.name(98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int3 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (byte) 10);
        java.lang.String str8 = binaryEntityMap0.name((int) (short) -1);
        int int9 = binaryEntityMap0.size;
        binaryEntityMap0.add("hi!", 52);
        int int13 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str4 = binaryEntityMap2.name((int) (byte) 0);
        java.lang.String str6 = binaryEntityMap2.name((int) '#');
        binaryEntityMap2.growBy = (byte) 10;
        binaryEntityMap2.growBy = 1;
        java.lang.String[] strArray11 = binaryEntityMap2.names;
        binaryEntityMap1.names = strArray11;
        binaryEntityMap1.growBy = 97;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray16 = new int[] {};
        binaryEntityMap15.values = intArray16;
        int int19 = binaryEntityMap15.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap20 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        java.lang.String[] strArray24 = binaryEntityMap21.names;
        arrayEntityMap20.names = strArray24;
        binaryEntityMap15.names = strArray24;
        int int28 = binaryEntityMap15.value("hi!");
        java.lang.String str30 = binaryEntityMap15.name(0);
        binaryEntityMap15.growBy = 2;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        java.lang.String str37 = binaryEntityMap33.name((int) '#');
        int int39 = binaryEntityMap33.value("hi!");
        int[] intArray40 = binaryEntityMap33.values;
        binaryEntityMap33.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap45.ensureCapacity((int) 'a');
        arrayEntityMap45.ensureCapacity(0);
        arrayEntityMap45.add("hi!", 100);
        java.lang.String str54 = arrayEntityMap45.name((int) 'a');
        int int56 = arrayEntityMap45.value("");
        arrayEntityMap45.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap61 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap61.ensureCapacity((int) 'a');
        int int64 = arrayEntityMap61.growBy;
        java.lang.String[] strArray65 = arrayEntityMap61.names;
        arrayEntityMap45.names = strArray65;
        binaryEntityMap33.names = strArray65;
        binaryEntityMap15.names = strArray65;
        binaryEntityMap1.names = strArray65;
        binaryEntityMap1.add("hi!", 97);
        java.lang.String str74 = binaryEntityMap1.name((int) (short) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        int[] intArray12 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray17 = new int[] {};
        binaryEntityMap16.values = intArray17;
        int int20 = binaryEntityMap16.value("");
        java.lang.String str22 = binaryEntityMap16.name((int) (byte) 1);
        java.lang.String str24 = binaryEntityMap16.name(0);
        java.lang.String[] strArray25 = binaryEntityMap16.names;
        binaryEntityMap0.names = strArray25;
        int[] intArray32 = new int[] { 97, (byte) 10, 35, '#', (short) 1 };
        binaryEntityMap0.values = intArray32;
        int int34 = binaryEntityMap0.growBy;
        int int35 = binaryEntityMap0.size;
        java.lang.String str37 = binaryEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 10, 35, 35, 1 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap1 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap1.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        hashEntityMap1.mapNameToValue = map6;
        hashEntityMap0.mapNameToValue = map6;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        int int13 = hashEntityMap9.value("");
        int int15 = hashEntityMap9.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap16.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        hashEntityMap16.mapNameToValue = map21;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap16.mapValueToName = map24;
        hashEntityMap9.mapValueToName = map24;
        int int28 = hashEntityMap9.value("hi!");
        hashEntityMap9.add("hi!", 97);
        java.lang.String str33 = hashEntityMap9.name((int) (short) 100);
        java.util.Map map34 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapNameToValue = map34;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.growBy = (short) 10;
        java.lang.String[] strArray35 = binaryEntityMap32.names;
        binaryEntityMap32.size = (short) 100;
        java.lang.String[] strArray38 = binaryEntityMap32.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap40 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap40.ensureCapacity((int) 'a');
        arrayEntityMap40.ensureCapacity(0);
        arrayEntityMap40.add("hi!", 100);
        java.lang.String str49 = arrayEntityMap40.name((int) 'a');
        int int51 = arrayEntityMap40.value("");
        int[] intArray52 = arrayEntityMap40.values;
        int[] intArray53 = arrayEntityMap40.values;
        java.lang.String[] strArray54 = arrayEntityMap40.names;
        binaryEntityMap32.names = strArray54;
        binaryEntityMap0.names = strArray54;
        binaryEntityMap0.ensureCapacity((int) '#');
        int int59 = binaryEntityMap0.size;
        java.lang.String[] strArray60 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 10, (-1) });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        hashEntityMap9.add("", (int) (byte) 10);
        int int17 = hashEntityMap9.value("");
        java.lang.String str19 = hashEntityMap9.name((int) (byte) 10);
        hashEntityMap9.add("", (int) (byte) 10);
        java.util.Map map23 = hashEntityMap9.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        int int28 = hashEntityMap24.value("");
        hashEntityMap24.add("", 1);
        java.util.Map map32 = hashEntityMap24.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap35.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapNameToValue;
        hashEntityMap35.mapNameToValue = map40;
        int int43 = hashEntityMap35.value("");
        java.util.Map map44 = hashEntityMap35.mapNameToValue;
        hashEntityMap33.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        java.util.Map map48 = hashEntityMap46.mapValueToName;
        java.util.Map map49 = hashEntityMap46.mapNameToValue;
        java.util.Map map50 = hashEntityMap46.mapValueToName;
        hashEntityMap33.mapValueToName = map50;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        java.util.Map map54 = hashEntityMap52.mapValueToName;
        java.util.Map map55 = hashEntityMap52.mapNameToValue;
        hashEntityMap52.add("", (int) (byte) 10);
        int int60 = hashEntityMap52.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        hashEntityMap52.mapNameToValue = map66;
        hashEntityMap33.mapNameToValue = map66;
        java.util.Map map70 = hashEntityMap33.mapValueToName;
        hashEntityMap24.mapNameToValue = map70;
        java.util.Map map72 = hashEntityMap24.mapValueToName;
        hashEntityMap9.mapValueToName = map72;
        hashEntityMap0.mapValueToName = map72;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10 + "'", int60 == 10);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        binaryEntityMap0.add("", (int) (short) 100);
        int int24 = binaryEntityMap0.value("");
        java.lang.String[] strArray25 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
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
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer29 = null;
        entities28.escape(writer29, "");
        java.lang.String[][] strArray32 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities28.addEntities(strArray32);
        java.lang.String str35 = entities28.escape("hi!");
        java.lang.String str37 = entities28.unescape("");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str40 = entities38.unescape("");
        java.io.Writer writer41 = null;
        entities38.escape(writer41, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities38.map = arrayEntityMap45;
        java.lang.String str48 = arrayEntityMap45.name((int) (byte) 100);
        java.lang.String[] strArray49 = arrayEntityMap45.names;
        int int50 = arrayEntityMap45.size;
        entities28.map = arrayEntityMap45;
        java.lang.String str53 = entities28.unescape("hi!");
        org.apache.commons.lang.Entities entities54 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str56 = entities54.unescape("");
        java.lang.String str58 = entities54.entityName(100);
        java.lang.String str60 = entities54.entityName((int) ' ');
        java.lang.String str62 = entities54.entityName(10);
        java.lang.String str64 = entities54.escape("hi!");
        java.lang.String str66 = entities54.unescape("");
        org.apache.commons.lang.Entities entities67 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer68 = null;
        entities67.escape(writer68, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap71 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities67.map = primitiveEntityMap71;
        java.lang.String str74 = entities67.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities75 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer76 = null;
        entities75.escape(writer76, "");
        java.lang.String[][] strArray79 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities75.addEntities(strArray79);
        entities67.addEntities(strArray79);
        entities54.addEntities(strArray79);
        entities28.addEntities(strArray79);
        entities0.addEntities(strArray79);
        java.lang.String str86 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(entities54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(entities67);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(entities75);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        arrayEntityMap26.ensureCapacity(52);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("hi!", (int) (short) -1);
        arrayEntityMap1.growBy = '4';
        int int17 = arrayEntityMap1.value("");
        int int19 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray2 = null;
        binaryEntityMap1.names = strArray2;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 10;
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) 100);
        binaryEntityMap0.size = 1;
        int int18 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        binaryEntityMap0.growBy = (short) 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        lookupEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        java.util.Map map10 = hashEntityMap8.mapValueToName;
        int int12 = hashEntityMap8.value("");
        hashEntityMap8.add("", 1);
        java.util.Map map16 = hashEntityMap8.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap19.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        hashEntityMap19.mapNameToValue = map24;
        int int27 = hashEntityMap19.value("");
        java.util.Map map28 = hashEntityMap19.mapNameToValue;
        hashEntityMap17.mapNameToValue = map28;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        java.util.Map map32 = hashEntityMap30.mapValueToName;
        java.util.Map map33 = hashEntityMap30.mapNameToValue;
        java.util.Map map34 = hashEntityMap30.mapValueToName;
        hashEntityMap17.mapValueToName = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        java.util.Map map38 = hashEntityMap36.mapValueToName;
        java.util.Map map39 = hashEntityMap36.mapNameToValue;
        hashEntityMap36.add("", (int) (byte) 10);
        int int44 = hashEntityMap36.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap45.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = hashEntityMap49.mapNameToValue;
        hashEntityMap45.mapNameToValue = map50;
        hashEntityMap36.mapNameToValue = map50;
        hashEntityMap17.mapNameToValue = map50;
        java.util.Map map54 = hashEntityMap17.mapValueToName;
        hashEntityMap8.mapNameToValue = map54;
        hashEntityMap0.mapValueToName = map54;
        int int58 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) 'a');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        primitiveEntityMap0.add("hi!", (int) (short) -1);
        java.lang.String str5 = primitiveEntityMap0.name((int) (short) 10);
        primitiveEntityMap0.add("", 52);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (byte) 0);
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
        int int29 = binaryEntityMap16.value("hi!");
        java.lang.String str31 = binaryEntityMap16.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str35 = arrayEntityMap33.name((int) (short) 100);
        int[] intArray38 = new int[] { (short) 0, (-1) };
        arrayEntityMap33.values = intArray38;
        binaryEntityMap16.values = intArray38;
        java.lang.String str42 = binaryEntityMap16.name((int) (byte) 1);
        binaryEntityMap16.add("hi!", (int) (short) 100);
        int int46 = binaryEntityMap16.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap47 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap47.growBy = (short) 10;
        java.lang.String[] strArray50 = binaryEntityMap47.names;
        binaryEntityMap47.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap54 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap54.growBy = (short) 10;
        java.lang.String[] strArray57 = binaryEntityMap54.names;
        binaryEntityMap47.names = strArray57;
        binaryEntityMap47.ensureCapacity((int) (short) 0);
        java.lang.String str62 = binaryEntityMap47.name((int) 'a');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap63 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str65 = binaryEntityMap63.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap66 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap66.growBy = (short) 10;
        java.lang.String[] strArray69 = binaryEntityMap66.names;
        binaryEntityMap66.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap73 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap73.growBy = (short) 10;
        java.lang.String[] strArray76 = binaryEntityMap73.names;
        binaryEntityMap66.names = strArray76;
        binaryEntityMap63.names = strArray76;
        int[] intArray79 = binaryEntityMap63.values;
        binaryEntityMap47.values = intArray79;
        binaryEntityMap16.values = intArray79;
        arrayEntityMap1.values = intArray79;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 100, (-1) });
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(intArray79);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.growBy;
        java.lang.String[] strArray13 = arrayEntityMap1.names;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.util.Map map11 = hashEntityMap0.mapNameToValue;
        java.lang.String str13 = hashEntityMap0.name((int) (short) -1);
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(3);
        int int15 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int3 = arrayEntityMap1.value("hi!");
        int int5 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
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
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String[] strArray8 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
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
        java.lang.String str16 = binaryEntityMap1.name((int) (short) -1);
        java.lang.String[] strArray17 = binaryEntityMap1.names;
        binaryEntityMap1.growBy = (short) 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap23.ensureCapacity((int) 'a');
        int int26 = arrayEntityMap23.growBy;
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap23.names = strArray31;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap36 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap36.growBy = (short) 10;
        java.lang.String[] strArray39 = binaryEntityMap36.names;
        binaryEntityMap36.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap43 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap43.growBy = (short) 10;
        java.lang.String[] strArray46 = binaryEntityMap43.names;
        binaryEntityMap36.names = strArray46;
        binaryEntityMap33.names = strArray46;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap49 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str51 = binaryEntityMap49.name((int) (byte) 0);
        int int53 = binaryEntityMap49.value("");
        binaryEntityMap49.add("", (int) (short) -1);
        int[] intArray57 = binaryEntityMap49.values;
        binaryEntityMap33.values = intArray57;
        arrayEntityMap23.values = intArray57;
        int[] intArray60 = arrayEntityMap23.values;
        arrayEntityMap21.values = intArray60;
        binaryEntityMap1.values = intArray60;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertNotNull(intArray60);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        java.lang.String str14 = primitiveEntityMap0.name(101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        java.lang.String str23 = hashEntityMap0.name(1);
        java.util.Map map24 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 10;
        int[] intArray9 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray9);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", 100);
        java.lang.String str14 = binaryEntityMap0.name(10);
        binaryEntityMap0.add("hi!", 98);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        java.lang.String[] strArray13 = arrayEntityMap1.names;
        int int14 = arrayEntityMap1.size;
        arrayEntityMap1.add("", (int) (short) 100);
        int int18 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) 'a');
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
        entities9.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap39.ensureCapacity((int) 'a');
        arrayEntityMap39.growBy = (byte) 100;
        arrayEntityMap39.ensureCapacity(10);
        java.lang.String str47 = arrayEntityMap39.name((int) (byte) 1);
        arrayEntityMap39.size = 0;
        int int51 = arrayEntityMap39.value("hi!");
        entities9.map = arrayEntityMap39;
        org.apache.commons.lang.Entities entities53 = org.apache.commons.lang.Entities.HTML32;
        entities53.addEntity("hi!", 0);
        java.lang.String[][] strArray57 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities53.addEntities(strArray57);
        entities9.addEntities(strArray57);
        entities0.addEntities(strArray57);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap61 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap61.growBy = (short) 10;
        java.lang.String[] strArray64 = binaryEntityMap61.names;
        binaryEntityMap61.add("", (int) (short) 100);
        entities0.map = binaryEntityMap61;
        java.lang.String str70 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap71 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(entities53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(entityMap71);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapNameToValue;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) 'a');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.entityName((int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.lang.String str13 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "7) test3470(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "2) test3470(org.apache.commons.lang.RegressionTest6)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        binaryEntityMap0.growBy = (short) 0;
        java.lang.String str19 = binaryEntityMap0.name(97);
        int int21 = binaryEntityMap0.value("");
        int int23 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        int int23 = binaryEntityMap0.value("");
        java.lang.String str25 = binaryEntityMap0.name((int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        org.apache.commons.lang.Entities entities26 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str28 = entities26.unescape("");
        java.lang.String str30 = entities26.entityName(100);
        java.lang.String str32 = entities26.entityName((int) ' ');
        java.lang.String str34 = entities26.entityName(10);
        java.lang.String str36 = entities26.escape("hi!");
        java.lang.String str38 = entities26.unescape("");
        org.apache.commons.lang.Entities entities39 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer40 = null;
        entities39.escape(writer40, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap43 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities39.map = primitiveEntityMap43;
        java.lang.String str46 = entities39.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer48 = null;
        entities47.escape(writer48, "");
        java.lang.String[][] strArray51 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities47.addEntities(strArray51);
        entities39.addEntities(strArray51);
        entities26.addEntities(strArray51);
        entities0.addEntities(strArray51);
        java.io.Writer writer56 = null;
        entities0.escape(writer56, "");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap59 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str61 = lookupEntityMap59.name(0);
        lookupEntityMap59.add("", (int) (short) 100);
        java.lang.String str66 = lookupEntityMap59.name((int) '4');
        java.lang.String str68 = lookupEntityMap59.name((int) '4');
        entities0.map = lookupEntityMap59;
        int int71 = lookupEntityMap59.value("");
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
        org.junit.Assert.assertNotNull(entities26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        java.lang.String str10 = binaryEntityMap0.name(32);
        int int12 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
        lookupEntityMap34.add("hi!", (int) (byte) 1);
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
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("hi!", (int) (short) 100);
        lookupEntityMap0.add("", (int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str11 = binaryEntityMap0.name(32);
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        java.lang.String str14 = binaryEntityMap0.name(1);
        binaryEntityMap0.add("hi!", 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", 35);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        java.util.Map map18 = hashEntityMap15.mapNameToValue;
        hashEntityMap15.add("", (int) (byte) 10);
        int int23 = hashEntityMap15.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap24.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        hashEntityMap24.mapNameToValue = map29;
        hashEntityMap15.mapNameToValue = map29;
        java.lang.String str33 = hashEntityMap15.name((int) 'a');
        hashEntityMap15.add("", 2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap37.add("", (int) (byte) -1);
        java.util.Map map41 = hashEntityMap37.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        java.util.Map map44 = hashEntityMap42.mapValueToName;
        java.util.Map map45 = hashEntityMap42.mapNameToValue;
        hashEntityMap42.add("", (int) (byte) 10);
        int int50 = hashEntityMap42.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap51.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map56 = hashEntityMap55.mapNameToValue;
        hashEntityMap51.mapNameToValue = map56;
        hashEntityMap42.mapNameToValue = map56;
        hashEntityMap37.mapValueToName = map56;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map61 = hashEntityMap60.mapNameToValue;
        java.util.Map map62 = hashEntityMap60.mapValueToName;
        java.util.Map map63 = hashEntityMap60.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap64 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map65 = treeEntityMap64.mapNameToValue;
        hashEntityMap60.mapValueToName = map65;
        java.util.Map map67 = hashEntityMap60.mapValueToName;
        hashEntityMap37.mapValueToName = map67;
        hashEntityMap15.mapValueToName = map67;
        hashEntityMap0.mapNameToValue = map67;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        int int27 = entityMap25.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        java.lang.String str33 = hashEntityMap28.name((int) 'a');
        java.util.Map map34 = hashEntityMap28.mapValueToName;
        hashEntityMap7.mapValueToName = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        java.util.Map map38 = hashEntityMap36.mapValueToName;
        java.util.Map map39 = hashEntityMap36.mapNameToValue;
        java.util.Map map40 = hashEntityMap36.mapValueToName;
        java.util.Map map41 = hashEntityMap36.mapValueToName;
        hashEntityMap7.mapValueToName = map41;
        java.util.Map map43 = hashEntityMap7.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str36 = arrayEntityMap34.name((int) (short) 100);
        int[] intArray39 = new int[] { (short) 0, (-1) };
        arrayEntityMap34.values = intArray39;
        binaryEntityMap17.values = intArray39;
        binaryEntityMap17.growBy = 1;
        binaryEntityMap17.add("hi!", 10);
        entities0.map = binaryEntityMap17;
        org.apache.commons.lang.Entities.EntityMap entityMap48 = entities0.map;
        int int50 = entities0.entityValue("");
        int int52 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, (-1) });
        org.junit.Assert.assertNotNull(entityMap48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        binaryEntityMap0.growBy = (short) 10;
        int int7 = binaryEntityMap0.size;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        arrayEntityMap10.names = strArray14;
        binaryEntityMap0.names = strArray14;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        int int21 = arrayEntityMap18.growBy;
        java.lang.String[] strArray22 = arrayEntityMap18.names;
        int int24 = arrayEntityMap18.value("hi!");
        int int25 = arrayEntityMap18.size;
        int int27 = arrayEntityMap18.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str32 = binaryEntityMap30.name((int) (byte) 0);
        int int34 = binaryEntityMap30.value("");
        binaryEntityMap30.growBy = 10;
        binaryEntityMap30.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap41 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray43 = new int[] {};
        binaryEntityMap42.values = intArray43;
        int int46 = binaryEntityMap42.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap47 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap48.growBy = (short) 10;
        java.lang.String[] strArray51 = binaryEntityMap48.names;
        arrayEntityMap47.names = strArray51;
        binaryEntityMap42.names = strArray51;
        binaryEntityMap41.names = strArray51;
        binaryEntityMap30.names = strArray51;
        arrayEntityMap29.names = strArray51;
        arrayEntityMap18.names = strArray51;
        java.lang.String[] strArray58 = arrayEntityMap18.names;
        binaryEntityMap0.names = strArray58;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] {});
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("");
        org.apache.commons.lang.Entities entities6 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str8 = entities6.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities6.map = arrayEntityMap10;
        entities6.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities6);
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName((int) (short) 0);
        java.lang.String str22 = entities16.unescape("hi!");
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str25 = entities23.unescape("");
        int int27 = entities23.entityValue("");
        int int29 = entities23.entityValue("");
        entities23.addEntity("", 97);
        org.apache.commons.lang.Entities entities33 = org.apache.commons.lang.Entities.HTML32;
        entities33.addEntity("hi!", 0);
        java.lang.String[][] strArray37 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities33.addEntities(strArray37);
        entities23.addEntities(strArray37);
        entities16.addEntities(strArray37);
        entities6.addEntities(strArray37);
        entities0.addEntities(strArray37);
        java.lang.String str44 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(entities33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str14 = entities0.escape("");
        int int16 = entities0.entityValue("");
        int int18 = entities0.entityValue("hi!");
        java.lang.String str20 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 52;
        int int8 = binaryEntityMap0.growBy;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.value("hi!");
        int int13 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        binaryEntityMap0.add("hi!", 0);
        binaryEntityMap0.add("hi!", 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.entityName((-1));
        java.lang.String str12 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 'a';
        java.lang.String str10 = binaryEntityMap0.name(100);
        binaryEntityMap0.add("", (int) (short) 1);
        int[] intArray14 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        int int9 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        binaryEntityMap0.growBy = 2;
        int int24 = binaryEntityMap0.growBy;
        java.lang.String str26 = binaryEntityMap0.name((int) ' ');
        java.lang.String str28 = binaryEntityMap0.name((int) '4');
        binaryEntityMap0.ensureCapacity((int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("");
        java.lang.String str8 = lookupEntityMap0.name((int) '#');
        java.lang.String str10 = lookupEntityMap0.name((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.size = 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str16 = binaryEntityMap14.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        binaryEntityMap17.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = (short) 10;
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        binaryEntityMap17.names = strArray27;
        binaryEntityMap14.names = strArray27;
        java.lang.String str31 = binaryEntityMap14.name((int) (short) 100);
        binaryEntityMap14.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int36 = binaryEntityMap35.size;
        java.lang.String str38 = binaryEntityMap35.name((int) ' ');
        int[] intArray39 = binaryEntityMap35.values;
        binaryEntityMap14.values = intArray39;
        binaryEntityMap0.values = intArray39;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(intArray39);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("hi!", (int) (short) 0);
        int int11 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.lang.String str2 = hashEntityMap0.name((int) (byte) -1);
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(35);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = lookupEntityMap0.name((int) (byte) 100);
        int int10 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
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
        int int29 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        int int15 = arrayEntityMap1.value("hi!");
        java.lang.String[] strArray16 = arrayEntityMap1.names;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { null });
    }
}
