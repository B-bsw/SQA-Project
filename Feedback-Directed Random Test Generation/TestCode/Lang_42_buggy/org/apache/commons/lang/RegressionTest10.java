package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
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
        java.util.Map map30 = hashEntityMap0.mapValueToName;
        java.util.Map map31 = hashEntityMap0.mapValueToName;
        int int33 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str7 = lookupEntityMap0.name(32);
        lookupEntityMap0.add("hi!", (int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = (byte) 10;
        java.lang.String str14 = binaryEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str17 = binaryEntityMap15.name((int) (byte) 0);
        java.lang.String str19 = binaryEntityMap15.name((int) '#');
        java.lang.String str21 = binaryEntityMap15.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str24 = binaryEntityMap22.name((int) (byte) 0);
        binaryEntityMap22.add("", (int) (byte) 0);
        binaryEntityMap22.growBy = 0;
        binaryEntityMap22.add("hi!", 2);
        binaryEntityMap22.size = (byte) 1;
        int[] intArray35 = binaryEntityMap22.values;
        int int36 = binaryEntityMap22.size;
        binaryEntityMap22.growBy = (short) 10;
        int[] intArray39 = binaryEntityMap22.values;
        binaryEntityMap15.values = intArray39;
        binaryEntityMap0.values = intArray39;
        java.lang.Class<?> wildcardClass42 = binaryEntityMap0.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        int[] intArray3 = binaryEntityMap0.values;
        java.lang.String str5 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        int[] intArray13 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int11 = binaryEntityMap9.value("");
        java.lang.String str13 = binaryEntityMap9.name((int) (short) 0);
        int int14 = binaryEntityMap9.size;
        int int15 = binaryEntityMap9.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        int[] intArray20 = binaryEntityMap16.values;
        binaryEntityMap9.values = intArray20;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str25 = arrayEntityMap23.name((int) (short) 100);
        int[] intArray28 = new int[] { (short) 0, (-1) };
        arrayEntityMap23.values = intArray28;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str32 = binaryEntityMap30.name((int) (byte) 0);
        java.lang.String str34 = binaryEntityMap30.name((int) '#');
        binaryEntityMap30.growBy = (byte) 10;
        binaryEntityMap30.growBy = 1;
        int int39 = binaryEntityMap30.growBy;
        java.lang.String[] strArray40 = binaryEntityMap30.names;
        arrayEntityMap23.names = strArray40;
        binaryEntityMap9.names = strArray40;
        entities0.map = binaryEntityMap9;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(strArray40);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
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
        java.io.Writer writer28 = null;
        entities0.escape(writer28, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str33 = entities0.escape("hi!");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        org.apache.commons.lang.Entities entities56 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer57 = null;
        entities56.escape(writer57, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap60 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities56.map = primitiveEntityMap60;
        java.lang.String str63 = entities56.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities64 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer65 = null;
        entities64.escape(writer65, "");
        java.lang.String[][] strArray68 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities64.addEntities(strArray68);
        entities56.addEntities(strArray68);
        java.lang.String str72 = entities56.escape("");
        org.apache.commons.lang.Entities entities73 = org.apache.commons.lang.Entities.HTML32;
        entities73.addEntity("hi!", 0);
        java.lang.String[][] strArray77 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities73.addEntities(strArray77);
        entities56.addEntities(strArray77);
        int int81 = entities56.entityValue("");
        java.lang.String str83 = entities56.entityName(1);
        org.apache.commons.lang.Entities entities84 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str86 = entities84.unescape("");
        java.lang.String str88 = entities84.entityName(100);
        java.lang.String str90 = entities84.entityName((int) ' ');
        java.lang.String str92 = entities84.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap93 = entities84.map;
        java.lang.String[][] strArray94 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities84.addEntities(strArray94);
        java.lang.String[][] strArray96 = new java.lang.String[][] {};
        entities84.addEntities(strArray96);
        entities56.addEntities(strArray96);
        entities0.addEntities(strArray96);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
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
        org.junit.Assert.assertNotNull(entities56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(entities64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(entities73);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNotNull(entities84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(entityMap93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray96);
        org.junit.Assert.assertArrayEquals(strArray96, new java.lang.String[][] {});
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.ensureCapacity((int) '4');
        int[] intArray6 = arrayEntityMap1.values;
        int int8 = arrayEntityMap1.value("hi!");
        int int9 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str11 = binaryEntityMap0.name(10);
        binaryEntityMap0.ensureCapacity((int) (byte) 100);
        binaryEntityMap0.add("hi!", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map4 = hashEntityMap3.mapNameToValue;
        hashEntityMap0.mapNameToValue = map4;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name(10);
        binaryEntityMap0.add("hi!", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        binaryEntityMap27.size = (byte) 10;
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test5012(org.apache.commons.lang.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
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
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        int int11 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("");
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
        java.util.Map map29 = hashEntityMap9.mapValueToName;
        entities0.map = hashEntityMap9;
        hashEntityMap9.add("", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = (short) -1;
        int int5 = arrayEntityMap1.size;
        int int6 = arrayEntityMap1.size;
        java.lang.String[] strArray7 = arrayEntityMap1.names;
        int int9 = arrayEntityMap1.value("");
        arrayEntityMap1.size = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strArray39);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
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
        primitiveEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
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
        java.lang.String str18 = hashEntityMap0.name(3);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        java.io.Writer writer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer23, "hi!");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str5 = binaryEntityMap0.name(2);
        int[] intArray6 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
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
        int int16 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (-1);
        java.lang.String str10 = binaryEntityMap0.name(35);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int13 = binaryEntityMap11.value("");
        binaryEntityMap11.size = '#';
        binaryEntityMap11.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        int[] intArray22 = binaryEntityMap18.values;
        int[] intArray23 = binaryEntityMap18.values;
        binaryEntityMap11.values = intArray23;
        int[] intArray25 = binaryEntityMap11.values;
        binaryEntityMap0.values = intArray25;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int13 = hashEntityMap11.value("hi!");
        java.util.Map map14 = hashEntityMap11.mapValueToName;
        int int16 = hashEntityMap11.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap18.mapNameToValue = map23;
        hashEntityMap17.mapNameToValue = map23;
        java.util.Map map26 = hashEntityMap17.mapNameToValue;
        hashEntityMap11.mapNameToValue = map26;
        entities0.map = hashEntityMap11;
        hashEntityMap11.add("hi!", (int) (byte) 1);
        java.util.Map map32 = hashEntityMap11.mapValueToName;
        java.util.Map map33 = hashEntityMap11.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
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
        hashEntityMap0.add("", (int) ' ');
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
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) 'a');
        entities0.map = binaryEntityMap22;
        entities0.addEntity("hi!", (int) (short) 100);
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer27, "hi!");
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
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
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
        hashEntityMap0.add("", 2);
        int int27 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.size;
        binaryEntityMap0.add("", (int) (short) 0);
        int int9 = binaryEntityMap0.size;
        binaryEntityMap0.ensureCapacity(97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        java.lang.String str28 = entities0.escape("hi!");
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer29, "");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
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
        binaryEntityMap0.ensureCapacity(35);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer9 = null;
        entities8.escape(writer9, "");
        int int13 = entities8.entityValue("");
        java.lang.String str15 = entities8.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        arrayEntityMap16.names = strArray20;
        int[] intArray22 = arrayEntityMap16.values;
        entities8.map = arrayEntityMap16;
        arrayEntityMap16.growBy = (short) 10;
        java.lang.String str27 = arrayEntityMap16.name(10);
        int[] intArray28 = arrayEntityMap16.values;
        binaryEntityMap0.values = intArray28;
        java.lang.String str31 = binaryEntityMap0.name((int) (short) 1);
        int[] intArray32 = binaryEntityMap0.values;
        java.lang.String str34 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
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
        int int20 = binaryEntityMap9.value("hi!");
        int int21 = binaryEntityMap9.size;
        binaryEntityMap9.ensureCapacity((int) (byte) 10);
        int int24 = binaryEntityMap9.growBy;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        binaryEntityMap0.add("", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str11 = binaryEntityMap9.name((int) (byte) 0);
        java.lang.String str13 = binaryEntityMap9.name((int) '#');
        java.lang.String str15 = binaryEntityMap9.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 0);
        binaryEntityMap16.add("", (int) (byte) 0);
        binaryEntityMap16.growBy = 0;
        binaryEntityMap16.add("hi!", 2);
        binaryEntityMap16.size = (byte) 1;
        int[] intArray29 = binaryEntityMap16.values;
        int int30 = binaryEntityMap16.size;
        binaryEntityMap16.growBy = (short) 10;
        int[] intArray33 = binaryEntityMap16.values;
        binaryEntityMap9.values = intArray33;
        binaryEntityMap0.values = intArray33;
        java.lang.String str37 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.size = 97;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        int int16 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int19 = arrayEntityMap18.growBy;
        java.lang.String[] strArray20 = arrayEntityMap18.names;
        int int22 = arrayEntityMap18.value("hi!");
        arrayEntityMap18.size = (byte) -1;
        int[] intArray25 = arrayEntityMap18.values;
        arrayEntityMap18.size = 0;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap28.add("", (int) (short) 100);
        java.lang.String str36 = binaryEntityMap28.name((int) (byte) 1);
        java.lang.String str38 = binaryEntityMap28.name((int) ' ');
        int int39 = binaryEntityMap28.size;
        int int41 = binaryEntityMap28.value("hi!");
        java.lang.String[] strArray42 = binaryEntityMap28.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        java.lang.String[] strArray47 = binaryEntityMap44.names;
        arrayEntityMap43.names = strArray47;
        int[] intArray49 = arrayEntityMap43.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap51 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap51.ensureCapacity((int) 'a');
        arrayEntityMap51.ensureCapacity(0);
        java.lang.String[] strArray56 = arrayEntityMap51.names;
        arrayEntityMap43.names = strArray56;
        arrayEntityMap43.ensureCapacity(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap61 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str63 = arrayEntityMap61.name((int) (short) 100);
        int[] intArray66 = new int[] { (short) 0, (-1) };
        arrayEntityMap61.values = intArray66;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap68 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap68.growBy = (short) 10;
        java.lang.String[] strArray71 = binaryEntityMap68.names;
        int[] intArray72 = binaryEntityMap68.values;
        arrayEntityMap61.values = intArray72;
        arrayEntityMap61.add("hi!", (int) (short) 1);
        java.lang.String[] strArray77 = arrayEntityMap61.names;
        arrayEntityMap43.names = strArray77;
        binaryEntityMap28.names = strArray77;
        arrayEntityMap18.names = strArray77;
        binaryEntityMap0.names = strArray77;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.growBy = (short) 0;
        int int14 = binaryEntityMap0.growBy;
        binaryEntityMap0.ensureCapacity(1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.unescape("hi!");
        java.io.Writer writer11 = null;
        entities0.escape(writer11, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        lookupEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        int[] intArray4 = binaryEntityMap0.values;
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        int int9 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        java.util.Map map15 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        java.lang.String str14 = primitiveEntityMap0.name(1);
        java.lang.String str16 = primitiveEntityMap0.name((int) (short) 0);
        java.lang.String str18 = primitiveEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
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
        int int62 = hashEntityMap0.value("");
        java.util.Map map63 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.entityName((int) '#');
        java.lang.String str11 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        binaryEntityMap0.size = 100;
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.growBy = (byte) 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
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
        java.lang.String str16 = binaryEntityMap1.name(10);
        java.lang.String str18 = binaryEntityMap1.name(100);
        java.lang.String str20 = binaryEntityMap1.name((-1));
        binaryEntityMap1.ensureCapacity(98);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.add("", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = (byte) 10;
        binaryEntityMap0.add("", (-1));
        binaryEntityMap0.add("hi!", 97);
        binaryEntityMap0.add("", (int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) '#');
        java.lang.String str14 = primitiveEntityMap0.name((int) 'a');
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        java.lang.String str19 = primitiveEntityMap0.name((int) (byte) 1);
        java.lang.String str21 = primitiveEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        java.lang.String str5 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        int[] intArray13 = binaryEntityMap0.values;
        int int14 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (short) 10;
        int int17 = binaryEntityMap0.growBy;
        binaryEntityMap0.growBy = ' ';
        int int20 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        binaryEntityMap0.growBy = (short) 10;
        int int7 = binaryEntityMap0.size;
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 100);
        int int10 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(101);
        binaryEntityMap0.add("hi!", (int) (short) 1);
        int[] intArray15 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", (int) (short) -1);
        java.lang.String str17 = lookupEntityMap0.name(101);
        lookupEntityMap0.add("", 35);
        java.lang.String str22 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        binaryEntityMap12.add("", (int) (short) 100);
        java.lang.String str20 = binaryEntityMap12.name((int) (byte) 1);
        java.lang.String str22 = binaryEntityMap12.name((int) ' ');
        binaryEntityMap12.add("", (int) (short) 0);
        java.lang.String str27 = binaryEntityMap12.name((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        java.lang.String[] strArray30 = arrayEntityMap29.names;
        binaryEntityMap12.names = strArray30;
        binaryEntityMap0.names = strArray30;
        binaryEntityMap0.add("hi!", 97);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        java.io.Writer writer13 = null;
        entities0.escape(writer13, "");
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.apache.commons.lang.Entities entities17 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer18 = null;
        entities17.escape(writer18, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap21 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities17.map = primitiveEntityMap21;
        java.lang.String str24 = entities17.entityName((int) (short) -1);
        entities17.addEntity("", (int) 'a');
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities17.map;
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str31 = entities29.unescape("");
        java.lang.String str33 = entities29.entityName(100);
        java.lang.String str35 = entities29.entityName((int) ' ');
        java.lang.String str37 = entities29.entityName((int) '#');
        java.lang.String str39 = entities29.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities29.map;
        org.apache.commons.lang.Entities entities41 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap42 = entities41.map;
        org.apache.commons.lang.Entities entities43 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer44 = null;
        entities43.escape(writer44, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap47 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities43.map = primitiveEntityMap47;
        java.lang.String str50 = entities43.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities51 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer52 = null;
        entities51.escape(writer52, "");
        java.lang.String[][] strArray55 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities51.addEntities(strArray55);
        entities43.addEntities(strArray55);
        entities41.addEntities(strArray55);
        entities29.addEntities(strArray55);
        entities17.addEntities(strArray55);
        entities0.addEntities(strArray55);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "2) test5054(org.apache.commons.lang.RegressionTest10)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertNotNull(entities41);
        org.junit.Assert.assertNotNull(entityMap42);
        org.junit.Assert.assertNotNull(entities43);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(entities51);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        java.lang.String str15 = entities0.entityName(10);
        java.lang.String str17 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        java.lang.String str30 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities0.map;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap33.add("hi!", (int) 'a');
        int int38 = arrayEntityMap33.value("");
        entities0.map = arrayEntityMap33;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = entities0.escape("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(entityMap21);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        int int7 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("hi!", (-1));
        int int12 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("", (int) (short) 100);
        primitiveEntityMap4.add("", (int) '4');
        primitiveEntityMap4.add("", (int) (short) 10);
        primitiveEntityMap4.add("", 0);
        java.lang.String str26 = primitiveEntityMap4.name(0);
        primitiveEntityMap4.add("hi!", 1);
        java.lang.String str31 = primitiveEntityMap4.name((int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.ensureCapacity(101);
        binaryEntityMap0.size = (byte) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
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
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        int int22 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        binaryEntityMap0.growBy = (byte) -1;
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        java.lang.String str24 = entities0.entityName((int) (short) -1);
        java.lang.String str26 = entities0.escape("hi!");
        entities0.addEntity("", (int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("");
        java.lang.String str6 = primitiveEntityMap0.name((int) (short) 1);
        int int8 = primitiveEntityMap0.value("hi!");
        int int10 = primitiveEntityMap0.value("");
        java.lang.String str12 = primitiveEntityMap0.name(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        binaryEntityMap0.size = (byte) 10;
        java.lang.String str8 = binaryEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities9);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int16 = arrayEntityMap14.value("hi!");
        entities9.map = arrayEntityMap14;
        java.lang.String str19 = entities9.entityName((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray22 = null;
        binaryEntityMap21.names = strArray22;
        java.lang.String[] strArray24 = binaryEntityMap21.names;
        entities9.map = binaryEntityMap21;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap26.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        binaryEntityMap26.names = strArray36;
        binaryEntityMap26.ensureCapacity((int) (short) 0);
        java.lang.String str41 = binaryEntityMap26.name((int) 'a');
        binaryEntityMap26.size = 1;
        binaryEntityMap26.growBy = (byte) 10;
        java.lang.String[] strArray46 = binaryEntityMap26.names;
        binaryEntityMap21.names = strArray46;
        binaryEntityMap0.names = strArray46;
        java.lang.String[] strArray49 = binaryEntityMap0.names;
        int[] intArray50 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(intArray50);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        java.lang.String str30 = entities0.escape("");
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML32;
        entities31.addEntity("hi!", 0);
        java.lang.String[][] strArray35 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities31.addEntities(strArray35);
        entities0.addEntities(strArray35);
        entities0.addEntity("", 97);
        java.lang.String str42 = entities0.entityName(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
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
        java.lang.String str19 = entities0.unescape("");
        int int21 = entities0.entityValue("hi!");
        java.lang.String str23 = entities0.unescape("hi!");
        java.io.Writer writer24 = null;
        entities0.escape(writer24, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        org.apache.commons.lang.Entities entities29 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str31 = entities29.unescape("");
        java.lang.String str33 = entities29.escape("");
        java.lang.String str35 = entities29.unescape("");
        int int37 = entities29.entityValue("");
        org.apache.commons.lang.Entities entities38 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer39 = null;
        entities38.escape(writer39, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap42 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities38.map = primitiveEntityMap42;
        java.lang.String str45 = entities38.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities46 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer47 = null;
        entities46.escape(writer47, "");
        java.lang.String[][] strArray50 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities46.addEntities(strArray50);
        entities38.addEntities(strArray50);
        java.lang.String str54 = entities38.escape("");
        org.apache.commons.lang.Entities entities55 = org.apache.commons.lang.Entities.HTML32;
        entities55.addEntity("hi!", 0);
        java.lang.String[][] strArray59 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities55.addEntities(strArray59);
        entities38.addEntities(strArray59);
        int int63 = entities38.entityValue("");
        java.lang.String str65 = entities38.entityName(1);
        org.apache.commons.lang.Entities entities66 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str68 = entities66.unescape("");
        java.lang.String str70 = entities66.entityName(100);
        java.lang.String str72 = entities66.entityName((int) ' ');
        java.lang.String str74 = entities66.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap75 = entities66.map;
        java.lang.String[][] strArray76 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities66.addEntities(strArray76);
        java.lang.String[][] strArray78 = new java.lang.String[][] {};
        entities66.addEntities(strArray78);
        entities38.addEntities(strArray78);
        entities29.addEntities(strArray78);
        entities0.addEntities(strArray78);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(entities29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(entities38);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(entities46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(entities55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(entityMap75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertArrayEquals(strArray78, new java.lang.String[][] {});
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        int int8 = arrayEntityMap1.growBy;
        arrayEntityMap1.add("", 2);
        arrayEntityMap1.growBy = 1;
        int[] intArray14 = arrayEntityMap1.values;
        arrayEntityMap1.add("", 101);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 2, (-1) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 2, (-1) });
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        int int10 = binaryEntityMap0.size;
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        int int13 = entityMap11.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        int int29 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap30 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(entityMap30);
        org.junit.Assert.assertNotNull(entityMap31);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int5 = binaryEntityMap4.size;
        java.lang.String[] strArray6 = binaryEntityMap4.names;
        binaryEntityMap0.names = strArray6;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        java.lang.Class<?> wildcardClass15 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        binaryEntityMap0.ensureCapacity((int) 'a');
        int int24 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
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
        binaryEntityMap26.names = strArray36;
        java.lang.String str41 = binaryEntityMap26.name((int) (short) -1);
        java.lang.String[] strArray42 = binaryEntityMap26.names;
        java.lang.String[] strArray43 = binaryEntityMap26.names;
        binaryEntityMap0.names = strArray43;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        java.util.Map map12 = hashEntityMap9.mapNameToValue;
        hashEntityMap9.add("", (int) (byte) 10);
        int int17 = hashEntityMap9.value("");
        java.lang.String str19 = hashEntityMap9.name((int) (byte) 10);
        java.lang.String str21 = hashEntityMap9.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int24 = hashEntityMap22.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        hashEntityMap22.mapNameToValue = map26;
        hashEntityMap9.mapNameToValue = map26;
        hashEntityMap0.mapNameToValue = map26;
        java.lang.String str31 = hashEntityMap0.name(10);
        hashEntityMap0.add("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name(32);
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 0);
        lookupEntityMap0.add("", 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        int int15 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("hi!", (int) (short) -1);
        arrayEntityMap1.growBy = '4';
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int18 = binaryEntityMap16.value("");
        java.lang.String str20 = binaryEntityMap16.name((int) (short) 0);
        int int21 = binaryEntityMap16.size;
        int[] intArray22 = binaryEntityMap16.values;
        arrayEntityMap1.values = intArray22;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = (short) 10;
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        binaryEntityMap24.add("", (int) (short) 100);
        int[] intArray31 = binaryEntityMap24.values;
        java.lang.String str33 = binaryEntityMap24.name((int) (byte) 1);
        java.lang.String str35 = binaryEntityMap24.name(32);
        java.lang.String[] strArray36 = binaryEntityMap24.names;
        arrayEntityMap1.names = strArray36;
        int int38 = arrayEntityMap1.size;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
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
        java.lang.String str27 = lookupEntityMap8.name((int) (short) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
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
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        java.lang.String str8 = hashEntityMap0.name(52);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        int int12 = hashEntityMap9.value("");
        hashEntityMap9.add("hi!", (int) (byte) 1);
        int int17 = hashEntityMap9.value("hi!");
        int int19 = hashEntityMap9.value("hi!");
        hashEntityMap9.add("", (int) (short) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        java.util.Map map27 = hashEntityMap23.mapValueToName;
        java.util.Map map28 = hashEntityMap23.mapValueToName;
        java.util.Map map29 = hashEntityMap23.mapValueToName;
        java.lang.String str31 = hashEntityMap23.name((int) (byte) 0);
        hashEntityMap23.add("", 3);
        java.util.Map map35 = hashEntityMap23.mapValueToName;
        java.util.Map map36 = hashEntityMap23.mapNameToValue;
        hashEntityMap9.mapValueToName = map36;
        hashEntityMap0.mapValueToName = map36;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        int int78 = hashEntityMap0.value("");
        java.util.Map map79 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        hashEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.growBy = ' ';
        java.lang.String str11 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.growBy = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = '4';
        binaryEntityMap14.size = (byte) -1;
        java.lang.String str20 = binaryEntityMap14.name((int) (short) 100);
        binaryEntityMap14.size = (byte) 0;
        int int24 = binaryEntityMap14.value("");
        int int26 = binaryEntityMap14.value("");
        org.apache.commons.lang.Entities entities27 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities27.map;
        java.lang.String str30 = entities27.escape("hi!");
        java.lang.String str32 = entities27.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap34.ensureCapacity((int) 'a');
        arrayEntityMap34.ensureCapacity(0);
        arrayEntityMap34.add("hi!", 100);
        java.lang.String str43 = arrayEntityMap34.name((int) 'a');
        int int45 = arrayEntityMap34.value("");
        int[] intArray46 = arrayEntityMap34.values;
        int int47 = arrayEntityMap34.size;
        entities27.map = arrayEntityMap34;
        java.lang.String[] strArray49 = arrayEntityMap34.names;
        binaryEntityMap14.names = strArray49;
        binaryEntityMap0.names = strArray49;
        binaryEntityMap0.growBy = (byte) 10;
        int int55 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(entities27);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.unescape("hi!");
        java.lang.String str16 = entities0.escape("hi!");
        entities0.addEntity("hi!", (int) ' ');
        org.apache.commons.lang.Entities.EntityMap entityMap20 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        java.lang.String str23 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(entityMap20);
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
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
        java.lang.Class<?> wildcardClass29 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", 98);
        int int10 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        java.lang.String str12 = hashEntityMap0.name(1);
        int int14 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 0);
        hashEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String str22 = hashEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.size = (byte) -1;
        int int6 = arrayEntityMap0.value("hi!");
        int int7 = arrayEntityMap0.growBy;
        int int8 = arrayEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.growBy = (byte) 100;
        binaryEntityMap0.add("", 2);
        int[] intArray16 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        int[] intArray5 = binaryEntityMap0.values;
        int int6 = binaryEntityMap0.size;
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str8 = binaryEntityMap0.name(35);
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        java.lang.String str18 = binaryEntityMap0.name((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = binaryEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        java.lang.String str12 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (short) 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int17 = arrayEntityMap16.growBy;
        java.lang.String[] strArray18 = arrayEntityMap16.names;
        arrayEntityMap16.add("hi!", (int) (byte) -1);
        arrayEntityMap16.ensureCapacity(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int25 = binaryEntityMap24.growBy;
        binaryEntityMap24.add("", (int) (short) 100);
        binaryEntityMap24.size = (byte) 100;
        int int31 = binaryEntityMap24.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap37.growBy = (short) 10;
        java.lang.String[] strArray40 = binaryEntityMap37.names;
        arrayEntityMap36.names = strArray40;
        int[] intArray42 = arrayEntityMap36.values;
        binaryEntityMap32.values = intArray42;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        java.lang.String[] strArray47 = binaryEntityMap44.names;
        int int49 = binaryEntityMap44.value("");
        binaryEntityMap44.growBy = (short) 1;
        binaryEntityMap44.size = 100;
        binaryEntityMap44.add("", 100);
        java.lang.String[] strArray57 = binaryEntityMap44.names;
        binaryEntityMap32.names = strArray57;
        binaryEntityMap32.add("", 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap63 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap63.ensureCapacity((int) 'a');
        arrayEntityMap63.ensureCapacity(0);
        arrayEntityMap63.add("hi!", 100);
        java.lang.String str72 = arrayEntityMap63.name((int) 'a');
        int int74 = arrayEntityMap63.value("");
        int[] intArray75 = arrayEntityMap63.values;
        int[] intArray76 = arrayEntityMap63.values;
        binaryEntityMap32.values = intArray76;
        binaryEntityMap24.values = intArray76;
        arrayEntityMap16.values = intArray76;
        binaryEntityMap0.values = intArray76;
        int[] intArray81 = binaryEntityMap0.values;
        int int83 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        java.lang.String str12 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.escape("hi!");
        java.lang.String str9 = entities0.unescape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str12 = binaryEntityMap10.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.growBy = (short) 10;
        java.lang.String[] strArray16 = binaryEntityMap13.names;
        binaryEntityMap13.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        binaryEntityMap13.names = strArray23;
        binaryEntityMap10.names = strArray23;
        java.lang.String str27 = binaryEntityMap10.name((int) (short) 100);
        java.lang.String str29 = binaryEntityMap10.name(52);
        binaryEntityMap10.add("", (int) (short) 100);
        int int34 = binaryEntityMap10.value("");
        java.lang.String str36 = binaryEntityMap10.name((-1));
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap38.ensureCapacity((int) 'a');
        int int41 = arrayEntityMap38.growBy;
        java.lang.String[] strArray42 = arrayEntityMap38.names;
        int int44 = arrayEntityMap38.value("hi!");
        int int45 = arrayEntityMap38.size;
        int int47 = arrayEntityMap38.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str52 = binaryEntityMap50.name((int) (byte) 0);
        int int54 = binaryEntityMap50.value("");
        binaryEntityMap50.growBy = 10;
        binaryEntityMap50.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap61 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap62 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray63 = new int[] {};
        binaryEntityMap62.values = intArray63;
        int int66 = binaryEntityMap62.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap67 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap68 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap68.growBy = (short) 10;
        java.lang.String[] strArray71 = binaryEntityMap68.names;
        arrayEntityMap67.names = strArray71;
        binaryEntityMap62.names = strArray71;
        binaryEntityMap61.names = strArray71;
        binaryEntityMap50.names = strArray71;
        arrayEntityMap49.names = strArray71;
        arrayEntityMap38.names = strArray71;
        binaryEntityMap10.names = strArray71;
        entities0.map = binaryEntityMap10;
        // The following exception was thrown during execution in test generation
        try {
            int int81 = entities0.entityValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] {});
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
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
        java.lang.String str32 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str27 = entities25.unescape("");
        int int29 = entities25.entityValue("");
        int int31 = entities25.entityValue("");
        entities25.addEntity("", 97);
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap35 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int37 = primitiveEntityMap35.value("hi!");
        primitiveEntityMap35.add("", (int) (short) 10);
        primitiveEntityMap35.add("", 0);
        java.lang.String str45 = primitiveEntityMap35.name((int) '#');
        java.lang.String str47 = primitiveEntityMap35.name(97);
        int int49 = primitiveEntityMap35.value("");
        int int51 = primitiveEntityMap35.value("");
        entities25.map = primitiveEntityMap35;
        org.apache.commons.lang.Entities.EntityMap entityMap53 = entities25.map;
        int int55 = entities25.entityValue("");
        org.apache.commons.lang.Entities entities56 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap57 = entities56.map;
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
        entities56.addEntities(strArray70);
        entities25.addEntities(strArray70);
        entities0.addEntities(strArray70);
        int int77 = entities0.entityValue("");
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
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(entityMap53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(entities56);
        org.junit.Assert.assertNotNull(entityMap57);
        org.junit.Assert.assertNotNull(entities58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(entities66);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.lang.String str7 = entities0.unescape("hi!");
        java.lang.String str9 = entities0.entityName(10);
        java.lang.String str11 = entities0.entityName((int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str10 = binaryEntityMap8.name((int) (byte) 0);
        binaryEntityMap8.add("", (int) (byte) 0);
        int int14 = binaryEntityMap8.size;
        int[] intArray15 = binaryEntityMap8.values;
        binaryEntityMap0.values = intArray15;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
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
        java.lang.String str62 = entities0.entityName(98);
        java.io.Writer writer63 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer63, "hi!");
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
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        lookupEntityMap34.add("hi!", 0);
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
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str4 = binaryEntityMap2.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap5.growBy = (short) 10;
        java.lang.String[] strArray8 = binaryEntityMap5.names;
        binaryEntityMap5.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap12.growBy = (short) 10;
        java.lang.String[] strArray15 = binaryEntityMap12.names;
        binaryEntityMap5.names = strArray15;
        binaryEntityMap2.names = strArray15;
        int[] intArray18 = binaryEntityMap2.values;
        binaryEntityMap1.values = intArray18;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        binaryEntityMap20.add("", (int) (short) 100);
        java.lang.String str28 = binaryEntityMap20.name((int) (byte) 1);
        java.lang.String str30 = binaryEntityMap20.name((int) ' ');
        int int31 = binaryEntityMap20.size;
        int int33 = binaryEntityMap20.value("hi!");
        java.lang.String[] strArray34 = binaryEntityMap20.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap36 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap36.growBy = (short) 10;
        java.lang.String[] strArray39 = binaryEntityMap36.names;
        arrayEntityMap35.names = strArray39;
        int[] intArray41 = arrayEntityMap35.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap43.ensureCapacity((int) 'a');
        arrayEntityMap43.ensureCapacity(0);
        java.lang.String[] strArray48 = arrayEntityMap43.names;
        arrayEntityMap35.names = strArray48;
        arrayEntityMap35.ensureCapacity(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str55 = arrayEntityMap53.name((int) (short) 100);
        int[] intArray58 = new int[] { (short) 0, (-1) };
        arrayEntityMap53.values = intArray58;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap60.growBy = (short) 10;
        java.lang.String[] strArray63 = binaryEntityMap60.names;
        int[] intArray64 = binaryEntityMap60.values;
        arrayEntityMap53.values = intArray64;
        arrayEntityMap53.add("hi!", (int) (short) 1);
        java.lang.String[] strArray69 = arrayEntityMap53.names;
        arrayEntityMap35.names = strArray69;
        binaryEntityMap20.names = strArray69;
        binaryEntityMap1.names = strArray69;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertArrayEquals(strArray69, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int13 = arrayEntityMap1.value("hi!");
        int int14 = arrayEntityMap1.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 100);
        java.lang.String str20 = binaryEntityMap16.name(32);
        int int21 = binaryEntityMap16.size;
        org.apache.commons.lang.Entities entities22 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer23 = null;
        entities22.escape(writer23, "");
        java.lang.String[][] strArray26 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities22.addEntities(strArray26);
        java.lang.String str29 = entities22.escape("hi!");
        java.lang.String str31 = entities22.unescape("");
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str34 = entities32.unescape("");
        java.io.Writer writer35 = null;
        entities32.escape(writer35, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities32.map = arrayEntityMap39;
        java.lang.String str42 = arrayEntityMap39.name((int) (byte) 100);
        java.lang.String[] strArray43 = arrayEntityMap39.names;
        int int44 = arrayEntityMap39.size;
        entities22.map = arrayEntityMap39;
        java.lang.String str47 = entities22.unescape("hi!");
        int int49 = entities22.entityValue("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap50.growBy = (short) 10;
        java.lang.String[] strArray53 = binaryEntityMap50.names;
        binaryEntityMap50.add("", (int) (short) 100);
        java.lang.String str58 = binaryEntityMap50.name((int) (byte) 1);
        java.lang.String str60 = binaryEntityMap50.name((int) ' ');
        binaryEntityMap50.add("", (int) (short) 0);
        entities22.map = binaryEntityMap50;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap66 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap66.growBy = (short) 10;
        java.lang.String[] strArray69 = binaryEntityMap66.names;
        arrayEntityMap65.names = strArray69;
        binaryEntityMap50.names = strArray69;
        binaryEntityMap16.names = strArray69;
        arrayEntityMap1.names = strArray69;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strArray69);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        int[] intArray10 = binaryEntityMap0.values;
        java.lang.String str12 = binaryEntityMap0.name(101);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        int int22 = arrayEntityMap1.size;
        int int24 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        int int24 = binaryEntityMap0.value("hi!");
        int int26 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
        java.lang.Class<?> wildcardClass42 = strArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.lang.String str7 = hashEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap8 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map9 = hashEntityMap8.mapNameToValue;
        java.util.Map map10 = hashEntityMap8.mapValueToName;
        int int12 = hashEntityMap8.value("");
        int int14 = hashEntityMap8.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap15.mapValueToName = map23;
        hashEntityMap8.mapValueToName = map23;
        int int27 = hashEntityMap8.value("hi!");
        hashEntityMap8.add("hi!", 97);
        java.lang.String str32 = hashEntityMap8.name((int) (short) 100);
        int int34 = hashEntityMap8.value("hi!");
        java.util.Map map35 = hashEntityMap8.mapValueToName;
        hashEntityMap0.mapValueToName = map35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        arrayEntityMap4.add("hi!", (int) (short) 0);
        arrayEntityMap4.growBy = (byte) 100;
        int int13 = arrayEntityMap4.value("hi!");
        arrayEntityMap4.growBy = (short) -1;
        arrayEntityMap4.growBy = 101;
        int int19 = arrayEntityMap4.value("");
        java.lang.String str21 = arrayEntityMap4.name((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("hi!", (int) (byte) 100);
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
        int int52 = hashEntityMap14.value("hi!");
        java.util.Map map53 = hashEntityMap14.mapNameToValue;
        hashEntityMap0.mapNameToValue = map53;
        hashEntityMap0.add("", 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 'a';
        java.lang.String str10 = binaryEntityMap0.name(100);
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.ensureCapacity((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
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
        java.lang.String str29 = entities0.entityName((-1));
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.size = (byte) 100;
        int[] intArray6 = binaryEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = binaryEntityMap1.name(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap6.add("", (int) (short) 1);
        arrayEntityMap6.ensureCapacity((int) ' ');
        int int12 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        entities0.addEntity("", (int) (short) 10);
        java.lang.String str18 = entities0.escape("hi!");
        int int20 = entities0.entityValue("hi!");
        java.lang.String str22 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities0.map;
        java.lang.String str25 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        entities0.addEntity("hi!", 0);
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
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
        binaryEntityMap6.growBy = 1;
        java.lang.String[] strArray33 = binaryEntityMap6.names;
        binaryEntityMap6.ensureCapacity(32);
        entities0.map = binaryEntityMap6;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray33);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
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
        java.lang.String str18 = hashEntityMap0.name((int) (short) -1);
        java.util.Map map19 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        java.util.Map map22 = hashEntityMap20.mapValueToName;
        java.util.Map map23 = hashEntityMap20.mapNameToValue;
        hashEntityMap20.add("", (int) (byte) 10);
        int int28 = hashEntityMap20.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap29.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        hashEntityMap29.mapNameToValue = map34;
        hashEntityMap20.mapNameToValue = map34;
        java.lang.String str38 = hashEntityMap20.name((int) 'a');
        java.util.Map map39 = hashEntityMap20.mapNameToValue;
        hashEntityMap0.mapNameToValue = map39;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str7 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str9 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("hi!", (int) (byte) -1);
        java.lang.String str14 = lookupEntityMap0.name((int) (byte) 1);
        java.lang.String str16 = lookupEntityMap0.name(32);
        java.lang.String str18 = lookupEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
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
        java.lang.Class<?> wildcardClass19 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
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
        java.util.Map map60 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass61 = map60.getClass();
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
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
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
        int int14 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = '#';
        int int6 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int7 = lookupEntityMap0.value("hi!");
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 1);
        int int13 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
// flaky "3) test5129(org.apache.commons.lang.RegressionTest10)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities13 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str15 = entities13.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities13.map = arrayEntityMap17;
        entities13.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities13);
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str25 = entities23.unescape("");
        java.lang.String str27 = entities23.entityName((int) (short) 0);
        java.lang.String str29 = entities23.unescape("hi!");
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str32 = entities30.unescape("");
        int int34 = entities30.entityValue("");
        int int36 = entities30.entityValue("");
        entities30.addEntity("", 97);
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        entities40.addEntity("hi!", 0);
        java.lang.String[][] strArray44 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities40.addEntities(strArray44);
        entities30.addEntities(strArray44);
        entities23.addEntities(strArray44);
        entities13.addEntities(strArray44);
        entities0.addEntities(strArray44);
        org.apache.commons.lang.Entities.EntityMap entityMap50 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap51 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(entityMap50);
        org.junit.Assert.assertNotNull(entityMap51);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
// flaky "4) test5130(org.apache.commons.lang.RegressionTest10)":         org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        java.util.Map map19 = hashEntityMap15.mapNameToValue;
        java.lang.String str21 = hashEntityMap15.name((int) ' ');
        int int23 = hashEntityMap15.value("");
        entities0.map = hashEntityMap15;
        java.lang.String str26 = entities0.entityName((int) (short) 0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String[][] strArray28 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray28);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str22 = entities0.entityName(101);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(100);
        java.lang.String str12 = lookupEntityMap0.name(0);
        java.lang.String str14 = lookupEntityMap0.name(98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        java.lang.String str4 = lookupEntityMap0.name(97);
        int int6 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
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
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        int int18 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str26 = entities24.unescape("");
        java.lang.String str28 = entities24.entityName(100);
        java.lang.String str30 = entities24.entityName((int) ' ');
        java.lang.String str32 = entities24.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities24.map;
        org.apache.commons.lang.Entities.EntityMap entityMap34 = entities24.map;
        java.lang.String str36 = entities24.unescape("hi!");
        org.apache.commons.lang.Entities entities37 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer38 = null;
        entities37.escape(writer38, "");
        java.lang.String[][] strArray41 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities37.addEntities(strArray41);
        entities37.addEntity("hi!", 97);
        org.apache.commons.lang.Entities entities46 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer47 = null;
        entities46.escape(writer47, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap50 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities46.map = primitiveEntityMap50;
        java.lang.String str53 = entities46.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities54 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer55 = null;
        entities54.escape(writer55, "");
        java.lang.String[][] strArray58 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities54.addEntities(strArray58);
        entities46.addEntities(strArray58);
        entities37.addEntities(strArray58);
        entities24.addEntities(strArray58);
        entities0.addEntities(strArray58);
        org.apache.commons.lang.Entities.EntityMap entityMap64 = entities0.map;
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
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertNotNull(entityMap34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(entities37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(entities46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(entities54);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(entityMap64);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
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
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(entityMap32);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        int int10 = binaryEntityMap0.size;
        int int11 = binaryEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray14 = null;
        binaryEntityMap13.names = strArray14;
        java.lang.String str17 = binaryEntityMap13.name(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int20 = binaryEntityMap18.value("");
        java.lang.String str22 = binaryEntityMap18.name((int) (short) 0);
        int int23 = binaryEntityMap18.size;
        int int24 = binaryEntityMap18.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray27 = arrayEntityMap26.names;
        binaryEntityMap18.names = strArray27;
        int int30 = binaryEntityMap18.value("");
        java.lang.String[] strArray31 = binaryEntityMap18.names;
        binaryEntityMap13.names = strArray31;
        int[] intArray33 = binaryEntityMap13.values;
        binaryEntityMap0.values = intArray33;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] {});
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        hashEntityMap0.add("", (int) (short) 0);
        int int12 = hashEntityMap0.value("");
        java.lang.String str14 = hashEntityMap0.name(98);
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap15 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map16 = treeEntityMap15.mapNameToValue;
        java.util.Map map17 = treeEntityMap15.mapNameToValue;
        hashEntityMap0.mapNameToValue = map17;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(35);
        java.lang.String str4 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("", (int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        lookupEntityMap0.add("", 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 100);
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        int int15 = binaryEntityMap11.value("hi!");
        int[] intArray16 = binaryEntityMap11.values;
        int[] intArray17 = binaryEntityMap11.values;
        binaryEntityMap0.values = intArray17;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        int int9 = hashEntityMap0.value("hi!");
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 35);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        java.lang.String str14 = binaryEntityMap0.name((-1));
        java.lang.String str16 = binaryEntityMap0.name(97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
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
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
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
        int int25 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 1);
        int int12 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
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
        java.util.Map map25 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        java.lang.String str30 = entities0.escape("");
        java.lang.String str32 = entities0.unescape("hi!");
        java.lang.String str34 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        int[] intArray10 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.value("");
        java.lang.String str14 = arrayEntityMap1.name(32);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        java.util.Map map22 = hashEntityMap20.mapValueToName;
        int int24 = hashEntityMap20.value("");
        java.util.Map map25 = hashEntityMap20.mapValueToName;
        java.util.Map map26 = hashEntityMap20.mapValueToName;
        hashEntityMap0.mapNameToValue = map26;
        java.lang.Class<?> wildcardClass28 = map26.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
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
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap5.ensureCapacity((int) 'a');
        arrayEntityMap5.ensureCapacity(0);
        arrayEntityMap5.add("hi!", 100);
        java.lang.String str14 = arrayEntityMap5.name((int) 'a');
        int int16 = arrayEntityMap5.value("");
        int[] intArray17 = arrayEntityMap5.values;
        entities0.map = arrayEntityMap5;
        int int20 = arrayEntityMap5.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) -1);
        hashEntityMap0.add("", (-1));
        java.lang.String str14 = hashEntityMap0.name((int) (short) 1);
        java.util.Map map15 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap18.mapNameToValue = map23;
        int int26 = hashEntityMap18.value("");
        java.util.Map map27 = hashEntityMap18.mapNameToValue;
        hashEntityMap16.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap16.mapValueToName;
        hashEntityMap0.mapValueToName = map29;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
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
        binaryEntityMap11.growBy = (byte) 1;
        binaryEntityMap11.add("", 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        java.lang.String str9 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("", 1);
        primitiveEntityMap0.add("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.escape("");
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("");
        java.lang.String str5 = entities0.escape("");
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        binaryEntityMap9.add("hi!", 0);
        entities0.map = binaryEntityMap9;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String str12 = hashEntityMap0.name((int) '#');
        java.lang.String str14 = hashEntityMap0.name(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        entities0.addEntity("", (int) (short) 0);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.entityName((int) '4');
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 10);
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 10);
        java.lang.String str11 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", 98);
        java.lang.String str16 = lookupEntityMap0.name(3);
        java.lang.String str18 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        int int4 = arrayEntityMap0.value("");
        java.lang.String[] strArray5 = arrayEntityMap0.names;
        int[] intArray11 = new int[] { 52, (short) 10, (byte) -1, '#', '#' };
        arrayEntityMap0.values = intArray11;
        arrayEntityMap0.size = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 52, 10, (-1), 35, 35 });
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.growBy = (-1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        int int6 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int9 = binaryEntityMap7.value("");
        binaryEntityMap7.size = '#';
        binaryEntityMap7.size = (byte) 10;
        java.lang.String str15 = binaryEntityMap7.name((int) '4');
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer17 = null;
        entities16.escape(writer17, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities16);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int23 = arrayEntityMap21.value("hi!");
        entities16.map = arrayEntityMap21;
        java.lang.String str26 = entities16.entityName((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray29 = null;
        binaryEntityMap28.names = strArray29;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        entities16.map = binaryEntityMap28;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        binaryEntityMap33.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap40.growBy = (short) 10;
        java.lang.String[] strArray43 = binaryEntityMap40.names;
        binaryEntityMap33.names = strArray43;
        binaryEntityMap33.ensureCapacity((int) (short) 0);
        java.lang.String str48 = binaryEntityMap33.name((int) 'a');
        binaryEntityMap33.size = 1;
        binaryEntityMap33.growBy = (byte) 10;
        java.lang.String[] strArray53 = binaryEntityMap33.names;
        binaryEntityMap28.names = strArray53;
        binaryEntityMap7.names = strArray53;
        java.lang.String[] strArray56 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray56;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strArray31);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = (short) 10;
        java.lang.String[] strArray11 = binaryEntityMap8.names;
        int[] intArray12 = binaryEntityMap8.values;
        arrayEntityMap1.values = intArray12;
        java.lang.String str15 = arrayEntityMap1.name((int) (short) 0);
        arrayEntityMap1.ensureCapacity(10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap5 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int6 = binaryEntityMap5.growBy;
        int[] intArray7 = binaryEntityMap5.values;
        binaryEntityMap0.values = intArray7;
        binaryEntityMap0.ensureCapacity(32);
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str13 = entities11.unescape("");
        java.lang.String str15 = entities11.entityName(100);
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
        entities11.map = binaryEntityMap16;
        java.lang.String str32 = binaryEntityMap16.name((int) (short) -1);
        int[] intArray33 = binaryEntityMap16.values;
        java.lang.String str35 = binaryEntityMap16.name(10);
        java.lang.String[] strArray36 = binaryEntityMap16.names;
        binaryEntityMap0.names = strArray36;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str40 = binaryEntityMap38.name((int) (byte) 0);
        int int42 = binaryEntityMap38.value("");
        binaryEntityMap38.growBy = 10;
        java.lang.String str46 = binaryEntityMap38.name((int) (byte) 10);
        java.lang.String str48 = binaryEntityMap38.name((int) (byte) -1);
        int[] intArray49 = binaryEntityMap38.values;
        java.lang.String str51 = binaryEntityMap38.name((int) (short) -1);
        java.lang.String[] strArray52 = binaryEntityMap38.names;
        binaryEntityMap0.names = strArray52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] {});
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map5 = treeEntityMap4.mapNameToValue;
        hashEntityMap0.mapValueToName = map5;
        hashEntityMap0.add("hi!", 0);
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) ' ');
        int int14 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap15.add("hi!", (int) 'a');
        int int26 = hashEntityMap15.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int29 = hashEntityMap27.value("hi!");
        java.util.Map map30 = hashEntityMap27.mapValueToName;
        int int32 = hashEntityMap27.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap34.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        hashEntityMap34.mapNameToValue = map39;
        hashEntityMap33.mapNameToValue = map39;
        java.util.Map map42 = hashEntityMap33.mapNameToValue;
        hashEntityMap27.mapNameToValue = map42;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap44.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        hashEntityMap44.mapNameToValue = map49;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapNameToValue;
        hashEntityMap44.mapValueToName = map52;
        hashEntityMap27.mapNameToValue = map52;
        hashEntityMap15.mapNameToValue = map52;
        hashEntityMap0.mapNameToValue = map52;
        int int58 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str24 = binaryEntityMap22.name((int) (byte) 0);
        int int26 = binaryEntityMap22.value("");
        binaryEntityMap22.growBy = 10;
        binaryEntityMap22.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray35 = new int[] {};
        binaryEntityMap34.values = intArray35;
        int int38 = binaryEntityMap34.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap40 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap40.growBy = (short) 10;
        java.lang.String[] strArray43 = binaryEntityMap40.names;
        arrayEntityMap39.names = strArray43;
        binaryEntityMap34.names = strArray43;
        binaryEntityMap33.names = strArray43;
        binaryEntityMap22.names = strArray43;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap48.growBy = (short) 10;
        java.lang.String[] strArray51 = binaryEntityMap48.names;
        binaryEntityMap22.names = strArray51;
        int int53 = binaryEntityMap22.size;
        binaryEntityMap22.growBy = '#';
        entities0.map = binaryEntityMap22;
        java.lang.String str58 = entities0.entityName((int) (byte) 100);
        org.apache.commons.lang.Entities entities59 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap60 = entities59.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities59);
        java.lang.String str63 = entities59.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap64 = entities59.map;
        org.apache.commons.lang.Entities entities65 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap66 = entities65.map;
        java.lang.String str68 = entities65.escape("hi!");
        java.lang.String str70 = entities65.unescape("hi!");
        java.lang.String[][] strArray71 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities65.addEntities(strArray71);
        entities59.addEntities(strArray71);
        entities0.addEntities(strArray71);
        // The following exception was thrown during execution in test generation
        try {
            int int76 = entities0.entityValue("");
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] {});
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(entities59);
        org.junit.Assert.assertNotNull(entityMap60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(entityMap64);
        org.junit.Assert.assertNotNull(entities65);
        org.junit.Assert.assertNotNull(entityMap66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        hashEntityMap0.add("", 100);
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
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 0);
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.add("", 97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name((int) '4');
        int int8 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap12.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        hashEntityMap12.mapNameToValue = map17;
        hashEntityMap11.mapNameToValue = map17;
        java.util.Map map20 = hashEntityMap11.mapNameToValue;
        int int22 = hashEntityMap11.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        hashEntityMap11.mapValueToName = map26;
        hashEntityMap9.mapValueToName = map26;
        java.util.Map map29 = hashEntityMap9.mapValueToName;
        hashEntityMap0.mapValueToName = map29;
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str35 = hashEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
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
        int int27 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, (-1) });
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        int int7 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("hi!", (-1));
        int int12 = primitiveEntityMap4.value("");
        int int14 = primitiveEntityMap4.value("");
        java.lang.String str16 = primitiveEntityMap4.name((int) (byte) 0);
        int int18 = primitiveEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        binaryEntityMap0.growBy = 2;
        binaryEntityMap0.size = (byte) 100;
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        arrayEntityMap1.add("hi!", (int) (short) -1);
        arrayEntityMap1.growBy = '4';
        int int17 = arrayEntityMap1.value("");
        int int19 = arrayEntityMap1.value("");
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
        arrayEntityMap1.values = intArray37;
        int int40 = arrayEntityMap1.value("");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        java.lang.String str19 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(entityMap21);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        java.util.Map map29 = hashEntityMap0.mapValueToName;
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        java.lang.String str10 = lookupEntityMap0.name((int) '4');
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.ensureCapacity(101);
        binaryEntityMap0.size = 0;
        int int21 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        java.lang.String str42 = hashEntityMap0.name((int) (short) -1);
        java.util.Map map43 = hashEntityMap0.mapValueToName;
        java.lang.Class<?> wildcardClass44 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 1);
        int[] intArray14 = binaryEntityMap0.values;
        binaryEntityMap0.size = 101;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(intArray14);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        int int3 = entities0.entityValue("");
        java.lang.String str5 = entities0.escape("");
        entities0.addEntity("hi!", 3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int13 = hashEntityMap11.value("hi!");
        java.util.Map map14 = hashEntityMap11.mapValueToName;
        int int16 = hashEntityMap11.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap18.mapNameToValue = map23;
        hashEntityMap17.mapNameToValue = map23;
        java.util.Map map26 = hashEntityMap17.mapNameToValue;
        hashEntityMap11.mapNameToValue = map26;
        entities0.map = hashEntityMap11;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        int int8 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int14 = arrayEntityMap13.growBy;
        int int15 = arrayEntityMap13.size;
        arrayEntityMap13.size = (short) -1;
        entities0.map = arrayEntityMap13;
        java.lang.String str20 = entities0.unescape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntity("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.ensureCapacity((int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
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
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities0.map;
        java.lang.String str35 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(entityMap33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int[] intArray3 = binaryEntityMap0.values;
        binaryEntityMap0.size = 100;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        java.lang.Class<?> wildcardClass20 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        int int14 = hashEntityMap0.value("hi!");
        java.lang.String str16 = hashEntityMap0.name((int) (short) -1);
        java.lang.String str18 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        binaryEntityMap0.ensureCapacity(10);
        java.lang.String str29 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        int[] intArray4 = binaryEntityMap0.values;
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 100);
        int int11 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(100);
        java.lang.String str12 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", 98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("");
        int int8 = entities0.entityValue("");
        java.lang.String str10 = entities0.entityName(52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("hi!");
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        java.lang.String str6 = binaryEntityMap0.name(0);
        binaryEntityMap0.add("hi!", 1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
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
        java.lang.String str49 = lookupEntityMap34.name(52);
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(32);
        int int15 = binaryEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass16 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) -1);
        binaryEntityMap0.ensureCapacity((int) 'a');
        binaryEntityMap0.add("hi!", 100);
        binaryEntityMap0.size = (short) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
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
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray29 = new int[] {};
        binaryEntityMap28.values = intArray29;
        int int32 = binaryEntityMap28.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        arrayEntityMap33.names = strArray37;
        binaryEntityMap28.names = strArray37;
        binaryEntityMap27.names = strArray37;
        java.lang.String str42 = binaryEntityMap27.name(10);
        java.lang.String str44 = binaryEntityMap27.name(100);
        int int46 = binaryEntityMap27.value("hi!");
        entities0.map = binaryEntityMap27;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
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
        binaryEntityMap0.size = (short) 0;
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
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
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
        java.lang.String[] strArray16 = binaryEntityMap0.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = binaryEntityMap0.name((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
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
        int[] intArray17 = arrayEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        int int8 = binaryEntityMap0.growBy;
        java.lang.String str10 = binaryEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap12.add("", 52);
        java.lang.String[] strArray16 = arrayEntityMap12.names;
        binaryEntityMap0.names = strArray16;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        binaryEntityMap0.add("", 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str11 = binaryEntityMap9.name((int) (byte) 0);
        java.lang.String str13 = binaryEntityMap9.name((int) '#');
        java.lang.String str15 = binaryEntityMap9.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str18 = binaryEntityMap16.name((int) (byte) 0);
        binaryEntityMap16.add("", (int) (byte) 0);
        binaryEntityMap16.growBy = 0;
        binaryEntityMap16.add("hi!", 2);
        binaryEntityMap16.size = (byte) 1;
        int[] intArray29 = binaryEntityMap16.values;
        int int30 = binaryEntityMap16.size;
        binaryEntityMap16.growBy = (short) 10;
        int[] intArray33 = binaryEntityMap16.values;
        binaryEntityMap9.values = intArray33;
        binaryEntityMap0.values = intArray33;
        int int37 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.ensureCapacity(97);
        int int40 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        arrayEntityMap1.add("hi!", (int) (byte) -1);
        java.lang.String str8 = arrayEntityMap1.name((int) (byte) 1);
        int int10 = arrayEntityMap1.value("hi!");
        java.lang.String[] strArray11 = arrayEntityMap1.names;
        int int12 = arrayEntityMap1.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        int int3 = binaryEntityMap1.value("");
        int int4 = binaryEntityMap1.growBy;
        int int5 = binaryEntityMap1.growBy;
        java.lang.String str7 = binaryEntityMap1.name((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) '#');
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities entities8 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities8.map;
        java.lang.String str11 = entities8.unescape("hi!");
        java.lang.String str13 = entities8.unescape("");
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str16 = entities14.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities14.map = arrayEntityMap18;
        entities14.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities14);
        org.apache.commons.lang.Entities entities24 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str26 = entities24.unescape("");
        java.lang.String str28 = entities24.entityName((int) (short) 0);
        java.lang.String str30 = entities24.unescape("hi!");
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str33 = entities31.unescape("");
        int int35 = entities31.entityValue("");
        int int37 = entities31.entityValue("");
        entities31.addEntity("", 97);
        org.apache.commons.lang.Entities entities41 = org.apache.commons.lang.Entities.HTML32;
        entities41.addEntity("hi!", 0);
        java.lang.String[][] strArray45 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities41.addEntities(strArray45);
        entities31.addEntities(strArray45);
        entities24.addEntities(strArray45);
        entities14.addEntities(strArray45);
        entities8.addEntities(strArray45);
        entities0.addEntities(strArray45);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(entities41);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
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
        int int15 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        java.lang.String str8 = arrayEntityMap4.name((int) (byte) 0);
        int[] intArray9 = arrayEntityMap4.values;
        int[] intArray10 = arrayEntityMap4.values;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str8 = binaryEntityMap1.name(52);
        int int9 = binaryEntityMap1.growBy;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", 0);
        int int15 = binaryEntityMap0.value("");
        java.lang.String str17 = binaryEntityMap0.name((-1));
        int[] intArray18 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
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
        java.lang.String str35 = hashEntityMap0.name(97);
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str38 = entities36.unescape("");
        int int40 = entities36.entityValue("");
        int int42 = entities36.entityValue("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int45 = hashEntityMap43.value("hi!");
        java.util.Map map46 = hashEntityMap43.mapValueToName;
        int int48 = hashEntityMap43.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap50.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        hashEntityMap50.mapNameToValue = map55;
        hashEntityMap49.mapNameToValue = map55;
        java.util.Map map58 = hashEntityMap49.mapNameToValue;
        hashEntityMap43.mapNameToValue = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap60.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        hashEntityMap60.mapNameToValue = map65;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = hashEntityMap67.mapNameToValue;
        hashEntityMap60.mapValueToName = map68;
        hashEntityMap43.mapNameToValue = map68;
        entities36.map = hashEntityMap43;
        int int73 = hashEntityMap43.value("");
        java.util.Map map74 = hashEntityMap43.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap75 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map76 = hashEntityMap75.mapNameToValue;
        int int78 = hashEntityMap75.value("");
        hashEntityMap75.add("", (int) '4');
        int int83 = hashEntityMap75.value("hi!");
        java.util.Map map84 = hashEntityMap75.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap85 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap85.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap89 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map90 = hashEntityMap89.mapNameToValue;
        hashEntityMap85.mapNameToValue = map90;
        int int93 = hashEntityMap85.value("");
        java.util.Map map94 = hashEntityMap85.mapNameToValue;
        hashEntityMap75.mapValueToName = map94;
        hashEntityMap43.mapValueToName = map94;
        hashEntityMap0.mapValueToName = map94;
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        binaryEntityMap0.add("hi!", 0);
        binaryEntityMap0.add("hi!", 100);
        java.lang.String str12 = binaryEntityMap0.name(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(entityMap12);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
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
        primitiveEntityMap13.add("", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap24.growBy = (short) 10;
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        binaryEntityMap24.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap31.growBy = (short) 10;
        java.lang.String[] strArray34 = binaryEntityMap31.names;
        binaryEntityMap24.names = strArray34;
        binaryEntityMap24.ensureCapacity((int) (short) 0);
        java.lang.String str39 = binaryEntityMap24.name((int) 'a');
        binaryEntityMap24.size = 1;
        binaryEntityMap24.growBy = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str46 = binaryEntityMap44.name((int) (byte) 0);
        int int48 = binaryEntityMap44.value("");
        binaryEntityMap44.add("", (int) (short) -1);
        binaryEntityMap44.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap56 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap56.ensureCapacity((int) 'a');
        arrayEntityMap56.ensureCapacity(0);
        java.lang.String[] strArray61 = arrayEntityMap56.names;
        binaryEntityMap44.names = strArray61;
        binaryEntityMap24.names = strArray61;
        binaryEntityMap5.names = strArray61;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.entityName(2);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        entities0.addEntity("hi!", (int) (short) 10);
        java.io.Writer writer7 = null;
        entities0.escape(writer7, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        java.lang.String[] strArray18 = binaryEntityMap17.names;
        binaryEntityMap0.names = strArray18;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        java.lang.String str12 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (short) 1;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int17 = arrayEntityMap16.growBy;
        java.lang.String[] strArray18 = arrayEntityMap16.names;
        arrayEntityMap16.add("hi!", (int) (byte) -1);
        arrayEntityMap16.ensureCapacity(52);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int25 = binaryEntityMap24.growBy;
        binaryEntityMap24.add("", (int) (short) 100);
        binaryEntityMap24.size = (byte) 100;
        int int31 = binaryEntityMap24.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap37.growBy = (short) 10;
        java.lang.String[] strArray40 = binaryEntityMap37.names;
        arrayEntityMap36.names = strArray40;
        int[] intArray42 = arrayEntityMap36.values;
        binaryEntityMap32.values = intArray42;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        java.lang.String[] strArray47 = binaryEntityMap44.names;
        int int49 = binaryEntityMap44.value("");
        binaryEntityMap44.growBy = (short) 1;
        binaryEntityMap44.size = 100;
        binaryEntityMap44.add("", 100);
        java.lang.String[] strArray57 = binaryEntityMap44.names;
        binaryEntityMap32.names = strArray57;
        binaryEntityMap32.add("", 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap63 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap63.ensureCapacity((int) 'a');
        arrayEntityMap63.ensureCapacity(0);
        arrayEntityMap63.add("hi!", 100);
        java.lang.String str72 = arrayEntityMap63.name((int) 'a');
        int int74 = arrayEntityMap63.value("");
        int[] intArray75 = arrayEntityMap63.values;
        int[] intArray76 = arrayEntityMap63.values;
        binaryEntityMap32.values = intArray76;
        binaryEntityMap24.values = intArray76;
        arrayEntityMap16.values = intArray76;
        binaryEntityMap0.values = intArray76;
        java.lang.String[] strArray81 = null;
        binaryEntityMap0.names = strArray81;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertNotNull(intArray76);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
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
        arrayEntityMap1.ensureCapacity(100);
        arrayEntityMap1.growBy = '4';
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        java.lang.String str10 = arrayEntityMap7.name((int) (byte) 100);
        java.lang.String[] strArray11 = arrayEntityMap7.names;
        int int12 = arrayEntityMap7.size;
        java.lang.String str14 = arrayEntityMap7.name(3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        int int10 = entities0.entityValue("");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName((int) (short) -1);
        java.lang.String str16 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap35.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapNameToValue;
        hashEntityMap35.mapNameToValue = map40;
        hashEntityMap34.mapNameToValue = map40;
        java.util.Map map43 = hashEntityMap34.mapNameToValue;
        int int45 = hashEntityMap34.value("hi!");
        hashEntityMap34.add("", (int) (byte) 0);
        java.lang.String str50 = hashEntityMap34.name((int) (short) 0);
        hashEntityMap34.add("", (int) (byte) -1);
        java.lang.String str55 = hashEntityMap34.name((int) (short) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap57.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        hashEntityMap57.mapNameToValue = map62;
        hashEntityMap56.mapNameToValue = map62;
        java.util.Map map65 = hashEntityMap56.mapNameToValue;
        hashEntityMap56.add("hi!", 1);
        hashEntityMap56.add("hi!", (int) 'a');
        java.util.Map map72 = hashEntityMap56.mapNameToValue;
        hashEntityMap34.mapValueToName = map72;
        hashEntityMap0.mapNameToValue = map72;
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
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        java.util.Map map32 = hashEntityMap0.mapNameToValue;
        int int34 = hashEntityMap0.value("");
        int int36 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        binaryEntityMap0.growBy = (byte) 1;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        int int9 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
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
        int[] intArray38 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(intArray38);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
        int int13 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap14 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str16 = primitiveEntityMap14.name((int) (byte) 0);
        primitiveEntityMap14.add("hi!", (int) (byte) 1);
        int int21 = primitiveEntityMap14.value("");
        primitiveEntityMap14.add("", 10);
        java.lang.String str26 = primitiveEntityMap14.name(97);
        java.lang.String str28 = primitiveEntityMap14.name(100);
        primitiveEntityMap14.add("", 35);
        entities0.map = primitiveEntityMap14;
        int int34 = primitiveEntityMap14.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
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
        java.lang.String str88 = entities0.escape("hi!");
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        arrayEntityMap1.growBy = (-1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int14 = binaryEntityMap13.size;
        java.lang.String[] strArray15 = binaryEntityMap13.names;
        arrayEntityMap1.names = strArray15;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        java.lang.String str10 = binaryEntityMap0.name(0);
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap4 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map5 = treeEntityMap4.mapNameToValue;
        hashEntityMap0.mapValueToName = map5;
        hashEntityMap0.add("hi!", 0);
        int int11 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        int int16 = hashEntityMap12.value("");
        java.util.Map map17 = hashEntityMap12.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int20 = hashEntityMap18.value("hi!");
        java.util.Map map21 = hashEntityMap18.mapValueToName;
        int int23 = hashEntityMap18.value("");
        java.util.Map map24 = hashEntityMap18.mapNameToValue;
        hashEntityMap12.mapNameToValue = map24;
        hashEntityMap12.add("hi!", 32);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap30.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        hashEntityMap30.mapNameToValue = map35;
        hashEntityMap29.mapNameToValue = map35;
        java.util.Map map38 = hashEntityMap29.mapNameToValue;
        hashEntityMap29.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int44 = hashEntityMap42.value("hi!");
        java.util.Map map45 = hashEntityMap42.mapValueToName;
        int int47 = hashEntityMap42.value("");
        java.util.Map map48 = hashEntityMap42.mapNameToValue;
        hashEntityMap29.mapValueToName = map48;
        hashEntityMap12.mapNameToValue = map48;
        hashEntityMap0.mapNameToValue = map48;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
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
        java.lang.String str19 = entities0.unescape("");
        int int21 = entities0.entityValue("hi!");
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer22, "hi!");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
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
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer27, "hi!");
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
        org.junit.Assert.assertNotNull(entityMap25);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        java.lang.String str40 = hashEntityMap0.name(101);
        java.util.Map map41 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
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
        binaryEntityMap0.size = 3;
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 0, (-1) });
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        int[] intArray25 = binaryEntityMap22.values;
        binaryEntityMap5.values = intArray25;
        binaryEntityMap5.growBy = (short) 100;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.entityName((int) (short) 1);
        entities0.addEntity("hi!", 1);
        entities0.addEntity("", (int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer12 = null;
        entities11.escape(writer12, "");
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities11.map;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        java.util.Map map18 = hashEntityMap16.mapValueToName;
        java.util.Map map19 = hashEntityMap16.mapNameToValue;
        hashEntityMap16.add("", (int) (byte) 10);
        int int24 = hashEntityMap16.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap25.mapNameToValue = map30;
        hashEntityMap16.mapNameToValue = map30;
        hashEntityMap16.add("", (int) (short) 0);
        hashEntityMap16.add("hi!", (int) '4');
        entities11.map = hashEntityMap16;
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer41 = null;
        entities40.escape(writer41, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap44 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities40.map = primitiveEntityMap44;
        java.lang.String str47 = entities40.entityName((int) (short) -1);
        java.lang.String[][] strArray48 = new java.lang.String[][] {};
        entities40.addEntities(strArray48);
        entities11.addEntities(strArray48);
        entities0.addEntities(strArray48);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[][] {});
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        int int15 = lookupEntityMap0.value("");
        java.lang.String str17 = lookupEntityMap0.name((int) (byte) 10);
        java.lang.String str19 = lookupEntityMap0.name((int) ' ');
        java.lang.String str21 = lookupEntityMap0.name((int) 'a');
        java.lang.String str23 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
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
        java.lang.String str29 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap30 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer32 = null;
        entities0.escape(writer32, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(entityMap30);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        entities0.escape(writer19, "");
        java.lang.String str23 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int26 = entities0.entityValue("");
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
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
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
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.growBy = (byte) 100;
        int[] intArray10 = arrayEntityMap1.values;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
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
        int int19 = entities0.entityValue("hi!");
        int int21 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
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
        entities0.addEntity("hi!", 0);
        entities0.addEntity("hi!", 100);
        java.lang.String str44 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) 'a');
        entities0.map = binaryEntityMap22;
        binaryEntityMap22.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap28.ensureCapacity((int) 'a');
        arrayEntityMap28.ensureCapacity(0);
        arrayEntityMap28.add("hi!", 100);
        java.lang.String str37 = arrayEntityMap28.name((int) 'a');
        int int39 = arrayEntityMap28.value("");
        int[] intArray40 = arrayEntityMap28.values;
        arrayEntityMap28.ensureCapacity((int) (byte) -1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap44 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap44.add("", 52);
        java.lang.String[] strArray48 = arrayEntityMap44.names;
        arrayEntityMap28.names = strArray48;
        int[] intArray50 = arrayEntityMap28.values;
        binaryEntityMap22.values = intArray50;
        int[] intArray52 = binaryEntityMap22.values;
        int int53 = binaryEntityMap22.size;
        java.lang.String str55 = binaryEntityMap22.name((int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        binaryEntityMap0.size = (short) -1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        java.lang.String[] strArray25 = binaryEntityMap0.names;
        java.lang.String str27 = binaryEntityMap0.name(35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '4');
        binaryEntityMap1.add("hi!", 100);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
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
        java.lang.String str42 = hashEntityMap0.name(100);
        java.lang.String str44 = hashEntityMap0.name(3);
        java.lang.String str46 = hashEntityMap0.name((int) (byte) 100);
        int int48 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
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
        java.lang.String str52 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str55 = entities0.entityName((int) (short) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "5) test5251(org.apache.commons.lang.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
// flaky "1) test5251(org.apache.commons.lang.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
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
        int int18 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap20.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap20.mapNameToValue = map25;
        hashEntityMap19.mapNameToValue = map25;
        java.util.Map map28 = hashEntityMap19.mapNameToValue;
        hashEntityMap19.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int34 = hashEntityMap32.value("hi!");
        java.util.Map map35 = hashEntityMap32.mapValueToName;
        int int37 = hashEntityMap32.value("");
        java.util.Map map38 = hashEntityMap32.mapNameToValue;
        hashEntityMap19.mapValueToName = map38;
        hashEntityMap19.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap43.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        hashEntityMap43.mapNameToValue = map48;
        hashEntityMap43.add("hi!", (int) 'a');
        int int54 = hashEntityMap43.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap55 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int57 = hashEntityMap55.value("hi!");
        java.util.Map map58 = hashEntityMap55.mapValueToName;
        int int60 = hashEntityMap55.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap62.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        hashEntityMap62.mapNameToValue = map67;
        hashEntityMap61.mapNameToValue = map67;
        java.util.Map map70 = hashEntityMap61.mapNameToValue;
        hashEntityMap55.mapNameToValue = map70;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap72.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = hashEntityMap76.mapNameToValue;
        hashEntityMap72.mapNameToValue = map77;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = hashEntityMap79.mapNameToValue;
        hashEntityMap72.mapValueToName = map80;
        hashEntityMap55.mapNameToValue = map80;
        hashEntityMap43.mapNameToValue = map80;
        hashEntityMap19.mapNameToValue = map80;
        hashEntityMap0.mapValueToName = map80;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
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
        hashEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap23.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        hashEntityMap23.mapNameToValue = map28;
        hashEntityMap22.mapNameToValue = map28;
        java.util.Map map31 = hashEntityMap22.mapNameToValue;
        hashEntityMap22.add("", (int) (byte) 1);
        hashEntityMap22.add("", 0);
        java.util.Map map38 = hashEntityMap22.mapValueToName;
        int int40 = hashEntityMap22.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap42.mapNameToValue = map47;
        hashEntityMap41.mapNameToValue = map47;
        java.util.Map map50 = hashEntityMap41.mapNameToValue;
        java.util.Map map51 = hashEntityMap41.mapNameToValue;
        hashEntityMap22.mapValueToName = map51;
        hashEntityMap0.mapValueToName = map51;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = (byte) 10;
        java.lang.String str14 = binaryEntityMap0.name((int) (short) 100);
        java.lang.String str16 = binaryEntityMap0.name((int) '4');
        binaryEntityMap0.size = (byte) -1;
        java.lang.String[] strArray19 = binaryEntityMap0.names;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap13 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        java.lang.Class<?> wildcardClass15 = entityMap14.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String[][] strArray10 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray10);
        java.lang.String str13 = entities0.escape("");
        java.lang.String str15 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("hi!", (int) (short) -1);
        int int12 = hashEntityMap0.value("");
        java.lang.String str14 = hashEntityMap0.name((int) '#');
        hashEntityMap0.add("", 98);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        java.lang.String str10 = binaryEntityMap0.name(0);
        binaryEntityMap0.size = 98;
        int int13 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
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
        java.util.Map map36 = hashEntityMap0.mapNameToValue;
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        java.util.Map map40 = hashEntityMap38.mapValueToName;
        java.util.Map map41 = hashEntityMap38.mapNameToValue;
        hashEntityMap38.add("", (int) (byte) 10);
        hashEntityMap38.add("hi!", 2);
        java.util.Map map48 = hashEntityMap38.mapValueToName;
        hashEntityMap0.mapValueToName = map48;
        hashEntityMap0.add("", 100);
        java.lang.Class<?> wildcardClass53 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 0);
        int int3 = arrayEntityMap1.value("");
        java.lang.String str5 = arrayEntityMap1.name((int) (byte) 10);
        arrayEntityMap1.add("hi!", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = '4';
        java.lang.String str13 = binaryEntityMap9.name(100);
        int int14 = binaryEntityMap9.growBy;
        java.lang.String str16 = binaryEntityMap9.name((int) ' ');
        int[] intArray17 = binaryEntityMap9.values;
        java.lang.String[] strArray18 = binaryEntityMap9.names;
        arrayEntityMap1.names = strArray18;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        int int6 = lookupEntityMap0.value("");
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("hi!", (int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name((int) (short) 1);
        int int17 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str7 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", (int) '#');
        java.lang.String str12 = lookupEntityMap0.name((int) (short) 10);
        int int14 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
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
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName(100);
        java.lang.String str22 = entities16.unescape("hi!");
        java.lang.String str24 = entities16.entityName((int) (byte) 10);
        int int26 = entities16.entityValue("");
        java.lang.String str28 = entities16.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities16.map;
        org.apache.commons.lang.Entities.EntityMap entityMap30 = entities16.map;
        entities0.map = entityMap30;
        org.apache.commons.lang.Entities entities32 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str34 = entities32.unescape("");
        java.lang.String str36 = entities32.entityName(100);
        java.lang.String str38 = entities32.entityName((int) ' ');
        java.lang.String str40 = entities32.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap41 = entities32.map;
        java.lang.String[][] strArray42 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities32.addEntities(strArray42);
        entities0.addEntities(strArray42);
        java.lang.String str46 = entities0.entityName((int) (byte) 0);
        java.io.Writer writer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer47, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertNotNull(entityMap30);
        org.junit.Assert.assertNotNull(entities32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(entityMap41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        int[] intArray10 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("", (int) '4');
        arrayEntityMap1.size = (-1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
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
        int int51 = lookupEntityMap34.value("");
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.ensureCapacity((int) '4');
        int[] intArray6 = arrayEntityMap1.values;
        int int8 = arrayEntityMap1.value("hi!");
        java.lang.String str10 = arrayEntityMap1.name(0);
        java.lang.String str12 = arrayEntityMap1.name(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        java.lang.String[] strArray4 = arrayEntityMap0.names;
        int int5 = arrayEntityMap0.size;
        int int6 = arrayEntityMap0.size;
        arrayEntityMap0.add("hi!", (int) (short) -1);
        arrayEntityMap0.ensureCapacity(3);
        arrayEntityMap0.size = (short) 1;
        int int14 = arrayEntityMap0.size;
        arrayEntityMap0.ensureCapacity((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
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
        java.lang.String str43 = binaryEntityMap0.name(0);
        binaryEntityMap0.size = (short) 1;
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
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = null;
        entities0.map = entityMap7;
        java.lang.String str10 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        java.lang.String str22 = hashEntityMap0.name((int) (short) 1);
        hashEntityMap0.add("", 0);
        java.util.Map map26 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        java.util.Map map31 = hashEntityMap27.mapNameToValue;
        java.lang.String str33 = hashEntityMap27.name((int) ' ');
        int int35 = hashEntityMap27.value("");
        hashEntityMap27.add("hi!", (int) 'a');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap39.add("hi!", (int) '4');
        int int50 = hashEntityMap39.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapNameToValue;
        java.util.Map map53 = hashEntityMap51.mapValueToName;
        int int55 = hashEntityMap51.value("");
        int int57 = hashEntityMap51.value("hi!");
        java.util.Map map58 = hashEntityMap51.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        int int69 = hashEntityMap61.value("");
        java.util.Map map70 = hashEntityMap61.mapNameToValue;
        hashEntityMap59.mapNameToValue = map70;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map73 = hashEntityMap72.mapNameToValue;
        java.util.Map map74 = hashEntityMap72.mapValueToName;
        java.util.Map map75 = hashEntityMap72.mapNameToValue;
        java.util.Map map76 = hashEntityMap72.mapValueToName;
        hashEntityMap59.mapValueToName = map76;
        hashEntityMap51.mapValueToName = map76;
        hashEntityMap39.mapValueToName = map76;
        hashEntityMap27.mapValueToName = map76;
        hashEntityMap0.mapValueToName = map76;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        java.lang.String str6 = binaryEntityMap0.name(10);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.add("hi!", (int) (short) 100);
        binaryEntityMap0.growBy = 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.lang.String str4 = hashEntityMap0.name(100);
        java.lang.String str6 = hashEntityMap0.name(32);
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        org.apache.commons.lang.Entities.EntityMap entityMap33 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(entityMap33);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 1);
        int int2 = arrayEntityMap1.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray4 = new int[] {};
        binaryEntityMap3.values = intArray4;
        int int7 = binaryEntityMap3.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        binaryEntityMap3.names = strArray12;
        int int16 = binaryEntityMap3.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str19 = binaryEntityMap17.name((int) (byte) 0);
        java.lang.String str21 = binaryEntityMap17.name((int) '#');
        java.lang.String str23 = binaryEntityMap17.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str26 = binaryEntityMap24.name((int) (byte) 0);
        int int28 = binaryEntityMap24.value("");
        binaryEntityMap24.add("", (int) (short) -1);
        binaryEntityMap24.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap36.ensureCapacity((int) 'a');
        arrayEntityMap36.ensureCapacity(0);
        java.lang.String[] strArray41 = arrayEntityMap36.names;
        binaryEntityMap24.names = strArray41;
        binaryEntityMap17.names = strArray41;
        binaryEntityMap3.names = strArray41;
        arrayEntityMap1.names = strArray41;
        arrayEntityMap1.add("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        java.util.Map map32 = hashEntityMap30.mapValueToName;
        java.util.Map map33 = hashEntityMap30.mapNameToValue;
        java.util.Map map34 = hashEntityMap30.mapValueToName;
        java.util.Map map35 = hashEntityMap30.mapValueToName;
        int int37 = hashEntityMap30.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap38.mapNameToValue = map44;
        java.util.Map map47 = hashEntityMap38.mapNameToValue;
        int int49 = hashEntityMap38.value("hi!");
        hashEntityMap38.add("", (int) (byte) 0);
        java.lang.String str54 = hashEntityMap38.name((int) (short) 0);
        java.lang.String str56 = hashEntityMap38.name((int) (byte) 0);
        java.util.Map map57 = hashEntityMap38.mapNameToValue;
        java.util.Map map58 = hashEntityMap38.mapNameToValue;
        hashEntityMap30.mapNameToValue = map58;
        hashEntityMap30.add("", (int) (short) 100);
        java.util.Map map63 = hashEntityMap30.mapValueToName;
        hashEntityMap0.mapValueToName = map63;
        java.util.Map map65 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        java.lang.String str6 = hashEntityMap0.name(32);
        java.lang.String str8 = hashEntityMap0.name(101);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap9.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        hashEntityMap9.mapNameToValue = map14;
        hashEntityMap9.add("hi!", (int) '4');
        int int20 = hashEntityMap9.value("");
        int int22 = hashEntityMap9.value("hi!");
        java.util.Map map23 = hashEntityMap9.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        java.util.Map map26 = hashEntityMap24.mapValueToName;
        java.util.Map map27 = hashEntityMap24.mapNameToValue;
        hashEntityMap24.add("", (int) (byte) 10);
        int int32 = hashEntityMap24.value("");
        java.lang.String str34 = hashEntityMap24.name((int) (byte) 10);
        java.lang.String str36 = hashEntityMap24.name((int) (short) 0);
        java.lang.String str38 = hashEntityMap24.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap40.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map45 = hashEntityMap44.mapNameToValue;
        hashEntityMap40.mapNameToValue = map45;
        hashEntityMap39.mapNameToValue = map45;
        java.util.Map map48 = hashEntityMap39.mapNameToValue;
        int int50 = hashEntityMap39.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap51 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map52 = hashEntityMap51.mapNameToValue;
        java.util.Map map53 = hashEntityMap51.mapValueToName;
        java.util.Map map54 = hashEntityMap51.mapNameToValue;
        hashEntityMap39.mapValueToName = map54;
        hashEntityMap24.mapNameToValue = map54;
        java.lang.String str58 = hashEntityMap24.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int61 = hashEntityMap59.value("hi!");
        java.lang.String str63 = hashEntityMap59.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        java.util.Map map66 = hashEntityMap64.mapValueToName;
        java.util.Map map67 = hashEntityMap64.mapNameToValue;
        hashEntityMap64.add("", (int) (byte) 10);
        int int72 = hashEntityMap64.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap73 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap73.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map78 = hashEntityMap77.mapNameToValue;
        hashEntityMap73.mapNameToValue = map78;
        hashEntityMap64.mapNameToValue = map78;
        java.lang.String str82 = hashEntityMap64.name((int) 'a');
        hashEntityMap64.add("", (int) (short) 1);
        java.util.Map map86 = hashEntityMap64.mapNameToValue;
        hashEntityMap59.mapNameToValue = map86;
        hashEntityMap24.mapValueToName = map86;
        java.util.Map map89 = hashEntityMap24.mapNameToValue;
        hashEntityMap9.mapNameToValue = map89;
        hashEntityMap0.mapValueToName = map89;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        int int10 = arrayEntityMap5.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
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
        java.lang.Class<?> wildcardClass44 = strArray38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
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
        int int19 = entities0.entityValue("hi!");
        entities0.addEntity("", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
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
        java.lang.String[] strArray38 = binaryEntityMap1.names;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.add("", (int) (short) 1);
        int int14 = arrayEntityMap1.value("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        lookupEntityMap0.add("", 0);
        lookupEntityMap0.add("hi!", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
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
        int[] intArray21 = arrayEntityMap1.values;
        arrayEntityMap1.growBy = (short) -1;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("hi!");
        int int6 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 10);
        int int11 = primitiveEntityMap0.value("");
        int int13 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
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
        hashEntityMap0.add("", 98);
        java.lang.Class<?> wildcardClass39 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
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
        java.lang.Class<?> wildcardClass52 = binaryEntityMap24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer13 = null;
        entities12.escape(writer13, "");
        java.lang.String[][] strArray16 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities12.addEntities(strArray16);
        entities0.addEntities(strArray16);
        int int20 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer22, "hi!");
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
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(entityMap21);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        binaryEntityMap18.size = (short) 100;
        java.lang.String[] strArray24 = binaryEntityMap18.names;
        arrayEntityMap1.names = strArray24;
        arrayEntityMap1.add("", 1);
        arrayEntityMap1.ensureCapacity(100);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        int int2 = binaryEntityMap1.size;
        java.lang.String[] strArray3 = null;
        binaryEntityMap1.names = strArray3;
        binaryEntityMap1.size = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
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
        int int18 = binaryEntityMap0.growBy;
        int int20 = binaryEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str25 = binaryEntityMap23.name((int) (byte) 0);
        java.lang.String str27 = binaryEntityMap23.name((int) '#');
        java.lang.String str29 = binaryEntityMap23.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str32 = binaryEntityMap30.name((int) (byte) 0);
        int int34 = binaryEntityMap30.value("");
        binaryEntityMap30.add("", (int) (short) -1);
        binaryEntityMap30.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap42.ensureCapacity((int) 'a');
        arrayEntityMap42.ensureCapacity(0);
        java.lang.String[] strArray47 = arrayEntityMap42.names;
        binaryEntityMap30.names = strArray47;
        binaryEntityMap23.names = strArray47;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap50.growBy = '4';
        int[] intArray53 = binaryEntityMap50.values;
        binaryEntityMap23.values = intArray53;
        arrayEntityMap22.values = intArray53;
        binaryEntityMap0.values = intArray53;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(intArray53);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        java.lang.String str8 = entities0.entityName(0);
        java.lang.String str10 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
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
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer30, "");
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
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.lang.String str10 = entities0.unescape("");
        int int12 = entities0.entityValue("hi!");
        java.lang.String str14 = entities0.unescape("hi!");
        java.lang.String str16 = entities0.entityName((int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str7 = lookupEntityMap0.name((int) (short) 100);
        lookupEntityMap0.add("", (int) '#');
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        arrayEntityMap0.size = (byte) -1;
        int int6 = arrayEntityMap0.value("hi!");
        int[] intArray7 = arrayEntityMap0.values;
        java.lang.Class<?> wildcardClass8 = arrayEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        java.util.Map map71 = hashEntityMap0.mapNameToValue;
        java.util.Map map72 = hashEntityMap0.mapNameToValue;
        int int74 = hashEntityMap0.value("");
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
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 10 + "'", int74 == 10);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
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
        java.lang.String str20 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap22 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str24 = lookupEntityMap22.name((int) (short) 0);
        java.lang.String str26 = lookupEntityMap22.name((int) (short) 1);
        java.lang.String str28 = lookupEntityMap22.name((int) (byte) 100);
        java.lang.String str30 = lookupEntityMap22.name(10);
        java.lang.String str32 = lookupEntityMap22.name((int) (byte) 1);
        int int34 = lookupEntityMap22.value("");
        java.lang.String str36 = lookupEntityMap22.name(97);
        int int38 = lookupEntityMap22.value("hi!");
        entities0.map = lookupEntityMap22;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) -1);
        binaryEntityMap0.add("", 98);
        binaryEntityMap0.ensureCapacity(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        java.lang.String str5 = arrayEntityMap1.name(35);
        int int6 = arrayEntityMap1.growBy;
        int int8 = arrayEntityMap1.value("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
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
        int int30 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap31.growBy = (short) 10;
        java.lang.String[] strArray34 = binaryEntityMap31.names;
        binaryEntityMap31.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap38.growBy = (short) 10;
        java.lang.String[] strArray41 = binaryEntityMap38.names;
        binaryEntityMap31.names = strArray41;
        binaryEntityMap31.ensureCapacity((int) (short) 0);
        java.lang.String str46 = binaryEntityMap31.name((int) 'a');
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
        binaryEntityMap31.values = intArray63;
        binaryEntityMap0.values = intArray63;
        binaryEntityMap0.add("", (int) (short) 10);
        int int70 = binaryEntityMap0.value("hi!");
        int int72 = binaryEntityMap0.value("");
        java.lang.Class<?> wildcardClass73 = binaryEntityMap0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        int int8 = hashEntityMap0.value("hi!");
        int int10 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (short) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int16 = hashEntityMap14.value("hi!");
        java.util.Map map17 = hashEntityMap14.mapValueToName;
        int int19 = hashEntityMap14.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap21.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        hashEntityMap21.mapNameToValue = map26;
        hashEntityMap20.mapNameToValue = map26;
        java.util.Map map29 = hashEntityMap20.mapNameToValue;
        hashEntityMap14.mapNameToValue = map29;
        java.lang.String str32 = hashEntityMap14.name((int) '#');
        java.lang.String str34 = hashEntityMap14.name(0);
        java.util.Map map35 = hashEntityMap14.mapValueToName;
        hashEntityMap0.mapNameToValue = map35;
        java.lang.Class<?> wildcardClass37 = hashEntityMap0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
        int int28 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        hashEntityMap0.add("hi!", (int) (short) 0);
        java.util.Map map11 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
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
        java.lang.String str26 = primitiveEntityMap7.name(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int25 = binaryEntityMap23.value("");
        java.lang.String str27 = binaryEntityMap23.name((int) (short) 0);
        binaryEntityMap23.ensureCapacity(1);
        binaryEntityMap23.growBy = 97;
        entities0.map = binaryEntityMap23;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int34 = binaryEntityMap33.growBy;
        binaryEntityMap33.ensureCapacity((int) '4');
        binaryEntityMap33.growBy = '4';
        java.lang.String str40 = binaryEntityMap33.name((int) (short) 0);
        int[] intArray41 = binaryEntityMap33.values;
        entities0.map = binaryEntityMap33;
        int int44 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        int int7 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = (short) 10;
        int int10 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
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
        java.lang.String str15 = hashEntityMap0.name(3);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 2);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
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
        entities0.addEntity("", (int) (short) -1);
        java.io.Writer writer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer27, "");
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
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
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
        hashEntityMap0.add("hi!", (int) (short) 100);
        java.util.Map map33 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
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
        lookupEntityMap0.add("", 0);
        lookupEntityMap0.add("", (int) (short) 1);
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
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("hi!", 0);
        binaryEntityMap0.ensureCapacity((int) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        int int22 = entities0.entityValue("hi!");
        java.lang.String str24 = entities0.entityName(0);
        java.lang.String str26 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(entityMap27);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str13 = entities11.unescape("");
        java.lang.String str15 = entities11.entityName((int) (short) 0);
        int int17 = entities11.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities11.map;
        entities0.map = entityMap18;
        int int21 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        hashEntityMap31.mapNameToValue = map37;
        java.util.Map map40 = hashEntityMap31.mapNameToValue;
        int int42 = hashEntityMap31.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        java.util.Map map45 = hashEntityMap43.mapValueToName;
        java.util.Map map46 = hashEntityMap43.mapNameToValue;
        hashEntityMap31.mapValueToName = map46;
        hashEntityMap29.mapValueToName = map46;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map50 = hashEntityMap49.mapNameToValue;
        java.util.Map map51 = hashEntityMap49.mapValueToName;
        java.util.Map map52 = hashEntityMap49.mapNameToValue;
        java.util.Map map53 = hashEntityMap49.mapValueToName;
        java.util.Map map54 = hashEntityMap49.mapValueToName;
        int int56 = hashEntityMap49.value("hi!");
        java.util.Map map57 = hashEntityMap49.mapValueToName;
        hashEntityMap29.mapNameToValue = map57;
        hashEntityMap0.mapNameToValue = map57;
        java.util.Map map60 = hashEntityMap0.mapNameToValue;
        java.util.Map map61 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.apache.commons.lang.Entities entities11 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str13 = entities11.unescape("");
        java.lang.String str15 = entities11.entityName((int) (short) 0);
        int int17 = entities11.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities11.map;
        entities0.map = entityMap18;
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(entityMap18);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.growBy = ' ';
        java.lang.String str11 = binaryEntityMap0.name((int) (short) -1);
        binaryEntityMap0.ensureCapacity((int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
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
        java.util.Map map51 = hashEntityMap0.mapNameToValue;
        java.util.Map map52 = hashEntityMap0.mapValueToName;
        java.lang.String str54 = hashEntityMap0.name((int) (short) 10);
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
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str54);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(0);
        java.lang.String str15 = lookupEntityMap0.name(0);
        java.lang.String str17 = lookupEntityMap0.name(1);
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str25 = binaryEntityMap23.name((int) (byte) 0);
        int int27 = binaryEntityMap23.value("");
        binaryEntityMap23.growBy = 10;
        java.lang.String str31 = binaryEntityMap23.name((int) (byte) 10);
        java.lang.String[] strArray32 = binaryEntityMap23.names;
        entities0.map = binaryEntityMap23;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String str11 = binaryEntityMap0.name((int) '4');
        binaryEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String str16 = binaryEntityMap0.name(97);
        binaryEntityMap0.add("", (int) '#');
        int[] intArray20 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        int int11 = binaryEntityMap0.size;
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
        binaryEntityMap0.names = strArray21;
        binaryEntityMap0.add("hi!", (-1));
        binaryEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
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
        java.lang.String str28 = hashEntityMap0.name(32);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map30 = hashEntityMap29.mapNameToValue;
        hashEntityMap29.add("", 32);
        java.util.Map map34 = hashEntityMap29.mapValueToName;
        hashEntityMap0.mapNameToValue = map34;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
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
        int int20 = binaryEntityMap9.value("hi!");
        int int21 = binaryEntityMap9.size;
        int int22 = binaryEntityMap9.size;
        binaryEntityMap9.growBy = 0;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.growBy = '4';
        int int7 = binaryEntityMap4.growBy;
        int[] intArray8 = binaryEntityMap4.values;
        arrayEntityMap3.values = intArray8;
        binaryEntityMap1.values = intArray8;
        int[] intArray11 = binaryEntityMap1.values;
        binaryEntityMap1.add("", (int) '4');
        binaryEntityMap1.growBy = 52;
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
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
        org.apache.commons.lang.Entities.EntityMap entityMap38 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(entityMap38);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap1.names = strArray9;
        arrayEntityMap1.add("", (int) (short) 100);
        arrayEntityMap1.ensureCapacity(2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        binaryEntityMap0.size = (byte) 10;
        java.lang.String str8 = binaryEntityMap0.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap10.ensureCapacity((int) 'a');
        arrayEntityMap10.ensureCapacity(0);
        arrayEntityMap10.add("hi!", 100);
        java.lang.String str19 = arrayEntityMap10.name((int) 'a');
        int int21 = arrayEntityMap10.value("");
        int[] intArray22 = arrayEntityMap10.values;
        int[] intArray23 = arrayEntityMap10.values;
        binaryEntityMap0.values = intArray23;
        java.lang.String str26 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        java.lang.String str8 = binaryEntityMap0.name(3);
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.ensureCapacity(98);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        int[] intArray17 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(intArray17);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
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
        java.util.Map map18 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = 32;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("");
        int int7 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (byte) 100;
        java.lang.String str11 = binaryEntityMap0.name(32);
        binaryEntityMap0.add("hi!", (int) (short) 0);
        binaryEntityMap0.growBy = (byte) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = lookupEntityMap0.name((int) (byte) -1);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
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
        int int47 = entities22.entityValue("");
        java.lang.String str49 = entities22.entityName(1);
        org.apache.commons.lang.Entities entities50 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str52 = entities50.unescape("");
        java.lang.String str54 = entities50.entityName(100);
        java.lang.String str56 = entities50.entityName((int) ' ');
        java.lang.String str58 = entities50.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap59 = entities50.map;
        java.lang.String[][] strArray60 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities50.addEntities(strArray60);
        java.lang.String[][] strArray62 = new java.lang.String[][] {};
        entities50.addEntities(strArray62);
        entities22.addEntities(strArray62);
        entities0.addEntities(strArray62);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(entities22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(entities50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(entityMap59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[][] {});
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap3 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray4 = new int[] {};
        binaryEntityMap3.values = intArray4;
        int int7 = binaryEntityMap3.value("");
        java.lang.String str9 = binaryEntityMap3.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        int int15 = binaryEntityMap10.value("");
        binaryEntityMap10.growBy = (short) 1;
        binaryEntityMap10.size = 100;
        binaryEntityMap10.add("", 100);
        java.lang.String[] strArray23 = binaryEntityMap10.names;
        binaryEntityMap3.names = strArray23;
        int int25 = binaryEntityMap3.growBy;
        int int26 = binaryEntityMap3.size;
        int int27 = binaryEntityMap3.growBy;
        entities0.map = binaryEntityMap3;
        int int30 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.lang.String str4 = hashEntityMap0.name(100);
        java.lang.String str6 = hashEntityMap0.name(32);
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
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
        binaryEntityMap0.add("", 97);
        int int29 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 97, (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 1);
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int16 = binaryEntityMap14.value("");
        binaryEntityMap14.size = '#';
        binaryEntityMap14.size = (byte) 10;
        binaryEntityMap14.ensureCapacity(1);
        java.lang.String[] strArray23 = binaryEntityMap14.names;
        binaryEntityMap0.names = strArray23;
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name(97);
        java.lang.String str14 = lookupEntityMap0.name(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
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
        java.lang.String str55 = hashEntityMap0.name((int) ' ');
        java.util.Map map56 = null;
        hashEntityMap0.mapNameToValue = map56;
        java.util.Map map58 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(map58);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        binaryEntityMap0.add("hi!", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
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
        int int16 = arrayEntityMap8.size;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
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
        java.lang.String str26 = lookupEntityMap0.name((int) '4');
        int int28 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int13 = arrayEntityMap1.value("hi!");
        int int14 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = 1;
        java.lang.String str18 = arrayEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) 'a');
        java.lang.String str13 = hashEntityMap0.name((int) (byte) 100);
        hashEntityMap0.add("hi!", 100);
        hashEntityMap0.add("hi!", 3);
        java.lang.String str21 = hashEntityMap0.name(35);
        hashEntityMap0.add("hi!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        java.lang.String str10 = entities0.entityName((int) (short) 1);
        java.lang.String str12 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer14 = null;
        entities0.escape(writer14, "");
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
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
        java.util.Map map27 = hashEntityMap0.mapValueToName;
        java.lang.String str29 = hashEntityMap0.name((int) 'a');
        java.util.Map map30 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
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
        java.lang.String str16 = binaryEntityMap14.name((int) (byte) 0);
        java.lang.String str18 = binaryEntityMap14.name((int) '#');
        binaryEntityMap14.growBy = (byte) 10;
        binaryEntityMap14.growBy = 1;
        java.lang.String[] strArray23 = binaryEntityMap14.names;
        int int24 = binaryEntityMap14.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str27 = binaryEntityMap25.name((int) (byte) 0);
        int int29 = binaryEntityMap25.value("");
        binaryEntityMap25.add("", (int) (short) -1);
        int[] intArray33 = binaryEntityMap25.values;
        binaryEntityMap25.ensureCapacity((int) (byte) 1);
        binaryEntityMap25.add("", (int) (byte) 10);
        int int40 = binaryEntityMap25.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int43 = binaryEntityMap42.size;
        java.lang.String str45 = binaryEntityMap42.name((int) ' ');
        int[] intArray46 = binaryEntityMap42.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap48 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap48.ensureCapacity((int) 'a');
        int int51 = arrayEntityMap48.growBy;
        java.lang.String[] strArray52 = arrayEntityMap48.names;
        int[] intArray53 = arrayEntityMap48.values;
        binaryEntityMap42.values = intArray53;
        java.lang.String[] strArray55 = binaryEntityMap42.names;
        binaryEntityMap25.names = strArray55;
        binaryEntityMap14.names = strArray55;
        entities0.map = binaryEntityMap14;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(entityMap13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str33 = binaryEntityMap31.name((int) (byte) 100);
        int int35 = binaryEntityMap31.value("hi!");
        int[] intArray36 = binaryEntityMap31.values;
        binaryEntityMap0.values = intArray36;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 0);
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] {});
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        int int16 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
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
        hashEntityMap0.mapNameToValue = map39;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        java.util.Map map45 = hashEntityMap43.mapValueToName;
        int int47 = hashEntityMap43.value("");
        int int49 = hashEntityMap43.value("hi!");
        java.util.Map map50 = hashEntityMap43.mapValueToName;
        int int52 = hashEntityMap43.value("hi!");
        java.util.Map map53 = hashEntityMap43.mapValueToName;
        hashEntityMap0.mapValueToName = map53;
        java.lang.String str56 = hashEntityMap0.name(10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap57 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap58.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = hashEntityMap62.mapNameToValue;
        hashEntityMap58.mapNameToValue = map63;
        hashEntityMap57.mapNameToValue = map63;
        java.util.Map map66 = hashEntityMap57.mapNameToValue;
        hashEntityMap0.mapNameToValue = map66;
        int int69 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
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
        java.io.Writer writer32 = null;
        entities0.escape(writer32, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(entityMap15);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.add("hi!", (int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap9.ensureCapacity((int) 'a');
        int int12 = arrayEntityMap9.growBy;
        java.lang.String[] strArray13 = arrayEntityMap9.names;
        binaryEntityMap0.names = strArray13;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int17 = arrayEntityMap16.growBy;
        java.lang.String[] strArray18 = arrayEntityMap16.names;
        binaryEntityMap0.names = strArray18;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) 'a');
        java.lang.String str13 = hashEntityMap0.name(98);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities12 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer13 = null;
        entities12.escape(writer13, "");
        java.lang.String[][] strArray16 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities12.addEntities(strArray16);
        entities0.addEntities(strArray16);
        int int20 = entities0.entityValue("");
        entities0.addEntity("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(entities12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) ' ');
        java.lang.String str16 = entities0.escape("hi!");
        java.lang.String str18 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.add("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
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
        java.lang.String str31 = entities0.entityName(0);
        java.lang.String str33 = entities0.escape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int2 = binaryEntityMap1.growBy;
        binaryEntityMap1.add("", (int) ' ');
        java.lang.Class<?> wildcardClass6 = binaryEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.unescape("hi!");
        java.lang.String str12 = entities0.entityName((int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap13.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        hashEntityMap13.mapNameToValue = map18;
        hashEntityMap13.add("hi!", (int) '4');
        int int24 = hashEntityMap13.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        java.util.Map map27 = hashEntityMap25.mapValueToName;
        int int29 = hashEntityMap25.value("");
        int int31 = hashEntityMap25.value("hi!");
        java.util.Map map32 = hashEntityMap25.mapValueToName;
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
        hashEntityMap25.mapValueToName = map50;
        hashEntityMap13.mapValueToName = map50;
        java.lang.String str55 = hashEntityMap13.name((int) (short) -1);
        entities0.map = hashEntityMap13;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) '#');
        java.lang.String str12 = binaryEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 10);
        java.lang.String str18 = binaryEntityMap0.name(97);
        int int19 = binaryEntityMap0.growBy;
        int int20 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        java.util.Map map6 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("hi!", 0);
        hashEntityMap0.add("hi!", (int) '#');
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str18 = entities16.unescape("");
        java.lang.String str20 = entities16.entityName((int) (short) 0);
        int int22 = entities16.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap23 = entities16.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities16);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        java.util.Map map27 = hashEntityMap25.mapValueToName;
        int int29 = hashEntityMap25.value("");
        hashEntityMap25.add("", 1);
        java.util.Map map33 = hashEntityMap25.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap36.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        hashEntityMap36.mapNameToValue = map41;
        int int44 = hashEntityMap36.value("");
        java.util.Map map45 = hashEntityMap36.mapNameToValue;
        hashEntityMap34.mapNameToValue = map45;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        java.util.Map map49 = hashEntityMap47.mapValueToName;
        java.util.Map map50 = hashEntityMap47.mapNameToValue;
        java.util.Map map51 = hashEntityMap47.mapValueToName;
        hashEntityMap34.mapValueToName = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        java.util.Map map55 = hashEntityMap53.mapValueToName;
        java.util.Map map56 = hashEntityMap53.mapNameToValue;
        hashEntityMap53.add("", (int) (byte) 10);
        int int61 = hashEntityMap53.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap62.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap66 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map67 = hashEntityMap66.mapNameToValue;
        hashEntityMap62.mapNameToValue = map67;
        hashEntityMap53.mapNameToValue = map67;
        hashEntityMap34.mapNameToValue = map67;
        java.util.Map map71 = hashEntityMap34.mapValueToName;
        hashEntityMap25.mapNameToValue = map71;
        java.util.Map map73 = hashEntityMap25.mapValueToName;
        entities16.map = hashEntityMap25;
        java.util.Map map75 = hashEntityMap25.mapNameToValue;
        hashEntityMap0.mapValueToName = map75;
        java.lang.String str78 = hashEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(entityMap23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
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
        java.util.Map map35 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap6 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int8 = hashEntityMap6.value("hi!");
        java.lang.String str10 = hashEntityMap6.name((int) (short) 0);
        hashEntityMap6.add("", 0);
        hashEntityMap6.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        hashEntityMap17.add("hi!", (int) 'a');
        int int28 = hashEntityMap17.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int31 = hashEntityMap29.value("hi!");
        java.util.Map map32 = hashEntityMap29.mapValueToName;
        int int34 = hashEntityMap29.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap36.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        hashEntityMap36.mapNameToValue = map41;
        hashEntityMap35.mapNameToValue = map41;
        java.util.Map map44 = hashEntityMap35.mapNameToValue;
        hashEntityMap29.mapNameToValue = map44;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap46.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        hashEntityMap46.mapNameToValue = map51;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        hashEntityMap46.mapValueToName = map54;
        hashEntityMap29.mapNameToValue = map54;
        hashEntityMap17.mapNameToValue = map54;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map59 = hashEntityMap58.mapNameToValue;
        java.util.Map map60 = hashEntityMap58.mapValueToName;
        java.util.Map map61 = hashEntityMap58.mapNameToValue;
        java.util.Map map62 = hashEntityMap58.mapValueToName;
        java.lang.String str64 = hashEntityMap58.name((int) '4');
        hashEntityMap58.add("hi!", (int) (byte) 100);
        java.util.Map map68 = hashEntityMap58.mapNameToValue;
        hashEntityMap17.mapValueToName = map68;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap70 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map71 = hashEntityMap70.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap72.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = hashEntityMap76.mapNameToValue;
        hashEntityMap72.mapNameToValue = map77;
        int int80 = hashEntityMap72.value("");
        java.util.Map map81 = hashEntityMap72.mapNameToValue;
        hashEntityMap70.mapNameToValue = map81;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap83 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map84 = hashEntityMap83.mapNameToValue;
        java.util.Map map85 = hashEntityMap83.mapValueToName;
        java.util.Map map86 = hashEntityMap83.mapNameToValue;
        java.util.Map map87 = hashEntityMap83.mapValueToName;
        hashEntityMap70.mapValueToName = map87;
        hashEntityMap17.mapValueToName = map87;
        hashEntityMap6.mapNameToValue = map87;
        entities0.map = hashEntityMap6;
        java.lang.String str93 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        java.lang.String str8 = binaryEntityMap0.name((-1));
        int int9 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (short) 0);
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = (byte) 100;
        arrayEntityMap1.size = 10;
        int[] intArray13 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
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
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        int int7 = primitiveEntityMap4.value("");
        primitiveEntityMap4.add("hi!", (-1));
        int int12 = primitiveEntityMap4.value("");
        int int14 = primitiveEntityMap4.value("");
        java.lang.String str16 = primitiveEntityMap4.name(1);
        primitiveEntityMap4.add("", 97);
        int int21 = primitiveEntityMap4.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapNameToValue;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        java.lang.String str15 = hashEntityMap0.name(1);
        java.lang.String str17 = hashEntityMap0.name(52);
        java.util.Map map18 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(0);
        java.lang.String str9 = lookupEntityMap0.name(100);
        lookupEntityMap0.add("hi!", 10);
        lookupEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        binaryEntityMap1.add("hi!", 0);
        java.lang.String[] strArray5 = binaryEntityMap1.names;
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.add("", (int) (short) 0);
        java.lang.String str38 = binaryEntityMap33.name(2);
        entities0.map = binaryEntityMap33;
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
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(97);
        binaryEntityMap1.growBy = (byte) -1;
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.size = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = '4';
        int int13 = binaryEntityMap9.value("hi!");
        java.lang.String str15 = binaryEntityMap9.name((int) '#');
        binaryEntityMap9.add("hi!", (int) (byte) -1);
        binaryEntityMap9.ensureCapacity(32);
        java.lang.String[] strArray21 = binaryEntityMap9.names;
        binaryEntityMap0.names = strArray21;
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int7 = hashEntityMap5.value("hi!");
        java.util.Map map8 = hashEntityMap5.mapValueToName;
        int int10 = hashEntityMap5.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap12.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        hashEntityMap12.mapNameToValue = map17;
        hashEntityMap11.mapNameToValue = map17;
        java.util.Map map20 = hashEntityMap11.mapNameToValue;
        hashEntityMap5.mapNameToValue = map20;
        hashEntityMap0.mapValueToName = map20;
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
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
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        int int19 = binaryEntityMap14.value("");
        binaryEntityMap14.growBy = (short) 1;
        int int23 = binaryEntityMap14.value("");
        int[] intArray24 = binaryEntityMap14.values;
        binaryEntityMap0.values = intArray24;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap26.growBy = (short) 10;
        java.lang.String[] strArray29 = binaryEntityMap26.names;
        binaryEntityMap26.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap33.growBy = (short) 10;
        java.lang.String[] strArray36 = binaryEntityMap33.names;
        binaryEntityMap26.names = strArray36;
        binaryEntityMap26.ensureCapacity((int) (short) 0);
        java.lang.String str41 = binaryEntityMap26.name((int) 'a');
        binaryEntityMap26.size = 1;
        int int44 = binaryEntityMap26.growBy;
        int int45 = binaryEntityMap26.size;
        binaryEntityMap26.growBy = 97;
        binaryEntityMap26.add("", 0);
        int int51 = binaryEntityMap26.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap53 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap53.ensureCapacity((int) 'a');
        arrayEntityMap53.growBy = (byte) 100;
        arrayEntityMap53.ensureCapacity(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap60 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap60.growBy = (short) 10;
        java.lang.String[] strArray63 = binaryEntityMap60.names;
        binaryEntityMap60.add("", (int) (short) 100);
        int[] intArray67 = binaryEntityMap60.values;
        arrayEntityMap53.values = intArray67;
        int[] intArray69 = null;
        arrayEntityMap53.values = intArray69;
        org.apache.commons.lang.Entities entities71 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str73 = entities71.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap75 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities71.map = arrayEntityMap75;
        int int77 = arrayEntityMap75.size;
        int[] intArray78 = arrayEntityMap75.values;
        arrayEntityMap53.values = intArray78;
        int int80 = arrayEntityMap53.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap82 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap83 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap83.growBy = '4';
        int int86 = binaryEntityMap83.growBy;
        int[] intArray87 = binaryEntityMap83.values;
        arrayEntityMap82.values = intArray87;
        arrayEntityMap53.values = intArray87;
        binaryEntityMap26.values = intArray87;
        binaryEntityMap0.values = intArray87;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertNotNull(entities71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 52 + "'", int86 == 52);
        org.junit.Assert.assertNotNull(intArray87);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
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
        hashEntityMap0.add("", 2);
        java.util.Map map26 = hashEntityMap0.mapValueToName;
        int int28 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        int int13 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        int int4 = primitiveEntityMap0.value("hi!");
        int int6 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("hi!", (int) (short) 0);
        java.lang.String str11 = primitiveEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        binaryEntityMap0.ensureCapacity(0);
        binaryEntityMap0.add("", (int) (short) 10);
        int[] intArray16 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNotNull(intArray16);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map62 = hashEntityMap61.mapNameToValue;
        java.util.Map map63 = hashEntityMap61.mapValueToName;
        java.util.Map map64 = hashEntityMap61.mapNameToValue;
        hashEntityMap61.add("", (int) (byte) 10);
        java.util.Map map68 = hashEntityMap61.mapNameToValue;
        java.util.Map map69 = hashEntityMap61.mapNameToValue;
        java.util.Map map70 = hashEntityMap61.mapValueToName;
        hashEntityMap0.mapNameToValue = map70;
        hashEntityMap0.add("", 0);
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
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str20 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(entityMap16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name(35);
        lookupEntityMap0.add("", (int) ' ');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str8 = entities0.unescape("hi!");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map13 = hashEntityMap12.mapNameToValue;
        java.util.Map map14 = hashEntityMap12.mapValueToName;
        int int16 = hashEntityMap12.value("");
        hashEntityMap12.add("", 1);
        hashEntityMap12.add("", (int) (short) 0);
        java.lang.String str24 = hashEntityMap12.name((int) (short) 100);
        entities0.map = hashEntityMap12;
        java.lang.String str27 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
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
        java.io.Writer writer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer52, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { 0, (-1) });
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        java.lang.String str32 = entities0.escape("");
        java.lang.String str34 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str37 = entities0.escape("");
        int int39 = entities0.entityValue("");
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        java.lang.String str17 = entities0.escape("hi!");
        entities0.addEntity("", (int) (byte) 100);
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        java.lang.String str17 = binaryEntityMap0.name(1);
        binaryEntityMap0.add("hi!", (int) (short) -1);
        int int22 = binaryEntityMap0.value("");
        java.lang.String str24 = binaryEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
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
        java.lang.String str17 = hashEntityMap0.name(2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        java.util.Map map22 = hashEntityMap18.mapNameToValue;
        java.lang.String str24 = hashEntityMap18.name((int) ' ');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map26 = hashEntityMap25.mapNameToValue;
        java.util.Map map27 = hashEntityMap25.mapValueToName;
        int int29 = hashEntityMap25.value("");
        hashEntityMap25.add("", 1);
        java.util.Map map33 = hashEntityMap25.mapValueToName;
        hashEntityMap18.mapValueToName = map33;
        hashEntityMap0.mapValueToName = map33;
        int int37 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
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
        java.lang.String str24 = arrayEntityMap1.name(0);
        int int25 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
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
        java.lang.String str30 = entities0.entityName((int) (byte) 10);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str33 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.lang.String str13 = hashEntityMap0.name(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        java.util.Map map18 = hashEntityMap14.mapNameToValue;
        java.util.Map map19 = hashEntityMap14.mapValueToName;
        hashEntityMap14.add("", (-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        java.util.Map map27 = hashEntityMap23.mapValueToName;
        java.util.Map map28 = hashEntityMap23.mapNameToValue;
        java.util.Map map29 = hashEntityMap23.mapValueToName;
        hashEntityMap14.mapValueToName = map29;
        hashEntityMap0.mapNameToValue = map29;
        int int33 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", 97);
        entities0.addEntity("", (int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap21);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        arrayEntityMap7.size = 0;
        int int11 = arrayEntityMap7.growBy;
        arrayEntityMap7.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name(97);
        int int15 = lookupEntityMap0.value("hi!");
        java.lang.String str17 = lookupEntityMap0.name(98);
        java.lang.String str19 = lookupEntityMap0.name((int) (short) 100);
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
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        binaryEntityMap0.add("hi!", 0);
        binaryEntityMap0.add("hi!", 100);
        int int12 = binaryEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(0);
        int int13 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.size = 35;
        int int16 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int29 = binaryEntityMap27.value("hi!");
        int int30 = binaryEntityMap27.growBy;
        int[] intArray31 = binaryEntityMap27.values;
        binaryEntityMap27.size = 97;
        entities0.map = binaryEntityMap27;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 0 });
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name((int) (short) 100);
        int int6 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        arrayEntityMap1.size = '4';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap11.ensureCapacity((int) 'a');
        int int14 = arrayEntityMap11.growBy;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap11.names = strArray19;
        arrayEntityMap11.add("", (int) (short) 100);
        java.lang.String[] strArray24 = arrayEntityMap11.names;
        arrayEntityMap1.names = strArray24;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        java.lang.String str11 = arrayEntityMap1.name(100);
        arrayEntityMap1.size = (byte) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        hashEntityMap0.add("", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        int int32 = hashEntityMap28.value("");
        int int34 = hashEntityMap28.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap35.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapNameToValue;
        hashEntityMap35.mapNameToValue = map40;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        hashEntityMap35.mapValueToName = map43;
        hashEntityMap28.mapValueToName = map43;
        int int47 = hashEntityMap28.value("hi!");
        hashEntityMap28.add("hi!", 97);
        java.lang.String str52 = hashEntityMap28.name((int) (short) 100);
        int int54 = hashEntityMap28.value("hi!");
        java.util.Map map55 = hashEntityMap28.mapValueToName;
        hashEntityMap0.mapValueToName = map55;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        int[] intArray10 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("", (int) '4');
        java.lang.Class<?> wildcardClass16 = arrayEntityMap1.getClass();
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        hashEntityMap0.add("", 1);
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        int int11 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int9 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (int) (byte) 0);
        java.lang.String str14 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name(97);
        binaryEntityMap0.growBy = 100;
        java.lang.String str15 = binaryEntityMap0.name(97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
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
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        int int10 = binaryEntityMap0.value("");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap25.growBy = (short) 10;
        java.lang.String[] strArray28 = binaryEntityMap25.names;
        int int30 = binaryEntityMap25.value("");
        binaryEntityMap25.growBy = (short) 1;
        int int34 = binaryEntityMap25.value("");
        int[] intArray35 = binaryEntityMap25.values;
        binaryEntityMap11.values = intArray35;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap37.growBy = (short) 10;
        java.lang.String[] strArray40 = binaryEntityMap37.names;
        binaryEntityMap37.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap44 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap44.growBy = (short) 10;
        java.lang.String[] strArray47 = binaryEntityMap44.names;
        binaryEntityMap37.names = strArray47;
        binaryEntityMap37.ensureCapacity((int) (short) 0);
        java.lang.String str52 = binaryEntityMap37.name((int) 'a');
        binaryEntityMap37.size = 1;
        int int55 = binaryEntityMap37.growBy;
        int int56 = binaryEntityMap37.size;
        int[] intArray57 = binaryEntityMap37.values;
        binaryEntityMap11.values = intArray57;
        binaryEntityMap0.values = intArray57;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNotNull(intArray57);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
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
        org.apache.commons.lang.Entities.EntityMap entityMap18 = entities0.map;
        java.lang.String str20 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(entityMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        entities0.addEntity("hi!", 100);
        java.lang.String str16 = entities0.escape("");
        entities0.addEntity("", (int) (short) 100);
        java.lang.String str21 = entities0.unescape("hi!");
        java.lang.String str23 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int12 = entities0.entityValue("hi!");
        entities0.addEntity("hi!", (int) (byte) -1);
        java.lang.String str17 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        binaryEntityMap1.add("", (int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.add("", (int) 'a');
        binaryEntityMap8.add("", 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str17 = binaryEntityMap15.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        binaryEntityMap18.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap25.growBy = (short) 10;
        java.lang.String[] strArray28 = binaryEntityMap25.names;
        binaryEntityMap18.names = strArray28;
        binaryEntityMap15.names = strArray28;
        java.lang.String[] strArray31 = binaryEntityMap15.names;
        binaryEntityMap8.names = strArray31;
        binaryEntityMap1.names = strArray31;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 52 });
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        java.util.Map map39 = hashEntityMap16.mapValueToName;
        int int41 = hashEntityMap16.value("");
        java.util.Map map42 = hashEntityMap16.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (short) 10);
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) 100);
        java.lang.String str14 = primitiveEntityMap0.name((int) '#');
        java.lang.String str16 = primitiveEntityMap0.name(35);
        int int18 = primitiveEntityMap0.value("");
        java.lang.String str20 = primitiveEntityMap0.name((int) (short) 100);
        java.lang.String str22 = primitiveEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
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
        java.io.Writer writer29 = null;
        entities0.escape(writer29, "");
        int int33 = entities0.entityValue("");
        entities0.addEntity("", (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(3);
        java.lang.String str15 = lookupEntityMap0.name(2);
        java.lang.Class<?> wildcardClass16 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
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
        int int14 = binaryEntityMap0.size;
        int int15 = binaryEntityMap0.growBy;
        java.lang.String str17 = binaryEntityMap0.name(10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
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
        java.lang.String str20 = binaryEntityMap11.name(32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str11 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap12 = entities0.map;
        java.lang.String str14 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(entityMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        binaryEntityMap0.ensureCapacity(32);
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
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
        binaryEntityMap17.add("", (int) '#');
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
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 35 });
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", 97);
        entities0.addEntity("", (int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap21 = entities0.map;
        java.lang.String str23 = entityMap21.name(0);
        java.lang.String str25 = entityMap21.name(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entityMap21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
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
        java.lang.String str69 = hashEntityMap0.name((int) (byte) 10);
        int int71 = hashEntityMap0.value("");
        java.lang.String str73 = hashEntityMap0.name(97);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(entities6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        entities0.addEntity("hi!", 100);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.lang.String str13 = hashEntityMap0.name((int) (short) 10);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        java.util.Map map15 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "6) test5434(org.apache.commons.lang.RegressionTest10)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
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
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        int int14 = binaryEntityMap0.growBy;
        java.lang.String str16 = binaryEntityMap0.name(32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
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
        int int20 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", 52);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        primitiveEntityMap0.add("hi!", 10);
        int int17 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) (short) 100);
        int int22 = primitiveEntityMap0.value("hi!");
        java.lang.Class<?> wildcardClass23 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
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
        binaryEntityMap0.growBy = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = binaryEntityMap0.name(2);
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
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
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
        java.lang.String str28 = binaryEntityMap0.name(2);
        int int29 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name(97);
        binaryEntityMap0.growBy = 100;
        int int15 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (short) 0;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int20 = binaryEntityMap18.value("");
        binaryEntityMap18.size = '#';
        binaryEntityMap18.size = (byte) 10;
        binaryEntityMap18.ensureCapacity(1);
        java.lang.String[] strArray27 = binaryEntityMap18.names;
        binaryEntityMap0.names = strArray27;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        int[] intArray6 = arrayEntityMap0.values;
        java.lang.String str8 = arrayEntityMap0.name((int) (byte) 10);
        arrayEntityMap0.ensureCapacity((int) (short) 10);
        int int11 = arrayEntityMap0.growBy;
        int int13 = arrayEntityMap0.value("");
        int int14 = arrayEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
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
        java.lang.String str28 = entities0.unescape("");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        entities0.addEntity("hi!", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.escape("");
        java.lang.String str13 = entities0.entityName((int) (byte) -1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        java.util.Map map19 = hashEntityMap15.mapNameToValue;
        java.lang.String str21 = hashEntityMap15.name((int) ' ');
        int int23 = hashEntityMap15.value("");
        entities0.map = hashEntityMap15;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap26.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        hashEntityMap26.mapNameToValue = map31;
        hashEntityMap25.mapNameToValue = map31;
        java.util.Map map34 = hashEntityMap25.mapNameToValue;
        int int36 = hashEntityMap25.value("hi!");
        hashEntityMap25.add("", (int) (byte) 0);
        java.lang.String str41 = hashEntityMap25.name((int) (short) 0);
        java.lang.String str43 = hashEntityMap25.name((int) (byte) 0);
        java.util.Map map44 = hashEntityMap25.mapNameToValue;
        hashEntityMap15.mapValueToName = map44;
        java.lang.String str47 = hashEntityMap15.name(32);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap48.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        hashEntityMap48.mapNameToValue = map53;
        hashEntityMap48.add("hi!", (int) '4');
        int int59 = hashEntityMap48.value("");
        java.util.Map map60 = hashEntityMap48.mapNameToValue;
        java.util.Map map61 = hashEntityMap48.mapValueToName;
        hashEntityMap15.mapValueToName = map61;
        hashEntityMap15.add("", (int) '#');
        int int67 = hashEntityMap15.value("hi!");
        java.lang.String str69 = hashEntityMap15.name((int) (short) 0);
        java.util.Map map70 = hashEntityMap15.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str11 = binaryEntityMap0.name(10);
        binaryEntityMap0.add("", 35);
        binaryEntityMap0.add("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
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
        java.lang.String str69 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str15 = binaryEntityMap13.name(100);
        int int16 = binaryEntityMap13.size;
        entities0.map = binaryEntityMap13;
        java.lang.String str19 = entities0.entityName(3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
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
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
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
        int int21 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        hashEntityMap22.add("", (int) (byte) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap29.add("", (int) (byte) -1);
        java.util.Map map33 = hashEntityMap29.mapNameToValue;
        java.util.Map map34 = hashEntityMap29.mapValueToName;
        hashEntityMap22.mapValueToName = map34;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        java.util.Map map38 = hashEntityMap36.mapValueToName;
        java.util.Map map39 = hashEntityMap36.mapNameToValue;
        hashEntityMap36.add("", (int) (byte) 10);
        int int44 = hashEntityMap36.value("");
        java.lang.String str46 = hashEntityMap36.name((int) (byte) 10);
        java.lang.String str48 = hashEntityMap36.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int51 = hashEntityMap49.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map53 = hashEntityMap52.mapNameToValue;
        hashEntityMap49.mapNameToValue = map53;
        hashEntityMap36.mapNameToValue = map53;
        java.util.Map map56 = hashEntityMap36.mapValueToName;
        int int58 = hashEntityMap36.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int61 = hashEntityMap59.value("hi!");
        java.lang.String str63 = hashEntityMap59.name((int) (short) 0);
        java.util.Map map64 = hashEntityMap59.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap67.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map72 = hashEntityMap71.mapNameToValue;
        hashEntityMap67.mapNameToValue = map72;
        int int75 = hashEntityMap67.value("");
        java.util.Map map76 = hashEntityMap67.mapNameToValue;
        hashEntityMap65.mapNameToValue = map76;
        java.util.Map map78 = hashEntityMap65.mapValueToName;
        hashEntityMap59.mapNameToValue = map78;
        java.util.Map map80 = hashEntityMap59.mapValueToName;
        hashEntityMap36.mapValueToName = map80;
        hashEntityMap22.mapNameToValue = map80;
        hashEntityMap0.mapValueToName = map80;
        java.util.Map map84 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        java.lang.String str10 = arrayEntityMap7.name((int) (byte) 100);
        java.lang.String[] strArray11 = arrayEntityMap7.names;
        int int12 = arrayEntityMap7.size;
        int int14 = arrayEntityMap7.value("");
        arrayEntityMap7.size = (-1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        java.lang.String str12 = binaryEntityMap0.name((int) (short) 0);
        int int13 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.lang.String str3 = hashEntityMap0.name((int) (byte) 0);
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap5 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map6 = hashEntityMap5.mapNameToValue;
        java.util.Map map7 = hashEntityMap5.mapValueToName;
        java.util.Map map8 = hashEntityMap5.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap9 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map10 = treeEntityMap9.mapNameToValue;
        hashEntityMap5.mapValueToName = map10;
        java.util.Map map12 = hashEntityMap5.mapValueToName;
        hashEntityMap0.mapValueToName = map12;
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
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
        int int20 = hashEntityMap0.value("hi!");
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        int int63 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("");
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.unescape("hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
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
        java.io.Writer writer30 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer30, "hi!");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.io.Writer writer5 = null;
        entities0.escape(writer5, "");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.entityName((int) (byte) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
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
        java.lang.String str22 = entities0.escape("");
        java.lang.String str24 = entities0.escape("hi!");
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
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        entities0.addEntity("hi!", 100);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
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
        int int19 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map21 = hashEntityMap20.mapNameToValue;
        java.util.Map map22 = hashEntityMap20.mapValueToName;
        int int24 = hashEntityMap20.value("");
        int int26 = hashEntityMap20.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap27.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        hashEntityMap27.mapNameToValue = map32;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        hashEntityMap27.mapValueToName = map35;
        hashEntityMap20.mapValueToName = map35;
        int int39 = hashEntityMap20.value("hi!");
        hashEntityMap20.add("hi!", 97);
        java.lang.String str44 = hashEntityMap20.name((int) (short) 100);
        java.util.Map map45 = hashEntityMap20.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap46.add("", (int) (byte) -1);
        java.util.Map map50 = hashEntityMap46.mapNameToValue;
        hashEntityMap46.add("", (int) (byte) 1);
        java.lang.String str55 = hashEntityMap46.name((-1));
        hashEntityMap46.add("hi!", (int) (byte) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap59.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap63 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map64 = hashEntityMap63.mapNameToValue;
        hashEntityMap59.mapNameToValue = map64;
        hashEntityMap59.add("hi!", (int) 'a');
        int int70 = hashEntityMap59.value("");
        java.util.Map map71 = hashEntityMap59.mapValueToName;
        hashEntityMap46.mapValueToName = map71;
        java.util.Map map73 = hashEntityMap46.mapNameToValue;
        hashEntityMap20.mapValueToName = map73;
        hashEntityMap0.mapValueToName = map73;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) '4');
        java.lang.String str10 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        java.lang.String str10 = binaryEntityMap0.name(32);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int13 = arrayEntityMap11.value("");
        arrayEntityMap11.ensureCapacity((int) (byte) 100);
        int[] intArray16 = arrayEntityMap11.values;
        binaryEntityMap0.values = intArray16;
        java.lang.String str19 = binaryEntityMap0.name((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", 2);
        primitiveEntityMap0.add("", (int) '4');
        int int15 = primitiveEntityMap0.value("");
        int int17 = primitiveEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        java.lang.String str7 = primitiveEntityMap0.name((int) (byte) 0);
        java.lang.String str9 = primitiveEntityMap0.name((int) (short) 0);
        primitiveEntityMap0.add("", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 10);
        lookupEntityMap0.add("hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        hashEntityMap18.add("", (int) (short) 0);
        java.util.Map map36 = hashEntityMap18.mapNameToValue;
        hashEntityMap0.mapValueToName = map36;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) 'a');
        java.lang.String str13 = hashEntityMap0.name(98);
        int int15 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
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
        int int37 = hashEntityMap7.value("");
        java.lang.String str39 = hashEntityMap7.name(52);
        java.lang.String str41 = hashEntityMap7.name((int) (short) 100);
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(10);
        java.lang.String str10 = lookupEntityMap0.name((int) (byte) 1);
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name((int) '4');
        java.lang.String str16 = lookupEntityMap0.name((int) 'a');
        int int18 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int8 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = 3;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        java.lang.String str15 = binaryEntityMap11.name((int) '#');
        binaryEntityMap11.growBy = (byte) 10;
        binaryEntityMap11.growBy = 1;
        binaryEntityMap11.ensureCapacity((int) (byte) 0);
        int int22 = binaryEntityMap11.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray24 = new int[] {};
        binaryEntityMap23.values = intArray24;
        int int27 = binaryEntityMap23.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap29.growBy = (short) 10;
        java.lang.String[] strArray32 = binaryEntityMap29.names;
        arrayEntityMap28.names = strArray32;
        binaryEntityMap23.names = strArray32;
        binaryEntityMap11.names = strArray32;
        binaryEntityMap0.names = strArray32;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] {});
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strArray32);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap3.ensureCapacity((int) 'a');
        int int6 = arrayEntityMap3.growBy;
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap3.names = strArray11;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        binaryEntityMap16.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap16.names = strArray26;
        binaryEntityMap13.names = strArray26;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str31 = binaryEntityMap29.name((int) (byte) 0);
        int int33 = binaryEntityMap29.value("");
        binaryEntityMap29.add("", (int) (short) -1);
        int[] intArray37 = binaryEntityMap29.values;
        binaryEntityMap13.values = intArray37;
        arrayEntityMap3.values = intArray37;
        int[] intArray40 = arrayEntityMap3.values;
        arrayEntityMap1.values = intArray40;
        arrayEntityMap1.ensureCapacity(97);
        java.lang.String[] strArray44 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str11 = lookupEntityMap0.name((int) (byte) 10);
        lookupEntityMap0.add("", (int) (byte) -1);
        java.lang.String str16 = lookupEntityMap0.name(2);
        java.lang.String str18 = lookupEntityMap0.name(100);
        java.lang.String str20 = lookupEntityMap0.name(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity((int) (byte) 10);
        int int14 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.size = 97;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        arrayEntityMap18.ensureCapacity(0);
        int int24 = arrayEntityMap18.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap26.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap31 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int32 = arrayEntityMap31.growBy;
        int int33 = arrayEntityMap31.size;
        arrayEntityMap31.size = (short) -1;
        arrayEntityMap31.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int40 = arrayEntityMap39.growBy;
        java.lang.String[] strArray41 = arrayEntityMap39.names;
        int int43 = arrayEntityMap39.value("");
        int int44 = arrayEntityMap39.size;
        java.lang.String[] strArray45 = arrayEntityMap39.names;
        arrayEntityMap31.names = strArray45;
        binaryEntityMap26.names = strArray45;
        arrayEntityMap18.names = strArray45;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap49 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap49.growBy = '4';
        int int53 = binaryEntityMap49.value("hi!");
        java.lang.String str55 = binaryEntityMap49.name((int) '#');
        binaryEntityMap49.add("", (int) (byte) 0);
        binaryEntityMap49.add("", (int) (byte) -1);
        binaryEntityMap49.ensureCapacity(1);
        binaryEntityMap49.add("hi!", (int) 'a');
        java.lang.String[] strArray67 = binaryEntityMap49.names;
        arrayEntityMap18.names = strArray67;
        binaryEntityMap0.names = strArray67;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(strArray67);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
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
        hashEntityMap0.add("", 2);
        int int58 = hashEntityMap0.value("");
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
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
        entities0.addEntity("", (int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        arrayEntityMap8.names = strArray12;
        int[] intArray14 = arrayEntityMap8.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap16 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap16.ensureCapacity((int) 'a');
        arrayEntityMap16.ensureCapacity(0);
        java.lang.String[] strArray21 = arrayEntityMap16.names;
        arrayEntityMap8.names = strArray21;
        binaryEntityMap0.names = strArray21;
        binaryEntityMap0.size = 97;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
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
        java.util.Map map73 = hashEntityMap0.mapNameToValue;
        java.util.Map map74 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        binaryEntityMap0.add("", 2);
        binaryEntityMap0.ensureCapacity((int) (short) -1);
        int[] intArray13 = null;
        binaryEntityMap0.values = intArray13;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
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
        int int27 = arrayEntityMap16.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("", (int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        java.lang.String str13 = lookupEntityMap0.name(3);
        java.lang.String str15 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("", 32);
        java.lang.String str20 = lookupEntityMap0.name(101);
        java.lang.String str22 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entityMap6);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
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
        entities0.addEntity("hi!", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray26 = new int[] {};
        binaryEntityMap25.values = intArray26;
        int int29 = binaryEntityMap25.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap30 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap31.growBy = (short) 10;
        java.lang.String[] strArray34 = binaryEntityMap31.names;
        arrayEntityMap30.names = strArray34;
        binaryEntityMap25.names = strArray34;
        int int38 = binaryEntityMap25.value("hi!");
        java.lang.String str40 = binaryEntityMap25.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str44 = arrayEntityMap42.name((int) (short) 100);
        int[] intArray47 = new int[] { (short) 0, (-1) };
        arrayEntityMap42.values = intArray47;
        binaryEntityMap25.values = intArray47;
        binaryEntityMap25.growBy = 1;
        binaryEntityMap25.add("hi!", 10);
        binaryEntityMap25.add("", (int) (byte) -1);
        binaryEntityMap25.growBy = (-1);
        java.lang.String str61 = binaryEntityMap25.name(0);
        entities0.map = binaryEntityMap25;
        java.lang.Class<?> wildcardClass63 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str15 = lookupEntityMap0.name(32);
        java.lang.String str17 = lookupEntityMap0.name((int) (short) 0);
        int int19 = lookupEntityMap0.value("");
        java.lang.String str21 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        int int8 = hashEntityMap0.value("hi!");
        int int10 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap11 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map12 = hashEntityMap11.mapValueToName;
        hashEntityMap0.mapValueToName = map12;
        java.lang.String str15 = hashEntityMap0.name(1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        java.lang.String[] strArray2 = binaryEntityMap1.names;
        java.lang.String str4 = binaryEntityMap1.name((int) (byte) 1);
        binaryEntityMap1.size = (byte) -1;
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        binaryEntityMap0.add("hi!", 98);
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 10);
        int int12 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (short) 0);
        int int8 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.ensureCapacity(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
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
        java.lang.String str30 = entities0.unescape("");
        java.io.Writer writer31 = null;
        entities0.escape(writer31, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str3 = arrayEntityMap1.name((int) (short) 100);
        int[] intArray6 = new int[] { (short) 0, (-1) };
        arrayEntityMap1.values = intArray6;
        int int9 = arrayEntityMap1.value("hi!");
        java.lang.String str11 = arrayEntityMap1.name((int) (short) 100);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.ensureCapacity((int) '4');
        int[] intArray6 = arrayEntityMap1.values;
        int int7 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = 52;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("hi!", (int) (short) 0);
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '4');
        java.lang.String str13 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", 2);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) -1);
        int int9 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
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
        java.lang.String str34 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.entityName(1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
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
        binaryEntityMap0.growBy = 101;
        int int40 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("hi!", 32);
        java.lang.Class<?> wildcardClass44 = binaryEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 101 + "'", int40 == 101);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
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
        java.lang.String str17 = entities0.escape("hi!");
        java.lang.String str19 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) -1);
        int[] intArray13 = binaryEntityMap0.values;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray13);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray2 = null;
        binaryEntityMap1.names = strArray2;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        int int6 = binaryEntityMap1.value("");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.ensureCapacity(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }
}
