package org.apache.commons.cli;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass21);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass29);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass29);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass17 = file16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass27);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass27);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass32);
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass32);
        java.lang.Object obj35 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "hi!");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "hi!");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "hi!");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass30);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass13);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass23);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass23);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass23);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass23);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass27);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass21);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass28);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass28);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass10);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass7);
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass7);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass7);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.cli.TypeHandler typeHandler9 = new org.apache.commons.cli.TypeHandler();
        java.lang.Class<?> wildcardClass10 = typeHandler9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass10);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass25);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass17 = file16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass19);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass27);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass31);
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass31);
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        java.lang.Object obj35 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Class) wildcardClass34);
        java.lang.Object obj36 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Class) wildcardClass34);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "");
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

