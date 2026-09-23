package com.google.gson;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        com.google.gson.stream.JsonReader jsonReader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.read(jsonReader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.io.Writer writer5 = null;
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.Class<?> wildcardClass5 = jsonElement4.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter7 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter7.toJsonTree(date8);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter7.toJsonTree(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date12 = defaultDateTypeAdapter2.fromJsonTree(jsonElement11);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement9);
        org.junit.Assert.assertNotNull(jsonElement11);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.read(jsonReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.io.Writer writer3 = null;
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer3, date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter8.toJsonTree(date9);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter8.toJsonTree(date11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = defaultDateTypeAdapter2.fromJsonTree(jsonElement12);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement12);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter9 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date10 = null;
        com.google.gson.JsonElement jsonElement11 = defaultDateTypeAdapter9.toJsonTree(date10);
        java.util.Date date12 = null;
        com.google.gson.JsonElement jsonElement13 = defaultDateTypeAdapter9.toJsonTree(date12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date14 = defaultDateTypeAdapter2.fromJsonTree(jsonElement13);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(jsonElement11);
        org.junit.Assert.assertNotNull(jsonElement13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.Class<?> wildcardClass5 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.Class<?> wildcardClass7 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter5.toJsonTree(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter5.toJsonTree(date8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJsonTree(jsonElement9);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement7);
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson("null");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass7 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.io.Writer writer6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTypeAdapter5.toJson(writer6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        com.google.gson.stream.JsonReader jsonReader5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.read(jsonReader5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.lang.String str9 = defaultDateTypeAdapter2.toString();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str9, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter5 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date6 = null;
        com.google.gson.JsonElement jsonElement7 = defaultDateTypeAdapter5.toJsonTree(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJsonTree(jsonElement7);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = dateTypeAdapter7.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass4 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.read(jsonReader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date4 = defaultDateTypeAdapter2.fromJson("hi!");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = dateTypeAdapter5.fromJson(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.Class<?> wildcardClass5 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass8 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter8 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter8.toJsonTree(date9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = defaultDateTypeAdapter2.fromJsonTree(jsonElement10);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        java.util.Date date13 = null;
        com.google.gson.JsonElement jsonElement14 = defaultDateTypeAdapter10.toJsonTree(date13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date15 = defaultDateTypeAdapter2.fromJsonTree(jsonElement14);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertNotNull(jsonElement14);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.io.Writer writer7 = null;
        java.util.Date date8 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer7, date8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.lang.Class<?> wildcardClass6 = dateTypeAdapter5.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date8 = defaultDateTypeAdapter2.fromJson(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.fromJson("DefaultDateTypeAdapter(SimpleDateFormat)");
            org.junit.Assert.fail("Expected exception of type com.google.gson.stream.MalformedJsonException; message: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 1 path $");
        } catch (com.google.gson.stream.MalformedJsonException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        java.util.Date date4 = null;
        java.lang.String str5 = defaultDateTypeAdapter2.toJson(date4);
        com.google.gson.stream.JsonWriter jsonWriter6 = null;
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null" + "'", str5, "null");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        java.lang.Class<?> wildcardClass7 = jsonElement6.getClass();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        com.google.gson.stream.JsonWriter jsonWriter8 = null;
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter8, date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.lang.String str3 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonWriter jsonWriter4 = null;
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.write(jsonWriter4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str3, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        // The following exception was thrown during execution in test generation
        try {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date8 = null;
        java.lang.String str9 = dateTypeAdapter7.toJson(date8);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null" + "'", str9, "null");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.io.Writer writer9 = null;
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            defaultDateTypeAdapter2.toJson(writer9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: out == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.util.Date date7 = null;
        java.lang.String str8 = defaultDateTypeAdapter2.toJson(date7);
        java.util.Date date9 = null;
        com.google.gson.JsonElement jsonElement10 = defaultDateTypeAdapter2.toJsonTree(date9);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter13 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date14 = null;
        com.google.gson.JsonElement jsonElement15 = defaultDateTypeAdapter13.toJsonTree(date14);
        java.util.Date date16 = null;
        com.google.gson.JsonElement jsonElement17 = defaultDateTypeAdapter13.toJsonTree(date16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date18 = defaultDateTypeAdapter2.fromJsonTree(jsonElement17);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null" + "'", str8, "null");
        org.junit.Assert.assertNotNull(jsonElement10);
        org.junit.Assert.assertNotNull(jsonElement15);
        org.junit.Assert.assertNotNull(jsonElement17);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.stream.JsonReader jsonReader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date9 = defaultDateTypeAdapter2.read(jsonReader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        com.google.gson.stream.JsonReader jsonReader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.read(jsonReader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        java.util.Date date8 = null;
        com.google.gson.JsonElement jsonElement9 = defaultDateTypeAdapter2.toJsonTree(date8);
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement9);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        java.lang.String str4 = defaultDateTypeAdapter2.toJson(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.Class<?> wildcardClass6 = defaultDateTypeAdapter2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null" + "'", str4, "null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.util.Date date5 = null;
        com.google.gson.JsonElement jsonElement6 = defaultDateTypeAdapter2.toJsonTree(date5);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter7 = defaultDateTypeAdapter2.nullSafe();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(jsonElement6);
        org.junit.Assert.assertNotNull(dateTypeAdapter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        java.lang.String str6 = defaultDateTypeAdapter2.toString();
        java.lang.String str7 = defaultDateTypeAdapter2.toString();
        java.lang.String str8 = defaultDateTypeAdapter2.toString();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = defaultDateTypeAdapter2.fromJson(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: in == null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str6, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str7, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str8, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter5 = defaultDateTypeAdapter2.nullSafe();
        java.util.Date date6 = null;
        java.lang.String str7 = defaultDateTypeAdapter2.toJson(date6);
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter10 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date11 = null;
        com.google.gson.JsonElement jsonElement12 = defaultDateTypeAdapter10.toJsonTree(date11);
        java.lang.String str13 = defaultDateTypeAdapter10.toString();
        java.lang.String str14 = defaultDateTypeAdapter10.toString();
        java.util.Date date15 = null;
        com.google.gson.JsonElement jsonElement16 = defaultDateTypeAdapter10.toJsonTree(date15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date17 = defaultDateTypeAdapter2.fromJsonTree(jsonElement16);
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonParseException; message: The date should be a string value");
        } catch (com.google.gson.JsonParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertNotNull(dateTypeAdapter5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null" + "'", str7, "null");
        org.junit.Assert.assertNotNull(jsonElement12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str13, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str14, "DefaultDateTypeAdapter(SimpleDateFormat)");
        org.junit.Assert.assertNotNull(jsonElement16);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter((int) (short) 1, 0);
        java.util.Date date3 = null;
        com.google.gson.JsonElement jsonElement4 = defaultDateTypeAdapter2.toJsonTree(date3);
        java.lang.String str5 = defaultDateTypeAdapter2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = defaultDateTypeAdapter2.fromJson("");
            org.junit.Assert.fail("Expected exception of type java.io.EOFException; message: End of input at line 1 column 1 path $");
        } catch (java.io.EOFException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonElement4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DefaultDateTypeAdapter(SimpleDateFormat)" + "'", str5, "DefaultDateTypeAdapter(SimpleDateFormat)");
    }
}

