package com.fasterxml.jackson.core.json;

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
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_OK_AFTER_COLON;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_OK_AFTER_COMMA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_OK_AFTER_SPACE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.String str1 = jsonWriteContext0.getTypeDesc();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ROOT" + "'", str1, "ROOT");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_EXPECT_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_EXPECT_NAME;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        jsonWriteContext3.setCurrentValue((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        jsonWriteContext3._currentName = "";
        java.lang.Class<?> wildcardClass7 = jsonWriteContext3.getClass();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext2 = jsonWriteContext0._parent;
        int int3 = jsonWriteContext0.getEntryCount();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jsonWriteContext2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        jsonWriteContext3._gotName = false;
        java.lang.Class<?> wildcardClass6 = jsonWriteContext3.getClass();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        int int5 = jsonWriteContext3.writeFieldName("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        java.lang.Class<?> wildcardClass5 = jsonWriteContext3.getClass();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext2 = jsonWriteContext0._parent;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj4 = jsonWriteContext3._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext6 = jsonWriteContext3.reset(0);
        jsonWriteContext0._child = jsonWriteContext3;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNull(jsonWriteContext2);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(jsonWriteContext6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext2 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj3 = jsonWriteContext2._currentValue;
        jsonWriteContext0.setCurrentValue((java.lang.Object) jsonWriteContext2);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj6 = jsonWriteContext5._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext8 = jsonWriteContext5.reset(0);
        jsonWriteContext2._child = jsonWriteContext5;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(jsonWriteContext5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(jsonWriteContext8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        int int5 = jsonWriteContext3.getCurrentIndex();
        boolean boolean6 = jsonWriteContext3.inObject();
        com.fasterxml.jackson.core.json.DupDetector dupDetector7 = null;
        jsonWriteContext3._dups = dupDetector7;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        jsonWriteContext3._currentName = "";
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext7 = jsonWriteContext3._child;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(jsonWriteContext7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int0 = com.fasterxml.jackson.core.json.JsonWriteContext.STATUS_OK_AS_IS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        boolean boolean4 = jsonWriteContext3._gotName;
        java.lang.String str5 = jsonWriteContext3.getTypeDesc();
        java.lang.StringBuilder stringBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonWriteContext3.appendDesc(stringBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "?" + "'", str5, "?");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        boolean boolean4 = jsonWriteContext3._gotName;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj6 = jsonWriteContext5._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext8 = jsonWriteContext5.reset(0);
        java.lang.String str9 = jsonWriteContext8.getCurrentName();
        jsonWriteContext3.setCurrentValue((java.lang.Object) jsonWriteContext8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jsonWriteContext5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(jsonWriteContext8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        jsonWriteContext0._currentValue = (short) 100;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        jsonWriteContext3._currentName = "";
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext7 = jsonWriteContext3._parent;
        int int9 = jsonWriteContext3.writeFieldName("");
        java.lang.String str10 = jsonWriteContext3.getCurrentName();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(jsonWriteContext7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        jsonWriteContext0._gotName = true;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext6 = jsonWriteContext0.getParent();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNull(jsonWriteContext6);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        boolean boolean4 = jsonWriteContext3._gotName;
        java.lang.Class<?> wildcardClass5 = jsonWriteContext3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        int int5 = jsonWriteContext3.getEntryCount();
        java.lang.StringBuilder stringBuilder6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jsonWriteContext3.appendDesc(stringBuilder6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset((int) (short) 10);
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext2 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj3 = jsonWriteContext2._currentValue;
        jsonWriteContext0.setCurrentValue((java.lang.Object) jsonWriteContext2);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj6 = jsonWriteContext5._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext8 = jsonWriteContext5.reset(0);
        int int9 = jsonWriteContext5.writeValue();
        jsonWriteContext5._currentName = "";
        jsonWriteContext0.setCurrentValue((java.lang.Object) jsonWriteContext5);
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(jsonWriteContext5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(jsonWriteContext8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext2 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj3 = jsonWriteContext2._currentValue;
        jsonWriteContext0.setCurrentValue((java.lang.Object) jsonWriteContext2);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = jsonWriteContext0.getParent();
        java.lang.String str6 = jsonWriteContext0.getTypeDesc();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext2);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(jsonWriteContext5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ROOT" + "'", str6, "ROOT");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        jsonWriteContext3._currentName = "";
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext7 = jsonWriteContext3._parent;
        int int9 = jsonWriteContext3.writeFieldName("");
        boolean boolean10 = jsonWriteContext3.inRoot();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(jsonWriteContext7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        int int5 = jsonWriteContext3.getCurrentIndex();
        boolean boolean6 = jsonWriteContext3.inObject();
        java.lang.String str7 = jsonWriteContext3.getCurrentName();
        int int8 = jsonWriteContext3.getEntryCount();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        java.lang.Class<?> wildcardClass4 = jsonWriteContext0.getClass();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        com.fasterxml.jackson.core.json.DupDetector dupDetector5 = null;
        jsonWriteContext3._dups = dupDetector5;
        java.lang.Object obj7 = jsonWriteContext3._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext8 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj9 = jsonWriteContext8._currentValue;
        java.lang.String str10 = jsonWriteContext8.toString();
        jsonWriteContext3._child = jsonWriteContext8;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext12 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj13 = jsonWriteContext12._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj15 = jsonWriteContext14._currentValue;
        jsonWriteContext12.setCurrentValue((java.lang.Object) jsonWriteContext14);
        jsonWriteContext3.setCurrentValue((java.lang.Object) jsonWriteContext14);
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(jsonWriteContext8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
        org.junit.Assert.assertNotNull(jsonWriteContext12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(jsonWriteContext14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        boolean boolean4 = jsonWriteContext3._gotName;
        com.fasterxml.jackson.core.json.DupDetector dupDetector5 = null;
        jsonWriteContext3._dups = dupDetector5;
        jsonWriteContext3._gotName = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        jsonWriteContext0._currentName = "";
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj4 = jsonWriteContext3._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj6 = jsonWriteContext5._currentValue;
        jsonWriteContext3.setCurrentValue((java.lang.Object) jsonWriteContext5);
        boolean boolean8 = jsonWriteContext3.inRoot();
        jsonWriteContext0._child = jsonWriteContext3;
        boolean boolean10 = jsonWriteContext0.inObject();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(jsonWriteContext5);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        com.fasterxml.jackson.core.json.DupDetector dupDetector5 = null;
        jsonWriteContext3._dups = dupDetector5;
        java.lang.Object obj7 = jsonWriteContext3._currentValue;
        int int9 = jsonWriteContext3.writeFieldName("?");
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext3.getCurrentIndex();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = jsonWriteContext3._child;
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(jsonWriteContext5);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext5 = jsonWriteContext3.reset((int) (short) -1);
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext6 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj7 = jsonWriteContext6._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext8 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj9 = jsonWriteContext8._currentValue;
        jsonWriteContext6.setCurrentValue((java.lang.Object) jsonWriteContext8);
        boolean boolean11 = jsonWriteContext6.inRoot();
        jsonWriteContext6._gotName = true;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext14 = jsonWriteContext6._child;
        jsonWriteContext3._child = jsonWriteContext6;
        org.junit.Assert.assertNotNull(jsonWriteContext5);
        org.junit.Assert.assertNotNull(jsonWriteContext6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(jsonWriteContext8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jsonWriteContext14);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = null;
        com.fasterxml.jackson.core.json.DupDetector dupDetector2 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = new com.fasterxml.jackson.core.json.JsonWriteContext((int) (byte) -1, jsonWriteContext1, dupDetector2);
        boolean boolean4 = jsonWriteContext3._gotName;
        java.lang.String str5 = jsonWriteContext3.getTypeDesc();
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext7 = jsonWriteContext3.reset((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "?" + "'", str5, "?");
        org.junit.Assert.assertNotNull(jsonWriteContext7);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext0 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext();
        java.lang.Object obj1 = jsonWriteContext0._currentValue;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext3 = jsonWriteContext0.reset(0);
        int int4 = jsonWriteContext0.writeValue();
        jsonWriteContext0._currentName = "";
        int int7 = jsonWriteContext0.getCurrentIndex();
        org.junit.Assert.assertNotNull(jsonWriteContext0);
        org.junit.Assert.assertNull(obj1);
        org.junit.Assert.assertNotNull(jsonWriteContext3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        com.fasterxml.jackson.core.json.DupDetector dupDetector0 = null;
        com.fasterxml.jackson.core.json.JsonWriteContext jsonWriteContext1 = com.fasterxml.jackson.core.json.JsonWriteContext.createRootContext(dupDetector0);
        org.junit.Assert.assertNotNull(jsonWriteContext1);
    }
}

