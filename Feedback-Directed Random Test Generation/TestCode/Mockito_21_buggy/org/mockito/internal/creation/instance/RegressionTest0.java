package org.mockito.internal.creation.instance;

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
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1.0f);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 'a');
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) '4');
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "");
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0d);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass4);
        java.lang.Class<?> wildcardClass6 = constructorInstantiator5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10L);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100L);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) -1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator5 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) wildcardClass1);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.Object obj0 = null;
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator6 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator7 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 100.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass4 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) '#');
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator(obj0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (-1.0d));
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator2);
        java.lang.Class<?> wildcardClass5 = constructorInstantiator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator3 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator4 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator3);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass2 = constructorInstantiator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) (short) 0);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator1 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) 10.0d);
        org.mockito.internal.creation.instance.ConstructorInstantiator constructorInstantiator2 = new org.mockito.internal.creation.instance.ConstructorInstantiator((java.lang.Object) constructorInstantiator1);
        java.lang.Class<?> wildcardClass3 = constructorInstantiator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

