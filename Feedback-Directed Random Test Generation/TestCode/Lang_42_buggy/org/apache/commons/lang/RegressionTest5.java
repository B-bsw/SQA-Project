package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
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
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        int int3 = arrayEntityMap1.value("");
        int int4 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int4 = binaryEntityMap0.size;
        binaryEntityMap0.add("", (int) (byte) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.entityName(2);
        java.lang.Class<?> wildcardClass11 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        java.lang.String str5 = lookupEntityMap0.name(101);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        java.lang.String str7 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("hi!", (int) (short) 0);
        int int10 = binaryEntityMap0.size;
        java.lang.String str12 = binaryEntityMap0.name(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int[] intArray14 = arrayEntityMap1.values;
        java.lang.String[] strArray15 = arrayEntityMap1.names;
        int int16 = arrayEntityMap1.growBy;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        int[] intArray12 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int14 = binaryEntityMap13.growBy;
        binaryEntityMap13.add("", (int) (short) 100);
        binaryEntityMap13.size = (byte) 100;
        int int20 = binaryEntityMap13.size;
        int int21 = binaryEntityMap13.growBy;
        binaryEntityMap13.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap25.ensureCapacity((int) 'a');
        arrayEntityMap25.growBy = (byte) 100;
        arrayEntityMap25.ensureCapacity(10);
        java.lang.String str33 = arrayEntityMap25.name((int) (byte) 1);
        int[] intArray34 = arrayEntityMap25.values;
        binaryEntityMap13.values = intArray34;
        org.apache.commons.lang.Entities entities36 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str38 = entities36.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap40 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities36.map = arrayEntityMap40;
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str44 = entities42.unescape("");
        java.lang.String str46 = entities42.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap47 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray48 = new int[] {};
        binaryEntityMap47.values = intArray48;
        int int51 = binaryEntityMap47.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap52 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap53 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap53.growBy = (short) 10;
        java.lang.String[] strArray56 = binaryEntityMap53.names;
        arrayEntityMap52.names = strArray56;
        binaryEntityMap47.names = strArray56;
        int int60 = binaryEntityMap47.value("hi!");
        entities42.map = binaryEntityMap47;
        java.lang.String str63 = binaryEntityMap47.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap64 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap64.growBy = (short) 10;
        int[] intArray67 = binaryEntityMap64.values;
        binaryEntityMap47.values = intArray67;
        arrayEntityMap40.values = intArray67;
        binaryEntityMap13.values = intArray67;
        binaryEntityMap0.values = intArray67;
        int int73 = binaryEntityMap0.value("");
        int int75 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertNotNull(entities36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        hashEntityMap0.add("", 0);
        java.lang.String str9 = hashEntityMap0.name((int) (short) 10);
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        int int12 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        java.lang.Class<?> wildcardClass22 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertNotNull(entities2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        int int6 = binaryEntityMap0.value("");
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 1);
        java.lang.String str10 = binaryEntityMap0.name(0);
        binaryEntityMap0.ensureCapacity((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = binaryEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.io.Writer writer8 = null;
        entities0.escape(writer8, "");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap11);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        java.lang.String str44 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) ' ');
        int int8 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", 2);
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        java.lang.String str73 = hashEntityMap55.name((int) '#');
        java.lang.String str75 = hashEntityMap55.name(0);
        java.util.Map map76 = hashEntityMap55.mapValueToName;
        hashEntityMap55.add("", 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map81 = hashEntityMap80.mapNameToValue;
        hashEntityMap55.mapValueToName = map81;
        java.util.Map map83 = hashEntityMap55.mapValueToName;
        hashEntityMap0.mapValueToName = map83;
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!", "", "hi!" };
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.add("", (int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int17 = arrayEntityMap15.value("hi!");
        arrayEntityMap15.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str22 = binaryEntityMap20.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap23.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap30 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap30.growBy = (short) 10;
        java.lang.String[] strArray33 = binaryEntityMap30.names;
        binaryEntityMap23.names = strArray33;
        binaryEntityMap20.names = strArray33;
        arrayEntityMap15.names = strArray33;
        binaryEntityMap0.names = strArray33;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap38 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int39 = binaryEntityMap38.growBy;
        binaryEntityMap38.add("", (int) (short) 100);
        binaryEntityMap38.size = (byte) 100;
        int int45 = binaryEntityMap38.size;
        int int46 = binaryEntityMap38.growBy;
        binaryEntityMap38.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap50.ensureCapacity((int) 'a');
        arrayEntityMap50.growBy = (byte) 100;
        arrayEntityMap50.ensureCapacity(10);
        java.lang.String str58 = arrayEntityMap50.name((int) (byte) 1);
        int[] intArray59 = arrayEntityMap50.values;
        binaryEntityMap38.values = intArray59;
        binaryEntityMap0.values = intArray59;
        binaryEntityMap0.growBy = 'a';
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(intArray59);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str19 = entities0.unescape("");
        java.io.Writer writer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer20, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        int int30 = hashEntityMap26.value("");
        hashEntityMap26.add("", 1);
        java.util.Map map34 = hashEntityMap26.mapValueToName;
        java.util.Map map35 = hashEntityMap26.mapNameToValue;
        hashEntityMap10.mapValueToName = map35;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        entities0.addEntity("", (int) (short) 10);
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = entities0.entityName((int) ' ');
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name(10);
        int[] intArray5 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str8 = binaryEntityMap6.name((int) (byte) 0);
        int int10 = binaryEntityMap6.value("");
        binaryEntityMap6.add("", (int) (short) -1);
        int[] intArray14 = binaryEntityMap6.values;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap15.growBy = (short) 10;
        java.lang.String[] strArray18 = binaryEntityMap15.names;
        binaryEntityMap15.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        binaryEntityMap15.names = strArray25;
        binaryEntityMap6.names = strArray25;
        binaryEntityMap0.names = strArray25;
        binaryEntityMap0.growBy = (byte) -1;
        java.lang.String str32 = binaryEntityMap0.name(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        binaryEntityMap0.add("", (int) (byte) 10);
        java.lang.String str15 = binaryEntityMap0.name((int) (short) 0);
        int int16 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (-1);
        java.lang.String str10 = binaryEntityMap0.name(35);
        int int12 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (byte) 1);
        java.lang.String str12 = binaryEntityMap0.name((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray14 = new int[] {};
        binaryEntityMap13.values = intArray14;
        int[] intArray16 = binaryEntityMap13.values;
        binaryEntityMap0.values = intArray16;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] {});
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] {});
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.growBy = ' ';
        binaryEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap1 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int3 = primitiveEntityMap1.value("hi!");
        primitiveEntityMap1.add("", (int) (short) 10);
        primitiveEntityMap1.add("", 0);
        java.lang.String str11 = primitiveEntityMap1.name((int) '#');
        java.lang.String str13 = primitiveEntityMap1.name((int) (short) -1);
        entities0.map = primitiveEntityMap1;
        int int16 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str19 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities20 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer21 = null;
        entities20.escape(writer21, "");
        java.lang.String[][] strArray24 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities20.addEntities(strArray24);
        entities20.addEntity("hi!", 97);
        int int30 = entities20.entityValue("");
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str33 = entities31.unescape("");
        java.lang.String str35 = entities31.entityName(100);
        java.lang.String str37 = entities31.entityName((int) ' ');
        java.lang.String str39 = entities31.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap40 = entities31.map;
        java.lang.String[][] strArray41 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities31.addEntities(strArray41);
        java.lang.String[][] strArray43 = new java.lang.String[][] {};
        entities31.addEntities(strArray43);
        entities20.addEntities(strArray43);
        entities0.addEntities(strArray43);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(entities20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(entityMap40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[][] {});
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.entityName((int) (byte) -1);
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("", 0);
        java.lang.String str15 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str8 = binaryEntityMap1.name(0);
        java.lang.String[] strArray9 = null;
        binaryEntityMap1.names = strArray9;
        int int11 = binaryEntityMap1.growBy;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        int int10 = binaryEntityMap0.size;
        int int11 = binaryEntityMap0.size;
        java.lang.String str13 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        java.lang.String str9 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("", 1);
        java.lang.String str14 = primitiveEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
            entities0.escape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        java.lang.String str44 = binaryEntityMap0.name((int) (short) -1);
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 0);
        int int3 = arrayEntityMap1.value("");
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        java.util.Map map19 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        int int8 = lookupEntityMap0.value("");
        java.lang.String str10 = lookupEntityMap0.name(100);
        java.lang.String str12 = lookupEntityMap0.name(0);
        java.lang.String str14 = lookupEntityMap0.name(1);
        int int16 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", (-1));
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        arrayEntityMap1.add("hi!", (int) (byte) 0);
        arrayEntityMap1.growBy = (byte) 10;
        arrayEntityMap1.add("hi!", (int) (short) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        binaryEntityMap21.add("", 97);
        binaryEntityMap21.size = (byte) -1;
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
        int int42 = binaryEntityMap29.value("hi!");
        java.lang.String str44 = binaryEntityMap29.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str48 = arrayEntityMap46.name((int) (short) 100);
        int[] intArray51 = new int[] { (short) 0, (-1) };
        arrayEntityMap46.values = intArray51;
        binaryEntityMap29.values = intArray51;
        binaryEntityMap21.values = intArray51;
        arrayEntityMap1.values = intArray51;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] {});
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 0, (-1) });
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String[] strArray2 = null;
        binaryEntityMap1.names = strArray2;
        java.lang.String str5 = binaryEntityMap1.name(52);
        int int6 = binaryEntityMap1.growBy;
        binaryEntityMap1.size = (short) 1;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = hashEntityMap56.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap58 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap58.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map63 = hashEntityMap62.mapNameToValue;
        hashEntityMap58.mapNameToValue = map63;
        int int66 = hashEntityMap58.value("");
        java.util.Map map67 = hashEntityMap58.mapNameToValue;
        hashEntityMap56.mapNameToValue = map67;
        java.util.Map map69 = hashEntityMap56.mapValueToName;
        java.util.Map map70 = hashEntityMap56.mapNameToValue;
        hashEntityMap0.mapNameToValue = map70;
        hashEntityMap0.add("", 3);
        hashEntityMap0.add("hi!", 98);
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
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap6.add("", (int) (short) 1);
        arrayEntityMap6.ensureCapacity((int) ' ');
        int int12 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        java.lang.String str15 = entities0.escape("");
        java.lang.String str17 = entities0.entityName(1);
        org.junit.Assert.assertNotNull(entities0);
// flaky "1) test2563(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        int int23 = primitiveEntityMap8.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (-1));
        hashEntityMap0.add("hi!", 0);
        java.util.Map map14 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int35 = entities0.entityValue("");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        int int10 = entities0.entityValue("");
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("hi!");
        java.lang.String str16 = entities0.entityName((int) (short) -1);
        int int18 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap2.growBy = '4';
        int int5 = binaryEntityMap2.growBy;
        int[] intArray6 = binaryEntityMap2.values;
        arrayEntityMap1.values = intArray6;
        int int8 = arrayEntityMap1.growBy;
        int int9 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        lookupEntityMap0.add("hi!", (int) (byte) 1);
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
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", (int) (short) 100);
        int[] intArray10 = binaryEntityMap0.values;
        int int11 = binaryEntityMap0.size;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.size;
        int int11 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str15 = arrayEntityMap13.name((int) (short) 100);
        int[] intArray18 = new int[] { (short) 0, (-1) };
        arrayEntityMap13.values = intArray18;
        int int20 = arrayEntityMap13.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str23 = binaryEntityMap21.name((int) (byte) 0);
        int int25 = binaryEntityMap21.value("");
        binaryEntityMap21.growBy = 10;
        java.lang.String str29 = binaryEntityMap21.name((int) (byte) 10);
        java.lang.String[] strArray30 = binaryEntityMap21.names;
        arrayEntityMap13.names = strArray30;
        arrayEntityMap13.ensureCapacity((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap39.growBy = (short) 10;
        java.lang.String[] strArray42 = binaryEntityMap39.names;
        arrayEntityMap38.names = strArray42;
        int[] intArray44 = arrayEntityMap38.values;
        binaryEntityMap34.values = intArray44;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap46.growBy = (short) 10;
        java.lang.String[] strArray49 = binaryEntityMap46.names;
        int int51 = binaryEntityMap46.value("");
        binaryEntityMap46.growBy = (short) 1;
        binaryEntityMap46.size = 100;
        binaryEntityMap46.add("", 100);
        java.lang.String[] strArray59 = binaryEntityMap46.names;
        binaryEntityMap34.names = strArray59;
        arrayEntityMap13.names = strArray59;
        binaryEntityMap0.names = strArray59;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name(52);
        java.lang.Class<?> wildcardClass7 = lookupEntityMap0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        int[] intArray7 = binaryEntityMap1.values;
        int[] intArray8 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int14 = arrayEntityMap12.value("hi!");
        java.lang.String[] strArray15 = arrayEntityMap12.names;
        java.lang.String[] strArray16 = arrayEntityMap12.names;
        arrayEntityMap1.names = strArray16;
        int int18 = arrayEntityMap1.size;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        int int47 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
// flaky "2) test2575(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str5);
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        java.lang.String str18 = hashEntityMap0.name(0);
        java.lang.String str20 = hashEntityMap0.name(0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int23 = hashEntityMap21.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap24 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map25 = hashEntityMap24.mapNameToValue;
        hashEntityMap21.mapNameToValue = map25;
        java.util.Map map27 = hashEntityMap21.mapValueToName;
        hashEntityMap0.mapValueToName = map27;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map32 = hashEntityMap31.mapNameToValue;
        java.util.Map map33 = hashEntityMap31.mapValueToName;
        java.util.Map map34 = hashEntityMap31.mapNameToValue;
        hashEntityMap14.mapValueToName = map34;
        hashEntityMap0.mapNameToValue = map34;
        java.lang.String str38 = hashEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
        int int16 = binaryEntityMap0.size;
        int[] intArray17 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        int int23 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (int) '#');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        java.lang.String[] strArray23 = binaryEntityMap9.names;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        int int29 = hashEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        java.lang.String[] strArray7 = binaryEntityMap0.names;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.add("hi!", (int) 'a');
        int int13 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        entities0.addEntity("", 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        int[] intArray50 = binaryEntityMap0.values;
        java.lang.String str52 = binaryEntityMap0.name((int) (short) -1);
        java.lang.String[] strArray53 = binaryEntityMap0.names;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = binaryEntityMap0.name(101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(strArray53);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        int int13 = arrayEntityMap1.value("hi!");
        int int14 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = '4';
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        hashEntityMap11.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap32.mapNameToValue = map38;
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        hashEntityMap32.add("", (int) (byte) 1);
        hashEntityMap32.add("", 0);
        java.util.Map map48 = hashEntityMap32.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap49.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        hashEntityMap49.mapNameToValue = map54;
        int int57 = hashEntityMap49.value("");
        java.util.Map map58 = hashEntityMap49.mapNameToValue;
        hashEntityMap32.mapNameToValue = map58;
        hashEntityMap11.mapValueToName = map58;
        java.util.Map map61 = hashEntityMap11.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
// flaky "3) test2586(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("hi!");
        java.lang.String[][] strArray15 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities0.addEntities(strArray15);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.String str24 = entities0.entityName((int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("hi!", (-1));
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name((int) '#');
        lookupEntityMap0.add("hi!", 1);
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str11 = lookupEntityMap0.name((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name(32);
        primitiveEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) ' ');
        java.lang.String str14 = primitiveEntityMap0.name(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap3 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int5 = hashEntityMap3.value("hi!");
        java.util.Map map6 = hashEntityMap3.mapValueToName;
        int int8 = hashEntityMap3.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        hashEntityMap10.mapNameToValue = map15;
        hashEntityMap9.mapNameToValue = map15;
        java.util.Map map18 = hashEntityMap9.mapNameToValue;
        hashEntityMap3.mapNameToValue = map18;
        java.lang.String str21 = hashEntityMap3.name((int) '#');
        entities0.map = hashEntityMap3;
        java.util.Map map23 = hashEntityMap3.mapNameToValue;
        java.util.Map map24 = hashEntityMap3.mapNameToValue;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int8 = arrayEntityMap7.growBy;
        int int9 = arrayEntityMap7.size;
        entities0.map = arrayEntityMap7;
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("");
        java.lang.String str16 = entities0.entityName((int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky "4) test2594(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 1);
        lookupEntityMap0.add("hi!", 0);
        java.lang.String str13 = lookupEntityMap0.name((int) (short) 0);
        int int15 = lookupEntityMap0.value("");
        java.lang.String str17 = lookupEntityMap0.name((int) (byte) 10);
        lookupEntityMap0.add("", 98);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap2.growBy = '4';
        int int5 = binaryEntityMap2.growBy;
        int[] intArray6 = binaryEntityMap2.values;
        arrayEntityMap1.values = intArray6;
        int int8 = arrayEntityMap1.growBy;
        java.lang.String str10 = arrayEntityMap1.name(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        int int9 = entityMap7.value("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(entityMap7);
// flaky "5) test2597(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.lang.String str17 = hashEntityMap0.name(0);
        java.util.Map map18 = null;
        hashEntityMap0.mapNameToValue = map18;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = 98;
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        int int27 = binaryEntityMap0.value("");
        java.lang.String str29 = binaryEntityMap0.name(3);
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        int[] intArray10 = binaryEntityMap0.values;
        binaryEntityMap0.growBy = (byte) 100;
        binaryEntityMap0.add("", 2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        int int21 = binaryEntityMap16.value("");
        binaryEntityMap16.growBy = (short) 1;
        java.lang.String str25 = binaryEntityMap16.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int28 = arrayEntityMap27.growBy;
        int int29 = arrayEntityMap27.size;
        arrayEntityMap27.size = (short) -1;
        arrayEntityMap27.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap35.ensureCapacity((int) 'a');
        arrayEntityMap35.ensureCapacity(0);
        arrayEntityMap35.add("hi!", 100);
        java.lang.String str44 = arrayEntityMap35.name((int) 'a');
        int[] intArray45 = arrayEntityMap35.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap46 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int48 = arrayEntityMap46.value("hi!");
        java.lang.String[] strArray49 = arrayEntityMap46.names;
        java.lang.String[] strArray50 = arrayEntityMap46.names;
        arrayEntityMap35.names = strArray50;
        arrayEntityMap27.names = strArray50;
        binaryEntityMap16.names = strArray50;
        binaryEntityMap0.names = strArray50;
        binaryEntityMap0.add("hi!", (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.apache.commons.lang.Entities.EntityMap entityMap16 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(entityMap16);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        int int25 = hashEntityMap0.value("hi!");
        java.util.Map map26 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        java.lang.String str36 = arrayEntityMap1.name((int) (byte) 1);
        arrayEntityMap1.add("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = entities0.entityValue("");
        int int14 = entities0.entityValue("hi!");
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer16 = null;
        entities15.escape(writer16, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap19 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities15.map = primitiveEntityMap19;
        java.lang.String str22 = entities15.entityName((int) (short) -1);
        java.lang.String[][] strArray23 = new java.lang.String[][] {};
        entities15.addEntities(strArray23);
        entities0.addEntities(strArray23);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[][] {});
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        java.util.Map map14 = hashEntityMap13.mapNameToValue;
        java.util.Map map15 = hashEntityMap13.mapValueToName;
        java.util.Map map16 = hashEntityMap13.mapNameToValue;
        hashEntityMap13.add("", (int) (byte) 10);
        int int21 = hashEntityMap13.value("");
        java.lang.String str23 = hashEntityMap13.name((int) (byte) 10);
        java.lang.String str25 = hashEntityMap13.name((int) (short) 0);
        java.lang.String str27 = hashEntityMap13.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap29.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map34 = hashEntityMap33.mapNameToValue;
        hashEntityMap29.mapNameToValue = map34;
        hashEntityMap28.mapNameToValue = map34;
        java.util.Map map37 = hashEntityMap28.mapNameToValue;
        int int39 = hashEntityMap28.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap40 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map41 = hashEntityMap40.mapNameToValue;
        java.util.Map map42 = hashEntityMap40.mapValueToName;
        java.util.Map map43 = hashEntityMap40.mapNameToValue;
        hashEntityMap28.mapValueToName = map43;
        hashEntityMap13.mapNameToValue = map43;
        java.lang.String str47 = hashEntityMap13.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int50 = hashEntityMap48.value("hi!");
        java.lang.String str52 = hashEntityMap48.name((int) (short) 0);
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
        java.lang.String str71 = hashEntityMap53.name((int) 'a');
        hashEntityMap53.add("", (int) (short) 1);
        java.util.Map map75 = hashEntityMap53.mapNameToValue;
        hashEntityMap48.mapNameToValue = map75;
        hashEntityMap13.mapValueToName = map75;
        hashEntityMap0.mapValueToName = map75;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap79 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map80 = hashEntityMap79.mapNameToValue;
        java.util.Map map81 = hashEntityMap79.mapValueToName;
        java.util.Map map82 = hashEntityMap79.mapNameToValue;
        java.util.Map map83 = hashEntityMap79.mapValueToName;
        java.util.Map map84 = hashEntityMap79.mapValueToName;
        int int86 = hashEntityMap79.value("hi!");
        java.util.Map map87 = hashEntityMap79.mapValueToName;
        hashEntityMap0.mapValueToName = map87;
        java.lang.Class<?> wildcardClass89 = map87.getClass();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        java.lang.String str17 = binaryEntityMap0.name(32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", 10);
        hashEntityMap0.add("hi!", (int) (short) -1);
        int int12 = hashEntityMap0.value("");
        int int14 = hashEntityMap0.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap17.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap21 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map22 = hashEntityMap21.mapNameToValue;
        hashEntityMap17.mapNameToValue = map22;
        int int25 = hashEntityMap17.value("");
        java.util.Map map26 = hashEntityMap17.mapNameToValue;
        hashEntityMap15.mapNameToValue = map26;
        java.util.Map map28 = hashEntityMap15.mapValueToName;
        hashEntityMap15.add("", (int) (byte) 100);
        java.util.Map map32 = hashEntityMap15.mapValueToName;
        hashEntityMap0.mapNameToValue = map32;
        java.util.Map map34 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        lookupEntityMap12.add("", (int) 'a');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "6) test2609(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        java.lang.String str17 = binaryEntityMap0.name(1);
        int int18 = binaryEntityMap0.growBy;
        java.lang.String str20 = binaryEntityMap0.name(10);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: source index -1 out of bounds for int[100]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        int int6 = lookupEntityMap0.value("hi!");
        lookupEntityMap0.add("", 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap11 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap11.ensureCapacity((int) 'a');
        arrayEntityMap11.ensureCapacity(0);
        arrayEntityMap11.add("hi!", 100);
        java.lang.String str20 = arrayEntityMap11.name((int) 'a');
        int int22 = arrayEntityMap11.value("");
        int[] intArray23 = arrayEntityMap11.values;
        int int24 = arrayEntityMap11.size;
        int int25 = arrayEntityMap11.growBy;
        arrayEntityMap11.size = 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        binaryEntityMap28.size = (short) 100;
        java.lang.String[] strArray34 = binaryEntityMap28.names;
        arrayEntityMap11.names = strArray34;
        binaryEntityMap0.names = strArray34;
        int int37 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str5 = binaryEntityMap0.name(2);
        binaryEntityMap0.size = 0;
        int int8 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = 35;
        binaryEntityMap0.add("", 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str5 = entities0.escape("");
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        int int21 = binaryEntityMap16.value("");
        binaryEntityMap16.growBy = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str26 = binaryEntityMap24.name((int) (byte) 0);
        java.lang.String[] strArray27 = binaryEntityMap24.names;
        binaryEntityMap16.names = strArray27;
        binaryEntityMap0.names = strArray27;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int23 = arrayEntityMap22.growBy;
        java.lang.String[] strArray24 = arrayEntityMap22.names;
        int int26 = arrayEntityMap22.value("");
        int int27 = arrayEntityMap22.size;
        java.lang.String[] strArray28 = arrayEntityMap22.names;
        binaryEntityMap0.names = strArray28;
        int int30 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name(97);
        int int14 = primitiveEntityMap0.value("");
        int int16 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(52);
        int[] intArray2 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.growBy = 1;
        arrayEntityMap1.add("hi!", 1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 0);
        int int16 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        java.lang.String str43 = hashEntityMap16.name(0);
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
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.entityName((-1));
        int int12 = entities0.entityValue("hi!");
        java.lang.String str14 = entities0.entityName(2);
        java.io.Writer writer15 = null;
        entities0.escape(writer15, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) (byte) 0);
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        java.lang.String str22 = entities0.entityName(1);
        entities0.addEntity("", (int) (byte) 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        java.lang.String str12 = entities0.unescape("hi!");
        entities0.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str18 = entities0.entityName((int) (short) 1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "7) test2626(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(entityMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        int int13 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (short) -1;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        arrayEntityMap1.ensureCapacity((int) (short) 0);
        java.lang.String str11 = arrayEntityMap1.name(100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap13.ensureCapacity((int) 'a');
        int int16 = arrayEntityMap13.growBy;
        java.lang.String[] strArray17 = arrayEntityMap13.names;
        arrayEntityMap1.names = strArray17;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap0.add("", (int) (short) 1);
        arrayEntityMap0.ensureCapacity((int) ' ');
        int int6 = arrayEntityMap0.growBy;
        arrayEntityMap0.add("hi!", (int) (short) 10);
        int int10 = arrayEntityMap0.size;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap12 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap12.add("", 100);
        java.lang.String str17 = binaryEntityMap12.name(52);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap19 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap19.ensureCapacity((int) 'a');
        int int22 = arrayEntityMap19.growBy;
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap19.names = strArray27;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str31 = binaryEntityMap29.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.growBy = (short) 10;
        java.lang.String[] strArray35 = binaryEntityMap32.names;
        binaryEntityMap32.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap39.growBy = (short) 10;
        java.lang.String[] strArray42 = binaryEntityMap39.names;
        binaryEntityMap32.names = strArray42;
        binaryEntityMap29.names = strArray42;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap45 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str47 = binaryEntityMap45.name((int) (byte) 0);
        int int49 = binaryEntityMap45.value("");
        binaryEntityMap45.add("", (int) (short) -1);
        int[] intArray53 = binaryEntityMap45.values;
        binaryEntityMap29.values = intArray53;
        arrayEntityMap19.values = intArray53;
        int[] intArray56 = arrayEntityMap19.values;
        binaryEntityMap12.values = intArray56;
        arrayEntityMap0.values = intArray56;
        java.lang.String str60 = arrayEntityMap0.name((int) (short) 1);
        arrayEntityMap0.growBy = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        binaryEntityMap0.growBy = (short) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.entityName((int) (byte) 1);
        java.lang.String str8 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("hi!");
        int int9 = binaryEntityMap0.growBy;
        int int11 = binaryEntityMap0.value("");
        binaryEntityMap0.size = 1;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer10 = null;
        entities9.escape(writer10, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities9.map = primitiveEntityMap13;
        org.apache.commons.lang.Entities.EntityMap entityMap15 = entities9.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities9);
        entities9.addEntity("hi!", (int) 'a');
        org.apache.commons.lang.Entities entities20 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str22 = entities20.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities20.map = arrayEntityMap24;
        entities20.addEntity("", (int) ' ');
        java.lang.String str30 = entities20.unescape("");
        entities20.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities34 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer35 = null;
        entities34.escape(writer35, "");
        java.lang.String[][] strArray38 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities34.addEntities(strArray38);
        entities20.addEntities(strArray38);
        entities9.addEntities(strArray38);
        entities0.addEntities(strArray38);
        org.junit.Assert.assertNotNull(entities0);
// flaky "8) test2634(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertNotNull(entityMap15);
        org.junit.Assert.assertNotNull(entities20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(entities34);
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("hi!");
        java.lang.String[] strArray3 = arrayEntityMap0.names;
        java.lang.String[] strArray4 = arrayEntityMap0.names;
        int int5 = arrayEntityMap0.size;
        int int7 = arrayEntityMap0.value("");
        arrayEntityMap0.add("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "9) test2636(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(entities13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(entities21);
        org.junit.Assert.assertNotNull(strArray25);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        int int8 = hashEntityMap0.value("hi!");
        int int10 = hashEntityMap0.value("hi!");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        hashEntityMap11.mapValueToName = map31;
        hashEntityMap0.mapValueToName = map31;
        int int35 = hashEntityMap0.value("");
        hashEntityMap0.add("", 2);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        java.io.Writer writer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer18, "hi!");
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("hi!");
        java.lang.String str10 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "10) test2639(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "1) test2639(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        int int5 = binaryEntityMap1.value("hi!");
        binaryEntityMap1.growBy = (short) 10;
        binaryEntityMap1.add("", (int) (short) -1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
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
        java.lang.Class<?> wildcardClass23 = strArray21.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map16 = hashEntityMap15.mapNameToValue;
        java.util.Map map17 = hashEntityMap15.mapValueToName;
        java.util.Map map18 = hashEntityMap15.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap19 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map20 = treeEntityMap19.mapNameToValue;
        hashEntityMap15.mapValueToName = map20;
        java.util.Map map22 = hashEntityMap15.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        hashEntityMap23.add("", (int) (byte) 10);
        int int31 = hashEntityMap23.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        hashEntityMap23.mapNameToValue = map37;
        hashEntityMap23.add("", (int) (short) 0);
        java.util.Map map43 = hashEntityMap23.mapNameToValue;
        hashEntityMap15.mapValueToName = map43;
        hashEntityMap0.mapNameToValue = map43;
        java.lang.String str47 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map48 = hashEntityMap0.mapNameToValue;
        java.lang.Class<?> wildcardClass49 = map48.getClass();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        int int4 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int7 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        int int10 = arrayEntityMap6.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
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
        arrayEntityMap17.growBy = (short) 100;
        java.lang.String[] strArray27 = arrayEntityMap17.names;
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
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities16.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities16);
        java.lang.String str20 = entities16.unescape("hi!");
        java.lang.String str22 = entities16.entityName((int) '#');
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
        entities16.addEntities(strArray71);
        entities0.addEntities(strArray71);
        entities0.addEntity("", (int) ' ');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
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
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map15 = hashEntityMap14.mapNameToValue;
        java.util.Map map16 = hashEntityMap14.mapValueToName;
        java.util.Map map17 = hashEntityMap14.mapNameToValue;
        java.util.Map map18 = hashEntityMap14.mapValueToName;
        java.lang.String str20 = hashEntityMap14.name((int) '4');
        hashEntityMap14.add("hi!", (int) (byte) 100);
        java.util.Map map24 = hashEntityMap14.mapNameToValue;
        hashEntityMap0.mapNameToValue = map24;
        int int27 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        binaryEntityMap1.add("", 0);
        java.lang.String str51 = binaryEntityMap1.name(100);
        int int52 = binaryEntityMap1.growBy;
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        int int17 = arrayEntityMap8.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.unescape("hi!");
        java.lang.String str9 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (short) 100);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        int int12 = entities0.entityValue("hi!");
        java.io.Writer writer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        java.lang.String str25 = entities0.escape("hi!");
        java.lang.String str27 = entities0.escape("hi!");
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str30 = entities28.unescape("");
        java.lang.String str32 = entities28.entityName(100);
        java.lang.String str34 = entities28.entityName((int) ' ');
        java.lang.String str36 = entities28.entityName((int) '#');
        java.lang.String str38 = entities28.unescape("");
        java.lang.String str40 = entities28.entityName(0);
        java.lang.String str42 = entities28.unescape("hi!");
        java.lang.String str44 = entities28.escape("hi!");
        int int46 = entities28.entityValue("");
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer48 = null;
        entities47.escape(writer48, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap51 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities47.map = primitiveEntityMap51;
        java.lang.String str54 = entities47.entityName((int) (short) -1);
        java.lang.String[][] strArray55 = new java.lang.String[][] {};
        entities47.addEntities(strArray55);
        entities28.addEntities(strArray55);
        entities0.addEntities(strArray55);
        org.apache.commons.lang.Entities.EntityMap entityMap59 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[][] {});
        org.junit.Assert.assertNotNull(entityMap59);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        int[] intArray13 = binaryEntityMap0.values;
        int int14 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", (int) (byte) 1);
        binaryEntityMap0.ensureCapacity(35);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap23.ensureCapacity((int) 'a');
        arrayEntityMap23.ensureCapacity(0);
        arrayEntityMap23.add("hi!", 100);
        java.lang.String str32 = arrayEntityMap23.name((int) 'a');
        int int34 = arrayEntityMap23.value("");
        arrayEntityMap23.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap39.ensureCapacity((int) 'a');
        int int42 = arrayEntityMap39.growBy;
        java.lang.String[] strArray43 = arrayEntityMap39.names;
        arrayEntityMap23.names = strArray43;
        binaryEntityMap0.names = strArray43;
        binaryEntityMap0.ensureCapacity((int) (short) 1);
        int int48 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        lookupEntityMap0.add("hi!", 32);
        java.lang.String str16 = lookupEntityMap0.name(101);
        int int18 = lookupEntityMap0.value("");
        java.lang.String str20 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        int int25 = primitiveEntityMap0.value("");
        java.lang.Class<?> wildcardClass26 = primitiveEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        java.lang.String str29 = entities0.entityName(97);
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str32 = entities30.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap34 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities30.map = arrayEntityMap34;
        entities30.addEntity("", (int) ' ');
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities30);
        org.apache.commons.lang.Entities entities40 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str42 = entities40.unescape("");
        java.lang.String str44 = entities40.entityName((int) (short) 0);
        java.lang.String str46 = entities40.unescape("hi!");
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str49 = entities47.unescape("");
        int int51 = entities47.entityValue("");
        int int53 = entities47.entityValue("");
        entities47.addEntity("", 97);
        org.apache.commons.lang.Entities entities57 = org.apache.commons.lang.Entities.HTML32;
        entities57.addEntity("hi!", 0);
        java.lang.String[][] strArray61 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities57.addEntities(strArray61);
        entities47.addEntities(strArray61);
        entities40.addEntities(strArray61);
        entities30.addEntities(strArray61);
        entities0.addEntities(strArray61);
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(entities40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(entities57);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        java.lang.Class<?> wildcardClass23 = map21.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        int int6 = binaryEntityMap0.value("hi!");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("", 35);
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map7 = hashEntityMap0.mapNameToValue;
        java.util.Map map8 = hashEntityMap0.mapNameToValue;
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.lang.String str12 = hashEntityMap0.name(32);
        int int14 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        int int8 = entities0.entityValue("hi!");
        int int10 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        entities0.addEntity("hi!", (int) (byte) 10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
// flaky "11) test2659(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky "2) test2659(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 1);
        int int10 = binaryEntityMap0.size;
        int[] intArray11 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        int[] intArray27 = binaryEntityMap5.values;
        int int28 = binaryEntityMap5.growBy;
        int[] intArray29 = binaryEntityMap5.values;
        binaryEntityMap5.add("hi!", (int) (short) 100);
        binaryEntityMap5.growBy = 98;
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(intArray29);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        int int3 = arrayEntityMap1.value("");
        java.lang.String str5 = arrayEntityMap1.name(98);
        int int7 = arrayEntityMap1.value("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        binaryEntityMap0.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap12.ensureCapacity((int) 'a');
        arrayEntityMap12.ensureCapacity(0);
        java.lang.String[] strArray17 = arrayEntityMap12.names;
        binaryEntityMap0.names = strArray17;
        binaryEntityMap0.size = 1;
        java.lang.String str22 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name((int) '4');
        hashEntityMap0.add("hi!", (int) (byte) 100);
        hashEntityMap0.add("", (int) (byte) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int15 = hashEntityMap13.value("hi!");
        java.util.Map map16 = hashEntityMap13.mapValueToName;
        int int18 = hashEntityMap13.value("");
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
        hashEntityMap13.mapValueToName = map36;
        hashEntityMap0.mapNameToValue = map36;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.util.Map map3 = hashEntityMap0.mapValueToName;
        int int5 = hashEntityMap0.value("");
        java.util.Map map6 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 0);
        hashEntityMap0.add("hi!", 32);
        java.lang.Class<?> wildcardClass13 = hashEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 52;
        int int8 = binaryEntityMap0.growBy;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.size = 32;
        binaryEntityMap0.growBy = 10;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = binaryEntityMap22.value("hi!");
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
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray9 = arrayEntityMap8.names;
        binaryEntityMap0.names = strArray9;
        int int12 = binaryEntityMap0.value("");
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        binaryEntityMap0.size = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { null });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { null });
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.escape("");
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        java.lang.String str10 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        java.lang.String str13 = entities0.entityName(10);
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(entityMap14);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        java.lang.String str14 = lookupEntityMap0.name((int) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.growBy = (byte) 100;
        arrayEntityMap1.ensureCapacity(10);
        java.lang.String str9 = arrayEntityMap1.name((int) (byte) 1);
        int[] intArray10 = arrayEntityMap1.values;
        int int12 = arrayEntityMap1.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.growBy = (short) 10;
        int[] intArray16 = binaryEntityMap13.values;
        java.lang.String str18 = binaryEntityMap13.name(32);
        java.lang.String str20 = binaryEntityMap13.name((int) '4');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap22 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap22.ensureCapacity((int) 'a');
        arrayEntityMap22.ensureCapacity(0);
        arrayEntityMap22.add("hi!", 100);
        java.lang.String str31 = arrayEntityMap22.name((int) 'a');
        int[] intArray32 = arrayEntityMap22.values;
        binaryEntityMap13.values = intArray32;
        arrayEntityMap1.values = intArray32;
        int int36 = arrayEntityMap1.value("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        int int30 = hashEntityMap11.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        binaryEntityMap0.growBy = (byte) -1;
        binaryEntityMap0.growBy = '4';
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("hi!");
        java.lang.String str6 = entities0.unescape("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        java.lang.String str9 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("");
        arrayEntityMap0.ensureCapacity((int) (byte) 100);
        int int6 = arrayEntityMap0.value("hi!");
        java.lang.String str8 = arrayEntityMap0.name(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int7 = arrayEntityMap1.value("hi!");
        int int8 = arrayEntityMap1.size;
        int int10 = arrayEntityMap1.value("hi!");
        int[] intArray11 = arrayEntityMap1.values;
        int[] intArray12 = arrayEntityMap1.values;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.entityName((int) 'a');
        java.lang.String str7 = entities0.entityName((int) (byte) 0);
        java.lang.String str9 = entities0.entityName((int) (short) 100);
        java.lang.String str11 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
// flaky "12) test2677(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        binaryEntityMap0.growBy = (byte) 1;
        int int23 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        java.lang.String str5 = arrayEntityMap1.name(0);
        arrayEntityMap1.ensureCapacity((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap8 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap8.growBy = '4';
        java.lang.String str12 = binaryEntityMap8.name(100);
        int int13 = binaryEntityMap8.growBy;
        java.lang.String[] strArray14 = binaryEntityMap8.names;
        arrayEntityMap1.names = strArray14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(52);
        lookupEntityMap0.add("", 0);
        java.lang.String str19 = lookupEntityMap0.name((int) '#');
        int int21 = lookupEntityMap0.value("");
        java.lang.String str23 = lookupEntityMap0.name(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.unescape("");
        java.lang.String str13 = entities0.entityName((int) (short) 0);
        entities0.addEntity("hi!", (int) (short) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "13) test2681(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        entities0.addEntity("", (int) (byte) 0);
        java.lang.String str13 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap14 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str16 = lookupEntityMap14.name((int) (short) 0);
        java.lang.String str18 = lookupEntityMap14.name((int) (short) 1);
        java.lang.String str20 = lookupEntityMap14.name((int) (byte) 100);
        java.lang.String str22 = lookupEntityMap14.name((int) 'a');
        int int24 = lookupEntityMap14.value("");
        int int26 = lookupEntityMap14.value("");
        java.lang.String str28 = lookupEntityMap14.name((int) 'a');
        int int30 = lookupEntityMap14.value("hi!");
        java.lang.String str32 = lookupEntityMap14.name((int) (short) 0);
        java.lang.String str34 = lookupEntityMap14.name(10);
        int int36 = lookupEntityMap14.value("");
        entities0.map = lookupEntityMap14;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name((int) ' ');
        int int9 = binaryEntityMap0.size;
        int int10 = binaryEntityMap0.size;
        int int12 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        binaryEntityMap0.add("hi!", 1);
        java.lang.String str15 = binaryEntityMap0.name(100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        int int29 = primitiveEntityMap10.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str8 = entities0.unescape("hi!");
        java.io.Writer writer9 = null;
        entities0.escape(writer9, "");
        entities0.addEntity("hi!", 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] {});
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        lookupEntityMap0.add("hi!", (int) (byte) 10);
        int int7 = lookupEntityMap0.value("hi!");
        java.lang.String str9 = lookupEntityMap0.name((int) (short) 0);
        int int11 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
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
        hashEntityMap0.add("", (int) ' ');
        java.util.Map map22 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        entities0.addEntity("", 97);
        org.apache.commons.lang.Entities entities10 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer11 = null;
        entities10.escape(writer11, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap14 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities10.map = primitiveEntityMap14;
        java.lang.String str17 = entities10.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities18 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer19 = null;
        entities18.escape(writer19, "");
        java.lang.String[][] strArray22 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities18.addEntities(strArray22);
        entities10.addEntities(strArray22);
        entities0.addEntities(strArray22);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(entities18);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap18 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap18.growBy = (short) 10;
        java.lang.String[] strArray21 = binaryEntityMap18.names;
        arrayEntityMap17.names = strArray21;
        int[] intArray23 = arrayEntityMap17.values;
        java.lang.String str25 = arrayEntityMap17.name((int) (byte) 10);
        arrayEntityMap17.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap29 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap29.ensureCapacity((int) 'a');
        arrayEntityMap29.ensureCapacity(0);
        arrayEntityMap29.add("hi!", 100);
        java.lang.String str38 = arrayEntityMap29.name((int) 'a');
        int int40 = arrayEntityMap29.value("");
        int[] intArray41 = arrayEntityMap29.values;
        int[] intArray42 = arrayEntityMap29.values;
        arrayEntityMap17.values = intArray42;
        arrayEntityMap1.values = intArray42;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertNotNull(intArray42);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        int[] intArray5 = binaryEntityMap0.values;
        int int7 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int[] intArray3 = binaryEntityMap0.values;
        int int5 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.size = 100;
        int int8 = binaryEntityMap0.size;
        int int9 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(0);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            arrayEntityMap1.add("hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last source index 10 out of bounds for object array[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.growBy = 0;
        binaryEntityMap0.add("hi!", 2);
        binaryEntityMap0.size = (byte) 1;
        int[] intArray13 = binaryEntityMap0.values;
        int int14 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", (int) (byte) 1);
        binaryEntityMap0.ensureCapacity(35);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap23 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap23.ensureCapacity((int) 'a');
        arrayEntityMap23.ensureCapacity(0);
        arrayEntityMap23.add("hi!", 100);
        java.lang.String str32 = arrayEntityMap23.name((int) 'a');
        int int34 = arrayEntityMap23.value("");
        arrayEntityMap23.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap39.ensureCapacity((int) 'a');
        int int42 = arrayEntityMap39.growBy;
        java.lang.String[] strArray43 = arrayEntityMap39.names;
        arrayEntityMap23.names = strArray43;
        binaryEntityMap0.names = strArray43;
        binaryEntityMap0.ensureCapacity(101);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) ' ');
        int int14 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("", (int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str10 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        int int11 = binaryEntityMap0.size;
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        int int40 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "14) test2700(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int17 = binaryEntityMap15.value("hi!");
        int[] intArray18 = binaryEntityMap15.values;
        binaryEntityMap15.size = (short) 0;
        binaryEntityMap15.growBy = (byte) 100;
        int[] intArray23 = binaryEntityMap15.values;
        binaryEntityMap0.values = intArray23;
        org.apache.commons.lang.Entities entities25 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer26 = null;
        entities25.escape(writer26, "");
        int int30 = entities25.entityValue("");
        java.lang.String str32 = entities25.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap33 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        arrayEntityMap33.names = strArray37;
        int[] intArray39 = arrayEntityMap33.values;
        entities25.map = arrayEntityMap33;
        org.apache.commons.lang.Entities entities41 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str43 = entities41.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap45 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities41.map = arrayEntityMap45;
        org.apache.commons.lang.Entities entities47 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str49 = entities47.unescape("");
        java.lang.String str51 = entities47.entityName(100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray53 = new int[] {};
        binaryEntityMap52.values = intArray53;
        int int56 = binaryEntityMap52.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap57 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap58.growBy = (short) 10;
        java.lang.String[] strArray61 = binaryEntityMap58.names;
        arrayEntityMap57.names = strArray61;
        binaryEntityMap52.names = strArray61;
        int int65 = binaryEntityMap52.value("hi!");
        entities47.map = binaryEntityMap52;
        java.lang.String str68 = binaryEntityMap52.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap69 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap69.growBy = (short) 10;
        int[] intArray72 = binaryEntityMap69.values;
        binaryEntityMap52.values = intArray72;
        arrayEntityMap45.values = intArray72;
        arrayEntityMap33.values = intArray72;
        java.lang.String str77 = arrayEntityMap33.name((int) 'a');
        int[] intArray78 = arrayEntityMap33.values;
        binaryEntityMap0.values = intArray78;
        int[] intArray80 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 0 });
        org.junit.Assert.assertNotNull(entities25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertNotNull(entities41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(entities47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] {});
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertNotNull(intArray80);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        int[] intArray7 = arrayEntityMap4.values;
        int[] intArray8 = arrayEntityMap4.values;
        arrayEntityMap4.add("hi!", 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
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
        hashEntityMap0.mapValueToName = map19;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap27 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map28 = treeEntityMap27.mapNameToValue;
        hashEntityMap23.mapValueToName = map28;
        java.util.Map map30 = hashEntityMap23.mapValueToName;
        hashEntityMap0.mapValueToName = map30;
        int int33 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name((int) ' ');
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.add("hi!", (int) (byte) 100);
        java.lang.String str14 = binaryEntityMap0.name((int) (byte) -1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.add("", (int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap12.add("", (int) (short) 1);
        arrayEntityMap12.ensureCapacity((int) ' ');
        int int18 = arrayEntityMap12.growBy;
        arrayEntityMap12.add("hi!", (int) (short) 10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap22.growBy = (short) 10;
        java.lang.String[] strArray25 = binaryEntityMap22.names;
        binaryEntityMap22.add("", (int) (short) 100);
        binaryEntityMap22.add("", (-1));
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap32 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap32.growBy = (short) 10;
        java.lang.String[] strArray35 = binaryEntityMap32.names;
        int int37 = binaryEntityMap32.value("");
        binaryEntityMap32.growBy = (short) 1;
        int int41 = binaryEntityMap32.value("");
        int[] intArray42 = binaryEntityMap32.values;
        binaryEntityMap22.values = intArray42;
        arrayEntityMap12.values = intArray42;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int47 = binaryEntityMap46.size;
        java.lang.String str49 = binaryEntityMap46.name((int) ' ');
        int[] intArray50 = binaryEntityMap46.values;
        arrayEntityMap12.values = intArray50;
        binaryEntityMap0.values = intArray50;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(intArray50);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        entities0.addEntity("", (int) (short) 0);
        java.lang.String str10 = entities0.escape("");
        java.io.Writer writer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.unescape(writer11, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
            entities0.unescape(writer27, "");
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
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String[][] strArray4 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities0.addEntities(strArray4);
        entities0.addEntity("hi!", 97);
        int int10 = entities0.entityValue("");
        int int12 = entities0.entityValue("");
        java.lang.String str14 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer16 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer16, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        int[] intArray8 = binaryEntityMap0.values;
        int int9 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        hashEntityMap0.add("", (int) 'a');
        int int75 = hashEntityMap0.value("");
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap20 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int22 = hashEntityMap20.value("hi!");
        java.lang.String str24 = hashEntityMap20.name((int) (short) 100);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap25 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap25.add("", (int) (byte) -1);
        java.util.Map map29 = hashEntityMap25.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map31 = hashEntityMap30.mapNameToValue;
        java.util.Map map32 = hashEntityMap30.mapValueToName;
        java.util.Map map33 = hashEntityMap30.mapNameToValue;
        hashEntityMap30.add("", (int) (byte) 10);
        int int38 = hashEntityMap30.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        hashEntityMap30.mapNameToValue = map44;
        hashEntityMap25.mapValueToName = map44;
        hashEntityMap20.mapNameToValue = map44;
        hashEntityMap0.mapNameToValue = map44;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.add("", (int) (short) 0);
        java.lang.String str15 = binaryEntityMap0.name((int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        int int5 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str8 = binaryEntityMap6.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap9 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap9.growBy = (short) 10;
        java.lang.String[] strArray12 = binaryEntityMap9.names;
        binaryEntityMap9.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        binaryEntityMap9.names = strArray19;
        binaryEntityMap6.names = strArray19;
        binaryEntityMap6.growBy = (short) 0;
        java.lang.String str25 = binaryEntityMap6.name(97);
        int int26 = binaryEntityMap6.growBy;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap28.ensureCapacity((int) 'a');
        arrayEntityMap28.ensureCapacity(0);
        arrayEntityMap28.add("hi!", 100);
        java.lang.String str37 = arrayEntityMap28.name((int) 'a');
        arrayEntityMap28.add("hi!", (int) (short) -1);
        arrayEntityMap28.growBy = '4';
        int int44 = arrayEntityMap28.value("");
        int[] intArray45 = arrayEntityMap28.values;
        binaryEntityMap6.values = intArray45;
        binaryEntityMap1.values = intArray45;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("");
        int int10 = entities0.entityValue("");
        java.lang.String str12 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.lang.String str6 = hashEntityMap0.name((int) '4');
        hashEntityMap0.add("hi!", (int) (byte) 100);
        java.util.Map map10 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (short) -1);
        int int15 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
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
        entities0.map = hashEntityMap9;
        java.lang.String str60 = entities0.unescape("");
        int int62 = entities0.entityValue("");
        java.lang.String str64 = entities0.entityName(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
// flaky "15) test2717(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(entityMap7);
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str8 = binaryEntityMap1.name(0);
        java.lang.String[] strArray9 = binaryEntityMap1.names;
        binaryEntityMap1.add("hi!", (int) '4');
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", null, null, null, null, null, null, null, null });
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str4 = entities0.unescape("hi!");
        java.lang.String str6 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities entities7 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities7.map;
        java.lang.String str10 = entities7.escape("hi!");
        java.lang.String str12 = entities7.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap14.ensureCapacity((int) 'a');
        arrayEntityMap14.ensureCapacity(0);
        arrayEntityMap14.add("hi!", 100);
        java.lang.String str23 = arrayEntityMap14.name((int) 'a');
        int int25 = arrayEntityMap14.value("");
        int[] intArray26 = arrayEntityMap14.values;
        int int27 = arrayEntityMap14.size;
        entities7.map = arrayEntityMap14;
        java.io.Writer writer29 = null;
        entities7.escape(writer29, "");
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities7.map;
        entities7.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap37 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap37.ensureCapacity((int) 'a');
        arrayEntityMap37.growBy = (byte) 100;
        arrayEntityMap37.ensureCapacity(10);
        java.lang.String str45 = arrayEntityMap37.name((int) (byte) 1);
        arrayEntityMap37.size = 0;
        int int49 = arrayEntityMap37.value("hi!");
        entities7.map = arrayEntityMap37;
        org.apache.commons.lang.Entities entities51 = org.apache.commons.lang.Entities.HTML32;
        entities51.addEntity("hi!", 0);
        java.lang.String[][] strArray55 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities51.addEntities(strArray55);
        entities7.addEntities(strArray55);
        entities0.addEntities(strArray55);
        java.lang.String str60 = entities0.escape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(entities51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 'a';
        binaryEntityMap0.add("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        java.lang.String str31 = primitiveEntityMap10.name((int) ' ');
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap23.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        hashEntityMap23.mapNameToValue = map28;
        hashEntityMap23.add("hi!", (int) 'a');
        int int34 = hashEntityMap23.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int37 = hashEntityMap35.value("hi!");
        java.util.Map map38 = hashEntityMap35.mapValueToName;
        int int40 = hashEntityMap35.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap42.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map47 = hashEntityMap46.mapNameToValue;
        hashEntityMap42.mapNameToValue = map47;
        hashEntityMap41.mapNameToValue = map47;
        java.util.Map map50 = hashEntityMap41.mapNameToValue;
        hashEntityMap35.mapNameToValue = map50;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap52 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap52.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap56 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map57 = hashEntityMap56.mapNameToValue;
        hashEntityMap52.mapNameToValue = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        hashEntityMap52.mapValueToName = map60;
        hashEntityMap35.mapNameToValue = map60;
        hashEntityMap23.mapNameToValue = map60;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap64 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map65 = hashEntityMap64.mapNameToValue;
        java.util.Map map66 = hashEntityMap64.mapValueToName;
        java.util.Map map67 = hashEntityMap64.mapNameToValue;
        java.util.Map map68 = hashEntityMap64.mapValueToName;
        java.lang.String str70 = hashEntityMap64.name((int) '4');
        hashEntityMap64.add("hi!", (int) (byte) 100);
        java.util.Map map74 = hashEntityMap64.mapNameToValue;
        hashEntityMap23.mapValueToName = map74;
        hashEntityMap0.mapNameToValue = map74;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap77 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map78 = hashEntityMap77.mapNameToValue;
        java.util.Map map79 = hashEntityMap77.mapValueToName;
        int int81 = hashEntityMap77.value("");
        hashEntityMap77.add("", 1);
        java.util.Map map85 = hashEntityMap77.mapValueToName;
        java.util.Map map86 = hashEntityMap77.mapValueToName;
        hashEntityMap0.mapNameToValue = map86;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        hashEntityMap0.add("", (int) '4');
        java.util.Map map24 = hashEntityMap0.mapValueToName;
        java.util.Map map25 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("hi!", (int) (byte) 0);
        java.util.Map map29 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        int int6 = arrayEntityMap1.value("");
        arrayEntityMap1.size = 98;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.util.Map map4 = hashEntityMap0.mapNameToValue;
        java.lang.String str6 = hashEntityMap0.name((int) (short) 10);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        hashEntityMap0.add("hi!", 100);
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
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        entities0.addEntity("hi!", 0);
        org.apache.commons.lang.Entities.EntityMap entityMap10 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNotNull(entityMap10);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap5 = entities0.map;
        entities0.addEntity("hi!", (int) '4');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.lang.String str11 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(entityMap5);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap29 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        binaryEntityMap29.add("", 100);
        java.lang.String str34 = binaryEntityMap29.name(52);
        int[] intArray35 = binaryEntityMap29.values;
        binaryEntityMap0.values = intArray35;
        binaryEntityMap0.ensureCapacity(101);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 100 });
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        binaryEntityMap0.size = 35;
        binaryEntityMap0.add("", (-1));
        binaryEntityMap0.size = '4';
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        binaryEntityMap1.size = (short) 0;
        java.lang.String[] strArray7 = binaryEntityMap1.names;
        binaryEntityMap1.size = 1;
        binaryEntityMap1.ensureCapacity(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { null });
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        java.util.Map map37 = hashEntityMap33.mapNameToValue;
        java.lang.String str39 = hashEntityMap33.name((int) ' ');
        java.lang.String str41 = hashEntityMap33.name(32);
        entities0.map = hashEntityMap33;
        int int44 = hashEntityMap33.value("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
        binaryEntityMap0.growBy = (byte) 1;
        binaryEntityMap0.add("", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.size = 35;
        int int11 = binaryEntityMap0.size;
        binaryEntityMap0.add("", 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        entities0.addEntity("hi!", (-1));
        int int14 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        org.apache.commons.lang.Entities entities16 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities16.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities16);
        java.lang.String str20 = entities16.unescape("hi!");
        java.lang.String str22 = entities16.entityName((int) '#');
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
        entities16.addEntities(strArray71);
        entities0.addEntities(strArray71);
        entities0.addEntity("", 98);
        org.apache.commons.lang.Entities.EntityMap entityMap79 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNotNull(entities16);
        org.junit.Assert.assertNotNull(entityMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
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
        org.junit.Assert.assertNotNull(entityMap79);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        java.lang.String str21 = hashEntityMap0.name((int) (short) 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        int int26 = hashEntityMap22.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap27 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map28 = hashEntityMap27.mapNameToValue;
        java.util.Map map29 = hashEntityMap27.mapValueToName;
        java.util.Map map30 = hashEntityMap27.mapNameToValue;
        hashEntityMap27.add("", (int) (byte) 10);
        int int35 = hashEntityMap27.value("");
        java.lang.String str37 = hashEntityMap27.name((int) (byte) 10);
        java.lang.String str39 = hashEntityMap27.name((int) (short) 0);
        java.lang.String str41 = hashEntityMap27.name(1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap43.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap47 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map48 = hashEntityMap47.mapNameToValue;
        hashEntityMap43.mapNameToValue = map48;
        hashEntityMap42.mapNameToValue = map48;
        java.util.Map map51 = hashEntityMap42.mapNameToValue;
        int int53 = hashEntityMap42.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap54 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map55 = hashEntityMap54.mapNameToValue;
        java.util.Map map56 = hashEntityMap54.mapValueToName;
        java.util.Map map57 = hashEntityMap54.mapNameToValue;
        hashEntityMap42.mapValueToName = map57;
        hashEntityMap27.mapNameToValue = map57;
        java.lang.String str61 = hashEntityMap27.name((-1));
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap62 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int64 = hashEntityMap62.value("hi!");
        java.lang.String str66 = hashEntityMap62.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap67 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map68 = hashEntityMap67.mapNameToValue;
        java.util.Map map69 = hashEntityMap67.mapValueToName;
        java.util.Map map70 = hashEntityMap67.mapNameToValue;
        hashEntityMap67.add("", (int) (byte) 10);
        int int75 = hashEntityMap67.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap76.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap80 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map81 = hashEntityMap80.mapNameToValue;
        hashEntityMap76.mapNameToValue = map81;
        hashEntityMap67.mapNameToValue = map81;
        java.lang.String str85 = hashEntityMap67.name((int) 'a');
        hashEntityMap67.add("", (int) (short) 1);
        java.util.Map map89 = hashEntityMap67.mapNameToValue;
        hashEntityMap62.mapNameToValue = map89;
        hashEntityMap27.mapValueToName = map89;
        hashEntityMap22.mapNameToValue = map89;
        hashEntityMap0.mapNameToValue = map89;
        java.lang.String str95 = hashEntityMap0.name(2);
        java.util.Map map96 = hashEntityMap0.mapValueToName;
        java.lang.String str98 = hashEntityMap0.name(100);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        java.lang.String str13 = hashEntityMap0.name(0);
        int int15 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        java.lang.String[] strArray3 = binaryEntityMap1.names;
        int[] intArray4 = binaryEntityMap1.values;
        java.lang.String str6 = binaryEntityMap1.name(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        binaryEntityMap0.size = (byte) 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        java.lang.String str6 = binaryEntityMap0.name((-1));
        int int7 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (byte) -1;
        binaryEntityMap0.size = 100;
        int int12 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        java.util.Map map20 = hashEntityMap0.mapValueToName;
        int int22 = hashEntityMap0.value("");
        java.lang.String str24 = hashEntityMap0.name((int) (byte) -1);
        java.lang.String str26 = hashEntityMap0.name((int) (byte) 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
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
        java.lang.String str27 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 98 + "'", int4 == 98);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        int int9 = primitiveEntityMap0.value("");
        primitiveEntityMap0.add("hi!", (int) '#');
        primitiveEntityMap0.add("hi!", 97);
        java.lang.String str17 = primitiveEntityMap0.name(10);
        int int19 = primitiveEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.ensureCapacity(1);
        binaryEntityMap0.growBy = 97;
        binaryEntityMap0.add("hi!", (int) (short) 100);
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        java.lang.String str14 = binaryEntityMap0.name(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        binaryEntityMap1.add("", 0);
        java.lang.String str51 = binaryEntityMap1.name(100);
        binaryEntityMap1.size = 97;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap55 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap55.ensureCapacity((int) 'a');
        arrayEntityMap55.ensureCapacity(0);
        arrayEntityMap55.add("hi!", 100);
        java.lang.String str64 = arrayEntityMap55.name((int) 'a');
        int[] intArray65 = arrayEntityMap55.values;
        binaryEntityMap1.values = intArray65;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = binaryEntityMap1.name((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(intArray65);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        java.util.Map map67 = hashEntityMap65.mapValueToName;
        java.util.Map map68 = hashEntityMap65.mapNameToValue;
        hashEntityMap65.add("", (int) (byte) 10);
        int int73 = hashEntityMap65.value("");
        java.lang.String str75 = hashEntityMap65.name((int) (byte) 10);
        java.lang.String str77 = hashEntityMap65.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap78 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int80 = hashEntityMap78.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap81 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map82 = hashEntityMap81.mapNameToValue;
        hashEntityMap78.mapNameToValue = map82;
        hashEntityMap65.mapNameToValue = map82;
        hashEntityMap0.mapValueToName = map82;
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
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        java.util.Map map21 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        java.util.Map map26 = hashEntityMap22.mapValueToName;
        java.util.Map map27 = hashEntityMap22.mapValueToName;
        hashEntityMap0.mapNameToValue = map27;
        java.util.Map map29 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        java.lang.String str10 = entities0.escape("");
        java.lang.String str12 = entities0.escape("hi!");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        binaryEntityMap1.growBy = 35;
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        int int10 = lookupEntityMap0.value("");
        int int12 = lookupEntityMap0.value("");
        java.lang.String str14 = lookupEntityMap0.name(52);
        java.lang.String str16 = lookupEntityMap0.name((int) ' ');
        java.lang.String str18 = lookupEntityMap0.name((int) (short) 1);
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
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("");
        int int3 = arrayEntityMap0.growBy;
        arrayEntityMap0.size = 97;
        arrayEntityMap0.size = 97;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int10 = arrayEntityMap9.growBy;
        int int11 = arrayEntityMap9.size;
        arrayEntityMap9.size = (short) -1;
        arrayEntityMap9.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap17 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int18 = arrayEntityMap17.growBy;
        java.lang.String[] strArray19 = arrayEntityMap17.names;
        int int21 = arrayEntityMap17.value("");
        int int22 = arrayEntityMap17.size;
        java.lang.String[] strArray23 = arrayEntityMap17.names;
        arrayEntityMap9.names = strArray23;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap25 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int27 = binaryEntityMap25.value("");
        java.lang.String str29 = binaryEntityMap25.name((int) (short) 0);
        int int30 = binaryEntityMap25.size;
        java.lang.String[] strArray31 = binaryEntityMap25.names;
        arrayEntityMap9.names = strArray31;
        arrayEntityMap0.names = strArray31;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        int int11 = binaryEntityMap0.value("");
        int int13 = binaryEntityMap0.value("hi!");
        int int15 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        binaryEntityMap0.growBy = 32;
        int int20 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        int int2 = binaryEntityMap1.size;
        int[] intArray3 = binaryEntityMap1.values;
        binaryEntityMap1.add("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap2 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int3 = binaryEntityMap2.growBy;
        binaryEntityMap2.add("", (int) (short) 100);
        binaryEntityMap2.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap10 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap10.ensureCapacity((int) 'a');
        arrayEntityMap10.ensureCapacity(0);
        arrayEntityMap10.add("hi!", 100);
        java.lang.String str19 = arrayEntityMap10.name((int) 'a');
        int int21 = arrayEntityMap10.value("");
        arrayEntityMap10.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap26.ensureCapacity((int) 'a');
        int int29 = arrayEntityMap26.growBy;
        java.lang.String[] strArray30 = arrayEntityMap26.names;
        arrayEntityMap10.names = strArray30;
        binaryEntityMap2.names = strArray30;
        binaryEntityMap2.growBy = ' ';
        java.lang.String[] strArray35 = binaryEntityMap2.names;
        arrayEntityMap1.names = strArray35;
        arrayEntityMap1.ensureCapacity((int) '#');
        arrayEntityMap1.ensureCapacity(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name(100);
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str15 = binaryEntityMap0.name(35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) '4');
        int int11 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", 35);
        java.lang.String str16 = hashEntityMap0.name(10);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        binaryEntityMap0.size = (byte) -1;
        int int9 = binaryEntityMap0.value("");
        int int11 = binaryEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        binaryEntityMap0.growBy = 2;
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        java.lang.String str8 = binaryEntityMap0.name(32);
        java.lang.String str10 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        java.lang.String str21 = lookupEntityMap0.name((int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("");
        int int6 = arrayEntityMap1.size;
        java.lang.String str8 = arrayEntityMap1.name(97);
        arrayEntityMap1.ensureCapacity(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
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
        java.lang.String str23 = arrayEntityMap1.name(98);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(52);
        lookupEntityMap0.add("", 0);
        int int9 = lookupEntityMap0.value("");
        java.lang.String str11 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("hi!");
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
// flaky "16) test2767(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
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
        binaryEntityMap0.add("hi!", 52);
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
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap12 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int14 = arrayEntityMap12.value("hi!");
        java.lang.String[] strArray15 = arrayEntityMap12.names;
        java.lang.String[] strArray16 = arrayEntityMap12.names;
        arrayEntityMap1.names = strArray16;
        int int18 = arrayEntityMap1.growBy;
        java.lang.String str20 = arrayEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int6 = binaryEntityMap0.value("");
        int int7 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = (byte) 100;
        java.lang.String str11 = binaryEntityMap0.name(32);
        java.lang.String str13 = binaryEntityMap0.name((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int int12 = arrayEntityMap1.value("");
        int[] intArray13 = arrayEntityMap1.values;
        int int14 = arrayEntityMap1.size;
        int int15 = arrayEntityMap1.growBy;
        arrayEntityMap1.ensureCapacity(100);
        int int18 = arrayEntityMap1.size;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        java.lang.String[] strArray31 = binaryEntityMap0.names;
        java.lang.String str33 = binaryEntityMap0.name((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        int int3 = arrayEntityMap1.value("");
        java.lang.String str5 = arrayEntityMap1.name(98);
        arrayEntityMap1.add("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        java.lang.String str19 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (byte) 100;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name(0);
        java.lang.String[] strArray7 = binaryEntityMap0.names;
        java.lang.String str9 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 10);
        java.lang.String str3 = binaryEntityMap1.name((int) (short) -1);
        binaryEntityMap1.add("", 35);
        binaryEntityMap1.size = 10;
        binaryEntityMap1.ensureCapacity((int) (byte) 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int11 = binaryEntityMap0.value("hi!");
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 1);
        binaryEntityMap0.size = 'a';
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.unescape("hi!");
        java.lang.String str4 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer6, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.ensureCapacity(2);
        binaryEntityMap0.add("hi!", (int) (byte) 10);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.size = (byte) 10;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap6 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap6.growBy = (short) 10;
        java.lang.String[] strArray9 = binaryEntityMap6.names;
        int int11 = binaryEntityMap6.value("");
        binaryEntityMap6.growBy = (short) 1;
        java.lang.String str15 = binaryEntityMap6.name((int) '4');
        int int17 = binaryEntityMap6.value("");
        int int19 = binaryEntityMap6.value("hi!");
        binaryEntityMap6.add("", 101);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap23 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap23.growBy = (short) 10;
        java.lang.String[] strArray26 = binaryEntityMap23.names;
        binaryEntityMap23.add("", (int) (short) 100);
        java.lang.String str31 = binaryEntityMap23.name((int) (byte) 1);
        binaryEntityMap23.ensureCapacity((int) '#');
        java.lang.String[] strArray34 = binaryEntityMap23.names;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap35 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int36 = binaryEntityMap35.growBy;
        binaryEntityMap35.add("", (int) (short) 100);
        binaryEntityMap35.size = (byte) 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap43.ensureCapacity((int) 'a');
        arrayEntityMap43.ensureCapacity(0);
        arrayEntityMap43.add("hi!", 100);
        java.lang.String str52 = arrayEntityMap43.name((int) 'a');
        int int54 = arrayEntityMap43.value("");
        arrayEntityMap43.add("hi!", (int) (byte) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap59 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap59.ensureCapacity((int) 'a');
        int int62 = arrayEntityMap59.growBy;
        java.lang.String[] strArray63 = arrayEntityMap59.names;
        arrayEntityMap43.names = strArray63;
        binaryEntityMap35.names = strArray63;
        java.lang.String[] strArray66 = binaryEntityMap35.names;
        binaryEntityMap23.names = strArray66;
        binaryEntityMap6.names = strArray66;
        binaryEntityMap0.names = strArray66;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map18 = hashEntityMap17.mapNameToValue;
        java.util.Map map19 = hashEntityMap17.mapValueToName;
        int int21 = hashEntityMap17.value("");
        java.util.Map map22 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int25 = hashEntityMap23.value("hi!");
        java.util.Map map26 = hashEntityMap23.mapValueToName;
        int int28 = hashEntityMap23.value("");
        java.util.Map map29 = hashEntityMap23.mapNameToValue;
        hashEntityMap17.mapNameToValue = map29;
        hashEntityMap17.add("hi!", 0);
        java.util.Map map34 = hashEntityMap17.mapValueToName;
        java.util.Map map35 = hashEntityMap17.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int38 = hashEntityMap36.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map40 = hashEntityMap39.mapNameToValue;
        hashEntityMap36.mapNameToValue = map40;
        java.util.Map map42 = hashEntityMap36.mapValueToName;
        hashEntityMap17.mapValueToName = map42;
        hashEntityMap0.mapNameToValue = map42;
        java.lang.String str46 = hashEntityMap0.name(101);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(0);
        int int3 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = '4';
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap7.ensureCapacity((int) 'a');
        int int10 = arrayEntityMap7.growBy;
        java.lang.String[] strArray11 = arrayEntityMap7.names;
        int[] intArray12 = arrayEntityMap7.values;
        arrayEntityMap1.values = intArray12;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
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
        java.util.Map map16 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        int int16 = binaryEntityMap0.growBy;
        java.lang.String[] strArray17 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        entities0.addEntity("", 32);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.add("", 32);
        java.lang.String str9 = binaryEntityMap0.name(3);
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap(2);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        binaryEntityMap14.add("", 97);
        binaryEntityMap14.size = (byte) -1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap22 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray23 = new int[] {};
        binaryEntityMap22.values = intArray23;
        int int26 = binaryEntityMap22.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        arrayEntityMap27.names = strArray31;
        binaryEntityMap22.names = strArray31;
        int int35 = binaryEntityMap22.value("hi!");
        java.lang.String str37 = binaryEntityMap22.name(0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap39 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str41 = arrayEntityMap39.name((int) (short) 100);
        int[] intArray44 = new int[] { (short) 0, (-1) };
        arrayEntityMap39.values = intArray44;
        binaryEntityMap22.values = intArray44;
        binaryEntityMap14.values = intArray44;
        arrayEntityMap13.values = intArray44;
        binaryEntityMap0.values = intArray44;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] {});
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 0, (-1) });
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap1.size = (byte) -1;
        java.lang.String[] strArray4 = arrayEntityMap1.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap6.ensureCapacity((int) 'a');
        int int9 = arrayEntityMap6.growBy;
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap6.names = strArray14;
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
        java.lang.String[] strArray28 = binaryEntityMap16.names;
        arrayEntityMap6.names = strArray28;
        java.lang.String str31 = arrayEntityMap6.name((int) 'a');
        int[] intArray32 = arrayEntityMap6.values;
        int[] intArray33 = arrayEntityMap6.values;
        arrayEntityMap1.values = intArray33;
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { null, null, null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
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
        java.lang.String str30 = hashEntityMap0.name(0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        int int6 = lookupEntityMap0.value("hi!");
        int int8 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
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
        java.lang.String str22 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        java.lang.String str5 = entities0.unescape("hi!");
        java.lang.String str7 = entities0.escape("");
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
        java.lang.String str26 = hashEntityMap8.name((int) 'a');
        hashEntityMap8.add("", 2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap30.add("", (int) (byte) -1);
        java.util.Map map34 = hashEntityMap30.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map36 = hashEntityMap35.mapNameToValue;
        java.util.Map map37 = hashEntityMap35.mapValueToName;
        java.util.Map map38 = hashEntityMap35.mapNameToValue;
        hashEntityMap35.add("", (int) (byte) 10);
        int int43 = hashEntityMap35.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap44 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap44.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap48 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map49 = hashEntityMap48.mapNameToValue;
        hashEntityMap44.mapNameToValue = map49;
        hashEntityMap35.mapNameToValue = map49;
        hashEntityMap30.mapValueToName = map49;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        java.util.Map map55 = hashEntityMap53.mapValueToName;
        java.util.Map map56 = hashEntityMap53.mapNameToValue;
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap57 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map58 = treeEntityMap57.mapNameToValue;
        hashEntityMap53.mapValueToName = map58;
        java.util.Map map60 = hashEntityMap53.mapValueToName;
        hashEntityMap30.mapValueToName = map60;
        hashEntityMap8.mapValueToName = map60;
        entities0.map = hashEntityMap8;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map60);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        java.lang.String str6 = binaryEntityMap0.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        binaryEntityMap7.add("", (int) (byte) 0);
        binaryEntityMap7.growBy = 0;
        binaryEntityMap7.add("hi!", 2);
        binaryEntityMap7.size = (byte) 1;
        int[] intArray20 = binaryEntityMap7.values;
        int int21 = binaryEntityMap7.size;
        binaryEntityMap7.growBy = (short) 10;
        int[] intArray24 = binaryEntityMap7.values;
        binaryEntityMap0.values = intArray24;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str30 = binaryEntityMap0.name(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        entities0.addEntity("", (int) ' ');
        java.lang.String str10 = entities0.unescape("");
        entities0.addEntity("hi!", 32);
        org.apache.commons.lang.Entities entities14 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer15 = null;
        entities14.escape(writer15, "");
        java.lang.String[][] strArray18 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities14.addEntities(strArray18);
        entities0.addEntities(strArray18);
        java.lang.String[][] strArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.addEntities(strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(entities14);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        hashEntityMap11.add("", (int) (short) 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap32.mapNameToValue = map38;
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        hashEntityMap32.add("", (int) (byte) 1);
        hashEntityMap32.add("", 0);
        java.util.Map map48 = hashEntityMap32.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap49 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap49.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap53 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map54 = hashEntityMap53.mapNameToValue;
        hashEntityMap49.mapNameToValue = map54;
        int int57 = hashEntityMap49.value("");
        java.util.Map map58 = hashEntityMap49.mapNameToValue;
        hashEntityMap32.mapNameToValue = map58;
        hashEntityMap11.mapValueToName = map58;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        int int69 = hashEntityMap61.value("");
        java.util.Map map70 = hashEntityMap61.mapNameToValue;
        hashEntityMap11.mapNameToValue = map70;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(map70);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap60 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        hashEntityMap60.mapNameToValue = map66;
        java.util.Map map69 = hashEntityMap60.mapNameToValue;
        int int71 = hashEntityMap60.value("hi!");
        hashEntityMap60.add("", (int) (byte) 0);
        java.lang.String str76 = hashEntityMap60.name((int) (short) 0);
        java.lang.String str78 = hashEntityMap60.name((int) (byte) 0);
        int int80 = hashEntityMap60.value("hi!");
        hashEntityMap60.add("", (int) '4');
        java.util.Map map84 = hashEntityMap60.mapValueToName;
        java.util.Map map85 = hashEntityMap60.mapNameToValue;
        hashEntityMap0.mapValueToName = map85;
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
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        int int2 = lookupEntityMap0.value("");
        lookupEntityMap0.add("", (int) (short) 100);
        lookupEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
        java.lang.String str10 = arrayEntityMap7.name((int) (byte) 100);
        java.lang.String[] strArray11 = arrayEntityMap7.names;
        int int12 = arrayEntityMap7.growBy;
        java.lang.String str14 = arrayEntityMap7.name(98);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.add("hi!", 2);
        int int13 = binaryEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        int int4 = hashEntityMap0.value("");
        int int6 = hashEntityMap0.value("hi!");
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        int int9 = hashEntityMap0.value("hi!");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap10 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap10.add("", (int) (byte) -1);
        java.util.Map map14 = hashEntityMap10.mapNameToValue;
        hashEntityMap10.add("", 10);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        java.util.Map map20 = hashEntityMap18.mapValueToName;
        hashEntityMap10.mapNameToValue = map20;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        java.util.Map map24 = hashEntityMap22.mapValueToName;
        java.util.Map map25 = hashEntityMap22.mapNameToValue;
        hashEntityMap22.add("", (int) (byte) 10);
        int int30 = hashEntityMap22.value("");
        java.lang.String str32 = hashEntityMap22.name((int) (byte) 10);
        java.lang.String str34 = hashEntityMap22.name((int) (short) 0);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap35 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int37 = hashEntityMap35.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap38 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map39 = hashEntityMap38.mapNameToValue;
        hashEntityMap35.mapNameToValue = map39;
        hashEntityMap22.mapNameToValue = map39;
        java.util.Map map42 = hashEntityMap22.mapValueToName;
        hashEntityMap10.mapValueToName = map42;
        hashEntityMap0.mapNameToValue = map42;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap27 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap28 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap28.growBy = (short) 10;
        java.lang.String[] strArray31 = binaryEntityMap28.names;
        arrayEntityMap27.names = strArray31;
        int[] intArray33 = arrayEntityMap27.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap35 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap35.ensureCapacity((int) 'a');
        arrayEntityMap35.ensureCapacity(0);
        java.lang.String[] strArray40 = arrayEntityMap35.names;
        arrayEntityMap27.names = strArray40;
        org.apache.commons.lang.Entities entities42 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer43 = null;
        entities42.escape(writer43, "");
        int int47 = entities42.entityValue("");
        java.lang.String str49 = entities42.entityName((int) 'a');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap50 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap51 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap51.growBy = (short) 10;
        java.lang.String[] strArray54 = binaryEntityMap51.names;
        arrayEntityMap50.names = strArray54;
        int[] intArray56 = arrayEntityMap50.values;
        entities42.map = arrayEntityMap50;
        arrayEntityMap50.growBy = (short) 10;
        java.lang.String str61 = arrayEntityMap50.name(10);
        int[] intArray62 = arrayEntityMap50.values;
        arrayEntityMap27.values = intArray62;
        binaryEntityMap0.values = intArray62;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap66 = new org.apache.commons.lang.Entities.ArrayEntityMap(52);
        int int67 = arrayEntityMap66.size;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap69 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 100);
        java.lang.String[] strArray70 = arrayEntityMap69.names;
        arrayEntityMap66.names = strArray70;
        binaryEntityMap0.names = strArray70;
        binaryEntityMap0.add("", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(entities42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        java.util.Map map5 = hashEntityMap0.mapValueToName;
        int int7 = hashEntityMap0.value("hi!");
        java.util.Map map8 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap9 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map10 = hashEntityMap9.mapNameToValue;
        java.util.Map map11 = hashEntityMap9.mapValueToName;
        java.util.Map map12 = hashEntityMap9.mapNameToValue;
        java.util.Map map13 = hashEntityMap9.mapValueToName;
        java.lang.String str15 = hashEntityMap9.name((int) '4');
        hashEntityMap9.add("hi!", (int) (byte) 100);
        java.util.Map map19 = hashEntityMap9.mapNameToValue;
        hashEntityMap0.mapNameToValue = map19;
        int int22 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name(97);
        primitiveEntityMap0.add("hi!", 0);
        primitiveEntityMap0.add("", (int) (byte) -1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        int int28 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (short) 1);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", 0);
        int int15 = binaryEntityMap0.value("");
        java.lang.String str17 = binaryEntityMap0.name((-1));
        binaryEntityMap0.ensureCapacity(2);
        java.lang.String str21 = binaryEntityMap0.name((int) (short) 10);
        java.lang.String str23 = binaryEntityMap0.name((int) ' ');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.entityName(100);
        org.apache.commons.lang.Entities.EntityMap entityMap3 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(entityMap3);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap17.growBy = (short) 10;
        java.lang.String[] strArray20 = binaryEntityMap17.names;
        int int22 = binaryEntityMap17.value("");
        binaryEntityMap17.growBy = (short) 1;
        binaryEntityMap17.size = 100;
        binaryEntityMap17.add("", 100);
        java.lang.String[] strArray30 = binaryEntityMap17.names;
        java.lang.String[] strArray31 = binaryEntityMap17.names;
        arrayEntityMap1.names = strArray31;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, (-1) });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
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
        java.util.Map map23 = hashEntityMap0.mapNameToValue;
        int int25 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        binaryEntityMap0.ensureCapacity((int) '#');
        java.lang.String[] strArray11 = binaryEntityMap0.names;
        int int12 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap23 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map24 = hashEntityMap23.mapNameToValue;
        java.util.Map map25 = hashEntityMap23.mapValueToName;
        java.util.Map map26 = hashEntityMap23.mapNameToValue;
        hashEntityMap23.add("", (int) (byte) 10);
        int int31 = hashEntityMap23.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap32.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap36 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map37 = hashEntityMap36.mapNameToValue;
        hashEntityMap32.mapNameToValue = map37;
        hashEntityMap23.mapNameToValue = map37;
        java.lang.String str41 = hashEntityMap23.name((int) 'a');
        hashEntityMap23.add("", 2);
        int int46 = hashEntityMap23.value("hi!");
        java.util.Map map47 = hashEntityMap23.mapValueToName;
        java.util.Map map48 = hashEntityMap23.mapNameToValue;
        hashEntityMap0.mapNameToValue = map48;
        java.util.Map map50 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name((int) (byte) 0);
        java.lang.String str10 = lookupEntityMap0.name(100);
        int int12 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        binaryEntityMap0.size = 0;
        java.lang.String str25 = binaryEntityMap0.name(1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
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
        java.lang.String str53 = entities0.escape("hi!");
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        java.lang.Class<?> wildcardClass36 = hashEntityMap0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) ' ');
        int int11 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        primitiveEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 10);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 100);
        int int7 = binaryEntityMap0.growBy;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        hashEntityMap0.add("hi!", (int) '4');
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
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
            entities0.unescape(writer14, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        int[] intArray20 = binaryEntityMap1.values;
        java.lang.String str22 = binaryEntityMap1.name(100);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.escape("");
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("hi!");
        entities0.addEntity("hi!", 3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer15, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        hashEntityMap0.add("hi!", (int) 'a');
        int int11 = hashEntityMap0.value("");
        java.util.Map map12 = hashEntityMap0.mapValueToName;
        java.util.Map map13 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap15 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap15.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap19 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map20 = hashEntityMap19.mapNameToValue;
        hashEntityMap15.mapNameToValue = map20;
        hashEntityMap14.mapNameToValue = map20;
        java.util.Map map23 = hashEntityMap14.mapNameToValue;
        hashEntityMap14.add("hi!", 1);
        java.util.Map map27 = hashEntityMap14.mapValueToName;
        hashEntityMap0.mapNameToValue = map27;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name(97);
        binaryEntityMap0.ensureCapacity((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        entities0.addEntity("", 10);
        org.apache.commons.lang.Entities.EntityMap entityMap14 = entities0.map;
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(entityMap14);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        int int19 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        java.lang.String str8 = binaryEntityMap0.name(32);
        int int9 = binaryEntityMap0.size;
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        java.util.Map map4 = hashEntityMap0.mapValueToName;
        int int6 = hashEntityMap0.value("");
        int int8 = hashEntityMap0.value("");
        java.util.Map map9 = hashEntityMap0.mapValueToName;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", (-1));
        int int9 = lookupEntityMap0.value("hi!");
        java.lang.String str11 = lookupEntityMap0.name((int) '#');
        java.lang.String str13 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("", 52);
        lookupEntityMap0.add("", 52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(10);
        lookupEntityMap0.add("", 2);
        lookupEntityMap0.add("", 2);
        java.lang.String str18 = lookupEntityMap0.name(3);
        java.lang.String str20 = lookupEntityMap0.name(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "17) test2829(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky "3) test2829(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(entityMap28);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        org.apache.commons.lang.Entities.EntityMap entityMap25 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int27 = binaryEntityMap26.growBy;
        binaryEntityMap26.add("", (int) ' ');
        java.lang.String str32 = binaryEntityMap26.name((int) ' ');
        int int34 = binaryEntityMap26.value("hi!");
        int int35 = binaryEntityMap26.growBy;
        entities0.map = binaryEntityMap26;
        java.lang.String str38 = entities0.entityName(10);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "18) test2830(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
// flaky "4) test2830(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "1) test2830(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(entityMap25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
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
        java.util.Map map33 = hashEntityMap6.mapValueToName;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = 0;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap15.ensureCapacity((int) 'a');
        arrayEntityMap15.growBy = (byte) 100;
        arrayEntityMap15.ensureCapacity(10);
        java.lang.String str23 = arrayEntityMap15.name((int) (byte) 1);
        int[] intArray24 = arrayEntityMap15.values;
        binaryEntityMap0.values = intArray24;
        binaryEntityMap0.add("", (int) '#');
        java.lang.String str30 = binaryEntityMap0.name(0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        java.lang.String str26 = entities0.escape("hi!");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
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
        java.lang.String str16 = hashEntityMap0.name((int) ' ');
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", 0);
        int int15 = binaryEntityMap0.value("");
        binaryEntityMap0.size = (-1);
        java.lang.String str19 = binaryEntityMap0.name(101);
        int int20 = binaryEntityMap0.size;
        binaryEntityMap0.growBy = 0;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) -1);
        java.lang.String str9 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str11 = binaryEntityMap0.name((int) (byte) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String str15 = arrayEntityMap13.name((int) (short) 100);
        int[] intArray18 = new int[] { (short) 0, (-1) };
        arrayEntityMap13.values = intArray18;
        int int20 = arrayEntityMap13.growBy;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str23 = binaryEntityMap21.name((int) (byte) 0);
        int int25 = binaryEntityMap21.value("");
        binaryEntityMap21.growBy = 10;
        java.lang.String str29 = binaryEntityMap21.name((int) (byte) 10);
        java.lang.String[] strArray30 = binaryEntityMap21.names;
        arrayEntityMap13.names = strArray30;
        arrayEntityMap13.ensureCapacity((int) '4');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.add("", (int) (short) 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap39.growBy = (short) 10;
        java.lang.String[] strArray42 = binaryEntityMap39.names;
        arrayEntityMap38.names = strArray42;
        int[] intArray44 = arrayEntityMap38.values;
        binaryEntityMap34.values = intArray44;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap46 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap46.growBy = (short) 10;
        java.lang.String[] strArray49 = binaryEntityMap46.names;
        int int51 = binaryEntityMap46.value("");
        binaryEntityMap46.growBy = (short) 1;
        binaryEntityMap46.size = 100;
        binaryEntityMap46.add("", 100);
        java.lang.String[] strArray59 = binaryEntityMap46.names;
        binaryEntityMap34.names = strArray59;
        arrayEntityMap13.names = strArray59;
        binaryEntityMap0.names = strArray59;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0, (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
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
        int[] intArray19 = binaryEntityMap0.values;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertNotNull(intArray19);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        binaryEntityMap0.ensureCapacity((int) (short) 100);
        binaryEntityMap0.add("", (-1));
        int int36 = binaryEntityMap0.value("");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) 'a');
        java.lang.String str10 = lookupEntityMap0.name(1);
        java.lang.String str12 = lookupEntityMap0.name(101);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap3 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap4.growBy = (short) 10;
        java.lang.String[] strArray7 = binaryEntityMap4.names;
        arrayEntityMap3.names = strArray7;
        int[] intArray9 = arrayEntityMap3.values;
        arrayEntityMap0.values = intArray9;
        int int12 = arrayEntityMap0.value("");
        int int13 = arrayEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 100);
        int int3 = binaryEntityMap1.value("");
        int int4 = binaryEntityMap1.size;
        int int6 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        java.io.Writer writer10 = null;
        entities0.escape(writer10, "");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap22 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str24 = lookupEntityMap22.name(97);
        java.lang.String str26 = lookupEntityMap22.name((int) '#');
        int int28 = lookupEntityMap22.value("");
        int int30 = lookupEntityMap22.value("");
        entities0.map = lookupEntityMap22;
        lookupEntityMap22.add("", 35);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML40;
        java.lang.String str2 = entities0.entityName((int) (short) 0);
        java.lang.String str4 = entities0.unescape("");
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str12 = entities0.entityName(2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 10);
        arrayEntityMap1.growBy = 97;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap4 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str6 = binaryEntityMap4.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap7.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        binaryEntityMap7.names = strArray17;
        binaryEntityMap4.names = strArray17;
        arrayEntityMap1.names = strArray17;
        int int21 = arrayEntityMap1.growBy;
        int int23 = arrayEntityMap1.value("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        java.lang.String str30 = hashEntityMap0.name(101);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap31 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int33 = hashEntityMap31.value("hi!");
        java.lang.String str35 = hashEntityMap31.name((int) (short) 0);
        java.util.Map map36 = hashEntityMap31.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap39 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap39.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap43 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map44 = hashEntityMap43.mapNameToValue;
        hashEntityMap39.mapNameToValue = map44;
        int int47 = hashEntityMap39.value("");
        java.util.Map map48 = hashEntityMap39.mapNameToValue;
        hashEntityMap37.mapNameToValue = map48;
        java.util.Map map50 = hashEntityMap37.mapValueToName;
        hashEntityMap31.mapNameToValue = map50;
        java.util.Map map52 = hashEntityMap31.mapValueToName;
        java.lang.String str54 = hashEntityMap31.name(1);
        java.util.Map map55 = hashEntityMap31.mapValueToName;
        hashEntityMap0.mapNameToValue = map55;
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name(100);
        int int10 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", 2);
        java.lang.String str15 = lookupEntityMap0.name(97);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        java.util.Map map7 = hashEntityMap0.mapValueToName;
        java.lang.String str9 = hashEntityMap0.name(35);
        hashEntityMap0.add("", (int) '4');
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        int int3 = hashEntityMap0.value("");
        hashEntityMap0.add("hi!", (int) (byte) 1);
        int int8 = hashEntityMap0.value("hi!");
        int int10 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (short) -1);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        java.lang.String str16 = hashEntityMap0.name(2);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
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
        int int22 = entities0.entityValue("hi!");
        int int24 = entities0.entityValue("");
        java.lang.String str26 = entities0.entityName((int) (byte) -1);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
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
        java.lang.String str29 = entities0.entityName((int) (byte) 0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name(0);
        java.lang.String str12 = lookupEntityMap0.name((int) '4');
        lookupEntityMap0.add("", (int) (byte) 10);
        int int17 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities30.map;
        java.lang.String str33 = entities30.escape("hi!");
        java.lang.String str35 = entities30.unescape("hi!");
        java.lang.String[][] strArray36 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities30.addEntities(strArray36);
        entities0.addEntities(strArray36);
        int int40 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 100);
        java.lang.String str8 = lookupEntityMap0.name((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = lookupEntityMap0.name((-1));
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
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap4 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities0.map = primitiveEntityMap4;
        java.lang.String str7 = entities0.entityName((int) (short) -1);
        org.apache.commons.lang.Entities.EntityMap entityMap8 = entities0.map;
        int int10 = entities0.entityValue("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str13 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entityMap8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", 32);
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
        org.junit.Assert.assertNotNull(entityMap4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        java.io.Writer writer28 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer28, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
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
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(1);
        int int3 = arrayEntityMap1.value("hi!");
        int int4 = arrayEntityMap1.size;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", 98);
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
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        hashEntityMap30.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        hashEntityMap30.mapNameToValue = map35;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap30.mapValueToName = map38;
        java.util.Map map40 = hashEntityMap30.mapValueToName;
        int int42 = hashEntityMap30.value("hi!");
        java.lang.String str44 = hashEntityMap30.name((int) '#');
        java.util.Map map45 = hashEntityMap30.mapNameToValue;
        hashEntityMap0.mapNameToValue = map45;
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        java.lang.String str79 = hashEntityMap0.name(10);
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
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 0);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        java.lang.String str5 = binaryEntityMap1.name(32);
        java.lang.String str7 = binaryEntityMap1.name(97);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap9 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap9.ensureCapacity((int) 'a');
        arrayEntityMap9.ensureCapacity(0);
        arrayEntityMap9.add("hi!", 100);
        java.lang.String str18 = arrayEntityMap9.name((int) 'a');
        int int20 = arrayEntityMap9.value("");
        int[] intArray21 = arrayEntityMap9.values;
        int int22 = arrayEntityMap9.size;
        int int23 = arrayEntityMap9.growBy;
        arrayEntityMap9.ensureCapacity(100);
        int int26 = arrayEntityMap9.growBy;
        java.lang.String[] strArray27 = arrayEntityMap9.names;
        binaryEntityMap1.names = strArray27;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
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
        int int51 = hashEntityMap0.value("");
        java.lang.String str53 = hashEntityMap0.name((int) (short) 1);
        int int55 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 10);
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 100);
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.ensureCapacity((int) (byte) -1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(intArray7);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int[] intArray4 = binaryEntityMap0.values;
        java.lang.String str6 = binaryEntityMap0.name(52);
        int int7 = binaryEntityMap0.size;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) ' ');
        int int11 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        java.lang.String str16 = primitiveEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        int int16 = binaryEntityMap0.size;
        binaryEntityMap0.add("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.entityName(1);
        entities0.addEntity("hi!", (int) '4');
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "19) test2868(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "5) test2868(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
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
        hashEntityMap0.add("hi!", 100);
        int int17 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int2 = hashEntityMap0.value("hi!");
        java.lang.String str4 = hashEntityMap0.name((int) (short) 0);
        java.util.Map map5 = hashEntityMap0.mapNameToValue;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
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
        binaryEntityMap0.add("", 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String str7 = binaryEntityMap0.name(2);
        int int9 = binaryEntityMap0.value("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap10.growBy = (short) 10;
        java.lang.String[] strArray13 = binaryEntityMap10.names;
        binaryEntityMap10.add("", (int) (short) 100);
        java.lang.String str18 = binaryEntityMap10.name((int) (byte) 1);
        int int20 = binaryEntityMap10.value("hi!");
        java.lang.String[] strArray21 = binaryEntityMap10.names;
        binaryEntityMap0.names = strArray21;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap24 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap24.ensureCapacity((int) 'a');
        arrayEntityMap24.ensureCapacity(0);
        arrayEntityMap24.add("hi!", 100);
        java.lang.String str33 = arrayEntityMap24.name((int) 'a');
        int int35 = arrayEntityMap24.value("");
        int[] intArray36 = arrayEntityMap24.values;
        arrayEntityMap24.ensureCapacity((int) (byte) 0);
        int int40 = arrayEntityMap24.value("");
        int[] intArray41 = arrayEntityMap24.values;
        binaryEntityMap0.values = intArray41;
        binaryEntityMap0.growBy = (byte) 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        java.lang.String str2 = primitiveEntityMap0.name((int) (byte) 0);
        primitiveEntityMap0.add("hi!", (int) (byte) 1);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) ' ');
        int int11 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", 0);
        java.lang.String str16 = primitiveEntityMap0.name(98);
        primitiveEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        java.lang.String str10 = lookupEntityMap0.name((int) (short) 10);
        int int12 = lookupEntityMap0.value("");
        int int14 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        java.lang.String str5 = hashEntityMap0.name(35);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap28 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap28.ensureCapacity((int) 'a');
        int int31 = arrayEntityMap28.growBy;
        java.lang.String[] strArray32 = arrayEntityMap28.names;
        int int34 = arrayEntityMap28.value("hi!");
        int int35 = arrayEntityMap28.size;
        int int37 = arrayEntityMap28.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap38 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int40 = arrayEntityMap38.value("");
        arrayEntityMap38.ensureCapacity((int) (byte) 100);
        java.lang.String[] strArray43 = arrayEntityMap38.names;
        arrayEntityMap28.names = strArray43;
        binaryEntityMap0.names = strArray43;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", (int) (byte) 10);
        java.util.Map map14 = hashEntityMap0.mapNameToValue;
        java.util.Map map15 = hashEntityMap0.mapNameToValue;
        java.lang.String str17 = hashEntityMap0.name(97);
        int int19 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
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
        int int26 = arrayEntityMap1.size;
        arrayEntityMap1.ensureCapacity((int) 'a');
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        int int40 = hashEntityMap0.value("hi!");
        java.util.Map map41 = hashEntityMap0.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap42 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map43 = hashEntityMap42.mapNameToValue;
        java.util.Map map44 = hashEntityMap42.mapValueToName;
        java.util.Map map45 = hashEntityMap42.mapNameToValue;
        java.util.Map map46 = hashEntityMap42.mapValueToName;
        java.lang.String str48 = hashEntityMap42.name((int) '4');
        hashEntityMap42.add("hi!", (int) (byte) 100);
        java.util.Map map52 = hashEntityMap42.mapNameToValue;
        hashEntityMap0.mapValueToName = map52;
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        java.util.Map map37 = hashEntityMap0.mapNameToValue;
        int int39 = hashEntityMap0.value("hi!");
        hashEntityMap0.add("", (int) (byte) 100);
        java.lang.String str44 = hashEntityMap0.name((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        org.apache.commons.lang.Entities.EntityMap entityMap6 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap7 = null;
        entities0.map = entityMap7;
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap6);
        org.junit.Assert.assertNull(entityMap9);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        java.lang.String str72 = hashEntityMap0.name(32);
        java.lang.String str74 = hashEntityMap0.name(101);
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
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap61 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap61.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map66 = hashEntityMap65.mapNameToValue;
        hashEntityMap61.mapNameToValue = map66;
        hashEntityMap61.add("hi!", (int) '4');
        int int72 = hashEntityMap61.value("");
        java.util.Map map73 = hashEntityMap61.mapNameToValue;
        java.util.Map map74 = hashEntityMap61.mapNameToValue;
        hashEntityMap0.mapValueToName = map74;
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
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        int int7 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 10);
        java.lang.String str12 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.util.Map map10 = hashEntityMap0.mapValueToName;
        java.util.Map map11 = hashEntityMap0.mapNameToValue;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap12 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap12.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap16 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map17 = hashEntityMap16.mapNameToValue;
        hashEntityMap12.mapNameToValue = map17;
        java.util.Map map19 = hashEntityMap12.mapValueToName;
        hashEntityMap0.mapNameToValue = map19;
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        binaryEntityMap0.add("hi!", 35);
        java.lang.String str24 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) (short) 0);
        int int28 = binaryEntityMap0.size;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.io.Writer writer3 = null;
        entities0.escape(writer3, "");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap7 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap7;
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        binaryEntityMap0.add("", 10);
        binaryEntityMap0.ensureCapacity(0);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("hi!", 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int17 = binaryEntityMap15.value("hi!");
        int[] intArray18 = binaryEntityMap15.values;
        binaryEntityMap0.values = intArray18;
        int int20 = binaryEntityMap0.growBy;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap8 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap8.ensureCapacity((int) 'a');
        arrayEntityMap8.ensureCapacity(0);
        java.lang.String[] strArray13 = arrayEntityMap8.names;
        binaryEntityMap0.names = strArray13;
        java.lang.String str16 = binaryEntityMap0.name((int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap17 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str19 = binaryEntityMap17.name((int) (byte) 0);
        java.lang.String str21 = binaryEntityMap17.name((int) '#');
        binaryEntityMap17.growBy = (byte) 10;
        binaryEntityMap17.growBy = 1;
        binaryEntityMap17.ensureCapacity((int) (byte) 0);
        binaryEntityMap17.add("", (int) (byte) 100);
        java.lang.String[] strArray31 = binaryEntityMap17.names;
        binaryEntityMap0.names = strArray31;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray31);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.add("", 0);
        binaryEntityMap0.add("hi!", 10);
        binaryEntityMap0.add("hi!", (int) (byte) -1);
        java.lang.String[] strArray19 = binaryEntityMap0.names;
        java.lang.String str21 = binaryEntityMap0.name((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        int int6 = entities0.entityValue("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str9 = binaryEntityMap7.name((int) (byte) 0);
        int int11 = binaryEntityMap7.value("hi!");
        binaryEntityMap7.ensureCapacity(52);
        int int15 = binaryEntityMap7.value("hi!");
        entities0.map = binaryEntityMap7;
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap17 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str19 = lookupEntityMap17.name((int) (short) 0);
        java.lang.String str21 = lookupEntityMap17.name((int) (short) 1);
        java.lang.String str23 = lookupEntityMap17.name((int) (byte) 100);
        java.lang.String str25 = lookupEntityMap17.name(97);
        entities0.map = lookupEntityMap17;
        java.io.Writer writer27 = null;
        entities0.escape(writer27, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities entities31 = org.apache.commons.lang.Entities.HTML40;
        org.apache.commons.lang.Entities.EntityMap entityMap32 = entities31.map;
        int int34 = entities31.entityValue("hi!");
        org.apache.commons.lang.Entities entities35 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap36 = entities35.map;
        java.lang.String str38 = entities35.escape("hi!");
        java.lang.String str40 = entities35.unescape("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap42 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap42.ensureCapacity((int) 'a');
        arrayEntityMap42.ensureCapacity(0);
        arrayEntityMap42.add("hi!", 100);
        java.lang.String str51 = arrayEntityMap42.name((int) 'a');
        int int53 = arrayEntityMap42.value("");
        int[] intArray54 = arrayEntityMap42.values;
        int int55 = arrayEntityMap42.size;
        entities35.map = arrayEntityMap42;
        java.io.Writer writer57 = null;
        entities35.escape(writer57, "");
        org.apache.commons.lang.Entities.EntityMap entityMap60 = entities35.map;
        entities35.addEntity("", (int) (short) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap65 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap65.ensureCapacity((int) 'a');
        arrayEntityMap65.growBy = (byte) 100;
        arrayEntityMap65.ensureCapacity(10);
        java.lang.String str73 = arrayEntityMap65.name((int) (byte) 1);
        arrayEntityMap65.size = 0;
        int int77 = arrayEntityMap65.value("hi!");
        entities35.map = arrayEntityMap65;
        org.apache.commons.lang.Entities entities79 = org.apache.commons.lang.Entities.HTML32;
        entities79.addEntity("hi!", 0);
        java.lang.String[][] strArray83 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities79.addEntities(strArray83);
        entities35.addEntities(strArray83);
        entities31.addEntities(strArray83);
        entities0.addEntities(strArray83);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(entities31);
        org.junit.Assert.assertNotNull(entityMap32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(entities35);
        org.junit.Assert.assertNotNull(entityMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(entityMap60);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(entities79);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
        arrayEntityMap1.add("", 1);
        arrayEntityMap1.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 1, (-1) });
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int3 = binaryEntityMap0.size;
        int int5 = binaryEntityMap0.value("hi!");
        int int6 = binaryEntityMap0.size;
        java.lang.String str8 = binaryEntityMap0.name(2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        java.lang.String str4 = binaryEntityMap0.name(100);
        int int5 = binaryEntityMap0.growBy;
        java.lang.String[] strArray6 = binaryEntityMap0.names;
        java.lang.String[] strArray7 = binaryEntityMap0.names;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 0);
        binaryEntityMap0.growBy = 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
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
        int int19 = binaryEntityMap1.value("hi!");
        int int20 = binaryEntityMap1.growBy;
        int int21 = binaryEntityMap1.size;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap1.add("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
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
        java.lang.String str32 = entities0.escape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        java.lang.String str16 = entities0.entityName(3);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(entityMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap4 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map5 = hashEntityMap4.mapNameToValue;
        hashEntityMap0.mapNameToValue = map5;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap7 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map8 = hashEntityMap7.mapNameToValue;
        hashEntityMap0.mapValueToName = map8;
        java.lang.String str11 = hashEntityMap0.name(10);
        int int13 = hashEntityMap0.value("");
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap1.add("hi!", (int) 'a');
        int[] intArray5 = arrayEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
        entities0.addEntity("", (int) (short) -1);
        int int37 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
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
        java.lang.String str22 = hashEntityMap0.name(52);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.unescape("hi!");
        int int10 = entities0.entityValue("hi!");
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        int int5 = entities0.entityValue("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        arrayEntityMap6.add("", (int) (short) 1);
        arrayEntityMap6.ensureCapacity((int) ' ');
        int int12 = arrayEntityMap6.growBy;
        entities0.map = arrayEntityMap6;
        int int15 = entities0.entityValue("hi!");
        entities0.addEntity("", 3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        arrayEntityMap5.size = (-1);
        int int12 = arrayEntityMap5.value("");
        arrayEntityMap5.size = 2;
        java.lang.String[] strArray15 = arrayEntityMap5.names;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap1.size = (byte) -1;
        arrayEntityMap1.size = 100;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        arrayEntityMap6.names = strArray10;
        int[] intArray12 = arrayEntityMap6.values;
        java.lang.String str14 = arrayEntityMap6.name((int) (byte) 10);
        arrayEntityMap6.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        arrayEntityMap18.ensureCapacity(0);
        arrayEntityMap18.add("hi!", 100);
        java.lang.String str27 = arrayEntityMap18.name((int) 'a');
        int int29 = arrayEntityMap18.value("");
        int[] intArray30 = arrayEntityMap18.values;
        int[] intArray31 = arrayEntityMap18.values;
        arrayEntityMap6.values = intArray31;
        arrayEntityMap1.values = intArray31;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = arrayEntityMap1.name(97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(intArray31);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        hashEntityMap0.add("hi!", (int) 'a');
        java.util.Map map28 = hashEntityMap0.mapValueToName;
        hashEntityMap0.add("hi!", (int) (byte) 100);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap39 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap39.growBy = (short) 10;
        java.lang.String[] strArray42 = binaryEntityMap39.names;
        int int44 = binaryEntityMap39.value("");
        binaryEntityMap39.growBy = (short) 1;
        int int48 = binaryEntityMap39.value("");
        int[] intArray49 = binaryEntityMap39.values;
        binaryEntityMap25.values = intArray49;
        binaryEntityMap0.values = intArray49;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap52 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int54 = binaryEntityMap52.value("");
        java.lang.String str56 = binaryEntityMap52.name((int) (short) 0);
        int int57 = binaryEntityMap52.size;
        int[] intArray58 = binaryEntityMap52.values;
        int int59 = binaryEntityMap52.growBy;
        int[] intArray60 = binaryEntityMap52.values;
        binaryEntityMap0.values = intArray60;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(intArray60);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        java.lang.String str3 = binaryEntityMap1.name((int) (byte) 100);
        int int5 = binaryEntityMap1.value("");
        java.lang.String str7 = binaryEntityMap1.name(101);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        java.lang.String str40 = hashEntityMap16.name((int) (short) -1);
        java.util.Map map41 = hashEntityMap16.mapValueToName;
        int int43 = hashEntityMap16.value("hi!");
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
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
        binaryEntityMap0.add("hi!", 35);
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
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        java.lang.String str10 = arrayEntityMap5.name((int) (byte) 1);
        java.lang.String str12 = arrayEntityMap5.name(32);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str15 = binaryEntityMap13.name((int) (byte) 0);
        binaryEntityMap13.add("", (int) (byte) 0);
        binaryEntityMap13.growBy = 0;
        binaryEntityMap13.growBy = ' ';
        binaryEntityMap13.add("", (int) '#');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap26 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str28 = binaryEntityMap26.name((int) (byte) 0);
        java.lang.String str30 = binaryEntityMap26.name((int) '#');
        java.lang.String str32 = binaryEntityMap26.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap33 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str35 = binaryEntityMap33.name((int) (byte) 0);
        binaryEntityMap33.add("", (int) (byte) 0);
        binaryEntityMap33.growBy = 0;
        binaryEntityMap33.add("hi!", 2);
        binaryEntityMap33.size = (byte) 1;
        int[] intArray46 = binaryEntityMap33.values;
        int int47 = binaryEntityMap33.size;
        binaryEntityMap33.growBy = (short) 10;
        int[] intArray50 = binaryEntityMap33.values;
        binaryEntityMap26.values = intArray50;
        binaryEntityMap13.values = intArray50;
        arrayEntityMap5.values = intArray50;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(intArray50);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.escape("hi!");
        int int5 = entities0.entityValue("");
        java.io.Writer writer6 = null;
        entities0.escape(writer6, "");
        org.apache.commons.lang.Entities entities9 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str11 = entities9.unescape("");
        int int13 = entities9.entityValue("");
        int int15 = entities9.entityValue("");
        entities9.addEntity("", 97);
        org.apache.commons.lang.Entities entities19 = org.apache.commons.lang.Entities.HTML32;
        entities19.addEntity("hi!", 0);
        java.lang.String[][] strArray23 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities19.addEntities(strArray23);
        entities9.addEntities(strArray23);
        entities0.addEntities(strArray23);
        org.apache.commons.lang.Entities.EntityMap entityMap27 = entities0.map;
        org.apache.commons.lang.Entities.EntityMap entityMap28 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNotNull(entityMap1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(entities9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(entities19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertNotNull(entityMap28);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        int int6 = arrayEntityMap4.size;
        java.lang.String str8 = arrayEntityMap4.name((int) (byte) 0);
        int int10 = arrayEntityMap4.value("hi!");
        int[] intArray11 = arrayEntityMap4.values;
        java.lang.String[] strArray12 = arrayEntityMap4.names;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
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
        int int42 = arrayEntityMap4.value("");
        java.lang.String str44 = arrayEntityMap4.name((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        int[] intArray16 = binaryEntityMap0.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap18 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap18.ensureCapacity((int) 'a');
        arrayEntityMap18.ensureCapacity(0);
        java.lang.String[] strArray23 = arrayEntityMap18.names;
        binaryEntityMap0.names = strArray23;
        binaryEntityMap0.size = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.lang.String str2 = hashEntityMap0.name((int) (byte) -1);
        hashEntityMap0.add("", 35);
        int int7 = hashEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        java.lang.String str23 = entities0.unescape("");
        java.lang.String str25 = entities0.entityName((int) '4');
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap26 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map27 = hashEntityMap26.mapNameToValue;
        java.util.Map map28 = hashEntityMap26.mapValueToName;
        java.util.Map map29 = hashEntityMap26.mapNameToValue;
        java.util.Map map30 = hashEntityMap26.mapValueToName;
        java.util.Map map31 = hashEntityMap26.mapValueToName;
        java.util.Map map32 = hashEntityMap26.mapNameToValue;
        hashEntityMap26.add("hi!", (int) (short) -1);
        hashEntityMap26.add("", (-1));
        java.lang.String str40 = hashEntityMap26.name((int) '#');
        entities0.map = hashEntityMap26;
        int int43 = entities0.entityValue("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "20) test2917(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky "6) test2917(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(entities10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String str4 = binaryEntityMap0.name(32);
        int[] intArray5 = binaryEntityMap0.values;
        binaryEntityMap0.add("hi!", 3);
        binaryEntityMap0.size = 35;
        binaryEntityMap0.growBy = 'a';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
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
        org.apache.commons.lang.Entities entities28 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str30 = entities28.unescape("");
        java.lang.String str32 = entities28.entityName(100);
        java.lang.String str34 = entities28.entityName((int) ' ');
        java.lang.String str36 = entities28.entityName((int) '#');
        org.apache.commons.lang.Entities.EntityMap entityMap37 = entities28.map;
        java.lang.String[][] strArray38 = org.apache.commons.lang.Entities.ISO8859_1_ARRAY;
        entities28.addEntities(strArray38);
        java.lang.String[][] strArray40 = new java.lang.String[][] {};
        entities28.addEntities(strArray40);
        entities0.addEntities(strArray40);
        java.lang.String str44 = entities0.unescape("hi!");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(entities28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(entityMap37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[][] {});
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap32 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap33 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap33.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap37 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map38 = hashEntityMap37.mapNameToValue;
        hashEntityMap33.mapNameToValue = map38;
        hashEntityMap32.mapNameToValue = map38;
        java.util.Map map41 = hashEntityMap32.mapNameToValue;
        hashEntityMap32.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int47 = hashEntityMap45.value("hi!");
        java.util.Map map48 = hashEntityMap45.mapValueToName;
        int int50 = hashEntityMap45.value("");
        java.util.Map map51 = hashEntityMap45.mapNameToValue;
        hashEntityMap32.mapValueToName = map51;
        java.util.Map map53 = hashEntityMap32.mapValueToName;
        hashEntityMap0.mapValueToName = map53;
        int int56 = hashEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        int int6 = binaryEntityMap0.value("hi!");
        int[] intArray7 = binaryEntityMap0.values;
        int int9 = binaryEntityMap0.value("");
        java.lang.String str11 = binaryEntityMap0.name((int) (short) 1);
        java.lang.String str13 = binaryEntityMap0.name((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        int[] intArray2 = arrayEntityMap1.values;
        int int3 = arrayEntityMap1.size;
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
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
        org.apache.commons.lang.Entities.EntityMap entityMap43 = entities0.map;
        java.lang.Class<?> wildcardClass44 = entityMap43.getClass();
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
        org.junit.Assert.assertNotNull(entityMap43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        java.lang.Class<?> wildcardClass15 = binaryEntityMap1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 100);
        binaryEntityMap1.add("", (int) (short) 10);
        int[] intArray5 = binaryEntityMap1.values;
        org.junit.Assert.assertNotNull(intArray5);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        binaryEntityMap1.ensureCapacity((int) (short) 100);
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
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        java.lang.String str29 = entities0.entityName(97);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(entityMap27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
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
        java.lang.String str17 = entities0.entityName(32);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str20 = entities0.entityName(52);
        java.io.Writer writer21 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "21) test2928(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
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
        java.util.Map map33 = hashEntityMap0.mapNameToValue;
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
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        java.lang.String[] strArray9 = binaryEntityMap0.names;
        binaryEntityMap0.growBy = (byte) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        arrayEntityMap1.growBy = (short) -1;
        java.lang.String str6 = arrayEntityMap1.name((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
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
        entities0.addEntity("", 32);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        java.lang.String str10 = binaryEntityMap0.name((int) (byte) -1);
        int[] intArray11 = binaryEntityMap0.values;
        java.lang.String[] strArray12 = binaryEntityMap0.names;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap13 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        arrayEntityMap13.names = strArray17;
        int[] intArray19 = arrayEntityMap13.values;
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap21 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap21.ensureCapacity((int) 'a');
        arrayEntityMap21.ensureCapacity(0);
        java.lang.String[] strArray26 = arrayEntityMap21.names;
        arrayEntityMap13.names = strArray26;
        binaryEntityMap0.names = strArray26;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap49.ensureCapacity((int) 'a');
        arrayEntityMap49.growBy = (byte) 100;
        arrayEntityMap49.ensureCapacity(10);
        java.lang.String str57 = arrayEntityMap49.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap58 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str60 = binaryEntityMap58.name((int) (byte) 0);
        int int62 = binaryEntityMap58.value("");
        binaryEntityMap58.add("", (int) (short) -1);
        binaryEntityMap58.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap70 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap70.ensureCapacity((int) 'a');
        arrayEntityMap70.ensureCapacity(0);
        java.lang.String[] strArray75 = arrayEntityMap70.names;
        binaryEntityMap58.names = strArray75;
        arrayEntityMap49.names = strArray75;
        arrayEntityMap49.size = 10;
        java.lang.String[] strArray80 = arrayEntityMap49.names;
        binaryEntityMap29.names = strArray80;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(entityMap28);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        int int3 = arrayEntityMap1.value("");
        arrayEntityMap1.ensureCapacity((int) '4');
        int[] intArray6 = arrayEntityMap1.values;
        java.lang.String[] strArray7 = arrayEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        binaryEntityMap1.size = (short) 0;
        java.lang.String[] strArray7 = binaryEntityMap1.names;
        binaryEntityMap1.size = 1;
        java.lang.String[] strArray10 = binaryEntityMap1.names;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { null });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { null });
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        binaryEntityMap1.ensureCapacity((int) (short) 10);
        java.lang.String str8 = binaryEntityMap1.name(52);
        java.lang.String str10 = binaryEntityMap1.name((int) (short) 10);
        java.lang.String str12 = binaryEntityMap1.name((int) (byte) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        int[] intArray2 = binaryEntityMap1.values;
        java.lang.String str4 = binaryEntityMap1.name((int) (byte) 100);
        int int5 = binaryEntityMap1.size;
        int int7 = binaryEntityMap1.value("");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap28 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map29 = hashEntityMap28.mapNameToValue;
        java.util.Map map30 = hashEntityMap28.mapValueToName;
        java.util.Map map31 = hashEntityMap28.mapNameToValue;
        java.util.Map map32 = hashEntityMap28.mapValueToName;
        java.util.Map map33 = hashEntityMap28.mapValueToName;
        int int35 = hashEntityMap28.value("hi!");
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
        java.util.Map map56 = hashEntityMap36.mapNameToValue;
        hashEntityMap28.mapNameToValue = map56;
        hashEntityMap28.add("", (int) (short) 100);
        java.util.Map map61 = hashEntityMap28.mapValueToName;
        hashEntityMap0.mapNameToValue = map61;
        int int64 = hashEntityMap0.value("hi!");
        java.lang.String str66 = hashEntityMap0.name(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        int int4 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = 10;
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.growBy = 1;
        java.lang.String str12 = binaryEntityMap0.name(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int[] intArray6 = binaryEntityMap0.values;
        java.lang.String str8 = binaryEntityMap0.name(10);
        int int10 = binaryEntityMap0.value("");
        int[] intArray11 = binaryEntityMap0.values;
        int int13 = binaryEntityMap0.value("");
        int int14 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 101;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap29 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap30.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap34 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map35 = hashEntityMap34.mapNameToValue;
        hashEntityMap30.mapNameToValue = map35;
        hashEntityMap29.mapNameToValue = map35;
        java.util.Map map38 = hashEntityMap29.mapNameToValue;
        hashEntityMap29.add("", (int) (byte) 1);
        hashEntityMap29.add("", 0);
        java.util.Map map45 = hashEntityMap29.mapValueToName;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap46 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap46.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap50 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map51 = hashEntityMap50.mapNameToValue;
        hashEntityMap46.mapNameToValue = map51;
        int int54 = hashEntityMap46.value("");
        java.util.Map map55 = hashEntityMap46.mapNameToValue;
        hashEntityMap29.mapNameToValue = map55;
        java.util.Map map57 = hashEntityMap29.mapValueToName;
        hashEntityMap0.mapValueToName = map57;
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap59 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map60 = hashEntityMap59.mapNameToValue;
        java.util.Map map61 = hashEntityMap59.mapValueToName;
        int int63 = hashEntityMap59.value("");
        hashEntityMap59.add("", 1);
        java.util.Map map67 = hashEntityMap59.mapValueToName;
        hashEntityMap0.mapNameToValue = map67;
        java.util.Map map69 = hashEntityMap0.mapNameToValue;
        java.lang.String str71 = hashEntityMap0.name(97);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        int int6 = binaryEntityMap0.value("");
        java.lang.String str8 = binaryEntityMap0.name((int) (short) 1);
        java.lang.String str10 = binaryEntityMap0.name(32);
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap0.add("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: length -1 is negative");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap1.growBy = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        arrayEntityMap0.names = strArray4;
        int[] intArray6 = arrayEntityMap0.values;
        java.lang.String str8 = arrayEntityMap0.name((int) (byte) 10);
        arrayEntityMap0.ensureCapacity((int) (short) 10);
        java.lang.String str12 = arrayEntityMap0.name(2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray1 = new int[] {};
        binaryEntityMap0.values = intArray1;
        int int4 = binaryEntityMap0.value("");
        java.lang.String str6 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str8 = binaryEntityMap0.name(0);
        binaryEntityMap0.growBy = (short) -1;
        binaryEntityMap0.growBy = ' ';
        int int13 = binaryEntityMap0.growBy;
        java.lang.String str15 = binaryEntityMap0.name((int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap(10);
        int int33 = binaryEntityMap31.value("hi!");
        binaryEntityMap31.size = (byte) 100;
        int[] intArray36 = binaryEntityMap31.values;
        binaryEntityMap0.values = intArray36;
        java.lang.String[] strArray38 = binaryEntityMap0.names;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
        org.junit.Assert.assertNotNull(strArray38);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName(10);
        java.lang.String str10 = entities0.escape("hi!");
        int int12 = 0; // flaky "22) test2947(org.apache.commons.lang.RegressionTest5)": entities0.entityValue("");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap13 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int15 = primitiveEntityMap13.value("hi!");
        primitiveEntityMap13.add("", (int) (short) 10);
        primitiveEntityMap13.add("", 0);
        int int23 = primitiveEntityMap13.value("");
        entities0.map = primitiveEntityMap13;
        java.lang.String str26 = entities0.unescape("");
        java.lang.String str28 = entities0.unescape("hi!");
        entities0.addEntity("hi!", 2);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "7) test2947(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) 10);
        int int12 = binaryEntityMap0.growBy;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        int int23 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("");
        java.lang.String str9 = primitiveEntityMap0.name((int) (short) 100);
        primitiveEntityMap0.add("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        int int30 = binaryEntityMap0.value("hi!");
        int int32 = binaryEntityMap0.value("");
        int[] intArray33 = binaryEntityMap0.values;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray33);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.unescape("hi!");
        java.lang.String str8 = entities0.entityName((int) (byte) 10);
        int int10 = 0; // flaky "23) test2952(org.apache.commons.lang.RegressionTest5)": entities0.entityValue("");
        java.lang.String str12 = entities0.escape("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap13 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap14 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap14.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map19 = hashEntityMap18.mapNameToValue;
        hashEntityMap14.mapNameToValue = map19;
        hashEntityMap13.mapNameToValue = map19;
        entities0.map = hashEntityMap13;
        java.lang.Class<?> wildcardClass23 = entities0.getClass();
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky "8) test2952(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertNull(str8);
// flaky "2) test2952(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName((int) (short) 0);
        java.lang.String str6 = entities0.entityName(1);
        java.lang.String str8 = entities0.escape("");
        int int10 = 0; // flaky "24) test2953(org.apache.commons.lang.RegressionTest5)": entities0.entityValue("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap11 = entities0.map;
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.growBy = (short) 10;
        java.lang.String[] strArray16 = binaryEntityMap13.names;
        binaryEntityMap13.add("", (int) (short) 100);
        int[] intArray20 = binaryEntityMap13.values;
        entities0.map = binaryEntityMap13;
        java.lang.String str23 = entities0.escape("");
        java.io.Writer writer24 = null;
        // The following exception was thrown during execution in test generation
        try {
            entities0.escape(writer24, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "9) test2953(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(entityMap11);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(97);
        java.lang.String str4 = lookupEntityMap0.name(52);
        java.lang.String str6 = lookupEntityMap0.name((int) (byte) 0);
        lookupEntityMap0.add("hi!", 52);
        int int11 = lookupEntityMap0.value("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap0 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map1 = hashEntityMap0.mapNameToValue;
        java.util.Map map2 = hashEntityMap0.mapValueToName;
        java.util.Map map3 = hashEntityMap0.mapNameToValue;
        hashEntityMap0.add("", (int) (byte) 10);
        int int8 = hashEntityMap0.value("");
        java.lang.String str10 = hashEntityMap0.name((int) (byte) 10);
        hashEntityMap0.add("", (int) (byte) 10);
        hashEntityMap0.add("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
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
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap65 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int67 = hashEntityMap65.value("hi!");
        java.util.Map map68 = hashEntityMap65.mapValueToName;
        int int70 = hashEntityMap65.value("");
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap71 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap72 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap72.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap76 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map77 = hashEntityMap76.mapNameToValue;
        hashEntityMap72.mapNameToValue = map77;
        hashEntityMap71.mapNameToValue = map77;
        java.util.Map map80 = hashEntityMap71.mapNameToValue;
        hashEntityMap65.mapNameToValue = map80;
        java.lang.String str83 = hashEntityMap65.name((int) '#');
        java.lang.String str85 = hashEntityMap65.name(0);
        java.util.Map map86 = hashEntityMap65.mapValueToName;
        hashEntityMap65.add("", (int) '4');
        hashEntityMap65.add("hi!", (int) '#');
        hashEntityMap65.add("hi!", 0);
        java.util.Map map96 = hashEntityMap65.mapValueToName;
        hashEntityMap0.mapValueToName = map96;
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(map96);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name(0);
        java.lang.String str8 = lookupEntityMap0.name((int) (short) 100);
        int int10 = lookupEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap25 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap25.ensureCapacity((int) 'a');
        int int28 = arrayEntityMap25.growBy;
        java.lang.String[] strArray29 = arrayEntityMap25.names;
        int int31 = arrayEntityMap25.value("hi!");
        int int32 = arrayEntityMap25.size;
        int int34 = arrayEntityMap25.value("hi!");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap36 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap37 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str39 = binaryEntityMap37.name((int) (byte) 0);
        int int41 = binaryEntityMap37.value("");
        binaryEntityMap37.growBy = 10;
        binaryEntityMap37.add("hi!", (int) (short) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap48 = new org.apache.commons.lang.Entities.BinaryEntityMap(0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap49 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray50 = new int[] {};
        binaryEntityMap49.values = intArray50;
        int int53 = binaryEntityMap49.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap54 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap55 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap55.growBy = (short) 10;
        java.lang.String[] strArray58 = binaryEntityMap55.names;
        arrayEntityMap54.names = strArray58;
        binaryEntityMap49.names = strArray58;
        binaryEntityMap48.names = strArray58;
        binaryEntityMap37.names = strArray58;
        arrayEntityMap36.names = strArray58;
        arrayEntityMap25.names = strArray58;
        java.lang.String[] strArray65 = arrayEntityMap25.names;
        int[] intArray66 = arrayEntityMap25.values;
        binaryEntityMap0.values = intArray66;
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] {});
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(intArray66);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        java.lang.String str4 = entities0.entityName(100);
        java.lang.String str6 = entities0.entityName((int) ' ');
        java.lang.String str8 = entities0.entityName((int) '#');
        java.lang.String str10 = entities0.unescape("");
        java.lang.String str12 = entities0.entityName(0);
        java.lang.String str14 = entities0.unescape("hi!");
        org.apache.commons.lang.Entities entities15 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer16 = null;
        entities15.escape(writer16, "");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap19 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        entities15.map = primitiveEntityMap19;
        java.lang.String str22 = entities15.entityName((int) (short) -1);
        org.apache.commons.lang.Entities entities23 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer24 = null;
        entities23.escape(writer24, "");
        java.lang.String[][] strArray27 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities23.addEntities(strArray27);
        entities15.addEntities(strArray27);
        entities0.addEntities(strArray27);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "25) test2960(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(entities15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(entities23);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        org.apache.commons.lang.Entities entities30 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap31 = entities30.map;
        java.lang.String str33 = entities30.escape("hi!");
        java.lang.String str35 = entities30.unescape("hi!");
        java.lang.String[][] strArray36 = org.apache.commons.lang.Entities.HTML40_ARRAY;
        entities30.addEntities(strArray36);
        entities0.addEntities(strArray36);
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(entities30);
        org.junit.Assert.assertNotNull(entityMap31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.EntityMap entityMap4 = entities0.map;
        java.lang.String str6 = entities0.entityName((int) (short) -1);
        entities0.addEntity("", 32);
        entities0.addEntity("", 97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(entityMap4);
// flaky "26) test2962(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) ' ');
        java.lang.String str3 = binaryEntityMap1.name(100);
        int int5 = binaryEntityMap1.value("hi!");
        int int7 = binaryEntityMap1.value("");
        binaryEntityMap1.growBy = (-1);
        int int10 = binaryEntityMap1.size;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        int[] intArray7 = binaryEntityMap0.values;
        java.lang.String str9 = binaryEntityMap0.name((int) (short) 1);
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.growBy = 97;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        java.util.Map map39 = hashEntityMap0.mapValueToName;
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
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
            entities0.unescape(writer16, "hi!");
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
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
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
        org.apache.commons.lang.Entities.EntityMap entityMap52 = entities0.map;
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
        org.junit.Assert.assertNotNull(entityMap52);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        java.lang.String str29 = entities0.entityName(3);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entities7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
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
        java.lang.String str49 = lookupEntityMap34.name((int) '#');
        java.lang.String str51 = lookupEntityMap34.name(97);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
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
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap5 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int7 = arrayEntityMap5.value("hi!");
        entities0.map = arrayEntityMap5;
        arrayEntityMap5.size = (-1);
        int int12 = arrayEntityMap5.value("");
        java.lang.String str14 = arrayEntityMap5.name(52);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) ' ');
        java.lang.String str6 = binaryEntityMap0.name((int) ' ');
        int int8 = binaryEntityMap0.value("");
        binaryEntityMap0.add("", (int) (short) 10);
        java.lang.String str13 = binaryEntityMap0.name((int) (byte) 10);
        int int15 = binaryEntityMap0.value("");
        java.lang.String str17 = binaryEntityMap0.name(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
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
        entities0.addEntity("", 100);
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap7 = entities0.map;
        entities0.addEntity("", 52);
        java.lang.String str12 = entities0.unescape("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(entityMap7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        binaryEntityMap0.size = (byte) -1;
        java.lang.String str6 = binaryEntityMap0.name((int) (short) 100);
        binaryEntityMap0.size = (byte) 0;
        int int10 = binaryEntityMap0.value("");
        binaryEntityMap0.ensureCapacity((int) (byte) 10);
        binaryEntityMap0.add("hi!", 10);
        java.lang.String str17 = binaryEntityMap0.name(52);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
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
        java.lang.String str53 = binaryEntityMap0.name((-1));
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
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
        hashEntityMap0.add("hi!", 32);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap17 = new org.apache.commons.lang.Entities.HashEntityMap();
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap18 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap18.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap22 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map23 = hashEntityMap22.mapNameToValue;
        hashEntityMap18.mapNameToValue = map23;
        hashEntityMap17.mapNameToValue = map23;
        java.util.Map map26 = hashEntityMap17.mapNameToValue;
        hashEntityMap17.add("hi!", 1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap30 = new org.apache.commons.lang.Entities.HashEntityMap();
        int int32 = hashEntityMap30.value("hi!");
        java.util.Map map33 = hashEntityMap30.mapValueToName;
        int int35 = hashEntityMap30.value("");
        java.util.Map map36 = hashEntityMap30.mapNameToValue;
        hashEntityMap17.mapValueToName = map36;
        hashEntityMap0.mapNameToValue = map36;
        java.lang.String str40 = hashEntityMap0.name(2);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap41 = new org.apache.commons.lang.Entities.HashEntityMap();
        hashEntityMap41.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.HashEntityMap hashEntityMap45 = new org.apache.commons.lang.Entities.HashEntityMap();
        java.util.Map map46 = hashEntityMap45.mapNameToValue;
        hashEntityMap41.mapNameToValue = map46;
        org.apache.commons.lang.Entities entities48 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str50 = entities48.unescape("");
        java.lang.String str52 = entities48.entityName(100);
        java.lang.String str54 = entities48.entityName((int) ' ');
        java.lang.String str56 = entities48.entityName(10);
        java.lang.String str58 = entities48.escape("hi!");
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
        entities48.map = hashEntityMap59;
        hashEntityMap59.add("", (int) (short) 10);
        java.util.Map map80 = hashEntityMap59.mapValueToName;
        hashEntityMap41.mapValueToName = map80;
        java.util.Map map82 = hashEntityMap41.mapValueToName;
        int int84 = hashEntityMap41.value("");
        int int86 = hashEntityMap41.value("");
        java.util.Map map87 = hashEntityMap41.mapNameToValue;
        hashEntityMap0.mapValueToName = map87;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(entities48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        int int84 = hashEntityMap0.value("hi!");
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
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap0 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        int int2 = arrayEntityMap0.value("");
        int int4 = arrayEntityMap0.value("");
        arrayEntityMap0.ensureCapacity((int) (byte) 1);
        arrayEntityMap0.growBy = '#';
        java.lang.Class<?> wildcardClass9 = arrayEntityMap0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
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
        org.apache.commons.lang.Entities.EntityMap entityMap29 = entities0.map;
        int int31 = entities0.entityValue("");
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(entities8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(entities17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(entityMap29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name(0);
        lookupEntityMap0.add("", (int) (short) 100);
        java.lang.String str7 = lookupEntityMap0.name((int) '4');
        java.lang.String str9 = lookupEntityMap0.name((int) '4');
        int int11 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = lookupEntityMap0.name((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        binaryEntityMap0.growBy = (byte) 1;
        int int6 = binaryEntityMap0.value("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        int int6 = lookupEntityMap0.value("hi!");
        java.lang.String str8 = lookupEntityMap0.name(97);
        int int10 = lookupEntityMap0.value("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = lookupEntityMap0.name((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 256");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.io.Writer writer1 = null;
        entities0.escape(writer1, "");
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
        java.lang.String str6 = entities0.unescape("");
        java.lang.String str8 = entities0.escape("hi!");
        org.apache.commons.lang.Entities.EntityMap entityMap9 = entities0.map;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap10 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray11 = new int[] {};
        binaryEntityMap10.values = intArray11;
        int int14 = binaryEntityMap10.value("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap15 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap16 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap16.growBy = (short) 10;
        java.lang.String[] strArray19 = binaryEntityMap16.names;
        arrayEntityMap15.names = strArray19;
        binaryEntityMap10.names = strArray19;
        int int23 = binaryEntityMap10.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap24 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str26 = binaryEntityMap24.name((int) (byte) 0);
        java.lang.String str28 = binaryEntityMap24.name((int) '#');
        java.lang.String str30 = binaryEntityMap24.name(10);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap31 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str33 = binaryEntityMap31.name((int) (byte) 0);
        int int35 = binaryEntityMap31.value("");
        binaryEntityMap31.add("", (int) (short) -1);
        binaryEntityMap31.add("", 0);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap43 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap43.ensureCapacity((int) 'a');
        arrayEntityMap43.ensureCapacity(0);
        java.lang.String[] strArray48 = arrayEntityMap43.names;
        binaryEntityMap31.names = strArray48;
        binaryEntityMap24.names = strArray48;
        binaryEntityMap10.names = strArray48;
        binaryEntityMap10.growBy = 101;
        entities0.map = binaryEntityMap10;
        // The following exception was thrown during execution in test generation
        try {
            binaryEntityMap10.add("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: arraycopy: last destination index 1 out of bounds for int[0]");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(entityMap9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
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
        int int20 = arrayEntityMap1.value("hi!");
        int int22 = arrayEntityMap1.value("");
        java.lang.String[] strArray23 = arrayEntityMap1.names;
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        arrayEntityMap1.ensureCapacity(0);
        arrayEntityMap1.add("hi!", 100);
        java.lang.String str10 = arrayEntityMap1.name((int) 'a');
        int[] intArray11 = arrayEntityMap1.values;
        arrayEntityMap1.add("hi!", 32);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(intArray11);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        org.apache.commons.lang.Entities.TreeEntityMap treeEntityMap0 = new org.apache.commons.lang.Entities.TreeEntityMap();
        java.util.Map map1 = treeEntityMap0.mapNameToValue;
        treeEntityMap0.add("", (int) (short) 100);
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
        hashEntityMap5.add("", (int) (byte) 0);
        java.util.Map map30 = hashEntityMap5.mapNameToValue;
        java.util.Map map31 = hashEntityMap5.mapValueToName;
        treeEntityMap0.mapValueToName = map31;
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        int int3 = arrayEntityMap1.size;
        arrayEntityMap1.size = (short) -1;
        arrayEntityMap1.ensureCapacity((int) (byte) 1);
        int[] intArray8 = arrayEntityMap1.values;
        arrayEntityMap1.size = (byte) 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
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
        java.lang.String[] strArray24 = binaryEntityMap5.names;
        int int25 = binaryEntityMap5.growBy;
        binaryEntityMap5.size = (byte) 100;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
// flaky "27) test2988(org.apache.commons.lang.RegressionTest5)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap4 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        entities0.map = arrayEntityMap4;
        java.lang.String[] strArray6 = arrayEntityMap4.names;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap1 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int3 = primitiveEntityMap1.value("hi!");
        primitiveEntityMap1.add("", (int) (short) 10);
        primitiveEntityMap1.add("", 0);
        java.lang.String str11 = primitiveEntityMap1.name((int) '#');
        java.lang.String str13 = primitiveEntityMap1.name((int) (short) -1);
        entities0.map = primitiveEntityMap1;
        int int16 = entities0.entityValue("");
        org.apache.commons.lang.Entities.EntityMap entityMap17 = entities0.map;
        org.junit.Assert.assertNotNull(entities0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(entityMap17);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name(10);
        java.lang.String str6 = lookupEntityMap0.name((int) '#');
        int int8 = lookupEntityMap0.value("");
        lookupEntityMap0.add("hi!", (-1));
        lookupEntityMap0.add("hi!", 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "", "" };
        arrayEntityMap1.names = strArray9;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str13 = binaryEntityMap11.name((int) (byte) 0);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap14.growBy = (short) 10;
        java.lang.String[] strArray17 = binaryEntityMap14.names;
        binaryEntityMap14.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap21 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap21.growBy = (short) 10;
        java.lang.String[] strArray24 = binaryEntityMap21.names;
        binaryEntityMap14.names = strArray24;
        binaryEntityMap11.names = strArray24;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str29 = binaryEntityMap27.name((int) (byte) 0);
        int int31 = binaryEntityMap27.value("");
        binaryEntityMap27.add("", (int) (short) -1);
        int[] intArray35 = binaryEntityMap27.values;
        binaryEntityMap11.values = intArray35;
        arrayEntityMap1.values = intArray35;
        java.lang.String[] strArray38 = arrayEntityMap1.names;
        arrayEntityMap1.add("hi!", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "", "" });
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "", "", "" });
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        primitiveEntityMap0.add("", 0);
        java.lang.String str10 = primitiveEntityMap0.name((int) '#');
        java.lang.String str12 = primitiveEntityMap0.name((int) (short) -1);
        int int14 = primitiveEntityMap0.value("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
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
        java.lang.String str67 = hashEntityMap0.name(0);
        int int69 = hashEntityMap0.value("");
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(97);
        int int3 = binaryEntityMap1.value("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        org.apache.commons.lang.Entities.LookupEntityMap lookupEntityMap0 = new org.apache.commons.lang.Entities.LookupEntityMap();
        java.lang.String str2 = lookupEntityMap0.name((int) (short) 0);
        java.lang.String str4 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str6 = lookupEntityMap0.name((int) (short) 1);
        java.lang.String str8 = lookupEntityMap0.name(2);
        lookupEntityMap0.add("hi!", 0);
        int int13 = lookupEntityMap0.value("");
        int int15 = lookupEntityMap0.value("");
        java.lang.String str17 = lookupEntityMap0.name((int) ' ');
        lookupEntityMap0.add("", (int) 'a');
        java.lang.String str22 = lookupEntityMap0.name((int) (short) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (short) 1);
        int int3 = binaryEntityMap1.value("hi!");
        int[] intArray4 = binaryEntityMap1.values;
        binaryEntityMap1.size = (short) 0;
        binaryEntityMap1.growBy = (byte) 100;
        int int10 = binaryEntityMap1.value("hi!");
        int int12 = binaryEntityMap1.value("hi!");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap13.growBy = (short) 10;
        java.lang.String[] strArray16 = binaryEntityMap13.names;
        int[] intArray17 = binaryEntityMap13.values;
        java.lang.String str19 = binaryEntityMap13.name(52);
        java.lang.String[] strArray20 = binaryEntityMap13.names;
        binaryEntityMap1.names = strArray20;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 0 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap(32);
        binaryEntityMap1.size = (short) 10;
        java.lang.String[] strArray4 = binaryEntityMap1.names;
        java.lang.String str6 = binaryEntityMap1.name((int) '#');
        binaryEntityMap1.add("", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        org.apache.commons.lang.Entities.PrimitiveEntityMap primitiveEntityMap0 = new org.apache.commons.lang.Entities.PrimitiveEntityMap();
        int int2 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (int) (short) 10);
        int int7 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("", (-1));
        int int12 = primitiveEntityMap0.value("hi!");
        primitiveEntityMap0.add("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
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
        hashEntityMap0.add("", 0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }
}
