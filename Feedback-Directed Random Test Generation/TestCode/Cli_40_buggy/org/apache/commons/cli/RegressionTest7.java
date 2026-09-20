package org.apache.commons.cli;

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
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.io.File file17 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass18 = file17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass35);
        java.lang.Object obj38 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        java.lang.Object obj40 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass39);
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        java.lang.Object obj42 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass41);
        org.junit.Assert.assertNotNull(file17);
        org.junit.Assert.assertNull("file17.getParent() == null", file17.getParent());
        org.junit.Assert.assertEquals(file17.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
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
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "hi!");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "");
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "hi!");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass16 = file15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass31);
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
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
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.io.File file5 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass6 = file5.getClass();
        java.lang.Object obj7 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass6);
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertNull("file5.getParent() == null", file5.getParent());
        org.junit.Assert.assertEquals(file5.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
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
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
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
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
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
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
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
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
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
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
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
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass23);
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
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
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
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
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
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass23);
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
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
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
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
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
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass31);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
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
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
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
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
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
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
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
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", obj31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
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
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
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
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
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
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
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
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass16 = file15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass35);
        java.lang.Object obj37 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass35);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "hi!");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
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
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
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
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
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
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.io.File file7 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass8 = file7.getClass();
        java.lang.Object obj9 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass8);
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        org.junit.Assert.assertNotNull(file7);
        org.junit.Assert.assertNull("file7.getParent() == null", file7.getParent());
        org.junit.Assert.assertEquals(file7.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!");
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
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
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
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
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
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass33);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
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
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
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
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
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
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass21);
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
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass28);
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
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.io.File file16 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass17 = file16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass32);
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass32);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        java.lang.Object obj36 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass35);
        java.lang.Class<?> wildcardClass37 = obj36.getClass();
        java.lang.Object obj38 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass37);
        java.lang.Class<?> wildcardClass39 = obj38.getClass();
        org.junit.Assert.assertNotNull(file16);
        org.junit.Assert.assertNull("file16.getParent() == null", file16.getParent());
        org.junit.Assert.assertEquals(file16.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
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
        org.junit.Assert.assertNotNull(wildcardClass20);
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
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
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
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
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
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
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
        org.junit.Assert.assertEquals(obj18.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
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
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass32);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
        org.junit.Assert.assertNotNull(wildcardClass27);
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
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "hi!");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.io.File file15 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass16 = file15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass31);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass33);
        java.lang.Object obj35 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.Object obj37 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass36);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNull("file15.getParent() == null", file15.getParent());
        org.junit.Assert.assertEquals(file15.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
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
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
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
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "hi!");
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
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
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!");
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
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.io.File file12 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass13 = file12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass22);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        org.junit.Assert.assertNotNull(file12);
        org.junit.Assert.assertNull("file12.getParent() == null", file12.getParent());
        org.junit.Assert.assertEquals(file12.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
        org.junit.Assert.assertNotNull(wildcardClass22);
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
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
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
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass23);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
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
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass13);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
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
        org.junit.Assert.assertEquals(obj22.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
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
        org.junit.Assert.assertEquals(obj19.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass28);
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass30);
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "");
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
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
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
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.io.File file8 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass9 = file8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
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
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertEquals(obj25.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "");
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertEquals(obj26.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj26), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj26), "hi!");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass23);
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.io.File file6 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass7 = file6.getClass();
        java.lang.Object obj8 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = obj8.getClass();
        java.lang.Object obj10 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass9);
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass9);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        org.junit.Assert.assertNotNull(file6);
        org.junit.Assert.assertNull("file6.getParent() == null", file6.getParent());
        org.junit.Assert.assertEquals(file6.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass25 = obj24.getClass();
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass25);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass29);
        java.lang.Class<?> wildcardClass31 = obj30.getClass();
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass31);
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass31);
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
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
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.io.File file13 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass14 = file13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass19 = obj18.getClass();
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj24 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file13);
        org.junit.Assert.assertNull("file13.getParent() == null", file13.getParent());
        org.junit.Assert.assertEquals(file13.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!");
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
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Object obj26 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass27);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.Object obj34 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass33);
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
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
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "");
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "");
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.io.File file11 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass12 = file11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass14);
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        java.lang.Object obj17 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass16);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass21);
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("", obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "hi!");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.junit.Assert.assertEquals(obj25.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj25), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj25), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.io.File file10 = org.apache.commons.cli.TypeHandler.createFile("");
        java.lang.Class<?> wildcardClass11 = file10.getClass();
        java.lang.Object obj12 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Object obj15 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass11);
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass11);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass23 = obj22.getClass();
        org.junit.Assert.assertNotNull(file10);
        org.junit.Assert.assertNull("file10.getParent() == null", file10.getParent());
        org.junit.Assert.assertEquals(file10.toString(), "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "hi!");
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
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
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.io.File file9 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass10 = file9.getClass();
        java.lang.Object obj11 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass10);
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.Object obj13 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Object obj14 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass12);
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj20 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        java.lang.Object obj22 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass21);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.io.File file14 = org.apache.commons.cli.TypeHandler.createFile("hi!");
        java.lang.Class<?> wildcardClass15 = file14.getClass();
        java.lang.Object obj16 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass15);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Object obj19 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass17);
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.Object obj21 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.Object obj23 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass22);
        java.lang.Class<?> wildcardClass24 = obj23.getClass();
        java.lang.Object obj25 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass24);
        java.lang.Class<?> wildcardClass26 = obj25.getClass();
        java.lang.Object obj27 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj28 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj29 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj30 = org.apache.commons.cli.TypeHandler.createValue("", (java.lang.Object) wildcardClass26);
        java.lang.Object obj31 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj32 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Object obj33 = org.apache.commons.cli.TypeHandler.createValue("hi!", (java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        org.junit.Assert.assertNotNull(file14);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
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
        org.junit.Assert.assertEquals(obj19.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "");
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
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "hi!");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }
}

