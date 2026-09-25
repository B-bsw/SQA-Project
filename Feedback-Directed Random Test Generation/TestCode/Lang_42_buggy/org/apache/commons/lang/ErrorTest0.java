package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = binaryEntityMap0.value("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        org.apache.commons.lang.Entities.EntityMap entityMap1 = entities0.map;
        java.lang.String str3 = entities0.unescape("hi!");
        java.lang.String str5 = entities0.unescape("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.lang.Entities.fillWithHtml40Entities(entities0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = arrayEntityMap1.value("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int32 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        java.lang.String str6 = entities0.escape("");
        java.lang.String str8 = entities0.escape("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        entities0.addEntity("hi!", (int) (byte) 100);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.size = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("");
        arrayEntityMap1.size = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = arrayEntityMap1.value("");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        binaryEntityMap0.growBy = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = binaryEntityMap0.value("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int23 = binaryEntityMap0.value("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = binaryEntityMap0.value("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int21 = binaryEntityMap0.value("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = binaryEntityMap0.value("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) -1);
        int[] intArray14 = binaryEntityMap0.values;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = binaryEntityMap0.value("");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
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
        java.lang.String str47 = binaryEntityMap0.name((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = binaryEntityMap0.value("");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = binaryEntityMap0.value("");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        binaryEntityMap0.ensureCapacity((int) ' ');
        binaryEntityMap0.growBy = 32;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = binaryEntityMap0.value("");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = binaryEntityMap0.value("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = binaryEntityMap0.value("");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap(10);
        arrayEntityMap1.add("hi!", (int) 'a');
        int int6 = arrayEntityMap1.value("");
        arrayEntityMap1.size = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = arrayEntityMap1.value("");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = '4';
        int int4 = binaryEntityMap0.value("hi!");
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("", (int) (byte) 0);
        binaryEntityMap0.add("", (int) (byte) -1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap13 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int[] intArray14 = new int[] {};
        binaryEntityMap13.values = intArray14;
        int int17 = binaryEntityMap13.value("");
        java.lang.String str19 = binaryEntityMap13.name((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap20 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap20.growBy = (short) 10;
        java.lang.String[] strArray23 = binaryEntityMap20.names;
        int int25 = binaryEntityMap20.value("");
        binaryEntityMap20.growBy = (short) 1;
        binaryEntityMap20.size = 100;
        binaryEntityMap20.add("", 100);
        java.lang.String[] strArray33 = binaryEntityMap20.names;
        binaryEntityMap13.names = strArray33;
        binaryEntityMap0.names = strArray33;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        int[] intArray7 = binaryEntityMap0.values;
        binaryEntityMap0.add("", (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = arrayEntityMap1.value("");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int53 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int22 = binaryEntityMap0.value("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int47 = binaryEntityMap0.value("");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int19 = binaryEntityMap0.value("");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int1 = binaryEntityMap0.growBy;
        binaryEntityMap0.add("", (int) (short) 100);
        binaryEntityMap0.size = (byte) 100;
        binaryEntityMap0.add("", (int) (short) 1);
        binaryEntityMap0.add("", (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int14 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        int[] intArray43 = binaryEntityMap42.values;
        binaryEntityMap0.values = intArray43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int46 = binaryEntityMap0.value("");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap19 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap19.growBy = (short) 10;
        java.lang.String[] strArray22 = binaryEntityMap19.names;
        int int24 = binaryEntityMap19.value("");
        binaryEntityMap19.growBy = (short) 1;
        binaryEntityMap19.size = 100;
        binaryEntityMap19.add("", 100);
        binaryEntityMap19.add("hi!", (int) (byte) -1);
        int[] intArray35 = binaryEntityMap19.values;
        binaryEntityMap0.values = intArray35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int38 = binaryEntityMap0.value("");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 10);
        binaryEntityMap1.add("hi!", (int) (byte) 100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap6 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int7 = arrayEntityMap6.growBy;
        int int8 = arrayEntityMap6.size;
        arrayEntityMap6.size = (short) -1;
        arrayEntityMap6.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap14 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int15 = arrayEntityMap14.growBy;
        java.lang.String[] strArray16 = arrayEntityMap14.names;
        int int18 = arrayEntityMap14.value("");
        int int19 = arrayEntityMap14.size;
        java.lang.String[] strArray20 = arrayEntityMap14.names;
        arrayEntityMap6.names = strArray20;
        binaryEntityMap1.names = strArray20;
        binaryEntityMap1.growBy = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int26 = binaryEntityMap1.value("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str2 = binaryEntityMap0.name((int) (byte) 0);
        java.lang.String str4 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.growBy = (byte) 10;
        binaryEntityMap0.growBy = 1;
        int int9 = binaryEntityMap0.growBy;
        java.lang.String[] strArray10 = binaryEntityMap0.names;
        int int11 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 10;
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int27 = binaryEntityMap0.value("");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = binaryEntityMap0.value("");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        java.lang.String str4 = binaryEntityMap0.name((int) (short) 0);
        int int5 = binaryEntityMap0.size;
        int int6 = binaryEntityMap0.growBy;
        binaryEntityMap0.size = 'a';
        java.lang.String str10 = binaryEntityMap0.name(100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = binaryEntityMap0.value("");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) -1);
        int[] intArray14 = binaryEntityMap0.values;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int16 = binaryEntityMap0.value("");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) (byte) 1);
        java.lang.String[] strArray2 = arrayEntityMap1.names;
        arrayEntityMap1.size = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = arrayEntityMap1.value("hi!");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap7 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap7.growBy = (short) 10;
        java.lang.String[] strArray10 = binaryEntityMap7.names;
        binaryEntityMap0.names = strArray10;
        java.lang.String str13 = binaryEntityMap0.name((int) (short) -1);
        java.lang.String str15 = binaryEntityMap0.name((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str17 = binaryEntityMap15.name((int) (byte) 0);
        java.lang.String str19 = binaryEntityMap15.name((int) '#');
        binaryEntityMap15.growBy = (byte) 10;
        binaryEntityMap15.growBy = 1;
        java.lang.String[] strArray24 = binaryEntityMap15.names;
        binaryEntityMap14.names = strArray24;
        java.lang.String[] strArray26 = binaryEntityMap14.names;
        binaryEntityMap0.names = strArray26;
        int int28 = binaryEntityMap0.growBy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int30 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.add("", (int) 'a');
        int[] intArray4 = binaryEntityMap0.values;
        int int6 = binaryEntityMap0.value("hi!");
        binaryEntityMap0.ensureCapacity((int) (byte) 0);
        binaryEntityMap0.size = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        int int2 = binaryEntityMap0.value("");
        binaryEntityMap0.size = '#';
        java.lang.String str6 = binaryEntityMap0.name((int) '#');
        binaryEntityMap0.add("hi!", 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = binaryEntityMap0.value("");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int63 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        int int2 = arrayEntityMap1.growBy;
        java.lang.String[] strArray3 = arrayEntityMap1.names;
        int int5 = arrayEntityMap1.value("hi!");
        arrayEntityMap1.size = 10;
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
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap26 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap27 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap27.growBy = (short) 10;
        java.lang.String[] strArray30 = binaryEntityMap27.names;
        arrayEntityMap26.names = strArray30;
        int[] intArray32 = arrayEntityMap26.values;
        binaryEntityMap8.values = intArray32;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap34 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap34.growBy = (short) 10;
        java.lang.String[] strArray37 = binaryEntityMap34.names;
        int int39 = binaryEntityMap34.value("");
        binaryEntityMap34.growBy = (short) 1;
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap42 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str44 = binaryEntityMap42.name((int) (byte) 0);
        java.lang.String[] strArray45 = binaryEntityMap42.names;
        binaryEntityMap34.names = strArray45;
        java.lang.String str48 = binaryEntityMap34.name(100);
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap49 = new org.apache.commons.lang.Entities.ArrayEntityMap();
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap50 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap50.growBy = (short) 10;
        java.lang.String[] strArray53 = binaryEntityMap50.names;
        arrayEntityMap49.names = strArray53;
        int[] intArray55 = arrayEntityMap49.values;
        binaryEntityMap34.values = intArray55;
        binaryEntityMap8.values = intArray55;
        arrayEntityMap1.values = intArray55;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int60 = arrayEntityMap1.value("hi!");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        java.lang.String str9 = binaryEntityMap0.name((int) '4');
        java.lang.String str11 = binaryEntityMap0.name(0);
        binaryEntityMap0.size = 'a';
        binaryEntityMap0.add("", (int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
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
        java.lang.String str47 = binaryEntityMap0.name((int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int49 = binaryEntityMap0.value("");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) 'a');
        arrayEntityMap1.ensureCapacity((int) 'a');
        int int4 = arrayEntityMap1.growBy;
        java.lang.String[] strArray5 = arrayEntityMap1.names;
        int int6 = arrayEntityMap1.growBy;
        arrayEntityMap1.size = (short) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = arrayEntityMap1.value("hi!");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        binaryEntityMap0.add("", 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = binaryEntityMap0.value("");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test54");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int20 = binaryEntityMap0.value("");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test55");
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
        java.lang.String str32 = binaryEntityMap0.name(0);
        binaryEntityMap0.ensureCapacity((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int36 = binaryEntityMap0.value("");
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test56");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        int int5 = binaryEntityMap0.value("");
        binaryEntityMap0.growBy = (short) 1;
        binaryEntityMap0.size = 100;
        binaryEntityMap0.add("", 100);
        java.lang.String[] strArray13 = binaryEntityMap0.names;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int15 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test57");
        org.apache.commons.lang.Entities entities0 = org.apache.commons.lang.Entities.HTML32;
        java.lang.String str2 = entities0.unescape("");
        int int4 = entities0.entityValue("");
        int int6 = entities0.entityValue("");
        java.lang.String str8 = entities0.unescape("");
        int int10 = entities0.entityValue("");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap11 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap11.growBy = (short) 10;
        java.lang.String[] strArray14 = binaryEntityMap11.names;
        int int16 = binaryEntityMap11.value("");
        binaryEntityMap11.growBy = (short) 1;
        java.lang.String str20 = binaryEntityMap11.name((int) '4');
        java.lang.String str22 = binaryEntityMap11.name(0);
        binaryEntityMap11.size = 'a';
        int int25 = binaryEntityMap11.growBy;
        binaryEntityMap11.add("", 52);
        entities0.map = binaryEntityMap11;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int31 = binaryEntityMap11.value("hi!");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test58");
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
        binaryEntityMap0.add("hi!", (int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int25 = binaryEntityMap0.value("");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test59");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int17 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test60");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap1 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) '#');
        int int2 = binaryEntityMap1.size;
        binaryEntityMap1.size = (byte) 1;
        binaryEntityMap1.growBy = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = binaryEntityMap1.value("");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test61");
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
        binaryEntityMap0.add("", (int) (byte) -1);
        int int49 = binaryEntityMap0.value("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int51 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test62");
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
        java.lang.String str27 = arrayEntityMap1.name((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int29 = arrayEntityMap1.value("hi!");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test63");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int35 = binaryEntityMap0.value("");
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test64");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        java.lang.String[] strArray3 = binaryEntityMap0.names;
        binaryEntityMap0.add("", (int) (short) 100);
        java.lang.String str8 = binaryEntityMap0.name((int) (byte) 1);
        java.lang.String str10 = binaryEntityMap0.name((int) ' ');
        int int11 = binaryEntityMap0.size;
        int int13 = binaryEntityMap0.value("hi!");
        java.lang.String[] strArray14 = binaryEntityMap0.names;
        binaryEntityMap0.size = '#';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int18 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test65");
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap0 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        binaryEntityMap0.growBy = (short) 10;
        binaryEntityMap0.add("", 97);
        java.lang.String str7 = binaryEntityMap0.name((int) (byte) 10);
        binaryEntityMap0.add("", (int) '4');
        java.lang.String str12 = binaryEntityMap0.name((int) ' ');
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap14 = new org.apache.commons.lang.Entities.BinaryEntityMap((int) (byte) 1);
        org.apache.commons.lang.Entities.BinaryEntityMap binaryEntityMap15 = new org.apache.commons.lang.Entities.BinaryEntityMap();
        java.lang.String str17 = binaryEntityMap15.name((int) (byte) 0);
        java.lang.String str19 = binaryEntityMap15.name((int) '#');
        binaryEntityMap15.growBy = (byte) 10;
        binaryEntityMap15.growBy = 1;
        java.lang.String[] strArray24 = binaryEntityMap15.names;
        binaryEntityMap14.names = strArray24;
        java.lang.String[] strArray26 = binaryEntityMap14.names;
        binaryEntityMap0.names = strArray26;
        int int28 = binaryEntityMap0.size;
        binaryEntityMap0.add("", 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int33 = binaryEntityMap0.value("hi!");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test66");
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
        binaryEntityMap0.add("", (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int40 = binaryEntityMap0.value("");
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test67");
        org.apache.commons.lang.Entities.ArrayEntityMap arrayEntityMap1 = new org.apache.commons.lang.Entities.ArrayEntityMap((int) ' ');
        arrayEntityMap1.size = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = arrayEntityMap1.value("");
    }
}

